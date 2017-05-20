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

public abstract class Flow_MainActivity extends UMWindowActivity {

	protected UMWindow Main = null;
protected XVerticalLayout basePanel = null;
protected XVerticalLayout navPanel = null;
protected XHorizontalLayout navigatorbar = null;
protected XHorizontalLayout leftPanel = null;
protected UMButton homeBtn = null;
protected XHorizontalLayout centerPanel = null;
protected UMLabel navLabel = null;
protected XVerticalLayout rightPanel = null;
protected UMButton addBtn = null;
protected XVerticalLayout mainPanel = null;
protected UMListViewBase listView = null;
protected XHorizontalLayout listView_groupWgt = null;
protected UMLabel listView_groupWgt_groupLabel = null;
protected XHorizontalLayout listView_childWgt0 = null;
protected UMLabel listView_childWgt0_cnameLabel = null;
protected UMLabel listView_childWgt0_cspace15Label = null;
protected UMLabel listView_childWgt0_cdateLabel = null;
protected XHorizontalLayout listView_childWgt1 = null;
protected UMImage listView_childWgt1_importantImg = null;
protected UMLabel listView_childWgt1_ispace5Label = null;
protected UMLabel listView_childWgt1_inameLabel = null;
protected UMLabel listView_childWgt1_ispace15Label = null;
protected UMLabel listView_childWgt1_idateLabel = null;
protected XVerticalLayout toolPanel = null;
protected XHorizontalLayout toolbar = null;
protected UMImageButton draftImgBtn = null;
protected UMImageButton sentImgBtn = null;
protected XHorizontalLayout wgtType = null;
protected XVerticalLayout wgtType_addPanel = null;
protected XVerticalLayout wgtType_menuOutPanel = null;
protected XHorizontalLayout wgtType_newPanel = null;
protected UMLabel wgtType_newLabel = null;
protected XVerticalLayout wgtType_menuInnerPanel = null;
protected XHorizontalLayout wgtType_templatePanel = null;
protected UMLabel wgtType_templateLabel = null;
protected XHorizontalLayout wgtType_cancelPanel = null;
protected UMLabel wgtType_cancelLabel = null;

	
	protected final static int ID_MAIN = 993744312;
protected final static int ID_BASEPANEL = 514697719;
protected final static int ID_NAVPANEL = 1360664463;
protected final static int ID_NAVIGATORBAR = 1934098851;
protected final static int ID_LEFTPANEL = 1780546876;
protected final static int ID_HOMEBTN = 2123365296;
protected final static int ID_CENTERPANEL = 1597710920;
protected final static int ID_NAVLABEL = 1030033582;
protected final static int ID_RIGHTPANEL = 1673056764;
protected final static int ID_ADDBTN = 151024630;
protected final static int ID_MAINPANEL = 1860193049;
protected final static int ID_LISTVIEW = 1720610854;
protected final static int ID_LISTVIEW_GROUPWGT = 1460620638;
protected final static int ID_LISTVIEW_GROUPWGT_GROUPLABEL = 834795570;
protected final static int ID_LISTVIEW_CHILDWGT0 = 811338709;
protected final static int ID_LISTVIEW_CHILDWGT0_CNAMELABEL = 2001971517;
protected final static int ID_LISTVIEW_CHILDWGT0_CSPACE15LABEL = 688467879;
protected final static int ID_LISTVIEW_CHILDWGT0_CDATELABEL = 1336892700;
protected final static int ID_LISTVIEW_CHILDWGT1 = 1292634647;
protected final static int ID_LISTVIEW_CHILDWGT1_IMPORTANTIMG = 1028932752;
protected final static int ID_LISTVIEW_CHILDWGT1_ISPACE5LABEL = 621102482;
protected final static int ID_LISTVIEW_CHILDWGT1_INAMELABEL = 1331528177;
protected final static int ID_LISTVIEW_CHILDWGT1_ISPACE15LABEL = 39597276;
protected final static int ID_LISTVIEW_CHILDWGT1_IDATELABEL = 222536523;
protected final static int ID_TOOLPANEL = 606607637;
protected final static int ID_TOOLBAR = 1764271989;
protected final static int ID_DRAFTIMGBTN = 584712353;
protected final static int ID_SENTIMGBTN = 220064685;
protected final static int ID_WGTTYPE = 150169200;
protected final static int ID_WGTTYPE_ADDPANEL = 1353672533;
protected final static int ID_WGTTYPE_MENUOUTPANEL = 1656885807;
protected final static int ID_WGTTYPE_NEWPANEL = 935366368;
protected final static int ID_WGTTYPE_NEWLABEL = 1336428378;
protected final static int ID_WGTTYPE_MENUINNERPANEL = 564886500;
protected final static int ID_WGTTYPE_TEMPLATEPANEL = 932285124;
protected final static int ID_WGTTYPE_TEMPLATELABEL = 1559286700;
protected final static int ID_WGTTYPE_CANCELPANEL = 795151943;
protected final static int ID_WGTTYPE_CANCELLABEL = 772043125;

	
	
