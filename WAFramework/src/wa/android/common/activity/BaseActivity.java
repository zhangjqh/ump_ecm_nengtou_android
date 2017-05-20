package wa.android.common.activity;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.http.Header;
import org.apache.http.message.BasicHeader;
import org.json.JSONObject;

import nc.vo.oa.component.struct.Action;
import nc.vo.oa.component.struct.Actions;
import nc.vo.oa.component.struct.ParamTagVO;
import nc.vo.oa.component.struct.ReqParamsVO;
import nc.vo.oa.component.struct.SessionInfo;
import nc.vo.oa.component.struct.WAComponentInstanceVO;
import nc.vo.oa.component.struct.WAComponentInstancesVO;
import wa.android.common.App;
import wa.android.common.AppConfig;
import wa.android.common.R;
import wa.android.common.network.Network;
import wa.android.common.network.RequestListener;
import wa.android.common.network.WAReqActionVO;
import wa.android.common.network.WAReqComponentVO;
import wa.android.common.network.WARequestVO;
import wa.android.common.networkold.VOHttpResponse;
import wa.android.common.utils.PreferencesUtil;
import wa.android.common.vo.adapter.VOAdapter;
import wa.android.constants.CommonGlobalVariables;
import wa.android.constants.CommonServers;
import wa.android.constants.CommonWAIntents;
import wa.android.constants.CommonWAPreferences;
import wa.android.oaas.OAASCompatActivity;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Window;
import android.widget.Toast;

/**
 * 所有activity的根类， 添加了一些帮助方法
 */

@SuppressLint("HandlerLeak")
public class BaseActivity extends Activity {
	private final int THREAD_STACK_SIZE = 2 * 1024 * 1024;
	protected final int ACT_REQUESTCODE_SETCONNECTION = 0x21;

	// used for handler
	protected final int REQUEST_SUC = 0x10;
	protected final int REQUEST_FAIL_NOTWASERVER = 0x11;
	protected final int REQUEST_FAIL_SESSIONTIMEOUT = 0x12;
	protected final int REQUEST_FAIL = 0x1F;
	// is not used in thread
	protected final int BASE_ACTION_TOAST = 0x15;

	// used for the result of activity
	protected final int ACT_REQUESTCODE_NETWORKSETTING = 0x20;

	protected ProgressDialog progress = null;

	protected boolean isRequesting = false;
	private OnVORequestedListener onVORequestedListener;
	private VOHttpResponse voHttpResponse = null;
	// 虽然Toast及Dialog已经可以再UI线程中调用，但是为了调用更加统一，仍然使用handler的方式
	private final Handler handler = new Handler() {
		public void handleMessage(android.os.Message msg) {
			switch (msg.what) {
			case REQUEST_SUC:
				if (onVORequestedListener != null)
					onVORequestedListener.onVORequested((VOHttpResponse) msg.obj);
				break;
			case REQUEST_FAIL:
				if (onVORequestedListener != null)
					onVORequestedListener.onVORequestFailed((VOHttpResponse) msg.obj);
				break;
			case REQUEST_FAIL_NOTWASERVER:
				if (onVORequestedListener != null)
					onVORequestedListener.onVORequestFailed((VOHttpResponse) msg.obj);
				break;
			// case REQUEST_FAIL_SESSIONTIMEOUT:
			// if (onVORequestedListener != null)
			// onVORequestedListener.onSessionTimeOut((VOHttpResponse) msg.obj);
			// break;
			case REQUEST_FAIL_SESSIONTIMEOUT:
				if (onVORequestedListener != null)
					// onVORequestedListener.onSessionTimeOut((VOHttpResponse)
					// msg.obj);
					break;
			case BASE_ACTION_TOAST:
				Toast.makeText(getBaseContext(), (String) msg.obj, Toast.LENGTH_SHORT).show();
				break;
			default:
				Toast.makeText(getBaseContext(), (String) msg.obj, Toast.LENGTH_SHORT).show();

			}

		};
	};

