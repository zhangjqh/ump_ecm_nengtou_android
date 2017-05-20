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

public abstract class Task_reportwinActivity extends UMWindowActivity {

	protected UMWindow reportwin = null;
protected XVerticalLayout viewPage0 = null;
protected XHorizontalLayout navigatorbar0 = null;
protected UMButton button0 = null;
protected UMLabel label0 = null;
protected UMButton button1 = null;
protected XHorizontalLayout panel0 = null;
protected UMLabel label1 = null;
protected XVerticalLayout panel1 = null;
protected XVerticalLayout rounddiv0 = null;
protected XHorizontalLayout rounddiv1 = null;
protected UMLabel label2 = null;
protected UMComboBox combobox0 = null;
protected UMOption combobox0_opt0 = null;
protected UMOption combobox0_opt1 = null;
protected UMOption combobox0_opt2 = null;
protected UMOption combobox0_opt4 = null;
protected UMOption combobox0_opt3 = null;
protected XHorizontalLayout rounddiv2 = null;
protected UMLabel label3 = null;
protected UMSeekBar range0 = null;
protected XHorizontalLayout rounddiv3 = null;
protected UMLabel label4 = null;
protected UMTextArea textarea0 = null;
protected XHorizontalLayout rounddiv4 = null;
protected UMLabel label5 = null;
protected UMLabel attnum = null;
protected UMImage image0 = null;

	
	protected final static int ID_REPORTWIN = 158899755;
protected final static int ID_VIEWPAGE0 = 1833019446;
protected final static int ID_NAVIGATORBAR0 = 1059543088;
protected final static int ID_BUTTON0 = 1529325196;
protected final static int ID_LABEL0 = 43432029;
protected final static int ID_BUTTON1 = 1986758538;
protected final static int ID_PANEL0 = 1029067507;
protected final static int ID_LABEL1 = 502682785;
protected final static int ID_PANEL1 = 289764122;
protected final static int ID_ROUNDDIV0 = 178040096;
protected final static int ID_ROUNDDIV1 = 765162983;
protected final static int ID_LABEL2 = 1187753581;
protected final static int ID_COMBOBOX0 = 1465901852;
protected final static int ID_COMBOBOX0_OPT0 = 305445859;
protected final static int ID_COMBOBOX0_OPT1 = 1350059907;
protected final static int ID_COMBOBOX0_OPT2 = 734921150;
protected final static int ID_COMBOBOX0_OPT4 = 1611129933;
protected final static int ID_COMBOBOX0_OPT3 = 1903142587;
protected final static int ID_ROUNDDIV2 = 830533552;
protected final static int ID_LABEL3 = 1547416657;
protected final static int ID_RANGE0 = 1596065422;
protected final static int ID_ROUNDDIV3 = 1444827694;
protected final static int ID_LABEL4 = 1015325648;
protected final static int ID_TEXTAREA0 = 104965987;
protected final static int ID_ROUNDDIV4 = 650237895;
protected final static int ID_LABEL5 = 1438337254;
protected final static int ID_ATTNUM = 797244082;
protected final static int ID_IMAGE0 = 1189582624;

	
	
	@Override
	public String getControllerName() {
		return "reportwinController";
	}
	
	@Override
	public String getContextName() {
		return "report";
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
		  idmap.put("reportwin",ID_REPORTWIN);
  idmap.put("viewPage0",ID_VIEWPAGE0);
  idmap.put("navigatorbar0",ID_NAVIGATORBAR0);
  idmap.put("button0",ID_BUTTON0);
  idmap.put("label0",ID_LABEL0);
  idmap.put("button1",ID_BUTTON1);
  idmap.put("panel0",ID_PANEL0);
  idmap.put("label1",ID_LABEL1);
  idmap.put("panel1",ID_PANEL1);
  idmap.put("rounddiv0",ID_ROUNDDIV0);
  idmap.put("rounddiv1",ID_ROUNDDIV1);
  idmap.put("label2",ID_LABEL2);
  idmap.put("combobox0",ID_COMBOBOX0);
  idmap.put("combobox0_opt0",ID_COMBOBOX0_OPT0);
  idmap.put("combobox0_opt1",ID_COMBOBOX0_OPT1);
  idmap.put("combobox0_opt2",ID_COMBOBOX0_OPT2);
  idmap.put("combobox0_opt4",ID_COMBOBOX0_OPT4);
  idmap.put("combobox0_opt3",ID_COMBOBOX0_OPT3);
  idmap.put("rounddiv2",ID_ROUNDDIV2);
  idmap.put("label3",ID_LABEL3);
  idmap.put("range0",ID_RANGE0);
  idmap.put("rounddiv3",ID_ROUNDDIV3);
  idmap.put("label4",ID_LABEL4);
  idmap.put("textarea0",ID_TEXTAREA0);
  idmap.put("rounddiv4",ID_ROUNDDIV4);
  idmap.put("label5",ID_LABEL5);
  idmap.put("attnum",ID_ATTNUM);
  idmap.put("image0",ID_IMAGE0);

	}
	
