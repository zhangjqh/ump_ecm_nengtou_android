package nc.bs.oa.oama.ntecm;

import com.yonyou.pushclient.ServiceOnlineReceiver;
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

import nc.bs.oa.oama.push.ECMPushService;
import android.os.*;
import android.view.*;
import android.widget.*;
import android.webkit.*;
import android.app.NotificationManager;
import android.content.*;
import android.content.SharedPreferences.Editor;
import android.graphics.*;
import android.widget.ImageView.ScaleType;

public abstract class Ecm_SetActivity extends UMWindowActivity {

	protected UMWindow Ecm_set = null;
protected XVerticalLayout viewPage0 = null;
protected XHorizontalLayout navigatorbar0 = null;
protected UMLabel navLabel = null;
protected XVerticalLayout panel0 = null;
protected XHorizontalLayout panel2 = null;
protected UMButton button1 = null;
protected UMImage image2 = null;
protected XHorizontalLayout panel5 = null;
protected UMButton button0 = null;
protected UMImage image0 = null;
protected XHorizontalLayout panel3 = null;
protected UMLabel label0 = null;
protected UMLabel label1 = null;
protected UMSwitch switch0 = null;
protected XHorizontalLayout panel4 = null;
protected UMButton button2 = null;
protected XVerticalLayout panel1 = null;
protected XVerticalLayout widget0 = null;
protected XHorizontalLayout widget0_toolbar0 = null;
protected UMImageButton widget0_imagebutton0 = null;
protected UMImageButton widget0_imagebutton2 = null;
protected UMImageButton widget0_imagebutton4 = null;

	
	protected final static int ID_ECM_SET = 1690607550;
protected final static int ID_VIEWPAGE0 = 97798823;
protected final static int ID_NAVIGATORBAR0 = 1925995618;
protected final static int ID_NAVLABEL = 18663162;
protected final static int ID_PANEL0 = 1673771954;
protected final static int ID_PANEL2 = 47623979;
protected final static int ID_BUTTON1 = 1073014871;
protected final static int ID_IMAGE2 = 1370448046;
protected final static int ID_PANEL5 = 1028676922;
protected final static int ID_BUTTON0 = 968001164;
protected final static int ID_IMAGE0 = 1259785463;
protected final static int ID_PANEL3 = 1855107462;
protected final static int ID_LABEL0 = 225985869;
protected final static int ID_LABEL1 = 1382169320;
protected final static int ID_SWITCH0 = 1251491627;
protected final static int ID_PANEL4 = 1623203139;
protected final static int ID_BUTTON2 = 481462602;
protected final static int ID_PANEL1 = 765154145;
protected final static int ID_WIDGET0 = 259811598;
protected final static int ID_WIDGET0_TOOLBAR0 = 1830037094;
protected final static int ID_WIDGET0_IMAGEBUTTON0 = 190362371;
protected final static int ID_WIDGET0_IMAGEBUTTON2 = 1095758145;
protected final static int ID_WIDGET0_IMAGEBUTTON4 = 331403795;

//push开关 状态记录

private SharedPreferences sp;
private Editor editor;
	
	
	@Override
	public String getControllerName() {
		return "Ecm_SetController";
	}
	
	@Override
	public String getContextName() {
		return "";
	}

	@Override
	public String getNameSpace() {
		return "nc.bs.oa.oama.ecm";
	}

