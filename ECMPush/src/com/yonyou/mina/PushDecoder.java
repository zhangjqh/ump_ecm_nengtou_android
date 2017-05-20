package com.yonyou.mina;


import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.util.ArrayList;


import org.apache.mina.core.buffer.IoBuffer;
import org.apache.mina.core.session.AttributeKey;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.filter.codec.CumulativeProtocolDecoder;
import org.apache.mina.filter.codec.ProtocolDecoderOutput;


import com.google.gson.Gson;
import com.yonyou.protocol.AppLoginMessage;
import com.yonyou.protocol.HeartMessage;
import com.yonyou.protocol.Message;
import com.yonyou.protocol.PushMessage;
import com.yonyou.protocol.ResponseHeartMessage;
import com.yonyou.protocol.ResponseMessage;
import com.yonyou.protocol.Message.MsgType;


/** 
 * 数据解码器
 * @package com.yonyou.pushclient
 * @author huangbq
 * @date 2014-10-21 下午8:38:51 
 */ 
  	
public class PushDecoder extends CumulativeProtocolDecoder{
	
	/** 字符集对象*/
	private final Charset charset;
	/** 用于沾包的数据缓存对象*/
	private final AttributeKey CONTEXT = new AttributeKey(getClass(), "context");
	
	public	PushDecoder(Charset charset) {
		this.charset = charset;
	}
	
	
	@Override
	protected boolean doDecode(IoSession session, IoBuffer in,
			ProtocolDecoderOutput out) throws Exception {
		CharsetDecoder cd = charset.newDecoder();
		Context context = getContext(session);//获取上下文
		IoBuffer buffer = context.getBuffer();
		if(context.getFlag()){
			/*
			 * 如果此时是消息头部分，则首先判断是否有4个字节，如果有就读取这4个字节的内容；
			 * 如果没有，则将当前的in存入到上下文中
			 */
			if(in.remaining() >= (4-buffer.position())){
				int remain = 4 - buffer.position();
				for(int i = 0 ; i < remain;i++){
					buffer.put(in.get());
				}
				buffer.flip();
				int length = buffer.getInt();//读取消息头的内容，也就是消息体的长度
				buffer.clear();
				context.setFlag(false);
				context.setLength(length);
				context.setBuffer(buffer);
				session.setAttribute(CONTEXT, context);
				return true;
			}else{
				//如果不够，就将in存入到buffer中
				buffer.put(in);
				context.setBuffer(buffer);
				session.setAttribute(CONTEXT, context);
				return false;
			}
		}else{
			/*
			 * 如果是消息体部分，则判断buffer缓冲区和in缓冲区是否有足够的字节，如果足够就读取;
			 * 否则将in缓冲区的字节存入到buffer缓冲区中
			 */
			if(in.remaining() >= (context.getLength() - buffer.position())){
				int remain = context.getLength() - buffer.position();
				for(int i = 1; i <= remain;i++){
					buffer.put(in.get());
				}
				buffer.flip();
				String jsonString = buffer.getString(cd);
				Message msg = new Gson().fromJson(jsonString, Message.class);
				context.reset(); 
				session.setAttribute(CONTEXT, context);
				/*
				 * 将JSON对象转化为相应的消息对象
				 */
				MsgType msgType = msg.getMsgType();
				switch (msgType) {
					case PUSH_MSG:  
						PushMessage pm = new PushMessage();
						pm = new Gson().fromJson(jsonString, PushMessage.class);
//						pm.setMsgDetailId(jsonObject.getIntValue("msgDetailId"));
//						pm.setPackage_name(jsonObject.getString("package_name"));
//						pm.setContent(jsonObject.getString("content"));
//						pm.setSubject(jsonObject.getString("subject"));
//						pm.setType(jsonObject.getIntValue("type"));
//						pm.setExtratext(jsonObject.getString("extratext"));
						out.write(pm);
						break;
					case HEART_MSG: 
						HeartMessage hm = new HeartMessage();
						hm = new Gson().fromJson(jsonString, HeartMessage.class);
//						hm.setDevice_id(jsonObject.getString("device_id"));
//						JSONArray jsonArray = jsonObject.getJSONArray("appList");
//						ArrayList<Integer> appList = new ArrayList<Integer>();
//						for(int i = 0;i < jsonArray.size();i++){
//							appList.add(jsonArray.getIntValue(i));
//						}
//						hm.setAppList(appList);
						out.write(hm);
						break;
					case RESPONSE_MSG: 
						ResponseMessage rm = new ResponseMessage();
						rm = new Gson().fromJson(jsonString, ResponseMessage.class);
//						rm.setMsgDetailId(jsonObject.getIntValue("msgDetailId"));
						out.write(rm);
						break;
					case APPLOGIN_MSG:
						AppLoginMessage alm = new AppLoginMessage();
						alm = new Gson().fromJson(jsonString, AppLoginMessage.class);
//						alm.setDevice_id(jsonObject.getString("device_id"));
//						alm.setApp_id(jsonObject.getIntValue("app_id"));
						out.write(alm);
						break;
					case RESPONSE_HEART_MSG:
						ResponseHeartMessage rhm = new ResponseHeartMessage();
						out.write(rhm);
						break;
				default:
					break;
				}
				context.reset();
				session.setAttribute(CONTEXT, context);
				return true;
			}else{
				buffer.put(in);
				context.setBuffer(buffer);
				context.setFlag(false);
				session.setAttribute(CONTEXT, context);
				return false;
			}
		}
	}
	
	/** 
	 * 定义一个内部类，存储上下文
	 * @package com.yonyou.pushclient
	 * @author huangbq
	 * @date 2014-10-21 下午8:40:48 
	 */ 
	  	
	private class Context{
		private IoBuffer buffer;//缓存区
		private int length; //消息体长度
		private boolean flag;//true表示消息头，false表示消息体
		
		public Context(){
			buffer = IoBuffer.allocate(1024).setAutoExpand(true);
			flag = true;
			length = 0;
		}

		public IoBuffer getBuffer() {
			return buffer;
		}

		public void setBuffer(IoBuffer buffer) {
			this.buffer = buffer;
		}

		public int getLength() {
			return length;
		}

		public void setLength(int length) {
			this.length = length;
		}

		public boolean getFlag() {
			return flag;
		}

		public void setFlag(boolean flag) {
			this.flag = flag;
		}
		
		public void reset(){
			buffer.clear();
			flag = true;
			length = 0;
		}
	}
	
	/**
	 * 获取上下文
	 */
	public Context getContext(IoSession session){
		Context context = (Context) session.getAttribute(CONTEXT);
		if (context == null) {
			context = new Context();
			session.setAttribute(CONTEXT, context);
		}
		return context;
	}

}
