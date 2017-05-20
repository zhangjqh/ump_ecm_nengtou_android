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

public abstract class Scdu_repeatrullrefActivity extends UMWindowActivity {

	protected UMWindow repeatrullref = null;
protected XVerticalLayout viewPage0 = null;
protected XHorizontalLayout navigatorbar0 = null;
protected UMButton button1 = null;
protected UMLabel label0 = null;
protected UMButton button0 = null;
protected XVerticalLayout panel0 = null;
protected XHorizontalLayout panel1 = null;
protected UMLabel label1 = null;
protected UMLabel label2 = null;
protected UMSwitch switch0 = null;
protected XHorizontalLayout panel2 = null;
protected UMLabel label3 = null;
protected UMToggleButtonGroup togglebuttongroup0 = null;
protected UMToggleButton togglebutton0 = null;
protected UMToggleButton togglebutton1 = null;
protected UMToggleButton togglebutton2 = null;
protected UMToggleButton togglebutton3 = null;
protected XHorizontalLayout panel3 = null;
protected UMLabel label4 = null;
protected UMToggleButtonGroup togglebuttongroup1 = null;
protected UMToggleButton togglebutton4 = null;
protected UMToggleButton togglebutton5 = null;
protected UMToggleButton togglebutton6 = null;
protected UMToggleButton togglebutton7 = null;
protected XHorizontalLayout panel4 = null;
protected UMLabel label5 = null;
protected UMNumberEdit number1 = null;
protected UMLabel label13 = null;
protected XHorizontalLayout panel5 = null;
protected UMLabel label6 = null;
protected UMLabel label15 = null;
protected UMImage image1 = null;
protected XHorizontalLayout panel6 = null;
protected UMLabel label7 = null;
protected UMNumberEdit number3 = null;
protected UMLabel label16 = null;
protected XHorizontalLayout panel7 = null;
protected UMLabel label8 = null;
protected UMLabel label14 = null;
protected UMImage image0 = null;
protected XHorizontalLayout panel12 = null;
protected UMLabel label17 = null;
protected UMLabel label18 = null;
protected UMImage image2 = null;
protected XHorizontalLayout panel8 = null;
protected UMLabel label9 = null;
protected UMNumberEdit number2 = null;
protected XHorizontalLayout panel9 = null;
protected UMLabel label10 = null;
protected UMToggleButtonGroup togglebuttongroup2 = null;
protected UMToggleButton togglebutton8 = null;
protected UMToggleButton togglebutton9 = null;
protected UMToggleButton togglebutton10 = null;
protected XHorizontalLayout panel10 = null;
protected UMLabel label11 = null;
protected UMNumberEdit number0 = null;
protected XHorizontalLayout panel11 = null;
protected UMLabel label12 = null;
protected UMDateEdit dateinput0 = null;

	
	protected final static int ID_REPEATRULLREF = 249462859;
protected final static int ID_VIEWPAGE0 = 1265602533;
protected final static int ID_NAVIGATORBAR0 = 1474473458;
protected final static int ID_BUTTON1 = 506512345;
protected final static int ID_LABEL0 = 1076157061;
protected final static int ID_BUTTON0 = 827512993;
protected final static int ID_PANEL0 = 962264075;
protected final static int ID_PANEL1 = 273925425;
protected final static int ID_LABEL1 = 1685748955;
protected final static int ID_LABEL2 = 809850811;
protected final static int ID_SWITCH0 = 1045469122;
protected final static int ID_PANEL2 = 394120536;
protected final static int ID_LABEL3 = 1165766928;
protected final static int ID_TOGGLEBUTTONGROUP0 = 1395146934;
protected final static int ID_TOGGLEBUTTON0 = 241743235;
protected final static int ID_TOGGLEBUTTON1 = 1533822537;
protected final static int ID_TOGGLEBUTTON2 = 435022378;
protected final static int ID_TOGGLEBUTTON3 = 2066592631;
protected final static int ID_PANEL3 = 183580758;
protected final static int ID_LABEL4 = 674598309;
protected final static int ID_TOGGLEBUTTONGROUP1 = 1554935584;
protected final static int ID_TOGGLEBUTTON4 = 981643131;
protected final static int ID_TOGGLEBUTTON5 = 983134974;
protected final static int ID_TOGGLEBUTTON6 = 2127842482;
protected final static int ID_TOGGLEBUTTON7 = 1485106295;
protected final static int ID_PANEL4 = 1516002871;
protected final static int ID_LABEL5 = 603414203;
protected final static int ID_NUMBER1 = 781109799;
protected final static int ID_LABEL13 = 850743849;
protected final static int ID_PANEL5 = 1724080777;
protected final static int ID_LABEL6 = 706101683;
protected final static int ID_LABEL15 = 606482432;
protected final static int ID_IMAGE1 = 2008436681;
protected final static int ID_PANEL6 = 1174180499;
protected final static int ID_LABEL7 = 378701566;
protected final static int ID_NUMBER3 = 864336820;
protected final static int ID_LABEL16 = 2125435565;
protected final static int ID_PANEL7 = 1690010390;
protected final static int ID_LABEL8 = 291717850;
protected final static int ID_LABEL14 = 1003806279;
protected final static int ID_IMAGE0 = 1249311596;
protected final static int ID_PANEL12 = 1946884319;
protected final static int ID_LABEL17 = 854467858;
protected final static int ID_LABEL18 = 87684734;
protected final static int ID_IMAGE2 = 1906732918;
protected final static int ID_PANEL8 = 1309202004;
protected final static int ID_LABEL9 = 1808599677;
protected final static int ID_NUMBER2 = 741731040;
protected final static int ID_PANEL9 = 72695364;
protected final static int ID_LABEL10 = 502004912;
protected final static int ID_TOGGLEBUTTONGROUP2 = 543066526;
protected final static int ID_TOGGLEBUTTON8 = 1542574489;
protected final static int ID_TOGGLEBUTTON9 = 2074885807;
protected final static int ID_TOGGLEBUTTON10 = 2030669098;
protected final static int ID_PANEL10 = 2124888523;
protected final static int ID_LABEL11 = 1053284315;
protected final static int ID_NUMBER0 = 938172470;
protected final static int ID_PANEL11 = 602340315;
protected final static int ID_LABEL12 = 1734667905;
protected final static int ID_DATEINPUT0 = 1398672542;

	
	
