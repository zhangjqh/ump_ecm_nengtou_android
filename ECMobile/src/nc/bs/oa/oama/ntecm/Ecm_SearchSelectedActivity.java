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

public abstract class Ecm_SearchSelectedActivity extends UMWindowActivity {

	protected UMWindow SearchSelected = null;
protected XVerticalLayout basePanel = null;
protected XVerticalLayout navPanel = null;
protected XHorizontalLayout navigatorbar = null;
protected XHorizontalLayout leftPanel = null;
protected UMButton returnBtn = null;
protected XHorizontalLayout centerPanel = null;
protected UMLabel navLabel = null;
protected XHorizontalLayout rightPanel = null;
protected UMButton okBtn = null;
protected XVerticalLayout mainPanel = null;
protected UMListViewBase listView = null;
protected XHorizontalLayout listView_childWgt0 = null;
protected XHorizontalLayout listView_childWgt0_unselectedLeftPanel = null;
protected UMImage listView_childWgt0_unselectedImg = null;
protected UMLabel listView_childWgt0_unselectedName = null;
protected XVerticalLayout listView_childWgt0_unselectedRightPanel = null;
protected UMLabel listView_childWgt0_unselectedMobile = null;
protected UMLabel listView_childWgt0_unselectedPosition = null;
protected XHorizontalLayout listView_childWgt1 = null;
protected XHorizontalLayout listView_childWgt1_selectedLeftPanel = null;
protected UMImage listView_childWgt1_selectedImg = null;
protected UMLabel listView_childWgt1_selectedName = null;
protected XVerticalLayout listView_childWgt1_selectedRightPanel = null;
protected UMLabel listView_childWgt1_selectedMobile = null;
protected UMLabel listView_childWgt1_selectedPosition = null;

	
	protected final static int ID_SEARCHSELECTED = 1225144724;
protected final static int ID_BASEPANEL = 1999287257;
protected final static int ID_NAVPANEL = 96325644;
protected final static int ID_NAVIGATORBAR = 1615575418;
protected final static int ID_LEFTPANEL = 110047266;
protected final static int ID_RETURNBTN = 406743758;
protected final static int ID_CENTERPANEL = 1952878299;
protected final static int ID_NAVLABEL = 1035671253;
protected final static int ID_RIGHTPANEL = 1404485562;
protected final static int ID_OKBTN = 1789432832;
protected final static int ID_MAINPANEL = 1801673489;
protected final static int ID_LISTVIEW = 1560255487;
protected final static int ID_LISTVIEW_CHILDWGT0 = 1178914210;
protected final static int ID_LISTVIEW_CHILDWGT0_UNSELECTEDLEFTPANEL = 980806520;
protected final static int ID_LISTVIEW_CHILDWGT0_UNSELECTEDIMG = 868375149;
protected final static int ID_LISTVIEW_CHILDWGT0_UNSELECTEDNAME = 1660236746;
protected final static int ID_LISTVIEW_CHILDWGT0_UNSELECTEDRIGHTPANEL = 1097063346;
protected final static int ID_LISTVIEW_CHILDWGT0_UNSELECTEDMOBILE = 191157116;
protected final static int ID_LISTVIEW_CHILDWGT0_UNSELECTEDPOSITION = 453971392;
protected final static int ID_LISTVIEW_CHILDWGT1 = 1701798571;
protected final static int ID_LISTVIEW_CHILDWGT1_SELECTEDLEFTPANEL = 1743366658;
protected final static int ID_LISTVIEW_CHILDWGT1_SELECTEDIMG = 437095547;
protected final static int ID_LISTVIEW_CHILDWGT1_SELECTEDNAME = 778086239;
protected final static int ID_LISTVIEW_CHILDWGT1_SELECTEDRIGHTPANEL = 2020324449;
protected final static int ID_LISTVIEW_CHILDWGT1_SELECTEDMOBILE = 2054280616;
protected final static int ID_LISTVIEW_CHILDWGT1_SELECTEDPOSITION = 526289316;

	
	
