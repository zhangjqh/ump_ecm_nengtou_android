
/**   
 * @Title: NotificationActivity.java 
 * @Package: com.yonyou.protocol 
 * @Description: TODO
 * @author Administrator  
 * @date 2014-12-23 下午2:56:19 
 * @version 1.3.1 
 */


package com.yonyou.protocol;

import com.yonyou.pushclient.PushServiceManager;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

/** 
 *
 * @package com.yonyou.protocol
 * @author huangbq
 * @date 2014-12-23 下午2:56:19 
 */

public class NotificationActivity extends Activity {
	
	/** 日志标签*/
	private final static String TAG = LogUtil.makeLogTAG(NotificationActivity.class);

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		int id = getMessageID();
		if (Constants.isLog()) {
			Log.d(TAG, "反馈通知被打开消息 msgID = " + id);
		}
		Intent intent = new Intent(Constants.getActionNotifyBack());
		NotifyBack notifyBack = new NotifyBack();
		notifyBack.setApp_id(Constants.getApp_id());
		notifyBack.setMsg_dt_id(id);
		intent.putExtra(Constants.getExtraKeyNotifyBack(), notifyBack);
		this.sendBroadcast(intent);
	}
	
	/**
	 * Description 
	 * @param intent 
	 * @see android.app.Activity#onNewIntent(android.content.Intent) 
	 */ 
		
	@Override
	protected void onNewIntent(Intent intent) {
		// TODO Auto-generated method stub
		super.onNewIntent(intent);
	}
	
	
	 
	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		Intent intent = new Intent(PushServiceManager.packageName+"."+Constants.getActionNotifyDelete());
		intent.putExtra(Constants.getExtraKeyNotifyDelete(), this.getNotifyId());
		this.sendBroadcast(intent);
	}

	/** 
	 * 获取通知Id
	 * @return notify_Id
	 * @author huangbq
	 * @data 2014-12-25 下午7:30:00 
	 */
	  	
	protected int getMessageID() {
		Intent it = this.getIntent();
		return it.getIntExtra("msg_Id", 0);		
	}
	/**
	 * 获得list中的通知id（这个id可能是taskid or msg_id）
	 * @return
	 */
	protected String getNotifyId() {
		Intent it = this.getIntent();
		String taskId = it.getStringExtra("taskId");
		int msgId = it.getIntExtra("msg_Id", 0);
		if(taskId != null){
			return taskId;
		}
		
		return String.valueOf(msgId);		
	}

}
