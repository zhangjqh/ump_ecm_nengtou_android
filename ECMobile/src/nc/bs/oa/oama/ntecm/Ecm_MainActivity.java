package nc.bs.oa.oama.ntecm;

import java.io.File;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

import nc.bs.oa.oama.vo.PushExtraVO;

import org.json.JSONException;
import org.json.JSONObject;

import wa.android.common.App;
import wa.android.common.network.DeviceInfoVO;
import wa.android.common.utils.PreferencesUtil;
import wa.android.constants.CommonServers;
import wa.android.constants.CommonWAPreferences;
import wa.android.walibpiccompress.MainActivity;
import android.R.anim;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.text.format.Time;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Toast;

import com.google.gson.Gson;
import com.yonyou.uap.um.application.ApplicationContext;
import com.yonyou.uap.um.base.UMDslConfigure;
import com.yonyou.uap.um.base.UMEventArgs;
import com.yonyou.uap.um.binder.IBinderGroup;
import com.yonyou.uap.um.binder.PropertyBinder;
import com.yonyou.uap.um.common.Common;
import com.yonyou.uap.um.control.UMImage;
import com.yonyou.uap.um.control.UMImageButton;
import com.yonyou.uap.um.control.UMLabel;
import com.yonyou.uap.um.control.UMWebView;
import com.yonyou.uap.um.control.XHorizontalLayout;
import com.yonyou.uap.um.control.XVerticalLayout;
import com.yonyou.uap.um.core.ActionProcessor;
import com.yonyou.uap.um.core.IUMContextAccessor;
import com.yonyou.uap.um.core.UMActivity;
import com.yonyou.uap.um.core.UMPDebugClient;
import com.yonyou.uap.um.core.UMWindow;
import com.yonyou.uap.um.core.UMWindowActivity;
import com.yonyou.uap.um.core.XJSON;
import com.yonyou.uap.um.log.ULog;
import com.yonyou.uap.um.runtime.UMJS;
import com.yonyou.uap.um.runtime.UMService;
import com.yonyou.uap.um.runtime.UMView;
import com.yonyou.uap.um.third.ThirdControl;
import com.yonyou.uap.um.util.UMFileManager;

public abstract class Ecm_MainActivity extends UMWindowActivity {

	protected UMWindow Ecm_Main = null;
	protected XVerticalLayout viewPage0 = null;
	protected XHorizontalLayout navigatorbar0 = null;
	protected UMLabel label0 = null;
	protected XVerticalLayout panel0 = null;
	protected UMImage image0 = null;
	protected XVerticalLayout panel1 = null;
	protected UMWebView appWebview = null;
	protected XVerticalLayout panel2 = null;
	protected XVerticalLayout widget0 = null;
	protected XHorizontalLayout widget0_toolbar0 = null;
	protected UMImageButton widget0_imagebutton0 = null;
	protected UMImageButton widget0_imagebutton2 = null;
	protected UMImageButton widget0_imagebutton4 = null;

	protected final static int ID_ECM_MAIN = 1119939705;
	protected final static int ID_VIEWPAGE0 = 1270607392;
	protected final static int ID_NAVIGATORBAR0 = 1970742590;
	protected final static int ID_LABEL0 = 826375892;
	protected final static int ID_PANEL0 = 521087521;
	protected final static int ID_IMAGE0 = 2090650910;
	protected final static int ID_PANEL1 = 904197312;
	protected final static int ID_APPWEBVIEW = 756889161;
	protected final static int ID_PANEL2 = 810564717;
	protected final static int ID_WIDGET0 = 1815771951;
	protected final static int ID_WIDGET0_TOOLBAR0 = 813044073;
	protected final static int ID_WIDGET0_IMAGEBUTTON0 = 708645296;
	protected final static int ID_WIDGET0_IMAGEBUTTON2 = 1589505084;
	protected final static int ID_WIDGET0_IMAGEBUTTON4 = 791945831;

	// 处理push通知问题
	private String notificationContent;
	// 处理双击退出问题
	private static boolean isExit = false;

	@Override
	public String getControllerName() {
		return "Ecm_MainController";
	}

