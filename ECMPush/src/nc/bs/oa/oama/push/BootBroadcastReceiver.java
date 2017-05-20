package nc.bs.oa.oama.push;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningServiceInfo;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * 监听开机事件
 * @author lixkb
 *
 */

public class BootBroadcastReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		Intent i = new Intent(context, ECMPushService.class);
		//解决service 被kill 后 开机还让其启动的问题
		//i.setFlags(Intent.FLAG_INCLUDE_STOPPED_PACKAGES);
		context.startService(i); 
		/*
		if(intent.getAction().equals(Intent.ACTION_TIME_TICK)){
			
			boolean isServiceRunning = false; 
			ActivityManager manager = (ActivityManager)ExampleApplication.getContext().getSystemService(Context.ACTIVITY_SERVICE); 
			for (RunningServiceInfo service :manager.getRunningServices(Integer.MAX_VALUE)) { 
				if("com.yonyou.upushv2demoa.AssistService".equals(service.service.getClassName())) { 
					isServiceRunning = true; 
				} 
			} 
			if (!isServiceRunning) { 
				Toast.makeText(context, "service start", Toast.LENGTH_LONG).show();
				Intent i = new Intent(context, AssistService.class); 
				context.startService(i); 
			} 
		}
		if(intent.getAction().equals(Intent.ACTION_BOOT_COMPLETED)){
			Intent i = new Intent(context, AssistService.class); 
			context.startService(i); 
		}
*/
	}

}
