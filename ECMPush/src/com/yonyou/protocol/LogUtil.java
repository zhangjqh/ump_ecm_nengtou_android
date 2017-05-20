package com.yonyou.protocol;

/**
 * @see 日志标识设置
 * @file LogUtil.java
 * @package com.huang.apclient
 * @project APClient
 * @author huangbq
 * @date 2014-9-18 上午11:38:20
 */
public class LogUtil {
	/**日志标识*/
	private static String TAG = "android_logtag_";
	
	 
	/** 
	 * 生成日志标识
	 * @param clas
	 * @return TAG
	 * @author huangbq
	 * @data 2014-10-21 下午8:15:30 
	 */
	  	
	public static String makeLogTAG(Class<?> clas) {
		return TAG + clas.getSimpleName();
	}

}
