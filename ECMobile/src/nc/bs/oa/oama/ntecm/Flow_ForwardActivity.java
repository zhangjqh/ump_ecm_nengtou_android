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

public abstract class Flow_ForwardActivity extends UMWindowActivity {

	protected UMWindow Forward = null;
protected XVerticalLayout basePanel = null;
protected XVerticalLayout navPanel = null;
protected XHorizontalLayout navigatorbar = null;
protected XVerticalLayout leftPanel = null;
protected UMButton cancelBtn = null;
protected XHorizontalLayout centerPanel = null;
protected UMLabel navLabel = null;
protected XVerticalLayout rightPanel = null;
protected UMButton submitBtn = null;
protected XVerticalLayout scrollPanel = null;
protected UMScrollView Scrollview_mainPanel = null;
protected XVerticalLayout mainPanel = null;
protected XVerticalLayout spaceOutPanel = null;
protected XVerticalLayout spaceInnerPanel = null;
protected XHorizontalLayout flowPanel = null;
protected UMLabel flowLabel = null;
protected UMLabel flowInfoLabel = null;
protected UMLabel flowSpaceLabel = null;
protected UMImage flowImg = null;
protected XVerticalLayout spaceOutPanel1 = null;
protected XHorizontalLayout spaceInnerPanel1 = null;
protected UMLabel contentLabel = null;
protected XHorizontalLayout contentPanel = null;
protected UMTextArea contentArea = null;
protected XVerticalLayout spaceOutPanel2 = null;
protected XVerticalLayout spaceInnerPanel2 = null;
protected XHorizontalLayout attachmentPanel = null;
protected UMLabel attachmentLabel = null;
protected UMLabel attachmentInfoLabel = null;
protected UMLabel attachmentSpaceLabel = null;
protected UMImage attachmentImg = null;
protected XVerticalLayout spaceOutPanel3 = null;
protected XVerticalLayout spaceInnerPanel3 = null;

	
	protected final static int ID_FORWARD = 390299951;
protected final static int ID_BASEPANEL = 1616935390;
protected final static int ID_NAVPANEL = 1172200887;
protected final static int ID_NAVIGATORBAR = 211654177;
protected final static int ID_LEFTPANEL = 2076434168;
protected final static int ID_CANCELBTN = 368388186;
protected final static int ID_CENTERPANEL = 692403377;
protected final static int ID_NAVLABEL = 2086876573;
protected final static int ID_RIGHTPANEL = 944525396;
protected final static int ID_SUBMITBTN = 630672921;
protected final static int ID_SCROLLPANEL = 6753793;
protected final static int ID_SCROLLVIEW_MAINPANEL = 1602382684;
protected final static int ID_MAINPANEL = 210215161;
protected final static int ID_SPACEOUTPANEL = 1292515871;
protected final static int ID_SPACEINNERPANEL = 949074542;
protected final static int ID_FLOWPANEL = 667800448;
protected final static int ID_FLOWLABEL = 1994008057;
protected final static int ID_FLOWINFOLABEL = 1491802507;
protected final static int ID_FLOWSPACELABEL = 964817824;
protected final static int ID_FLOWIMG = 966591974;
protected final static int ID_SPACEOUTPANEL1 = 1931787986;
protected final static int ID_SPACEINNERPANEL1 = 868354389;
protected final static int ID_CONTENTLABEL = 175382004;
protected final static int ID_CONTENTPANEL = 622724623;
protected final static int ID_CONTENTAREA = 1160469299;
protected final static int ID_SPACEOUTPANEL2 = 1797576942;
protected final static int ID_SPACEINNERPANEL2 = 537133257;
protected final static int ID_ATTACHMENTPANEL = 104810066;
protected final static int ID_ATTACHMENTLABEL = 937802894;
protected final static int ID_ATTACHMENTINFOLABEL = 1146006133;
protected final static int ID_ATTACHMENTSPACELABEL = 488114567;
protected final static int ID_ATTACHMENTIMG = 922421370;
protected final static int ID_SPACEOUTPANEL3 = 1028952676;
protected final static int ID_SPACEINNERPANEL3 = 2081071653;

	
	
