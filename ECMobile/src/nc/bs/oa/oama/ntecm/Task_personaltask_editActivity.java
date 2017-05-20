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

public abstract class Task_personaltask_editActivity extends UMWindowActivity {

	protected UMWindow personaltask_edit = null;
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
protected UMDateEdit dateinput0 = null;
protected XHorizontalLayout rounddiv1 = null;
protected UMLabel label3 = null;
protected UMDateEdit dateinput1 = null;
protected XHorizontalLayout rounddiv2 = null;
protected UMLabel label5 = null;
protected UMTextbox textbox0 = null;
protected XHorizontalLayout rounddiv3 = null;
protected UMLabel label7 = null;
protected UMTextbox textbox1 = null;
protected XHorizontalLayout rounddiv4 = null;
protected UMLabel label9 = null;
protected UMTextbox textbox2 = null;
protected XHorizontalLayout rounddiv5 = null;
protected UMLabel label11 = null;
protected UMToggleButtonGroup togglebuttongroup0 = null;
protected UMToggleButton togglebutton0 = null;
protected UMToggleButton togglebutton1 = null;
protected UMToggleButton togglebutton2 = null;
protected XHorizontalLayout rounddiv6 = null;
protected UMLabel label13 = null;
protected XHorizontalLayout panel10 = null;
protected XHorizontalLayout panel12 = null;
protected UMLabel label6 = null;
protected UMLabel label2 = null;
protected UMButton button2 = null;
protected XHorizontalLayout rounddiv7 = null;
protected UMLabel label15 = null;
protected UMTextbox textbox12 = null;
protected XHorizontalLayout rounddiv8 = null;
protected UMLabel label17 = null;
protected UMLabel label4 = null;
protected UMButton button3 = null;

	
	protected final static int ID_PERSONALTASK_EDIT = 605513821;
protected final static int ID_VIEWPAGE0 = 1205921789;
protected final static int ID_NAVIGATORBAR0 = 554636011;
protected final static int ID_BUTTON0 = 933380334;
protected final static int ID_LABEL0 = 664177887;
protected final static int ID_BUTTON1 = 912732457;
protected final static int ID_PANEL0 = 96991919;
protected final static int ID_SCROLLVIEW_PANEL11 = 1184534909;
protected final static int ID_PANEL11 = 1387576498;
protected final static int ID_ROUNDDIV0 = 270118141;
protected final static int ID_LABEL1 = 1908876141;
protected final static int ID_DATEINPUT0 = 1335447038;
protected final static int ID_ROUNDDIV1 = 2140034618;
protected final static int ID_LABEL3 = 2144209257;
protected final static int ID_DATEINPUT1 = 2059297804;
protected final static int ID_ROUNDDIV2 = 1483851116;
protected final static int ID_LABEL5 = 575220644;
protected final static int ID_TEXTBOX0 = 1736066871;
protected final static int ID_ROUNDDIV3 = 1516721213;
protected final static int ID_LABEL7 = 880681871;
protected final static int ID_TEXTBOX1 = 1558654618;
protected final static int ID_ROUNDDIV4 = 225637005;
protected final static int ID_LABEL9 = 675953198;
protected final static int ID_TEXTBOX2 = 1387763022;
protected final static int ID_ROUNDDIV5 = 1734958920;
protected final static int ID_LABEL11 = 1304262332;
protected final static int ID_TOGGLEBUTTONGROUP0 = 1935736569;
protected final static int ID_TOGGLEBUTTON0 = 1013134098;
protected final static int ID_TOGGLEBUTTON1 = 1478767041;
protected final static int ID_TOGGLEBUTTON2 = 1233426427;
protected final static int ID_ROUNDDIV6 = 1984145225;
protected final static int ID_LABEL13 = 1924550260;
protected final static int ID_PANEL10 = 750476587;
protected final static int ID_PANEL12 = 657599415;
protected final static int ID_LABEL6 = 1559565907;
protected final static int ID_LABEL2 = 1503800111;
protected final static int ID_BUTTON2 = 1041393961;
protected final static int ID_ROUNDDIV7 = 439671285;
protected final static int ID_LABEL15 = 1580512587;
protected final static int ID_TEXTBOX12 = 511430800;
protected final static int ID_ROUNDDIV8 = 2044721625;
protected final static int ID_LABEL17 = 1583768550;
protected final static int ID_LABEL4 = 623761828;
protected final static int ID_BUTTON3 = 2138860694;

	
	
