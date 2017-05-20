package com.yonyou.protocol;

/** 
 * App登录包
 * @package com.yonyou.pushclient
 * @author huangbq
 * @date 2014-10-21 下午7:57:26 
 */ 
  	
public class AppLoginMessage extends Message{
	/** 设备id */
	private String device_id;
	/** 应用标识*/
	private int app_id;
	/** 应用版本名*/
	private String versionName ;
	
	public AppLoginMessage(){
		msgType = MsgType.APPLOGIN_MSG;
	}

	
	 
	/** 
	 * 获取设备ID
	 * @return device_id
	 * @author huangbq
	 * @data 2014-10-21 下午7:57:57 
	 */
	  	
	public String getDevice_id() {
		return device_id;
	}

	 
	/** 
	 * 设置设备ID
	 * @param device_id
	 * @author huangbq
	 * @data 2014-10-21 下午7:59:28 
	 */
	  	
	public void setDevice_id(String device_id) {
		this.device_id = device_id;
	}

	 
	/** 
	 * 获取app_id标识（app注册时从控制台获取的id）
	 * @return app_id
	 * @author huangbq
	 * @data 2014-10-21 下午7:59:40 
	 */
	  	
	public int getApp_id() {
		return app_id;
	}

	 
	/** 
	 * 设置app_id标识（app注册时从控制台获取的id）
	 * @param app_id
	 * @author huangbq
	 * @data 2014-10-21 下午8:00:30 
	 */
	  	
	public void setApp_id(int app_id) {
		this.app_id = app_id;
	}



	 
	/** 
	 * 获取应用版本名
	 * @return versionName
	 * @author huangbq
	 * @data 2014-12-4 下午1:32:33 
	 */
	  	
	public String getVersionName() {
		return versionName;
	}



	 
	/** 
	 * 设置应用版本名
	 * @param versionName
	 * @author huangbq
	 * @data 2014-12-4 下午1:33:23 
	 */
	  	
	public void setVersionName(String versionName) {
		this.versionName = versionName;
	}
	
	
	
	
}
