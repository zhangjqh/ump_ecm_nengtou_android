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

public abstract class Scdu_myschedulerdetailActivity extends UMWindowActivity {

	protected UMWindow myschedulerdetail = null;
protected XVerticalLayout viewPage0 = null;
protected XHorizontalLayout navigatorbar0 = null;
protected UMButton button0 = null;
protected UMLabel label0 = null;
protected UMButton button1 = null;
protected XVerticalLayout panel0 = null;
protected UMScrollView Scrollview_panel1 = null;
protected XVerticalLayout panel1 = null;
protected XHorizontalLayout panel2 = null;
protected UMLabel label18 = null;
protected XHorizontalLayout panel3 = null;
protected UMLabel label2 = null;
protected UMDateTimeEdit datetimeinput0 = null;
protected XHorizontalLayout panel4 = null;
protected UMLabel label3 = null;
protected UMDateTimeEdit datetimeinput1 = null;
protected XHorizontalLayout panel5 = null;
protected UMLabel label4 = null;
protected UMLabel label5 = null;
protected UMSwitch switch0 = null;
protected XHorizontalLayout panel6 = null;
protected UMLabel label6 = null;
protected UMLabel label19 = null;
protected XHorizontalLayout panel7 = null;
protected UMLabel label1 = null;
protected UMLabel label20 = null;
protected XHorizontalLayout panel8 = null;
protected UMLabel label7 = null;
protected UMLabel label8 = null;
protected XHorizontalLayout panel9 = null;
protected UMLabel label10 = null;
protected XHorizontalLayout panel10 = null;
protected UMLabel label9 = null;
protected XVerticalLayout panel12 = null;
protected XHorizontalLayout panel13 = null;
protected UMCheckbox checkbox0 = null;
protected UMLabel label11 = null;
protected UMCheckbox checkbox1 = null;
protected UMLabel label12 = null;
protected XHorizontalLayout panel14 = null;
protected UMCheckbox checkbox2 = null;
protected UMLabel label13 = null;
protected UMCheckbox checkbox3 = null;
protected UMLabel label14 = null;
protected XHorizontalLayout panel15 = null;
protected UMCheckbox checkbox4 = null;
protected UMLabel label17 = null;
protected XHorizontalLayout panel11 = null;
protected UMLabel label15 = null;
protected UMLabel label16 = null;
protected XHorizontalLayout toolbar0 = null;
protected UMLabel label21 = null;
protected UMLabel label22 = null;
protected UMLabel label23 = null;

	
	protected final static int ID_MYSCHEDULERDETAIL = 1044213502;
protected final static int ID_VIEWPAGE0 = 1659481960;
protected final static int ID_NAVIGATORBAR0 = 2099226487;
protected final static int ID_BUTTON0 = 715003683;
protected final static int ID_LABEL0 = 145393951;
protected final static int ID_BUTTON1 = 22241893;
protected final static int ID_PANEL0 = 1596587939;
protected final static int ID_SCROLLVIEW_PANEL1 = 982240931;
protected final static int ID_PANEL1 = 6969811;
protected final static int ID_PANEL2 = 232654520;
protected final static int ID_LABEL18 = 1158940372;
protected final static int ID_PANEL3 = 839751993;
protected final static int ID_LABEL2 = 1966389741;
protected final static int ID_DATETIMEINPUT0 = 1784107577;
protected final static int ID_PANEL4 = 496182181;
protected final static int ID_LABEL3 = 343788310;
protected final static int ID_DATETIMEINPUT1 = 1255285894;
protected final static int ID_PANEL5 = 589246663;
protected final static int ID_LABEL4 = 710080842;
protected final static int ID_LABEL5 = 2009148781;
protected final static int ID_SWITCH0 = 1974671610;
protected final static int ID_PANEL6 = 1845290836;
protected final static int ID_LABEL6 = 1808681108;
protected final static int ID_LABEL19 = 1597403001;
protected final static int ID_PANEL7 = 1435359890;
protected final static int ID_LABEL1 = 756245556;
protected final static int ID_LABEL20 = 453831032;
protected final static int ID_PANEL8 = 1377992326;
protected final static int ID_LABEL7 = 2014985182;
protected final static int ID_LABEL8 = 855088902;
protected final static int ID_PANEL9 = 1111905914;
protected final static int ID_LABEL10 = 102362778;
protected final static int ID_PANEL10 = 1647880718;
protected final static int ID_LABEL9 = 1955841627;
protected final static int ID_PANEL12 = 124520858;
protected final static int ID_PANEL13 = 1249361094;
protected final static int ID_CHECKBOX0 = 1631835391;
protected final static int ID_LABEL11 = 1676422510;
protected final static int ID_CHECKBOX1 = 863792595;
protected final static int ID_LABEL12 = 123222178;
protected final static int ID_PANEL14 = 1911729130;
protected final static int ID_CHECKBOX2 = 2050117747;
protected final static int ID_LABEL13 = 1623601515;
protected final static int ID_CHECKBOX3 = 649664705;
protected final static int ID_LABEL14 = 1887310693;
protected final static int ID_PANEL15 = 1898251676;
protected final static int ID_CHECKBOX4 = 734293755;
protected final static int ID_LABEL17 = 1977540346;
protected final static int ID_PANEL11 = 609467922;
protected final static int ID_LABEL15 = 788547650;
protected final static int ID_LABEL16 = 992390260;
protected final static int ID_TOOLBAR0 = 360143064;
protected final static int ID_LABEL21 = 58488841;
protected final static int ID_LABEL22 = 176622020;
protected final static int ID_LABEL23 = 1904044600;

	
	