	@Override
	public String getControllerName() {
		return "ForwardController";
	}
	
	@Override
	public String getContextName() {
		return "ForwardDetail";
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
		{ //basePanel - flowCallback
    UMEventArgs args = new UMEventArgs(Flow_ForwardActivity.this);
    actionFlowCallback(basePanel,args);

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
		  idmap.put("Forward",ID_FORWARD);
  idmap.put("basePanel",ID_BASEPANEL);
  idmap.put("navPanel",ID_NAVPANEL);
  idmap.put("navigatorbar",ID_NAVIGATORBAR);
  idmap.put("leftPanel",ID_LEFTPANEL);
  idmap.put("cancelBtn",ID_CANCELBTN);
  idmap.put("centerPanel",ID_CENTERPANEL);
  idmap.put("navLabel",ID_NAVLABEL);
  idmap.put("rightPanel",ID_RIGHTPANEL);
  idmap.put("submitBtn",ID_SUBMITBTN);
  idmap.put("scrollPanel",ID_SCROLLPANEL);
  idmap.put("Scrollview_mainPanel",ID_SCROLLVIEW_MAINPANEL);
  idmap.put("mainPanel",ID_MAINPANEL);
  idmap.put("spaceOutPanel",ID_SPACEOUTPANEL);
  idmap.put("spaceInnerPanel",ID_SPACEINNERPANEL);
  idmap.put("flowPanel",ID_FLOWPANEL);
  idmap.put("flowLabel",ID_FLOWLABEL);
  idmap.put("flowInfoLabel",ID_FLOWINFOLABEL);
  idmap.put("flowSpaceLabel",ID_FLOWSPACELABEL);
  idmap.put("flowImg",ID_FLOWIMG);
  idmap.put("spaceOutPanel1",ID_SPACEOUTPANEL1);
  idmap.put("spaceInnerPanel1",ID_SPACEINNERPANEL1);
  idmap.put("contentLabel",ID_CONTENTLABEL);
  idmap.put("contentPanel",ID_CONTENTPANEL);
  idmap.put("contentArea",ID_CONTENTAREA);
  idmap.put("spaceOutPanel2",ID_SPACEOUTPANEL2);
  idmap.put("spaceInnerPanel2",ID_SPACEINNERPANEL2);
  idmap.put("attachmentPanel",ID_ATTACHMENTPANEL);
  idmap.put("attachmentLabel",ID_ATTACHMENTLABEL);
  idmap.put("attachmentInfoLabel",ID_ATTACHMENTINFOLABEL);
  idmap.put("attachmentSpaceLabel",ID_ATTACHMENTSPACELABEL);
  idmap.put("attachmentImg",ID_ATTACHMENTIMG);
  idmap.put("spaceOutPanel3",ID_SPACEOUTPANEL3);
  idmap.put("spaceInnerPanel3",ID_SPACEINNERPANEL3);

	}
	
	public void onLoad() {
		ULog.logLC("onLoad", this);
		if(currentPage!=null) {
			currentPage.onLoad();
		}
	
		{ //basePanel - onDataLoad
    UMEventArgs args = new UMEventArgs(Flow_ForwardActivity.this);
    actionOnDataLoad(basePanel,args);

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
	
	
	
	public View getLeftPanelView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
leftPanel = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_LEFTPANEL
,"halign","left"
,"height","fill"
,"layout-type","linear"
,"width","88"
);
cancelBtn = (UMButton)ThirdControl.createControl(new UMButton(context),ID_CANCELBTN
,"halign","left"
,"pressed-image","button_touch"
,"width","fill"
,"background-image-dis","button"
,"font-pressed-color","#f2adb2"
,"height","44"
,"color","#e50011"
,"layout-type","linear"
,"font-size","17"
,"onclick","onCancelBtnClick"
,"font-family","default"
,"valign","center"
,"background-image","button"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,cancelBtn,"value","#{res.flow_cancel}"));
cancelBtn.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Flow_ForwardActivity.this);
    actionOnCancelBtnClick(cancelBtn,args);

}
});
leftPanel.addView(cancelBtn);

