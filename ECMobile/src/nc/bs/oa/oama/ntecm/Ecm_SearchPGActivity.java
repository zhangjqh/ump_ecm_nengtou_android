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

public abstract class Ecm_SearchPGActivity extends UMWindowActivity {

	protected UMWindow SearchPG = null;
protected XVerticalLayout basePanel = null;
protected XVerticalLayout navPanel = null;
protected XHorizontalLayout navigatorbar = null;
protected XHorizontalLayout leftPanel = null;
protected UMButton returnBtn = null;
protected XHorizontalLayout centerPanel = null;
protected UMLabel navLabel = null;
protected XHorizontalLayout rightPanel = null;
protected UMButton searchBtn = null;
protected UMLabel numLabel = null;
protected XHorizontalLayout typePanel = null;
protected UMToggleButtonGroup toggleGroup = null;
protected UMToggleButton orgBtn = null;
protected UMToggleButton entBtn = null;
protected UMToggleButton groupBtn = null;
protected UMToggleButton listBtn = null;
protected XHorizontalLayout borderPanel = null;
protected XHorizontalLayout mainPanel = null;
protected UMListViewBase listView = null;
protected XHorizontalLayout listView_childWgt0 = null;
protected UMLabel listView_childWgt0_groupName = null;
protected UMLabel listView_childWgt0_groupNum = null;
protected UMLabel listView_childWgt0_groupSpace = null;
protected UMImage listView_childWgt0_groupImg = null;

	
	protected final static int ID_SEARCHPG = 361024292;
protected final static int ID_BASEPANEL = 692767872;
protected final static int ID_NAVPANEL = 916245177;
protected final static int ID_NAVIGATORBAR = 2102510620;
protected final static int ID_LEFTPANEL = 1510044798;
protected final static int ID_RETURNBTN = 37045340;
protected final static int ID_CENTERPANEL = 451576880;
protected final static int ID_NAVLABEL = 1737505347;
protected final static int ID_RIGHTPANEL = 1132201558;
protected final static int ID_SEARCHBTN = 94774812;
protected final static int ID_NUMLABEL = 1164346549;
protected final static int ID_TYPEPANEL = 1732553407;
protected final static int ID_TOGGLEGROUP = 417461466;
protected final static int ID_ORGBTN = 252167434;
protected final static int ID_ENTBTN = 1957269034;
protected final static int ID_GROUPBTN = 2006448443;
protected final static int ID_LISTBTN = 1833730183;
protected final static int ID_BORDERPANEL = 1703510193;
protected final static int ID_MAINPANEL = 1544901714;
protected final static int ID_LISTVIEW = 869058246;
protected final static int ID_LISTVIEW_CHILDWGT0 = 376121445;
protected final static int ID_LISTVIEW_CHILDWGT0_GROUPNAME = 1196653710;
protected final static int ID_LISTVIEW_CHILDWGT0_GROUPNUM = 1980103713;
protected final static int ID_LISTVIEW_CHILDWGT0_GROUPSPACE = 1871997346;
protected final static int ID_LISTVIEW_CHILDWGT0_GROUPIMG = 1106730141;

	
	
	@Override
	public String getControllerName() {
		return "EcmSearchPGController";
	}
	