	@Override
	public String getControllerName() {
		return "myschedulerdetailController";
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
		  idmap.put("myschedulerdetail",ID_MYSCHEDULERDETAIL);
  idmap.put("viewPage0",ID_VIEWPAGE0);
  idmap.put("navigatorbar0",ID_NAVIGATORBAR0);
  idmap.put("button0",ID_BUTTON0);
  idmap.put("label0",ID_LABEL0);
  idmap.put("button1",ID_BUTTON1);
  idmap.put("panel0",ID_PANEL0);
  idmap.put("Scrollview_panel1",ID_SCROLLVIEW_PANEL1);
  idmap.put("panel1",ID_PANEL1);
  idmap.put("panel2",ID_PANEL2);
  idmap.put("label18",ID_LABEL18);
  idmap.put("panel3",ID_PANEL3);
  idmap.put("label2",ID_LABEL2);
  idmap.put("datetimeinput0",ID_DATETIMEINPUT0);
  idmap.put("panel4",ID_PANEL4);
  idmap.put("label3",ID_LABEL3);
  idmap.put("datetimeinput1",ID_DATETIMEINPUT1);
  idmap.put("panel5",ID_PANEL5);
  idmap.put("label4",ID_LABEL4);
  idmap.put("label5",ID_LABEL5);
  idmap.put("switch0",ID_SWITCH0);
  idmap.put("panel6",ID_PANEL6);
  idmap.put("label6",ID_LABEL6);
  idmap.put("label19",ID_LABEL19);
  idmap.put("panel7",ID_PANEL7);
  idmap.put("label1",ID_LABEL1);
  idmap.put("label20",ID_LABEL20);
  idmap.put("panel8",ID_PANEL8);
  idmap.put("label7",ID_LABEL7);
  idmap.put("label8",ID_LABEL8);
  idmap.put("panel9",ID_PANEL9);
  idmap.put("label10",ID_LABEL10);
  idmap.put("panel10",ID_PANEL10);
  idmap.put("label9",ID_LABEL9);
  idmap.put("panel12",ID_PANEL12);
  idmap.put("panel13",ID_PANEL13);
  idmap.put("checkbox0",ID_CHECKBOX0);
  idmap.put("label11",ID_LABEL11);
  idmap.put("checkbox1",ID_CHECKBOX1);
  idmap.put("label12",ID_LABEL12);
  idmap.put("panel14",ID_PANEL14);
  idmap.put("checkbox2",ID_CHECKBOX2);
  idmap.put("label13",ID_LABEL13);
  idmap.put("checkbox3",ID_CHECKBOX3);
  idmap.put("label14",ID_LABEL14);
  idmap.put("panel15",ID_PANEL15);
  idmap.put("checkbox4",ID_CHECKBOX4);
  idmap.put("label17",ID_LABEL17);
  idmap.put("panel11",ID_PANEL11);
  idmap.put("label15",ID_LABEL15);
  idmap.put("label16",ID_LABEL16);
  idmap.put("toolbar0",ID_TOOLBAR0);
  idmap.put("label21",ID_LABEL21);
  idmap.put("label22",ID_LABEL22);
  idmap.put("label23",ID_LABEL23);

	}
	
