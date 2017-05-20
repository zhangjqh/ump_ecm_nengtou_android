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

public abstract class Msg_AllReadMessageListActivity extends UMWindowActivity {

	protected UMWindow msg_AllReadMessageList = null;
protected XVerticalLayout viewPage0 = null;
protected XVerticalLayout panel0 = null;
protected XHorizontalLayout navigatorbar0 = null;
protected UMButton button0 = null;
protected UMLabel label0 = null;
protected UMButton button1 = null;
protected XHorizontalLayout panel1 = null;
protected UMToggleButtonGroup togglebuttongroup0 = null;
protected UMToggleButton togglebutton0 = null;
protected UMToggleButton togglebutton1 = null;
protected UMToggleButton togglebutton2 = null;
protected UMListViewBase listview0 = null;
protected XVerticalLayout listview0_childWgt0 = null;
protected XHorizontalLayout listview0_childWgt0_panel1 = null;
protected XHorizontalLayout listview0_childWgt0_panel2 = null;
protected UMImage listview0_childWgt0_image0 = null;
protected XVerticalLayout listview0_childWgt0_panel3 = null;
protected XHorizontalLayout listview0_childWgt0_panel8 = null;
protected XHorizontalLayout listview0_childWgt0_panel9 = null;
protected XVerticalLayout listview0_childWgt0_panel12 = null;
protected UMLabel listview0_childWgt0_label0 = null;
protected XVerticalLayout listview0_childWgt0_panel11 = null;
protected UMLabel listview0_childWgt0_label1 = null;
protected XHorizontalLayout listview0_childWgt0_panel5 = null;
protected XVerticalLayout listview0_childWgt0_panel6 = null;
protected UMLabel listview0_childWgt0_msgSendBy = null;
protected XVerticalLayout listview0_childWgt0_panel4 = null;
protected XVerticalLayout listview0_childWgt0_panel7 = null;
protected UMLabel listview0_childWgt0_datetime = null;
protected XHorizontalLayout listview0_childWgt0_panel10 = null;
protected UMImage listview0_childWgt0_image1 = null;
protected XVerticalLayout listview0_childWgt1 = null;
protected XHorizontalLayout listview0_childWgt1_panel1 = null;
protected XHorizontalLayout listview0_childWgt1_panel2 = null;
protected UMImage listview0_childWgt1_image0 = null;
protected XVerticalLayout listview0_childWgt1_panel3 = null;
protected XHorizontalLayout listview0_childWgt1_panel8 = null;
protected XHorizontalLayout listview0_childWgt1_panel9 = null;
protected XVerticalLayout listview0_childWgt1_panel12 = null;
protected UMLabel listview0_childWgt1_label0 = null;
protected XVerticalLayout listview0_childWgt1_panel11 = null;
protected UMLabel listview0_childWgt1_label1 = null;
protected XHorizontalLayout listview0_childWgt1_panel5 = null;
protected XVerticalLayout listview0_childWgt1_panel6 = null;
protected UMLabel listview0_childWgt1_msgSendBy = null;
protected XVerticalLayout listview0_childWgt1_panel4 = null;
protected XVerticalLayout listview0_childWgt1_panel7 = null;
protected UMLabel listview0_childWgt1_datetime = null;
protected XHorizontalLayout listview0_childWgt1_panel10 = null;
protected UMImage listview0_childWgt1_image1 = null;

	
	protected final static int ID_MSG_ALLREADMESSAGELIST = 759591543;
protected final static int ID_VIEWPAGE0 = 1583090733;
protected final static int ID_PANEL0 = 1988186880;
protected final static int ID_NAVIGATORBAR0 = 1914779351;
protected final static int ID_BUTTON0 = 1984830532;
protected final static int ID_LABEL0 = 1859981503;
protected final static int ID_BUTTON1 = 1545321650;
protected final static int ID_PANEL1 = 1111995133;
protected final static int ID_TOGGLEBUTTONGROUP0 = 292043330;
protected final static int ID_TOGGLEBUTTON0 = 1070944186;
protected final static int ID_TOGGLEBUTTON1 = 981835763;
protected final static int ID_TOGGLEBUTTON2 = 209248894;
protected final static int ID_LISTVIEW0 = 2370401;
protected final static int ID_LISTVIEW0_CHILDWGT0 = 383144111;
protected final static int ID_LISTVIEW0_CHILDWGT0_PANEL1 = 533498589;
protected final static int ID_LISTVIEW0_CHILDWGT0_PANEL2 = 690767160;
protected final static int ID_LISTVIEW0_CHILDWGT0_IMAGE0 = 1066047988;
protected final static int ID_LISTVIEW0_CHILDWGT0_PANEL3 = 1226565620;
protected final static int ID_LISTVIEW0_CHILDWGT0_PANEL8 = 947380547;
protected final static int ID_LISTVIEW0_CHILDWGT0_PANEL9 = 717545308;
protected final static int ID_LISTVIEW0_CHILDWGT0_PANEL12 = 1253255648;
protected final static int ID_LISTVIEW0_CHILDWGT0_LABEL0 = 552235543;
protected final static int ID_LISTVIEW0_CHILDWGT0_PANEL11 = 1858643939;
protected final static int ID_LISTVIEW0_CHILDWGT0_LABEL1 = 442137407;
protected final static int ID_LISTVIEW0_CHILDWGT0_PANEL5 = 706636867;
protected final static int ID_LISTVIEW0_CHILDWGT0_PANEL6 = 2141545462;
protected final static int ID_LISTVIEW0_CHILDWGT0_MSGSENDBY = 1866453847;
protected final static int ID_LISTVIEW0_CHILDWGT0_PANEL4 = 589984411;
protected final static int ID_LISTVIEW0_CHILDWGT0_PANEL7 = 225611226;
protected final static int ID_LISTVIEW0_CHILDWGT0_DATETIME = 2097571401;
protected final static int ID_LISTVIEW0_CHILDWGT0_PANEL10 = 235550286;
protected final static int ID_LISTVIEW0_CHILDWGT0_IMAGE1 = 793525338;
protected final static int ID_LISTVIEW0_CHILDWGT1 = 999316542;
protected final static int ID_LISTVIEW0_CHILDWGT1_PANEL1 = 974559610;
protected final static int ID_LISTVIEW0_CHILDWGT1_PANEL2 = 821020200;
protected final static int ID_LISTVIEW0_CHILDWGT1_IMAGE0 = 1586091017;
protected final static int ID_LISTVIEW0_CHILDWGT1_PANEL3 = 1682612670;
protected final static int ID_LISTVIEW0_CHILDWGT1_PANEL8 = 1933399722;
protected final static int ID_LISTVIEW0_CHILDWGT1_PANEL9 = 1942940173;
protected final static int ID_LISTVIEW0_CHILDWGT1_PANEL12 = 473983662;
protected final static int ID_LISTVIEW0_CHILDWGT1_LABEL0 = 1204149772;
protected final static int ID_LISTVIEW0_CHILDWGT1_PANEL11 = 1651993806;
protected final static int ID_LISTVIEW0_CHILDWGT1_LABEL1 = 1453164896;
protected final static int ID_LISTVIEW0_CHILDWGT1_PANEL5 = 748791344;
protected final static int ID_LISTVIEW0_CHILDWGT1_PANEL6 = 2113629029;
protected final static int ID_LISTVIEW0_CHILDWGT1_MSGSENDBY = 534822852;
protected final static int ID_LISTVIEW0_CHILDWGT1_PANEL4 = 1588858093;
protected final static int ID_LISTVIEW0_CHILDWGT1_PANEL7 = 1536160085;
protected final static int ID_LISTVIEW0_CHILDWGT1_DATETIME = 1291127416;
protected final static int ID_LISTVIEW0_CHILDWGT1_PANEL10 = 925623077;
protected final static int ID_LISTVIEW0_CHILDWGT1_IMAGE1 = 196740006;

	
	
