package nc.bs.oa.oama.ntecm;

import com.yonyou.uap.um.application.ApplicationContext;
import com.yonyou.uap.um.base.*;
import com.yonyou.uap.um.common.*;
import com.yonyou.uap.um.third.*;
import com.yonyou.uap.um.control.*;
import com.yonyou.uap.um.core.*;
import com.yonyou.uap.um.binder.*;
import com.yonyou.uap.um.runtime.*;
import com.yonyou.uap.um.lexer.*;
import com.yonyou.uap.um.widget.*;
import com.yonyou.uap.um.widget.UmpSlidingLayout.SlidingViewType;
import com.yonyou.uap.um.log.ULog;
import java.util.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import android.webkit.*;
import android.content.*;
import android.content.SharedPreferences.Editor;
import android.graphics.*;
import android.widget.ImageView.ScaleType;

public abstract class Ecm_ConnectActivity extends UMWindowActivity {

	protected UMWindow Ecm_Connect = null;
protected XVerticalLayout viewPage0 = null;
protected XHorizontalLayout navigatorbar0 = null;
protected UMImage image1 = null;
protected UMLabel label0 = null;
protected UMImage image0 = null;
protected XVerticalLayout mainPanel = null;
protected XHorizontalLayout panel0 = null;
protected UMTextbox textbox0 = null;
protected UMLabel label3 = null;
protected UMNumberEdit textbox1 = null;
protected XVerticalLayout panel1 = null;
protected UMButton button1 = null;

	
	protected final static int ID_ECM_CONNECT = 1483796294;
protected final static int ID_VIEWPAGE0 = 347059393;
protected final static int ID_NAVIGATORBAR0 = 1478797382;
protected final static int ID_IMAGE1 = 44412031;
protected final static int ID_LABEL0 = 1267129697;
protected final static int ID_IMAGE0 = 650705444;
protected final static int ID_MAINPANEL = 1302499933;
protected final static int ID_PANEL0 = 1525994471;
protected final static int ID_TEXTBOX0 = 676584803;
protected final static int ID_LABEL3 = 1344049964;
protected final static int ID_TEXTBOX1 = 83575738;
protected final static int ID_PANEL1 = 706835852;
protected final static int ID_BUTTON1 = 1773974075;

	
	
	@Override
	public String getControllerName() {
		return "Ecm_ConnectController";
	}
	
	@Override
	public String getContextName() {
		return "connectinfor";
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
		//判断是否在login界面  在此界面收到通知 会将此界面调到前台
		SharedPreferences sp = this.getSharedPreferences("NOTIFICATION",Ecm_ConnectActivity.MODE_PRIVATE);
		Editor editor = sp.edit();
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
		SharedPreferences sp = this.getSharedPreferences("NOTIFICATION",Ecm_ConnectActivity.MODE_PRIVATE);
		Editor editor = sp.edit();
		editor.putString("isloginActivity", "false");
		editor.commit();
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
		  idmap.put("Ecm_Connect",ID_ECM_CONNECT);
  idmap.put("viewPage0",ID_VIEWPAGE0);
  idmap.put("navigatorbar0",ID_NAVIGATORBAR0);
  idmap.put("image1",ID_IMAGE1);
  idmap.put("label0",ID_LABEL0);
  idmap.put("image0",ID_IMAGE0);
  idmap.put("mainPanel",ID_MAINPANEL);
  idmap.put("panel0",ID_PANEL0);
  idmap.put("textbox0",ID_TEXTBOX0);
  idmap.put("label3",ID_LABEL3);
  idmap.put("textbox1",ID_TEXTBOX1);
  idmap.put("panel1",ID_PANEL1);
  idmap.put("button1",ID_BUTTON1);

	}
	
