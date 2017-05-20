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

public abstract class Flow_FlowScanActivity extends UMWindowActivity {

	protected UMWindow FlowScan = null;
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
protected XHorizontalLayout nullPanel = null;
protected UMLabel nullLabel = null;
protected UMListViewBase listView = null;
protected XHorizontalLayout itemPanel = null;
protected UMLabel noLabel = null;
protected UMLabel nameLabel = null;
protected UMLabel ruleLabel = null;
protected UMLabel spaceLabel = null;
protected UMImage itemImg = null;
protected XVerticalLayout spaceOutPanel1 = null;
protected XVerticalLayout spaceInnerPanel1 = null;
protected XVerticalLayout enableOutPanel = null;
protected XHorizontalLayout enableInnerPanel = null;
protected UMLabel enableLabel = null;
protected UMLabel editableSpaceLabel = null;
protected UMSwitch switchBtn = null;
protected XVerticalLayout noticeOutPanel = null;
protected XHorizontalLayout noticeInnerPanel = null;
protected UMLabel noticeLabel = null;
protected XVerticalLayout noticePanel = null;
protected XHorizontalLayout notice1Panel = null;
protected UMCheckbox msgCheckbox = null;
protected UMLabel msgLabel = null;
protected UMCheckbox mailCheckbox = null;
protected UMLabel mailLabel = null;
protected XHorizontalLayout notice2Panel = null;
protected UMCheckbox mobileCheckbox = null;
protected UMLabel mobileLabel = null;
protected UMCheckbox imCheckbox = null;
protected UMLabel imLabel = null;
protected XHorizontalLayout notice3Panel = null;
protected UMCheckbox approveCheckbox = null;
protected UMLabel approveLabel = null;
protected UMCheckbox flowCheckbox = null;
protected UMLabel flowLabel = null;
protected XVerticalLayout spaceOutPanel2 = null;
protected XVerticalLayout spaceInnerPanel2 = null;

	
	protected final static int ID_FLOWSCAN = 1112700952;
protected final static int ID_BASEPANEL = 384964370;
protected final static int ID_NAVPANEL = 276463415;
protected final static int ID_NAVIGATORBAR = 1629932516;
protected final static int ID_LEFTPANEL = 529780266;
protected final static int ID_RETURNBTN = 1922155667;
protected final static int ID_CENTERPANEL = 1735988867;
protected final static int ID_NAVLABEL = 1540535231;
protected final static int ID_RIGHTPANEL = 808341055;
protected final static int ID_SCROLLVIEW_MAINPANEL = 1767120032;
protected final static int ID_MAINPANEL = 1406176729;
protected final static int ID_SPACEOUTPANEL = 987746716;
protected final static int ID_SPACEINNERPANEL = 1665029731;
protected final static int ID_NULLPANEL = 943601302;
protected final static int ID_NULLLABEL = 512332778;
protected final static int ID_LISTVIEW = 1426700391;
protected final static int ID_ITEMPANEL = 183317784;
protected final static int ID_NOLABEL = 1368641321;
protected final static int ID_NAMELABEL = 531183819;
protected final static int ID_RULELABEL = 1941245541;
protected final static int ID_SPACELABEL = 60149567;
protected final static int ID_ITEMIMG = 2129651509;
protected final static int ID_SPACEOUTPANEL1 = 60178555;
protected final static int ID_SPACEINNERPANEL1 = 567008115;
protected final static int ID_ENABLEOUTPANEL = 1716346987;
protected final static int ID_ENABLEINNERPANEL = 366842626;
protected final static int ID_ENABLELABEL = 1842172253;
protected final static int ID_EDITABLESPACELABEL = 269473784;
protected final static int ID_SWITCHBTN = 279503008;
protected final static int ID_NOTICEOUTPANEL = 60351007;
protected final static int ID_NOTICEINNERPANEL = 1216900299;
protected final static int ID_NOTICELABEL = 1485305631;
protected final static int ID_NOTICEPANEL = 2043482947;
protected final static int ID_NOTICE1PANEL = 762399106;
protected final static int ID_MSGCHECKBOX = 1554916233;
protected final static int ID_MSGLABEL = 738796118;
protected final static int ID_MAILCHECKBOX = 167720054;
protected final static int ID_MAILLABEL = 1351554071;
protected final static int ID_NOTICE2PANEL = 1807211724;
protected final static int ID_MOBILECHECKBOX = 1475306318;
protected final static int ID_MOBILELABEL = 1841367178;
protected final static int ID_IMCHECKBOX = 1398852266;
protected final static int ID_IMLABEL = 1848133032;
protected final static int ID_NOTICE3PANEL = 377466266;
protected final static int ID_APPROVECHECKBOX = 1928735453;
protected final static int ID_APPROVELABEL = 860541212;
protected final static int ID_FLOWCHECKBOX = 905839938;
protected final static int ID_FLOWLABEL = 1610467352;
protected final static int ID_SPACEOUTPANEL2 = 1998710114;
protected final static int ID_SPACEINNERPANEL2 = 1470494594;

	
	
