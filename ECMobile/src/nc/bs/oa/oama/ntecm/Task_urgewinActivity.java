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

public abstract class Task_urgewinActivity extends UMWindowActivity {

	protected UMWindow urgewin = null;
protected XVerticalLayout viewPage0 = null;
protected XHorizontalLayout navigatorbar0 = null;
protected UMButton button0 = null;
protected UMLabel label0 = null;
protected UMButton button1 = null;
protected XHorizontalLayout rounddiv0 = null;
protected UMTextArea textarea0 = null;
protected XVerticalLayout rounddiv1 = null;
protected XHorizontalLayout rounddiv2 = null;
protected UMLabel label1 = null;
protected XHorizontalLayout rounddiv3 = null;
protected UMCheckbox checkbox0 = null;
protected UMLabel label2 = null;
protected UMCheckbox checkbox1 = null;
protected UMLabel label3 = null;
protected XHorizontalLayout rounddiv4 = null;
protected UMCheckbox checkbox2 = null;
protected UMLabel label4 = null;
protected UMCheckbox checkbox3 = null;
protected UMLabel label5 = null;

	
	protected final static int ID_URGEWIN = 131694133;
protected final static int ID_VIEWPAGE0 = 1970743466;
protected final static int ID_NAVIGATORBAR0 = 28309324;
protected final static int ID_BUTTON0 = 1256116542;
protected final static int ID_LABEL0 = 2096625035;
protected final static int ID_BUTTON1 = 208880922;
protected final static int ID_ROUNDDIV0 = 932548400;
protected final static int ID_TEXTAREA0 = 1867747168;
protected final static int ID_ROUNDDIV1 = 2038201586;
protected final static int ID_ROUNDDIV2 = 2036730796;
protected final static int ID_LABEL1 = 865275020;
protected final static int ID_ROUNDDIV3 = 1970759996;
protected final static int ID_CHECKBOX0 = 65638899;
protected final static int ID_LABEL2 = 582729869;
protected final static int ID_CHECKBOX1 = 2052639722;
protected final static int ID_LABEL3 = 337058121;
protected final static int ID_ROUNDDIV4 = 108067102;
protected final static int ID_CHECKBOX2 = 2079471266;
protected final static int ID_LABEL4 = 1557360598;
protected final static int ID_CHECKBOX3 = 1674463224;
protected final static int ID_LABEL5 = 1563845629;

	
	
	@Override
	public String getControllerName() {
		return "urgewinController";
	}
	
	@Override
	public String getContextName() {
		return "urgetaskdet";
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
		  idmap.put("urgewin",ID_URGEWIN);
  idmap.put("viewPage0",ID_VIEWPAGE0);
  idmap.put("navigatorbar0",ID_NAVIGATORBAR0);
  idmap.put("button0",ID_BUTTON0);
  idmap.put("label0",ID_LABEL0);
  idmap.put("button1",ID_BUTTON1);
  idmap.put("rounddiv0",ID_ROUNDDIV0);
  idmap.put("textarea0",ID_TEXTAREA0);
  idmap.put("rounddiv1",ID_ROUNDDIV1);
  idmap.put("rounddiv2",ID_ROUNDDIV2);
  idmap.put("label1",ID_LABEL1);
  idmap.put("rounddiv3",ID_ROUNDDIV3);
  idmap.put("checkbox0",ID_CHECKBOX0);
  idmap.put("label2",ID_LABEL2);
  idmap.put("checkbox1",ID_CHECKBOX1);
  idmap.put("label3",ID_LABEL3);
  idmap.put("rounddiv4",ID_ROUNDDIV4);
  idmap.put("checkbox2",ID_CHECKBOX2);
  idmap.put("label4",ID_LABEL4);
  idmap.put("checkbox3",ID_CHECKBOX3);
  idmap.put("label5",ID_LABEL5);

	}
	
	public void onLoad() {
		ULog.logLC("onLoad", this);
		if(currentPage!=null) {
			currentPage.onLoad();
		}
	
		{ //rounddiv1 - urgeonload
    UMEventArgs args = new UMEventArgs(Task_urgewinActivity.this);
    actionUrgeonload(rounddiv1,args);

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
,"height","44"
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
,"background-image-dis","button"
,"height","44"
,"color","#ff0000"
,"layout-type","linear"
,"font-size","18"
,"onclick","returnback"
,"font-family","default"
,"valign","center"
,"background-image","btn_back"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,button0,"value","#{res.task_back}"));
button0.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Task_urgewinActivity.this);
    actionReturnback(button0,args);

}
});
navigatorbar0.addView(button0);
label0 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL0
,"halign","center"
,"height","30"
,"weight","1"
,"color","#000000"
,"layout-type","linear"
,"font-size","17"
,"width","0"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label0,"content","#{res.task_writeremind}"));
navigatorbar0.addView(label0);
button1 = (UMButton)ThirdControl.createControl(new UMButton(context),ID_BUTTON1
,"halign","center"
,"pressed-image","button_touch"
,"width","42"
,"background-image-dis","button"
,"height","30"
,"color","#e50011"
,"layout-type","linear"
,"font-size","18"
,"onclick","urgeTask"
,"font-family","default"
,"valign","center"
,"background-image","button"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,button1,"value","#{res.task_remind}"));
button1.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Task_urgewinActivity.this);
    actionUrgeTask(button1,args);

}
});
navigatorbar0.addView(button1);

