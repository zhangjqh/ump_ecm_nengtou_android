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

public abstract class Addr_psnGroupActivity extends UMWindowActivity {

	protected UMWindow psnGroup = null;
protected XVerticalLayout viewPage0 = null;
protected XHorizontalLayout navigatorbar0 = null;
protected UMButton button3 = null;
protected UMLabel label3 = null;
protected UMLabel label2 = null;
protected UMButton button2 = null;
protected UMButton button1 = null;
protected XVerticalLayout panel0 = null;
protected UMListViewBase listview0 = null;
protected XHorizontalLayout listview0_childWgt0 = null;
protected UMLabel listview0_childWgt0_label0 = null;
protected UMImage listview0_childWgt0_image0 = null;
protected XVerticalLayout panel1 = null;
protected XHorizontalLayout widget0 = null;
protected XHorizontalLayout widget0_toolbar0 = null;
protected UMImageButton widget0_imagebutton0 = null;
protected UMImageButton widget0_imagebutton3 = null;
protected UMImageButton widget0_imagebutton4 = null;
protected UMImageButton widget0_imagebutton1 = null;

	
	protected final static int ID_PSNGROUP = 1640885251;
protected final static int ID_VIEWPAGE0 = 1954125388;
protected final static int ID_NAVIGATORBAR0 = 257271753;
protected final static int ID_BUTTON3 = 696202010;
protected final static int ID_LABEL3 = 938490206;
protected final static int ID_LABEL2 = 857090562;
protected final static int ID_BUTTON2 = 1025661135;
protected final static int ID_BUTTON1 = 1747619935;
protected final static int ID_PANEL0 = 2141551119;
protected final static int ID_LISTVIEW0 = 380138551;
protected final static int ID_LISTVIEW0_CHILDWGT0 = 1030033233;
protected final static int ID_LISTVIEW0_CHILDWGT0_LABEL0 = 1968376998;
protected final static int ID_LISTVIEW0_CHILDWGT0_IMAGE0 = 1885274276;
protected final static int ID_PANEL1 = 817446712;
protected final static int ID_WIDGET0 = 1747976624;
protected final static int ID_WIDGET0_TOOLBAR0 = 399861083;
protected final static int ID_WIDGET0_IMAGEBUTTON0 = 1204833155;
protected final static int ID_WIDGET0_IMAGEBUTTON3 = 61670241;
protected final static int ID_WIDGET0_IMAGEBUTTON4 = 1043692475;
protected final static int ID_WIDGET0_IMAGEBUTTON1 = 153200814;

	
	
	@Override
	public String getControllerName() {
		return "psnGroupController";
	}
	
	@Override
	public String getContextName() {
		return "psnGroupList";
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
		  idmap.put("psnGroup",ID_PSNGROUP);
  idmap.put("viewPage0",ID_VIEWPAGE0);
  idmap.put("navigatorbar0",ID_NAVIGATORBAR0);
  idmap.put("button3",ID_BUTTON3);
  idmap.put("label3",ID_LABEL3);
  idmap.put("label2",ID_LABEL2);
  idmap.put("button2",ID_BUTTON2);
  idmap.put("button1",ID_BUTTON1);
  idmap.put("panel0",ID_PANEL0);
  idmap.put("listview0",ID_LISTVIEW0);
  idmap.put("listview0_childWgt0",ID_LISTVIEW0_CHILDWGT0);
  idmap.put("listview0_childWgt0_label0",ID_LISTVIEW0_CHILDWGT0_LABEL0);
  idmap.put("listview0_childWgt0_image0",ID_LISTVIEW0_CHILDWGT0_IMAGE0);
  idmap.put("panel1",ID_PANEL1);
  idmap.put("widget0",ID_WIDGET0);
  idmap.put("widget0_toolbar0",ID_WIDGET0_TOOLBAR0);
  idmap.put("widget0_imagebutton0",ID_WIDGET0_IMAGEBUTTON0);
  idmap.put("widget0_imagebutton3",ID_WIDGET0_IMAGEBUTTON3);
  idmap.put("widget0_imagebutton4",ID_WIDGET0_IMAGEBUTTON4);
  idmap.put("widget0_imagebutton1",ID_WIDGET0_IMAGEBUTTON1);

	}
	
