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

public abstract class Msg_UnreadMessageListActivity extends UMWindowActivity {

	protected UMWindow msg_MessageList = null;
protected XVerticalLayout viewPage0 = null;
protected XHorizontalLayout navigatorbar1 = null;
protected UMButton button1 = null;
protected UMLabel label1 = null;
protected UMButton button0 = null;
protected XHorizontalLayout panel1 = null;
protected UMToggleButtonGroup togglebuttongroup0 = null;
protected UMToggleButton togglebutton0 = null;
protected UMToggleButton togglebutton1 = null;
protected UMToggleButton togglebutton2 = null;
protected XVerticalLayout panel2 = null;
protected UMListViewBase listview0 = null;
protected XHorizontalLayout listview0_childWgt0 = null;
protected XHorizontalLayout listview0_childWgt0_panel1 = null;
protected XVerticalLayout listview0_childWgt0_panel2 = null;
protected XHorizontalLayout listview0_childWgt0_panel4 = null;
protected XVerticalLayout listview0_childWgt0_panel20 = null;
protected UMLabel listview0_childWgt0_topic = null;
protected XVerticalLayout listview0_childWgt0_panel21 = null;
protected UMLabel listview0_childWgt0_businessType = null;
protected XHorizontalLayout listview0_childWgt0_panel5 = null;
protected XHorizontalLayout listview0_childWgt0_panel19 = null;
protected UMLabel listview0_childWgt0_msgSendBy = null;
protected XVerticalLayout listview0_childWgt0_panel7 = null;
protected XVerticalLayout listview0_childWgt0_panel8 = null;
protected UMLabel listview0_childWgt0_datetime = null;
protected XHorizontalLayout listview0_childWgt0_panel3 = null;
protected UMImage listview0_childWgt0_image0 = null;

//列表界面，邮件标题字段panel6
protected XHorizontalLayout listview0_childWgt0_panel6 = null;
//列表界面，邮件标题字段label
protected UMLabel listview0_childWgt0_msgtitle = null;

	
	protected final static int ID_MSG_MESSAGELIST = 1578438728;
protected final static int ID_VIEWPAGE0 = 262964774;
protected final static int ID_NAVIGATORBAR1 = 227714171;
protected final static int ID_BUTTON1 = 1050277385;
protected final static int ID_LABEL1 = 1164371247;
protected final static int ID_BUTTON0 = 2056931159;
protected final static int ID_PANEL1 = 1476786766;
protected final static int ID_TOGGLEBUTTONGROUP0 = 1658914978;
protected final static int ID_TOGGLEBUTTON0 = 2132817364;
protected final static int ID_TOGGLEBUTTON1 = 450247571;
protected final static int ID_TOGGLEBUTTON2 = 1754027314;
protected final static int ID_PANEL2 = 680119601;
protected final static int ID_LISTVIEW0 = 1673660848;
protected final static int ID_LISTVIEW0_CHILDWGT0 = 82928490;
protected final static int ID_LISTVIEW0_CHILDWGT0_PANEL1 = 2020600103;
protected final static int ID_LISTVIEW0_CHILDWGT0_PANEL2 = 687767270;
protected final static int ID_LISTVIEW0_CHILDWGT0_PANEL4 = 810972986;
protected final static int ID_LISTVIEW0_CHILDWGT0_PANEL20 = 625476325;
protected final static int ID_LISTVIEW0_CHILDWGT0_TOPIC = 352513553;
protected final static int ID_LISTVIEW0_CHILDWGT0_PANEL21 = 1195844693;
protected final static int ID_LISTVIEW0_CHILDWGT0_BUSINESSTYPE = 1528857951;
protected final static int ID_LISTVIEW0_CHILDWGT0_PANEL5 = 498461837;
protected final static int ID_LISTVIEW0_CHILDWGT0_PANEL19 = 899512578;
protected final static int ID_LISTVIEW0_CHILDWGT0_MSGSENDBY = 1814560852;
protected final static int ID_LISTVIEW0_CHILDWGT0_PANEL7 = 219637895;
protected final static int ID_LISTVIEW0_CHILDWGT0_PANEL8 = 733317498;
protected final static int ID_LISTVIEW0_CHILDWGT0_DATETIME = 1845038216;
protected final static int ID_LISTVIEW0_CHILDWGT0_PANEL3 = 510943065;
protected final static int ID_LISTVIEW0_CHILDWGT0_IMAGE0 = 34975555;


//列表界面，邮件标题字段panel6
protected final static int ID_LISTVIEW0_CHILDWGT0_PANEL6 = 687767271;
//列表界面，邮件标题字段label
protected final static int ID_LISTVIEW0_CHILDWGT0_MSGTITLE = 352513554;

	
	
