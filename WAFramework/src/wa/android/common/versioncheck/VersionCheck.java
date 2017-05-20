package wa.android.common.versioncheck;

import java.io.File;

import wa.android.common.App;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Environment;
import android.os.Handler;

public class VersionCheck {

	private Context context;
	private Activity activity;
	private String appname;
	private Runnable onChecked;
	private Handler handler;

	public VersionCheck(Context context, String apppname) {
		this.context = context;
		this.activity = (Activity) context;
		handler = new Handler();
	}

	public VersionCheck(Context context) {
		this.context = context;
		this.activity = (Activity) context;
		handler = new Handler();
	}
	public void setOnChecked(Runnable onChecked){
		this.onChecked = onChecked;
	}

	public void checkVersion() {
		new Thread() {
			@Override
			public void run() {
				try {
					String appid = ((App) activity.getApplication()).getConfig().getAppId();
					int[] appversion = ((App) activity.getApplication()).getAppVersion();
					final VersionInfo versionInfo = HttpUtil.getVersion(appid);
					System.out.println(versionInfo.getInfo().getVersonCode());
					if (null != versionInfo && versionInfo.getInfo() != null && versionInfo.getInfo().getVersonCode() != null) {
						String code = versionInfo.getInfo().getVersonCode();
						String[] codeArray = code.split("\\.");
						if(appversion[0] < Integer.valueOf(codeArray[0]))
							((App) activity.getApplication()).setVersionInfo(versionInfo);
						else if(appversion[0] == Integer.valueOf(codeArray[0])) {
							if(appversion[1] < Integer.valueOf(codeArray[1])) {
								((App) activity.getApplication()).setVersionInfo(versionInfo);
							}
						}
					}
					if(((App) activity.getApplication()).getVersionInfo() == null) {
						cheanUpdateFile();
					}
				} catch(Exception e) {
					e.printStackTrace();
				}
				if(onChecked!=null){
					handler.post(onChecked);
					onChecked=null;
				}
			}
		}.start();
	}

	public void popAlert() {
		try {
			final VersionInfo versionInfo = ((App) activity.getApplication()).getVersionInfo();
			AlertDialog.Builder alert = new AlertDialog.Builder(context);
			alert.setTitle("软件升级")
					.setMessage("发现新版本,建议立即更新使用.")
					.setPositiveButton("更新", new DialogInterface.OnClickListener() {
						public void onClick(DialogInterface dialog, int which) {
							Intent intent = new Intent(context,DownloadService.class);		// 开启更新服务UpdateService
							appname = ((App) activity.getApplication()).getConfig().getMainModule().getTitle();
							intent.putExtra("appname", appname);
							intent.putExtra("url", versionInfo.getInfo().getUrl());
							context.startService(intent);
						}
					})
					.setNegativeButton("取消", new DialogInterface.OnClickListener() {
						public void onClick(DialogInterface dialog, int which) {
							dialog.dismiss();
						}
					});
			alert.create().show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public void cheanUpdateFile() {
		File updateDir = new File(Environment.getExternalStorageDirectory(),"app/download/");
		appname = appname = ((App) activity.getApplication()).getConfig().getMainModule().getTitle();
		File updateFile = new File(updateDir.getPath(), appname + ".apk");
		if (updateFile.exists()) {
			updateFile.delete(); // 当不需要的时候，清除之前的下载文件，避免浪费用户空间
		}
		
		String path = "/data/data/" + context.getPackageName() + "/files/";
		updateFile = new File(path + appname + ".apk");
		if (updateFile.exists()) {
			updateFile.delete(); // 当不需要的时候，清除之前的下载文件，避免浪费用户空间
		}
	}
}
