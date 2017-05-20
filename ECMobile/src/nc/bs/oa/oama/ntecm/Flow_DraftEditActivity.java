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

public abstract class Flow_DraftEditActivity extends UMWindowActivity {

	protected UMWindow DraftEdit = null;
protected XVerticalLayout basePanel = null;
protected XVerticalLayout navPanel = null;
protected XHorizontalLayout navigatorbar = null;
protected XVerticalLayout leftPanel = null;
protected UMButton cancelBtn = null;
protected XHorizontalLayout centerPanel = null;
protected UMLabel navLabel = null;
protected XVerticalLayout rightPanel = null;
protected UMButton submitBtn = null;
protected XVerticalLayout scrollPanel = null;
protected UMScrollView Scrollview_mainPanel = null;
protected XVerticalLayout mainPanel = null;
protected XVerticalLayout spaceOutPanel = null;
protected XVerticalLayout spaceInnerPanel = null;
protected XVerticalLayout workPanel = null;
protected XVerticalLayout workInnerPanel = null;
protected XHorizontalLayout titlePanel = null;
protected UMTextbox titleTxt = null;
protected XHorizontalLayout priorityPanel = null;
protected UMLabel priorityLabel = null;
protected XVerticalLayout buttonPanel = null;
protected UMToggleButtonGroup priorityGroup = null;
protected UMToggleButton common = null;
protected UMToggleButton important = null;
protected XVerticalLayout spaceOutPanel1 = null;
protected XHorizontalLayout spaceInnerPanel1 = null;
protected UMLabel contentLabel = null;
protected XHorizontalLayout contentPanel = null;
protected UMTextArea contentArea = null;
protected XVerticalLayout spaceOutPanel2 = null;
protected XVerticalLayout spaceInnerPanel2 = null;
protected XHorizontalLayout flowPanel = null;
protected UMLabel flowLabel = null;
protected UMLabel flowInfoLabel = null;
protected UMLabel flowSpaceLabel = null;
protected UMImage flowImg = null;
protected XVerticalLayout spaceOutPanel3 = null;
protected XVerticalLayout spaceInnerPanel3 = null;
protected XHorizontalLayout attachmentPanel = null;
protected UMLabel attachmentLabel = null;
protected UMLabel attachmentInfoLabel = null;
protected UMLabel attachmentSpaceLabel = null;
protected UMImage attachmentImg = null;
protected XVerticalLayout spaceOutPanel4 = null;
protected XVerticalLayout spaceInnerPanel4 = null;
protected XVerticalLayout toolPanel = null;
protected XVerticalLayout toolbar = null;
protected XVerticalLayout draftPanel = null;
protected UMButton draftBtn = null;

	
	protected final static int ID_DRAFTEDIT = 434398660;
protected final static int ID_BASEPANEL = 967302831;
protected final static int ID_NAVPANEL = 376145554;
protected final static int ID_NAVIGATORBAR = 296263612;
protected final static int ID_LEFTPANEL = 114582800;
protected final static int ID_CANCELBTN = 304428952;
protected final static int ID_CENTERPANEL = 1512583923;
protected final static int ID_NAVLABEL = 1764204683;
protected final static int ID_RIGHTPANEL = 438524405;
protected final static int ID_SUBMITBTN = 1142342162;
protected final static int ID_SCROLLPANEL = 709751929;
protected final static int ID_SCROLLVIEW_MAINPANEL = 1429756083;
protected final static int ID_MAINPANEL = 1304741034;
protected final static int ID_SPACEOUTPANEL = 973743768;
protected final static int ID_SPACEINNERPANEL = 1490790619;
protected final static int ID_WORKPANEL = 736630043;
protected final static int ID_WORKINNERPANEL = 2091612978;
protected final static int ID_TITLEPANEL = 1261994955;
protected final static int ID_TITLETXT = 1642358815;
protected final static int ID_PRIORITYPANEL = 2028728905;
protected final static int ID_PRIORITYLABEL = 1466340195;
protected final static int ID_BUTTONPANEL = 248310667;
protected final static int ID_PRIORITYGROUP = 822077202;
protected final static int ID_COMMON = 1669928159;
protected final static int ID_IMPORTANT = 117991733;
protected final static int ID_SPACEOUTPANEL1 = 1885637648;
protected final static int ID_SPACEINNERPANEL1 = 216579036;
protected final static int ID_CONTENTLABEL = 557187569;
protected final static int ID_CONTENTPANEL = 755820750;
protected final static int ID_CONTENTAREA = 1261330753;
protected final static int ID_SPACEOUTPANEL2 = 474092526;
protected final static int ID_SPACEINNERPANEL2 = 1677382100;
protected final static int ID_FLOWPANEL = 1912685979;
protected final static int ID_FLOWLABEL = 1478879384;
protected final static int ID_FLOWINFOLABEL = 112374747;
protected final static int ID_FLOWSPACELABEL = 1034881936;
protected final static int ID_FLOWIMG = 813750608;
protected final static int ID_SPACEOUTPANEL3 = 706047100;
protected final static int ID_SPACEINNERPANEL3 = 1424879292;
protected final static int ID_ATTACHMENTPANEL = 2072068018;
protected final static int ID_ATTACHMENTLABEL = 535629499;
protected final static int ID_ATTACHMENTINFOLABEL = 1936676091;
protected final static int ID_ATTACHMENTSPACELABEL = 601698715;
protected final static int ID_ATTACHMENTIMG = 1929739581;
protected final static int ID_SPACEOUTPANEL4 = 905291370;
protected final static int ID_SPACEINNERPANEL4 = 842990286;
protected final static int ID_TOOLPANEL = 1642508138;
protected final static int ID_TOOLBAR = 1243488686;
protected final static int ID_DRAFTPANEL = 728187521;
protected final static int ID_DRAFTBTN = 823009838;

	
	
