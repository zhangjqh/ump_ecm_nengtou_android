package wa.android.common.network;

import java.text.NumberFormat;
import java.util.Locale;

import org.json.JSONException;
import org.json.JSONObject;

import wa.android.common.App;
import wa.android.common.AppConfig;

import android.content.Context;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.util.Log;
import android.app.Activity;

public class DeviceInfoVO {

	public String wfaddress;
	public String deviceid;
	public String btaddress;
	public String ip;
	public String serial;
	public String iccid;
	public String imei;
	public String os;
	public String osversion;
	public String type;
	public String devicetype;
	public String carrier;
	public String devlanguage;
	public String imsi;
	public String phonenumber;
	public String appid;
	public float appversion;
	public String screensi;
	public String resolution;
	public String devicetoken;

	/**
	 * {"wacomponents":{ 
	 * 		"deviceinfo":{
	 * 			"devicetype":"iPhone Simulator",
	 * 			"os":"ios",
	 *			"resolution":"480*320",
	 *			"appversion":"1.0",
	 * "osversion":"6.0", "devlanguage":"zh-Hans", "screensi":"3.5", "imei":"",
	 * "appid":"USTASKREPT120926B", "wfaddress":"40:6C:8F:22:DD:8A" }
	 * 
	 * @return
	 * @throws Exception
	 */
	public JSONObject toJSONObject(){
		JSONObject object = new JSONObject();
		try {
			object.put("devicetype", devicetype);
			object.put("os", os);
			object.put("resolution", resolution);
			object.put("appversion", appversion);
			object.put("osversion", osversion);
			object.put("devlanguage", devlanguage);
			object.put("screensi", screensi);
			object.put("imei", imei);
			object.put("appid", appid);
			object.put("wfaddress", wfaddress);
			return object;
		} catch (JSONException e) {
			Log.d(getClass().getName(), "构造设备信息时出现异常，检查代码");
			e.printStackTrace();
			return null;
		}

	}
	
	
	/**
	 * 
	 * 获得设备信息 生成对应的VO
	 * 
	 * @return
	 */
	public DeviceInfoVO(Activity context) {
		
		this.appid = ((App)context.getApplicationContext()).getConfig().getAppId();

		this.appversion = AppConfig.APPVERSION;
		this.carrier = "jobject";
		this.os = "android";
		
		// 获取手机分辨率
		DisplayMetrics dm = new DisplayMetrics();
		context.getWindowManager().getDefaultDisplay().getMetrics(dm);
		int width = dm.widthPixels;
		int height = dm.heightPixels;
		String dmString = height + "x" + width;
		
		this.resolution = dmString;
		
		// 获取实际尺寸
		double x = Math.pow(width / dm.xdpi, 2);
		double y = Math.pow(height / dm.ydpi, 2);
		double screenInches = Math.sqrt(x + y);
		NumberFormat nf = NumberFormat.getNumberInstance();
		nf.setMaximumFractionDigits(1);
		this.screensi = String.valueOf(nf.format(screenInches));
		
		// 获取imei
		// 权限<uses-permission android:name="android.permission.READ_PHONE_STATE"/>
		TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(Context.TELEPHONY_SERVICE);
		this.imei = telephonyManager.getDeviceId();
		
		// 获取操作系统版本
		this.osversion = android.os.Build.VERSION.RELEASE;

		this.type = "phone";
		

		// 获取wifi地址
		// <uses-permission android:name="android.permission.ACCESS_WIFI_STATE"/>
		WifiManager wifiManager = (WifiManager) context.getSystemService(Context.WIFI_SERVICE);// 获取WifiManager
		WifiInfo wifiInfo = wifiManager.getConnectionInfo();
		String wfAddress = (wifiInfo == null ? "" : wifiInfo.getMacAddress());
		this.wfaddress = (wfAddress == null) ? "ff-22-33-44-55": wfAddress;
		
		this.devicetype = "android device"; //!TODO:
		
		// 获取当前的语言
		String language = Locale.getDefault().getLanguage().toLowerCase();
		//目前MA只支持如下四种
		//中文简体： zh-Hans
		//中文繁体： zh-Hant
		//法文： fr
		//英文： en
		Log.d(getClass().getSimpleName(), "获取设备语言：" + language);
		if ("zh".equals(language)) {
			String country = Locale.getDefault().getCountry().toLowerCase();
			Log.d(getClass().getSimpleName(), "获取设备国家/地区：" + country);
			if ("cn".equals(country)) {
				//简体中文
				this.devlanguage = "zh-Hans";
			} else {
				//繁体中文
				this.devlanguage = "zh-Hant";
			}
		} else if ("en".equals(language) ||
				"fr".equals(language)) {
			this.devlanguage = language;
		} else {
			this.devlanguage = "en";
		}
	}
	
	
	public static String getLanguageString(){
		String lang = null;
		// 获取当前的语言
		String language = Locale.getDefault().getLanguage().toLowerCase();
		//目前MA只支持如下四种
		//中文简体： zh-Hans
		//中文繁体： zh-Hant
		//法文： fr
		//英文： en
		Log.d("DeviceInfoVO", "获取设备语言：" + language);
		if ("zh".equals(language)) {
			String country = Locale.getDefault().getCountry().toLowerCase();
			Log.d("DeviceInfoVO", "获取设备国家/地区：" + country);
			if ("cn".equals(country)) {
				//简体中文
				lang = "zh-Hans";
			} else {
				//繁体中文
				lang = "zh-Hant";
			}
		} else if ("en".equals(language) ||
				"fr".equals(language)) {
			lang = language;
		} else {
			lang = "en";
		}
		return lang;
	}
}