	@Override
	public String getControllerName() {
		return "FlowScanController";
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
		  idmap.put("FlowScan",ID_FLOWSCAN);
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
  idmap.put("nullPanel",ID_NULLPANEL);
  idmap.put("nullLabel",ID_NULLLABEL);
  idmap.put("listView",ID_LISTVIEW);
  idmap.put("itemPanel",ID_ITEMPANEL);
  idmap.put("noLabel",ID_NOLABEL);
  idmap.put("nameLabel",ID_NAMELABEL);
  idmap.put("ruleLabel",ID_RULELABEL);
  idmap.put("spaceLabel",ID_SPACELABEL);
  idmap.put("itemImg",ID_ITEMIMG);
  idmap.put("spaceOutPanel1",ID_SPACEOUTPANEL1);
  idmap.put("spaceInnerPanel1",ID_SPACEINNERPANEL1);
  idmap.put("enableOutPanel",ID_ENABLEOUTPANEL);
  idmap.put("enableInnerPanel",ID_ENABLEINNERPANEL);
  idmap.put("enableLabel",ID_ENABLELABEL);
  idmap.put("editableSpaceLabel",ID_EDITABLESPACELABEL);
  idmap.put("switchBtn",ID_SWITCHBTN);
  idmap.put("noticeOutPanel",ID_NOTICEOUTPANEL);
  idmap.put("noticeInnerPanel",ID_NOTICEINNERPANEL);
  idmap.put("noticeLabel",ID_NOTICELABEL);
  idmap.put("noticePanel",ID_NOTICEPANEL);
  idmap.put("notice1Panel",ID_NOTICE1PANEL);
  idmap.put("msgCheckbox",ID_MSGCHECKBOX);
  idmap.put("msgLabel",ID_MSGLABEL);
  idmap.put("mailCheckbox",ID_MAILCHECKBOX);
  idmap.put("mailLabel",ID_MAILLABEL);
  idmap.put("notice2Panel",ID_NOTICE2PANEL);
  idmap.put("mobileCheckbox",ID_MOBILECHECKBOX);
  idmap.put("mobileLabel",ID_MOBILELABEL);
  idmap.put("imCheckbox",ID_IMCHECKBOX);
  idmap.put("imLabel",ID_IMLABEL);
  idmap.put("notice3Panel",ID_NOTICE3PANEL);
  idmap.put("approveCheckbox",ID_APPROVECHECKBOX);
  idmap.put("approveLabel",ID_APPROVELABEL);
  idmap.put("flowCheckbox",ID_FLOWCHECKBOX);
  idmap.put("flowLabel",ID_FLOWLABEL);
  idmap.put("spaceOutPanel2",ID_SPACEOUTPANEL2);
  idmap.put("spaceInnerPanel2",ID_SPACEINNERPANEL2);

	}
	