	@Override
	public String getContextName() {
		return "Search";
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
		  idmap.put("SearchPG",ID_SEARCHPG);
  idmap.put("basePanel",ID_BASEPANEL);
  idmap.put("navPanel",ID_NAVPANEL);
  idmap.put("navigatorbar",ID_NAVIGATORBAR);
  idmap.put("leftPanel",ID_LEFTPANEL);
  idmap.put("returnBtn",ID_RETURNBTN);
  idmap.put("centerPanel",ID_CENTERPANEL);
  idmap.put("navLabel",ID_NAVLABEL);
  idmap.put("rightPanel",ID_RIGHTPANEL);
  idmap.put("searchBtn",ID_SEARCHBTN);
  idmap.put("numLabel",ID_NUMLABEL);
  idmap.put("typePanel",ID_TYPEPANEL);
  idmap.put("toggleGroup",ID_TOGGLEGROUP);
  idmap.put("orgBtn",ID_ORGBTN);
  idmap.put("entBtn",ID_ENTBTN);
  idmap.put("groupBtn",ID_GROUPBTN);
  idmap.put("listBtn",ID_LISTBTN);
  idmap.put("borderPanel",ID_BORDERPANEL);
  idmap.put("mainPanel",ID_MAINPANEL);
  idmap.put("listView",ID_LISTVIEW);
  idmap.put("listView_childWgt0",ID_LISTVIEW_CHILDWGT0);
  idmap.put("listView_childWgt0_groupName",ID_LISTVIEW_CHILDWGT0_GROUPNAME);
  idmap.put("listView_childWgt0_groupNum",ID_LISTVIEW_CHILDWGT0_GROUPNUM);
  idmap.put("listView_childWgt0_groupSpace",ID_LISTVIEW_CHILDWGT0_GROUPSPACE);
  idmap.put("listView_childWgt0_groupImg",ID_LISTVIEW_CHILDWGT0_GROUPIMG);

	}
	
	public void onLoad() {
		ULog.logLC("onLoad", this);
		if(currentPage!=null) {
			currentPage.onLoad();
		}
	
		{ //basePanel - beforeLoad
    UMEventArgs args = new UMEventArgs(Ecm_SearchPGActivity.this);
    actionBeforeLoad(basePanel,args);

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
,"width","120"
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
    UMEventArgs args = new UMEventArgs(Ecm_SearchPGActivity.this);
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
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,navLabel,"content","#{res.ecm_searchperson}"));
centerPanel.addView(navLabel);

return centerPanel;
}
public View getRightPanelView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
rightPanel = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_RIGHTPANEL
,"height","fill"
,"layout-type","linear"
,"width","120"
,"valign","center"
);
searchBtn = (UMButton)ThirdControl.createControl(new UMButton(context),ID_SEARCHBTN
,"halign","center"
,"height","fill"
,"color","#e50011"
,"layout-type","linear"
,"font-size","17"
,"width","55"
,"onclick","onSeartchBtnClick"
,"font-family","default"
,"font-pressed-color","#f2adb2"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,searchBtn,"value","#{res.ecm_search}"));
searchBtn.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Ecm_SearchPGActivity.this);
    actionOnSeartchBtnClick(searchBtn,args);

}
});
rightPanel.addView(searchBtn);
numLabel = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_NUMLABEL
,"halign","right"
,"height","fill"
,"weight","1"
,"color","#e50011"
,"layout-type","linear"
,"font-size","17"
,"width","0"
,"onclick","onSelectedClick"
,"font-family","default"
,"valign","center"
);
numLabel.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Ecm_SearchPGActivity.this);
    actionOnSelectedClick(numLabel,args);

}
});
rightPanel.addView(numLabel);

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
,"width","fill"
);
View navigatorbar = (View) getNavigatorbarView((UMActivity)context,binderGroup,configure);
navPanel.addView(navigatorbar);