	protected void onCreate(Bundle savedInstanceState) {
		ULog.logLC("onCreate", this);
		super.onCreate(savedInstanceState);
        onInit(savedInstanceState);
        sp = this.getSharedPreferences("NOTIFICATION", Ecm_SetActivity.MODE_PRIVATE);
        editor = sp.edit();
        
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
		  idmap.put("Ecm_set",ID_ECM_SET);
  idmap.put("viewPage0",ID_VIEWPAGE0);
  idmap.put("navigatorbar0",ID_NAVIGATORBAR0);
  idmap.put("navLabel",ID_NAVLABEL);
  idmap.put("panel0",ID_PANEL0);
  idmap.put("panel2",ID_PANEL2);
  idmap.put("button1",ID_BUTTON1);
  idmap.put("image2",ID_IMAGE2);
  idmap.put("panel5",ID_PANEL5);
  idmap.put("button0",ID_BUTTON0);
  idmap.put("image0",ID_IMAGE0);
  idmap.put("panel3",ID_PANEL3);
  idmap.put("label0",ID_LABEL0);
  idmap.put("label1",ID_LABEL1);
  idmap.put("switch0",ID_SWITCH0);
  idmap.put("panel4",ID_PANEL4);
  idmap.put("button2",ID_BUTTON2);
  idmap.put("panel1",ID_PANEL1);
  idmap.put("widget0",ID_WIDGET0);
  idmap.put("widget0_toolbar0",ID_WIDGET0_TOOLBAR0);
  idmap.put("widget0_imagebutton0",ID_WIDGET0_IMAGEBUTTON0);
  idmap.put("widget0_imagebutton2",ID_WIDGET0_IMAGEBUTTON2);
  idmap.put("widget0_imagebutton4",ID_WIDGET0_IMAGEBUTTON4);

	}
	
	public void onLoad() {
		ULog.logLC("onLoad", this);
		if(currentPage!=null) {
			currentPage.onLoad();
		}
	
		{ //viewPage0 - initSet
    UMEventArgs args = new UMEventArgs(Ecm_SetActivity.this);
    actionInitSet(viewPage0,args);

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
,"padding-right","8"
,"padding-left","8"
,"height","44.0"
,"color","#000000"
,"layout-type","linear"
,"font-size","17"
,"width","fill"
,"font-family","default"
,"valign","center"
,"background-image","navbar_login.png"
);
navLabel = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_NAVLABEL
,"halign","center"
,"height","fill"
,"color","#000000"
,"layout-type","linear"
,"font-size","17"
,"width","fill"
,"font-family","default"
,"valign","center"
,"readonly","true"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,navLabel,"content","#{res.setting}"));
navigatorbar0.addView(navLabel);

return navigatorbar0;
}
public View getPanel2View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel2 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL2
,"padding-left","15"
,"padding-right","15"
,"height","44"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"margin-top","15"
,"valign","center"
);
button1 = (UMButton)ThirdControl.createControl(new UMButton(context),ID_BUTTON1
,"halign","left"
,"weight","1"
,"width","0"
,"font-pressed-color","#e50011"
,"height","44"
,"color","#000000"
,"font-size","15"
,"layout-type","linear"
,"onclick","resetConnet"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,button1,"value","#{res.serversetting}"));
button1.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Ecm_SetActivity.this);
    actionResetConnet(button1,args);

}
});
panel2.addView(button1);
image2 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_IMAGE2
,"height","13"
,"layout-type","linear"
,"width","8"
,"scaletype","fitcenter"
,"src","ecm_set_jt.png"
);
panel2.addView(image2);

return panel2;
}
public View getPanel5View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel5 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL5
,"padding-right","15"
,"padding-left","15"
,"height","44"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"margin-top","20"
,"valign","center"
);
button0 = (UMButton)ThirdControl.createControl(new UMButton(context),ID_BUTTON0
,"halign","left"
,"weight","1"
,"width","0"
,"font-pressed-color","#e50011"
,"height","44"
,"color","#000000"
,"font-size","15"
,"layout-type","linear"
,"onclick","ecm_about"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,button0,"value","#{res.ecm_about}"));
button0.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Ecm_SetActivity.this);
    actionEcm_about(button0,args);

}
});
panel5.addView(button0);
image0 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_IMAGE0
,"height","13"
,"layout-type","linear"
,"width","8"
,"scaletype","fitcenter"
,"src","ecm_set_jt.png"
);
panel5.addView(image0);

