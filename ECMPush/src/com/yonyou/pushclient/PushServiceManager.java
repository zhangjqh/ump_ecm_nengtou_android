package com.yonyou.pushclient;

import java.util.List;
import com.yonyou.protocol.Constants;
import com.yonyou.protocol.CustomException;
import com.yonyou.protocol.LocationUPush;
import com.yonyou.protocol.LogUtil;
import com.yonyou.upush.impl.LBSManagerImpl;
import com.yonyou.upush.impl.TagManagerImpl;
import com.yonyou.upush.interf.InformationManager;


import android.app.Activity;
import android.app.ActivityManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.location.LocationManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.Log;

/** 
 * 推送服务管理器 （SDK核心类)
 * @package com.yonyou.pushclient
 * @author huangbq
 * @date 2014-10-21 下午8:56:50 
 */ 
  	
public class PushServiceManager {
	
	/** 日志标识*/
	private static final String TAG = 
			LogUtil.makeLogTAG(PushServiceManager.class);
	
	/* 服务名常量定义*/
	public enum ServiceType {TAG_MANAGER,LBS_MANAGER}
	
	
	/** 应用包名*/
	public static String packageName;
	/** 消息响应对象类名*/
	public static String className;
	/** 通知响应对象类*/
	public static Class<?> activityClass;
	/** Context 对象*/
	public static Context context;
	/** 广播处理器注册对象*/
	private static Context receiver;
	/** currentLocation*/
	public static LocationUPush lastLocation = new LocationUPush();
	/** 服务在线状态广播接收器*/
	private static ServiceOnlineReceiver serviceOnlineReceiver;
	/** 消息管理器*/
	private static InformationManager mmi;
	/** Tag管理器*/
	private static TagManagerImpl tagManagerImpl = null;
	/** LBS管理器*/
	private static LBSManagerImpl lbsManagerImpl = null;
	/** 应用和服务器的当前连接状态*/
	private static boolean isConnected = false;
	/** 应用读写共享sharedpreferences*/
	private static SharedPreferences sharedPref = null;
	 /**手机管理器实例引用*/
    private static TelephonyManager telephonyManager=null;
    /** device_id*/
    private static String device_id = null;
	
	/**
	 * 构造函数
	 */
	private PushServiceManager() {		
	}

	/** 
	 * UPush服务初始化
	 * @param context （Application || activity）
	 * @throws CustomException <br/>
	 *               ExceptionSet - read : 文件读取异常<br/>   
	 *               ExceptionSet - param: 参数异常
	 * @author huangbq
	 * @data 2014-12-8 上午10:33:41 
	 */
	  	
	public static void init(Context context) {
		// 参数检查
		if (null == context) {
			if (Constants.isLog()) {
				Log.d(TAG, "参数异常： 初始化时Context值不能为null");
			}
			return;
		}
		PushServiceManager.context = context;
		// 从androidManifest文件读取app_id值
		try {
			ApplicationInfo appInfo = context.getPackageManager().
					getApplicationInfo(context.getPackageName(),
							PackageManager.GET_META_DATA);
			Constants.setApp_id(appInfo.metaData.getInt("APP_ID"));
		} catch (NameNotFoundException e) {
			if (Constants.isLog()) {
				Log.d(TAG, "配置文件读取异常：读不到app_id值");
			}
			return;
		}
		
		// 初始化：   应用名，通知响应类名，UPush推送服务名；
		packageName = context.getPackageName();
		className = ShowNotification.class.getName();
		activityClass = ShowNotification.class;
		Constants.setSERVICE_ACTION(packageName+".NOTIFICATION_PUSH_SERVICE");
		telephonyManager = (TelephonyManager)context.getSystemService(Context.TELEPHONY_SERVICE);	
		// 获取sharedpreferences
		sharedPref = context.getSharedPreferences(packageName+"."+
				Constants.getSharedPreferenceName(), Context.MODE_PRIVATE);
	}

