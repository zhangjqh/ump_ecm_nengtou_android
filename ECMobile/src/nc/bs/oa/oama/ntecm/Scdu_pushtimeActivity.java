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

public abstract class Scdu_pushtimeActivity extends UMWindowActivity {

	protected UMWindow pushtime = null;
protected XVerticalLayout viewPage0 = null;
protected XHorizontalLayout navigatorbar0 = null;
protected UMButton button0 = null;
protected UMLabel label0 = null;
protected UMButton button1 = null;
protected XVerticalLayout panel0 = null;
protected XHorizontalLayout panel1 = null;
protected UMLabel label2 = null;
protected UMTimeEdit timeinput0 = null;
protected XHorizontalLayout panel2 = null;
protected UMLabel label3 = null;
protected UMTimeEdit timeinput1 = null;
protected UMLabel label1 = null;

	
	protected final static int ID_PUSHTIME = 1031611127;
protected final static int ID_VIEWPAGE0 = 756023954;
protected final static int ID_NAVIGATORBAR0 = 1671229346;
protected final static int ID_BUTTON0 = 1073570822;
protected final static int ID_LABEL0 = 1198085823;
protected final static int ID_BUTTON1 = 900563821;
protected final static int ID_PANEL0 = 1588317366;
protected final static int ID_PANEL1 = 848621687;
protected final static int ID_LABEL2 = 782496305;
protected final static int ID_TIMEINPUT0 = 717833348;
protected final static int ID_PANEL2 = 1615671359;
protected final static int ID_LABEL3 = 1402690600;
protected final static int ID_TIMEINPUT1 = 1144971077;
protected final static int ID_LABEL1 = 1018378621;

	
	
	@Override
	public String getControllerName() {
		return "pushtimeController";
	}
	
	@Override
	public String getContextName() {
		return "remindTime";
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
		  idmap.put("pushtime",ID_PUSHTIME);
  idmap.put("viewPage0",ID_VIEWPAGE0);
  idmap.put("navigatorbar0",ID_NAVIGATORBAR0);
  idmap.put("button0",ID_BUTTON0);
  idmap.put("label0",ID_LABEL0);
  idmap.put("button1",ID_BUTTON1);
  idmap.put("panel0",ID_PANEL0);
  idmap.put("panel1",ID_PANEL1);
  idmap.put("label2",ID_LABEL2);
  idmap.put("timeinput0",ID_TIMEINPUT0);
  idmap.put("panel2",ID_PANEL2);
  idmap.put("label3",ID_LABEL3);
  idmap.put("timeinput1",ID_TIMEINPUT1);
  idmap.put("label1",ID_LABEL1);

	}
	
	public void onLoad() {
		ULog.logLC("onLoad", this);
		if(currentPage!=null) {
			currentPage.onLoad();
		}
	
		{ //panel0 - timeOnload
    UMEventArgs args = new UMEventArgs(Scdu_pushtimeActivity.this);
    actionTimeOnload(panel0,args);

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
,"pressed-image","nav"
,"width","fill"
,"background-image-dis","nav"
,"height","44.0"
,"color","#000000"
,"layout-type","linear"
,"font-size","17"
,"font-family","default"
,"valign","center"
,"background-image","nav.png"
);
button0 = (UMButton)ThirdControl.createControl(new UMButton(context),ID_BUTTON0
,"halign","center"
,"pressed-image","btn_back_touch"
,"width","64"
,"font-pressed-color","#f2adb2"
,"height","44"
,"color","#e50011"
,"layout-type","linear"
,"font-size","17"
,"onclick","onBack"
,"font-family","default"
,"valign","center"
,"background-image","btn_back"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,button0,"value","#{res.scdu_oascheduler_0001}"));
button0.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Scdu_pushtimeActivity.this);
    actionOnBack(button0,args);

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
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label0,"content","#{res.scdu_oascheduler_0035}"));
navigatorbar0.addView(label0);
button1 = (UMButton)ThirdControl.createControl(new UMButton(context),ID_BUTTON1
,"halign","right"
,"height","44"
,"color","#e50011"
,"layout-type","linear"
,"font-size","17"
,"width","64"
,"onclick","onSave"
,"font-family","default"
,"font-pressed-color","#f2adb2"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,button1,"value","#{res.scdu_oascheduler_0002}"));
button1.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Scdu_pushtimeActivity.this);
    actionOnSave(button1,args);

}
});
navigatorbar0.addView(button1);

