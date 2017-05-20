package com.yonyou.mina;

import java.net.InetSocketAddress;
import java.nio.charset.Charset;

import org.apache.mina.core.filterchain.DefaultIoFilterChainBuilder;
import org.apache.mina.core.future.ConnectFuture;
import org.apache.mina.core.session.IdleStatus;
import org.apache.mina.filter.codec.ProtocolCodecFilter;
import org.apache.mina.filter.keepalive.KeepAliveFilter;
import org.apache.mina.filter.keepalive.KeepAliveMessageFactory;
import org.apache.mina.filter.keepalive.KeepAliveRequestTimeoutHandler;
import org.apache.mina.transport.socket.nio.NioSocketConnector;

import com.yonyou.protocol.Constants;
import com.yonyou.protocol.LogUtil;
import com.yonyou.pushclient.NotificationPushService;


import android.util.Log;

/**
 * @see Mina 客户端主功能模块  负责建立连接和通讯前的准备工作
 * @author huangbq
 * @date 2014年8月15日 下午3:50:51
 */
public class MinaClient implements Runnable{ 
	
	/** 日志标识*/
	private static final String TAG = LogUtil.makeLogTAG(MinaClient.class);
	
	/** 当前建立的连接*/
	public static ConnectFuture confu;	
	/**连接超时设置15秒*/
	private static final long CONNECTTIMEOUT = 20000;
	/**心跳频率10秒*/
	private static final int HEARTBEATRATE = 60;
	/** 设置心跳超时-30秒（3个心跳间隔）*/
	private static final int HEARTTIMEOUT = 180;
	/**进入空闲时间15秒*/
	private static final int IDLETIME = 15;
	/** 设置读缓冲区大小*/
	private static final int RECEIVEBUFFER = 1024*2;
	/** 设置写缓冲区大小*/
	private static final int SENDBUFFER = 1024*2;
	/**指定字符编码方式 UTF-8*/
	private static final String CHARSETNAME = "UTF-8";
	/**编解码过滤器标识*/
	private static final String CODECFILTERNAME = "codec";
	/**心跳过滤器标识*/
	private static final String HEARTBEATFILTER = "heartBeatFilter";
	/**断线重连过滤器标识*/
	private static final String RECONNECT = "Reconnect";
	/** 消息推送服务*/
	private NotificationPushService notificationPushService;
	/** 连接*/
	private NioSocketConnector connector;
	
	public MinaClient(NotificationPushService notificationPushService) {
		this.notificationPushService = notificationPushService;
	}

	@Override
	public void run() {

//		while (null == notificationPushService.getAppBroadcastReceiver()
//				|| !notificationPushService.getAppBroadcastReceiver().existApp()) {
//			try {
//				Thread.sleep(3000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		//获取server端Socket连接
		connector = new NioSocketConnector();
		//设置连接超时20秒
		connector.setConnectTimeoutMillis(CONNECTTIMEOUT);
		//设置空闲时间15秒
		connector.getSessionConfig().setIdleTime(IdleStatus.BOTH_IDLE, IDLETIME);
		//获取该connector上的过滤器链表
		DefaultIoFilterChainBuilder ioFilterChain = connector.getFilterChain();
		/* 添加断线重连拦截器*/
		ioFilterChain.addFirst(RECONNECT, new ReconnectListener(notificationPushService));
		//创建编解码过滤器
		ProtocolCodecFilter codecFilter = new ProtocolCodecFilter(
				new PushCodecFactory(Charset.forName(CHARSETNAME)));
		//添加编解码过滤器
		ioFilterChain.addLast(CODECFILTERNAME, codecFilter);
		/* 添加心跳机制拦截器 */
		//创建心跳工厂
		KeepAliveMessageFactory heartBeatFactory = 
				new KeepAliveMessageFactoryImpl();
		//创建心跳请求超时处理器
		KeepAliveRequestTimeoutHandler heartBeatHandler = 
				new KeepAliveRequestTimeoutHandlerImpl();
		//创建心跳过滤器
		KeepAliveFilter heartBeatFilter = 
				new KeepAliveFilter(heartBeatFactory, 
						IdleStatus.BOTH_IDLE,heartBeatHandler);
		//是否回发
		heartBeatFilter.setForwardEvent(true);
		//设置发送频率10秒
		heartBeatFilter.setRequestInterval(HEARTBEATRATE);
		//设置心跳响应时间
		heartBeatFilter.setRequestTimeout(HEARTTIMEOUT);		
		//将心跳过滤器加入链表中
		ioFilterChain.addLast(HEARTBEATFILTER, heartBeatFilter);
		//添加客户端核心处理器
		connector.setHandler(new MinaClientHandler(notificationPushService));
		//设置缓冲区大小
		connector.getSessionConfig().setReceiveBufferSize(RECEIVEBUFFER);
		connector.getSessionConfig().setSendBufferSize(SENDBUFFER);
		//心跳
		connector.getSessionConfig().setKeepAlive(true);
		//默认连接
		connector.setDefaultRemoteAddress(
				new InetSocketAddress(Constants.getIP() ,Constants.getPORT()));
		
		while (Constants.isConnect()) {			
			try {
				// 创建连接
				confu = connector.connect();
				// 等待连接创建完成
				confu.awaitUninterruptibly();
				confu.getSession();
				if (confu.isConnected()) {
					if(Constants.isLog()) {
						Log.d(TAG, "与服务端连接成功");	
					}	
					break;
				} else {
					if(Constants.isLog()) {
						Log.d(TAG, "没有连接上服务器");
					}
				}
			} catch (Exception e) {
				if(Constants.isLog()) {
					Log.d(TAG, "###############"+e.toString());	
				}
			}			
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				if (Constants.isLog()) {
					Log.d(TAG, "连接异常:" + e.toString());
				}
			}

		}
		
	}
	
	 
	/** 
	 * 断开和服务器的连接
	 * @author huangbq
	 * @data 2014-10-13 下午4:32:52 
	 */
	  	
	public void stopConnect() {
		if(null != connector) {
			if(null != confu && confu.isConnected()) {
				confu.getSession().close(true);
			}
			KeepAliveFilter heartBeatFilter = 
					(KeepAliveFilter) connector.getFilterChain().remove(HEARTBEATFILTER);
			if (null != heartBeatFilter) {
				try {
					heartBeatFilter.destroy();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			connector.getFilterChain().remove(CODECFILTERNAME);
			connector.getFilterChain().remove(RECONNECT);
			connector.getFilterChain().clear();
			connector.dispose();
			Log.d(TAG, "销毁连接***********************************");
		}
	}
	
 
}
