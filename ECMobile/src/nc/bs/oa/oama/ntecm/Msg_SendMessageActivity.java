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

public abstract class Msg_SendMessageActivity extends UMWindowActivity {

	protected UMWindow msg_SendMessage = null;
protected XVerticalLayout viewPage0 = null;
protected XHorizontalLayout navigatorbar0 = null;
protected UMButton btnCancle = null;
protected UMLabel label0 = null;
protected UMButton button1 = null;
protected XHorizontalLayout panel1 = null;
protected UMLabel label1 = null;
protected XHorizontalLayout panel6 = null;
protected UMLabel label4 = null;
protected UMImage image1 = null;
protected XHorizontalLayout panel3 = null;
protected UMLabel label3 = null;
protected XHorizontalLayout panel7 = null;
protected UMLabel label5 = null;
protected UMImage image0 = null;
protected XVerticalLayout panel4 = null;
protected XVerticalLayout panel0 = null;
protected UMLabel label2 = null;
protected XHorizontalLayout panel2 = null;
protected XHorizontalLayout panelEmail = null;
protected UMCheckbox checkbox0 = null;
protected UMLabel labelEmail = null;
protected XHorizontalLayout panelIM = null;
protected UMCheckbox checkbox1 = null;
protected UMLabel labelIM = null;
protected XHorizontalLayout panelPush = null;
protected UMCheckbox checkbox2 = null;
protected UMLabel labelPush = null;
protected XHorizontalLayout panelCSSMS = null;
protected UMCheckbox checkbox3 = null;
protected UMLabel labelCSSMS = null;
protected XRelativeLayout panel5 = null;
protected UMTextArea txtContent = null;

	
	protected final static int ID_MSG_SENDMESSAGE = 56945695;
protected final static int ID_VIEWPAGE0 = 2056009616;
protected final static int ID_NAVIGATORBAR0 = 1538940851;
protected final static int ID_BTNCANCLE = 2108967699;
protected final static int ID_LABEL0 = 782630557;
protected final static int ID_BUTTON1 = 219791912;
protected final static int ID_PANEL1 = 602446142;
protected final static int ID_LABEL1 = 329644941;
protected final static int ID_PANEL6 = 1255839929;
protected final static int ID_LABEL4 = 86695289;
protected final static int ID_IMAGE1 = 83926463;
protected final static int ID_PANEL3 = 515651794;
protected final static int ID_LABEL3 = 1952011629;
protected final static int ID_PANEL7 = 1371887908;
protected final static int ID_LABEL5 = 1347398108;
protected final static int ID_IMAGE0 = 2131973988;
protected final static int ID_PANEL4 = 304019076;
protected final static int ID_PANEL0 = 430708951;
protected final static int ID_LABEL2 = 1854126212;
protected final static int ID_PANEL2 = 495710463;
protected final static int ID_PANELEMAIL = 1116013287;
protected final static int ID_CHECKBOX0 = 599795979;
protected final static int ID_LABELEMAIL = 21814066;
protected final static int ID_PANELIM = 1653492787;
protected final static int ID_CHECKBOX1 = 449558908;
protected final static int ID_LABELIM = 2081105796;
protected final static int ID_PANELPUSH = 1393414139;
protected final static int ID_CHECKBOX2 = 1581882827;
protected final static int ID_LABELPUSH = 1106693292;
protected final static int ID_PANELCSSMS = 1040794605;
protected final static int ID_CHECKBOX3 = 1375523307;
protected final static int ID_LABELCSSMS = 811607387;
protected final static int ID_PANEL5 = 2051886685;
protected final static int ID_TXTCONTENT = 1008368824;

	
	
	@Override
	public String getControllerName() {
		return "msg_SendMessageController";
	}
	