	@Override
	public String getControllerName() {
		return "MainController";
	}
	
	@Override
	public String getContextName() {
		return "GroupList";
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
		{ //basePanel - resumeCallback
    UMEventArgs args = new UMEventArgs(Flow_MainActivity.this);
    actionResumeCallback(basePanel,args);

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
		  idmap.put("Main",ID_MAIN);
  idmap.put("basePanel",ID_BASEPANEL);
  idmap.put("navPanel",ID_NAVPANEL);
  idmap.put("navigatorbar",ID_NAVIGATORBAR);
  idmap.put("leftPanel",ID_LEFTPANEL);
  idmap.put("homeBtn",ID_HOMEBTN);
  idmap.put("centerPanel",ID_CENTERPANEL);
  idmap.put("navLabel",ID_NAVLABEL);
  idmap.put("rightPanel",ID_RIGHTPANEL);
  idmap.put("addBtn",ID_ADDBTN);
  idmap.put("mainPanel",ID_MAINPANEL);
  idmap.put("listView",ID_LISTVIEW);
  idmap.put("listView_groupWgt",ID_LISTVIEW_GROUPWGT);
  idmap.put("listView_groupWgt_groupLabel",ID_LISTVIEW_GROUPWGT_GROUPLABEL);
  idmap.put("listView_childWgt0",ID_LISTVIEW_CHILDWGT0);
  idmap.put("listView_childWgt0_cnameLabel",ID_LISTVIEW_CHILDWGT0_CNAMELABEL);
  idmap.put("listView_childWgt0_cspace15Label",ID_LISTVIEW_CHILDWGT0_CSPACE15LABEL);
  idmap.put("listView_childWgt0_cdateLabel",ID_LISTVIEW_CHILDWGT0_CDATELABEL);
  idmap.put("listView_childWgt1",ID_LISTVIEW_CHILDWGT1);
  idmap.put("listView_childWgt1_importantImg",ID_LISTVIEW_CHILDWGT1_IMPORTANTIMG);
  idmap.put("listView_childWgt1_ispace5Label",ID_LISTVIEW_CHILDWGT1_ISPACE5LABEL);
  idmap.put("listView_childWgt1_inameLabel",ID_LISTVIEW_CHILDWGT1_INAMELABEL);
  idmap.put("listView_childWgt1_ispace15Label",ID_LISTVIEW_CHILDWGT1_ISPACE15LABEL);
  idmap.put("listView_childWgt1_idateLabel",ID_LISTVIEW_CHILDWGT1_IDATELABEL);
  idmap.put("toolPanel",ID_TOOLPANEL);
  idmap.put("toolbar",ID_TOOLBAR);
  idmap.put("draftImgBtn",ID_DRAFTIMGBTN);
  idmap.put("sentImgBtn",ID_SENTIMGBTN);
  idmap.put("wgtType",ID_WGTTYPE);
  idmap.put("wgtType_addPanel",ID_WGTTYPE_ADDPANEL);
  idmap.put("wgtType_menuOutPanel",ID_WGTTYPE_MENUOUTPANEL);
  idmap.put("wgtType_newPanel",ID_WGTTYPE_NEWPANEL);
  idmap.put("wgtType_newLabel",ID_WGTTYPE_NEWLABEL);
  idmap.put("wgtType_menuInnerPanel",ID_WGTTYPE_MENUINNERPANEL);
  idmap.put("wgtType_templatePanel",ID_WGTTYPE_TEMPLATEPANEL);
  idmap.put("wgtType_templateLabel",ID_WGTTYPE_TEMPLATELABEL);
  idmap.put("wgtType_cancelPanel",ID_WGTTYPE_CANCELPANEL);
  idmap.put("wgtType_cancelLabel",ID_WGTTYPE_CANCELLABEL);

	}
	
	public void onLoad() {
		ULog.logLC("onLoad", this);
		if(currentPage!=null) {
			currentPage.onLoad();
		}
	
		{ //basePanel - beforeLoadDraft
    UMEventArgs args = new UMEventArgs(Flow_MainActivity.this);
    actionBeforeLoadDraft(basePanel,args);

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
homeBtn = (UMButton)ThirdControl.createControl(new UMButton(context),ID_HOMEBTN
,"halign","center"
,"height","44"
,"color","#e50011"
,"layout-type","linear"
,"font-size","17"
,"width","64"
,"onclick","onCloseBtnClick"
,"font-family","default"
,"font-pressed-color","#f2adb2"
,"valign","center"
,"background-image","btn_back.png"
);
homeBtn.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Flow_MainActivity.this);
    actionOnCloseBtnClick(homeBtn,args);

}
});
leftPanel.addView(homeBtn);

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
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,navLabel,"content","#{res.flow_collaboration}"));
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
addBtn = (UMButton)ThirdControl.createControl(new UMButton(context),ID_ADDBTN
,"halign","right"
,"pressed-image","btn_add_touch.png"
,"width","44"
,"background-image-dis","button"
,"font-pressed-color","#f2adb2"
,"height","44"
,"color","#e50011"
,"layout-type","linear"
,"font-size","17"
,"onclick","onAddBtnClick"
,"font-family","default"
,"valign","center"
,"background-image","btn_add.png"
);
addBtn.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Flow_MainActivity.this);
    actionOnAddBtnClick(addBtn,args);

}
});
rightPanel.addView(addBtn);

