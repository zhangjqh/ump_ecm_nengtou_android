
/**   
 * @Title: NotifyBack.java 
 * @Package: com.yonyou.protocol 
 * @Description: TODO
 * @author Administrator  
 * @date 2014-12-23 下午2:10:18 
 * @version 1.3.1 
 */


package com.yonyou.protocol;

import java.io.Serializable;

/** 
 *
 * @package com.yonyou.protocol
 * @author huangbq
 * @date 2014-12-23 下午2:10:18 
 */

public class NotifyBack extends Message implements Serializable {

	
	/** @Fields serialVersionUID: */
	  	
	private static final long serialVersionUID = 1L;
	
	/** 设备ID*/
	private String device_id = "";
	/** 应用id*/
	private int app_id = 0;
	/** 消息详情id*/
	private int msg_dt_id = 0;
	
	public NotifyBack () {
		msgType = MsgType.NOTIFY_BACK_MSG;
	}
	
	 
	/** 
	 * 获取设备ID
	 * @return device_id
	 * @author huangbq
	 * @data 2014-12-23 下午2:31:42 
	 */
	  	
	public String getDevice_id() {
		return device_id;
	}
	 
	/** 
	 * 设置设备ID
	 * @param device_id
	 * @author huangbq
	 * @data 2014-12-23 下午2:32:05 
	 */
	  	
	public void setDevice_id(String device_id) {
		this.device_id = device_id;
	}
	 
	/** 
	 * 获取app_id
	 * @return app_id
	 * @author huangbq
	 * @data 2014-12-23 下午2:32:15 
	 */
	  	
	public int getApp_id() {
		return app_id;
	}
	 
	/** 
	 * 设置app_id
	 * @param app_id
	 * @author huangbq
	 * @data 2014-12-23 下午2:32:37 
	 */
	  	
	public void setApp_id(int app_id) {
		this.app_id = app_id;
	}
	 
	/** 
	 * 获取信息详情id
	 * @return msg_dt_id
	 * @author huangbq
	 * @data 2014-12-23 下午2:32:46 
	 */
	  	
	public int getMsg_dt_id() {
		return msg_dt_id;
	}
	 
	/** 
	 * 设置信息详情id
	 * @param msg_dt_id
	 * @author huangbq
	 * @data 2014-12-23 下午2:33:08 
	 */
	  	
	public void setMsg_dt_id(int msg_dt_id) {
		this.msg_dt_id = msg_dt_id;
	}
	
	public void setType() {
		msgType = MsgType.NOTIFY_BACK_MSG;
	}

}
