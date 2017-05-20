package wa.android.common;

import android.content.Context;
import android.content.Intent;
import wa.android.common.network.WARequestVO;

/**
 * 模块 用来承载业务模块的主类等信息
 * 
 * @author Omi
 * 
 */
public class Module {

	@SuppressWarnings("rawtypes")
	protected Class mainClazz;
	protected String moduleName;
	protected String title; // 显示在主面板的名称
	protected int iconResId;

	/**
	 * 构造
	 * 
	 * @param moduleName
	 * @param mainClazz
	 */
	@SuppressWarnings("rawtypes")
	public Module(String moduleName, Class mainClazz) {
		this.mainClazz = mainClazz;
		this.moduleName = moduleName;
	}

	/**
	 * 获得Module的主类
	 * 
	 * @return
	 */
	public Class<?> getMainClazz() {
		return mainClazz;
	}

	public void setMainClazz(Class<?> mainClazz) {
		this.mainClazz = mainClazz;
	}

	public String getModuleName() {
		return moduleName;
	}

	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * 在系统登录时，期望与loginVO封装在一起的请求VO 构造方式参考数据结构及sample
	 * 
	 * @return
	 */
	//!TODO:这个名字有歧义，需要换一个
	public void appendRequestVO(WARequestVO request) {
	}

	/**
	 * 当多个module存在时，将会使用此资源id作为模块在主面板的图标
	 * 
	 * @return
	 */
	public int getIconResId() {
		return iconResId;
	}

	public void setIconResId(int iconResId) {
		this.iconResId = iconResId;
	}

	/**
	 * 
	 * just after login successfully
	 * @param waComponentInstancesVO 
	 * 
	 */
	public void onLoginSuccessfully(WARequestVO actionVO, Context context){
		Intent intent = new Intent(context, getMainClazz());
		context.startActivity(intent);
	}
	
	public void putGlobalVariable(Context context, String key, Object value){
		((App)context.getApplicationContext()).addGlobalVariable(key, value);
	}
}