	@Override
	public String getControllerName() {
		return "EcmSearchSelectedController";
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
		  idmap.put("SearchSelected",ID_SEARCHSELECTED);
  idmap.put("basePanel",ID_BASEPANEL);
  idmap.put("navPanel",ID_NAVPANEL);
  idmap.put("navigatorbar",ID_NAVIGATORBAR);
  idmap.put("leftPanel",ID_LEFTPANEL);
  idmap.put("returnBtn",ID_RETURNBTN);
  idmap.put("centerPanel",ID_CENTERPANEL);
  idmap.put("navLabel",ID_NAVLABEL);
  idmap.put("rightPanel",ID_RIGHTPANEL);
  idmap.put("okBtn",ID_OKBTN);
  idmap.put("mainPanel",ID_MAINPANEL);
  idmap.put("listView",ID_LISTVIEW);
  idmap.put("listView_childWgt0",ID_LISTVIEW_CHILDWGT0);
  idmap.put("listView_childWgt0_unselectedLeftPanel",ID_LISTVIEW_CHILDWGT0_UNSELECTEDLEFTPANEL);
  idmap.put("listView_childWgt0_unselectedImg",ID_LISTVIEW_CHILDWGT0_UNSELECTEDIMG);
  idmap.put("listView_childWgt0_unselectedName",ID_LISTVIEW_CHILDWGT0_UNSELECTEDNAME);
  idmap.put("listView_childWgt0_unselectedRightPanel",ID_LISTVIEW_CHILDWGT0_UNSELECTEDRIGHTPANEL);
  idmap.put("listView_childWgt0_unselectedMobile",ID_LISTVIEW_CHILDWGT0_UNSELECTEDMOBILE);
  idmap.put("listView_childWgt0_unselectedPosition",ID_LISTVIEW_CHILDWGT0_UNSELECTEDPOSITION);
  idmap.put("listView_childWgt1",ID_LISTVIEW_CHILDWGT1);
  idmap.put("listView_childWgt1_selectedLeftPanel",ID_LISTVIEW_CHILDWGT1_SELECTEDLEFTPANEL);
  idmap.put("listView_childWgt1_selectedImg",ID_LISTVIEW_CHILDWGT1_SELECTEDIMG);
  idmap.put("listView_childWgt1_selectedName",ID_LISTVIEW_CHILDWGT1_SELECTEDNAME);
  idmap.put("listView_childWgt1_selectedRightPanel",ID_LISTVIEW_CHILDWGT1_SELECTEDRIGHTPANEL);
  idmap.put("listView_childWgt1_selectedMobile",ID_LISTVIEW_CHILDWGT1_SELECTEDMOBILE);
  idmap.put("listView_childWgt1_selectedPosition",ID_LISTVIEW_CHILDWGT1_SELECTEDPOSITION);

	}
	
	public void onLoad() {
		ULog.logLC("onLoad", this);
		if(currentPage!=null) {
			currentPage.onLoad();
		}
	
		{ //basePanel - onDataLoad
    UMEventArgs args = new UMEventArgs(Ecm_SearchSelectedActivity.this);
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
    UMEventArgs args = new UMEventArgs(Ecm_SearchSelectedActivity.this);
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
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,navLabel,"content","#{res.flow_selectedlist}"));
centerPanel.addView(navLabel);

return centerPanel;
}
public View getRightPanelView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
rightPanel = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_RIGHTPANEL
,"height","fill"
,"layout-type","linear"
,"width","88"
,"valign","center"
);
okBtn = (UMButton)ThirdControl.createControl(new UMButton(context),ID_OKBTN
,"halign","right"
,"height","44"
,"color","#e50011"
,"layout-type","linear"
,"font-size","17"
,"width","fill"
,"onclick","onOkBtnClick"
,"font-family","default"
,"font-pressed-color","#f2adb2"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,okBtn,"value","#{res.flow_ok}"));
okBtn.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Ecm_SearchSelectedActivity.this);
    actionOnOkBtnClick(okBtn,args);

}
});
rightPanel.addView(okBtn);

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
public View getListView_childWgt0_unselectedLeftPanelView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listView_childWgt0_unselectedLeftPanel = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW_CHILDWGT0_UNSELECTEDLEFTPANEL
,"height","60.0"
,"weight","1"
,"layout-type","linear"
,"width","0"
,"valign","center"
);
listView_childWgt0_unselectedImg = (UMImage)ThirdControl.createControl(new UMImage(context),ID_LISTVIEW_CHILDWGT0_UNSELECTEDIMG
,"margin-right","5"
,"height","20"
,"layout-type","linear"
,"width","20"
,"onclick","onItemClick"
,"scaletype","fitcenter"
,"src","checkbox_noselect.png"
);
listView_childWgt0_unselectedImg.setOnClickListener(new OnCursorClickListener(configure) {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Ecm_SearchSelectedActivity.this);
    int position = this.getPosition(v);
    if(position>=0) {
      context.getCursor("cursorlistalias").setCurrentIndex(position);
    }
    actionOnItemClick(listView_childWgt0_unselectedImg,args);

}
});
listView_childWgt0_unselectedLeftPanel.addView(listView_childWgt0_unselectedImg);
listView_childWgt0_unselectedName = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW_CHILDWGT0_UNSELECTEDNAME
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
UMTextBinder listView_childWgt0_unselectedName_binder = new UMTextBinder((IUMContextAccessor)context);
listView_childWgt0_unselectedName_binder.setBindInfo(new BindInfo("name"));
listView_childWgt0_unselectedName_binder.setControl(listView_childWgt0_unselectedName);
binderGroup.addBinderToGroup(ID_LISTVIEW_CHILDWGT0_UNSELECTEDNAME, listView_childWgt0_unselectedName_binder);
listView_childWgt0_unselectedLeftPanel.addView(listView_childWgt0_unselectedName);

