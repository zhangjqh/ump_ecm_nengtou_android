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

public abstract class Task_reportconfirmdetailActivity extends UMWindowActivity {

	protected UMWindow reportconfirmdetail = null;
protected XVerticalLayout viewPage0 = null;
protected XHorizontalLayout navigatorbar0 = null;
protected UMButton button3 = null;
protected UMLabel label0 = null;
protected UMButton button5 = null;
protected XVerticalLayout panel123 = null;
protected UMScrollView Scrollview_panel0 = null;
protected XVerticalLayout panel0 = null;
protected XVerticalLayout panel1 = null;
protected XVerticalLayout rounddiv1 = null;
protected XHorizontalLayout rounddiv3 = null;
protected UMLabel label1 = null;
protected XHorizontalLayout rounddiv4 = null;
protected UMLabel label2 = null;
protected UMLabel label3 = null;
protected UMLabel label6 = null;
protected XHorizontalLayout rounddiv5 = null;
protected UMLabel label7 = null;
protected UMLabel label8 = null;
protected XHorizontalLayout rounddiv6 = null;
protected UMProgressBar progressbar0 = null;
protected XHorizontalLayout rounddiv7 = null;
protected UMLabel label10 = null;
protected UMLabel label11 = null;
protected XHorizontalLayout rounddiv9 = null;
protected UMLabel label17 = null;
protected UMLabel label16 = null;
protected UMButton button13 = null;
protected XHorizontalLayout rounddiv0 = null;
protected XHorizontalLayout rounddiv10 = null;
protected UMLabel label12 = null;
protected UMLabel label4 = null;
protected UMLabel label14 = null;
protected UMButton button4 = null;
protected XHorizontalLayout toolbar0 = null;
protected UMButton button0 = null;
protected UMLabel label13 = null;
protected UMButton button2 = null;

	
	protected final static int ID_REPORTCONFIRMDETAIL = 1565974750;
protected final static int ID_VIEWPAGE0 = 369008231;
protected final static int ID_NAVIGATORBAR0 = 973211845;
protected final static int ID_BUTTON3 = 1861971226;
protected final static int ID_LABEL0 = 214543667;
protected final static int ID_BUTTON5 = 2127776017;
protected final static int ID_PANEL123 = 714205590;
protected final static int ID_SCROLLVIEW_PANEL0 = 295979368;
protected final static int ID_PANEL0 = 834129087;
protected final static int ID_PANEL1 = 1144870396;
protected final static int ID_ROUNDDIV1 = 367084607;
protected final static int ID_ROUNDDIV3 = 1090618735;
protected final static int ID_LABEL1 = 914510420;
protected final static int ID_ROUNDDIV4 = 1349329459;
protected final static int ID_LABEL2 = 1076336009;
protected final static int ID_LABEL3 = 533124269;
protected final static int ID_LABEL6 = 522244904;
protected final static int ID_ROUNDDIV5 = 627383465;
protected final static int ID_LABEL7 = 2056256482;
protected final static int ID_LABEL8 = 1801611229;
protected final static int ID_ROUNDDIV6 = 946847491;
protected final static int ID_PROGRESSBAR0 = 738134550;
protected final static int ID_ROUNDDIV7 = 1537422938;
protected final static int ID_LABEL10 = 219585106;
protected final static int ID_LABEL11 = 1223385089;
protected final static int ID_ROUNDDIV9 = 1640700134;
protected final static int ID_LABEL17 = 551163944;
protected final static int ID_LABEL16 = 1756664038;
protected final static int ID_BUTTON13 = 449951708;
protected final static int ID_ROUNDDIV0 = 1486952113;
protected final static int ID_ROUNDDIV10 = 959880657;
protected final static int ID_LABEL12 = 947171194;
protected final static int ID_LABEL4 = 157167749;
protected final static int ID_LABEL14 = 304734621;
protected final static int ID_BUTTON4 = 262963238;
protected final static int ID_TOOLBAR0 = 79501163;
protected final static int ID_BUTTON0 = 599151065;
protected final static int ID_LABEL13 = 1498787074;
protected final static int ID_BUTTON2 = 408776799;

	
	
