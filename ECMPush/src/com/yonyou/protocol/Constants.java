package com.yonyou.protocol;

/**
 * @see 常量集
 * @file Constants.java
 * @package com.huang.pushclient
 * @project PushClient
 * @author huangbq
 * @date 2014-9-25 下午2:24:32
 */
public class Constants {
	
	// 系统常量	
	/** 应用程序标识 app_id */
	private static int app_id = 0;
	/** 所在设备device_id*/
	private static String device_id = "";
	/**是否打印日志信息 */	  	
	private static boolean isLog = false;
	/** 连接是否是意外断开*/
	private static boolean connect = true;
	/** 是否使用LBS服务*/
	private static boolean lbs = false;
	/** 拒绝接收通知推送*/
	private static boolean denyNotify = false;
	/** 数据读写sharedpreferences 标识*/
	private static final String SHARED_PREFERENCE_NAME = "sharedpreference_name";
	
	
	
	// Mina 客户端常量
	/** 推送服务端端口号 */
	private static  int PORT = 5000;
	/** 推送服务IP */
	private static  String IP = "push.yyuap.com";
	
	// 广播Action常量
	/** app在线广播 */
	private static final String ACTION_APP_ONLINE = "com.yonyou.registerService";
	/** 推送服务在线广播*/
	private static final String ACTION_PUSH_SERVICE_ONLINE ="com.yonyou.ServiceOnline";
	/** 推送消息体的广播常量字段*/
	private static final String  NOTIFICATION_AND_MESSAGE = ".notifyAndMsg";
	/** 位置信息广播*/
	private static final String ACTION_LBS = "com.yonyou.upush.LBS";
	/** LBS撤销反馈广播*/
	private static final String ACTION_LBS_REVOKE = "lbs_revoke";
	/** TAG设置广播*/
	private static final String ACTION_TAG_SET = "tag_set";
	/** 连接状态广播*/
	private static final String ACTION_CONNECT_STATE = "connect_state";
	/** 通知反馈广播*/
	private static final String ACTION_NOTIFY_BACK = "notify_back";
	/** 通知删除广播*/
	private static final String ACTION_NOTIFY_DELETE = "notify_delete";
	
	
	// Intent putExtra(K,V) -- Key
	/** 推送服务在线广播——Key */
	private static final String EXTRA_KEY_PUSH_SERVICE_ONLINE = "ser_package_String";
	/** app在线广播——Key */
	private static final String EXTRA_KEY_APP_ONLINE = "app_online_AppInfo";
	/** 发送通知、消息体广播——Key */
	private static final String EXTRA_KEY_NOTIFY_AND_MSG = "noti_msg";
	/** 位置信息LBS关闭 ——Key */
	private static final String EXTRA_KEY_LBS = "lbs_key";
	/** TAG设置广播——Key*/
	private static final String EXTRA_KEY_TAG_SET = "tag_set_key";
	/** 连接状态广播——Key*/
	private static final String EXTRA_KEY_CONNECT_STATE = "connect_state_key";
	/** 通知反馈广播——Key*/
	private static final String EXTRA_KEY_NOTIFY_BACK = "notify_back_key";
	/** 通知删除广播——Key  (msg_id) */
	private static final String EXTRA_KEY_NOTIFY_DELETE = "msg_id";
	
	// Push Service Constant
	/** 推送服务对应action*/
	private static  String SERVICE_ACTION = "com.yonyou.pushclient.NOTIFICATION_PUSH_SERVICE";
	/** 推送服务对应服务名*/
	private static final String SERVICE_NAME = "com.yonyou.pushclient.NotificationPushService";

	// 常量设置
	/** 地理位置信息默认取值间隔3分钟*/
	private static final long lbs_time = 3000;
	/** 地理位置默认重取值位置间隔5000米*/
	private static final float lbs_distance = 8;
	
	// 通知设置
	public static class Notificatin {
		/** 通知标题*/
		public final static String NOTIFICATION_TITLE = "notification_title";
		/** 通知内容*/
		public final static String NOTIFICATION_CONTENT = "notification_content";
		/** app Name*/
		public final static String APP_LABEL = "app_label";
		/** notification ticker */
		private static String ticker = null;
		/** notification content_title */
		private static String contentTitle = null;
		/** notification content_text */
		private static String contentText = null;
		public static String getTicker() {
			return ticker;
		}
		public static void setTicker(String ticker) {
			Notificatin.ticker = ticker;
		}
		public static String getContentTitle() {
			return contentTitle;
		}
		public static void setContentTitle(String contentTitle) {
			Notificatin.contentTitle = contentTitle;
		}
		public static String getContentText() {
			return contentText;
		}
		public static void setContentText(String contentText) {
			Notificatin.contentText = contentText;
		}
		
	}
	
	 
	/** 
	 * 获取当前应用程序app_id
	 * @return app_id
	 * @author huangbq
	 * @data 2014-10-23 上午11:28:04 
	 */
	  	
	public static int getApp_id() {
		return app_id;
	}

	 
	/** 
	 * 设置当前应用程序app_id
	 * @param app_id
	 * @author huangbq
	 * @data 2014-10-23 上午11:28:34 
	 */
	  	