return listView_childWgt0_unselectedLeftPanel;
}
public View getListView_childWgt0_unselectedRightPanelView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listView_childWgt0_unselectedRightPanel = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_LISTVIEW_CHILDWGT0_UNSELECTEDRIGHTPANEL
,"halign","center"
,"height","60.0"
,"layout-type","linear"
,"width","160"
);
listView_childWgt0_unselectedMobile = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW_CHILDWGT0_UNSELECTEDMOBILE
,"bindfield","mobile"
,"halign","right"
,"weight","1"
,"width","fill"
,"content","mobile"
,"height","0"
,"color","#8e8e93"
,"font-size","14"
,"layout-type","linear"
,"font-family","default"
,"valign","center"
,"readonly","true"
);
UMTextBinder listView_childWgt0_unselectedMobile_binder = new UMTextBinder((IUMContextAccessor)context);
listView_childWgt0_unselectedMobile_binder.setBindInfo(new BindInfo("mobile"));
listView_childWgt0_unselectedMobile_binder.setControl(listView_childWgt0_unselectedMobile);
binderGroup.addBinderToGroup(ID_LISTVIEW_CHILDWGT0_UNSELECTEDMOBILE, listView_childWgt0_unselectedMobile_binder);
listView_childWgt0_unselectedRightPanel.addView(listView_childWgt0_unselectedMobile);
listView_childWgt0_unselectedPosition = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW_CHILDWGT0_UNSELECTEDPOSITION
,"bindfield","position"
,"halign","right"
,"weight","1"
,"width","fill"
,"content","position"
,"height","0"
,"color","#8e8e93"
,"font-size","14"
,"layout-type","linear"
,"font-family","default"
,"valign","center"
,"readonly","true"
);
UMTextBinder listView_childWgt0_unselectedPosition_binder = new UMTextBinder((IUMContextAccessor)context);
listView_childWgt0_unselectedPosition_binder.setBindInfo(new BindInfo("position"));
listView_childWgt0_unselectedPosition_binder.setControl(listView_childWgt0_unselectedPosition);
binderGroup.addBinderToGroup(ID_LISTVIEW_CHILDWGT0_UNSELECTEDPOSITION, listView_childWgt0_unselectedPosition_binder);
listView_childWgt0_unselectedRightPanel.addView(listView_childWgt0_unselectedPosition);