return navigatorbar0;
}
public View getRounddiv0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
rounddiv0 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_ROUNDDIV0
,"height","120"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"margin-top","15"
,"valign","center"
);
textarea0 = (UMTextArea)ThirdControl.createControl(new UMTextArea(context),ID_TEXTAREA0
,"padding-left","2"
,"bindfield","urgrontent"
,"height","fill"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","fill"
,"font-family","default"
);
UMTextBinder textarea0_binder = new UMTextBinder((IUMContextAccessor)context);
textarea0_binder.setBindInfo(new BindInfo("urgrontent"));
textarea0_binder.setControl(textarea0);
binderGroup.addBinderToGroup(ID_TEXTAREA0, textarea0_binder);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,textarea0,"placeholder","#{res.task_writeremind}"));
rounddiv0.addView(textarea0);

return rounddiv0;
}
public View getRounddiv2View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
rounddiv2 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_ROUNDDIV2
,"padding-right","8"
,"padding-left","8"
,"height","44"
,"layout-type","linear"
,"width","fill"
,"valign","center"
,"background-image","at44_top.png"
);
label1 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL1
,"halign","left"
,"height","30"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","100"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label1,"content","#{res.task_remingdingMethod}"));
rounddiv2.addView(label1);

return rounddiv2;
}
public View getRounddiv3View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
rounddiv3 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_ROUNDDIV3
,"height","0"
,"weight","1"
,"layout-type","linear"
,"width","fill"
,"valign","center"
,"background-image","at44_mid.png"
);
checkbox0 = (UMCheckbox)ThirdControl.createControl(new UMCheckbox(context),ID_CHECKBOX0
,"bindfield","msg"
,"height","20"
,"placeholder",""
,"layout-type","linear"
,"width","20"
,"margin-left","115"
,"check-on-image","checkbox_select.png"
,"check-off-image","checkbox_noselect.png"
);
UMCheckBoxBinder checkbox0_binder = new UMCheckBoxBinder((IUMContextAccessor)context);
checkbox0_binder.setBindInfo(new BindInfo("msg"));
checkbox0_binder.setControl(checkbox0);
binderGroup.addBinderToGroup(ID_CHECKBOX0, checkbox0_binder);
rounddiv3.addView(checkbox0);
label2 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL2
,"halign","left"
,"height","30"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","90"
,"margin-left","5"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label2,"content","#{res.task_notice}"));
rounddiv3.addView(label2);
checkbox1 = (UMCheckbox)ThirdControl.createControl(new UMCheckbox(context),ID_CHECKBOX1
,"padding-left","2"
,"bindfield","email"
,"height","20"
,"layout-type","linear"
,"width","20"
,"check-on-image","checkbox_select.png"
,"check-off-image","checkbox_noselect.png"
);
UMCheckBoxBinder checkbox1_binder = new UMCheckBoxBinder((IUMContextAccessor)context);
checkbox1_binder.setBindInfo(new BindInfo("email"));
checkbox1_binder.setControl(checkbox1);
binderGroup.addBinderToGroup(ID_CHECKBOX1, checkbox1_binder);
rounddiv3.addView(checkbox1);
label3 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL3
,"halign","left"
,"height","30"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","90"
,"margin-left","5"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label3,"content","#{res.task_email}"));
rounddiv3.addView(label3);

return rounddiv3;
}
public View getRounddiv4View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
rounddiv4 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_ROUNDDIV4
,"height","0"
,"weight","1"
,"layout-type","linear"
,"width","fill"
,"valign","center"
,"background-image","at44_down.png"
);
checkbox2 = (UMCheckbox)ThirdControl.createControl(new UMCheckbox(context),ID_CHECKBOX2
,"bindfield","sms"
,"height","20"
,"layout-type","linear"
,"width","20"
,"margin-left","115"
,"check-on-image","checkbox_select.png"
,"check-off-image","checkbox_noselect.png"
);
UMCheckBoxBinder checkbox2_binder = new UMCheckBoxBinder((IUMContextAccessor)context);
checkbox2_binder.setBindInfo(new BindInfo("sms"));
checkbox2_binder.setControl(checkbox2);
binderGroup.addBinderToGroup(ID_CHECKBOX2, checkbox2_binder);
rounddiv4.addView(checkbox2);
label4 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL4
,"halign","left"
,"height","30"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","90"
,"margin-left","5"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label4,"content","#{res.task_sms}"));
rounddiv4.addView(label4);
checkbox3 = (UMCheckbox)ThirdControl.createControl(new UMCheckbox(context),ID_CHECKBOX3
,"bindfield","im"
,"height","20"
,"layout-type","linear"
,"width","20"
,"check-on-image","checkbox_select.png"
,"check-off-image","checkbox_noselect.png"
);
UMCheckBoxBinder checkbox3_binder = new UMCheckBoxBinder((IUMContextAccessor)context);
checkbox3_binder.setBindInfo(new BindInfo("im"));
checkbox3_binder.setControl(checkbox3);
binderGroup.addBinderToGroup(ID_CHECKBOX3, checkbox3_binder);
rounddiv4.addView(checkbox3);
label5 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL5
,"halign","left"
,"height","30"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","90"
,"margin-left","5"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label5,"content","#{res.task_im}"));
rounddiv4.addView(label5);

