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

public abstract class Scdu_repeatdayrefActivity extends UMWindowActivity {

	protected UMWindow repeatdayref = null;
protected XVerticalLayout viewPage0 = null;
protected XHorizontalLayout navigatorbar0 = null;
protected UMButton button1 = null;
protected UMLabel label0 = null;
protected UMButton button0 = null;
protected UMListViewBase listview0 = null;
protected XVerticalLayout listview0_childWgt0 = null;
protected XHorizontalLayout listview0_childWgt0_panel0 = null;
protected UMCheckbox listview0_childWgt0_checkbox0 = null;
protected UMLabel listview0_childWgt0_label0 = null;
protected XHorizontalLayout listview0_childWgt0_panel2 = null;

	
	protected final static int ID_REPEATDAYREF = 2013247262;
protected final static int ID_VIEWPAGE0 = 1835088813;
protected final static int ID_NAVIGATORBAR0 = 64774252;
protected final static int ID_BUTTON1 = 381486643;
protected final static int ID_LABEL0 = 329687373;
protected final static int ID_BUTTON0 = 796296250;
protected final static int ID_LISTVIEW0 = 1302822883;
protected final static int ID_LISTVIEW0_CHILDWGT0 = 416034806;
protected final static int ID_LISTVIEW0_CHILDWGT0_PANEL0 = 703206301;
protected final static int ID_LISTVIEW0_CHILDWGT0_CHECKBOX0 = 88244362;
protected final static int ID_LISTVIEW0_CHILDWGT0_LABEL0 = 875624944;
protected final static int ID_LISTVIEW0_CHILDWGT0_PANEL2 = 725261370;

	
	
	@Override
	public String getControllerName() {
		return "repeatdayrefController";
	}
	
	@Override
	public String getContextName() {
		return "eventDetail";
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
		  idmap.put("repeatdayref",ID_REPEATDAYREF);
  idmap.put("viewPage0",ID_VIEWPAGE0);
  idmap.put("navigatorbar0",ID_NAVIGATORBAR0);
  idmap.put("button1",ID_BUTTON1);
  idmap.put("label0",ID_LABEL0);
  idmap.put("button0",ID_BUTTON0);
  idmap.put("listview0",ID_LISTVIEW0);
  idmap.put("listview0_childWgt0",ID_LISTVIEW0_CHILDWGT0);
  idmap.put("listview0_childWgt0_panel0",ID_LISTVIEW0_CHILDWGT0_PANEL0);
  idmap.put("listview0_childWgt0_checkbox0",ID_LISTVIEW0_CHILDWGT0_CHECKBOX0);
  idmap.put("listview0_childWgt0_label0",ID_LISTVIEW0_CHILDWGT0_LABEL0);
  idmap.put("listview0_childWgt0_panel2",ID_LISTVIEW0_CHILDWGT0_PANEL2);

	}
	
	public void onLoad() {
		ULog.logLC("onLoad", this);
		if(currentPage!=null) {
			currentPage.onLoad();
		}
	
		{ //viewPage0 - load
    UMEventArgs args = new UMEventArgs(Scdu_repeatdayrefActivity.this);
    actionLoad(viewPage0,args);

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
,"padding-right","5"
,"padding-left","5"
,"height","44.0"
,"layout-type","linear"
,"background","#FFFFFF"
,"width","fill"
,"valign","center"
,"background-image","nav.png"
);
button1 = (UMButton)ThirdControl.createControl(new UMButton(context),ID_BUTTON1
,"halign","center"
,"pressed-image","btn_back_touch"
,"width","64"
,"background-image-dis","button"
,"font-pressed-color","#f2adb2"
,"height","44"
,"color","#e50011"
,"layout-type","linear"
,"font-size","17"
,"onclick","onCancel"
,"font-family","default"
,"valign","center"
,"background-image","btn_back"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,button1,"value","#{res.scdu_oascheduler_0001}"));
button1.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Scdu_repeatdayrefActivity.this);
    actionOnCancel(button1,args);

}
});
navigatorbar0.addView(button1);
label0 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL0
,"halign","center"
,"height","fill"
,"weight","1"
,"color","#000000"
,"layout-type","linear"
,"font-size","16"
,"width","0"
,"font-family","Serif"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label0,"content","#{res.scdu_oascheduler_0034}"));
navigatorbar0.addView(label0);
button0 = (UMButton)ThirdControl.createControl(new UMButton(context),ID_BUTTON0
,"halign","right"
,"width","64"
,"font-pressed-color","#f2adb2"
,"height","fill"
,"color","#e50011"
,"font-size","17"
,"layout-type","linear"
,"onclick","returnResult"
,"font-family","Serif"
,"valign","center"
,"background-image","button.png"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,button0,"value","#{res.scdu_oascheduler_0038}"));
button0.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Scdu_repeatdayrefActivity.this);
    actionReturnResult(button0,args);

}
});
navigatorbar0.addView(button0);

