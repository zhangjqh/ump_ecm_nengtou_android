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

public abstract class Flow_TemplateListActivity extends UMWindowActivity {

	protected UMWindow TemplateList = null;
protected XVerticalLayout basePanel = null;
protected XVerticalLayout navPanel = null;
protected XHorizontalLayout navigatorbar = null;
protected XHorizontalLayout leftPanel = null;
protected UMButton returnBtn = null;
protected XHorizontalLayout centerPanel = null;
protected UMLabel navLabel = null;
protected XHorizontalLayout rightPanel = null;
protected UMScrollView Scrollview_mainPanel = null;
protected XVerticalLayout mainPanel = null;
protected XVerticalLayout spaceOutPanel = null;
protected XVerticalLayout spaceInnerPanel = null;
protected XHorizontalLayout nullPanel = null;
protected UMLabel nullLabel = null;
protected XHorizontalLayout rangePanel = null;
protected UMLabel rangeLabel = null;
protected XVerticalLayout spaceOutPanel1 = null;
protected XVerticalLayout spaceInnerPanel1 = null;
protected UMListViewBase listView = null;
protected XHorizontalLayout itemPanel = null;
protected UMLabel nameLabel = null;
protected XVerticalLayout spaceOutPanel2 = null;
protected XVerticalLayout spaceInnerPanel2 = null;

	
	protected final static int ID_TEMPLATELIST = 1964022485;
protected final static int ID_BASEPANEL = 1169172010;
protected final static int ID_NAVPANEL = 959822984;
protected final static int ID_NAVIGATORBAR = 793043841;
protected final static int ID_LEFTPANEL = 2054748929;
protected final static int ID_RETURNBTN = 994296134;
protected final static int ID_CENTERPANEL = 1242535438;
protected final static int ID_NAVLABEL = 1548652888;
protected final static int ID_RIGHTPANEL = 1549080804;
protected final static int ID_SCROLLVIEW_MAINPANEL = 1293318187;
protected final static int ID_MAINPANEL = 173814953;
protected final static int ID_SPACEOUTPANEL = 12985568;
protected final static int ID_SPACEINNERPANEL = 1719022270;
protected final static int ID_NULLPANEL = 191089439;
protected final static int ID_NULLLABEL = 2007991677;
protected final static int ID_RANGEPANEL = 1305217391;
protected final static int ID_RANGELABEL = 1765545498;
protected final static int ID_SPACEOUTPANEL1 = 1941035172;
protected final static int ID_SPACEINNERPANEL1 = 458691244;
protected final static int ID_LISTVIEW = 1504826632;
protected final static int ID_ITEMPANEL = 145934892;
protected final static int ID_NAMELABEL = 274911334;
protected final static int ID_SPACEOUTPANEL2 = 1800628317;
protected final static int ID_SPACEINNERPANEL2 = 1205713921;

	
	
	@Override
	public String getControllerName() {
		return "TemplateListController";
	}
	
	@Override
	public String getContextName() {
		return "TemplateList";
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
		  idmap.put("TemplateList",ID_TEMPLATELIST);
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
  idmap.put("rangePanel",ID_RANGEPANEL);
  idmap.put("rangeLabel",ID_RANGELABEL);
  idmap.put("spaceOutPanel1",ID_SPACEOUTPANEL1);
  idmap.put("spaceInnerPanel1",ID_SPACEINNERPANEL1);
  idmap.put("listView",ID_LISTVIEW);
  idmap.put("itemPanel",ID_ITEMPANEL);
  idmap.put("nameLabel",ID_NAMELABEL);
  idmap.put("spaceOutPanel2",ID_SPACEOUTPANEL2);
  idmap.put("spaceInnerPanel2",ID_SPACEINNERPANEL2);

	}
	
	public void onLoad() {
		ULog.logLC("onLoad", this);
		if(currentPage!=null) {
			currentPage.onLoad();
		}
	
		{ //basePanel - onDataLoad
    UMEventArgs args = new UMEventArgs(Flow_TemplateListActivity.this);
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
    UMEventArgs args = new UMEventArgs(Flow_TemplateListActivity.this);
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
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,navLabel,"content","#{res.flow_templatelist}"));
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
,"height","21"
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
public View getRangePanelView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
rangePanel = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_RANGEPANEL
,"padding-left","15"
,"padding-right","15"
,"height","44"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"display","none"
,"valign","center"
);
rangeLabel = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_RANGELABEL
,"halign","left"
,"height","fill"
,"color","#8e8e93"
,"layout-type","linear"
,"font-size","14"
,"width","fill"
,"font-family","default"
,"valign","center"
,"readonly","true"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,rangeLabel,"content","#{res.flow_outofrange}"));
rangePanel.addView(rangeLabel);

