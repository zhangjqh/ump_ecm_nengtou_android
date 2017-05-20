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

public abstract class Flow_WordContentActivity extends UMWindowActivity {

	protected UMWindow WordContent = null;
protected XVerticalLayout basePanel = null;
protected XHorizontalLayout navPanel = null;
protected XHorizontalLayout navigatorbar = null;
protected XHorizontalLayout leftPanel = null;
protected UMButton returnBtn = null;
protected XHorizontalLayout centerPanel = null;
protected UMLabel navLabel = null;
protected XHorizontalLayout rightPanel = null;
protected XVerticalLayout mainPanel = null;
protected XHorizontalLayout downOutPanel = null;
protected XHorizontalLayout downInnerPanel = null;
protected UMLabel downloadLabel = null;
protected UMButton downloadBtn = null;
protected UMWebView webView = null;

	
	protected final static int ID_WORDCONTENT = 1123508428;
protected final static int ID_BASEPANEL = 1738730877;
protected final static int ID_NAVPANEL = 1445239208;
protected final static int ID_NAVIGATORBAR = 2087387541;
protected final static int ID_LEFTPANEL = 1759790243;
protected final static int ID_RETURNBTN = 2096034802;
protected final static int ID_CENTERPANEL = 180825142;
protected final static int ID_NAVLABEL = 2056383518;
protected final static int ID_RIGHTPANEL = 1276188876;
protected final static int ID_MAINPANEL = 606298322;
protected final static int ID_DOWNOUTPANEL = 943145341;
protected final static int ID_DOWNINNERPANEL = 90396202;
protected final static int ID_DOWNLOADLABEL = 1517325352;
protected final static int ID_DOWNLOADBTN = 912335071;
protected final static int ID_WEBVIEW = 1837985950;

	
	
	@Override
	public String getControllerName() {
		return "WordContentController";
	}
	
	@Override
	public String getContextName() {
		return "ContentDetail";
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
		  idmap.put("WordContent",ID_WORDCONTENT);
  idmap.put("basePanel",ID_BASEPANEL);
  idmap.put("navPanel",ID_NAVPANEL);
  idmap.put("navigatorbar",ID_NAVIGATORBAR);
  idmap.put("leftPanel",ID_LEFTPANEL);
  idmap.put("returnBtn",ID_RETURNBTN);
  idmap.put("centerPanel",ID_CENTERPANEL);
  idmap.put("navLabel",ID_NAVLABEL);
  idmap.put("rightPanel",ID_RIGHTPANEL);
  idmap.put("mainPanel",ID_MAINPANEL);
  idmap.put("downOutPanel",ID_DOWNOUTPANEL);
  idmap.put("downInnerPanel",ID_DOWNINNERPANEL);
  idmap.put("downloadLabel",ID_DOWNLOADLABEL);
  idmap.put("downloadBtn",ID_DOWNLOADBTN);
  idmap.put("webView",ID_WEBVIEW);

	}
	
	public void onLoad() {
		ULog.logLC("onLoad", this);
		if(currentPage!=null) {
			currentPage.onLoad();
		}
	
		{ //basePanel - onDataLoad
    UMEventArgs args = new UMEventArgs(Flow_WordContentActivity.this);
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
    UMEventArgs args = new UMEventArgs(Flow_WordContentActivity.this);
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
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,navLabel,"content","#{res.flow_bodycontent}"));
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
,"width","fill"
,"valign","center"
);
View navigatorbar = (View) getNavigatorbarView((UMActivity)context,binderGroup,configure);
navPanel.addView(navigatorbar);

return navPanel;
}
public View getDownInnerPanelView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
downInnerPanel = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_DOWNINNERPANEL
,"padding-right","15"
,"padding-left","15"
,"height","fill"
,"layout-type","linear"
,"background","#efeff4"
,"width","fill"
,"valign","center"
);
downloadLabel = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_DOWNLOADLABEL
,"halign","left"
,"weight","1"
,"width","0"
,"height","fill"
,"color","#000000"
,"font-size","16"
,"layout-type","linear"
,"onclick",""
,"font-family","default"
,"valign","center"
,"readonly","true"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,downloadLabel,"content","#{res.flow_wordplaceholder}"));
downInnerPanel.addView(downloadLabel);
downloadBtn = (UMButton)ThirdControl.createControl(new UMButton(context),ID_DOWNLOADBTN
,"halign","right"
,"pressed-image","button_touch"
,"width","100"
,"background-image-dis","button"
,"font-pressed-color","#f2adb2"
,"height","fill"
,"color","#e50011"
,"layout-type","linear"
,"font-size","16"
,"onclick","onDownLoadClick"
,"font-family","default"
,"valign","center"
,"background-image","button"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,downloadBtn,"value","#{res.flow_origindownload}"));
downloadBtn.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Flow_WordContentActivity.this);
    actionOnDownLoadClick(downloadBtn,args);

}
});
downInnerPanel.addView(downloadBtn);

return downInnerPanel;
}
public View getDownOutPanelView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
downOutPanel = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_DOWNOUTPANEL
,"height","31"
,"layout-type","linear"
,"background","#c8c7cc"
,"width","fill"
,"valign","center"
,"padding-bottom","1"
);
View downInnerPanel = (View) getDownInnerPanelView((UMActivity)context,binderGroup,configure);
downOutPanel.addView(downInnerPanel);

return downOutPanel;
}
public View getMainPanelView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
mainPanel = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_MAINPANEL
,"halign","center"
,"height","fill"
,"layout-type","linear"
,"width","fill"
);
View downOutPanel = (View) getDownOutPanelView((UMActivity)context,binderGroup,configure);
mainPanel.addView(downOutPanel);
webView = (UMWebView)ThirdControl.createControl(new UMWebView(context),ID_WEBVIEW
,"halign","center"
,"height","fill"
,"layout","vbox"
,"width","fill"
,"zoomscale","default"
,"supportzoom","true"
);
mainPanel.addView(webView);

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
WordContent = (UMWindow)ThirdControl.createControl(new UMWindow(context),ID_WORDCONTENT
,"halign","center"
,"height","fill"
,"layout","vbox"
,"width","fill"
,"context","ContentDetail"
,"controller","WordContentController"
,"namespace","nc.bs.oa.oama.ecm"
);
View basePanel = (View) getBasePanelView((UMActivity)context,binderGroup,configure);
WordContent.addView(basePanel);

return (UMWindow)WordContent;
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
public void actionOnDownLoadClick(View control, UMEventArgs args) {
    args.put("downloadpath","#{id}");
  this.dataCollect();
    args.put("startposition","0");
    args.put("fileid","#{id}");
    args.put("downflag","1");
    args.put("row","#{CONTEXT}");
    String actionid = "onDownLoadClick";
    args.put("modulename","oapp");
    args.put("filesize","#{size}");
    args.put("filename","#{name}");
    args.put("filetype","#{type}");
    args.put("endposition","0");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMService.downloadFile(args);
}


}
