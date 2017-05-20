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

public abstract class Flow_SentDetailActivity extends UMWindowActivity {

	protected UMWindow SentDetail = null;
protected XVerticalLayout basePanel = null;
protected XHorizontalLayout navPanel = null;
protected XHorizontalLayout navigatorbar = null;
protected XHorizontalLayout leftPanel = null;
protected UMButton returnBtn = null;
protected XHorizontalLayout centerPanel = null;
protected UMLabel navLabel = null;
protected XVerticalLayout rightPanel = null;
protected UMButton forwardBtn = null;
protected XVerticalLayout scrollPanel = null;
protected UMScrollView Scrollview_mainPanel = null;
protected XVerticalLayout mainPanel = null;
protected XVerticalLayout spaceOutPanel1 = null;
protected XVerticalLayout spaceInnerPanel1 = null;
protected XVerticalLayout detailPanel = null;
protected XVerticalLayout detailInnerPanel = null;
protected XHorizontalLayout titlePanel = null;
protected UMLabel titleTxt = null;
protected XHorizontalLayout priorityPanel = null;
protected UMLabel priorityLabel = null;
protected UMLabel prioritySpaceLabel = null;
protected UMToggleButtonGroup priorityBtnGroup = null;
protected UMToggleButton priorityBtn = null;
protected XHorizontalLayout dataPanel = null;
protected UMLabel dataLabel = null;
protected UMLabel dateSpaceLabel = null;
protected UMLabel dataTxt = null;
protected XVerticalLayout spaceOutPanel2 = null;
protected XVerticalLayout spaceInnerPanel2 = null;
protected XHorizontalLayout contentPanel = null;
protected UMLabel contentLabel = null;
protected UMLabel contentInfoLabel = null;
protected UMLabel contentSpaceLabel = null;
protected UMImage contentImg = null;
protected XVerticalLayout spaceOutPanel3 = null;
protected XVerticalLayout spaceInnerPanel3 = null;
protected XHorizontalLayout historyPanel = null;
protected UMLabel historyLabel = null;
protected UMLabel historyInfoLabel = null;
protected UMLabel historySpaceLabel = null;
protected UMImage historyImg = null;
protected XVerticalLayout spaceOutPanel4 = null;
protected XVerticalLayout spaceInnerPanel4 = null;
protected XHorizontalLayout attachmentPanel = null;
protected UMLabel attachmentLabel = null;
protected UMLabel attachmentInfoLabel = null;
protected UMLabel attachmentSpaceLabel = null;
protected UMImage attachmentImg = null;
protected XVerticalLayout spaceOutPanel5 = null;
protected XVerticalLayout spaceInnerPanel5 = null;

	
	protected final static int ID_SENTDETAIL = 2047008098;
protected final static int ID_BASEPANEL = 1186210622;
protected final static int ID_NAVPANEL = 1747379461;
protected final static int ID_NAVIGATORBAR = 589839032;
protected final static int ID_LEFTPANEL = 651713601;
protected final static int ID_RETURNBTN = 139084173;
protected final static int ID_CENTERPANEL = 1128973687;
protected final static int ID_NAVLABEL = 2118652012;
protected final static int ID_RIGHTPANEL = 1807971282;
protected final static int ID_FORWARDBTN = 1525035675;
protected final static int ID_SCROLLPANEL = 1049310691;
protected final static int ID_SCROLLVIEW_MAINPANEL = 460474553;
protected final static int ID_MAINPANEL = 1783624279;
protected final static int ID_SPACEOUTPANEL1 = 1219132641;
protected final static int ID_SPACEINNERPANEL1 = 1046308841;
protected final static int ID_DETAILPANEL = 2083718638;
protected final static int ID_DETAILINNERPANEL = 1273046024;
protected final static int ID_TITLEPANEL = 661226797;
protected final static int ID_TITLETXT = 1323337585;
protected final static int ID_PRIORITYPANEL = 1048002971;
protected final static int ID_PRIORITYLABEL = 1627344089;
protected final static int ID_PRIORITYSPACELABEL = 800550577;
protected final static int ID_PRIORITYBTNGROUP = 585444545;
protected final static int ID_PRIORITYBTN = 1031668964;
protected final static int ID_DATAPANEL = 1739472501;
protected final static int ID_DATALABEL = 852321494;
protected final static int ID_DATESPACELABEL = 1304952509;
protected final static int ID_DATATXT = 1044561950;
protected final static int ID_SPACEOUTPANEL2 = 317380606;
protected final static int ID_SPACEINNERPANEL2 = 1569550517;
protected final static int ID_CONTENTPANEL = 1977632835;
protected final static int ID_CONTENTLABEL = 730819728;
protected final static int ID_CONTENTINFOLABEL = 1254155738;
protected final static int ID_CONTENTSPACELABEL = 594817840;
protected final static int ID_CONTENTIMG = 613545653;
protected final static int ID_SPACEOUTPANEL3 = 65956599;
protected final static int ID_SPACEINNERPANEL3 = 981035899;
protected final static int ID_HISTORYPANEL = 1338931045;
protected final static int ID_HISTORYLABEL = 1082540310;
protected final static int ID_HISTORYINFOLABEL = 791301920;
protected final static int ID_HISTORYSPACELABEL = 1941852620;
protected final static int ID_HISTORYIMG = 585155556;
protected final static int ID_SPACEOUTPANEL4 = 695463328;
protected final static int ID_SPACEINNERPANEL4 = 1842374013;
protected final static int ID_ATTACHMENTPANEL = 2124252805;
protected final static int ID_ATTACHMENTLABEL = 1810024472;
protected final static int ID_ATTACHMENTINFOLABEL = 2137617008;
protected final static int ID_ATTACHMENTSPACELABEL = 716041865;
protected final static int ID_ATTACHMENTIMG = 1425082511;
protected final static int ID_SPACEOUTPANEL5 = 155500495;
protected final static int ID_SPACEINNERPANEL5 = 1828190931;

	
	
