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

public abstract class Msg_MessageContentDetailActivity extends UMWindowActivity {

	protected UMWindow msg_MessageContentDetail = null;
protected XVerticalLayout viewPage0 = null;
protected XVerticalLayout panel1 = null;
protected XHorizontalLayout navigatorbar0 = null;
protected UMButton button0 = null;
protected UMLabel label0 = null;
protected UMButton button1 = null;
protected XHorizontalLayout panel2 = null;
protected UMLabel label1 = null;
protected UMLabel label2 = null;
protected XHorizontalLayout panel3 = null;
protected UMLabel label3 = null;
protected UMLabel label4 = null;
protected XHorizontalLayout panel5 = null;
protected UMLabel label5 = null;
protected UMLabel label6 = null;
protected XHorizontalLayout panelAttachment = null;
protected UMLabel label9 = null;
protected XHorizontalLayout panel0 = null;
protected XHorizontalLayout panel4 = null;
protected UMLabel label8 = null;
protected XHorizontalLayout panel8 = null;
protected UMImage image0 = null;
protected XHorizontalLayout panel6 = null;
protected UMLabel label7 = null;
protected XVerticalLayout panel7 = null;
protected UMLabel label10 = null;

//标题panel
protected XHorizontalLayout panel_msgtitle = null;
//标题字段名
protected UMLabel label_msgtitle_title = null;
//标题字段值
protected UMLabel label_msgtitle = null;

//回复转发按钮组
protected XHorizontalLayout panel_buttongroup = null;
//回复按钮
protected UMButton button_reply = null;
//转发按钮
protected UMButton button_transfer = null;



	
	protected final static int ID_MSG_MESSAGECONTENTDETAIL = 1652453130;
protected final static int ID_VIEWPAGE0 = 1791582154;
protected final static int ID_PANEL1 = 115984778;
protected final static int ID_NAVIGATORBAR0 = 899531176;
protected final static int ID_BUTTON0 = 2064169667;
protected final static int ID_LABEL0 = 1237913020;
protected final static int ID_BUTTON1 = 1582233065;
protected final static int ID_PANEL2 = 1130817554;
protected final static int ID_LABEL1 = 1920716294;
protected final static int ID_LABEL2 = 518065334;
protected final static int ID_PANEL3 = 1747027389;
protected final static int ID_LABEL3 = 1845866163;
protected final static int ID_LABEL4 = 856506712;
protected final static int ID_PANEL5 = 1561733940;
protected final static int ID_LABEL5 = 1730183186;
protected final static int ID_LABEL6 = 1221891766;
protected final static int ID_PANELATTACHMENT = 1702893989;
protected final static int ID_LABEL9 = 1794119287;
protected final static int ID_PANEL0 = 770530230;
protected final static int ID_PANEL4 = 1845015329;
protected final static int ID_LABEL8 = 294063607;
protected final static int ID_PANEL8 = 1975735655;
protected final static int ID_IMAGE0 = 898023443;
protected final static int ID_PANEL6 = 959035826;
protected final static int ID_LABEL7 = 988177335;
protected final static int ID_PANEL7 = 1631573968;
protected final static int ID_LABEL10 = 1215368941;

protected final static int ID_PANEL_MSGTITLE = 115984779;
protected final static int ID_LABEL_MSGTITLE_TITLE = 294063608;
protected final static int ID_LABEL_MSGTITLE = 294063609;

protected final static int ID_PANEL_BUTTONGROUP = 115984771;
protected final static int ID_BUTTON_REPLY = 294063601;
protected final static int ID_BUTTON_TRANSFER = 294063602;
	
	
	@Override
	public String getControllerName() {
		return "msg_MessageContentDetailController";
	}
	
	@Override
	public String getContextName() {
		return "msg_MessageDetail";
	}

	@Override
	public String getNameSpace() {
		return "nc.bs.oa.oama.ecm";
	}

