package wa.android.common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

import wa.android.common.activity.BaseActivity;
import wa.android.common.activity.WelcomeActivity;
import wa.android.common.network.LoginManager;
import wa.android.common.network.Network;
import wa.android.common.versioncheck.VersionInfo;
import wa.android.constants.CommonWAIntents;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * App
 * @version nc6.3
 */
public abstract class App extends Application {

	//添加存储全局变量容器
	private Map<String, Object> globalVariables = new HashMap<String, Object>();
	//app配置信息变量
	public static AppConfig config = new AppConfig();
	// admin modules
	public static List<Module> moduleList = new ArrayList<Module>();

	public Intent intentServiceStart = null;
	
	private Stack<BaseActivity> activityList = null;
	//用于session失效后的重新登录的后的业务请求
	public static boolean spec = false;
	
	//用于先前改过的json接口和现在的josn接口的区分
	public static boolean bnm = false;
	private BaseActivity topActivity = null;
	//版本检测start
			private VersionInfo versionInfo  = null;
			protected int[] appVersion = {1,0} ; 
			
			public int[] getAppVersion() {
				return appVersion;
			}

			public void setAppVersion(int[] appVersion) {
				this.appVersion = appVersion;
			}

			public VersionInfo getVersionInfo() {
				return versionInfo;
			}

			public void setVersionInfo(VersionInfo versionInfo) {
				this.versionInfo = versionInfo;
			}
			//版本检测end

	public void addActivity(BaseActivity activity) {
		if (!activity.isEscapeActivity()) {
			activityList.push(activity);
			topActivity = activity;
		}
	}
	
	public void removeActivity(BaseActivity activity){
		activityList.remove(activity);
		if (activityList.isEmpty()) {
			topActivity = null;
		} else {
			topActivity = activityList.peek();
		}
	}
	
	public BaseActivity getTopActivity(){
		Log.d("Application-TopActivity:", topActivity.toString());
		return topActivity;
	}
	
	public boolean isRunning(){
		for (Activity a : activityList) {
			Log.d("DDDDDDDDDDDDDD", a.toString());
		}
		if (activityList.size() == 0) return false;
		if (activityList.size() == 1 && (activityList.get(0) instanceof WelcomeActivity)) {
			return false;
		}
		return true;
	}
	
	public boolean isLogin(){
		boolean ret = false;
		for (BaseActivity activity : activityList) {
			if (activity.isSystemActivity())  {
				continue;
			} else {
				ret = true;
				break;
			}
		}
		return ret;
	}
	
	@Override
	public void onCreate() {
		super.onCreate();
		activityList = new Stack<BaseActivity>();
		loadModules(moduleList);
		initConfig();
		networkInstance = new Network(this);
		loginManager = defLoginManager();
	}

	public AppConfig getConfig() {
		return config;
	}

	/**
	 * 获取某个全局变量
	 * @param key
	 * @return 如果没有值则返回null
	 */
	public Object getGlobalVariables(String key) {
		return globalVariables.get(key);
	}
	
	public Object removeGlobalVariable(String key) {
		return globalVariables.remove(key);
	}
	/**
	 * 添加某个全局变量
	 * @param key
	 * @param value
	 */
	public void addGlobalVariable(String key, Object value) {
		globalVariables.put(key, value);
	}
	
	protected abstract void loadModules(List<Module> moduleList);
	protected abstract void initConfig();
	
	private static Network networkInstance = null;
	public static Network getNetworkInstance(){
		return networkInstance;
	}
	
	private static LoginManager loginManager = null;
	public static LoginManager getLoginManager() {
		return loginManager;
	}
	/**
	 * 处理在已运行，已登录状态下的推送
	 * 
	 * @param intent
	 */
	public void processNotification(BaseActivity context) {
		Log.d("processNotification", "processor=" + processor + ";intentServiceStart=" + intentServiceStart);
		if (processor != null && intentServiceStart != null) {
			processor.processNotificationIntent(intentServiceStart, getTopActivity());
			intentServiceStart = null;
		}
	}
	private NotificationProcessor processor = null;
	public void setNotificationProcessor(NotificationProcessor processor) {
		this.processor = processor;
	}
	
	public boolean debugNotification(){
		return false;
	}
	
	/**
	 * 如有必要，重载此方法，可更换登录界面
	 * @param context
	 * @param appversion
	 * @return
	 */
	public Intent getLoginActivityIntent(Context context, String appversion){
		return CommonWAIntents.getLOGIN_ACTIVITY(context , AppConfig.getAPP_VERSION());
	}
	
	/**
	 * 如有必要，重载此方法，可更换登录器
	 * @return
	 */
	protected LoginManager defLoginManager(){
		return new LoginManager(this);
	}


}
