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

import wa.android.libs.clickFillScreen.FillScreenActivity;
import android.os.*;
import android.view.*;
import android.widget.*;
import android.webkit.*;
import android.content.*;
import android.graphics.*;
import android.widget.ImageView.ScaleType;

public abstract class Task_personaltask_detailActivity extends UMWindowActivity {

	protected UMWindow personaltask_detail = null;
protected XVerticalLayout viewPage0 = null;
protected XHorizontalLayout navigatorbar0 = null;
protected UMButton button0 = null;
protected UMLabel label0 = null;
protected UMButton button1 = null;
protected XVerticalLayout panel0 = null;
protected UMScrollView Scrollview_panel11 = null;
protected XVerticalLayout panel11 = null;
protected XHorizontalLayout rounddiv0 = null;
protected UMLabel label1 = null;
protected UMLabel label12 = null;
protected XHorizontalLayout rounddiv1 = null;
protected UMLabel label2 = null;
protected UMLabel label13 = null;
protected XHorizontalLayout rounddiv2 = null;
protected UMLabel label3 = null;
protected UMLabel label14 = null;
protected XHorizontalLayout rounddiv3 = null;
protected UMLabel label4 = null;
protected UMLabel label15 = null;
protected XHorizontalLayout rounddiv4 = null;
protected UMLabel label5 = null;
protected UMLabel label6 = null;
protected XHorizontalLayout rounddiv5 = null;
protected UMLabel label7 = null;
protected UMLabel label16 = null;
protected XHorizontalLayout rounddiv6 = null;
protected UMLabel label8 = null;
protected UMLabel label17 = null;
protected XHorizontalLayout rounddiv7 = null;
protected UMLabel label9 = null;
protected UMLabel label18 = null;
protected XHorizontalLayout rounddiv9 = null;
protected UMLabel label29 = null;
protected UMLabel label28 = null;
protected UMButton button12 = null;
protected XHorizontalLayout toolbar0 = null;
protected UMButton button2 = null;
protected UMButton button3 = null;
protected UMButton button4 = null;

	
	protected final static int ID_PERSONALTASK_DETAIL = 992873237;
protected final static int ID_VIEWPAGE0 = 1665066552;
protected final static int ID_NAVIGATORBAR0 = 1402915216;
protected final static int ID_BUTTON0 = 1743860552;
protected final static int ID_LABEL0 = 603589367;
protected final static int ID_BUTTON1 = 1314384735;
protected final static int ID_PANEL0 = 1780206994;
protected final static int ID_SCROLLVIEW_PANEL11 = 1236884016;
protected final static int ID_PANEL11 = 117232997;
protected final static int ID_ROUNDDIV0 = 219750272;
protected final static int ID_LABEL1 = 1047778431;
protected final static int ID_LABEL12 = 1545831926;
protected final static int ID_ROUNDDIV1 = 744814411;
protected final static int ID_LABEL2 = 1504126116;
protected final static int ID_LABEL13 = 196215993;
protected final static int ID_ROUNDDIV2 = 443626006;
protected final static int ID_LABEL3 = 752216298;
protected final static int ID_LABEL14 = 31687525;
protected final static int ID_ROUNDDIV3 = 1570972588;
protected final static int ID_LABEL4 = 1347106701;
protected final static int ID_LABEL15 = 2055001569;
protected final static int ID_ROUNDDIV4 = 1523195503;
protected final static int ID_LABEL5 = 910821282;
protected final static int ID_LABEL6 = 1880635355;
protected final static int ID_ROUNDDIV5 = 420605486;
protected final static int ID_LABEL7 = 985461304;
protected final static int ID_LABEL16 = 1362961238;
protected final static int ID_ROUNDDIV6 = 579942149;
protected final static int ID_LABEL8 = 1009546148;
protected final static int ID_LABEL17 = 251745373;
protected final static int ID_ROUNDDIV7 = 1238154006;
protected final static int ID_LABEL9 = 365920130;
protected final static int ID_LABEL18 = 484383674;
protected final static int ID_ROUNDDIV9 = 1360082829;
protected final static int ID_LABEL29 = 116698640;
protected final static int ID_LABEL28 = 249165636;
protected final static int ID_BUTTON12 = 535699458;
protected final static int ID_TOOLBAR0 = 220438568;
protected final static int ID_BUTTON2 = 1740196292;
protected final static int ID_BUTTON3 = 1621462054;
protected final static int ID_BUTTON4 = 10686702;

	
	