	public void onLoad() {
		ULog.logLC("onLoad", this);
		if(currentPage!=null) {
			currentPage.onLoad();
		}
	
		{ //basePanel - onDataLoad
    UMEventArgs args = new UMEventArgs(Flow_FlowScanActivity.this);
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
    UMEventArgs args = new UMEventArgs(Flow_FlowScanActivity.this);
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
public View getNullPanelView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
nullPanel = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_NULLPANEL
,"height","45"
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
,"background","#ffffff"
,"font-size","16"
,"width","fill"
,"font-family","default"
,"valign","center"
,"readonly","true"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,nullLabel,"content","#{res.flow_nodata}"));
nullPanel.addView(nullLabel);

return nullPanel;
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
    UMEventArgs args = new UMEventArgs(Flow_FlowScanActivity.this);
    int position = this.getPosition(v);
    if(position>=0) {
      context.getCursor("cursorfloweditalias").setCurrentIndex(position);
    }
    actionOnItemClick(itemPanel,args);

}
});
noLabel = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_NOLABEL
,"content","no"
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
UMTextBinder noLabel_binder = new UMTextBinder((IUMContextAccessor)context);
noLabel_binder.setBindInfo(new BindInfo("index"));
noLabel_binder.setControl(noLabel);
binderGroup.addBinderToGroup(ID_NOLABEL, noLabel_binder);
itemPanel.addView(noLabel);
nameLabel = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_NAMELABEL
,"bindfield","names"
,"halign","left"
,"weight","1"
,"width","0"
,"content","names"
,"height","fill"
,"color","#000000"
,"font-size","16"
,"layout-type","linear"
,"font-family","default"
,"valign","center"
,"readonly","true"
);
UMTextBinder nameLabel_binder = new UMTextBinder((IUMContextAccessor)context);
nameLabel_binder.setBindInfo(new BindInfo("names"));
nameLabel_binder.setControl(nameLabel);
binderGroup.addBinderToGroup(ID_NAMELABEL, nameLabel_binder);
itemPanel.addView(nameLabel);
ruleLabel = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_RULELABEL
,"content","rule"
,"bindfield","rulename"
,"halign","right"
,"height","fill"
,"color","#8e8e93"
,"layout-type","linear"
,"font-size","14"
,"width","50"
,"font-family","default"
,"valign","center"
,"readonly","true"
);
UMTextBinder ruleLabel_binder = new UMTextBinder((IUMContextAccessor)context);
ruleLabel_binder.setBindInfo(new BindInfo("rulename"));
ruleLabel_binder.setControl(ruleLabel);
binderGroup.addBinderToGroup(ID_RULELABEL, ruleLabel_binder);
itemPanel.addView(ruleLabel);
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
,"bindfield","flowedit"
,"halign","center"
,"height","44"
,"cursoraction","cursorfloweditalias"
,"layout","vbox"
,"width","fill"
,"synccontext","flowedit"
,"adapteraddition","false"
,"adaptiveheight","true"
,"alternatingrow","true"
);
context.createCursor("cursorfloweditalias", "flowedit");
UMListBinder listView_binder = new UMListBinder((IUMContextAccessor)context);
listView_binder.setBindInfo(new BindInfo("flowedit"));
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
public View getEnableInnerPanelView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
enableInnerPanel = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_ENABLEINNERPANEL
,"padding-right","15"
,"padding-left","15"
,"height","0"
,"weight","1"
,"layout-type","linear"
,"width","fill"
,"valign","center"
);
enableLabel = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_ENABLELABEL
,"halign","left"
,"height","fill"
,"weight","1"
,"color","#8e8e93"
,"layout-type","linear"
,"font-size","16"
,"width","0"
,"font-family","default"
,"valign","center"
,"readonly","true"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,enableLabel,"content","#{res.flow_editable}"));
enableInnerPanel.addView(enableLabel);
editableSpaceLabel = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_EDITABLESPACELABEL
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
enableInnerPanel.addView(editableSpaceLabel);
switchBtn = (UMSwitch)ThirdControl.createControl(new UMSwitch(context),ID_SWITCHBTN
,"bindfield","editable"
,"padding-left","2"
,"pressed-image","slideswitch"
,"width","51"
,"background-image-dis","slideswitch"
,"switch-trackoff-image","switch_off"
,"switch-trackon-image","switch_on"
,"height","30"
,"color","#000000"
,"layout-type","linear"
,"font-size","18"
,"value","off"
,"font-family","default"
,"readonly","true"
,"background-image","slideswitch"
,"disabled","disabled"
);
UMSwitchBinder switchBtn_binder = new UMSwitchBinder((IUMContextAccessor)context);
switchBtn_binder.setBindInfo(new BindInfo("editable"));
switchBtn_binder.setControl(switchBtn);
binderGroup.addBinderToGroup(ID_SWITCHBTN, switchBtn_binder);
enableInnerPanel.addView(switchBtn);