return rounddiv4;
}
public View getRounddiv1View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
rounddiv1 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_ROUNDDIV1
,"halign","center"
,"height","132"
,"onload","urgeonload"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"margin-top","20"
);
View rounddiv2 = (View) getRounddiv2View((UMActivity)context,binderGroup,configure);
rounddiv1.addView(rounddiv2);
View rounddiv3 = (View) getRounddiv3View((UMActivity)context,binderGroup,configure);
rounddiv1.addView(rounddiv3);
View rounddiv4 = (View) getRounddiv4View((UMActivity)context,binderGroup,configure);
rounddiv1.addView(rounddiv4);

return rounddiv1;
}
public View getViewPage0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
viewPage0 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_VIEWPAGE0
,"halign","center"
,"height","fill"
,"layout-type","vbox"
,"background","#efeff4"
,"width","fill"
);
View navigatorbar0 = (View) getNavigatorbar0View((UMActivity)context,binderGroup,configure);
viewPage0.addView(navigatorbar0);
View rounddiv0 = (View) getRounddiv0View((UMActivity)context,binderGroup,configure);
viewPage0.addView(rounddiv0);
View rounddiv1 = (View) getRounddiv1View((UMActivity)context,binderGroup,configure);
viewPage0.addView(rounddiv1);

return viewPage0;
}
public UMWindow getCurrentWindow(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
urgewin = (UMWindow)ThirdControl.createControl(new UMWindow(context),ID_URGEWIN
,"halign","center"
,"height","fill"
,"layout","vbox"
,"width","fill"
,"context","urgetaskdet"
,"controller","urgewinController"
,"namespace","nc.bs.oa.oama.ecm"
);
View viewPage0 = (View) getViewPage0View((UMActivity)context,binderGroup,configure);
urgewin.addView(viewPage0);

return (UMWindow)urgewin;
}

	
	public void actionReturnback(View control, UMEventArgs args) {
    String actionid = "returnback";
    args.put("resultcode","15");
    args.put("iskeep","false");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.close(args);
}
public void actionUrgeTask(View control, UMEventArgs args) {
    String actionid = "urgeTask";
    args.put("viewid","nc.bs.oa.oama.oatask.DetailtaskExtendController");
    args.put("error","urgeError");
  this.dataCollect();
    args.put("callback","returntip");
    args.put("action","urgeTask");
    args.put("autoDataBinding","true");
    args.put("contextmapping","urgemap");
    args.put("containerName","");
    args.put("rows","#{CONTEXT}");
  ActionProcessor.exec(this, actionid, args);
UMService.callAction(args);
}
public void actionReturntip(View control, UMEventArgs args) {
    String actionid = "returntip";
    args.put("message","#{res.task_dosuccess}");
    args.put("abc","#{urgemap}");
    args.put("title","提示");
    args.put("okbuttontitle","#{res.task_ok}");
    args.put("okaction","returnback");
    args.put("style","ok");
  this.dataCollect();
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.openDialog(args);
}
public void actionSetCheckboxEnable(View control, UMEventArgs args) {
    String actionid = "setCheckboxEnable";
  this.dataCollect();
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "setCheckboxEnable",UMActivity.getViewId(control),args);
}
public void actionUrgeError(View control, UMEventArgs args) {
    String actionid = "urgeError";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "urgeError",UMActivity.getViewId(control),args);
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
public void actionUMonUnload(View control, UMEventArgs args) {
    String actionid = "UMonUnload";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "UMonUnload",UMActivity.getViewId(control),args);
}
public void actionUrgeonload(View control, UMEventArgs args) {
    String actionid = "urgeonload";
  this.dataCollect();
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "urgeonload",UMActivity.getViewId(control),args);
}
public void actionUMonComplete(View control, UMEventArgs args) {
    String actionid = "UMonComplete";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "UMonComplete",UMActivity.getViewId(control),args);
}
public void actionUMonDataBinding(View control, UMEventArgs args) {
    String actionid = "UMonDataBinding";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "UMonDataBinding",UMActivity.getViewId(control),args);
}


}