	@Override
	public String getControllerName() {
		return "repeatrullrefController";
	}
	
	@Override
	public String getContextName() {
		return "eventDetail";
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
		  idmap.put("repeatrullref",ID_REPEATRULLREF);
  idmap.put("viewPage0",ID_VIEWPAGE0);
  idmap.put("navigatorbar0",ID_NAVIGATORBAR0);
  idmap.put("button1",ID_BUTTON1);
  idmap.put("label0",ID_LABEL0);
  idmap.put("button0",ID_BUTTON0);
  idmap.put("panel0",ID_PANEL0);
  idmap.put("panel1",ID_PANEL1);
  idmap.put("label1",ID_LABEL1);
  idmap.put("label2",ID_LABEL2);
  idmap.put("switch0",ID_SWITCH0);
  idmap.put("panel2",ID_PANEL2);
  idmap.put("label3",ID_LABEL3);
  idmap.put("togglebuttongroup0",ID_TOGGLEBUTTONGROUP0);
  idmap.put("togglebutton0",ID_TOGGLEBUTTON0);
  idmap.put("togglebutton1",ID_TOGGLEBUTTON1);
  idmap.put("togglebutton2",ID_TOGGLEBUTTON2);
  idmap.put("togglebutton3",ID_TOGGLEBUTTON3);
  idmap.put("panel3",ID_PANEL3);
  idmap.put("label4",ID_LABEL4);
  idmap.put("togglebuttongroup1",ID_TOGGLEBUTTONGROUP1);
  idmap.put("togglebutton4",ID_TOGGLEBUTTON4);
  idmap.put("togglebutton5",ID_TOGGLEBUTTON5);
  idmap.put("togglebutton6",ID_TOGGLEBUTTON6);
  idmap.put("togglebutton7",ID_TOGGLEBUTTON7);
  idmap.put("panel4",ID_PANEL4);
  idmap.put("label5",ID_LABEL5);
  idmap.put("number1",ID_NUMBER1);
  idmap.put("label13",ID_LABEL13);
  idmap.put("panel5",ID_PANEL5);
  idmap.put("label6",ID_LABEL6);
  idmap.put("label15",ID_LABEL15);
  idmap.put("image1",ID_IMAGE1);
  idmap.put("panel6",ID_PANEL6);
  idmap.put("label7",ID_LABEL7);
  idmap.put("number3",ID_NUMBER3);
  idmap.put("label16",ID_LABEL16);
  idmap.put("panel7",ID_PANEL7);
  idmap.put("label8",ID_LABEL8);
  idmap.put("label14",ID_LABEL14);
  idmap.put("image0",ID_IMAGE0);
  idmap.put("panel12",ID_PANEL12);
  idmap.put("label17",ID_LABEL17);
  idmap.put("label18",ID_LABEL18);
  idmap.put("image2",ID_IMAGE2);
  idmap.put("panel8",ID_PANEL8);
  idmap.put("label9",ID_LABEL9);
  idmap.put("number2",ID_NUMBER2);
  idmap.put("panel9",ID_PANEL9);
  idmap.put("label10",ID_LABEL10);
  idmap.put("togglebuttongroup2",ID_TOGGLEBUTTONGROUP2);
  idmap.put("togglebutton8",ID_TOGGLEBUTTON8);
  idmap.put("togglebutton9",ID_TOGGLEBUTTON9);
  idmap.put("togglebutton10",ID_TOGGLEBUTTON10);
  idmap.put("panel10",ID_PANEL10);
  idmap.put("label11",ID_LABEL11);
  idmap.put("number0",ID_NUMBER0);
  idmap.put("panel11",ID_PANEL11);
  idmap.put("label12",ID_LABEL12);
  idmap.put("dateinput0",ID_DATEINPUT0);

	}
	
