package com.yonyou.pushclient;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import com.yonyou.mina.MinaClient;
import com.yonyou.protocol.AppInfo;
import com.yonyou.protocol.AppLoginMessage;
import com.yonyou.protocol.Constants;
import com.yonyou.protocol.LocationUPush;
import com.yonyou.protocol.LogUtil;
import com.yonyou.protocol.NotifyBack;
import com.yonyou.protocol.PushServiceOnlinePackage;
import com.yonyou.protocol.Tag;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/** 
 * app在线监听器
 * @package com.yonyou.pushclient
 * @author huangbq
 * @date 2014-10-21 下午8:02:22 
 */ 
  	
public class AppRegisterReceiver extends BroadcastReceiver {
	
	/** 日志标识*/
	private static final String TAG = LogUtil.makeLogTAG(AppRegisterReceiver.class);
	/** 推送服务实例*/
	private NotificationPushService notificationPushService;
	/** 定义服务在线广播心跳6秒*/
	private static final long HEART = 6000;
	/** 心跳超时时间*/
	private static final long HEATTIMEOUT = 18000;
	/** app 在线列表*/
	private ArrayList<Integer > app_list;	
	/** 注册应用在线监测表*/
	private static HashMap<String, Long>  appOnlineMap;
	/** LBS 表*/
	private static HashMap<Integer, LocationUPush> lbsMap;
	/** 连接状态*/
	private static boolean connect_state = false;
	
	@SuppressLint("UseSparseArrays") 
	public AppRegisterReceiver(NotificationPushService notificationPushService) {
		appOnlineMap = new HashMap<String, Long>();
		lbsMap = new HashMap<Integer, LocationUPush>();
		this.notificationPushService = notificationPushService;
		app_list = new ArrayList<Integer>();
		app_list.add(0, Constants.getApp_id());
		if (Constants.isLog()) {
			Log.d(TAG, "广播接收器被创建了");
		}		
	}
	

	@Override
	public void onReceive(Context context, Intent intent) {
		// 接收广播类型
		// app 在线
		String appOn = Constants.getActionAppOnline();
		// 基于地理位置推送LBS
		String lbsOn = Constants.getActionLbs();
		// 基于标签推送Tag
		String tagOn = Constants.getActionTagSet();
		// 反馈通知打开事件
		String notifyOn = Constants.getActionNotifyBack();
		// 连接状态改变关闭
		String connection_stateOn = Constants.getActionConnectState();
		
		if (appOn.equals(intent.getAction())) {
			// 收到app在线广播
			if(Constants.isLog()) {
				Log.d(TAG, "收到app在线广播");
			}
			/* 获取其他应用的包名和类名*/		
			AppInfo appInfo = (AppInfo) intent.getSerializableExtra(Constants.getExtraKeyAppOnline());
			appOnlineMap.put(appInfo.getPackage_name(), System.currentTimeMillis());
			/* 如果该包名在列表中不存在*/
			if (!NotificationPushService.packageInfoMap.containsKey(appInfo.getPackage_name())) {
				// 将appInfo存入表中
				NotificationPushService.packageInfoMap.put(appInfo.getPackage_name(), appInfo);
				if(!notificationPushService.getPackageName().equals(appInfo.getPackage_name())
						|| app_list.isEmpty()) {
					app_list.add(appInfo.getApp_id());
				}	
				// 给当前应用发送连接状态广播
				Intent intent_con_state = new Intent(appInfo.getPackage_name() 
						+ "." + Constants.getActionConnectState());
				intent_con_state.putExtra(Constants.getExtraKeyConnectState(), connect_state);
				notificationPushService.sendBroadcast(intent_con_state);
				// 发送app登录包
				if (null !=MinaClient.confu &&MinaClient.confu.isConnected() && null != MinaClient.confu.getSession()) {
					// 发送app登录包
					AppLoginMessage appLoginMessage = new AppLoginMessage();
					appLoginMessage.setApp_id(appInfo.getApp_id());
					appLoginMessage.setDevice_id(NotificationPushService.deviceId);
					appLoginMessage.setVersionName(
							notificationPushService.getPackageVersion(appInfo.getPackage_name()));
					MinaClient.confu.getSession().write(appLoginMessage);				
				}		
			}
		} else if (lbsOn.equals(intent.getAction())) {
			// 收到LBS广播
			if (Constants.isLog()) {
				Log.d(TAG, "收到LBS位置改变广播");
			}
			// 获取广播体
			LocationUPush loc = (LocationUPush) intent
					.getSerializableExtra(Constants.getExtraKeyLbs());
			loc.setMsgType();
			loc.setDevice_id(Constants.getDevice_id());
			Integer app_id = loc.getApp_id();
			Boolean useLBS = loc.isLbs();
			if (!useLBS) {
				// 撤销LBS服务
				synchronized (lbsMap) {
					lbsMap.remove(app_id);
				}
				if ( null != MinaClient.confu && MinaClient.confu.isConnected()) {
					if (null != MinaClient.confu.getSession()) {
						MinaClient.confu.getSession().write(loc);
					}
				}
				// 发送LBS撤销通知
				Intent intentLBS = new Intent(Constants.getActionLbsRevoke()+app_id);
				notificationPushService.sendBroadcast(intentLBS);
				if (Constants.isLog()) {
					Log.d(TAG, "发送LBS服务撤销反馈广播");
				}				
			} else {
				// 设置LBS服务
				synchronized (lbsMap) {
					lbsMap.put(app_id, loc);
				}
			}
		} else if (tagOn.equals(intent.getAction())) {
			// 收到TAG设置广播
			if (Constants.isLog()) {
				Log.d(TAG, "收到TAG设置广播");
			}
			// 获取广播数据对象
			Tag tag = (Tag)intent.getSerializableExtra(Constants.getExtraKeyTagSet());
			tag.setMsgType();
			if (null != MinaClient.confu && MinaClient.confu.isConnected()) {
				MinaClient.confu.getSession().write(tag);
				if (Constants.isLog()) {
					Log.d(TAG, "向服务器端发送标签: " + "\n" 
				+ "app_id： " + tag.getApp_id() + "\n" 
				+ "addTag: " + tag.isAddTag() + "\n" 
				+ "Tag:    " + tag.getTag());					
				}
			}
		} else if (notifyOn.equals(intent.getAction())) {
			// 收到Notify打开广播
			if (Constants.isLog()) {
				Log.d(TAG, "收到Notify被打开广播");
			}
			// 获取广播体
			NotifyBack notifyBack = (NotifyBack) intent.getSerializableExtra(
					Constants.getExtraKeyNotifyBack());
			notifyBack.setType();
			notifyBack.setDevice_id(NotificationPushService.deviceId);
			if (null != MinaClient.confu && MinaClient.confu.isConnected()) {
				MinaClient.confu.getSession().write(notifyBack);
				if (Constants.isLog()) {
					Log.d(TAG, "向服务器端发送通知打开广播: " + "\n" 
				+ "device_id： " + notifyBack.getDevice_id() + "\n" 
				+ "app_id:    " + notifyBack.getApp_id() + "\n" 
				+ "Msg_dt_id: " + notifyBack.getMsg_dt_id());					
				}
			}
		} else if (connection_stateOn.equals(intent.getAction()))	{
			connect_state = intent.getBooleanExtra(
					Constants.getExtraKeyConnectState(), false);
			
		}
	}
	 
