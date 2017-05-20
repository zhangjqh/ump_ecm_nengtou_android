
/**   
 * @Title: LBSManagerImpl.java 
 * @Package: com.yonyou.upush.impl 
 * @Description: TODO
 * @author Administrator  
 * @date 2014-12-5 下午7:56:12 
 * @version 1.3.1 
 */


package com.yonyou.upush.impl;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;

import android.os.Bundle;
import android.util.Log;

import com.yonyou.protocol.Constants;
import com.yonyou.protocol.LocationUPush;
import com.yonyou.protocol.LogUtil;
import com.yonyou.pushclient.PushServiceManager;
import com.yonyou.upush.interf.LBSManager;

/** 
 *
 * @package com.yonyou.upush.impl
 * @author huangbq
 * @date 2014-12-5 下午7:56:12 
 */

public class LBSManagerImpl implements LBSManager {
	
	/** 日志信息*/
	private final static String TAG = LogUtil.makeLogTAG(LBSManagerImpl.class);
	/** 当前位置信息*/
	private LocationUPush locationUPush;
	/** 位置信息管理器*/
	private LocationManager locationManager;
	/** 位置监听器*/
	private LocatListener locatListener;
	/** Context 对象*/
	private Context context;
	/** 是否收到关闭LBS服务反馈*/
	public static boolean closeLBS = false;
	/** 应用读写共享sharedpreferences*/
	private static SharedPreferences sharedPref = null;
	/** LBS 状态存储标识*/
	public final static String LBS_STATE = "LBS_state";
	/** LBS 信息来源*/
	public final static String LBS_PROVIDER = "LBS_provider";

	
	public LBSManagerImpl (Context context, LocationManager locationManager) {
		this.context = context;
		this.locationManager = locationManager;
		this.locatListener = new LocatListener();
		locationUPush = new LocationUPush();
		sharedPref = PushServiceManager.getSharedPreferences();
		init();
	}

	/**
	 * Description  
	 * @see com.yonyou.upush.interf.LBSManager#openLBSPush() 
	 */

	@Override
	public void openLBSPush() {		
		openLBSPush(Constants.getLbsTime(), Constants.getLbsDistance());		
	}

	/**
	 * Description 
	 * @param minTime
	 * @param minDistance 
	 * @see com.yonyou.upush.interf.LBSManager#openLBSPush(long, float) 
	 */

	@Override
	public void openLBSPush(long minTime, float minDistance) {
		if (Constants.isLbs()) {
			// 已经开启过，不知以何种方式开启的，所以需要重新开启
			locationManager.removeUpdates(locatListener);
		} else {
			Constants.setLbs(true);
			Editor editor = sharedPref.edit();
			editor.putBoolean(LBS_STATE, true);
			editor.commit();
		}
		// 获取位置信息并设置监听器
		Location location = null;
		// 由NETWORK获取位置信息
		if (locationManager.isProviderEnabled(LocationManager.NETWORK_PROVIDER)) {
			
			locationManager.requestLocationUpdates(LocationManager.NETWORK_PROVIDER, 
					minTime, minDistance, locatListener);
			
			location = locationManager.getLastKnownLocation(LocationManager.NETWORK_PROVIDER);
			if (null != location) {
				Editor editor = sharedPref.edit();
				editor.putString(LBS_PROVIDER, "NETWORK");
				editor.commit();	
			}			
		} 
		// 由GPS获取位置信息
		if (null == location && locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER) ){			
			locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 
					minTime, minDistance, locatListener);
			
			location = locationManager.getLastKnownLocation(LocationManager.GPS_PROVIDER);	
			if (null != location) {
				Editor editor = sharedPref.edit();
				editor.putString(LBS_PROVIDER, "GPS");
				editor.commit();
			}			
		}
		// 由WIFI获取位置信息
