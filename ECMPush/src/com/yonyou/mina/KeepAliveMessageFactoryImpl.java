package com.yonyou.mina;

import java.util.ArrayList;

import org.apache.mina.core.session.IoSession;
import org.apache.mina.filter.keepalive.KeepAliveMessageFactory;



import com.yonyou.protocol.AppInfo;
import com.yonyou.protocol.Constants;
import com.yonyou.protocol.HeartMessage;
import com.yonyou.protocol.LogUtil;
import com.yonyou.protocol.ResponseHeartMessage;
import com.yonyou.pushclient.NotificationPushService;

import android.util.Log;

/**
 * @see 用于判断接受与发送的包是否是心跳包，以及心跳请求包的实现
 * @file KeepAliveMessageFactoryImpl.java
 * @package com.mymina.keepalive
 * @project minaclient
 * @author huangbq
 * @date 2014年8月18日 上午10:41:00
 */
public class KeepAliveMessageFactoryImpl implements KeepAliveMessageFactory {
	
	/** 日志标识*/
	private static final String TAG = LogUtil.
			makeLogTAG(KeepAliveMessageFactoryImpl.class);
	
	@Override
	public Object getRequest(IoSession session) {
		// TODO Auto-generated method stub	
		// 创建心跳请求包
		ArrayList<Integer> appIdList = new ArrayList<Integer>();
		HeartMessage heart = new HeartMessage();
		heart.setDevice_id(NotificationPushService.deviceId);
		if (!NotificationPushService.packageInfoMap.isEmpty()) {
			for (AppInfo appInfo : NotificationPushService.packageInfoMap.values()) {
				appIdList.add(appInfo.getApp_id());
				if (Constants.isLog()) {
					Log.d(TAG, "发送连接心跳包信息：app_id="+appInfo.getApp_id());
				}
			}
		}
		heart.setAppList(appIdList);
		return heart;
	}

	@Override
	public Object getResponse(IoSession session, Object object) {
		// TODO Auto-generated method stub
		return null;		
	}

	@Override
	public boolean isRequest(IoSession session, Object object) {
		// TODO Auto-generated method stub		
		if (object instanceof HeartMessage) {
			return true;
		} else {
		 return false;
		}		
	}

	@Override
	public boolean isResponse(IoSession session, Object object) {
		// TODO Auto-generated method stub		
		if (object instanceof ResponseHeartMessage) {
			return true;
		} 
		 return false;		
	}
}