	@Override
	public String getContextName() {
		return "msg_CreateMessage";
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
		{ //viewPage0 - selectedCallback
    UMEventArgs args = new UMEventArgs(Msg_SendMessageActivity.this);
    actionSelectedCallback(viewPage0,args);

}

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
		  idmap.put("msg_SendMessage",ID_MSG_SENDMESSAGE);
  idmap.put("viewPage0",ID_VIEWPAGE0);
  idmap.put("navigatorbar0",ID_NAVIGATORBAR0);
  idmap.put("btnCancle",ID_BTNCANCLE);
  idmap.put("label0",ID_LABEL0);
  idmap.put("button1",ID_BUTTON1);
  idmap.put("panel1",ID_PANEL1);
  idmap.put("label1",ID_LABEL1);
  idmap.put("panel6",ID_PANEL6);
  idmap.put("label4",ID_LABEL4);
  idmap.put("image1",ID_IMAGE1);
  idmap.put("panel3",ID_PANEL3);
  idmap.put("label3",ID_LABEL3);
  idmap.put("panel7",ID_PANEL7);
  idmap.put("label5",ID_LABEL5);
  idmap.put("image0",ID_IMAGE0);
  idmap.put("panel4",ID_PANEL4);
  idmap.put("panel0",ID_PANEL0);
  idmap.put("label2",ID_LABEL2);
  idmap.put("panel2",ID_PANEL2);
  idmap.put("panelEmail",ID_PANELEMAIL);
  idmap.put("checkbox0",ID_CHECKBOX0);
  idmap.put("labelEmail",ID_LABELEMAIL);
  idmap.put("panelIM",ID_PANELIM);
  idmap.put("checkbox1",ID_CHECKBOX1);
  idmap.put("labelIM",ID_LABELIM);
  idmap.put("panelPush",ID_PANELPUSH);
  idmap.put("checkbox2",ID_CHECKBOX2);
  idmap.put("labelPush",ID_LABELPUSH);
  idmap.put("panelCSSMS",ID_PANELCSSMS);
  idmap.put("checkbox3",ID_CHECKBOX3);
  idmap.put("labelCSSMS",ID_LABELCSSMS);
  idmap.put("panel5",ID_PANEL5);
  idmap.put("txtContent",ID_TXTCONTENT);

	}
	
	public void onLoad() {
		ULog.logLC("onLoad", this);
		if(currentPage!=null) {
			currentPage.onLoad();
		}
	
		{ //viewPage0 - onLoadSendType
    UMEventArgs args = new UMEventArgs(Msg_SendMessageActivity.this);
    actionOnLoadSendType(viewPage0,args);

}
{ //panelEmail - action:panelemail_onload
    UMEventArgs args = new UMEventArgs(Msg_SendMessageActivity.this);
    actionPanelemail_onload(panelEmail,args);

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
,"height","44.0"
,"color","#000000"
,"layout-type","linear"
,"font-size","17"
,"width","fill"
,"font-family","default"
,"valign","center"
,"background-image","navbar_login.png"
);
btnCancle = (UMButton)ThirdControl.createControl(new UMButton(context),ID_BTNCANCLE
,"padding-left","15"
,"halign","left"
,"pressed-image","btn_back_touch"
,"width","64"
,"font-pressed-color","#f2adb2"
,"height","44"
,"color","#e50011"
,"layout-type","linear"
,"font-size","17"
,"onclick","OnClickCancel"
,"font-family","default"
,"valign","center"
,"background-image","btn_back"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,btnCancle,"value","#{res.msg_Return}"));
btnCancle.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Msg_SendMessageActivity.this);
    actionOnClickCancel(btnCancle,args);

}
});
navigatorbar0.addView(btnCancle);
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
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label0,"content","#{res.msg_CreateMessage}"));
navigatorbar0.addView(label0);
button1 = (UMButton)ThirdControl.createControl(new UMButton(context),ID_BUTTON1
,"halign","right"
,"width","64"
,"font-pressed-color","#f2adb2"
,"margin-right","8"
,"height","44"
,"color","#e50011"
,"font-size","17"
,"layout-type","linear"
,"onclick","SendMessage"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,button1,"value","#{res.msg_Send}"));
button1.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Msg_SendMessageActivity.this);
    actionSendMessage(button1,args);

}
});
navigatorbar0.addView(button1);

