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

public abstract class Task_editActivity extends UMWindowActivity {

	protected UMWindow task_edit = null;
protected XVerticalLayout viewPage0 = null;
protected XHorizontalLayout navigatorbar0 = null;
protected UMButton button0 = null;
protected UMLabel label0 = null;
protected UMButton button1 = null;
protected XVerticalLayout panel0 = null;
protected UMScrollView Scrollview_panel11 = null;
protected XVerticalLayout panel11 = null;
protected XVerticalLayout rounddiv0 = null;
protected XHorizontalLayout rounddiv6 = null;
protected UMLabel label11 = null;
protected UMDateEdit dateinput0 = null;
protected XHorizontalLayout rounddiv7 = null;
protected UMLabel label12 = null;
protected UMDateEdit dateinput1 = null;
protected XHorizontalLayout rounddiv8 = null;
protected UMLabel label13 = null;
protected UMTextbox textbox5 = null;
protected XHorizontalLayout rounddiv9 = null;
protected UMLabel label17 = null;
protected UMLabel label14 = null;
protected UMLabel label18 = null;
protected UMButton button4 = null;
protected XVerticalLayout rounddiv1 = null;
protected XHorizontalLayout rounddiv16 = null;
protected UMLabel label7 = null;
protected UMTextbox textbox2 = null;
protected XHorizontalLayout rounddiv17 = null;
protected UMLabel label8 = null;
protected UMTextbox textbox3 = null;
protected XHorizontalLayout rounddiv18 = null;
protected UMLabel label9 = null;
protected UMToggleButtonGroup togglebuttongroup0 = null;
protected UMToggleButton togglebutton0 = null;
protected UMToggleButton togglebutton1 = null;
protected UMToggleButton togglebutton2 = null;
protected XHorizontalLayout rounddiv19 = null;
protected UMLabel label15 = null;
protected UMLabel label10 = null;
protected UMLabel label16 = null;
protected UMButton button3 = null;
protected XVerticalLayout rounddiv2 = null;
protected XHorizontalLayout rounddiv12 = null;
protected UMLabel label6 = null;
protected XHorizontalLayout rounddiv13 = null;
protected UMCheckbox checkbox0 = null;
protected UMLabel label222 = null;
protected UMCheckbox checkbox1 = null;
protected UMLabel label223 = null;
protected XHorizontalLayout rounddiv14 = null;
protected UMCheckbox checkbox2 = null;
protected UMLabel label224 = null;
protected UMCheckbox checkbox3 = null;
protected UMLabel label225 = null;
protected XVerticalLayout rounddiv3 = null;
protected XHorizontalLayout rounddiv10 = null;
protected UMLabel label4 = null;
protected XHorizontalLayout panel1 = null;
protected UMLabel label26 = null;
protected UMLabel label25 = null;
protected UMImage image0 = null;
protected XHorizontalLayout rounddiv11 = null;
protected UMLabel label5 = null;
protected XHorizontalLayout panel2 = null;
protected UMLabel label28 = null;
protected UMLabel label27 = null;
protected UMImage image1 = null;
protected XHorizontalLayout rounddiv5 = null;
protected XHorizontalLayout rounddiv55 = null;
protected UMLabel label3 = null;
protected UMTextbox textbox12 = null;
protected XHorizontalLayout rounddiv4 = null;
protected XHorizontalLayout rounddiv44 = null;
protected UMLabel label1 = null;
protected UMLabel label2 = null;
protected UMButton button2 = null;

	
	protected final static int ID_TASK_EDIT = 753187981;
protected final static int ID_VIEWPAGE0 = 533255884;
protected final static int ID_NAVIGATORBAR0 = 358209277;
protected final static int ID_BUTTON0 = 1764221774;
protected final static int ID_LABEL0 = 1288278855;
protected final static int ID_BUTTON1 = 504636546;
protected final static int ID_PANEL0 = 1379312858;
protected final static int ID_SCROLLVIEW_PANEL11 = 34956499;
protected final static int ID_PANEL11 = 1689858413;
protected final static int ID_ROUNDDIV0 = 1890910115;
protected final static int ID_ROUNDDIV6 = 470682038;
protected final static int ID_LABEL11 = 1420860797;
protected final static int ID_DATEINPUT0 = 1940148507;
protected final static int ID_ROUNDDIV7 = 154730153;
protected final static int ID_LABEL12 = 1846423902;
protected final static int ID_DATEINPUT1 = 803790431;
protected final static int ID_ROUNDDIV8 = 1083481140;
protected final static int ID_LABEL13 = 1062451462;
protected final static int ID_TEXTBOX5 = 526981539;
protected final static int ID_ROUNDDIV9 = 1498729851;
protected final static int ID_LABEL17 = 475594992;
protected final static int ID_LABEL14 = 1003061355;
protected final static int ID_LABEL18 = 870097876;
protected final static int ID_BUTTON4 = 1537322240;
protected final static int ID_ROUNDDIV1 = 1488874400;
protected final static int ID_ROUNDDIV16 = 515230052;
protected final static int ID_LABEL7 = 1608320719;
protected final static int ID_TEXTBOX2 = 1447687130;
protected final static int ID_ROUNDDIV17 = 2127414672;
protected final static int ID_LABEL8 = 873203706;
protected final static int ID_TEXTBOX3 = 1524331716;
protected final static int ID_ROUNDDIV18 = 403344799;
protected final static int ID_LABEL9 = 913677476;
protected final static int ID_TOGGLEBUTTONGROUP0 = 1822444913;
protected final static int ID_TOGGLEBUTTON0 = 590663659;
protected final static int ID_TOGGLEBUTTON1 = 1903432401;
protected final static int ID_TOGGLEBUTTON2 = 891970848;
protected final static int ID_ROUNDDIV19 = 34719011;
protected final static int ID_LABEL15 = 720516793;
protected final static int ID_LABEL10 = 110176573;
protected final static int ID_LABEL16 = 682942730;
protected final static int ID_BUTTON3 = 660088753;
protected final static int ID_ROUNDDIV2 = 1023591260;
protected final static int ID_ROUNDDIV12 = 1536344596;
protected final static int ID_LABEL6 = 1042070807;
protected final static int ID_ROUNDDIV13 = 264420420;
protected final static int ID_CHECKBOX0 = 2044805691;
protected final static int ID_LABEL222 = 953909302;
protected final static int ID_CHECKBOX1 = 304880975;
protected final static int ID_LABEL223 = 553024673;
protected final static int ID_ROUNDDIV14 = 1342591981;
protected final static int ID_CHECKBOX2 = 1167822698;
protected final static int ID_LABEL224 = 1868293690;
protected final static int ID_CHECKBOX3 = 1786993115;
protected final static int ID_LABEL225 = 746187428;
protected final static int ID_ROUNDDIV3 = 1301216144;
protected final static int ID_ROUNDDIV10 = 1078154890;
protected final static int ID_LABEL4 = 1687997941;
protected final static int ID_PANEL1 = 1307513755;
protected final static int ID_LABEL26 = 1497868998;
protected final static int ID_LABEL25 = 702342906;
protected final static int ID_IMAGE0 = 552087274;
protected final static int ID_ROUNDDIV11 = 1220313231;
protected final static int ID_LABEL5 = 1836423311;
protected final static int ID_PANEL2 = 739912285;
protected final static int ID_LABEL28 = 1838583106;
protected final static int ID_LABEL27 = 1627390703;
protected final static int ID_IMAGE1 = 585509348;
protected final static int ID_ROUNDDIV5 = 2094651477;
protected final static int ID_ROUNDDIV55 = 28911124;
protected final static int ID_LABEL3 = 637177054;
protected final static int ID_TEXTBOX12 = 1677029342;
protected final static int ID_ROUNDDIV4 = 1914688939;
protected final static int ID_ROUNDDIV44 = 1051170486;
protected final static int ID_LABEL1 = 1033877256;
protected final static int ID_LABEL2 = 316476842;
protected final static int ID_BUTTON2 = 1134612388;

	
	