return enableInnerPanel;
}
public View getEnableOutPanelView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
enableOutPanel = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_ENABLEOUTPANEL
,"halign","center"
,"height","44"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
);
View enableInnerPanel = (View) getEnableInnerPanelView((UMActivity)context,binderGroup,configure);
enableOutPanel.addView(enableInnerPanel);

return enableOutPanel;
}
public View getNoticeInnerPanelView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
noticeInnerPanel = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_NOTICEINNERPANEL
,"padding-right","15"
,"padding-left","15"
,"height","fill"
,"layout-type","linear"
,"background","#efeff4"
,"width","fill"
,"valign","center"
);
noticeLabel = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_NOTICELABEL
,"halign","left"
,"height","fill"
,"color","#727272"
,"layout-type","linear"
,"font-size","16"
,"width","fill"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,noticeLabel,"content","#{res.flow_noticetype}"));
noticeInnerPanel.addView(noticeLabel);

return noticeInnerPanel;
}
public View getNoticeOutPanelView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
noticeOutPanel = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_NOTICEOUTPANEL
,"padding-top","1"
,"halign","center"
,"height","32"
,"layout-type","linear"
,"background","#c8c7cc"
,"width","fill"
,"padding-bottom","1"
);
View noticeInnerPanel = (View) getNoticeInnerPanelView((UMActivity)context,binderGroup,configure);
noticeOutPanel.addView(noticeInnerPanel);

return noticeOutPanel;
}
public View getNotice1PanelView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
notice1Panel = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_NOTICE1PANEL
,"height","0"
,"weight","1"
,"layout-type","linear"
,"width","fill"
,"valign","center"
);
msgCheckbox = (UMCheckbox)ThirdControl.createControl(new UMCheckbox(context),ID_MSGCHECKBOX
,"bindfield","notice.msg"
,"width","20"
,"margin-right","5"
,"height","20"
,"color","#000000"
,"font-size","14"
,"layout-type","linear"
,"check-on-image","checkbox_select"
,"font-family","default"
,"readonly","true"
,"disabled","disabled"
,"check-off-image","checkbox_noselect"
);
UMCheckBoxBinder msgCheckbox_binder = new UMCheckBoxBinder((IUMContextAccessor)context);
msgCheckbox_binder.setBindInfo(new BindInfo("notice.msg"));
msgCheckbox_binder.setControl(msgCheckbox);
binderGroup.addBinderToGroup(ID_MSGCHECKBOX, msgCheckbox_binder);
notice1Panel.addView(msgCheckbox);
msgLabel = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_MSGLABEL
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
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,msgLabel,"content","#{res.flow_msg}"));
notice1Panel.addView(msgLabel);
mailCheckbox = (UMCheckbox)ThirdControl.createControl(new UMCheckbox(context),ID_MAILCHECKBOX
,"bindfield","notice.mail"
,"width","20"
,"margin-right","5"
,"height","20"
,"color","#000000"
,"font-size","14"
,"layout-type","linear"
,"check-on-image","checkbox_select"
,"font-family","default"
,"readonly","true"
,"disabled","disabled"
,"check-off-image","checkbox_noselect"
);
UMCheckBoxBinder mailCheckbox_binder = new UMCheckBoxBinder((IUMContextAccessor)context);
mailCheckbox_binder.setBindInfo(new BindInfo("notice.mail"));
mailCheckbox_binder.setControl(mailCheckbox);
binderGroup.addBinderToGroup(ID_MAILCHECKBOX, mailCheckbox_binder);
notice1Panel.addView(mailCheckbox);
mailLabel = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_MAILLABEL
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
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,mailLabel,"content","#{res.flow_mailmsg}"));
notice1Panel.addView(mailLabel);