	public void onLoad() {
		ULog.logLC("onLoad", this);
		if(currentPage!=null) {
			currentPage.onLoad();
		}
	
		{ //viewPage0 - navbarOnload
    UMEventArgs args = new UMEventArgs(Addr_psnGroupActivity.this);
    actionNavbarOnload(viewPage0,args);

}
{ //listview0 - listViewOnload
    UMEventArgs args = new UMEventArgs(Addr_psnGroupActivity.this);
    actionListViewOnload(listview0,args);

}
{ //panel1 - tabBarOnload
    UMEventArgs args = new UMEventArgs(Addr_psnGroupActivity.this);
    actionTabBarOnload(panel1,args);

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
	
	
	
	public View getNavigatorbar0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
navigatorbar0 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_NAVIGATORBAR0
,"padding-left","8"
,"padding-right","8"
,"pressed-image","nav"
,"width","fill"
,"background-image-dis","nav"
,"height","44.0"
,"color","#ffffff"
,"layout-type","linear"
,"font-size","17"
,"font-family","default"
,"valign","center"
,"background-image","nav.png"
);
button3 = (UMButton)ThirdControl.createControl(new UMButton(context),ID_BUTTON3
,"halign","left"
,"pressed-image","btn_back.png"
,"width","64"
,"background-image-dis","btn_back.png"
,"height","44"
,"color","#e50011"
,"font-size","17"
,"layout-type","linear"
,"onclick","toDesk"
,"font-family","default"
,"valign","center"
,"background-image","btn_back.png"
);
button3.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Addr_psnGroupActivity.this);
    actionToDesk(button3,args);

}
});
navigatorbar0.addView(button3);
label3 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL3
,"halign","center"
,"height","fill"
,"color","#000000"
,"layout-type","linear"
,"font-size","17"
,"width","24"
,"font-family","default"
,"valign","center"
);
navigatorbar0.addView(label3);
label2 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL2
,"halign","center"
,"height","fill"
,"weight","1"
,"color","#000000"
,"layout-type","linear"
,"font-size","17"
,"width","0"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label2,"content","#{res.addr_oaadl_0002}"));
navigatorbar0.addView(label2);
button2 = (UMButton)ThirdControl.createControl(new UMButton(context),ID_BUTTON2
,"halign","center"
,"pressed-image","btn_add_touch"
,"width","44"
,"background-image-dis","button"
,"height","44"
,"color","#e50011"
,"font-size","18"
,"layout-type","linear"
,"onclick","addPGPop"
,"font-family","default"
,"valign","center"
,"background-image","btn_add"
);
button2.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Addr_psnGroupActivity.this);
    actionAddPGPop(button2,args);

}
});
navigatorbar0.addView(button2);
button1 = (UMButton)ThirdControl.createControl(new UMButton(context),ID_BUTTON1
,"halign","right"
,"height","44"
,"color","#e50011"
,"pressed-image","button_touch"
,"layout-type","linear"
,"font-size","17"
,"width","44"
,"onclick","toDelPG"
,"font-family","default"
,"valign","center"
);
button1.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Addr_psnGroupActivity.this);
    actionToDelPG(button1,args);

}
});
navigatorbar0.addView(button1);

return navigatorbar0;
}
public View getListview0_childWgt0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt0 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT0
,"padding-right","15"
,"padding-left","15"
,"height","44"
,"layout-type","linear"
,"width","fill"
,"onclick","toPsnList"
,"valign","center"
,"background-image","oaadl_44_down.png"
);
listview0_childWgt0.setOnClickListener(new OnCursorClickListener(configure) {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Addr_psnGroupActivity.this);
    int position = this.getPosition(v);
    if(position>=0) {
      context.getCursor("cursorpersongroupsalias").setCurrentIndex(position);
    }
    actionToPsnList(listview0_childWgt0,args);

}
});
listview0_childWgt0_label0 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT0_LABEL0
,"bindfield","nameandnum"
,"halign","left"
,"height","fill"
,"weight","1"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","0"
,"font-family","default"
,"valign","center"
);
UMTextBinder listview0_childWgt0_label0_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt0_label0_binder.setBindInfo(new BindInfo("nameandnum"));
listview0_childWgt0_label0_binder.setControl(listview0_childWgt0_label0);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT0_LABEL0, listview0_childWgt0_label0_binder);
listview0_childWgt0.addView(listview0_childWgt0_label0);
listview0_childWgt0_image0 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_LISTVIEW0_CHILDWGT0_IMAGE0
,"height","13"
,"layout-type","linear"
,"width","8"
,"scaletype","fitcenter"
,"src","oaadl_arrow.png"
);
listview0_childWgt0.addView(listview0_childWgt0_image0);

