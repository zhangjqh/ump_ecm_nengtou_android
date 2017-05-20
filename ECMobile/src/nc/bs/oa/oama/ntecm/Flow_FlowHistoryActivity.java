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

public abstract class Flow_FlowHistoryActivity extends UMWindowActivity {

	protected UMWindow FlowHistory = null;
protected XVerticalLayout basePanel = null;
protected XHorizontalLayout navPanel = null;
protected XHorizontalLayout navigatorbar = null;
protected XHorizontalLayout leftPanel = null;
protected UMButton returnBtn = null;
protected XHorizontalLayout centerPanel = null;
protected UMLabel navLabel = null;
protected XHorizontalLayout rightPanel = null;
protected UMScrollView Scrollview_mainPanel = null;
protected XVerticalLayout mainPanel = null;
protected XVerticalLayout spaceOutPanel = null;
protected XHorizontalLayout spaceInnerPanel = null;
protected UMLabel initactorLabel = null;
protected XHorizontalLayout initactorPanel = null;
protected XVerticalLayout initactorLeftPanel = null;
protected XHorizontalLayout initactorUpPanel = null;
protected UMLabel initactorName = null;
protected UMLabel initactorAction = null;
protected XHorizontalLayout initactorDownPanel = null;
protected UMLabel initactorCommit = null;
protected UMLabel initactorDate = null;
protected UMLabel initactorSpaceLabel = null;
protected UMImage initactorImg = null;
protected XVerticalLayout spaceOutPanel1 = null;
protected XHorizontalLayout spaceInnerPanel1 = null;
protected UMLabel transactorLabel = null;
protected XHorizontalLayout nullPanel = null;
protected UMLabel nullLabel = null;
protected UMListViewBase listView = null;
protected XHorizontalLayout listView_childWgt0 = null;
protected XVerticalLayout listView_childWgt0_nrowLeftPanel = null;
protected XHorizontalLayout listView_childWgt0_nrowUpPanel = null;
protected UMLabel listView_childWgt0_nrowName = null;
protected UMLabel listView_childWgt0_nrowAction = null;
protected XHorizontalLayout listView_childWgt0_nrowDownPanel = null;
protected UMLabel listView_childWgt0_nrowCommit = null;
protected UMLabel listView_childWgt0_nrowDate = null;
protected UMLabel listView_childWgt0_nrowSpaceLabel = null;
protected UMImage listView_childWgt0_nrightImg = null;
protected XHorizontalLayout listView_childWgt1 = null;
protected XVerticalLayout listView_childWgt1_hrowLeftPanel = null;
protected XHorizontalLayout listView_childWgt1_hrowUpPanel = null;
protected UMLabel listView_childWgt1_hrowName = null;
protected UMLabel listView_childWgt1_hrowAction = null;
protected XHorizontalLayout listView_childWgt1_hrowDownPanel = null;
protected UMImage listView_childWgt1_commitImg = null;
protected UMLabel listView_childWgt1_itemSpaceLabel = null;
protected UMLabel listView_childWgt1_hrowCommit = null;
protected UMLabel listView_childWgt1_hrowDate = null;
protected UMLabel listView_childWgt1_hrowSpaceLabel = null;
protected UMImage listView_childWgt1_hrightImg = null;
protected XVerticalLayout spaceOutPanel2 = null;
protected XVerticalLayout spaceInnerPanel2 = null;

	
	protected final static int ID_FLOWHISTORY = 1365854955;
protected final static int ID_BASEPANEL = 1197841455;
protected final static int ID_NAVPANEL = 1949675209;
protected final static int ID_NAVIGATORBAR = 1147973290;
protected final static int ID_LEFTPANEL = 589999900;
protected final static int ID_RETURNBTN = 889785216;
protected final static int ID_CENTERPANEL = 596033686;
protected final static int ID_NAVLABEL = 1881484714;
protected final static int ID_RIGHTPANEL = 1926988225;
protected final static int ID_SCROLLVIEW_MAINPANEL = 1502783141;
protected final static int ID_MAINPANEL = 2118567402;
protected final static int ID_SPACEOUTPANEL = 527421338;
protected final static int ID_SPACEINNERPANEL = 395840269;
protected final static int ID_INITACTORLABEL = 1273873603;
protected final static int ID_INITACTORPANEL = 605598763;
protected final static int ID_INITACTORLEFTPANEL = 1116019191;
protected final static int ID_INITACTORUPPANEL = 1385494612;
protected final static int ID_INITACTORNAME = 415585310;
protected final static int ID_INITACTORACTION = 671794657;
protected final static int ID_INITACTORDOWNPANEL = 892266844;
protected final static int ID_INITACTORCOMMIT = 71207365;
protected final static int ID_INITACTORDATE = 1508683444;
protected final static int ID_INITACTORSPACELABEL = 554583927;
protected final static int ID_INITACTORIMG = 171083278;
protected final static int ID_SPACEOUTPANEL1 = 853733312;
protected final static int ID_SPACEINNERPANEL1 = 1058919347;
protected final static int ID_TRANSACTORLABEL = 1631632316;
protected final static int ID_NULLPANEL = 162639118;
protected final static int ID_NULLLABEL = 1510901701;
protected final static int ID_LISTVIEW = 1188562683;
protected final static int ID_LISTVIEW_CHILDWGT0 = 626780985;
protected final static int ID_LISTVIEW_CHILDWGT0_NROWLEFTPANEL = 247915340;
protected final static int ID_LISTVIEW_CHILDWGT0_NROWUPPANEL = 79670572;
protected final static int ID_LISTVIEW_CHILDWGT0_NROWNAME = 1839299261;
protected final static int ID_LISTVIEW_CHILDWGT0_NROWACTION = 1439057743;
protected final static int ID_LISTVIEW_CHILDWGT0_NROWDOWNPANEL = 560436207;
protected final static int ID_LISTVIEW_CHILDWGT0_NROWCOMMIT = 1188349256;
protected final static int ID_LISTVIEW_CHILDWGT0_NROWDATE = 1401380313;
protected final static int ID_LISTVIEW_CHILDWGT0_NROWSPACELABEL = 1130561946;
protected final static int ID_LISTVIEW_CHILDWGT0_NRIGHTIMG = 1894780759;
protected final static int ID_LISTVIEW_CHILDWGT1 = 1129176786;
protected final static int ID_LISTVIEW_CHILDWGT1_HROWLEFTPANEL = 939587719;
protected final static int ID_LISTVIEW_CHILDWGT1_HROWUPPANEL = 332032472;
protected final static int ID_LISTVIEW_CHILDWGT1_HROWNAME = 858605002;
protected final static int ID_LISTVIEW_CHILDWGT1_HROWACTION = 1809928812;
protected final static int ID_LISTVIEW_CHILDWGT1_HROWDOWNPANEL = 240811200;
protected final static int ID_LISTVIEW_CHILDWGT1_COMMITIMG = 895959774;
protected final static int ID_LISTVIEW_CHILDWGT1_ITEMSPACELABEL = 1278052830;
protected final static int ID_LISTVIEW_CHILDWGT1_HROWCOMMIT = 1487442910;
protected final static int ID_LISTVIEW_CHILDWGT1_HROWDATE = 1911776693;
protected final static int ID_LISTVIEW_CHILDWGT1_HROWSPACELABEL = 1205370849;
protected final static int ID_LISTVIEW_CHILDWGT1_HRIGHTIMG = 1139251210;
protected final static int ID_SPACEOUTPANEL2 = 1293821492;
protected final static int ID_SPACEINNERPANEL2 = 1865133010;

	
	