return listView_childWgt0_unselectedRightPanel;
}
public View getListView_childWgt0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listView_childWgt0 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW_CHILDWGT0
,"padding-left","15"
,"padding-right","15"
,"height","70"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"onclick","onItemClick"
,"valign","center"
);
listView_childWgt0.setOnClickListener(new OnCursorClickListener(configure) {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Ecm_SearchSelectedActivity.this);
    int position = this.getPosition(v);
    if(position>=0) {
      context.getCursor("cursorlistalias").setCurrentIndex(position);
    }
    actionOnItemClick(listView_childWgt0,args);

}
});
View listView_childWgt0_unselectedLeftPanel = (View) getListView_childWgt0_unselectedLeftPanelView((UMActivity)context,binderGroup,configure);
listView_childWgt0.addView(listView_childWgt0_unselectedLeftPanel);
View listView_childWgt0_unselectedRightPanel = (View) getListView_childWgt0_unselectedRightPanelView((UMActivity)context,binderGroup,configure);
listView_childWgt0.addView(listView_childWgt0_unselectedRightPanel);

return listView_childWgt0;
}
public View getListView_childWgt1_selectedLeftPanelView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listView_childWgt1_selectedLeftPanel = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW_CHILDWGT1_SELECTEDLEFTPANEL
,"height","60.0"
,"weight","1"
,"layout-type","linear"
,"width","0"
,"valign","center"
);
listView_childWgt1_selectedImg = (UMImage)ThirdControl.createControl(new UMImage(context),ID_LISTVIEW_CHILDWGT1_SELECTEDIMG
,"margin-right","5"
,"height","20"
,"layout-type","linear"
,"width","20"
,"onclick","onItemClick"
,"scaletype","fitcenter"
,"src","checkbox_select.png"
);
listView_childWgt1_selectedImg.setOnClickListener(new OnCursorClickListener(configure) {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Ecm_SearchSelectedActivity.this);
    int position = this.getPosition(v);
    if(position>=0) {
      context.getCursor("cursorlistalias").setCurrentIndex(position);
    }
    actionOnItemClick(listView_childWgt1_selectedImg,args);

}
});
listView_childWgt1_selectedLeftPanel.addView(listView_childWgt1_selectedImg);
listView_childWgt1_selectedName = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW_CHILDWGT1_SELECTEDNAME
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
UMTextBinder listView_childWgt1_selectedName_binder = new UMTextBinder((IUMContextAccessor)context);
listView_childWgt1_selectedName_binder.setBindInfo(new BindInfo("name"));
listView_childWgt1_selectedName_binder.setControl(listView_childWgt1_selectedName);
binderGroup.addBinderToGroup(ID_LISTVIEW_CHILDWGT1_SELECTEDNAME, listView_childWgt1_selectedName_binder);
listView_childWgt1_selectedLeftPanel.addView(listView_childWgt1_selectedName);

return listView_childWgt1_selectedLeftPanel;
}
public View getListView_childWgt1_selectedRightPanelView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listView_childWgt1_selectedRightPanel = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_LISTVIEW_CHILDWGT1_SELECTEDRIGHTPANEL
,"halign","center"
,"height","60.0"
,"layout-type","linear"
,"width","160"
);
listView_childWgt1_selectedMobile = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW_CHILDWGT1_SELECTEDMOBILE
,"bindfield","mobile"
,"halign","right"
,"weight","1"
,"width","fill"
,"content","mobile"
,"height","0"
,"color","#8e8e93"
,"font-size","14"
,"layout-type","linear"
,"font-family","default"
,"valign","center"
,"readonly","true"
);
UMTextBinder listView_childWgt1_selectedMobile_binder = new UMTextBinder((IUMContextAccessor)context);
listView_childWgt1_selectedMobile_binder.setBindInfo(new BindInfo("mobile"));
listView_childWgt1_selectedMobile_binder.setControl(listView_childWgt1_selectedMobile);
binderGroup.addBinderToGroup(ID_LISTVIEW_CHILDWGT1_SELECTEDMOBILE, listView_childWgt1_selectedMobile_binder);
listView_childWgt1_selectedRightPanel.addView(listView_childWgt1_selectedMobile);
listView_childWgt1_selectedPosition = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW_CHILDWGT1_SELECTEDPOSITION
,"bindfield","position"
,"halign","right"
,"weight","1"
,"width","fill"
,"content","position"
,"height","0"
,"color","#8e8e93"
,"font-size","14"
,"layout-type","linear"
,"font-family","default"
,"valign","center"
,"readonly","true"
);
UMTextBinder listView_childWgt1_selectedPosition_binder = new UMTextBinder((IUMContextAccessor)context);
listView_childWgt1_selectedPosition_binder.setBindInfo(new BindInfo("position"));
listView_childWgt1_selectedPosition_binder.setControl(listView_childWgt1_selectedPosition);
binderGroup.addBinderToGroup(ID_LISTVIEW_CHILDWGT1_SELECTEDPOSITION, listView_childWgt1_selectedPosition_binder);
listView_childWgt1_selectedRightPanel.addView(listView_childWgt1_selectedPosition);