return notice1Panel;
}
public View getNotice2PanelView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
notice2Panel = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_NOTICE2PANEL
,"height","0"
,"weight","1"
,"layout-type","linear"
,"width","fill"
,"valign","center"
);
mobileCheckbox = (UMCheckbox)ThirdControl.createControl(new UMCheckbox(context),ID_MOBILECHECKBOX
,"bindfield","notice.mobile"
,"width","20"
,"margin-right","5"
,"height","20"
,"color","#000000"
,"font-size","14"
,"layout-type","linear"
,"check-on-image","checkbox_select"
,"font-family","default"
,"readonly","true"
,"disabled","disabled"
,"check-off-image","checkbox_noselect"
);
UMCheckBoxBinder mobileCheckbox_binder = new UMCheckBoxBinder((IUMContextAccessor)context);
mobileCheckbox_binder.setBindInfo(new BindInfo("notice.mobile"));
mobileCheckbox_binder.setControl(mobileCheckbox);
binderGroup.addBinderToGroup(ID_MOBILECHECKBOX, mobileCheckbox_binder);
notice2Panel.addView(mobileCheckbox);
mobileLabel = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_MOBILELABEL
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
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,mobileLabel,"content","#{res.flow_mobilemsg}"));
notice2Panel.addView(mobileLabel);
imCheckbox = (UMCheckbox)ThirdControl.createControl(new UMCheckbox(context),ID_IMCHECKBOX
,"bindfield","notice.im"
,"width","20"
,"margin-right","5"
,"height","20"
,"color","#000000"
,"font-size","14"
,"layout-type","linear"
,"check-on-image","checkbox_select"
,"font-family","default"
,"readonly","true"
,"disabled","disabled"
,"check-off-image","checkbox_noselect"
);
UMCheckBoxBinder imCheckbox_binder = new UMCheckBoxBinder((IUMContextAccessor)context);
imCheckbox_binder.setBindInfo(new BindInfo("notice.im"));
imCheckbox_binder.setControl(imCheckbox);
binderGroup.addBinderToGroup(ID_IMCHECKBOX, imCheckbox_binder);
notice2Panel.addView(imCheckbox);
imLabel = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_IMLABEL
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
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,imLabel,"content","#{res.flow_immsg}"));
notice2Panel.addView(imLabel);