	@Override
	public String getControllerName() {
		return "personaltask_editController";
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
		  idmap.put("personaltask_edit",ID_PERSONALTASK_EDIT);
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
  idmap.put("dateinput0",ID_DATEINPUT0);
  idmap.put("rounddiv1",ID_ROUNDDIV1);
  idmap.put("label3",ID_LABEL3);
  idmap.put("dateinput1",ID_DATEINPUT1);
  idmap.put("rounddiv2",ID_ROUNDDIV2);
  idmap.put("label5",ID_LABEL5);
  idmap.put("textbox0",ID_TEXTBOX0);
  idmap.put("rounddiv3",ID_ROUNDDIV3);
  idmap.put("label7",ID_LABEL7);
  idmap.put("textbox1",ID_TEXTBOX1);
  idmap.put("rounddiv4",ID_ROUNDDIV4);
  idmap.put("label9",ID_LABEL9);
  idmap.put("textbox2",ID_TEXTBOX2);
  idmap.put("rounddiv5",ID_ROUNDDIV5);
  idmap.put("label11",ID_LABEL11);
  idmap.put("togglebuttongroup0",ID_TOGGLEBUTTONGROUP0);
  idmap.put("togglebutton0",ID_TOGGLEBUTTON0);
  idmap.put("togglebutton1",ID_TOGGLEBUTTON1);
  idmap.put("togglebutton2",ID_TOGGLEBUTTON2);
  idmap.put("rounddiv6",ID_ROUNDDIV6);
  idmap.put("label13",ID_LABEL13);
  idmap.put("panel10",ID_PANEL10);
  idmap.put("panel12",ID_PANEL12);
  idmap.put("label6",ID_LABEL6);
  idmap.put("label2",ID_LABEL2);
  idmap.put("button2",ID_BUTTON2);
  idmap.put("rounddiv7",ID_ROUNDDIV7);
  idmap.put("label15",ID_LABEL15);
  idmap.put("textbox12",ID_TEXTBOX12);
  idmap.put("rounddiv8",ID_ROUNDDIV8);
  idmap.put("label17",ID_LABEL17);
  idmap.put("label4",ID_LABEL4);
  idmap.put("button3",ID_BUTTON3);

	}
	
	public void onLoad() {
		ULog.logLC("onLoad", this);
		if(currentPage!=null) {
			currentPage.onLoad();
		}
	
		{ //panel0 - dataonload
    UMEventArgs args = new UMEventArgs(Task_personaltask_editActivity.this);
    actionDataonload(panel0,args);

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
,"color","#e50011"
,"layout-type","linear"
,"font-size","17"
,"onclick","returndialog"
,"font-family","default"
,"valign","center"
,"background-image","btn_back"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,button0,"value","#{res.task_back}"));
button0.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Task_personaltask_editActivity.this);
    actionReturndialog(button0,args);

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
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label0,"content","#{res.task_edit}"));
navigatorbar0.addView(label0);
button1 = (UMButton)ThirdControl.createControl(new UMButton(context),ID_BUTTON1
,"halign","center"
,"pressed-image","button_touch"
,"width","40"
,"background-image-dis","button"
,"height","30"
,"color","#e50011"
,"layout-type","linear"
,"font-size","17"
,"onclick","saveClick"
,"font-family","default"
,"valign","center"
,"background-image","button"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,button1,"value","#{res.task_save}"));
button1.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Task_personaltask_editActivity.this);
    actionSaveClick(button1,args);

}
});
navigatorbar0.addView(button1);

