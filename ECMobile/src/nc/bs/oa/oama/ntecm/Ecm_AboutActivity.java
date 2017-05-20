package nc.bs.oa.oama.ntecm;

import java.util.Map;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

import com.yonyou.uap.um.application.ApplicationContext;
import com.yonyou.uap.um.base.UMDslConfigure;
import com.yonyou.uap.um.base.UMEventArgs;
import com.yonyou.uap.um.binder.IBinderGroup;
import com.yonyou.uap.um.binder.PropertyBinder;
import com.yonyou.uap.um.common.Common;
import com.yonyou.uap.um.control.UMButton;
import com.yonyou.uap.um.control.UMImage;
import com.yonyou.uap.um.control.UMLabel;
import com.yonyou.uap.um.control.UMTextbox;
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
import com.yonyou.uap.um.runtime.UMView;
import com.yonyou.uap.um.third.ThirdControl;

public abstract class Ecm_AboutActivity extends UMWindowActivity {

	protected UMWindow Ecm_About = null;
protected XVerticalLayout viewPage0 = null;
protected XHorizontalLayout navigatorbar0 = null;
protected UMButton button0 = null;
protected UMLabel label0 = null;
protected UMButton button4 = null;
protected XVerticalLayout panel0 = null;
protected XVerticalLayout panel1 = null;
protected UMImage image0 = null;
protected UMTextbox textbox0 = null;
protected XVerticalLayout panel2 = null;
protected UMButton button1 = null;
protected XHorizontalLayout panel3 = null;
protected XVerticalLayout panel4 = null;
protected XHorizontalLayout panel5 = null;
protected UMButton button2 = null;
protected UMImage image1 = null;
protected XHorizontalLayout panel6 = null;
protected UMButton button3 = null;
protected UMImage image2 = null;
protected XVerticalLayout panel7 = null;
protected UMTextbox textbox1 = null;
protected UMTextbox textbox2 = null;

	
	protected final static int ID_ECM_ABOUT = 1982343617;
protected final static int ID_VIEWPAGE0 = 414865217;
protected final static int ID_NAVIGATORBAR0 = 1245156502;
protected final static int ID_BUTTON0 = 11854840;
protected final static int ID_LABEL0 = 859855081;
protected final static int ID_BUTTON4 = 1593337204;
protected final static int ID_PANEL0 = 1083833039;
protected final static int ID_PANEL1 = 1704193310;
protected final static int ID_IMAGE0 = 1607024902;
protected final static int ID_TEXTBOX0 = 284716327;
protected final static int ID_PANEL2 = 1977862456;
protected final static int ID_BUTTON1 = 596405571;
protected final static int ID_PANEL3 = 1175297945;
protected final static int ID_PANEL4 = 1817257865;
protected final static int ID_PANEL5 = 1465897196;
protected final static int ID_BUTTON2 = 1317040600;
protected final static int ID_IMAGE1 = 1766505323;
protected final static int ID_PANEL6 = 2033698464;
protected final static int ID_BUTTON3 = 389336952;
protected final static int ID_IMAGE2 = 1602556156;
protected final static int ID_PANEL7 = 1818957507;
protected final static int ID_TEXTBOX1 = 71868610;
protected final static int ID_TEXTBOX2 = 1473051093;

	
	
	@Override
	public String getControllerName() {
		return "Ecm_AboutController";
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
		  idmap.put("Ecm_About",ID_ECM_ABOUT);
  idmap.put("viewPage0",ID_VIEWPAGE0);
  idmap.put("navigatorbar0",ID_NAVIGATORBAR0);
  idmap.put("button0",ID_BUTTON0);
  idmap.put("label0",ID_LABEL0);
  idmap.put("button4",ID_BUTTON4);
  idmap.put("panel0",ID_PANEL0);
  idmap.put("panel1",ID_PANEL1);
  idmap.put("image0",ID_IMAGE0);
  idmap.put("textbox0",ID_TEXTBOX0);
  idmap.put("panel2",ID_PANEL2);
  idmap.put("button1",ID_BUTTON1);
  idmap.put("panel3",ID_PANEL3);
  idmap.put("panel4",ID_PANEL4);
  idmap.put("panel5",ID_PANEL5);
  idmap.put("button2",ID_BUTTON2);
  idmap.put("image1",ID_IMAGE1);
  idmap.put("panel6",ID_PANEL6);
  idmap.put("button3",ID_BUTTON3);
  idmap.put("image2",ID_IMAGE2);
  idmap.put("panel7",ID_PANEL7);
  idmap.put("textbox1",ID_TEXTBOX1);
  idmap.put("textbox2",ID_TEXTBOX2);

	}
	
	public void onLoad() {
		ULog.logLC("onLoad", this);
		if(currentPage!=null) {
			currentPage.onLoad();
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
,"onclick","closeabout"
,"font-family","default"
,"valign","center"
,"background-image","btn_back.png"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,button0,"value","#{res.ecm_back}"));
button0.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Ecm_AboutActivity.this);
    actionCloseabout(button0,args);

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
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label0,"content","#{res.ecm_about}"));
navigatorbar0.addView(label0);
button4 = (UMButton)ThirdControl.createControl(new UMButton(context),ID_BUTTON4
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
navigatorbar0.addView(button4);

return navigatorbar0;
}
public View getPanel1View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel1 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL1
,"halign","center"
,"height","150"
,"layout-type","linear"
,"width","fill"
);
image0 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_IMAGE0
,"height","57"
,"layout-type","linear"
,"width","57"
,"scaletype","fitcenter"
,"margin-top","30"
,"src","app.png"
);
panel1.addView(image0);
textbox0 = (UMTextbox)ThirdControl.createControl(new UMTextbox(context),ID_TEXTBOX0
,"padding-left","4"
,"halign","CENTER"
,"width","200"
,"maxlength","256"
,"height","22"
,"color","#808080"
,"font-size","15"
,"layout-type","linear"
,"font-family","default"
,"margin-top","10"
,"readonly","true"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,textbox0,"value","#{res.appname} #{app.versionName}"));
panel1.addView(textbox0);