	@Override
	public String getControllerName() {
		return "msg_AllReadMessageListController";
	}
	
	@Override
	public String getContextName() {
		return "messageGroup";
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
		  idmap.put("msg_AllReadMessageList",ID_MSG_ALLREADMESSAGELIST);
  idmap.put("viewPage0",ID_VIEWPAGE0);
  idmap.put("panel0",ID_PANEL0);
  idmap.put("navigatorbar0",ID_NAVIGATORBAR0);
  idmap.put("button0",ID_BUTTON0);
  idmap.put("label0",ID_LABEL0);
  idmap.put("button1",ID_BUTTON1);
  idmap.put("panel1",ID_PANEL1);
  idmap.put("togglebuttongroup0",ID_TOGGLEBUTTONGROUP0);
  idmap.put("togglebutton0",ID_TOGGLEBUTTON0);
  idmap.put("togglebutton1",ID_TOGGLEBUTTON1);
  idmap.put("togglebutton2",ID_TOGGLEBUTTON2);
  idmap.put("listview0",ID_LISTVIEW0);
  idmap.put("listview0_childWgt0",ID_LISTVIEW0_CHILDWGT0);
  idmap.put("listview0_childWgt0_panel1",ID_LISTVIEW0_CHILDWGT0_PANEL1);
  idmap.put("listview0_childWgt0_panel2",ID_LISTVIEW0_CHILDWGT0_PANEL2);
  idmap.put("listview0_childWgt0_image0",ID_LISTVIEW0_CHILDWGT0_IMAGE0);
  idmap.put("listview0_childWgt0_panel3",ID_LISTVIEW0_CHILDWGT0_PANEL3);
  idmap.put("listview0_childWgt0_panel8",ID_LISTVIEW0_CHILDWGT0_PANEL8);
  idmap.put("listview0_childWgt0_panel9",ID_LISTVIEW0_CHILDWGT0_PANEL9);
  idmap.put("listview0_childWgt0_panel12",ID_LISTVIEW0_CHILDWGT0_PANEL12);
  idmap.put("listview0_childWgt0_label0",ID_LISTVIEW0_CHILDWGT0_LABEL0);
  idmap.put("listview0_childWgt0_panel11",ID_LISTVIEW0_CHILDWGT0_PANEL11);
  idmap.put("listview0_childWgt0_label1",ID_LISTVIEW0_CHILDWGT0_LABEL1);
  idmap.put("listview0_childWgt0_panel5",ID_LISTVIEW0_CHILDWGT0_PANEL5);
  idmap.put("listview0_childWgt0_panel6",ID_LISTVIEW0_CHILDWGT0_PANEL6);
  idmap.put("listview0_childWgt0_msgSendBy",ID_LISTVIEW0_CHILDWGT0_MSGSENDBY);
  idmap.put("listview0_childWgt0_panel4",ID_LISTVIEW0_CHILDWGT0_PANEL4);
  idmap.put("listview0_childWgt0_panel7",ID_LISTVIEW0_CHILDWGT0_PANEL7);
  idmap.put("listview0_childWgt0_datetime",ID_LISTVIEW0_CHILDWGT0_DATETIME);
  idmap.put("listview0_childWgt0_panel10",ID_LISTVIEW0_CHILDWGT0_PANEL10);
  idmap.put("listview0_childWgt0_image1",ID_LISTVIEW0_CHILDWGT0_IMAGE1);
  idmap.put("listview0_childWgt1",ID_LISTVIEW0_CHILDWGT1);
  idmap.put("listview0_childWgt1_panel1",ID_LISTVIEW0_CHILDWGT1_PANEL1);
  idmap.put("listview0_childWgt1_panel2",ID_LISTVIEW0_CHILDWGT1_PANEL2);
  idmap.put("listview0_childWgt1_image0",ID_LISTVIEW0_CHILDWGT1_IMAGE0);
  idmap.put("listview0_childWgt1_panel3",ID_LISTVIEW0_CHILDWGT1_PANEL3);
  idmap.put("listview0_childWgt1_panel8",ID_LISTVIEW0_CHILDWGT1_PANEL8);
  idmap.put("listview0_childWgt1_panel9",ID_LISTVIEW0_CHILDWGT1_PANEL9);
  idmap.put("listview0_childWgt1_panel12",ID_LISTVIEW0_CHILDWGT1_PANEL12);
  idmap.put("listview0_childWgt1_label0",ID_LISTVIEW0_CHILDWGT1_LABEL0);
  idmap.put("listview0_childWgt1_panel11",ID_LISTVIEW0_CHILDWGT1_PANEL11);
  idmap.put("listview0_childWgt1_label1",ID_LISTVIEW0_CHILDWGT1_LABEL1);
  idmap.put("listview0_childWgt1_panel5",ID_LISTVIEW0_CHILDWGT1_PANEL5);
  idmap.put("listview0_childWgt1_panel6",ID_LISTVIEW0_CHILDWGT1_PANEL6);
  idmap.put("listview0_childWgt1_msgSendBy",ID_LISTVIEW0_CHILDWGT1_MSGSENDBY);
  idmap.put("listview0_childWgt1_panel4",ID_LISTVIEW0_CHILDWGT1_PANEL4);
  idmap.put("listview0_childWgt1_panel7",ID_LISTVIEW0_CHILDWGT1_PANEL7);
  idmap.put("listview0_childWgt1_datetime",ID_LISTVIEW0_CHILDWGT1_DATETIME);
  idmap.put("listview0_childWgt1_panel10",ID_LISTVIEW0_CHILDWGT1_PANEL10);
  idmap.put("listview0_childWgt1_image1",ID_LISTVIEW0_CHILDWGT1_IMAGE1);

	}
	
