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

public abstract class Msg_AttachmentList4ViewActivity extends UMWindowActivity {

	protected UMWindow Msg_AttachmentList4View = null;
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
protected XHorizontalLayout spaceInnerPanel = null;
protected XHorizontalLayout nullPanel = null;
protected UMLabel nullLabel = null;
protected UMListViewBase listView = null;
protected XHorizontalLayout itemPanel = null;
protected UMLabel nameLabel = null;
protected UMLabel sizeLabel = null;
protected XVerticalLayout spaceOutPanel2 = null;
protected XVerticalLayout spaceInnerPanel2 = null;

	
	protected final static int ID_MSG_ATTACHMENTLIST4VIEW = 1865652957;
protected final static int ID_BASEPANEL = 495010899;
protected final static int ID_NAVPANEL = 926634335;
protected final static int ID_NAVIGATORBAR = 1182969087;
protected final static int ID_LEFTPANEL = 627381038;
protected final static int ID_RETURNBTN = 1933349794;
protected final static int ID_CENTERPANEL = 113610801;
protected final static int ID_NAVLABEL = 205776223;
protected final static int ID_RIGHTPANEL = 836797938;
protected final static int ID_SCROLLVIEW_MAINPANEL = 842474742;
protected final static int ID_MAINPANEL = 1097395316;
protected final static int ID_SPACEOUTPANEL = 25863948;
protected final static int ID_SPACEINNERPANEL = 1155876283;
protected final static int ID_NULLPANEL = 1433338811;
protected final static int ID_NULLLABEL = 2060294586;
protected final static int ID_LISTVIEW = 1943650295;
protected final static int ID_ITEMPANEL = 1748133464;
protected final static int ID_NAMELABEL = 2091365117;
protected final static int ID_SIZELABEL = 887611360;
protected final static int ID_SPACEOUTPANEL2 = 1999504069;
protected final static int ID_SPACEINNERPANEL2 = 1823538031;

	
	
	@Override
	public String getControllerName() {
		return "Msg_AttachmentList4ViewController";
	}
	
	@Override
	public String getContextName() {
		return "msg_CreateMessage";
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
		  idmap.put("Msg_AttachmentList4View",ID_MSG_ATTACHMENTLIST4VIEW);
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
  idmap.put("nameLabel",ID_NAMELABEL);
  idmap.put("sizeLabel",ID_SIZELABEL);
  idmap.put("spaceOutPanel2",ID_SPACEOUTPANEL2);
  idmap.put("spaceInnerPanel2",ID_SPACEINNERPANEL2);

	}
	
	public void onLoad() {
		ULog.logLC("onLoad", this);
		if(currentPage!=null) {
			currentPage.onLoad();
		}
	
		{ //listView - OnLoadData
    UMEventArgs args = new UMEventArgs(Msg_AttachmentList4ViewActivity.this);
    actionOnLoadData(listView,args);

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
,"pressed-image","btn_back_touch.png"
,"width","64"
,"background-image-dis","button"
,"font-pressed-color","#f2adb2"
,"height","44"
,"color","#E50011"
,"layout-type","linear"
,"font-size","17"
,"onclick","onReturnBtnClick"
,"font-family","default"
,"valign","center"
,"background-image","btn_back.png"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,returnBtn,"value","#{res.msg_Return}"));
returnBtn.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Msg_AttachmentList4ViewActivity.this);
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
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,navLabel,"content","#{res.msg_AttachList}"));
centerPanel.addView(navLabel);