return listView_childWgt1_selectedRightPanel;
}
public View getListView_childWgt1View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listView_childWgt1 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW_CHILDWGT1
,"padding-left","15"
,"padding-right","15"
,"height","70"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"onclick","onItemClick"
,"valign","center"
);
listView_childWgt1.setOnClickListener(new OnCursorClickListener(configure) {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Ecm_SearchSelectedActivity.this);
    int position = this.getPosition(v);
    if(position>=0) {
      context.getCursor("cursorlistalias").setCurrentIndex(position);
    }
    actionOnItemClick(listView_childWgt1,args);

}
});
View listView_childWgt1_selectedLeftPanel = (View) getListView_childWgt1_selectedLeftPanelView((UMActivity)context,binderGroup,configure);
listView_childWgt1.addView(listView_childWgt1_selectedLeftPanel);
View listView_childWgt1_selectedRightPanel = (View) getListView_childWgt1_selectedRightPanelView((UMActivity)context,binderGroup,configure);
listView_childWgt1.addView(listView_childWgt1_selectedRightPanel);

return listView_childWgt1;
}
public View getListViewView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listView = (UMListViewBase)ThirdControl.createControl(new UMListViewBase(context),ID_LISTVIEW
,"listview-divider-height","1"
,"bindfield","list"
,"height","fill"
,"childindicator","wgt_unselected"
,"cursoraction","cursorlistalias"
,"layout-type","linear"
,"background","#efeff4"
,"width","fill"
,"synccontext","list"
,"listview-divider-color","#c8c7cc"
);
context.createCursor("cursorlistalias", "list");
UMListBinder listView_binder = new UMListBinder((IUMContextAccessor)context);
listView_binder.setBindInfo(new BindInfo("list"));
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
public View getMainPanelView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
mainPanel = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_MAINPANEL
,"halign","center"
,"height","fill"
,"layout-type","linear"
,"width","fill"
);
View listView = (View) getListViewView((UMActivity)context,binderGroup,configure);
mainPanel.addView(listView);

return mainPanel;
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
View mainPanel = (View) getMainPanelView((UMActivity)context,binderGroup,configure);
basePanel.addView(mainPanel);

return basePanel;
}
public UMWindow getCurrentWindow(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
SearchSelected = (UMWindow)ThirdControl.createControl(new UMWindow(context),ID_SEARCHSELECTED
,"halign","center"
,"height","fill"
,"layout","vbox"
,"width","fill"
,"context","Search"
,"controller","EcmSearchSelectedController"
,"namespace","nc.bs.oa.oama.ecm"
);
View basePanel = (View) getBasePanelView((UMActivity)context,binderGroup,configure);
SearchSelected.addView(basePanel);

return (UMWindow)SearchSelected;
}

	
	public void actionOnDataLoad(View control, UMEventArgs args) {
    String actionid = "onDataLoad";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "onDataLoad",UMActivity.getViewId(control),args);
}
public void actionOnItemClick(View control, UMEventArgs args) {
    String actionid = "onItemClick";
    args.put("rowindex_arrayPath","list");
    args.put("rowindex","#{cursor.cursorlistalias.index}");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "onItemClick",UMActivity.getViewId(control),args);
}
public void actionOnReturnBtnClick(View control, UMEventArgs args) {
    String actionid = "onReturnBtnClick";
    args.put("resultcode","15");
    args.put("iskeep","false");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.close(args);
}
public void actionOnOkBtnClick(View control, UMEventArgs args) {
    String actionid = "onOkBtnClick";
    args.put("resultcode","15");
    args.put("iskeep","false");
    args.put("containerName","");
    args.put("returntype","close");
  ActionProcessor.exec(this, actionid, args);
UMView.close(args);
}


}