return rightPanel;
}
public View getNavigatorbarView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
navigatorbar = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_NAVIGATORBAR
,"padding-left","8"
,"padding-right","8"
,"pressed-image","nav"
,"width","fill"
,"background-image-dis","nav"
,"height","44"
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
public View getListView_groupWgtView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listView_groupWgt = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW_GROUPWGT
,"padding-right","15"
,"padding-left","15"
,"height","30"
,"layout-type","linear"
,"background","#efeff4"
,"width","fill"
,"valign","center"
);
listView_groupWgt_groupLabel = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW_GROUPWGT_GROUPLABEL
,"content","group"
,"bindfield","title"
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
UMTextBinder listView_groupWgt_groupLabel_binder = new UMTextBinder((IUMContextAccessor)context);
listView_groupWgt_groupLabel_binder.setBindInfo(new BindInfo("title"));
listView_groupWgt_groupLabel_binder.setControl(listView_groupWgt_groupLabel);
binderGroup.addBinderToGroup(ID_LISTVIEW_GROUPWGT_GROUPLABEL, listView_groupWgt_groupLabel_binder);
listView_groupWgt.addView(listView_groupWgt_groupLabel);

return listView_groupWgt;
}
public View getListView_childWgt0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listView_childWgt0 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW_CHILDWGT0
,"padding-left","15"
,"padding-right","15"
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
    UMEventArgs args = new UMEventArgs(Flow_MainActivity.this);
    int position = this.getPosition(v);
    if(position>=0) {
      context.getCursor("cursorgroups_worksalias").setCurrentIndex(position);
    }
    actionOnItemClick(listView_childWgt0,args);

}
});
listView_childWgt0_cnameLabel = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW_CHILDWGT0_CNAMELABEL
,"bindfield","title"
,"halign","left"
,"weight","1"
,"width","0"
,"content","common"
,"height","fill"
,"color","#000000"
,"font-size","16"
,"layout-type","linear"
,"font-family","default"
,"valign","center"
,"readonly","true"
);
UMTextBinder listView_childWgt0_cnameLabel_binder = new UMTextBinder((IUMContextAccessor)context);
listView_childWgt0_cnameLabel_binder.setBindInfo(new BindInfo("title"));
listView_childWgt0_cnameLabel_binder.setControl(listView_childWgt0_cnameLabel);
binderGroup.addBinderToGroup(ID_LISTVIEW_CHILDWGT0_CNAMELABEL, listView_childWgt0_cnameLabel_binder);
listView_childWgt0.addView(listView_childWgt0_cnameLabel);
listView_childWgt0_cspace15Label = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW_CHILDWGT0_CSPACE15LABEL
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
listView_childWgt0.addView(listView_childWgt0_cspace15Label);
listView_childWgt0_cdateLabel = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW_CHILDWGT0_CDATELABEL
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
UMTextBinder listView_childWgt0_cdateLabel_binder = new UMTextBinder((IUMContextAccessor)context);
listView_childWgt0_cdateLabel_binder.setBindInfo(new BindInfo("date"));
listView_childWgt0_cdateLabel_binder.setControl(listView_childWgt0_cdateLabel);
binderGroup.addBinderToGroup(ID_LISTVIEW_CHILDWGT0_CDATELABEL, listView_childWgt0_cdateLabel_binder);
listView_childWgt0.addView(listView_childWgt0_cdateLabel);

