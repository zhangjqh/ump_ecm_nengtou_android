
/**   
 * @Title: TagsSet.java 
 * @Package: com.yonyou.protocol 
 * @Description: TODO
 * @author Administrator  
 * @date 2014-12-4 下午2:25:38 
 * @version 1.3.1 
 */


package com.yonyou.protocol;

import java.io.Serializable;


/** 
 *
 * @package com.yonyou.protocol
 * @author huangbq
 * @date 2014-12-4 下午2:25:38 
 */

/** 
 * 标签设置协议 （指定应用 添加或删除 某些标签）
 * @package com.yonyou.protocol
 * @author huangbq
 * @date 2014-12-4 下午2:28:59 
 */ 
  	
public class Tag extends Message implements Serializable {

	
	/** @Fields serialVersionUID: */
	  	
	private static final long serialVersionUID = 1L;
	
	/** 应用标识*/
	private int app_id = 0;
	/** 设置或撤销标签*/
	private boolean addTag = true;
	/** 标签列表*/
	private String tag = null;
	/** 设备id*/
	private String device_id = null;
	
	
	public Tag() {
		msgType = MsgType.TAG_SET_MSG;
	}

	 
	/** 
	 * 获取应用app_id
	 * @return app_id
	 * @author huangbq
	 * @data 2014-12-4 下午2:32:31 
	 */
	  	
	public int getApp_id() {
		return app_id;
	}

	 
	/** 
	 * 设置应用app_id
	 * @param app_id
	 * @author huangbq
	 * @data 2014-12-4 下午2:32:53 
	 */
	  	
	public void setApp_id(int app_id) {
		this.app_id = app_id;
	}

	 
	/** 
	 * 判断是添加还是撤销标签
	 * @return addTag
	 * @author huangbq
	 * @data 2014-12-4 下午2:33:09 
	 */
	  	
	public boolean isAddTag() {
		return addTag;
	}

	 
	/** 
	 * 设置添加或删除标签
	 * @param addTag
	 * @author huangbq
	 * @data 2014-12-4 下午2:33:44 
	 */
	  	
	public void setAddTag(boolean addTag) {
		this.addTag = addTag;
	}


	 
	/** 
	 * 获取标签
	 * @return tag
	 * @author huangbq
	 * @data 2014-12-4 下午2:47:10 
	 */
	  	
	public String getTag() {
		return tag;
	}
	 
	/** 
	 * 设置标签
	 * @param tag
	 * @author huangbq
	 * @data 2014-12-4 下午2:47:23 
	 */
	  	
	public void setTag(String tag) {
		this.tag = tag;
	}

	 
	/** 
	 * 设置数据包类型
	 * @author huangbq
	 * @data 2014-12-4 下午3:34:02 
	 */
	  	
	public void setMsgType() {
		msgType = MsgType.TAG_SET_MSG;
	}


	 
	/** 
	 * 获取设备id
	 * @return device_id
	 * @author huangbq
	 * @data 2014-12-10 下午4:41:55 
	 */
	  	
	public String getDevice_id() {
		return device_id;
	}


	 
	/** 
	 * 设置设备id
	 * @param device_id
	 * @author huangbq
	 * @data 2014-12-10 下午4:42:14 
	 */
	  	
	public void setDevice_id(String device_id) {
		this.device_id = device_id;
	}
	
	

}
