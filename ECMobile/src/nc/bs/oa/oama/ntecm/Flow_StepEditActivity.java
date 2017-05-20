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

public abstract class Flow_StepEditActivity extends UMWindowActivity {

	protected UMWindow StepEdit = null;
protected XVerticalLayout basePanel = null;
protected XVerticalLayout navPanel = null;
protected XHorizontalLayout navigatorbar = null;
protected XHorizontalLayout leftPanel = null;
protected UMButton returnBtn = null;
protected XHorizontalLayout centerPanel = null;
protected UMLabel navLabel = null;
protected XVerticalLayout rightPanel = null;
protected UMButton addBtn = null;
protected UMScrollView Scrollview_mainPanel = null;
protected XVerticalLayout mainPanel = null;
protected XVerticalLayout spaceOutPanel = null;
protected XVerticalLayout spaceInnerPanel = null;
protected XHorizontalLayout nullPanel = null;
protected UMLabel nullLabel = null;
protected UMListViewBase listView = null;
protected XHorizontalLayout itemPanel = null;
protected UMLabel indexLabel = null;
protected UMLabel nameLabel = null;
protected XHorizontalLayout upPanel = null;
protected UMImage upImg = null;
protected XHorizontalLayout downPanel = null;
protected UMImage downImg = null;
protected XVerticalLayout spaceOutPanel1 = null;
protected XVerticalLayout spaceInnerPanel1 = null;
protected XHorizontalLayout modelPanel = null;
protected UMLabel modelLabel = null;
protected UMToggleButtonGroup modelToggle = null;
protected UMToggleButton serialBtn = null;
protected UMToggleButton parallelBtn = null;
protected XHorizontalLayout rulePanel = null;
protected UMLabel ruleLabel = null;
protected UMToggleButtonGroup ruleToggle = null;
protected UMToggleButton seizeBtn = null;
protected UMToggleButton countersignBtn = null;

	
	protected final static int ID_STEPEDIT = 1041701811;
protected final static int ID_BASEPANEL = 222687034;
protected final static int ID_NAVPANEL = 1917212937;
protected final static int ID_NAVIGATORBAR = 591319617;
protected final static int ID_LEFTPANEL = 863148288;
protected final static int ID_RETURNBTN = 579330102;
protected final static int ID_CENTERPANEL = 399814111;
protected final static int ID_NAVLABEL = 2146575668;
protected final static int ID_RIGHTPANEL = 1976080177;
protected final static int ID_ADDBTN = 533599045;
protected final static int ID_SCROLLVIEW_MAINPANEL = 1881480305;
protected final static int ID_MAINPANEL = 973659230;
protected final static int ID_SPACEOUTPANEL = 1336554189;
protected final static int ID_SPACEINNERPANEL = 1939910504;
protected final static int ID_NULLPANEL = 593884585;
protected final static int ID_NULLLABEL = 835233622;
protected final static int ID_LISTVIEW = 854508888;
protected final static int ID_ITEMPANEL = 1663594387;
protected final static int ID_INDEXLABEL = 1506801640;
protected final static int ID_NAMELABEL = 647040311;
protected final static int ID_UPPANEL = 836680053;
protected final static int ID_UPIMG = 479586577;
protected final static int ID_DOWNPANEL = 2036659543;
protected final static int ID_DOWNIMG = 1211174020;
protected final static int ID_SPACEOUTPANEL1 = 477081285;
protected final static int ID_SPACEINNERPANEL1 = 1541082296;
protected final static int ID_MODELPANEL = 807193633;
protected final static int ID_MODELLABEL = 1621121738;
protected final static int ID_MODELTOGGLE = 1185461647;
protected final static int ID_SERIALBTN = 149212072;
protected final static int ID_PARALLELBTN = 472822950;
protected final static int ID_RULEPANEL = 2038070929;
protected final static int ID_RULELABEL = 970646541;
protected final static int ID_RULETOGGLE = 1018885324;
protected final static int ID_SEIZEBTN = 1867339603;
protected final static int ID_COUNTERSIGNBTN = 2002895634;

	
	