	public void onLoad() {
		ULog.logLC("onLoad", this);
		if(currentPage!=null) {
			currentPage.onLoad();
		}
	
		{ //panel0 - detailOnload
    UMEventArgs args = new UMEventArgs(Scdu_myschedulerdetailActivity.this);
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
,"padding-left","8"
,"padding-right","8"
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
,"background-image-dis","button"
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
    UMEventArgs args = new UMEventArgs(Scdu_myschedulerdetailActivity.this);
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
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label0,"content","#{res.scdu_oascheduler_0030}"));
navigatorbar0.addView(label0);
button1 = (UMButton)ThirdControl.createControl(new UMButton(context),ID_BUTTON1
,"halign","right"
,"pressed-image","button_touch"
,"width","64"
,"background-image-dis","button"
,"font-pressed-color","#f2adb2"
,"height","44"
,"color","#e50011"
,"layout-type","linear"
,"font-size","17"
,"onclick","onEdid"
,"font-family","default"
,"valign","center"
,"background-image","button"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,button1,"value","#{res.scdu_oascheduler_0029}"));
button1.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Scdu_myschedulerdetailActivity.this);
    actionOnEdid(button1,args);

}
});
navigatorbar0.addView(button1);

return navigatorbar0;
}
public View getPanel2View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel2 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL2
,"padding-right","15"
,"padding-left","15"
,"height","44"
,"layout-type","linear"
,"width","fill"
,"valign","center"
,"background-image","oasche_44_top.png"
);
label18 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL18
,"bindfield","theme"
,"halign","left"
,"height","fill"
,"color","#8e8e93"
,"layout-type","linear"
,"font-size","16"
,"width","fill"
,"font-family","default"
,"valign","center"
);
UMTextBinder label18_binder = new UMTextBinder((IUMContextAccessor)context);
label18_binder.setBindInfo(new BindInfo("theme"));
label18_binder.setControl(label18);
binderGroup.addBinderToGroup(ID_LABEL18, label18_binder);
panel2.addView(label18);

return panel2;
}
public View getPanel3View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel3 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL3
,"padding-right","15"
,"padding-left","15"
,"height","44"
,"layout-type","linear"
,"width","fill"
,"valign","center"
,"background-image","oasche_44_mid.png"
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
panel3.addView(label2);
datetimeinput0 = (UMDateTimeEdit)ThirdControl.createControl(new UMDateTimeEdit(context),ID_DATETIMEINPUT0
,"bindfield","begintime"
,"padding-left","2"
,"halign","RIGHT"
,"weight","1"
,"width","0"
,"format","yyyy-MM-dd HH:mm"
,"height","30"
,"color","#8e8e93"
,"layout-type","linear"
,"background","#ffffff"
,"font-size","16"
,"value","2014-04-14 09:38"
,"font-family","default"
,"readonly","true"
);
UMTextBinder datetimeinput0_binder = new UMTextBinder((IUMContextAccessor)context);
datetimeinput0_binder.setBindInfo(new BindInfo("begintime"));
datetimeinput0_binder.setControl(datetimeinput0);
binderGroup.addBinderToGroup(ID_DATETIMEINPUT0, datetimeinput0_binder);
panel3.addView(datetimeinput0);

return panel3;
}
public View getPanel4View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel4 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL4
,"padding-right","15"
,"padding-left","15"
,"height","44"
,"layout-type","linear"
,"width","fill"
,"valign","center"
,"background-image","oasche_44_mid.png"
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
panel4.addView(label3);
datetimeinput1 = (UMDateTimeEdit)ThirdControl.createControl(new UMDateTimeEdit(context),ID_DATETIMEINPUT1
,"bindfield","endtime"
,"padding-left","2"
,"halign","RIGHT"
,"weight","1"
,"width","0"
,"format","yyyy-MM-dd HH:mm"
,"height","30"
,"color","#8e8e93"
,"layout-type","linear"
,"background","#ffffff"
,"font-size","16"
,"value","2014-04-14 09:44"
,"font-family","default"
,"readonly","true"
);
UMTextBinder datetimeinput1_binder = new UMTextBinder((IUMContextAccessor)context);
datetimeinput1_binder.setBindInfo(new BindInfo("endtime"));
datetimeinput1_binder.setControl(datetimeinput1);
binderGroup.addBinderToGroup(ID_DATETIMEINPUT1, datetimeinput1_binder);
panel4.addView(datetimeinput1);

