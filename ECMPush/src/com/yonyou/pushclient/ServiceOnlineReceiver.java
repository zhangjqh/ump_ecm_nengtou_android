package com.yonyou.pushclient;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import nc.bs.oa.oama.push.R;
import nc.bs.oa.oama.vo.PushExtraVO;
import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.text.Html;
import android.util.Log;
import android.widget.Toast;

import com.google.gson.Gson;
import com.yonyou.protocol.AppInfo;
import com.yonyou.protocol.Constants;
import com.yonyou.protocol.ExistMsgQueue;
import com.yonyou.protocol.LogUtil;
import com.yonyou.protocol.NotifyAndMsg;
import com.yonyou.protocol.PushServiceOnlinePackage;
import com.yonyou.upush.impl.LBSManagerImpl;

/**
 * @see 广播接收器，用于接收服务器在线广播
 * @file ServiceOnlineReceiver.java
 * @package com.huang.pushclient
 * @project PushClient
 * @author huangbq
 * @date 2014-9-24 上午11:03:48
 */
@SuppressLint("NewApi")
public class ServiceOnlineReceiver extends BroadcastReceiver {
	
	/** 日志标识*/
	private static final String TAG = LogUtil.makeLogTAG(ServiceOnlineReceiver.class);	
	/** 推送服务在线时间记录表*/
	private static HashMap<String, Long> onlineServiceMap;
	/** 推送服务心跳超时*/
	private static final long HEARTTIMEOUT = 18000;
	/** 创建组件*/
	private Service service;
	/** 系统消息管理器*/
	private NotificationManager nm;
	/** app 在线表*/
	private ArrayList<Integer> app_list;
	/** 通知信息列表*/
	public static HashMap<String, NotifyAndMsg> notify_List;
	/** 应用读写共享sharedpreferences*/
	private static SharedPreferences sharedPref = null;
	/** 消息标识*/
	private final static String MSG_TAG = "msg_detail_tag";
	/** 最近接收消息列表*/
	private ExistMsgQueue<String> existMsgQueues = null;
	/** 当前存在消息队列*/
	public static ExistMsgQueue<String> currentMsgQueue = null;
	
//	/** 当前通知*/
//	private NotifyAndMsg currentNotification = null;
//	/** 当前消息*/
//	private NotifyAndMsg currentMessage = null;
	//taskid
	private String taskid = null;
	/** 按收到顺序 记录 通知 (notify_List 的key值)*/
	public static List<String> lists ;
	/** 接收的push数量*/
	private static final int MAX_PUSN_NUM = 5;
	
	/**
	 * 构造函数
	 * @param pushServiceManager
	 */
	@SuppressLint("UseSparseArrays") public ServiceOnlineReceiver(Service service) {
		this.service = service;
//		this.nm = nm;
		this.nm = (NotificationManager) service.getSystemService(Context.NOTIFICATION_SERVICE);
		// 初始化服务在线时间表
		onlineServiceMap = new HashMap<String, Long>();
		app_list = new ArrayList<Integer>();
		notify_List = new HashMap<String, NotifyAndMsg>(); 
		lists = new ArrayList<String>();
		existMsgQueues = new ExistMsgQueue<String>();
		currentMsgQueue = new ExistMsgQueue<String>();
		sharedPref = PushServiceManager.getSharedPreferences();
		Set<String> detailIdSet = null;
		detailIdSet = sharedPref.getStringSet(MSG_TAG, detailIdSet);
		if (null != detailIdSet) {
			existMsgQueues.putAll(detailIdSet);
		}
	}