	@Override
	public String getControllerName() {
		return "StepEditController";
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
		{ //basePanel - addCallBack
    UMEventArgs args = new UMEventArgs(Flow_StepEditActivity.this);
    actionAddCallBack(basePanel,args);

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
		  idmap.put("StepEdit",ID_STEPEDIT);
  idmap.put("basePanel",ID_BASEPANEL);
  idmap.put("navPanel",ID_NAVPANEL);
  idmap.put("navigatorbar",ID_NAVIGATORBAR);
  idmap.put("leftPanel",ID_LEFTPANEL);
  idmap.put("returnBtn",ID_RETURNBTN);
  idmap.put("centerPanel",ID_CENTERPANEL);
  idmap.put("navLabel",ID_NAVLABEL);
  idmap.put("rightPanel",ID_RIGHTPANEL);
  idmap.put("addBtn",ID_ADDBTN);
  idmap.put("Scrollview_mainPanel",ID_SCROLLVIEW_MAINPANEL);
  idmap.put("mainPanel",ID_MAINPANEL);
  idmap.put("spaceOutPanel",ID_SPACEOUTPANEL);
  idmap.put("spaceInnerPanel",ID_SPACEINNERPANEL);
  idmap.put("nullPanel",ID_NULLPANEL);
  idmap.put("nullLabel",ID_NULLLABEL);
  idmap.put("listView",ID_LISTVIEW);
  idmap.put("itemPanel",ID_ITEMPANEL);
  idmap.put("indexLabel",ID_INDEXLABEL);
  idmap.put("nameLabel",ID_NAMELABEL);
  idmap.put("upPanel",ID_UPPANEL);
  idmap.put("upImg",ID_UPIMG);
  idmap.put("downPanel",ID_DOWNPANEL);
  idmap.put("downImg",ID_DOWNIMG);
  idmap.put("spaceOutPanel1",ID_SPACEOUTPANEL1);
  idmap.put("spaceInnerPanel1",ID_SPACEINNERPANEL1);
  idmap.put("modelPanel",ID_MODELPANEL);
  idmap.put("modelLabel",ID_MODELLABEL);
  idmap.put("modelToggle",ID_MODELTOGGLE);
  idmap.put("serialBtn",ID_SERIALBTN);
  idmap.put("parallelBtn",ID_PARALLELBTN);
  idmap.put("rulePanel",ID_RULEPANEL);
  idmap.put("ruleLabel",ID_RULELABEL);
  idmap.put("ruleToggle",ID_RULETOGGLE);
  idmap.put("seizeBtn",ID_SEIZEBTN);
  idmap.put("countersignBtn",ID_COUNTERSIGNBTN);

	}
	
	public void onLoad() {
		ULog.logLC("onLoad", this);
		if(currentPage!=null) {
			currentPage.onLoad();
		}
	
		{ //basePanel - onDataLoad
    UMEventArgs args = new UMEventArgs(Flow_StepEditActivity.this);
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
    UMEventArgs args = new UMEventArgs(Flow_StepEditActivity.this);
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
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,navLabel,"content","#{res.flow_addperson}"));
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
,"pressed-image","btn_add_touch"
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
,"background-image","btn_add"
);
addBtn.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Flow_StepEditActivity.this);
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
,"font-size","16"
,"background","#ffffff"
,"width","fill"
,"font-family","default"
,"valign","center"
,"readonly","true"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,nullLabel,"content","#{res.flow_nodata}"));
nullPanel.addView(nullLabel);

return nullPanel;
}
public View getUpPanelView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
upPanel = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_UPPANEL
,"padding-left","15"
,"height","44"
,"layout-type","linear"
,"width","43"
,"onclick","onUpBtnClick"
,"valign","center"
);
upPanel.setOnClickListener(new OnCursorClickListener(configure) {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Flow_StepEditActivity.this);
    int position = this.getPosition(v);
    if(position>=0) {
      context.getCursor("cursoreditstep_stepsalias").setCurrentIndex(position);
    }
    actionOnUpBtnClick(upPanel,args);

}
});
upImg = (UMImage)ThirdControl.createControl(new UMImage(context),ID_UPIMG
,"height","8"
,"layout-type","linear"
,"width","13"
,"scaletype","fitcenter"
,"src","oa_freeflow_up.png"
);
upPanel.addView(upImg);