	protected void onCreate(Bundle savedInstanceState) {
		ULog.logLC("onCreate", this);
		super.onCreate(savedInstanceState);
        onInit(savedInstanceState);
        	super.setEvent("onload", "OnLoadMsgDetail");

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
		  idmap.put("msg_MessageContentDetail",ID_MSG_MESSAGECONTENTDETAIL);
  idmap.put("viewPage0",ID_VIEWPAGE0);
  idmap.put("panel1",ID_PANEL1);
  idmap.put("navigatorbar0",ID_NAVIGATORBAR0);
  idmap.put("button0",ID_BUTTON0);
  idmap.put("label0",ID_LABEL0);
  idmap.put("button1",ID_BUTTON1);
  idmap.put("panel2",ID_PANEL2);
  idmap.put("label1",ID_LABEL1);
  idmap.put("label2",ID_LABEL2);
  idmap.put("panel3",ID_PANEL3);
  idmap.put("label3",ID_LABEL3);
  idmap.put("label4",ID_LABEL4);
  idmap.put("panel5",ID_PANEL5);
  idmap.put("label5",ID_LABEL5);
  idmap.put("label6",ID_LABEL6);
  idmap.put("panelAttachment",ID_PANELATTACHMENT);
  idmap.put("label9",ID_LABEL9);
  idmap.put("panel0",ID_PANEL0);
  idmap.put("panel4",ID_PANEL4);
  idmap.put("label8",ID_LABEL8);
  idmap.put("panel8",ID_PANEL8);
  idmap.put("image0",ID_IMAGE0);
  idmap.put("panel6",ID_PANEL6);
  idmap.put("label7",ID_LABEL7);
  idmap.put("panel7",ID_PANEL7);
  idmap.put("label10",ID_LABEL10);
  
  idmap.put("panel_msgtitle", ID_PANEL_MSGTITLE);
  idmap.put("label_msgtitle_title", ID_LABEL_MSGTITLE_TITLE);
  idmap.put("label_msgtitle", ID_LABEL_MSGTITLE);
  
  idmap.put("panel_buttongroup",ID_PANEL_BUTTONGROUP);
  idmap.put("button_reply", ID_BUTTON_REPLY);
  idmap.put("button_transfer", ID_BUTTON_TRANSFER);

	}
	
	public void onLoad() {
		ULog.logLC("onLoad", this);
		if(currentPage!=null) {
			currentPage.onLoad();
		}
	
		{ //viewPage0 - OnLoadMsgDetail
    UMEventArgs args = new UMEventArgs(Msg_MessageContentDetailActivity.this);
    actionOnLoadMsgDetail(viewPage0,args);

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
button0 = (UMButton)ThirdControl.createControl(new UMButton(context),ID_BUTTON0
,"padding-left","15"
,"halign","left"
,"pressed-image","btn_back_touch"
,"width","64"
,"font-pressed-color","#f2adb2"
,"height","44"
,"color","#e50011"
,"layout-type","linear"
,"font-size","17"
,"onclick","GoBack"
,"font-family","default"
,"valign","center"
,"background-image","btn_back"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,button0,"value","#{res.msg_Return}"));
button0.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Msg_MessageContentDetailActivity.this);
    actionGoBack(button0,args);

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
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label0,"content","#{res.msg_MessageDetail}"));
navigatorbar0.addView(label0);
button1 = (UMButton)ThirdControl.createControl(new UMButton(context),ID_BUTTON1
,"halign","center"
,"height","44"
,"visible","false"
,"color","#e50011"
,"layout-type","linear"
,"font-size","17"
,"width","64.0"
,"font-family","default"
,"font-pressed-color","#f2adb2"
,"valign","center"
);
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
,"margin-top","5"
,"valign","center"
,"background-image","list_row_mid1.png"
);
label1 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL1
,"margin-right","15"
,"halign","left"
,"height","wrap"
,"color","#000000"
,"heightwrap","23.0"
,"layout-type","linear"
,"font-size","16"
,"width","70"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label1,"content","#{res.msg_SendPerson}"));
panel2.addView(label1);
label2 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL2
,"bindfield","sendBy"
,"halign","right"
,"weight","1"
,"width","0"
,"height","wrap"
,"color","#6f6f6f"
,"heightwrap","23.0"
,"font-size","16"
,"layout-type","linear"
,"onclick","action:label2_onclick"
,"font-family","default"
,"valign","center"
);
UMTextBinder label2_binder = new UMTextBinder((IUMContextAccessor)context);
label2_binder.setBindInfo(new BindInfo("sendBy"));
label2_binder.setControl(label2);
binderGroup.addBinderToGroup(ID_LABEL2, label2_binder);
label2.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Msg_MessageContentDetailActivity.this);
    actionLabel2_onclick(label2,args);

}
});
panel2.addView(label2);

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
,"background-image","list_row_mid1.png"
);
label3 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL3
,"margin-right","15"
,"halign","left"
,"height","wrap"
,"color","#000000"
,"heightwrap","23.0"
,"layout-type","linear"
,"font-size","16"
,"width","70"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label3,"content","#{res.msg_MessageType}"));
panel3.addView(label3);
label4 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL4
,"bindfield","msgType"
,"halign","right"
,"height","wrap"
,"weight","1"
,"color","#6f6f6f"
,"heightwrap","23.0"
,"layout-type","linear"
,"font-size","16"
,"width","0"
,"font-family","default"
,"valign","center"
);
UMTextBinder label4_binder = new UMTextBinder((IUMContextAccessor)context);
label4_binder.setBindInfo(new BindInfo("msgType"));
label4_binder.setControl(label4);
binderGroup.addBinderToGroup(ID_LABEL4, label4_binder);
panel3.addView(label4);