	@Override
	public void onNewIntent(Intent intent) {
		super.onNewIntent(intent);
		StringBuffer sb = new StringBuffer();
		sb.append("onNewIntent==");
		sb.append(getClass().getSimpleName());
		sb.append("==");
		sb.append(this.hashCode());
		Log.d(getClass().getSimpleName(), sb.toString());
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		((App) getApplication()).addActivity(this);

		StringBuffer sb = new StringBuffer();
		sb.append("onCreate==");
		sb.append(getClass().getSimpleName());
		sb.append("==");
		sb.append(this.hashCode());
		Log.d(getClass().getSimpleName(), sb.toString());
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		progress = new ProgressDialog(this);
	}

	@Override
	protected void onResume() {
		super.onResume();

		StringBuffer sb = new StringBuffer();
		sb.append("onResume==");
		sb.append(getClass().getSimpleName());
		sb.append("==");
		sb.append(this.hashCode());
		Log.d(getClass().getSimpleName(), sb.toString());

		/*
		 * if (!(this instanceof WelcomeActivity || this instanceof
		 * WelcomeActivity1)) { // 版本检测 start VersionInfo version = ((App)
		 * getApplication()).getVersionInfo(); if (null != version) {
		 * VersionCheck versionC = new VersionCheck(BaseActivity.this);
		 * versionC.popAlert(); ((App) getApplication()).setVersionInfo(null); }
		 * }
		 */

	}

	@Override
	protected void onDestroy() {
		super.onDestroy();

		((App) getApplication()).removeActivity(this);

		StringBuffer sb = new StringBuffer();
		sb.append("onDestroy==");
		sb.append(getClass().getSimpleName());
		sb.append("==");
		sb.append(this.hashCode());
		Log.d(getClass().getSimpleName(), sb.toString());

	}

	/**
	 * 处理最复杂的请求
	 * 
	 * @param url
	 * @param requestVO
	 */
	public void request(String url, WARequestVO requestVO) {
		App.getNetworkInstance().request(url, requestVO);
	}

	/**
	 * 处理单个Component中的单个Action
	 * 
	 * @param url
	 * @param componentId
	 * @param actionVO
	 * @param listener
	 */
	public void request(String url, String componentId, WAReqActionVO actionVO,
			RequestListener listener) {
		WARequestVO requestVO = new WARequestVO(listener);
		requestVO.addWAActionVO(componentId, actionVO);
		App.getNetworkInstance().request(url, requestVO);
	}

	public void requestInSilence(String url, WARequestVO requestVO) {
		App.getNetworkInstance().requestSilence(url, requestVO);
	}

	public void requestInSilence(String url, String componentId, WAReqActionVO actionVO,
			RequestListener listener) {
		WARequestVO requestVO = new WARequestVO(listener);
		requestVO.addWAActionVO(componentId, actionVO);
		App.getNetworkInstance().requestSilence(url, requestVO);
	}

	/**
	 * Toast 一个信息的工具方法
	 * 
	 * @param msgText
	 */
	protected void toastMsg(String msgText) {
		Message msg = new Message();
		msg.obj = new String(msgText);
		handler.sendMessage(msg);
		// alert(-1, msgText, R.string.submit, null);
	}

	protected void toastMsgs(String msgText) {
		Message msg = new Message();
		// msg.obj = new String(msgText);
		// handler.sendMessage(msg);
		// alert(-1, msgText, R.string.submit, null);
	}

	protected void toastMsg(int stringId) {
		toastMsg(getResources().getString(stringId));
		// alert(-1, stringId, R.string.submit, null);
	}

	/**
	 * 打开应用的设置界面，对于不同的module， 会有不同的设置界面，这是应该加入正确的SettingOption数组对象
	 * 
	 * @param settingOptions
	 * @see SettingOption
	 */
	protected void startSettingActivity(SettingOption[] settingOptions, int aboutResId) {
		Intent i = CommonWAIntents.getSETTING_ACTIVITY(getBaseContext());
		i.putExtra(SettingActivity.BUNDLE_KEY_OPTIONS, settingOptions);
		i.putExtra(SettingActivity.BUNDLE_KEY_ABOUT_RES_ID, aboutResId);
		startActivity(i);
	}