return navigatorbar0;
}
public View getRounddiv0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
rounddiv0 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_ROUNDDIV0
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
dateinput0 = (UMDateEdit)ThirdControl.createControl(new UMDateEdit(context),ID_DATEINPUT0
,"padding-left","2"
,"bindfield","startdate"
,"halign","LEFT"
,"height","fill"
,"color","#000000"
,"layout-type","linear"
,"font-size","16"
,"width","167"
,"background-image-dis","textbox"
,"font-family","default"
);
UMTextBinder dateinput0_binder = new UMTextBinder((IUMContextAccessor)context);
dateinput0_binder.setBindInfo(new BindInfo("startdate"));
dateinput0_binder.setControl(dateinput0);
binderGroup.addBinderToGroup(ID_DATEINPUT0, dateinput0_binder);
rounddiv0.addView(dateinput0);

return rounddiv0;
}
public View getRounddiv1View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
rounddiv1 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_ROUNDDIV1
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
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label3,"content","#{res.task_end}"));
rounddiv1.addView(label3);
dateinput1 = (UMDateEdit)ThirdControl.createControl(new UMDateEdit(context),ID_DATEINPUT1
,"padding-left","2"
,"bindfield","enddate"
,"halign","LEFT"
,"height","fill"
,"color","#000000"
,"layout-type","linear"
,"font-size","16"
,"width","167"
,"background-image-dis","textbox"
,"font-family","default"
);
UMTextBinder dateinput1_binder = new UMTextBinder((IUMContextAccessor)context);
dateinput1_binder.setBindInfo(new BindInfo("enddate"));
dateinput1_binder.setControl(dateinput1);
binderGroup.addBinderToGroup(ID_DATEINPUT1, dateinput1_binder);
rounddiv1.addView(dateinput1);

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
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label5,"content","#{res.task_subject}"));
rounddiv2.addView(label5);
textbox0 = (UMTextbox)ThirdControl.createControl(new UMTextbox(context),ID_TEXTBOX0
,"bindfield","taskname"
,"halign","LEFT"
,"height","fill"
,"weight","1"
,"maxlength","256"
,"color","#000000"
,"layout-type","linear"
,"font-size","16"
,"width","0"
,"background-image-dis","textbox"
,"font-family","default"
);
UMTextBinder textbox0_binder = new UMTextBinder((IUMContextAccessor)context);
textbox0_binder.setBindInfo(new BindInfo("taskname"));
textbox0_binder.setControl(textbox0);
binderGroup.addBinderToGroup(ID_TEXTBOX0, textbox0_binder);
rounddiv2.addView(textbox0);

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
rounddiv3.addView(label7);
textbox1 = (UMTextbox)ThirdControl.createControl(new UMTextbox(context),ID_TEXTBOX1
,"bindfield","taskcontent"
,"halign","LEFT"
,"height","fill"
,"weight","1"
,"maxlength","256"
,"color","#000000"
,"layout-type","linear"
,"font-size","16"
,"width","0"
,"background-image-dis","textbox"
,"font-family","default"
);
UMTextBinder textbox1_binder = new UMTextBinder((IUMContextAccessor)context);
textbox1_binder.setBindInfo(new BindInfo("taskcontent"));
textbox1_binder.setControl(textbox1);
binderGroup.addBinderToGroup(ID_TEXTBOX1, textbox1_binder);
rounddiv3.addView(textbox1);

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
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label9,"content","#{res.task_completionStandard}"));
rounddiv4.addView(label9);
textbox2 = (UMTextbox)ThirdControl.createControl(new UMTextbox(context),ID_TEXTBOX2
,"bindfield","completestandard"
,"halign","LEFT"
,"height","fill"
,"weight","1"
,"maxlength","256"
,"color","#000000"
,"layout-type","linear"
,"font-size","16"
,"width","0"
,"background-image-dis","textbox"
,"font-family","default"
);
UMTextBinder textbox2_binder = new UMTextBinder((IUMContextAccessor)context);
textbox2_binder.setBindInfo(new BindInfo("completestandard"));
textbox2_binder.setControl(textbox2);
binderGroup.addBinderToGroup(ID_TEXTBOX2, textbox2_binder);
rounddiv4.addView(textbox2);

