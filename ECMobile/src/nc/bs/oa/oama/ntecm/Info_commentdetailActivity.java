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

public abstract class Info_commentdetailActivity extends UMWindowActivity {

	protected UMWindow Info_commentdetail = null;
protected XVerticalLayout viewPage0 = null;
protected XHorizontalLayout navigatorbar0 = null;
protected UMButton button0 = null;
protected UMLabel label0 = null;
protected UMLabel label1 = null;
protected XVerticalLayout panel0 = null;
protected UMLabel commentperson = null;
protected UMLabel commentdate = null;
protected XVerticalLayout panel1 = null;
protected UMLabel commentcontent = null;

	
	protected final static int ID_INFO_COMMENTDETAIL = 712274593;
protected final static int ID_VIEWPAGE0 = 904459865;
protected final static int ID_NAVIGATORBAR0 = 1492971312;
protected final static int ID_BUTTON0 = 768418832;
protected final static int ID_LABEL0 = 909588532;
protected final static int ID_LABEL1 = 1242061869;
protected final static int ID_PANEL0 = 2084171928;
protected final static int ID_COMMENTPERSON = 2093150207;
protected final static int ID_COMMENTDATE = 254998667;
protected final static int ID_PANEL1 = 179120314;
protected final static int ID_COMMENTCONTENT = 801263610;

	
	
	@Override
	public String getControllerName() {
		return "Info_commentdetailController";
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
		  idmap.put("Info_commentdetail",ID_INFO_COMMENTDETAIL);
  idmap.put("viewPage0",ID_VIEWPAGE0);
  idmap.put("navigatorbar0",ID_NAVIGATORBAR0);
  idmap.put("button0",ID_BUTTON0);
  idmap.put("label0",ID_LABEL0);
  idmap.put("label1",ID_LABEL1);
  idmap.put("panel0",ID_PANEL0);
  idmap.put("commentperson",ID_COMMENTPERSON);
  idmap.put("commentdate",ID_COMMENTDATE);
  idmap.put("panel1",ID_PANEL1);
  idmap.put("commentcontent",ID_COMMENTCONTENT);

	}
	
	public void onLoad() {
		ULog.logLC("onLoad", this);
		if(currentPage!=null) {
			currentPage.onLoad();
		}
	
		{ //viewPage0 - dataload
    UMEventArgs args = new UMEventArgs(Info_commentdetailActivity.this);
    actionDataload(viewPage0,args);

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
,"onclick","returnList"
,"valign","center"
,"background-image","btn_back"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,button0,"value","#{res.info_btn_back}"));
button0.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Info_commentdetailActivity.this);
    actionReturnList(button0,args);

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
,"onclick","action:label0_onclick"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label0,"content","#{res.info_title_commentdetail}"));
label0.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Info_commentdetailActivity.this);
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
,"padding-left","10"
,"padding-right","10"
,"halign","center"
,"height","58"
,"layout-type","linear"
,"width","fill"
);
commentperson = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_COMMENTPERSON
,"halign","left"
,"height","32.0"
,"color","#000000"
,"layout-type","linear"
,"font-size","16"
,"width","fill"
,"font-family","default"
,"valign","center"
);
panel0.addView(commentperson);
commentdate = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_COMMENTDATE
,"halign","left"
,"height","20"
,"color","#000000"
,"layout-type","linear"
,"font-size","12"
,"width","fill"
,"font-family","default"
,"valign","center"
);
panel0.addView(commentdate);

return panel0;
}
public View getPanel1View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel1 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL1
,"padding-right","10"
,"padding-left","10"
,"halign","center"
,"height","358"
,"layout-type","linear"
,"width","fill"
);
commentcontent = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_COMMENTCONTENT
,"halign","left"
,"height","fill"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","fill"
,"font-family","default"
,"valign","top"
,"type","multiline"
);
panel1.addView(commentcontent);

return panel1;
}
public View getViewPage0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
viewPage0 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_VIEWPAGE0
,"halign","center"
,"height","fill"
,"onload","dataload"
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
Info_commentdetail = (UMWindow)ThirdControl.createControl(new UMWindow(context),ID_INFO_COMMENTDETAIL
,"halign","center"
,"height","fill"
,"layout","vbox"
,"width","fill"
,"context","oneinfo"
,"controller","Info_commentdetailController"
,"namespace","nc.bs.oa.oama.ecm"
);
View viewPage0 = (View) getViewPage0View((UMActivity)context,binderGroup,configure);
Info_commentdetail.addView(viewPage0);

return (UMWindow)Info_commentdetail;
}

	
	public void actionLabel0_onclick(View control, UMEventArgs args) {
    String actionid = "label0_onclick";
    args.put("language","javascript");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "this.label0_onclick()",UMActivity.getViewId(control),args);
}
public void actionReturnList(View control, UMEventArgs args) {
    String actionid = "returnList";
    args.put("resultcode","0");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.close(args);
}
public void actionDataload(View control, UMEventArgs args) {
    String actionid = "dataload";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "dataload",UMActivity.getViewId(control),args);
}


}