//		if (null == location) {
//	
//		}
		if (null != location) {
			// 发送当前地理位置
			sendLocationUPush(location.getLatitude(), location.getLongitude());
		} else {
			// 获取地理位置信息失败
			if (Constants.isLog()) {
				Log.d(TAG, "获取地理位置信息失败： location = null");
			}
		}
	}

	/**
	 * Description 
	 * @param latitude
	 * @param longitude 
	 * @see com.yonyou.upush.interf.LBSManager#sendLocation(double, double) 
	 */

	@Override
	public void sendLocation(double latitude, double longitude) {
		if (!Constants.isLbs()) {
			Constants.setLbs(true);
			Editor editor = sharedPref.edit();
			editor.putBoolean(LBS_STATE, true);
			editor.commit();
		}		
		sendLocationUPush(latitude, longitude);
	}

	/**
	 * Description  
	 * @see com.yonyou.upush.interf.LBSManager#closeLBSPush() 
	 */

	@Override
	public void closeLBSPush() {
		Constants.setLbs(false);
		Editor editor = sharedPref.edit();
		editor.putBoolean(LBS_STATE, false);
		editor.commit();
		if (null != locatListener && null != locationManager) {
			locationManager.removeUpdates(locatListener);
		}
		LBSCancel();
	}

	/**
	 * Description 
	 * @return 
	 * @see com.yonyou.upush.interf.LBSManager#getLocationUPush() 
	 */

	@Override
	public LocationUPush getLocationUPush() {
		return locationUPush;
	}

	/**
	 * Description 
	 * @return 
	 * @see com.yonyou.upush.interf.LBSManager#isLBS() 
	 */

	@Override
	public boolean isLBS() {
		return Constants.isLbs();
	}
		 
	/** 
	 * 发送位置信息
	 * @param location
	 * @author huangbq
	 * @data 2014-12-5 下午8:24:39 
	 */
	  	
	private void sendLocationUPush(double latitude, double longitude) {
		// 初始化LocationUPush对象
		locationUPush.setLbs(true);
		locationUPush.setApp_id(Constants.getApp_id());
		locationUPush.setLatitude(latitude);
		locationUPush.setLongitude(longitude);
		// 发送LocationUPush位置信息
		Intent intent = new Intent(Constants.getActionLbs());
		intent.putExtra(Constants.getExtraKeyLbs(), locationUPush);
		context.sendBroadcast(intent);
		System.out.println("发送LBS广播：");
		locationUPush.toStrin();
	}

	/** 
	 * 发送撤销LBS服务信息
	 * @author huangbq
	 * @data 2014-12-5 下午9:09:13 
	 */
	  	
	private void sendLocationUPush() {
		// 撤销LBS服务
		locationUPush.setLbs(false);
		locationUPush.setApp_id(Constants.getApp_id());
		locationUPush.setLatitude(0);
		locationUPush.setLongitude(0);
		Intent intent = new Intent(Constants.getActionLbs());
		intent.putExtra(Constants.getExtraKeyLbs(), locationUPush);
		context.sendBroadcast(intent);
		System.out.println("发送LBS广播");
		locationUPush.toStrin();
	}
	
	 
	/** 
	 * 撤销LBS服务
	 * @author huangbq
	 * @data 2014-12-5 下午9:13:14 
	 */
	  	
	public void LBSCancel() {
		Thread LBScancel = new Thread(new Runnable() {			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				while (!LBSManagerImpl.closeLBS) {
					sendLocationUPush();
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				LBSManagerImpl.closeLBS = false;
			}
		});
		LBScancel.start();
	}
	
	 
	/** 
	 * 模块清理
	 * @author huangbq
	 * @data 2014-12-5 下午9:20:36 
	 */
	  	
	public void clearup() {
		this.context = null;
		this.locationManager = null;
		this.locatListener = null;
		locationUPush = null;
	}
	/** 
	 * 位置变化监听器
	 * @package com.yonyou.upush.impl
	 * @author huangbq
	 * @date 2014-11-24 下午4:53:43 
	 */ 
	  	
	private class LocatListener implements LocationListener {

		/**
		 * Description 
		 * @param location 
		 * @see android.location.LocationListener#onLocationChanged(android.location.Location) 
		 */ 
			
		@Override
		public void onLocationChanged(Location location) {
			// 当位置信息发生变化时，更新位置信息
			sendLocationUPush(location.getLatitude(), location.getLongitude());
			System.out.println("*****************LocationChanged*******************");
			
		}

		/**
		 * Description 
		 * @param provider 
		 * @see android.location.LocationListener#onProviderDisabled(java.lang.String) 
		 */ 
			
		@Override
		public void onProviderDisabled(String provider) {
			// TODO Auto-generated method stub			
		}

		/**
		 * Description 
		 * @param provider 
		 * @see android.location.LocationListener#onProviderEnabled(java.lang.String) 
		 */ 
			
		@Override
		public void onProviderEnabled(String provider) {
			// 当locatingProvider可用时
			if (null != provider && null != locationManager) {
				Location location = locationManager.getLastKnownLocation(provider);
				if (null == location) {
					if (Constants.isLog()) {
						Log.d(TAG, "获取地理位置信息失败： location = null");
					}
				} else {
					sendLocationUPush(location.getLatitude(), location.getLongitude());
				}				
			} else {
				if (Constants.isLog()) {
					Log.d(TAG, "获取地理位置信息失败： location = null");
				}
			}
			System.out.println("***************************Provider Enabled888888888888888888888");			
		}

		/**
		 * Description 
		 * @param provider
		 * @param status
		 * @param extras 
		 * @see android.location.LocationListener#onStatusChanged(java.lang.String, int, android.os.Bundle) 
		 */ 
			
		@Override
		public void onStatusChanged(String provider, int status, Bundle extras) {
			// TODO Auto-generated method stub		
		}
	
	}
	
	 
	/** 
	 * 初始化操作 ： 读取并设置LBS状态、
	 * @author huangbq
	 * @data 2014-12-9 上午11:34:07 
	 */
	  	
	private void init() {
		Constants.setLbs(sharedPref.getBoolean("LBS_state", false));
	}

}
