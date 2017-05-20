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

public abstract class Task_responserefcopyActivity extends UMWindowActivity {

	protected UMWindow responserefcopywin = null;
protected XVerticalLayout viewPage0 = null;
protected XHorizontalLayout navigatorbar0 = null;
protected UMButton button0 = null;
protected UMLabel label0 = null;
protected XHorizontalLayout viewTitle = null;
protected UMSearchControl search0 = null;
protected UMListViewBase listview0 = null;
protected XVerticalLayout listview0_childWgt0 = null;
protected XHorizontalLayout listview0_childWgt0_panel0 = null;
protected UMLabel listview0_childWgt0_label1 = null;
protected UMCheckbox listview0_childWgt0_checkbox0 = null;
protected UMLabel listview0_childWgt0_label0 = null;
protected UMLabel listview0_childWgt0_label2 = null;
protected XHorizontalLayout listview0_childWgt0_panel1 = null;

	
	protected final static int ID_RESPONSEREFCOPYWIN = 1228712432;
protected final static int ID_VIEWPAGE0 = 122298601;
protected final static int ID_NAVIGATORBAR0 = 370505027;
protected final static int ID_BUTTON0 = 952737303;
protected final static int ID_LABEL0 = 1801889947;
protected final static int ID_VIEWTITLE = 173975109;
protected final static int ID_SEARCH0 = 1296474462;
protected final static int ID_LISTVIEW0 = 1793360174;
protected final static int ID_LISTVIEW0_CHILDWGT0 = 1105810943;
protected final static int ID_LISTVIEW0_CHILDWGT0_PANEL0 = 1501706909;
protected final static int ID_LISTVIEW0_CHILDWGT0_LABEL1 = 404896422;
protected final static int ID_LISTVIEW0_CHILDWGT0_CHECKBOX0 = 1308419585;
protected final static int ID_LISTVIEW0_CHILDWGT0_LABEL0 = 952389486;
protected final static int ID_LISTVIEW0_CHILDWGT0_LABEL2 = 1080958172;
protected final static int ID_LISTVIEW0_CHILDWGT0_PANEL1 = 1277038274;

	
	
	@Override
	public String getControllerName() {
		return "responserefcopyController";
	}
	
	@Override
	public String getContextName() {
		return "responseref";
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
		  idmap.put("responserefcopywin",ID_RESPONSEREFCOPYWIN);
  idmap.put("viewPage0",ID_VIEWPAGE0);
  idmap.put("navigatorbar0",ID_NAVIGATORBAR0);
  idmap.put("button0",ID_BUTTON0);
  idmap.put("label0",ID_LABEL0);
  idmap.put("viewTitle",ID_VIEWTITLE);
  idmap.put("search0",ID_SEARCH0);
  idmap.put("listview0",ID_LISTVIEW0);
  idmap.put("listview0_childWgt0",ID_LISTVIEW0_CHILDWGT0);
  idmap.put("listview0_childWgt0_panel0",ID_LISTVIEW0_CHILDWGT0_PANEL0);
  idmap.put("listview0_childWgt0_label1",ID_LISTVIEW0_CHILDWGT0_LABEL1);
  idmap.put("listview0_childWgt0_checkbox0",ID_LISTVIEW0_CHILDWGT0_CHECKBOX0);
  idmap.put("listview0_childWgt0_label0",ID_LISTVIEW0_CHILDWGT0_LABEL0);
  idmap.put("listview0_childWgt0_label2",ID_LISTVIEW0_CHILDWGT0_LABEL2);
  idmap.put("listview0_childWgt0_panel1",ID_LISTVIEW0_CHILDWGT0_PANEL1);

	}
	
	public void onLoad() {
		ULog.logLC("onLoad", this);
		if(currentPage!=null) {
			currentPage.onLoad();
		}
	
		{ //listview0 - refload
    UMEventArgs args = new UMEventArgs(Task_responserefcopyActivity.this);
    actionRefload(listview0,args);

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
,"padding-left","5"
,"padding-right","5"
,"height","44"
,"layout-type","linear"
,"background","#FFFFFF"
,"font-size","18"
,"width","fill"
,"font-family","default"
,"valign","center"
,"background-image","nav.png"
);
button0 = (UMButton)ThirdControl.createControl(new UMButton(context),ID_BUTTON0
,"halign","center"
,"pressed-image","btn_back_touch.png"
,"width","64"
,"background-image-dis","button"
,"height","44"
,"color","#e50011"
,"layout-type","linear"
,"font-size","17"
,"onclick","okbtn"
,"font-family","default"
,"valign","center"
,"background-image","btn_back.png"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,button0,"value","#{res.task_back}"));
button0.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Task_responserefcopyActivity.this);
    actionOkbtn(button0,args);

}
});
navigatorbar0.addView(button0);
label0 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL0
,"margin-right","64"
,"halign","center"
,"height","20"
,"weight","1"
,"color","#000000"
,"layout-type","linear"
,"font-size","17"
,"width","0"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label0,"content","#{res.task_person}"));
navigatorbar0.addView(label0);