	@Override
	public String getControllerName() {
		return "SentDetailController";
	}
	
	@Override
	public String getContextName() {
		return "WorkDetail";
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
		  idmap.put("SentDetail",ID_SENTDETAIL);
  idmap.put("basePanel",ID_BASEPANEL);
  idmap.put("navPanel",ID_NAVPANEL);
  idmap.put("navigatorbar",ID_NAVIGATORBAR);
  idmap.put("leftPanel",ID_LEFTPANEL);
  idmap.put("returnBtn",ID_RETURNBTN);
  idmap.put("centerPanel",ID_CENTERPANEL);
  idmap.put("navLabel",ID_NAVLABEL);
  idmap.put("rightPanel",ID_RIGHTPANEL);
  idmap.put("forwardBtn",ID_FORWARDBTN);
  idmap.put("scrollPanel",ID_SCROLLPANEL);
  idmap.put("Scrollview_mainPanel",ID_SCROLLVIEW_MAINPANEL);
  idmap.put("mainPanel",ID_MAINPANEL);
  idmap.put("spaceOutPanel1",ID_SPACEOUTPANEL1);
  idmap.put("spaceInnerPanel1",ID_SPACEINNERPANEL1);
  idmap.put("detailPanel",ID_DETAILPANEL);
  idmap.put("detailInnerPanel",ID_DETAILINNERPANEL);
  idmap.put("titlePanel",ID_TITLEPANEL);
  idmap.put("titleTxt",ID_TITLETXT);
  idmap.put("priorityPanel",ID_PRIORITYPANEL);
  idmap.put("priorityLabel",ID_PRIORITYLABEL);
  idmap.put("prioritySpaceLabel",ID_PRIORITYSPACELABEL);
  idmap.put("priorityBtnGroup",ID_PRIORITYBTNGROUP);
  idmap.put("priorityBtn",ID_PRIORITYBTN);
  idmap.put("dataPanel",ID_DATAPANEL);
  idmap.put("dataLabel",ID_DATALABEL);
  idmap.put("dateSpaceLabel",ID_DATESPACELABEL);
  idmap.put("dataTxt",ID_DATATXT);
  idmap.put("spaceOutPanel2",ID_SPACEOUTPANEL2);
  idmap.put("spaceInnerPanel2",ID_SPACEINNERPANEL2);
  idmap.put("contentPanel",ID_CONTENTPANEL);
  idmap.put("contentLabel",ID_CONTENTLABEL);
  idmap.put("contentInfoLabel",ID_CONTENTINFOLABEL);
  idmap.put("contentSpaceLabel",ID_CONTENTSPACELABEL);
  idmap.put("contentImg",ID_CONTENTIMG);
  idmap.put("spaceOutPanel3",ID_SPACEOUTPANEL3);
  idmap.put("spaceInnerPanel3",ID_SPACEINNERPANEL3);
  idmap.put("historyPanel",ID_HISTORYPANEL);
  idmap.put("historyLabel",ID_HISTORYLABEL);
  idmap.put("historyInfoLabel",ID_HISTORYINFOLABEL);
  idmap.put("historySpaceLabel",ID_HISTORYSPACELABEL);
  idmap.put("historyImg",ID_HISTORYIMG);
  idmap.put("spaceOutPanel4",ID_SPACEOUTPANEL4);
  idmap.put("spaceInnerPanel4",ID_SPACEINNERPANEL4);
  idmap.put("attachmentPanel",ID_ATTACHMENTPANEL);
  idmap.put("attachmentLabel",ID_ATTACHMENTLABEL);
  idmap.put("attachmentInfoLabel",ID_ATTACHMENTINFOLABEL);
  idmap.put("attachmentSpaceLabel",ID_ATTACHMENTSPACELABEL);
  idmap.put("attachmentImg",ID_ATTACHMENTIMG);
  idmap.put("spaceOutPanel5",ID_SPACEOUTPANEL5);
  idmap.put("spaceInnerPanel5",ID_SPACEINNERPANEL5);

	}
	