return navigatorbar0;
}
public View getPanel6View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel6 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL6
,"height","44"
,"layout-type","linear"
,"width","fill"
,"valign","center"
);
label4 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL4
,"bindfield","recipientNames"
,"halign","right"
,"weight","1"
,"width","0"
,"margin-right","5"
,"height","44"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"onclick","OpenRecipientList"
,"font-family","default"
,"valign","center"
,"readonly","false"
);
UMTextBinder label4_binder = new UMTextBinder((IUMContextAccessor)context);
label4_binder.setBindInfo(new BindInfo("recipientNames"));
label4_binder.setControl(label4);
binderGroup.addBinderToGroup(ID_LABEL4, label4_binder);
label4.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Msg_SendMessageActivity.this);
    actionOpenRecipientList(label4,args);

}
});
panel6.addView(label4);
image1 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_IMAGE1
,"height","13"
,"layout-type","linear"
,"width","8"
,"scaletype","fitcenter"
,"src","ecm_set_jt.png"
);
panel6.addView(image1);

return panel6;
}
public View getPanel1View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel1 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL1
,"padding-left","15"
,"padding-right","15"
,"height","44"
,"layout-type","linear"
,"width","fill"
,"onclick","OpenRecipientList"
,"margin-top","5"
,"valign","center"
,"background-image","list_row_mid1.png"
);
panel1.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Msg_SendMessageActivity.this);
    actionOpenRecipientList(panel1,args);

}
});
label1 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL1
,"margin-right","10"
,"halign","left"
,"height","wrap"
,"color","#000000"
,"heightwrap","20.0"
,"layout-type","linear"
,"font-size","14"
,"width","50"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label1,"content","#{res.msg_Recipient}"));
panel1.addView(label1);
View panel6 = (View) getPanel6View((UMActivity)context,binderGroup,configure);
panel1.addView(panel6);

return panel1;
}
public View getPanel7View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel7 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL7
,"height","44"
,"layout-type","linear"
,"width","fill"
,"valign","center"
);
label5 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL5
,"bindfield",""
,"halign","right"
,"weight","1"
,"width","0"
,"content","0"
,"margin-right","5"
,"height","44"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"onclick","OpenAttachmentEditList"
,"font-family","default"
,"valign","center"
,"readonly","false"
);
label5.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Msg_SendMessageActivity.this);
    actionOpenAttachmentEditList(label5,args);

}
});
panel7.addView(label5);
image0 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_IMAGE0
,"height","13"
,"layout-type","linear"
,"width","8"
,"scaletype","fitcenter"
,"src","ecm_set_jt.png"
);
panel7.addView(image0);

return panel7;
}
public View getPanel3View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel3 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL3
,"padding-left","15"
,"padding-right","15"
,"height","44"
,"layout-type","linear"
,"width","fill"
,"valign","center"
,"background-image","list_row_mid1.png"
);
label3 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL3
,"margin-right","10"
,"halign","left"
,"height","wrap"
,"color","#000000"
,"heightwrap","20.0"
,"layout-type","linear"
,"font-size","14"
,"width","50"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label3,"content","#{res.msg_Attachment}"));
panel3.addView(label3);
View panel7 = (View) getPanel7View((UMActivity)context,binderGroup,configure);
panel3.addView(panel7);

return panel3;
}
public View getPanel0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel0 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL0
,"padding-right","15"
,"padding-left","15"
,"halign","left"
,"height","25"
,"layout-type","linear"
,"background","#e3e3e3"
,"width","fill"
);
label2 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL2
,"halign","left"
,"widthwrap","151.0"
,"width","wrap"
,"height","wrap"
,"color","#000000"
,"heightwrap","20.0"
,"font-size","14"
,"layout-type","linear"
,"onclick","action:label2_onclick"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label2,"content","#{res.msg_SendType}"));
label2.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Msg_SendMessageActivity.this);
    actionLabel2_onclick(label2,args);

}
});
panel0.addView(label2);

