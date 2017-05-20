package nc.bs.oa.oama.push;

import com.yonyou.protocol.Constants.Notificatin;
import com.yonyou.pushclient.PushServiceManager;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

/**
 * push 服务
 * @author lixkb
 * @date 2015-05-21
 */
public class ECMPushService extends Service{
	
	/** 服务相应action*/
	private final static String Action = "nc.bs.oa.oama.push.PUSH_LISTENSERVICE";

	@Override
	public IBinder onBind(Intent arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void onCreate() {
		super.onCreate();
		// 开启UPush服务
		Log.i("ECM_PUSH", "***********start service***********");
		PushServiceManager.Start();
		PushServiceManager.SetNotification.setContentTitle(Notificatin.NOTIFICATION_TITLE);
		//重新设置activity
		PushServiceManager.setNotificationActivity(NotificationActivityImple.class);
		// 注册广播监听器
		PushServiceManager.registerServiceOnlineReceiver(this);
	}
	@Override
	public void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		// 注销广播监听器
		PushServiceManager.unregisterServiceOnlineReceiver(this);
		// 关闭UPush服务
		PushServiceManager.Stop();
	}
	public static String getAction() {
		return Action;
	}

}