	public void onLoad() {
		ULog.logLC("onLoad", this);
		if(currentPage!=null) {
			currentPage.onLoad();
		}
	
		{ //basePanel - onDataLoad
    UMEventArgs args = new UMEventArgs(Flow_SentDetailActivity.this);
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
leftPanel = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LEFTPANEL
,"height","fill"
,"layout-type","linear"
,"width","88"
,"valign","center"
);
returnBtn = (UMButton)ThirdControl.createControl(new UMButton(context),ID_RETURNBTN
,"padding-left","15"
,"halign","left"
,"pressed-image","btn_back_touch"
,"width","64"
,"background-image-dis","button"
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
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,returnBtn,"value","#{res.ecm_back}"));
returnBtn.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Flow_SentDetailActivity.this);
    actionOnReturnBtnClick(returnBtn,args);

}
});
leftPanel.addView(returnBtn);

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
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,navLabel,"content","#{res.flow_collaborationdetail}"));
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
forwardBtn = (UMButton)ThirdControl.createControl(new UMButton(context),ID_FORWARDBTN
,"halign","right"
,"pressed-image","button_touch"
,"width","fill"
,"background-image-dis","button"
,"font-pressed-color","#f2adb2"
,"height","fill"
,"color","#e50011"
,"layout-type","linear"
,"font-size","17"
,"onclick","onForwardBtnClick"
,"font-family","default"
,"valign","center"
,"background-image","button"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,forwardBtn,"value","#{res.flow_forward}"));
forwardBtn.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Flow_SentDetailActivity.this);
    actionOnForwardBtnClick(forwardBtn,args);

}
});
rightPanel.addView(forwardBtn);

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
navPanel = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_NAVPANEL
,"height","44"
,"layout-type","linear"
,"background","#E6E6E6"
,"width","fill"
,"valign","center"
);
View navigatorbar = (View) getNavigatorbarView((UMActivity)context,binderGroup,configure);
navPanel.addView(navigatorbar);

return navPanel;
}
public View getSpaceOutPanel1View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
spaceOutPanel1 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_SPACEOUTPANEL1
,"halign","center"
,"height","16"
,"layout-type","linear"
,"background","#c8c7cc"
,"width","fill"
,"padding-bottom","1"
);
spaceInnerPanel1 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_SPACEINNERPANEL1
,"halign","center"
,"height","0"
,"weight","1"
,"layout-type","linear"
,"background","#efeff4"
,"width","fill"
);
spaceOutPanel1.addView(spaceInnerPanel1);

