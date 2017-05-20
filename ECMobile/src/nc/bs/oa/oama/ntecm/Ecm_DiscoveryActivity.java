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

public abstract class Ecm_DiscoveryActivity extends UMWindowActivity {

	protected UMWindow Ecm_Discovery = null;
protected XVerticalLayout viewPage0 = null;
protected XHorizontalLayout navigatorbar0 = null;
protected UMLabel navLabel = null;
protected XVerticalLayout panel0 = null;
protected XHorizontalLayout panel2 = null;
protected UMImage image3 = null;
protected UMButton button0 = null;
protected UMImage image0 = null;
protected XHorizontalLayout panel3 = null;
protected UMImage image4 = null;
protected UMButton button1 = null;
protected UMImage image1 = null;
protected XHorizontalLayout panel4 = null;
protected UMImage image5 = null;
protected UMButton button2 = null;
protected UMImage image2 = null;
protected XVerticalLayout panel1 = null;
protected XVerticalLayout widget0 = null;
protected XHorizontalLayout widget0_toolbar0 = null;
protected UMImageButton widget0_imagebutton0 = null;
protected UMImageButton widget0_imagebutton2 = null;
protected UMImageButton widget0_imagebutton4 = null;

	
	protected final static int ID_ECM_DISCOVERY = 180746746;
protected final static int ID_VIEWPAGE0 = 1638097396;
protected final static int ID_NAVIGATORBAR0 = 1901646871;
protected final static int ID_NAVLABEL = 133424283;
protected final static int ID_PANEL0 = 2064259479;
protected final static int ID_PANEL2 = 594106592;
protected final static int ID_IMAGE3 = 1665041981;
protected final static int ID_BUTTON0 = 1773529986;
protected final static int ID_IMAGE0 = 303486695;
protected final static int ID_PANEL3 = 1233939852;
protected final static int ID_IMAGE4 = 674374450;
protected final static int ID_BUTTON1 = 1468404895;
protected final static int ID_IMAGE1 = 1170496175;
protected final static int ID_PANEL4 = 547933985;
protected final static int ID_IMAGE5 = 2047197468;
protected final static int ID_BUTTON2 = 1594919430;
protected final static int ID_IMAGE2 = 416615914;
protected final static int ID_PANEL1 = 363504448;
protected final static int ID_WIDGET0 = 1538981823;
protected final static int ID_WIDGET0_TOOLBAR0 = 2048409987;
protected final static int ID_WIDGET0_IMAGEBUTTON0 = 590305728;
protected final static int ID_WIDGET0_IMAGEBUTTON2 = 1219400090;
protected final static int ID_WIDGET0_IMAGEBUTTON4 = 1680438203;

	
	
	@Override
	public String getControllerName() {
		return "Ecm_DiscoveryController";
	}
	
	@Override
	public String getContextName() {
		return "qrcode";
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
		  idmap.put("Ecm_Discovery",ID_ECM_DISCOVERY);
  idmap.put("viewPage0",ID_VIEWPAGE0);
  idmap.put("navigatorbar0",ID_NAVIGATORBAR0);
  idmap.put("navLabel",ID_NAVLABEL);
  idmap.put("panel0",ID_PANEL0);
  idmap.put("panel2",ID_PANEL2);
  idmap.put("image3",ID_IMAGE3);
  idmap.put("button0",ID_BUTTON0);
  idmap.put("image0",ID_IMAGE0);
  idmap.put("panel3",ID_PANEL3);
  idmap.put("image4",ID_IMAGE4);
  idmap.put("button1",ID_BUTTON1);
  idmap.put("image1",ID_IMAGE1);
  idmap.put("panel4",ID_PANEL4);
  idmap.put("image5",ID_IMAGE5);
  idmap.put("button2",ID_BUTTON2);
  idmap.put("image2",ID_IMAGE2);
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
	
		{ //panel0 - initDiscovery
    UMEventArgs args = new UMEventArgs(Ecm_DiscoveryActivity.this);
    actionInitDiscovery(panel0,args);

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
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,navLabel,"content","#{res.ecm_discovery}"));
navigatorbar0.addView(navLabel);

return navigatorbar0;
}
	/**
	 * 用友移动商城
	 * @param context
	 * @param binderGroup
	 * @param configure
	 * @return
	 */
public View getPanel2View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel2 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL2
,"padding-right","15"
,"height","44"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"margin-top","15"
,"valign","center"
);
image3 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_IMAGE3
,"height","44"
,"layout-type","linear"
,"width","44"
,"scaletype","fitcenter"
,"src","ecm_discovery_mobilestore.png"
);
panel2.addView(image3);
button0 = (UMButton)ThirdControl.createControl(new UMButton(context),ID_BUTTON0
,"halign","left"
,"weight","1"
,"width","0"
,"font-pressed-color","#e50011"
,"height","44"
,"color","#000000"
,"font-size","15"
,"layout-type","linear"
,"onclick","yonyouMobileStore"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,button0,"value","#{res.ecm_mobilestore}"));
button0.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Ecm_DiscoveryActivity.this);
    actionYonyouMobileStore(button0,args);

}
});
panel2.addView(button0);
image0 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_IMAGE0
,"height","13"
,"layout-type","linear"
,"width","8"
,"scaletype","fitcenter"
,"src","ecm_set_jt.png"
);
panel2.addView(image0);

