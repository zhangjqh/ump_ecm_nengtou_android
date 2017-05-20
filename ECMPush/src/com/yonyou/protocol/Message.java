package com.yonyou.protocol;

/** 
 * 消息类
 * @package com.yonyou.pushclient
 * @author huangbq
 * @date 2014-10-21 下午8:16:14 
 */ 
  	
public class Message {
	
	/** 消息类型*/
	protected  MsgType msgType;
	
	 
	/** 
	 * 获取消息类型
	 * @return msgType
	 * @author huangbq
	 * @data 2014-10-21 下午8:16:54 
	 */
	  	
	public MsgType getMsgType(){
		return msgType;
	}
	
	/**
	 * <b>enum变量,表示消息类型</b><br>
	 * <b>PUSH_MSG</b>	&nbsp;&nbsp;表示服务器向客户端推送的消息<br>
	 * <b>RESPONSE_MSG</b> &nbsp;&nbsp;表示客户端向服务器发送的消息回执<br>
	 * <b>HEART_MSG</b> &nbsp;&nbsp;心跳消息<br>
	 * <b>APPLOGIN_MSG</b> &nbsp;&nbsp;app连接消息<br>
	 * <b>RESPONSE_HEART_MSG</b> &nbsp;&nbsp;服务器端回应的心跳<br>
	 **/
	public enum MsgType {PUSH_MSG, RESPONSE_MSG, HEART_MSG, APPLOGIN_MSG, RESPONSE_HEART_MSG, LBS_MSG, TAG_SET_MSG, NOTIFY_BACK_MSG};
}