	@Override
	public String getContextName() {
		return "USERS";
	}

	@Override
	public String getNameSpace() {
		return "nc.bs.oa.oama.ecm";
	}

	protected void onCreate(Bundle savedInstanceState) {
		ULog.logLC("onCreate", this);
		super.onCreate(savedInstanceState);
		onInit(savedInstanceState);

	}

	private void showNotification() {

		// CacheManager
		ApplicationContext ctx = ApplicationContext.getCurrent(this);
		SharedPreferences notification = this.getSharedPreferences(
				"NOTIFICATION", MainActivity.MODE_PRIVATE);
		final Editor editor = notification.edit();
		notificationContent = notification.getString("nExtra", "");
		// 第一种方式
		String port = this.getSharedPreferences("umservice_configure", 0)
				.getString("PORT", "");
		String host = this.getSharedPreferences("umservice_configure", 0)
				.getString("HOST", "");
		String autoloing = this.getSharedPreferences("umservice_configure", 0)
				.getString("AUTOLOGIN", "");

		try {
			// 第二种方式
			// ctx.getValue("maserver");
			String serverUrl = "http://" + host + ":" + port + "/";
			CommonServers.setServerAddress(this, serverUrl);
			// 保存到本地
			PreferencesUtil.writePreference(this,
					CommonWAPreferences.SERVER_IP, host);
			PreferencesUtil.writePreference(this,
					CommonWAPreferences.SERVER_PORT, port);
			PreferencesUtil.writePreference(this,
					CommonWAPreferences.SERVER_ADDRESS, serverUrl);
			PreferencesUtil.writePreference(this, CommonWAPreferences.GROUP_ID,
					ctx.getGroupId());
			PreferencesUtil.writePreference(this, CommonWAPreferences.USER_ID,
					ctx.getUserId());
			PreferencesUtil.writePreference(this,
					CommonWAPreferences.USER_NAME, ctx.getUser());
			PreferencesUtil.writePreference(this,
					CommonWAPreferences.USER_PASS, ctx.getPasswd());
			PreferencesUtil.writePreference(this, "ECM_APPID",
					"A0A000.nc.yonyou.com");
			DeviceInfoVO deviceInfo = new DeviceInfoVO(this);
			String strDeviceInfo = deviceInfo.toJSONObject().toString();
			PreferencesUtil.writePreference(this,
					CommonWAPreferences.DEVICE_INFO, strDeviceInfo);
			// ((App)
			// getApplicationContext()).addGlobalVariable("USER_SERVER_MESSAGE",
			// message);

			// 通过通知栏 登录后
			UMEventArgs args = new UMEventArgs(Ecm_MainActivity.this);
			if (notificationContent != null && !notificationContent.equals("")) {
				if (autoloing != null && !autoloing.equals("true")) {

					/*
					 * String actionid = "notificationDialog";
					 * args.put("message","是否继续查看通知"); args.put("title","消息");
					 * args.put("okaction","openPushPage");
					 * args.put("okbuttontitle","确定");
					 * args.put("style","ok-cancel");
					 * args.put("containerName","");
					 * args.put("cancelbuttontitle","取消");
					 * ActionProcessor.exec(this, actionid, args);
					 * UMView.openDialog(args);
					 */
				} else {// 参数view (第一个参数)随便找
					actionOpenPushPage(navigatorbar0, args);
				}
				editor.remove("nExtra");
				editor.commit();
			}
		} catch (Exception e) {
			e.printStackTrace();
			editor.remove("nExtra");
			editor.commit();
		}
	}