return panel0;
}
public View getPanelEmailView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panelEmail = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANELEMAIL
,"height","44"
,"visible","false"
,"onload","action:panelemail_onload"
,"layout-type","linear"
,"width","76"
,"valign","center"
);
checkbox0 = (UMCheckbox)ThirdControl.createControl(new UMCheckbox(context),ID_CHECKBOX0
,"bindfield","chk4Email"
,"height","22"
,"layout-type","linear"
,"width","22"
,"check-on-image","checkbox_select.png"
,"check-off-image","checkbox_noselect.png"
);
UMCheckBoxBinder checkbox0_binder = new UMCheckBoxBinder((IUMContextAccessor)context);
checkbox0_binder.setBindInfo(new BindInfo("chk4Email"));
checkbox0_binder.setControl(checkbox0);
binderGroup.addBinderToGroup(ID_CHECKBOX0, checkbox0_binder);
panelEmail.addView(checkbox0);
labelEmail = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABELEMAIL
,"bindfield",""
,"halign","center"
,"widthwrap","119.0"
,"width","wrap"
,"height","wrap"
,"color","#000000"
,"heightwrap","20.0"
,"font-size","14"
,"layout-type","linear"
,"margin-left","6"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,labelEmail,"content","#{res.msg_Email}"));
panelEmail.addView(labelEmail);

return panelEmail;
}
public View getPanelIMView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panelIM = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANELIM
,"height","44"
,"visible","false"
,"layout-type","linear"
,"width","76"
,"valign","center"
);
checkbox1 = (UMCheckbox)ThirdControl.createControl(new UMCheckbox(context),ID_CHECKBOX1
,"bindfield","chk4IM"
,"height","22"
,"layout-type","linear"
,"width","22"
,"check-on-image","checkbox_select"
,"check-off-image","checkbox_noselect"
);
UMCheckBoxBinder checkbox1_binder = new UMCheckBoxBinder((IUMContextAccessor)context);
checkbox1_binder.setBindInfo(new BindInfo("chk4IM"));
checkbox1_binder.setControl(checkbox1);
binderGroup.addBinderToGroup(ID_CHECKBOX1, checkbox1_binder);
panelIM.addView(checkbox1);
labelIM = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABELIM
,"bindfield",""
,"halign","center"
,"widthwrap","17.0"
,"width","wrap"
,"content","IM"
,"height","wrap"
,"color","#000000"
,"heightwrap","20.0"
,"font-size","14"
,"layout-type","linear"
,"margin-left","6"
,"font-family","default"
,"valign","center"
);
panelIM.addView(labelIM);

return panelIM;
}
public View getPanelPushView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panelPush = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANELPUSH
,"height","44"
,"visible","false"
,"layout-type","linear"
,"width","70"
,"valign","center"
);
checkbox2 = (UMCheckbox)ThirdControl.createControl(new UMCheckbox(context),ID_CHECKBOX2
,"bindfield","chk4Push"
,"height","22"
,"layout-type","linear"
,"width","22"
,"check-on-image","checkbox_select"
,"check-off-image","checkbox_noselect"
);
UMCheckBoxBinder checkbox2_binder = new UMCheckBoxBinder((IUMContextAccessor)context);
checkbox2_binder.setBindInfo(new BindInfo("chk4Push"));
checkbox2_binder.setControl(checkbox2);
binderGroup.addBinderToGroup(ID_CHECKBOX2, checkbox2_binder);
panelPush.addView(checkbox2);
labelPush = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABELPUSH
,"bindfield",""
,"halign","center"
,"widthwrap","117.0"
,"width","wrap"
,"height","wrap"
,"color","#000000"
,"heightwrap","20.0"
,"font-size","14"
,"layout-type","linear"
,"margin-left","6"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,labelPush,"content","#{res.msg_Push}"));
panelPush.addView(labelPush);

return panelPush;
}
public View getPanelCSSMSView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panelCSSMS = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANELCSSMS
,"height","44"
,"visible","false"
,"layout-type","linear"
,"width","76"
,"valign","center"
);
checkbox3 = (UMCheckbox)ThirdControl.createControl(new UMCheckbox(context),ID_CHECKBOX3
,"bindfield","chk4CSSMS"
,"height","22"
,"layout-type","linear"
,"width","22"
,"check-on-image","checkbox_select"
,"check-off-image","checkbox_noselect"
);
UMCheckBoxBinder checkbox3_binder = new UMCheckBoxBinder((IUMContextAccessor)context);
checkbox3_binder.setBindInfo(new BindInfo("chk4CSSMS"));
checkbox3_binder.setControl(checkbox3);
binderGroup.addBinderToGroup(ID_CHECKBOX3, checkbox3_binder);
panelCSSMS.addView(checkbox3);
labelCSSMS = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABELCSSMS
,"bindfield",""
,"halign","center"
,"widthwrap","132.0"
,"width","wrap"
,"height","wrap"
,"color","#000000"
,"heightwrap","20.0"
,"font-size","14"
,"layout-type","linear"
,"margin-left","6"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,labelCSSMS,"content","#{res.msg_CSSMS}"));
panelCSSMS.addView(labelCSSMS);