return centerPanel;
}
public View getNavigatorbarView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
navigatorbar = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_NAVIGATORBAR
,"padding-left","8"
,"height","44"
,"color","#ffffff"
,"pressed-image","nav"
,"width","fill"
,"font-size","17"
,"layout-type","linear"
,"background-image-dis","nav"
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
public View getItemPanelView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
itemPanel = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_ITEMPANEL
,"padding-left","15"
,"padding-right","15"
,"height","44"
,"layout-type","vbox"
,"width","fill"
,"onclick","OpenFile"
,"valign","center"
,"background-image","list_split.png"
);
itemPanel.setOnClickListener(new OnCursorClickListener(configure) {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Msg_AttachmentList4ViewActivity.this);
    int position = this.getPosition(v);
    if(position>=0) {
      context.getCursor("cursorattachmentlistalias").setCurrentIndex(position);
    }
    actionOpenFile(itemPanel,args);

}
});
nameLabel = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_NAMELABEL
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
UMTextBinder nameLabel_binder = new UMTextBinder((IUMContextAccessor)context);
nameLabel_binder.setBindInfo(new BindInfo("name"));
nameLabel_binder.setControl(nameLabel);
binderGroup.addBinderToGroup(ID_NAMELABEL, nameLabel_binder);
itemPanel.addView(nameLabel);
sizeLabel = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_SIZELABEL
,"content","size"
,"bindfield","sizeshow"
,"halign","right"
,"height","fill"
,"color","#8e8e93"
,"layout-type","linear"
,"font-size","16"
,"width","100"
,"font-family","default"
,"valign","center"
,"readonly","true"
);
UMTextBinder sizeLabel_binder = new UMTextBinder((IUMContextAccessor)context);
sizeLabel_binder.setBindInfo(new BindInfo("sizeshow"));
sizeLabel_binder.setControl(sizeLabel);
binderGroup.addBinderToGroup(ID_SIZELABEL, sizeLabel_binder);
itemPanel.addView(sizeLabel);

return itemPanel;
}
public View getListViewView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listView = (UMListViewBase)ThirdControl.createControl(new UMListViewBase(context),ID_LISTVIEW
,"bindfield","attachmentlist"
,"halign","center"
,"listview-delbtn-image","tool_del.png"
,"cursoraction","cursorattachmentlistalias"
,"synccontext","attachmentlist"
,"width","fill"
,"adapteraddition","false"
,"adaptiveheight","true"
,"height","44"
,"onload","OnLoadData"
,"background","#ffffff"
,"layout","vbox"
,"listview-delbtn-pressedimage","tool_del_touch.png"
);
context.createCursor("cursorattachmentlistalias", "attachmentlist");
UMListBinder listView_binder = new UMListBinder((IUMContextAccessor)context);
listView_binder.setBindInfo(new BindInfo("attachmentlist"));
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
,"padding-right","15"
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
View listView = (View) getListViewView((UMActivity)context,binderGroup,configure);
mainPanel.addView(listView);
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
Msg_AttachmentList4View = (UMWindow)ThirdControl.createControl(new UMWindow(context),ID_MSG_ATTACHMENTLIST4VIEW
,"halign","center"
,"height","fill"
,"layout","vbox"
,"width","fill"
,"context","msg_CreateMessage"
,"controller","Msg_AttachmentList4ViewController"
,"namespace","nc.bs.oa.oama.ecm"
);
View basePanel = (View) getBasePanelView((UMActivity)context,binderGroup,configure);
Msg_AttachmentList4View.addView(basePanel);

return (UMWindow)Msg_AttachmentList4View;
}

	
	public void actionOnLoadData(View control, UMEventArgs args) {
    String actionid = "OnLoadData";
    args.put("msgid","#{plug.msgid}");
    args.put("count","25");
    args.put("viewid","nc.bs.oa.oama.msgList.MsgListController");
    args.put("startline","1");
    args.put("action","GetAttachmentList");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMList.getFirstPage(args);
}
public void actionOpenFile(View control, UMEventArgs args) {
    args.put("downloadpath","#{#{cursor.cursorattachmentlistalias}.id}");
    args.put("startposition","0");
    args.put("fileid","#{#{cursor.cursorattachmentlistalias}.id}");
    args.put("currentid_arrayPath","attachmentlist");
    args.put("downflag","1");
    String actionid = "OpenFile";
    args.put("currentid","#{#{cursor.cursorattachmentlistalias}.id}");
    args.put("modulename","oaco");
    args.put("filesize","#{#{cursor.cursorattachmentlistalias}.sizeshow}");
    args.put("filename","#{#{cursor.cursorattachmentlistalias}.name}");
    args.put("filetype","#{#{cursor.cursorattachmentlistalias}.type}");
    args.put("endposition","0");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMService.downloadFile(args);
}
public void actionOnReturnBtnClick(View control, UMEventArgs args) {
    String actionid = "onReturnBtnClick";
    args.put("resultcode","15");
    args.put("iskeep","false");
    args.put("attachment","#{attachmentlist}");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.close(args);
}


}