return leftPanel;
}
public View getCenterPanelView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
centerPanel = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_CENTERPANEL
,"padding-right","8"
,"padding-left","8"
,"height","fill"
,"weight","1"
,"layout-type","linear"
,"width","0"
,"valign","center"
);
navLabel = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_NAVLABEL
,"halign","center"
,"height","fill"
,"color","#000000"
,"layout-type","linear"
,"font-size","17"
,"width","fill"
,"font-family","default"
,"valign","center"
,"readonly","true"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,navLabel,"content","#{res.flow_collaborationforward}"));
centerPanel.addView(navLabel);

return centerPanel;
}
public View getRightPanelView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
rightPanel = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_RIGHTPANEL
,"halign","right"
,"height","fill"
,"layout-type","linear"
,"width","88"
);
submitBtn = (UMButton)ThirdControl.createControl(new UMButton(context),ID_SUBMITBTN
,"halign","right"
,"pressed-image","button_touch"
,"width","fill"
,"background-image-dis","button"
,"font-pressed-color","#f2adb2"
,"height","44"
,"color","#e50011"
,"layout-type","linear"
,"font-size","17"
,"onclick","onSubmitBtnClick"
,"font-family","default"
,"valign","center"
,"background-image","button"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,submitBtn,"value","#{res.flow_submit}"));
submitBtn.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Flow_ForwardActivity.this);
    actionOnSubmitBtnClick(submitBtn,args);

}
});
rightPanel.addView(submitBtn);

return rightPanel;
}
public View getNavigatorbarView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
navigatorbar = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_NAVIGATORBAR
,"padding-left","8"
,"padding-right","8"
,"pressed-image","nav"
,"width","fill"
,"background-image-dis","nav"
,"height","fill"
,"color","#ffffff"
,"layout-type","linear"
,"font-size","17"
,"font-family","default"
,"valign","center"
,"background-image","nav.png"
);
View leftPanel = (View) getLeftPanelView((UMActivity)context,binderGroup,configure);
navigatorbar.addView(leftPanel);
View centerPanel = (View) getCenterPanelView((UMActivity)context,binderGroup,configure);
navigatorbar.addView(centerPanel);
View rightPanel = (View) getRightPanelView((UMActivity)context,binderGroup,configure);
navigatorbar.addView(rightPanel);

return navigatorbar;
}
public View getNavPanelView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
navPanel = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_NAVPANEL
,"halign","center"
,"height","44"
,"layout-type","linear"
,"background","#E6E6E6"
,"width","fill"
);
View navigatorbar = (View) getNavigatorbarView((UMActivity)context,binderGroup,configure);
navPanel.addView(navigatorbar);

return navPanel;
}
public View getSpaceOutPanelView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
spaceOutPanel = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_SPACEOUTPANEL
,"halign","center"
,"height","16"
,"layout-type","linear"
,"background","#c8c7cc"
,"width","fill"
,"padding-bottom","1"
);
spaceInnerPanel = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_SPACEINNERPANEL
,"halign","center"
,"height","0"
,"weight","1"
,"layout-type","linear"
,"background","#efeff4"
,"width","fill"
);
spaceOutPanel.addView(spaceInnerPanel);

return spaceOutPanel;
}
public View getFlowPanelView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
flowPanel = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_FLOWPANEL
,"padding-left","15"
,"padding-right","15"
,"height","44"
,"layout-type","linear"
,"background","#FFFFFF"
,"width","fill"
,"onclick","onFlowClick"
,"valign","center"
);
flowPanel.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Flow_ForwardActivity.this);
    actionOnFlowClick(flowPanel,args);

}
});
flowLabel = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_FLOWLABEL
,"bindfield",""
,"halign","left"
,"weight","1"
,"width","0"
,"height","fill"
,"color","#000000"
,"font-size","16"
,"layout-type","linear"
,"font-family","default"
,"valign","center"
,"readonly","true"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,flowLabel,"content","#{res.flow_forwardto}"));
flowPanel.addView(flowLabel);
flowInfoLabel = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_FLOWINFOLABEL
,"halign","right"
,"height","fill"
,"color","#8e8e93"
,"layout-type","linear"
,"font-size","16"
,"width","200"
,"font-family","default"
,"valign","center"
,"readonly","true"
);
flowPanel.addView(flowInfoLabel);
flowSpaceLabel = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_FLOWSPACELABEL
,"halign","center"
,"height","fill"
,"color","#8e8e93"
,"layout-type","linear"
,"font-size","16"
,"width","15"
,"font-family","default"
,"valign","center"
,"readonly","true"
);
flowPanel.addView(flowSpaceLabel);
flowImg = (UMImage)ThirdControl.createControl(new UMImage(context),ID_FLOWIMG
,"height","13"
,"layout-type","linear"
,"width","8"
,"scaletype","fitcenter"
,"src","ecm_arrow_right.png"
);
flowPanel.addView(flowImg);

