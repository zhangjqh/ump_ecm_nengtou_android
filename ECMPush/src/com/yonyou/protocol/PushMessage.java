package com.yonyou.protocol;

/** 
 * 推送消息体定义
 * @package com.yonyou.pushclient
 * @author huangbq
 * @date 2014-10-16 上午11:22:51 
 */ 
  	
public class PushMessage  extends Message{
	
	/** push_message_detail表中id*/
	private int msgDetailId; 
	/** 消息体 */
	private String content;
	/** 应用包名 */
	private String package_name;
	/** 标题 */
	private String subject; 
	/** 扩展字段*/
	private String extratext;
	/** 数据类型 1表示通知，0表示自定义消息 */
	private int type; 
	
	public  PushMessage() {
		this.msgType = MsgType.PUSH_MSG;
		msgDetailId = 0;
		content = "";
		package_name = "";
		subject = "";
		extratext = "";
		type = 0;
	}
	
	 
	/** 
	 * 获取消息id
	 * @return msgDetailId
	 * @author huangbq
	 * @data 2014-10-21 下午8:53:08 
	 */
	  	
	public int getMsgDetailId() {
		return msgDetailId;
	}

	 
	/** 
	 * 设置消息id
	 * @param msgDetailId
	 * @author huangbq
	 * @data 2014-10-21 下午8:53:30 
	 */
	  	
	public void setMsgDetailId(int msgDetailId) {
		this.msgDetailId = msgDetailId;
	}

	 
	/** 
	 * 获取数据包内容
	 * @return content
	 * @author huangbq
	 * @data 2014-10-21 下午8:53:42 
	 */
	  	
	public String getContent() {
		return content;
	}

	 
	/** 
	 * 设置数据包内容
	 * @param content
	 * @author huangbq
	 * @data 2014-10-21 下午8:54:00 
	 */
	  	
	public void setContent(String content) {
		this.content = content;
	}
	
	 
	/** 
	 * 获取应用包名
	 * @return package_name
	 * @author huangbq
	 * @data 2014-10-21 下午8:54:10 
	 */
	  	
	public String getPackage_name() {
		return package_name;
	}

	 
	/** 
	 * 设置应用包名
	 * @param package_name
	 * @author huangbq
	 * @data 2014-10-21 下午8:54:31 
	 */
	  	
	public void setPackage_name(String package_name) {
		this.package_name = package_name;
	}
	
	 
	/** 
	 * 获取标题
	 * @return subject
	 * @author huangbq
	 * @data 2014-10-21 下午8:54:45 
	 */
	  	
	public String getSubject() {
		return subject;
	}

	 
	/** 
	 * 设置标题
	 * @param subject
	 * @author huangbq
	 * @data 2014-10-21 下午8:54:59 
	 */
	  	
	public void setSubject(String subject) {
		this.subject = subject;
	}

	
	 
	 
	/** 
	 * 	获取扩展字段
	 * @return extratext  扩展字段
	 * @author huangbq
	 * @data 2015-6-17 下午1:55:05 
	 */
	  	
	public String getExtratext() {
		return extratext;
	}


	 
	/** 
	 * 设置扩展字段
	 * @param extratext  扩展字段
	 * @author huangbq
	 * @data 2015-6-17 下午1:55:37 
	 */
	  	
	public void setExtratext(String extratext) {
		this.extratext = extratext;
	}


	/** 
	 * 获取数据类型 (消息_0, 通知_1)
	 * @return type
	 * @author huangbq
	 * @data 2014-10-21 下午8:55:11 
	 */
	  	
	public int getType() {
		return type;
	}

	 
	/** 
	 * 设置数据类型 (消息_0, 通知_1)
	 * @param type
	 * @author huangbq
	 * @data 2014-10-21 下午8:55:52 
	 */
	  	
	public void setType(int type) {
		this.type = type;
	}

	 
	/** 
	 * 获取消息体String
	 * @return str
	 * @author huangbq
	 * @data 2014-10-21 下午8:56:12 
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