return panel4;
}
public View getPanel5View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel5 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL5
,"padding-right","15"
,"padding-left","15"
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
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label4,"content","#{res.scdu_oascheduler_0009}"));
panel5.addView(label4);
label5 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL5
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
panel5.addView(label5);
switch0 = (UMSwitch)ThirdControl.createControl(new UMSwitch(context),ID_SWITCH0
,"bindfield","isalldayswitch"
,"height","32"
,"pressed-image","slideswitch"
,"layout-type","linear"
,"width","51"
,"value","off"
,"background-image-dis","slideswitch"
,"readonly","true"
,"background-image","slideswitch"
,"disabled","disabled"
);
UMSwitchBinder switch0_binder = new UMSwitchBinder((IUMContextAccessor)context);
switch0_binder.setBindInfo(new BindInfo("isalldayswitch"));
switch0_binder.setControl(switch0);
binderGroup.addBinderToGroup(ID_SWITCH0, switch0_binder);
panel5.addView(switch0);

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
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label6,"content","#{res.scdu_oascheduler_0010}"));
panel6.addView(label6);
label19 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL19
,"bindfield","typename"
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
UMTextBinder label19_binder = new UMTextBinder((IUMContextAccessor)context);
label19_binder.setBindInfo(new BindInfo("typename"));
label19_binder.setControl(label19);
binderGroup.addBinderToGroup(ID_LABEL19, label19_binder);
panel6.addView(label19);

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
label1 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL1
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
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label1,"content","#{res.scdu_oascheduler_0011}"));
panel7.addView(label1);
label20 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL20
,"bindfield","priorityname"
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
UMTextBinder label20_binder = new UMTextBinder((IUMContextAccessor)context);
label20_binder.setBindInfo(new BindInfo("priorityname"));
label20_binder.setControl(label20);
binderGroup.addBinderToGroup(ID_LABEL20, label20_binder);
panel7.addView(label20);

return panel7;
}
public View getPanel8View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel8 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL8
,"padding-left","15"
,"padding-right","15"
,"height","44"
,"layout-type","linear"
,"width","fill"
,"valign","center"
,"background-image","oasche_44_down.png"
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
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label7,"content","#{res.scdu_oascheduler_0012}"));
panel8.addView(label7);
label8 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL8
,"bindfield","msg"
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
UMTextBinder label8_binder = new UMTextBinder((IUMContextAccessor)context);
label8_binder.setBindInfo(new BindInfo("msg"));
label8_binder.setControl(label8);
binderGroup.addBinderToGroup(ID_LABEL8, label8_binder);
panel8.addView(label8);

return panel8;
}
public View getPanel9View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel9 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL9
,"padding-left","15"
,"padding-right","15"
,"height","30"
,"layout-type","linear"
,"width","fill"
,"valign","center"
);
label10 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL10
,"halign","left"
,"height","fill"
,"color","#727272"
,"layout-type","linear"
,"font-size","14"
,"width","fill"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label10,"content","#{res.scdu_oascheduler_0013}"));
panel9.addView(label10);

return panel9;
}
public View getPanel13View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel13 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL13
,"height","44"
,"layout-type","linear"
,"width","fill"
,"valign","center"
);
checkbox0 = (UMCheckbox)ThirdControl.createControl(new UMCheckbox(context),ID_CHECKBOX0
,"bindfield","ismessage"
,"height","20"
,"layout-type","linear"
,"width","20"
,"check-on-image","checkbox_select"
,"readonly","true"
,"check-off-image","checkbox_noselect"
);
UMCheckBoxBinder checkbox0_binder = new UMCheckBoxBinder((IUMContextAccessor)context);
checkbox0_binder.setBindInfo(new BindInfo("ismessage"));
checkbox0_binder.setControl(checkbox0);
binderGroup.addBinderToGroup(ID_CHECKBOX0, checkbox0_binder);
panel13.addView(checkbox0);
label11 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL11
,"margin-right","10"
,"halign","left"
,"height","fill"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","85"
,"margin-left","5"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label11,"content","#{res.scdu_oascheduler_0014}"));
panel13.addView(label11);
checkbox1 = (UMCheckbox)ThirdControl.createControl(new UMCheckbox(context),ID_CHECKBOX1
,"bindfield","ismail"
,"height","20"
,"layout-type","linear"
,"width","20"
,"check-on-image","checkbox_select"
,"readonly","true"
,"check-off-image","checkbox_noselect"
);
UMCheckBoxBinder checkbox1_binder = new UMCheckBoxBinder((IUMContextAccessor)context);
checkbox1_binder.setBindInfo(new BindInfo("ismail"));
checkbox1_binder.setControl(checkbox1);
binderGroup.addBinderToGroup(ID_CHECKBOX1, checkbox1_binder);
panel13.addView(checkbox1);
label12 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL12
,"halign","left"
,"height","fill"
,"weight","1"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","0"
,"margin-left","5"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label12,"content","#{res.scdu_oascheduler_0015}"));
panel13.addView(label12);

