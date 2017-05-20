package wa.android.common.network;

import java.io.UnsupportedEncodingException;

import org.apache.http.Header;
import org.apache.http.message.BasicHeader;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import wa.android.common.App;
import wa.android.common.AppConfig;
import wa.android.common.R;
import wa.android.common.network.HTTPHandler.HttpListener;
import wa.android.common.network.NetworkEncodeUtil.DataProcessOrder;
import wa.android.common.utils.JSONUtil;
import wa.android.common.utils.PreferencesUtil;
import wa.android.constants.CommonWAPreferences;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.widget.Toast;

/**
 * 本类用于处理所有网络传输的处理
 * 
 * 网络传输使用的格式为JSON
 * 
 * @author 徐波<xubob@yonyou.com>
 * 
 */
public class Network implements HttpListener {
	private static JSONObject jsonSession = null;

	private Header[] headerList = null;
	private static Header[] responseheaderlist = null;

	// NetworkConfig，修改这里的信息会改变HTTP头中的信息
	// 是否加密
	private boolean isEncrypt = false;
	// 是否压缩
	private boolean isCompress = false;
	// 加密算法，1表示使用GZIP
	private int encryptiontype = 1;
	// 数据加工次序
	private DataProcessOrder dpOrder = DataProcessOrder.ENCRYPT_FIRST;
	// 数据传输协议版本
	private String translateversion = "1.1";
	// 数据传输协议
	private String translatetype = "json";

	private Context context = null;

	public static Header[] getResponseHeaderList() {
		return responseheaderlist;
	}

	/**
	 * 构造Network对象
	 * 
	 * @param context
	 */
	public Network(Context context) {
		this.context = context;
		initHeader();
	}

	/**
	 * 初始化HTTP头，不再每次都重新构造
	 */
	private void initHeader() {
		headerList = new Header[7];
		// 是否压缩
		headerList[0] = new BasicHeader("compress", isCompress ? "Y" : "N");
		// 是否加密
		headerList[1] = new BasicHeader("encryption", isEncrypt ? "Y" : "N");
		// 加密类型
		headerList[2] = new BasicHeader("encryptiontype", String.valueOf(encryptiontype));
		// 加密压缩次序
		headerList[3] = new BasicHeader("comencorder", String.valueOf(dpOrder));
		// 传输协议格式
		headerList[4] = new BasicHeader("translatetype", translatetype);
		// 传输协议版本
		headerList[5] = new BasicHeader("translateversion", translateversion);
		// 暂时无用，放N
		headerList[6] = new BasicHeader("contaiver", "N");
	}

	public void requestPreLogin(String url, RequestListener listener) {
		Header[] preLoginHeaderList = new Header[headerList.length + 4];
		System.arraycopy(headerList, 0, preLoginHeaderList, 0, headerList.length);
		BasicHeader h9 = new BasicHeader("apphv", AppConfig.APP_HV);
		BasicHeader h10 = new BasicHeader("appid", AppConfig.getAppId());
		BasicHeader h11 = new BasicHeader("applv", AppConfig.APP_LV);
		BasicHeader h12 = new BasicHeader("enterpriseid", AppConfig.ENTERPRISEID);
		preLoginHeaderList[headerList.length] = h9;
		preLoginHeaderList[headerList.length + 1] = h10;
		preLoginHeaderList[headerList.length + 2] = h11;
		preLoginHeaderList[headerList.length + 3] = h12;

		WARequestVO request = new WARequestVO(listener);
		byte[] data = null;
		String str = null;
		try {
			JSONObject jsonobject = request.toJSONData();
			str = jsonobject.toString();
			Log.d("PreLogin", str);
			data = str.getBytes("utf-8");
		} catch (UnsupportedEncodingException e) {
			data = str.getBytes();
			e.printStackTrace();
		} catch (JSONException e) {
			e.printStackTrace();
		}

		byte[] requestData = NetworkEncodeUtil.encode(data, isEncrypt, encryptiontype, isCompress,
				dpOrder);
		HTTPHandler http = new HTTPHandler(url, requestData, preLoginHeaderList, this, request);
		http.start();
	}