	@Override
	public String getControllerName() {
		return "msg_UnreadMessageListController";
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
		  idmap.put("msg_MessageList",ID_MSG_MESSAGELIST);
  idmap.put("viewPage0",ID_VIEWPAGE0);
  idmap.put("navigatorbar1",ID_NAVIGATORBAR1);
  idmap.put("button1",ID_BUTTON1);
  idmap.put("label1",ID_LABEL1);
  idmap.put("button0",ID_BUTTON0);
  idmap.put("panel1",ID_PANEL1);
  idmap.put("togglebuttongroup0",ID_TOGGLEBUTTONGROUP0);
  idmap.put("togglebutton0",ID_TOGGLEBUTTON0);
  idmap.put("togglebutton1",ID_TOGGLEBUTTON1);
  idmap.put("togglebutton2",ID_TOGGLEBUTTON2);
  idmap.put("panel2",ID_PANEL2);
  idmap.put("listview0",ID_LISTVIEW0);
  idmap.put("listview0_childWgt0",ID_LISTVIEW0_CHILDWGT0);
  idmap.put("listview0_childWgt0_panel1",ID_LISTVIEW0_CHILDWGT0_PANEL1);
  idmap.put("listview0_childWgt0_panel2",ID_LISTVIEW0_CHILDWGT0_PANEL2);
  idmap.put("listview0_childWgt0_panel4",ID_LISTVIEW0_CHILDWGT0_PANEL4);
  idmap.put("listview0_childWgt0_panel20",ID_LISTVIEW0_CHILDWGT0_PANEL20);
  idmap.put("listview0_childWgt0_topic",ID_LISTVIEW0_CHILDWGT0_TOPIC);
  idmap.put("listview0_childWgt0_panel21",ID_LISTVIEW0_CHILDWGT0_PANEL21);
  idmap.put("listview0_childWgt0_businessType",ID_LISTVIEW0_CHILDWGT0_BUSINESSTYPE);
  idmap.put("listview0_childWgt0_panel5",ID_LISTVIEW0_CHILDWGT0_PANEL5);
  idmap.put("listview0_childWgt0_panel19",ID_LISTVIEW0_CHILDWGT0_PANEL19);
  idmap.put("listview0_childWgt0_msgSendBy",ID_LISTVIEW0_CHILDWGT0_MSGSENDBY);
  idmap.put("listview0_childWgt0_panel7",ID_LISTVIEW0_CHILDWGT0_PANEL7);
  idmap.put("listview0_childWgt0_panel8",ID_LISTVIEW0_CHILDWGT0_PANEL8);
  idmap.put("listview0_childWgt0_datetime",ID_LISTVIEW0_CHILDWGT0_DATETIME);
  idmap.put("listview0_childWgt0_panel3",ID_LISTVIEW0_CHILDWGT0_PANEL3);
  idmap.put("listview0_childWgt0_image0",ID_LISTVIEW0_CHILDWGT0_IMAGE0);
  
  idmap.put("listview0_childWgt0_panel6",ID_LISTVIEW0_CHILDWGT0_PANEL6);
  idmap.put("listview0_childWgt0_msgtitle",ID_LISTVIEW0_CHILDWGT0_MSGTITLE);

	}
	