return navigatorbar0;
}
public View getListview0_childWgt0_panel0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt0_panel0 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT0_PANEL0
,"padding-right","8"
,"padding-left","8"
,"height","43"
,"layout-type","linear"
,"width","fill"
,"onclick","setChecked"
,"valign","center"
);
listview0_childWgt0_panel0.setOnClickListener(new OnCursorClickListener(configure) {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Scdu_repeatdayrefActivity.this);
    int position = this.getPosition(v);
    if(position>=0) {
      context.getCursor("cursoronClickListRowalias").setCurrentIndex(position);
    }
    actionSetChecked(listview0_childWgt0_panel0,args);

}
});
listview0_childWgt0_checkbox0 = (UMCheckbox)ThirdControl.createControl(new UMCheckbox(context),ID_LISTVIEW0_CHILDWGT0_CHECKBOX0
,"bindfield","isChecked"
,"margin-right","8"
,"height","20"
,"layout-type","linear"
,"width","20"
,"check-on-image","checkbox_select"
,"onclick","setChecked"
,"check-off-image","checkbox_noselect"
,"disabled","disabled"
);
UMCheckBoxBinder listview0_childWgt0_checkbox0_binder = new UMCheckBoxBinder((IUMContextAccessor)context);
listview0_childWgt0_checkbox0_binder.setBindInfo(new BindInfo("isChecked"));
listview0_childWgt0_checkbox0_binder.setControl(listview0_childWgt0_checkbox0);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT0_CHECKBOX0, listview0_childWgt0_checkbox0_binder);
listview0_childWgt0_checkbox0.setOnClickListener(new OnCursorClickListener(configure) {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Scdu_repeatdayrefActivity.this);
    int position = this.getPosition(v);
    if(position>=0) {
      context.getCursor("cursoronClickListRowalias").setCurrentIndex(position);
    }
    actionSetChecked(listview0_childWgt0_checkbox0,args);

}
});
listview0_childWgt0_panel0.addView(listview0_childWgt0_checkbox0);
listview0_childWgt0_label0 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT0_LABEL0
,"bindfield","name"
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
listview0_childWgt0_label0_binder.setBindInfo(new BindInfo("name"));
listview0_childWgt0_label0_binder.setControl(listview0_childWgt0_label0);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT0_LABEL0, listview0_childWgt0_label0_binder);
listview0_childWgt0_panel0.addView(listview0_childWgt0_label0);

return listview0_childWgt0_panel0;
}
public View getListview0_childWgt0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt0 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_LISTVIEW0_CHILDWGT0
,"halign","center"
,"height","44"
,"layout-type","linear"
,"width","fill"
,"background","#ffffff"
);
View listview0_childWgt0_panel0 = (View) getListview0_childWgt0_panel0View((UMActivity)context,binderGroup,configure);
listview0_childWgt0.addView(listview0_childWgt0_panel0);
listview0_childWgt0_panel2 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT0_PANEL2
,"height","1"
,"layout-type","linear"
,"width","fill"
,"background","#c8c7cc"
,"valign","center"
);
listview0_childWgt0.addView(listview0_childWgt0_panel2);

return listview0_childWgt0;
}
public View getListview0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0 = (UMListViewBase)ThirdControl.createControl(new UMListViewBase(context),ID_LISTVIEW0
,"bindfield","repeatdayresfs"
,"height","0"
,"weight","1"
,"childindicator","repeatdayrefRowWidget"
,"cursoraction","cursoronClickListRowalias"
,"layout-type","linear"
,"width","fill"
,"allowdatacollect","true"
,"synccontext","repeatdayresfs"
,"background-image","listview.png"
);
context.createCursor("cursoronClickListRowalias", "repeatdayresfs");
UMListBinder listview0_binder = new UMListBinder((IUMContextAccessor)context);
listview0_binder.setBindInfo(new BindInfo("repeatdayresfs"));
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
public View getViewPage0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
viewPage0 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_VIEWPAGE0
,"halign","center"
,"height","fill"
,"onload","load"
,"layout-type","vbox"
,"background","#FFFFFF"
,"width","fill"
);
View navigatorbar0 = (View) getNavigatorbar0View((UMActivity)context,binderGroup,configure);
viewPage0.addView(navigatorbar0);
View listview0 = (View) getListview0View((UMActivity)context,binderGroup,configure);
viewPage0.addView(listview0);

return viewPage0;
}
public UMWindow getCurrentWindow(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
repeatdayref = (UMWindow)ThirdControl.createControl(new UMWindow(context),ID_REPEATDAYREF
,"halign","center"
,"height","fill"
,"layout","vbox"
,"width","fill"
,"context","eventDetail"
,"controller","repeatdayrefController"
,"namespace","nc.bs.oa.oama.ecm"
);
View viewPage0 = (View) getViewPage0View((UMActivity)context,binderGroup,configure);
repeatdayref.addView(viewPage0);

return (UMWindow)repeatdayref;
}

	
	public void actionReturnResult(View control, UMEventArgs args) {
    String actionid = "returnResult";
    args.put("result","#{CONTEXT}");
  this.dataCollect();
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "returnResult",UMActivity.getViewId(control),args);
}
public void actionInitChecked(View control, UMEventArgs args) {
    String actionid = "initChecked";
  this.dataCollect();
    args.put("crows","#{plug.crows}");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "initChecked",UMActivity.getViewId(control),args);
}
public void actionLoad(View control, UMEventArgs args) {
    String actionid = "load";
    args.put("viewid","nc.bs.oa.oama.scheduler.RepeatRull1ExtendController");
    args.put("callback","initChecked");
    args.put("action","getRepeatdayList");
    args.put("autoDataBinding","true");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMService.callAction(args);
}
public void actionSetChecked(View control, UMEventArgs args) {
    String actionid = "setChecked";
    args.put("crow_arrayPath","repeatdayresfs");
    args.put("cindex_arrayPath","repeatdayresfs");
  this.dataCollect();
    args.put("crow","#{#{cursor.cursoronClickListRowalias}}");
    args.put("cindex","#{cursor.cursoronClickListRowalias.index}");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "setChecked",UMActivity.getViewId(control),args);
}
public void actionOnCancel(View control, UMEventArgs args) {
    String actionid = "onCancel";
    args.put("resultcode","0");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.close(args);
}


}