	public void onLoad() {
		ULog.logLC("onLoad", this);
		if(currentPage!=null) {
			currentPage.onLoad();
		}
	
		{ //panel1 - viewonload
    UMEventArgs args = new UMEventArgs(Task_reportwinActivity.this);
    actionViewonload(panel1,args);

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
,"height","44"
,"color","#ffffff"
,"layout-type","linear"
,"font-size","17"
,"font-family","default"
,"valign","center"
,"background-image","nav.png"
);
button0 = (UMButton)ThirdControl.createControl(new UMButton(context),ID_BUTTON0
,"halign","center"
,"pressed-image","btn_back_touch.png"
,"width","64"
,"background-image-dis","button"
,"height","44"
,"color","#e50011"
,"layout-type","linear"
,"font-size","17"
,"onclick","closewin"
,"font-family","default"
,"valign","center"
,"background-image","btn_back.png"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,button0,"value","#{res.task_back}"));
button0.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Task_reportwinActivity.this);
    actionClosewin(button0,args);

}
});
navigatorbar0.addView(button0);
label0 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL0
,"halign","center"
,"height","20"
,"weight","1"
,"color","#000000"
,"layout-type","linear"
,"font-size","17"
,"width","0"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label0,"content","#{res.task_report}"));
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
,"onclick","submitreport"
,"font-family","default"
,"valign","center"
,"background-image","button"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,button1,"value","#{res.task_submit}"));
button1.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Task_reportwinActivity.this);
    actionSubmitreport(button1,args);

}
});
navigatorbar0.addView(button1);

return navigatorbar0;
}
public View getPanel0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel0 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL0
,"height","30"
,"layout-type","linear"
,"background","#efeff4"
,"width","fill"
,"valign","center"
);
label1 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL1
,"halign","left"
,"height","17"
,"color","#000000"
,"layout-type","linear"
,"font-size","16"
,"width","fill"
,"margin-left","15"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label1,"content","#{plug.taskname}"));
panel0.addView(label1);

return panel0;
}
public View getCombobox0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
combobox0 = (UMComboBox)ThirdControl.createControl(new UMComboBox(context),ID_COMBOBOX0
,"bindfield","taskstate"
,"height","fill"
,"weight","1"
,"color","#000000"
,"layout-type","linear"
,"font-size","16"
,"width","0"
,"font-family","default"
);
UMComboBoxBinder combobox0_binder = new UMComboBoxBinder((IUMContextAccessor)context);
combobox0_binder.setBindInfo(new BindInfo("taskstate"));
combobox0_binder.setControl(combobox0);
binderGroup.addBinderToGroup(ID_COMBOBOX0, combobox0_binder);
combobox0_opt0 = (UMOption)ThirdControl.createControl(new UMOption(context),ID_COMBOBOX0_OPT0
,"layout-type","linear"
,"value","2"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,combobox0_opt0,"content","#{res.task_notStarted}"));
combobox0.addView(combobox0_opt0);
combobox0_opt1 = (UMOption)ThirdControl.createControl(new UMOption(context),ID_COMBOBOX0_OPT1
,"layout-type","linear"
,"value","3"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,combobox0_opt1,"content","#{res.task_ontime}"));
combobox0.addView(combobox0_opt1);
combobox0_opt2 = (UMOption)ThirdControl.createControl(new UMOption(context),ID_COMBOBOX0_OPT2
,"layout-type","linear"
,"value","4"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,combobox0_opt2,"content","#{res.task_delayed}"));
combobox0.addView(combobox0_opt2);
combobox0_opt4 = (UMOption)ThirdControl.createControl(new UMOption(context),ID_COMBOBOX0_OPT4
,"layout-type","linear"
,"value","5"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,combobox0_opt4,"content","#{res.task_finishedinAdvance}"));
combobox0.addView(combobox0_opt4);
combobox0_opt3 = (UMOption)ThirdControl.createControl(new UMOption(context),ID_COMBOBOX0_OPT3
,"layout-type","linear"
,"value","7"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,combobox0_opt3,"content","#{res.task_finished}"));
combobox0.addView(combobox0_opt3);