	public void onLoad() {
		ULog.logLC("onLoad", this);
		if(currentPage!=null) {
			currentPage.onLoad();
		}
	
		{ //listview0 - OnLoadUnreadMsgData
    UMEventArgs args = new UMEventArgs(Msg_UnreadMessageListActivity.this);
    actionOnLoadUnreadMsgData(listview0,args);

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
	
	
	
	public View getNavigatorbar1View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
navigatorbar1 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_NAVIGATORBAR1
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
button1 = (UMButton)ThirdControl.createControl(new UMButton(context),ID_BUTTON1
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
button1.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Msg_UnreadMessageListActivity.this);
    actionOnReturnBtnClick(button1,args);

}
});
navigatorbar1.addView(button1);
label1 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL1
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
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label1,"content","#{res.msg_UnreadMessage}"));
navigatorbar1.addView(label1);
button0 = (UMButton)ThirdControl.createControl(new UMButton(context),ID_BUTTON0
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
button0.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Msg_UnreadMessageListActivity.this);
    actionNewMessage(button0,args);

}
});
navigatorbar1.addView(button0);

return navigatorbar1;
}
public View getTogglebuttongroup0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
togglebuttongroup0 = (UMToggleButtonGroup)ThirdControl.createControl(new UMToggleButtonGroup(context),ID_TOGGLEBUTTONGROUP0
,"padding-left","15"
,"padding-right","15"
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
,"font-family","default"
,"valign","center"
,"checked","true"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,togglebutton0,"textOff","#{res.msg_Unread}"));
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,togglebutton0,"textOn","#{res.msg_Unread}"));
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
    UMEventArgs args = new UMEventArgs(Msg_UnreadMessageListActivity.this);
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
,"onclick","OpenAllReadMessageList"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,togglebutton2,"textOff","#{res.msg_AllRead}"));
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,togglebutton2,"textOn","#{res.msg_AllRead}"));
togglebutton2.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Msg_UnreadMessageListActivity.this);
    actionOpenAllReadMessageList(togglebutton2,args);

}
});
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
public View getListview0_childWgt0_panel20View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt0_panel20 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_LISTVIEW0_CHILDWGT0_PANEL20
,"halign","left"
,"height","32"
,"weight","1"
,"layout-type","linear"
,"width","0"
);
listview0_childWgt0_topic = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT0_TOPIC
,"content","topic"
,"bindfield","topic"
,"halign","left"
,"height","23.0"
,"color","#000000"
,"layout-type","linear"
,"font-size","16"
,"width","185"
,"font-family","default"
);
UMTextBinder listview0_childWgt0_topic_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt0_topic_binder.setBindInfo(new BindInfo("topic"));
listview0_childWgt0_topic_binder.setControl(listview0_childWgt0_topic);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT0_TOPIC, listview0_childWgt0_topic_binder);
listview0_childWgt0_panel20.addView(listview0_childWgt0_topic);

return listview0_childWgt0_panel20;
}
public View getListview0_childWgt0_panel21View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt0_panel21 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_LISTVIEW0_CHILDWGT0_PANEL21
,"halign","right"
,"height","32"
,"layout-type","linear"
,"width","85"
);
listview0_childWgt0_businessType = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT0_BUSINESSTYPE
,"content","businessType"
,"bindfield","businessType"
,"halign","right"
,"height","wrap"
,"widthwrap","85.0"
,"color","#6f6f6f"
,"heightwrap","19.0"
,"layout-type","linear"
,"font-size","13"
,"width","wrap"
,"font-family","default"
);
UMTextBinder listview0_childWgt0_businessType_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt0_businessType_binder.setBindInfo(new BindInfo("businessType"));
listview0_childWgt0_businessType_binder.setControl(listview0_childWgt0_businessType);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT0_BUSINESSTYPE, listview0_childWgt0_businessType_binder);
listview0_childWgt0_panel21.addView(listview0_childWgt0_businessType);

