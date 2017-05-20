package com.yonyou.protocol;

import java.io.Serializable;

/**
 * @see 应用信息类
 * @file AppInfo.java
 * @package com.huang.pushclient
 * @project PushClient
 * @author huangbq
 * @date 2014-9-25 下午1:50:41
 */
public class AppInfo implements Serializable {

	private static final long serialVersionUID = 1L;
	
	/** 应用包名*/
	private String package_name;
	/** 响应通知的Activity类名*/
	private String activity_class_name;
	/** 应用的唯一app_id标识*/
	private int app_id;
	
	/**
	 * 构造
	 */
	public AppInfo() {
		package_name = "";
		activity_class_name = "";
		app_id = 0;		
	}

	/**
	 * @see 获取应用包名
	 * @method getPackage_name
	 * @return package_name
	 * @date 2014-9-25 下午2:01:06
	 */
	public String getPackage_name() {
		return package_name;
	}

	/**
	 * @see 设置应用包名
	 * @method setPackage_name
	 * @param package_name
	 * @date 2014-9-25 下午2:01:28
	 */
	public void setPackage_name(String package_name) {
		this.package_name = package_name;
	}

	/**
	 * @see 获取响应通知的Activity类名
	 * @method getActivity_class_name
	 * @return activity_class_name
	 * @date 2014-9-25 下午2:01:45
	 */
	public String getActivity_class_name() {
		return activity_class_name;
	}

	/**
	 * @see 设置响应通知的Activity类名
	 * @method setActivity_class_name
	 * @param activity_class_name
	 * @date 2014-9-25 下午2:02:17
	 */
	public void setActivity_class_name(String activity_class_name) {
		this.activity_class_name = activity_class_name;
	}

	/**
	 * @see 获取应用app_id
	 * @method getApp_id
	 * @return app_id
	 * @date 2014-9-25 下午2:03:04
	 */
	public int getApp_id() {
		return app_id;
	}

	/**
	 * @see 设置应用app_id
	 * @method setApp_id
	 * @param app_id
	 * @date 2014-9-25 下午2:04:05
	 */
	public void setApp_id(int app_id) {
		this.app_id = app_id;
	}
	
	

}