	@Override
	public String getControllerName() {
		return "reportconfirmdetailController";
	}
	
	@Override
	public String getContextName() {
		return "reportconfirmdetail";
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
		  idmap.put("reportconfirmdetail",ID_REPORTCONFIRMDETAIL);
  idmap.put("viewPage0",ID_VIEWPAGE0);
  idmap.put("navigatorbar0",ID_NAVIGATORBAR0);
  idmap.put("button3",ID_BUTTON3);
  idmap.put("label0",ID_LABEL0);
  idmap.put("button5",ID_BUTTON5);
  idmap.put("panel123",ID_PANEL123);
  idmap.put("Scrollview_panel0",ID_SCROLLVIEW_PANEL0);
  idmap.put("panel0",ID_PANEL0);
  idmap.put("panel1",ID_PANEL1);
  idmap.put("rounddiv1",ID_ROUNDDIV1);
  idmap.put("rounddiv3",ID_ROUNDDIV3);
  idmap.put("label1",ID_LABEL1);
  idmap.put("rounddiv4",ID_ROUNDDIV4);
  idmap.put("label2",ID_LABEL2);
  idmap.put("label3",ID_LABEL3);
  idmap.put("label6",ID_LABEL6);
  idmap.put("rounddiv5",ID_ROUNDDIV5);
  idmap.put("label7",ID_LABEL7);
  idmap.put("label8",ID_LABEL8);
  idmap.put("rounddiv6",ID_ROUNDDIV6);
  idmap.put("progressbar0",ID_PROGRESSBAR0);
  idmap.put("rounddiv7",ID_ROUNDDIV7);
  idmap.put("label10",ID_LABEL10);
  idmap.put("label11",ID_LABEL11);
  idmap.put("rounddiv9",ID_ROUNDDIV9);
  idmap.put("label17",ID_LABEL17);
  idmap.put("label16",ID_LABEL16);
  idmap.put("button13",ID_BUTTON13);
  idmap.put("rounddiv0",ID_ROUNDDIV0);
  idmap.put("rounddiv10",ID_ROUNDDIV10);
  idmap.put("label12",ID_LABEL12);
  idmap.put("label4",ID_LABEL4);
  idmap.put("label14",ID_LABEL14);
  idmap.put("button4",ID_BUTTON4);
  idmap.put("toolbar0",ID_TOOLBAR0);
  idmap.put("button0",ID_BUTTON0);
  idmap.put("label13",ID_LABEL13);
  idmap.put("button2",ID_BUTTON2);

	}
	
	public void onLoad() {
		ULog.logLC("onLoad", this);
		if(currentPage!=null) {
			currentPage.onLoad();
		}
	
		{ //panel123 - reportonload
    UMEventArgs args = new UMEventArgs(Task_reportconfirmdetailActivity.this);
    actionReportonload(panel123,args);

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
button3 = (UMButton)ThirdControl.createControl(new UMButton(context),ID_BUTTON3
,"halign","center"
,"pressed-image","btn_back_touch"
,"width","64"
,"background-image-dis","button"
,"height","44"
,"color","#e50011"
,"layout-type","linear"
,"font-size","17"
,"onclick","returnback"
,"font-family","default"
,"valign","center"
,"background-image","btn_back"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,button3,"value","#{res.task_back}"));
button3.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Task_reportconfirmdetailActivity.this);
    actionReturnback(button3,args);

}
});
navigatorbar0.addView(button3);
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
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label0,"content","#{res.task_tobeconfirmedreport}"));
navigatorbar0.addView(label0);
button5 = (UMButton)ThirdControl.createControl(new UMButton(context),ID_BUTTON5
,"halign","center"
,"visible","false"
,"pressed-image","button_touch"
,"width","50"
,"background-image-dis","button"
,"height","30"
,"color","#e50011"
,"layout-type","linear"
,"font-size","17"
,"onclick","openurgewin"
,"font-family","default"
,"valign","center"
,"background-image","button"
,"disabled","disabled"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,button5,"value","#{res.task_remind}"));
button5.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Task_reportconfirmdetailActivity.this);
    actionOpenurgewin(button5,args);

}
});
navigatorbar0.addView(button5);