	/** 
	 * 启动UPush推送服务
	 * @author huangbq
	 * @data 2014-12-8 上午10:49:27 
	 */
	  	
	public static void Start() {

		Constants.setConnect(true);
		// 获取android位置信息处理器
		LocationManager locationManager = 
				(LocationManager) context.getSystemService(Context.LOCATION_SERVICE);
		// 管理器初始化 ：  tagManager、 LBSManager
		tagManagerImpl = new TagManagerImpl(context);
		lbsManagerImpl = new LBSManagerImpl(context,locationManager);
		// 获取服务名
		String pushServiceName = Constants.getServiceName();
		// 判断服务是否存在
		Boolean exist = isServiceRunning(context, pushServiceName);
		if (!exist) {
			Thread serviceThread = new Thread(new Runnable() {
	            @Override
	            public void run() {
	            	if(Constants.isLog()) {
	            		Log.d(TAG, "服务不存在开始创建服务");
	            	}	            	
	                Intent intent = new Intent(Constants.getServiceAction());
	                context.startService(intent);
	            }
	        });
	        serviceThread.start();		
		}else {
			if(Constants.isLog()) {
				Log.d(TAG, "服务已经存在，不用创建服务");
        	}
		}
		// 如果Context对象是Application则注册监听器
		
	}

	/**
	 * @see 服务停止
	 * @method Stop
	 * @date 2014-9-23 下午5:11:02
	 */
	public static void Stop() {
		Constants.setConnect(false);
		setConnected(false);
		if (null != tagManagerImpl) {
			tagManagerImpl.clearup();
			tagManagerImpl = null;
		}		
		if (null != lbsManagerImpl) {
			lbsManagerImpl.clearup();
			lbsManagerImpl = null;
		}
		if (serviceOnlineReceiver != null) {
			receiver.unregisterReceiver(serviceOnlineReceiver);
			serviceOnlineReceiver = null;
		}
        Intent intent = new Intent(Constants.getServiceAction());
        context.stopService(intent);
        if(Constants.isLog()) {
        	Log.d(TAG, "推送服务结束");
        }
	}
		 
	/** 
	 * UPush 服务清理
	 * @author huangbq
	 * @data 2014-12-8 上午9:47:06 
	 */
	  	
	public static void clearup () {
		
	}
		 
	/** 
	 * 设置服务器地址
	 * @param ip
	 * @param port
	 * @author huangbq
	 * @data 2014-10-8 下午6:23:53 
	 */
	  	
	public static void setAddress(String ip, int port) {
		Constants.setIP(ip);
		Constants.setPORT(port);
	}
		 
	/** 
	 * 设置是否打印日志
	 * @param isLog
	 * @author huangbq
	 * @data 2014-10-8 下午6:25:01 
	 */
	  	
	public static void setDebugMode(boolean debug) {
		Constants.setLog(debug);
	}	
	 
	/** 
	 * 获取UPush服务当前与服务器 的连接状态
	 * @return isConnected 连接状态
	 * @author huangbq
	 * @data 2014-12-8 上午9:49:45 
	 */
	  	
	public static boolean isConnected () {
		return isConnected;
	}
	
	 
	/** 
	 * 设置连接状态
	 * @param connected 连接状态
	 * @author huangbq
	 * @data 2014-12-8 下午5:08:43 
	 */
	  	
	public static void setConnected(boolean connected) {
		isConnected = connected;
	}
	
	/** 
	 * 获取信息处理器
	 * @return mmi
	 * @author huangbq
	 * @data 2014-10-21 下午9:02:48 
	 */
	  	
	public static InformationManager getInformationManager() {
		return mmi;
	}
	 
	/** 
	 * 设置信息处理器
	 * @param mmi
	 * @author huangbq
	 * @data 2014-10-21 下午9:03:08 
	 */
	  	
	public static void setInformationManager(InformationManager mmi) {
		PushServiceManager.mmi = mmi;
	}
		 