return panel5;
}
public View getPanel3View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel3 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL3
,"padding-left","15"
,"padding-right","15"
,"height","44"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"margin-top","20"
,"valign","center"
);
label0 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL0
,"content","接受推送信息"
,"halign","center"
,"height","fill"
,"widthwrap","90.0"
,"color","#000000"
,"layout-type","linear"
,"font-size","15"
,"width","wrap"
,"font-family","default"
,"valign","center"
);
panel3.addView(label0);
label1 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL1
,"halign","center"
,"height","fill"
,"weight","1"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","0"
,"font-family","default"
,"valign","center"
);
panel3.addView(label1);
switch0 = (UMSwitch)ThirdControl.createControl(new UMSwitch(context),ID_SWITCH0
,"height","32"
,"layout-type","linear"
,"background","#167ef8"
,"width","51"
,"value","on"
,"onchange","receiverpushevent"
);
switch0.setEvent("onchange", new OnCursorEventListener(configure) {
  @Override
  public void onEvent(View v, UMEventArgs parent) {
    UMEventArgs args = new UMEventArgs(Ecm_SetActivity.this);
    args.put(parent);
    actionReceiverpushevent(switch0,args);

}
});
panel3.addView(switch0);

return panel3;
}
public View getPanel4View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel4 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL4
,"padding-left","15"
,"padding-right","15"
,"height","44"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"margin-top","20"
,"valign","center"
);
button2 = (UMButton)ThirdControl.createControl(new UMButton(context),ID_BUTTON2
,"halign","left"
,"width","fill"
,"font-pressed-color","#e50011"
,"height","44"
,"color","#000000"
,"font-size","15"
,"layout-type","linear"
,"onclick","beforeLogout"
,"font-family","default"
,"margin-top","1"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,button2,"value","#{res.logout}"));
button2.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Ecm_SetActivity.this);
    actionBeforeLogout(button2,args);

}
});
panel4.addView(button2);

return panel4;
}
public View getPanel0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel0 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL0
,"halign","center"
,"weight","1"
,"height","0"
,"layout-type","linear"
,"width","fill"
);
View panel2 = (View) getPanel2View((UMActivity)context,binderGroup,configure);
panel0.addView(panel2);
View panel5 = (View) getPanel5View((UMActivity)context,binderGroup,configure);
panel0.addView(panel5);
View panel3 = (View) getPanel3View((UMActivity)context,binderGroup,configure);
panel0.addView(panel3);
View panel4 = (View) getPanel4View((UMActivity)context,binderGroup,configure);
panel0.addView(panel4);

return panel0;
}
public View getWidget0_toolbar0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
widget0_toolbar0 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_WIDGET0_TOOLBAR0
,"height","fill"
,"layout-type","linear"
,"width","fill"
,"valign","center"
,"background-image","toolbar.png"
);
widget0_imagebutton0 = (UMImageButton)ThirdControl.createControl(new UMImageButton(context),ID_WIDGET0_IMAGEBUTTON0
,"halign","center"
,"weight","1"
,"width","0"
,"icon-width","25"
,"istogglebutton","true"
,"font-pressed-color","#e50011"
,"icon-height","25"
,"height","fill"
,"color","#8a8888"
,"layout-type","linear"
,"font-size","10"
,"icon-background-image","ecm_home.png"
,"icon-pressed-image","ecm_home_touch.png"
,"onclick","toHome"
,"font-family","default"
,"valign","center"
,"checked","false"
,"icon-text-spacing","5"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,widget0_imagebutton0,"value","#{res.homepage}"));
widget0_imagebutton0.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Ecm_SetActivity.this);
    actionToHome(widget0_imagebutton0,args);

}
});
widget0_toolbar0.addView(widget0_imagebutton0);
widget0_imagebutton2 = (UMImageButton)ThirdControl.createControl(new UMImageButton(context),ID_WIDGET0_IMAGEBUTTON2
,"halign","center"
,"weight","1"
,"width","0"
,"icon-width","25"
,"istogglebutton","true"
,"font-pressed-color","#e50011"
,"icon-height","25"
,"height","fill"
,"color","#8a8888"
,"layout-type","linear"
,"font-size","10"
,"icon-background-image","ecm_discovery.png"
,"icon-pressed-image","ecm_discovery_touch.png"
,"onclick","toDiscovery"
,"font-family","default"
,"valign","center"
,"checked","false"
,"icon-text-spacing","5"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,widget0_imagebutton2,"value","#{res.ecm_discovery}"));
widget0_imagebutton2.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Ecm_SetActivity.this);
    actionToDiscovery(widget0_imagebutton2,args);

}
});
widget0_toolbar0.addView(widget0_imagebutton2);
widget0_imagebutton4 = (UMImageButton)ThirdControl.createControl(new UMImageButton(context),ID_WIDGET0_IMAGEBUTTON4
,"halign","center"
,"weight","1"
,"width","0"
,"icon-width","25"
,"istogglebutton","true"
,"font-pressed-color","#e50011"
,"icon-height","25"
,"height","fill"
,"color","#8a8888"
,"layout-type","linear"
,"font-size","10"
,"icon-background-image","ecm_set.png"
,"icon-pressed-image","ecm_set_touch.png"
,"onclick","toSet"
,"font-family","default"
,"valign","center"
,"checked","false"
,"icon-text-spacing","5"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,widget0_imagebutton4,"value","#{res.setting}"));
widget0_imagebutton4.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Ecm_SetActivity.this);
    actionToSet(widget0_imagebutton4,args);

}
});
widget0_toolbar0.addView(widget0_imagebutton4);

