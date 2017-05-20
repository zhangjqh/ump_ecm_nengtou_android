package com.yonyou.pushclient;

import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.yonyou.mina.MinaClient;
import com.yonyou.protocol.AppInfo;
import com.yonyou.protocol.Constants;
import com.yonyou.protocol.LogUtil;


import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build;
import android.os.IBinder;
import android.telephony.TelephonyManager;
import android.util.Log;

/** 
 * 消息推送服务  （SDK核心类）
 * @package com.yonyou.pushclient
 * @author huangbq
 * @date 2014-10-21 下午8:24:05 
 */ 
  	
public class NotificationPushService extends Service {
	
	/* 日志标识*/
	private static final String TAG = LogUtil.
			makeLogTAG(NotificationPushService.class);
	/** 线程处理器*/
	private ExecutorService exec ;
	 /**手机管理器实例引用*/
    private TelephonyManager telephonyManager;
    /** 应用注册服务广播处理器*/
    private AppRegisterReceiver appBroadcastReceiver;
    /** MinaClient对象*/
    private MinaClient minaClient ;
    /** 应用信息列表*/
	public static HashMap<String, AppInfo> packageInfoMap ;	
    /** 设备ID号*/
    public static String deviceId;  
    /** 包管理器*/
    private PackageManager pm ;
	
	/**
	 * 构造函数
	 *
	 */
	public NotificationPushService() {	
		appBroadcastReceiver = new AppRegisterReceiver(this);
	    exec = Executors.newSingleThreadExecutor();	 
	    packageInfoMap = new HashMap<String, AppInfo>();  
	}
	
	// 服务绑定
	@Override
	public IBinder onBind(Intent arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	// 服务创建
	@SuppressLint("NewApi") @Override
	public void onCreate() {
		// TODO Auto-generated method stub
		super.onCreate();
		if (Constants.isLog()) {
			Log.d(TAG, "Service is Creating!");
		}
		pm = (PackageManager)this.getPackageManager();
	    // 获取手机管理服务
	    telephonyManager = (TelephonyManager)getSystemService(Context.TELEPHONY_SERVICE);
	    // 获取MinaClient对象
	    minaClient = new MinaClient(this);
	    // 获取当前设备id号
	    if (null != telephonyManager) {
	    	deviceId = telephonyManager.getDeviceId();
	    }	    
	    if (Build.VERSION.SDK_INT > 8) {
	    	deviceId = Build.SERIAL + deviceId;
	    }
		// 判断当前运行环境是否是模拟器
        // 如果在模拟器中运行初始化deviceId
		if (deviceId == null || deviceId.trim().length() == 0 ) {
//			deviceId = "EMU"+String.valueOf(System.currentTimeMillis());
			deviceId = "EMU";
		}
		Constants.setDevice_id(deviceId);
		if (Constants.isLog()) {
			Log.d(TAG, "当前设备Id是： " + Constants.getDevice_id());
		}
		// 注册广播处理器
		registerAppRegisterReceiver();		
		// 执行Mina客户端操作
		exec = Executors.newSingleThreadExecutor();		
		exec.execute(minaClient);		
		
	}

	// 服务撤销
	@Override
	public void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		if(Constants.isLog()) {
			Log.d(TAG, "Service is Destroyed");
		}	
		unregisterAppRegisterReceiver();
		exec.shutdown();
		minaClient.stopConnect();			
	}

	// startService 服务执行
	@SuppressLint("NewApi") @Override
	public int onStartCommand(Intent intent1, int flags, int startId) {
		// TODO Auto-generated method stub
//		return super.onStartCommand(intent1, flags, startId);
		return START_STICKY;
	}
	
	/**
	 * @see 注册广播处理器
	 * @method registerAppRegisterReceiver
	 * @date 2014-9-23 下午8:18:51
	 */
	private void registerAppRegisterReceiver() {
		// 注册app在线,LBS 广播接收器
		IntentFilter intentFilter = new IntentFilter();
		// 接收app在线广播
		intentFilter.addAction(Constants.getActionAppOnline());
		// 接收LBS地理位置广播
		intentFilter.addAction(Constants.getActionLbs());
		// 接收客户端标签Tag广播
		intentFilter.addAction(Constants.getActionTagSet());
		// 接收通知被打开广播
		intentFilter.addAction(Constants.getActionNotifyBack());
		// 接收连接状态广播
		intentFilter.addAction(Constants.getActionConnectState());
		registerReceiver(appBroadcastReceiver, intentFilter);
		if (Constants.isLog()) {
			Log.d(TAG, "注册app在线广播接收器");
		}
		appBroadcastReceiver.startOperatorThread();
		
	}
	
	/**
	 * @see 注销广播处理器
	 * @method unregisterAppRegisterReceiver
	 * @date 2014-9-23 下午8:19:06
	 */
	private void unregisterAppRegisterReceiver() {
		unregisterReceiver(appBroadcastReceiver);
	}
	
	/**
	 * @see 获取minaClient对象实例
	 * @method getMinaClient
	 * @return minaClient
	 * @date 2014-9-21 下午3:04:17
	 */
	public MinaClient getMinaClient() {
		return minaClient;
	}
	
	/** 
	 * 获取应用版本
	 * @param packageName
	 * @return versionName
	 * @author huangbq
	 * @data 2014-11-18 上午9:15:11 
	 */
	  	
	public String getPackageVersion(String packageName) {
		PackageInfo pInfo = null;
		try {
			pInfo = pm.getPackageInfo(packageName, PackageManager.GET_CONFIGURATIONS);
		} catch (NameNotFoundException e) {
			if(Constants.isLog()) {
				Log.d(TAG, "get packageInfo error", e);
			}
		}
		String versionName = null;
		if (null != pInfo) {
			versionName = pInfo.versionName;
		}
		return versionName;
	}
	
	 
	/** 
	 * 设置拒绝接受通知
	 * @param deny (默认值 false)
	 * @author huangbq
	 * @data 2015-6-1 下午4:02:31 
	 */
	  	
	public static void setDenyNotify(boolean deny) {
		Constants.setDenyNotify(deny);
	}
}
