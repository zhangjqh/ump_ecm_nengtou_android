package com.yonyou.mina;


import org.apache.mina.core.service.IoHandler;
import org.apache.mina.core.session.IdleStatus;
import org.apache.mina.core.session.IoSession;

import com.yonyou.protocol.AppInfo;
import com.yonyou.protocol.AppLoginMessage;
import com.yonyou.protocol.Constants;
import com.yonyou.protocol.HeartMessage;
import com.yonyou.protocol.LogUtil;
import com.yonyou.protocol.NotifyAndMsg;
import com.yonyou.protocol.PushMessage;
import com.yonyou.protocol.ResponseMessage;
import com.yonyou.pushclient.NotificationPushService;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.util.Log;
	
/** 
 * 客户端核心处理器
 * @package com.huang.pushclient
 * @author huangbq
 * @date 2014-9-26 下午5:35:18 
 */ 
  	
public class MinaClientHandler implements IoHandler{
	
	/** 日志标识*/
	private static final String TAG = LogUtil.makeLogTAG(MinaClientHandler.class);
	/** 消息推送服务实例*/
	private NotificationPushService notificationPushService;
	
	
	/**
	 * 构造函数
	 * @param notificationPushService
	 */
	public MinaClientHandler(NotificationPushService notificationPushService) {
		 // 系统Notification服务
		this.notificationPushService = notificationPushService;		
	}
	
	@Override
	public void exceptionCaught(IoSession session, Throwable cause)
			throws Exception {
		// 发送当前连接状态
		if (null == session || !session.isConnected()) {
			Intent intent = new Intent(Constants.getActionConnectState());
			intent.putExtra(Constants.getExtraKeyConnectState(), false);
			notificationPushService.sendBroadcast(intent);
		}
		if(Constants.isLog()) {
			Log.d(TAG, "异常" +cause.toString());	
		}			
	}

	@SuppressLint("NewApi") @Override
	public void messageReceived(IoSession session, Object object) throws Exception {
		// TODO Auto-generated method stub	
		if (object instanceof PushMessage) {
			if(Constants.isLog()) {
				Log.d(TAG, "收到通知包********************");	
			}
			PushMessage msg = (PushMessage)object;			
			 // 返回反馈包
			ResponseMessage responseMessage = new ResponseMessage();
			responseMessage.setMsgDetailId(msg.getMsgDetailId());
			session.write(responseMessage);
			if(Constants.isLog()) {
				Log.d(TAG, "发送反馈包********************");	
			}
			// 发送通知、消息体广播
			Intent intent = new Intent(msg.getPackage_name()+Constants.getNotificationAndMessage());
			NotifyAndMsg notifyAndMsg = new NotifyAndMsg();
			notifyAndMsg.setContent(msg.getContent());
			notifyAndMsg.setMsgDetailId(msg.getMsgDetailId());
			notifyAndMsg.setPackage_name(msg.getPackage_name());
			notifyAndMsg.setSubject(msg.getSubject());
			notifyAndMsg.setType(msg.getType());
			notifyAndMsg.setExtratext(msg.getExtratext());
			intent.putExtra(Constants.getExtraKeyNotifyAndMsg(), notifyAndMsg);
			notificationPushService.sendBroadcast(intent);
			
    	} else if(object instanceof HeartMessage) {
    		if (Constants.isLog()) {
    			Log.d(TAG,"收到Server端心跳包:");
    		}  		
    	}
		
	}

	@Override
	public void messageSent(IoSession session, Object object) throws Exception {
		// TODO Auto-generated method stub
	}

	@Override
	public void sessionClosed(IoSession session) throws Exception {
		// 发送当前连接状态
		Intent intent = new Intent(Constants.getActionConnectState());
		intent.putExtra(Constants.getExtraKeyConnectState(), false);
		notificationPushService.sendBroadcast(intent);
		/* 关闭Session*/
		session.close(true);  		
	}

	@Override
	public void sessionCreated(IoSession session) throws Exception {
		// TODO Auto-generated method stub		
	}

	@Override
	public void sessionIdle(IoSession session, IdleStatus idleStatus) throws Exception {
		// TODO Auto-generated method stub
	}

	@Override
	public void sessionOpened(IoSession session) throws Exception {
		// 发送当前连接状态
		Intent intent = new Intent(Constants.getActionConnectState());
		intent.putExtra(Constants.getExtraKeyConnectState(), true);
		notificationPushService.sendBroadcast(intent);
		if (!NotificationPushService.packageInfoMap.isEmpty()) {
			// 将deviceId和对应app_id发送到服务端
			for(AppInfo appInfo : NotificationPushService.packageInfoMap.values()) {
				AppLoginMessage appLoginMessage = new AppLoginMessage();
				appLoginMessage.setDevice_id(NotificationPushService.deviceId);
				appLoginMessage.setApp_id(appInfo.getApp_id());
				appLoginMessage.setVersionName(
						notificationPushService.getPackageVersion(appInfo.getPackage_name()));
				session.write(appLoginMessage);
				if (Constants.isLog()) {
					Log.d(TAG, "向服务器发送app信息：  device_id="+appLoginMessage.getDevice_id()
							+"  app_id="+appLoginMessage.getApp_id());
				}
			}
		}
			
	}

}