	public void onLoad() {
		ULog.logLC("onLoad", this);
		if(currentPage!=null) {
			currentPage.onLoad();
		}
	
		{ //viewPage0 - loadConfig
    UMEventArgs args = new UMEventArgs(Ecm_ConnectActivity.this);
    actionLoadConfig(viewPage0,args);

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
	
	
	
	public View getNavigatorbar0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
navigatorbar0 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_NAVIGATORBAR0
,"padding-left","8"
,"padding-right","8"
,"title",""
,"height","44.0"
,"color","#000000"
,"width","fill"
,"font-size","17"
,"layout-type","linear"
,"font-family","default"
,"valign","center"
,"background-image","navbar_login.png"
);
image1 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_IMAGE1
,"height","44"
,"layout-type","linear"
,"width","44"
,"onclick","shareqrcode"
,"scaletype","fitcenter"
,"src","ecm_discovery_qrcode.png"
);
image1.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Ecm_ConnectActivity.this);
    actionShareqrcode(image1,args);

}
});
navigatorbar0.addView(image1);
label0 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL0
,"halign","center"
,"height","fill"
,"weight","1"
,"color","#000000"
,"layout-type","linear"
,"font-size","17"
,"width","0"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label0,"content","#{res.serversetting}"));
navigatorbar0.addView(label0);
image0 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_IMAGE0
,"height","44"
,"layout-type","linear"
,"width","44"
,"onclick","getcode"
,"scaletype","fitcenter"
,"src","ecm_loginconset_qrcode.png"
);
image0.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Ecm_ConnectActivity.this);
    actionGetcode(image0,args);

}
});
navigatorbar0.addView(image0);

return navigatorbar0;
}
public View getPanel0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel0 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL0
,"height","44"
,"layout-type","linear"
,"width","fill"
,"margin-top","10"
,"valign","center"
);
textbox0 = (UMTextbox)ThirdControl.createControl(new UMTextbox(context),ID_TEXTBOX0
,"bindfield","ip"
,"padding-left","2"
,"halign","LEFT"
,"weight","2"
,"width","0"
,"maxlength","256"
,"height","44"
,"color","#333333"
,"layout-type","linear"
,"font-size","15"
,"font-family","default"
,"background-image","setting_ip"
);
UMTextBinder textbox0_binder = new UMTextBinder((IUMContextAccessor)context);
textbox0_binder.setBindInfo(new BindInfo("ip"));
textbox0_binder.setControl(textbox0);
binderGroup.addBinderToGroup(ID_TEXTBOX0, textbox0_binder);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,textbox0,"placeholder","#{res.serverip}"));
panel0.addView(textbox0);
label3 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL3
,"halign","center"
,"height","44"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","28"
,"font-family","default"
,"valign","center"
);
panel0.addView(label3);
textbox1 = (UMNumberEdit)ThirdControl.createControl(new UMNumberEdit(context),ID_TEXTBOX1
,"bindfield","port"
,"min","0.0"
,"padding-left","2"
,"halign","LEFT"
,"weight","1"
,"placeholder","8080"
,"width","0"
,"height","44"
,"color","#333333"
,"layout-type","linear"
,"font-size","15"
,"font-family","default"
,"background-image","setting_port"
);
UMTextBinder textbox1_binder = new UMTextBinder((IUMContextAccessor)context);
textbox1_binder.setBindInfo(new BindInfo("port"));
textbox1_binder.setControl(textbox1);
binderGroup.addBinderToGroup(ID_TEXTBOX1, textbox1_binder);
panel0.addView(textbox1);

return panel0;
}
public View getPanel1View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel1 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL1
,"halign","center"
,"height","40"
,"layout-type","linear"
,"width","fill"
,"margin-top","30"
,"background-image","ecm_login_background.png"
);
button1 = (UMButton)ThirdControl.createControl(new UMButton(context),ID_BUTTON1
,"halign","center"
,"height","40"
,"color","#ffffff"
,"layout-type","linear"
,"font-size","17"
,"width","fill"
,"onclick","saveSetting"
,"font-family","default"
,"font-pressed-color","#ffffff"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,button1,"value","#{res.save}"));
button1.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Ecm_ConnectActivity.this);
    actionSaveSetting(button1,args);

}
});
panel1.addView(button1);