	@Override
	public String getControllerName() {
		return "FlowHistoryController";
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
		  idmap.put("FlowHistory",ID_FLOWHISTORY);
  idmap.put("basePanel",ID_BASEPANEL);
  idmap.put("navPanel",ID_NAVPANEL);
  idmap.put("navigatorbar",ID_NAVIGATORBAR);
  idmap.put("leftPanel",ID_LEFTPANEL);
  idmap.put("returnBtn",ID_RETURNBTN);
  idmap.put("centerPanel",ID_CENTERPANEL);
  idmap.put("navLabel",ID_NAVLABEL);
  idmap.put("rightPanel",ID_RIGHTPANEL);
  idmap.put("Scrollview_mainPanel",ID_SCROLLVIEW_MAINPANEL);
  idmap.put("mainPanel",ID_MAINPANEL);
  idmap.put("spaceOutPanel",ID_SPACEOUTPANEL);
  idmap.put("spaceInnerPanel",ID_SPACEINNERPANEL);
  idmap.put("initactorLabel",ID_INITACTORLABEL);
  idmap.put("initactorPanel",ID_INITACTORPANEL);
  idmap.put("initactorLeftPanel",ID_INITACTORLEFTPANEL);
  idmap.put("initactorUpPanel",ID_INITACTORUPPANEL);
  idmap.put("initactorName",ID_INITACTORNAME);
  idmap.put("initactorAction",ID_INITACTORACTION);
  idmap.put("initactorDownPanel",ID_INITACTORDOWNPANEL);
  idmap.put("initactorCommit",ID_INITACTORCOMMIT);
  idmap.put("initactorDate",ID_INITACTORDATE);
  idmap.put("initactorSpaceLabel",ID_INITACTORSPACELABEL);
  idmap.put("initactorImg",ID_INITACTORIMG);
  idmap.put("spaceOutPanel1",ID_SPACEOUTPANEL1);
  idmap.put("spaceInnerPanel1",ID_SPACEINNERPANEL1);
  idmap.put("transactorLabel",ID_TRANSACTORLABEL);
  idmap.put("nullPanel",ID_NULLPANEL);
  idmap.put("nullLabel",ID_NULLLABEL);
  idmap.put("listView",ID_LISTVIEW);
  idmap.put("listView_childWgt0",ID_LISTVIEW_CHILDWGT0);
  idmap.put("listView_childWgt0_nrowLeftPanel",ID_LISTVIEW_CHILDWGT0_NROWLEFTPANEL);
  idmap.put("listView_childWgt0_nrowUpPanel",ID_LISTVIEW_CHILDWGT0_NROWUPPANEL);
  idmap.put("listView_childWgt0_nrowName",ID_LISTVIEW_CHILDWGT0_NROWNAME);
  idmap.put("listView_childWgt0_nrowAction",ID_LISTVIEW_CHILDWGT0_NROWACTION);
  idmap.put("listView_childWgt0_nrowDownPanel",ID_LISTVIEW_CHILDWGT0_NROWDOWNPANEL);
  idmap.put("listView_childWgt0_nrowCommit",ID_LISTVIEW_CHILDWGT0_NROWCOMMIT);
  idmap.put("listView_childWgt0_nrowDate",ID_LISTVIEW_CHILDWGT0_NROWDATE);
  idmap.put("listView_childWgt0_nrowSpaceLabel",ID_LISTVIEW_CHILDWGT0_NROWSPACELABEL);
  idmap.put("listView_childWgt0_nrightImg",ID_LISTVIEW_CHILDWGT0_NRIGHTIMG);
  idmap.put("listView_childWgt1",ID_LISTVIEW_CHILDWGT1);
  idmap.put("listView_childWgt1_hrowLeftPanel",ID_LISTVIEW_CHILDWGT1_HROWLEFTPANEL);
  idmap.put("listView_childWgt1_hrowUpPanel",ID_LISTVIEW_CHILDWGT1_HROWUPPANEL);
  idmap.put("listView_childWgt1_hrowName",ID_LISTVIEW_CHILDWGT1_HROWNAME);
  idmap.put("listView_childWgt1_hrowAction",ID_LISTVIEW_CHILDWGT1_HROWACTION);
  idmap.put("listView_childWgt1_hrowDownPanel",ID_LISTVIEW_CHILDWGT1_HROWDOWNPANEL);
  idmap.put("listView_childWgt1_commitImg",ID_LISTVIEW_CHILDWGT1_COMMITIMG);
  idmap.put("listView_childWgt1_itemSpaceLabel",ID_LISTVIEW_CHILDWGT1_ITEMSPACELABEL);
  idmap.put("listView_childWgt1_hrowCommit",ID_LISTVIEW_CHILDWGT1_HROWCOMMIT);
  idmap.put("listView_childWgt1_hrowDate",ID_LISTVIEW_CHILDWGT1_HROWDATE);
  idmap.put("listView_childWgt1_hrowSpaceLabel",ID_LISTVIEW_CHILDWGT1_HROWSPACELABEL);
  idmap.put("listView_childWgt1_hrightImg",ID_LISTVIEW_CHILDWGT1_HRIGHTIMG);
  idmap.put("spaceOutPanel2",ID_SPACEOUTPANEL2);
  idmap.put("spaceInnerPanel2",ID_SPACEINNERPANEL2);

	}
	