return widget0_toolbar0;
}
public View getWidget0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
widget0 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_WIDGET0
,"halign","center"
,"height","49"
,"layout-type","linear"
,"width","fill"
);
View widget0_toolbar0 = (View) getWidget0_toolbar0View((UMActivity)context,binderGroup,configure);
widget0.addView(widget0_toolbar0);

return widget0;
}
public View getPanel1View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel1 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL1
,"halign","center"
,"height","49"
,"layout-type","linear"
,"width","fill"
);
View widget0 = (View) getWidget0View((UMActivity)context,binderGroup,configure);
panel1.addView(widget0);

return panel1;
}
public View getViewPage0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
viewPage0 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_VIEWPAGE0
,"halign","center"
,"height","fill"
,"onload","initSet"
,"layout-type","vbox"
,"background","#efeff4"
,"width","fill"
);
View navigatorbar0 = (View) getNavigatorbar0View((UMActivity)context,binderGroup,configure);
viewPage0.addView(navigatorbar0);
View panel0 = (View) getPanel0View((UMActivity)context,binderGroup,configure);
viewPage0.addView(panel0);
View panel1 = (View) getPanel1View((UMActivity)context,binderGroup,configure);
viewPage0.addView(panel1);

return viewPage0;
}
public UMWindow getCurrentWindow(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
Ecm_set = (UMWindow)ThirdControl.createControl(new UMWindow(context),ID_ECM_SET
,"halign","center"
,"height","fill"
,"layout","vbox"
,"width","fill"
,"controller","Ecm_SetController"
,"namespace","nc.bs.oa.oama.ecm"
);
View viewPage0 = (View) getViewPage0View((UMActivity)context,binderGroup,configure);
Ecm_set.addView(viewPage0);

return (UMWindow)Ecm_set;
}

	
	public void actionBeforeLogout(View control, UMEventArgs args) {
    String actionid = "beforeLogout";
    args.put("message","#{res.ecm_logout_confirm}");
    args.put("title","#{res.flow_notice}");
    args.put("okaction","logoutAction");
    args.put("okbuttontitle","#{res.ecm_ok}");
    args.put("style","ok-cancel");
    args.put("containerName","");
    args.put("cancelbuttontitle","#{res.ecm_cancel}");
  ActionProcessor.exec(this, actionid, args);
UMView.openDialog(args);
}
public void actionInitSet(View control, UMEventArgs args) {
    String actionid = "initSet";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "initSet",UMActivity.getViewId(control),args);
}
public void actionLogoutSuccess(View control, UMEventArgs args) {
	//解绑用户  同时终止后台push服务 清除通知
	NotificationManager nm = (NotificationManager) this.getSystemService(NOTIFICATION_SERVICE);
	nm.cancelAll();
	ServiceOnlineReceiver.notify_List.clear();
	ServiceOnlineReceiver.lists.clear();
	//没有必要关闭服务  服务与设备相对应
	//Intent intent = new Intent(ECMPushService.getAction());
	//stopService(intent);
    String actionid = "logoutSuccess";
    args.put("callback","toLogin");
    args.put("autologin","false");
    args.put("password", "");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMService.writeConfigure(args);
}
public void actionToSet(View control, UMEventArgs args) {
    String actionid = "toSet";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "toSet",UMActivity.getViewId(control),args);
}
public void actionToHome(View control, UMEventArgs args) {
    String actionid = "toHome";
    args.put("viewid","nc.bs.oa.oama.ecm.Ecm_Main");
    args.put("iskeep","false");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.open(args);
}
public void actionReceiverpushevent(View control, UMEventArgs args) {
    String actionid = "receiverpushevent";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "receiverpushevent",UMActivity.getViewId(control),args);
}
public void actionToDiscovery(View control, UMEventArgs args) {
    String actionid = "toDiscovery";
    args.put("viewid","nc.bs.oa.oama.ecm.Ecm_Discovery");
  this.dataCollect();
    args.put("iskeep","false");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.open(args);
}
public void actionLogoutAction(View control, UMEventArgs args) {
    String actionid = "logoutAction";
    args.put("viewid","nc.bs.oa.oama.ecm.EcmController");
    args.put("error","logoutFailed");
    args.put("action","logout");
    args.put("callback","logoutSuccess");
    args.put("autoDataBinding","true");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMService.callAction(args);
}
public void actionEcm_about(View control, UMEventArgs args) {
    String actionid = "ecm_about";
    args.put("viewid","nc.bs.oa.oama.ecm.Ecm_About");
    args.put("iskeep","true");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.open(args);
}
public void actionToLogin(View control, UMEventArgs args) {
    String actionid = "toLogin";
    args.put("viewid","nc.bs.oa.oama.ecm.Ecm_Login");
    args.put("iskeep","false");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.open(args);
}
/**
 * 关闭push
 * @param control
 * @param args
 */