return flowPanel;
}
public View getSpaceInnerPanel1View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
spaceInnerPanel1 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_SPACEINNERPANEL1
,"padding-right","15"
,"padding-left","15"
,"height","0"
,"weight","1"
,"layout-type","linear"
,"background","#efeff4"
,"width","fill"
,"valign","center"
);
contentLabel = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_CONTENTLABEL
,"halign","left"
,"height","30"
,"color","#727272"
,"layout-type","linear"
,"font-size","14"
,"width","fill"
,"font-family","default"
,"valign","center"
,"readonly","true"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,contentLabel,"content","#{res.flow_forwardopinion}"));
spaceInnerPanel1.addView(contentLabel);

return spaceInnerPanel1;
}
public View getSpaceOutPanel1View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
spaceOutPanel1 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_SPACEOUTPANEL1
,"padding-top","1"
,"halign","center"
,"height","32"
,"layout-type","linear"
,"background","#c8c7cc"
,"width","fill"
,"padding-bottom","1"
);
View spaceInnerPanel1 = (View) getSpaceInnerPanel1View((UMActivity)context,binderGroup,configure);
spaceOutPanel1.addView(spaceInnerPanel1);

return spaceOutPanel1;
}
public View getContentPanelView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
contentPanel = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_CONTENTPANEL
,"padding-left","15"
,"padding-right","15"
,"height","100"
,"layout-type","linear"
,"background","#FFFFFF"
,"width","fill"
,"valign","center"
);
contentArea = (UMTextArea)ThirdControl.createControl(new UMTextArea(context),ID_CONTENTAREA
,"bindfield","opinion"
,"height","fill"
,"weight","1"
,"color","#000000"
,"layout-type","linear"
,"font-size","16"
,"width","0"
,"font-family","default"
,"readonly","false"
);
UMTextBinder contentArea_binder = new UMTextBinder((IUMContextAccessor)context);
contentArea_binder.setBindInfo(new BindInfo("opinion"));
contentArea_binder.setControl(contentArea);
binderGroup.addBinderToGroup(ID_CONTENTAREA, contentArea_binder);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,contentArea,"placeholder","#{res.flow_forwardplaceholder}"));
contentPanel.addView(contentArea);

return contentPanel;
}
public View getSpaceOutPanel2View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
spaceOutPanel2 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_SPACEOUTPANEL2
,"padding-top","1"
,"halign","center"
,"height","22"
,"layout-type","linear"
,"background","#c8c7cc"
,"width","fill"
,"padding-bottom","1"
);
spaceInnerPanel2 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_SPACEINNERPANEL2
,"halign","center"
,"height","0"
,"weight","1"
,"layout-type","linear"
,"background","#efeff4"
,"width","fill"
);
spaceOutPanel2.addView(spaceInnerPanel2);