	/** 
	 * 启动广播处理器中处理个业务的线程 ： <br>
	 * 		1.定时发送UPush服务在线广播；<br>
	 * 		2.定时发送LBS位置信息；<br/>
	 * 		3.app在线广播超时处理；<br/>
	 * @author huangbq
	 * @data 2014-12-9 下午4:57:48 
	 */
	  	
	public void startOperatorThread() {
		// 1. 发送心跳广播线程
		Thread serviceOnlineHeartBeatThread = new Thread(new Runnable() {			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				// 发送服务在线心跳包
				while (Constants.isConnect()) {
					PushServiceOnlinePackage onlinePackage = new PushServiceOnlinePackage();
					onlinePackage.setAppOnlineList(app_list);
					onlinePackage.setPackageName(notificationPushService.getPackageName());
					// 发推送服务在线广播
					Intent intent = new Intent(Constants.getActionPushServiceOnline());
					intent.putExtra(Constants.getExtraKeyPushServiceOnline(), onlinePackage);
					notificationPushService.sendBroadcast(intent);	
					if(Constants.isLog()) {
						Log.d(TAG, "开始发送服务心跳包");	
					}					
					try {
						Thread.sleep(HEART);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						Log.d(TAG, e.getMessage());
					}
				}						
			}
		});
		serviceOnlineHeartBeatThread.start();
		// 2. 发送LBS位置信息线程
		Thread sendLocationUPushThread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				while (Constants.isConnect()) {
					// 每5分钟发送一次
					if ( null != MinaClient.confu && MinaClient.confu.isConnected()) {
						if (null != MinaClient.confu.getSession()) {
							synchronized (lbsMap) {
								for (LocationUPush loc : lbsMap.values()) {
									MinaClient.confu.getSession().write(loc);
									if (Constants.isLog()) {
										Log.d(TAG, "向服务器端发送LBS服务请求");
									}
								}															
							}
//							lbsMap.clear();							
						}
					}
					try {
						Thread.sleep(300000);
//						Thread.sleep(5000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						Log.d(TAG, e.getMessage());
					}					
				}				
			}
		});
		sendLocationUPushThread.start();			
		// 3. app在线超时处理线程
		Thread responseTimeoutThread = new Thread(new Runnable() {			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				while(Constants.isConnect()) {
					Long currentTime = System.currentTimeMillis();
					Iterator<String> iterator = appOnlineMap.keySet().iterator();
					while (iterator.hasNext()) {
						String packageName = iterator.next();
						if ((currentTime - appOnlineMap.get(packageName))> HEATTIMEOUT) {
							// 心跳超时 ，发送应用离线消息
							app_list.remove((Object)NotificationPushService.
									packageInfoMap.get(packageName).getApp_id());
							iterator.remove();
							NotificationPushService.packageInfoMap.remove(packageName);
							if (Constants.isLog()) {
								Log.d(TAG, "app心跳超时，判断为断开连接");
							}	
							break;
						}
						
					}
					try {
						Thread.sleep(HEATTIMEOUT);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						Log.d(TAG,e.getMessage());
					}
				}				
			}
		});
		responseTimeoutThread.start();		
	}

}