	@Override
	public String getControllerName() {
		return "DraftEditController";
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
		  idmap.put("DraftEdit",ID_DRAFTEDIT);
  idmap.put("basePanel",ID_BASEPANEL);
  idmap.put("navPanel",ID_NAVPANEL);
  idmap.put("navigatorbar",ID_NAVIGATORBAR);
  idmap.put("leftPanel",ID_LEFTPANEL);
  idmap.put("cancelBtn",ID_CANCELBTN);
  idmap.put("centerPanel",ID_CENTERPANEL);
  idmap.put("navLabel",ID_NAVLABEL);
  idmap.put("rightPanel",ID_RIGHTPANEL);
  idmap.put("submitBtn",ID_SUBMITBTN);
  idmap.put("scrollPanel",ID_SCROLLPANEL);
  idmap.put("Scrollview_mainPanel",ID_SCROLLVIEW_MAINPANEL);
  idmap.put("mainPanel",ID_MAINPANEL);
  idmap.put("spaceOutPanel",ID_SPACEOUTPANEL);
  idmap.put("spaceInnerPanel",ID_SPACEINNERPANEL);
  idmap.put("workPanel",ID_WORKPANEL);
  idmap.put("workInnerPanel",ID_WORKINNERPANEL);
  idmap.put("titlePanel",ID_TITLEPANEL);
  idmap.put("titleTxt",ID_TITLETXT);
  idmap.put("priorityPanel",ID_PRIORITYPANEL);
  idmap.put("priorityLabel",ID_PRIORITYLABEL);
  idmap.put("buttonPanel",ID_BUTTONPANEL);
  idmap.put("priorityGroup",ID_PRIORITYGROUP);
  idmap.put("common",ID_COMMON);
  idmap.put("important",ID_IMPORTANT);
  idmap.put("spaceOutPanel1",ID_SPACEOUTPANEL1);
  idmap.put("spaceInnerPanel1",ID_SPACEINNERPANEL1);
  idmap.put("contentLabel",ID_CONTENTLABEL);
  idmap.put("contentPanel",ID_CONTENTPANEL);
  idmap.put("contentArea",ID_CONTENTAREA);
  idmap.put("spaceOutPanel2",ID_SPACEOUTPANEL2);
  idmap.put("spaceInnerPanel2",ID_SPACEINNERPANEL2);
  idmap.put("flowPanel",ID_FLOWPANEL);
  idmap.put("flowLabel",ID_FLOWLABEL);
  idmap.put("flowInfoLabel",ID_FLOWINFOLABEL);
  idmap.put("flowSpaceLabel",ID_FLOWSPACELABEL);
  idmap.put("flowImg",ID_FLOWIMG);
  idmap.put("spaceOutPanel3",ID_SPACEOUTPANEL3);
  idmap.put("spaceInnerPanel3",ID_SPACEINNERPANEL3);
  idmap.put("attachmentPanel",ID_ATTACHMENTPANEL);
  idmap.put("attachmentLabel",ID_ATTACHMENTLABEL);
  idmap.put("attachmentInfoLabel",ID_ATTACHMENTINFOLABEL);
  idmap.put("attachmentSpaceLabel",ID_ATTACHMENTSPACELABEL);
  idmap.put("attachmentImg",ID_ATTACHMENTIMG);
  idmap.put("spaceOutPanel4",ID_SPACEOUTPANEL4);
  idmap.put("spaceInnerPanel4",ID_SPACEINNERPANEL4);
  idmap.put("toolPanel",ID_TOOLPANEL);
  idmap.put("toolbar",ID_TOOLBAR);
  idmap.put("draftPanel",ID_DRAFTPANEL);
  idmap.put("draftBtn",ID_DRAFTBTN);

	}
	