	public void onLoad() {
		ULog.logLC("onLoad", this);
		if(currentPage!=null) {
			currentPage.onLoad();
		}
	
		{ //basePanel - onDataLoad
    UMEventArgs args = new UMEventArgs(Flow_FlowHistoryActivity.this);
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
,"color","#E50011"
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
    UMEventArgs args = new UMEventArgs(Flow_FlowHistoryActivity.this);
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
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,navLabel,"content","#{res.flow_processhistory}"));
centerPanel.addView(navLabel);

return centerPanel;
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
rightPanel = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_RIGHTPANEL
,"height","fill"
,"layout-type","linear"
,"width","88"
,"valign","center"
);
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
public View getSpaceInnerPanelView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
spaceInnerPanel = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_SPACEINNERPANEL
,"padding-left","15"
,"padding-right","15"
,"height","0"
,"weight","1"
,"layout-type","linear"
,"background","#efeff4"
,"width","fill"
,"valign","center"
);
initactorLabel = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_INITACTORLABEL
,"bindfield",""
,"halign","left"
,"height","fill"
,"color","#727272"
,"layout-type","linear"
,"font-size","14"
,"width","fill"
,"font-family","default"
,"valign","center"
,"readonly","true"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,initactorLabel,"content","#{res.flow_initactor}"));
spaceInnerPanel.addView(initactorLabel);

return spaceInnerPanel;
}
public View getSpaceOutPanelView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
spaceOutPanel = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_SPACEOUTPANEL
,"halign","center"
,"height","31"
,"layout-type","linear"
,"background","#c8c7cc"
,"width","fill"
,"padding-bottom","1"
);
View spaceInnerPanel = (View) getSpaceInnerPanelView((UMActivity)context,binderGroup,configure);
spaceOutPanel.addView(spaceInnerPanel);

return spaceOutPanel;
}
public View getInitactorUpPanelView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
initactorUpPanel = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_INITACTORUPPANEL
,"height","0"
,"weight","1"
,"layout-type","linear"
,"width","fill"
,"valign","center"
);
initactorName = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_INITACTORNAME
,"bindfield","flowhistory.initactor.name"
,"halign","left"
,"height","fill"
,"weight","1"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","0"
,"font-family","default"
,"valign","center"
,"readonly","true"
);
UMTextBinder initactorName_binder = new UMTextBinder((IUMContextAccessor)context);
initactorName_binder.setBindInfo(new BindInfo("flowhistory.initactor.name"));
initactorName_binder.setControl(initactorName);
binderGroup.addBinderToGroup(ID_INITACTORNAME, initactorName_binder);
initactorUpPanel.addView(initactorName);
initactorAction = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_INITACTORACTION
,"bindfield","flowhistory.initactor.action"
,"halign","right"
,"height","fill"
,"color","#0852a5"
,"layout-type","linear"
,"font-size","14"
,"width","80"
,"onclick",""
,"font-family","default"
,"valign","center"
,"readonly","true"
);
UMTextBinder initactorAction_binder = new UMTextBinder((IUMContextAccessor)context);
initactorAction_binder.setBindInfo(new BindInfo("flowhistory.initactor.action"));
initactorAction_binder.setControl(initactorAction);
binderGroup.addBinderToGroup(ID_INITACTORACTION, initactorAction_binder);
initactorUpPanel.addView(initactorAction);