	@Override
	public String getControllerName() {
		return "task_editController";
	}
	
	@Override
	public String getContextName() {
		return "detailtask";
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
		  idmap.put("task_edit",ID_TASK_EDIT);
  idmap.put("viewPage0",ID_VIEWPAGE0);
  idmap.put("navigatorbar0",ID_NAVIGATORBAR0);
  idmap.put("button0",ID_BUTTON0);
  idmap.put("label0",ID_LABEL0);
  idmap.put("button1",ID_BUTTON1);
  idmap.put("panel0",ID_PANEL0);
  idmap.put("Scrollview_panel11",ID_SCROLLVIEW_PANEL11);
  idmap.put("panel11",ID_PANEL11);
  idmap.put("rounddiv0",ID_ROUNDDIV0);
  idmap.put("rounddiv6",ID_ROUNDDIV6);
  idmap.put("label11",ID_LABEL11);
  idmap.put("dateinput0",ID_DATEINPUT0);
  idmap.put("rounddiv7",ID_ROUNDDIV7);
  idmap.put("label12",ID_LABEL12);
  idmap.put("dateinput1",ID_DATEINPUT1);
  idmap.put("rounddiv8",ID_ROUNDDIV8);
  idmap.put("label13",ID_LABEL13);
  idmap.put("textbox5",ID_TEXTBOX5);
  idmap.put("rounddiv9",ID_ROUNDDIV9);
  idmap.put("label17",ID_LABEL17);
  idmap.put("label14",ID_LABEL14);
  idmap.put("label18",ID_LABEL18);
  idmap.put("button4",ID_BUTTON4);
  idmap.put("rounddiv1",ID_ROUNDDIV1);
  idmap.put("rounddiv16",ID_ROUNDDIV16);
  idmap.put("label7",ID_LABEL7);
  idmap.put("textbox2",ID_TEXTBOX2);
  idmap.put("rounddiv17",ID_ROUNDDIV17);
  idmap.put("label8",ID_LABEL8);
  idmap.put("textbox3",ID_TEXTBOX3);
  idmap.put("rounddiv18",ID_ROUNDDIV18);
  idmap.put("label9",ID_LABEL9);
  idmap.put("togglebuttongroup0",ID_TOGGLEBUTTONGROUP0);
  idmap.put("togglebutton0",ID_TOGGLEBUTTON0);
  idmap.put("togglebutton1",ID_TOGGLEBUTTON1);
  idmap.put("togglebutton2",ID_TOGGLEBUTTON2);
  idmap.put("rounddiv19",ID_ROUNDDIV19);
  idmap.put("label15",ID_LABEL15);
  idmap.put("label10",ID_LABEL10);
  idmap.put("label16",ID_LABEL16);
  idmap.put("button3",ID_BUTTON3);
  idmap.put("rounddiv2",ID_ROUNDDIV2);
  idmap.put("rounddiv12",ID_ROUNDDIV12);
  idmap.put("label6",ID_LABEL6);
  idmap.put("rounddiv13",ID_ROUNDDIV13);
  idmap.put("checkbox0",ID_CHECKBOX0);
  idmap.put("label222",ID_LABEL222);
  idmap.put("checkbox1",ID_CHECKBOX1);
  idmap.put("label223",ID_LABEL223);
  idmap.put("rounddiv14",ID_ROUNDDIV14);
  idmap.put("checkbox2",ID_CHECKBOX2);
  idmap.put("label224",ID_LABEL224);
  idmap.put("checkbox3",ID_CHECKBOX3);
  idmap.put("label225",ID_LABEL225);
  idmap.put("rounddiv3",ID_ROUNDDIV3);
  idmap.put("rounddiv10",ID_ROUNDDIV10);
  idmap.put("label4",ID_LABEL4);
  idmap.put("panel1",ID_PANEL1);
  idmap.put("label26",ID_LABEL26);
  idmap.put("label25",ID_LABEL25);
  idmap.put("image0",ID_IMAGE0);
  idmap.put("rounddiv11",ID_ROUNDDIV11);
  idmap.put("label5",ID_LABEL5);
  idmap.put("panel2",ID_PANEL2);
  idmap.put("label28",ID_LABEL28);
  idmap.put("label27",ID_LABEL27);
  idmap.put("image1",ID_IMAGE1);
  idmap.put("rounddiv5",ID_ROUNDDIV5);
  idmap.put("rounddiv55",ID_ROUNDDIV55);
  idmap.put("label3",ID_LABEL3);
  idmap.put("textbox12",ID_TEXTBOX12);
  idmap.put("rounddiv4",ID_ROUNDDIV4);
  idmap.put("rounddiv44",ID_ROUNDDIV44);
  idmap.put("label1",ID_LABEL1);
  idmap.put("label2",ID_LABEL2);
  idmap.put("button2",ID_BUTTON2);

	}
	
