package nc.bs.oa.oama.ntecm;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.SoftReference;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import nc.bs.oa.oama.ntecm.R;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.widget.RemoteViews;
import android.widget.Toast;

import com.yonyou.ma.platform.modul.update.MaUpdateAgentListener;
import com.yonyou.uap.um.application.ApplicationContext;
import com.yonyou.uap.um.core.UMActivity;
/**
 * 添加 下载时在通知栏显示进度
 * @author lixkb
 * @date 2015-8-1下午2:08:18
 */
public class ECMUpdateListener extends MaUpdateAgentListener
{
	private String version = "";
	private SoftReference<UMActivity> ctx = null;
	private int fileSize;
	private int currentFileSize;
	private Notification notify;
	private NotificationManager nm ;
	private UMActivity activity;
	public ECMUpdateListener(UMActivity _ctx, String _version)
	{
		ctx = new SoftReference<UMActivity>(_ctx);
		this.version = _version;
	}
	/**
	 * 实时处理下载进度显示
	 */
	private Handler handler = new Handler(){
		
		public void handleMessage(Message msg) {
			if(msg.what > 0){
				int downloadPercent = currentFileSize * 100 / fileSize;
				if(downloadPercent % 10 == 0){//这样处理 是为了不让它一直更新主线程,不然会阻塞
					notify.contentView.setTextViewText(R.id.fileName, "正在下载...");
					notify.contentView.setTextViewText(R.id.rate, String.valueOf(downloadPercent)+"%");
					notify.contentView.setProgressBar(R.id.progress, fileSize, currentFileSize, false);
					nm.notify(0, notify);
				}
			}else{//下载完成  删掉通知
				nm.cancel(0);
			}
		};
	};

	@Override
	public void onSuccess(String versionName, String showInfo, String url)
	{
		if (null == ctx.get())
		{
			return;
		}

		activity = this.ctx.get();
		final String urlStr = url;
		final String activityClsss = activity.getClass().toString();
		if(activityClsss!=null && activityClsss.equals("class nc.bs.oa.oama.ecm.Ecm_MainExtendActivity")){
			String isChecked = ApplicationContext.getCurrent(ctx.get().getBaseContext()).getValue("isCheckedUpdate");
			if ("Y".equals(isChecked))
			{
				// 已经检查过
				return;
			}
		}
		if (!version.equals(versionName))
		{
			activity.showMessage("提示", showInfo, new DialogInterface.OnClickListener()
			{
				public void onClick(DialogInterface dialog, int id)
				{
					showDownLoadNotify();//显示下载通知
					new Thread(new Runnable()
					{
						@Override
						public void run()
						{
							downLoadFile(activity, urlStr);
						}
					}).start();
					Toast.makeText(activity, "正在下载应用程序", 1).show();
				}
			}, new DialogInterface.OnClickListener()
			{
				public void onClick(DialogInterface dialog, int id)
				{
					ApplicationContext.getCurrent(ctx.get().getBaseContext()).setValue("isCheckedUpdate", "Y");
					dialog.cancel();
				}
			});
		}

		super.onSuccess(versionName, showInfo, url);
	}

	@Override
	public void onFailure(int statusCode, String content, Throwable error)
	{
		final UMActivity activity = this.ctx.get();
		super.onFailure(statusCode, content, error);
		final String activityClsss = activity.getClass().toString();
		if(activityClsss!=null && activityClsss.equals("class nc.bs.oa.oama.ecm.Ecm_AboutExtendActivity")){
			activity.showMessage("提示", content,new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int id) {
					dialog.cancel();
				}
			});
		}
		
	}

	private void downLoadFile(final UMActivity activity, String httpUrl)
	{
		final String fileName = "MobileECM.apk";
		File tmpFile = new File("/sdcard/update");
		if (!tmpFile.exists())
		{
			tmpFile.mkdir();
		}
		final File file = new File("/sdcard/update/" + fileName);
		try
		{
			URL url = new URL(httpUrl);
			try
			{
				HttpURLConnection conn = (HttpURLConnection) url.openConnection();
				InputStream is = conn.getInputStream();
				fileSize = conn.getContentLength();//更新包大小
				FileOutputStream fos = new FileOutputStream(file);
				byte[] buf = new byte[10 * 1024];
				conn.connect();
				double count = 0;
				if (conn.getResponseCode() >= 5000)
				{
					Toast.makeText(activity, "连接超时", Toast.LENGTH_SHORT).show();
				}
				else
				{
				/*	if(fileSize >0){
						showDownLoadNotify();//显示下载通知
					}*/
					while (count <= 100)
					{
						if (is != null)
						{	
							Message msg = new Message();
							int numRead = is.read(buf);
							if (numRead <= 0)
							{	
								msg.what = 0;
								handler.sendMessage(msg);
								break;
							}
							else
							{
								fos.write(buf, 0, numRead);
								currentFileSize += numRead;
								msg.what = currentFileSize;
								handler.sendMessage(msg);
							}

						}
						else
						{
							break;
						}
					}
				}

				conn.disconnect();
				fos.close();
				is.close();
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
		catch (MalformedURLException e)
		{
			e.printStackTrace();
		}

		activity.runOnUiThread(new Runnable()
		{
			@Override
			public void run()
			{
				Intent intent = new Intent();
				intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
				intent.setAction(android.content.Intent.ACTION_VIEW);
				intent.setDataAndType(Uri.fromFile(file), "application/vnd.android.package-archive");
				activity.startActivity(intent);
			}
		});
	}
	/**
	 * 显示下载进度通知
	 */
	public void showDownLoadNotify(){
		nm = (NotificationManager) activity.getSystemService(Context.NOTIFICATION_SERVICE);
		notify = new Notification();
		notify.icon = R.drawable.emc;
		notify.tickerText = "开始下载...";
		notify.contentView = new RemoteViews(activity.getPackageName(), R.layout.download_notification_layout);
		
	}
}