return navigatorbar0;
}
public View getRounddiv3View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
rounddiv3 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_ROUNDDIV3
,"height","0"
,"weight","1"
,"layout-type","linear"
,"width","fill"
,"valign","center"
,"background-image","at44_top.png"
);
label1 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL1
,"bindfield","reportheme"
,"halign","left"
,"height","fill"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","150"
,"margin-left","15"
,"font-family","default"
,"valign","center"
);
UMTextBinder label1_binder = new UMTextBinder((IUMContextAccessor)context);
label1_binder.setBindInfo(new BindInfo("reportheme"));
label1_binder.setControl(label1);
binderGroup.addBinderToGroup(ID_LABEL1, label1_binder);
rounddiv3.addView(label1);

return rounddiv3;
}
public View getRounddiv4View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
rounddiv4 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_ROUNDDIV4
,"padding-right","15"
,"height","0"
,"weight","1"
,"layout-type","linear"
,"width","fill"
,"valign","center"
,"background-image","at44_mid.png"
);
label2 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL2
,"bindfield",""
,"halign","left"
,"height","fill"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","70"
,"margin-left","15"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label2,"content","#{res.task_newreport}"));
rounddiv4.addView(label2);
label3 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL3
,"bindfield","reporttime"
,"halign","left"
,"height","fill"
,"weight","1"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","0"
,"font-family","default"
,"valign","center"
);
UMTextBinder label3_binder = new UMTextBinder((IUMContextAccessor)context);
label3_binder.setBindInfo(new BindInfo("reporttime"));
label3_binder.setControl(label3);
binderGroup.addBinderToGroup(ID_LABEL3, label3_binder);
rounddiv4.addView(label3);
label6 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL6
,"bindfield","reportname"
,"halign","right"
,"height","fill"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","70"
,"font-family","default"
,"valign","center"
);
UMTextBinder label6_binder = new UMTextBinder((IUMContextAccessor)context);
label6_binder.setBindInfo(new BindInfo("reportname"));
label6_binder.setControl(label6);
binderGroup.addBinderToGroup(ID_LABEL6, label6_binder);
rounddiv4.addView(label6);

return rounddiv4;
}
public View getRounddiv5View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
rounddiv5 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_ROUNDDIV5
,"height","0"
,"weight","1"
,"layout-type","linear"
,"width","fill"
,"valign","center"
,"background-image","at44_mid.png"
);
label7 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL7
,"halign","left"
,"height","fill"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","100"
,"margin-left","15"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label7,"content","#{res.task_taskStatus}"));
rounddiv5.addView(label7);
label8 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL8
,"bindfield","taskstate"
,"halign","left"
,"height","fill"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","100"
,"font-family","default"
,"valign","center"
);
UMTextBinder label8_binder = new UMTextBinder((IUMContextAccessor)context);
label8_binder.setBindInfo(new BindInfo("taskstate"));
label8_binder.setControl(label8);
binderGroup.addBinderToGroup(ID_LABEL8, label8_binder);
rounddiv5.addView(label8);

return rounddiv5;
}
public View getRounddiv6View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
rounddiv6 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_ROUNDDIV6
,"padding-right","15"
,"padding-left","15"
,"height","0"
,"weight","1"
,"layout-type","linear"
,"width","fill"
,"valign","center"
,"background-image","at44_mid.png"
);
progressbar0 = (UMProgressBar)ThirdControl.createControl(new UMProgressBar(context),ID_PROGRESSBAR0
,"bindfield","taskschedule"
,"progress","0"
,"height","10"
,"weight","1"
,"max","100"
,"layout-type","linear"
,"background","#c8c7cc"
,"width","0"
,"progresscolor","#0852a5"
,"secondaryprogress","0"
);
UMProgressBarBinder progressbar0_binder = new UMProgressBarBinder((IUMContextAccessor)context);
progressbar0_binder.setBindInfo(new BindInfo("taskschedule"));
progressbar0_binder.setControl(progressbar0);
binderGroup.addBinderToGroup(ID_PROGRESSBAR0, progressbar0_binder);
rounddiv6.addView(progressbar0);