	public void onLoad() {
		ULog.logLC("onLoad", this);
		if(currentPage!=null) {
			currentPage.onLoad();
		}
	
		{ //panel0 - detailonload
    UMEventArgs args = new UMEventArgs(Task_editActivity.this);
    actionDetailonload(panel0,args);

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
,"pressed-image","btn_back_touch"
,"width","64"
,"background-image-dis","button"
,"height","44"
,"color","#ff0000"
,"layout-type","linear"
,"font-size","17"
,"onclick","backlist"
,"font-family","default"
,"valign","center"
,"background-image","btn_back"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,button0,"value","#{res.task_back}"));
button0.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Task_editActivity.this);
    actionBacklist(button0,args);

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
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label0,"content","#{res.task_edit}"));
navigatorbar0.addView(label0);
button1 = (UMButton)ThirdControl.createControl(new UMButton(context),ID_BUTTON1
,"halign","right"
,"pressed-image","button_touch"
,"width","50"
,"background-image-dis","button"
,"height","30"
,"color","#ff0000"
,"layout-type","linear"
,"font-size","17"
,"onclick","edittask"
,"font-family","default"
,"valign","center"
,"background-image","button"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,button1,"value","#{res.task_publish}"));
button1.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Task_editActivity.this);
    actionEdittask(button1,args);

}
});
navigatorbar0.addView(button1);

return navigatorbar0;
}
public View getRounddiv6View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
rounddiv6 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_ROUNDDIV6
,"height","0"
,"weight","1"
,"layout-type","linear"
,"width","fill"
,"valign","center"
,"background-image","at44_top.png"
);
label11 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL11
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
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label11,"content","#{res.task_start}"));
rounddiv6.addView(label11);
dateinput0 = (UMDateEdit)ThirdControl.createControl(new UMDateEdit(context),ID_DATEINPUT0
,"padding-left","2"
,"bindfield","starttime"
,"height","fill"
,"color","#000000"
,"layout-type","linear"
,"font-size","16"
,"width","167"
,"background-image-dis","textbox"
,"font-family","default"
);
UMTextBinder dateinput0_binder = new UMTextBinder((IUMContextAccessor)context);
dateinput0_binder.setBindInfo(new BindInfo("starttime"));
dateinput0_binder.setControl(dateinput0);
binderGroup.addBinderToGroup(ID_DATEINPUT0, dateinput0_binder);
rounddiv6.addView(dateinput0);

return rounddiv6;
}
public View getRounddiv7View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
rounddiv7 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_ROUNDDIV7
,"height","0"
,"weight","1"
,"layout-type","linear"
,"width","fill"
,"valign","center"
,"background-image","at44_mid.png"
);
label12 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL12
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
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label12,"content","#{res.task_end}"));
rounddiv7.addView(label12);
dateinput1 = (UMDateEdit)ThirdControl.createControl(new UMDateEdit(context),ID_DATEINPUT1
,"padding-left","2"
,"bindfield","endtime"
,"height","fill"
,"color","#000000"
,"layout-type","linear"
,"font-size","16"
,"width","167"
,"font-family","default"
);
UMTextBinder dateinput1_binder = new UMTextBinder((IUMContextAccessor)context);
dateinput1_binder.setBindInfo(new BindInfo("endtime"));
dateinput1_binder.setControl(dateinput1);
binderGroup.addBinderToGroup(ID_DATEINPUT1, dateinput1_binder);
rounddiv7.addView(dateinput1);

return rounddiv7;
}
public View getRounddiv8View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
rounddiv8 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_ROUNDDIV8
,"height","0"
,"weight","1"
,"layout-type","linear"
,"width","fill"
,"valign","center"
,"background-image","at44_mid.png"
);
label13 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL13
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
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label13,"content","#{res.task_subject}"));
rounddiv8.addView(label13);
textbox5 = (UMTextbox)ThirdControl.createControl(new UMTextbox(context),ID_TEXTBOX5
,"padding-left","2"
,"bindfield","taskname"
,"height","fill"
,"weight","1"
,"color","#000000"
,"layout-type","linear"
,"font-size","16"
,"width","0"
,"font-family","default"
);
UMTextBinder textbox5_binder = new UMTextBinder((IUMContextAccessor)context);
textbox5_binder.setBindInfo(new BindInfo("taskname"));
textbox5_binder.setControl(textbox5);
binderGroup.addBinderToGroup(ID_TEXTBOX5, textbox5_binder);
rounddiv8.addView(textbox5);