return rounddiv4;
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
,"height","28.0"
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
,"height","28.0"
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
,"height","28.0"
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
public View getRounddiv5View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
rounddiv5 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_ROUNDDIV5
,"padding-right","15"
,"height","44"
,"layout-type","linear"
,"width","fill"
,"valign","center"
,"background-image","at44_mid.png"
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
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label11,"content","#{res.task_priority}"));
rounddiv5.addView(label11);
View togglebuttongroup0 = (View) getTogglebuttongroup0View((UMActivity)context,binderGroup,configure);
rounddiv5.addView(togglebuttongroup0);

return rounddiv5;
}
public View getPanel12View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel12 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL12
,"height","26"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"valign","center"
);
label6 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL6
,"bindfield","taskstate"
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
UMTextBinder label6_binder = new UMTextBinder((IUMContextAccessor)context);
label6_binder.setBindInfo(new BindInfo("taskstate"));
label6_binder.setControl(label6);
binderGroup.addBinderToGroup(ID_LABEL6, label6_binder);
panel12.addView(label6);
label2 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL2
,"bindfield","taskcode"
,"halign","left"
,"height","17"
,"weight","1"
,"color","#000000"
,"layout-type","linear"
,"font-size","16"
,"width","0"
,"font-family","default"
,"display","none"
,"valign","center"
);
UMTextBinder label2_binder = new UMTextBinder((IUMContextAccessor)context);
label2_binder.setBindInfo(new BindInfo("taskcode"));
label2_binder.setControl(label2);
binderGroup.addBinderToGroup(ID_LABEL2, label2_binder);
panel12.addView(label2);
button2 = (UMButton)ThirdControl.createControl(new UMButton(context),ID_BUTTON2
,"halign","center"
,"pressed-image","ecm_arrow_right.png"
,"width","8"
,"background-image-dis","button"
,"height","13"
,"color","#ff0000"
,"font-size","12"
,"layout-type","linear"
,"onclick","openstateref"
,"font-family","default"
,"valign","center"
,"background-image","ecm_arrow_right.png"
);
button2.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Task_personaltask_editActivity.this);
    actionOpenstateref(button2,args);

}
});
panel12.addView(button2);

return panel12;
}
public View getPanel10View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel10 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL10
,"height","26"
,"weight","1"
,"layout-type","linear"
,"background","#ffffff"
,"width","0"
,"onclick","openstateref"
,"valign","center"
);
panel10.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Task_personaltask_editActivity.this);
    actionOpenstateref(panel10,args);

}
});
View panel12 = (View) getPanel12View((UMActivity)context,binderGroup,configure);
panel10.addView(panel12);

return panel10;
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
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label13,"content","#{res.task_taskStatus}"));
rounddiv6.addView(label13);
View panel10 = (View) getPanel10View((UMActivity)context,binderGroup,configure);
rounddiv6.addView(panel10);

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
label15 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL15
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
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label15,"content","#{res.task_comments}"));
rounddiv7.addView(label15);
textbox12 = (UMTextbox)ThirdControl.createControl(new UMTextbox(context),ID_TEXTBOX12
,"padding-left","2"
,"bindfield","remark"
,"halign","LEFT"
,"height","fill"
,"weight","1"
,"maxlength","256"
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
rounddiv7.addView(textbox12);

return rounddiv7;
}
public View getRounddiv8View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
rounddiv8 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_ROUNDDIV8
,"padding-right","15"
,"height","44"
,"layout-type","linear"
,"width","fill"
,"onclick","openattachwin"
,"valign","center"
,"background-image","at44_down.png"
);
rounddiv8.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Task_personaltask_editActivity.this);
    actionOpenattachwin(rounddiv8,args);

}
});
label17 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL17
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
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label17,"content","#{res.task_attachment}"));
rounddiv8.addView(label17);
label4 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL4
,"bindfield","count"
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
UMTextBinder label4_binder = new UMTextBinder((IUMContextAccessor)context);
label4_binder.setBindInfo(new BindInfo("count"));
label4_binder.setControl(label4);
binderGroup.addBinderToGroup(ID_LABEL4, label4_binder);
rounddiv8.addView(label4);
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
rounddiv8.addView(button3);