	public static void setApp_id(int app_id) {
		Constants.app_id = app_id;
	}

	/**
	 * @see App在线广播-Action
	 * @method getActionAppOnline
	 * @return ACTION_APP_ONLINE
	 * @date 2014-9-25 下午2:58:53
	 */
	public static String getActionAppOnline() {
		return ACTION_APP_ONLINE;
	}

	/**
	 * @see 推送服务在线广播-Action
	 * @method getActionPushServiceOnline
	 * @return ACTION_PUSH_SERVICE_ONLINE
	 * @date 2014-9-25 下午2:59:38
	 */
	public static String getActionPushServiceOnline() {
		return ACTION_PUSH_SERVICE_ONLINE;
	}

	/**
	 * @see 推送服务在线广播Extra-Key
	 * @method getExtraKeyPushServiceOnline
	 * @return EXTRA_KEY_PUSH_SERVICE_ONLINE
	 * @date 2014-9-25 下午2:59:59
	 */
	public static String getExtraKeyPushServiceOnline() {
		return EXTRA_KEY_PUSH_SERVICE_ONLINE;
	}

	/**
	 * @see app在线广播Extra-Key
	 * @method getExtraKeyAppOnline
	 * @return EXTRA_KEY_APP_ONLINE
	 * @date 2014-9-25 下午3:00:28
	 */
	public static String getExtraKeyAppOnline() {
		return EXTRA_KEY_APP_ONLINE;
	}
 
	/** 
	 * 获取推送服务对应的action
	 * @return SERVICE_ACTION
	 * @author huangbq
	 * @data 2014-9-27 下午9:40:23 
	 */
	  	
	public static String getServiceAction() {
		return SERVICE_ACTION;
	}
	
	public static void setSERVICE_ACTION(String sERVICE_ACTION) {
		SERVICE_ACTION = sERVICE_ACTION;
	}

	

	public static String getActionNotifyDelete() {
		return ACTION_NOTIFY_DELETE;
	}

	

	public static String getExtraKeyNotifyDelete() {
		return EXTRA_KEY_NOTIFY_DELETE;
	}


	/** 
	 * 获取推送服务服务名
	 * @return SERVICE_NAME
	 * @author huangbq
	 * @data 2014-9-27 下午9:36:22 
	 */
	  	
	public static String getServiceName() {
		return SERVICE_NAME;
	}

	 
	/** 
	 * 获取连接端口号
	 * @return port
	 * @author huangbq
	 * @data 2014-10-8 下午6:20:33 
	 */
	  	
	public static int getPORT() {
		return PORT;
	}

	 
	/** 
	 * 设置连接端口号
	 * @param pORT
	 * @author huangbq
	 * @data 2014-10-8 下午6:21:00 
	 */
	  	
	public static void setPORT(int pORT) {
		PORT = pORT;
	}

	 
	/** 
	 * 获取连接IP地址
	 * @return ip
	 * @author huangbq
	 * @data 2014-10-8 下午6:21:11 
	 */
	  	
	public static String getIP() {
		return IP;
	}

	 
	/** 
	 * 设置连接IP地址
	 * @param iP
	 * @author huangbq
	 * @data 2014-10-8 下午6:21:27 
	 */
	  	
	public static void setIP(String iP) {
		IP = iP;
	}

	 
	/** 
	 * 判断是否打印日志
	 * @return isLog
	 * @author huangbq
	 * @data 2014-10-8 下午6:22:52 
	 */
	  	
	public static boolean isLog() {
		return isLog;
	}

	 
	/** 
	 * 设置是否打印日志
	 * @param isLog
	 * @author huangbq
	 * @data 2014-10-8 下午6:23:15 
	 */
	  	
	public static void setLog(boolean isLog) {
		Constants.isLog = isLog;
	}

	 
	/** 
	 * 判断当前是否期望连接
	 * @return connect
	 * @author huangbq
	 * @data 2014-10-21 下午8:08:32 
	 */
	  	
	public static boolean isConnect() {
		return connect;
	}

	 
	/** 
	 * 设置期望连接状态
	 * @param connect
	 * @author huangbq
	 * @data 2014-10-21 下午8:09:05 
	 */
	  	
	public static void setConnect(boolean connect) {
		Constants.connect = connect;
	}

	 
	/** 
	 * 获取推送消息体的广播常量字段
	 * @return NOTIFICATION_AND_MESSAGE
	 * @author huangbq
	 * @data 2014-10-14 下午10:18:11 
	 */
	  	
	public static String getNotificationAndMessage() {
		return NOTIFICATION_AND_MESSAGE;
	}

	 
	/** 
	 * 发送通知、消息体广播——Key 
	 * @return  EXTRA_KEY_NOTIFY_AND_MSG
	 * @author huangbq
	 * @data 2014-10-14 下午10:28:05 
	 */
	  	
	public static String getExtraKeyNotifyAndMsg() {
		return EXTRA_KEY_NOTIFY_AND_MSG;
	}


	 
	/** 
	 * 位置信息广播
	 * @return ACTION_LBS
	 * @author huangbq
	 * @data 2014-11-25 下午4:21:39 
	 */
	  	