return panelCSSMS;
}
public View getPanel2View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel2 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL2
,"padding-right","15"
,"padding-left","15"
,"height","44"
,"layout-type","linear"
,"width","fill"
,"valign","center"
,"background-image","list_row_mid1.png"
);
View panelEmail = (View) getPanelEmailView((UMActivity)context,binderGroup,configure);
panel2.addView(panelEmail);
View panelIM = (View) getPanelIMView((UMActivity)context,binderGroup,configure);
panel2.addView(panelIM);
View panelPush = (View) getPanelPushView((UMActivity)context,binderGroup,configure);
panel2.addView(panelPush);
View panelCSSMS = (View) getPanelCSSMSView((UMActivity)context,binderGroup,configure);
panel2.addView(panelCSSMS);

return panel2;
}
public View getPanel5View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel5 = (XRelativeLayout)ThirdControl.createControl(new XRelativeLayout(context),ID_PANEL5
,"height","fill"
,"layout-type","linear"
,"width","fill"
,"background","#ffffff"
);
txtContent = (UMTextArea)ThirdControl.createControl(new UMTextArea(context),ID_TXTCONTENT
,"bindfield","content"
,"padding-right","15"
,"padding-left","15"
,"padding-top","14"
,"halign","LEFT"
,"width","fill"
,"padding-bottom","14"
,"height","150"
,"color","#000000"
,"font-size","14"
,"background","#ffffff"
,"layout-type","relative"
,"font-family","default"
,"left","0.0"
,"top","0.0"
);
UMTextBinder txtContent_binder = new UMTextBinder((IUMContextAccessor)context);
txtContent_binder.setBindInfo(new BindInfo("content"));
txtContent_binder.setControl(txtContent);
binderGroup.addBinderToGroup(ID_TXTCONTENT, txtContent_binder);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,txtContent,"placeholder","#{res.msg_InputMsgContent}"));
panel5.addView(txtContent);

return panel5;
}
public View getPanel4View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel4 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL4
,"halign","center"
,"height","fill"
,"layout-type","linear"
,"width","fill"
,"margin-bottom","15"
);
View panel0 = (View) getPanel0View((UMActivity)context,binderGroup,configure);
panel4.addView(panel0);
View panel2 = (View) getPanel2View((UMActivity)context,binderGroup,configure);
panel4.addView(panel2);
View panel5 = (View) getPanel5View((UMActivity)context,binderGroup,configure);
panel4.addView(panel5);

return panel4;
}
public View getViewPage0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
viewPage0 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_VIEWPAGE0
,"halign","center"
,"height","fill"
,"onload","onLoadSendType"
,"layout-type","vbox"
,"background","#efeff4"
,"width","fill"
,"onresume","selectedCallback"
);
View navigatorbar0 = (View) getNavigatorbar0View((UMActivity)context,binderGroup,configure);
viewPage0.addView(navigatorbar0);
View panel1 = (View) getPanel1View((UMActivity)context,binderGroup,configure);
viewPage0.addView(panel1);
View panel3 = (View) getPanel3View((UMActivity)context,binderGroup,configure);
viewPage0.addView(panel3);
View panel4 = (View) getPanel4View((UMActivity)context,binderGroup,configure);
viewPage0.addView(panel4);