	/**
	 * 将一个对象放入GlobalVariable
	 * 
	 * @param key
	 * @param value
	 */
	public void putGlobalVariable(String key, Object value) {
		((App) getApplicationContext()).addGlobalVariable(key, value);
	}

	/**
	 * 获取GlobalVariable里面的值，若不存在，将返回null
	 * 
	 * @param key
	 * @return
	 */
	public Object getGlobalVariable(String key) {
		App app = (App) getApplication();
		return app.getGlobalVariables(key);
	}

	/**
	 * 删除并获取GlobalVariable里面的值，若不存在，将返回null
	 * 
	 * @param key
	 * @return
	 */
	public Object removeGlobalVariable(String key) {
		return ((App) getApplicationContext()).removeGlobalVariable(key);
	}

	public void alert(int title, int content, int btnCaption, OnClickListener listener) {
		alert(title, getResources().getText(content).toString(), btnCaption, listener);
	}

	public void alert(int title, String content, int btnCaption, OnClickListener listener) {
		AlertDialog dialog = null;
		dialog = new AlertDialog.Builder(this).create();
		if (title != -1) {
			dialog.setTitle(title);
		}
		if (content != null) {
			dialog.setMessage(content);
		}
		dialog.setButton(this.getResources().getText(btnCaption),
				listener == null ? new OnClickListener() {
					@Override
					public void onClick(DialogInterface dialog, int which) {
						dialog.dismiss();
					}
				} : listener);
		dialog.show();
	}

	public boolean isSystemActivity() {
		return false;
	}

	public boolean isEscapeActivity() {
		return false;
	}

	public void showProgress() {
		progress.show();
	}

	public void showProgress(String text) {
		progress.setMessage(text);
		progress.show();
	}

	public void showProgress(int resource) {
		String msg = this.getResources().getText(resource).toString();
		showProgress(msg);

	}

	public void hideProgress() {
		progress.dismiss();
	}

	/**
	 * a express request with single component and single action.
	 * 
	 * @param url
	 *            请求的servlet地址
	 * @param componentId
	 *            componentId
	 * @param actiontype
	 *            actiontype
	 * @param listener
	 *            listener
	 * @param ps
	 *            参数项目
	 */
	protected void requestVOex(final String url, String componentId, String actiontype,
			final OnVORequestedListener listener, nc.vo.oa.component.struct.ParamTagVO... ps) {
		WAComponentInstancesVO mWAComponentInstancesVO = new WAComponentInstancesVO();
		ArrayList<WAComponentInstanceVO> waComponentInstanceVOList = new ArrayList<WAComponentInstanceVO>();
		WAComponentInstanceVO waComponentInstanceVO = new WAComponentInstanceVO();
		waComponentInstanceVO.setComponentid(componentId);
		Actions actions = new Actions();
		ArrayList<Action> actionList = new ArrayList<Action>();
		Action action = new Action();
		action.setActiontype(actiontype);
		ReqParamsVO paramVO = new ReqParamsVO();
		ArrayList<ParamTagVO> params = new ArrayList<ParamTagVO>();
		for (nc.vo.oa.component.struct.ParamTagVO p : ps) {
			params.add(p);
		}
		paramVO.setParamlist(params);
		action.setParamstags(paramVO);
		actionList.add(action);
		actions.setActions(actionList);
		waComponentInstanceVO.setActions(actions);
		waComponentInstanceVOList.add(waComponentInstanceVO);
		mWAComponentInstancesVO.setWaci(waComponentInstanceVOList);
		requestVO(url, mWAComponentInstancesVO, headerList, listener);
	}

	/**
	 * 请求VO的工具方法
	 * 
	 * @param url
	 * @param mWAComponentInstancesVO
	 * @param listener
	 */
	protected void requestVO(final String url,
			final WAComponentInstancesVO mWAComponentInstancesVO,
			final OnVORequestedListener listener) {
		requestVO(url, mWAComponentInstancesVO, headerList, listener);
	}

	private synchronized void setIsRequesting(boolean isRequesting) {
		this.isRequesting = isRequesting;
	}

	private synchronized boolean isRequesting() {
		return isRequesting;
	}