return listview0_childWgt0_panel21;
}
public View getListview0_childWgt0_panel4View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt0_panel4 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT0_PANEL4
,"height","32"
,"layout-type","linear"
,"width","fill"
,"valign","center"
);
View listview0_childWgt0_panel20 = (View) getListview0_childWgt0_panel20View((UMActivity)context,binderGroup,configure);
listview0_childWgt0_panel4.addView(listview0_childWgt0_panel20);
View listview0_childWgt0_panel21 = (View) getListview0_childWgt0_panel21View((UMActivity)context,binderGroup,configure);
listview0_childWgt0_panel4.addView(listview0_childWgt0_panel21);

return listview0_childWgt0_panel4;
}

public View getListview0_childWgt0_panel6View(UMActivity context,
		IBinderGroup binderGroup, UMDslConfigure configure) {
	// TODO Auto-generated method stub
	listview0_childWgt0_panel6 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context), ID_LISTVIEW0_CHILDWGT0_PANEL6
			,"height","20"
			,"layout-type","linear"
			,"width","fill"
			,"valign","center"
			);
	listview0_childWgt0_msgtitle = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT0_MSGTITLE
			,"content","msgtitle"
			,"bindfield","msgtitle"
			,"halign","left"
			,"height","20.0"
			,"color","#000000"
			,"layout-type","linear"
			,"font-size","13"
			,"width","fill"
			,"font-family","default"
			);
			UMTextBinder listview0_childWgt0_msgtitle_binder = new UMTextBinder((IUMContextAccessor)context);
			listview0_childWgt0_msgtitle_binder.setBindInfo(new BindInfo("msgtitle"));
			listview0_childWgt0_msgtitle_binder.setControl(listview0_childWgt0_msgtitle);
			binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT0_MSGTITLE, listview0_childWgt0_msgtitle_binder);
			listview0_childWgt0_panel6.addView(listview0_childWgt0_msgtitle);
	return listview0_childWgt0_panel6;
}

public View getListview0_childWgt0_panel19View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt0_panel19 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT0_PANEL19
,"height","23"
,"weight","1"
,"layout-type","linear"
,"width","0"
,"valign","center"
);
listview0_childWgt0_msgSendBy = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT0_MSGSENDBY
,"content","msgSendBy"
,"bindfield","sendBy"
,"halign","left"
,"height","wrap"
,"widthwrap","75.0"
,"color","#6f6f6f"
,"heightwrap","19.0"
,"font-size","13"
,"layout","vbox"
,"width","wrap"
,"font-family","default"
);
UMTextBinder listview0_childWgt0_msgSendBy_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt0_msgSendBy_binder.setBindInfo(new BindInfo("sendBy"));
listview0_childWgt0_msgSendBy_binder.setControl(listview0_childWgt0_msgSendBy);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT0_MSGSENDBY, listview0_childWgt0_msgSendBy_binder);
listview0_childWgt0_panel19.addView(listview0_childWgt0_msgSendBy);

return listview0_childWgt0_panel19;
}
public View getListview0_childWgt0_panel8View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt0_panel8 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_LISTVIEW0_CHILDWGT0_PANEL8
,"halign","right"
,"height","23"
,"weight","1"
,"layout-type","linear"
,"width","0"
);
listview0_childWgt0_datetime = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT0_DATETIME
,"content","datetime"
,"bindfield","sendDate"
,"halign","center"
,"height","wrap"
,"widthwrap","56.0"
,"color","#0852a5"
,"heightwrap","19.0"
,"layout-type","linear"
,"font-size","13"
,"width","wrap"
,"font-family","default"
);
UMTextBinder listview0_childWgt0_datetime_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt0_datetime_binder.setBindInfo(new BindInfo("sendDate"));
listview0_childWgt0_datetime_binder.setControl(listview0_childWgt0_datetime);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT0_DATETIME, listview0_childWgt0_datetime_binder);
listview0_childWgt0_panel8.addView(listview0_childWgt0_datetime);