return spaceOutPanel2;
}
public View getAttachmentPanelView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
attachmentPanel = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_ATTACHMENTPANEL
,"padding-right","15"
,"padding-left","15"
,"height","44"
,"layout-type","linear"
,"background","#FFFFFF"
,"width","fill"
,"onclick","onAttachmentClick"
,"valign","center"
);
attachmentPanel.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Flow_ForwardActivity.this);
    actionOnAttachmentClick(attachmentPanel,args);

}
});
attachmentLabel = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_ATTACHMENTLABEL
,"halign","left"
,"height","fill"
,"weight","1"
,"color","#000000"
,"layout-type","linear"
,"font-size","16"
,"width","0"
,"font-family","default"
,"valign","center"
,"readonly","true"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,attachmentLabel,"content","#{res.flow_attachment}"));
attachmentPanel.addView(attachmentLabel);
attachmentInfoLabel = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_ATTACHMENTINFOLABEL
,"halign","right"
,"height","fill"
,"color","#8e8e93"
,"layout-type","linear"
,"font-size","16"
,"width","40"
,"font-family","default"
,"valign","center"
,"readonly","true"
);
attachmentPanel.addView(attachmentInfoLabel);
attachmentSpaceLabel = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_ATTACHMENTSPACELABEL
,"halign","center"
,"height","fill"
,"color","#8e8e93"
,"layout-type","linear"
,"font-size","16"
,"width","15"
,"font-family","default"
,"valign","center"
,"readonly","true"
);
attachmentPanel.addView(attachmentSpaceLabel);
attachmentImg = (UMImage)ThirdControl.createControl(new UMImage(context),ID_ATTACHMENTIMG
,"height","13"
,"layout-type","linear"
,"width","8"
,"scaletype","fitcenter"
,"src","ecm_arrow_right.png"
);
attachmentPanel.addView(attachmentImg);

return attachmentPanel;
}
public View getSpaceOutPanel3View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
spaceOutPanel3 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_SPACEOUTPANEL3
,"padding-top","1"
,"halign","center"
,"height","21"
,"layout-type","linear"
,"background","#c8c7cc"
,"width","fill"
);
spaceInnerPanel3 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_SPACEINNERPANEL3
,"halign","center"
,"height","0"
,"weight","1"
,"layout-type","linear"
,"background","#efeff4"
,"width","fill"
);
spaceOutPanel3.addView(spaceInnerPanel3);

return spaceOutPanel3;
}
public View getMainPanelView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
mainPanel = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_MAINPANEL
,"halign","center"
,"height","wrap"
,"layout-type","linear"
,"width","fill"
);
View spaceOutPanel = (View) getSpaceOutPanelView((UMActivity)context,binderGroup,configure);
mainPanel.addView(spaceOutPanel);
View flowPanel = (View) getFlowPanelView((UMActivity)context,binderGroup,configure);
mainPanel.addView(flowPanel);
View spaceOutPanel1 = (View) getSpaceOutPanel1View((UMActivity)context,binderGroup,configure);
mainPanel.addView(spaceOutPanel1);
View contentPanel = (View) getContentPanelView((UMActivity)context,binderGroup,configure);
mainPanel.addView(contentPanel);
View spaceOutPanel2 = (View) getSpaceOutPanel2View((UMActivity)context,binderGroup,configure);
mainPanel.addView(spaceOutPanel2);
View attachmentPanel = (View) getAttachmentPanelView((UMActivity)context,binderGroup,configure);
mainPanel.addView(attachmentPanel);
View spaceOutPanel3 = (View) getSpaceOutPanel3View((UMActivity)context,binderGroup,configure);
mainPanel.addView(spaceOutPanel3);

return mainPanel;
}
public View getScrollview_mainPanelView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
Scrollview_mainPanel = (UMScrollView)ThirdControl.createControl(new UMScrollView(context),ID_SCROLLVIEW_MAINPANEL
,"height","0"
,"weight","1"
,"layout-type","linear"
,"width","fill"
,"hscrollenabled","disabled"
);
View mainPanel = (View) getMainPanelView((UMActivity)context,binderGroup,configure);
Scrollview_mainPanel.addView(mainPanel);

return Scrollview_mainPanel;
}
public View getScrollPanelView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
scrollPanel = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_SCROLLPANEL
,"halign","center"
,"height","0"
,"weight","1"
,"layout-type","linear"
,"width","fill"
);
View Scrollview_mainPanel = (View) getScrollview_mainPanelView((UMActivity)context,binderGroup,configure);
scrollPanel.addView(Scrollview_mainPanel);

return scrollPanel;
}
public View getBasePanelView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
basePanel = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_BASEPANEL
,"halign","center"
,"height","fill"
,"onload","onDataLoad"
,"layout-type","vbox"
,"background","#efeff4"
,"width","fill"
,"onresume","flowCallback"
);
View navPanel = (View) getNavPanelView((UMActivity)context,binderGroup,configure);
basePanel.addView(navPanel);
View scrollPanel = (View) getScrollPanelView((UMActivity)context,binderGroup,configure);
basePanel.addView(scrollPanel);

