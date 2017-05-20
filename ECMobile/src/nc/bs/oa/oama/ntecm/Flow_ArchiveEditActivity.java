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

public abstract class Flow_ArchiveEditActivity extends UMWindowActivity {

	protected UMWindow ArchiveEdit = null;
protected XVerticalLayout basePanel = null;
protected XVerticalLayout navPanel = null;
protected XHorizontalLayout navigatorbar = null;
protected XHorizontalLayout leftPanel = null;
protected UMButton returnBtn = null;
protected XHorizontalLayout centerPanel = null;
protected UMLabel navLabel = null;
protected XVerticalLayout rightPanel = null;
protected XVerticalLayout mainPanel = null;
protected XVerticalLayout spaceOutPanel = null;
protected XHorizontalLayout spaceInnerPanel = null;
protected UMLabel folderLabel = null;
protected XHorizontalLayout folderPanel = null;
protected UMTextbox folderTxt = null;
protected UMLabel folderSpaceLabel = null;
protected UMImage imgBtn = null;
protected XVerticalLayout spaceOutPanel1 = null;
protected XHorizontalLayout spaceInnerPanel1 = null;
protected XHorizontalLayout autoPanel = null;
protected UMLabel autoLabel = null;
protected UMLabel autoSpaceLabel = null;
protected UMSwitch switchBtn = null;
protected XVerticalLayout spaceOutPanel2 = null;
protected XHorizontalLayout spaceInnerPanel2 = null;

	
	protected final static int ID_ARCHIVEEDIT = 523172570;
protected final static int ID_BASEPANEL = 732463418;
protected final static int ID_NAVPANEL = 1979838789;
protected final static int ID_NAVIGATORBAR = 647530089;
protected final static int ID_LEFTPANEL = 1633019522;
protected final static int ID_RETURNBTN = 1356086436;
protected final static int ID_CENTERPANEL = 1594670642;
protected final static int ID_NAVLABEL = 613101393;
protected final static int ID_RIGHTPANEL = 886934251;
protected final static int ID_MAINPANEL = 782832585;
protected final static int ID_SPACEOUTPANEL = 166493510;
protected final static int ID_SPACEINNERPANEL = 625411295;
protected final static int ID_FOLDERLABEL = 1026525834;
protected final static int ID_FOLDERPANEL = 1668776877;
protected final static int ID_FOLDERTXT = 1676185036;
protected final static int ID_FOLDERSPACELABEL = 179723697;
protected final static int ID_IMGBTN = 1492391832;
protected final static int ID_SPACEOUTPANEL1 = 2043537952;
protected final static int ID_SPACEINNERPANEL1 = 713421464;
protected final static int ID_AUTOPANEL = 552454740;
protected final static int ID_AUTOLABEL = 250096230;
protected final static int ID_AUTOSPACELABEL = 2008480130;
protected final static int ID_SWITCHBTN = 697592106;
protected final static int ID_SPACEOUTPANEL2 = 223966881;
protected final static int ID_SPACEINNERPANEL2 = 596364687;

	
	
	@Override
	public String getControllerName() {
		return "ArchiveEditController";
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
		  idmap.put("ArchiveEdit",ID_ARCHIVEEDIT);
  idmap.put("basePanel",ID_BASEPANEL);
  idmap.put("navPanel",ID_NAVPANEL);
  idmap.put("navigatorbar",ID_NAVIGATORBAR);
  idmap.put("leftPanel",ID_LEFTPANEL);
  idmap.put("returnBtn",ID_RETURNBTN);
  idmap.put("centerPanel",ID_CENTERPANEL);
  idmap.put("navLabel",ID_NAVLABEL);
  idmap.put("rightPanel",ID_RIGHTPANEL);
  idmap.put("mainPanel",ID_MAINPANEL);
  idmap.put("spaceOutPanel",ID_SPACEOUTPANEL);
  idmap.put("spaceInnerPanel",ID_SPACEINNERPANEL);
  idmap.put("folderLabel",ID_FOLDERLABEL);
  idmap.put("folderPanel",ID_FOLDERPANEL);
  idmap.put("folderTxt",ID_FOLDERTXT);
  idmap.put("folderSpaceLabel",ID_FOLDERSPACELABEL);
  idmap.put("imgBtn",ID_IMGBTN);
  idmap.put("spaceOutPanel1",ID_SPACEOUTPANEL1);
  idmap.put("spaceInnerPanel1",ID_SPACEINNERPANEL1);
  idmap.put("autoPanel",ID_AUTOPANEL);
  idmap.put("autoLabel",ID_AUTOLABEL);
  idmap.put("autoSpaceLabel",ID_AUTOSPACELABEL);
  idmap.put("switchBtn",ID_SWITCHBTN);
  idmap.put("spaceOutPanel2",ID_SPACEOUTPANEL2);
  idmap.put("spaceInnerPanel2",ID_SPACEINNERPANEL2);

	}
	
