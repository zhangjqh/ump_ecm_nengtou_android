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

public abstract class Scdu_addschedulerActivity extends UMWindowActivity {

	protected UMWindow addscheduler = null;
protected XVerticalLayout viewPage0 = null;
protected XHorizontalLayout navigatorbar0 = null;
protected UMButton button0 = null;
protected UMLabel label0 = null;
protected UMButton button1 = null;
protected XVerticalLayout panel0 = null;
protected UMScrollView Scrollview_panel1 = null;
protected XVerticalLayout panel1 = null;
protected XHorizontalLayout panel2 = null;
protected UMTextbox textbox0 = null;
protected XHorizontalLayout panel3 = null;
protected UMLabel label2 = null;
protected UMDateTimeEdit datetimeinput0 = null;
protected XHorizontalLayout panel4 = null;
protected UMLabel label3 = null;
protected UMDateTimeEdit datetimeinput1 = null;
protected XHorizontalLayout panel16 = null;
protected UMLabel label18 = null;
protected UMDateEdit dateinput0 = null;
protected XHorizontalLayout panel17 = null;
protected UMLabel label19 = null;
protected UMDateEdit dateinput1 = null;
protected XHorizontalLayout panel5 = null;
protected UMLabel label4 = null;
protected UMLabel label5 = null;
protected UMSwitch switch0 = null;
protected XHorizontalLayout panel6 = null;
protected UMLabel label6 = null;
protected UMToggleButtonGroup togglebuttongroup1 = null;
protected UMToggleButton togglebutton3 = null;
protected UMToggleButton togglebutton4 = null;
protected UMToggleButton togglebutton5 = null;
protected UMToggleButton togglebutton6 = null;
protected XHorizontalLayout panel7 = null;
protected UMLabel label1 = null;
protected UMToggleButtonGroup togglebuttongroup0 = null;
protected UMToggleButton togglebutton0 = null;
protected UMToggleButton togglebutton1 = null;
protected UMToggleButton togglebutton2 = null;
protected XHorizontalLayout panel8 = null;
protected UMLabel label7 = null;
protected UMLabel label8 = null;
protected UMImage image0 = null;
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
protected UMImage image1 = null;

	
	protected final static int ID_ADDSCHEDULER = 1074468562;
protected final static int ID_VIEWPAGE0 = 490268554;
protected final static int ID_NAVIGATORBAR0 = 1938132533;
protected final static int ID_BUTTON0 = 1580642734;
protected final static int ID_LABEL0 = 253230463;
protected final static int ID_BUTTON1 = 1609969887;
protected final static int ID_PANEL0 = 200795026;
protected final static int ID_SCROLLVIEW_PANEL1 = 555550874;
protected final static int ID_PANEL1 = 1614044201;
protected final static int ID_PANEL2 = 878455073;
protected final static int ID_TEXTBOX0 = 1808912470;
protected final static int ID_PANEL3 = 1835587140;
protected final static int ID_LABEL2 = 772065420;
protected final static int ID_DATETIMEINPUT0 = 1352209733;
protected final static int ID_PANEL4 = 1082974430;
protected final static int ID_LABEL3 = 1899664081;
protected final static int ID_DATETIMEINPUT1 = 644931968;
protected final static int ID_PANEL16 = 473301773;
protected final static int ID_LABEL18 = 1530851403;
protected final static int ID_DATEINPUT0 = 1996566082;
protected final static int ID_PANEL17 = 1072902068;
protected final static int ID_LABEL19 = 2116805245;
protected final static int ID_DATEINPUT1 = 1453807863;
protected final static int ID_PANEL5 = 1876094156;
protected final static int ID_LABEL4 = 196704872;
protected final static int ID_LABEL5 = 736673772;
protected final static int ID_SWITCH0 = 1371050465;
protected final static int ID_PANEL6 = 1188587272;
protected final static int ID_LABEL6 = 1503823699;
protected final static int ID_TOGGLEBUTTONGROUP1 = 978188694;
protected final static int ID_TOGGLEBUTTON3 = 1600616493;
protected final static int ID_TOGGLEBUTTON4 = 782916910;
protected final static int ID_TOGGLEBUTTON5 = 46297365;
protected final static int ID_TOGGLEBUTTON6 = 1307815017;
protected final static int ID_PANEL7 = 2128646136;
protected final static int ID_LABEL1 = 691289540;
protected final static int ID_TOGGLEBUTTONGROUP0 = 456069818;
protected final static int ID_TOGGLEBUTTON0 = 829390128;
protected final static int ID_TOGGLEBUTTON1 = 1987846680;
protected final static int ID_TOGGLEBUTTON2 = 54991366;
protected final static int ID_PANEL8 = 1082060376;
protected final static int ID_LABEL7 = 1010902209;
protected final static int ID_LABEL8 = 620698114;
protected final static int ID_IMAGE0 = 762995053;
protected final static int ID_PANEL9 = 7530349;
protected final static int ID_LABEL10 = 1976460306;
protected final static int ID_PANEL10 = 678331398;
protected final static int ID_LABEL9 = 938272312;
protected final static int ID_PANEL12 = 1597283587;
protected final static int ID_PANEL13 = 412709702;
protected final static int ID_CHECKBOX0 = 1525828179;
protected final static int ID_LABEL11 = 1222398035;
protected final static int ID_CHECKBOX1 = 1821429103;
protected final static int ID_LABEL12 = 1139313445;
protected final static int ID_PANEL14 = 1914518936;
protected final static int ID_CHECKBOX2 = 1095977674;
protected final static int ID_LABEL13 = 1377245239;
protected final static int ID_CHECKBOX3 = 337837789;
protected final static int ID_LABEL14 = 1389060480;
protected final static int ID_PANEL15 = 2039627597;
protected final static int ID_CHECKBOX4 = 356521422;
protected final static int ID_LABEL17 = 723593369;
protected final static int ID_PANEL11 = 78539488;
protected final static int ID_LABEL15 = 815259925;
protected final static int ID_LABEL16 = 1421672382;
protected final static int ID_IMAGE1 = 599164062;

	
	