return listview0_childWgt0_panel8;
}
public View getListview0_childWgt0_panel5View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt0_panel5 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT0_PANEL5
,"height","32"
,"layout-type","linear"
,"width","fill"
,"valign","center"
);
View listview0_childWgt0_panel19 = (View) getListview0_childWgt0_panel19View((UMActivity)context,binderGroup,configure);
listview0_childWgt0_panel5.addView(listview0_childWgt0_panel19);
listview0_childWgt0_panel7 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_LISTVIEW0_CHILDWGT0_PANEL7
,"halign","center"
,"height","23"
,"weight","1"
,"layout-type","linear"
,"width","0"
);
listview0_childWgt0_panel5.addView(listview0_childWgt0_panel7);
View listview0_childWgt0_panel8 = (View) getListview0_childWgt0_panel8View((UMActivity)context,binderGroup,configure);
listview0_childWgt0_panel5.addView(listview0_childWgt0_panel8);

return listview0_childWgt0_panel5;
}
public View getListview0_childWgt0_panel2View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt0_panel2 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_LISTVIEW0_CHILDWGT0_PANEL2
,"padding-left","15"
,"margin-right","5"
,"halign","center"
,"height","90"
,"weight","1"
,"layout-type","linear"
,"width","0"
,"margin-top","8"
);
View listview0_childWgt0_panel4 = (View) getListview0_childWgt0_panel4View((UMActivity)context,binderGroup,configure);
listview0_childWgt0_panel2.addView(listview0_childWgt0_panel4);
View listview0_childWgt0_panel6 = (View) getListview0_childWgt0_panel6View((UMActivity)context,binderGroup,configure);
listview0_childWgt0_panel2.addView(listview0_childWgt0_panel6);
View listview0_childWgt0_panel5 = (View) getListview0_childWgt0_panel5View((UMActivity)context,binderGroup,configure);
listview0_childWgt0_panel2.addView(listview0_childWgt0_panel5);

return listview0_childWgt0_panel2;
}
public View getListview0_childWgt0_panel3View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt0_panel3 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT0_PANEL3
,"margin-right","15"
,"height","fill"
,"layout-type","linear"
,"width","10"
,"valign","center"
);
listview0_childWgt0_image0 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_LISTVIEW0_CHILDWGT0_IMAGE0
,"height","20"
,"layout-type","linear"
,"width","10"
,"scaletype","fitcenter"
,"src","ecm_set_jt.png"
);
listview0_childWgt0_panel3.addView(listview0_childWgt0_image0);

return listview0_childWgt0_panel3;
}
public View getListview0_childWgt0_panel1View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt0_panel1 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT0_PANEL1
,"padding-top","8"
,"height","90"
,"layout-type","linear"
,"width","fill"
,"valign","center"
,"padding-bottom","8"
,"background-image","list_row_mid3.png"
);
View listview0_childWgt0_panel2 = (View) getListview0_childWgt0_panel2View((UMActivity)context,binderGroup,configure);
listview0_childWgt0_panel1.addView(listview0_childWgt0_panel2);
View listview0_childWgt0_panel3 = (View) getListview0_childWgt0_panel3View((UMActivity)context,binderGroup,configure);
listview0_childWgt0_panel1.addView(listview0_childWgt0_panel3);

return listview0_childWgt0_panel1;
}
public View getListview0_childWgt0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt0 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT0
,"height","90"
,"layout-type","linear"
,"background","#FFFFE0"
,"width","fill"
,"valign","center"
);
View listview0_childWgt0_panel1 = (View) getListview0_childWgt0_panel1View((UMActivity)context,binderGroup,configure);
listview0_childWgt0.addView(listview0_childWgt0_panel1);