return spaceOutPanel1;
}
public View getTitlePanelView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
titlePanel = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_TITLEPANEL
,"padding-right","15"
,"height","44"
,"layout-type","linear"
,"background","#FFFFFF"
,"width","fill"
,"valign","center"
);
titleTxt = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_TITLETXT
,"bindfield","title"
,"halign","left"
,"height","fill"
,"color","#000000"
,"layout-type","linear"
,"font-size","16"
,"width","fill"
,"font-family","default"
,"valign","center"
,"readonly","true"
);
UMTextBinder titleTxt_binder = new UMTextBinder((IUMContextAccessor)context);
titleTxt_binder.setBindInfo(new BindInfo("title"));
titleTxt_binder.setControl(titleTxt);
binderGroup.addBinderToGroup(ID_TITLETXT, titleTxt_binder);
titlePanel.addView(titleTxt);

return titlePanel;
}
public View getPriorityBtnGroupView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
priorityBtnGroup = (UMToggleButtonGroup)ThirdControl.createControl(new UMToggleButtonGroup(context),ID_PRIORITYBTNGROUP
,"background-color-dis","#ffffff"
,"bindfield","priority"
,"height","30"
,"weight","1"
,"background","#ffffff"
,"layout","hbox"
,"width","0"
,"value","buttongroup"
,"valign","center"
,"pressed-color","#ffffff"
);
UMToggleButtonGroupBinder priorityBtnGroup_binder = new UMToggleButtonGroupBinder((IUMContextAccessor)context);
priorityBtnGroup_binder.setBindInfo(new BindInfo("priority"));
priorityBtnGroup_binder.setControl(priorityBtnGroup);
binderGroup.addBinderToGroup(ID_PRIORITYBTNGROUP, priorityBtnGroup_binder);
priorityBtn = (UMToggleButton)ThirdControl.createControl(new UMToggleButton(context),ID_PRIORITYBTN
,"background-color-off","#ffffff"
,"halign","right"
,"width","fill"
,"type","button"
,"height","28.0"
,"color","#0852a5"
,"layout-type","hbox"
,"font-size","16"
,"value","1"
,"font-family","default"
,"valign","center"
,"background-color-on","#ffffff"
,"disabled","disabled"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,priorityBtn,"textOff","#{res.flow_important}"));
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,priorityBtn,"textOn","#{res.flow_common}"));
priorityBtnGroup.addView(priorityBtn);

return priorityBtnGroup;
}
public View getPriorityPanelView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
priorityPanel = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PRIORITYPANEL
,"padding-right","15"
,"height","44"
,"layout-type","linear"
,"background","#FFFFFF"
,"width","fill"
,"margin-top","1"
,"valign","center"
);
priorityLabel = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_PRIORITYLABEL
,"halign","left"
,"height","fill"
,"color","#000000"
,"layout-type","linear"
,"font-size","16"
,"width","100"
,"font-family","default"
,"valign","center"
,"readonly","true"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,priorityLabel,"content","#{res.flow_priority}"));
priorityPanel.addView(priorityLabel);
prioritySpaceLabel = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_PRIORITYSPACELABEL
,"halign","center"
,"height","fill"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","15"
,"font-family","default"
,"valign","center"
,"readonly","true"
,"disabled","disabled"
);
priorityPanel.addView(prioritySpaceLabel);
View priorityBtnGroup = (View) getPriorityBtnGroupView((UMActivity)context,binderGroup,configure);
priorityPanel.addView(priorityBtnGroup);

