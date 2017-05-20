
/**   
 * @Title: CustomException.java 
 * @Package: com.yonyou.protocol 
 * @Description: TODO
 * @author Administrator  
 * @date 2014-12-4 上午9:16:47 
 * @version 1.3.1 
 */


package com.yonyou.protocol;

import java.io.Serializable;

/** 
 * 自定义异常
 * @package com.yonyou.protocol
 * @author huangbq
 * @date 2014-12-4 上午9:18:23 
 */ 
  	
public class CustomException extends Exception {

	
	/** @Fields serialVersionUID: */
	  	
	private static final long serialVersionUID = 1L;
	
	/** 自定义异常集*/
	private Class<?> set = null;
	/** 异常标识*/
	private String code = null;
	/** 异常对象描述*/
	private Serializable object = null;
	
	public CustomException (Class<?> set, 
			String code, Serializable object, Exception cause) {
		super(cause);
		this.set = set;
		this.code = code;
		this.object = object;		
	}

	@Override
	public String getLocalizedMessage() {
		return code + ":" + object;
	}

	 
	/** 
	 * 获取自定义异常集
	 * @return set
	 * @author huangbq
	 * @data 2014-12-4 上午9:27:22 
	 */
	  	
	public Class<?> getSet() {
		return set;
	}

	 
	/** 
	 * 获取异常标识
	 * @return code
	 * @author huangbq
	 * @data 2014-12-4 上午9:27:49 
	 */
	  	
	public String getCode() {
		return code;
	}

	 
	/** 
	 * 获取异常对象
	 * @return object
	 * @author huangbq
	 * @data 2014-12-4 上午9:28:03 
	 */
	  	
	public Serializable getObject() {
		return object;
	}
	
	

}