return rounddiv6;
}
public View getRounddiv7View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
rounddiv7 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_ROUNDDIV7
,"padding-right","15"
,"height","0"
,"weight","1"
,"layout-type","linear"
,"width","fill"
,"valign","center"
,"background-image","at44_down.png"
);
label10 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL10
,"halign","left"
,"height","fill"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","100"
,"margin-left","15"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label10,"content","#{res.task_completionSate}"));
rounddiv7.addView(label10);
label11 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL11
,"bindfield","completionnew"
,"halign","left"
,"height","fill"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","190"
,"font-family","default"
,"valign","center"
);
UMTextBinder label11_binder = new UMTextBinder((IUMContextAccessor)context);
label11_binder.setBindInfo(new BindInfo("completionnew"));
label11_binder.setControl(label11);
binderGroup.addBinderToGroup(ID_LABEL11, label11_binder);
rounddiv7.addView(label11);

return rounddiv7;
}
public View getRounddiv9View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
rounddiv9 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_ROUNDDIV9
,"padding-right","15"
,"height","0"
,"weight","1"
,"layout-type","linear"
,"width","fill"
,"onclick","openattwin"
,"valign","center"
,"background-image","at44_down.png"
);
rounddiv9.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Task_reportconfirmdetailActivity.this);
    actionOpenattwin(rounddiv9,args);

}
});
label17 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL17
,"halign","left"
,"height","fill"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","100"
,"margin-left","15"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label17,"content","#{res.task_result}"));
rounddiv9.addView(label17);
label16 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL16
,"bindfield","count"
,"halign","right"
,"height","fill"
,"weight","1"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","0"
,"font-family","default"
,"valign","center"
);
UMTextBinder label16_binder = new UMTextBinder((IUMContextAccessor)context);
label16_binder.setBindInfo(new BindInfo("count"));
label16_binder.setControl(label16);
binderGroup.addBinderToGroup(ID_LABEL16, label16_binder);
rounddiv9.addView(label16);
button13 = (UMButton)ThirdControl.createControl(new UMButton(context),ID_BUTTON13
,"halign","center"
,"height","13"
,"color","#ff0000"
,"pressed-image","ecm_arrow_right.png"
,"layout-type","linear"
,"font-size","18"
,"width","8"
,"background-image-dis","button"
,"font-family","default"
,"valign","center"
,"background-image","ecm_arrow_right.png"
);
rounddiv9.addView(button13);

return rounddiv9;
}
public View getRounddiv1View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
rounddiv1 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_ROUNDDIV1
,"halign","center"
,"height","fill"
,"layout-type","linear"
,"width","fill"
);
View rounddiv3 = (View) getRounddiv3View((UMActivity)context,binderGroup,configure);
rounddiv1.addView(rounddiv3);
View rounddiv4 = (View) getRounddiv4View((UMActivity)context,binderGroup,configure);
rounddiv1.addView(rounddiv4);
View rounddiv5 = (View) getRounddiv5View((UMActivity)context,binderGroup,configure);
rounddiv1.addView(rounddiv5);
View rounddiv6 = (View) getRounddiv6View((UMActivity)context,binderGroup,configure);
rounddiv1.addView(rounddiv6);
View rounddiv7 = (View) getRounddiv7View((UMActivity)context,binderGroup,configure);
rounddiv1.addView(rounddiv7);
View rounddiv9 = (View) getRounddiv9View((UMActivity)context,binderGroup,configure);
rounddiv1.addView(rounddiv9);

return rounddiv1;
}
public View getPanel1View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel1 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL1
,"halign","center"
,"height","264"
,"layout-type","linear"
,"background","#efeff4"
,"width","fill"
);
View rounddiv1 = (View) getRounddiv1View((UMActivity)context,binderGroup,configure);
panel1.addView(rounddiv1);

