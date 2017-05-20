package nc.bs.oa.oama.ntecm;

import com.yonyou.protocol.Constants.Notificatin;
import com.yonyou.pushclient.PushServiceManager;
import com.yonyou.pushclient.ServiceOnlineReceiver;
import com.yonyou.uap.um.application.ApplicationContext;
import com.yonyou.uap.um.base.*;
import com.yonyou.uap.um.common.*;
import com.yonyou.uap.um.third.*;
import com.yonyou.uap.um.util.UMFileManager;
import com.yonyou.uap.um.control.*;
import com.yonyou.uap.um.core.*;
import com.yonyou.uap.um.binder.*;
import com.yonyou.uap.um.runtime.*;
import com.yonyou.uap.um.lexer.*;
import com.yonyou.uap.um.widget.*;
import com.yonyou.uap.um.widget.UmpSlidingLayout.SlidingViewType;
import com.yonyou.uap.um.log.ULog;
import java.util.*;

import wa.android.common.activity.LoginActivity;

import nc.bs.oa.oama.push.ECMPushService;
import nc.bs.oa.oama.push.MsgManager;
import nc.bs.oa.oama.push.NotificationActivityImple;
import android.os.*;
import android.util.Log;
import android.view.*;
import android.widget.*;
import android.webkit.*;
import android.app.NotificationManager;
import android.content.*;
import android.content.SharedPreferences.Editor;
import android.graphics.*;
import android.widget.ImageView.ScaleType;

public abstract class Ecm_LoginActivity extends UMWindowActivity {

	protected UMWindow Ecm_Login = null;
	protected XVerticalLayout viewPage0 = null;
	protected XVerticalLayout panel1 = null;
	protected XVerticalLayout loginPanel = null;
	protected XHorizontalLayout userName = null;
	protected UMImage userImg = null;
	protected XVerticalLayout namePanel = null;
	protected UMTextbox nameTxt = null;
	protected UMImage nameLineImg = null;
	protected XHorizontalLayout password = null;
	protected UMImage pwImg = null;
	protected XVerticalLayout pwPanel = null;
	protected UMPassword pwTxt = null;
	protected UMImage pwLineImg = null;
	protected XHorizontalLayout panel0 = null;
	protected UMCheckbox checkbox0 = null;
	protected UMLabel label1 = null;
	protected XVerticalLayout panel4 = null;
	protected UMButton button0 = null;
	protected UMButton button1 = null;
	protected XHorizontalLayout panel2 = null;
	protected XVerticalLayout panel5 = null;
	protected UMImage image0 = null;

	protected final static int ID_ECM_LOGIN = 1215032301;
	protected final static int ID_VIEWPAGE0 = 722778933;
	protected final static int ID_PANEL1 = 1356663911;
	protected final static int ID_LOGINPANEL = 1116048371;
	protected final static int ID_USERNAME = 1721346590;
	protected final static int ID_USERIMG = 472348024;
	protected final static int ID_NAMEPANEL = 1805873802;
	protected final static int ID_NAMETXT = 2041662375;
	protected final static int ID_NAMELINEIMG = 690373;
	protected final static int ID_PASSWORD = 472439355;
	protected final static int ID_PWIMG = 766131991;
	protected final static int ID_PWPANEL = 275736025;
	protected final static int ID_PWTXT = 1072345931;
	protected final static int ID_PWLINEIMG = 470276585;
	protected final static int ID_PANEL0 = 1889271212;
	protected final static int ID_CHECKBOX0 = 215988315;
	protected final static int ID_LABEL1 = 587982763;
	protected final static int ID_PANEL4 = 2094161956;
	protected final static int ID_BUTTON0 = 574370034;
	protected final static int ID_BUTTON1 = 701192215;
	protected final static int ID_PANEL2 = 2083794573;
	protected final static int ID_PANEL5 = 1427503901;
	protected final static int ID_IMAGE0 = 1228733306;

	// 清理换用户登录之后的通知
	private NotificationManager nm;
	private String userNameStr;
	private String oldNameStr;
	// 处理在login页面收到信息的处理过程
	private SharedPreferences sp;
	private Editor editor;

