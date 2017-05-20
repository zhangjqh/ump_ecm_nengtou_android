package com.yonyou.mina;

import java.net.InetSocketAddress;
import java.nio.charset.Charset;


import org.apache.mina.core.filterchain.DefaultIoFilterChainBuilder;
import org.apache.mina.core.filterchain.IoFilterAdapter;
import org.apache.mina.core.future.ConnectFuture;
import org.apache.mina.core.session.IdleStatus;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.filter.codec.ProtocolCodecFilter;
import org.apache.mina.filter.keepalive.KeepAliveFilter;
import org.apache.mina.filter.keepalive.KeepAliveMessageFactory;
import org.apache.mina.filter.keepalive.KeepAliveRequestTimeoutHandler;
import org.apache.mina.transport.socket.nio.NioSocketConnector;

import com.yonyou.protocol.Constants;
import com.yonyou.protocol.Interval;
import com.yonyou.protocol.LogUtil;
import com.yonyou.pushclient.NotificationPushService;

import android.content.Intent;
import android.util.Log;






/**
 * @see 连接关闭事件监听器
 * @file ReconnectListener.java
 * @package com.mymina.client
 * @project minaclient
 * @author huangbq
 * @date 2014年9月9日 上午8:55:55
 */
public class ReconnectListener extends IoFilterAdapter{
	/** 日志记录*/
	private static final String TAG = LogUtil.makeLogTAG(ReconnectListener.class);
	/** 设置连接超时时间-20秒*/
	private static final long CONNECTTIMEOUT = 20000;
	/** 设置IoSession进入空闲时间-15秒*/
	private static final int IDLE = 15;
	/** 设置心跳频率-10秒*/
	private static final int HEARTINTERVAL = 10;
	/** 设置心跳超时-30秒（3个心跳间隔）*/
	private static final int HEARTTIMEOUT = 30;
	/** 设置读缓冲区大小*/
	private static final int RECEIVEBUFFER = 1024*2;
	/** 设置写缓冲区大小*/
	private static final int SENDBUFFER = 1024*2;
	/** 断线重连拦截器名*/
	private static final String RECONNECT = "reConnect";
	/** 编解码器名*/
	private static final String CODES = "codes";
	/** 编解码方式*/
	private static final String CODENAME = "UTF-8";
	/** 心跳拦截器名*/
	private static final String HEARTBEAT = "heartBeat";
	
	private NotificationPushService firstService;
	public ReconnectListener (NotificationPushService firstService) {
		this.firstService = firstService;
	}
	
	
	
	/* (non-Javadoc)
	 * @see org.apache.mina.core.filterchain.IoFilterAdapter#sessionClosed(org.apache.mina.core.filterchain.IoFilter.NextFilter, org.apache.mina.core.session.IoSession)
	 */
	public void sessionClosed(NextFilter nextFilter, 
			IoSession ioSession) {
		Intent intent = new Intent(Constants.getActionConnectState());
		intent.putExtra(Constants.getExtraKeyConnectState(), false);
		firstService.sendBroadcast(intent);
		
		if (!ioSession.isConnected()&&Constants.isConnect()) {
			
			/* 执行断线重连操作*/
			for (Interval interval  : Interval.values()) {
				/* 断线重连间隔策略*/
				try {
					Thread.sleep(interval.getTime());
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
//					log.info("Thread.sleep()返回异常"+e.getMessage());
				}
				
				/* 断线重连*/
				/* 创建新连接*/
				NioSocketConnector connector = new NioSocketConnector();
				/* 获取连接的过滤器链*/
				DefaultIoFilterChainBuilder chain = connector.getFilterChain();
				/* 设置超时时间20秒*/
				connector.setConnectTimeoutMillis(CONNECTTIMEOUT);
				/* 添加断线重连拦截器*/
				chain.addFirst(RECONNECT,new ReconnectListener(firstService));
				/* 添加编解码器*/
				chain.addLast(CODES, new ProtocolCodecFilter(
						new PushCodecFactory(Charset.forName(CODENAME))));
				/* 创建和添加心跳拦截器*/
				/* 设置ioSession Idle时间*/
				connector.getSessionConfig().setIdleTime(IdleStatus.BOTH_IDLE, IDLE);
				/* 创建心跳工厂*/
				KeepAliveMessageFactory heartBeatFactory = 
						new KeepAliveMessageFactoryImpl();
				/* 创建心跳超时处理器*/
				KeepAliveRequestTimeoutHandler heartBeatTimeOutHandler = 
						new KeepAliveRequestTimeoutHandlerImpl();
				/* 创建心跳超时拦截器*/
				KeepAliveFilter keepAliveFilter = new KeepAliveFilter(heartBeatFactory,
						IdleStatus.BOTH_IDLE, heartBeatTimeOutHandler, 
						HEARTINTERVAL, HEARTTIMEOUT);
				keepAliveFilter.setForwardEvent(true);
				/* 添加心跳拦截器*/
				chain.addLast(HEARTBEAT, keepAliveFilter);
				/* 设置Socket开启keepAlive*/
				connector.getSessionConfig().setKeepAlive(true);
				/* 设置读写缓冲区大小*/
				connector.getSessionConfig().setReceiveBufferSize(RECEIVEBUFFER);;
				connector.getSessionConfig().setSendBufferSize(SENDBUFFER);
				/* 添加主处理器*/
				connector.setHandler(new MinaClientHandler(firstService));
				/* 设置默认连接*/
				connector.setDefaultRemoteAddress(
						new InetSocketAddress(Constants.getIP(), Constants.getPORT()));
				/* 建立连接*/
				ConnectFuture future = connector.connect();
				
				try {
					/* 等待连接完成*/
					future.awaitUninterruptibly();
					/* 判断是否完成重连*/
					if (null != future.getSession() && 
							future.getSession().isConnected()) {
						MinaClient.confu = future;
						if (Constants.isLog()) {
							Log.d(TAG, "断线重连成功");
						}
						break;
					}
				} catch (Exception e) {
					if (Constants.isLog()) {
						Log.d(TAG, "断线重连失败，准备再次重连"+e.getMessage());
						Log.d(TAG, "本次重连间隔："+interval.getTime());
					}

				}
				
			}// end ---- foreach
			
		}// end---if(!ioSession.isConnected())
		
	}


}





























