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

public abstract class Ecm_PersonInfoActivity extends UMWindowActivity {

	protected UMWindow PersonInfo = null;
protected XVerticalLayout basePanel = null;
protected XVerticalLayout navPanel = null;
protected XHorizontalLayout navigatorbar = null;
protected XHorizontalLayout leftPanel = null;
protected UMButton returnBtn = null;
protected XHorizontalLayout centerPanel = null;
protected UMLabel navLabel = null;
protected XHorizontalLayout rightPanel = null;
protected XHorizontalLayout widget0 = null;
protected XVerticalLayout widget0_addPanel = null;
protected XVerticalLayout widget0_menuOutPanel = null;
protected XHorizontalLayout widget0_phonePanel = null;
protected UMLabel widget0_newLabel = null;
protected XVerticalLayout widget0_menuInnerPanel = null;
protected XHorizontalLayout widget0_msgPanel = null;
protected UMLabel widget0_templateLabel = null;
protected XHorizontalLayout widget0_cancelPanel = null;
protected UMLabel widget0_cancelLabel = null;
protected XVerticalLayout scrollPanel = null;
protected UMScrollView Scrollview_mainPanel = null;
protected XVerticalLayout mainPanel = null;
protected XVerticalLayout spaceOutPanel = null;
protected XHorizontalLayout spaceInnerPanel = null;
protected UMLabel nameTxt = null;
protected XVerticalLayout infoPanel = null;
protected XVerticalLayout infoInnerPanel = null;
protected XHorizontalLayout mobilePanel = null;
protected UMLabel mobileLabel = null;
protected UMLabel mobileTxt = null;
protected XHorizontalLayout workPanel = null;
protected UMLabel workLabel = null;
protected UMLabel workTxt = null;
protected XHorizontalLayout homePanel = null;
protected UMLabel homeLabel = null;
protected UMLabel homeTxt = null;
protected XHorizontalLayout emailPanel = null;
protected UMLabel emailLabel = null;
protected UMLabel emailTxt = null;
protected XVerticalLayout spaceOutPanel1 = null;
protected XVerticalLayout spaceInnerPanel1 = null;

	
	protected final static int ID_PERSONINFO = 567573796;
protected final static int ID_BASEPANEL = 1545624843;
protected final static int ID_NAVPANEL = 1723528836;
protected final static int ID_NAVIGATORBAR = 2060508098;
protected final static int ID_LEFTPANEL = 487026620;
protected final static int ID_RETURNBTN = 983965261;
protected final static int ID_CENTERPANEL = 1784438863;
protected final static int ID_NAVLABEL = 1855807767;
protected final static int ID_RIGHTPANEL = 1254740759;
protected final static int ID_WIDGET0 = 805442510;
protected final static int ID_WIDGET0_ADDPANEL = 1737506552;
protected final static int ID_WIDGET0_MENUOUTPANEL = 71898911;
protected final static int ID_WIDGET0_PHONEPANEL = 1489801099;
protected final static int ID_WIDGET0_NEWLABEL = 1618584828;
protected final static int ID_WIDGET0_MENUINNERPANEL = 864749215;
protected final static int ID_WIDGET0_MSGPANEL = 1235478408;
protected final static int ID_WIDGET0_TEMPLATELABEL = 1638928061;
protected final static int ID_WIDGET0_CANCELPANEL = 1793440210;
protected final static int ID_WIDGET0_CANCELLABEL = 1647170025;
protected final static int ID_SCROLLPANEL = 1011708511;
protected final static int ID_SCROLLVIEW_MAINPANEL = 1076146772;
protected final static int ID_MAINPANEL = 441576155;
protected final static int ID_SPACEOUTPANEL = 2048447581;
protected final static int ID_SPACEINNERPANEL = 148606871;
protected final static int ID_NAMETXT = 924573526;
protected final static int ID_INFOPANEL = 1465510538;
protected final static int ID_INFOINNERPANEL = 450339430;
protected final static int ID_MOBILEPANEL = 2004512846;
protected final static int ID_MOBILELABEL = 293754914;
protected final static int ID_MOBILETXT = 1814278154;
protected final static int ID_WORKPANEL = 1545008887;
protected final static int ID_WORKLABEL = 2106662130;
protected final static int ID_WORKTXT = 1432527384;
protected final static int ID_HOMEPANEL = 1818468414;
protected final static int ID_HOMELABEL = 1370501999;
protected final static int ID_HOMETXT = 1506625645;
protected final static int ID_EMAILPANEL = 32007591;
protected final static int ID_EMAILLABEL = 2065670733;
protected final static int ID_EMAILTXT = 2071964254;
protected final static int ID_SPACEOUTPANEL1 = 962975665;
protected final static int ID_SPACEINNERPANEL1 = 2123571505;

	
	
