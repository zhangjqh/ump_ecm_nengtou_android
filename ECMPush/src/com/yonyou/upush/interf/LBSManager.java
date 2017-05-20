
/**   
 * @Title: LBSManager.java 
 * @Package: com.yonyou.upush.interf 
 * @Description: TODO
 * @author Administrator  
 * @date 2014-12-5 下午7:33:55 
 * @version 1.3.1 
 */


package com.yonyou.upush.interf;

import com.yonyou.protocol.LocationUPush;

/** 
 * LBS服务管理器接口
 * @package com.yonyou.upush.interf
 * @author huangbq
 * @date 2014-12-5 下午7:33:55 
 */

public interface LBSManager {
	
 
	/** 
	 * 开启LBS服务    （开启LBS服务方式 1： 采用默认设置）
	 * @author huangbq
	 * @data 2014-12-5 下午7:43:05 
	 */
	  	
	public void openLBSPush ();
	 
	/** 
	 * 开启LBS服务  并设置重定位监听条件  （设置LBS服务方式 2：自定义监听条件）
	 * @param minTime
	 * @param minDistance
	 * @author huangbq
	 * @data 2014-12-5 下午7:44:31 
	 */
	  	
	public void openLBSPush (long minTime, float minDistance);
	 
	/** 
	 * 发送位置信息  （设置LBS服务方式 3： 用户自行获取和监听位置信息，并将位置信息发送给服务器）
	 * @param latitude 纬度
	 * @param longitude 精度
	 * @author huangbq
	 * @data 2014-12-5 下午7:48:36 
	 */
	  	
	public void sendLocation(double latitude, double longitude);
	
	 
	/** 
	 * 关闭LBS服务
	 * @author huangbq
	 * @data 2014-12-5 下午7:53:33 
	 */
	  	
	public void closeLBSPush();
	 
	/** 
	 * 查看当前位置信息
	 * @return LocationUPush
	 * @author huangbq
	 * @data 2014-12-5 下午7:50:37 
	 */
	  	
	public LocationUPush getLocationUPush ();
	 
	/** 
	 * 获取当前LBS服务状态 （开启状态或关闭状态）
	 * @return boolean LBS开关状态
	 * @author huangbq
	 * @data 2014-12-5 下午7:51:43 
	 */
	  	
	public boolean isLBS();

}