	@Override
	public String getControllerName() {
		return "Ecm_LoginController";
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

		super.onResume();
		// 判断是否在login界面
		sp = this.getSharedPreferences("NOTIFICATION",
				Ecm_LoginActivity.MODE_PRIVATE);
		editor = sp.edit();
		editor.putString("isloginActivity", "true");
		editor.commit();
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
		editor.putString("isloginActivity", "false");
		editor.commit();
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
		idmap.put("Ecm_Login", ID_ECM_LOGIN);
		idmap.put("viewPage0", ID_VIEWPAGE0);
		idmap.put("panel1", ID_PANEL1);
		idmap.put("loginPanel", ID_LOGINPANEL);
		idmap.put("userName", ID_USERNAME);
		idmap.put("userImg", ID_USERIMG);
		idmap.put("namePanel", ID_NAMEPANEL);
		idmap.put("nameTxt", ID_NAMETXT);
		idmap.put("nameLineImg", ID_NAMELINEIMG);
		idmap.put("password", ID_PASSWORD);
		idmap.put("pwImg", ID_PWIMG);
		idmap.put("pwPanel", ID_PWPANEL);
		idmap.put("pwTxt", ID_PWTXT);
		idmap.put("pwLineImg", ID_PWLINEIMG);
		idmap.put("panel0", ID_PANEL0);
		idmap.put("checkbox0", ID_CHECKBOX0);
		idmap.put("label1", ID_LABEL1);
		idmap.put("panel4", ID_PANEL4);
		idmap.put("button0", ID_BUTTON0);
		idmap.put("button1", ID_BUTTON1);
		idmap.put("panel2", ID_PANEL2);
		idmap.put("panel5", ID_PANEL5);
		idmap.put("image0", ID_IMAGE0);

	}

	public void onLoad() {
		ULog.logLC("onLoad", this);
		if (currentPage != null) {
			currentPage.onLoad();
		}

		{ // viewPage0 - loadConfig
			UMEventArgs args = new UMEventArgs(Ecm_LoginActivity.this);
			actionLoadConfig(viewPage0, args);

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

	public View getNamePanelView(final UMActivity context,
			IBinderGroup binderGroup, UMDslConfigure configure) {
		namePanel = (XVerticalLayout) ThirdControl.createControl(
				new XVerticalLayout(context), ID_NAMEPANEL,
				"border-bottom-style", "solid", "padding-left", "5", "halign",
				"center", "height", "44", "layout-type", "linear", "width",
				"fill", "border-bottom-color", "#aaaaaa");
		nameTxt = (UMTextbox) ThirdControl.createControl(
				new UMTextbox(context), ID_NAMETXT, "bindfield", "username",
				"padding-right", "15", "padding-left", "10", "halign", "LEFT",
				"pressed-image", "textbox", "width", "fill",
				"background-image-dis", "ecm_login_user.png", "onchange",
				"onchange", "height", "34", "color", "#333333", "layout-type",
				"linear", "font-size", "15", "font-family", "default");
		UMTextBinder nameTxt_binder = new UMTextBinder(
				(IUMContextAccessor) context);
		nameTxt_binder.setBindInfo(new BindInfo("username"));
		nameTxt_binder.setControl(nameTxt);
		binderGroup.addBinderToGroup(ID_NAMETXT, nameTxt_binder);
		binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder(
				(IUMContextAccessor) context, nameTxt, "placeholder",
				"#{res.nameplaceholder}"));
		nameTxt.setEvent("onchange", new OnCursorEventListener(configure) {
			@Override
			public void onEvent(View v, UMEventArgs parent) {
				UMEventArgs args = new UMEventArgs(Ecm_LoginActivity.this);
				args.put(parent);
				actionOnchange(nameTxt, args);

			}
		});
		namePanel.addView(nameTxt);
		nameLineImg = (UMImage) ThirdControl.createControl(
				new UMImage(context), ID_NAMELINEIMG, "height", "1",
				"layout-type", "linear", "width", "fill", "scaletype", "fitxy",
				"src", "ecm_login_line.png");
		namePanel.addView(nameLineImg);

		return namePanel;
	}

	public View getUserNameView(final UMActivity context,
			IBinderGroup binderGroup, UMDslConfigure configure) {
		userName = (XHorizontalLayout) ThirdControl.createControl(
				new XHorizontalLayout(context), ID_USERNAME, "height", "44",
				"layout-type", "linear", "width", "fill", "margin-top", "10",
				"valign", "center");
		userImg = (UMImage) ThirdControl.createControl(new UMImage(context),
				ID_USERIMG, "margin-right", "0", "height", "22", "layout-type",
				"linear", "width", "22", "margin-bottom", "5", "scaletype",
				"fitcenter", "src", "ecm_login_user.png");
		userName.addView(userImg);
		View namePanel = (View) getNamePanelView((UMActivity) context,
				binderGroup, configure);
		userName.addView(namePanel);

		return userName;
	}

	public View getPwPanelView(final UMActivity context,
			IBinderGroup binderGroup, UMDslConfigure configure) {
		pwPanel = (XVerticalLayout) ThirdControl.createControl(
				new XVerticalLayout(context), ID_PWPANEL,
				"border-bottom-style", "solid", "padding-left", "5", "halign",
				"center", "height", "44", "layout-type", "linear", "width",
				"fill", "border-bottom-color", "#aaaaaa");
		pwTxt = (UMPassword) ThirdControl.createControl(
				new UMPassword(context), ID_PWTXT, "bindfield", "password",
				"padding-right", "15", "padding-left", "10", "halign", "LEFT",
				"pressed-image", "textbox", "width", "fill",
				"background-image-dis", "ecm_login_user.png", "height", "34",
				"color", "#333333", "layout-type", "linear", "font-size", "15",
				"font-family", "default");
		UMTextBinder pwTxt_binder = new UMTextBinder(
				(IUMContextAccessor) context);
		pwTxt_binder.setBindInfo(new BindInfo("password"));
		pwTxt_binder.setControl(pwTxt);
		binderGroup.addBinderToGroup(ID_PWTXT, pwTxt_binder);
		binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder(
				(IUMContextAccessor) context, pwTxt, "placeholder",
				"#{res.passwordholder}"));
		pwPanel.addView(pwTxt);
		pwLineImg = (UMImage) ThirdControl.createControl(new UMImage(context),
				ID_PWLINEIMG, "height", "1", "layout-type", "linear", "width",
				"fill", "scaletype", "fitxy", "src", "ecm_login_line.png");
		pwPanel.addView(pwLineImg);

		return pwPanel;
	}