return listView_childWgt0;
}
public View getListView_childWgt1View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listView_childWgt1 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW_CHILDWGT1
,"padding-left","15"
,"padding-right","15"
,"height","44"
,"layout-type","linear"
,"width","fill"
,"onclick","onItemClick"
,"valign","center"
,"background-image","list_split.png"
);
listView_childWgt1.setOnClickListener(new OnCursorClickListener(configure) {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Flow_MainActivity.this);
    int position = this.getPosition(v);
    if(position>=0) {
      context.getCursor("cursorgroups_worksalias").setCurrentIndex(position);
    }
    actionOnItemClick(listView_childWgt1,args);

}
});
listView_childWgt1_importantImg = (UMImage)ThirdControl.createControl(new UMImage(context),ID_LISTVIEW_CHILDWGT1_IMPORTANTIMG
,"height","15"
,"layout-type","linear"
,"width","15"
,"scaletype","fitcenter"
,"src","oa_freeflow_important.png"
);
listView_childWgt1.addView(listView_childWgt1_importantImg);
listView_childWgt1_ispace5Label = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW_CHILDWGT1_ISPACE5LABEL
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
listView_childWgt1.addView(listView_childWgt1_ispace5Label);
listView_childWgt1_inameLabel = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW_CHILDWGT1_INAMELABEL
,"bindfield","title"
,"halign","left"
,"weight","1"
,"width","0"
,"content","important"
,"height","fill"
,"color","#000000"
,"font-size","16"
,"layout-type","linear"
,"font-family","default"
,"valign","center"
,"readonly","true"
);
UMTextBinder listView_childWgt1_inameLabel_binder = new UMTextBinder((IUMContextAccessor)context);
listView_childWgt1_inameLabel_binder.setBindInfo(new BindInfo("title"));
listView_childWgt1_inameLabel_binder.setControl(listView_childWgt1_inameLabel);
binderGroup.addBinderToGroup(ID_LISTVIEW_CHILDWGT1_INAMELABEL, listView_childWgt1_inameLabel_binder);
listView_childWgt1.addView(listView_childWgt1_inameLabel);
listView_childWgt1_ispace15Label = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW_CHILDWGT1_ISPACE15LABEL
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
listView_childWgt1.addView(listView_childWgt1_ispace15Label);
listView_childWgt1_idateLabel = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW_CHILDWGT1_IDATELABEL
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
UMTextBinder listView_childWgt1_idateLabel_binder = new UMTextBinder((IUMContextAccessor)context);
listView_childWgt1_idateLabel_binder.setBindInfo(new BindInfo("date"));
listView_childWgt1_idateLabel_binder.setControl(listView_childWgt1_idateLabel);
binderGroup.addBinderToGroup(ID_LISTVIEW_CHILDWGT1_IDATELABEL, listView_childWgt1_idateLabel_binder);
listView_childWgt1.addView(listView_childWgt1_idateLabel);