return panel1;
}
public View getPanel2View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel2 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL2
,"padding-right","15"
,"padding-left","15"
,"halign","left"
,"height","44"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
);
button1 = (UMButton)ThirdControl.createControl(new UMButton(context),ID_BUTTON1
,"halign","left"
,"height","44.0"
,"color","#000000"
,"layout-type","linear"
,"font-size","15"
,"width","fill"
,"font-family","default"
,"font-pressed-color","#e50011"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,button1,"value","#{res.ecm_updateversion}"));
button1.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		ECMobileUpdate.check(Ecm_AboutActivity.this);
	}
});
panel2.addView(button1);

return panel2;
}
public View getPanel3View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel3 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL3
,"height","1"
,"layout-type","linear"
,"width","fill"
,"valign","center"
);
panel4 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL4
,"halign","center"
,"height","60.0"
,"layout-type","linear"
,"width","15"
,"background","#ffffff"
);
panel3.addView(panel4);

return panel3;
}
public View getPanel5View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel5 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL5
,"padding-left","15"
,"padding-right","15"
,"height","44"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"valign","center"
);
button2 = (UMButton)ThirdControl.createControl(new UMButton(context),ID_BUTTON2
,"halign","left"
,"weight","1"
,"width","0"
,"font-pressed-color","#e50011"
,"height","44"
,"color","#000000"
,"font-size","15"
,"layout-type","linear"
,"onclick","newcharacter"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,button2,"value","#{res.ecm_newcharacter}"));
button2.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Ecm_AboutActivity.this);
    actionNewcharacter(button2,args);

}
});
panel5.addView(button2);
image1 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_IMAGE1
,"height","13"
,"layout-type","linear"
,"width","8"
,"scaletype","fitcenter"
,"src","ecm_set_jt.png"
);
panel5.addView(image1);

return panel5;
}
public View getPanel6View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel6 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL6
,"padding-right","15"
,"padding-left","15"
,"height","44"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"margin-top","20"
,"valign","center"
);
button3 = (UMButton)ThirdControl.createControl(new UMButton(context),ID_BUTTON3
,"halign","left"
,"weight","1"
,"width","0"
,"font-pressed-color","#e50011"
,"height","44"
,"color","#000000"
,"font-size","15"
,"layout-type","linear"
,"onclick","feedback"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,button3,"value","#{res.ecm_feedback}"));
button3.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Ecm_AboutActivity.this);
    actionFeedback(button3,args);

}
});
panel6.addView(button3);
image2 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_IMAGE2
,"height","13"
,"layout-type","linear"
,"width","8"
,"scaletype","fitcenter"
,"src","ecm_set_jt.png"
);
panel6.addView(image2);

return panel6;
}
public View getPanel0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel0 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL0
,"halign","center"
,"height","0"
,"weight","1"
,"layout-type","linear"
,"width","fill"
);
View panel1 = (View) getPanel1View((UMActivity)context,binderGroup,configure);
panel0.addView(panel1);
View panel2 = (View) getPanel2View((UMActivity)context,binderGroup,configure);
panel0.addView(panel2);
View panel3 = (View) getPanel3View((UMActivity)context,binderGroup,configure);
panel0.addView(panel3);
View panel5 = (View) getPanel5View((UMActivity)context,binderGroup,configure);
panel0.addView(panel5);
View panel6 = (View) getPanel6View((UMActivity)context,binderGroup,configure);
panel0.addView(panel6);

return panel0;
}
public View getPanel7View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel7 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL7
,"halign","center"
,"height","80"
,"layout-type","linear"
,"width","fill"
);
textbox1 = (UMTextbox)ThirdControl.createControl(new UMTextbox(context),ID_TEXTBOX1
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
,"readonly","true"
);
panel7.addView(textbox1);
textbox2 = (UMTextbox)ThirdControl.createControl(new UMTextbox(context),ID_TEXTBOX2
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
,"readonly","true"
);
panel7.addView(textbox2);

return panel7;
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
View panel7 = (View) getPanel7View((UMActivity)context,binderGroup,configure);
viewPage0.addView(panel7);

return viewPage0;
}
public UMWindow getCurrentWindow(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
Ecm_About = (UMWindow)ThirdControl.createControl(new UMWindow(context),ID_ECM_ABOUT
,"halign","center"
,"height","fill"
,"layout","vbox"
,"width","fill"
,"controller","Ecm_AboutController"
,"namespace","nc.bs.oa.oama.ecm"
);
View viewPage0 = (View) getViewPage0View((UMActivity)context,binderGroup,configure);
Ecm_About.addView(viewPage0);

return (UMWindow)Ecm_About;
}

	
	public void actionFeedback(View control, UMEventArgs args) {
    String actionid = "feedback";
    args.put("viewid","nc.bs.oa.oama.ecm.feedback.FeedBackMain");
    args.put("iskeep","true");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.open(args);
}
public void actionNewcharacter(View control, UMEventArgs args) {
    String actionid = "newcharacter";
    args.put("viewid","nc.bs.oa.oama.ecm.Ecm_Welcome");
    args.put("iskeep","true");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.open(args);
}
public void actionCloseabout(View control, UMEventArgs args) {
    String actionid = "closeabout";
    args.put("resultcode","0");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.close(args);
}


}