	/** 
	 * 用户自定义通知的响应类
	 * @param object 通知响应类
	 * @author huangbq
	 * @data 2014-12-8 上午9:52:13 
	 */
	  	
	public static void setNotificationActivity(Class<?> object){
		
		try {
			if (null == object) {
				className = ShowNotification.class.getName();
				activityClass = ShowNotification.class;
			} else if (object.newInstance() instanceof Activity) {
				className = object.getName();
				activityClass = object;
			} else {
				if(Constants.isLog()) {
					Log.d(TAG, "不是一个Activity组件无法提供通知推送服务");
				}		
			}
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			Log.d(TAG, e.getMessage());
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			Log.d(TAG, e.getMessage());
		}
	}
	
	/**
	 * @see 注册服务在线监听接收器
	 * @method registerServiceOnlineReceiver
	 * @date 2014-9-24 上午11:16:51
	 */
	public static void registerServiceOnlineReceiver(Service service) {
		receiver = service;
		serviceOnlineReceiver = new ServiceOnlineReceiver(service);
		IntentFilter filter = new IntentFilter();
		// 接收推送服务在线广播
		filter.addAction(Constants.getActionPushServiceOnline());
		// 接收通知、消息广播
		filter.addAction(packageName+Constants.getNotificationAndMessage());
		// 接收LBS撤销反馈广播
		filter.addAction(Constants.getActionLbsRevoke()+Constants.getApp_id());
		// 接收UPush服务连接状态广播
		filter.addAction(packageName+"."+Constants.getActionConnectState());
		filter.addAction(Constants.getActionConnectState());
		filter.addAction(packageName+"."+Constants.getActionNotifyDelete());
		service.registerReceiver(serviceOnlineReceiver, filter);
		if(Constants.isLog()) {
			Log.d(TAG, "注册服务在线监听接收器");
		}		
		// 开启心跳检测
		serviceOnlineReceiver.pushServiceTimeoutHandle();	
		
	}
	
	/**
	 * 注销服务在线监听接收器
	 * @method unregisterServiceOnlineReceiver
	 * @param service
	 * @date 2014-9-24 下午11:26:14
	 */
	public static void unregisterServiceOnlineReceiver(Service service) {
		if (null != serviceOnlineReceiver) {
			service.unregisterReceiver(serviceOnlineReceiver);
			serviceOnlineReceiver = null;
		}
		
	}
	 	 	
	/** 
	 * 获取服务对象
	 * @param type 服务类型  （ServiceType中定义的类型）
	 * @return instance
	 * @author huangbq
	 * @data 2014-12-5 下午5:01:06 
	 */
	  	
	public static Object getService(ServiceType type) {		
		Object instance = null;		
		switch (type) {
		case TAG_MANAGER:
			instance = tagManagerImpl;
			break;
		case LBS_MANAGER:
			instance = lbsManagerImpl;
			break;
		}
		return instance;
	}
	
	/** 
	 * 获取服务在线广播监听器
	 * @return serviceOnlineReceiver
	 * @author huangbq
	 * @data 2014-10-24 上午10:23:28 
	 */
	  	
	public static ServiceOnlineReceiver getServiceOnlineReceiver() {
		return serviceOnlineReceiver;
	}
	
	 
	/** 
	 * 获取应用读写共享sharedpreferences
	 * @return sharedPref （sharedpreferences对象）
	 * @author huangbq
	 * @data 2014-12-9 上午11:15:57 
	 */
	  	