	public void onLoad() {
		ULog.logLC("onLoad", this);
		if(currentPage!=null) {
			currentPage.onLoad();
		}
	
		{ //basePanel - onDataLoad
    UMEventArgs args = new UMEventArgs(Flow_DraftEditActivity.this);
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
leftPanel = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_LEFTPANEL
,"halign","left"
,"height","fill"
,"layout-type","linear"
,"width","88"
);
cancelBtn = (UMButton)ThirdControl.createControl(new UMButton(context),ID_CANCELBTN
,"halign","left"
,"pressed-image","button_touch"
,"width","fill"
,"background-image-dis","button"
,"font-pressed-color","#f2adb2"
,"height","44"
,"color","#e50011"
,"layout-type","linear"
,"font-size","17"
,"onclick","onCancelBtnClick"
,"font-family","default"
,"valign","center"
,"background-image","button"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,cancelBtn,"value","#{res.flow_cancel}"));
cancelBtn.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Flow_DraftEditActivity.this);
    actionOnCancelBtnClick(cancelBtn,args);

}
});
leftPanel.addView(cancelBtn);

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
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,navLabel,"content","#{res.flow_collaborationdraft}"));
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
submitBtn = (UMButton)ThirdControl.createControl(new UMButton(context),ID_SUBMITBTN
,"halign","right"
,"pressed-image","button_touch"
,"width","fill"
,"background-image-dis","button"
,"font-pressed-color","#f2adb2"
,"height","44"
,"color","#e50011"
,"layout-type","linear"
,"font-size","17"
,"onclick","onSubmitBtnClick"
,"font-family","default"
,"valign","center"
,"background-image","button"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,submitBtn,"value","#{res.flow_submit}"));
submitBtn.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Flow_DraftEditActivity.this);
    actionOnSubmitBtnClick(submitBtn,args);

}
});
rightPanel.addView(submitBtn);

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
,"background","#E6E6E6"
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
public View getTitlePanelView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
titlePanel = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_TITLEPANEL
,"padding-right","15"
,"height","0"
,"weight","1"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"valign","center"
);
titleTxt = (UMTextbox)ThirdControl.createControl(new UMTextbox(context),ID_TITLETXT
,"bindfield","title"
,"halign","LEFT"
,"height","44"
,"color","#000000"
,"layout-type","linear"
,"font-size","16"
,"width","fill"
,"font-family","default"
,"readonly","false"
);
UMTextBinder titleTxt_binder = new UMTextBinder((IUMContextAccessor)context);
titleTxt_binder.setBindInfo(new BindInfo("title"));
titleTxt_binder.setControl(titleTxt);
binderGroup.addBinderToGroup(ID_TITLETXT, titleTxt_binder);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,titleTxt,"placeholder","#{res.flow_titleplaceholder}"));
titlePanel.addView(titleTxt);

return titlePanel;
}
public View getPriorityGroupView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
priorityGroup = (UMToggleButtonGroup)ThirdControl.createControl(new UMToggleButtonGroup(context),ID_PRIORITYGROUP
,"bindfield","priority"
,"height","30"
,"layout","hbox"
,"width","150"
,"value","buttongroup"
,"valign","center"
);
UMToggleButtonGroupBinder priorityGroup_binder = new UMToggleButtonGroupBinder((IUMContextAccessor)context);
priorityGroup_binder.setBindInfo(new BindInfo("priority"));
priorityGroup_binder.setControl(priorityGroup);
binderGroup.addBinderToGroup(ID_PRIORITYGROUP, priorityGroup_binder);
common = (UMToggleButton)ThirdControl.createControl(new UMToggleButton(context),ID_COMMON
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
,"value","1"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,common,"textOff","#{res.flow_common}"));
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,common,"textOn","#{res.flow_common}"));
priorityGroup.addView(common);
important = (UMToggleButton)ThirdControl.createControl(new UMToggleButton(context),ID_IMPORTANT
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
,"value","2"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,important,"textOff","#{res.flow_important}"));
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,important,"textOn","#{res.flow_important}"));
priorityGroup.addView(important);