return priorityPanel;
}
public View getDataPanelView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
dataPanel = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_DATAPANEL
,"padding-right","15"
,"height","44"
,"layout-type","linear"
,"background","#FFFFFF"
,"width","fill"
,"margin-top","1"
,"valign","center"
);
dataLabel = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_DATALABEL
,"halign","left"
,"height","fill"
,"color","#000000"
,"layout-type","linear"
,"font-size","16"
,"width","100"
,"font-family","default"
,"valign","center"
,"readonly","true"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,dataLabel,"content","#{res.flow_draftdate}"));
dataPanel.addView(dataLabel);
dateSpaceLabel = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_DATESPACELABEL
,"halign","center"
,"height","fill"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","15"
,"font-family","default"
,"valign","center"
,"readonly","true"
,"disabled","disabled"
);
dataPanel.addView(dateSpaceLabel);
dataTxt = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_DATATXT
,"bindfield","date"
,"halign","right"
,"height","fill"
,"weight","1"
,"color","#0852a5"
,"layout-type","linear"
,"font-size","16"
,"width","0"
,"font-family","default"
,"valign","center"
);
UMTextBinder dataTxt_binder = new UMTextBinder((IUMContextAccessor)context);
dataTxt_binder.setBindInfo(new BindInfo("date"));
dataTxt_binder.setControl(dataTxt);
binderGroup.addBinderToGroup(ID_DATATXT, dataTxt_binder);
dataPanel.addView(dataTxt);

return dataPanel;
}
public View getDetailInnerPanelView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
detailInnerPanel = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_DETAILINNERPANEL
,"halign","center"
,"height","fill"
,"layout-type","linear"
,"background","#c8c7cc"
,"width","fill"
);
View titlePanel = (View) getTitlePanelView((UMActivity)context,binderGroup,configure);
detailInnerPanel.addView(titlePanel);
View priorityPanel = (View) getPriorityPanelView((UMActivity)context,binderGroup,configure);
detailInnerPanel.addView(priorityPanel);
View dataPanel = (View) getDataPanelView((UMActivity)context,binderGroup,configure);
detailInnerPanel.addView(dataPanel);

return detailInnerPanel;
}
public View getDetailPanelView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
detailPanel = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_DETAILPANEL
,"padding-left","15"
,"halign","center"
,"height","134"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
);
View detailInnerPanel = (View) getDetailInnerPanelView((UMActivity)context,binderGroup,configure);
detailPanel.addView(detailInnerPanel);

return detailPanel;
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
public View getContentPanelView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
contentPanel = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_CONTENTPANEL
,"padding-right","15"
,"padding-left","15"
,"height","44"
,"layout-type","linear"
,"background","#FFFFFF"
,"width","fill"
,"onclick","onContentClick"
,"valign","center"
);
contentPanel.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Flow_SentDetailActivity.this);
    actionOnContentClick(contentPanel,args);

}
});
contentLabel = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_CONTENTLABEL
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
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,contentLabel,"content","#{res.flow_bodyview}"));
contentPanel.addView(contentLabel);
contentInfoLabel = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_CONTENTINFOLABEL
,"halign","right"
,"height","fill"
,"color","#8e8e93"
,"layout-type","linear"
,"font-size","16"
,"width","100"
,"font-family","default"
,"valign","center"
,"readonly","true"
);
contentPanel.addView(contentInfoLabel);
contentSpaceLabel = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_CONTENTSPACELABEL
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
contentPanel.addView(contentSpaceLabel);
contentImg = (UMImage)ThirdControl.createControl(new UMImage(context),ID_CONTENTIMG
,"height","13"
,"layout-type","linear"
,"width","8"
,"scaletype","fitcenter"
,"src","ecm_arrow_right.png"
);
contentPanel.addView(contentImg);

return contentPanel;
}
public View getSpaceOutPanel3View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
spaceOutPanel3 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_SPACEOUTPANEL3
,"padding-top","1"
,"halign","center"
,"height","22"
,"layout-type","linear"
,"background","#c8c7cc"
,"width","fill"
,"padding-bottom","1"
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
public View getHistoryPanelView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
historyPanel = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_HISTORYPANEL
,"padding-right","15"
,"padding-left","15"
,"height","44"
,"layout-type","linear"
,"background","#FFFFFF"
,"width","fill"
,"onclick","onHistoryClick"
,"valign","center"
);
historyPanel.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Flow_SentDetailActivity.this);
    actionOnHistoryClick(historyPanel,args);

}
});
historyLabel = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_HISTORYLABEL
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
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,historyLabel,"content","#{res.flow_processhistory}"));
historyPanel.addView(historyLabel);
historyInfoLabel = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_HISTORYINFOLABEL
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
historyPanel.addView(historyInfoLabel);
historySpaceLabel = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_HISTORYSPACELABEL
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
historyPanel.addView(historySpaceLabel);
historyImg = (UMImage)ThirdControl.createControl(new UMImage(context),ID_HISTORYIMG
,"height","13"
,"layout-type","linear"
,"width","8"
,"scaletype","fitcenter"
,"src","ecm_arrow_right.png"
);
historyPanel.addView(historyImg);