return notice2Panel;
}
public View getNotice3PanelView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
notice3Panel = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_NOTICE3PANEL
,"height","0"
,"weight","1"
,"layout-type","linear"
,"width","fill"
,"valign","center"
);
approveCheckbox = (UMCheckbox)ThirdControl.createControl(new UMCheckbox(context),ID_APPROVECHECKBOX
,"bindfield","notice.approve"
,"width","20"
,"margin-right","5"
,"height","20"
,"color","#000000"
,"font-size","14"
,"layout-type","linear"
,"check-on-image","checkbox_select"
,"font-family","default"
,"readonly","true"
,"disabled","disabled"
,"check-off-image","checkbox_noselect"
);
UMCheckBoxBinder approveCheckbox_binder = new UMCheckBoxBinder((IUMContextAccessor)context);
approveCheckbox_binder.setBindInfo(new BindInfo("notice.approve"));
approveCheckbox_binder.setControl(approveCheckbox);
binderGroup.addBinderToGroup(ID_APPROVECHECKBOX, approveCheckbox_binder);
notice3Panel.addView(approveCheckbox);
approveLabel = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_APPROVELABEL
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
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,approveLabel,"content","#{res.flow_approvemsg}"));
notice3Panel.addView(approveLabel);
flowCheckbox = (UMCheckbox)ThirdControl.createControl(new UMCheckbox(context),ID_FLOWCHECKBOX
,"bindfield","notice.flow"
,"width","20"
,"margin-right","5"
,"height","20"
,"color","#000000"
,"font-size","14"
,"layout-type","linear"
,"check-on-image","checkbox_select"
,"font-family","default"
,"readonly","true"
,"disabled","disabled"
,"check-off-image","checkbox_noselect"
);
UMCheckBoxBinder flowCheckbox_binder = new UMCheckBoxBinder((IUMContextAccessor)context);
flowCheckbox_binder.setBindInfo(new BindInfo("notice.flow"));
flowCheckbox_binder.setControl(flowCheckbox);
binderGroup.addBinderToGroup(ID_FLOWCHECKBOX, flowCheckbox_binder);
notice3Panel.addView(flowCheckbox);
flowLabel = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_FLOWLABEL
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
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,flowLabel,"content","#{res.flow_flowmsg}"));
notice3Panel.addView(flowLabel);

return notice3Panel;
}
public View getNoticePanelView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
noticePanel = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_NOTICEPANEL
,"padding-left","15"
,"padding-right","15"
,"halign","center"
,"height","100"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
);
View notice1Panel = (View) getNotice1PanelView((UMActivity)context,binderGroup,configure);
noticePanel.addView(notice1Panel);
View notice2Panel = (View) getNotice2PanelView((UMActivity)context,binderGroup,configure);
noticePanel.addView(notice2Panel);
View notice3Panel = (View) getNotice3PanelView((UMActivity)context,binderGroup,configure);
noticePanel.addView(notice3Panel);

return noticePanel;
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
View nullPanel = (View) getNullPanelView((UMActivity)context,binderGroup,configure);
mainPanel.addView(nullPanel);
View listView = (View) getListViewView((UMActivity)context,binderGroup,configure);
mainPanel.addView(listView);
View spaceOutPanel1 = (View) getSpaceOutPanel1View((UMActivity)context,binderGroup,configure);
mainPanel.addView(spaceOutPanel1);
View enableOutPanel = (View) getEnableOutPanelView((UMActivity)context,binderGroup,configure);
mainPanel.addView(enableOutPanel);
View noticeOutPanel = (View) getNoticeOutPanelView((UMActivity)context,binderGroup,configure);
mainPanel.addView(noticeOutPanel);
View noticePanel = (View) getNoticePanelView((UMActivity)context,binderGroup,configure);
mainPanel.addView(noticePanel);
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
FlowScan = (UMWindow)ThirdControl.createControl(new UMWindow(context),ID_FLOWSCAN
,"halign","center"
,"height","fill"
,"layout","vbox"
,"width","fill"
,"context","WorkDetail"
,"controller","FlowScanController"
,"namespace","nc.bs.oa.oama.ecm"
);
View basePanel = (View) getBasePanelView((UMActivity)context,binderGroup,configure);
FlowScan.addView(basePanel);

return (UMWindow)FlowScan;
}

	
	public void actionOnDataLoad(View control, UMEventArgs args) {
    String actionid = "onDataLoad";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "onDataLoad",UMActivity.getViewId(control),args);
}
public void actionOnItemClick(View control, UMEventArgs args) {
    String actionid = "onItemClick";
    args.put("viewid","nc.bs.oa.oama.ecm.Flow_StepScan");
    args.put("editstep_arrayPath","flowedit");
    args.put("editstep","#{#{cursor.cursorfloweditalias}}");
    args.put("iskeep","true");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.open(args);
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
