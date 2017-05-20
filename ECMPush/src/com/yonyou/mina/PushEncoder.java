package com.yonyou.mina;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;


import org.apache.mina.core.buffer.IoBuffer;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.filter.codec.ProtocolEncoderAdapter;
import org.apache.mina.filter.codec.ProtocolEncoderOutput;

import com.google.gson.Gson;
import com.yonyou.protocol.AppLoginMessage;
import com.yonyou.protocol.HeartMessage;
import com.yonyou.protocol.LocationUPush;
import com.yonyou.protocol.NotifyBack;
import com.yonyou.protocol.PushMessage;
import com.yonyou.protocol.ResponseHeartMessage;
import com.yonyou.protocol.ResponseMessage;
import com.yonyou.protocol.Tag;

/** 
 * 数据编码器
 * @package com.yonyou.pushclient
 * @author huangbq
 * @date 2014-10-21 下午8:41:30 
 */ 
  	
public class PushEncoder extends ProtocolEncoderAdapter{
	
	/** 字符集*/
	private Charset charset;
	
	public PushEncoder() {
		charset = Charset.defaultCharset();
	}
	
	public PushEncoder(Charset charset) {
		this.charset = charset;
	}
	
	@Override
	public void encode(IoSession iosession, Object message, ProtocolEncoderOutput out)
			throws Exception {
		IoBuffer buffer = IoBuffer.allocate(1024).setAutoExpand(true);
		CharsetEncoder ce = charset.newEncoder();
//		JSONObject json = new JSONObject();
//		/*
//		 * 根据message的不同类型，对其做不同的处理
//		 */
//		if(message instanceof PushMessage){ //如果是推送消息包
//			PushMessage  pm = (PushMessage)message;
//			/*将推送消息转化为JSON字符串格式*/
//			json.put("msgType", pm.getMsgType());
//			json.put("msgDetailId", pm.getMsgDetailId());
//			json.put("package_name", pm.getPackage_name());
//			json.put("content", pm.getContent());
//			json.put("subject", pm.getSubject());
//			json.put("type", pm.getType());
//			json.put("extratext", pm.getExtratext());			
//		}else if(message instanceof AppLoginMessage){ //如果是app登录消息包
//			AppLoginMessage alm = (AppLoginMessage)message;
//			/*将连接消息转化为JSON字符串格式*/
//			json.put("msgType", alm.getMsgType());
//			json.put("app_id", alm.getApp_id());
//			json.put("device_id", alm.getDevice_id());
//			json.put("versionName", alm.getVersionName());
//			
//		}else if(message instanceof  HeartMessage){ //如果是心跳包
//			HeartMessage hm = (HeartMessage)message;
//			/*将心跳消息转化为JSON字符串格式*/
//			json.put("msgType", hm.getMsgType());
//			json.put("device_id", hm.getDevice_id());
//			json.put("appList", hm.getAppList());
//			
//		}else if(message instanceof ResponseMessage){
//			// 消息通知反馈包
//			ResponseMessage rm = (ResponseMessage)message;
//			json.put("msgType", rm.getMsgType());
//			json.put("msgDetailId", rm.getMsgDetailId());
//				
//		}else if(message instanceof ResponseHeartMessage){
//			// 心跳反馈包
//			ResponseHeartMessage rhm = (ResponseHeartMessage)message;
//			json.put("msgType", rhm.getMsgType());
//		
//		}else if (message instanceof LocationUPush) {
//			// LBS定位信息包
//			LocationUPush loc = (LocationUPush)message;
//			json.put("msgType", loc.getMsgType());
//			json.put("lbs", loc.isLbs());
//			json.put("app_id", loc.getApp_id());
//			json.put("device_id", loc.getDevice_id());
//			json.put("latitude", loc.getLatitude());
//			json.put("longitude", loc.getLongitude());
//			
//			System.out.println("###在编码器中收到LBS请求：" + "\n"
//			+ "msgType:   " + loc.getMsgType() + "\n"
//			+ "lbs:       " + loc.isLbs() + "\n"
//			+ "app_id:    " + loc.getApp_id() + "\n"
//			+ "device_id: " + loc.getDevice_id() + "\n"
//			+ "latitude:  " + loc.getLatitude() + "\n"
//			+ "longitude: " + loc.getLongitude() + "\n"
//			+ "json" + json.toString());
//		} else if (message instanceof Tag) {
//			// 标签包
//			Tag tag = (Tag)message;
//			json.put("msgType", tag.getMsgType());
//			json.put("app_id", tag.getApp_id());
//			json.put("tag", tag.getTag());
//			json.put("addTag", tag.isAddTag());
//			json.put("device_id", tag.getDevice_id());
//		} else if (message instanceof NotifyBack) {
//			// 通知点击事件反馈包
//			NotifyBack notifyBack = (NotifyBack)message;
//			json.put("msgType", notifyBack.getMsgType());
//			json.put("device_id", notifyBack.getDevice_id());
//			json.put("app_id", notifyBack.getApp_id());
//			json.put("msgDetailId", notifyBack.getMsg_dt_id());
//			System.out.println("NotifyBack 数据包编码中：  ………………");
//		}
		String msg = new Gson().toJson(message);
		buffer.putInt(msg.getBytes(charset.displayName()).length);
		buffer.putString(msg, ce);
		buffer.flip();
		out.write(buffer);
	}
	
}