return navPanel;
}
public View getToggleGroupView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
toggleGroup = (UMToggleButtonGroup)ThirdControl.createControl(new UMToggleButtonGroup(context),ID_TOGGLEGROUP
,"height","30"
,"weight","1"
,"layout","hbox"
,"width","0"
,"value","buttongroup"
,"valign","center"
);
orgBtn = (UMToggleButton)ThirdControl.createControl(new UMToggleButton(context),ID_ORGBTN
,"halign","center"
,"background-image-off","tab_left.png"
,"width","72.5"
,"font-pressed-color","#ffffff"
,"type","button"
,"background-image-on","tab_left_touch.png"
,"height","28.0"
,"color","#e50011"
,"layout-type","hbox"
,"font-size","12"
,"value","org"
,"onclick","onOrgBtnClick"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,orgBtn,"textOff","#{res.flow_orgnav}"));
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,orgBtn,"textOn","#{res.flow_orgnav}"));
orgBtn.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Ecm_SearchPGActivity.this);
    actionOnOrgBtnClick(orgBtn,args);

}
});
toggleGroup.addView(orgBtn);
entBtn = (UMToggleButton)ThirdControl.createControl(new UMToggleButton(context),ID_ENTBTN
,"halign","center"
,"background-image-off","tab_mid.png"
,"width","72.5"
,"font-pressed-color","#ffffff"
,"type","button"
,"background-image-on","tab_mid_touch.png"
,"height","28.0"
,"color","#e50011"
,"layout-type","hbox"
,"font-size","12"
,"value","ent"
,"onclick","onEGBtnClick"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,entBtn,"textOff","#{res.flow_entgroup}"));
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,entBtn,"textOn","#{res.flow_entgroup}"));
entBtn.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Ecm_SearchPGActivity.this);
    actionOnEGBtnClick(entBtn,args);

}
});
toggleGroup.addView(entBtn);
groupBtn = (UMToggleButton)ThirdControl.createControl(new UMToggleButton(context),ID_GROUPBTN
,"halign","center"
,"background-image-off","tab_mid.png"
,"width","72.5"
,"font-pressed-color","#ffffff"
,"type","button"
,"background-image-on","tab_mid_touch.png"
,"height","28.0"
,"color","#e50011"
,"layout-type","hbox"
,"font-size","12"
,"value","group"
,"onclick","loadData"
,"font-family","default"
,"valign","center"
,"checked","true"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,groupBtn,"textOff","#{res.flow_mygroup}"));
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,groupBtn,"textOn","#{res.flow_mygroup}"));
groupBtn.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Ecm_SearchPGActivity.this);
    actionLoadData(groupBtn,args);

}
});
toggleGroup.addView(groupBtn);
listBtn = (UMToggleButton)ThirdControl.createControl(new UMToggleButton(context),ID_LISTBTN
,"halign","center"
,"background-image-off","tab_right.png"
,"width","72.5"
,"font-pressed-color","#ffffff"
,"type","button"
,"background-image-on","tab_right_touch.png"
,"height","28.0"
,"color","#e50011"
,"layout-type","hbox"
,"font-size","12"
,"value","dept"
,"onclick","onDeptBtnClick"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,listBtn,"textOff","#{res.flow_mydept}"));
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,listBtn,"textOn","#{res.flow_mydept}"));
listBtn.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Ecm_SearchPGActivity.this);
    actionOnDeptBtnClick(listBtn,args);

}
});
toggleGroup.addView(listBtn);

return toggleGroup;
}
public View getTypePanelView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
typePanel = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_TYPEPANEL
,"padding-right","15"
,"padding-left","15"
,"height","44"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"valign","center"
);
View toggleGroup = (View) getToggleGroupView((UMActivity)context,binderGroup,configure);
typePanel.addView(toggleGroup);

