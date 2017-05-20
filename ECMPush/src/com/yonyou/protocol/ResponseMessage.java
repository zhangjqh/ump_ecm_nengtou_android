package com.yonyou.protocol;

/**
 * 回执消息(当客户端接收到服务器端推送的消息后，向服务器端发送回执消息)
 * @author liuxrb
 */
public class ResponseMessage extends Message{
	
	/** 消息ID*/
	private int msgDetailId; 

	public ResponseMessage(){
		this.msgType = MsgType.RESPONSE_MSG;
		msgDetailId = 0;
	}
	
	public ResponseMessage(int msgDetailId){
		this.msgType = MsgType.RESPONSE_MSG;
		this.msgDetailId = msgDetailId;
	}

	 
	/** 
	 * 获取消息id
	 * @return msgDetailId
	 * @author huangbq
	 * @data 2014-10-21 下午9:05:46 
	 */
	  	
	public int getMsgDetailId() {
		return msgDetailId;
	}

	 
	/** 
	 * 设置消息id
	 * @param msgDetailId
	 * @author huangbq
	 * @data 2014-10-21 下午9:06:08 
	 */
	  	
	public void setMsgDetailId(int msgDetailId) {
		this.msgDetailId = msgDetailId;
	}
	
	
}