	public View getPasswordView(final UMActivity context,
			IBinderGroup binderGroup, UMDslConfigure configure) {
		password = (XHorizontalLayout) ThirdControl.createControl(
				new XHorizontalLayout(context), ID_PASSWORD, "height", "44",
				"layout-type", "linear", "width", "fill", "valign", "center");
		pwImg = (UMImage) ThirdControl.createControl(new UMImage(context),
				ID_PWIMG, "height", "22", "layout-type", "linear", "width",
				"22", "margin-bottom", "5", "scaletype", "fitcenter", "src",
				"ecm_login_pass.png");
		password.addView(pwImg);
		View pwPanel = (View) getPwPanelView((UMActivity) context, binderGroup,
				configure);
		password.addView(pwPanel);

		return password;
	}

	public View getPanel0View(final UMActivity context,
			IBinderGroup binderGroup, UMDslConfigure configure) {
		panel0 = (XHorizontalLayout) ThirdControl.createControl(
				new XHorizontalLayout(context), ID_PANEL0, "height", "32",
				"layout-type", "linear", "width", "fill", "valign", "center");
		checkbox0 = (UMCheckbox) ThirdControl.createControl(new UMCheckbox(
				context), ID_CHECKBOX0, "padding-left", "0", "bindfield",
				"autologin", "halign", "LEFT", "height", "22", "color",
				"#e50011", "layout-type", "linear", "font-size", "17", "width",
				"22", "check-on-image", "checkbox_select.png", "font-family",
				"default", "check-off-image", "checkbox_noselect.png");
		UMCheckBoxBinder checkbox0_binder = new UMCheckBoxBinder(
				(IUMContextAccessor) context);
		checkbox0_binder.setBindInfo(new BindInfo("autologin"));
		checkbox0_binder.setControl(checkbox0);
		binderGroup.addBinderToGroup(ID_CHECKBOX0, checkbox0_binder);
		panel0.addView(checkbox0);
		label1 = (UMLabel) ThirdControl.createControl(new UMLabel(context),
				ID_LABEL1, "halign", "left", "height", "fill", "color",
				"#343434", "layout-type", "linear", "font-size", "13", "width",
				"90.0", "margin-left", "15", "font-family", "default",
				"valign", "center");
		binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder(
				(IUMContextAccessor) context, label1, "content",
				"#{res.autologin}"));
		panel0.addView(label1);