	@SuppressLint("NewApi")
	@Override
	public void onReceive(Context onecontext, Intent intent) {
		// TODO Auto-generated method stub
		String action = intent.getAction();
		// 通知或消息标识
		String notfAndMsgAction = service.getPackageName() + 
				Constants.getNotificationAndMessage();
		// 推送服务在线标识
		String serviceOnlineAction = Constants.getActionPushServiceOnline();
		// LBS撤销反馈广播标识
		String lbsRevoke = Constants.getActionLbsRevoke()+Constants.getApp_id();
		// UPush连接状态广播
		String connectState1 = Constants.getActionConnectState();
		String connectState2 = PushServiceManager.packageName 
				+ "." + Constants.getActionConnectState();
		// 通知删除广播
		String notifyDelete = PushServiceManager.packageName
				+ "." + Constants.getActionNotifyDelete();
		if (null !=action && notfAndMsgAction.equals(action)) {
			if (Constants.isLog()) {
				Log.d(TAG, "收到通知或消息包");
			}
			NotifyAndMsg notifyAndMsg = (NotifyAndMsg) intent
					.getSerializableExtra(Constants.getExtraKeyNotifyAndMsg());
			String detailId = Integer.toString(notifyAndMsg.getMsgDetailId());
			/*if (existMsgQueues.contains(detailId)) {
				// 重复消息
				return;
			} else {
				// 新消息，记录消息
				
				existMsgQueues.put(detailId);
				Set<String> existMsgSet = existMsgQueues.elementSet();
				Editor editor = sharedPref.edit();
				editor.putStringSet(MSG_TAG, existMsgSet);
				editor.commit();
			}*/
			if(null != notifyAndMsg && 1==notifyAndMsg.getType()) {
				// 数据包类型为通知
				// 推送通知
				if (Constants.isLog()) {
					Log.d(TAG, "收到通知…………………………………notification…………………………………………………");
					Log.d(TAG, "activity object: "+PushServiceManager.activityClass.toString());
					Log.d(TAG, notifyAndMsg.toString());
				}
				if (Constants.isDenyNotify()) {
					return;
				}
				if (notify_List.size()==50) {
					int deleteId =Integer.parseInt(currentMsgQueue.poll()); 
					nm.cancel(deleteId);
					notify_List.remove(deleteId);
				}
				//notify_List.put(notifyAndMsg.getMsgDetailId(), notifyAndMsg);
				String extraString = notifyAndMsg.getExtratext();
				if(extraString!=null && !"".equals(extraString.trim())){
					
					PushExtraVO peVo = new PushExtraVO(); 
					peVo = new Gson().fromJson(extraString, PushExtraVO.class);
					taskid = peVo.getParams().get("taskId");
				}
				String mapKey = null;
				if(taskid != null){
					notify_List.put(taskid, notifyAndMsg);
					mapKey = taskid;
				}else{
					notify_List.put(String.valueOf(notifyAndMsg.getMsgDetailId()), notifyAndMsg);
					lists.add(String.valueOf(notifyAndMsg.getMsgDetailId()));
					mapKey = String.valueOf(notifyAndMsg.getMsgDetailId());
				}
				int listSize = notify_List.size();
				Log.i("Notify_list", String.valueOf(listSize));
				//设置只显示最新的5条信息
				if(lists.size()==MAX_PUSN_NUM){
					String delMapKey = lists.remove(0);
					NotifyAndMsg cancleMsg = notify_List.get(delMapKey);
					notify_List.remove(delMapKey);
					nm.cancel(cancleMsg.getMsgDetailId());
					lists.add(mapKey);
				}else{
					lists.add(mapKey);
				}
				//notify_List.put(notifyAndMsg.getMsgDetailId(), notifyAndMsg);
				currentMsgQueue.put(Integer.toString(notifyAndMsg.getMsgDetailId()));
				pushNotification(service, PushServiceManager.activityClass, nm, notifyAndMsg);
				if (null != PushServiceManager.getInformationManager()) {
					PushServiceManager.getInformationManager().dealWithNotification(notifyAndMsg);
				}
			} else if (null != notifyAndMsg && 0==notifyAndMsg.getType()) {
				// 数据包类型为消息
				// 推送消息
				if (Constants.isLog()) {
					Log.d(TAG, "收到消息……………………………………………message…………………………………………………");
					Log.d(TAG, notifyAndMsg.toString());
				}
				if (null != PushServiceManager.getInformationManager()) {
					PushServiceManager.getInformationManager().dealWithMessage(notifyAndMsg);
				} else {
					if (Constants.isLog()) {
						Log.d(TAG, "缺少消息处理器： InformationManager");
					}
				}
				
			}			
		} else if(null !=action && serviceOnlineAction.equals(action) ) {
			if (Constants.isLog()) {
				Log.d(TAG, "收到推送服务在线心跳包");
			}	
			// 获取当前服务在线信息包
			PushServiceOnlinePackage onlinePackage = (PushServiceOnlinePackage) intent.
					getSerializableExtra(Constants.getExtraKeyPushServiceOnline());
			// 获取在线app列表
			app_list = onlinePackage.getAppOnlineList();
			// 获取当前服务包名
			String pushServicePackageName = onlinePackage.getPackageName();
			if(Constants.isLog()) {
				Log.d(TAG, "当前服务提供者包名：~~~ " + onlinePackage.getPackageName() + "~~~!");
				Log.d(TAG, "当前存在app列表："+app_list.toString());
			}		
			// 判断服务提供者是否改变
			if (onlineServiceMap.isEmpty()) {
				// 第一次收到服务心跳包
				onlineServiceMap.put(pushServicePackageName, System.currentTimeMillis());
			} else if (1 == onlineServiceMap.size() 
					&& onlineServiceMap.containsKey(pushServicePackageName)) {
				// 服务提供者不变
				onlineServiceMap.put(pushServicePackageName, System.currentTimeMillis());			
			} else if (1 == onlineServiceMap.size() 
					&& !onlineServiceMap.containsKey(pushServicePackageName)) {
				// 服务提供者改变
				onlineServiceMap.clear();
				onlineServiceMap.put(pushServicePackageName, System.currentTimeMillis());
			}
			// 发送心跳反馈或注册服务
			responseOrRegisterService();
		} else if (null != action && lbsRevoke.equals(action)) {
			// 接收到LBS撤销反馈广播
			if (Constants.isLog()) {
				Log.d(TAG, "~~~~~~~~~~~~~~~~~~接收到LBS撤销反馈广播~~~~~~~~~~~~~~~~~~");
			}
			LBSManagerImpl.closeLBS = true;
		} else if (null != action && (connectState1.equals(action) || connectState2.equals(action))) {
			boolean state = false;
			state = intent.getBooleanExtra(Constants.getExtraKeyConnectState(), false);
			if (state!=PushServiceManager.isConnected()) {
				PushServiceManager.setConnected(state);
				if (Constants.isLog()) {
					Log.d(TAG, "~~~链接服务器地址：" + Constants.getIP() + 
							":"+Constants.getPORT()+" ~~~ 当前连接状态： " + 
							PushServiceManager.isConnected());
					Toast.makeText(PushServiceManager.context, "~~~链接服务器地址：" +
							Constants.getIP()+":"+Constants.getPORT()+" ~~~ 当前连接状态： " + 
							PushServiceManager.isConnected(), Toast.LENGTH_LONG).show();
				}
			}			
		} else if (null != action && notifyDelete.equals(action)) {
			int detailId = intent.getIntExtra(Constants.getExtraKeyNotifyDelete(), 0);
			if (0 != detailId && notify_List.containsKey(detailId)) {
				notify_List.remove(detailId);
				currentMsgQueue.remove(Integer.toString(detailId));
				/*if (Constants.isLog()) {
					Toast.makeText(PushServiceManager.context, "~~~通知 ID：" + detailId +
							" 被删除", Toast.LENGTH_LONG).show();
				}*/
			}
		}
		
		
	}
	
	
	/**
	 * @see 发送反馈心跳或注册服务信息
	 * @method responseOrRegisterService
	 * @date 2014-9-24 下午2:39:20
	 */
	private void responseOrRegisterService () {
		// 发送app在线广播
		Intent intent = new Intent(Constants.getActionAppOnline());
		AppInfo appInfo = new AppInfo();
		appInfo.setPackage_name(PushServiceManager.packageName);
		appInfo.setActivity_class_name(PushServiceManager.className);
		appInfo.setApp_id(Constants.getApp_id());
		intent.putExtra(Constants.getExtraKeyAppOnline(), appInfo);
		service.sendBroadcast(intent);
		if(Constants.isLog()) {
			Log.d(TAG, "app在线广播已发送");
		}		
	}
	