return panel13;
}
public View getPanel14View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel14 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL14
,"height","44"
,"layout-type","linear"
,"width","fill"
,"valign","center"
);
checkbox2 = (UMCheckbox)ThirdControl.createControl(new UMCheckbox(context),ID_CHECKBOX2
,"bindfield","issms"
,"height","20"
,"layout-type","linear"
,"width","20"
,"check-on-image","checkbox_select"
,"readonly","true"
,"check-off-image","checkbox_noselect"
);
UMCheckBoxBinder checkbox2_binder = new UMCheckBoxBinder((IUMContextAccessor)context);
checkbox2_binder.setBindInfo(new BindInfo("issms"));
checkbox2_binder.setControl(checkbox2);
binderGroup.addBinderToGroup(ID_CHECKBOX2, checkbox2_binder);
panel14.addView(checkbox2);
label13 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL13
,"margin-right","10"
,"halign","left"
,"height","fill"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","85"
,"margin-left","5"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label13,"content","#{res.scdu_oascheduler_0016}"));
panel14.addView(label13);
checkbox3 = (UMCheckbox)ThirdControl.createControl(new UMCheckbox(context),ID_CHECKBOX3
,"bindfield","isim"
,"height","20"
,"layout-type","linear"
,"width","20"
,"check-on-image","checkbox_select"
,"readonly","true"
,"check-off-image","checkbox_noselect"
);
UMCheckBoxBinder checkbox3_binder = new UMCheckBoxBinder((IUMContextAccessor)context);
checkbox3_binder.setBindInfo(new BindInfo("isim"));
checkbox3_binder.setControl(checkbox3);
binderGroup.addBinderToGroup(ID_CHECKBOX3, checkbox3_binder);
panel14.addView(checkbox3);
label14 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL14
,"halign","left"
,"height","fill"
,"weight","1"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","0"
,"margin-left","5"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label14,"content","#{res.scdu_oascheduler_0017}"));
panel14.addView(label14);

return panel14;
}
public View getPanel15View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel15 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL15
,"height","44"
,"layout-type","linear"
,"width","fill"
,"display","none"
,"valign","center"
);
checkbox4 = (UMCheckbox)ThirdControl.createControl(new UMCheckbox(context),ID_CHECKBOX4
,"bindfield","ispush"
,"height","20"
,"layout-type","linear"
,"width","20"
,"check-on-image","checkbox_select"
,"readonly","true"
,"check-off-image","checkbox_noselect"
);
UMCheckBoxBinder checkbox4_binder = new UMCheckBoxBinder((IUMContextAccessor)context);
checkbox4_binder.setBindInfo(new BindInfo("ispush"));
checkbox4_binder.setControl(checkbox4);
binderGroup.addBinderToGroup(ID_CHECKBOX4, checkbox4_binder);
panel15.addView(checkbox4);
label17 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL17
,"halign","left"
,"height","fill"
,"weight","1"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","0"
,"margin-left","5"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label17,"content","#{res.scdu_oascheduler_0018}"));
panel15.addView(label17);

return panel15;
}
public View getPanel12View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel12 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL12
,"halign","center"
,"height","fill"
,"weight","1"
,"layout-type","linear"
,"width","0"
);
View panel13 = (View) getPanel13View((UMActivity)context,binderGroup,configure);
panel12.addView(panel13);
View panel14 = (View) getPanel14View((UMActivity)context,binderGroup,configure);
panel12.addView(panel14);
View panel15 = (View) getPanel15View((UMActivity)context,binderGroup,configure);
panel12.addView(panel15);