	/**
	 * 处理最复杂的请求
	 * 
	 * @param url
	 * @param requestVO
	 * @throws Exception
	 */
	public void request(String url, WARequestVO requestVO) {
		Log.d(getClass().getSimpleName(), "网络：开始-普通请求");
		if (!isRequesting()) {
			setIsRequesting(true);
			request0(url, requestVO, this);
		} else {
			Log.d(getClass().getSimpleName(), "网络：忽略重复的网络请求");
		}
	}

	public void request1(String url, WARequestVO requestVO, boolean jsonversion) {
		Log.d(getClass().getSimpleName(), "网络：开始-普通请求");
		if (!isRequesting()) {
			setIsRequesting(true);
			if (jsonversion) {
				App.bnm = jsonversion;
				App.spec = true;
				headerList[5] = new BasicHeader("translateversion", "1.1");

			} else {
				App.bnm = jsonversion;
				App.spec = false;
				headerList[5] = new BasicHeader("translateversion", "1.1");
			}
			request0(url, requestVO, App.getNetworkInstance());
		} else {
			Log.d(getClass().getSimpleName(), "网络：忽略重复的网络请求");
		}
	}

	private RequestSilence requestSilenceListener = new RequestSilence();

	// public void requestSilence(String url, String componentId, WAReqActionVO
	// actionVO, RequestListener listener) {
	// Log.d(getClass().getSimpleName(), "网络：开始-后台请求");
	// WARequestVO requestVO = new WARequestVO(listener);
	// requestVO.addWAActionVO(componentId, actionVO);
	// request0(url, requestVO, requestSilenceListener);
	// }

	public void requestSilence(String url, WARequestVO requestVO) {
		Log.d(getClass().getSimpleName(), "网络：开始-后台请求");
		request0(url, requestVO, requestSilenceListener);
	}

	private void request0(String url, WARequestVO requestVO, HttpListener listener) {
		requestVO.url = url;
		// 发送的数据包
		JSONObject toSend = null;
		String groupid = PreferencesUtil.readPreference(context, CommonWAPreferences.GROUP_ID);
		String usrid = PreferencesUtil.readPreference(context, CommonWAPreferences.USER_ID);
		String username = PreferencesUtil.readPreference(context, CommonWAPreferences.USER_NAME);
		String password = PreferencesUtil.readPreference(context, CommonWAPreferences.USER_PASS);
		String appid = PreferencesUtil.readPreference(context, "ECM_APPID");
		String strdeviceInfo = PreferencesUtil.readPreference(context, CommonWAPreferences.DEVICE_INFO);
		JSONObject jsonDeviceInfo = null;
		
		try {
			toSend = requestVO.toJSONData();
			//toSend.getJSONObject("wacomponents").put("session", jsonSession);
			jsonDeviceInfo = new JSONObject(strdeviceInfo);
			jsonDeviceInfo.put("devlanguage", DeviceInfoVO.getLanguageString());
			toSend.getJSONObject("wacomponents").put("deviceinfo", jsonDeviceInfo);
			toSend.getJSONObject("wacomponents").put("groupid", groupid);
			toSend.getJSONObject("wacomponents").put("usrid", usrid);
			toSend.getJSONObject("wacomponents").put("username", username);
			toSend.getJSONObject("wacomponents").put("password", password);
			toSend.getJSONObject("wacomponents").put("appid", appid);
			String jsonString = toSend.toString();
			Log.d(getClass().getSimpleName(), "网络：发送数据包内容：" + jsonString);
			byte[] postData = null;
			try {
				postData = jsonString.getBytes("utf-8");
			} catch (UnsupportedEncodingException e) {
				// 这个异常是据对不会出现的
				// 如果出现的话说明这个设备无法使用这个应用，且无解决方案
				Log.d(getClass().getSimpleName(), "SYS：JSON发送准备中发现不支持UTF-8");
				postData = jsonString.getBytes();
			}
			byte[] requestData = NetworkEncodeUtil.encode(postData, isEncrypt, encryptiontype,
					isCompress, dpOrder);
			HTTPHandler http = new HTTPHandler(url, requestData, headerList, listener, requestVO);
			http.start();
		} catch (Exception e) {
			e.printStackTrace();
			Log.d(getClass().getSimpleName(), "SYS：JSON发送准备中发现出现错误");
		}
	}