return navigatorbar0;
}
public View getViewTitleView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
viewTitle = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_VIEWTITLE
,"height","40"
,"layout-type","linear"
,"background","#efeff4"
,"width","fill"
,"valign","center"
);
search0 = (UMSearchControl)ThirdControl.createControl(new UMSearchControl(context),ID_SEARCH0
,"localstorage","true"
,"font","default"
,"width","fill"
,"height","44"
,"search-btn-icon","search_left.png"
,"color","#000000"
,"font-size","15"
,"layout-type","linear"
,"search-del-icon","search_right.png"
,"onsearch","serchkeyword"
,"background-image","search_bg"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,search0,"placeholder","#{res.task_personDept}"));
search0.setEvent("onsearch", new OnCursorEventListener(configure) {
  @Override
  public void onEvent(View v, UMEventArgs parent) {
    UMEventArgs args = new UMEventArgs(Task_responserefcopyActivity.this);
    args.put(parent);
    actionSerchkeyword(search0,args);

}
});
viewTitle.addView(search0);

return viewTitle;
}
public View getListview0_childWgt0_panel0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt0_panel0 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT0_PANEL0
,"padding-left","15"
,"padding-right","15"
,"height","59"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"onclick","onEmptyClick"
,"valign","center"
);
listview0_childWgt0_panel0.setOnClickListener(new OnCursorClickListener(configure) {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Task_responserefcopyActivity.this);
    int position = this.getPosition(v);
    if(position>=0) {
      context.getCursor("cursorstafflistalias").setCurrentIndex(position);
    }
    actionOnEmptyClick(listview0_childWgt0_panel0,args);

}
});
listview0_childWgt0_label1 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT0_LABEL1
,"bindfield","staffid"
,"halign","center"
,"height","14"
,"color","#000000"
,"layout-type","linear"
,"font-size","12"
,"width","32"
,"font-family","default"
,"display","none"
,"valign","center"
);
UMTextBinder listview0_childWgt0_label1_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt0_label1_binder.setBindInfo(new BindInfo("staffid"));
listview0_childWgt0_label1_binder.setControl(listview0_childWgt0_label1);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT0_LABEL1, listview0_childWgt0_label1_binder);
listview0_childWgt0_panel0.addView(listview0_childWgt0_label1);
listview0_childWgt0_checkbox0 = (UMCheckbox)ThirdControl.createControl(new UMCheckbox(context),ID_LISTVIEW0_CHILDWGT0_CHECKBOX0
,"bindfield","ischecked"
,"height","20"
,"layout-type","linear"
,"width","20"
,"check-on-image","checkbox_select.png"
,"check-off-image","checkbox_noselect.png"
,"disabled","disabled"
);
UMCheckBoxBinder listview0_childWgt0_checkbox0_binder = new UMCheckBoxBinder((IUMContextAccessor)context);
listview0_childWgt0_checkbox0_binder.setBindInfo(new BindInfo("ischecked"));
listview0_childWgt0_checkbox0_binder.setControl(listview0_childWgt0_checkbox0);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT0_CHECKBOX0, listview0_childWgt0_checkbox0_binder);
listview0_childWgt0_panel0.addView(listview0_childWgt0_checkbox0);
listview0_childWgt0_label0 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT0_LABEL0
,"bindfield","nsme"
,"halign","left"
,"width","100"
,"margin-bottom","1"
,"content","label"
,"height","59"
,"color","#000000"
,"font-size","16"
,"layout-type","linear"
,"margin-left","5"
,"font-family","default"
,"valign","center"
);
UMTextBinder listview0_childWgt0_label0_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt0_label0_binder.setBindInfo(new BindInfo("nsme"));
listview0_childWgt0_label0_binder.setControl(listview0_childWgt0_label0);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT0_LABEL0, listview0_childWgt0_label0_binder);
listview0_childWgt0_panel0.addView(listview0_childWgt0_label0);
listview0_childWgt0_label2 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT0_LABEL2
,"bindfield","department"
,"halign","right"
,"height","59"
,"weight","1"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","0"
,"margin-bottom","1"
,"font-family","default"
,"valign","center"
);
UMTextBinder listview0_childWgt0_label2_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt0_label2_binder.setBindInfo(new BindInfo("department"));
listview0_childWgt0_label2_binder.setControl(listview0_childWgt0_label2);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT0_LABEL2, listview0_childWgt0_label2_binder);
listview0_childWgt0_panel0.addView(listview0_childWgt0_label2);