return upPanel;
}
public View getDownPanelView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
downPanel = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_DOWNPANEL
,"padding-left","15"
,"height","44"
,"layout-type","linear"
,"width","43"
,"onclick","onDownBtnClick"
,"valign","center"
);
downPanel.setOnClickListener(new OnCursorClickListener(configure) {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Flow_StepEditActivity.this);
    int position = this.getPosition(v);
    if(position>=0) {
      context.getCursor("cursoreditstep_stepsalias").setCurrentIndex(position);
    }
    actionOnDownBtnClick(downPanel,args);

}
});
downImg = (UMImage)ThirdControl.createControl(new UMImage(context),ID_DOWNIMG
,"height","8"
,"layout-type","linear"
,"width","13"
,"scaletype","fitcenter"
,"src","oa_freeflow_down.png"
);
downPanel.addView(downImg);

return downPanel;
}
public View getItemPanelView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
itemPanel = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_ITEMPANEL
,"padding-left","5"
,"height","44"
,"layout-type","vbox"
,"width","fill"
,"valign","center"
,"background-image","list_split_full.png"
);
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
);
UMTextBinder indexLabel_binder = new UMTextBinder((IUMContextAccessor)context);
indexLabel_binder.setBindInfo(new BindInfo("index"));
indexLabel_binder.setControl(indexLabel);
binderGroup.addBinderToGroup(ID_INDEXLABEL, indexLabel_binder);
itemPanel.addView(indexLabel);
nameLabel = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_NAMELABEL
,"content","name"
,"bindfield","name"
,"halign","left"
,"height","fill"
,"weight","1"
,"color","#000000"
,"layout-type","linear"
,"font-size","16"
,"width","0"
,"font-family","default"
,"valign","center"
);
UMTextBinder nameLabel_binder = new UMTextBinder((IUMContextAccessor)context);
nameLabel_binder.setBindInfo(new BindInfo("name"));
nameLabel_binder.setControl(nameLabel);
binderGroup.addBinderToGroup(ID_NAMELABEL, nameLabel_binder);
itemPanel.addView(nameLabel);
View upPanel = (View) getUpPanelView((UMActivity)context,binderGroup,configure);
itemPanel.addView(upPanel);
View downPanel = (View) getDownPanelView((UMActivity)context,binderGroup,configure);
itemPanel.addView(downPanel);