return panel1;
}
public View getMainPanelView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
mainPanel = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_MAINPANEL
,"padding-right","30"
,"padding-left","30"
,"halign","center"
,"height","fill"
,"layout-type","linear"
,"width","fill"
);
View panel0 = (View) getPanel0View((UMActivity)context,binderGroup,configure);
mainPanel.addView(panel0);
View panel1 = (View) getPanel1View((UMActivity)context,binderGroup,configure);
mainPanel.addView(panel1);

return mainPanel;
}
public View getViewPage0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
viewPage0 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_VIEWPAGE0
,"halign","center"
,"height","fill"
,"onload","loadConfig"
,"layout-type","vbox"
,"background","#F5F5F5"
,"width","fill"
);
View navigatorbar0 = (View) getNavigatorbar0View((UMActivity)context,binderGroup,configure);
viewPage0.addView(navigatorbar0);
View mainPanel = (View) getMainPanelView((UMActivity)context,binderGroup,configure);
viewPage0.addView(mainPanel);

return viewPage0;
}
public UMWindow getCurrentWindow(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
Ecm_Connect = (UMWindow)ThirdControl.createControl(new UMWindow(context),ID_ECM_CONNECT
,"halign","center"
,"height","fill"
,"layout","vbox"
,"width","fill"
,"context","connectinfor"
,"controller","Ecm_ConnectController"
,"namespace","nc.bs.oa.oama.ecm"
);
View viewPage0 = (View) getViewPage0View((UMActivity)context,binderGroup,configure);
Ecm_Connect.addView(viewPage0);

return (UMWindow)Ecm_Connect;
}

	
	public void actionAfterSave(View control, UMEventArgs args) {
    String actionid = "afterSave";
    args.put("isReset","#{plug.isreset}");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "afterSave",UMActivity.getViewId(control),args);
}
public void actionToqrcodeimg(View control, UMEventArgs args) {
    String actionid = "toqrcodeimg";
    args.put("viewid","nc.bs.oa.oama.ecm.Ecm_Serviceqrcode");
    args.put("iskeep","true");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.open(args);
}
public void actionGetqrcodeimg(View control, UMEventArgs args) {
    String actionid = "getqrcodeimg";
    args.put("port","#{port}");
    args.put("host","#{ip}");
    args.put("error","qrcodeError");
    args.put("viewid","nc.bs.oa.oama.ecm.QRCoderController");
    args.put("callback","toqrcodeimg");
    args.put("action","connect");
    args.put("autoDataBinding","false");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMService.callAction(args);
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
    args.put("host","ip");
    args.put("ishttps","ishttps");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMService.loadConfigure(args);
}
public void actionQrcodeError(View control, UMEventArgs args) {
    String actionid = "qrcodeError";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "qrcodeError",UMActivity.getViewId(control),args);
}
public void actionGetcode(View control, UMEventArgs args) {
    String actionid = "getcode";
    args.put("bindfield","key");
    args.put("frameheight","800");
    args.put("hastoast","true");
    args.put("callback","saveservice");
    args.put("frameclose","true");
    args.put("iskeep","true");
    args.put("framewidth","800");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMDevice.captureTwodcode(args);
}
public void actionCloseWindow(View control, UMEventArgs args) {
    String actionid = "closeWindow";
    args.put("resultcode","15");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.close(args);
}
public void actionSaveSetting(View control, UMEventArgs args) {
    String actionid = "saveSetting";
    args.put("port","#{port}");
    args.put("host","#{ip}");
    args.put("ishttps","#{ishttps}");
  this.dataCollect();
    args.put("callback","afterSave");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMService.writeConfigure(args);
}
public void actionSaveservice(View control, UMEventArgs args) {
    String actionid = "saveservice";
  this.dataCollect();
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "saveservice",UMActivity.getViewId(control),args);
}
public void actionShareqrcode(View control, UMEventArgs args) {
    String actionid = "shareqrcode";
  this.dataCollect();
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "shareqrcode",UMActivity.getViewId(control),args);
}


}