	public static SharedPreferences getSharedPreferences() {
		return PushServiceManager.sharedPref;
	}
	/**
	 * @see 判断服务是否存在
	 * @method isServiceRunning
	 * @param mContext
	 * @param className
	 * @return boolean
	 * @date 2014-9-23 下午5:12:17
	 */
	private static boolean isServiceRunning(Context mContext, String className) {
        boolean IsRunning = false;
        if(Constants.isLog()) {
        	Log.d(TAG, "className:" + className);
        }        
        ActivityManager activityManager = (ActivityManager)
        		mContext.getSystemService(Context.ACTIVITY_SERVICE);
        List<ActivityManager.RunningServiceInfo> serviceList = 
        		activityManager.getRunningServices(Integer.MAX_VALUE);
        if(!(serviceList.size()>0)) {
         return false;
        }
        for(int i = 0; i < serviceList.size(); i++) {
        	 if(Constants.isLog()) {
        		 Log.d(TAG, "isServiceRunning:" + 
        	 serviceList.get(i).service.getClassName());
             }
            if(serviceList.get(i).service.getClassName().equals(className) == true) {
                IsRunning = true;
                break;
            }
        }
        return IsRunning;
    }
	
	/** 
	 * 自定义通知设置
	 * @package com.yonyou.pushclient
	 * @author huangbq
	 * @date 2015-6-2 下午4:55:38 
	 */ 
	  	
	public static class SetNotification {

		 
		/** 
		 * 设置 Notification_ticker
		 * @param ticker (null 表示使用默认设置(push控制台上的通知title))
		 * @author huangbq
		 * @data 2015-6-2 下午4:55:33 
		 */
		  	
		public static void setTicker(String ticker) {
			Constants.Notificatin.setTicker(ticker);
		}
		
		 
		/** 
		 * 获取当前Notification_ticker设置
		 * @return ticker (null 表示采用默认设置(push控制台上的通知title))
		 * @author huangbq
		 * @data 2015-6-2 下午4:59:08 
		 */
		  	
		public static String getTicker() {
			return Constants.Notificatin.getTicker();
		}
		
		 
		/** 
		 * 设置 Notification_contentTitle
		 * @param contentTitle (null 采用默认设置（applabel）)
		 * @author huangbq
		 * @data 2015-6-2 下午5:01:11 
		 */
		  	
		public static void setContentTitle (String contentTitle) {
			Constants.Notificatin.setContentTitle(contentTitle);
		}
		
		 
		/** 
		 * 获取 Notification_contentTitle设置
		 * @return contentTitle (null 采用默认设置（applabel）)
		 * @author huangbq
		 * @data 2015-6-2 下午5:04:21 
		 */
		  	
		public static String getContentTitle () {
			return Constants.Notificatin.getContentTitle();
		}
		
		 
		/** 
		 * 设置Notification_contentText
		 * @param contentText (null 采用默认设置(push控制台通知body))
		 * @author huangbq
		 * @data 2015-6-2 下午5:06:29 
		 */
		  	
		public static void setContentText(String contentText) {
			Constants.Notificatin.setContentText(contentText);
		}
		
		 
		/** 
		 * 获取Notification_contentText设置
		 * @return contentText (null 采用默认设置(push控制台通知body))
		 * @author huangbq
		 * @data 2015-6-2 下午5:07:18 
		 */
		  	
		public static String getContentText() {
			return Constants.Notificatin.getContentText();
		}
		
	}
	
	 
	/** 
	 * 获取设备device_id
	 * @return device_id
	 * @author huangbq
	 * @data 2015-6-4 下午2:24:12 
	 */
	  	
	public static String getDeviceId() {
		String device_id = null;
		TelephonyManager telephonyManager = null;
		if (null != context) {
			telephonyManager = (TelephonyManager)context.getSystemService(Context.TELEPHONY_SERVICE);
		}
		if (null != telephonyManager) {
			device_id = telephonyManager.getDeviceId();
		}
		if (Build.VERSION.SDK_INT > 8) {
			device_id = Build.SERIAL + device_id;
		}
        // 如果在模拟器中运行初始化deviceId
		if (device_id == null || device_id.trim().length() == 0 ) {
//			deviceId = "EMU"+String.valueOf(System.currentTimeMillis());
			device_id = "EMU";
		}
		if (Constants.isLog()) {
			Log.d(TAG, "DEVICE_ID: "+device_id);
		}
		return device_id;
	}
}
