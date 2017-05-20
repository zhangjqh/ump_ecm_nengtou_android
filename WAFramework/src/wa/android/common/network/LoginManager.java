package wa.android.common.network;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import wa.android.common.App;
import wa.android.common.AppConfig;
import wa.android.common.Module;
import wa.android.common.utils.PreferencesUtil;
import wa.android.constants.CommonServers;
import wa.android.constants.CommonWAPreferences;
import android.content.Context;
import android.util.Log;

public class LoginManager {
	
//	private String username = null;
//	private String password = null;
//	private DeviceInfoVO deviceInfo = null;
	protected Context context = null;
		
	protected static final String LOGIN = "login";
	protected static final String WA00001 = "WA00001";
	protected static final String LOGIN_SESSION = "LOGIN_SESSION";
	public static final String LOGIN_SESSION_4POLL = "LOGIN_SESSION_4POLL";
	
	protected RequestListener defaultListener = null;
	
	protected RequestListener cacheListener = null;
	
	public LoginManager(Context context) {
		this.context = context;
		defaultListener = new LoginListener();	
	}
	public void init3() {

		defaultListener = new LoginListener();		
	}
	public void requestRelogin(RequestListener listener){
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
		Log.d(getClass().getSimpleName(), "登录：调用重登录功能");
		//构造登录的Request
		WALoginRequestVO loginRequest = new WALoginRequestVO(defaultListener, jsonDeviceInfo, username, password);
		//发送数据
		App.getNetworkInstance().request(
				CommonServers.getServerAddress(context) + 
				CommonServers.SERVER_SERVLET_LOGIN, 
				loginRequest);
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
		WALoginRequestVO loginRequest = new WALoginRequestVO(defaultListener, jsonDeviceInfo, username, password);
		//处理主模块添加数据
		//Module mainModule = ((App)context.getApplicationContext()).getConfig().getMainModule();
		//mainModule.appendRequestVO(loginRequest);
		//发送数据
		App.getNetworkInstance().request(
				CommonServers.getServerAddress(context) + 
				CommonServers.SERVER_SERVLET_LOGIN, 
				loginRequest);
	}
	

	
	boolean checkLoginState(WARequestVO vo) {
		WAReqActionVO actionVO = vo.getReqActionVO(WA00001, 0);
		WAResActionVO resVO = actionVO.resActionVO;
		int flag = resVO.flag;
		if (flag == 0) {
			 serviceInfo = new ArrayList<ServiceInfo>();
			//获取usrid，groupid和servicecode
			for (WAResStructVO res : resVO.responseList) {
				if (res.returnValue == null) {
					break;
				} else {
					ServiceInfo info = new ServiceInfo();
					info.servicecode = res.serviceCode;
					info.productid = res.productid;
					Map tempMap = (Map)res.returnValue.get(0);
					tempMap = (Map)tempMap.get("login");
					info.usrid = (String)tempMap.get("usrid");
					info.groupid = (String)tempMap.get("groupid");
					serviceInfo.add(info);
				}
			}
			JSONObject loginSession = serviceInfoList2JSONObject();
			String toSave = loginSession.toString();
			PreferencesUtil.writePreference(context, LOGIN_SESSION, toSave);
			JSONArray serviceInfos = ServiceInfo.toJSONArray(serviceInfo);
			PreferencesUtil.writePreference(context, LOGIN_SESSION_4POLL, serviceInfos.toString());
			alreadyLogin = true;
			Log.d(getClass().getSimpleName(), "登录：（重）登录成功");
			return true;
		} else {
			Log.d(getClass().getSimpleName(), "登录：（重）登录失败");
			return false;
		}
	}
	//用来保存服务器返回的service信息，在登录时使用
	private List<ServiceInfo> serviceInfo = new ArrayList<ServiceInfo>();
	/**
	 * 将服务器信息转变为JSON对象
	 * @return
	 */
	private JSONObject serviceInfoList2JSONObject(){
		try {
			JSONObject loginSession = new JSONObject();
			JSONArray serviceloginInfo = ServiceInfo.toJSONArray(serviceInfo);
			loginSession.put("servicelogininfo", serviceloginInfo);
			loginSession.put("enterpriseid", "");
			return loginSession;
		} catch (JSONException e) {
			e.printStackTrace();
			return null;
		}
	}
	class LoginListener implements RequestListener{

		@Override
		public void onRequested(WARequestVO vo) {
			checkLoginState(vo);
			cacheListener.onRequested(vo);
			cacheListener = null;
		}

		@Override
		public void onRequestFailed(int code) {
			cacheListener.onRequestFailed(code);
		}
	}

	class WALoginRequestVO extends WARequestVO{
		private JSONObject jsonDeviceInfo = null;
		private JSONObject loginSession = null;
		
		public WALoginRequestVO(RequestListener listener, JSONObject deviceinfo, String username, String password) {
			super(listener);
			//初始化Session
			String defaultSession = PreferencesUtil.readPreference(context, LoginManager.LOGIN_SESSION);
			if (defaultSession == null || defaultSession.length() == 0) {
				defaultSession = "{\"servicelogininfo\":[],\"enterpriseid\":\"\"}}}";
			}
			try {
				loginSession = new JSONObject(defaultSession);
			} catch (JSONException e) {
				e.printStackTrace();
			}
			//初始化设备信息
			jsonDeviceInfo = deviceinfo;
			WAReqActionVO loginAction = new WAReqActionVO(LoginManager.LOGIN);
//					WAReqActionVO.createCommonActionVO(LoginManager.LOGIN);
			loginAction.addPar("usrcode", username);
			loginAction.addPar("password", password);
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			if (AppConfig.getAPP_VERSION().equals("0.7")) {
				loginAction.addPar(
						"groupid",
						PreferencesUtil.readPreference(context, CommonWAPreferences.GROUP_ID)!= null ? PreferencesUtil.readPreference(context, CommonWAPreferences.GROUP_ID) : "");
			} else {
				loginAction.addPar("groupid", "");
			}
			loginAction.addPar("usrid", "");
			loginAction.addPar("date", sdf.format(new Date(System.currentTimeMillis())));
			addWAActionVO(LoginManager.WA00001, loginAction);
		}
		
		@Override
		protected JSONObject toJSONData() throws JSONException{
			JSONObject ret = super.toJSONData();
			ret.getJSONObject("wacomponents").put("deviceinfo", jsonDeviceInfo);
			ret.getJSONObject("wacomponents").put("session", loginSession);
			return ret;
		}
		
	}
	
	protected boolean alreadyLogin = false;
	public void requestForceLogin(RequestListener listener){
		requestLogin(listener);
	}

	public boolean alreadyLogin() {
		return alreadyLogin;
	}



} 