	@Override
	public String getControllerName() {
		return "addschedulerController";
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
		  idmap.put("addscheduler",ID_ADDSCHEDULER);
  idmap.put("viewPage0",ID_VIEWPAGE0);
  idmap.put("navigatorbar0",ID_NAVIGATORBAR0);
  idmap.put("button0",ID_BUTTON0);
  idmap.put("label0",ID_LABEL0);
  idmap.put("button1",ID_BUTTON1);
  idmap.put("panel0",ID_PANEL0);
  idmap.put("Scrollview_panel1",ID_SCROLLVIEW_PANEL1);
  idmap.put("panel1",ID_PANEL1);
  idmap.put("panel2",ID_PANEL2);
  idmap.put("textbox0",ID_TEXTBOX0);
  idmap.put("panel3",ID_PANEL3);
  idmap.put("label2",ID_LABEL2);
  idmap.put("datetimeinput0",ID_DATETIMEINPUT0);
  idmap.put("panel4",ID_PANEL4);
  idmap.put("label3",ID_LABEL3);
  idmap.put("datetimeinput1",ID_DATETIMEINPUT1);
  idmap.put("panel16",ID_PANEL16);
  idmap.put("label18",ID_LABEL18);
  idmap.put("dateinput0",ID_DATEINPUT0);
  idmap.put("panel17",ID_PANEL17);
  idmap.put("label19",ID_LABEL19);
  idmap.put("dateinput1",ID_DATEINPUT1);
  idmap.put("panel5",ID_PANEL5);
  idmap.put("label4",ID_LABEL4);
  idmap.put("label5",ID_LABEL5);
  idmap.put("switch0",ID_SWITCH0);
  idmap.put("panel6",ID_PANEL6);
  idmap.put("label6",ID_LABEL6);
  idmap.put("togglebuttongroup1",ID_TOGGLEBUTTONGROUP1);
  idmap.put("togglebutton3",ID_TOGGLEBUTTON3);
  idmap.put("togglebutton4",ID_TOGGLEBUTTON4);
  idmap.put("togglebutton5",ID_TOGGLEBUTTON5);
  idmap.put("togglebutton6",ID_TOGGLEBUTTON6);
  idmap.put("panel7",ID_PANEL7);
  idmap.put("label1",ID_LABEL1);
  idmap.put("togglebuttongroup0",ID_TOGGLEBUTTONGROUP0);
  idmap.put("togglebutton0",ID_TOGGLEBUTTON0);
  idmap.put("togglebutton1",ID_TOGGLEBUTTON1);
  idmap.put("togglebutton2",ID_TOGGLEBUTTON2);
  idmap.put("panel8",ID_PANEL8);
  idmap.put("label7",ID_LABEL7);
  idmap.put("label8",ID_LABEL8);
  idmap.put("image0",ID_IMAGE0);
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
  idmap.put("image1",ID_IMAGE1);

	}
	