	public void onLoad() {
		ULog.logLC("onLoad", this);
		if(currentPage!=null) {
			currentPage.onLoad();
		}
	
		{ //viewPage0 - load
    UMEventArgs args = new UMEventArgs(Scdu_repeatrullrefActivity.this);
    actionLoad(viewPage0,args);

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
,"height","44"
,"layout-type","linear"
,"background","#FFFFFF"
,"width","fill"
,"valign","center"
,"background-image","nav.png"
);
button1 = (UMButton)ThirdControl.createControl(new UMButton(context),ID_BUTTON1
,"halign","center"
,"pressed-image","btn_back_touch"
,"width","64"
,"background-image-dis","button"
,"font-pressed-color","#f2adb2"
,"height","44"
,"color","#e50011"
,"layout-type","linear"
,"font-size","17"
,"onclick","onCancel"
,"font-family","default"
,"valign","center"
,"background-image","btn_back"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,button1,"value","#{res.scdu_oascheduler_0001}"));
button1.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Scdu_repeatrullrefActivity.this);
    actionOnCancel(button1,args);

}
});
navigatorbar0.addView(button1);
label0 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL0
,"halign","center"
,"height","fill"
,"weight","1"
,"color","#000000"
,"layout-type","linear"
,"font-size","17"
,"width","0"
,"font-family","Serif"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label0,"content","#{res.scdu_oascheduler_0012}"));
navigatorbar0.addView(label0);
button0 = (UMButton)ThirdControl.createControl(new UMButton(context),ID_BUTTON0
,"halign","right"
,"width","64"
,"font-pressed-color","#f2adb2"
,"height","fill"
,"color","#e50011"
,"font-size","17"
,"layout-type","linear"
,"onclick","returnResult"
,"font-family","Serif"
,"valign","center"
,"background-image","button.png"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,button0,"value","#{res.scdu_oascheduler_0038}"));
button0.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Scdu_repeatrullrefActivity.this);
    actionReturnResult(button0,args);

}
});
navigatorbar0.addView(button0);

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
,"background-image","oasche_44_one.png"
);
label1 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL1
,"margin-right","15"
,"halign","left"
,"height","fill"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","100"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label1,"content","#{res.scdu_oascheduler_0040}"));
panel1.addView(label1);
label2 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL2
,"halign","center"
,"height","fill"
,"weight","1"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","0"
,"font-family","default"
,"valign","center"
);
panel1.addView(label2);
switch0 = (UMSwitch)ThirdControl.createControl(new UMSwitch(context),ID_SWITCH0
,"bindfield","isrepeateventswitch"
,"height","32"
,"pressed-image","slideswitch"
,"layout-type","linear"
,"width","51"
,"value","off"
,"background-image-dis","slideswitch"
,"background-image","slideswitch"
,"onchange","isRepeatChanged"
);
UMSwitchBinder switch0_binder = new UMSwitchBinder((IUMContextAccessor)context);
switch0_binder.setBindInfo(new BindInfo("isrepeateventswitch"));
switch0_binder.setControl(switch0);
binderGroup.addBinderToGroup(ID_SWITCH0, switch0_binder);
switch0.setEvent("onchange", new OnCursorEventListener(configure) {
  @Override
  public void onEvent(View v, UMEventArgs parent) {
    UMEventArgs args = new UMEventArgs(Scdu_repeatrullrefActivity.this);
    args.put(parent);
    actionIsRepeatChanged(switch0,args);

}
});
panel1.addView(switch0);

return panel1;
}
public View getTogglebuttongroup0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
togglebuttongroup0 = (UMToggleButtonGroup)ThirdControl.createControl(new UMToggleButtonGroup(context),ID_TOGGLEBUTTONGROUP0
,"bindfield","repeat"
,"weight","1"
,"height","30"
,"layout","hbox"
,"width","0"
,"value","buttongroup"
,"valign","center"
);
UMToggleButtonGroupBinder togglebuttongroup0_binder = new UMToggleButtonGroupBinder((IUMContextAccessor)context);
togglebuttongroup0_binder.setBindInfo(new BindInfo("repeat"));
togglebuttongroup0_binder.setControl(togglebuttongroup0);
binderGroup.addBinderToGroup(ID_TOGGLEBUTTONGROUP0, togglebuttongroup0_binder);
togglebutton0 = (UMToggleButton)ThirdControl.createControl(new UMToggleButton(context),ID_TOGGLEBUTTON0
,"halign","center"
,"weight","1"
,"background-image-off","label_4_left"
,"width","0"
,"font-pressed-color","#f8f8f8"
,"type","button"
,"background-image-on","label_4_left_touch"
,"height","30.0"
,"color","#e50011"
,"layout-type","hbox"
,"font-size","14"
,"value","day"
,"onclick","repeatDay"
,"font-family","default"
,"valign","center"
,"checked","true"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,togglebutton0,"textOff","#{res.scdu_oascheduler_0042}"));
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,togglebutton0,"textOn","#{res.scdu_oascheduler_0042}"));
togglebutton0.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Scdu_repeatrullrefActivity.this);
    actionRepeatDay(togglebutton0,args);

}
});
togglebuttongroup0.addView(togglebutton0);
togglebutton1 = (UMToggleButton)ThirdControl.createControl(new UMToggleButton(context),ID_TOGGLEBUTTON1
,"halign","center"
,"weight","1"
,"background-image-off","label_4_middle"
,"width","0"
,"font-pressed-color","#f8f8f8"
,"type","button"
,"background-image-on","label_4_middle_touch"
,"height","30.0"
,"color","#e50011"
,"layout-type","hbox"
,"font-size","14"
,"value","week"
,"onclick","repeatWeek"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,togglebutton1,"textOff","#{res.scdu_oascheduler_0043}"));
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,togglebutton1,"textOn","#{res.scdu_oascheduler_0043}"));
togglebutton1.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Scdu_repeatrullrefActivity.this);
    actionRepeatWeek(togglebutton1,args);

}
});
togglebuttongroup0.addView(togglebutton1);
togglebutton2 = (UMToggleButton)ThirdControl.createControl(new UMToggleButton(context),ID_TOGGLEBUTTON2
,"halign","center"
,"weight","1"
,"background-image-off","label_4_middle"
,"width","0"
,"font-pressed-color","#f8f8f8"
,"type","button"
,"background-image-on","label_4_middle_touch"
,"height","30.0"
,"color","#e50011"
,"layout-type","hbox"
,"font-size","14"
,"value","month"
,"onclick","repeatMonth"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,togglebutton2,"textOff","#{res.scdu_oascheduler_0044}"));
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,togglebutton2,"textOn","#{res.scdu_oascheduler_0044}"));
togglebutton2.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Scdu_repeatrullrefActivity.this);
    actionRepeatMonth(togglebutton2,args);

}
});
togglebuttongroup0.addView(togglebutton2);
togglebutton3 = (UMToggleButton)ThirdControl.createControl(new UMToggleButton(context),ID_TOGGLEBUTTON3
,"halign","center"
,"weight","1"
,"background-image-off","label_4_right"
,"width","0"
,"font-pressed-color","#f8f8f8"
,"type","button"
,"background-image-on","label_4_right_touch"
,"height","30.0"
,"color","#e50011"
,"layout-type","hbox"
,"font-size","14"
,"value","year"
,"onclick","repeatYear"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,togglebutton3,"textOff","#{res.scdu_oascheduler_0045}"));
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,togglebutton3,"textOn","#{res.scdu_oascheduler_0045}"));
togglebutton3.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Scdu_repeatrullrefActivity.this);
    actionRepeatYear(togglebutton3,args);

}
});
togglebuttongroup0.addView(togglebutton3);