return initactorUpPanel;
}
public View getInitactorDownPanelView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
initactorDownPanel = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_INITACTORDOWNPANEL
,"height","0"
,"weight","1"
,"layout-type","linear"
,"width","fill"
,"valign","center"
);
initactorCommit = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_INITACTORCOMMIT
,"bindfield","flowhistory.initactor.commit"
,"halign","left"
,"height","fill"
,"weight","1"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","0"
,"onclick","showInitCommit"
,"font-family","default"
,"valign","center"
);
UMTextBinder initactorCommit_binder = new UMTextBinder((IUMContextAccessor)context);
initactorCommit_binder.setBindInfo(new BindInfo("flowhistory.initactor.commit"));
initactorCommit_binder.setControl(initactorCommit);
binderGroup.addBinderToGroup(ID_INITACTORCOMMIT, initactorCommit_binder);
initactorCommit.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Flow_FlowHistoryActivity.this);
    actionShowInitCommit(initactorCommit,args);

}
});
initactorDownPanel.addView(initactorCommit);
initactorDate = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_INITACTORDATE
,"bindfield","flowhistory.initactor.date"
,"halign","right"
,"height","fill"
,"color","#8e8e93"
,"layout-type","linear"
,"font-size","14"
,"width","80"
,"font-family","default"
,"valign","center"
,"readonly","true"
);
UMTextBinder initactorDate_binder = new UMTextBinder((IUMContextAccessor)context);
initactorDate_binder.setBindInfo(new BindInfo("flowhistory.initactor.date"));
initactorDate_binder.setControl(initactorDate);
binderGroup.addBinderToGroup(ID_INITACTORDATE, initactorDate_binder);
initactorDownPanel.addView(initactorDate);

return initactorDownPanel;
}
public View getInitactorLeftPanelView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
initactorLeftPanel = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_INITACTORLEFTPANEL
,"halign","center"
,"height","fill"
,"weight","1"
,"layout-type","linear"
,"width","0"
);
View initactorUpPanel = (View) getInitactorUpPanelView((UMActivity)context,binderGroup,configure);
initactorLeftPanel.addView(initactorUpPanel);
View initactorDownPanel = (View) getInitactorDownPanelView((UMActivity)context,binderGroup,configure);
initactorLeftPanel.addView(initactorDownPanel);

return initactorLeftPanel;
}
public View getInitactorPanelView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
initactorPanel = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_INITACTORPANEL
,"padding-left","15"
,"padding-right","15"
,"padding-top","5"
,"height","70"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"onclick","onInitactorClick"
,"valign","center"
,"padding-bottom","5"
);
initactorPanel.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Flow_FlowHistoryActivity.this);
    actionOnInitactorClick(initactorPanel,args);

}
});
View initactorLeftPanel = (View) getInitactorLeftPanelView((UMActivity)context,binderGroup,configure);
initactorPanel.addView(initactorLeftPanel);
initactorSpaceLabel = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_INITACTORSPACELABEL
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
initactorPanel.addView(initactorSpaceLabel);
initactorImg = (UMImage)ThirdControl.createControl(new UMImage(context),ID_INITACTORIMG
,"height","13"
,"layout-type","linear"
,"width","8"
,"scaletype","fitcenter"
,"src","ecm_arrow_right.png"
);
initactorPanel.addView(initactorImg);

return initactorPanel;
}
public View getSpaceInnerPanel1View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
spaceInnerPanel1 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_SPACEINNERPANEL1
,"padding-left","15"
,"padding-right","15"
,"height","0"
,"weight","1"
,"layout-type","linear"
,"background","#efeff4"
,"width","fill"
,"valign","center"
);
transactorLabel = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_TRANSACTORLABEL
,"halign","left"
,"height","fill"
,"color","#727272"
,"layout-type","linear"
,"font-size","14"
,"width","fill"
,"font-family","default"
,"valign","center"
,"readonly","true"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,transactorLabel,"content","#{res.flow_transactor}"));
spaceInnerPanel1.addView(transactorLabel);

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
public View getNullPanelView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
nullPanel = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_NULLPANEL
,"height","71"
,"layout-type","linear"
,"background","#c8c7cc"
,"width","fill"
,"display","none"
,"valign","center"
,"padding-bottom","1"
);
nullLabel = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_NULLLABEL
,"halign","center"
,"height","fill"
,"color","#8e8e93"
,"layout-type","linear"
,"font-size","16"
,"background","#ffffff"
,"width","fill"
,"font-family","default"
,"valign","center"
,"readonly","true"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,nullLabel,"content","#{res.flow_nodata}"));
nullPanel.addView(nullLabel);

