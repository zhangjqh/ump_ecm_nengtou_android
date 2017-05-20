
/**   
 * @Title: MessageManagerInterface.java 
 * @Package: com.yonyou.pushclient 
 * @Description: TODO
 * @author Administrator  
 * @date 2014-10-16 上午11:28:16 
 * @version 1.3.1 
 */


package com.yonyou.upush.interf;


import com.yonyou.protocol.NotifyAndMsg;

/** 
 * 消息管理接口
 * @package com.yonyou.pushclient
 * @author huangbq
 * @date 2014-10-16 上午11:28:16 
 */

public interface InformationManager {

	/** 接口名称 */
	public static final String NAME = "informationManagerInterface";
	
	 
	/** 
	 * 处理消息
	 * @param notifyAndMsg
	 * @author huangbq
	 * @data 2014-10-21 下午8:17:45 
	 */
	  	
	public void dealWithMessage(NotifyAndMsg notifyAndMsg);
	
	 
	/** 
	 * 处理通知
	 * @param notifyAndMsg
	 * @author huangbq
	 * @data 2014-10-24 下午2:10:22 
	 */
	  	
	public void dealWithNotification(NotifyAndMsg notifyAndMsg);
}
