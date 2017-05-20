package com.yonyou.protocol;

/** 
 * 心跳反馈包
 * @package com.yonyou.pushclient
 * @author huangbq
 * @date 2014-10-21 下午9:04:50 
 */ 
  	
public class ResponseHeartMessage extends Message{
	
	public ResponseHeartMessage(){
		this.msgType = MsgType.RESPONSE_HEART_MSG;
	}
}