	public static String getActionLbs() {
		return ACTION_LBS;
	}


	 
	/** 
	 * 位置信息LBS关闭 ——Key 
	 * @return EXTRA_KEY_LBS
	 * @author huangbq
	 * @data 2014-11-25 下午4:21:53 
	 */
	  	
	public static String getExtraKeyLbs() {
		return EXTRA_KEY_LBS;
	}


	 
	/** 
	 * 获取LBS撤销反馈广播——ACTION
	 * @return ACTION_LBS_REVOKE
	 * @author huangbq
	 * @data 2014-11-27 下午4:59:44 
	 */
	  	
	public static String getActionLbsRevoke() {
		return ACTION_LBS_REVOKE;
	}


	 
	/** 
	 * 获取系统默认LBS重定位时间间隔
	 * @return lbs_time 默认时间间隔
	 * @author huangbq
	 * @data 2014-12-3 下午1:18:07 
	 */
	  	
	public static long getLbsTime() {
		return lbs_time;
	}


	 
	/** 
	 * 获取系统默认LBS重定位地理位置间隔
	 * @return lbs_distance默认地理位置间隔
	 * @author huangbq
	 * @data 2014-12-3 下午1:18:50 
	 */
	  	
	public static float getLbsDistance() {
		return lbs_distance;
	}


	 
	/** 
	 * 获取TAG设置广播——Action
	 * @return ACTION_TAG_SET
	 * @author huangbq
	 * @data 2014-12-4 下午3:03:19 
	 */
	  	
	public static String getActionTagSet() {
		return ACTION_TAG_SET;
	}


	 
	/** 
	 * 获取TAG广播——Key
	 * @return EXTRA_KEY_TAG_SET
	 * @author huangbq
	 * @data 2014-12-4 下午3:03:52 
	 */
	  	
	public static String getExtraKeyTagSet() {
		return EXTRA_KEY_TAG_SET;
	}


	 
	/** 
	 * 判断是否使用LBS服务
	 * @return lbs
	 * @author huangbq
	 * @data 2014-12-5 下午8:10:43 
	 */
	  	
	public static boolean isLbs() {
		return lbs;
	}


	 
	/** 
	 * 设置是否使用LBS服务
	 * @param lbs
	 * @author huangbq
	 * @data 2014-12-5 下午8:11:15 
	 */
	  	
	public static void setLbs(boolean lbs) {
		Constants.lbs = lbs;
	}


	 
	 
	/** 
	 * 判断是否接收通知
	 * @return boolean
	 * @author huangbq
	 * @data 2015-6-1 下午4:05:38 
	 */
	  	
	public static boolean isDenyNotify() {
		return denyNotify;
	}


	 
	/** 
	 * 设置是否拒绝接收通知
	 * @param denyNotify
	 * @author huangbq
	 * @data 2015-6-1 下午4:05:19 
	 */
	  	
	public static void setDenyNotify(boolean denyNotify) {
		Constants.denyNotify = denyNotify;
	}


	/** 
	 * 获取连接状态广播
	 * @return ACTION_CONNECT_STATE
	 * @author huangbq
	 * @data 2014-12-8 下午5:00:35 
	 */
	  	
	public static String getActionConnectState() {
		return ACTION_CONNECT_STATE;
	}


	 
	/** 
	 * 获取连接状态广播体——Key
	 * @return EXTRA_KEY_CONNECT_STATE
	 * @author huangbq
	 * @data 2014-12-8 下午5:01:07 
	 */
	  	
	public static String getExtraKeyConnectState() {
		return EXTRA_KEY_CONNECT_STATE;
	}


	 
	/** 
	 * 获取数据读写sharedpreferences 标识
	 * @return SHARED_PREFERENCE_NAME
	 * @author huangbq
	 * @data 2014-12-9 上午11:12:01 
	 */
	  	
	public static String getSharedPreferenceName() {
		return SHARED_PREFERENCE_NAME;
	}


	 
	/** 
	 * 获取设备id
	 * @return device_id
	 * @author huangbq
	 * @data 2014-12-10 下午4:47:11 
	 */
	  	
	public static String getDevice_id() {
		return device_id;
	}


	 
	/** 
	 * 设置设备id
	 * @param device_id
	 * @author huangbq
	 * @data 2014-12-10 下午4:47:33 
	 */
	  	
	public static void setDevice_id(String device_id) {
		Constants.device_id = device_id;
	}


	 
	/** 
	 * 获取通知反馈广播
	 * @return ACTION_NOTIFY_BACK
	 * @author huangbq
	 * @data 2014-12-22 下午8:01:32 
	 */
	  	
	public static String getActionNotifyBack() {
		return ACTION_NOTIFY_BACK;
	}


	 
	/** 
	 * 获取通知反馈广播——Key
	 * @return EXTRA_KEY_NOTIFY_BACK
	 * @author huangbq
	 * @data 2014-12-22 下午8:01:53 
	 */
	  	
	public static String getExtraKeyNotifyBack() {
		return EXTRA_KEY_NOTIFY_BACK;
	}

	
	
}