	@Override
	public String getControllerName() {
		return "EcmPersonInfoController";
	}
	
	@Override
	public String getContextName() {
		return "PersonInfo";
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
		  idmap.put("PersonInfo",ID_PERSONINFO);
  idmap.put("basePanel",ID_BASEPANEL);
  idmap.put("navPanel",ID_NAVPANEL);
  idmap.put("navigatorbar",ID_NAVIGATORBAR);
  idmap.put("leftPanel",ID_LEFTPANEL);
  idmap.put("returnBtn",ID_RETURNBTN);
  idmap.put("centerPanel",ID_CENTERPANEL);
  idmap.put("navLabel",ID_NAVLABEL);
  idmap.put("rightPanel",ID_RIGHTPANEL);
  idmap.put("widget0",ID_WIDGET0);
  idmap.put("widget0_addPanel",ID_WIDGET0_ADDPANEL);
  idmap.put("widget0_menuOutPanel",ID_WIDGET0_MENUOUTPANEL);
  idmap.put("widget0_phonePanel",ID_WIDGET0_PHONEPANEL);
  idmap.put("widget0_newLabel",ID_WIDGET0_NEWLABEL);
  idmap.put("widget0_menuInnerPanel",ID_WIDGET0_MENUINNERPANEL);
  idmap.put("widget0_msgPanel",ID_WIDGET0_MSGPANEL);
  idmap.put("widget0_templateLabel",ID_WIDGET0_TEMPLATELABEL);
  idmap.put("widget0_cancelPanel",ID_WIDGET0_CANCELPANEL);
  idmap.put("widget0_cancelLabel",ID_WIDGET0_CANCELLABEL);
  idmap.put("scrollPanel",ID_SCROLLPANEL);
  idmap.put("Scrollview_mainPanel",ID_SCROLLVIEW_MAINPANEL);
  idmap.put("mainPanel",ID_MAINPANEL);
  idmap.put("spaceOutPanel",ID_SPACEOUTPANEL);
  idmap.put("spaceInnerPanel",ID_SPACEINNERPANEL);
  idmap.put("nameTxt",ID_NAMETXT);
  idmap.put("infoPanel",ID_INFOPANEL);
  idmap.put("infoInnerPanel",ID_INFOINNERPANEL);
  idmap.put("mobilePanel",ID_MOBILEPANEL);
  idmap.put("mobileLabel",ID_MOBILELABEL);
  idmap.put("mobileTxt",ID_MOBILETXT);
  idmap.put("workPanel",ID_WORKPANEL);
  idmap.put("workLabel",ID_WORKLABEL);
  idmap.put("workTxt",ID_WORKTXT);
  idmap.put("homePanel",ID_HOMEPANEL);
  idmap.put("homeLabel",ID_HOMELABEL);
  idmap.put("homeTxt",ID_HOMETXT);
  idmap.put("emailPanel",ID_EMAILPANEL);
  idmap.put("emailLabel",ID_EMAILLABEL);
  idmap.put("emailTxt",ID_EMAILTXT);
  idmap.put("spaceOutPanel1",ID_SPACEOUTPANEL1);
  idmap.put("spaceInnerPanel1",ID_SPACEINNERPANEL1);

	}
	
