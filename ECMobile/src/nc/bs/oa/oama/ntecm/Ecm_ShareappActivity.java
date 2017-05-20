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

public abstract class Ecm_ShareappActivity extends UMWindowActivity {

	protected UMWindow Ecm_Shareapp = null;
protected XVerticalLayout viewPage0 = null;
protected XHorizontalLayout navigatorbar0 = null;
protected UMButton button0 = null;
protected UMLabel label0 = null;
protected UMButton button1 = null;
protected XVerticalLayout panel0 = null;
protected UMTextbox textbox0 = null;
protected UMTextbox textbox1 = null;
protected UMImage image0 = null;
protected XVerticalLayout panel2 = null;
protected UMTextbox textbox2 = null;
protected UMTextbox textbox3 = null;

	
	protected final static int ID_ECM_SHAREAPP = 598159101;
protected final static int ID_VIEWPAGE0 = 322463719;
protected final static int ID_NAVIGATORBAR0 = 1075199605;
protected final static int ID_BUTTON0 = 1197816827;
protected final static int ID_LABEL0 = 2098604047;
protected final static int ID_BUTTON1 = 625249481;
protected final static int ID_PANEL0 = 985182942;
protected final static int ID_TEXTBOX0 = 827806337;
protected final static int ID_TEXTBOX1 = 488257920;
protected final static int ID_IMAGE0 = 237632379;
protected final static int ID_PANEL2 = 1899763857;
protected final static int ID_TEXTBOX2 = 1502243618;
protected final static int ID_TEXTBOX3 = 1717771822;

	
	
	@Override
	public String getControllerName() {
		return "Ecm_ShareappController";
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
		  idmap.put("Ecm_Shareapp",ID_ECM_SHAREAPP);
  idmap.put("viewPage0",ID_VIEWPAGE0);
  idmap.put("navigatorbar0",ID_NAVIGATORBAR0);
  idmap.put("button0",ID_BUTTON0);
  idmap.put("label0",ID_LABEL0);
  idmap.put("button1",ID_BUTTON1);
  idmap.put("panel0",ID_PANEL0);
  idmap.put("textbox0",ID_TEXTBOX0);
  idmap.put("textbox1",ID_TEXTBOX1);
  idmap.put("image0",ID_IMAGE0);
  idmap.put("panel2",ID_PANEL2);
  idmap.put("textbox2",ID_TEXTBOX2);
  idmap.put("textbox3",ID_TEXTBOX3);

	}
	
	public void onLoad() {
		ULog.logLC("onLoad", this);
		if(currentPage!=null) {
			currentPage.onLoad();
		}
	
		{ //image0 - loadset
    UMEventArgs args = new UMEventArgs(Ecm_ShareappActivity.this);
    actionLoadset(image0,args);

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
button0 = (UMButton)ThirdControl.createControl(new UMButton(context),ID_BUTTON0
,"halign","center"
,"pressed-image","btn_back_touch.png"
,"width","64"
,"font-pressed-color","#f2adb2"
,"height","44"
,"color","#ff0000"
,"layout-type","linear"
,"font-size","17"
,"onclick","closeshare"
,"font-family","default"
,"valign","center"
,"background-image","btn_back.png"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,button0,"value","#{res.ecm_back}"));
button0.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Ecm_ShareappActivity.this);
    actionCloseshare(button0,args);

}
});
navigatorbar0.addView(button0);
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
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label0,"content","#{res.ecm_shareapp}"));
navigatorbar0.addView(label0);
button1 = (UMButton)ThirdControl.createControl(new UMButton(context),ID_BUTTON1
,"halign","center"
,"height","44"
,"color","#e50011"
,"layout-type","linear"
,"font-size","17"
,"width","64"
,"font-family","default"
,"font-pressed-color","#f2adb2"
,"valign","center"
);
navigatorbar0.addView(button1);