return rounddiv8;
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
View rounddiv4 = (View) getRounddiv4View((UMActivity)context,binderGroup,configure);
panel11.addView(rounddiv4);
View rounddiv5 = (View) getRounddiv5View((UMActivity)context,binderGroup,configure);
panel11.addView(rounddiv5);
View rounddiv6 = (View) getRounddiv6View((UMActivity)context,binderGroup,configure);
panel11.addView(rounddiv6);
View rounddiv7 = (View) getRounddiv7View((UMActivity)context,binderGroup,configure);
panel11.addView(rounddiv7);
View rounddiv8 = (View) getRounddiv8View((UMActivity)context,binderGroup,configure);
panel11.addView(rounddiv8);

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
,"onload","dataonload"
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
personaltask_edit = (UMWindow)ThirdControl.createControl(new UMWindow(context),ID_PERSONALTASK_EDIT
,"halign","center"
,"height","fill"
,"layout","vbox"
,"width","fill"
,"context","personaltask"
,"controller","personaltask_editController"
,"namespace","nc.bs.oa.oama.ecm"
);
View viewPage0 = (View) getViewPage0View((UMActivity)context,binderGroup,configure);
personaltask_edit.addView(viewPage0);

return (UMWindow)personaltask_edit;
}

	
	public void actionCloseWin(View control, UMEventArgs args) {
    String actionid = "closeWin";
    args.put("viewid","nc.bs.oa.oama.ecm.Task_mainviewpsn");
    args.put("iskeep","false");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.open(args);
}
public void actionOpenstateref(View control, UMEventArgs args) {
    String actionid = "openstateref";
    args.put("referenceid","nc.bs.oa.oama.ecm.Task_taskstate");
  this.dataCollect();
    args.put("mapping","{\"taskstate\":\"enumname\",\"taskcode\":\"enumid\"}");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.openReference(args);
}
public void actionUMonUnload(View control, UMEventArgs args) {
    String actionid = "UMonUnload";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "UMonUnload",UMActivity.getViewId(control),args);
}
public void actionUMonComplete(View control, UMEventArgs args) {
    String actionid = "UMonComplete";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "UMonComplete",UMActivity.getViewId(control),args);
}
public void actionSaveError(View control, UMEventArgs args) {
    String actionid = "saveError";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "saveError",UMActivity.getViewId(control),args);
}
public void actionUMonDataBinding(View control, UMEventArgs args) {
    String actionid = "UMonDataBinding";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "UMonDataBinding",UMActivity.getViewId(control),args);
}
public void actionSaveClick(View control, UMEventArgs args) {
    String actionid = "saveClick";
    args.put("newtask","#{CONTEXT}");
    args.put("viewid","nc.bs.oa.oama.oatask.ListviewController");
    args.put("error","saveError");
  this.dataCollect();
    args.put("action","savePersonalTask");
    args.put("callback","returntip");
    args.put("autoDataBinding","true");
    args.put("contextmapping","result");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMService.callAction(args);
}
public void actionDataonload(View control, UMEventArgs args) {
    String actionid = "dataonload";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "dataonload",UMActivity.getViewId(control),args);
}
public void actionReturndialog(View control, UMEventArgs args) {
    String actionid = "returndialog";
    args.put("message","#{res.task_tipdialog}");
    args.put("title","#{res.task_back}");
    args.put("okaction","closeWin");
    args.put("okbuttontitle","#{res.task_ok}");
    args.put("style","ok-cancel");
    args.put("containerName","");
    args.put("cancelbuttontitle","#{res.task_cancel}");
  ActionProcessor.exec(this, actionid, args);
UMView.openDialog(args);
}
public void actionReturntip(View control, UMEventArgs args) {
    String actionid = "returntip";
    args.put("message","#{res.task_dosuccess}");
    args.put("title","提示");
    args.put("okaction","poptipforall");
    args.put("okbuttontitle","#{res.task_ok}");
    args.put("style","ok");
  this.dataCollect();
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
public void actionPoptipforall(View control, UMEventArgs args) {
    String actionid = "poptipforall";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "poptipforall",UMActivity.getViewId(control),args);
}
public void actionAttchreturn(View control, UMEventArgs args) {
    String actionid = "attchreturn";
  this.dataCollect();
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "attchreturn",UMActivity.getViewId(control),args);
}


}