return panel12;
}
public View getPanel10View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel10 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL10
,"padding-left","15"
,"padding-right","15"
,"height","wrap"
,"heightwrap","132.0"
,"layout-type","linear"
,"width","fill"
,"valign","center"
,"background-image","oasche_132_top.png"
);
label9 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL9
,"margin-right","15"
,"halign","left"
,"height","fill"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","30"
,"font-family","default"
,"valign","center"
);
panel10.addView(label9);
View panel12 = (View) getPanel12View((UMActivity)context,binderGroup,configure);
panel10.addView(panel12);

return panel10;
}
public View getPanel11View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel11 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL11
,"padding-left","15"
,"padding-right","15"
,"height","44"
,"layout-type","linear"
,"width","fill"
,"valign","center"
,"background-image","oasche_44_down.png"
);
label15 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL15
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
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label15,"content","#{res.scdu_oascheduler_0019}"));
panel11.addView(label15);
label16 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL16
,"bindfield","remindruledesc"
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
label16_binder.setBindInfo(new BindInfo("remindruledesc"));
label16_binder.setControl(label16);
binderGroup.addBinderToGroup(ID_LABEL16, label16_binder);
panel11.addView(label16);

return panel11;
}
public View getPanel1View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel1 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL1
,"halign","center"
,"height","wrap"
,"layout-type","linear"
,"width","fill"
,"margin-top","15"
);
View panel2 = (View) getPanel2View((UMActivity)context,binderGroup,configure);
panel1.addView(panel2);
View panel3 = (View) getPanel3View((UMActivity)context,binderGroup,configure);
panel1.addView(panel3);
View panel4 = (View) getPanel4View((UMActivity)context,binderGroup,configure);
panel1.addView(panel4);
View panel5 = (View) getPanel5View((UMActivity)context,binderGroup,configure);
panel1.addView(panel5);
View panel6 = (View) getPanel6View((UMActivity)context,binderGroup,configure);
panel1.addView(panel6);
View panel7 = (View) getPanel7View((UMActivity)context,binderGroup,configure);
panel1.addView(panel7);
View panel8 = (View) getPanel8View((UMActivity)context,binderGroup,configure);
panel1.addView(panel8);
View panel9 = (View) getPanel9View((UMActivity)context,binderGroup,configure);
panel1.addView(panel9);
View panel10 = (View) getPanel10View((UMActivity)context,binderGroup,configure);
panel1.addView(panel10);
View panel11 = (View) getPanel11View((UMActivity)context,binderGroup,configure);
panel1.addView(panel11);

return panel1;
}
public View getScrollview_panel1View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
Scrollview_panel1 = (UMScrollView)ThirdControl.createControl(new UMScrollView(context),ID_SCROLLVIEW_PANEL1
,"height","fill"
,"layout-type","linear"
,"width","fill"
,"hscrollenabled","disabled"
);
View panel1 = (View) getPanel1View((UMActivity)context,binderGroup,configure);
Scrollview_panel1.addView(panel1);

return Scrollview_panel1;
}
public View getPanel0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel0 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL0
,"halign","center"
,"height","0"
,"weight","1"
,"onload","detailOnload"
,"layout-type","linear"
,"background","#EFEFF4"
,"width","fill"
);
View Scrollview_panel1 = (View) getScrollview_panel1View((UMActivity)context,binderGroup,configure);
panel0.addView(Scrollview_panel1);

return panel0;
}
public View getToolbar0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
toolbar0 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_TOOLBAR0
,"padding-right","8"
,"padding-left","8"
,"height","44.0"
,"pressed-image","toolbar"
,"layout-type","linear"
,"width","fill"
,"background-image-dis","toolbar"
,"valign","center"
,"background-image","toolbar.png"
);
label21 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL21
,"halign","left"
,"height","fill"
,"weight","1"
,"color","#e50011"
,"layout-type","linear"
,"font-size","17"
,"width","0"
,"onclick","onDelete"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label21,"content","#{res.scdu_oascheduler_0031}"));
label21.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Scdu_myschedulerdetailActivity.this);
    actionOnDelete(label21,args);

}
});
toolbar0.addView(label21);
label22 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL22
,"halign","center"
,"height","fill"
,"weight","1"
,"color","#e50011"
,"layout-type","linear"
,"font-size","17"
,"width","0"
,"onclick","onCancel"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label22,"content","#{res.scdu_oascheduler_0032}"));
label22.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Scdu_myschedulerdetailActivity.this);
    actionOnCancel(label22,args);

}
});
toolbar0.addView(label22);
label23 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL23
,"halign","right"
,"height","fill"
,"weight","1"
,"color","#e50011"
,"layout-type","linear"
,"font-size","17"
,"width","0"
,"onclick","onShare"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label23,"content","#{res.scdu_oascheduler_0033}"));
label23.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Scdu_myschedulerdetailActivity.this);
    actionOnShare(label23,args);

}
});
toolbar0.addView(label23);