return combobox0;
}
public View getRounddiv1View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
rounddiv1 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_ROUNDDIV1
,"padding-right","15"
,"height","0"
,"weight","1"
,"layout-type","linear"
,"width","fill"
,"margin-top","1"
,"valign","center"
,"background-image","at44_top.png"
);
label2 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL2
,"halign","left"
,"height","20"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","70"
,"margin-left","15"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label2,"content","#{res.task_taskStatus}"));
rounddiv1.addView(label2);
View combobox0 = (View) getCombobox0View((UMActivity)context,binderGroup,configure);
rounddiv1.addView(combobox0);

return rounddiv1;
}
public View getRounddiv2View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
rounddiv2 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_ROUNDDIV2
,"padding-right","15"
,"height","44"
,"layout-type","linear"
,"width","fill"
,"valign","center"
,"background-image","at44_mid.png"
);
label3 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL3
,"halign","left"
,"height","20"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","70"
,"margin-left","15"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label3,"content","#{res.task_taskPross}"));
rounddiv2.addView(label3);
range0 = (UMSeekBar)ThirdControl.createControl(new UMSeekBar(context),ID_RANGE0
,"padding-left","2"
,"min","0"
,"bindfield","taskschedule"
,"height","30"
,"weight","1"
,"max","100"
,"layout-type","linear"
,"background","#c0c0c0"
,"width","0"
,"pressed-color","#c0c0c0"
);
UMSeekBarBinder range0_binder = new UMSeekBarBinder((IUMContextAccessor)context);
range0_binder.setBindInfo(new BindInfo("taskschedule"));
range0_binder.setControl(range0);
binderGroup.addBinderToGroup(ID_RANGE0, range0_binder);
rounddiv2.addView(range0);

return rounddiv2;
}
public View getRounddiv3View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
rounddiv3 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_ROUNDDIV3
,"padding-right","15"
,"height","44.0"
,"layout-type","linear"
,"width","fill"
,"valign","center"
,"background-image","at44_mid.png"
);
label4 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL4
,"halign","left"
,"height","20"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","70"
,"margin-left","15"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label4,"content","#{res.task_completion}"));
rounddiv3.addView(label4);
textarea0 = (UMTextArea)ThirdControl.createControl(new UMTextArea(context),ID_TEXTAREA0
,"bindfield","completion"
,"height","42"
,"color","#000000"
,"placeholder","--汇报 来自NC-MOBILE"
,"layout-type","linear"
,"font-size","14"
,"width","220.0"
,"font-family","default"
);
UMTextBinder textarea0_binder = new UMTextBinder((IUMContextAccessor)context);
textarea0_binder.setBindInfo(new BindInfo("completion"));
textarea0_binder.setControl(textarea0);
binderGroup.addBinderToGroup(ID_TEXTAREA0, textarea0_binder);
rounddiv3.addView(textarea0);

return rounddiv3;
}
public View getRounddiv4View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
rounddiv4 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_ROUNDDIV4
,"padding-right","15"
,"height","0"
,"weight","1"
,"layout-type","linear"
,"width","fill"
,"onclick","openattachwin"
,"valign","center"
,"background-image","at44_down.png"
);
rounddiv4.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Task_reportwinActivity.this);
    actionOpenattachwin(rounddiv4,args);

}
});
label5 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL5
,"halign","left"
,"height","20"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","70"
,"margin-left","15"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label5,"content","#{res.task_result}"));
rounddiv4.addView(label5);
attnum = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_ATTNUM
,"padding-right","5"
,"bindfield","count"
,"halign","right"
,"height","fill"
,"weight","1"
,"color","#000000"
,"layout-type","linear"
,"font-size","16"
,"width","0"
,"font-family","default"
,"valign","center"
);
UMTextBinder attnum_binder = new UMTextBinder((IUMContextAccessor)context);
attnum_binder.setBindInfo(new BindInfo("count"));
attnum_binder.setControl(attnum);
binderGroup.addBinderToGroup(ID_ATTNUM, attnum_binder);
rounddiv4.addView(attnum);
image0 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_IMAGE0
,"height","13"
,"pressed-image","ecm_arrow_right.png"
,"layout-type","linear"
,"width","8"
,"scaletype","fitcenter"
,"src","ecm_arrow_right.png"
);
rounddiv4.addView(image0);