		return panel0;
	}

	public View getPanel4View(final UMActivity context,
			IBinderGroup binderGroup, UMDslConfigure configure) {
		panel4 = (XVerticalLayout) ThirdControl.createControl(
				new XVerticalLayout(context), ID_PANEL4, "halign", "center",
				"height", "40", "layout-type", "linear", "width", "fill",
				"margin-top", "30", "background-image",
				"ecm_login_background.png");
		button0 = (UMButton) ThirdControl.createControl(new UMButton(context),
				ID_BUTTON0, "halign", "center", "height", "fill", "color",
				"#ffffff", "layout-type", "linear", "font-size", "17", "width",
				"fill", "onclick", "loginJS", "font-family", "default",
				"font-pressed-color", "#f2adb2", "valign", "center");
		binderGroup
				.addBinderToGroup(Common.genericId(), new PropertyBinder(
						(IUMContextAccessor) context, button0, "value",
						"#{res.login}"));
		button0.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				UMEventArgs args = new UMEventArgs(Ecm_LoginActivity.this);
				actionLoginJS(button0, args);

			}
		});
		panel4.addView(button0);

		return panel4;
	}

	public View getPanel5View(final UMActivity context,
			IBinderGroup binderGroup, UMDslConfigure configure) {
		panel5 = (XVerticalLayout) ThirdControl.createControl(
				new XVerticalLayout(context), ID_PANEL5, "halign", "right",
				"height", "19", "layout-type", "linear", "width", "fill",
				"margin-bottom", "20");
		image0 = (UMImage) ThirdControl.createControl(new UMImage(context),
				ID_IMAGE0, "height", "19", "layout-type", "linear", "width",
				"55", "scaletype", "fitcenter", "src", "logo_ecm.png");
		panel5.addView(image0);

		return panel5;
	}

	public View getPanel2View(final UMActivity context,
			IBinderGroup binderGroup, UMDslConfigure configure) {
		panel2 = (XHorizontalLayout) ThirdControl.createControl(
				new XHorizontalLayout(context), ID_PANEL2, "height", "fill",
				"layout-type", "linear", "width", "fill", "valign", "bottom");
		View panel5 = (View) getPanel5View((UMActivity) context, binderGroup,
				configure);
		panel2.addView(panel5);

		return panel2;
	}

	public View getLoginPanelView(final UMActivity context,
			IBinderGroup binderGroup, UMDslConfigure configure) {
		loginPanel = (XVerticalLayout) ThirdControl.createControl(
				new XVerticalLayout(context), ID_LOGINPANEL, "padding-left",
				"30", "padding-right", "30", "halign", "center", "height",
				"fill", "layout-type", "linear", "width", "fill");
		View userName = (View) getUserNameView((UMActivity) context,
				binderGroup, configure);
		loginPanel.addView(userName);
		View password = (View) getPasswordView((UMActivity) context,
				binderGroup, configure);
		loginPanel.addView(password);
		View panel0 = (View) getPanel0View((UMActivity) context, binderGroup,
				configure);
		loginPanel.addView(panel0);
		View panel4 = (View) getPanel4View((UMActivity) context, binderGroup,
				configure);
		loginPanel.addView(panel4);
		button1 = (UMButton) ThirdControl.createControl(new UMButton(context),
				ID_BUTTON1, "halign", "left", "height", "37", "color",
				"#000000", "layout-type", "linear", "font-size", "13", "width",
				"fill", "onclick", "connectSettingJS", "font-family",
				"default", "margin-top", "5", "valign", "center");
		binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder(
				(IUMContextAccessor) context, button1, "value",
				"#{res.serversetting}"));
		button1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				UMEventArgs args = new UMEventArgs(Ecm_LoginActivity.this);
				actionConnectSettingJS(button1, args);

			}
		});
		loginPanel.addView(button1);
		View panel2 = (View) getPanel2View((UMActivity) context, binderGroup,
				configure);
		loginPanel.addView(panel2);

		return loginPanel;
	}

	public View getViewPage0View(final UMActivity context,
			IBinderGroup binderGroup, UMDslConfigure configure) {
		viewPage0 = (XVerticalLayout) ThirdControl.createControl(
				new XVerticalLayout(context), ID_VIEWPAGE0, "halign", "center",
				"height", "fill", "onload", "loadConfig", "layout-type",
				"vbox", "width", "fill", "background", "#ffffff");
		panel1 = (XVerticalLayout) ThirdControl.createControl(
				new XVerticalLayout(context), ID_PANEL1, "halign", "center",
				"height", "151", "layout-type", "linear", "width", "fill",
				"background-image", "ecm_login_up.png");
		viewPage0.addView(panel1);
		View loginPanel = (View) getLoginPanelView((UMActivity) context,
				binderGroup, configure);
		viewPage0.addView(loginPanel);

		return viewPage0;
	}

	public UMWindow getCurrentWindow(final UMActivity context,
			IBinderGroup binderGroup, UMDslConfigure configure) {
		Ecm_Login = (UMWindow) ThirdControl.createControl(
				new UMWindow(context), ID_ECM_LOGIN, "halign", "center",
				"height", "fill", "layout", "vbox", "width", "fill", "context",
				"USERS", "controller", "Ecm_LoginController", "namespace",
				"nc.bs.oa.oama.ecm");
		View viewPage0 = (View) getViewPage0View((UMActivity) context,
				binderGroup, configure);
		Ecm_Login.addView(viewPage0);

		return (UMWindow) Ecm_Login;
	}

	public void actionConnectSetting(View control, UMEventArgs args) {
		String actionid = "connectSetting";
		args.put("viewid", "nc.bs.oa.oama.ecm.Ecm_Connect");
		args.put("callback", "loadConfig");
		args.put("iskeep", "true");
		args.put("containerName", "");
		ActionProcessor.exec(this, actionid, args);
		UMView.open(args);
	}

	public void actionAfterLogin(View control, UMEventArgs args) {
		String actionid = "afterLogin";
		args.put("containerName", "");
		args.put("version", "#{app.versionCode}");
		ActionProcessor.exec(this, actionid, args);
		this.getContainer().exec(actionid, "afterLogin",
				UMActivity.getViewId(control), args);
	}

	public void actionConnectSettingJS(View control, UMEventArgs args) {
		String actionid = "connectSettingJS";
		this.dataCollect();
		args.put("containerName", "");
		ActionProcessor.exec(this, actionid, args);
		this.getContainer().exec(actionid, "connectSettingJS",
				UMActivity.getViewId(control), args);
	}

	public void actionLoadConfig(View control, UMEventArgs args) {
		String actionid = "loadConfig";
		args.put("port", "port");
		args.put("username", "username");
		args.put("host", "ip");
		args.put("ishttps", "ishttps");
		args.put("autologin", "autologin");
		args.put("oldname", "oldname");
		args.put("password", "password");
		args.put("containerName", "");
		ActionProcessor.exec(this, actionid, args);
		UMService.loadConfigure(args);
	}

	public void actionOpenMainView(View control, UMEventArgs args) {
		// 换人登录后清空通知栏
		ApplicationContext appCtx = ApplicationContext.getCurrent(this);
		userNameStr = appCtx.getUser();
		if (userNameStr != null && oldNameStr != null
				&& !userNameStr.equals(oldNameStr)) {
			nm = (NotificationManager) this
					.getSystemService(Context.NOTIFICATION_SERVICE);
			nm.cancelAll();
			ServiceOnlineReceiver.lists.clear();
			ServiceOnlineReceiver.notify_List.clear();
		}
		// 处理结束
		String actionid = "openMainView";
		args.put("viewid", "nc.bs.oa.oama.ecm.Ecm_Main");
		args.put("iskeep", "false");
		args.put("containerName", "");
		ActionProcessor.exec(this, actionid, args);
		UMView.open(args);
	}

	public void actionLoginAction(View control, UMEventArgs args) {
		String actionid = "loginAction";
		args.put("error", "loginError");
		this.dataCollect();
		args.put("type", "xt");
		args.put("success", "afterLogin");
		args.put("user", "#{username}");
		args.put("contextmapping", "none");
		args.put("containerName", "");
		args.put("pass", "#{password}");
		args.put("forcelogin", "Y");
		ActionProcessor.exec(this, actionid, args);
		UMService.login(args);
	}

	public void actionLoginJS(View control, UMEventArgs args) {
		String actionid = "loginJS";
		this.dataCollect();
		args.put("containerName", "");
		// 原来登录的用户
		oldNameStr = this.getSharedPreferences("umservice_configure", 0)
				.getString("OLDNAME", "");
		ActionProcessor.exec(this, actionid, args);
		this.getContainer().exec(actionid, "loginJS",
				UMActivity.getViewId(control), args);
	}

	public void actionLoginError(View control, UMEventArgs args) {
		String actionid = "loginError";
		args.put("containerName", "");
		ActionProcessor.exec(this, actionid, args);
		this.getContainer().exec(actionid, "loginError",
				UMActivity.getViewId(control), args);
	}

	public void actionOnchange(View control, UMEventArgs args) {
		String actionid = "onchange";
		this.dataCollect();
		args.put("containerName", "");
		ActionProcessor.exec(this, actionid, args);
		this.getContainer().exec(actionid, "onchange",
				UMActivity.getViewId(control), args);
	}

	public void actionToWelcome(View control, UMEventArgs args) {
		String actionid = "toWelcome";
		args.put("viewid", "nc.bs.oa.oama.ecm.Ecm_Welcome");
		args.put("iskeep", "false");
		args.put("containerName", "");
		ActionProcessor.exec(this, actionid, args);
		UMView.open(args);
	}

}