return listview0_childWgt0;
}
public View getListview0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0 = (UMListViewBase)ThirdControl.createControl(new UMListViewBase(context),ID_LISTVIEW0
,"bindfield","persongroups"
,"childindicator","psnGroupListRowWidget"
,"weight","1"
,"listview-delbtn-image","oaadl_delete44.png"
,"cursoraction","cursorpersongroupsalias"
,"synccontext","persongroups"
,"width","fill"
,"onitemdelete","delPsnGroup"
,"onuprefersh","listViewOnload"
,"height","0"
,"onload","listViewOnload"
,"layout-type","linear"
,"background","#efeff4"
,"listview-delbtn-pressedimage","oaadl_delete44_touch.png"
);
context.createCursor("cursorpersongroupsalias", "persongroups");
UMListBinder listview0_binder = new UMListBinder((IUMContextAccessor)context);
listview0_binder.setBindInfo(new BindInfo("persongroups"));
listview0_binder.setControl(listview0);
binderGroup.addBinderToGroup(ID_LISTVIEW0, listview0_binder);
listview0.setEvent("onitemdelete", new OnCursorEventListener(configure) {
  @Override
  public void onEvent(View v, UMEventArgs parent) {
    UMEventArgs args = new UMEventArgs(Addr_psnGroupActivity.this);
    args.put(parent);
    int position = this.getPosition(v);
    if(position>=0) {
      context.getCursor("cursorpersongroupsalias").setCurrentIndex(position);
    }
    actionDelPsnGroup(listview0,args);

}
});
listview0.setEvent("onuprefersh", new OnCursorEventListener(configure) {
  @Override
  public void onEvent(View v, UMEventArgs parent) {
    UMEventArgs args = new UMEventArgs(Addr_psnGroupActivity.this);
    args.put(parent);
    actionListViewOnload(listview0,args);

}
});
listview0.addListItemView(new UMListViewBase.ListItemView() {
	public View getItemView(Context context, View parent, IBinderGroup binderGroup,int position) {
  UMDslConfigure configure = new UMDslConfigure();
  configure.put("position",position);
View listview0_childWgt0 = (View) getListview0_childWgt0View((UMActivity)context,binderGroup,configure);
return listview0_childWgt0;
}});

return listview0;
}
public View getPanel0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel0 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL0
,"halign","center"
,"height","0"
,"weight","1"
,"layout-type","linear"
,"width","fill"
);
View listview0 = (View) getListview0View((UMActivity)context,binderGroup,configure);
panel0.addView(listview0);

