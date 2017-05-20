package com.yonyou.protocol;

import java.util.ArrayList;

/** 
 * 心跳请求包
 * @package com.yonyou.pushclient
 * @author huangbq
 * @date 2014-10-21 下午8:09:43 
 */ 
  	
public class HeartMessage extends Message{
	
	/** app 在线列表*/
	private ArrayList<Integer> appList;
	/** 设备id号*/
	private String device_id;
	
	public HeartMessage(){
		this.msgType = MsgType.HEART_MSG;
		appList = new ArrayList<Integer>();
		device_id = null;
	}


	 
	/** 
	 * 获取app在线列表
	 * @return appList
	 * @author huangbq
	 * @data 2014-10-21 下午8:10:58 
	 */
	  	
	public ArrayList<Integer> getAppList() {
		return appList;
	}

	 
	/** 
	 * 设置app在线列表
	 * @param appList
	 * @author huangbq
	 * @data 2014-10-21 下午8:11:24 
	 */
	  	
	public void setAppList(ArrayList<Integer> appList) {
		this.appList = appList;
	}

	 
	/** 
	 * 获取设备id号
	 * @return device_id
	 * @author huangbq
	 * @data 2014-10-21 下午8:11:41 
	 */
	  	
	public String getDevice_id() {
		return device_id;
	}

	 
	/** 
	 * 设置设备id号
	 * @param device_id
	 * @author huangbq
	 * @data 2014-10-21 下午8:12:02 
	 */
	  	
	public void setDevice_id(String device_id) {
		this.device_id = device_id;
	}
	
	
	
	
	
	
}