	@Override
	public String getControllerName() {
		return "personaltask_detailController";
	}
	
	@Override
	public String getContextName() {
		return "personaltask";
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
		  idmap.put("personaltask_detail",ID_PERSONALTASK_DETAIL);
  idmap.put("viewPage0",ID_VIEWPAGE0);
  idmap.put("navigatorbar0",ID_NAVIGATORBAR0);
  idmap.put("button0",ID_BUTTON0);
  idmap.put("label0",ID_LABEL0);
  idmap.put("button1",ID_BUTTON1);
  idmap.put("panel0",ID_PANEL0);
  idmap.put("Scrollview_panel11",ID_SCROLLVIEW_PANEL11);
  idmap.put("panel11",ID_PANEL11);
  idmap.put("rounddiv0",ID_ROUNDDIV0);
  idmap.put("label1",ID_LABEL1);
  idmap.put("label12",ID_LABEL12);
  idmap.put("rounddiv1",ID_ROUNDDIV1);
  idmap.put("label2",ID_LABEL2);
  idmap.put("label13",ID_LABEL13);
  idmap.put("rounddiv2",ID_ROUNDDIV2);
  idmap.put("label3",ID_LABEL3);
  idmap.put("label14",ID_LABEL14);
  idmap.put("rounddiv3",ID_ROUNDDIV3);
  idmap.put("label4",ID_LABEL4);
  idmap.put("label15",ID_LABEL15);
  idmap.put("rounddiv4",ID_ROUNDDIV4);
  idmap.put("label5",ID_LABEL5);
  idmap.put("label6",ID_LABEL6);
  idmap.put("rounddiv5",ID_ROUNDDIV5);
  idmap.put("label7",ID_LABEL7);
  idmap.put("label16",ID_LABEL16);
  idmap.put("rounddiv6",ID_ROUNDDIV6);
  idmap.put("label8",ID_LABEL8);
  idmap.put("label17",ID_LABEL17);
  idmap.put("rounddiv7",ID_ROUNDDIV7);
  idmap.put("label9",ID_LABEL9);
  idmap.put("label18",ID_LABEL18);
  idmap.put("rounddiv9",ID_ROUNDDIV9);
  idmap.put("label29",ID_LABEL29);
  idmap.put("label28",ID_LABEL28);
  idmap.put("button12",ID_BUTTON12);
  idmap.put("toolbar0",ID_TOOLBAR0);
  idmap.put("button2",ID_BUTTON2);
  idmap.put("button3",ID_BUTTON3);
  idmap.put("button4",ID_BUTTON4);

	}
	
	public void onLoad() {
		ULog.logLC("onLoad", this);
		if(currentPage!=null) {
			currentPage.onLoad();
		}
	
		{ //panel0 - detailOnload
    UMEventArgs args = new UMEventArgs(Task_personaltask_detailActivity.this);
    actionDetailOnload(panel0,args);

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
,"color","#ffffff"
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
,"color","#e50011"
,"layout-type","linear"
,"font-size","17"
,"onclick","returnforlist"
,"font-family","default"
,"valign","center"
,"background-image","btn_back"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,button0,"value","#{res.task_back}"));
button0.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Task_personaltask_detailActivity.this);
    actionReturnforlist(button0,args);

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
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label0,"content","#{res.task_personalTask}"));
navigatorbar0.addView(label0);
button1 = (UMButton)ThirdControl.createControl(new UMButton(context),ID_BUTTON1
,"halign","center"
,"pressed-image","button_touch"
,"width","50"
,"background-image-dis","button"
,"height","30"
,"color","#e50011"
,"layout-type","linear"
,"font-size","17"
,"onclick","beforeEdit"
,"font-family","default"
,"valign","center"
,"background-image","button"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,button1,"value","#{res.task_edit}"));
button1.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Task_personaltask_detailActivity.this);
    actionBeforeEdit(button1,args);

}
});
navigatorbar0.addView(button1);