return rounddiv8;
}
public View getRounddiv9View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
rounddiv9 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_ROUNDDIV9
,"padding-right","15"
,"height","0"
,"weight","1"
,"layout-type","linear"
,"width","fill"
,"onclick","openchargeref"
,"valign","center"
,"background-image","at44_down.png"
);
rounddiv9.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Task_editActivity.this);
    actionOpenchargeref(rounddiv9,args);

}
});
label17 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL17
,"bindfield","chargerid"
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
UMTextBinder label17_binder = new UMTextBinder((IUMContextAccessor)context);
label17_binder.setBindInfo(new BindInfo("chargerid"));
label17_binder.setControl(label17);
binderGroup.addBinderToGroup(ID_LABEL17, label17_binder);
rounddiv9.addView(label17);
label14 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL14
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
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label14,"content","#{res.task_responser}"));
rounddiv9.addView(label14);
label18 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL18
,"bindfield","chargername"
,"halign","left"
,"height","fill"
,"weight","1"
,"color","#000000"
,"layout-type","linear"
,"font-size","16"
,"width","0"
,"font-family","default"
,"valign","center"
);
UMTextBinder label18_binder = new UMTextBinder((IUMContextAccessor)context);
label18_binder.setBindInfo(new BindInfo("chargername"));
label18_binder.setControl(label18);
binderGroup.addBinderToGroup(ID_LABEL18, label18_binder);
rounddiv9.addView(label18);
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
rounddiv9.addView(button4);

return rounddiv9;
}
public View getRounddiv0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
rounddiv0 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_ROUNDDIV0
,"halign","center"
,"height","176"
,"layout-type","linear"
,"background","#efeff4"
,"width","fill"
,"margin-top","15"
);
View rounddiv6 = (View) getRounddiv6View((UMActivity)context,binderGroup,configure);
rounddiv0.addView(rounddiv6);
View rounddiv7 = (View) getRounddiv7View((UMActivity)context,binderGroup,configure);
rounddiv0.addView(rounddiv7);
View rounddiv8 = (View) getRounddiv8View((UMActivity)context,binderGroup,configure);
rounddiv0.addView(rounddiv8);
View rounddiv9 = (View) getRounddiv9View((UMActivity)context,binderGroup,configure);
rounddiv0.addView(rounddiv9);

return rounddiv0;
}
public View getRounddiv16View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
rounddiv16 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_ROUNDDIV16
,"height","0"
,"weight","1"
,"layout-type","linear"
,"width","fill"
,"valign","center"
,"background-image","at44_top.png"
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
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label7,"content","#{res.task_taskContent}"));
rounddiv16.addView(label7);
textbox2 = (UMTextbox)ThirdControl.createControl(new UMTextbox(context),ID_TEXTBOX2
,"padding-left","2"
,"bindfield","taskcontent"
,"height","fill"
,"weight","1"
,"color","#000000"
,"layout-type","linear"
,"font-size","16"
,"width","0"
,"font-family","default"
);
UMTextBinder textbox2_binder = new UMTextBinder((IUMContextAccessor)context);
textbox2_binder.setBindInfo(new BindInfo("taskcontent"));
textbox2_binder.setControl(textbox2);
binderGroup.addBinderToGroup(ID_TEXTBOX2, textbox2_binder);
rounddiv16.addView(textbox2);

return rounddiv16;
}
public View getRounddiv17View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
rounddiv17 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_ROUNDDIV17
,"height","0"
,"weight","1"
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
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label8,"content","#{res.task_completionStandard}"));
rounddiv17.addView(label8);
textbox3 = (UMTextbox)ThirdControl.createControl(new UMTextbox(context),ID_TEXTBOX3
,"padding-left","2"
,"bindfield","completestandard"
,"height","fill"
,"weight","1"
,"color","#000000"
,"layout-type","linear"
,"font-size","16"
,"width","0"
,"font-family","default"
);
UMTextBinder textbox3_binder = new UMTextBinder((IUMContextAccessor)context);
textbox3_binder.setBindInfo(new BindInfo("completestandard"));
textbox3_binder.setControl(textbox3);
binderGroup.addBinderToGroup(ID_TEXTBOX3, textbox3_binder);
rounddiv17.addView(textbox3);