return panel1;
}
public View getRounddiv10View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
rounddiv10 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_ROUNDDIV10
,"padding-right","15"
,"height","42"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"valign","center"
);
label12 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL12
,"bindfield","taskid"
,"halign","center"
,"height","14"
,"color","#000000"
,"layout-type","linear"
,"font-size","12"
,"width","32"
,"font-family","default"
,"display","none"
,"valign","center"
);
UMTextBinder label12_binder = new UMTextBinder((IUMContextAccessor)context);
label12_binder.setBindInfo(new BindInfo("taskid"));
label12_binder.setControl(label12);
binderGroup.addBinderToGroup(ID_LABEL12, label12_binder);
rounddiv10.addView(label12);
label4 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL4
,"halign","left"
,"height","fill"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","100"
,"margin-left","15"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label4,"content","#{res.task_reportHistory}"));
rounddiv10.addView(label4);
label14 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL14
,"halign","center"
,"height","14"
,"weight","1"
,"color","#e50011"
,"layout-type","linear"
,"font-size","12"
,"width","0"
,"font-family","default"
,"valign","center"
);
rounddiv10.addView(label14);
button4 = (UMButton)ThirdControl.createControl(new UMButton(context),ID_BUTTON4
,"halign","center"
,"height","13"
,"color","#ff0000"
,"pressed-image","ecm_arrow_right.png"
,"layout-type","linear"
,"font-size","18"
,"width","8"
,"background-image-dis","button"
,"font-family","default"
,"valign","center"
,"background-image","ecm_arrow_right.png"
);
rounddiv10.addView(button4);

return rounddiv10;
}
public View getRounddiv0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
rounddiv0 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_ROUNDDIV0
,"height","44"
,"layout-type","linear"
,"background","#c8c7cc"
,"width","fill"
,"onclick","getreporthistory"
,"margin-top","20"
,"valign","center"
);
rounddiv0.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Task_reportconfirmdetailActivity.this);
    actionGetreporthistory(rounddiv0,args);

}
});
View rounddiv10 = (View) getRounddiv10View((UMActivity)context,binderGroup,configure);
rounddiv0.addView(rounddiv10);

return rounddiv0;
}
public View getPanel0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel0 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL0
,"halign","center"
,"height","wrap"
,"layout-type","linear"
,"background","#efeff4"
,"width","fill"
,"margin-top","15"
);
View panel1 = (View) getPanel1View((UMActivity)context,binderGroup,configure);
panel0.addView(panel1);
View rounddiv0 = (View) getRounddiv0View((UMActivity)context,binderGroup,configure);
panel0.addView(rounddiv0);

return panel0;
}
public View getScrollview_panel0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
Scrollview_panel0 = (UMScrollView)ThirdControl.createControl(new UMScrollView(context),ID_SCROLLVIEW_PANEL0
,"height","500"
,"layout-type","linear"
,"width","fill"
);
View panel0 = (View) getPanel0View((UMActivity)context,binderGroup,configure);
Scrollview_panel0.addView(panel0);

return Scrollview_panel0;
}
public View getPanel123View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel123 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL123
,"halign","center"
,"height","0"
,"weight","1"
,"onload","reportonload"
,"layout-type","linear"
,"background","#efeff4"
,"width","fill"
,"margin-top","15"
);
View Scrollview_panel0 = (View) getScrollview_panel0View((UMActivity)context,binderGroup,configure);
panel123.addView(Scrollview_panel0);

