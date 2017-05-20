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
import android.graphics.*;
import android.widget.ImageView.ScaleType;

public abstract class Info_textActivity extends UMWindowActivity {

	protected UMWindow info_text = null;
protected XVerticalLayout viewPage0 = null;
protected XHorizontalLayout navigatorbar0 = null;
protected UMButton button0 = null;
protected UMLabel label0 = null;
protected UMLabel label1 = null;
protected XVerticalLayout panel0 = null;
protected UMLabel label2 = null;
protected UMLabel label3 = null;
protected XVerticalLayout panel1 = null;
protected UMWebView webview0 = null;
protected XHorizontalLayout panel2 = null;
protected UMImage image0 = null;
protected UMLabel label4 = null;
protected XHorizontalLayout panel3 = null;
protected XVerticalLayout panel4 = null;
protected UMTextArea textarea0 = null;
protected UMButton button1 = null;
protected UMButton button2 = null;

	
	protected final static int ID_INFO_TEXT = 1975245678;
protected final static int ID_VIEWPAGE0 = 1893566226;
protected final static int ID_NAVIGATORBAR0 = 271075641;
protected final static int ID_BUTTON0 = 1041508498;
protected final static int ID_LABEL0 = 78808922;
protected final static int ID_LABEL1 = 694724969;
protected final static int ID_PANEL0 = 1337084149;
protected final static int ID_LABEL2 = 1641004348;
protected final static int ID_LABEL3 = 748209860;
protected final static int ID_PANEL1 = 1228956777;
protected final static int ID_WEBVIEW0 = 677158770;
protected final static int ID_PANEL2 = 1720823538;
protected final static int ID_IMAGE0 = 1096077301;
protected final static int ID_LABEL4 = 1688515244;
protected final static int ID_PANEL3 = 1436824423;
protected final static int ID_PANEL4 = 1183958536;
protected final static int ID_TEXTAREA0 = 1872884120;
protected final static int ID_BUTTON1 = 207669197;
protected final static int ID_BUTTON2 = 425865378;

	
	
	@Override
	public String getControllerName() {
		return "info_textController";
	}
	
	@Override
	public String getContextName() {
		return "oneinfo";
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
		  idmap.put("info_text",ID_INFO_TEXT);
  idmap.put("viewPage0",ID_VIEWPAGE0);
  idmap.put("navigatorbar0",ID_NAVIGATORBAR0);
  idmap.put("button0",ID_BUTTON0);
  idmap.put("label0",ID_LABEL0);
  idmap.put("label1",ID_LABEL1);
  idmap.put("panel0",ID_PANEL0);
  idmap.put("label2",ID_LABEL2);
  idmap.put("label3",ID_LABEL3);
  idmap.put("panel1",ID_PANEL1);
  idmap.put("webview0",ID_WEBVIEW0);
  idmap.put("panel2",ID_PANEL2);
  idmap.put("image0",ID_IMAGE0);
  idmap.put("label4",ID_LABEL4);
  idmap.put("panel3",ID_PANEL3);
  idmap.put("panel4",ID_PANEL4);
  idmap.put("textarea0",ID_TEXTAREA0);
  idmap.put("button1",ID_BUTTON1);
  idmap.put("button2",ID_BUTTON2);

	}
	
	public void onLoad() {
		ULog.logLC("onLoad", this);
		if(currentPage!=null) {
			currentPage.onLoad();
		}
	
		{ //viewPage0 - infoLoad
    UMEventArgs args = new UMEventArgs(Info_textActivity.this);
    actionInfoLoad(viewPage0,args);

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
,"pressed-image","nav"
,"width","fill"
,"background-image-dis","nav"
,"height","44.0"
,"color","#ffffff"
,"layout-type","linear"
,"font-size","17"
,"font-family","default"
,"valign","center"
,"background-image","nav.png"
);
button0 = (UMButton)ThirdControl.createControl(new UMButton(context),ID_BUTTON0
,"padding-left","15"
,"halign","left"
,"pressed-image","btn_back_touch"
,"width","64"
,"background-image-dis","button"
,"font-pressed-color","#f2adb2"
,"height","44"
,"color","#e50011"
,"layout-type","linear"
,"font-size","17"
,"onclick","toClose"
,"font-family","default"
,"valign","center"
,"background-image","btn_back"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,button0,"value","#{res.info_btn_back}"));
button0.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Info_textActivity.this);
    actionToClose(button0,args);

}
});
navigatorbar0.addView(button0);
label0 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL0
,"bindfield",""
,"halign","center"
,"weight","1"
,"width","0"
,"height","fill"
,"color","#000000"
,"font-size","17"
,"layout-type","linear"
,"onclick","action:label0_onclick"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label0,"content","#{res.info_title_info}"));
label0.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Info_textActivity.this);
    actionLabel0_onclick(label0,args);

}
});
navigatorbar0.addView(label0);
label1 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL1
,"halign","center"
,"height","fill"
,"color","#000000"
,"layout-type","linear"
,"font-size","12"
,"width","64"
,"font-family","default"
,"valign","center"
);
navigatorbar0.addView(label1);

