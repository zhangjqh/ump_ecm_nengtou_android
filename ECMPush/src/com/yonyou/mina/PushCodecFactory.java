package com.yonyou.mina;

import java.nio.charset.Charset;

import org.apache.mina.core.session.IoSession;
import org.apache.mina.filter.codec.ProtocolCodecFactory;
import org.apache.mina.filter.codec.ProtocolDecoder;
import org.apache.mina.filter.codec.ProtocolEncoder;

/** 
 * 数据包编解码工厂
 * @package com.yonyou.pushclient
 * @author huangbq
 * @date 2014-10-21 下午8:37:06 
 */ 
  	
public class PushCodecFactory implements ProtocolCodecFactory{

	/** 数据编码器*/
	private final ProtocolEncoder encoder;
	/** 数据解码器*/
	private final ProtocolDecoder decoder;
	
	public  PushCodecFactory() {
		this(Charset.defaultCharset());
	}
	
	public  PushCodecFactory(Charset charset) {
		this.encoder = new PushEncoder(charset);
		this.decoder = new PushDecoder(charset);
	}

	@Override
	public ProtocolEncoder getEncoder(IoSession session) throws Exception {
		// TODO Auto-generated method stub
		return encoder;
	}

	@Override
	public ProtocolDecoder getDecoder(IoSession session) throws Exception {
		// TODO Auto-generated method stub
		return decoder;
	}

}