	public void onLoad() {
		ULog.logLC("onLoad", this);
		if(currentPage!=null) {
			currentPage.onLoad();
		}
	
		{ //listview0 - OnLoadAllMsgData
    UMEventArgs args = new UMEventArgs(Msg_AllReadMessageListActivity.this);
    actionOnLoadAllMsgData(listview0,args);

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
,"height","44.0"
,"color","#000000"
,"layout-type","linear"
,"font-size","17"
,"width","fill"
,"font-family","default"
,"valign","center"
,"background-image","navbar_login.png"
);
button0 = (UMButton)ThirdControl.createControl(new UMButton(context),ID_BUTTON0
,"padding-left","20"
,"halign","left"
,"pressed-image","btn_back_touch"
,"width","64"
,"font-pressed-color","#f2adb2"
,"height","44"
,"color","#e50011"
,"layout-type","linear"
,"font-size","17"
,"onclick","onReturnBtnClick"
,"font-family","default"
,"valign","center"
,"background-image","btn_back"
);
button0.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Msg_AllReadMessageListActivity.this);
    actionOnReturnBtnClick(button0,args);

}
});
navigatorbar0.addView(button0);
label0 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL0
,"margin-right","20"
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
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label0,"content","#{res.msg_AllRreadMessage}"));
navigatorbar0.addView(label0);
button1 = (UMButton)ThirdControl.createControl(new UMButton(context),ID_BUTTON1
,"halign","center"
,"pressed-image","btn_add_touch"
,"width","44"
,"font-pressed-color","#f2adb2"
,"height","44"
,"color","#e50011"
,"font-size","17"
,"layout-type","linear"
,"onclick","NewMessage"
,"font-family","default"
,"valign","center"
,"background-image","btn_add"
);
button1.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Msg_AllReadMessageListActivity.this);
    actionNewMessage(button1,args);

}
});
navigatorbar0.addView(button1);

return navigatorbar0;
}
public View getPanel0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel0 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL0
,"halign","center"
,"height","44"
,"layout-type","linear"
,"width","fill"
,"background-image","nav.png"
);
View navigatorbar0 = (View) getNavigatorbar0View((UMActivity)context,binderGroup,configure);
panel0.addView(navigatorbar0);

return panel0;
}
public View getTogglebuttongroup0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
togglebuttongroup0 = (UMToggleButtonGroup)ThirdControl.createControl(new UMToggleButtonGroup(context),ID_TOGGLEBUTTONGROUP0
,"padding-right","15"
,"padding-left","15"
,"height","44"
,"weight","1"
,"layout","hbox"
,"width","0"
,"value","buttongroup"
,"valign","center"
);
togglebutton0 = (UMToggleButton)ThirdControl.createControl(new UMToggleButton(context),ID_TOGGLEBUTTON0
,"halign","center"
,"background-image-off","label_3_left.png"
,"width","106.66666666666667"
,"font-pressed-color","#ffffff"
,"type","button"
,"background-image-on","label_3_left_touch"
,"height","42.0"
,"color","#e50011"
,"layout-type","hbox"
,"font-size","17"
,"value","0"
,"onclick","OpenUnReadMessageList"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,togglebutton0,"textOff","#{res.msg_Unread}"));
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,togglebutton0,"textOn","#{res.msg_Unread}"));
togglebutton0.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Msg_AllReadMessageListActivity.this);
    actionOpenUnReadMessageList(togglebutton0,args);

}
});
togglebuttongroup0.addView(togglebutton0);
togglebutton1 = (UMToggleButton)ThirdControl.createControl(new UMToggleButton(context),ID_TOGGLEBUTTON1
,"halign","center"
,"background-image-off","label_3_middle.png"
,"width","106.66666666666667"
,"font-pressed-color","#ffffff"
,"type","button"
,"background-image-on","label_3_middle_touch"
,"height","42.0"
,"color","#e50011"
,"layout-type","hbox"
,"font-size","17"
,"value","1"
,"onclick","OpenReadMessageList"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,togglebutton1,"textOff","#{res.msg_Read}"));
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,togglebutton1,"textOn","#{res.msg_Read}"));
togglebutton1.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Msg_AllReadMessageListActivity.this);
    actionOpenReadMessageList(togglebutton1,args);

}
});
togglebuttongroup0.addView(togglebutton1);
togglebutton2 = (UMToggleButton)ThirdControl.createControl(new UMToggleButton(context),ID_TOGGLEBUTTON2
,"halign","center"
,"background-image-off","label_3_right.png"
,"width","106.66666666666667"
,"font-pressed-color","#ffffff"
,"type","button"
,"background-image-on","label_3_right_touch"
,"height","42.0"
,"color","#e50011"
,"layout-type","hbox"
,"font-size","17"
,"value","2"
,"font-family","default"
,"valign","center"
,"checked","true"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,togglebutton2,"textOff","#{res.msg_AllRead}"));
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,togglebutton2,"textOn","#{res.msg_AllRead}"));
togglebuttongroup0.addView(togglebutton2);