return panel123;
}
public View getToolbar0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
toolbar0 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_TOOLBAR0
,"padding-right","8"
,"padding-left","8"
,"height","49"
,"pressed-image","toolbar"
,"layout-type","linear"
,"width","fill"
,"background-image-dis","toolbar"
,"valign","center"
,"background-image","toolbar.png"
);
button0 = (UMButton)ThirdControl.createControl(new UMButton(context),ID_BUTTON0
,"halign","center"
,"pressed-image","button_touch"
,"width","50"
,"background-image-dis","button"
,"height","30"
,"color","#e50011"
,"layout-type","linear"
,"font-size","18"
,"onclick","refuseclick"
,"font-family","default"
,"valign","center"
,"background-image","button"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,button0,"value","#{res.task_reject}"));
button0.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Task_reportconfirmdetailActivity.this);
    actionRefuseclick(button0,args);

}
});
toolbar0.addView(button0);
label13 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL13
,"halign","center"
,"height","14"
,"weight","1"
,"color","#e50011"
,"layout-type","linear"
,"font-size","12"
,"width","0"
,"font-family","default"
,"valign","center"
);
toolbar0.addView(label13);
button2 = (UMButton)ThirdControl.createControl(new UMButton(context),ID_BUTTON2
,"halign","center"
,"pressed-image","button_touch"
,"width","50"
,"background-image-dis","button"
,"height","30"
,"color","#e50011"
,"layout-type","linear"
,"font-size","18"
,"onclick","agreeclick"
,"font-family","default"
,"valign","center"
,"background-image","button"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,button2,"value","#{res.task_accept}"));
button2.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Task_reportconfirmdetailActivity.this);
    actionAgreeclick(button2,args);

}
});
toolbar0.addView(button2);

return toolbar0;
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
View panel123 = (View) getPanel123View((UMActivity)context,binderGroup,configure);
viewPage0.addView(panel123);
View toolbar0 = (View) getToolbar0View((UMActivity)context,binderGroup,configure);
viewPage0.addView(toolbar0);

return viewPage0;
}
public UMWindow getCurrentWindow(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
reportconfirmdetail = (UMWindow)ThirdControl.createControl(new UMWindow(context),ID_REPORTCONFIRMDETAIL
,"halign","center"
,"height","fill"
,"layout","vbox"
,"width","fill"
,"context","reportconfirmdetail"
,"controller","reportconfirmdetailController"
,"namespace","nc.bs.oa.oama.ecm"
);
View viewPage0 = (View) getViewPage0View((UMActivity)context,binderGroup,configure);
reportconfirmdetail.addView(viewPage0);

return (UMWindow)reportconfirmdetail;
}

	
	public void actionReturnback(View control, UMEventArgs args) {
    String actionid = "returnback";
    args.put("viewid","nc.bs.oa.oama.ecm.Task_mainviewconfirm");
    args.put("iskeep","false");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.open(args);
}
public void actionAgreeclick(View control, UMEventArgs args) {
    String actionid = "agreeclick";
  this.dataCollect();
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "agreeclick",UMActivity.getViewId(control),args);
}
public void actionRefuseclick(View control, UMEventArgs args) {
    String actionid = "refuseclick";
  this.dataCollect();
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "refuseclick",UMActivity.getViewId(control),args);
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
public void actionOpenattwin(View control, UMEventArgs args) {
    String actionid = "openattwin";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "openattwin",UMActivity.getViewId(control),args);
}
public void actionOpenurgewin(View control, UMEventArgs args) {
    String actionid = "openurgewin";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "openurgewin",UMActivity.getViewId(control),args);
}
public void actionUMonUnload(View control, UMEventArgs args) {
    String actionid = "UMonUnload";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "UMonUnload",UMActivity.getViewId(control),args);
}
public void actionGetreporthistory(View control, UMEventArgs args) {
    String actionid = "getreporthistory";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "getreporthistory",UMActivity.getViewId(control),args);
}
public void actionUMonComplete(View control, UMEventArgs args) {
    String actionid = "UMonComplete";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "UMonComplete",UMActivity.getViewId(control),args);
}
public void actionReportonload(View control, UMEventArgs args) {
    String actionid = "reportonload";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "reportonload",UMActivity.getViewId(control),args);
}
public void actionUMonDataBinding(View control, UMEventArgs args) {
    String actionid = "UMonDataBinding";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "UMonDataBinding",UMActivity.getViewId(control),args);
}


}
