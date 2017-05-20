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

public abstract class Scdu_timesetActivity extends UMWindowActivity {

	protected UMWindow timeset = null;
protected XVerticalLayout viewPage0 = null;
protected XHorizontalLayout navigatorbar0 = null;
protected UMLabel label0 = null;
protected XVerticalLayout panel0 = null;
protected XHorizontalLayout panel1 = null;
protected XVerticalLayout widget0 = null;
protected XHorizontalLayout widget0_toolbar0 = null;
protected UMImageButton widget0_imagebutton0 = null;
protected UMImageButton widget0_imagebutton1 = null;

	
	protected final static int ID_TIMESET = 994632011;
protected final static int ID_VIEWPAGE0 = 1039264072;
protected final static int ID_NAVIGATORBAR0 = 397939140;
protected final static int ID_LABEL0 = 2003931468;
protected final static int ID_PANEL0 = 1941336217;
protected final static int ID_PANEL1 = 292605142;
protected final static int ID_WIDGET0 = 1363038453;
protected final static int ID_WIDGET0_TOOLBAR0 = 24002024;
protected final static int ID_WIDGET0_IMAGEBUTTON0 = 1044931798;
protected final static int ID_WIDGET0_IMAGEBUTTON1 = 2007990346;

	
	
	@Override
	public String getControllerName() {
		return "timesetController";
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
		  idmap.put("timeset",ID_TIMESET);
  idmap.put("viewPage0",ID_VIEWPAGE0);
  idmap.put("navigatorbar0",ID_NAVIGATORBAR0);
  idmap.put("label0",ID_LABEL0);
  idmap.put("panel0",ID_PANEL0);
  idmap.put("panel1",ID_PANEL1);
  idmap.put("widget0",ID_WIDGET0);
  idmap.put("widget0_toolbar0",ID_WIDGET0_TOOLBAR0);
  idmap.put("widget0_imagebutton0",ID_WIDGET0_IMAGEBUTTON0);
  idmap.put("widget0_imagebutton1",ID_WIDGET0_IMAGEBUTTON1);

	}
	
	public void onLoad() {
		ULog.logLC("onLoad", this);
		if(currentPage!=null) {
			currentPage.onLoad();
		}
	
		{ //panel1 - tabBarOnload
    UMEventArgs args = new UMEventArgs(Scdu_timesetActivity.this);
    actionTabBarOnload(panel1,args);

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
,"height","44.0"
,"color","#000000"
,"pressed-image","nav"
,"layout-type","linear"
,"font-size","17"
,"width","fill"
,"background-image-dis","nav"
,"font-family","default"
,"valign","center"
,"background-image","nav.png"
);
label0 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL0
,"halign","center"
,"height","fill"
,"color","#000000"
,"layout-type","linear"
,"font-size","17"
,"width","fill"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label0,"content","#{res.scdu_title_set}"));
navigatorbar0.addView(label0);

return navigatorbar0;
}
public View getWidget0_toolbar0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
widget0_toolbar0 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_WIDGET0_TOOLBAR0
,"height","fill"
,"pressed-image","toolbar"
,"layout-type","linear"
,"width","fill"
,"background-image-dis","toolbar"
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
,"icon-background-image","oasche_myscheduler.png"
,"icon-pressed-image","oasche_myscheduler_touch.png"
,"onclick","toMyScheduler"
,"font-family","default"
,"valign","center"
,"checked","false"
,"icon-text-spacing","5"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,widget0_imagebutton0,"value","#{res.scdu_oascheduler_0030}"));
widget0_imagebutton0.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Scdu_timesetActivity.this);
    actionToMyScheduler(widget0_imagebutton0,args);

}
});
widget0_toolbar0.addView(widget0_imagebutton0);
widget0_imagebutton1 = (UMImageButton)ThirdControl.createControl(new UMImageButton(context),ID_WIDGET0_IMAGEBUTTON1
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
,"icon-background-image","oasche_sharescheduler.png"
,"icon-pressed-image","oasche_sharescheduler_touch.png"
,"onclick","toShareScheduler"
,"font-family","default"
,"valign","center"
,"checked","false"
,"icon-text-spacing","5"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,widget0_imagebutton1,"value","#{res.scdu_oascheduler_0039}"));
widget0_imagebutton1.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Scdu_timesetActivity.this);
    actionToShareScheduler(widget0_imagebutton1,args);

}
});
widget0_toolbar0.addView(widget0_imagebutton1);

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
panel1 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL1
,"height","49"
,"onload","tabBarOnload"
,"layout-type","linear"
,"width","fill"
,"valign","center"
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
,"width","fill"
);
View navigatorbar0 = (View) getNavigatorbar0View((UMActivity)context,binderGroup,configure);
viewPage0.addView(navigatorbar0);
panel0 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL0
,"padding-right","8"
,"padding-left","8"
,"halign","center"
,"height","0"
,"weight","1"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
);
viewPage0.addView(panel0);
View panel1 = (View) getPanel1View((UMActivity)context,binderGroup,configure);
viewPage0.addView(panel1);

return viewPage0;
}
public UMWindow getCurrentWindow(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
timeset = (UMWindow)ThirdControl.createControl(new UMWindow(context),ID_TIMESET
,"halign","center"
,"height","fill"
,"layout","vbox"
,"width","fill"
,"controller","timesetController"
,"namespace","nc.bs.oa.oama.ecm"
);
View viewPage0 = (View) getViewPage0View((UMActivity)context,binderGroup,configure);
timeset.addView(viewPage0);

return (UMWindow)timeset;
}

	
	public void actionTabBarOnload(View control, UMEventArgs args) {
    String actionid = "tabBarOnload";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "tabBarOnload",UMActivity.getViewId(control),args);
}
public void actionToShareScheduler(View control, UMEventArgs args) {
    String actionid = "toShareScheduler";
    args.put("viewid","nc.bs.oa.oama.ecm.Scdu_sharescheduler");
    args.put("iskeep","false");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.open(args);
}
public void actionToMyScheduler(View control, UMEventArgs args) {
    String actionid = "toMyScheduler";
    args.put("viewid","nc.bs.oa.oama.ecm.Scdu_myscheduler");
    args.put("iskeep","false");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.open(args);
}
public void actionToTimeset(View control, UMEventArgs args) {
    String actionid = "toTimeset";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "toTimeset",UMActivity.getViewId(control),args);
}


}
