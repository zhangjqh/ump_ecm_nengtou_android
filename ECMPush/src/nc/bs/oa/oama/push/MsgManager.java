
/**   
 * @Title: MsgManagerImpl.java 
 * @Package: com.yonyou.myowndome 
 * @Description: TODO
 * @author Administrator  
 * @date 2014-10-23 下午1:49:10 
 * @version 1.3.1 
 */


package nc.bs.oa.oama.push;


import java.text.SimpleDateFormat;
import java.util.Date;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.widget.TextView;
import android.widget.Toast;

import com.yonyou.protocol.NotifyAndMsg;
import com.yonyou.pushclient.PushServiceManager;
import com.yonyou.upush.impl.InformationManagerAdapter;



/** 
 * 用户自定义消息处理类
 * @package com.yonyou.myowndome
 * @author huangbq
 * @date 2014-10-23 下午1:49:10 
 */

public class MsgManager extends InformationManagerAdapter {

	
	private Context context;
	private SimpleDateFormat sDateFormat;
	public static NotifyAndMsg currentNotify;
	public static NotifyAndMsg currentMsg;
	NotificationCompat.Builder mBuilder;
	public MsgManager() {
		
	}

	@SuppressLint("SimpleDateFormat") public MsgManager(Context context) {
		this.context = context;
		sDateFormat = new SimpleDateFormat("yyyy年MM月dd日  HH:mm:ss");
	} 

	
	@Override
	public void dealWithMessage(NotifyAndMsg notifyAndMsg) {
		// TODO Auto-generated method stub
		super.dealWithMessage(notifyAndMsg);
		currentMsg = notifyAndMsg;
	/*	if (null != context) {
			TextView view = (TextView) ((Activity)context).
					findViewById(R.id.show_message);
			view.clearAnimation();
			view.setText("消息标题： " + notifyAndMsg.getSubject() + "\n" 
				+"消息内容： " + notifyAndMsg.getContent() + "\n"
				+"消息时间： " + sDateFormat.format(new Date()) );	
			Toast.makeText(context, "消息标题： " + notifyAndMsg.getSubject() + "\n" 
					+"消息内容： " + notifyAndMsg.getContent() + "\n"
					+"消息时间： " + sDateFormat.format(new Date()), Toast.LENGTH_LONG).show();
		}*/
	}

	@Override
	public void dealWithNotification(NotifyAndMsg notifyAndMsg) {
		// TODO Auto-generated method stub
		super.dealWithNotification(notifyAndMsg);
		//int notifyId = 100;
		currentNotify = notifyAndMsg;
		//PushServiceManager.setNotificationActivity(NotificationActivity.class);
		/*if(null != currentNotify && currentNotify.getPackage_name().equals("com.yonyou.upushv2demoa")){
			
			String jsonString = currentNotify.getContent();
			
			Intent resultIntent = new Intent();
			resultIntent.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
			resultIntent.setClassName("nc.bs.oa.oama.ecm", "nc.bs.oa.oama.ecm.Ecm_LoginExtendActivity");
			PendingIntent pendingIntent = PendingIntent.getActivity(context, 0,
					resultIntent, PendingIntent.FLAG_UPDATE_CURRENT);
			mBuilder.setContentIntent(pendingIntent);
			//mNotificationManager.notify(notifyId, mBuilder.build());
			context.startActivity(resultIntent);

		}
		*/
	}

	
}