	// !TODO:这个好像不安全。没细想，再考虑
	protected boolean isRequesting = false;

	protected synchronized void setIsRequesting(boolean isRequesting) {
		this.isRequesting = isRequesting;
	}

	protected synchronized boolean isRequesting() {

		return isRequesting;
	}

	/**
	 * 本方法处理正常的HTTP返回中的数据 解密，解压缩、 然后交给JSON解析器
	 * 
	 * @param data
	 */
	@Override
	public void OnHttpOK(WARequestVO request, Header[] allheaders, byte[] data) {
		this.setIsRequesting(false);
		Network.responseheaderlist = allheaders;
		/*// 先处理http头，看是否session超时
		for (Header h : allheaders) {
			if ("Sessiontimout".equals(h.getName())) {
				Log.d(getClass().getSimpleName(), "网络：Session超时，调用自动登录过程");
				App.getLoginManager().requestRelogin(new ReloginListener(request));
				return;
			}
		}*/
		// 解密，解压缩
		byte[] responseData = NetworkEncodeUtil.decode(data, isEncrypt, encryptiontype, isCompress,
				dpOrder);
		String jsonString;
		try {
			jsonString = new String(responseData, "utf-8");
		} catch (UnsupportedEncodingException e) {
			// 这个异常是据对不会出现的
			// 如果出现的话说明这个设备无法使用这个应用，且无解决方案
			Log.d(getClass().getSimpleName(), "SYS：JSON接收处理中发现不支持UTF-8");
			jsonString = new String(responseData);

		}
		if ("".equals(jsonString)) {
			request.listener.onRequested(request);
		} else {
			// 装载JSON
			try {
				Log.d(getClass().getSimpleName(), jsonString);
				JSONObject jsonobject = new JSONObject(jsonString);
				// 处理JSONObject
				parseResultFromJSON(request, jsonobject);
			} catch (JSONException e) {
				Log.d(getClass().getSimpleName(), "网络数据处理：装载数据时发生错误" + e.getMessage());
				OnHttpFailed(request, RequestListener.REQUEST_FAILED_DATA);
				e.printStackTrace();
			}
		}
	}

	public static JSONObject getSession() {
		return jsonSession;
	}