return rounddiv4;
}
public View getRounddiv0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
rounddiv0 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_ROUNDDIV0
,"halign","center"
,"height","176"
,"layout-type","linear"
,"background","#efeff4"
,"width","fill"
);
View rounddiv1 = (View) getRounddiv1View((UMActivity)context,binderGroup,configure);
rounddiv0.addView(rounddiv1);
View rounddiv2 = (View) getRounddiv2View((UMActivity)context,binderGroup,configure);
rounddiv0.addView(rounddiv2);
View rounddiv3 = (View) getRounddiv3View((UMActivity)context,binderGroup,configure);
rounddiv0.addView(rounddiv3);
View rounddiv4 = (View) getRounddiv4View((UMActivity)context,binderGroup,configure);
rounddiv0.addView(rounddiv4);

return rounddiv0;
}
public View getPanel1View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel1 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL1
,"halign","center"
,"height","fill"
,"onload","viewonload"
,"layout-type","linear"
,"background","#efeff4"
,"width","fill"
);
View rounddiv0 = (View) getRounddiv0View((UMActivity)context,binderGroup,configure);
panel1.addView(rounddiv0);

return panel1;
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
View panel0 = (View) getPanel0View((UMActivity)context,binderGroup,configure);
viewPage0.addView(panel0);
View panel1 = (View) getPanel1View((UMActivity)context,binderGroup,configure);
viewPage0.addView(panel1);

return viewPage0;
}
public UMWindow getCurrentWindow(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
reportwin = (UMWindow)ThirdControl.createControl(new UMWindow(context),ID_REPORTWIN
,"halign","center"
,"height","fill"
,"layout","vbox"
,"width","fill"
,"context","report"
,"controller","reportwinController"
,"namespace","nc.bs.oa.oama.ecm"
);
View viewPage0 = (View) getViewPage0View((UMActivity)context,binderGroup,configure);
reportwin.addView(viewPage0);

return (UMWindow)reportwin;
}

	
	public void actionReturntip(View control, UMEventArgs args) {
    String actionid = "returntip";
    args.put("message","#{res.task_dosuccess}");
    args.put("title","提示");
    args.put("abc","#{reportdata}");
    args.put("okaction","closewin");
    args.put("okbuttontitle","#{res.task_ok}");
    args.put("style","ok");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.openDialog(args);
}
public void actionAttwinback(View control, UMEventArgs args) {
    String actionid = "attwinback";
  this.dataCollect();
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "attwinback",UMActivity.getViewId(control),args);
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
public void actionSubmitreport(View control, UMEventArgs args) {
    String actionid = "submitreport";
    args.put("reportdetail","#{CONTEXT}");
    args.put("viewid","nc.bs.oa.oama.oatask.DetailtaskExtendController");
    args.put("taskid","#{plug.taskid}");
  this.dataCollect();
    args.put("action","submitReport");
    args.put("callback","returntip");
    args.put("autoDataBinding","true");
    args.put("contextmapping","reportdata");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMService.callAction(args);
}
public void actionUMonUnload(View control, UMEventArgs args) {
    String actionid = "UMonUnload";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "UMonUnload",UMActivity.getViewId(control),args);
}
public void actionOpenattachwin(View control, UMEventArgs args) {
    String actionid = "openattachwin";
    args.put("attachmentuuid","#{attachmentuuid}");
    args.put("viewid","nc.bs.oa.oama.ecm.Task_attach_edit");
  this.dataCollect();
    args.put("callback","attwinback");
    args.put("iskeep","true");
    args.put("type","2");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.open(args);
}
public void actionClosewin(View control, UMEventArgs args) {
    String actionid = "closewin";
    args.put("resultcode","15");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.close(args);
}
public void actionViewonload(View control, UMEventArgs args) {
    String actionid = "viewonload";
    args.put("viewid","nc.bs.oa.oama.oatask.DetailtaskExtendController");
    args.put("action","reportonload");
    args.put("autoDataBinding","true");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMService.callAction(args);
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