return listView_childWgt1;
}
public View getListViewView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listView = (UMListViewBase)ThirdControl.createControl(new UMListViewBase(context),ID_LISTVIEW
,"bindfield","groups,works"
,"pressed-line-image","list_split_touch.png"
,"childindicator","wgt_commonmodel"
,"cursoraction","cursorgroups_worksalias"
,"synccontext","listViewgroups_works"
,"width","fill"
,"pressed-color","#0852a5"
,"onuprefersh","onUpRefresh"
,"height","fill"
,"ondownrefersh","onDownRefresh"
,"layout-type","linear"
,"groupindicator","wgt_groupmodel"
);
context.createCursor("cursorgroups_worksalias", "listViewgroups_works");
UMListBinder listView_binder = new UMListBinder((IUMContextAccessor)context);
listView_binder.setBindInfo(new BindInfo("groups,works"));
listView_binder.setControl(listView);
binderGroup.addBinderToGroup(ID_LISTVIEW, listView_binder);
listView.setEvent("onuprefersh", new OnCursorEventListener(configure) {
  @Override
  public void onEvent(View v, UMEventArgs parent) {
    UMEventArgs args = new UMEventArgs(Flow_MainActivity.this);
    args.put(parent);
    actionOnUpRefresh(listView,args);

}
});
listView.setEvent("ondownrefersh", new OnCursorEventListener(configure) {
  @Override
  public void onEvent(View v, UMEventArgs parent) {
    UMEventArgs args = new UMEventArgs(Flow_MainActivity.this);
    args.put(parent);
    actionOnDownRefresh(listView,args);

}
});
listView.addListItemView(new UMListViewBase.ListItemView() {
	public View getItemView(Context context, View parent, IBinderGroup binderGroup,int position) {
  UMDslConfigure configure = new UMDslConfigure();
  configure.put("position",position);
View listView_groupWgt = (View) getListView_groupWgtView((UMActivity)context,binderGroup,configure);
return listView_groupWgt;
}});
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
public View getMainPanelView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
mainPanel = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_MAINPANEL
,"halign","center"
,"height","0"
,"weight","1"
,"layout-type","linear"
,"width","fill"
);
View listView = (View) getListViewView((UMActivity)context,binderGroup,configure);
mainPanel.addView(listView);

return mainPanel;
}
public View getToolbarView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
toolbar = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_TOOLBAR
,"height","49"
,"pressed-image","toolbar"
,"layout-type","linear"
,"width","fill"
,"background-image-dis","toolbar"
,"valign","center"
,"background-image","toolbar.png"
);
draftImgBtn = (UMImageButton)ThirdControl.createControl(new UMImageButton(context),ID_DRAFTIMGBTN
,"halign","center"
,"weight","1"
,"width","0"
,"icon-width","25"
,"istogglebutton","true"
,"font-pressed-color","#e50011"
,"icon-height","25"
,"height","fill"
,"color","#8a8888"
,"layout-type","linear"
,"font-size","10"
,"icon-background-image","oa_freeflow_draft.png"
,"icon-pressed-image","oa_freeflow_draft_click.png"
,"onclick","beforeLoadDraft"
,"font-family","default"
,"valign","center"
,"checked","false"
,"icon-text-spacing","5"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,draftImgBtn,"value","#{res.flow_draft}"));
draftImgBtn.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Flow_MainActivity.this);
    actionBeforeLoadDraft(draftImgBtn,args);

}
});
toolbar.addView(draftImgBtn);
sentImgBtn = (UMImageButton)ThirdControl.createControl(new UMImageButton(context),ID_SENTIMGBTN
,"halign","center"
,"weight","1"
,"width","0"
,"icon-width","25"
,"istogglebutton","true"
,"font-pressed-color","#e50011"
,"icon-height","25"
,"height","fill"
,"color","#8a8888"
,"layout-type","linear"
,"font-size","10"
,"icon-background-image","oa_freeflow_sent.png"
,"icon-pressed-image","oa_freeflow_sent_click.png"
,"onclick","beforeLoadSent"
,"font-family","default"
,"valign","center"
,"checked","false"
,"icon-text-spacing","5"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,sentImgBtn,"value","#{res.flow_sent}"));
sentImgBtn.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Flow_MainActivity.this);
    actionBeforeLoadSent(sentImgBtn,args);

}
});
toolbar.addView(sentImgBtn);