	public void onLoad() {
		ULog.logLC("onLoad", this);
		if(currentPage!=null) {
			currentPage.onLoad();
		}
	
		{ //panel1 - detailOnload
    UMEventArgs args = new UMEventArgs(Scdu_addschedulerActivity.this);
    actionDetailOnload(panel1,args);

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
    UMEventArgs args = new UMEventArgs(Scdu_addschedulerActivity.this);
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
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label0,"content","#{res.scdu_oascheduler_0003}"));
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
,"onclick","onSave"
,"font-family","default"
,"valign","center"
,"background-image","button"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,button1,"value","#{res.scdu_oascheduler_0002}"));
button1.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Scdu_addschedulerActivity.this);
    actionOnSave(button1,args);

}
});
navigatorbar0.addView(button1);

return navigatorbar0;
}
public View getPanel2View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel2 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL2
,"padding-left","15"
,"padding-right","15"
,"height","44"
,"layout-type","linear"
,"width","fill"
,"valign","center"
,"background-image","oasche_44_top.png"
);
textbox0 = (UMTextbox)ThirdControl.createControl(new UMTextbox(context),ID_TEXTBOX0
,"padding-left","2"
,"bindfield","theme"
,"halign","LEFT"
,"height","30"
,"color","#000000"
,"layout-type","linear"
,"font-size","16"
,"width","fill"
,"font-family","default"
);
UMTextBinder textbox0_binder = new UMTextBinder((IUMContextAccessor)context);
textbox0_binder.setBindInfo(new BindInfo("theme"));
textbox0_binder.setControl(textbox0);
binderGroup.addBinderToGroup(ID_TEXTBOX0, textbox0_binder);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,textbox0,"placeholder","#{res.scdu_oascheduler_0004}"));
panel2.addView(textbox0);

return panel2;
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
,"padding-left","4"
,"padding-right","4"
,"halign","RIGHT"
,"weight","1"
,"placeholder",""
,"width","0"
,"format","yyyy-MM-dd HH:mm"
,"height","30"
,"color","#000000"
,"background","#ffffff"
,"font-size","16"
,"layout-type","linear"
,"value",""
,"font-family","default"
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
,"padding-left","15"
,"padding-right","15"
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
,"padding-left","4"
,"padding-right","4"
,"halign","RIGHT"
,"weight","1"
,"placeholder",""
,"width","0"
,"format","yyyy-MM-dd HH:mm"
,"height","30"
,"color","#000000"
,"background","#ffffff"
,"font-size","16"
,"layout-type","linear"
,"value",""
,"font-family","default"
);
UMTextBinder datetimeinput1_binder = new UMTextBinder((IUMContextAccessor)context);
datetimeinput1_binder.setBindInfo(new BindInfo("endtime"));
datetimeinput1_binder.setControl(datetimeinput1);
binderGroup.addBinderToGroup(ID_DATETIMEINPUT1, datetimeinput1_binder);
panel4.addView(datetimeinput1);

return panel4;
}
public View getPanel16View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel16 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL16
,"padding-left","15"
,"padding-right","15"
,"height","44"
,"layout-type","linear"
,"width","fill"
,"display","none"
,"valign","center"
,"background-image","oasche_44_mid.png"
);
label18 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL18
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
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label18,"content","#{res.scdu_oascheduler_0007}"));
panel16.addView(label18);
dateinput0 = (UMDateEdit)ThirdControl.createControl(new UMDateEdit(context),ID_DATEINPUT0
,"bindfield","begindate"
,"padding-left","4"
,"padding-right","4"
,"halign","RIGHT"
,"weight","1"
,"placeholder",""
,"width","0"
,"format","yyyy-MM-dd"
,"height","30"
,"color","#000000"
,"layout-type","linear"
,"font-size","16"
,"value",""
,"font-family","default"
);
UMTextBinder dateinput0_binder = new UMTextBinder((IUMContextAccessor)context);
dateinput0_binder.setBindInfo(new BindInfo("begindate"));
dateinput0_binder.setControl(dateinput0);
binderGroup.addBinderToGroup(ID_DATEINPUT0, dateinput0_binder);
panel16.addView(dateinput0);

