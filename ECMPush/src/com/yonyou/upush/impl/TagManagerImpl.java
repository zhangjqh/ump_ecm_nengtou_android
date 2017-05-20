
/**   
 * @Title: TagManagerImpl.java 
 * @Package: com.yonyou.upush.impl 
 * @Description: TODO
 * @author Administrator  
 * @date 2014-12-5 下午4:05:41 
 * @version 1.3.1 
 */


package com.yonyou.upush.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

import com.yonyou.protocol.Constants;
import com.yonyou.protocol.Tag;
import com.yonyou.pushclient.PushServiceManager;
import com.yonyou.upush.interf.TagManager;

/** 
 *
 * @package com.yonyou.upush.impl
 * @author huangbq
 * @date 2014-12-5 下午4:05:41 
 */

public class TagManagerImpl implements TagManager {
	
	/** android 组件*/
	private Context context = null;
	/** 当前获得的标签列表*/
	private Set<String> tags = null;
	/** 应用读写共享sharedpreferences*/
	private static SharedPreferences sharedPref = null;
	/** 标签集Set<String> tags 存储标识常量*/
	public final static String TAGS_KEY = "tags_key";
	
	public TagManagerImpl (Context context) {
		this.context = context;
		tags = new HashSet<String>();
		sharedPref = PushServiceManager.getSharedPreferences();
		init();
	}

	/**
	 * Description 
	 * @param tag 
	 * @see com.yonyou.upush.interf.TagManager#addTag(java.lang.String) 
	 */

	@Override
	public void addTag(String tag) {
		// 参数检查
		if (null == tag || tag.isEmpty()) {
			return;
		}
		// 创建标签设置协议
		Tag tagSet = new Tag();
		tagSet.setAddTag(true);
		tagSet.setApp_id(Constants.getApp_id());
		tagSet.setTag(tag);
		tagSet.setDevice_id(Constants.getDevice_id());
		// 发送TAG设置广播
		Intent intent = new Intent(Constants.getActionTagSet());
		intent.putExtra(Constants.getExtraKeyTagSet(), tagSet);
		context.sendBroadcast(intent);	
		// 跟新缓存
		tags.add(tag);
		Editor editor = sharedPref.edit();
		editor.putStringSet(TAGS_KEY, tags);
		editor.commit();
	}

	/**
	 * Description 
	 * @param tags 
	 * @see com.yonyou.upush.interf.TagManager#addTags(java.util.ArrayList) 
	 */

	@Override
	public void addTags(ArrayList<String> tags) {
		// 参数检查
		if (null == tags || tags.isEmpty()) {
			return;
		}
		// 添加标签
		for (String tag : tags) {
			addTag(tag);
		}
	}

	/**
	 * Description 
	 * @param tag 
	 * @see com.yonyou.upush.interf.TagManager#deleteTag(java.lang.String) 
	 */

	@Override
	public void deleteTag(String tag) {
		// 参数检查
		if (null == tag || tag.isEmpty()) {
			return;
		}
		// 删除标签
		Tag tagSet = new Tag();
		tagSet.setAddTag(false);
		tagSet.setApp_id(Constants.getApp_id());
		tagSet.setTag(tag);
		tagSet.setDevice_id(Constants.getDevice_id());
		Intent intent = new Intent(Constants.getActionTagSet());
		intent.putExtra(Constants.getExtraKeyTagSet(), tagSet);
		context.sendBroadcast(intent);
		// 更新缓存
		tags.remove(tag);
		Editor editor = sharedPref.edit();
		editor.putStringSet(TAGS_KEY, tags);
		editor.commit();
	}

	/**
	 * Description 
	 * @param tags 
	 * @see com.yonyou.upush.interf.TagManager#deleteTags(java.util.ArrayList) 
	 */

	@Override
	public void deleteTags(ArrayList<String> tags) {
		// 参数检查
		if (null == tags || tags.isEmpty()) {
			return;
		}
		// 删除标签
		for (String tag : tags) {
			deleteTag(tag);
		}
	}

	/**
	 * Description 
	 * @return 
	 * @see com.yonyou.upush.interf.TagManager#currentTags() 
	 */

	@Override
	public ArrayList<String> currentTags() {
		ArrayList<String> tagList = new ArrayList<String>();
		String[] tagsArray = null;
		if (null != tags && !tags.isEmpty()) {
			tagsArray = new String[tags.size()];
			tags.toArray(tagsArray);
			for (String tag : tagsArray) {
				tagList.add(tag);
			}
			return tagList;
		}
		return null;
	}

	/**
	 * Description 
	 * @param tag
	 * @return 
	 * @see com.yonyou.upush.interf.TagManager#isUsed(java.lang.String) 
	 */

	@Override
	public boolean isUsed(String tag) {
		// 参数检查
		if (null == tag || tag.isEmpty()) {
			return false;
		}
		return tags.contains(tag);
	}

	 
	 
	/** 
	 * 初始化
	 * @author huangbq
	 * @data 2014-12-9 下午1:29:41 
	 */
	  	
	private void init() {
		// 标签集 tags
		tags = sharedPref.getStringSet(TAGS_KEY, tags);
	}
	/** 
	 * 模块清理
	 * @author huangbq
	 * @data 2014-12-9 下午1:29:07 
	 */
	  	
	public void clearup() {
		this.context = null;
		this.tags = null;
	}
	
}