	/**
	 * 本方法解析返回数据中的struct结构
	 * 
	 * @param jsonobject
	 */
	private void parseResultFromJSON(WARequestVO request, JSONObject jsonobject) {
		try {
			JSONObject root = jsonobject.getJSONObject("wacomponents");
			// 获取JSON
			JSONObject session = JSONUtil.getJSONObject(root, "session");
			if (session != null) {
				jsonSession = session;
			}
			JSONArray wacomponent = root.getJSONArray("wacomponent");
			request.parseFromJSON(wacomponent);
			request.listener.onRequested(request);
		} catch (JSONException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 处理网络传输中的各种非业务错误
	 * 
	 * @param reason
	 */
	@Override
	public void OnHttpFailed(WARequestVO request, int reason) {
		this.setIsRequesting(false);
		Log.d(getClass().getSimpleName(), "网络：请求失败：" + String.valueOf(reason));
		// 这里统一处理
		// 通知失败，给一个把等待框去掉的机会
		request.listener.onRequestFailed(reason);
		switch (reason) {
		case RequestListener.REQUEST_FAILED_CONNECTION:
			// 无法连接到服务器
			toastMsg(context.getString(R.string.networkUnavailable));
			break;
		case RequestListener.REQUEST_FAILED_TIMEOUT:
			// 连接超时
			if (!isNetworkConnected(context)) {
				toastMsg(context.getString(R.string.networkUnavailable));
			} else {
				toastMsg(context.getString(R.string.connectionTimeout));
			}
			break;
		case RequestListener.REQUEST_FAILED_WRONGURL:
			// 不正确的URL
			toastMsg(context.getString(R.string.illegalServerAddressError));
			break;
		case RequestListener.REQUEST_FAILED_DATA:
			// 解析数据时失败
			toastMsg(context.getString(R.string.illegalServerAddressOrAugumentError));
			break;
		case RequestListener.REQUEST_FAILED:
			// 其他错误
			toastMsg(context.getString(R.string.unknownError));
			break;
		}

	}

	public boolean isNetworkConnected(Context context) {
		if (context != null) {
			ConnectivityManager mConnectivityManager = (ConnectivityManager) context
					.getSystemService(Context.CONNECTIVITY_SERVICE);
			NetworkInfo mNetworkInfo = mConnectivityManager.getActiveNetworkInfo();
			if (mNetworkInfo != null) {
				return mNetworkInfo.isAvailable();
			}
		}
		return false;
	}

	// 虽然Toast及Dialog已经可以再UI线程中调用，但是为了调用更加统一，仍然使用handler的方式
	private final Handler handler = new Handler() {
		public void handleMessage(android.os.Message msg) {
			try {
				AlertDialog dialog = null;
				dialog = new AlertDialog.Builder(context).create();
				if (msg.obj != null) {
					dialog.setMessage((String) msg.obj);
				}
				dialog.setButton(context.getResources().getText(R.string.submit),
						new OnClickListener() {
							@Override
							public void onClick(DialogInterface dialog, int which) {
								dialog.dismiss();
							}
						});
				dialog.show();
			} catch (Exception e) {
				e.printStackTrace();
				Toast.makeText(context, (String) msg.obj, Toast.LENGTH_SHORT).show();
			}
		};
	};

	/**
	 * Toast 一个信息的工具方法
	 * 
	 * @param msgText
	 */
	protected void toastMsg(String msgText) {
		Message msg = new Message();
		msg.obj = new String(msgText);
		handler.sendMessage(msg);

	}

	/**
	 * 查看网络连接状态，如果没有任何wifi或gprs数据连接将提示用户设置网络连接
	 * 该检查并不会检查是否真的接入internet，而仅仅是检查本机连接是否开启、接入点是否有效。
	 * 
	 * @param onNetworkStatusCheckedListener
	 */
	protected boolean checkNetWorkStatus() {
		boolean isNetworkAvilable = false;
		ConnectivityManager cwjManager = (ConnectivityManager) context
				.getSystemService(Context.CONNECTIVITY_SERVICE);
		cwjManager.getActiveNetworkInfo();
		if (cwjManager.getActiveNetworkInfo() != null) {
			isNetworkAvilable = cwjManager.getActiveNetworkInfo().isAvailable();
		}
		return isNetworkAvilable;
	}

	class RequestSilence implements HttpListener {

		@Override
		public void OnHttpOK(WARequestVO request, Header[] headerlist, byte[] data) {
			// 先处理http头，看是否session超时
			/*for (Header h : headerlist) {
				if ("Sessiontimout".equals(h.getName())) {
					// 这个逻辑遇到Session超时不做任何处理
					Log.d(getClass().getSimpleName(), "网络：Session超时-后台模式");
					return;
				}
			}*/
			// 解密，解压缩
			byte[] responseData = NetworkEncodeUtil.decode(data, isEncrypt, encryptiontype,
					isCompress, dpOrder);
			String jsonString;
			try {
				jsonString = new String(responseData, "utf-8");
			} catch (UnsupportedEncodingException e) {
				// 这个异常是据对不会出现的
				// 如果出现的话说明这个设备无法使用这个应用，且无解决方案
				Log.d(getClass().getSimpleName(), "SYS：JSON接收处理中发现不支持UTF-8");
				jsonString = new String(responseData);

			}
			if ("".equals(jsonString)) {
				request.listener.onRequested(request);
			} else {
				// 装载JSON
				try {
					Log.d(getClass().getSimpleName(), jsonString);
					JSONObject jsonobject = new JSONObject(jsonString);
					// 处理JSONObject
					parseResultFromJSON(request, jsonobject);
				} catch (JSONException e) {
					Log.d(getClass().getSimpleName(), "网络数据处理：装载数据时发生错误" + e.getMessage());
					OnHttpFailed(request, RequestListener.REQUEST_FAILED_DATA);
					e.printStackTrace();
				}
			}
		}

		@Override
		public void OnHttpFailed(WARequestVO request, int reason) {
			Log.d(getClass().getSimpleName(), "网络：请求失败-后台模式-" + String.valueOf(reason));
			// 这里统一处理
			request.listener.onRequestFailed(reason);
			// 这里没有任何默认的处理
		}
	}
}