return listview0_childWgt0_panel0;
}
public View getListview0_childWgt0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt0 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_LISTVIEW0_CHILDWGT0
,"halign","center"
,"height","60.0"
,"layout-type","linear"
,"width","fill"
);
View listview0_childWgt0_panel0 = (View) getListview0_childWgt0_panel0View((UMActivity)context,binderGroup,configure);
listview0_childWgt0.addView(listview0_childWgt0_panel0);
listview0_childWgt0_panel1 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT0_PANEL1
,"height","1"
,"layout-type","linear"
,"background","#c8c7cc"
,"width","fill"
,"valign","center"
);
listview0_childWgt0.addView(listview0_childWgt0_panel1);

return listview0_childWgt0;
}
public View getListview0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0 = (UMListViewBase)ThirdControl.createControl(new UMListViewBase(context),ID_LISTVIEW0
,"bindfield","stafflist"
,"childindicator","responserefcopyRowWidget"
,"weight","1"
,"cursoraction","cursorstafflistalias"
,"synccontext","stafflist"
,"allowdatacollect","true"
,"width","fill"
,"height","0"
,"ondownrefersh","getnextpage"
,"onload","refload"
,"layout-type","linear"
,"background","#efeff4"
,"listview-divider-color","#c8c7cc"
,"background-image","listview.png"
);
context.createCursor("cursorstafflistalias", "stafflist");
UMListBinder listview0_binder = new UMListBinder((IUMContextAccessor)context);
listview0_binder.setBindInfo(new BindInfo("stafflist"));
listview0_binder.setControl(listview0);
binderGroup.addBinderToGroup(ID_LISTVIEW0, listview0_binder);
listview0.setEvent("ondownrefersh", new OnCursorEventListener(configure) {
  @Override
  public void onEvent(View v, UMEventArgs parent) {
    UMEventArgs args = new UMEventArgs(Task_responserefcopyActivity.this);
    args.put(parent);
    actionGetnextpage(listview0,args);

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
public View getViewPage0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
viewPage0 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_VIEWPAGE0
,"halign","center"
,"height","fill"
,"layout-type","vbox"
,"background","#efeff4"
,"width","fill"
);
View navigatorbar0 = (View) getNavigatorbar0View((UMActivity)context,binderGroup,configure);
viewPage0.addView(navigatorbar0);
View viewTitle = (View) getViewTitleView((UMActivity)context,binderGroup,configure);
viewPage0.addView(viewTitle);
View listview0 = (View) getListview0View((UMActivity)context,binderGroup,configure);
viewPage0.addView(listview0);

return viewPage0;
}
public UMWindow getCurrentWindow(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
responserefcopywin = (UMWindow)ThirdControl.createControl(new UMWindow(context),ID_RESPONSEREFCOPYWIN
,"halign","center"
,"height","fill"
,"layout","vbox"
,"width","fill"
,"context","responseref"
,"controller","responserefcopyController"
,"namespace","nc.bs.oa.oama.ecm"
);
View viewPage0 = (View) getViewPage0View((UMActivity)context,binderGroup,configure);
responserefcopywin.addView(viewPage0);

return (UMWindow)responserefcopywin;
}

	
	public void actionSearchcallback(View control, UMEventArgs args) {
    String actionid = "searchcallback";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "searchcallback",UMActivity.getViewId(control),args);
}
public void actionGetnextpage(View control, UMEventArgs args) {
    String actionid = "getnextpage";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "getnextpage",UMActivity.getViewId(control),args);
}
public void actionRefload(View control, UMEventArgs args) {
    String actionid = "refload";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "refload",UMActivity.getViewId(control),args);
}
public void actionOkbtn(View control, UMEventArgs args) {
    String actionid = "okbtn";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "okbtn",UMActivity.getViewId(control),args);
}
public void actionLoad(View control, UMEventArgs args) {
    String actionid = "load";
    args.put("viewid","nc.bs.oa.oama.oatask.DetailtaskExtendController");
    args.put("action","getStaffList");
    args.put("autoDataBinding","true");
    args.put("containerName","");
    args.put("checkrows","#{plug.checkrows}");
  ActionProcessor.exec(this, actionid, args);
UMService.callAction(args);
}
public void actionSerchkeyword(View control, UMEventArgs args) {
    String actionid = "serchkeyword";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "serchkeyword",UMActivity.getViewId(control),args);
}
public void actionOnEmptyClick(View control, UMEventArgs args) {
    String actionid = "onEmptyClick";
    args.put("rowindex_arrayPath","stafflist");
    args.put("rowindex","#{cursor.cursorstafflistalias.index}");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "onEmptyClick",UMActivity.getViewId(control),args);
}
public void actionOnCancel(View control, UMEventArgs args) {
    String actionid = "onCancel";
    args.put("resultcode","0");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.close(args);
}


}