return togglebuttongroup0;
}
public View getPanel2View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel2 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL2
,"padding-right","15"
,"padding-left","15"
,"height","44"
,"layout-type","linear"
,"width","fill"
,"margin-top","15"
,"valign","center"
,"background-image","oasche_44_top.png"
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
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label3,"content","#{res.scdu_oascheduler_0041}"));
panel2.addView(label3);
View togglebuttongroup0 = (View) getTogglebuttongroup0View((UMActivity)context,binderGroup,configure);
panel2.addView(togglebuttongroup0);

return panel2;
}
public View getTogglebuttongroup1View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
togglebuttongroup1 = (UMToggleButtonGroup)ThirdControl.createControl(new UMToggleButtonGroup(context),ID_TOGGLEBUTTONGROUP1
,"bindfield","repeattype"
,"weight","1"
,"height","30"
,"layout","hbox"
,"width","0"
,"value","buttongroup"
,"valign","center"
);
UMToggleButtonGroupBinder togglebuttongroup1_binder = new UMToggleButtonGroupBinder((IUMContextAccessor)context);
togglebuttongroup1_binder.setBindInfo(new BindInfo("repeattype"));
togglebuttongroup1_binder.setControl(togglebuttongroup1);
binderGroup.addBinderToGroup(ID_TOGGLEBUTTONGROUP1, togglebuttongroup1_binder);
togglebutton4 = (UMToggleButton)ThirdControl.createControl(new UMToggleButton(context),ID_TOGGLEBUTTON4
,"halign","center"
,"weight","1"
,"background-image-off","label_2_left.png"
,"width","0"
,"font-pressed-color","#f8f8f8"
,"type","button"
,"background-image-on","label_2_left_touch.png"
,"height","30.0"
,"color","#e50011"
,"layout-type","hbox"
,"font-size","14"
,"value","day"
,"onclick","repeattypeDay"
,"font-family","default"
,"valign","center"
,"checked","true"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,togglebutton4,"textOff","#{res.scdu_oascheduler_0047}"));
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,togglebutton4,"textOn","#{res.scdu_oascheduler_0047}"));
togglebutton4.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Scdu_repeatrullrefActivity.this);
    actionRepeattypeDay(togglebutton4,args);

}
});
togglebuttongroup1.addView(togglebutton4);
togglebutton5 = (UMToggleButton)ThirdControl.createControl(new UMToggleButton(context),ID_TOGGLEBUTTON5
,"halign","center"
,"weight","1"
,"background-image-off","label_2_right.png"
,"width","0"
,"font-pressed-color","#f8f8f8"
,"type","button"
,"background-image-on","label_2_right_touch.png"
,"height","30.0"
,"color","#e50011"
,"layout-type","hbox"
,"font-size","14"
,"value","weekday"
,"onclick","repeattypeWeekday"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,togglebutton5,"textOff","#{res.scdu_oascheduler_0048}"));
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,togglebutton5,"textOn","#{res.scdu_oascheduler_0048}"));
togglebutton5.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Scdu_repeatrullrefActivity.this);
    actionRepeattypeWeekday(togglebutton5,args);

}
});
togglebuttongroup1.addView(togglebutton5);
togglebutton6 = (UMToggleButton)ThirdControl.createControl(new UMToggleButton(context),ID_TOGGLEBUTTON6
,"halign","center"
,"weight","1"
,"background-image-off","label_2_left.png"
,"width","0"
,"font-pressed-color","#f8f8f8"
,"type","button"
,"background-image-on","label_2_left_touch.png"
,"height","30.0"
,"color","#e50011"
,"layout-type","hbox"
,"font-size","14"
,"value","date"
,"onclick","repeattypeDate"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,togglebutton6,"textOff","#{res.scdu_oascheduler_0049}"));
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,togglebutton6,"textOn","#{res.scdu_oascheduler_0049}"));
togglebutton6.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Scdu_repeatrullrefActivity.this);
    actionRepeattypeDate(togglebutton6,args);

}
});
togglebuttongroup1.addView(togglebutton6);
togglebutton7 = (UMToggleButton)ThirdControl.createControl(new UMToggleButton(context),ID_TOGGLEBUTTON7
,"halign","center"
,"weight","1"
,"background-image-off","label_4_right"
,"width","0"
,"font-pressed-color","#f8f8f8"
,"type","button"
,"background-image-on","label_4_right_touch"
,"height","30.0"
,"color","#e50011"
,"layout-type","hbox"
,"font-size","14"
,"value","week"
,"onclick","repeattypeWeek"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,togglebutton7,"textOff","#{res.scdu_oascheduler_0043}"));
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,togglebutton7,"textOn","#{res.scdu_oascheduler_0043}"));
togglebutton7.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Scdu_repeatrullrefActivity.this);
    actionRepeattypeWeek(togglebutton7,args);

}
});
togglebuttongroup1.addView(togglebutton7);

