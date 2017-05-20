package wa.android.common;

import java.util.ArrayList;
import java.util.List;

import wa.android.common.activity.SettingOption;

/**
 * app配置类
 * 包括了app的基本配置信息，请求头信息，服务器信息，版本信息，这些在一个版本的信息是不变的
 * 还有动态配置信息，具体某个应用的欢迎界面、关于界面、图标、登录后的跳转界面、设置的动态项都是可配置的，由具体某个app的开发
 * 人员自己设置
 * @version nc6.3
 */
public class AppConfig {
	//图标、欢迎界面、关于界面、登录后跳转的界面
	private int iconResId;
	private int welcomeResId;
	private int aboutResId;
	private Module mainModule;
	
	//App信息
	private static String appId;
	public final static float APPVERSION = 1.0f;

	//请求头信息，在一个版本的app中这些是不可变的，设置为常量
	public final static String APP_ID = "1.0";	//for headerList
	public final static String APP_LV = "0.7";	//NC57
	public final static String APP_HV = "2.0";	//NC63
	public final static String ENTERPRISEID = "";
	public final static String TRANSLATTETYPE = "jobject";
	
	//服务器的信息，在一个版本中是不可变的，设置为常量
	public final static String APP_SERVER_NAME = "wa";
	public final static String APP_SERVER_VERSION = "";
	public static String APP_VERSION = "";
	private List<Module> modulelist;
	private String exceptiondesc = "";
	public static String getAPP_VERSION() {
		return APP_VERSION;
	}

	public static void setAPP_VERSION(String aPP_VERSION) {
		APP_VERSION = aPP_VERSION;
	}

	//app设置界面动态项
	private List<SettingOption> setOptions = new ArrayList<SettingOption>();

	public int getIconResId() {
		return iconResId;
	}

	public void setIconResId(int iconResId) {
		this.iconResId = iconResId;
	}

	public int getWelcomeResId() {
		return welcomeResId;
	}

	public void setWelcomeResId(int welcomeResId) {
		this.welcomeResId = welcomeResId;
	}

	public List<SettingOption> getSetOptions() {
		return setOptions;
	}

	public void setSetOptionsList(List<SettingOption> setOptions) {
		this.setOptions = setOptions;
	}

	public static String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public int getAboutResId() {
		return aboutResId;
	}

	public void setAboutResId(int aboutResId) {
		this.aboutResId = aboutResId;
	}

	public Module getMainModule() {
		return mainModule;
	}

	public void setMainModule(Module mainModule) {
		this.mainModule = mainModule;
	}

	public List<Module> getModulelist() {
		return modulelist;
	}

	public void setModulelist(List<Module> modulelist) {
		this.modulelist = modulelist;
	}

	public String getExceptiondesc() {
		return exceptiondesc;
	}

	public void setExceptiondesc(String exceptiondesc) {
		this.exceptiondesc = exceptiondesc;
	}

	
}
