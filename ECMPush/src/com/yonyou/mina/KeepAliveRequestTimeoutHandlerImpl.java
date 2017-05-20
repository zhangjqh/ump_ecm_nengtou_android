package com.yonyou.mina;

import org.apache.mina.core.session.IoSession;
import org.apache.mina.filter.keepalive.KeepAliveFilter;
import org.apache.mina.filter.keepalive.KeepAliveRequestTimeoutHandler;

import com.yonyou.protocol.Constants;
import com.yonyou.protocol.LogUtil;


import android.util.Log;



/**
 * @see 心跳超时处理机制
 * @file KeepAliveRequestTimeoutHandlerImpl.java
 * @package com.mymina.keepalive
 * @project minaclient
 * @author huangbq
 * @date 2014年8月18日 上午11:14:05
 */
public class KeepAliveRequestTimeoutHandlerImpl implements
		KeepAliveRequestTimeoutHandler {
	/** 日志标识*/
	private static final String TAG = 
			LogUtil.makeLogTAG(KeepAliveRequestTimeoutHandlerImpl.class);
	@Override
	public void keepAliveRequestTimedOut(KeepAliveFilter filter, IoSession session)
			throws Exception {
		// TODO Auto-generated method stub
		if (Constants.isLog()) {
			Log.d(TAG,"客户端心跳等待超时" + "---关闭当前长连接");
		}       
		//关闭连接
//		CloseFuture closeFuture = session.close(true);
//		//监听连接关闭事件
//		closeFuture.addListener(new IoFutureListener<IoFuture>() {			
//			public void operationComplete(IoFuture future) {
//				if (future instanceof CloseFuture) {
//					((CloseFuture) future).setClosed();
//				}
//			}
//			
//		});
	}
}