return toolbar0;
}
public View getViewPage0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
viewPage0 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_VIEWPAGE0
,"halign","center"
,"height","fill"
,"layout-type","vbox"
,"width","fill"
,"background","#EFEFF4"
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
myschedulerdetail = (UMWindow)ThirdControl.createControl(new UMWindow(context),ID_MYSCHEDULERDETAIL
,"halign","center"
,"height","650"
,"layout","vbox"
,"width","fill"
,"context","eventDetail"
,"controller","myschedulerdetailController"
,"namespace","nc.bs.oa.oama.ecm"
);
View viewPage0 = (View) getViewPage0View((UMActivity)context,binderGroup,configure);
myschedulerdetail.addView(viewPage0);

return (UMWindow)myschedulerdetail;
}

	
	public void actionDeleteScheduler(View control, UMEventArgs args) {
    String actionid = "deleteScheduler";
    args.put("endtime","#{plug.endtime}");
    args.put("begintime","#{plug.begintime}");
  this.dataCollect();
    args.put("repeateventopenby","#{plug.repeateventopenby}");
    args.put("type","del");
    args.put("containerName","");
    args.put("row","#{CONTEXT}");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "deleteScheduler",UMActivity.getViewId(control),args);
}
public void actionCancelScheduler(View control, UMEventArgs args) {
    String actionid = "cancelScheduler";
    args.put("endtime","#{plug.endtime}");
    args.put("begintime","#{plug.begintime}");
  this.dataCollect();
    args.put("repeateventopenby","#{plug.repeateventopenby}");
    args.put("type","cancel");
    args.put("containerName","");
    args.put("row","#{CONTEXT}");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "cancelScheduler",UMActivity.getViewId(control),args);
}
public void actionOnEdid(View control, UMEventArgs args) {
    args.put("endtime","#{plug.endtime}");
    args.put("schtype","edit");
    args.put("viewid","nc.bs.oa.oama.ecm.Scdu_addscheduler");
    args.put("begintime","#{plug.begintime}");
  this.dataCollect();
    args.put("repeateventopenby","#{plug.repeateventopenby}");
    args.put("eventid","#{plug.eventid}");
    args.put("row","#{CONTEXT}");
    String actionid = "onEdid";
    args.put("daytime","#{plug.daytime}");
    args.put("callback","onBack");
    args.put("iskeep","true");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.open(args);
}
public void actionOnShare(View control, UMEventArgs args) {
    String actionid = "onShare";
    args.put("endtime","#{plug.endtime}");
    args.put("viewid","nc.bs.oa.oama.ecm.Scdu_sharedgrouop");
    args.put("begintime","#{plug.begintime}");
    args.put("callback","detailOnload");
    args.put("repeateventopenby","#{plug.repeateventopenby}");
    args.put("iskeep","true");
    args.put("eventid","#{plug.eventid}");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.open(args);
}
public void actionOnDelete(View control, UMEventArgs args) {
    String actionid = "onDelete";
    args.put("message","是否删除当前日程？");
    args.put("title","提示");
    args.put("okaction","deleteScheduler");
    args.put("okbuttontitle","是");
    args.put("style","ok-cancel");
    args.put("containerName","");
    args.put("cancelbuttontitle","否");
  ActionProcessor.exec(this, actionid, args);
UMView.openDialog(args);
}
public void actionDetailOnload(View control, UMEventArgs args) {
    String actionid = "detailOnload";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "detailOnload",UMActivity.getViewId(control),args);
}
public void actionOnBack(View control, UMEventArgs args) {
    String actionid = "onBack";
    args.put("resultcode","15");
    args.put("iskeep","false");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.close(args);
}
public void actionOnCancel(View control, UMEventArgs args) {
    String actionid = "onCancel";
    args.put("message","是否取消当前日程？");
    args.put("title","提示");
    args.put("okaction","cancelScheduler");
    args.put("okbuttontitle","是");
    args.put("style","ok-cancel");
    args.put("containerName","");
    args.put("cancelbuttontitle","否");
  ActionProcessor.exec(this, actionid, args);
UMView.openDialog(args);
}


}