return togglebuttongroup0;
}
public View getPanel1View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel1 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL1
,"height","40"
,"layout-type","linear"
,"width","fill"
,"valign","center"
);
View togglebuttongroup0 = (View) getTogglebuttongroup0View((UMActivity)context,binderGroup,configure);
panel1.addView(togglebuttongroup0);

return panel1;
}
public View getListview0_childWgt0_panel2View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt0_panel2 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT0_PANEL2
,"margin-right","5"
,"height","fill"
,"layout-type","linear"
,"width","35"
,"margin-left","15"
,"valign","center"
);
listview0_childWgt0_image0 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_LISTVIEW0_CHILDWGT0_IMAGE0
,"height","35"
,"layout-type","linear"
,"width","35"
,"scaletype","fitcenter"
,"src","infounread.png"
);
listview0_childWgt0_panel2.addView(listview0_childWgt0_image0);

return listview0_childWgt0_panel2;
}
public View getListview0_childWgt0_panel12View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt0_panel12 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_LISTVIEW0_CHILDWGT0_PANEL12
,"halign","left"
,"height","32"
,"weight","1"
,"layout-type","linear"
,"width","0"
);
listview0_childWgt0_label0 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT0_LABEL0
,"content","topic"
,"bindfield","topic"
,"halign","left"
,"height","20.0"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","173"
,"font-family","default"
,"valign","center"
);
UMTextBinder listview0_childWgt0_label0_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt0_label0_binder.setBindInfo(new BindInfo("topic"));
listview0_childWgt0_label0_binder.setControl(listview0_childWgt0_label0);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT0_LABEL0, listview0_childWgt0_label0_binder);
listview0_childWgt0_panel12.addView(listview0_childWgt0_label0);

return listview0_childWgt0_panel12;
}
public View getListview0_childWgt0_panel11View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt0_panel11 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_LISTVIEW0_CHILDWGT0_PANEL11
,"halign","right"
,"height","32"
,"layout-type","linear"
,"width","90"
);
listview0_childWgt0_label1 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT0_LABEL1
,"content","businesstype"
,"bindfield","businessType"
,"halign","right"
,"height","20.0"
,"widthwrap","94.0"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","wrap"
,"font-family","default"
,"valign","center"
);
UMTextBinder listview0_childWgt0_label1_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt0_label1_binder.setBindInfo(new BindInfo("businessType"));
listview0_childWgt0_label1_binder.setControl(listview0_childWgt0_label1);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT0_LABEL1, listview0_childWgt0_label1_binder);
listview0_childWgt0_panel11.addView(listview0_childWgt0_label1);

return listview0_childWgt0_panel11;
}
public View getListview0_childWgt0_panel9View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt0_panel9 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT0_PANEL9
,"height","32"
,"layout-type","linear"
,"width","fill"
,"valign","center"
);
View listview0_childWgt0_panel12 = (View) getListview0_childWgt0_panel12View((UMActivity)context,binderGroup,configure);
listview0_childWgt0_panel9.addView(listview0_childWgt0_panel12);
View listview0_childWgt0_panel11 = (View) getListview0_childWgt0_panel11View((UMActivity)context,binderGroup,configure);
listview0_childWgt0_panel9.addView(listview0_childWgt0_panel11);

return listview0_childWgt0_panel9;
}
public View getListview0_childWgt0_panel8View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt0_panel8 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT0_PANEL8
,"height","34"
,"layout-type","linear"
,"width","fill"
,"valign","center"
);
View listview0_childWgt0_panel9 = (View) getListview0_childWgt0_panel9View((UMActivity)context,binderGroup,configure);
listview0_childWgt0_panel8.addView(listview0_childWgt0_panel9);

return listview0_childWgt0_panel8;
}
public View getListview0_childWgt0_panel6View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt0_panel6 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_LISTVIEW0_CHILDWGT0_PANEL6
,"halign","left"
,"height","20"
,"weight","1"
,"layout-type","linear"
,"width","0"
);
listview0_childWgt0_msgSendBy = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT0_MSGSENDBY
,"bindfield","sendBy"
,"halign","left"
,"widthwrap","75.0"
,"width","wrap"
,"content","msgSendBy"
,"height","wrap"
,"color","#6f6f6f"
,"heightwrap","19.0"
,"font-size","13"
,"layout-type","linear"
,"font-family","default"
,"valign","center"
);
UMTextBinder listview0_childWgt0_msgSendBy_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt0_msgSendBy_binder.setBindInfo(new BindInfo("sendBy"));
listview0_childWgt0_msgSendBy_binder.setControl(listview0_childWgt0_msgSendBy);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT0_MSGSENDBY, listview0_childWgt0_msgSendBy_binder);
listview0_childWgt0_panel6.addView(listview0_childWgt0_msgSendBy);