	/**
	 * @see 推送服务心跳超时处理器
	 * @method pushServiceTimeoutHandle
	 * @date 2014-9-24 下午2:59:55
	 */
	public void pushServiceTimeoutHandle() {
		Thread pushServiceTimeouThread = new Thread(new Runnable() {			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				while(Constants.isConnect()){
					if (!onlineServiceMap.isEmpty()) {
						for(String name : onlineServiceMap.keySet()) {
							if ((System.currentTimeMillis()
									-onlineServiceMap.get(name))>HEARTTIMEOUT) {
								// 心跳超时，认为服务已经关闭。准备创建新推送服务
								if (app_list.size()<2) {
									// 当前没有其他应用，由本应用来创建服务
									startPushService();
									if(Constants.isLog()) {
										Log.d(TAG, "推送服务心跳超时，开始创建新推送服务");
									}
								} else {
									// 第一个应用是原服务提供者，由下一个应用来创建服务
									if (Constants.getApp_id() == app_list.get(1)) {
										// 下一个应用是自己，创建服务
										startPushService();
										if(Constants.isLog()) {
											Log.d(TAG, "推送服务心跳超时，开始创建新推送服务");
										}
									} else {
										// 等待其他应用来创建服务
										app_list.remove(1);
									}									
								}
					
							}
						}
					}
					try {
						Thread.sleep(HEARTTIMEOUT);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
		});
		pushServiceTimeouThread.start();
	}
	
	/**
	 * @see 判断服务是否存在
	 * @method isServiceRunning
	 * @param mContext
	 * @param className
	 * @return boolean
	 * @date 2014-9-23 下午5:12:17
	 */
	private boolean isServiceRunning(Context mContext, String className) {
        boolean IsRunning = false;
        if(Constants.isLog()) {
        	Log.d(TAG, "className:" + className);
        }      
        ActivityManager activityManager = (ActivityManager)mContext.getSystemService(Context.ACTIVITY_SERVICE);
        List<ActivityManager.RunningServiceInfo> serviceList = activityManager.getRunningServices(Integer.MAX_VALUE);
        if(!(serviceList.size()>0)) {
         return false;
        }
        for(int i = 0; i < serviceList.size(); i++) {
        	if(Constants.isLog()) {
        		 Log.d(TAG, "isServiceRunning:" + serviceList.get(i).service.getClassName());
        	}
            if(serviceList.get(i).service.getClassName().equals(className) == true) {
                IsRunning = true;
                break;
            }
        }
        return IsRunning;
    }
	
	/**
	 * @see 消息推送服务开启
	 * @method pushServiceStart
	 * @date 2014-9-23 下午7:21:27
	 */
	public void startPushService() {
		// 获取服务名
		String pushServiceName = Constants.getServiceName();
		// 判断是否存在
		Boolean exist = isServiceRunning(service, pushServiceName);
		if (!exist) {
			Thread serviceThread = new Thread(new Runnable() {
	            @Override
	            public void run() {
	            	if (Constants.isLog()) {
	            		Log.d(TAG, "服务不存在开始创建服务");
	            	}	            	
	                Intent intent = new Intent(Constants.getServiceAction());
	                service.startService(intent);
	            }
	        });
	        serviceThread.start();		
		}		
	}
	
	@SuppressLint("NewApi") private void pushNotification(Context pushContext, Class<?> activityClass,
			NotificationManager nm, NotifyAndMsg notifyAndMsg) {
		/* 推送通知*/
			// 通知响应Intent
//		Intent intent  = new Intent(pushContext, showContext.getClass());
		Intent intent = new Intent(pushContext, activityClass);
		intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK|Intent.FLAG_ACTIVITY_CLEAR_TOP);
		intent.putExtra("msg_Id", notifyAndMsg.getMsgDetailId());
		intent.putExtra("taskId", taskid);
		PendingIntent pi = PendingIntent.getActivity(
				pushContext, notifyAndMsg.getMsgDetailId(), intent, PendingIntent.FLAG_UPDATE_CURRENT);
		// 通知删除intent
		Intent  deleteIntent = new Intent(PushServiceManager.packageName+"."+Constants.getActionNotifyDelete());
		deleteIntent.putExtra(Constants.getExtraKeyNotifyDelete(), notifyAndMsg.getMsgDetailId());
		PendingIntent deletePi = PendingIntent.getBroadcast(
				pushContext, notifyAndMsg.getMsgDetailId(), deleteIntent, PendingIntent.FLAG_UPDATE_CURRENT);
		/* 创建通知*/
		ApplicationInfo ai = pushContext.getApplicationInfo();
		Resources resources = pushContext.getResources();
		CharSequence tickertext = null;
		CharSequence contenttext = null;
		CharSequence contentTitle = null;
		// 设置 tickerText
		if (null == Constants.Notificatin.getTicker() ||
				Constants.Notificatin.NOTIFICATION_TITLE.equals(Constants.Notificatin.getTicker())) {
			tickertext = Html.fromHtml(notifyAndMsg.getSubject());
		} else if (Constants.Notificatin.NOTIFICATION_CONTENT.equals(Constants.Notificatin.getTicker())) {
			tickertext = Html.fromHtml(notifyAndMsg.getContent());
		} else if(Constants.Notificatin.APP_LABEL.equals(Constants.Notificatin.getTicker())) {
			tickertext = resources.getString(ai.labelRes);
		} else {
			tickertext = Html.fromHtml(Constants.Notificatin.getTicker());
		}
		// 设置contenttext
		if (null == Constants.Notificatin.getContentText() ||
				Constants.Notificatin.NOTIFICATION_CONTENT.equals(Constants.Notificatin.getContentText())) {
			contenttext = Html.fromHtml(notifyAndMsg.getContent());
		} else if (Constants.Notificatin.NOTIFICATION_TITLE.equals(Constants.Notificatin.getContentText())) {
			contenttext = Html.fromHtml(notifyAndMsg.getSubject());
		} else if(Constants.Notificatin.APP_LABEL.equals(Constants.Notificatin.getContentText())) {
			contenttext = resources.getString(ai.labelRes);
		} else {
			contenttext = Html.fromHtml(Constants.Notificatin.getContentText());
		}
		// 设置contentTitle
		if (null == Constants.Notificatin.getContentTitle() || 
				Constants.Notificatin.APP_LABEL.equals(Constants.Notificatin.getContentTitle())) {
			contentTitle = resources.getString(ai.labelRes);
		} else if (Constants.Notificatin.NOTIFICATION_TITLE.equals(Constants.Notificatin.getContentTitle())) {
			contentTitle = Html.fromHtml(notifyAndMsg.getSubject());
		} else if(Constants.Notificatin.NOTIFICATION_CONTENT.equals(Constants.Notificatin.getContentTitle())) {
			contentTitle = Html.fromHtml(notifyAndMsg.getContent());
		} else {
			contentTitle = Html.fromHtml(Constants.Notificatin.getContentTitle());
		}
		Notification notify = new Notification.Builder(pushContext)
		.setAutoCancel(true)
		
		.setTicker(tickertext)
		// 设置状态栏图标 同时也是 ticker时的图标
		.setSmallIcon(R.drawable.notify_pic_small)
		// 设置通知展示大图标
		.setLargeIcon(BitmapFactory.decodeResource(resources, R.drawable.notify_pic))
		// 设置通知展示标题
		.setContentTitle(contentTitle)
		// 通知简要内容
		.setContentText(contenttext)
		// 声音设置
		.setDefaults(Notification.DEFAULT_SOUND)
		// 设置时间
		.setWhen(System.currentTimeMillis())
		// 绑定 deleteIntent
		.setDeleteIntent(deletePi)
		// 绑定pendingIntent
		.setContentIntent(pi)
		.build();
		// 发送通知
		nm.notify(notifyAndMsg.getMsgDetailId(), notify);
		 if(Constants.isLog()) {
	    	   Log.d(TAG, "当前通知: ID="+Constants.getApp_id()+
	    			   " info="+notifyAndMsg.getContent()+
	    			   " extra="+notifyAndMsg.getExtratext());
	       }
	  
	}


	 
	/** 
	 * 根据通知Id获取通知
	 * @param msg_id or taskid
	 * @return notification
	 * @author huangbq
	 * @data 2014-12-25 下午7:19:57 
	 */
	  	
	public static NotifyAndMsg getNotifyById(String msg_id) {
		NotifyAndMsg notify = notify_List.get(msg_id);
		return notify;
	}

	 
	/** 
	 * 根据通知Id移除通知
	 * @param msg_id
	 * @author huangbq
	 * @data 2014-12-25 下午7:21:25 
	 */
	  	
	public static void removeNotifyById(String msg_id) {
		notify_List.remove(msg_id);
	}
	/**
	 * 删除记录的list中记录的数据
	 * @param index
	 */
	public static void removeListByIndex(int index){
		lists.remove(index);
	}
	/**
	 * 通过内容删除自己
	 * @param content
	 */
	
	public static void removeListByString(String content){
		lists.remove(content);
	}
	 
	/** 
	 * 获取服务
	 * @return service
	 * @author huangbq
	 * @data 2014-12-25 下午7:21:53 
	 */
	  	
	public Service getService() {
		return service;
	}

	
}