return viewPage0;
}
public UMWindow getCurrentWindow(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
msg_SendMessage = (UMWindow)ThirdControl.createControl(new UMWindow(context),ID_MSG_SENDMESSAGE
,"halign","center"
,"height","fill"
,"layout","vbox"
,"width","fill"
,"context","msg_CreateMessage"
,"controller","msg_SendMessageController"
,"namespace","nc.bs.oa.oama.ecm"
);
View viewPage0 = (View) getViewPage0View((UMActivity)context,binderGroup,configure);
msg_SendMessage.addView(viewPage0);

return (UMWindow)msg_SendMessage;
}

	
	public void actionLabel2_onclick(View control, UMEventArgs args) {
    String actionid = "label2_onclick";
    args.put("language","javascript");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "this.label2_onclick()",UMActivity.getViewId(control),args);
}
public void actionGoBack(View control, UMEventArgs args) {
    String actionid = "GoBack";
    args.put("viewid","nc.bs.oa.oama.ecm.Msg_UnreadMessageList");
    args.put("iskeep","false");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.open(args);
}
public void actionOnCloseClick(View control, UMEventArgs args) {
    String actionid = "onCloseClick";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "onCloseClick",UMActivity.getViewId(control),args);
}
public void actionOnLoadSendType(View control, UMEventArgs args) {
    String actionid = "onLoadSendType";
  this.dataCollect();
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "onLoadSendType",UMActivity.getViewId(control),args);
}
public void actionExcuteResultDialog(View control, UMEventArgs args) {
    String actionid = "ExcuteResultDialog";
    args.put("message","#{res.msg_SendSuccessful}");
    args.put("title","#{res.msg_MessageNotice}");
    args.put("okaction","onCloseClick");
    args.put("okbuttontitle","OK");
    args.put("style","ok");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.openDialog(args);
}
public void actionOnClickCancel(View control, UMEventArgs args) {
    String actionid = "OnClickCancel";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "OnClickCancel",UMActivity.getViewId(control),args);
}
public void actionSelectedCallback(View control, UMEventArgs args) {
    String actionid = "selectedCallback";
  this.dataCollect();
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "selectedCallback",UMActivity.getViewId(control),args);
}
public void actionSendMessage(View control, UMEventArgs args) {
    String actionid = "SendMessage";
  this.dataCollect();
    args.put("contextmapping","ResultValue");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "SendMessage",UMActivity.getViewId(control),args);
}
public void actionBeforeCancel(View control, UMEventArgs args) {
    String actionid = "beforeCancel";
    args.put("message","#{res.msg_IsCancelEdit}");
    args.put("title","#{res.msg_MessageNotice}");
    args.put("okaction","onCloseClick");
    args.put("okbuttontitle","#{res.msg_OK}");
    args.put("style","ok-cancel");
    args.put("containerName","");
    args.put("cancelbuttontitle","#{res.msg_Cancel}");
  ActionProcessor.exec(this, actionid, args);
UMView.openDialog(args);
}
public void actionOpenRecipientList(View control, UMEventArgs args) {
    String actionid = "OpenRecipientList";
    args.put("viewid","nc.bs.oa.oama.ecm.Ecm_SearchDept");
    args.put("iskeep","true");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.open(args);
}
public void actionPanelemail_onload(View control, UMEventArgs args) {
    String actionid = "panelemail_onload";
    args.put("language","javascript");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "this.panel5_onload()",UMActivity.getViewId(control),args);
}
public void actionErrorDialog(View control, UMEventArgs args) {
    String actionid = "errorDialog";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "errorDialog",UMActivity.getViewId(control),args);
}
public void actionAttachmentCallback(View control, UMEventArgs args) {
    String actionid = "AttachmentCallback";
  this.dataCollect();
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "AttachmentCallback",UMActivity.getViewId(control),args);
}
public void actionOpenAttachmentEditList(View control, UMEventArgs args) {
    String actionid = "OpenAttachmentEditList";
    args.put("viewid","nc.bs.oa.oama.ecm.Msg_AttachmentList");
  this.dataCollect();
    args.put("callback","AttachmentCallback");
    args.put("iskeep","true");
    args.put("attachment","#{attachmentlist}");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.open(args);
}
public void actionSendTypeCallback(View control, UMEventArgs args) {
    String actionid = "sendTypeCallback";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "sendTypeCallback",UMActivity.getViewId(control),args);
}


}