return priorityGroup;
}
public View getButtonPanelView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
buttonPanel = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_BUTTONPANEL
,"padding-right","15"
,"halign","right"
,"height","25"
,"weight","1"
,"layout-type","linear"
,"width","0"
);
View priorityGroup = (View) getPriorityGroupView((UMActivity)context,binderGroup,configure);
buttonPanel.addView(priorityGroup);

return buttonPanel;
}
public View getPriorityPanelView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
priorityPanel = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PRIORITYPANEL
,"height","44"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"margin-top","1"
,"valign","center"
);
priorityLabel = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_PRIORITYLABEL
,"halign","left"
,"height","fill"
,"color","#000000"
,"layout-type","linear"
,"font-size","16"
,"width","80"
,"font-family","default"
,"valign","center"
,"readonly","true"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,priorityLabel,"content","#{res.flow_priority}"));
priorityPanel.addView(priorityLabel);
View buttonPanel = (View) getButtonPanelView((UMActivity)context,binderGroup,configure);
priorityPanel.addView(buttonPanel);

return priorityPanel;
}
public View getWorkInnerPanelView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
workInnerPanel = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_WORKINNERPANEL
,"halign","center"
,"height","fill"
,"layout-type","linear"
,"background","#c8c7cc"
,"width","fill"
);
View titlePanel = (View) getTitlePanelView((UMActivity)context,binderGroup,configure);
workInnerPanel.addView(titlePanel);
View priorityPanel = (View) getPriorityPanelView((UMActivity)context,binderGroup,configure);
workInnerPanel.addView(priorityPanel);

return workInnerPanel;
}
public View getWorkPanelView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
workPanel = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_WORKPANEL
,"padding-left","15"
,"halign","center"
,"height","89"
,"layout-type","linear"
,"background","#FFFFFF"
,"width","fill"
);
View workInnerPanel = (View) getWorkInnerPanelView((UMActivity)context,binderGroup,configure);
workPanel.addView(workInnerPanel);

return workPanel;
}
public View getSpaceInnerPanel1View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
spaceInnerPanel1 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_SPACEINNERPANEL1
,"padding-right","15"
,"padding-left","15"
,"height","0"
,"weight","1"
,"layout-type","linear"
,"background","#efeff4"
,"width","fill"
,"valign","center"
);
contentLabel = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_CONTENTLABEL
,"halign","left"
,"height","30"
,"color","#727272"
,"layout-type","linear"
,"font-size","14"
,"width","fill"
,"font-family","default"
,"valign","center"
,"readonly","true"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,contentLabel,"content","#{res.flow_body}"));
spaceInnerPanel1.addView(contentLabel);

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
public View getContentPanelView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
contentPanel = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_CONTENTPANEL
,"padding-left","15"
,"padding-right","15"
,"height","80"
,"layout-type","linear"
,"background","#FFFFFF"
,"width","fill"
,"valign","center"
);
contentArea = (UMTextArea)ThirdControl.createControl(new UMTextArea(context),ID_CONTENTAREA
,"bindfield","textcontent"
,"height","fill"
,"weight","1"
,"color","#000000"
,"layout-type","linear"
,"font-size","16"
,"width","0"
,"font-family","default"
,"readonly","false"
);
UMTextBinder contentArea_binder = new UMTextBinder((IUMContextAccessor)context);
contentArea_binder.setBindInfo(new BindInfo("textcontent"));
contentArea_binder.setControl(contentArea);
binderGroup.addBinderToGroup(ID_CONTENTAREA, contentArea_binder);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,contentArea,"placeholder","#{res.flow_bodyplaceholder}"));
contentPanel.addView(contentArea);