return navigatorbar0;
}
public View getPanel0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel0 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL0
,"padding-right","10"
,"padding-left","10"
,"halign","center"
,"height","58"
,"layout-type","linear"
,"width","fill"
);
label2 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL2
,"bindfield","infotitle"
,"halign","left"
,"height","32.0"
,"color","#000000"
,"layout-type","linear"
,"font-size","16"
,"width","fill"
,"font-family","default"
,"valign","center"
);
UMTextBinder label2_binder = new UMTextBinder((IUMContextAccessor)context);
label2_binder.setBindInfo(new BindInfo("infotitle"));
label2_binder.setControl(label2);
binderGroup.addBinderToGroup(ID_LABEL2, label2_binder);
panel0.addView(label2);
label3 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL3
,"bindfield","publishdate"
,"halign","left"
,"height","20"
,"color","#000000"
,"layout-type","linear"
,"font-size","12"
,"width","fill"
,"font-family","default"
,"valign","center"
);
UMTextBinder label3_binder = new UMTextBinder((IUMContextAccessor)context);
label3_binder.setBindInfo(new BindInfo("publishdate"));
label3_binder.setControl(label3);
binderGroup.addBinderToGroup(ID_LABEL3, label3_binder);
panel0.addView(label3);

return panel0;
}
public View getPanel1View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel1 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL1
,"halign","center"
,"height","0"
,"weight","1"
,"layout-type","linear"
,"width","fill"
,"padding-bottom","8"
);
webview0 = (UMWebView)ThirdControl.createControl(new UMWebView(context),ID_WEBVIEW0
,"bindfield","content"
,"halign","center"
,"height","fill"
,"layout","vbox"
,"width","fill"
,"zoomscale","default"
);
UMWebViewBinder webview0_binder = new UMWebViewBinder((IUMContextAccessor)context);
webview0_binder.setBindInfo(new BindInfo("content"));
webview0_binder.setControl(webview0);
binderGroup.addBinderToGroup(ID_WEBVIEW0, webview0_binder);
panel1.addView(webview0);

return panel1;
}
public View getPanel2View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel2 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL2
,"padding-right","10"
,"padding-left","10"
,"height","33"
,"layout-type","linear"
,"width","fill"
,"onclick","toAttach"
,"valign","center"
);
panel2.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Info_textActivity.this);
    actionToAttach(panel2,args);

}
});
image0 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_IMAGE0
,"height","22"
,"layout-type","linear"
,"width","10"
,"scaletype","fitcenter"
,"src","oainf_attach.png"
);
panel2.addView(image0);
label4 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL4
,"halign","left"
,"height","fill"
,"weight","1"
,"color","#000000"
,"layout-type","linear"
,"font-size","13"
,"width","0"
,"margin-left","2"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label4,"content","#{res.info_txt_attach}"));
panel2.addView(label4);

return panel2;
}
public View getPanel4View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel4 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL4
,"padding-top","10"
,"halign","center"
,"height","fill"
,"weight","1"
,"layout-type","linear"
,"width","0"
,"padding-bottom","10"
);
textarea0 = (UMTextArea)ThirdControl.createControl(new UMTextArea(context),ID_TEXTAREA0
,"padding-left","4"
,"padding-top","5"
,"halign","LEFT"
,"placeholder",""
,"width","fill"
,"padding-bottom","5"
,"height","26.0"
,"color","#167ef8"
,"font-size","17"
,"background","#ffffff"
,"layout-type","linear"
,"font-family","default"
);
panel4.addView(textarea0);

return panel4;
}
public View getPanel3View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel3 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL3
,"padding-right","10"
,"padding-left","10"
,"height","wrap"
,"heightwrap","44.0"
,"layout-type","linear"
,"background","#e8e8e8"
,"width","fill"
,"valign","center"
);
View panel4 = (View) getPanel4View((UMActivity)context,binderGroup,configure);
panel3.addView(panel4);
button1 = (UMButton)ThirdControl.createControl(new UMButton(context),ID_BUTTON1
,"halign","center"
,"pressed-image","button_touch"
,"width","42.0"
,"background-image-dis","button"
,"height","fill"
,"color","#ff0000"
,"layout-type","linear"
,"font-size","14"
,"onclick","doSubmitComment"
,"font-family","default"
,"valign","center"
,"background-image","button"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,button1,"value","#{res.info_btn_comment}"));
button1.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Info_textActivity.this);
    actionDoSubmitComment(button1,args);

}
});
panel3.addView(button1);
button2 = (UMButton)ThirdControl.createControl(new UMButton(context),ID_BUTTON2
,"halign","center"
,"pressed-image","button_touch"
,"width","42.0"
,"background-image-dis","button"
,"height","fill"
,"color","#ff0000"
,"layout-type","linear"
,"font-size","14"
,"onclick","toComment"
,"font-family","default"
,"valign","center"
,"background-image","button"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,button2,"value","#{res.info_btn_all}"));
button2.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Info_textActivity.this);
    actionToComment(button2,args);

}
});
panel3.addView(button2);