return itemPanel;
}
public View getListViewView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listView = (UMListViewBase)ThirdControl.createControl(new UMListViewBase(context),ID_LISTVIEW
,"bindfield","editstep.steps"
,"halign","center"
,"listview-delbtn-image","tool_del.png"
,"cursoraction","cursoreditstep_stepsalias"
,"status","delete"
,"synccontext","editstep.steps"
,"width","fill"
,"adapteraddition","false"
,"adaptiveheight","true"
,"onitemdelete","onDeleteBtnClick"
,"height","44"
,"layout","vbox"
,"background","#ffffff"
,"listview-delbtn-pressedimage","tool_del_touch.png"
,"alternatingrow","true"
);
context.createCursor("cursoreditstep_stepsalias", "editstep.steps");
UMListBinder listView_binder = new UMListBinder((IUMContextAccessor)context);
listView_binder.setBindInfo(new BindInfo("editstep.steps"));
listView_binder.setControl(listView);
binderGroup.addBinderToGroup(ID_LISTVIEW, listView_binder);
listView.setEvent("onitemdelete", new OnCursorEventListener(configure) {
  @Override
  public void onEvent(View v, UMEventArgs parent) {
    UMEventArgs args = new UMEventArgs(Flow_StepEditActivity.this);
    args.put(parent);
    int position = this.getPosition(v);
    if(position>=0) {
      context.getCursor("cursoreditstep_stepsalias").setCurrentIndex(position);
    }
    actionOnDeleteBtnClick(listView,args);

}
});
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
public View getModelToggleView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
modelToggle = (UMToggleButtonGroup)ThirdControl.createControl(new UMToggleButtonGroup(context),ID_MODELTOGGLE
,"bindfield","editstep.model"
,"height","30"
,"layout","hbox"
,"width","150"
,"value","buttongroup"
,"valign","center"
);
UMToggleButtonGroupBinder modelToggle_binder = new UMToggleButtonGroupBinder((IUMContextAccessor)context);
modelToggle_binder.setBindInfo(new BindInfo("editstep.model"));
modelToggle_binder.setControl(modelToggle);
binderGroup.addBinderToGroup(ID_MODELTOGGLE, modelToggle_binder);
serialBtn = (UMToggleButton)ThirdControl.createControl(new UMToggleButton(context),ID_SERIALBTN
,"halign","center"
,"background-image-off","label_2_left"
,"width","80.0"
,"font-pressed-color","#ffffff"
,"type","button"
,"background-image-on","label_2_left_touch"
,"height","30.0"
,"color","#e50011"
,"layout-type","hbox"
,"font-size","14"
,"value","1"
,"onclick","onSerialBtnClick"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,serialBtn,"textOff","#{res.flow_serial}"));
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,serialBtn,"textOn","#{res.flow_serial}"));
serialBtn.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Flow_StepEditActivity.this);
    actionOnSerialBtnClick(serialBtn,args);

}
});
modelToggle.addView(serialBtn);
parallelBtn = (UMToggleButton)ThirdControl.createControl(new UMToggleButton(context),ID_PARALLELBTN
,"halign","center"
,"background-image-off","label_2_right"
,"width","80.0"
,"font-pressed-color","#ffffff"
,"type","button"
,"background-image-on","label_2_right_touch"
,"height","30.0"
,"color","#e50011"
,"layout-type","hbox"
,"font-size","14"
,"value","2"
,"onclick","onParallelBtnClick"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,parallelBtn,"textOff","#{res.flow_parallel}"));
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,parallelBtn,"textOn","#{res.flow_parallel}"));
parallelBtn.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Flow_StepEditActivity.this);
    actionOnParallelBtnClick(parallelBtn,args);

}
});
modelToggle.addView(parallelBtn);

return modelToggle;
}
public View getModelPanelView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
modelPanel = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_MODELPANEL
,"padding-right","15"
,"padding-left","15"
,"height","44"
,"visible","false"
,"layout-type","linear"
,"width","fill"
,"valign","center"
,"background-image","list_split_full.png"
);
modelLabel = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_MODELLABEL
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
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,modelLabel,"content","#{res.flow_processmode}"));
modelPanel.addView(modelLabel);
View modelToggle = (View) getModelToggleView((UMActivity)context,binderGroup,configure);
modelPanel.addView(modelToggle);

return modelPanel;
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
,"onclick","onSeizeBtnClick"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,seizeBtn,"textOff","#{res.flow_seize}"));
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,seizeBtn,"textOn","#{res.flow_seize}"));
seizeBtn.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Flow_StepEditActivity.this);
    actionOnSeizeBtnClick(seizeBtn,args);

}
});
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
,"onclick","onCountersignBtnClick"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,countersignBtn,"textOff","#{res.flow_countersign}"));
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,countersignBtn,"textOn","#{res.flow_countersign}"));
countersignBtn.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Flow_StepEditActivity.this);
    actionOnCountersignBtnClick(countersignBtn,args);

}
});
ruleToggle.addView(countersignBtn);

