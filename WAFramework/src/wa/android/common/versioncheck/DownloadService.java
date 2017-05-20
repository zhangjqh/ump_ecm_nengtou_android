package wa.android.common.versioncheck;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import wa.android.common.App;
import wa.android.common.R;
import wa.android.common.activity.WelcomeActivity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.util.Log;

public class DownloadService extends Service {

	private File updateDir = null; // 文件存储
	private File updateFile = null;
	private final static int DOWNLOAD_COMPLETE = 0;
	private final static int DOWNLOAD_FAIL = 1;
	private NotificationManager updateNotificationManager = null; // 通知栏
	private Notification updateNotification = null;
	private Intent updateIntent = null; // 通知栏跳转Intent
	private PendingIntent updatePendingIntent = null;
	private static final String TAG = "DownloadService";
	private Handler updateHandler;
	private String appname;
	private String url;
	private boolean card = true;
	private boolean isrunning = false;

	@Override
	public int onStartCommand(Intent intent, int flags, int startId) {
		if(!isrunning) {
			isrunning = true;
			try {
				appname = intent.getStringExtra("appname");
				url = intent.getStringExtra("url");
				if (android.os.Environment.MEDIA_MOUNTED.equals(android.os.Environment.getExternalStorageState())) {
					updateDir = new File(Environment.getExternalStorageDirectory(),"app/download/");
					updateFile = new File(updateDir.getPath(), appname + ".apk");
				} else {
					String path = "/data/data/" + getPackageName() + "/files/";
					updateFile = new File(path + appname + ".apk");
					card  = false;
				}
	
				this.updateNotificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
				this.updateNotification = new Notification();
	
				updateIntent = new Intent(this, WelcomeActivity.class);			// 设置下载过程中，点击通知栏，回到主界面
				updatePendingIntent = PendingIntent.getActivity(this, 0,updateIntent, 0);
				
				updateNotification.icon = ((App)getApplication()).getConfig().getIconResId(); 			// 设置通知栏显示内容
				updateNotification.tickerText = "开始下载";
//				updateNotification.setLatestEventInfo(this, appname, "0%",updatePendingIntent);
				updateNotificationManager.notify(0, updateNotification); // 发出通知
				new Thread(new updateRunnable()).start();		// 如果使用Service同步下载，会导致ANR问题，Service本身也会阻塞
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			isrunning = false;
		}
		return super.onStartCommand(intent, flags, startId);
	}

	@Override
	public IBinder onBind(Intent intent) {
		return null;
	}

	@Override
	public void onCreate() {
		Log.i(TAG, "onCreate");
		updateHandler = new Handler() {
			@Override
			public void handleMessage(Message msg) {
				switch (msg.what) {
				case DOWNLOAD_COMPLETE:
					// 点击安装PendingIntent
					Uri uri = Uri.fromFile(updateFile);
					Intent installIntent = new Intent(Intent.ACTION_VIEW);
					if(card)
						installIntent.setDataAndType(uri,"application/vnd.android.package-archive");
					else
						installIntent.setDataAndType(Uri.parse("file://" + updateFile.getAbsolutePath()),"application/vnd.android.package-archive");
					
					updatePendingIntent = PendingIntent.getActivity(DownloadService.this, 0, installIntent, 0);
					updateNotification.defaults = Notification.DEFAULT_SOUND;// 铃声提醒
//					updateNotification.setLatestEventInfo(DownloadService.this,appname, "下载完成,点击安装。", updatePendingIntent);
					updateNotificationManager.notify(0, updateNotification);
					stopSelf();	
					break;
				case DOWNLOAD_FAIL:
//					updateNotification.setLatestEventInfo(DownloadService.this,appname, "下载失败", updatePendingIntent);
					updateNotificationManager.notify(0, updateNotification);
					stopSelf();
					break;
				default:
					stopSelf();
				}
			}
		};
	}

	@Override
	public void onDestroy() {
		Log.i(TAG, "onDestroy");
	}

	@Override
	public void onStart(Intent intent, int startid) {
		Log.i(TAG, "onStart");
	}

	class updateRunnable implements Runnable {
		Message message = updateHandler.obtainMessage();

		public void run() {
			message.what = DOWNLOAD_COMPLETE;
			try {
				if (null != updateDir && !updateDir.exists()) {
					updateDir.mkdirs();
				}
				if (!updateFile.exists()) {
					updateFile.createNewFile();
				}
				// 增加权限;
				long downloadSize = downloadUpdateFile(url, updateFile);
				if (downloadSize > 0) {
					updateHandler.sendMessage(message); // 下载成功
				}
			} catch (Exception ex) {
				ex.printStackTrace();
				message.what = DOWNLOAD_FAIL;
				updateHandler.sendMessage(message);
			}
		}

		public long downloadUpdateFile(String downloadUrl, File saveFile)
				throws Exception {
			int downloadCount = 0;
			int currentSize = 0;
			long totalSize = 0;
			int updateTotalSize = 0;
			HttpURLConnection httpConnection = null;
			InputStream is = null;
			FileOutputStream fos = null;

			try {

				URL url = new URL(downloadUrl);
				httpConnection = (HttpURLConnection) url.openConnection();
				httpConnection.setRequestProperty("User-Agent","PacificHttpClient");
				if (currentSize > 0) {
					httpConnection.setRequestProperty("RANGE", "bytes="+ currentSize + "-");
				}
				httpConnection.setConnectTimeout(10000);
				httpConnection.setReadTimeout(20000);
				updateTotalSize = httpConnection.getContentLength();
				if (httpConnection.getResponseCode() == 404) {
					throw new Exception("fail!");
				}
				is = httpConnection.getInputStream();
				if(card)
					fos = new FileOutputStream(saveFile, false);
				else
					fos = DownloadService.this.openFileOutput(updateFile.getName(),Context.MODE_WORLD_READABLE + Context.MODE_WORLD_WRITEABLE);
				byte buffer[] = new byte[4096];
				int readsize = 0;
				while ((readsize = is.read(buffer)) > 0) {
					fos.write(buffer, 0, readsize);
					totalSize += readsize;
					if ((downloadCount == 0) // 为了防止频繁的通知导致应用吃紧，百分比增加10才通知一次
							|| (int) (totalSize * 100 / updateTotalSize) - 10 > downloadCount) {
						downloadCount += 10;
//						updateNotification.setLatestEventInfo(
//								DownloadService.this, "正在下载", (int) totalSize * 100 / updateTotalSize + "%",
//								updatePendingIntent);
						updateNotificationManager.notify(0, updateNotification);
					}
				}
			} finally {
				if (httpConnection != null) {
					httpConnection.disconnect();
				}
				if (is != null) {
					is.close();
				}
				if (fos != null) {
					fos.close();
				}
			}
			return totalSize;
		}
	}
}
