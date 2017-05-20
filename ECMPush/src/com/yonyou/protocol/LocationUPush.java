
/**   
 * @Title: LocationUPush.java 
 * @Package: com.yonyou.protocol 
 * @Description: TODO
 * @author Administrator  
 * @date 2014-11-24 下午3:06:00 
 * @version 1.3.1 
 */


package com.yonyou.protocol;

import java.io.Serializable;

/** 
 *
 * @package com.yonyou.protocol
 * @author huangbq
 * @date 2014-11-24 下午3:06:00 
 */

public class LocationUPush extends Message implements Serializable {
		
	/** @Fields serialVersionUID: */
	  	
	private static final long serialVersionUID = 1L;
	/** 是否使用LBS推送服务*/
	private boolean lbs = false;
	/** 应用的唯一app_id标识*/
	private int app_id = 0;
	/** 设备Id*/
	private String device_id="";
//	private float accuracy = 0;
	/** 纬度*/
	private double latitude = 0;
	/** 经度*/
	private double longitude = 0;
//	/** 高度*/
//	private double altitude = 0;
//	/** 方向*/
//	private float bear = 0;
	
	 public LocationUPush () {
		 msgType = MsgType.LBS_MSG;
	 }
	 
	/** 
	 * 是否使用LBS推送
	 * @return lbs
	 * @author huangbq
	 * @data 2014-11-25 下午2:28:30 
	 */
	  	
	public boolean isLbs() {
		return lbs;
	}

	 
	/** 
	 * 是否使用LBS推送
	 * @param lb
	 * @author huangbq
	 * @data 2014-11-25 下午2:29:04 
	 */
	  	
	public void setLbs(boolean lb) {
		lbs = lb;
	}

	 
	/** 
	 * 获取app_id
	 * @return app_id
	 * @author huangbq
	 * @data 2014-11-25 下午2:29:23 
	 */
	  	
	public int getApp_id() {
		return app_id;
	}

	 
	/** 
	 * 设置app_id
	 * @param app_id
	 * @author huangbq
	 * @data 2014-11-25 下午2:29:49 
	 */
	  	
	public void setApp_id(int app_id) {
		this.app_id = app_id;
	}	
	 
	/** 
	 * 获取信息精度
	 * @return accuracy
	 * @author huangbq
	 * @data 2014-11-24 下午3:14:00 
	 */
	  	
//	public float getAccuracy() {
//		return accuracy;
//	}
	 
	/** 
	 * 设置信息精度
	 * @param accuracy
	 * @author huangbq
	 * @data 2014-11-24 下午3:14:26 
	 */
	  	
//	public void setAccuracy(float accuracy) {
//		this.accuracy = accuracy;
//	}
	 
	 
	/** 
	 * 获取设备ID
	 * @return device_id
	 * @author huangbq
	 * @data 2014-12-31 上午11:00:25 
	 */
	  	
	public String getDevice_id() {
		return device_id;
	}

	 
	/** 
	 * 设置设备Id
	 * @param device_id
	 * @author huangbq
	 * @data 2014-12-31 上午11:04:06 
	 */
	  	
	public void setDevice_id(String device_id) {
		this.device_id = device_id;
	}

	/** 
	 * 获取纬度
	 * @return latitude
	 * @author huangbq
	 * @data 2014-11-24 下午3:14:50 
	 */
	  	
	public double getLatitude() {
		return latitude;
	}


	/** 
	 * 设置纬度
	 * @param latitude
	 * @author huangbq
	 * @data 2014-11-24 下午3:15:22 
	 */
	  	
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	 
	/** 
	 * 获取经度
	 * @return longitude
	 * @author huangbq
	 * @data 2014-11-24 下午3:15:33 
	 */
	  	
	public double getLongitude() {
		return longitude;
	}
	 
	/** 
	 * 设置经度
	 * @param longitude
	 * @author huangbq
	 * @data 2014-11-24 下午3:15:50 
	 */
	  	
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	 
	/** 
	 * 获取海拔高度
	 * @return altitude
	 * @author huangbq
	 * @data 2014-11-24 下午3:16:00 
	 */
	  	
//	public double getAltitude() {
//		return altitude;
//	}
//	 
	/** 
	 * 设置海拔高度
	 * @param altitude
	 * @author huangbq
	 * @data 2014-11-24 下午3:16:19 
	 */
	  	
//	public void setAltitude(double altitude) {
//		this.altitude = altitude;
//	}
	 
	/** 
	 * 获取方向
	 * @return bear
	 * @author huangbq
	 * @data 2014-11-24 下午3:16:34 
	 */
	  	
//	public float getBear() {
//		return bear;
//	}
	 
	/** 
	 * 设置方向
	 * @param bear
	 * @author huangbq
	 * @data 2014-11-24 下午3:16:50 
	 */
	  	
//	public void setBear(float bear) {
//		this.bear = bear;
//	}
	
	public boolean isEqual(LocationUPush locationUPush) {
		if (this.lbs == locationUPush.isLbs() && 
				this.latitude == locationUPush.getLatitude() && 
				this.longitude == locationUPush.getLongitude()) {
			return true;
		} else {
			return false;
		}
	}
	
	public void toStrin() {
		System.out.println("LocationUPush对象：" + "\n"
				+ "msgType:   " + this.getMsgType() + "\n"
				+ "lbs:       " + this.isLbs() + "\n"
				+ "app_id:    " + this.getApp_id() + "\n"
				+ "latitude:  " + this.getLatitude() + "\n"
				+ "longitude: " + this.getLongitude() + "\n"
				+ "device_id: " + this.getDevice_id() + "\n");
	}
	
	 
	/** 
	 * 设置消息（数据）类型
	 * @author huangbq
	 * @data 2014-11-28 下午2:13:59 
	 */
	  	
	public void setMsgType() {
		this.msgType = MsgType.LBS_MSG;
	}
	
}