	public void onLoad() {
		ULog.logLC("onLoad", this);
		if(currentPage!=null) {
			currentPage.onLoad();
		}
	
		{ //basePanel - onDataLoad
    UMEventArgs args = new UMEventArgs(Ecm_PersonInfoActivity.this);
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
    UMEventArgs args = new UMEventArgs(Ecm_PersonInfoActivity.this);
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
,"bindfield",""
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
,"height","44"
,"color","#ffffff"
,"layout-type","linear"
,"font-size","18"
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
public View getWidget0_phonePanelView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
widget0_phonePanel = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_WIDGET0_PHONEPANEL
,"margin-right","16"
,"height","0"
,"weight","1"
,"layout-type","linear"
,"background","#f8f8f8"
,"width","fill"
,"margin-left","16"
,"onclick","onPhoneClick"
,"valign","center"
,"padding-bottom","4"
);
widget0_phonePanel.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Ecm_PersonInfoActivity.this);
    actionOnPhoneClick(widget0_phonePanel,args);

}
});
widget0_newLabel = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_WIDGET0_NEWLABEL
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
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,widget0_newLabel,"content","#{res.ecm_phonecall}"));
widget0_phonePanel.addView(widget0_newLabel);

return widget0_phonePanel;
}
public View getWidget0_msgPanelView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
widget0_msgPanel = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_WIDGET0_MSGPANEL
,"margin-right","16"
,"padding-top","4"
,"height","0"
,"weight","1"
,"layout-type","linear"
,"background","#f8f8f8"
,"width","fill"
,"margin-left","16"
,"onclick","onMsgClick"
,"valign","center"
);
widget0_msgPanel.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Ecm_PersonInfoActivity.this);
    actionOnMsgClick(widget0_msgPanel,args);

}
});
widget0_templateLabel = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_WIDGET0_TEMPLATELABEL
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
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,widget0_templateLabel,"content","#{res.ecm_sendmsg}"));
widget0_msgPanel.addView(widget0_templateLabel);

return widget0_msgPanel;
}
public View getWidget0_menuOutPanelView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
widget0_menuOutPanel = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_WIDGET0_MENUOUTPANEL
,"padding-top","4"
,"halign","center"
,"height","89"
,"layout-type","linear"
,"background","#f8f8f8"
,"width","fill"
,"panelstyle","round-div"
,"padding-bottom","4"
);
View widget0_phonePanel = (View) getWidget0_phonePanelView((UMActivity)context,binderGroup,configure);
widget0_menuOutPanel.addView(widget0_phonePanel);
widget0_menuInnerPanel = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_WIDGET0_MENUINNERPANEL
,"margin-right","1"
,"halign","center"
,"height","1"
,"layout-type","linear"
,"background","#c7c8cc"
,"width","fill"
,"margin-left","1"
);
widget0_menuOutPanel.addView(widget0_menuInnerPanel);
View widget0_msgPanel = (View) getWidget0_msgPanelView((UMActivity)context,binderGroup,configure);
widget0_menuOutPanel.addView(widget0_msgPanel);

return widget0_menuOutPanel;
}
public View getWidget0_cancelPanelView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
widget0_cancelPanel = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_WIDGET0_CANCELPANEL
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
widget0_cancelPanel.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Ecm_PersonInfoActivity.this);
    actionOnCancelBtnClick(widget0_cancelPanel,args);

}
});
widget0_cancelLabel = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_WIDGET0_CANCELLABEL
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
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,widget0_cancelLabel,"content","#{res.ecm_cancel}"));
widget0_cancelPanel.addView(widget0_cancelLabel);