return basePanel;
}
public UMWindow getCurrentWindow(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
Forward = (UMWindow)ThirdControl.createControl(new UMWindow(context),ID_FORWARD
,"halign","center"
,"height","fill"
,"layout","vbox"
,"width","fill"
,"context","ForwardDetail"
,"controller","ForwardController"
,"namespace","nc.bs.oa.oama.ecm"
);
View basePanel = (View) getBasePanelView((UMActivity)context,binderGroup,configure);
Forward.addView(basePanel);

return (UMWindow)Forward;
}

	
	public void actionOnCancelBtnClick(View control, UMEventArgs args) {
    String actionid = "onCancelBtnClick";
  this.dataCollect();
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "onCancelBtnClick",UMActivity.getViewId(control),args);
}
public void actionOnCloseClick(View control, UMEventArgs args) {
    String actionid = "onCloseClick";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "onCloseClick",UMActivity.getViewId(control),args);
}
public void actionOnFlowClick(View control, UMEventArgs args) {
    String actionid = "onFlowClick";
    args.put("viewid","nc.bs.oa.oama.ecm.Ecm_SearchDept");
    args.put("iskeep","true");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.open(args);
}
public void actionSubmitFailed(View control, UMEventArgs args) {
    String actionid = "submitFailed";
    args.put("message","#{res.flow_forwardfailed}");
    args.put("title","#{res.flow_notice}");
    args.put("okbuttontitle","#{res.flow_ok}");
    args.put("style","ok");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.openDialog(args);
}
public void actionOnDataLoad(View control, UMEventArgs args) {
    String actionid = "onDataLoad";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "onDataLoad",UMActivity.getViewId(control),args);
}
public void actionOnSubmitBtnClick(View control, UMEventArgs args) {
    String actionid = "onSubmitBtnClick";
  this.dataCollect();
    args.put("contextmapping","ResultValue");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "onSubmitBtnClick",UMActivity.getViewId(control),args);
}
public void actionAttachmentCallback(View control, UMEventArgs args) {
    String actionid = "attachmentCallback";
  this.dataCollect();
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "attachmentCallback",UMActivity.getViewId(control),args);
}
public void actionBeforeCancel(View control, UMEventArgs args) {
    String actionid = "beforeCancel";
    args.put("message","#{res.flow_giveup}");
    args.put("title","#{res.flow_notice}");
    args.put("okaction","onCloseClick");
    args.put("okbuttontitle","#{res.flow_ok}");
    args.put("style","ok-cancel");
    args.put("containerName","");
    args.put("cancelbuttontitle","#{res.flow_cancel}");
  ActionProcessor.exec(this, actionid, args);
UMView.openDialog(args);
}
public void actionOnAttachmentClick(View control, UMEventArgs args) {
    String actionid = "onAttachmentClick";
    args.put("viewid","nc.bs.oa.oama.ecm.Flow_AttachmentEdit");
    args.put("callback","attachmentCallback");
    args.put("iskeep","true");
    args.put("attachment","#{attachment}");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.open(args);
}
public void actionFlowCallback(View control, UMEventArgs args) {
    String actionid = "flowCallback";
  this.dataCollect();
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "flowCallback",UMActivity.getViewId(control),args);
}
public void actionCacheSent(View control, UMEventArgs args) {
    String actionid = "cacheSent";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "cacheSent",UMActivity.getViewId(control),args);
}
public void actionErrorDialog(View control, UMEventArgs args) {
    String actionid = "errorDialog";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "errorDialog",UMActivity.getViewId(control),args);
}
public void actionSubmitSuccess(View control, UMEventArgs args) {
    String actionid = "submitSuccess";
    args.put("message","#{res.flow_forwardsuccess}");
    args.put("title","#{res.flow_notice}");
    args.put("okbuttontitle","#{res.flow_ok}");
    args.put("okaction","cacheSent");
    args.put("style","ok");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.openDialog(args);
}


}