return navigatorbar0;
}
public View getRounddiv0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
rounddiv0 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_ROUNDDIV0
,"padding-right","15"
,"height","44"
,"layout-type","linear"
,"width","fill"
,"valign","center"
,"background-image","at44_top.png"
);
label1 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL1
,"halign","left"
,"height","20"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","100"
,"margin-left","15"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label1,"content","#{res.task_start}"));
rounddiv0.addView(label1);
label12 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL12
,"bindfield","startdate"
,"halign","right"
,"height","fill"
,"weight","1"
,"color","#8e8e93"
,"layout-type","linear"
,"font-size","16"
,"width","0"
,"font-family","default"
,"valign","center"
);
UMTextBinder label12_binder = new UMTextBinder((IUMContextAccessor)context);
label12_binder.setBindInfo(new BindInfo("startdate"));
label12_binder.setControl(label12);
binderGroup.addBinderToGroup(ID_LABEL12, label12_binder);
rounddiv0.addView(label12);

return rounddiv0;
}
public View getRounddiv1View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
rounddiv1 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_ROUNDDIV1
,"padding-right","15"
,"height","44"
,"layout-type","linear"
,"width","fill"
,"valign","center"
,"background-image","at44_mid.png"
);
label2 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL2
,"halign","left"
,"height","20"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","100"
,"margin-left","15"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label2,"content","#{res.task_end}"));
rounddiv1.addView(label2);
label13 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL13
,"bindfield","enddate"
,"halign","right"
,"height","fill"
,"weight","1"
,"color","#8e8e93"
,"layout-type","linear"
,"font-size","16"
,"width","0"
,"font-family","default"
,"valign","center"
);
UMTextBinder label13_binder = new UMTextBinder((IUMContextAccessor)context);
label13_binder.setBindInfo(new BindInfo("enddate"));
label13_binder.setControl(label13);
binderGroup.addBinderToGroup(ID_LABEL13, label13_binder);
rounddiv1.addView(label13);

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
,"width","100"
,"margin-left","15"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label3,"content","#{res.task_subject}"));
rounddiv2.addView(label3);
label14 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL14
,"bindfield","taskname"
,"halign","right"
,"height","fill"
,"weight","1"
,"onlongclick","contentdetail"
,"color","#8e8e93"
,"layout-type","linear"
,"font-size","16"
,"width","0"
,"font-family","default"
,"valign","center"
);
UMTextBinder label14_binder = new UMTextBinder((IUMContextAccessor)context);
label14_binder.setBindInfo(new BindInfo("taskname"));
label14_binder.setControl(label14);
binderGroup.addBinderToGroup(ID_LABEL14, label14_binder);
label14.setOnLongClickListener(new View.OnLongClickListener() {
  @Override
  public boolean onLongClick(View v) {
				Intent intent = new Intent(
						Task_personaltask_detailActivity.this,
						FillScreenActivity.class);
				intent.putExtra("checkText", ((UMLabel) v).getText());
				startActivity(intent);

return false;
}
});
rounddiv2.addView(label14);

return rounddiv2;
}
public View getRounddiv3View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
rounddiv3 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_ROUNDDIV3
,"padding-right","15"
,"height","44"
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
,"width","100"
,"margin-left","15"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label4,"content","#{res.task_taskContent}"));
rounddiv3.addView(label4);
label15 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL15
,"bindfield","taskcontent"
,"halign","right"
,"height","fill"
,"weight","1"
,"onlongclick","contentdetail"
,"color","#8e8e93"
,"layout-type","linear"
,"font-size","16"
,"width","0"
,"font-family","default"
,"valign","center"
);
UMTextBinder label15_binder = new UMTextBinder((IUMContextAccessor)context);
label15_binder.setBindInfo(new BindInfo("taskcontent"));
label15_binder.setControl(label15);
binderGroup.addBinderToGroup(ID_LABEL15, label15_binder);
label15.setOnLongClickListener(new View.OnLongClickListener() {
  @Override
  public boolean onLongClick(View v) {
	  Intent intent = new Intent(
				Task_personaltask_detailActivity.this,
				FillScreenActivity.class);
		intent.putExtra("checkText", ((UMLabel) v).getText());
		startActivity(intent);

return false;
}
});
rounddiv3.addView(label15);

