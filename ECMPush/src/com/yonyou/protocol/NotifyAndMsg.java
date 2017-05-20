
/**   
 * @Title: NotifyAndMsg.java 
 * @Package: com.yonyou.pushclient 
 * @Description: TODO
 * @author Administrator  
 * @date 2014-10-14 下午10:37:34 
 * @version 1.3.1 
 */


package com.yonyou.protocol;

import java.io.Serializable;


/** 
 * 通讯 或 消息 数据包
 * @package com.yonyou.pushclient
 * @author huangbq
 * @date 2014-10-14 下午10:37:34 
 */

public class NotifyAndMsg extends Message implements Serializable {

	
	/** @Fields serialVersionUID: */
	  	
	private static final long serialVersionUID = 1L;
	
	/** 消息id*/
	private int msgDetailId;
	/** 消息内容*/
	private String content; 
	/** 推送目标包名*/
	private String package_name;
	/** 信息标题*/
	private String subject; 
	/** 扩展信息字段*/
	private String extratext;
	/** 信息类型  1表示通知，0表示自定义消息*/
	private int type; 
	
	public NotifyAndMsg() {
		this.msgType = MsgType.PUSH_MSG;
		msgDetailId = 0;
		content = "";
		package_name = "";
		subject = "";
		extratext = "";
		type = 0;
	}

	 
	/** 
	 * 获取消息id标识
	 * @return msgDetailId
	 * @author huangbq
	 * @data 2014-10-21 下午8:29:25 
	 */
	  	
	public int getMsgDetailId() {
		return msgDetailId;
	}

	 
	/** 
	 * 设置消息id标识
	 * @param msgDetailId
	 * @author huangbq
	 * @data 2014-10-21 下午8:30:18 
	 */
	  	
	public void setMsgDetailId(int msgDetailId) {
		this.msgDetailId = msgDetailId;
	}

	 
	/** 
	 * 获取数据包内容
	 * @return content
	 * @author huangbq
	 * @data 2014-10-21 下午8:30:38 
	 */
	  	
	public String getContent() {
		return content;
	}

	 
	/** 
	 * 设置数据包内容
	 * @param content
	 * @author huangbq
	 * @data 2014-10-21 下午8:31:06 
	 */
	  	
	public void setContent(String content) {
		this.content = content;
	}

	 
	/** 
	 * 获取目标app包名
	 * @return package_name
	 * @author huangbq
	 * @data 2014-10-21 下午8:31:17 
	 */
	  	
	public String getPackage_name() {
		return package_name;
	}

	 
	/** 
	 * 设置目标app包名
	 * @param package_name
	 * @author huangbq
	 * @data 2014-10-21 下午8:31:50 
	 */
	  	
	public void setPackage_name(String package_name) {
		this.package_name = package_name;
	}

	

	 
	/** 
	 * 获取标题
	 * @return subject
	 * @author huangbq
	 * @data 2014-10-21 下午8:32:10 
	 */
	  	
	public String getSubject() {
		return subject;
	}

	 
	/** 
	 * 设置标题
	 * @param subject
	 * @author huangbq
	 * @data 2014-10-21 下午8:32:32 
	 */
	  	
	public void setSubject(String subject) {
		this.subject = subject;
	}

	
	 
	 
	/** 
	 * 获取扩展字段
	 * @return extratext  扩展字段信息
	 * @author huangbq
	 * @data 2015-6-17 下午1:49:11 
	 */
	  	
	public String getExtratext() {
		return extratext;
	}


	 
	/** 
	 * 设置扩展字段
	 * @param extratext  扩展字段信息
	 * @author huangbq
	 * @data 2015-6-17 下午1:49:37 
	 */
	  	
	public void setExtratext(String extratext) {
		this.extratext = extratext;
	}


	/** 
	 * 获取数据包类型 (消息_0, 通知_1)
	 * @return type
	 * @author huangbq
	 * @data 2014-10-21 下午8:32:44 
	 */
	  	
	public int getType() {
		return type;
	}

	 
	/** 
	 * 设置数据包类型 (消息_0, 通知_1)
	 * @param type
	 * @author huangbq
	 * @data 2014-10-21 下午8:33:42 
	 */
	  	
	public void setType(int type) {
		this.type = type;
	}

	 
	/** 
	 * 数据包字符串
	 * @return str
	 * @author huangbq
	 * @data 2014-10-21 下午8:34:08 
	 */
	  	
	public String getString(){
		String str = "{"
						+ "\"symbol\":" + getMsgType() + ","
						+ "\"msgDetailId\":" + getMsgDetailId() + ","
						+ "\"package_name\":" + getPackage_name() + ","
						+ "\"content\":" + getContent() + ","
						+ "\"subject\":" + getSubject() + ","
						+ "\"type\":" + getType() 
				+ "}";
		return str;
	}
	
}