return navigatorbar0;
}
public View getPanel1View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel1 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL1
,"padding-right","15"
,"padding-left","15"
,"height","44"
,"layout-type","linear"
,"width","fill"
,"margin-top","15"
,"valign","center"
,"background-image","oasche_44_top.png"
);
label2 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL2
,"margin-right","15"
,"halign","left"
,"height","fill"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","85"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label2,"content","#{res.scdu_oascheduler_0005}"));
panel1.addView(label2);
timeinput0 = (UMTimeEdit)ThirdControl.createControl(new UMTimeEdit(context),ID_TIMEINPUT0
,"bindfield","begintime"
,"padding-left","4"
,"padding-right","4"
,"halign","RIGHT"
,"weight","1"
,"placeholder","08:00"
,"width","0"
,"format","HH:mm"
,"height","40"
,"color","#167ef8"
,"font-size","16"
,"background","#ffffff"
,"layout-type","linear"
,"value","2014-05-08 08:00:00"
,"font-family","default"
);
UMTextBinder timeinput0_binder = new UMTextBinder((IUMContextAccessor)context);
timeinput0_binder.setBindInfo(new BindInfo("begintime"));
timeinput0_binder.setControl(timeinput0);
binderGroup.addBinderToGroup(ID_TIMEINPUT0, timeinput0_binder);
panel1.addView(timeinput0);

return panel1;
}
public View getPanel2View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel2 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL2
,"padding-left","15"
,"padding-right","15"
,"height","44"
,"layout-type","linear"
,"width","fill"
,"valign","center"
,"background-image","oasche_44_down.png"
);
label3 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL3
,"margin-right","15"
,"halign","left"
,"height","fill"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","85"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label3,"content","#{res.scdu_oascheduler_0006}"));
panel2.addView(label3);
timeinput1 = (UMTimeEdit)ThirdControl.createControl(new UMTimeEdit(context),ID_TIMEINPUT1
,"bindfield","endtime"
,"padding-left","4"
,"padding-right","4"
,"halign","RIGHT"
,"weight","1"
,"placeholder","20:00"
,"width","0"
,"format","HH:mm"
,"height","40"
,"color","#167ef8"
,"font-size","16"
,"background","#ffffff"
,"layout-type","linear"
,"value","2014-05-08 20:00:00"
,"font-family","default"
);
UMTextBinder timeinput1_binder = new UMTextBinder((IUMContextAccessor)context);
timeinput1_binder.setBindInfo(new BindInfo("endtime"));
timeinput1_binder.setControl(timeinput1);
binderGroup.addBinderToGroup(ID_TIMEINPUT1, timeinput1_binder);
panel2.addView(timeinput1);

return panel2;
}
public View getPanel0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel0 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL0
,"halign","center"
,"height","0"
,"weight","1"
,"onload","timeOnload"
,"layout-type","linear"
,"background","#EFEFF4"
,"width","fill"
);
View panel1 = (View) getPanel1View((UMActivity)context,binderGroup,configure);
panel0.addView(panel1);
View panel2 = (View) getPanel2View((UMActivity)context,binderGroup,configure);
panel0.addView(panel2);
label1 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL1
,"margin-right","15"
,"height","88"
,"color","#727272"
,"layout-type","linear"
,"font-size","16"
,"width","fill"
,"margin-left","15"
,"font-family","default"
,"margin-top","15"
,"type","multiline"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label1,"content","#{res.scdu_oascheduler_0036}"));
panel0.addView(label1);

return panel0;
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
View panel0 = (View) getPanel0View((UMActivity)context,binderGroup,configure);
viewPage0.addView(panel0);

return viewPage0;
}
public UMWindow getCurrentWindow(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
pushtime = (UMWindow)ThirdControl.createControl(new UMWindow(context),ID_PUSHTIME
,"halign","center"
,"height","fill"
,"layout","vbox"
,"width","fill"
,"context","remindTime"
,"controller","pushtimeController"
,"namespace","nc.bs.oa.oama.ecm"
);
View viewPage0 = (View) getViewPage0View((UMActivity)context,binderGroup,configure);
pushtime.addView(viewPage0);

return (UMWindow)pushtime;
}

	
	public void actionTimeOnload(View control, UMEventArgs args) {
    String actionid = "timeOnload";
    args.put("viewid","nc.bs.oa.oama.scheduler.EventDetailExtendController");
    args.put("action","getRemindTime");
    args.put("autoDataBinding","true");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMService.callAction(args);
}
public void actionOnSave(View control, UMEventArgs args) {
    String actionid = "onSave";
  this.dataCollect();
    args.put("remindTime","#{CONTEXT}");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "onSave",UMActivity.getViewId(control),args);
}
public void actionOnBack(View control, UMEventArgs args) {
    String actionid = "onBack";
    args.put("resultcode","0");
    args.put("iskeep","false");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.close(args);
}


}