return rounddiv3;
}
public View getRounddiv4View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
rounddiv4 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_ROUNDDIV4
,"padding-right","15"
,"height","44"
,"layout-type","linear"
,"width","fill"
,"valign","center"
,"background-image","at44_mid.png"
);
label5 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL5
,"halign","left"
,"height","20"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","100"
,"margin-left","15"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label5,"content","#{res.task_completionStandard}"));
rounddiv4.addView(label5);
label6 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL6
,"bindfield","completestandard"
,"halign","right"
,"height","fill"
,"weight","1"
,"onlongclick","contentdetail"
,"color","#8e8e93"
,"layout-type","linear"
,"font-size","16"
,"width","0"
,"font-family","default"
,"valign","center"
);
UMTextBinder label6_binder = new UMTextBinder((IUMContextAccessor)context);
label6_binder.setBindInfo(new BindInfo("completestandard"));
label6_binder.setControl(label6);
binderGroup.addBinderToGroup(ID_LABEL6, label6_binder);
label6.setOnLongClickListener(new View.OnLongClickListener() {
  @Override
  public boolean onLongClick(View v) {
	  Intent intent = new Intent(
				Task_personaltask_detailActivity.this,
				FillScreenActivity.class);
		intent.putExtra("checkText", ((UMLabel) v).getText());
		startActivity(intent);

return false;
}
});
rounddiv4.addView(label6);

return rounddiv4;
}
public View getRounddiv5View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
rounddiv5 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_ROUNDDIV5
,"padding-right","15"
,"height","44"
,"layout-type","linear"
,"width","fill"
,"valign","center"
,"background-image","at44_mid.png"
);
label7 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL7
,"halign","left"
,"height","20"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","100"
,"margin-left","15"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label7,"content","#{res.task_priority}"));
rounddiv5.addView(label7);
label16 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL16
,"bindfield","priority"
,"halign","right"
,"height","fill"
,"weight","1"
,"color","#8e8e93"
,"layout-type","linear"
,"font-size","16"
,"width","0"
,"font-family","default"
,"valign","center"
);
UMTextBinder label16_binder = new UMTextBinder((IUMContextAccessor)context);
label16_binder.setBindInfo(new BindInfo("priority"));
label16_binder.setControl(label16);
binderGroup.addBinderToGroup(ID_LABEL16, label16_binder);
rounddiv5.addView(label16);

return rounddiv5;
}
public View getRounddiv6View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
rounddiv6 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_ROUNDDIV6
,"padding-right","15"
,"height","44"
,"layout-type","linear"
,"width","fill"
,"valign","center"
,"background-image","at44_mid.png"
);
label8 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL8
,"halign","left"
,"height","20"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","100"
,"margin-left","15"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label8,"content","#{res.task_taskStatus}"));
rounddiv6.addView(label8);
label17 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL17
,"bindfield","taskstate"
,"halign","right"
,"height","fill"
,"weight","1"
,"color","#8e8e93"
,"layout-type","linear"
,"font-size","16"
,"width","0"
,"font-family","default"
,"valign","center"
);
UMTextBinder label17_binder = new UMTextBinder((IUMContextAccessor)context);
label17_binder.setBindInfo(new BindInfo("taskstate"));
label17_binder.setControl(label17);
binderGroup.addBinderToGroup(ID_LABEL17, label17_binder);
rounddiv6.addView(label17);