return widget0_cancelPanel;
}
public View getWidget0_addPanelView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
widget0_addPanel = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_WIDGET0_ADDPANEL
,"padding-right","8"
,"padding-left","8"
,"padding-top","8"
,"halign","center"
,"height","157"
,"layout-type","linear"
,"width","fill"
);
View widget0_menuOutPanel = (View) getWidget0_menuOutPanelView((UMActivity)context,binderGroup,configure);
widget0_addPanel.addView(widget0_menuOutPanel);
View widget0_cancelPanel = (View) getWidget0_cancelPanelView((UMActivity)context,binderGroup,configure);
widget0_addPanel.addView(widget0_cancelPanel);

return widget0_addPanel;
}
public View getWidget0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
widget0 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_WIDGET0
,"height","fill"
,"pressed-image","oa_freeflow_menu_black.png"
,"layout-type","linear"
,"width","fill"
,"background-image-dis","oa_freeflow_menu_black.png"
,"onclick","onCancelBtnClick"
,"valign","bottom"
,"background-image","oa_freeflow_menu_black.png"
);
widget0.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Ecm_PersonInfoActivity.this);
    actionOnCancelBtnClick(widget0,args);

}
});
View widget0_addPanel = (View) getWidget0_addPanelView((UMActivity)context,binderGroup,configure);
widget0.addView(widget0_addPanel);

return widget0;
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
View widget0 = (View) getWidget0View((UMActivity)context,binderGroup,configure);
navPanel.addView(widget0);

return navPanel;
}
public View getSpaceInnerPanelView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
spaceInnerPanel = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_SPACEINNERPANEL
,"padding-right","15"
,"padding-left","15"
,"height","0"
,"weight","1"
,"layout-type","linear"
,"background","#efeff4"
,"width","fill"
,"valign","center"
);
nameTxt = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_NAMETXT
,"bindfield","name"
,"halign","left"
,"height","fill"
,"color","#727272"
,"layout-type","linear"
,"font-size","14"
,"width","fill"
,"font-family","default"
,"valign","center"
);
UMTextBinder nameTxt_binder = new UMTextBinder((IUMContextAccessor)context);
nameTxt_binder.setBindInfo(new BindInfo("name"));
nameTxt_binder.setControl(nameTxt);
binderGroup.addBinderToGroup(ID_NAMETXT, nameTxt_binder);
spaceInnerPanel.addView(nameTxt);

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
public View getMobilePanelView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
mobilePanel = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_MOBILEPANEL
,"padding-right","15"
,"height","44"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"onclick","onMobileClick"
,"valign","center"
);
mobilePanel.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Ecm_PersonInfoActivity.this);
    actionOnMobileClick(mobilePanel,args);

}
});
mobileLabel = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_MOBILELABEL
,"margin-right","10"
,"halign","left"
,"height","fill"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","80"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,mobileLabel,"content","#{res.ecm_mobile}"));
mobilePanel.addView(mobileLabel);
mobileTxt = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_MOBILETXT
,"bindfield","mobile"
,"halign","right"
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
UMTextBinder mobileTxt_binder = new UMTextBinder((IUMContextAccessor)context);
mobileTxt_binder.setBindInfo(new BindInfo("mobile"));
mobileTxt_binder.setControl(mobileTxt);
binderGroup.addBinderToGroup(ID_MOBILETXT, mobileTxt_binder);
mobilePanel.addView(mobileTxt);

return mobilePanel;
}
public View getWorkPanelView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
workPanel = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_WORKPANEL
,"padding-right","15"
,"height","44"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"onclick","onWorkClick"
,"margin-top","1"
,"valign","center"
);
workPanel.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Ecm_PersonInfoActivity.this);
    actionOnWorkClick(workPanel,args);

}
});
workLabel = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_WORKLABEL
,"margin-right","10"
,"halign","left"
,"height","fill"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","80"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,workLabel,"content","#{res.ecm_workphone}"));
workPanel.addView(workLabel);
workTxt = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_WORKTXT
,"bindfield","work"
,"halign","right"
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
UMTextBinder workTxt_binder = new UMTextBinder((IUMContextAccessor)context);
workTxt_binder.setBindInfo(new BindInfo("work"));
workTxt_binder.setControl(workTxt);
binderGroup.addBinderToGroup(ID_WORKTXT, workTxt_binder);
workPanel.addView(workTxt);