return toolbar;
}
public View getWgtType_newPanelView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
wgtType_newPanel = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_WGTTYPE_NEWPANEL
,"margin-right","16"
,"height","0"
,"weight","1"
,"layout-type","linear"
,"background","#f8f8f8"
,"width","fill"
,"margin-left","16"
,"onclick","onNewBtnClick"
,"valign","center"
,"padding-bottom","4"
);
wgtType_newPanel.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Flow_MainActivity.this);
    actionOnNewBtnClick(wgtType_newPanel,args);

}
});
wgtType_newLabel = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_WGTTYPE_NEWLABEL
,"halign","center"
,"height","fill"
,"color","#0852a5"
,"layout-type","linear"
,"font-size","20"
,"width","fill"
,"font-family","default"
,"valign","center"
,"readonly","true"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,wgtType_newLabel,"content","#{res.flow_create}"));
wgtType_newPanel.addView(wgtType_newLabel);

return wgtType_newPanel;
}
public View getWgtType_templatePanelView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
wgtType_templatePanel = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_WGTTYPE_TEMPLATEPANEL
,"margin-right","16"
,"padding-top","4"
,"height","0"
,"weight","1"
,"layout-type","linear"
,"background","#f8f8f8"
,"width","fill"
,"margin-left","16"
,"onclick","onTempBtnClick"
,"valign","center"
);
wgtType_templatePanel.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Flow_MainActivity.this);
    actionOnTempBtnClick(wgtType_templatePanel,args);

}
});
wgtType_templateLabel = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_WGTTYPE_TEMPLATELABEL
,"halign","center"
,"height","fill"
,"color","#0852a5"
,"layout-type","linear"
,"font-size","20"
,"width","fill"
,"onclick",""
,"font-family","default"
,"valign","center"
,"readonly","true"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,wgtType_templateLabel,"content","#{res.flow_template}"));
wgtType_templatePanel.addView(wgtType_templateLabel);

return wgtType_templatePanel;
}
public View getWgtType_menuOutPanelView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
wgtType_menuOutPanel = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_WGTTYPE_MENUOUTPANEL
,"padding-top","4"
,"halign","center"
,"height","89"
,"layout-type","linear"
,"background","#f8f8f8"
,"width","fill"
,"panelstyle","round-div"
,"padding-bottom","4"
);
View wgtType_newPanel = (View) getWgtType_newPanelView((UMActivity)context,binderGroup,configure);
wgtType_menuOutPanel.addView(wgtType_newPanel);
wgtType_menuInnerPanel = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_WGTTYPE_MENUINNERPANEL
,"margin-right","1"
,"halign","center"
,"height","1"
,"layout-type","linear"
,"background","#c7c8cc"
,"width","fill"
,"margin-left","1"
);
wgtType_menuOutPanel.addView(wgtType_menuInnerPanel);
View wgtType_templatePanel = (View) getWgtType_templatePanelView((UMActivity)context,binderGroup,configure);
wgtType_menuOutPanel.addView(wgtType_templatePanel);

return wgtType_menuOutPanel;
}
public View getWgtType_cancelPanelView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
wgtType_cancelPanel = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_WGTTYPE_CANCELPANEL
,"padding-right","16"
,"padding-left","16"
,"height","44"
,"layout-type","linear"
,"background","#f8f8f8"
,"width","fill"
,"onclick","onCancelBtnClick"
,"margin-top","8"
,"panelstyle","round-div"
,"valign","center"
);
wgtType_cancelPanel.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Flow_MainActivity.this);
    actionOnCancelBtnClick(wgtType_cancelPanel,args);

}
});
wgtType_cancelLabel = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_WGTTYPE_CANCELLABEL
,"halign","center"
,"height","fill"
,"color","#0852a5"
,"layout-type","linear"
,"font-size","20"
,"width","fill"
,"font-family","default"
,"valign","center"
,"readonly","true"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,wgtType_cancelLabel,"content","#{res.flow_cancel}"));
wgtType_cancelPanel.addView(wgtType_cancelLabel);