return panel16;
}
public View getPanel17View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel17 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL17
,"padding-left","15"
,"padding-right","15"
,"height","44"
,"layout-type","linear"
,"width","fill"
,"display","none"
,"valign","center"
,"background-image","oasche_44_mid.png"
);
label19 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL19
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
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label19,"content","#{res.scdu_oascheduler_0008}"));
panel17.addView(label19);
dateinput1 = (UMDateEdit)ThirdControl.createControl(new UMDateEdit(context),ID_DATEINPUT1
,"bindfield","enddate"
,"padding-left","4"
,"padding-right","4"
,"halign","RIGHT"
,"weight","1"
,"placeholder",""
,"width","0"
,"format","yyyy-MM-dd"
,"height","30"
,"color","#000000"
,"layout-type","linear"
,"font-size","16"
,"value",""
,"font-family","default"
);
UMTextBinder dateinput1_binder = new UMTextBinder((IUMContextAccessor)context);
dateinput1_binder.setBindInfo(new BindInfo("enddate"));
dateinput1_binder.setControl(dateinput1);
binderGroup.addBinderToGroup(ID_DATEINPUT1, dateinput1_binder);
panel17.addView(dateinput1);

return panel17;
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
,"padding-left","2"
,"pressed-image","slideswitch"
,"width","51"
,"background-image-dis","slideswitch"
,"switch-trackoff-image","switch_off"
,"onchange","isalldayChanged"
,"height","32"
,"switch-trackon-image","slideswitch"
,"color","#e50011"
,"layout-type","linear"
,"font-size","18"
,"value","off"
,"font-family","default"
,"readonly","false"
,"background-image","slideswitch"
);
UMSwitchBinder switch0_binder = new UMSwitchBinder((IUMContextAccessor)context);
switch0_binder.setBindInfo(new BindInfo("isalldayswitch"));
switch0_binder.setControl(switch0);
binderGroup.addBinderToGroup(ID_SWITCH0, switch0_binder);
switch0.setEvent("onchange", new OnCursorEventListener(configure) {
  @Override
  public void onEvent(View v, UMEventArgs parent) {
    UMEventArgs args = new UMEventArgs(Scdu_addschedulerActivity.this);
    args.put(parent);
    actionIsalldayChanged(switch0,args);

}
});
panel5.addView(switch0);

return panel5;
}
public View getTogglebuttongroup1View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
togglebuttongroup1 = (UMToggleButtonGroup)ThirdControl.createControl(new UMToggleButtonGroup(context),ID_TOGGLEBUTTONGROUP1
,"bindfield","type"
,"weight","1"
,"height","30"
,"layout","hbox"
,"width","0"
,"value","buttongroup"
,"valign","center"
);
UMToggleButtonGroupBinder togglebuttongroup1_binder = new UMToggleButtonGroupBinder((IUMContextAccessor)context);
togglebuttongroup1_binder.setBindInfo(new BindInfo("type"));
togglebuttongroup1_binder.setControl(togglebuttongroup1);
binderGroup.addBinderToGroup(ID_TOGGLEBUTTONGROUP1, togglebuttongroup1_binder);
togglebutton3 = (UMToggleButton)ThirdControl.createControl(new UMToggleButton(context),ID_TOGGLEBUTTON3
,"halign","center"
,"weight","1"
,"background-image-off","label_4_left"
,"width","0"
,"font-pressed-color","#f8f8f8"
,"type","button"
,"background-image-on","label_4_left_touch"
,"height","30.0"
,"color","#000000"
,"layout-type","hbox"
,"font-size","14"
,"value","work"
,"font-family","default"
,"valign","center"
,"checked","true"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,togglebutton3,"textOff","#{res.scdu_oascheduler_0020}"));
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,togglebutton3,"textOn","#{res.scdu_oascheduler_0020}"));
togglebuttongroup1.addView(togglebutton3);
togglebutton4 = (UMToggleButton)ThirdControl.createControl(new UMToggleButton(context),ID_TOGGLEBUTTON4
,"halign","center"
,"weight","1"
,"background-image-off","label_4_middle"
,"width","0"
,"font-pressed-color","#f8f8f8"
,"type","button"
,"background-image-on","label_4_middle_touch"
,"height","30.0"
,"color","#000000"
,"layout-type","hbox"
,"font-size","14"
,"value","personal"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,togglebutton4,"textOff","#{res.scdu_oascheduler_0021}"));
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,togglebutton4,"textOn","#{res.scdu_oascheduler_0021}"));
togglebuttongroup1.addView(togglebutton4);
togglebutton5 = (UMToggleButton)ThirdControl.createControl(new UMToggleButton(context),ID_TOGGLEBUTTON5
,"halign","center"
,"weight","1"
,"background-image-off","label_4_middle"
,"width","0"
,"font-pressed-color","#f8f8f8"
,"type","button"
,"background-image-on","label_4_middle_touch"
,"height","30.0"
,"color","#000000"
,"layout-type","hbox"
,"font-size","14"
,"value","task"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,togglebutton5,"textOff","#{res.scdu_oascheduler_0022}"));
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,togglebutton5,"textOn","#{res.scdu_oascheduler_0022}"));
togglebuttongroup1.addView(togglebutton5);
togglebutton6 = (UMToggleButton)ThirdControl.createControl(new UMToggleButton(context),ID_TOGGLEBUTTON6
,"halign","center"
,"weight","1"
,"background-image-off","label_4_right"
,"width","0"
,"font-pressed-color","#f8f8f8"
,"type","button"
,"background-image-on","label_4_right_touch"
,"height","30.0"
,"color","#000000"
,"layout-type","hbox"
,"font-size","14"
,"value","meeting"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,togglebutton6,"textOff","#{res.scdu_oascheduler_0023}"));
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,togglebutton6,"textOn","#{res.scdu_oascheduler_0023}"));
togglebuttongroup1.addView(togglebutton6);