return workPanel;
}
public View getHomePanelView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
homePanel = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_HOMEPANEL
,"padding-right","15"
,"height","44"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"onclick","onHomeClick"
,"margin-top","1"
,"valign","center"
);
homePanel.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Ecm_PersonInfoActivity.this);
    actionOnHomeClick(homePanel,args);

}
});
homeLabel = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_HOMELABEL
,"margin-right","10"
,"halign","left"
,"height","fill"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","80"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,homeLabel,"content","#{res.ecm_homephone}"));
homePanel.addView(homeLabel);
homeTxt = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_HOMETXT
,"bindfield","home"
,"halign","right"
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
UMTextBinder homeTxt_binder = new UMTextBinder((IUMContextAccessor)context);
homeTxt_binder.setBindInfo(new BindInfo("home"));
homeTxt_binder.setControl(homeTxt);
binderGroup.addBinderToGroup(ID_HOMETXT, homeTxt_binder);
homePanel.addView(homeTxt);

return homePanel;
}
public View getEmailPanelView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
emailPanel = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_EMAILPANEL
,"padding-right","15"
,"height","44"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"onclick","onEmailClick"
,"margin-top","1"
,"valign","center"
);
emailPanel.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Ecm_PersonInfoActivity.this);
    actionOnEmailClick(emailPanel,args);

}
});
emailLabel = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_EMAILLABEL
,"margin-right","10"
,"halign","left"
,"height","fill"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","80"
,"onclick",""
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,emailLabel,"content","#{res.ecm_email}"));
emailPanel.addView(emailLabel);
emailTxt = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_EMAILTXT
,"bindfield","email"
,"halign","right"
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
UMTextBinder emailTxt_binder = new UMTextBinder((IUMContextAccessor)context);
emailTxt_binder.setBindInfo(new BindInfo("email"));
emailTxt_binder.setControl(emailTxt);
binderGroup.addBinderToGroup(ID_EMAILTXT, emailTxt_binder);
emailPanel.addView(emailTxt);

return emailPanel;
}
public View getInfoInnerPanelView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
infoInnerPanel = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_INFOINNERPANEL
,"halign","center"
,"height","fill"
,"layout-type","linear"
,"background","#c8c7cc"
,"width","fill"
);
View mobilePanel = (View) getMobilePanelView((UMActivity)context,binderGroup,configure);
infoInnerPanel.addView(mobilePanel);
View workPanel = (View) getWorkPanelView((UMActivity)context,binderGroup,configure);
infoInnerPanel.addView(workPanel);
View homePanel = (View) getHomePanelView((UMActivity)context,binderGroup,configure);
infoInnerPanel.addView(homePanel);
View emailPanel = (View) getEmailPanelView((UMActivity)context,binderGroup,configure);
infoInnerPanel.addView(emailPanel);

return infoInnerPanel;
}
public View getInfoPanelView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
infoPanel = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_INFOPANEL
,"padding-left","15"
,"halign","center"
,"height","179"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
);
View infoInnerPanel = (View) getInfoInnerPanelView((UMActivity)context,binderGroup,configure);
infoPanel.addView(infoInnerPanel);