return rangePanel;
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
public View getItemPanelView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
itemPanel = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_ITEMPANEL
,"padding-left","16"
,"padding-right","16"
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
    UMEventArgs args = new UMEventArgs(Flow_TemplateListActivity.this);
    int position = this.getPosition(v);
    if(position>=0) {
      context.getCursor("cursortemplatesalias").setCurrentIndex(position);
    }
    actionOnItemClick(itemPanel,args);

}
});
nameLabel = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_NAMELABEL
,"content","name"
,"bindfield","name"
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
UMTextBinder nameLabel_binder = new UMTextBinder((IUMContextAccessor)context);
nameLabel_binder.setBindInfo(new BindInfo("name"));
nameLabel_binder.setControl(nameLabel);
binderGroup.addBinderToGroup(ID_NAMELABEL, nameLabel_binder);
itemPanel.addView(nameLabel);

return itemPanel;
}
public View getListViewView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listView = (UMListViewBase)ThirdControl.createControl(new UMListViewBase(context),ID_LISTVIEW
,"bindfield","templates"
,"halign","center"
,"height","44"
,"visible","false"
,"cursoraction","cursortemplatesalias"
,"layout","vbox"
,"width","fill"
,"synccontext","templates"
,"adapteraddition","false"
,"adaptiveheight","true"
);
context.createCursor("cursortemplatesalias", "templates");
UMListBinder listView_binder = new UMListBinder((IUMContextAccessor)context);
listView_binder.setBindInfo(new BindInfo("templates"));
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
public View getSpaceOutPanel2View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
spaceOutPanel2 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_SPACEOUTPANEL2
,"halign","center"
,"height","20"
,"layout-type","linear"
,"background","#c8c7cc"
,"width","fill"
);
spaceInnerPanel2 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_SPACEINNERPANEL2
,"padding-left","15"
,"padding-right","5"
,"halign","center"
,"height","fill"
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
View rangePanel = (View) getRangePanelView((UMActivity)context,binderGroup,configure);
mainPanel.addView(rangePanel);
View spaceOutPanel1 = (View) getSpaceOutPanel1View((UMActivity)context,binderGroup,configure);
mainPanel.addView(spaceOutPanel1);
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
TemplateList = (UMWindow)ThirdControl.createControl(new UMWindow(context),ID_TEMPLATELIST
,"halign","center"
,"height","fill"
,"layout","vbox"
,"width","fill"
,"context","TemplateList"
,"controller","TemplateListController"
,"namespace","nc.bs.oa.oama.ecm"
);
View basePanel = (View) getBasePanelView((UMActivity)context,binderGroup,configure);
TemplateList.addView(basePanel);

return (UMWindow)TemplateList;
}

	
	public void actionGotoEdit(View control, UMEventArgs args) {
    String actionid = "gotoEdit";
    args.put("viewid","nc.bs.oa.oama.ecm.Flow_DraftEdit");
    args.put("iskeep","false");
    args.put("currentwork","#{CurrentWork}");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.open(args);
}
public void actionOnDataLoad(View control, UMEventArgs args) {
    String actionid = "onDataLoad";
    args.put("viewid","nc.bs.oa.oama.freeflow.TemplateController");
    args.put("callback","loadCallback");
    args.put("action","list");
    args.put("autodatabinding","true");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMService.callAction(args);
}
public void actionOnItemClick(View control, UMEventArgs args) {
    String actionid = "onItemClick";
    args.put("viewid","nc.bs.oa.oama.freeflow.TemplateController");
    args.put("templateid_arrayPath","templates");
    args.put("callback","gotoEdit");
    args.put("action","detail");
    args.put("templateid","#{#{cursor.cursortemplatesalias}.id}");
    args.put("autodatabinding","false");
    args.put("contextmapping","CurrentWork");
    args.put("containerName","");
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
public void actionLoadCallback(View control, UMEventArgs args) {
    String actionid = "loadCallback";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "loadCallback",UMActivity.getViewId(control),args);
}


}