return contentPanel;
}
public View getSpaceOutPanel2View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
spaceOutPanel2 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_SPACEOUTPANEL2
,"padding-top","1"
,"halign","center"
,"height","22"
,"layout-type","linear"
,"background","#c8c7cc"
,"width","fill"
,"padding-bottom","1"
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
public View getFlowPanelView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
flowPanel = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_FLOWPANEL
,"padding-left","15"
,"padding-right","15"
,"height","44"
,"layout-type","linear"
,"background","#FFFFFF"
,"width","fill"
,"onclick","onFlowClick"
,"valign","center"
);
flowPanel.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Flow_DraftEditActivity.this);
    actionOnFlowClick(flowPanel,args);

}
});
flowLabel = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_FLOWLABEL
,"bindfield",""
,"halign","left"
,"weight","1"
,"width","0"
,"height","fill"
,"color","#000000"
,"font-size","16"
,"layout-type","linear"
,"font-family","default"
,"valign","center"
,"readonly","true"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,flowLabel,"content","#{res.flow_processsetup}"));
flowPanel.addView(flowLabel);
flowInfoLabel = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_FLOWINFOLABEL
,"halign","right"
,"height","fill"
,"color","#8e8e93"
,"layout-type","linear"
,"font-size","16"
,"width","40"
,"font-family","default"
,"valign","center"
,"readonly","true"
);
flowPanel.addView(flowInfoLabel);
flowSpaceLabel = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_FLOWSPACELABEL
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
flowPanel.addView(flowSpaceLabel);
flowImg = (UMImage)ThirdControl.createControl(new UMImage(context),ID_FLOWIMG
,"height","13"
,"layout-type","linear"
,"width","8"
,"scaletype","fitcenter"
,"src","ecm_arrow_right.png"
);
flowPanel.addView(flowImg);

return flowPanel;
}
public View getSpaceOutPanel3View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
spaceOutPanel3 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_SPACEOUTPANEL3
,"padding-top","1"
,"halign","center"
,"height","22"
,"layout-type","linear"
,"background","#c8c7cc"
,"width","fill"
,"padding-bottom","1"
);
spaceInnerPanel3 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_SPACEINNERPANEL3
,"halign","center"
,"height","0"
,"weight","1"
,"layout-type","linear"
,"background","#efeff4"
,"width","fill"
);
spaceOutPanel3.addView(spaceInnerPanel3);

return spaceOutPanel3;
}
public View getAttachmentPanelView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
attachmentPanel = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_ATTACHMENTPANEL
,"padding-right","15"
,"padding-left","15"
,"height","44"
,"layout-type","linear"
,"background","#FFFFFF"
,"width","fill"
,"onclick","onAttachmentClick"
,"valign","center"
);
attachmentPanel.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Flow_DraftEditActivity.this);
    actionOnAttachmentClick(attachmentPanel,args);

}
});
attachmentLabel = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_ATTACHMENTLABEL
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
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,attachmentLabel,"content","#{res.flow_attachmentlist}"));
attachmentPanel.addView(attachmentLabel);
attachmentInfoLabel = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_ATTACHMENTINFOLABEL
,"halign","right"
,"height","fill"
,"color","#8e8e93"
,"layout-type","linear"
,"font-size","16"
,"width","40"
,"font-family","default"
,"valign","center"
,"readonly","true"
);
attachmentPanel.addView(attachmentInfoLabel);
attachmentSpaceLabel = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_ATTACHMENTSPACELABEL
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
attachmentPanel.addView(attachmentSpaceLabel);
attachmentImg = (UMImage)ThirdControl.createControl(new UMImage(context),ID_ATTACHMENTIMG
,"height","13"
,"layout-type","linear"
,"width","8"
,"scaletype","fitcenter"
,"src","ecm_arrow_right.png"
);
attachmentPanel.addView(attachmentImg);

return attachmentPanel;
}
public View getSpaceOutPanel4View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
spaceOutPanel4 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_SPACEOUTPANEL4
,"padding-top","1"
,"halign","center"
,"height","21"
,"layout-type","linear"
,"background","#c8c7cc"
,"width","fill"
);
spaceInnerPanel4 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_SPACEINNERPANEL4
,"halign","center"
,"height","0"
,"weight","1"
,"layout-type","linear"
,"background","#efeff4"
,"width","fill"
);
spaceOutPanel4.addView(spaceInnerPanel4);