return nullPanel;
}
public View getListView_childWgt0_nrowUpPanelView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listView_childWgt0_nrowUpPanel = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW_CHILDWGT0_NROWUPPANEL
,"height","0"
,"weight","1"
,"layout-type","linear"
,"width","fill"
,"valign","center"
);
listView_childWgt0_nrowName = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW_CHILDWGT0_NROWNAME
,"bindfield","name"
,"halign","left"
,"weight","1"
,"width","0"
,"content","name"
,"height","fill"
,"color","#000000"
,"font-size","14"
,"layout-type","linear"
,"font-family","default"
,"valign","center"
,"readonly","true"
);
UMTextBinder listView_childWgt0_nrowName_binder = new UMTextBinder((IUMContextAccessor)context);
listView_childWgt0_nrowName_binder.setBindInfo(new BindInfo("name"));
listView_childWgt0_nrowName_binder.setControl(listView_childWgt0_nrowName);
binderGroup.addBinderToGroup(ID_LISTVIEW_CHILDWGT0_NROWNAME, listView_childWgt0_nrowName_binder);
listView_childWgt0_nrowUpPanel.addView(listView_childWgt0_nrowName);
listView_childWgt0_nrowAction = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW_CHILDWGT0_NROWACTION
,"bindfield","action"
,"halign","right"
,"width","80"
,"content","action"
,"height","fill"
,"color","#0852a5"
,"font-size","14"
,"layout-type","linear"
,"onclick",""
,"font-family","default"
,"valign","center"
,"readonly","true"
);
UMTextBinder listView_childWgt0_nrowAction_binder = new UMTextBinder((IUMContextAccessor)context);
listView_childWgt0_nrowAction_binder.setBindInfo(new BindInfo("action"));
listView_childWgt0_nrowAction_binder.setControl(listView_childWgt0_nrowAction);
binderGroup.addBinderToGroup(ID_LISTVIEW_CHILDWGT0_NROWACTION, listView_childWgt0_nrowAction_binder);
listView_childWgt0_nrowUpPanel.addView(listView_childWgt0_nrowAction);

return listView_childWgt0_nrowUpPanel;
}
public View getListView_childWgt0_nrowDownPanelView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listView_childWgt0_nrowDownPanel = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW_CHILDWGT0_NROWDOWNPANEL
,"height","0"
,"weight","1"
,"layout-type","linear"
,"width","fill"
,"valign","center"
);
listView_childWgt0_nrowCommit = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW_CHILDWGT0_NROWCOMMIT
,"bindfield","commit"
,"halign","left"
,"weight","1"
,"width","0"
,"content","commit"
,"height","fill"
,"color","#000000"
,"font-size","14"
,"layout-type","linear"
,"onclick","showTransCommit"
,"font-family","default"
,"valign","center"
);
UMTextBinder listView_childWgt0_nrowCommit_binder = new UMTextBinder((IUMContextAccessor)context);
listView_childWgt0_nrowCommit_binder.setBindInfo(new BindInfo("commit"));
listView_childWgt0_nrowCommit_binder.setControl(listView_childWgt0_nrowCommit);
binderGroup.addBinderToGroup(ID_LISTVIEW_CHILDWGT0_NROWCOMMIT, listView_childWgt0_nrowCommit_binder);
listView_childWgt0_nrowCommit.setOnClickListener(new OnCursorClickListener(configure) {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Flow_FlowHistoryActivity.this);
    int position = this.getPosition(v);
    if(position>=0) {
      context.getCursor("cursorflowhistory_transactoralias").setCurrentIndex(position);
    }
    actionShowTransCommit(listView_childWgt0_nrowCommit,args);

}
});
listView_childWgt0_nrowDownPanel.addView(listView_childWgt0_nrowCommit);
listView_childWgt0_nrowDate = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW_CHILDWGT0_NROWDATE
,"content","date"
,"bindfield","date"
,"halign","right"
,"height","fill"
,"color","#8e8e93"
,"layout-type","linear"
,"font-size","14"
,"width","80"
,"font-family","default"
,"valign","center"
,"readonly","true"
);
UMTextBinder listView_childWgt0_nrowDate_binder = new UMTextBinder((IUMContextAccessor)context);
listView_childWgt0_nrowDate_binder.setBindInfo(new BindInfo("date"));
listView_childWgt0_nrowDate_binder.setControl(listView_childWgt0_nrowDate);
binderGroup.addBinderToGroup(ID_LISTVIEW_CHILDWGT0_NROWDATE, listView_childWgt0_nrowDate_binder);
listView_childWgt0_nrowDownPanel.addView(listView_childWgt0_nrowDate);

return listView_childWgt0_nrowDownPanel;
}
public View getListView_childWgt0_nrowLeftPanelView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listView_childWgt0_nrowLeftPanel = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_LISTVIEW_CHILDWGT0_NROWLEFTPANEL
,"halign","center"
,"height","fill"
,"weight","1"
,"layout-type","linear"
,"width","0"
);
View listView_childWgt0_nrowUpPanel = (View) getListView_childWgt0_nrowUpPanelView((UMActivity)context,binderGroup,configure);
listView_childWgt0_nrowLeftPanel.addView(listView_childWgt0_nrowUpPanel);
View listView_childWgt0_nrowDownPanel = (View) getListView_childWgt0_nrowDownPanelView((UMActivity)context,binderGroup,configure);
listView_childWgt0_nrowLeftPanel.addView(listView_childWgt0_nrowDownPanel);