return rounddiv17;
}
public View getTogglebuttongroup0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
togglebuttongroup0 = (UMToggleButtonGroup)ThirdControl.createControl(new UMToggleButtonGroup(context),ID_TOGGLEBUTTONGROUP0
,"bindfield","priority"
,"height","30"
,"weight","1"
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
,"height","30"
,"color","#e50011"
,"layout-type","hbox"
,"font-size","16"
,"value","3"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,togglebutton0,"textOff","#{res.task_low}"));
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,togglebutton0,"textOn","#{res.task_low}"));
togglebuttongroup0.addView(togglebutton0);
togglebutton1 = (UMToggleButton)ThirdControl.createControl(new UMToggleButton(context),ID_TOGGLEBUTTON1
,"halign","center"
,"weight","1"
,"background-image-off","label_3_middle"
,"width","0"
,"font-pressed-color","#f8f8f8"
,"type","button"
,"background-image-on","label_3_middle_touch"
,"height","30"
,"color","#e50011"
,"layout-type","hbox"
,"font-size","16"
,"value","2"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,togglebutton1,"textOff","#{res.task_medium}"));
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,togglebutton1,"textOn","#{res.task_medium}"));
togglebuttongroup0.addView(togglebutton1);
togglebutton2 = (UMToggleButton)ThirdControl.createControl(new UMToggleButton(context),ID_TOGGLEBUTTON2
,"halign","center"
,"weight","1"
,"background-image-off","label_3_right"
,"width","0"
,"font-pressed-color","#f8f8f8"
,"type","button"
,"background-image-on","label_3_right_touch"
,"height","30"
,"color","#e50011"
,"layout-type","hbox"
,"font-size","16"
,"value","1"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,togglebutton2,"textOff","#{res.task_high}"));
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,togglebutton2,"textOn","#{res.task_high}"));
togglebuttongroup0.addView(togglebutton2);

return togglebuttongroup0;
}
public View getRounddiv18View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
rounddiv18 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_ROUNDDIV18
,"padding-right","15"
,"height","0"
,"weight","1"
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
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label9,"content","#{res.task_priority}"));
rounddiv18.addView(label9);
View togglebuttongroup0 = (View) getTogglebuttongroup0View((UMActivity)context,binderGroup,configure);
rounddiv18.addView(togglebuttongroup0);

return rounddiv18;
}
public View getRounddiv19View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
rounddiv19 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_ROUNDDIV19
,"padding-right","15"
,"height","0"
,"weight","1"
,"layout-type","linear"
,"width","fill"
,"onclick","openfathertask"
,"valign","center"
,"background-image","at44_down.png"
);
rounddiv19.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Task_editActivity.this);
    actionOpenfathertask(rounddiv19,args);

}
});
label15 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL15
,"bindfield","supertaskid"
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
UMTextBinder label15_binder = new UMTextBinder((IUMContextAccessor)context);
label15_binder.setBindInfo(new BindInfo("supertaskid"));
label15_binder.setControl(label15);
binderGroup.addBinderToGroup(ID_LABEL15, label15_binder);
rounddiv19.addView(label15);
label10 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL10
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
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label10,"content","#{res.task_parentTask}"));
rounddiv19.addView(label10);
label16 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL16
,"bindfield","supertaskname"
,"halign","left"
,"height","fill"
,"weight","1"
,"color","#000000"
,"layout-type","linear"
,"font-size","16"
,"width","0"
,"font-family","default"
,"valign","center"
);
UMTextBinder label16_binder = new UMTextBinder((IUMContextAccessor)context);
label16_binder.setBindInfo(new BindInfo("supertaskname"));
label16_binder.setControl(label16);
binderGroup.addBinderToGroup(ID_LABEL16, label16_binder);
rounddiv19.addView(label16);
button3 = (UMButton)ThirdControl.createControl(new UMButton(context),ID_BUTTON3
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
rounddiv19.addView(button3);

return rounddiv19;
}
public View getRounddiv1View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
rounddiv1 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_ROUNDDIV1
,"halign","center"
,"height","176"
,"layout-type","linear"
,"background","#efeff4"
,"width","fill"
,"margin-top","20"
);
View rounddiv16 = (View) getRounddiv16View((UMActivity)context,binderGroup,configure);
rounddiv1.addView(rounddiv16);
View rounddiv17 = (View) getRounddiv17View((UMActivity)context,binderGroup,configure);
rounddiv1.addView(rounddiv17);
View rounddiv18 = (View) getRounddiv18View((UMActivity)context,binderGroup,configure);
rounddiv1.addView(rounddiv18);
View rounddiv19 = (View) getRounddiv19View((UMActivity)context,binderGroup,configure);
rounddiv1.addView(rounddiv19);

return rounddiv1;
}
public View getRounddiv12View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
rounddiv12 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_ROUNDDIV12
,"height","0"
,"weight","1"
,"layout-type","linear"
,"width","fill"
,"valign","center"
,"background-image","at44_top.png"
);
label6 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL6
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
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label6,"content","#{res.task_remingdingMethod}"));
rounddiv12.addView(label6);

return rounddiv12;
}
public View getRounddiv13View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
rounddiv13 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_ROUNDDIV13
,"height","0"
,"weight","1"
,"layout-type","linear"
,"width","fill"
,"valign","center"
,"background-image","at44_mid.png"
);
checkbox0 = (UMCheckbox)ThirdControl.createControl(new UMCheckbox(context),ID_CHECKBOX0
,"bindfield","msg"
,"placeholder",""
,"width","20"
,"height","20"
,"color","#000000"
,"font-size","12"
,"layout-type","linear"
,"margin-left","115"
,"check-on-image","checkbox_select.png"
,"font-family","default"
,"checked","checked"
,"check-off-image","checkbox_noselect.png"
);
UMCheckBoxBinder checkbox0_binder = new UMCheckBoxBinder((IUMContextAccessor)context);
checkbox0_binder.setBindInfo(new BindInfo("msg"));
checkbox0_binder.setControl(checkbox0);
binderGroup.addBinderToGroup(ID_CHECKBOX0, checkbox0_binder);
rounddiv13.addView(checkbox0);
label222 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL222
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
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label222,"content","#{res.task_notice}"));
rounddiv13.addView(label222);
checkbox1 = (UMCheckbox)ThirdControl.createControl(new UMCheckbox(context),ID_CHECKBOX1
,"padding-left","2"
,"bindfield","email"
,"height","20"
,"color","#000000"
,"layout-type","linear"
,"font-size","12"
,"width","20"
,"check-on-image","checkbox_select.png"
,"font-family","default"
,"check-off-image","checkbox_noselect.png"
);
UMCheckBoxBinder checkbox1_binder = new UMCheckBoxBinder((IUMContextAccessor)context);
checkbox1_binder.setBindInfo(new BindInfo("email"));
checkbox1_binder.setControl(checkbox1);
binderGroup.addBinderToGroup(ID_CHECKBOX1, checkbox1_binder);
rounddiv13.addView(checkbox1);
label223 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL223
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
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label223,"content","#{res.task_email}"));
rounddiv13.addView(label223);