	/**
	 * 请求VO的工具方法 该方法处理了VO请求过程中可能遇到的大部分错误
	 * 
	 * @param url
	 * @param mWAComponentInstancesVO
	 * @param headerList
	 * @param listener
	 */
	protected void requestVO(final String url,
			final WAComponentInstancesVO mWAComponentInstancesVO, final List<Header> headerList,
			final OnVORequestedListener listener) {
		if (isRequesting) {
			// toastMsg(getString(R.string.request_suspend_pleaseWait));
			Log.d(getClass().getName(), "is still work on last request.");
		}
		Log.i(getClass().getName(), "start request vo : " + url);
		this.onVORequestedListener = listener;
		new Thread(null, new Runnable() {
			@Override
			public void run() {
				setIsRequesting(true);

				String sessionIdSp = PreferencesUtil.readPreference(BaseActivity.this,
						CommonWAPreferences.SESSION_ID_SP);
				if (!"".equals(sessionIdSp)) {
					SessionInfo sp = mWAComponentInstancesVO.getSp();
					if (sp == null)
						sp = new SessionInfo();
					sp.setSessionid(sessionIdSp);
					mWAComponentInstancesVO.setSp(sp);
				} else {

					SessionInfo sp = mWAComponentInstancesVO.getSp();
					if (sp == null)
						sp = new SessionInfo();
					sp.setSessionid((String) ((App) getApplicationContext())
							.getGlobalVariables(CommonGlobalVariables.SESSION_ID));
					mWAComponentInstancesVO.setSp(sp);
				}

				// 加入一个cookie
				String sessionIdHeader = PreferencesUtil.readPreference(BaseActivity.this,
						CommonWAPreferences.SESSION_ID_HEADER);
				if (!"".equalsIgnoreCase(sessionIdHeader)) {
					headerList.add(new BasicHeader("Set-Cookie", sessionIdHeader));
				}

				if (url.endsWith(CommonServers.SERVER_SERVLET_WA)
						|| url.endsWith(CommonServers.SERVER_SERVLET_GETACCOUNTSET)) {
					processCommonRequest();
				}
			}

			private Header[] createHttpHeaders() {
				int size = headerList.size();
				Header[] headers = new Header[size];
				for (int i = 0; i < size; i++) {
					headers[i] = headerList.get(i);
				}
				return headers;
			}

			private void processCommonRequest() {
				List<WAComponentInstanceVO> wacis = mWAComponentInstancesVO.getWaci();
				WARequestVO waARequestVO = new WARequestVO(new RequestListener() {
					@Override
					public void onRequested(WARequestVO vo) {
						processVO(vo);
						int size = headerList.size();
						Header[] headers = new Header[size];
						for (int i = 0; i < size; i++) {
							headers[i] = headerList.get(i);
						}
						voHttpResponse = new VOHttpResponse(mWAComponentInstancesVO, headers,
								Network.getResponseHeaderList(), 200);
						Message msg = new Message();
						oldAfterRequestNetWork(msg);
						handler.sendMessage(msg);
						setIsRequesting(false);
					}

					@Override
					public void onRequestFailed(int code) {
						Message msg = handler.obtainMessage(REQUEST_FAIL);
						voHttpResponse = new VOHttpResponse(mWAComponentInstancesVO,
								createHttpHeaders(), Network.getResponseHeaderList(), code);
						// msg.what = REQUEST_FAIL;
						// msg.obj = voHttpResponse;
						handler.sendMessage(msg);
						setIsRequesting(false);
					}
				});
				boolean jsonversion = false;

				// 构造业务请求vos
				for (WAComponentInstanceVO waci : wacis) {
					List<Action> actionList = waci.getActions().getActions();
					for (Action action : actionList) {

						WAReqActionVO reqListAction = WAReqActionVO.createCommonActionVO(action
								.getActiontype());
						reqListAction.setServicecode(action.getParamstags().getServicecode());
						List<ParamTagVO> paramTagList = action.getParamstags().getParamlist();
						if (null != paramTagList) {
							Iterator<ParamTagVO> iterTemp = paramTagList.iterator();
							while (iterTemp.hasNext()) {
								ParamTagVO paramTagVO = iterTemp.next();
								//if (!paramTagVO.getId().equals("usrid") && !paramTagVO.getId().equals("groupid"))
								reqListAction.addPar(paramTagVO.getId(), paramTagVO.getValue());
							}
						}
						waARequestVO.addWAActionVO(waci.getComponentid(), reqListAction);
					}
				}
				App.getNetworkInstance().request1(url, waARequestVO, jsonversion);
			}

			private void oldAfterRequestNetWork(android.os.Message msg) {
				if (voHttpResponse == null || voHttpResponse.getStatusCode() != 200) {
					msg.what = REQUEST_FAIL;
					// toastMsg(getString(R.string.error_server) +
					// "status code：" + voHttpResponse.getStatusCode() + "!");
				} else {
					msg.what = REQUEST_SUC;
					for (org.apache.http.Header h : voHttpResponse.getResponseHeaders()) {
						if (h.getName().trim().equalsIgnoreCase("Sessiontimout")) {
							// App.Log('w', BaseActivity.class,
							// "session timeout!");
							msg.what = REQUEST_FAIL;
							msg.what = REQUEST_FAIL_SESSIONTIMEOUT;
							// toastMsg(getString(R.string.error_sessionTimeOut_pleaseRelogin));
							break;
						}
					}
					String appServer = "";
					for (Header h : voHttpResponse.getResponseHeaders()) {
						if ("Appserver".equalsIgnoreCase(h.getName())) {
							appServer = h.getValue();
						} else if ("Set-Cookie".equalsIgnoreCase(h.getName())) {
							writePreference(CommonWAPreferences.SESSION_ID_HEADER, h.getValue());
						}
					}
					// if
					// (App.config.getAPP_SERVER_NAME().equalsIgnoreCase(appServer))
					// {
					// msg.what = REQUEST_SUC;
					// } else {
					// msg.what = REQUEST_FAIL_NOTWASERVER;
					// toastMsg(getString(R.string.error_server));
					// }
				}
				msg.obj = voHttpResponse;
			}

			private void processVO(WARequestVO vo) {
				/*SessionInfo sessionInfo = new SessionInfo();
				JSONObject jsonObject = Network.getSession();
				try {
					sessionInfo.setSessionid(jsonObject.getString("id"));
					((App) getApplicationContext()).addGlobalVariable(
							CommonGlobalVariables.SESSION_ID, jsonObject.getString("id"));
				} catch (Exception e) {
					e.printStackTrace();
				}
				mWAComponentInstancesVO.setSp(sessionInfo);*/
				List<WAComponentInstanceVO> listWacomponent = mWAComponentInstancesVO.getWaci();
				Iterator<WAComponentInstanceVO> iter = listWacomponent.iterator();
				while (iter.hasNext()) {
					WAComponentInstanceVO wacomponent = iter.next();
					WAReqComponentVO waReqComponent = vo.getReqComponentVO(wacomponent
							.getComponentid());
					Iterator<WAReqActionVO> iterActionList = waReqComponent.actionList.iterator();
					List<Action> actionList = wacomponent.getActions().getActions();
					for (Action actionTemp : actionList) {
						WAReqActionVO waReqAction = null;
						while (iterActionList.hasNext()) {
							waReqAction = iterActionList.next();
							waReqAction.getActiontype().equals(actionTemp.getActiontype());
							break;
						}
						actionTemp.setActiontype(waReqAction.getActiontype());
						VOAdapter.voAdaper(actionTemp, waReqAction);
					}
				}
			}
		}, "REQUEST_THREAD", THREAD_STACK_SIZE).start();
	}