return typePanel;
}
public View getListView_childWgt0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listView_childWgt0 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW_CHILDWGT0
,"padding-right","15"
,"padding-left","15"
,"height","44"
,"layout-type","linear"
,"width","fill"
,"onclick","onItemClick"
,"valign","center"
,"background-image","list_split.png"
);
listView_childWgt0.setOnClickListener(new OnCursorClickListener(configure) {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Ecm_SearchPGActivity.this);
    int position = this.getPosition(v);
    if(position>=0) {
      context.getCursor("cursorlistalias").setCurrentIndex(position);
    }
    actionOnItemClick(listView_childWgt0,args);

}
});
listView_childWgt0_groupName = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW_CHILDWGT0_GROUPNAME
,"bindfield","name"
,"halign","left"
,"weight","1"
,"width","0"
,"content","GroupName"
,"height","fill"
,"color","#000000"
,"font-size","16"
,"layout-type","linear"
,"font-family","default"
,"valign","center"
,"readonly","true"
);
UMTextBinder listView_childWgt0_groupName_binder = new UMTextBinder((IUMContextAccessor)context);
listView_childWgt0_groupName_binder.setBindInfo(new BindInfo("name"));
listView_childWgt0_groupName_binder.setControl(listView_childWgt0_groupName);
binderGroup.addBinderToGroup(ID_LISTVIEW_CHILDWGT0_GROUPNAME, listView_childWgt0_groupName_binder);
listView_childWgt0.addView(listView_childWgt0_groupName);
listView_childWgt0_groupNum = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW_CHILDWGT0_GROUPNUM
,"content","Num"
,"bindfield","num"
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
UMTextBinder listView_childWgt0_groupNum_binder = new UMTextBinder((IUMContextAccessor)context);
listView_childWgt0_groupNum_binder.setBindInfo(new BindInfo("num"));
listView_childWgt0_groupNum_binder.setControl(listView_childWgt0_groupNum);
binderGroup.addBinderToGroup(ID_LISTVIEW_CHILDWGT0_GROUPNUM, listView_childWgt0_groupNum_binder);
listView_childWgt0.addView(listView_childWgt0_groupNum);
listView_childWgt0_groupSpace = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW_CHILDWGT0_GROUPSPACE
,"halign","center"
,"height","fill"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","15"
,"font-family","default"
,"valign","center"
,"readonly","true"
);
listView_childWgt0.addView(listView_childWgt0_groupSpace);
listView_childWgt0_groupImg = (UMImage)ThirdControl.createControl(new UMImage(context),ID_LISTVIEW_CHILDWGT0_GROUPIMG
,"height","13"
,"layout-type","linear"
,"width","8"
,"scaletype","fitcenter"
,"src","oa_ecm_right.png"
);
listView_childWgt0.addView(listView_childWgt0_groupImg);

return listView_childWgt0;
}
public View getListViewView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listView = (UMListViewBase)ThirdControl.createControl(new UMListViewBase(context),ID_LISTVIEW
,"onuprefersh","loadData"
,"bindfield","list"
,"height","fill"
,"childindicator","wgt_group"
,"cursoraction","cursorlistalias"
,"layout-type","linear"
,"background","#efeff4"
,"width","fill"
,"synccontext","list"
);
context.createCursor("cursorlistalias", "list");
UMListBinder listView_binder = new UMListBinder((IUMContextAccessor)context);
listView_binder.setBindInfo(new BindInfo("list"));
listView_binder.setControl(listView);
binderGroup.addBinderToGroup(ID_LISTVIEW, listView_binder);
listView.setEvent("onuprefersh", new OnCursorEventListener(configure) {
  @Override
  public void onEvent(View v, UMEventArgs parent) {
    UMEventArgs args = new UMEventArgs(Ecm_SearchPGActivity.this);
    args.put(parent);
    actionLoadData(listView,args);

}
});
listView.addListItemView(new UMListViewBase.ListItemView() {
	public View getItemView(Context context, View parent, IBinderGroup binderGroup,int position) {
  UMDslConfigure configure = new UMDslConfigure();
  configure.put("position",position);
View listView_childWgt0 = (View) getListView_childWgt0View((UMActivity)context,binderGroup,configure);
return listView_childWgt0;
}});

return listView;
}
public View getMainPanelView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
mainPanel = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_MAINPANEL
,"height","0"
,"weight","1"
,"layout-type","linear"
,"width","fill"
,"valign","center"
);
View listView = (View) getListViewView((UMActivity)context,binderGroup,configure);
mainPanel.addView(listView);