return togglebuttongroup1;
}
public View getPanel3View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel3 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL3
,"padding-left","15"
,"padding-right","15"
,"height","44"
,"layout-type","linear"
,"width","fill"
,"valign","center"
,"background-image","oasche_44_mid.png"
);
label4 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL4
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
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label4,"content","#{res.scdu_oascheduler_0046}"));
panel3.addView(label4);
View togglebuttongroup1 = (View) getTogglebuttongroup1View((UMActivity)context,binderGroup,configure);
panel3.addView(togglebuttongroup1);

return panel3;
}
public View getPanel4View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel4 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL4
,"padding-left","15"
,"padding-right","15"
,"height","44"
,"layout-type","linear"
,"width","fill"
,"valign","center"
,"background-image","oasche_44_mid.png"
);
label5 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL5
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
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label5,"content","#{res.scdu_oascheduler_0050}"));
panel4.addView(label5);
number1 = (UMNumberEdit)ThirdControl.createControl(new UMNumberEdit(context),ID_NUMBER1
,"min","1.0"
,"bindfield","repeatcount"
,"padding-right","10"
,"padding-left","10"
,"halign","RIGHT"
,"max","9.99999999E8"
,"precision","0"
,"weight","1"
,"placeholder","1"
,"width","0"
,"height","40"
,"color","#167ef8"
,"layout-type","linear"
,"background","#ffffff"
,"font-size","17"
,"font-family","default"
,"roundtype","value"
);
UMTextBinder number1_binder = new UMTextBinder((IUMContextAccessor)context);
number1_binder.setBindInfo(new BindInfo("repeatcount"));
number1_binder.setControl(number1);
binderGroup.addBinderToGroup(ID_NUMBER1, number1_binder);
panel4.addView(number1);
label13 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL13
,"halign","center"
,"height","fill"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","30"
,"font-family","default"
,"valign","center"
);
panel4.addView(label13);

return panel4;
}
public View getPanel5View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel5 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL5
,"padding-left","15"
,"padding-right","15"
,"height","44"
,"layout-type","linear"
,"width","fill"
,"valign","center"
,"background-image","oasche_44_mid.png"
);
label6 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL6
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
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label6,"content","#{res.scdu_oascheduler_0052}"));
panel5.addView(label6);
label15 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL15
,"bindfield","monthdesc"
,"halign","right"
,"weight","1"
,"width","0"
,"margin-right","8"
,"height","fill"
,"color","#000000"
,"font-size","14"
,"layout-type","linear"
,"onclick","toMonthRef"
,"font-family","default"
,"valign","center"
);
UMTextBinder label15_binder = new UMTextBinder((IUMContextAccessor)context);
label15_binder.setBindInfo(new BindInfo("monthdesc"));
label15_binder.setControl(label15);
binderGroup.addBinderToGroup(ID_LABEL15, label15_binder);
label15.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Scdu_repeatrullrefActivity.this);
    actionToMonthRef(label15,args);

}
});
panel5.addView(label15);
image1 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_IMAGE1
,"height","13"
,"layout-type","linear"
,"width","8"
,"scaletype","fitcenter"
,"src","oasche_arrow.png"
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
,"width","fill"
,"valign","center"
,"background-image","oasche_44_mid.png"
);
label7 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL7
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
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label7,"content","#{res.scdu_oascheduler_0053}"));
panel6.addView(label7);
number3 = (UMNumberEdit)ThirdControl.createControl(new UMNumberEdit(context),ID_NUMBER3
,"min","1.0"
,"bindfield","week"
,"padding-left","10"
,"padding-right","10"
,"halign","RIGHT"
,"max","5.0"
,"precision","0"
,"weight","1"
,"placeholder","1"
,"width","0"
,"height","40"
,"color","#167ef8"
,"layout-type","linear"
,"background","#ffffff"
,"font-size","17"
,"font-family","default"
,"roundtype","value"
);
UMTextBinder number3_binder = new UMTextBinder((IUMContextAccessor)context);
number3_binder.setBindInfo(new BindInfo("week"));
number3_binder.setControl(number3);
binderGroup.addBinderToGroup(ID_NUMBER3, number3_binder);
panel6.addView(number3);
label16 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL16
,"halign","center"
,"height","fill"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","30"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label16,"content","#{res.scdu_oascheduler_0054}"));
panel6.addView(label16);

return panel6;
}
public View getPanel7View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel7 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL7
,"padding-right","15"
,"padding-left","15"
,"height","44"
,"layout-type","linear"
,"width","fill"
,"valign","center"
,"background-image","oasche_44_mid.png"
);
label8 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL8
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
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label8,"content","#{res.scdu_oascheduler_0055}"));
panel7.addView(label8);
label14 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL14
,"bindfield","repeatdaydesc"
,"halign","right"
,"weight","1"
,"width","0"
,"margin-right","8"
,"height","fill"
,"color","#000000"
,"font-size","14"
,"layout-type","linear"
,"onclick","toRepeatdayRef"
,"font-family","default"
,"valign","center"
);
UMTextBinder label14_binder = new UMTextBinder((IUMContextAccessor)context);
label14_binder.setBindInfo(new BindInfo("repeatdaydesc"));
label14_binder.setControl(label14);
binderGroup.addBinderToGroup(ID_LABEL14, label14_binder);
label14.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Scdu_repeatrullrefActivity.this);
    actionToRepeatdayRef(label14,args);

}
});
panel7.addView(label14);
image0 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_IMAGE0
,"height","13"
,"layout-type","linear"
,"width","8"
,"onclick","toRepeatdayRef"
,"scaletype","fitcenter"
,"src","oasche_arrow.png"
);
image0.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Scdu_repeatrullrefActivity.this);
    actionToRepeatdayRef(image0,args);

}
});
panel7.addView(image0);