return panel3;
}
public View getPanel5View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel5 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL5
,"padding-left","15"
,"padding-right","15"
,"height","44"
,"layout-type","linear"
,"width","fill"
,"valign","center"
,"background-image","list_row_mid1.png"
);
label5 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL5
,"margin-right","15"
,"halign","left"
,"height","wrap"
,"color","#000000"
,"heightwrap","23.0"
,"layout-type","linear"
,"font-size","16"
,"width","70"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label5,"content","#{res.msg_SendOutTime}"));
panel5.addView(label5);
label6 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL6
,"bindfield","sendDate"
,"halign","right"
,"height","wrap"
,"weight","1"
,"color","#6f6f6f"
,"heightwrap","23.0"
,"layout-type","linear"
,"font-size","16"
,"width","0"
,"font-family","default"
,"valign","center"
);
UMTextBinder label6_binder = new UMTextBinder((IUMContextAccessor)context);
label6_binder.setBindInfo(new BindInfo("sendDate"));
label6_binder.setControl(label6);
binderGroup.addBinderToGroup(ID_LABEL6, label6_binder);
panel5.addView(label6);

return panel5;
}
public View getPanel4View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel4 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL4
,"height","44"
,"weight","1"
,"layout-type","linear"
,"width","0"
,"valign","center"
);
label8 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL8
,"bindfield","attachment"
,"margin-right","5"
,"halign","right"
,"height","23"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","fill"
,"onclick","OpenAttachmentList4View"
,"font-family","default"
,"valign","center"
);
UMTextBinder label8_binder = new UMTextBinder((IUMContextAccessor)context);
label8_binder.setBindInfo(new BindInfo("attachment"));
label8_binder.setControl(label8);
binderGroup.addBinderToGroup(ID_LABEL8, label8_binder);
label8.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Msg_MessageContentDetailActivity.this);
    actionOpenAttachmentList4View(label8,args);

}
});
panel4.addView(label8);

return panel4;
}
public View getPanel8View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel8 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL8
,"height","44.0"
,"layout-type","linear"
,"width","10"
,"valign","center"
);
image0 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_IMAGE0
,"height","20"
,"layout-type","linear"
,"width","10"
,"scaletype","fitcenter"
,"src","ecm_set_jt.png"
);
panel8.addView(image0);

return panel8;
}
public View getPanel0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel0 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL0
,"height","44"
,"layout-type","linear"
,"width","fill"
,"valign","center"
);
View panel4 = (View) getPanel4View((UMActivity)context,binderGroup,configure);
panel0.addView(panel4);
View panel8 = (View) getPanel8View((UMActivity)context,binderGroup,configure);
panel0.addView(panel8);

return panel0;
}
public View getPanelAttachmentView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panelAttachment = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANELATTACHMENT
,"padding-right","15"
,"padding-left","15"
,"height","44"
,"layout-type","linear"
,"width","fill"
,"valign","center"
,"background-image","list_row_mid1.png"
);
label9 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL9
,"margin-right","15"
,"halign","left"
,"height","wrap"
,"color","#000000"
,"heightwrap","23.0"
,"layout-type","linear"
,"font-size","16"
,"width","70"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label9,"content","#{res.msg_Attachment}"));
panelAttachment.addView(label9);
View panel0 = (View) getPanel0View((UMActivity)context,binderGroup,configure);
panelAttachment.addView(panel0);

return panelAttachment;
}
public View getPanel6View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel6 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL6
,"margin-right","15"
,"height","30"
,"layout-type","linear"
,"width","fill"
,"margin-left","15"
,"valign","center"
);
label7 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL7
,"halign","left"
,"widthwrap","202.0"
,"width","wrap"
,"margin-right","15"
,"height","wrap"
,"color","#6f6f6f"
,"heightwrap","20.0"
,"font-size","14"
,"layout-type","linear"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label7,"content","#{res.msg_MessageContent}"));
panel6.addView(label7);