return togglebuttongroup1;
}
public View getPanel6View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel6 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL6
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
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label6,"content","#{res.scdu_oascheduler_0010}"));
panel6.addView(label6);
View togglebuttongroup1 = (View) getTogglebuttongroup1View((UMActivity)context,binderGroup,configure);
panel6.addView(togglebuttongroup1);

return panel6;
}
public View getTogglebuttongroup0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
togglebuttongroup0 = (UMToggleButtonGroup)ThirdControl.createControl(new UMToggleButtonGroup(context),ID_TOGGLEBUTTONGROUP0
,"bindfield","priority"
,"weight","1"
,"height","30"
,"layout","hbox"
,"width","0"
,"value","buttongroup"
,"valign","center"
);
UMToggleButtonGroupBinder togglebuttongroup0_binder = new UMToggleButtonGroupBinder((IUMContextAccessor)context);
togglebuttongroup0_binder.setBindInfo(new BindInfo("priority"));
togglebuttongroup0_binder.setControl(togglebuttongroup0);
binderGroup.addBinderToGroup(ID_TOGGLEBUTTONGROUP0, togglebuttongroup0_binder);
togglebutton0 = (UMToggleButton)ThirdControl.createControl(new UMToggleButton(context),ID_TOGGLEBUTTON0
,"halign","center"
,"weight","1"
,"background-image-off","label_3_left"
,"width","0"
,"font-pressed-color","#f8f8f8"
,"type","button"
,"background-image-on","label_3_left_touch"
,"height","30.0"
,"color","#000000"
,"layout-type","hbox"
,"font-size","14"
,"value","1"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,togglebutton0,"textOff","#{res.scdu_oascheduler_0024}"));
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,togglebutton0,"textOn","#{res.scdu_oascheduler_0024}"));
togglebuttongroup0.addView(togglebutton0);
togglebutton1 = (UMToggleButton)ThirdControl.createControl(new UMToggleButton(context),ID_TOGGLEBUTTON1
,"halign","center"
,"weight","1"
,"background-image-off","label_3_middle"
,"width","0"
,"font-pressed-color","#f8f8f8"
,"type","button"
,"background-image-on","label_3_middle_touch"
,"height","30.0"
,"color","#000000"
,"layout-type","hbox"
,"font-size","14"
,"value","2"
,"font-family","default"
,"valign","center"
,"checked","true"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,togglebutton1,"textOff","#{res.scdu_oascheduler_0025}"));
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,togglebutton1,"textOn","#{res.scdu_oascheduler_0025}"));
togglebuttongroup0.addView(togglebutton1);
togglebutton2 = (UMToggleButton)ThirdControl.createControl(new UMToggleButton(context),ID_TOGGLEBUTTON2
,"halign","center"
,"weight","1"
,"background-image-off","label_3_right"
,"width","0"
,"font-pressed-color","#f8f8f8"
,"type","button"
,"background-image-on","label_3_right_touch"
,"height","30.0"
,"color","#000000"
,"layout-type","hbox"
,"font-size","14"
,"value","3"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,togglebutton2,"textOff","#{res.scdu_oascheduler_0026}"));
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,togglebutton2,"textOn","#{res.scdu_oascheduler_0026}"));
togglebuttongroup0.addView(togglebutton2);