return wgtType_cancelPanel;
}
public View getWgtType_addPanelView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
wgtType_addPanel = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_WGTTYPE_ADDPANEL
,"padding-right","8"
,"padding-left","8"
,"padding-top","8"
,"halign","center"
,"height","157"
,"layout-type","linear"
,"width","fill"
);
View wgtType_menuOutPanel = (View) getWgtType_menuOutPanelView((UMActivity)context,binderGroup,configure);
wgtType_addPanel.addView(wgtType_menuOutPanel);
View wgtType_cancelPanel = (View) getWgtType_cancelPanelView((UMActivity)context,binderGroup,configure);
wgtType_addPanel.addView(wgtType_cancelPanel);

return wgtType_addPanel;
}
public View getWgtTypeView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
wgtType = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_WGTTYPE
,"height","fill"
,"pressed-image","oa_freeflow_menu_black.png"
,"layout-type","linear"
,"width","fill"
,"background-image-dis","oa_freeflow_menu_black.png"
,"onclick","onCancelBtnClick"
,"valign","bottom"
,"background-image","oa_freeflow_menu_black.png"
);
wgtType.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Flow_MainActivity.this);
    actionOnCancelBtnClick(wgtType,args);

}
});
View wgtType_addPanel = (View) getWgtType_addPanelView((UMActivity)context,binderGroup,configure);
wgtType.addView(wgtType_addPanel);

return wgtType;
}
public View getToolPanelView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
toolPanel = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_TOOLPANEL
,"halign","center"
,"height","49"
,"layout-type","linear"
,"width","fill"
);
View toolbar = (View) getToolbarView((UMActivity)context,binderGroup,configure);
toolPanel.addView(toolbar);
View wgtType = (View) getWgtTypeView((UMActivity)context,binderGroup,configure);
toolPanel.addView(wgtType);

return toolPanel;
}
public View getBasePanelView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
basePanel = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_BASEPANEL
,"halign","center"
,"height","fill"
,"onload","beforeLoadDraft"
,"layout-type","vbox"
,"width","fill"
,"background","#efeff4"
,"onresume","resumeCallback"
);
View navPanel = (View) getNavPanelView((UMActivity)context,binderGroup,configure);
basePanel.addView(navPanel);
View mainPanel = (View) getMainPanelView((UMActivity)context,binderGroup,configure);
basePanel.addView(mainPanel);
View toolPanel = (View) getToolPanelView((UMActivity)context,binderGroup,configure);
basePanel.addView(toolPanel);

