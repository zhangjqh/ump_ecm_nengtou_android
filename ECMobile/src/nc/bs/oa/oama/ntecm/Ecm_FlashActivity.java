package nc.bs.oa.oama.ntecm;

import com.yonyou.protocol.Constants.Notificatin;
import com.yonyou.pushclient.PushServiceManager;
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

import wa.android.common.App;

import nc.bs.oa.oama.push.ECMPushService;
import nc.bs.oa.oama.push.MsgManager;
import nc.bs.oa.oama.push.NotificationActivityImple;
import android.os.*;
import android.util.Log;
import android.view.*;
import android.widget.*;
import android.webkit.*;
import android.content.*;
import android.content.SharedPreferences.Editor;
import android.graphics.*;
import android.widget.ImageView.ScaleType;

public abstract class Ecm_FlashActivity extends UMWindowActivity {

	protected UMWindow Ecm_Flash = null;
protected XVerticalLayout basePanel = null;
protected XVerticalLayout panel0 = null;
protected UMImage logoImg = null;
protected XVerticalLayout panel1 = null;
protected UMTextbox textbox0 = null;
protected XVerticalLayout panel2 = null;

	
	protected final static int ID_ECM_FLASH = 1035655554;
protected final static int ID_BASEPANEL = 758016211;
protected final static int ID_PANEL0 = 668341412;
protected final static int ID_LOGOIMG = 1458170996;
protected final static int ID_PANEL1 = 2102569614;
protected final static int ID_TEXTBOX0 = 493968179;
protected final static int ID_PANEL2 = 408575520;

	
	
	@Override
	public String getControllerName() {
		return "Ecm_FlashController";
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
        Intent intent = getIntent();
        intent.getComponent().getClassName();
		
		String host = intent.getStringExtra("serverIp");
		int port = intent.getIntExtra("serverPort", 80);
		String username = intent.getStringExtra("loginName");
		String password = intent.getStringExtra("loginPass");
		//String autologin = intent.getStringExtra("autologin");
		if(host!=null && username!=null && password!=null){
			UMEventArgs args = new UMEventArgs(Ecm_FlashActivity.this);
			args.put("port",port);
			args.put("host",host);
			args.put("username",username);
			args.put("password",password);
			args.put("autologin","true");
			UMService.writeConfigure(args);
		}
	}
	
	@Override
	protected void onStart() {
		ULog.logLC("onStart", this);
		
		super.onStart();
		// 判断是否开启push服务
				UMEventArgs args = new UMEventArgs(Ecm_FlashActivity.this);
				UMActivity ctx = args.getUMActivity();
				String path = ThirdControl.getFile(ctx, "ECMRECEIVERPUSH")
						.getAbsolutePath();

				String ispush = null;
				byte[] data = UMFileManager.openReader(path,
						UMFileManager.UMFileReaderModle.UMFileUpdating);
				if (data != null) {
					ispush = new String(data);
				}
				Log.i("ECMRECEIVERPUSH", "*************************" + ispush
						+ "**************");
				if (ispush != null && !ispush.equals("off")) {
					
					// 启动push服务
					// start = true;
					MsgManager msgManagerImpl = new MsgManager(this);
					PushServiceManager.SetNotification
							.setContentTitle(Notificatin.NOTIFICATION_TITLE);
					// 设置自定义消息处理器
					PushServiceManager.setInformationManager(msgManagerImpl);
					PushServiceManager
							.setNotificationActivity(NotificationActivityImple.class);
					// 启动状态监控服务，用于注册推送服务在线监听器
					Intent intent = new Intent(ECMPushService.getAction());
					startService(intent);
					String deviceId = PushServiceManager.getDeviceId();
					Log.i("DEVICE", "****************" + deviceId + "***************");
					//push 开起  给打开任务详情的时候提供判断条件
					SharedPreferences sp = this.getSharedPreferences("NOTIFICATION", Ecm_FlashActivity.MODE_PRIVATE);
					Editor editor = sp.edit();
					editor.putString("pushisopen", "true");
					editor.commit();
				}
		
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
	
	public  void onInit(Bundle savedInstanceState) {
		ULog.logLC("onInit", this);
		UMActivity context = this;
		UMDslConfigure configure = new UMDslConfigure();
		registerControl();
		this.getContainer();
		
		/*
		 new Thread() {
			 public void run() {
				 UMPDebugClient.startServer();
			 }
		 }.start();
		*/
		String sys_debug = ApplicationContext.getCurrent(this).getValue("sys_debug");
		if (sys_debug != null && sys_debug.equalsIgnoreCase("true")) {
			UMPDebugClient.waitForDebug();
		}

		IBinderGroup binderGroup = this;
		currentPage = getCurrentWindow(context, binderGroup,configure);
this.setContentView(currentPage);

		
	}
	
	private void registerControl() {
		  idmap.put("Ecm_Flash",ID_ECM_FLASH);
  idmap.put("basePanel",ID_BASEPANEL);
  idmap.put("panel0",ID_PANEL0);
  idmap.put("logoImg",ID_LOGOIMG);
  idmap.put("panel1",ID_PANEL1);
  idmap.put("textbox0",ID_TEXTBOX0);
  idmap.put("panel2",ID_PANEL2);

	}
	
	public void onLoad() {
		ULog.logLC("onLoad", this);
		if(currentPage!=null) {
			currentPage.onLoad();
		}
	
		{ //basePanel - loadConfig
    UMEventArgs args = new UMEventArgs(Ecm_FlashActivity.this);
    actionLoadConfig(basePanel,args);

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
	public Map<String,String> getPlugout(String id) {
		XJSON from = this.getUMContext();
		Map<String,String> r = super.getPlugout(id);
		
		return r;	
	}
	
	
	
	public View getBasePanelView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
basePanel = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_BASEPANEL
,"halign","center"
,"height","fill"
,"onload","loadConfig"
,"layout-type","vbox"
,"background","#FFFFFF"
,"width","fill"
);
panel0 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL0
,"halign","center"
,"height","180"
,"layout-type","linear"
,"width","fill"
);
basePanel.addView(panel0);
logoImg = (UMImage)ThirdControl.createControl(new UMImage(context),ID_LOGOIMG
,"height","50"
,"layout-type","linear"
,"width","76.0"
,"scaletype","fitcenter"
,"src","logo_yonyou.png"
);
basePanel.addView(logoImg);
panel1 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL1
,"halign","center"
,"height","0"
,"weight","1"
,"layout-type","linear"
,"width","fill"
);
basePanel.addView(panel1);
textbox0 = (UMTextbox)ThirdControl.createControl(new UMTextbox(context),ID_TEXTBOX0
,"padding-left","4"
,"halign","LEFT"
,"widthwrap","120.0"
,"placeholder",""
,"width","wrap"
,"height","13"
,"color","#E11714"
,"font-size","12"
,"layout-type","linear"
,"value","Power by Baosight"
,"font-family","default"
,"readonly","true"
);
basePanel.addView(textbox0);
panel2 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL2
,"halign","center"
,"height","10"
,"layout-type","linear"
,"width","fill"
);
basePanel.addView(panel2);