	private static List<Header> headerList = createHeaderList(true, false, false, false, false);

	/**
	 * 请求的头信息
	 * 
	 * @return a request http header list
	 */
	protected static List<Header> createHeaderList(boolean isEncryption, boolean isWithBase64,
			boolean isCompress, boolean isEncryptionFirst, boolean isPreLogin) {
		List<Header> headerList = new ArrayList<Header>();
		BasicHeader h1 = new BasicHeader("compress", isCompress ? "Y" : "N");
		headerList.add(h1);
		BasicHeader h2 = new BasicHeader("contaiver", "N");
		headerList.add(h2);
		BasicHeader h3 = new BasicHeader("encryption", isEncryption ? "Y" : "N");
		headerList.add(h3);
		// 加密类型1带base64 2 不带base64
		BasicHeader h4 = new BasicHeader("encryptiontype", isWithBase64 ? "1" : "2");
		headerList.add(h4);
		BasicHeader h5 = new BasicHeader("translatetype", "jobject");
		headerList.add(h5);
		BasicHeader h6 = new BasicHeader("translateversion", "1");
		headerList.add(h6);
		if (isEncryption && isCompress) {
			// 如果没有压缩加密同时存在，不需要这个header
			BasicHeader h7 = new BasicHeader("comencorder", isEncryptionFirst ? "2" : "1");
			headerList.add(h7);
		}
		if (isCompress) {
			// 压缩类型，目前只有1, 不压缩的时,不需要这个header
			BasicHeader h8 = new BasicHeader("compresstype", "1");
			headerList.add(h8);
		}

		if (isPreLogin) {
			// 以下是预登陆的headers
			BasicHeader h9 = new BasicHeader("apphv", AppConfig.APP_HV);
			headerList.add(h9);

			BasicHeader h10 = new BasicHeader("appid", AppConfig.getAppId());
			headerList.add(h10);

			BasicHeader h11 = new BasicHeader("applv", AppConfig.APP_LV);
			headerList.add(h11);

			BasicHeader h12 = new BasicHeader("enterpriseid", AppConfig.ENTERPRISEID);
			headerList.add(h12);
		}
		for (Header h : headerList) {
			System.out.println(" - - : " + h.getName() + "," + h.getValue());
		}
		return headerList;
	}