return rounddiv13;
}
public View getRounddiv14View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
rounddiv14 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_ROUNDDIV14
,"height","0"
,"weight","1"
,"layout-type","linear"
,"width","fill"
,"valign","center"
,"background-image","at44_down.png"
);
checkbox2 = (UMCheckbox)ThirdControl.createControl(new UMCheckbox(context),ID_CHECKBOX2
,"padding-left","2"
,"bindfield","sms"
,"height","20"
,"color","#000000"
,"layout-type","linear"
,"font-size","12"
,"width","20"
,"check-on-image","checkbox_select.png"
,"margin-left","115"
,"font-family","default"
,"check-off-image","checkbox_noselect.png"
);
UMCheckBoxBinder checkbox2_binder = new UMCheckBoxBinder((IUMContextAccessor)context);
checkbox2_binder.setBindInfo(new BindInfo("sms"));
checkbox2_binder.setControl(checkbox2);
binderGroup.addBinderToGroup(ID_CHECKBOX2, checkbox2_binder);
rounddiv14.addView(checkbox2);
label224 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL224
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
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label224,"content","#{res.task_sms}"));
rounddiv14.addView(label224);
checkbox3 = (UMCheckbox)ThirdControl.createControl(new UMCheckbox(context),ID_CHECKBOX3
,"padding-left","2"
,"bindfield","im"
,"height","20"
,"color","#000000"
,"layout-type","linear"
,"font-size","12"
,"width","20"
,"check-on-image","checkbox_select.png"
,"font-family","default"
,"check-off-image","checkbox_noselect.png"
);
UMCheckBoxBinder checkbox3_binder = new UMCheckBoxBinder((IUMContextAccessor)context);
checkbox3_binder.setBindInfo(new BindInfo("im"));
checkbox3_binder.setControl(checkbox3);
binderGroup.addBinderToGroup(ID_CHECKBOX3, checkbox3_binder);
rounddiv14.addView(checkbox3);
label225 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL225
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
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label225,"content","#{res.task_im}"));
rounddiv14.addView(label225);

return rounddiv14;
}
public View getRounddiv2View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
rounddiv2 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_ROUNDDIV2
,"halign","center"
,"height","132"
,"layout-type","linear"
,"background","#efeff4"
,"width","fill"
,"margin-top","20"
);
View rounddiv12 = (View) getRounddiv12View((UMActivity)context,binderGroup,configure);
rounddiv2.addView(rounddiv12);
View rounddiv13 = (View) getRounddiv13View((UMActivity)context,binderGroup,configure);
rounddiv2.addView(rounddiv13);
View rounddiv14 = (View) getRounddiv14View((UMActivity)context,binderGroup,configure);
rounddiv2.addView(rounddiv14);

return rounddiv2;
}
public View getPanel1View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel1 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL1
,"padding-right","8"
,"padding-left","8"
,"height","26"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"valign","center"
);
label26 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL26
,"bindfield","assistantstructlistcache"
,"halign","left"
,"height","14"
,"color","#000000"
,"layout-type","linear"
,"font-size","12"
,"width","200"
,"font-family","default"
,"display","none"
,"valign","center"
);
UMTextBinder label26_binder = new UMTextBinder((IUMContextAccessor)context);
label26_binder.setBindInfo(new BindInfo("assistantstructlistcache"));
label26_binder.setControl(label26);
binderGroup.addBinderToGroup(ID_LABEL26, label26_binder);
panel1.addView(label26);
label25 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL25
,"bindfield","assistpersonlist"
,"halign","left"
,"height","fill"
,"weight","1"
,"color","#000000"
,"layout-type","linear"
,"font-size","16"
,"width","0"
,"font-family","default"
,"valign","center"
);
UMTextBinder label25_binder = new UMTextBinder((IUMContextAccessor)context);
label25_binder.setBindInfo(new BindInfo("assistpersonlist"));
label25_binder.setControl(label25);
binderGroup.addBinderToGroup(ID_LABEL25, label25_binder);
panel1.addView(label25);
image0 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_IMAGE0
,"height","13"
,"layout-type","linear"
,"width","8"
,"scaletype","fitcenter"
,"src","ecm_arrow_right.png"
);
panel1.addView(image0);

return panel1;
}
public View getRounddiv10View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
rounddiv10 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_ROUNDDIV10
,"padding-right","15"
,"height","0"
,"weight","1"
,"layout-type","linear"
,"width","fill"
,"onclick","opencrowref"
,"valign","center"
,"background-image","at44_top.png"
);
rounddiv10.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Task_editActivity.this);
    actionOpencrowref(rounddiv10,args);

}
});
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
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label4,"content","#{res.task_assistant}"));
rounddiv10.addView(label4);
View panel1 = (View) getPanel1View((UMActivity)context,binderGroup,configure);
rounddiv10.addView(panel1);

