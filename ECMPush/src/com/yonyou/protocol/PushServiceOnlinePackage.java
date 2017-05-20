
/**   
 * @Title: PushServiceOnlinePackage.java 
 * @Package: com.yonyou.pushclient 
 * @Description: TODO
 * @author Administrator  
 * @date 2014-10-17 下午4:21:11 
 * @version 1.3.1 
 */


package com.yonyou.protocol;

import java.io.Serializable;
import java.util.ArrayList;

/** 
 * 推送服务在线数据包
 * @package com.yonyou.pushclient
 * @author huangbq
 * @date 2014-10-17 下午4:21:11 
 */

public class PushServiceOnlinePackage implements Serializable {

	
	/** @Fields serialVersionUID: */
	  	
	private static final long serialVersionUID = 1L;
	
	/** 当前在线app_id列表*/
	private ArrayList<Integer> appOnlineLists;
	/** 当前提供服务的应用包名*/
	private String packageName;
	
	public PushServiceOnlinePackage() {
		appOnlineLists = new ArrayList<Integer>();
		packageName = "";
	}

	 
	/** 
	 * 获取app在线列表
	 * @return appOnlineLists
	 * @author huangbq
	 * @data 2014-10-17 下午4:25:44 
	 */
	  	
	public ArrayList<Integer> getAppOnlineList() {
		return appOnlineLists;
	}

	 
	/** 
	 * 设置app在线列表
	 * @param appOnlineList
	 * @author huangbq
	 * @data 2014-10-17 下午4:26:21 
	 */
	  	
	public void setAppOnlineList(ArrayList<Integer> appOnlineList) {
		appOnlineLists = appOnlineList;
	}

	 
	/** 
	 * 获取服务包名
	 * @return packageName
	 * @author huangbq
	 * @data 2014-10-17 下午4:26:37 
	 */
	  	
	public String getPackageName() {
		return packageName;
	}

	 
	/** 
	 * 设置服务包名
	 * @param packageName
	 * @author huangbq
	 * @data 2014-10-17 下午4:27:10 
	 */
	  	
	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	
}