return listview0_childWgt0_panel6;
}
public View getListview0_childWgt0_panel7View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt0_panel7 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_LISTVIEW0_CHILDWGT0_PANEL7
,"halign","right"
,"height","20"
,"weight","1"
,"layout-type","linear"
,"width","0"
);
listview0_childWgt0_datetime = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT0_DATETIME
,"content","datetime"
,"bindfield","sendDate"
,"halign","right"
,"height","20"
,"widthwrap","56.0"
,"color","#0852a5"
,"layout-type","linear"
,"font-size","13"
,"width","wrap"
,"font-family","default"
,"valign","center"
);
UMTextBinder listview0_childWgt0_datetime_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt0_datetime_binder.setBindInfo(new BindInfo("sendDate"));
listview0_childWgt0_datetime_binder.setControl(listview0_childWgt0_datetime);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT0_DATETIME, listview0_childWgt0_datetime_binder);
listview0_childWgt0_panel7.addView(listview0_childWgt0_datetime);

return listview0_childWgt0_panel7;
}
public View getListview0_childWgt0_panel5View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt0_panel5 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT0_PANEL5
,"height","32"
,"layout-type","linear"
,"width","fill"
,"background","#ffffff"
,"valign","center"
);
View listview0_childWgt0_panel6 = (View) getListview0_childWgt0_panel6View((UMActivity)context,binderGroup,configure);
listview0_childWgt0_panel5.addView(listview0_childWgt0_panel6);
listview0_childWgt0_panel4 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_LISTVIEW0_CHILDWGT0_PANEL4
,"halign","center"
,"height","20"
,"weight","1"
,"layout-type","linear"
,"width","0"
);
listview0_childWgt0_panel5.addView(listview0_childWgt0_panel4);
View listview0_childWgt0_panel7 = (View) getListview0_childWgt0_panel7View((UMActivity)context,binderGroup,configure);
listview0_childWgt0_panel5.addView(listview0_childWgt0_panel7);

return listview0_childWgt0_panel5;
}
public View getListview0_childWgt0_panel3View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt0_panel3 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_LISTVIEW0_CHILDWGT0_PANEL3
,"margin-right","8"
,"halign","center"
,"height","fill"
,"weight","1"
,"layout-type","linear"
,"width","0"
);
View listview0_childWgt0_panel8 = (View) getListview0_childWgt0_panel8View((UMActivity)context,binderGroup,configure);
listview0_childWgt0_panel3.addView(listview0_childWgt0_panel8);
View listview0_childWgt0_panel5 = (View) getListview0_childWgt0_panel5View((UMActivity)context,binderGroup,configure);
listview0_childWgt0_panel3.addView(listview0_childWgt0_panel5);

return listview0_childWgt0_panel3;
}
public View getListview0_childWgt0_panel10View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt0_panel10 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT0_PANEL10
,"margin-right","15"
,"height","fill"
,"layout-type","linear"
,"width","10"
,"valign","center"
);
listview0_childWgt0_image1 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_LISTVIEW0_CHILDWGT0_IMAGE1
,"height","20"
,"layout-type","linear"
,"width","10"
,"scaletype","fitcenter"
,"src","ecm_set_jt.png"
);
listview0_childWgt0_panel10.addView(listview0_childWgt0_image1);

return listview0_childWgt0_panel10;
}
public View getListview0_childWgt0_panel1View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt0_panel1 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT0_PANEL1
,"padding-top","8"
,"height","80.0"
,"layout-type","linear"
,"width","fill"
,"onclick","onItemClick"
,"valign","center"
,"padding-bottom","8"
,"background-image","list_row_mid3.png"
);
listview0_childWgt0_panel1.setOnClickListener(new OnCursorClickListener(configure) {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Msg_AllReadMessageListActivity.this);
    int position = this.getPosition(v);
    if(position>=0) {
      context.getCursor("cursormsglistalias").setCurrentIndex(position);
    }
    actionOnItemClick(listview0_childWgt0_panel1,args);

}
});
View listview0_childWgt0_panel2 = (View) getListview0_childWgt0_panel2View((UMActivity)context,binderGroup,configure);
listview0_childWgt0_panel1.addView(listview0_childWgt0_panel2);
View listview0_childWgt0_panel3 = (View) getListview0_childWgt0_panel3View((UMActivity)context,binderGroup,configure);
listview0_childWgt0_panel1.addView(listview0_childWgt0_panel3);
View listview0_childWgt0_panel10 = (View) getListview0_childWgt0_panel10View((UMActivity)context,binderGroup,configure);
listview0_childWgt0_panel1.addView(listview0_childWgt0_panel10);

return listview0_childWgt0_panel1;
}
public View getListview0_childWgt0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt0 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_LISTVIEW0_CHILDWGT0
,"halign","center"
,"height","80"
,"layout-type","linear"
,"width","fill"
,"background-image","list_row_mid3.png"
);
View listview0_childWgt0_panel1 = (View) getListview0_childWgt0_panel1View((UMActivity)context,binderGroup,configure);
listview0_childWgt0.addView(listview0_childWgt0_panel1);

return listview0_childWgt0;
}
public View getListview0_childWgt1_panel2View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt1_panel2 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT1_PANEL2
,"margin-right","5"
,"height","fill"
,"layout-type","linear"
,"width","35"
,"margin-left","15"
,"valign","center"
);
listview0_childWgt1_image0 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_LISTVIEW0_CHILDWGT1_IMAGE0
,"height","35"
,"layout-type","linear"
,"width","35"
,"scaletype","fitcenter"
,"src","inforead.png"
);
listview0_childWgt1_panel2.addView(listview0_childWgt1_image0);