return mainPanel;
}
public View getBasePanelView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
basePanel = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_BASEPANEL
,"halign","center"
,"height","fill"
,"onload","beforeLoad"
,"layout-type","vbox"
,"background","#efeff4"
,"width","fill"
);
View navPanel = (View) getNavPanelView((UMActivity)context,binderGroup,configure);
basePanel.addView(navPanel);
View typePanel = (View) getTypePanelView((UMActivity)context,binderGroup,configure);
basePanel.addView(typePanel);
borderPanel = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_BORDERPANEL
,"height","1"
,"layout-type","linear"
,"background","#c8c7cc"
,"width","fill"
,"valign","center"
);
basePanel.addView(borderPanel);
View mainPanel = (View) getMainPanelView((UMActivity)context,binderGroup,configure);
basePanel.addView(mainPanel);

return basePanel;
}
public UMWindow getCurrentWindow(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
SearchPG = (UMWindow)ThirdControl.createControl(new UMWindow(context),ID_SEARCHPG
,"halign","center"
,"height","fill"
,"layout","vbox"
,"width","fill"
,"context","Search"
,"controller","EcmSearchPGController"
,"namespace","nc.bs.oa.oama.ecm"
);
View basePanel = (View) getBasePanelView((UMActivity)context,binderGroup,configure);
SearchPG.addView(basePanel);

return (UMWindow)SearchPG;
}

	
	public void actionLoadError(View control, UMEventArgs args) {
    String actionid = "loadError";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "loadError",UMActivity.getViewId(control),args);
}
public void actionOnEGBtnClick(View control, UMEventArgs args) {
    String actionid = "onEGBtnClick";
    args.put("viewid","nc.bs.oa.oama.ecm.Ecm_SearchEG");
    args.put("iskeep","false");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.open(args);
}
public void actionOnOrgBtnClick(View control, UMEventArgs args) {
    String actionid = "onOrgBtnClick";
    args.put("viewid","nc.bs.oa.oama.ecm.Ecm_SearchOrg");
    args.put("iskeep","false");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.open(args);
}
public void actionSelectedCallback(View control, UMEventArgs args) {
    String actionid = "selectedCallback";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "selectedCallback",UMActivity.getViewId(control),args);
}
public void actionOnItemClick(View control, UMEventArgs args) {
    String actionid = "onItemClick";
    args.put("rowindex_arrayPath","list");
    args.put("rowindex","#{cursor.cursorlistalias.index}");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "onItemClick",UMActivity.getViewId(control),args);
}
public void actionBeforeLoad(View control, UMEventArgs args) {
    String actionid = "beforeLoad";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "beforeLoad",UMActivity.getViewId(control),args);
}
public void actionOnSeartchBtnClick(View control, UMEventArgs args) {
    String actionid = "onSeartchBtnClick";
    args.put("viewid","nc.bs.oa.oama.ecm.Ecm_Search");
    args.put("callback","selectedCallback");
    args.put("iskeep","true");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.open(args);
}
public void actionOnSelectedClick(View control, UMEventArgs args) {
    String actionid = "onSelectedClick";
    args.put("viewid","nc.bs.oa.oama.ecm.Ecm_SearchSelected");
    args.put("callback","selectedCallback");
    args.put("iskeep","true");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.open(args);
}
public void actionOnReturnBtnClick(View control, UMEventArgs args) {
    String actionid = "onReturnBtnClick";
    args.put("resultcode","0");
    args.put("iskeep","false");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.close(args);
}
public void actionLoadData(View control, UMEventArgs args) {
    String actionid = "loadData";
    args.put("error","loadError");
    args.put("viewid","nc.bs.oa.oama.ecm.PersonController");
    args.put("action","psnGroup");
    args.put("autodatabinding","true");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMService.callAction(args);
}
public void actionOnDeptBtnClick(View control, UMEventArgs args) {
    String actionid = "onDeptBtnClick";
    args.put("viewid","nc.bs.oa.oama.ecm.Ecm_SearchDept");
    args.put("iskeep","false");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.open(args);
}


}