return rounddiv6;
}
public View getRounddiv7View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
rounddiv7 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_ROUNDDIV7
,"padding-right","15"
,"height","44"
,"layout-type","linear"
,"width","fill"
,"valign","center"
,"background-image","at44_mid.png"
);
label9 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL9
,"halign","left"
,"height","20"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","100"
,"margin-left","15"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label9,"content","#{res.task_comments}"));
rounddiv7.addView(label9);
label18 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL18
,"bindfield","remark"
,"halign","right"
,"height","fill"
,"weight","1"
,"color","#8e8e93"
,"layout-type","linear"
,"font-size","16"
,"width","0"
,"font-family","default"
,"valign","center"
);
UMTextBinder label18_binder = new UMTextBinder((IUMContextAccessor)context);
label18_binder.setBindInfo(new BindInfo("remark"));
label18_binder.setControl(label18);
binderGroup.addBinderToGroup(ID_LABEL18, label18_binder);
label18.setOnLongClickListener(new View.OnLongClickListener() {
	
	@Override
	public boolean onLongClick(View v) {
		Intent intent = new Intent(
				Task_personaltask_detailActivity.this,
				FillScreenActivity.class);
		intent.putExtra("checkText", ((UMLabel) v).getText());
		startActivity(intent);
		return false;
	}
});
rounddiv7.addView(label18);

return rounddiv7;
}
public View getRounddiv9View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
rounddiv9 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_ROUNDDIV9
,"padding-right","15"
,"height","44"
,"layout-type","linear"
,"width","fill"
,"onclick","getattchment"
,"valign","center"
,"background-image","at44_down.png"
);
rounddiv9.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Task_personaltask_detailActivity.this);
    actionGetattchment(rounddiv9,args);

}
});
label29 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL29
,"halign","left"
,"height","20"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","100"
,"margin-left","15"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label29,"content","#{res.task_attachment}"));
rounddiv9.addView(label29);
label28 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL28
,"padding-right","5"
,"bindfield","count"
,"halign","right"
,"height","26"
,"weight","1"
,"color","#c8c7cc"
,"layout-type","linear"
,"font-size","16"
,"width","0"
,"font-family","default"
,"valign","center"
);
UMTextBinder label28_binder = new UMTextBinder((IUMContextAccessor)context);
label28_binder.setBindInfo(new BindInfo("count"));
label28_binder.setControl(label28);
binderGroup.addBinderToGroup(ID_LABEL28, label28_binder);
rounddiv9.addView(label28);
button12 = (UMButton)ThirdControl.createControl(new UMButton(context),ID_BUTTON12
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
rounddiv9.addView(button12);

return rounddiv9;
}
public View getPanel11View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel11 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL11
,"halign","center"
,"height","wrap"
,"layout-type","linear"
,"background","#efeff4"
,"width","fill"
);
View rounddiv0 = (View) getRounddiv0View((UMActivity)context,binderGroup,configure);
panel11.addView(rounddiv0);
View rounddiv1 = (View) getRounddiv1View((UMActivity)context,binderGroup,configure);
panel11.addView(rounddiv1);
View rounddiv2 = (View) getRounddiv2View((UMActivity)context,binderGroup,configure);
panel11.addView(rounddiv2);
View rounddiv3 = (View) getRounddiv3View((UMActivity)context,binderGroup,configure);
panel11.addView(rounddiv3);
View rounddiv4 = (View) getRounddiv4View((UMActivity)context,binderGroup,configure);
panel11.addView(rounddiv4);
View rounddiv5 = (View) getRounddiv5View((UMActivity)context,binderGroup,configure);
panel11.addView(rounddiv5);
View rounddiv6 = (View) getRounddiv6View((UMActivity)context,binderGroup,configure);
panel11.addView(rounddiv6);
View rounddiv7 = (View) getRounddiv7View((UMActivity)context,binderGroup,configure);
panel11.addView(rounddiv7);
View rounddiv9 = (View) getRounddiv9View((UMActivity)context,binderGroup,configure);
panel11.addView(rounddiv9);

return panel11;
}
public View getScrollview_panel11View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
Scrollview_panel11 = (UMScrollView)ThirdControl.createControl(new UMScrollView(context),ID_SCROLLVIEW_PANEL11
,"height","fill"
,"layout-type","linear"
,"width","fill"
,"hscrollenabled","disabled"
);
View panel11 = (View) getPanel11View((UMActivity)context,binderGroup,configure);
Scrollview_panel11.addView(panel11);

return Scrollview_panel11;
}
public View getPanel0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel0 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL0
,"halign","center"
,"height","0"
,"weight","1"
,"onload","detailOnload"
,"layout-type","linear"
,"background","#efeff4"
,"width","fill"
,"margin-top","15"
);
View Scrollview_panel11 = (View) getScrollview_panel11View((UMActivity)context,binderGroup,configure);
panel0.addView(Scrollview_panel11);