return panel3;
}
public View getViewPage0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
viewPage0 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_VIEWPAGE0
,"halign","center"
,"height","fill"
,"onload","infoLoad"
,"layout-type","vbox"
,"width","fill"
,"background","#efeff4"
);
View navigatorbar0 = (View) getNavigatorbar0View((UMActivity)context,binderGroup,configure);
viewPage0.addView(navigatorbar0);
View panel0 = (View) getPanel0View((UMActivity)context,binderGroup,configure);
viewPage0.addView(panel0);
View panel1 = (View) getPanel1View((UMActivity)context,binderGroup,configure);
viewPage0.addView(panel1);
View panel2 = (View) getPanel2View((UMActivity)context,binderGroup,configure);
viewPage0.addView(panel2);
View panel3 = (View) getPanel3View((UMActivity)context,binderGroup,configure);
viewPage0.addView(panel3);

return viewPage0;
}
public UMWindow getCurrentWindow(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
info_text = (UMWindow)ThirdControl.createControl(new UMWindow(context),ID_INFO_TEXT
,"halign","center"
,"height","460.0"
,"layout","vbox"
,"width","320.0"
,"context","oneinfo"
,"controller","info_textController"
,"namespace","nc.bs.oa.oama.ecm"
);
View viewPage0 = (View) getViewPage0View((UMActivity)context,binderGroup,configure);
info_text.addView(viewPage0);

return (UMWindow)info_text;
}

	
	public void actionAfterInfoLoad(View control, UMEventArgs args) {
    String actionid = "afterInfoLoad";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "afterInfoLoad",UMActivity.getViewId(control),args);
}
public void actionDoSubmitComment(View control, UMEventArgs args) {
    String actionid = "doSubmitComment";
  this.dataCollect();
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "doSubmitComment",UMActivity.getViewId(control),args);
}
public void actionHtmlBind(View control, UMEventArgs args) {
    String actionid = "htmlBind";
    args.put("infoid","#{infoid}");
    args.put("binderfiled","content");
  this.dataCollect();
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMService.transInfoService(args);
}
public void actionLabel0_onclick(View control, UMEventArgs args) {
    String actionid = "label0_onclick";
    args.put("language","javascript");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "this.label0_onclick()",UMActivity.getViewId(control),args);
}
public void actionUMonUnload(View control, UMEventArgs args) {
    String actionid = "UMonUnload";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "UMonUnload",UMActivity.getViewId(control),args);
}
public void actionUMonComplete(View control, UMEventArgs args) {
    String actionid = "UMonComplete";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "UMonComplete",UMActivity.getViewId(control),args);
}
public void actionInfoLoad(View control, UMEventArgs args) {
    args.put("infoid","#{plug.infoid}");
    args.put("ts","#{plug.ts}");
    args.put("viewid","nc.bs.oa.oainf.ma.infopublish.OneinfoExtendController");
    args.put("error","afterLoadError");
  this.dataCollect();
    args.put("screenh","#{plug.screenh}");
    String actionid = "infoLoad";
    args.put("screenw","#{plug.screenw}");
    args.put("callback","afterInfoLoad");
    args.put("action","oneInfoLoad");
    args.put("autoDataBinding","true");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMService.callAction(args);
}
public void actionToComment(View control, UMEventArgs args) {
    String actionid = "toComment";
    args.put("infoid","#{infoid}");
    args.put("viewid","nc.bs.oa.oama.ecm.Info_comment_list");
  this.dataCollect();
    args.put("iskeep","true");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.open(args);
}
public void actionToAttach(View control, UMEventArgs args) {
    String actionid = "toAttach";
    args.put("infoid","#{infoid}");
    args.put("viewid","nc.bs.oa.oama.ecm.Info_attach_list");
  this.dataCollect();
    args.put("iskeep","true");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.open(args);
}
public void actionUMonDataBinding(View control, UMEventArgs args) {
    String actionid = "UMonDataBinding";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "UMonDataBinding",UMActivity.getViewId(control),args);
}
public void actionAfterLoadError(View control, UMEventArgs args) {
    String actionid = "afterLoadError";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "afterLoadError",UMActivity.getViewId(control),args);
}
public void actionToClose(View control, UMEventArgs args) {
    String actionid = "toClose";
    args.put("resultcode","15");
    args.put("iskeep","false");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.close(args);
}
public void actionUMonInit(View control, UMEventArgs args) {
    String actionid = "UMonInit";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "UMonInit",UMActivity.getViewId(control),args);
}
public void actionUMonLoad(View control, UMEventArgs args) {
    String actionid = "UMonLoad";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "UMonLoad",UMActivity.getViewId(control),args);
}


}
