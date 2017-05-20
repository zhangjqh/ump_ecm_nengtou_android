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

public abstract class Addr_psnUpdateGroupActivity extends UMWindowActivity {

	protected UMWindow psnUpdateGroup = null;
protected XVerticalLayout viewPage0 = null;
protected XHorizontalLayout navigatorbar0 = null;
protected UMButton button0 = null;
protected UMLabel label0 = null;
protected UMButton button1 = null;
protected XVerticalLayout panel0 = null;
protected UMListViewBase listview0 = null;
protected XHorizontalLayout listview0_childWgt0 = null;
protected UMCheckbox listview0_childWgt0_checkbox0 = null;
protected UMLabel listview0_childWgt0_label0 = null;

	
	protected final static int ID_PSNUPDATEGROUP = 1106213739;
protected final static int ID_VIEWPAGE0 = 349777046;
protected final static int ID_NAVIGATORBAR0 = 782599761;
protected final static int ID_BUTTON0 = 1011616967;
protected final static int ID_LABEL0 = 761632185;
protected final static int ID_BUTTON1 = 1525282630;
protected final static int ID_PANEL0 = 846054037;
protected final static int ID_LISTVIEW0 = 1535919474;
protected final static int ID_LISTVIEW0_CHILDWGT0 = 1594375638;
protected final static int ID_LISTVIEW0_CHILDWGT0_CHECKBOX0 = 2131294956;
protected final static int ID_LISTVIEW0_CHILDWGT0_LABEL0 = 980730126;

	
	
	@Override
	public String getControllerName() {
		return "psnUpdateGroupController";
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
		  idmap.put("psnUpdateGroup",ID_PSNUPDATEGROUP);
  idmap.put("viewPage0",ID_VIEWPAGE0);
  idmap.put("navigatorbar0",ID_NAVIGATORBAR0);
  idmap.put("button0",ID_BUTTON0);
  idmap.put("label0",ID_LABEL0);
  idmap.put("button1",ID_BUTTON1);
  idmap.put("panel0",ID_PANEL0);
  idmap.put("listview0",ID_LISTVIEW0);
  idmap.put("listview0_childWgt0",ID_LISTVIEW0_CHILDWGT0);
  idmap.put("listview0_childWgt0_checkbox0",ID_LISTVIEW0_CHILDWGT0_CHECKBOX0);
  idmap.put("listview0_childWgt0_label0",ID_LISTVIEW0_CHILDWGT0_LABEL0);

	}
	
	public void onLoad() {
		ULog.logLC("onLoad", this);
		if(currentPage!=null) {
			currentPage.onLoad();
		}
	
		{ //listview0 - listViewOnload
    UMEventArgs args = new UMEventArgs(Addr_psnUpdateGroupActivity.this);
    actionListViewOnload(listview0,args);

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
,"halign","LEFT"
,"pressed-image","nav"
,"width","fill"
,"background-image-dis","nav"
,"height","44.0"
,"color","#000000"
,"layout-type","linear"
,"font-size","18"
,"font-family","default"
,"valign","center"
,"background-image","nav.png"
);
button0 = (UMButton)ThirdControl.createControl(new UMButton(context),ID_BUTTON0
,"halign","left"
,"pressed-image","button_touch"
,"width","70"
,"background-image-dis","button"
,"height","44"
,"color","#ff0000"
,"layout-type","linear"
,"font-size","17"
,"onclick","onSave"
,"font-family","default"
,"valign","center"
,"background-image","button"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,button0,"value","#{res.addr_oaadl_0007}"));
button0.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Addr_psnUpdateGroupActivity.this);
    actionOnSave(button0,args);

}
});
navigatorbar0.addView(button0);
label0 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL0
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
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label0,"content","#{res.addr_oaadl_0002}"));
navigatorbar0.addView(label0);
button1 = (UMButton)ThirdControl.createControl(new UMButton(context),ID_BUTTON1
,"halign","right"
,"pressed-image","button_touch"
,"width","70"
,"background-image-dis","button"
,"height","44"
,"color","#ff0000"
,"layout-type","linear"
,"font-size","17"
,"onclick","onCancel"
,"font-family","default"
,"valign","center"
,"background-image","button"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,button1,"value","#{res.addr_oaadl_0008}"));
button1.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Addr_psnUpdateGroupActivity.this);
    actionOnCancel(button1,args);

}
});
navigatorbar0.addView(button1);