return panel0;
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
button2 = (UMButton)ThirdControl.createControl(new UMButton(context),ID_BUTTON2
,"halign","left"
,"weight","1"
,"pressed-image","button_touch"
,"width","0"
,"background-image-dis","button"
,"height","30"
,"color","#e50011"
,"layout-type","linear"
,"font-size","17"
,"onclick","deletePsnTask"
,"font-family","default"
,"valign","center"
,"background-image","button"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,button2,"value","#{res.task_delete}"));
button2.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Task_personaltask_detailActivity.this);
    actionDeletePsnTask(button2,args);

}
});
toolbar0.addView(button2);
button3 = (UMButton)ThirdControl.createControl(new UMButton(context),ID_BUTTON3
,"halign","center"
,"weight","1"
,"pressed-image","button_touch"
,"width","0"
,"background-image-dis","button"
,"height","30"
,"color","#e50011"
,"layout-type","linear"
,"font-size","17"
,"onclick","addschedulecheck"
,"font-family","default"
,"valign","center"
,"background-image","button"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,button3,"value","#{res.task_addScheduler}"));
button3.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Task_personaltask_detailActivity.this);
    actionAddschedulecheck(button3,args);

}
});
toolbar0.addView(button3);
button4 = (UMButton)ThirdControl.createControl(new UMButton(context),ID_BUTTON4
,"halign","right"
,"weight","1"
,"pressed-image","button_touch"
,"width","0"
,"background-image-dis","button"
,"height","30"
,"color","#e50011"
,"layout-type","linear"
,"font-size","17"
,"onclick","completetask"
,"font-family","default"
,"valign","center"
,"background-image","button"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,button4,"value","#{res.task_completeTask}"));
button4.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Task_personaltask_detailActivity.this);
    actionCompletetask(button4,args);

}
});
toolbar0.addView(button4);

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
View panel0 = (View) getPanel0View((UMActivity)context,binderGroup,configure);
viewPage0.addView(panel0);
View toolbar0 = (View) getToolbar0View((UMActivity)context,binderGroup,configure);
viewPage0.addView(toolbar0);