return ruleToggle;
}
public View getRulePanelView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
rulePanel = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_RULEPANEL
,"padding-left","15"
,"padding-right","15"
,"height","44"
,"visible","false"
,"layout-type","linear"
,"width","fill"
,"valign","center"
,"background-image","list_split_full.png"
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
View modelPanel = (View) getModelPanelView((UMActivity)context,binderGroup,configure);
mainPanel.addView(modelPanel);
View rulePanel = (View) getRulePanelView((UMActivity)context,binderGroup,configure);
mainPanel.addView(rulePanel);

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
,"onresume","addCallBack"
);
View navPanel = (View) getNavPanelView((UMActivity)context,binderGroup,configure);
basePanel.addView(navPanel);
View Scrollview_mainPanel = (View) getScrollview_mainPanelView((UMActivity)context,binderGroup,configure);
basePanel.addView(Scrollview_mainPanel);

return basePanel;
}
public UMWindow getCurrentWindow(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
StepEdit = (UMWindow)ThirdControl.createControl(new UMWindow(context),ID_STEPEDIT
,"halign","center"
,"height","fill"
,"layout","vbox"
,"width","fill"
,"context","WorkDetail"
,"controller","StepEditController"
,"namespace","nc.bs.oa.oama.ecm"
);
View basePanel = (View) getBasePanelView((UMActivity)context,binderGroup,configure);
StepEdit.addView(basePanel);

return (UMWindow)StepEdit;
}

	
	public void actionOnUpBtnClick(View control, UMEventArgs args) {
    String actionid = "onUpBtnClick";
    args.put("index","#{cursor.cursoreditstep_stepsalias.index}");
    args.put("index_arrayPath","editstep.steps");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "onUpBtnClick",UMActivity.getViewId(control),args);
}
public void actionOnSeizeBtnClick(View control, UMEventArgs args) {
    String actionid = "onSeizeBtnClick";
  this.dataCollect();
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "onSeizeBtnClick",UMActivity.getViewId(control),args);
}
public void actionOnDeleteBtnClick(View control, UMEventArgs args) {
    String actionid = "onDeleteBtnClick";
    args.put("index","#{cursor.cursoreditstep_stepsalias.index}");
    args.put("index_arrayPath","editstep.steps");
  this.dataCollect();
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "onDeleteBtnClick",UMActivity.getViewId(control),args);
}
public void actionOnSerialBtnClick(View control, UMEventArgs args) {
    String actionid = "onSerialBtnClick";
  this.dataCollect();
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "onSerialBtnClick",UMActivity.getViewId(control),args);
}
public void actionOnCountersignBtnClick(View control, UMEventArgs args) {
    String actionid = "onCountersignBtnClick";
  this.dataCollect();
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "onCountersignBtnClick",UMActivity.getViewId(control),args);
}
public void actionOnParallelBtnClick(View control, UMEventArgs args) {
    String actionid = "onParallelBtnClick";
  this.dataCollect();
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "onParallelBtnClick",UMActivity.getViewId(control),args);
}
public void actionOnDataLoad(View control, UMEventArgs args) {
    String actionid = "onDataLoad";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "onDataLoad",UMActivity.getViewId(control),args);
}
public void actionOnDownBtnClick(View control, UMEventArgs args) {
    String actionid = "onDownBtnClick";
    args.put("index","#{cursor.cursoreditstep_stepsalias.index}");
    args.put("index_arrayPath","editstep.steps");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "onDownBtnClick",UMActivity.getViewId(control),args);
}
public void actionOnReturnBtnClick(View control, UMEventArgs args) {
    String actionid = "onReturnBtnClick";
    args.put("editstep","#{editstep}");
  this.dataCollect();
    args.put("resultcode","15");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.close(args);
}
public void actionAddCallBack(View control, UMEventArgs args) {
    String actionid = "addCallBack";
  this.dataCollect();
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "addCallBack",UMActivity.getViewId(control),args);
}
public void actionOnAddBtnClick(View control, UMEventArgs args) {
    String actionid = "onAddBtnClick";
    args.put("viewid","nc.bs.oa.oama.ecm.Ecm_SearchDept");
    args.put("iskeep","true");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.open(args);
}


}