return listView_childWgt0_nrowLeftPanel;
}
public View getListView_childWgt0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listView_childWgt0 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW_CHILDWGT0
,"padding-left","15"
,"padding-right","15"
,"height","70"
,"layout-type","linear"
,"width","fill"
,"onclick","onTransactorClick"
,"valign","center"
,"background-image","list_split_70.png"
);
listView_childWgt0.setOnClickListener(new OnCursorClickListener(configure) {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Flow_FlowHistoryActivity.this);
    int position = this.getPosition(v);
    if(position>=0) {
      context.getCursor("cursorflowhistory_transactoralias").setCurrentIndex(position);
    }
    actionOnTransactorClick(listView_childWgt0,args);

}
});
View listView_childWgt0_nrowLeftPanel = (View) getListView_childWgt0_nrowLeftPanelView((UMActivity)context,binderGroup,configure);
listView_childWgt0.addView(listView_childWgt0_nrowLeftPanel);
listView_childWgt0_nrowSpaceLabel = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW_CHILDWGT0_NROWSPACELABEL
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
listView_childWgt0.addView(listView_childWgt0_nrowSpaceLabel);
listView_childWgt0_nrightImg = (UMImage)ThirdControl.createControl(new UMImage(context),ID_LISTVIEW_CHILDWGT0_NRIGHTIMG
,"height","13"
,"layout-type","linear"
,"width","8"
,"scaletype","fitcenter"
,"src","ecm_arrow_right.png"
);
listView_childWgt0.addView(listView_childWgt0_nrightImg);

return listView_childWgt0;
}
public View getListView_childWgt1_hrowUpPanelView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listView_childWgt1_hrowUpPanel = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW_CHILDWGT1_HROWUPPANEL
,"height","0"
,"weight","1"
,"layout-type","linear"
,"width","fill"
,"valign","center"
);
listView_childWgt1_hrowName = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW_CHILDWGT1_HROWNAME
,"bindfield","name"
,"halign","left"
,"weight","1"
,"width","0"
,"content","name"
,"height","fill"
,"color","#000000"
,"font-size","14"
,"layout-type","linear"
,"font-family","default"
,"valign","center"
,"readonly","true"
);
UMTextBinder listView_childWgt1_hrowName_binder = new UMTextBinder((IUMContextAccessor)context);
listView_childWgt1_hrowName_binder.setBindInfo(new BindInfo("name"));
listView_childWgt1_hrowName_binder.setControl(listView_childWgt1_hrowName);
binderGroup.addBinderToGroup(ID_LISTVIEW_CHILDWGT1_HROWNAME, listView_childWgt1_hrowName_binder);
listView_childWgt1_hrowUpPanel.addView(listView_childWgt1_hrowName);
listView_childWgt1_hrowAction = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW_CHILDWGT1_HROWACTION
,"bindfield","action"
,"halign","right"
,"width","80"
,"content","action"
,"height","fill"
,"color","#0852a5"
,"font-size","14"
,"layout-type","linear"
,"onclick",""
,"font-family","default"
,"valign","center"
,"readonly","true"
);
UMTextBinder listView_childWgt1_hrowAction_binder = new UMTextBinder((IUMContextAccessor)context);
listView_childWgt1_hrowAction_binder.setBindInfo(new BindInfo("action"));
listView_childWgt1_hrowAction_binder.setControl(listView_childWgt1_hrowAction);
binderGroup.addBinderToGroup(ID_LISTVIEW_CHILDWGT1_HROWACTION, listView_childWgt1_hrowAction_binder);
listView_childWgt1_hrowUpPanel.addView(listView_childWgt1_hrowAction);

return listView_childWgt1_hrowUpPanel;
}
public View getListView_childWgt1_hrowDownPanelView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listView_childWgt1_hrowDownPanel = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW_CHILDWGT1_HROWDOWNPANEL
,"height","0"
,"weight","1"
,"layout-type","linear"
,"width","fill"
,"valign","center"
);
listView_childWgt1_commitImg = (UMImage)ThirdControl.createControl(new UMImage(context),ID_LISTVIEW_CHILDWGT1_COMMITIMG
,"height","20"
,"layout-type","linear"
,"width","20"
,"onclick","showHandWrite"
,"scaletype","fitcenter"
,"src","oa_freeflow_commit.png"
);
listView_childWgt1_commitImg.setOnClickListener(new OnCursorClickListener(configure) {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Flow_FlowHistoryActivity.this);
    int position = this.getPosition(v);
    if(position>=0) {
      context.getCursor("cursorflowhistory_transactoralias").setCurrentIndex(position);
    }
    actionShowHandWrite(listView_childWgt1_commitImg,args);

}
});
listView_childWgt1_hrowDownPanel.addView(listView_childWgt1_commitImg);
listView_childWgt1_itemSpaceLabel = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW_CHILDWGT1_ITEMSPACELABEL
,"halign","center"
,"height","fill"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","5"
,"font-family","default"
,"valign","center"
,"readonly","true"
);
listView_childWgt1_hrowDownPanel.addView(listView_childWgt1_itemSpaceLabel);
listView_childWgt1_hrowCommit = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW_CHILDWGT1_HROWCOMMIT
,"bindfield","commit"
,"halign","left"
,"weight","1"
,"width","0"
,"content","commit"
,"height","fill"
,"color","#000000"
,"font-size","14"
,"layout-type","linear"
,"onclick","showTransCommit"
,"font-family","default"
,"valign","center"
);
UMTextBinder listView_childWgt1_hrowCommit_binder = new UMTextBinder((IUMContextAccessor)context);
listView_childWgt1_hrowCommit_binder.setBindInfo(new BindInfo("commit"));
listView_childWgt1_hrowCommit_binder.setControl(listView_childWgt1_hrowCommit);
binderGroup.addBinderToGroup(ID_LISTVIEW_CHILDWGT1_HROWCOMMIT, listView_childWgt1_hrowCommit_binder);
listView_childWgt1_hrowCommit.setOnClickListener(new OnCursorClickListener(configure) {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Flow_FlowHistoryActivity.this);
    int position = this.getPosition(v);
    if(position>=0) {
      context.getCursor("cursorflowhistory_transactoralias").setCurrentIndex(position);
    }
    actionShowTransCommit(listView_childWgt1_hrowCommit,args);

}
});
listView_childWgt1_hrowDownPanel.addView(listView_childWgt1_hrowCommit);
listView_childWgt1_hrowDate = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW_CHILDWGT1_HROWDATE
,"content","date"
,"bindfield","date"
,"halign","right"
,"height","fill"
,"color","#8e8e93"
,"layout-type","linear"
,"font-size","14"
,"width","80"
,"font-family","default"
,"valign","center"
,"readonly","true"
);
UMTextBinder listView_childWgt1_hrowDate_binder = new UMTextBinder((IUMContextAccessor)context);
listView_childWgt1_hrowDate_binder.setBindInfo(new BindInfo("date"));
listView_childWgt1_hrowDate_binder.setControl(listView_childWgt1_hrowDate);
binderGroup.addBinderToGroup(ID_LISTVIEW_CHILDWGT1_HROWDATE, listView_childWgt1_hrowDate_binder);
listView_childWgt1_hrowDownPanel.addView(listView_childWgt1_hrowDate);