return basePanel;
}
public UMWindow getCurrentWindow(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
Ecm_Flash = (UMWindow)ThirdControl.createControl(new UMWindow(context),ID_ECM_FLASH
,"halign","center"
,"height","fill"
,"layout","vbox"
,"width","fill"
,"context","USERS"
,"controller","Ecm_FlashController"
,"namespace","nc.bs.oa.oama.ecm"
);
View basePanel = (View) getBasePanelView((UMActivity)context,binderGroup,configure);
Ecm_Flash.addView(basePanel);

return (UMWindow)Ecm_Flash;
}

	
	public void actionAfterLogin(View control, UMEventArgs args) {
    String actionid = "afterLogin";
    args.put("containerName","");
    args.put("version","#{app.versionCode}");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "afterLogin",UMActivity.getViewId(control),args);
}
public void actionToLogin(View control, UMEventArgs args) {
    String actionid = "toLogin";
    args.put("viewid","nc.bs.oa.oama.ecm.Ecm_Login");
    args.put("iskeep","false");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.open(args);
}
public void actionLoadConfig(View control, UMEventArgs args) {
    String actionid = "loadConfig";
    args.put("port","port");
    args.put("username","username");
    args.put("host","ip");
    args.put("ishttps","ishttps");
    args.put("callback","beforeLogin");
    args.put("autologin","autologin");
    args.put("password","password");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMService.loadConfigure(args);
}
public void actionOpenMainView(View control, UMEventArgs args) {
    String actionid = "openMainView";
    args.put("viewid","nc.bs.oa.oama.ecm.Ecm_Main");
    args.put("iskeep","false");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.open(args);
}
public void actionLoginAction(View control, UMEventArgs args) {
    String actionid = "loginAction";
    args.put("error","toLogin");
  this.dataCollect();
    args.put("type","xt");
    args.put("success","afterLogin");
    args.put("user","#{username}");
    args.put("contextmapping","none");
    args.put("containerName","");
    args.put("pass","#{password}");
  ActionProcessor.exec(this, actionid, args);
UMService.login(args);
}
public void actionBeforeLogin(View control, UMEventArgs args) {
    String actionid = "beforeLogin";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "beforeLogin",UMActivity.getViewId(control),args);
}
public void actionToWelcome(View control, UMEventArgs args) {
    String actionid = "toWelcome";
    args.put("viewid","nc.bs.oa.oama.ecm.Ecm_Welcome");
    args.put("iskeep","false");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.open(args);
}


}