return panel7;
}
public View getPanel12View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel12 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL12
,"padding-right","15"
,"padding-left","15"
,"height","44"
,"layout-type","linear"
,"width","fill"
,"valign","center"
,"background-image","oasche_44_mid.png"
);
label17 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL17
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
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label17,"content","#{res.scdu_oascheduler_0055}"));
panel12.addView(label17);
label18 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL18
,"bindfield","repeatdaydesc"
,"halign","right"
,"weight","1"
,"width","0"
,"margin-right","8"
,"height","fill"
,"color","#000000"
,"font-size","14"
,"layout-type","linear"
,"onclick","toOneRepeatdayRef"
,"font-family","default"
,"valign","center"
);
UMTextBinder label18_binder = new UMTextBinder((IUMContextAccessor)context);
label18_binder.setBindInfo(new BindInfo("repeatdaydesc"));
label18_binder.setControl(label18);
binderGroup.addBinderToGroup(ID_LABEL18, label18_binder);
label18.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Scdu_repeatrullrefActivity.this);
    actionToOneRepeatdayRef(label18,args);

}
});
panel12.addView(label18);
image2 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_IMAGE2
,"height","13"
,"layout-type","linear"
,"width","8"
,"onclick","toOneRepeatdayRef"
,"scaletype","fitcenter"
,"src","oasche_arrow.png"
);
image2.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Scdu_repeatrullrefActivity.this);
    actionToOneRepeatdayRef(image2,args);

}
});
panel12.addView(image2);

return panel12;
}
public View getPanel8View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel8 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL8
,"padding-right","15"
,"padding-left","15"
,"height","44"
,"layout-type","linear"
,"width","fill"
,"valign","center"
,"background-image","oasche_44_mid.png"
);
label9 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL9
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
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label9,"content","#{res.scdu_oascheduler_0046}"));
panel8.addView(label9);
number2 = (UMNumberEdit)ThirdControl.createControl(new UMNumberEdit(context),ID_NUMBER2
,"min","1.0"
,"bindfield","repeatdate"
,"padding-left","10"
,"padding-right","10"
,"halign","RIGHT"
,"max","31.0"
,"precision","0"
,"weight","1"
,"placeholder","1"
,"width","0"
,"height","40"
,"color","#167ef8"
,"layout-type","linear"
,"background","#ffffff"
,"font-size","17"
,"font-family","default"
,"roundtype","value"
);
UMTextBinder number2_binder = new UMTextBinder((IUMContextAccessor)context);
number2_binder.setBindInfo(new BindInfo("repeatdate"));
number2_binder.setControl(number2);
binderGroup.addBinderToGroup(ID_NUMBER2, number2_binder);
panel8.addView(number2);

return panel8;
}
public View getTogglebuttongroup2View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
togglebuttongroup2 = (UMToggleButtonGroup)ThirdControl.createControl(new UMToggleButtonGroup(context),ID_TOGGLEBUTTONGROUP2
,"bindfield","endrepeattype"
,"weight","1"
,"height","30"
,"layout","hbox"
,"width","0"
,"value","buttongroup"
,"valign","center"
);
UMToggleButtonGroupBinder togglebuttongroup2_binder = new UMToggleButtonGroupBinder((IUMContextAccessor)context);
togglebuttongroup2_binder.setBindInfo(new BindInfo("endrepeattype"));
togglebuttongroup2_binder.setControl(togglebuttongroup2);
binderGroup.addBinderToGroup(ID_TOGGLEBUTTONGROUP2, togglebuttongroup2_binder);
togglebutton8 = (UMToggleButton)ThirdControl.createControl(new UMToggleButton(context),ID_TOGGLEBUTTON8
,"halign","center"
,"weight","1"
,"background-image-off","label_3_left"
,"width","0"
,"font-pressed-color","#f8f8f8"
,"type","button"
,"background-image-on","label_3_left_touch"
,"height","30.0"
,"color","#e50011"
,"layout-type","hbox"
,"font-size","12"
,"value","1"
,"onclick","endrepeattype"
,"font-family","default"
,"valign","center"
,"checked","true"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,togglebutton8,"textOff","#{res.scdu_oascheduler_0057}"));
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,togglebutton8,"textOn","#{res.scdu_oascheduler_0057}"));
togglebutton8.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Scdu_repeatrullrefActivity.this);
    actionEndrepeattype(togglebutton8,args);

}
});
togglebuttongroup2.addView(togglebutton8);
togglebutton9 = (UMToggleButton)ThirdControl.createControl(new UMToggleButton(context),ID_TOGGLEBUTTON9
,"halign","center"
,"weight","1"
,"background-image-off","label_3_middle"
,"width","0"
,"font-pressed-color","#f8f8f8"
,"type","button"
,"background-image-on","label_3_middle_touch"
,"height","30.0"
,"color","#e50011"
,"layout-type","hbox"
,"font-size","12"
,"value","2"
,"onclick","endrepeattypeTimes"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,togglebutton9,"textOff","#{res.scdu_oascheduler_0058}"));
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,togglebutton9,"textOn","#{res.scdu_oascheduler_0058}"));
togglebutton9.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Scdu_repeatrullrefActivity.this);
    actionEndrepeattypeTimes(togglebutton9,args);

}
});
togglebuttongroup2.addView(togglebutton9);
togglebutton10 = (UMToggleButton)ThirdControl.createControl(new UMToggleButton(context),ID_TOGGLEBUTTON10
,"halign","center"
,"weight","1"
,"background-image-off","label_3_right"
,"width","0"
,"font-pressed-color","#f8f8f8"
,"type","button"
,"background-image-on","label_3_right_touch"
,"height","30.0"
,"color","#e50011"
,"layout-type","hbox"
,"font-size","12"
,"value","3"
,"onclick","endrepeattypeDate"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,togglebutton10,"textOff","#{res.scdu_oascheduler_0059}"));
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,togglebutton10,"textOn","#{res.scdu_oascheduler_0059}"));
togglebutton10.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Scdu_repeatrullrefActivity.this);
    actionEndrepeattypeDate(togglebutton10,args);

}
});
togglebuttongroup2.addView(togglebutton10);