return viewPage0;
}
public UMWindow getCurrentWindow(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
personaltask_detail = (UMWindow)ThirdControl.createControl(new UMWindow(context),ID_PERSONALTASK_DETAIL
,"halign","center"
,"height","fill"
,"layout","vbox"
,"width","fill"
,"context","personaltask"
,"controller","personaltask_detailController"
,"namespace","nc.bs.oa.oama.ecm"
);
View viewPage0 = (View) getViewPage0View((UMActivity)context,binderGroup,configure);
personaltask_detail.addView(viewPage0);

return (UMWindow)personaltask_detail;
}

	
	public void actionBeforeEdit(View control, UMEventArgs args) {
    String actionid = "beforeEdit";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "beforeEdit",UMActivity.getViewId(control),args);
}
public void actionAddschedule(View control, UMEventArgs args) {
    String actionid = "addschedule";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "addschedule",UMActivity.getViewId(control),args);
}
public void actionUMonUnload(View control, UMEventArgs args) {
    String actionid = "UMonUnload";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "UMonUnload",UMActivity.getViewId(control),args);
}
public void actionDeletePsnTask(View control, UMEventArgs args) {
    String actionid = "deletePsnTask";
    args.put("message","#{res.task_deletetaskpsn}");
    args.put("title","#{res.task_delete}");
    args.put("okaction","deltask");
    args.put("okbuttontitle","#{res.task_ok}");
    args.put("style","ok-cancel");
  this.dataCollect();
    args.put("containerName","");
    args.put("cancelbuttontitle","#{res.task_cancel}");
  ActionProcessor.exec(this, actionid, args);
UMView.openDialog(args);
}
public void actionUMonComplete(View control, UMEventArgs args) {
    String actionid = "UMonComplete";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "UMonComplete",UMActivity.getViewId(control),args);
}
public void actionDeltask(View control, UMEventArgs args) {
    String actionid = "deltask";
    args.put("error","delError");
    args.put("viewid","nc.bs.oa.oama.oatask.ListviewController");
    args.put("taskid","#{taskid}");
  this.dataCollect();
    args.put("action","delTask");
    args.put("callback","returntip");
    args.put("autoDataBinding","true");
    args.put("contextmapping","result");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMService.callAction(args);
}
public void actionDelError(View control, UMEventArgs args) {
    String actionid = "delError";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "delError",UMActivity.getViewId(control),args);
}
public void actionUMonDataBinding(View control, UMEventArgs args) {
    String actionid = "UMonDataBinding";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "UMonDataBinding",UMActivity.getViewId(control),args);
}
public void actionEditpersonaltask(View control, UMEventArgs args) {
    String actionid = "editpersonaltask";
    args.put("viewid","nc.bs.oa.oama.ecm.Task_personaltask_edit");
  this.dataCollect();
    args.put("iskeep","false");
    args.put("dada","#{CONTEXT}");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.open(args);
}
public void actionGetattchment(View control, UMEventArgs args) {
    String actionid = "getattchment";
    args.put("viewid","nc.bs.oa.oama.ecm.Task_file_detail");
    args.put("taskid","#{taskid}");
  this.dataCollect();
    args.put("iskeep","true");
    args.put("type","1");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.open(args);
}
public void actionReturnforlist(View control, UMEventArgs args) {
    String actionid = "returnforlist";
    args.put("viewid","nc.bs.oa.oama.ecm.Task_mainviewpsn");
    args.put("animation-direction","left");
  this.dataCollect();
    args.put("iskeep","false");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.open(args);
}
public void actionPoptip(View control, UMEventArgs args) {
    String actionid = "poptip";
    args.put("message","#{res.task_dosuccess}");
    args.put("title","提示");
    args.put("okbuttontitle","#{res.task_ok}");
    args.put("style","ok");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.openDialog(args);
}
public void actionCompletetask(View control, UMEventArgs args) {
    String actionid = "completetask";
    args.put("error","completeError");
    args.put("viewid","nc.bs.oa.oama.oatask.ListviewController");
  this.dataCollect();
    args.put("action","completeTask");
    args.put("callback","completetasktip");
    args.put("autoDataBinding","true");
    args.put("params","{\"taskid\":\"#{taskid}\"}");
    args.put("contextmapping","result");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMService.callAction(args);
}
public void actionReturntip(View control, UMEventArgs args) {
    String actionid = "returntip";
    args.put("message","#{res.task_dosuccess}");
    args.put("title","提示");
    args.put("okbuttontitle","#{res.task_ok}");
    args.put("okaction","poptipforall");
    args.put("style","ok");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.openDialog(args);
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
public void actionContentdetail(View control, UMEventArgs args) {
    String actionid = "contentdetail";
    args.put("viewid","detail");
    args.put("iskeep","true");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.open(args);
}
public void actionAddschedulecheck(View control, UMEventArgs args) {
    String actionid = "addschedulecheck";
    args.put("viewid","nc.bs.oa.oama.oatask.ListviewController");
  this.dataCollect();
    args.put("action","addScheduleCheck");
    args.put("callback","checkscheduletip");
    args.put("autoDataBinding","true");
    args.put("params","{\"taskid\":\"#{taskid}\"}");
    args.put("contextmapping","result");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMService.callAction(args);
}
public void actionCheckscheduletip(View control, UMEventArgs args) {
    String actionid = "checkscheduletip";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "checkscheduletip",UMActivity.getViewId(control),args);
}
public void actionDetailOnload(View control, UMEventArgs args) {
    String actionid = "detailOnload";
  this.dataCollect();
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "detailOnload",UMActivity.getViewId(control),args);
}
public void actionPoptipforall(View control, UMEventArgs args) {
    String actionid = "poptipforall";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "poptipforall",UMActivity.getViewId(control),args);
}
public void actionCompletetasktip(View control, UMEventArgs args) {
    String actionid = "completetasktip";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "completetasktip",UMActivity.getViewId(control),args);
}
public void actionCompleteError(View control, UMEventArgs args) {
    String actionid = "completeError";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "completeError",UMActivity.getViewId(control),args);
}


}
