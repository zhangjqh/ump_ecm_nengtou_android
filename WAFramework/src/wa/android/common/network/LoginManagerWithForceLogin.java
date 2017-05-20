package wa.android.common.network;

import org.json.JSONException;
import org.json.JSONObject;

import wa.android.common.App;
import wa.android.common.Module;
import wa.android.common.utils.PreferencesUtil;
import wa.android.constants.CommonServers;
import wa.android.constants.CommonWAPreferences;
import android.content.Context;
import android.util.Log;

public class LoginManagerWithForceLogin extends LoginManager {
	
	
	public LoginManagerWithForceLogin(Context context) {
		super(context);
	}

	/**
	 * 登录方法
	 * @param listener 		外部处理登录成功的监听器
	 */
	public void requestLogin(RequestListener listener) {
		String username = PreferencesUtil.readPreference(context, CommonWAPreferences.USER_NAME);
		String password = PreferencesUtil.readPreference(context, CommonWAPreferences.USER_PASS);
		String strdeviceInfo = PreferencesUtil.readPreference(context, CommonWAPreferences.DEVICE_INFO);
		JSONObject jsonDeviceInfo = null;
		try {
			jsonDeviceInfo = new JSONObject(strdeviceInfo);
			jsonDeviceInfo.put("devlanguage", DeviceInfoVO.getLanguageString());
		} catch (JSONException e) {
			//不应该执行到这里
			e.printStackTrace();
		}
		alreadyLogin = false;
		//保存监听器的信息
		cacheListener = listener;
		Log.d(getClass().getSimpleName(), "登录：调用登录功能");
		//构造登录的Request
		WALoginRequestVO loginRequest = new WAForceLoginRequestVO(defaultListener, jsonDeviceInfo, username, password, false);
		//处理主模块添加数据
		Module mainModule = ((App)context.getApplicationContext()).getConfig().getMainModule();
		mainModule.appendRequestVO(loginRequest);
		//发送数据
		App.getNetworkInstance().request(
				CommonServers.getServerAddress(context) + 
				CommonServers.SERVER_SERVLET_LOGIN, 
				loginRequest);
	}

	class WAForceLoginRequestVO extends WALoginRequestVO{
		public WAForceLoginRequestVO(RequestListener listener, JSONObject deviceinfo, String username, String password, boolean forceLogin) {
			super(listener, deviceinfo, username, password);
			
			WAReqActionVO loginActionVO = this.getReqActionVO(LoginManagerWithForceLogin.WA00001, 0);
			loginActionVO.addPar("forcelogin", forceLogin ? "Y" : "N");
		}
	}
	

	@Override
	public void requestForceLogin(RequestListener listener){
		String username = PreferencesUtil.readPreference(context, CommonWAPreferences.USER_NAME);
		String password = PreferencesUtil.readPreference(context, CommonWAPreferences.USER_PASS);
		String strdeviceInfo = PreferencesUtil.readPreference(context, CommonWAPreferences.DEVICE_INFO);
		JSONObject jsonDeviceInfo = null;
		try {
			jsonDeviceInfo = new JSONObject(strdeviceInfo);
			jsonDeviceInfo.put("devlanguage", DeviceInfoVO.getLanguageString());
		} catch (JSONException e) {
			//不应该执行到这里
			e.printStackTrace();
		}
		alreadyLogin = false;
		//保存监听器的信息
		cacheListener = listener;
		Log.d(getClass().getSimpleName(), "登录：调用强制登录功能");
		//构造登录的Request
		WALoginRequestVO loginRequest = new WAForceLoginRequestVO(defaultListener, jsonDeviceInfo, username, password, true);
		//处理主模块添加数据
		Module mainModule = ((App)context.getApplicationContext()).getConfig().getMainModule();
		mainModule.appendRequestVO(loginRequest);
		//发送数据
		App.getNetworkInstance().request(
				CommonServers.getServerAddress(context) + 
				CommonServers.SERVER_SERVLET_LOGIN, 
				loginRequest);
	}

} 