return togglebuttongroup2;
}
public View getPanel9View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel9 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL9
,"padding-left","15"
,"padding-right","15"
,"height","44"
,"layout-type","linear"
,"width","fill"
,"valign","center"
,"background-image","oasche_44_mid.png"
);
label10 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL10
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
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label10,"content","#{res.scdu_oascheduler_0056}"));
panel9.addView(label10);
View togglebuttongroup2 = (View) getTogglebuttongroup2View((UMActivity)context,binderGroup,configure);
panel9.addView(togglebuttongroup2);

return panel9;
}
public View getPanel10View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel10 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL10
,"padding-left","15"
,"padding-right","15"
,"height","44"
,"layout-type","linear"
,"width","fill"
,"valign","center"
,"background-image","oasche_44_down.png"
);
label11 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL11
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
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label11,"content","#{res.scdu_oascheduler_0058}"));
panel10.addView(label11);
number0 = (UMNumberEdit)ThirdControl.createControl(new UMNumberEdit(context),ID_NUMBER0
,"min","1.0"
,"bindfield","repeattimes"
,"padding-right","10"
,"padding-left","10"
,"halign","RIGHT"
,"max","9.99999999E8"
,"precision","0"
,"weight","1"
,"placeholder","35"
,"width","0"
,"height","40"
,"color","#167ef8"
,"layout-type","linear"
,"background","#ffffff"
,"font-size","16"
,"font-family","default"
,"roundtype","value"
);
UMTextBinder number0_binder = new UMTextBinder((IUMContextAccessor)context);
number0_binder.setBindInfo(new BindInfo("repeattimes"));
number0_binder.setControl(number0);
binderGroup.addBinderToGroup(ID_NUMBER0, number0_binder);
panel10.addView(number0);

return panel10;
}
public View getPanel11View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel11 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL11
,"padding-right","15"
,"padding-left","15"
,"height","44"
,"layout-type","linear"
,"width","fill"
,"valign","center"
,"background-image","oasche_44_down.png"
);
label12 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL12
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
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label12,"content","#{res.scdu_oascheduler_0059}"));
panel11.addView(label12);
dateinput0 = (UMDateEdit)ThirdControl.createControl(new UMDateEdit(context),ID_DATEINPUT0
,"bindfield","repeatendday"
,"padding-right","10"
,"padding-left","10"
,"halign","RIGHT"
,"weight","1"
,"placeholder",""
,"width","0"
,"format","yyyy-MM-dd"
,"height","30"
,"color","#000000"
,"layout-type","linear"
,"font-size","16"
,"value","2014-04-17"
,"font-family","default"
);
UMTextBinder dateinput0_binder = new UMTextBinder((IUMContextAccessor)context);
dateinput0_binder.setBindInfo(new BindInfo("repeatendday"));
dateinput0_binder.setControl(dateinput0);
binderGroup.addBinderToGroup(ID_DATEINPUT0, dateinput0_binder);
panel11.addView(dateinput0);

return panel11;
}
public View getPanel0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel0 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL0
,"halign","center"
,"weight","1"
,"height","0"
,"layout-type","linear"
,"width","fill"
);
View panel1 = (View) getPanel1View((UMActivity)context,binderGroup,configure);
panel0.addView(panel1);
View panel2 = (View) getPanel2View((UMActivity)context,binderGroup,configure);
panel0.addView(panel2);
View panel3 = (View) getPanel3View((UMActivity)context,binderGroup,configure);
panel0.addView(panel3);
View panel4 = (View) getPanel4View((UMActivity)context,binderGroup,configure);
panel0.addView(panel4);
View panel5 = (View) getPanel5View((UMActivity)context,binderGroup,configure);
panel0.addView(panel5);
View panel6 = (View) getPanel6View((UMActivity)context,binderGroup,configure);
panel0.addView(panel6);
View panel7 = (View) getPanel7View((UMActivity)context,binderGroup,configure);
panel0.addView(panel7);
View panel12 = (View) getPanel12View((UMActivity)context,binderGroup,configure);
panel0.addView(panel12);
View panel8 = (View) getPanel8View((UMActivity)context,binderGroup,configure);
panel0.addView(panel8);
View panel9 = (View) getPanel9View((UMActivity)context,binderGroup,configure);
panel0.addView(panel9);
View panel10 = (View) getPanel10View((UMActivity)context,binderGroup,configure);
panel0.addView(panel10);
View panel11 = (View) getPanel11View((UMActivity)context,binderGroup,configure);
panel0.addView(panel11);