return listview0_childWgt1_panel2;
}
public View getListview0_childWgt1_panel12View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt1_panel12 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_LISTVIEW0_CHILDWGT1_PANEL12
,"halign","left"
,"height","32"
,"weight","1"
,"layout-type","linear"
,"width","0"
);
listview0_childWgt1_label0 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT1_LABEL0
,"content","topic"
,"bindfield","topic"
,"halign","left"
,"height","20.0"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","173"
,"font-family","default"
,"valign","center"
);
UMTextBinder listview0_childWgt1_label0_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt1_label0_binder.setBindInfo(new BindInfo("topic"));
listview0_childWgt1_label0_binder.setControl(listview0_childWgt1_label0);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT1_LABEL0, listview0_childWgt1_label0_binder);
listview0_childWgt1_panel12.addView(listview0_childWgt1_label0);

return listview0_childWgt1_panel12;
}
public View getListview0_childWgt1_panel11View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt1_panel11 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_LISTVIEW0_CHILDWGT1_PANEL11
,"halign","right"
,"height","32"
,"layout-type","linear"
,"width","90"
);
listview0_childWgt1_label1 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT1_LABEL1
,"content","businesstype"
,"bindfield","businessType"
,"halign","right"
,"height","20.0"
,"widthwrap","94.0"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","wrap"
,"font-family","default"
,"valign","center"
);
UMTextBinder listview0_childWgt1_label1_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt1_label1_binder.setBindInfo(new BindInfo("businessType"));
listview0_childWgt1_label1_binder.setControl(listview0_childWgt1_label1);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT1_LABEL1, listview0_childWgt1_label1_binder);
listview0_childWgt1_panel11.addView(listview0_childWgt1_label1);

return listview0_childWgt1_panel11;
}
public View getListview0_childWgt1_panel9View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt1_panel9 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT1_PANEL9
,"height","32"
,"layout-type","linear"
,"width","fill"
,"valign","center"
);
View listview0_childWgt1_panel12 = (View) getListview0_childWgt1_panel12View((UMActivity)context,binderGroup,configure);
listview0_childWgt1_panel9.addView(listview0_childWgt1_panel12);
View listview0_childWgt1_panel11 = (View) getListview0_childWgt1_panel11View((UMActivity)context,binderGroup,configure);
listview0_childWgt1_panel9.addView(listview0_childWgt1_panel11);

return listview0_childWgt1_panel9;
}
public View getListview0_childWgt1_panel8View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt1_panel8 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT1_PANEL8
,"height","34"
,"layout-type","linear"
,"width","fill"
,"valign","center"
);
View listview0_childWgt1_panel9 = (View) getListview0_childWgt1_panel9View((UMActivity)context,binderGroup,configure);
listview0_childWgt1_panel8.addView(listview0_childWgt1_panel9);

return listview0_childWgt1_panel8;
}
public View getListview0_childWgt1_panel6View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt1_panel6 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_LISTVIEW0_CHILDWGT1_PANEL6
,"halign","left"
,"height","20"
,"weight","1"
,"layout-type","linear"
,"width","0"
);
listview0_childWgt1_msgSendBy = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT1_MSGSENDBY
,"bindfield","sendBy"
,"halign","left"
,"widthwrap","75.0"
,"width","wrap"
,"content","msgSendBy"
,"height","wrap"
,"color","#6f6f6f"
,"heightwrap","19.0"
,"font-size","13"
,"layout-type","linear"
,"font-family","default"
,"valign","center"
);
UMTextBinder listview0_childWgt1_msgSendBy_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt1_msgSendBy_binder.setBindInfo(new BindInfo("sendBy"));
listview0_childWgt1_msgSendBy_binder.setControl(listview0_childWgt1_msgSendBy);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT1_MSGSENDBY, listview0_childWgt1_msgSendBy_binder);
listview0_childWgt1_panel6.addView(listview0_childWgt1_msgSendBy);

return listview0_childWgt1_panel6;
}
public View getListview0_childWgt1_panel7View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt1_panel7 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_LISTVIEW0_CHILDWGT1_PANEL7
,"halign","right"
,"height","20"
,"weight","1"
,"layout-type","linear"
,"width","0"
);
listview0_childWgt1_datetime = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT1_DATETIME
,"content","datetime"
,"bindfield","sendDate"
,"halign","right"
,"height","20"
,"widthwrap","56.0"
,"color","#0852a5"
,"layout-type","linear"
,"font-size","13"
,"width","wrap"
,"font-family","default"
,"valign","center"
);
UMTextBinder listview0_childWgt1_datetime_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt1_datetime_binder.setBindInfo(new BindInfo("sendDate"));
listview0_childWgt1_datetime_binder.setControl(listview0_childWgt1_datetime);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT1_DATETIME, listview0_childWgt1_datetime_binder);
listview0_childWgt1_panel7.addView(listview0_childWgt1_datetime);

return listview0_childWgt1_panel7;
}
public View getListview0_childWgt1_panel5View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt1_panel5 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT1_PANEL5
,"height","32"
,"layout-type","linear"
,"width","fill"
,"background","#ffffff"
,"valign","center"
);
View listview0_childWgt1_panel6 = (View) getListview0_childWgt1_panel6View((UMActivity)context,binderGroup,configure);
listview0_childWgt1_panel5.addView(listview0_childWgt1_panel6);
listview0_childWgt1_panel4 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_LISTVIEW0_CHILDWGT1_PANEL4
,"halign","center"
,"height","20"
,"weight","1"
,"layout-type","linear"
,"width","0"
);
listview0_childWgt1_panel5.addView(listview0_childWgt1_panel4);
View listview0_childWgt1_panel7 = (View) getListview0_childWgt1_panel7View((UMActivity)context,binderGroup,configure);
listview0_childWgt1_panel5.addView(listview0_childWgt1_panel7);