return listView_childWgt1_hrowDownPanel;
}
public View getListView_childWgt1_hrowLeftPanelView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listView_childWgt1_hrowLeftPanel = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_LISTVIEW_CHILDWGT1_HROWLEFTPANEL
,"halign","center"
,"height","fill"
,"weight","1"
,"layout-type","linear"
,"width","0"
);
View listView_childWgt1_hrowUpPanel = (View) getListView_childWgt1_hrowUpPanelView((UMActivity)context,binderGroup,configure);
listView_childWgt1_hrowLeftPanel.addView(listView_childWgt1_hrowUpPanel);
View listView_childWgt1_hrowDownPanel = (View) getListView_childWgt1_hrowDownPanelView((UMActivity)context,binderGroup,configure);
listView_childWgt1_hrowLeftPanel.addView(listView_childWgt1_hrowDownPanel);

return listView_childWgt1_hrowLeftPanel;
}
public View getListView_childWgt1View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listView_childWgt1 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW_CHILDWGT1
,"padding-left","15"
,"padding-right","15"
,"height","70"
,"layout-type","linear"
,"width","fill"
,"onclick","onTransactorClick"
,"valign","center"
,"background-image","list_split_70.png"
);
listView_childWgt1.setOnClickListener(new OnCursorClickListener(configure) {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Flow_FlowHistoryActivity.this);
    int position = this.getPosition(v);
    if(position>=0) {
      context.getCursor("cursorflowhistory_transactoralias").setCurrentIndex(position);
    }
    actionOnTransactorClick(listView_childWgt1,args);

}
});
View listView_childWgt1_hrowLeftPanel = (View) getListView_childWgt1_hrowLeftPanelView((UMActivity)context,binderGroup,configure);
listView_childWgt1.addView(listView_childWgt1_hrowLeftPanel);
listView_childWgt1_hrowSpaceLabel = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW_CHILDWGT1_HROWSPACELABEL
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
listView_childWgt1.addView(listView_childWgt1_hrowSpaceLabel);
listView_childWgt1_hrightImg = (UMImage)ThirdControl.createControl(new UMImage(context),ID_LISTVIEW_CHILDWGT1_HRIGHTIMG
,"height","13"
,"layout-type","linear"
,"width","8"
,"scaletype","fitcenter"
,"src","ecm_arrow_right.png"
);
listView_childWgt1.addView(listView_childWgt1_hrightImg);

return listView_childWgt1;
}
public View getListViewView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listView = (UMListViewBase)ThirdControl.createControl(new UMListViewBase(context),ID_LISTVIEW
,"bindfield","flowhistory.transactor"
,"height","70"
,"childindicator","wgt_nocommit"
,"cursoraction","cursorflowhistory_transactoralias"
,"layout-type","linear"
,"background","#efeff4"
,"width","fill"
,"synccontext","flowhistory.transactor"
,"adapteraddition","false"
,"adaptiveheight","true"
);
context.createCursor("cursorflowhistory_transactoralias", "flowhistory.transactor");
UMListBinder listView_binder = new UMListBinder((IUMContextAccessor)context);
listView_binder.setBindInfo(new BindInfo("flowhistory.transactor"));
listView_binder.setControl(listView);
binderGroup.addBinderToGroup(ID_LISTVIEW, listView_binder);
listView.addListItemView(new UMListViewBase.ListItemView() {
	public View getItemView(Context context, View parent, IBinderGroup binderGroup,int position) {
  UMDslConfigure configure = new UMDslConfigure();
  configure.put("position",position);
View listView_childWgt0 = (View) getListView_childWgt0View((UMActivity)context,binderGroup,configure);
return listView_childWgt0;
}});
listView.addListItemView(new UMListViewBase.ListItemView() {
	public View getItemView(Context context, View parent, IBinderGroup binderGroup,int position) {
  UMDslConfigure configure = new UMDslConfigure();
  configure.put("position",position);
View listView_childWgt1 = (View) getListView_childWgt1View((UMActivity)context,binderGroup,configure);
return listView_childWgt1;
}});