return panel0;
}
public View getViewPage0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
viewPage0 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_VIEWPAGE0
,"halign","center"
,"height","fill"
,"onload","load"
,"layout-type","vbox"
,"background","#EFEFF4"
,"width","fill"
);
View navigatorbar0 = (View) getNavigatorbar0View((UMActivity)context,binderGroup,configure);
viewPage0.addView(navigatorbar0);
View panel0 = (View) getPanel0View((UMActivity)context,binderGroup,configure);
viewPage0.addView(panel0);

return viewPage0;
}
public UMWindow getCurrentWindow(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
repeatrullref = (UMWindow)ThirdControl.createControl(new UMWindow(context),ID_REPEATRULLREF
,"halign","center"
,"height","650"
,"layout","vbox"
,"width","fill"
,"context","eventDetail"
,"controller","repeatrullrefController"
,"namespace","nc.bs.oa.oama.ecm"
);
View viewPage0 = (View) getViewPage0View((UMActivity)context,binderGroup,configure);
repeatrullref.addView(viewPage0);

return (UMWindow)repeatrullref;
}

	
	public void actionToOneRepeatdayRef(View control, UMEventArgs args) {
    String actionid = "toOneRepeatdayRef";
    args.put("referenceid","nc.bs.oa.oama.ecm.Scdu_onerepeatdayref");
    args.put("mapping","{\"repeatday\":\"key\",\"repeatdaydesc\":\"name\"}");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.openReference(args);
}
public void actionEndrepeattypeDate(View control, UMEventArgs args) {
    String actionid = "endrepeattypeDate";
  this.dataCollect();
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "endrepeattypeDate",UMActivity.getViewId(control),args);
}
public void actionReturnCallback(View control, UMEventArgs args) {
    String actionid = "returnCallback";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "returnCallback",UMActivity.getViewId(control),args);
}
public void actionRepeatDay(View control, UMEventArgs args) {
    String actionid = "repeatDay";
  this.dataCollect();
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "repeatDay",UMActivity.getViewId(control),args);
}
public void actionRepeatMonth(View control, UMEventArgs args) {
    String actionid = "repeatMonth";
  this.dataCollect();
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "repeatMonth",UMActivity.getViewId(control),args);
}
public void actionRepeatYear(View control, UMEventArgs args) {
    String actionid = "repeatYear";
  this.dataCollect();
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "repeatYear",UMActivity.getViewId(control),args);
}
public void actionEndrepeattype(View control, UMEventArgs args) {
    String actionid = "endrepeattype";
  this.dataCollect();
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "endrepeattype",UMActivity.getViewId(control),args);
}
public void actionReturnResult(View control, UMEventArgs args) {
    String actionid = "returnResult";
    args.put("result","#{CONTEXT}");
  this.dataCollect();
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "returnResult",UMActivity.getViewId(control),args);
}
public void actionToRepeatdayRef(View control, UMEventArgs args) {
    String actionid = "toRepeatdayRef";
    args.put("referenceid","nc.bs.oa.oama.ecm.Scdu_repeatdayref");
  this.dataCollect();
    args.put("mapping","{\"repeatdayresfs\":\"repeatdayresfs\",\"repeatdaydesc\":\"repeatdaydesc\",\"repeatday\":\"repeatday\"}");
    args.put("crows","#{repeatdayresfs}");
    args.put("containerName","");
    args.put("mappingtype","replace");
  ActionProcessor.exec(this, actionid, args);
UMView.openReference(args);
}
public void actionRepeattypeDate(View control, UMEventArgs args) {
    String actionid = "repeattypeDate";
  this.dataCollect();
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "repeattypeDate",UMActivity.getViewId(control),args);
}
public void actionIsRepeatChanged(View control, UMEventArgs args) {
    String actionid = "isRepeatChanged";
  this.dataCollect();
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "isRepeatChanged",UMActivity.getViewId(control),args);
}
public void actionRepeattypeWeekday(View control, UMEventArgs args) {
    String actionid = "repeattypeWeekday";
  this.dataCollect();
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "repeattypeWeekday",UMActivity.getViewId(control),args);
}
public void actionRepeattypeDay(View control, UMEventArgs args) {
    String actionid = "repeattypeDay";
  this.dataCollect();
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "repeattypeDay",UMActivity.getViewId(control),args);
}
public void actionToMonthRef(View control, UMEventArgs args) {
    String actionid = "toMonthRef";
    args.put("referenceid","nc.bs.oa.oama.ecm.Scdu_monthref");
  this.dataCollect();
    args.put("mapping","{\"month\":\"key\",\"monthdesc\":\"name\",\"\":\"\"}");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.openReference(args);
}
public void actionLoad(View control, UMEventArgs args) {
    String actionid = "load";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "load",UMActivity.getViewId(control),args);
}
public void actionEndrepeattypeTimes(View control, UMEventArgs args) {
    String actionid = "endrepeattypeTimes";
  this.dataCollect();
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "endrepeattypeTimes",UMActivity.getViewId(control),args);
}
public void actionRepeatWeek(View control, UMEventArgs args) {
    String actionid = "repeatWeek";
  this.dataCollect();
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "repeatWeek",UMActivity.getViewId(control),args);
}
public void actionRepeattypeWeek(View control, UMEventArgs args) {
    String actionid = "repeattypeWeek";
  this.dataCollect();
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "repeattypeWeek",UMActivity.getViewId(control),args);
}
public void actionOnCancel(View control, UMEventArgs args) {
    String actionid = "onCancel";
    args.put("resultcode","0");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.close(args);
}


}