return listview0_childWgt1_panel5;
}
public View getListview0_childWgt1_panel3View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt1_panel3 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_LISTVIEW0_CHILDWGT1_PANEL3
,"margin-right","8"
,"halign","center"
,"height","fill"
,"weight","1"
,"layout-type","linear"
,"width","0"
);
View listview0_childWgt1_panel8 = (View) getListview0_childWgt1_panel8View((UMActivity)context,binderGroup,configure);
listview0_childWgt1_panel3.addView(listview0_childWgt1_panel8);
View listview0_childWgt1_panel5 = (View) getListview0_childWgt1_panel5View((UMActivity)context,binderGroup,configure);
listview0_childWgt1_panel3.addView(listview0_childWgt1_panel5);

return listview0_childWgt1_panel3;
}
public View getListview0_childWgt1_panel10View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt1_panel10 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT1_PANEL10
,"margin-right","15"
,"height","fill"
,"layout-type","linear"
,"width","10"
,"valign","center"
);
listview0_childWgt1_image1 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_LISTVIEW0_CHILDWGT1_IMAGE1
,"height","20"
,"layout-type","linear"
,"width","10"
,"scaletype","fitcenter"
,"src","ecm_set_jt.png"
);
listview0_childWgt1_panel10.addView(listview0_childWgt1_image1);

return listview0_childWgt1_panel10;
}
public View getListview0_childWgt1_panel1View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt1_panel1 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT1_PANEL1
,"padding-top","8"
,"height","80.0"
,"layout-type","linear"
,"width","fill"
,"onclick","onItemClick"
,"valign","center"
,"padding-bottom","8"
,"background-image","list_row_mid3.png"
);
listview0_childWgt1_panel1.setOnClickListener(new OnCursorClickListener(configure) {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Msg_AllReadMessageListActivity.this);
    int position = this.getPosition(v);
    if(position>=0) {
      context.getCursor("cursormsglistalias").setCurrentIndex(position);
    }
    actionOnItemClick(listview0_childWgt1_panel1,args);

}
});
View listview0_childWgt1_panel2 = (View) getListview0_childWgt1_panel2View((UMActivity)context,binderGroup,configure);
listview0_childWgt1_panel1.addView(listview0_childWgt1_panel2);
View listview0_childWgt1_panel3 = (View) getListview0_childWgt1_panel3View((UMActivity)context,binderGroup,configure);
listview0_childWgt1_panel1.addView(listview0_childWgt1_panel3);
View listview0_childWgt1_panel10 = (View) getListview0_childWgt1_panel10View((UMActivity)context,binderGroup,configure);
listview0_childWgt1_panel1.addView(listview0_childWgt1_panel10);

return listview0_childWgt1_panel1;
}
public View getListview0_childWgt1View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt1 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_LISTVIEW0_CHILDWGT1
,"halign","center"
,"height","80"
,"layout-type","linear"
,"width","fill"
,"background-image","list_row_mid3.png"
);
View listview0_childWgt1_panel1 = (View) getListview0_childWgt1_panel1View((UMActivity)context,binderGroup,configure);
listview0_childWgt1.addView(listview0_childWgt1_panel1);

return listview0_childWgt1;
}
public View getListview0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0 = (UMListViewBase)ThirdControl.createControl(new UMListViewBase(context),ID_LISTVIEW0
,"bindfield","msglist"
,"listview-divider-height","1"
,"childindicator","allUnreadMessageWgt"
,"cursoraction","cursormsglistalias"
,"synccontext","msglist"
,"width","fill"
,"onuprefersh","onUpRefresh"
,"height","fill"
,"ondownrefersh","onDownRefresh"
,"onload","OnLoadAllMsgData"
,"onitemclick","onItemClick"
,"background","#efeff4"
,"layout-type","linear"
,"margin-top","5"
);
context.createCursor("cursormsglistalias", "msglist");
UMListBinder listview0_binder = new UMListBinder((IUMContextAccessor)context);
listview0_binder.setBindInfo(new BindInfo("msglist"));
listview0_binder.setControl(listview0);
binderGroup.addBinderToGroup(ID_LISTVIEW0, listview0_binder);
listview0.setEvent("onuprefersh", new OnCursorEventListener(configure) {
  @Override
  public void onEvent(View v, UMEventArgs parent) {
    UMEventArgs args = new UMEventArgs(Msg_AllReadMessageListActivity.this);
    args.put(parent);
    actionOnUpRefresh(listview0,args);

}
});
listview0.setEvent("ondownrefersh", new OnCursorEventListener(configure) {
  @Override
  public void onEvent(View v, UMEventArgs parent) {
    UMEventArgs args = new UMEventArgs(Msg_AllReadMessageListActivity.this);
    args.put(parent);
    actionOnDownRefresh(listview0,args);

}
});
listview0.setEvent("onitemclick", new OnCursorEventListener(configure) {
  @Override
  public void onEvent(View v, UMEventArgs parent) {
    UMEventArgs args = new UMEventArgs(Msg_AllReadMessageListActivity.this);
    args.put(parent);
    int position = this.getPosition(v);
    if(position>=0) {
      context.getCursor("cursormsglistalias").setCurrentIndex(position);
    }
    actionOnItemClick(listview0,args);

}
});
listview0.addListItemView(new UMListViewBase.ListItemView() {
	public View getItemView(Context context, View parent, IBinderGroup binderGroup,int position) {
  UMDslConfigure configure = new UMDslConfigure();
  configure.put("position",position);
View listview0_childWgt0 = (View) getListview0_childWgt0View((UMActivity)context,binderGroup,configure);
return listview0_childWgt0;
}});
listview0.addListItemView(new UMListViewBase.ListItemView() {
	public View getItemView(Context context, View parent, IBinderGroup binderGroup,int position) {
  UMDslConfigure configure = new UMDslConfigure();
  configure.put("position",position);
View listview0_childWgt1 = (View) getListview0_childWgt1View((UMActivity)context,binderGroup,configure);
return listview0_childWgt1;
}});