return infoPanel;
}
public View getSpaceOutPanel1View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
spaceOutPanel1 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_SPACEOUTPANEL1
,"padding-top","1"
,"halign","center"
,"height","21"
,"layout-type","linear"
,"background","#c8c7cc"
,"width","fill"
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
public View getMainPanelView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
mainPanel = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_MAINPANEL
,"halign","center"
,"height","wrap"
,"layout-type","linear"
,"width","fill"
);
View spaceOutPanel = (View) getSpaceOutPanelView((UMActivity)context,binderGroup,configure);
mainPanel.addView(spaceOutPanel);
View infoPanel = (View) getInfoPanelView((UMActivity)context,binderGroup,configure);
mainPanel.addView(infoPanel);
View spaceOutPanel1 = (View) getSpaceOutPanel1View((UMActivity)context,binderGroup,configure);
mainPanel.addView(spaceOutPanel1);

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
);
View navPanel = (View) getNavPanelView((UMActivity)context,binderGroup,configure);
basePanel.addView(navPanel);
View scrollPanel = (View) getScrollPanelView((UMActivity)context,binderGroup,configure);
basePanel.addView(scrollPanel);

return basePanel;
}
public UMWindow getCurrentWindow(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
PersonInfo = (UMWindow)ThirdControl.createControl(new UMWindow(context),ID_PERSONINFO
,"halign","center"
,"height","fill"
,"layout","vbox"
,"width","fill"
,"context","PersonInfo"
,"controller","EcmPersonInfoController"
,"namespace","nc.bs.oa.oama.ecm"
);
View basePanel = (View) getBasePanelView((UMActivity)context,binderGroup,configure);
PersonInfo.addView(basePanel);

return (UMWindow)PersonInfo;
}

	
	public void actionPhoneCallback(View control, UMEventArgs args) {
    String actionid = "phoneCallback";
    args.put("tel","#{mobile}");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMDevice.callPhone(args);
}
public void actionOnCancelBtnClick(View control, UMEventArgs args) {
    String actionid = "onCancelBtnClick";
    args.put("viewid","widget0");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.closePop(args);
}
public void actionOnMsgClick(View control, UMEventArgs args) {
    String actionid = "onMsgClick";
    args.put("viewid","widget0");
    args.put("callback","msgCallback");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.closePop(args);
}
public void actionMsgCallback(View control, UMEventArgs args) {
    String actionid = "msgCallback";
    args.put("message","#{res.ecm_msgfromapp}");
    args.put("receive","#{mobile}");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMDevice.sendMessage(args);
}
public void actionOnWorkClick(View control, UMEventArgs args) {
    String actionid = "onWorkClick";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "onWorkClick",UMActivity.getViewId(control),args);
}
public void actionOnEmailClick(View control, UMEventArgs args) {
    String actionid = "onEmailClick";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "onEmailClick",UMActivity.getViewId(control),args);
}
public void actionAfterMobileClick(View control, UMEventArgs args) {
    String actionid = "afterMobileClick";
    args.put("popwidth","fill");
    args.put("single","true");
    args.put("isTouch","false");
    args.put("viewid","widget0");
    args.put("containerName","");
    args.put("popgravity","popcenter");
    args.put("popheight","fill");
  ActionProcessor.exec(this, actionid, args);
UMView.openPop(args);
}
public void actionOnDataLoad(View control, UMEventArgs args) {
    String actionid = "onDataLoad";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "onDataLoad",UMActivity.getViewId(control),args);
}
public void actionOnReturnBtnClick(View control, UMEventArgs args) {
    String actionid = "onReturnBtnClick";
    args.put("resultcode","15");
    args.put("iskeep","false");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.close(args);
}
public void actionOnHomeClick(View control, UMEventArgs args) {
    String actionid = "onHomeClick";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "onHomeClick",UMActivity.getViewId(control),args);
}
public void actionOnPhoneClick(View control, UMEventArgs args) {
    String actionid = "onPhoneClick";
    args.put("viewid","widget0");
    args.put("callback","phoneCallback");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.closePop(args);
}
public void actionOnMobileClick(View control, UMEventArgs args) {
    String actionid = "onMobileClick";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "onMobileClick",UMActivity.getViewId(control),args);
}


}