return rounddiv10;
}
public View getPanel2View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel2 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL2
,"padding-right","8"
,"padding-left","8"
,"height","26"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"valign","center"
);
label28 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL28
,"bindfield","exammanstructlistcache"
,"halign","left"
,"height","14"
,"color","#000000"
,"layout-type","linear"
,"font-size","12"
,"width","200"
,"font-family","default"
,"display","none"
,"valign","center"
);
UMTextBinder label28_binder = new UMTextBinder((IUMContextAccessor)context);
label28_binder.setBindInfo(new BindInfo("exammanstructlistcache"));
label28_binder.setControl(label28);
binderGroup.addBinderToGroup(ID_LABEL28, label28_binder);
panel2.addView(label28);
label27 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL27
,"bindfield","exammanpsnlist"
,"halign","left"
,"height","fill"
,"weight","1"
,"color","#000000"
,"layout-type","linear"
,"font-size","16"
,"width","0"
,"font-family","default"
,"valign","center"
);
UMTextBinder label27_binder = new UMTextBinder((IUMContextAccessor)context);
label27_binder.setBindInfo(new BindInfo("exammanpsnlist"));
label27_binder.setControl(label27);
binderGroup.addBinderToGroup(ID_LABEL27, label27_binder);
panel2.addView(label27);
image1 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_IMAGE1
,"height","13"
,"layout-type","linear"
,"width","8"
,"scaletype","fitcenter"
,"src","ecm_arrow_right.png"
);
panel2.addView(image1);

return panel2;
}
public View getRounddiv11View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
rounddiv11 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_ROUNDDIV11
,"padding-right","15"
,"height","0"
,"weight","1"
,"layout-type","linear"
,"width","fill"
,"onclick","openpsnref"
,"valign","center"
,"background-image","at44_down.png"
);
rounddiv11.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Task_editActivity.this);
    actionOpenpsnref(rounddiv11,args);

}
});
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
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label5,"content","#{res.task_viewer}"));
rounddiv11.addView(label5);
View panel2 = (View) getPanel2View((UMActivity)context,binderGroup,configure);
rounddiv11.addView(panel2);

return rounddiv11;
}
public View getRounddiv3View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
rounddiv3 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_ROUNDDIV3
,"halign","center"
,"height","88"
,"layout-type","linear"
,"background","#efeff4"
,"width","fill"
,"margin-top","20"
);
View rounddiv10 = (View) getRounddiv10View((UMActivity)context,binderGroup,configure);
rounddiv3.addView(rounddiv10);
View rounddiv11 = (View) getRounddiv11View((UMActivity)context,binderGroup,configure);
rounddiv3.addView(rounddiv11);

return rounddiv3;
}
public View getRounddiv55View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
rounddiv55 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_ROUNDDIV55
,"padding-right","15"
,"height","42"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"valign","center"
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
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label3,"content","#{res.task_comments}"));
rounddiv55.addView(label3);
textbox12 = (UMTextbox)ThirdControl.createControl(new UMTextbox(context),ID_TEXTBOX12
,"padding-left","2"
,"bindfield","remark"
,"height","fill"
,"weight","1"
,"color","#000000"
,"layout-type","linear"
,"font-size","16"
,"width","0"
,"font-family","default"
);
UMTextBinder textbox12_binder = new UMTextBinder((IUMContextAccessor)context);
textbox12_binder.setBindInfo(new BindInfo("remark"));
textbox12_binder.setControl(textbox12);
binderGroup.addBinderToGroup(ID_TEXTBOX12, textbox12_binder);
rounddiv55.addView(textbox12);

return rounddiv55;
}
public View getRounddiv5View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
rounddiv5 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_ROUNDDIV5
,"height","44"
,"layout-type","linear"
,"background","#c8c7cc"
,"width","fill"
,"margin-top","20"
,"valign","center"
);
View rounddiv55 = (View) getRounddiv55View((UMActivity)context,binderGroup,configure);
rounddiv5.addView(rounddiv55);

return rounddiv5;
}
public View getRounddiv44View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
rounddiv44 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_ROUNDDIV44
,"padding-right","15"
,"height","42"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"valign","center"
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
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label1,"content","#{res.task_attachment}"));
rounddiv44.addView(label1);
label2 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL2
,"bindfield","count"
,"halign","left"
,"height","17"
,"weight","1"
,"color","#000000"
,"layout-type","linear"
,"font-size","16"
,"width","0"
,"font-family","default"
,"valign","center"
);
UMTextBinder label2_binder = new UMTextBinder((IUMContextAccessor)context);
label2_binder.setBindInfo(new BindInfo("count"));
label2_binder.setControl(label2);
binderGroup.addBinderToGroup(ID_LABEL2, label2_binder);
rounddiv44.addView(label2);
button2 = (UMButton)ThirdControl.createControl(new UMButton(context),ID_BUTTON2
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
rounddiv44.addView(button2);

return rounddiv44;
}
public View getRounddiv4View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
rounddiv4 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_ROUNDDIV4
,"height","44"
,"layout-type","linear"
,"background","#c8c7cc"
,"width","fill"
,"onclick","openattachwin"
,"margin-top","20"
,"valign","center"
);
rounddiv4.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Task_editActivity.this);
    actionOpenattachwin(rounddiv4,args);

}
});
View rounddiv44 = (View) getRounddiv44View((UMActivity)context,binderGroup,configure);
rounddiv4.addView(rounddiv44);

return rounddiv4;
}
public View getPanel11View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel11 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL11
,"halign","center"
,"height","wrap"
,"layout-type","linear"
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
View rounddiv5 = (View) getRounddiv5View((UMActivity)context,binderGroup,configure);
panel11.addView(rounddiv5);
View rounddiv4 = (View) getRounddiv4View((UMActivity)context,binderGroup,configure);
panel11.addView(rounddiv4);

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
,"onload","detailonload"
,"layout-type","linear"
,"width","fill"
,"margin-top","15"
);
View Scrollview_panel11 = (View) getScrollview_panel11View((UMActivity)context,binderGroup,configure);
panel0.addView(Scrollview_panel11);

