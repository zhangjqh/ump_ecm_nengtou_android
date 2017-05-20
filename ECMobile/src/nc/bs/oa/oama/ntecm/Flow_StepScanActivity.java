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

public abstract class Flow_StepScanActivity extends UMWindowActivity {

	protected UMWindow StepScan = null;
protected XVerticalLayout basePanel = null;
protected XVerticalLayout navPanel = null;
protected XHorizontalLayout navigatorbar = null;
protected XHorizontalLayout leftPanel = null;
protected UMButton returnBtn = null;
protected XHorizontalLayout centerPanel = null;
protected UMLabel navLabel = null;
protected XVerticalLayout rightPanel = null;
protected UMScrollView Scrollview_mainPanel = null;
protected XVerticalLayout mainPanel = null;
protected XVerticalLayout spaceOutPanel = null;
protected XVerticalLayout spaceInnerPanel = null;
protected UMListViewBase listView = null;
protected XHorizontalLayout itemPanel = null;
protected UMLabel indexLabel = null;
protected UMLabel nameLabel = null;
protected UMLabel spaceLabel = null;
protected UMImage itemImg = null;
protected XVerticalLayout spaceOutPanel1 = null;
protected XVerticalLayout spaceInnerPanel1 = null;
protected XHorizontalLayout rulePanel = null;
protected UMLabel ruleLabel = null;
protected UMToggleButtonGroup ruleToggle = null;
protected UMToggleButton seizeBtn = null;
protected UMToggleButton countersignBtn = null;
protected XVerticalLayout spaceOutPanel2 = null;
protected XVerticalLayout spaceInnerPanel2 = null;

	
	protected final static int ID_STEPSCAN = 1977498764;
protected final static int ID_BASEPANEL = 806944970;
protected final static int ID_NAVPANEL = 1289526379;
protected final static int ID_NAVIGATORBAR = 4304059;
protected final static int ID_LEFTPANEL = 621002056;
protected final static int ID_RETURNBTN = 1031085910;
protected final static int ID_CENTERPANEL = 1874775476;
protected final static int ID_NAVLABEL = 1149253229;
protected final static int ID_RIGHTPANEL = 1493446218;
protected final static int ID_SCROLLVIEW_MAINPANEL = 1867093960;
protected final static int ID_MAINPANEL = 879139327;
protected final static int ID_SPACEOUTPANEL = 422496463;
protected final static int ID_SPACEINNERPANEL = 1472743776;
protected final static int ID_LISTVIEW = 2035855299;
protected final static int ID_ITEMPANEL = 1344241134;
protected final static int ID_INDEXLABEL = 405151030;
protected final static int ID_NAMELABEL = 1068408365;
protected final static int ID_SPACELABEL = 881850559;
protected final static int ID_ITEMIMG = 794874845;
protected final static int ID_SPACEOUTPANEL1 = 749100384;
protected final static int ID_SPACEINNERPANEL1 = 1627608905;
protected final static int ID_RULEPANEL = 1113702210;
protected final static int ID_RULELABEL = 1333174624;
protected final static int ID_RULETOGGLE = 1475795148;
protected final static int ID_SEIZEBTN = 674453149;
protected final static int ID_COUNTERSIGNBTN = 1252300232;
protected final static int ID_SPACEOUTPANEL2 = 1167744354;
protected final static int ID_SPACEINNERPANEL2 = 1375142573;

	
	
	@Override
	public String getControllerName() {
		return "StepScanController";
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
		  idmap.put("StepScan",ID_STEPSCAN);
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
  idmap.put("listView",ID_LISTVIEW);
  idmap.put("itemPanel",ID_ITEMPANEL);
  idmap.put("indexLabel",ID_INDEXLABEL);
  idmap.put("nameLabel",ID_NAMELABEL);
  idmap.put("spaceLabel",ID_SPACELABEL);
  idmap.put("itemImg",ID_ITEMIMG);
  idmap.put("spaceOutPanel1",ID_SPACEOUTPANEL1);
  idmap.put("spaceInnerPanel1",ID_SPACEINNERPANEL1);
  idmap.put("rulePanel",ID_RULEPANEL);
  idmap.put("ruleLabel",ID_RULELABEL);
  idmap.put("ruleToggle",ID_RULETOGGLE);
  idmap.put("seizeBtn",ID_SEIZEBTN);
  idmap.put("countersignBtn",ID_COUNTERSIGNBTN);
  idmap.put("spaceOutPanel2",ID_SPACEOUTPANEL2);
  idmap.put("spaceInnerPanel2",ID_SPACEINNERPANEL2);

	}
	
	public void onLoad() {
		ULog.logLC("onLoad", this);
		if(currentPage!=null) {
			currentPage.onLoad();
		}
	
		{ //basePanel - onDataLoad
    UMEventArgs args = new UMEventArgs(Flow_StepScanActivity.this);
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
    UMEventArgs args = new UMEventArgs(Flow_StepScanActivity.this);
    actionOnReturnBtnClick(returnBtn,args);

}
});
leftPanel.addView(returnBtn);

