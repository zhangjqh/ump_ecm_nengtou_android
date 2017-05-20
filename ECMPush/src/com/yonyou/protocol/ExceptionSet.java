
/**   
 * @Title: ExceptionSet.java 
 * @Package: com.yonyou.protocol 
 * @Description: TODO
 * @author Administrator  
 * @date 2014-12-4 上午9:29:54 
 * @version 1.3.1 
 */


package com.yonyou.protocol;

/** 
 * 自定义异常集
 * @package com.yonyou.protocol
 * @author huangbq
 * @date 2014-12-4 上午9:30:01 
 */ 
  	
public class ExceptionSet {
	
	/** 参数异常*/
	public final static String param = "param";
	/** 配置文件读取异常*/
	public final static String read = "read";
	/** 异常编码-不存在 */
    public final static String absence = "absence";
    /** 异常编码-已存在 */
    public final static String inexist = "inexist";
    /** 异常编码-连接异常 */
    public final static String connect = "connect";
    /** 异常编码-超时 */
    public final static String timeout = "timeout";
    /** 异常编码-远程主机强迫关闭了一个现有的连接 */
    public final static String connreset = "connreset";
    /** 异常编码-客户端主动注销 */
    public final static String logout = "logout";
    /** 异常编码-远端拒绝连接 */
    public final static String connect_refuse = "connect_refuse";

}