return listview0_childWgt0;
}
public View getListview0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0 = (UMListViewBase)ThirdControl.createControl(new UMListViewBase(context),ID_LISTVIEW0
,"bindfield","msglist"
,"childindicator","messageWgt"
,"weight","1"
,"cursoraction","cursormsglistalias"
,"synccontext","msglist"
,"width","fill"
,"onuprefersh","onUpRefresh"
,"height","0"
,"ondownrefersh","onDownRefresh"
,"onload","OnLoadUnreadMsgData"
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
    UMEventArgs args = new UMEventArgs(Msg_UnreadMessageListActivity.this);
    args.put(parent);
    actionOnUpRefresh(listview0,args);

}
});
listview0.setEvent("ondownrefersh", new OnCursorEventListener(configure) {
  @Override
  public void onEvent(View v, UMEventArgs parent) {
    UMEventArgs args = new UMEventArgs(Msg_UnreadMessageListActivity.this);
    args.put(parent);
    actionOnDownRefresh(listview0,args);

}
});
listview0.setEvent("onitemclick", new OnCursorEventListener(configure) {
  @Override
  public void onEvent(View v, UMEventArgs parent) {
    UMEventArgs args = new UMEventArgs(Msg_UnreadMessageListActivity.this);
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

return listview0;
}
public View getPanel2View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel2 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL2
,"halign","center"
,"height","fill"
,"layout-type","linear"
,"width","fill"
);
View listview0 = (View) getListview0View((UMActivity)context,binderGroup,configure);
panel2.addView(listview0);

return panel2;
}
public View getViewPage0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
viewPage0 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_VIEWPAGE0
,"halign","center"
,"height","fill"
,"layout-type","vbox"
,"background","#F5F5F5"
,"width","fill"
);
View navigatorbar1 = (View) getNavigatorbar1View((UMActivity)context,binderGroup,configure);
viewPage0.addView(navigatorbar1);
View panel1 = (View) getPanel1View((UMActivity)context,binderGroup,configure);
viewPage0.addView(panel1);
View panel2 = (View) getPanel2View((UMActivity)context,binderGroup,configure);
viewPage0.addView(panel2);

return viewPage0;
}
public UMWindow getCurrentWindow(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
msg_MessageList = (UMWindow)ThirdControl.createControl(new UMWindow(context),ID_MSG_MESSAGELIST
,"halign","center"
,"height","fill"
,"layout","vbox"
,"width","fill"
,"context","messageGroup"
,"controller","msg_UnreadMessageListController"
,"namespace","nc.bs.oa.oama.ecm"
);
View viewPage0 = (View) getViewPage0View((UMActivity)context,binderGroup,configure);
msg_MessageList.addView(viewPage0);

return (UMWindow)msg_MessageList;
}

private void addParam(UMEventArgs args,String param) {
	String strValue = getIntent().getStringExtra(param);
    if(strValue != null && !strValue.isEmpty()){
    	args.put(param,strValue);
    }
	
}		
	public void actionOpenAllReadMessageList(View control, UMEventArgs args) {
    String actionid = "OpenAllReadMessageList";
    args.put("viewid","nc.bs.oa.oama.ecm.Msg_AllReadMessageList");
    args.put("iskeep","false");
    args.put("containerName","");
    
    addParam(args, "ismail");
  ActionProcessor.exec(this, actionid, args);
UMView.open(args);
}
public void actionOnLoadUnreadMsgData(View control, UMEventArgs args) {
    String actionid = "OnLoadUnreadMsgData";
    args.put("viewid","nc.bs.oa.oama.msgList.MsgListController");
    args.put("count","25");
    args.put("startline","1");
    args.put("isread","unreaded");
    args.put("action","List");
    args.put("containerName","");
    
    addParam(args, "ismail");
  ActionProcessor.exec(this, actionid, args);
UMList.getFirstPage(args);
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
public void actionOnDownRefresh(View control, UMEventArgs args) {
    String actionid = "onDownRefresh";
    args.put("viewid","nc.bs.oa.oama.msgList.MsgListController");
    args.put("isread","unreaded");
    args.put("action","List");
    args.put("containerName","");
    
    addParam(args, "ismail");
  ActionProcessor.exec(this, actionid, args);
UMList.getNextPage(args);
}
public void actionGoToDetail(View control, UMEventArgs args) {
    String actionid = "GoToDetail";
    args.put("viewid","nc.bs.oa.oama.ecm.Msg_MessageContentDetail");
    args.put("callback","OnLoadUnreadMsgData");
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
    args.put("callback","OnLoadUnreadMsgData");
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
    args.put("isread","unreaded");
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


}