return navigatorbar0;
}
public View getPanel0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel0 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL0
,"halign","center"
,"height","0"
,"weight","1"
,"layout-type","linear"
,"width","fill"
);
textbox0 = (UMTextbox)ThirdControl.createControl(new UMTextbox(context),ID_TEXTBOX0
,"padding-left","4"
,"halign","CENTER"
,"width","200"
,"maxlength","256"
,"height","44"
,"color","#808080"
,"font-size","17"
,"layout-type","linear"
,"value","请扫描下方二维码"
,"font-family","default"
,"margin-top","40"
,"readonly","true"
);
panel0.addView(textbox0);
textbox1 = (UMTextbox)ThirdControl.createControl(new UMTextbox(context),ID_TEXTBOX1
,"padding-left","4"
,"halign","CENTER"
,"height","44"
,"maxlength","256"
,"color","#808080"
,"layout-type","linear"
,"font-size","17"
,"width","250"
,"value","以获取 掌上能投 APP"
,"font-family","default"
,"readonly","true"
);
panel0.addView(textbox1);
image0 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_IMAGE0
,"height","140"
,"onload","loadset"
,"layout-type","linear"
,"width","140"
,"scaletype","fitcenter"
,"margin-top","40"
,"src","appshare.png"
);
panel0.addView(image0);

return panel0;
}
public View getPanel2View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel2 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL2
,"halign","center"
,"height","80"
,"layout-type","linear"
,"width","fill"
);
textbox2 = (UMTextbox)ThirdControl.createControl(new UMTextbox(context),ID_TEXTBOX2
,"padding-left","4"
,"halign","CENTER"
,"height","22"
,"maxlength","256"
,"color","#808080"
,"layout-type","linear"
,"font-size","13"
,"width","200"
,"value","宝信公司 版权所有"
,"font-family","default"
,"margin-top","0"
);
panel2.addView(textbox2);
textbox3 = (UMTextbox)ThirdControl.createControl(new UMTextbox(context),ID_TEXTBOX3
,"padding-left","4"
,"halign","CENTER"
,"height","22"
,"maxlength","256"
,"color","#808080"
,"layout-type","linear"
,"font-size","13"
,"width","300"
,"value","Copyright © 2016 Baosight software Co.,Ltd"
,"font-family","default"
);
panel2.addView(textbox3);

return panel2;
}
public View getViewPage0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
viewPage0 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_VIEWPAGE0
,"halign","center"
,"height","fill"
,"layout-type","vbox"
,"background","#F5F5F5"
,"width","fill"
);
View navigatorbar0 = (View) getNavigatorbar0View((UMActivity)context,binderGroup,configure);
viewPage0.addView(navigatorbar0);
View panel0 = (View) getPanel0View((UMActivity)context,binderGroup,configure);
viewPage0.addView(panel0);
View panel2 = (View) getPanel2View((UMActivity)context,binderGroup,configure);
viewPage0.addView(panel2);

return viewPage0;
}
public UMWindow getCurrentWindow(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
Ecm_Shareapp = (UMWindow)ThirdControl.createControl(new UMWindow(context),ID_ECM_SHAREAPP
,"halign","center"
,"height","fill"
,"layout","vbox"
,"width","fill"
,"controller","Ecm_ShareappController"
,"namespace","nc.bs.oa.oama.ecm"
);
View viewPage0 = (View) getViewPage0View((UMActivity)context,binderGroup,configure);
Ecm_Shareapp.addView(viewPage0);

return (UMWindow)Ecm_Shareapp;
}

	
	public void actionCloseshare(View control, UMEventArgs args) {
    String actionid = "closeshare";
    args.put("resultcode","0");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.close(args);
}
public void actionLoadset(View control, UMEventArgs args) {
    String actionid = "loadset";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "loadset",UMActivity.getViewId(control),args);
}
public void actionToSet(View control, UMEventArgs args) {
    String actionid = "toSet";
    args.put("viewid","nc.bs.oa.oama.ecm.Set");
    args.put("iskeep","false");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.open(args);
}
public void actionToHome(View control, UMEventArgs args) {
    String actionid = "toHome";
    args.put("viewid","nc.bs.oa.oama.ecm.Ecm_Main");
    args.put("iskeep","false");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.open(args);
}
public void actionOpenurl(View control, UMEventArgs args) {
    String actionid = "openurl";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "openurl",UMActivity.getViewId(control),args);
}


}