return spaceOutPanel4;
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
View workPanel = (View) getWorkPanelView((UMActivity)context,binderGroup,configure);
mainPanel.addView(workPanel);
View spaceOutPanel1 = (View) getSpaceOutPanel1View((UMActivity)context,binderGroup,configure);
mainPanel.addView(spaceOutPanel1);
View contentPanel = (View) getContentPanelView((UMActivity)context,binderGroup,configure);
mainPanel.addView(contentPanel);
View spaceOutPanel2 = (View) getSpaceOutPanel2View((UMActivity)context,binderGroup,configure);
mainPanel.addView(spaceOutPanel2);
View flowPanel = (View) getFlowPanelView((UMActivity)context,binderGroup,configure);
mainPanel.addView(flowPanel);
View spaceOutPanel3 = (View) getSpaceOutPanel3View((UMActivity)context,binderGroup,configure);
mainPanel.addView(spaceOutPanel3);
View attachmentPanel = (View) getAttachmentPanelView((UMActivity)context,binderGroup,configure);
mainPanel.addView(attachmentPanel);
View spaceOutPanel4 = (View) getSpaceOutPanel4View((UMActivity)context,binderGroup,configure);
mainPanel.addView(spaceOutPanel4);

return mainPanel;
}
public View getScrollview_mainPanelView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
Scrollview_mainPanel = (UMScrollView)ThirdControl.createControl(new UMScrollView(context),ID_SCROLLVIEW_MAINPANEL
,"intercepttouch","false"
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
public View getDraftPanelView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
draftPanel = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_DRAFTPANEL
,"halign","center"
,"height","fill"
,"layout-type","linear"
,"width","88"
);
draftBtn = (UMButton)ThirdControl.createControl(new UMButton(context),ID_DRAFTBTN
,"halign","center"
,"pressed-image","button_touch"
,"width","fill"
,"background-image-dis","button"
,"font-pressed-color","#f2adb2"
,"height","44"
,"color","#e50011"
,"layout-type","linear"
,"font-size","17"
,"onclick","onDraftBtnClick"
,"font-family","default"
,"valign","center"
,"background-image","button"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,draftBtn,"value","#{res.flow_temporary}"));
draftBtn.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Flow_DraftEditActivity.this);
    actionOnDraftBtnClick(draftBtn,args);

}
});
draftPanel.addView(draftBtn);

return draftPanel;
}
public View getToolbarView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
toolbar = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_TOOLBAR
,"padding-left","8"
,"padding-right","8"
,"halign","center"
,"height","fill"
,"pressed-image","toolbar"
,"layout-type","linear"
,"width","fill"
,"background-image-dis","toolbar"
,"background-image","toolbar.png"
);
View draftPanel = (View) getDraftPanelView((UMActivity)context,binderGroup,configure);
toolbar.addView(draftPanel);

return toolbar;
}
public View getToolPanelView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
toolPanel = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_TOOLPANEL
,"halign","center"
,"height","44"
,"layout-type","linear"
,"width","fill"
);
View toolbar = (View) getToolbarView((UMActivity)context,binderGroup,configure);
toolPanel.addView(toolbar);

return toolPanel;
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
View toolPanel = (View) getToolPanelView((UMActivity)context,binderGroup,configure);
basePanel.addView(toolPanel);