	public interface OnVORequestedListener {
		public void onVORequested(VOHttpResponse vo);

		public void onVORequestFailed(VOHttpResponse vo);
		/**
		 * vo could be null; no need to toast session timeout msg to the user
		 * again;
		 * 
		 * @param vo
		 */
		// public void onSessionTimeOut(VOHttpResponse vo);
	}

	public void isSessionTimeOut(VOHttpResponse vo) {

		AlertSessionTimeOut();

	}

	public void AlertSessionTimeOut() {
		final Intent i = new Intent();
		i.setClass(getBaseContext(), LoginWithForceLoginActivity.class);
		new AlertDialog.Builder(this).setTitle(R.string.tip).setMessage("Session过期！")
				.setPositiveButton(R.string.submit, new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface dialog, int which) {
						startActivity(i);
					}
				}).setNegativeButton(R.string.cancel, null).show();
	}

	/**
	 * SharedPreferences工具方法,用来读取一个值 如果没有读取到，会返回""
	 * 
	 * @param key
	 * @return
	 */
	public String readPreference(String key) {
		SharedPreferences sharedPreferences = getSharedPreferences(CommonWAPreferences.NAME_COMMON,
				MODE_PRIVATE);
		String value = sharedPreferences.getString(key, "");
		return value;
	}

	/**
	 * SharedPreferences工具方法,用来写入一个值
	 * 
	 * @param key
	 * @param value
	 */
	public void writePreference(String key, String value) {
		SharedPreferences sharedPreferences = getSharedPreferences(CommonWAPreferences.NAME_COMMON,
				MODE_PRIVATE);
		Editor editor = sharedPreferences.edit();
		editor.putString(key, value);
		editor.commit();
	}

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		// TODO Auto-generated method stub
		if (keyCode == KeyEvent.KEYCODE_MENU) {

			if (!(this instanceof LoginActivity || this instanceof LoginWithForceLoginActivity
					|| this instanceof SetConnectionActivity || this instanceof WelcomeActivity
					|| this instanceof WelcomeActivity1 || this instanceof V57LoginActivity || this instanceof LogoutActivity)) {
				Intent i = new Intent();
				i.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP | Intent.FLAG_ACTIVITY_CLEAR_TOP);
				i.setClass(this, App.moduleList.get(0).getMainClazz());
				startActivity(i);
			}
			// Toast.makeText(this, "Menu", Toast.LENGTH_SHORT).show();
			return false;
		}
		return super.onKeyDown(keyCode, event);

	}
}