	public void onLoad() {
		ULog.logLC("onLoad", this);
		if(currentPage!=null) {
			currentPage.onLoad();
		}
	
		{ //basePanel - onDataLoad
    UMEventArgs args = new UMEventArgs(Flow_ArchiveEditActivity.this);
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
,"onclick","onReturnBtnClick"
,"valign","center"
);
leftPanel.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Flow_ArchiveEditActivity.this);
    actionOnReturnBtnClick(leftPanel,args);

}
});
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
,"background-image","btn_back.png"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,returnBtn,"value","#{res.ecm_back}"));
returnBtn.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Flow_ArchiveEditActivity.this);
    actionOnReturnBtnClick(returnBtn,args);

}
});
leftPanel.addView(returnBtn);

return leftPanel;
}
public View getCenterPanelView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
centerPanel = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_CENTERPANEL
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
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,navLabel,"content","#{res.flow_archivesetting}"));
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
public View getSpaceInnerPanelView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
spaceInnerPanel = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_SPACEINNERPANEL
,"padding-right","15"
,"padding-left","15"
,"height","fill"
,"layout-type","linear"
,"background","#efeff4"
,"width","fill"
,"valign","center"
);
folderLabel = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_FOLDERLABEL
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
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,folderLabel,"content","#{res.flow_archivefolder}"));
spaceInnerPanel.addView(folderLabel);

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
public View getFolderPanelView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
folderPanel = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_FOLDERPANEL
,"padding-left","15"
,"padding-right","15"
,"height","44"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"valign","center"
);
folderTxt = (UMTextbox)ThirdControl.createControl(new UMTextbox(context),ID_FOLDERTXT
,"bindfield","archiveset.folder"
,"padding-left","1"
,"weight","1"
,"pressed-image","textbox"
,"width","0"
,"background-image-dis","textbox"
,"height","26.0"
,"color","#000000"
,"layout-type","linear"
,"font-size","16"
,"font-family","default"
,"readonly","true"
,"background-image","textbox"
);
UMTextBinder folderTxt_binder = new UMTextBinder((IUMContextAccessor)context);
folderTxt_binder.setBindInfo(new BindInfo("archiveset.folder"));
folderTxt_binder.setControl(folderTxt);
binderGroup.addBinderToGroup(ID_FOLDERTXT, folderTxt_binder);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,folderTxt,"placeholder","#{res.flow_archiveplaceholder}"));
folderPanel.addView(folderTxt);
folderSpaceLabel = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_FOLDERSPACELABEL
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
folderPanel.addView(folderSpaceLabel);
imgBtn = (UMImage)ThirdControl.createControl(new UMImage(context),ID_IMGBTN
,"height","13"
,"layout-type","linear"
,"width","8"
,"scaletype","fitcenter"
,"src","ecm_arrow_right.png"
);
folderPanel.addView(imgBtn);

return folderPanel;
}
public View getSpaceOutPanel1View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
spaceOutPanel1 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_SPACEOUTPANEL1
,"padding-top","1"
,"halign","center"
,"height","22"
,"layout-type","linear"
,"background","#c8c7cc"
,"width","fill"
,"padding-bottom","1"
);
spaceInnerPanel1 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_SPACEINNERPANEL1
,"padding-right","15"
,"padding-left","15"
,"height","fill"
,"layout-type","linear"
,"background","#efeff4"
,"width","fill"
,"valign","center"
);
spaceOutPanel1.addView(spaceInnerPanel1);