public void actionStoppushservice(View control, UMEventArgs args) {
	Intent intent = new Intent(ECMPushService.getAction());
	stopService(intent);
	editor.putString("pushisopen", "false");
	editor.commit();
	//Toast.makeText(this, "close push", Toast.LENGTH_LONG).show();
	String actionid = "closePush";
	    args.put("viewid","nc.bs.oa.oama.ecm.EcmController");
	    args.put("action","setPush");
	    args.put("enable","false");
	    args.put("error","closeFailed");
	    args.put("containerName","");
	  ActionProcessor.exec(this, actionid, args);
	UMService.callAction(args);
}
//版本兼容问题
public void actionCloseFailed(View control, UMEventArgs args) {
    String actionid = "closeFailed";
    args.put("message","MA版本低");
	args.put("title","消息");
	args.put("okbuttontitle","确定");
	args.put("style","ok");
	args.put("containerName","");
	args.put("cancelbuttontitle","取消");
	ActionProcessor.exec(this, actionid, args);
	UMView.openDialog(args);
}
public void actionLogoutFailed(View control, UMEventArgs args) {
    String actionid = "logoutFailed";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "logoutFailed",UMActivity.getViewId(control),args);
}
public void actionResetConnet(View control, UMEventArgs args) {
    String actionid = "resetConnet";
    args.put("viewid","nc.bs.oa.oama.ecm.Ecm_Connect");
    args.put("isreset","true");
    args.put("iskeep","false");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.open(args);
}
/**
 * 开启push
 * @param control
 * @param args
 */
public void actionStartpushservice(View control, UMEventArgs args) {
	Intent intent = new Intent(ECMPushService.getAction());
	startService(intent);
	editor.putString("pushisopen", "true");
	editor.commit();
	//Toast.makeText(this, "open push", Toast.LENGTH_LONG).show();
	String actionid = "openPush";
    args.put("viewid","nc.bs.oa.oama.ecm.EcmController");
    args.put("action","setPush");
    args.put("enable","true");
    args.put("error","openFailed");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMService.callAction(args);
}
//版本兼容问题
public void actionOpenFailed(View control, UMEventArgs args) {
  String actionid = "openFailed";
  args.put("message","MA版本低");
	args.put("title","消息");
	args.put("okbuttontitle","确定");
	args.put("style","ok");
	args.put("containerName","");
	args.put("cancelbuttontitle","取消");
	ActionProcessor.exec(this, actionid, args);
	UMView.openDialog(args);
}

}
