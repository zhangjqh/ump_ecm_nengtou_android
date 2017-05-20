
/**   
 * @Title: TagManager.java 
 * @Package: com.yonyou.upush.interf 
 * @Description: TODO
 * @author Administrator  
 * @date 2014-12-5 下午2:47:35 
 * @version 1.3.1 
 */


package com.yonyou.upush.interf;

import java.util.ArrayList;

/** 
 * 标签管理
 * @package com.yonyou.upush.interf
 * @author huangbq
 * @date 2014-12-5 下午2:47:35 
 */

public interface TagManager {
	
	 
	/** 
	 * 添加标签
	 * @param tag
	 * @author huangbq
	 * @data 2014-12-5 下午3:59:14 
	 */
	  	
	public void addTag(String tag);
	 
	/** 
	 * 批量添加标签
	 * @param tags
	 * @author huangbq
	 * @data 2014-12-5 下午3:59:34 
	 */
	  	
	public void addTags(ArrayList<String> tags);
	 
	/** 
	 * 删除标签
	 * @param tag
	 * @author huangbq
	 * @data 2014-12-5 下午3:59:46 
	 */
	  	
	public void deleteTag(String tag);
	 
	/** 
	 * 批量删除标签
	 * @param tags
	 * @author huangbq
	 * @data 2014-12-5 下午3:59:58 
	 */
	  	
	public void deleteTags(ArrayList<String> tags);
	 
	/** 
	 * 当前已经获得的标签
	 * @return ArrayList<String> 标签列表
	 * @author huangbq
	 * @data 2014-12-5 下午4:00:10 
	 */
	  	
	public ArrayList<String> currentTags();
	 
	/** 
	 * 当前是否获得了某标签
	 * @param tag
	 * @return boolean
	 * @author huangbq
	 * @data 2014-12-5 下午4:00:48 
	 */
	  	
	public boolean isUsed(String tag);

}