return panel6;
}
public View getPanel7View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel7 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL7
,"padding-right","5"
,"padding-left","15"
,"halign","left"
,"height","0"
,"weight","1"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"margin-bottom","0"
);
label10 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL10
,"bindfield","content"
,"halign","left"
,"height","wrap"
,"color","#6f6f6f"
,"heightwrap","190.0"
,"layout-type","linear"
,"font-size","14"
,"width","fill"
,"font-family","default"
,"valign","top"
,"type","multiline"
);
UMTextBinder label10_binder = new UMTextBinder((IUMContextAccessor)context);
label10_binder.setBindInfo(new BindInfo("content"));
label10_binder.setControl(label10);
binderGroup.addBinderToGroup(ID_LABEL10, label10_binder);
panel7.addView(label10);

return panel7;
}
public View getPanel1View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel1 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL1
,"halign","left"
,"height","fill"
,"layout-type","linear"
,"width","fill"
,"background","#efeff4"
);
View navigatorbar0 = (View) getNavigatorbar0View((UMActivity)context,binderGroup,configure);
panel1.addView(navigatorbar0);
View panel2 = (View) getPanel2View((UMActivity)context,binderGroup,configure);
panel1.addView(panel2);
//添加明细界面的标题
View panel_msgtitle = (View) getPanel_msgtitleView((UMActivity)context,binderGroup,configure);
panel1.addView(panel_msgtitle);
View panel3 = (View) getPanel3View((UMActivity)context,binderGroup,configure);
panel1.addView(panel3);
View panel5 = (View) getPanel5View((UMActivity)context,binderGroup,configure);
panel1.addView(panel5);
View panelAttachment = (View) getPanelAttachmentView((UMActivity)context,binderGroup,configure);
panel1.addView(panelAttachment);
View panel6 = (View) getPanel6View((UMActivity)context,binderGroup,configure);
panel1.addView(panel6);
View panel7 = (View) getPanel7View((UMActivity)context,binderGroup,configure);
panel1.addView(panel7);
View panel_buttongroup = (View) getPanelButtonGroupView((UMActivity)context,binderGroup,configure);
panel1.addView(panel_buttongroup);
return panel1;
}
public View getPanelButtonGroupView(UMActivity context,
		IBinderGroup binderGroup, UMDslConfigure configure) {
	panel_buttongroup = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL_BUTTONGROUP
			,"padding-right","15"
			,"padding-left","15"
			,"halign","left"
			,"valign","center"
			,"height","44"
			,"weight","0"
			,"layout-type","linear"
			,"background","#ffffff"
			,"width","fill"
			,"margin-bottom","0"
			,"margin-top","5"
			);
	
	button_reply = (UMButton)ThirdControl.createControl(new UMButton(context),ID_BUTTON_REPLY
			,"padding-left","35"
			,"halign","left"
//			,"pressed-image","btn_back_touch"
			,"width","64"
			,"font-pressed-color","#f2adb2"
			,"height","44"
			,"weight","1"
			,"color","#e50011"
			,"layout-type","linear"
			,"font-size","17"
			,"onclick","Reply"
			,"font-family","default"
			,"valign","center"
//			,"background-image","btn_back"
			);
			binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,button_reply,"value","#{res.msg_Reply}"));
			button_reply.setOnClickListener(new View.OnClickListener() {
			  @Override
			  public void onClick(View v) {
			    UMEventArgs args = new UMEventArgs(Msg_MessageContentDetailActivity.this);
//			    actionGoBack(button_reply,args);
			    actionReply(button_reply,args);
			}
			});
			panel_buttongroup.addView(button_reply);
	button_transfer = (UMButton)ThirdControl.createControl(new UMButton(context),ID_BUTTON_TRANSFER
			,"padding-right","35"
			,"halign","right"
//			,"pressed-image","btn_back_touch"
			,"width","64"
			,"font-pressed-color","#f2adb2"
			,"height","44"
			,"weight","1"
			,"color","#e50011"
			,"layout-type","linear"
			,"font-size","17"
			,"onclick","Transfer"
			,"font-family","default"
			,"valign","center"
//			,"background-image","btn_back"
			);
			binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,button_transfer,"value","#{res.msg_Transfer}"));
			button_transfer.setOnClickListener(new View.OnClickListener() {
			  @Override
			  public void onClick(View v) {
			    UMEventArgs args = new UMEventArgs(Msg_MessageContentDetailActivity.this);
//			    actionGoBack(button_transfer,args);
			    actionTransfer(button_transfer,args);
			}
			});
			panel_buttongroup.addView(button_transfer);
	return panel_buttongroup;
}