return panel0;
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

return viewPage0;
}
public UMWindow getCurrentWindow(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
task_edit = (UMWindow)ThirdControl.createControl(new UMWindow(context),ID_TASK_EDIT
,"halign","center"
,"height","fill"
,"layout","vbox"
,"width","fill"
,"context","detailtask"
,"controller","task_editController"
,"namespace","nc.bs.oa.oama.ecm"
);
View viewPage0 = (View) getViewPage0View((UMActivity)context,binderGroup,configure);
task_edit.addView(viewPage0);

return (UMWindow)task_edit;
}

	
	public void actionReturnlist(View control, UMEventArgs args) {
    String actionid = "returnlist";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "returnlist",UMActivity.getViewId(control),args);
}
public void actionBacklist(View control, UMEventArgs args) {
    String actionid = "backlist";
    args.put("message","#{res.task_tipdialog}");
    args.put("title","#{res.task_cancel}");
    args.put("okaction","returnlist");
    args.put("okbuttontitle","#{res.task_ok}");
    args.put("style","ok-cancel");
    args.put("containerName","");
    args.put("cancelbuttontitle","#{res.task_back}");
  ActionProcessor.exec(this, actionid, args);
UMView.openDialog(args);
}
public void actionOpenfathertask(View control, UMEventArgs args) {
    String actionid = "openfathertask";
    args.put("referenceid","nc.bs.oa.oama.ecm.Task_fathertask");
  this.dataCollect();
    args.put("mapping","{\"supertaskname\":\"taskname\",\"supertaskid\":\"taskid\"}");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.openReference(args);
}
public void actionDetailonload(View control, UMEventArgs args) {
    String actionid = "detailonload";
  this.dataCollect();
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "detailonload",UMActivity.getViewId(control),args);
}
public void actionUMonUnload(View control, UMEventArgs args) {
    String actionid = "UMonUnload";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "UMonUnload",UMActivity.getViewId(control),args);
}
public void actionOpencrowref(View control, UMEventArgs args) {
    String actionid = "opencrowref";
    args.put("referenceid","nc.bs.oa.oama.ecm.Task_responseref");
  this.dataCollect();
    args.put("mapping","{\"assistpersonlist\":\"assistpersonlist\",\"assistantstructlistcache\":\"assistantstructlistcache\"}");
    args.put("containerName","");
    args.put("checkrows","#{assistantstructlistcache}");
  ActionProcessor.exec(this, actionid, args);
UMView.openReference(args);
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
public void actionReturnpsn(View control, UMEventArgs args) {
    String actionid = "returnpsn";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "returnpsn",UMActivity.getViewId(control),args);
}
public void actionEdittask(View control, UMEventArgs args) {
    String actionid = "edittask";
    args.put("viewid","nc.bs.oa.oama.oatask.DetailtaskExtendController");
    args.put("allrows","#{CONTEXT}");
  this.dataCollect();
    args.put("action","editTask");
    args.put("callback","returntip");
    args.put("autoDataBinding","true");
    args.put("contextmapping","detaildata");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMService.callAction(args);
}
public void actionReturntip(View control, UMEventArgs args) {
    String actionid = "returntip";
    args.put("message","#{res.task_dosuccess}");
    args.put("title","提示");
    args.put("abc","#{detaildata}");
    args.put("okbuttontitle","#{res.task_ok}");
    args.put("okaction","returnlist");
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
public void actionOpenpsnref(View control, UMEventArgs args) {
    String actionid = "openpsnref";
    args.put("referenceid","nc.bs.oa.oama.ecm.Task_responserefcopy");
  this.dataCollect();
    args.put("mapping","{\"exammanpsnlist\":\"exammanpsnlist\",\"exammanstructlistcache\":\"exammanstructlistcache\"}");
    args.put("containerName","");
    args.put("rows","#{exammanstructlistcache}");
  ActionProcessor.exec(this, actionid, args);
UMView.openReference(args);
}
public void actionUMonInit(View control, UMEventArgs args) {
    String actionid = "UMonInit";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "UMonInit",UMActivity.getViewId(control),args);
}
public void actionCrtPersonInfo(View control, UMEventArgs args) {
    String actionid = "crtPersonInfo";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "crtPersonInfo",UMActivity.getViewId(control),args);
}
public void actionUMonLoad(View control, UMEventArgs args) {
    String actionid = "UMonLoad";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "UMonLoad",UMActivity.getViewId(control),args);
}
public void actionOpenattachwin(View control, UMEventArgs args) {
    String actionid = "openattachwin";
    args.put("attachmentuuid","#{attachmentuuid}");
    args.put("viewid","nc.bs.oa.oama.ecm.Task_attach_edit");
  this.dataCollect();
    args.put("callback","attchreturn");
    args.put("iskeep","true");
    args.put("type","1");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.open(args);
}
public void actionOpenchargeref(View control, UMEventArgs args) {
    String actionid = "openchargeref";
    args.put("referenceid","nc.bs.oa.oama.ecm.Task_refsingleperson");
  this.dataCollect();
    args.put("mapping","{\"chargername\":\"nsme\",\"chargerid\":\"staffid\"}");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.openReference(args);
}
public void actionAttchreturn(View control, UMEventArgs args) {
    String actionid = "attchreturn";
  this.dataCollect();
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "attchreturn",UMActivity.getViewId(control),args);
}


}