return historyPanel;
}
public View getSpaceOutPanel4View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
spaceOutPanel4 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_SPACEOUTPANEL4
,"padding-top","1"
,"halign","center"
,"height","22"
,"layout-type","linear"
,"background","#c8c7cc"
,"width","fill"
,"padding-bottom","1"
);
spaceInnerPanel4 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_SPACEINNERPANEL4
,"halign","center"
,"height","0"
,"weight","1"
,"layout-type","linear"
,"background","#efeff4"
,"width","fill"
);
spaceOutPanel4.addView(spaceInnerPanel4);

return spaceOutPanel4;
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
    UMEventArgs args = new UMEventArgs(Flow_SentDetailActivity.this);
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
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,attachmentLabel,"content","#{res.flow_attachmentlist}"));
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
public View getSpaceOutPanel5View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
spaceOutPanel5 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_SPACEOUTPANEL5
,"padding-top","1"
,"halign","center"
,"height","21"
,"layout-type","linear"
,"background","#c8c7cc"
,"width","fill"
);
spaceInnerPanel5 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_SPACEINNERPANEL5
,"halign","center"
,"height","0"
,"weight","1"
,"layout-type","linear"
,"background","#efeff4"
,"width","fill"
);
spaceOutPanel5.addView(spaceInnerPanel5);

return spaceOutPanel5;
}
public View getMainPanelView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
mainPanel = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_MAINPANEL
,"halign","center"
,"height","wrap"
,"layout-type","linear"
,"width","fill"
);
View spaceOutPanel1 = (View) getSpaceOutPanel1View((UMActivity)context,binderGroup,configure);
mainPanel.addView(spaceOutPanel1);
View detailPanel = (View) getDetailPanelView((UMActivity)context,binderGroup,configure);
mainPanel.addView(detailPanel);
View spaceOutPanel2 = (View) getSpaceOutPanel2View((UMActivity)context,binderGroup,configure);
mainPanel.addView(spaceOutPanel2);
View contentPanel = (View) getContentPanelView((UMActivity)context,binderGroup,configure);
mainPanel.addView(contentPanel);
View spaceOutPanel3 = (View) getSpaceOutPanel3View((UMActivity)context,binderGroup,configure);
mainPanel.addView(spaceOutPanel3);
View historyPanel = (View) getHistoryPanelView((UMActivity)context,binderGroup,configure);
mainPanel.addView(historyPanel);
View spaceOutPanel4 = (View) getSpaceOutPanel4View((UMActivity)context,binderGroup,configure);
mainPanel.addView(spaceOutPanel4);
View attachmentPanel = (View) getAttachmentPanelView((UMActivity)context,binderGroup,configure);
mainPanel.addView(attachmentPanel);
View spaceOutPanel5 = (View) getSpaceOutPanel5View((UMActivity)context,binderGroup,configure);
mainPanel.addView(spaceOutPanel5);

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
,"width","fill"
,"background","#efeff4"
);
View navPanel = (View) getNavPanelView((UMActivity)context,binderGroup,configure);
basePanel.addView(navPanel);
View scrollPanel = (View) getScrollPanelView((UMActivity)context,binderGroup,configure);
basePanel.addView(scrollPanel);