return panel2;
}
public View getPanel3View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel3 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL3
,"padding-right","15"
,"height","44"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"margin-top","20"
,"valign","center"
);
image4 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_IMAGE4
,"height","44"
,"layout-type","linear"
,"width","44"
,"scaletype","fitcenter"
,"src","ecm_discovery_shareapp.png"
);
panel3.addView(image4);
button1 = (UMButton)ThirdControl.createControl(new UMButton(context),ID_BUTTON1
,"halign","left"
,"weight","1"
,"width","0"
,"font-pressed-color","#e50011"
,"height","44"
,"color","#000000"
,"font-size","15"
,"layout-type","linear"
,"onclick","shareapp"
,"font-family","default"
,"valign","center"
);
//不要用友商城 陈国钢修改 
//binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,button1,"value","#{res.ecm_shareapp}"));
button1.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Ecm_DiscoveryActivity.this);
    actionShareapp(button1,args);

}
});
panel3.addView(button1);
image1 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_IMAGE1
,"height","13"
,"layout-type","linear"
,"width","8"
,"scaletype","fitcenter"
,"src","ecm_set_jt.png"
);
panel3.addView(image1);

return panel3;
}
public View getPanel4View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel4 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL4
,"padding-right","15"
,"height","44"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"margin-top","20"
,"valign","center"
);
image5 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_IMAGE5
,"height","44"
,"layout-type","linear"
,"width","44"
,"scaletype","fitcenter"
,"src","ecm_discovery_qrcode.png"
);
panel4.addView(image5);
button2 = (UMButton)ThirdControl.createControl(new UMButton(context),ID_BUTTON2
,"halign","left"
,"weight","1"
,"width","0"
,"font-pressed-color","#e50011"
,"height","44"
,"color","#000000"
,"font-size","15"
,"layout-type","linear"
,"onclick","getcode"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,button2,"value","#{res.ecm_getqrcode}"));
button2.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Ecm_DiscoveryActivity.this);
    actionGetcode(button2,args);

}
});
panel4.addView(button2);
image2 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_IMAGE2
,"height","13"
,"layout-type","linear"
,"width","8"
,"scaletype","fitcenter"
,"src","ecm_set_jt.png"
);
panel4.addView(image2);

return panel4;
}
public View getPanel0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel0 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL0
,"halign","center"
,"height","0"
,"weight","1"
,"onload","initDiscovery"
,"layout-type","linear"
,"width","fill"
);
//不要用友移动商城
View panel2 = (View) getPanel2View((UMActivity)context,binderGroup,configure);
//panel0.addView(panel2);
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
    UMEventArgs args = new UMEventArgs(Ecm_DiscoveryActivity.this);
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
    UMEventArgs args = new UMEventArgs(Ecm_DiscoveryActivity.this);
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
    UMEventArgs args = new UMEventArgs(Ecm_DiscoveryActivity.this);
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
,"layout-type","vbox"
,"background","#F5F5F5"
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
Ecm_Discovery = (UMWindow)ThirdControl.createControl(new UMWindow(context),ID_ECM_DISCOVERY
,"halign","center"
,"height","fill"
,"layout","vbox"
,"width","fill"
,"context","qrcode"
,"controller","Ecm_DiscoveryController"
,"namespace","nc.bs.oa.oama.ecm"
);
View viewPage0 = (View) getViewPage0View((UMActivity)context,binderGroup,configure);
Ecm_Discovery.addView(viewPage0);

return (UMWindow)Ecm_Discovery;
}

	
	public void actionShareapp(View control, UMEventArgs args) {
    String actionid = "shareapp";
    args.put("viewid","nc.bs.oa.oama.ecm.Ecm_Shareapp");
    args.put("iskeep","true");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.open(args);
}
public void actionQrcodejs(View control, UMEventArgs args) {
    String actionid = "qrcodejs";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "qrcodejs",UMActivity.getViewId(control),args);
}
public void actionYonyouMobileStore(View control, UMEventArgs args) {
    String actionid = "yonyouMobileStore";
    args.put("viewid","nc.bs.oa.oama.ecm.Ecm_Mobilestore");
    args.put("iskeep","true");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.open(args);
}
public void actionGetcode(View control, UMEventArgs args) {
    String actionid = "getcode";
    args.put("bindfield","key");
    args.put("frameheight","1000");
    args.put("callback","qrcodejs");
    args.put("frameclose","true");
    args.put("framewidth","1000");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMDevice.captureTwodcode(args);
}
public void actionToSet(View control, UMEventArgs args) {
    String actionid = "toSet";
    args.put("viewid","nc.bs.oa.oama.ecm.Ecm_Set");
  this.dataCollect();
    args.put("iskeep","false");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.open(args);
}
public void actionToHome(View control, UMEventArgs args) {
    String actionid = "toHome";
    args.put("viewid","nc.bs.oa.oama.ecm.Ecm_Main");
  this.dataCollect();
    args.put("iskeep","false");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.open(args);
}
public void actionInitDiscovery(View control, UMEventArgs args) {
    String actionid = "initDiscovery";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "initDiscovery",UMActivity.getViewId(control),args);
}
public void actionToDiscovery(View control, UMEventArgs args) {
    String actionid = "toDiscovery";
  this.dataCollect();
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "toDiscovery",UMActivity.getViewId(control),args);
}


}