return togglebuttongroup0;
}
public View getPanel7View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel7 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL7
,"padding-left","15"
,"padding-right","15"
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
View togglebuttongroup0 = (View) getTogglebuttongroup0View((UMActivity)context,binderGroup,configure);
panel7.addView(togglebuttongroup0);

return panel7;
}
public View getPanel8View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel8 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL8
,"padding-right","15"
,"padding-left","15"
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
,"weight","1"
,"width","0"
,"margin-right","15"
,"height","fill"
,"color","#000000"
,"font-size","16"
,"layout-type","linear"
,"onclick","toRepeatRull"
,"font-family","default"
,"valign","center"
);
UMTextBinder label8_binder = new UMTextBinder((IUMContextAccessor)context);
label8_binder.setBindInfo(new BindInfo("msg"));
label8_binder.setControl(label8);
binderGroup.addBinderToGroup(ID_LABEL8, label8_binder);
label8.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Scdu_addschedulerActivity.this);
    actionToRepeatRull(label8,args);

}
});
panel8.addView(label8);
image0 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_IMAGE0
,"height","13"
,"layout-type","linear"
,"width","8"
,"onclick","toRepeatRull"
,"scaletype","fitcenter"
,"src","oasche_arrow.png"
);
image0.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Scdu_addschedulerActivity.this);
    actionToRepeatRull(image0,args);

}
});
panel8.addView(image0);

return panel8;
}
public View getPanel9View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel9 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL9
,"padding-right","15"
,"padding-left","15"
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
,"color","#e50011"
,"layout-type","linear"
,"font-size","18"
,"width","20"
,"check-on-image","checkbox_select"
,"font-family","default"
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
,"color","#e50011"
,"layout-type","linear"
,"font-size","18"
,"width","20"
,"check-on-image","checkbox_select"
,"font-family","default"
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
,"color","#e50011"
,"layout-type","linear"
,"font-size","18"
,"width","20"
,"check-on-image","checkbox_select"
,"font-family","default"
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
,"color","#e50011"
,"layout-type","linear"
,"font-size","18"
,"width","20"
,"check-on-image","checkbox_select"
,"font-family","default"
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
,"color","#e50011"
,"layout-type","linear"
,"font-size","18"
,"width","20"
,"check-on-image","checkbox_select"
,"font-family","default"
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
,"padding-right","15"
,"padding-left","15"
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
,"padding-right","15"
,"padding-left","15"
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
,"weight","1"
,"width","0"
,"margin-right","15"
,"height","fill"
,"color","#000000"
,"font-size","16"
,"layout-type","linear"
,"onclick","toRemindRull"
,"font-family","default"
,"valign","center"
);
UMTextBinder label16_binder = new UMTextBinder((IUMContextAccessor)context);
label16_binder.setBindInfo(new BindInfo("remindruledesc"));
label16_binder.setControl(label16);
binderGroup.addBinderToGroup(ID_LABEL16, label16_binder);
label16.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Scdu_addschedulerActivity.this);
    actionToRemindRull(label16,args);

}
});
panel11.addView(label16);
image1 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_IMAGE1
,"height","13"
,"layout-type","linear"
,"width","8"
,"onclick","toRemindRull"
,"scaletype","fitcenter"
,"src","oasche_arrow.png"
);
image1.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Scdu_addschedulerActivity.this);
    actionToRemindRull(image1,args);

}
});
panel11.addView(image1);