return basePanel;
}
public UMWindow getCurrentWindow(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
SentDetail = (UMWindow)ThirdControl.createControl(new UMWindow(context),ID_SENTDETAIL
,"halign","center"
,"height","fill"
,"layout","vbox"
,"width","fill"
,"context","WorkDetail"
,"controller","SentDetailController"
,"namespace","nc.bs.oa.oama.ecm"
);
View basePanel = (View) getBasePanelView((UMActivity)context,binderGroup,configure);
SentDetail.addView(basePanel);

return (UMWindow)SentDetail;
}

	
	public void actionOnForwardBtnClick(View control, UMEventArgs args) {
    String actionid = "onForwardBtnClick";
    args.put("viewid","nc.bs.oa.oama.ecm.Flow_Forward");
    args.put("sourceid","#{id}");
    args.put("iskeep","false");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.open(args);
}
public void actionDownloadContent(View control, UMEventArgs args) {
    String actionid = "downloadContent";
    args.put("modulename","oapp");
    args.put("filesize","#{ContentDetail.size}");
    args.put("downloadpath","#{ContentDetail.id}");
    args.put("filename","#{ContentDetail.name}");
    args.put("startposition","0");
    args.put("filetype","#{ContentDetail.type}");
    args.put("endposition","0");
    args.put("fileid","#{ContentDetail.id}");
    args.put("downflag","1");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMService.downloadFile(args);
}
public void actionOpenUnknownContent(View control, UMEventArgs args) {
    String actionid = "openUnknownContent";
    args.put("message","#{res.flow_origindownloadtip}");
    args.put("title","#{res.flow_notice}");
    args.put("okaction","downloadContent");
    args.put("okbuttontitle","#{res.flow_origindownload}");
    args.put("style","ok-cancel");
    args.put("containerName","");
    args.put("cancelbuttontitle","#{res.flow_cancel}");
  ActionProcessor.exec(this, actionid, args);
UMView.openDialog(args);
}
public void actionOnDataLoad(View control, UMEventArgs args) {
    String actionid = "onDataLoad";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "onDataLoad",UMActivity.getViewId(control),args);
}
public void actionOnHistoryClick(View control, UMEventArgs args) {
    String actionid = "onHistoryClick";
    args.put("flowhistory","#{flowhistory}");
    args.put("title","#{title}");
    args.put("viewid","nc.bs.oa.oama.ecm.Flow_FlowHistory");
    args.put("iskeep","true");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.open(args);
}
public void actionOnContentClick(View control, UMEventArgs args) {
    String actionid = "onContentClick";
    args.put("workid","#{id}");
    args.put("viewid","nc.bs.oa.oama.freeflow.ContentController");
  this.dataCollect();
    args.put("action","content");
    args.put("callback","contentCallback");
    args.put("autodatabinding","false");
    args.put("contenttype","#{contenttype}");
    args.put("contextmapping","ContentDetail");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMService.callAction(args);
}
public void actionOnReturnBtnClick(View control, UMEventArgs args) {
    String actionid = "onReturnBtnClick";
    args.put("resultcode","0");
    args.put("iskeep","false");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.close(args);
}
public void actionOnArchiveClick(View control, UMEventArgs args) {
    String actionid = "onArchiveClick";
    args.put("viewid","nc.bs.oa.oama.ecm.Flow_ArchiveScan");
    args.put("archiveset","#{archiveset}");
    args.put("iskeep","true");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.open(args);
}
public void actionOpenWordContent(View control, UMEventArgs args) {
    String actionid = "openWordContent";
    args.put("viewid","nc.bs.oa.oama.ecm.Flow_WordContent");
    args.put("iskeep","true");
    args.put("containerName","");
    args.put("wordcontent","#{ContentDetail}");
  ActionProcessor.exec(this, actionid, args);
UMView.open(args);
}
public void actionOpenDefaultContent(View control, UMEventArgs args) {
    String actionid = "openDefaultContent";
    args.put("viewid","nc.bs.oa.oama.ecm.Flow_DefaultContent");
    args.put("defaultcontent","#{ContentDetail}");
    args.put("iskeep","true");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.open(args);
}
public void actionContentCallback(View control, UMEventArgs args) {
    String actionid = "contentCallback";
    args.put("contenttype","#{contenttype}");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "contentCallback",UMActivity.getViewId(control),args);
}
public void actionOnAttachmentClick(View control, UMEventArgs args) {
    String actionid = "onAttachmentClick";
    args.put("viewid","nc.bs.oa.oama.ecm.Flow_AttachmentList");
    args.put("attachment","#{attachment}");
    args.put("iskeep","true");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.open(args);
}


}