return spaceOutPanel1;
}
public View getAutoPanelView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
autoPanel = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_AUTOPANEL
,"padding-right","15"
,"padding-left","15"
,"height","44"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"valign","center"
);
autoLabel = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_AUTOLABEL
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
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,autoLabel,"content","#{res.flow_isauto}"));
autoPanel.addView(autoLabel);
autoSpaceLabel = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_AUTOSPACELABEL
,"halign","right"
,"height","fill"
,"color","#8e8e93"
,"layout-type","linear"
,"font-size","16"
,"width","15"
,"font-family","default"
,"valign","center"
,"readonly","true"
);
autoPanel.addView(autoSpaceLabel);
switchBtn = (UMSwitch)ThirdControl.createControl(new UMSwitch(context),ID_SWITCHBTN
,"bindfield","archiveset.isauto"
,"padding-left","2"
,"pressed-image","slideswitch"
,"width","51"
,"background-image-dis","slideswitch"
,"switch-trackoff-image","switch_off"
,"height","32"
,"switch-trackon-image","slideswitch"
,"color","#e50011"
,"layout-type","linear"
,"font-size","16"
,"value","off"
,"font-family","default"
,"readonly","false"
,"background-image","slideswitch"
);
UMSwitchBinder switchBtn_binder = new UMSwitchBinder((IUMContextAccessor)context);
switchBtn_binder.setBindInfo(new BindInfo("archiveset.isauto"));
switchBtn_binder.setControl(switchBtn);
binderGroup.addBinderToGroup(ID_SWITCHBTN, switchBtn_binder);
autoPanel.addView(switchBtn);

return autoPanel;
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
spaceInnerPanel2 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_SPACEINNERPANEL2
,"padding-right","15"
,"padding-left","15"
,"height","fill"
,"layout-type","linear"
,"background","#efeff4"
,"width","fill"
,"valign","center"
);
spaceOutPanel2.addView(spaceInnerPanel2);

return spaceOutPanel2;
}
public View getMainPanelView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
mainPanel = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_MAINPANEL
,"halign","center"
,"height","fill"
,"layout-type","linear"
,"width","fill"
);
View spaceOutPanel = (View) getSpaceOutPanelView((UMActivity)context,binderGroup,configure);
mainPanel.addView(spaceOutPanel);
View folderPanel = (View) getFolderPanelView((UMActivity)context,binderGroup,configure);
mainPanel.addView(folderPanel);
View spaceOutPanel1 = (View) getSpaceOutPanel1View((UMActivity)context,binderGroup,configure);
mainPanel.addView(spaceOutPanel1);
View autoPanel = (View) getAutoPanelView((UMActivity)context,binderGroup,configure);
mainPanel.addView(autoPanel);
View spaceOutPanel2 = (View) getSpaceOutPanel2View((UMActivity)context,binderGroup,configure);
mainPanel.addView(spaceOutPanel2);

return mainPanel;
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
View mainPanel = (View) getMainPanelView((UMActivity)context,binderGroup,configure);
basePanel.addView(mainPanel);

return basePanel;
}
public UMWindow getCurrentWindow(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
ArchiveEdit = (UMWindow)ThirdControl.createControl(new UMWindow(context),ID_ARCHIVEEDIT
,"halign","center"
,"height","fill"
,"layout","vbox"
,"width","fill"
,"context","WorkDetail"
,"controller","ArchiveEditController"
,"namespace","nc.bs.oa.oama.ecm"
);
View basePanel = (View) getBasePanelView((UMActivity)context,binderGroup,configure);
ArchiveEdit.addView(basePanel);

return (UMWindow)ArchiveEdit;
}

	
	public void actionOnDataLoad(View control, UMEventArgs args) {
    String actionid = "onDataLoad";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "onDataLoad",UMActivity.getViewId(control),args);
}
public void actionOnReturnBtnClick(View control, UMEventArgs args) {
    String actionid = "onReturnBtnClick";
  this.dataCollect();
    args.put("archiveset","#{archiveset}");
    args.put("resultcode","15");
    args.put("iskeep","false");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.close(args);
}


}