return listview0;
}
public View getViewPage0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
viewPage0 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_VIEWPAGE0
,"halign","center"
,"height","fill"
,"layout-type","vbox"
,"background","#F5F5F5"
,"width","fill"
);
View panel0 = (View) getPanel0View((UMActivity)context,binderGroup,configure);
viewPage0.addView(panel0);
View panel1 = (View) getPanel1View((UMActivity)context,binderGroup,configure);
viewPage0.addView(panel1);
View listview0 = (View) getListview0View((UMActivity)context,binderGroup,configure);
viewPage0.addView(listview0);

return viewPage0;
}
public UMWindow getCurrentWindow(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
msg_AllReadMessageList = (UMWindow)ThirdControl.createControl(new UMWindow(context),ID_MSG_ALLREADMESSAGELIST
,"halign","center"
,"height","fill"
,"layout","vbox"
,"width","fill"
,"context","messageGroup"
,"controller","msg_AllReadMessageListController"
,"namespace","nc.bs.oa.oama.ecm"
);
View viewPage0 = (View) getViewPage0View((UMActivity)context,binderGroup,configure);
msg_AllReadMessageList.addView(viewPage0);

return (UMWindow)msg_AllReadMessageList;
}

private void addParam(UMEventArgs args,String param) {
	String strValue = getIntent().getStringExtra(param);
    if(strValue != null && !strValue.isEmpty()){
    	args.put(param,strValue);
    }
	
}

	public void actionOpenReadMessageList(View control, UMEventArgs args) {
    String actionid = "OpenReadMessageList";
    args.put("viewid","nc.bs.oa.oama.ecm.Msg_ReadMessageList");
    args.put("iskeep","false");
    args.put("containerName","");
    
    addParam(args, "ismail");
  ActionProcessor.exec(this, actionid, args);
UMView.open(args);
}
public void actionOnLoadAllMsgData(View control, UMEventArgs args) {
    String actionid = "OnLoadAllMsgData";
    args.put("count","25");
    args.put("viewid","nc.bs.oa.oama.msgList.MsgListController");
    args.put("startline","1");
    args.put("isread","all");
    args.put("action","List");
    args.put("containerName","");
    
    addParam(args, "ismail");
  ActionProcessor.exec(this, actionid, args);
UMList.getFirstPage(args);
}
public void actionOnDownRefresh(View control, UMEventArgs args) {
    String actionid = "onDownRefresh";
    args.put("viewid","nc.bs.oa.oama.msgList.MsgListController");
    args.put("isread","all");
    args.put("action","List");
    args.put("containerName","");
    
    addParam(args, "ismail");
  ActionProcessor.exec(this, actionid, args);
UMList.getNextPage(args);
}
public void actionGoToDetail(View control, UMEventArgs args) {
    String actionid = "GoToDetail";
    args.put("viewid","nc.bs.oa.oama.ecm.Msg_MessageContentDetail");
    args.put("callback","OnLoadAllMsgData");
    args.put("currentmsg","#{CurrentMsg}");
    args.put("iskeep","true");
    args.put("containerName","");
    
    addParam(args, "ismail");
  ActionProcessor.exec(this, actionid, args);
UMView.open(args);
}
public void actionOnItemClick(View control, UMEventArgs args) {
    String actionid = "onItemClick";
    args.put("msgid","#{#{cursor.cursormsglistalias}.msgID}");
    args.put("viewid","nc.bs.oa.oama.msgList.MsgListController");
    args.put("msgid_arrayPath","msglist");
    args.put("callback","GoToDetail");
    args.put("action","GetMsgDetail");
    args.put("autoDataBinding","false");
    args.put("contextmapping","CurrentMsg");
    args.put("containerName","");
    
    addParam(args, "ismail");
  ActionProcessor.exec(this, actionid, args);
UMService.callAction(args);
}
public void actionNewMessage(View control, UMEventArgs args) {
    String actionid = "NewMessage";
    args.put("viewid","nc.bs.oa.oama.ecm.Msg_SendMessage");
    args.put("callback","OnLoadAllMsgData");
    args.put("iskeep","true");
    args.put("containerName","");
    
    addParam(args, "ismail");
  ActionProcessor.exec(this, actionid, args);
UMView.open(args);
}
public void actionOnUpRefresh(View control, UMEventArgs args) {
    String actionid = "onUpRefresh";
    args.put("count","25");
    args.put("viewid","nc.bs.oa.oama.msgList.MsgListController");
    args.put("startline","1");
    args.put("isread","all");
    args.put("action","List");
    args.put("containerName","");
    
    addParam(args, "ismail");
  ActionProcessor.exec(this, actionid, args);
UMList.getFirstPage(args);
}
public void actionOnReturnBtnClick(View control, UMEventArgs args) {
    String actionid = "onReturnBtnClick";
    args.put("resultcode","15");
    args.put("iskeep","false");
    args.put("containerName","");
    addParam(args, "ismail");
  ActionProcessor.exec(this, actionid, args);
UMView.close(args);
}
public void actionOpenUnReadMessageList(View control, UMEventArgs args) {
    String actionid = "OpenUnReadMessageList";
    args.put("viewid","nc.bs.oa.oama.ecm.Msg_UnreadMessageList");
    args.put("iskeep","false");
    args.put("containerName","");
    addParam(args, "ismail");
  ActionProcessor.exec(this, actionid, args);
UMView.open(args);
}


}
