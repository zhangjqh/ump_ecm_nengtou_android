package wa.android.libs.poll.data;


import android.content.Context;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.telephony.TelephonyManager;

public class DeviceInfoVO {

	private String wfaddress;
	private String imei;

	
	/**
	 * 
	 * 获得设备信息 生成对应的VO
	 * 
	 * @return
	 */
	public DeviceInfoVO(Context context) {
		
		
		// 获取imei
		// 权限<uses-permission android:name="android.permission.READ_PHONE_STATE"/>
		TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(Context.TELEPHONY_SERVICE);
		imei = telephonyManager.getDeviceId();
		
		// 获取wifi地址
		// <uses-permission android:name="android.permission.ACCESS_WIFI_STATE"/>
		WifiManager wifiManager = (WifiManager) context.getSystemService(Context.WIFI_SERVICE);// 获取WifiManager
		WifiInfo wifiInfo = wifiManager.getConnectionInfo();
		wfaddress = (wifiInfo == null ? null : wifiInfo.getMacAddress());
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		if (imei != null) {
			sb.append(imei);
		}
		if (wfaddress != null) {
			sb.append(wfaddress);
		}
		return sb.toString();
	}
}