return panel0;
}
public View getWidget0_toolbar0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
widget0_toolbar0 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_WIDGET0_TOOLBAR0
,"height","fill"
,"pressed-image","toolbar"
,"layout-type","linear"
,"width","fill"
,"background-image-dis","toolbar"
,"valign","center"
,"background-image","toolbar.png"
);
widget0_imagebutton0 = (UMImageButton)ThirdControl.createControl(new UMImageButton(context),ID_WIDGET0_IMAGEBUTTON0
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
,"icon-background-image","oaadl_searchicon.png"
,"icon-pressed-image","oaadl_searchicon_touch.png"
,"onclick","toSearch"
,"font-family","default"
,"valign","center"
,"checked","false"
,"icon-text-spacing","5"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,widget0_imagebutton0,"value","#{res.addr_oaadl_0005}"));
widget0_imagebutton0.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Addr_psnGroupActivity.this);
    actionToSearch(widget0_imagebutton0,args);

}
});
widget0_toolbar0.addView(widget0_imagebutton0);
widget0_imagebutton3 = (UMImageButton)ThirdControl.createControl(new UMImageButton(context),ID_WIDGET0_IMAGEBUTTON3
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
,"icon-background-image","oaadl_navicon.png"
,"icon-pressed-image","oaadl_navicon_touch.png"
,"onclick","toNavGroup"
,"font-family","default"
,"valign","center"
,"checked","false"
,"icon-text-spacing","5"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,widget0_imagebutton3,"value","#{res.addr_oaadl_0004}"));
widget0_imagebutton3.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Addr_psnGroupActivity.this);
    actionToNavGroup(widget0_imagebutton3,args);

}
});
widget0_toolbar0.addView(widget0_imagebutton3);
widget0_imagebutton4 = (UMImageButton)ThirdControl.createControl(new UMImageButton(context),ID_WIDGET0_IMAGEBUTTON4
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
,"icon-background-image","oaadl_groupicon.png"
,"icon-pressed-image","oaadl_groupicon_touch.png"
,"onclick","toEntGroup"
,"font-family","default"
,"valign","center"
,"checked","false"
,"icon-text-spacing","5"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,widget0_imagebutton4,"value","#{res.addr_oaadl_0003}"));
widget0_imagebutton4.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Addr_psnGroupActivity.this);
    actionToEntGroup(widget0_imagebutton4,args);

}
});
widget0_toolbar0.addView(widget0_imagebutton4);
widget0_imagebutton1 = (UMImageButton)ThirdControl.createControl(new UMImageButton(context),ID_WIDGET0_IMAGEBUTTON1
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
,"icon-background-image","oaadl_pgroupicon.png"
,"icon-pressed-image","oaadl_pgroupicon_touch.png"
,"onclick","toPsnGroup"
,"font-family","default"
,"valign","center"
,"checked","false"
,"icon-text-spacing","5"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,widget0_imagebutton1,"value","#{res.addr_oaadl_0002}"));
widget0_imagebutton1.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Addr_psnGroupActivity.this);
    actionToPsnGroup(widget0_imagebutton1,args);

}
});
widget0_toolbar0.addView(widget0_imagebutton1);

return widget0_toolbar0;
}
public View getWidget0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
widget0 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_WIDGET0
,"height","49"
,"layout-type","linear"
,"width","fill"
,"valign","center"
);
View widget0_toolbar0 = (View) getWidget0_toolbar0View((UMActivity)context,binderGroup,configure);
widget0.addView(widget0_toolbar0);

return widget0;
}
public View getPanel1View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel1 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL1
,"halign","center"
,"height","49"
,"onload","tabBarOnload"
,"layout-type","linear"
,"width","fill"
);
View widget0 = (View) getWidget0View((UMActivity)context,binderGroup,configure);
panel1.addView(widget0);

return panel1;
}
public View getViewPage0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
viewPage0 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_VIEWPAGE0
,"halign","center"
,"height","fill"
,"onload","navbarOnload"
,"layout-type","vbox"
,"width","fill"
);
View navigatorbar0 = (View) getNavigatorbar0View((UMActivity)context,binderGroup,configure);
viewPage0.addView(navigatorbar0);
View panel0 = (View) getPanel0View((UMActivity)context,binderGroup,configure);
viewPage0.addView(panel0);
View panel1 = (View) getPanel1View((UMActivity)context,binderGroup,configure);
viewPage0.addView(panel1);