return navigatorbar0;
}
public View getListview0_childWgt0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt0 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT0
,"padding-right","15"
,"padding-left","8"
,"height","44"
,"layout-type","linear"
,"width","fill"
,"onclick","setChecked"
,"valign","center"
);
listview0_childWgt0.setOnClickListener(new OnCursorClickListener(configure) {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Addr_psnUpdateGroupActivity.this);
    int position = this.getPosition(v);
    if(position>=0) {
      context.getCursor("cursorpersongroupsalias").setCurrentIndex(position);
    }
    actionSetChecked(listview0_childWgt0,args);

}
});
listview0_childWgt0_checkbox0 = (UMCheckbox)ThirdControl.createControl(new UMCheckbox(context),ID_LISTVIEW0_CHILDWGT0_CHECKBOX0
,"bindfield","isChecked"
,"margin-right","8"
,"height","20"
,"layout-type","linear"
,"width","20"
,"check-on-image","checkbox_select"
,"check-off-image","checkbox_noselect"
,"disabled","disabled"
);
UMCheckBoxBinder listview0_childWgt0_checkbox0_binder = new UMCheckBoxBinder((IUMContextAccessor)context);
listview0_childWgt0_checkbox0_binder.setBindInfo(new BindInfo("isChecked"));
listview0_childWgt0_checkbox0_binder.setControl(listview0_childWgt0_checkbox0);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT0_CHECKBOX0, listview0_childWgt0_checkbox0_binder);
listview0_childWgt0.addView(listview0_childWgt0_checkbox0);
listview0_childWgt0_label0 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT0_LABEL0
,"bindfield","psngroupname"
,"halign","left"
,"height","fill"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","fill"
,"font-family","default"
,"valign","center"
);
UMTextBinder listview0_childWgt0_label0_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt0_label0_binder.setBindInfo(new BindInfo("psngroupname"));
listview0_childWgt0_label0_binder.setControl(listview0_childWgt0_label0);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT0_LABEL0, listview0_childWgt0_label0_binder);
listview0_childWgt0.addView(listview0_childWgt0_label0);

return listview0_childWgt0;
}
public View getListview0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0 = (UMListViewBase)ThirdControl.createControl(new UMListViewBase(context),ID_LISTVIEW0
,"bindfield","persongroups"
,"listview-divider-height","1"
,"childindicator","choosePsnGroupRowWidget"
,"cursoraction","cursorpersongroupsalias"
,"synccontext","persongroups"
,"width","fill"
,"allowdatacollect","true"
,"height","fill"
,"onload","listViewOnload"
,"background","#efeff4"
,"layout-type","linear"
,"listview-divider-color","#c8c7cc"
);
context.createCursor("cursorpersongroupsalias", "persongroups");
UMListBinder listview0_binder = new UMListBinder((IUMContextAccessor)context);
listview0_binder.setBindInfo(new BindInfo("persongroups"));
listview0_binder.setControl(listview0);
binderGroup.addBinderToGroup(ID_LISTVIEW0, listview0_binder);
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
,"valign","TOP"
);
View listview0 = (View) getListview0View((UMActivity)context,binderGroup,configure);
panel0.addView(listview0);

return panel0;
}
public View getViewPage0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
viewPage0 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_VIEWPAGE0
,"halign","center"
,"height","fill"
,"layout-type","vbox"
,"width","fill"
,"valign","TOP"
);
View navigatorbar0 = (View) getNavigatorbar0View((UMActivity)context,binderGroup,configure);
viewPage0.addView(navigatorbar0);
View panel0 = (View) getPanel0View((UMActivity)context,binderGroup,configure);
viewPage0.addView(panel0);

return viewPage0;
}
public UMWindow getCurrentWindow(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
psnUpdateGroup = (UMWindow)ThirdControl.createControl(new UMWindow(context),ID_PSNUPDATEGROUP
,"halign","center"
,"height","fill"
,"layout","vbox"
,"width","fill"
,"context","psnGroupList"
,"controller","psnUpdateGroupController"
,"valign","TOP"
,"namespace","nc.bs.oa.oama.ecm"
);
View viewPage0 = (View) getViewPage0View((UMActivity)context,binderGroup,configure);
psnUpdateGroup.addView(viewPage0);

return (UMWindow)psnUpdateGroup;
}

	
	public void actionUMonInit(View control, UMEventArgs args) {
    String actionid = "UMonInit";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "UMonInit",UMActivity.getViewId(control),args);
}
public void actionInitChecked(View control, UMEventArgs args) {
    String actionid = "initChecked";
  this.dataCollect();
    args.put("crows","#{plug.crows}");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "initChecked",UMActivity.getViewId(control),args);
}
public void actionUMonLoad(View control, UMEventArgs args) {
    String actionid = "UMonLoad";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "UMonLoad",UMActivity.getViewId(control),args);
}
public void actionOnSave(View control, UMEventArgs args) {
    String actionid = "onSave";
  this.dataCollect();
    args.put("psnid","#{plug.psnid}");
    args.put("psnjobid","#{plug.psnjobid}");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "onSave",UMActivity.getViewId(control),args);
}
public void actionUMonUnload(View control, UMEventArgs args) {
    String actionid = "UMonUnload";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "UMonUnload",UMActivity.getViewId(control),args);
}
public void actionSetChecked(View control, UMEventArgs args) {
    String actionid = "setChecked";
    args.put("cindex_arrayPath","persongroups");
    args.put("cindex","#{cursor.cursorpersongroupsalias.index}");
    args.put("containerName","");
    args.put("row","#{#{cursor.cursorpersongroupsalias}}");
    args.put("row_arrayPath","persongroups");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "setChecked",UMActivity.getViewId(control),args);
}
public void actionListViewOnload(View control, UMEventArgs args) {
    String actionid = "listViewOnload";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "listViewOnload",UMActivity.getViewId(control),args);
}
public void actionUMonComplete(View control, UMEventArgs args) {
    String actionid = "UMonComplete";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "UMonComplete",UMActivity.getViewId(control),args);
}
public void actionOnCancel(View control, UMEventArgs args) {
    String actionid = "onCancel";
    args.put("resultcode","15");
    args.put("iskeep","false");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.close(args);
}
public void actionUMonDataBinding(View control, UMEventArgs args) {
    String actionid = "UMonDataBinding";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "UMonDataBinding",UMActivity.getViewId(control),args);
}


}