	public void actionOpenPushPage(View control, UMEventArgs args) {
		try {

			PushExtraVO peVo = new PushExtraVO();
			peVo = new Gson().fromJson(notificationContent, PushExtraVO.class);

			String statuscode = null;
			String statuskey = null;
			String taskType = peVo.getType();
			if (taskType != null && taskType.equals("approve")) {
				statuscode = "unhandled";
				statuskey = "ishandled";
			} else if (taskType != null && taskType.equals("read")) {
				statuscode = "unhandled";
				statuskey = "mypieces";
			}

			Intent pushIntent = new Intent();
			if (peVo.getNode() != null && peVo.getNode().equals("A0A007")) {

				String servicecode = null;
				String priority = null;
				String isreminder = null;
				String from = peVo.getParams().get("from");
				if (from != null && from.equals("oa")) {
					servicecode = "1415158109344";
					priority = "0";
					isreminder = "N";
				} else {
					servicecode = "1418020749101";
				}

				pushIntent.putExtra("taskId", peVo.getParams().get("taskId"));
				pushIntent.putExtra("servicecode", servicecode);
				pushIntent.putExtra("statuscode", statuscode);
				pushIntent.putExtra("priority", priority);
				pushIntent.putExtra("statuskey", statuskey);
				pushIntent.putExtra("isreminder", isreminder);
				pushIntent.setClassName("nc.bs.oa.oama.ntecm",
						"wa.android.task.activity.V63TaskDetailActivity");
				startActivity(pushIntent);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	protected void onStart() {
		ULog.logLC("onStart", this);

		super.onStart();
	}

	@Override
	protected void onRestart() {
		ULog.logLC("onRestart", this);

		super.onRestart();
	}

	@Override
	protected void onResume() {
		ULog.logLC("onResume", this);
		{ // viewPage0 - getAppList
			UMEventArgs args = new UMEventArgs(Ecm_MainActivity.this);
			actionGetAppList(viewPage0, args);
			showNotification();

		}

		super.onResume();
	}

	@Override
	protected void onPause() {
		ULog.logLC("onPause", this);

		super.onPause();
	}

	@Override
	protected void onStop() {
		ULog.logLC("onStop", this);

		super.onStop();
	}

	@Override
	protected void onDestroy() {
		ULog.logLC("onDestroy", this);

		super.onDestroy();
	}

	public void onInit(Bundle savedInstanceState) {
		ULog.logLC("onInit", this);
		UMActivity context = this;
		UMDslConfigure configure = new UMDslConfigure();
		registerControl();
		this.getContainer();

		/*
		 * new Thread() { public void run() { UMPDebugClient.startServer(); }
		 * }.start();
		 */
		String sys_debug = ApplicationContext.getCurrent(this).getValue(
				"sys_debug");
		if (sys_debug != null && sys_debug.equalsIgnoreCase("true")) {
			UMPDebugClient.waitForDebug();
		}

		IBinderGroup binderGroup = this;
		currentPage = getCurrentWindow(context, binderGroup, configure);
		this.setContentView(currentPage);

	}

	private void registerControl() {
		idmap.put("Ecm_Main", ID_ECM_MAIN);
		idmap.put("viewPage0", ID_VIEWPAGE0);
		idmap.put("navigatorbar0", ID_NAVIGATORBAR0);
		idmap.put("label0", ID_LABEL0);
		idmap.put("panel0", ID_PANEL0);
		idmap.put("image0", ID_IMAGE0);
		idmap.put("panel1", ID_PANEL1);
		idmap.put("appWebview", ID_APPWEBVIEW);
		idmap.put("panel2", ID_PANEL2);
		idmap.put("widget0", ID_WIDGET0);
		idmap.put("widget0_toolbar0", ID_WIDGET0_TOOLBAR0);
		idmap.put("widget0_imagebutton0", ID_WIDGET0_IMAGEBUTTON0);
		idmap.put("widget0_imagebutton2", ID_WIDGET0_IMAGEBUTTON2);
		idmap.put("widget0_imagebutton4", ID_WIDGET0_IMAGEBUTTON4);

	}

	public void onLoad() {
		ULog.logLC("onLoad", this);
		if (currentPage != null) {
			currentPage.onLoad();
		}

		{ // viewPage0 - initMainView
			UMEventArgs args = new UMEventArgs(Ecm_MainActivity.this);
			actionInitMainView(viewPage0, args);

		}

	}

	public void onDatabinding() {
		ULog.logLC("onDatabinding", this);
		super.onDatabinding();

	}

	@Override
	public void onReturn(String methodName, Object returnValue) {

	}

	@Override
	public void onAfterInit() {
		ULog.logLC("onAfterInit", this);

		onLoad();
	}

	@Override
	public Map<String, String> getPlugout(String id) {
		XJSON from = this.getUMContext();
		Map<String, String> r = super.getPlugout(id);

		return r;
	}

	public View getNavigatorbar0View(final UMActivity context,
			IBinderGroup binderGroup, UMDslConfigure configure) {
		navigatorbar0 = (XHorizontalLayout) ThirdControl.createControl(
				new XHorizontalLayout(context), ID_NAVIGATORBAR0,
				"padding-left", "8", "padding-right", "8", "height", "44.0",
				"color", "#000000", "layout-type", "linear", "font-size", "17",
				"width", "fill", "font-family", "default", "valign", "center",
				"background-image", "navbar_login.png");
		label0 = (UMLabel) ThirdControl.createControl(new UMLabel(context),
				ID_LABEL0, "halign", "center", "height", "fill", "color",
				"#000000", "layout-type", "linear", "font-size", "17", "width",
				"fill", "font-family", "default", "valign", "center");
		binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder(
				(IUMContextAccessor) context, label0, "content",
				"#{res.homepage}"));
		navigatorbar0.addView(label0);

		return navigatorbar0;
	}

	public View getPanel0View(final UMActivity context,
			IBinderGroup binderGroup, UMDslConfigure configure) {
		panel0 = (XVerticalLayout) ThirdControl.createControl(
				new XVerticalLayout(context), ID_PANEL0, "halign", "center",
				"height", "150", "layout-type", "linear", "width", "fill",
				"border-bottom-color", "#ff00ff");
		image0 = (UMImage) ThirdControl.createControl(new UMImage(context),
				ID_IMAGE0, "height", "fill", "layout-type", "linear", "width",
				"fill", "scaletype", "fitxy");
		binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder(
				(IUMContextAccessor) context, image0, "src",
				"#{app.maserver}hroa/img/ecm_main.png"));
		panel0.addView(image0);

		return panel0;
	}

	public View getPanel1View(final UMActivity context,
			IBinderGroup binderGroup, UMDslConfigure configure) {
		panel1 = (XVerticalLayout) ThirdControl.createControl(
				new XVerticalLayout(context), ID_PANEL1, "halign", "center",
				"height", "0", "weight", "1", "layout-type", "linear", "width",
				"fill");
		appWebview = (UMWebView) ThirdControl.createControl(new UMWebView(
				context), ID_APPWEBVIEW, "halign", "center", "startpage",
				"home.html", "height", "0", "weight", "1", "layout", "vbox",
				"width", "fill", "zoomscale", "default", "supportzoom",
				"false", "url",
				"file:///android_asset/webcontrol/ecm/home.html");
		panel1.addView(appWebview);

		return panel1;
	}

	public View getWidget0_toolbar0View(final UMActivity context,
			IBinderGroup binderGroup, UMDslConfigure configure) {
		widget0_toolbar0 = (XHorizontalLayout) ThirdControl.createControl(
				new XHorizontalLayout(context), ID_WIDGET0_TOOLBAR0, "height",
				"fill", "layout-type", "linear", "width", "fill", "valign",
				"center", "background-image", "toolbar.png");
		widget0_imagebutton0 = (UMImageButton) ThirdControl.createControl(
				new UMImageButton(context), ID_WIDGET0_IMAGEBUTTON0, "halign",
				"center", "weight", "1", "width", "0", "icon-width", "25",
				"istogglebutton", "true", "font-pressed-color", "#e50011",
				"icon-height", "25", "height", "fill", "color", "#8a8888",
				"layout-type", "linear", "font-size", "10",
				"icon-background-image", "ecm_home.png", "icon-pressed-image",
				"ecm_home_touch.png", "onclick", "toHome", "font-family",
				"default", "valign", "center", "checked", "false",
				"icon-text-spacing", "5");
		binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder(
				(IUMContextAccessor) context, widget0_imagebutton0, "value",
				"#{res.homepage}"));
		widget0_imagebutton0.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				UMEventArgs args = new UMEventArgs(Ecm_MainActivity.this);
				actionToHome(widget0_imagebutton0, args);

			}
		});
		widget0_toolbar0.addView(widget0_imagebutton0);
		widget0_imagebutton2 = (UMImageButton) ThirdControl.createControl(
				new UMImageButton(context), ID_WIDGET0_IMAGEBUTTON2, "halign",
				"center", "weight", "1", "width", "0", "icon-width", "25",
				"istogglebutton", "true", "font-pressed-color", "#e50011",
				"icon-height", "25", "height", "fill", "color", "#8a8888",
				"layout-type", "linear", "font-size", "10",
				"icon-background-image", "ecm_discovery.png",
				"icon-pressed-image", "ecm_discovery_touch.png", "onclick",
				"toDiscovery", "font-family", "default", "valign", "center",
				"checked", "false", "icon-text-spacing", "5");
		binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder(
				(IUMContextAccessor) context, widget0_imagebutton2, "value",
				"#{res.ecm_discovery}"));
		widget0_imagebutton2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				UMEventArgs args = new UMEventArgs(Ecm_MainActivity.this);
				actionToDiscovery(widget0_imagebutton2, args);

			}
		});
		widget0_toolbar0.addView(widget0_imagebutton2);
		widget0_imagebutton4 = (UMImageButton) ThirdControl.createControl(
				new UMImageButton(context), ID_WIDGET0_IMAGEBUTTON4, "halign",
				"center", "weight", "1", "width", "0", "icon-width", "25",
				"istogglebutton", "true", "font-pressed-color", "#e50011",
				"icon-height", "25", "height", "fill", "color", "#8a8888",
				"layout-type", "linear", "font-size", "10",
				"icon-background-image", "ecm_set.png", "icon-pressed-image",
				"ecm_set_touch.png", "onclick", "toSet", "font-family",
				"default", "valign", "center", "checked", "false",
				"icon-text-spacing", "5");
		binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder(
				(IUMContextAccessor) context, widget0_imagebutton4, "value",
				"#{res.setting}"));
		widget0_imagebutton4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				UMEventArgs args = new UMEventArgs(Ecm_MainActivity.this);
				actionToSet(widget0_imagebutton4, args);

			}
		});
		widget0_toolbar0.addView(widget0_imagebutton4);

		return widget0_toolbar0;
	}

	public View getWidget0View(final UMActivity context,
			IBinderGroup binderGroup, UMDslConfigure configure) {
		widget0 = (XVerticalLayout) ThirdControl.createControl(
				new XVerticalLayout(context), ID_WIDGET0, "halign", "center",
				"height", "49", "layout-type", "linear", "width", "fill");
		View widget0_toolbar0 = (View) getWidget0_toolbar0View(
				(UMActivity) context, binderGroup, configure);
		widget0.addView(widget0_toolbar0);

		return widget0;
	}

	public View getPanel2View(final UMActivity context,
			IBinderGroup binderGroup, UMDslConfigure configure) {
		panel2 = (XVerticalLayout) ThirdControl.createControl(
				new XVerticalLayout(context), ID_PANEL2, "halign", "center",
				"height", "49", "layout-type", "linear", "width", "fill");
		View widget0 = (View) getWidget0View((UMActivity) context, binderGroup,
				configure);
		panel2.addView(widget0);

		return panel2;
	}

	public View getViewPage0View(final UMActivity context,
			IBinderGroup binderGroup, UMDslConfigure configure) {
		viewPage0 = (XVerticalLayout) ThirdControl.createControl(
				new XVerticalLayout(context), ID_VIEWPAGE0, "halign", "center",
				"height", "fill", "onload", "initMainView", "layout-type",
				"vbox", "background", "#efeff4", "width", "fill", "onresume",
				"getAppList");
		View navigatorbar0 = (View) getNavigatorbar0View((UMActivity) context,
				binderGroup, configure);
		viewPage0.addView(navigatorbar0);
		View panel0 = (View) getPanel0View((UMActivity) context, binderGroup,
				configure);
		viewPage0.addView(panel0);
		View panel1 = (View) getPanel1View((UMActivity) context, binderGroup,
				configure);
		viewPage0.addView(panel1);
		View panel2 = (View) getPanel2View((UMActivity) context, binderGroup,
				configure);
		viewPage0.addView(panel2);

		return viewPage0;
	}

	public UMWindow getCurrentWindow(final UMActivity context,
			IBinderGroup binderGroup, UMDslConfigure configure) {
		Ecm_Main = (UMWindow) ThirdControl.createControl(new UMWindow(context),
				ID_ECM_MAIN, "halign", "center", "height", "fill", "layout",
				"vbox", "width", "fill", "context", "USERS", "controller",
				"Ecm_MainController", "namespace", "nc.bs.oa.oama.ecm");
		View viewPage0 = (View) getViewPage0View((UMActivity) context,
				binderGroup, configure);
		Ecm_Main.addView(viewPage0);

		return (UMWindow) Ecm_Main;
	}

	public void actionGetAppList(View control, UMEventArgs args) {
		String actionid = "getAppList";
		// 处理MA端通过 push开关状态，判断是否将手机与用户绑定
		SharedPreferences mShared = this.getSharedPreferences("NOTIFICATION",
				Ecm_MainActivity.MODE_PRIVATE);
		String pushable = mShared.getString("pushisopen", "");
		if ("".equals(pushable) || "true".equals(pushable)) {
			args.put("pushable", "true");
		} else {
			args.put("pushable", "false");
		}
		args.put("viewid", "nc.bs.oa.oama.ecm.EcmController");
		args.put("action", "getAppList");
		args.put("callback", "appsCallback");
		args.put("autoDataBinding", "false");
		args.put("contextmapping", "AppList");
		args.put("containerName", "");
		ActionProcessor.exec(this, actionid, args);
		UMService.callAction(args);
	}

	public void actionInitMainView(View control, UMEventArgs args) {
		String actionid = "initMainView";
		args.put("containerName", "");
		ActionProcessor.exec(this, actionid, args);
		this.getContainer().exec(actionid, "initMainView",
				UMActivity.getViewId(control), args);
	}

	public void actionToSet(View control, UMEventArgs args) {
		String actionid = "toSet";
		args.put("viewid", "nc.bs.oa.oama.ecm.Ecm_Set");
		this.dataCollect();
		args.put("iskeep", "false");
		args.put("containerName", "");
		ActionProcessor.exec(this, actionid, args);
		UMView.open(args);
	}

	public void actionToHome(View control, UMEventArgs args) {
		String actionid = "toHome";
		args.put("containerName", "");
		ActionProcessor.exec(this, actionid, args);
		this.getContainer().exec(actionid, "toHome",
				UMActivity.getViewId(control), args);
	}

	public void actionToDiscovery(View control, UMEventArgs args) {
		String actionid = "toDiscovery";
		args.put("viewid", "nc.bs.oa.oama.ecm.Ecm_Discovery");
		this.dataCollect();
		args.put("iskeep", "false");
		args.put("containerName", "");
		ActionProcessor.exec(this, actionid, args);
		UMView.open(args);
	}

	public void actionAppsCallback(View control, UMEventArgs args) {
		String actionid = "appsCallback";
		args.put("controlid", "appWebview");
		args.put("func", "initApps()");
		args.put("containerName", "");
		ActionProcessor.exec(this, actionid, args);
		UMJS.runjs(args);
	}

	/**
	 * 双击返回键退出程序
	 */
	/*
	 * @Override public boolean onKeyDown(int keyCode, KeyEvent event) {
	 * if(keyCode == KeyEvent.KEYCODE_BACK){ if(!isExit){ isExit = true;//准备退出
	 * Toast.makeText(this, "再按一次退出程序", Toast.LENGTH_SHORT).show(); Timer mTimer
	 * = new Timer(); mTimer.schedule(new TimerTask() {
	 * 
	 * @Override public void run() { isExit = false;//取消退出
	 * 
	 * } }, 2000);//2 }else{ //System.exit(0); } } return false; }
	 */

}