return basePanel;
}
public UMWindow getCurrentWindow(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
DraftEdit = (UMWindow)ThirdControl.createControl(new UMWindow(context),ID_DRAFTEDIT
,"halign","center"
,"height","fill"
,"layout","vbox"
,"width","fill"
,"context","WorkDetail"
,"controller","DraftEditController"
,"namespace","nc.bs.oa.oama.ecm"
);
View basePanel = (View) getBasePanelView((UMActivity)context,binderGroup,configure);
DraftEdit.addView(basePanel);

return (UMWindow)DraftEdit;
}

	
	public void actionOnCancelBtnClick(View control, UMEventArgs args) {
    String actionid = "onCancelBtnClick";
  this.dataCollect();
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "onCancelBtnClick",UMActivity.getViewId(control),args);
}
public void actionOnCloseClick(View control, UMEventArgs args) {
    String actionid = "onCloseClick";
    args.put("resultcode","15");
    args.put("iskeep","false");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.close(args);
}
public void actionOnFlowClick(View control, UMEventArgs args) {
    String actionid = "onFlowClick";
    args.put("flowedit","#{flowedit}");
    args.put("viewid","nc.bs.oa.oama.ecm.Flow_FlowEdit");
    args.put("callback","flowCallback");
    args.put("iskeep","true");
    args.put("notice","#{notice}");
    args.put("containerName","");
    args.put("editable","#{editable}");
  ActionProcessor.exec(this, actionid, args);
UMView.open(args);
}
public void actionSubmitFailed(View control, UMEventArgs args) {
    String actionid = "submitFailed";
    args.put("message","#{res.flow_submitfailed}");
    args.put("title","#{res.flow_notice}");
    args.put("okbuttontitle","#{res.flow_ok}");
    args.put("style","ok");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.openDialog(args);
}
public void actionCacheDraft(View control, UMEventArgs args) {
    String actionid = "cacheDraft";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "cacheDraft",UMActivity.getViewId(control),args);
}
public void actionOnDataLoad(View control, UMEventArgs args) {
    String actionid = "onDataLoad";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "onDataLoad",UMActivity.getViewId(control),args);
}
public void actionOnSubmitBtnClick(View control, UMEventArgs args) {
    String actionid = "onSubmitBtnClick";
  this.dataCollect();
    args.put("contextmapping","ResultValue");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "onSubmitBtnClick",UMActivity.getViewId(control),args);
}
public void actionAttachmentCallback(View control, UMEventArgs args) {
    String actionid = "attachmentCallback";
  this.dataCollect();
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "attachmentCallback",UMActivity.getViewId(control),args);
}
public void actionBeforeCancel(View control, UMEventArgs args) {
    String actionid = "beforeCancel";
    args.put("message","#{res.flow_giveup}");
    args.put("title","#{res.flow_notice}");
    args.put("okaction","onCloseClick");
    args.put("okbuttontitle","#{res.flow_ok}");
    args.put("style","ok-cancel");
    args.put("containerName","");
    args.put("cancelbuttontitle","#{res.flow_cancel}");
  ActionProcessor.exec(this, actionid, args);
UMView.openDialog(args);
}
public void actionOnArchiveClick(View control, UMEventArgs args) {
    String actionid = "onArchiveClick";
    args.put("viewid","nc.bs.oa.oama.ecm.Flow_ArchiveEdit");
    args.put("callback","archiveCallback");
    args.put("archiveset","#{archiveset}");
    args.put("iskeep","true");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.open(args);
}
public void actionCacheSent(View control, UMEventArgs args) {
    String actionid = "cacheSent";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "cacheSent",UMActivity.getViewId(control),args);
}
public void actionOnAttachmentClick(View control, UMEventArgs args) {
    String actionid = "onAttachmentClick";
    args.put("viewid","nc.bs.oa.oama.ecm.Flow_AttachmentEdit");
    args.put("callback","attachmentCallback");
    args.put("iskeep","true");
    args.put("attachment","#{attachment}");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.open(args);
}
public void actionFlowCallback(View control, UMEventArgs args) {
    String actionid = "flowCallback";
  this.dataCollect();
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "flowCallback",UMActivity.getViewId(control),args);
}
public void actionErrorDialog(View control, UMEventArgs args) {
    String actionid = "errorDialog";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "errorDialog",UMActivity.getViewId(control),args);
}
public void actionSubmitSuccess(View control, UMEventArgs args) {
    String actionid = "submitSuccess";
    args.put("message","#{res.flow_submitsuccess}");
    args.put("title","#{res.flow_notice}");
    args.put("okbuttontitle","#{res.flow_ok}");
    args.put("okaction","cacheSent");
    args.put("style","ok");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.openDialog(args);
}
public void actionArchiveCallback(View control, UMEventArgs args) {
    String actionid = "archiveCallback";
  this.dataCollect();
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "archiveCallback",UMActivity.getViewId(control),args);
}
public void actionOnDraftBtnClick(View control, UMEventArgs args) {
    String actionid = "onDraftBtnClick";
  this.dataCollect();
    args.put("contextmapping","ResultValue");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "onDraftBtnClick",UMActivity.getViewId(control),args);
}
public void actionDraftFailed(View control, UMEventArgs args) {
    String actionid = "draftFailed";
    args.put("message","#{res.flow_draftfailed}");
    args.put("title","#{res.flow_notice}");
    args.put("okbuttontitle","#{res.flow_ok}");
    args.put("style","ok");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.openDialog(args);
}
public void actionDraftSuccess(View control, UMEventArgs args) {
    String actionid = "draftSuccess";
    args.put("message","#{res.flow_draftsuccess}");
    args.put("title","#{res.flow_notice}");
    args.put("okbuttontitle","#{res.flow_ok}");
    args.put("okaction","cacheDraft");
    args.put("style","ok");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.openDialog(args);
}


}