return basePanel;
}
public UMWindow getCurrentWindow(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
Main = (UMWindow)ThirdControl.createControl(new UMWindow(context),ID_MAIN
,"halign","center"
,"height","fill"
,"layout","vbox"
,"width","fill"
,"context","GroupList"
,"controller","MainController"
,"namespace","nc.bs.oa.oama.ecm"
);
View basePanel = (View) getBasePanelView((UMActivity)context,binderGroup,configure);
Main.addView(basePanel);

return (UMWindow)Main;
}

	
	public void actionGotoEdit(View control, UMEventArgs args) {
    String actionid = "gotoEdit";
    args.put("viewid","nc.bs.oa.oama.ecm.Flow_DraftEdit");
    args.put("currentwork","#{CurrentWork}");
    args.put("iskeep","true");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.open(args);
}
public void actionOnNewBtnClick(View control, UMEventArgs args) {
    String actionid = "onNewBtnClick";
    args.put("viewid","wgtType");
    args.put("callback","newCallback");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.closePop(args);
}
public void actionOnCancelBtnClick(View control, UMEventArgs args) {
    String actionid = "onCancelBtnClick";
    args.put("viewid","wgtType");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.closePop(args);
}
public void actionOnLogin(View control, UMEventArgs args) {
    String actionid = "onLogin";
    args.put("failedexit","true");
    args.put("type","ua");
    args.put("contextmapping","none");
    args.put("success","loadDraftData");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMService.login(args);
}
public void actionLoadDraftData(View control, UMEventArgs args) {
    String actionid = "loadDraftData";
    args.put("count","25");
    args.put("viewid","nc.bs.oa.oama.freeflow.WorkController");
    args.put("startline","1");
    args.put("action","list");
    args.put("state","1");
    args.put("listid","listView");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMList.getFirstPage(args);
}
public void actionNewCallback(View control, UMEventArgs args) {
    String actionid = "newCallback";
    args.put("viewid","nc.bs.oa.oama.freeflow.WorkController");
    args.put("callback","gotoEdit");
    args.put("action","empty");
    args.put("autoDataBinding","true");
    args.put("contextmapping","CurrentWork");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMService.callAction(args);
}
public void actionOnDownRefresh(View control, UMEventArgs args) {
    String actionid = "onDownRefresh";
    args.put("viewid","nc.bs.oa.oama.freeflow.WorkController");
    args.put("action","list");
    args.put("state","#{state}");
    args.put("listid","listView");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMList.getNextPage(args);
}
public void actionOnItemClick(View control, UMEventArgs args) {
    String actionid = "onItemClick";
    args.put("workid","#{#{cursor.cursorgroups_worksalias}.id}");
    args.put("viewid","nc.bs.oa.oama.freeflow.WorkController");
    args.put("error","detailError");
    args.put("action","#{action}");
    args.put("callback","gotoDetail");
    args.put("autodatabinding","false");
    args.put("workid_arrayPath","groups.works");
    args.put("contextmapping","CurrentWork");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMService.callAction(args);
}
public void actionOnUpRefresh(View control, UMEventArgs args) {
    String actionid = "onUpRefresh";
    args.put("count","25");
    args.put("viewid","nc.bs.oa.oama.freeflow.WorkController");
    args.put("startline","1");
    args.put("action","list");
    args.put("state","#{state}");
    args.put("listid","listView");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMList.getFirstPage(args);
}
public void actionDetailError(View control, UMEventArgs args) {
    String actionid = "detailError";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "detailError",UMActivity.getViewId(control),args);
}
public void actionBeforeLoadDraft(View control, UMEventArgs args) {
    String actionid = "beforeLoadDraft";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "beforeLoadDraft",UMActivity.getViewId(control),args);
}
public void actionOnTempBtnClick(View control, UMEventArgs args) {
    String actionid = "onTempBtnClick";
    args.put("viewid","wgtType");
    args.put("callback","tempCallback");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.closePop(args);
}
public void actionLoadSentData(View control, UMEventArgs args) {
    String actionid = "loadSentData";
    args.put("count","25");
    args.put("viewid","nc.bs.oa.oama.freeflow.WorkController");
    args.put("startline","1");
    args.put("action","list");
    args.put("state","2");
    args.put("listid","listView");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMList.getFirstPage(args);
}
public void actionTempCallback(View control, UMEventArgs args) {
    String actionid = "tempCallback";
    args.put("viewid","nc.bs.oa.oama.ecm.Flow_TemplateList");
    args.put("iskeep","true");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.open(args);
}
public void actionGotoDetail(View control, UMEventArgs args) {
    String actionid = "gotoDetail";
    args.put("viewid","#{viewid}");
    args.put("currentwork","#{CurrentWork}");
    args.put("iskeep","true");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.open(args);
}
public void actionOnCloseBtnClick(View control, UMEventArgs args) {
    String actionid = "onCloseBtnClick";
    args.put("resultcode","0");
    args.put("iskeep","false");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.close(args);
}
public void actionResumeCallback(View control, UMEventArgs args) {
    String actionid = "resumeCallback";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "resumeCallback",UMActivity.getViewId(control),args);
}
public void actionBeforeLoadSent(View control, UMEventArgs args) {
    String actionid = "beforeLoadSent";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "beforeLoadSent",UMActivity.getViewId(control),args);
}
public void actionOnAddBtnClick(View control, UMEventArgs args) {
    String actionid = "onAddBtnClick";
    args.put("popwidth","fill");
    args.put("isTouch","true");
    args.put("single","true");
    args.put("viewid","wgtType");
  this.dataCollect();
    args.put("containerName","");
    args.put("popgravity","popbottom");
    args.put("popheight","fill");
  ActionProcessor.exec(this, actionid, args);
UMView.openPop(args);
}


}