return listView;
}
public View getSpaceOutPanel2View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
spaceOutPanel2 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_SPACEOUTPANEL2
,"halign","center"
,"height","20"
,"layout-type","linear"
,"background","#c8c7cc"
,"width","fill"
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
public View getMainPanelView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
mainPanel = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_MAINPANEL
,"halign","center"
,"height","wrap"
,"layout-type","linear"
,"width","fill"
);
View spaceOutPanel = (View) getSpaceOutPanelView((UMActivity)context,binderGroup,configure);
mainPanel.addView(spaceOutPanel);
View initactorPanel = (View) getInitactorPanelView((UMActivity)context,binderGroup,configure);
mainPanel.addView(initactorPanel);
View spaceOutPanel1 = (View) getSpaceOutPanel1View((UMActivity)context,binderGroup,configure);
mainPanel.addView(spaceOutPanel1);
View nullPanel = (View) getNullPanelView((UMActivity)context,binderGroup,configure);
mainPanel.addView(nullPanel);
View listView = (View) getListViewView((UMActivity)context,binderGroup,configure);
mainPanel.addView(listView);
View spaceOutPanel2 = (View) getSpaceOutPanel2View((UMActivity)context,binderGroup,configure);
mainPanel.addView(spaceOutPanel2);

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
public View getBasePanelView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
basePanel = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_BASEPANEL
,"halign","center"
,"height","fill"
,"onload","onDataLoad"
,"layout-type","vbox"
,"background","#efeff4"
,"width","fill"
);
View navPanel = (View) getNavPanelView((UMActivity)context,binderGroup,configure);
basePanel.addView(navPanel);
View Scrollview_mainPanel = (View) getScrollview_mainPanelView((UMActivity)context,binderGroup,configure);
basePanel.addView(Scrollview_mainPanel);

return basePanel;
}
public UMWindow getCurrentWindow(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
FlowHistory = (UMWindow)ThirdControl.createControl(new UMWindow(context),ID_FLOWHISTORY
,"halign","center"
,"height","fill"
,"layout","vbox"
,"width","fill"
,"context","WorkDetail"
,"controller","FlowHistoryController"
,"namespace","nc.bs.oa.oama.ecm"
);
View basePanel = (View) getBasePanelView((UMActivity)context,binderGroup,configure);
FlowHistory.addView(basePanel);

return (UMWindow)FlowHistory;
}

	
	public void actionGotoPerson(View control, UMEventArgs args) {
    String actionid = "gotoPerson";
    args.put("title","#{title}");
    args.put("currentperson","#{CurrentPerson}");
    args.put("viewid","nc.bs.oa.oama.ecm.Ecm_PersonInfo");
    args.put("iskeep","true");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.open(args);
}
public void actionOnInitactorClick(View control, UMEventArgs args) {
    String actionid = "onInitactorClick";
    args.put("viewid","nc.bs.oa.oama.freeflow.PersonController");
    args.put("personid","#{flowhistory.initactor.id}");
    args.put("action","info");
    args.put("callback","gotoPerson");
    args.put("autodatabinding","false");
    args.put("type","initactor");
    args.put("contextmapping","CurrentPerson");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMService.callAction(args);
}
public void actionOnDataLoad(View control, UMEventArgs args) {
    String actionid = "onDataLoad";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "onDataLoad",UMActivity.getViewId(control),args);
}
public void actionShowTransCommit(View control, UMEventArgs args) {
    String actionid = "showTransCommit";
    args.put("viewid","nc.bs.oa.oama.ecm.Flow_CommitDetail");
    args.put("commit","#{#{cursor.cursorflowhistory_transactoralias}.commit}");
    args.put("actor","#{#{cursor.cursorflowhistory_transactoralias}.name}");
    args.put("iskeep","true");
    args.put("commit_arrayPath","flowhistory.transactor");
    args.put("containerName","");
    args.put("actor_arrayPath","flowhistory.transactor");
  ActionProcessor.exec(this, actionid, args);
UMView.open(args);
}
public void actionShowHandWrite(View control, UMEventArgs args) {
    String actionid = "showHandWrite";
    args.put("handwrite","#{#{cursor.cursorflowhistory_transactoralias}.handwrite}");
    args.put("viewid","nc.bs.oa.oama.ecm.Flow_HandWrite");
    args.put("iskeep","true");
    args.put("handwrite_arrayPath","flowhistory.transactor");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.open(args);
}
public void actionOnTransactorClick(View control, UMEventArgs args) {
    String actionid = "onTransactorClick";
    args.put("viewid","nc.bs.oa.oama.freeflow.PersonController");
    args.put("personid","#{#{cursor.cursorflowhistory_transactoralias}.id}");
    args.put("action","info");
    args.put("callback","gotoPerson");
    args.put("autodatabinding","false");
    args.put("type","transactor");
    args.put("contextmapping","CurrentPerson");
    args.put("containerName","");
    args.put("personid_arrayPath","flowhistory.transactor");
  ActionProcessor.exec(this, actionid, args);
UMService.callAction(args);
}
public void actionOnReturnBtnClick(View control, UMEventArgs args) {
    String actionid = "onReturnBtnClick";
    args.put("resultcode","15");
    args.put("iskeep","false");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.close(args);
}
public void actionShowInitCommit(View control, UMEventArgs args) {
    String actionid = "showInitCommit";
    args.put("viewid","nc.bs.oa.oama.ecm.Flow_CommitDetail");
    args.put("commit","#{flowhistory.initactor.commit}");
    args.put("iskeep","true");
    args.put("actor","#{flowhistory.initactor.name}");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.open(args);
}


}