return viewPage0;
}
public UMWindow getCurrentWindow(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
psnGroup = (UMWindow)ThirdControl.createControl(new UMWindow(context),ID_PSNGROUP
,"halign","center"
,"height","fill"
,"layout","vbox"
,"width","fill"
,"context","psnGroupList"
,"controller","psnGroupController"
,"namespace","nc.bs.oa.oama.ecm"
);
View viewPage0 = (View) getViewPage0View((UMActivity)context,binderGroup,configure);
psnGroup.addView(viewPage0);

return (UMWindow)psnGroup;
}

	
	public void actionTabBarOnload(View control, UMEventArgs args) {
    String actionid = "tabBarOnload";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "tabBarOnload",UMActivity.getViewId(control),args);
}
public void actionDelPsnGroup(View control, UMEventArgs args) {
    String actionid = "delPsnGroup";
  this.dataCollect();
    args.put("rowindex_arrayPath","persongroups");
    args.put("rowindex","#{cursor.cursorpersongroupsalias.index}");
    args.put("containerName","");
    args.put("row","#{#{cursor.cursorpersongroupsalias}}");
    args.put("row_arrayPath","persongroups");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "delPsnGroup",UMActivity.getViewId(control),args);
}
public void actionToDelPG(View control, UMEventArgs args) {
    String actionid = "toDelPG";
  this.dataCollect();
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "toDelPG",UMActivity.getViewId(control),args);
}
public void actionToDesk(View control, UMEventArgs args) {
    String actionid = "toDesk";
    args.put("resultcode","0");
    args.put("iskeep","false");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.close(args);
}
public void actionToNearlyCheck(View control, UMEventArgs args) {
    String actionid = "toNearlyCheck";
    args.put("viewid","nc.bs.oa.oama.ecm.addr_nearlyCheck");
    args.put("iskeep","false");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.open(args);
}
public void actionNavbarOnload(View control, UMEventArgs args) {
    String actionid = "navbarOnload";
  this.dataCollect();
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "navbarOnload",UMActivity.getViewId(control),args);
}
public void actionUMonUnload(View control, UMEventArgs args) {
    String actionid = "UMonUnload";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "UMonUnload",UMActivity.getViewId(control),args);
}
public void actionUMonComplete(View control, UMEventArgs args) {
    String actionid = "UMonComplete";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "UMonComplete",UMActivity.getViewId(control),args);
}
public void actionUMonDataBinding(View control, UMEventArgs args) {
    String actionid = "UMonDataBinding";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "UMonDataBinding",UMActivity.getViewId(control),args);
}
public void actionToSearch(View control, UMEventArgs args) {
    String actionid = "toSearch";
    args.put("viewid","nc.bs.oa.oama.ecm.Addr_search");
    args.put("iskeep","false");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.open(args);
}
public void actionToPsnList(View control, UMEventArgs args) {
    String actionid = "toPsnList";
    args.put("viewid","nc.bs.oa.oama.ecm.Addr_pgPsnList");
  this.dataCollect();
    args.put("iskeep","false");
    args.put("type","normal");
    args.put("containerName","");
    args.put("row","#{#{cursor.cursorpersongroupsalias}}");
    args.put("row_arrayPath","persongroups");
  ActionProcessor.exec(this, actionid, args);
UMView.open(args);
}
public void actionAddPGPop(View control, UMEventArgs args) {
    String actionid = "addPGPop";
    args.put("bindfield","fieldvalue");
    args.put("message","#{res.addr_oaadl_0025}");
    args.put("title","#{res.addr_oaadl_0024}");
    args.put("okaction","addPsnGroup");
    args.put("okbuttontitle","保存");
    args.put("style","text-dialog");
    args.put("containerName","");
    args.put("cancelbuttontitle","取消");
  ActionProcessor.exec(this, actionid, args);
UMView.openDialog(args);
}
public void actionToEntGroup(View control, UMEventArgs args) {
    String actionid = "toEntGroup";
    args.put("viewid","nc.bs.oa.oama.ecm.Addr_entGroup");
    args.put("iskeep","false");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.open(args);
}
public void actionToNavGroup(View control, UMEventArgs args) {
    String actionid = "toNavGroup";
    args.put("viewid","nc.bs.oa.oama.ecm.Addr_navGroup");
    args.put("iskeep","false");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.open(args);
}
public void actionUMonInit(View control, UMEventArgs args) {
    String actionid = "UMonInit";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "UMonInit",UMActivity.getViewId(control),args);
}
public void actionUMonLoad(View control, UMEventArgs args) {
    String actionid = "UMonLoad";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "UMonLoad",UMActivity.getViewId(control),args);
}
public void actionToPsnGroup(View control, UMEventArgs args) {
    String actionid = "toPsnGroup";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "toPsnGroup",UMActivity.getViewId(control),args);
}
public void actionAddPsnGroup(View control, UMEventArgs args) {
    String actionid = "addPsnGroup";
  this.dataCollect();
    args.put("containerName","");
    args.put("newPGName","#{plug.newPGName}");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "addPsnGroup",UMActivity.getViewId(control),args);
}
public void actionListViewOnload(View control, UMEventArgs args) {
    String actionid = "listViewOnload";
  this.dataCollect();
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "listViewOnload",UMActivity.getViewId(control),args);
}


}