return panel11;
}
public View getPanel1View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel1 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL1
,"halign","center"
,"height","wrap"
,"onload","detailOnload"
,"heightwrap","621.0"
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
View panel16 = (View) getPanel16View((UMActivity)context,binderGroup,configure);
panel1.addView(panel16);
View panel17 = (View) getPanel17View((UMActivity)context,binderGroup,configure);
panel1.addView(panel17);
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
,"layout-type","linear"
,"background","#EFEFF4"
,"width","fill"
);
View Scrollview_panel1 = (View) getScrollview_panel1View((UMActivity)context,binderGroup,configure);
panel0.addView(Scrollview_panel1);

return panel0;
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

return viewPage0;
}
public UMWindow getCurrentWindow(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
addscheduler = (UMWindow)ThirdControl.createControl(new UMWindow(context),ID_ADDSCHEDULER
,"halign","center"
,"height","680"
,"layout","vbox"
,"width","fill"
,"context","eventDetail"
,"controller","addschedulerController"
,"namespace","nc.bs.oa.oama.ecm"
);
View viewPage0 = (View) getViewPage0View((UMActivity)context,binderGroup,configure);
addscheduler.addView(viewPage0);

return (UMWindow)addscheduler;
}

	
	public void actionIsalldayChanged(View control, UMEventArgs args) {
    String actionid = "isalldayChanged";
    args.put("daytime","#{plug.daytime}");
  this.dataCollect();
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "isalldayChanged",UMActivity.getViewId(control),args);
}
public void actionOnSave(View control, UMEventArgs args) {
    String actionid = "onSave";
    args.put("schtype","#{plug.schtype}");
    args.put("endtimeex","#{plug.endtime}");
    args.put("eventdetail","#{CONTEXT}");
    args.put("begintimeex","#{plug.begintime}");
  this.dataCollect();
    args.put("repeateventopenby","#{plug.repeateventopenby}");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "onSave",UMActivity.getViewId(control),args);
}
public void actionRemindTypeOnload(View control, UMEventArgs args) {
    String actionid = "remindTypeOnload";
    args.put("viewid","nc.bs.oa.oama.scheduler.AlertRuleListExtendController");
    args.put("action","getRemindType");
    args.put("callback","remindTypeInit");
    args.put("autoDataBinding","false");
    args.put("contextmapping","remindtypes");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMService.callAction(args);
}
public void actionDetailOnload(View control, UMEventArgs args) {
    String actionid = "detailOnload";
    args.put("daytime","#{plug.daytime}");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "detailOnload",UMActivity.getViewId(control),args);
}
public void actionRemindTypeInit(View control, UMEventArgs args) {
    String actionid = "remindTypeInit";
  this.dataCollect();
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "remindTypeInit",UMActivity.getViewId(control),args);
}
public void actionOnBack(View control, UMEventArgs args) {
    String actionid = "onBack";
    args.put("resultcode","15");
    args.put("iskeep","false");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.close(args);
}
public void actionToRepeatRull(View control, UMEventArgs args) {
    String actionid = "toRepeatRull";
    args.put("referenceid","nc.bs.oa.oama.ecm.Scdu_repeatrullref");
  this.dataCollect();
    args.put("mapping","{\"repeat\":\"repeat\",\"repeattype\":\"repeattype\",\"repeatdate\":\"repeatdate\",\"week\":\"week\",\"repeatday\":\"repeatday\",\"month\":\"month\",\"repeatcount\":\"repeatcount\",\"endrepeattype\":\"endrepeattype\",\"repeattimes\":\"repeattimes\",\"repeatendday\":\"repeatendday\",\"msg\":\"msg\",\"isrepeatevent\":\"isrepeatevent\",\"repeatdaydesc\":\"repeatdaydesc\",\"repeatdayresfs\":\"repeatdayresfs\",\"isrepeateventswitch\":\"isrepeateventswitch\",\"monthdesc\":\"monthdesc\"}");
    args.put("containerName","");
    args.put("row","#{CONTEXT}");
    args.put("mappingtype","replace");
  ActionProcessor.exec(this, actionid, args);
UMView.openReference(args);
}
public void actionToRemindRull(View control, UMEventArgs args) {
    String actionid = "toRemindRull";
    args.put("referenceid","nc.bs.oa.oama.ecm.Scdu_remindrullref");
  this.dataCollect();
    args.put("mapping","{\"remindrule\":\"value\",\"remindruledesc\":\"desc\"}");
    args.put("isalldayswitch","#{isalldayswitch}");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.openReference(args);
}


}