return leftPanel;
}
public View getCenterPanelView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
centerPanel = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_CENTERPANEL
,"padding-left","8"
,"padding-right","8"
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
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,navLabel,"content","#{res.flow_processview}"));
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
rightPanel = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_RIGHTPANEL
,"halign","right"
,"height","fill"
,"layout-type","linear"
,"width","88"
);
navigatorbar.addView(rightPanel);

return navigatorbar;
}
public View getNavPanelView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
navPanel = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_NAVPANEL
,"halign","center"
,"height","44"
,"layout-type","linear"
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
public View getItemPanelView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
itemPanel = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_ITEMPANEL
,"padding-left","15"
,"padding-right","15"
,"height","44"
,"layout-type","vbox"
,"width","fill"
,"onclick","onItemClick"
,"valign","center"
,"background-image","list_split.png"
);
itemPanel.setOnClickListener(new OnCursorClickListener(configure) {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Flow_StepScanActivity.this);
    int position = this.getPosition(v);
    if(position>=0) {
      context.getCursor("cursoreditstep_stepsalias").setCurrentIndex(position);
    }
    actionOnItemClick(itemPanel,args);

}
});
indexLabel = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_INDEXLABEL
,"content","index"
,"bindfield","index"
,"halign","left"
,"height","fill"
,"color","#000000"
,"layout-type","linear"
,"font-size","16"
,"width","32.0"
,"font-family","default"
,"valign","center"
,"readonly","true"
);
UMTextBinder indexLabel_binder = new UMTextBinder((IUMContextAccessor)context);
indexLabel_binder.setBindInfo(new BindInfo("index"));
indexLabel_binder.setControl(indexLabel);
binderGroup.addBinderToGroup(ID_INDEXLABEL, indexLabel_binder);
itemPanel.addView(indexLabel);
nameLabel = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_NAMELABEL
,"bindfield","name"
,"halign","left"
,"weight","1"
,"width","0"
,"content","name"
,"height","fill"
,"color","#000000"
,"font-size","16"
,"layout-type","linear"
,"font-family","default"
,"valign","center"
,"readonly","true"
);
UMTextBinder nameLabel_binder = new UMTextBinder((IUMContextAccessor)context);
nameLabel_binder.setBindInfo(new BindInfo("name"));
nameLabel_binder.setControl(nameLabel);
binderGroup.addBinderToGroup(ID_NAMELABEL, nameLabel_binder);
itemPanel.addView(nameLabel);
spaceLabel = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_SPACELABEL
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
itemPanel.addView(spaceLabel);
itemImg = (UMImage)ThirdControl.createControl(new UMImage(context),ID_ITEMIMG
,"height","13"
,"layout-type","linear"
,"width","8"
,"scaletype","fitcenter"
,"src","ecm_arrow_right.png"
);
itemPanel.addView(itemImg);

return itemPanel;
}
public View getListViewView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listView = (UMListViewBase)ThirdControl.createControl(new UMListViewBase(context),ID_LISTVIEW
,"bindfield","editstep.steps"
,"halign","center"
,"height","44"
,"cursoraction","cursoreditstep_stepsalias"
,"layout","vbox"
,"width","fill"
,"synccontext","editstep.steps"
,"adapteraddition","false"
,"adaptiveheight","true"
,"alternatingrow","true"
);
context.createCursor("cursoreditstep_stepsalias", "editstep.steps");
UMListBinder listView_binder = new UMListBinder((IUMContextAccessor)context);
listView_binder.setBindInfo(new BindInfo("editstep.steps"));
listView_binder.setControl(listView);
binderGroup.addBinderToGroup(ID_LISTVIEW, listView_binder);
listView.addListItemView(new UMListViewBase.ListItemView() {
	public View getItemView(Context context, View parent, IBinderGroup binderGroup,int position) {
  UMDslConfigure configure = new UMDslConfigure();
  configure.put("position",position);
View itemPanel = (View) getItemPanelView((UMActivity)context,binderGroup,configure);
return itemPanel;
}});