public View getPanel_msgtitleView(UMActivity context,
		IBinderGroup binderGroup, UMDslConfigure configure) {
	panel_msgtitle = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL_MSGTITLE
			,"padding-left","15"
			,"padding-right","15"
			,"height","44"
			,"layout-type","linear"
			,"width","fill"
			,"margin-top","0"
			,"valign","center"
			,"background-image","list_row_mid1.png"
			);
			label_msgtitle_title = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL_MSGTITLE_TITLE
			,"margin-right","15"
			,"halign","left"
			,"height","wrap"
			,"color","#000000"
			,"heightwrap","23.0"
			,"layout-type","linear"
			,"font-size","16"
			,"width","70"
			,"font-family","default"
			,"valign","center"
			);
			binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label_msgtitle_title,"content","#{res.msg_msgtitle}"));
			panel_msgtitle.addView(label_msgtitle_title);
			label_msgtitle = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL_MSGTITLE
			,"bindfield","msgtitle"
			,"halign","right"
			,"weight","1"
			,"width","0"
			,"height","wrap"
			,"color","#6f6f6f"
			,"heightwrap","23.0"
			,"font-size","16"
			,"layout-type","linear"
			,"onclick","action:label2_onclick"
			,"font-family","default"
			,"valign","center"
			);
			UMTextBinder label_msgtitle_binder = new UMTextBinder((IUMContextAccessor)context);
			label_msgtitle_binder.setBindInfo(new BindInfo("msgtitle"));
			label_msgtitle_binder.setControl(label_msgtitle);
			binderGroup.addBinderToGroup(ID_LABEL_MSGTITLE, label_msgtitle_binder);
			label_msgtitle.setOnClickListener(new View.OnClickListener() {
			  @Override
			  public void onClick(View v) {
			    UMEventArgs args = new UMEventArgs(Msg_MessageContentDetailActivity.this);
			    actionLabel2_onclick(label_msgtitle,args);

			}
			});
			panel_msgtitle.addView(label_msgtitle);

			return panel_msgtitle;
}

public View getViewPage0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
viewPage0 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_VIEWPAGE0
,"halign","center"
,"height","fill"
,"onload","OnLoadMsgDetail"
,"layout-type","vbox"
,"width","fill"
);
View panel1 = (View) getPanel1View((UMActivity)context,binderGroup,configure);
viewPage0.addView(panel1);

return viewPage0;
}
public UMWindow getCurrentWindow(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
msg_MessageContentDetail = (UMWindow)ThirdControl.createControl(new UMWindow(context),ID_MSG_MESSAGECONTENTDETAIL
,"halign","center"
,"height","fill"
,"onload","OnLoadMsgDetail"
,"layout","vbox"
,"width","fill"
,"context","msg_MessageDetail"
,"controller","msg_MessageContentDetailController"
,"namespace","nc.bs.oa.oama.ecm"
);
View viewPage0 = (View) getViewPage0View((UMActivity)context,binderGroup,configure);
msg_MessageContentDetail.addView(viewPage0);

return (UMWindow)msg_MessageContentDetail;
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
    args.put("resultcode","15");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.close(args);
}
public void actionOnLoadMsgDetail(View control, UMEventArgs args) {
    String actionid = "OnLoadMsgDetail";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "OnLoadMsgDetail",UMActivity.getViewId(control),args);
}
public void actionOpenAttachmentList4View(View control, UMEventArgs args) {
    String actionid = "OpenAttachmentList4View";
    args.put("msgid","#{msgID}");
    args.put("viewid","nc.bs.oa.oama.ecm.Msg_AttachmentList4View");
  this.dataCollect();
    args.put("iskeep","true");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.open(args);
}

public void actionReply(View control, UMEventArgs args) {
    String actionid = "NewMessage";
    args.put("viewid","nc.bs.oa.oama.ecm.Msg_SendMessage");
    args.put("callback","");
    args.put("iskeep","true");
    args.put("containerName","");
    args.put("actionType","Reply");
    args.put("msgtitle","#{msgtitle}");
    args.put("sendBy","#{sendBy}");
    args.put("content","#{content}");
  ActionProcessor.exec(this, actionid, args);
UMView.open(args);
}

public void actionTransfer(View control, UMEventArgs args) {
    String actionid = "NewMessage";
    args.put("viewid","nc.bs.oa.oama.ecm.Msg_SendMessage");
    args.put("callback","");
    args.put("iskeep","true");
    args.put("containerName","");
    args.put("actionType","Transfer");
    args.put("transfer_msgtitle","#{msgtitle}");
    args.put("msgtitle","#{msgtitle}");
    args.put("sendBy","#{sendBy}");
    args.put("content","#{content}");
   
  ActionProcessor.exec(this, actionid, args);
UMView.open(args);
}


}