return listView;
}
public View getSpaceOutPanel1View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
spaceOutPanel1 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_SPACEOUTPANEL1
,"halign","center"
,"height","21"
,"layout-type","linear"
,"background","#c8c7cc"
,"width","fill"
,"display","none"
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
public View getRuleToggleView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
ruleToggle = (UMToggleButtonGroup)ThirdControl.createControl(new UMToggleButtonGroup(context),ID_RULETOGGLE
,"bindfield","editstep.rule"
,"height","30"
,"layout","hbox"
,"width","150"
,"value","buttongroup"
,"valign","center"
);
UMToggleButtonGroupBinder ruleToggle_binder = new UMToggleButtonGroupBinder((IUMContextAccessor)context);
ruleToggle_binder.setBindInfo(new BindInfo("editstep.rule"));
ruleToggle_binder.setControl(ruleToggle);
binderGroup.addBinderToGroup(ID_RULETOGGLE, ruleToggle_binder);
seizeBtn = (UMToggleButton)ThirdControl.createControl(new UMToggleButton(context),ID_SEIZEBTN
,"halign","center"
,"weight","1"
,"background-image-off","label_2_left"
,"width","0"
,"font-pressed-color","#ffffff"
,"type","button"
,"background-image-on","label_2_left_touch"
,"height","fill"
,"color","#e50011"
,"layout-type","hbox"
,"font-size","14"
,"value","2"
,"font-family","default"
,"valign","center"
,"disabled","disabled"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,seizeBtn,"textOff","#{res.flow_seize}"));
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,seizeBtn,"textOn","#{res.flow_seize}"));
ruleToggle.addView(seizeBtn);
countersignBtn = (UMToggleButton)ThirdControl.createControl(new UMToggleButton(context),ID_COUNTERSIGNBTN
,"halign","center"
,"weight","1"
,"background-image-off","label_2_right"
,"width","0"
,"font-pressed-color","#ffffff"
,"type","button"
,"background-image-on","label_2_right_touch"
,"height","fill"
,"color","#e50011"
,"layout-type","hbox"
,"font-size","14"
,"value","1"
,"font-family","default"
,"valign","center"
,"disabled","disabled"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,countersignBtn,"textOff","#{res.flow_countersign}"));
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,countersignBtn,"textOn","#{res.flow_countersign}"));
ruleToggle.addView(countersignBtn);

return ruleToggle;
}
public View getRulePanelView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
rulePanel = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_RULEPANEL
,"padding-right","15"
,"padding-left","15"
,"height","44"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"display","none"
,"valign","center"
);
ruleLabel = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_RULELABEL
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
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,ruleLabel,"content","#{res.flow_processrule}"));
rulePanel.addView(ruleLabel);
View ruleToggle = (View) getRuleToggleView((UMActivity)context,binderGroup,configure);
rulePanel.addView(ruleToggle);

return rulePanel;
}
public View getSpaceOutPanel2View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
spaceOutPanel2 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_SPACEOUTPANEL2
,"padding-top","1"
,"halign","center"
,"height","21"
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
View listView = (View) getListViewView((UMActivity)context,binderGroup,configure);
mainPanel.addView(listView);
View spaceOutPanel1 = (View) getSpaceOutPanel1View((UMActivity)context,binderGroup,configure);
mainPanel.addView(spaceOutPanel1);
View rulePanel = (View) getRulePanelView((UMActivity)context,binderGroup,configure);
mainPanel.addView(rulePanel);
View spaceOutPanel2 = (View) getSpaceOutPanel2View((UMActivity)context,binderGroup,configure);
mainPanel.addView(spaceOutPanel2);

return mainPanel;
}
public View getScrollview_mainPanelView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
Scrollview_mainPanel = (UMScrollView)ThirdControl.createControl(new UMScrollView(context),ID_SCROLLVIEW_MAINPANEL
,"height","fill"
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
,"width","fill"
,"background","#efeff4"
);
View navPanel = (View) getNavPanelView((UMActivity)context,binderGroup,configure);
basePanel.addView(navPanel);
View Scrollview_mainPanel = (View) getScrollview_mainPanelView((UMActivity)context,binderGroup,configure);
basePanel.addView(Scrollview_mainPanel);

return basePanel;
}
public UMWindow getCurrentWindow(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
StepScan = (UMWindow)ThirdControl.createControl(new UMWindow(context),ID_STEPSCAN
,"halign","center"
,"height","fill"
,"layout","vbox"
,"width","fill"
,"context","WorkDetail"
,"controller","StepScanController"
,"namespace","nc.bs.oa.oama.ecm"
);
View basePanel = (View) getBasePanelView((UMActivity)context,binderGroup,configure);
StepScan.addView(basePanel);

return (UMWindow)StepScan;
}

	
	public void actionGotoPerson(View control, UMEventArgs args) {
    String actionid = "gotoPerson";
    args.put("currentperson","#{CurrentPerson}");
    args.put("viewid","nc.bs.oa.oama.ecm.Ecm_PersonInfo");
    args.put("iskeep","true");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.open(args);
}
public void actionOnDataLoad(View control, UMEventArgs args) {
    String actionid = "onDataLoad";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "onDataLoad",UMActivity.getViewId(control),args);
}
public void actionOnItemClick(View control, UMEventArgs args) {
    String actionid = "onItemClick";
    args.put("viewid","nc.bs.oa.oama.freeflow.PersonController");
    args.put("personid","#{#{cursor.cursoreditstep_stepsalias}.id}");
    args.put("callback","gotoPerson");
    args.put("action","info");
    args.put("autodatabinding","false");
    args.put("type","information");
    args.put("contextmapping","CurrentPerson");
    args.put("containerName","");
    args.put("personid_arrayPath","editstep.steps");
  ActionProcessor.exec(this, actionid, args);
UMService.callAction(args);
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
public void actionUMonUnload(View control, UMEventArgs args) {
    String actionid = "UMonUnload";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "UMonUnload",UMActivity.getViewId(control),args);
}
public void actionOnReturnBtnClick(View control, UMEventArgs args) {
    String actionid = "onReturnBtnClick";
    args.put("resultcode","15");
    args.put("iskeep","false");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.close(args);
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


}
