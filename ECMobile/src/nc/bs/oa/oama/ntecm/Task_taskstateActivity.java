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

public abstract class Task_taskstateActivity extends UMWindowActivity {

	protected UMWindow taskstateref = null;
protected XVerticalLayout viewPage0 = null;
protected XHorizontalLayout navigatorbar0 = null;
protected UMButton button0 = null;
protected UMLabel label0 = null;
protected UMLabel label1 = null;
protected UMListViewBase listview0 = null;
protected XHorizontalLayout listview0_childWgt0 = null;
protected XHorizontalLayout listview0_childWgt0_rounddiv0 = null;
protected UMLabel listview0_childWgt0_label1 = null;
protected UMLabel listview0_childWgt0_label0 = null;

	
	protected final static int ID_TASKSTATEREF = 396325882;
protected final static int ID_VIEWPAGE0 = 1048019157;
protected final static int ID_NAVIGATORBAR0 = 811366487;
protected final static int ID_BUTTON0 = 1052350045;
protected final static int ID_LABEL0 = 10164640;
protected final static int ID_LABEL1 = 1998918504;
protected final static int ID_LISTVIEW0 = 2080924629;
protected final static int ID_LISTVIEW0_CHILDWGT0 = 1109704755;
protected final static int ID_LISTVIEW0_CHILDWGT0_ROUNDDIV0 = 273252803;
protected final static int ID_LISTVIEW0_CHILDWGT0_LABEL1 = 154106586;
protected final static int ID_LISTVIEW0_CHILDWGT0_LABEL0 = 582597157;

	
	
	@Override
	public String getControllerName() {
		return "";
	}
	
	@Override
	public String getContextName() {
		return "taskstateenum";
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
		{ //viewPage0 - load
    UMEventArgs args = new UMEventArgs(Task_taskstateActivity.this);
    actionLoad(viewPage0,args);

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
		  idmap.put("taskstateref",ID_TASKSTATEREF);
  idmap.put("viewPage0",ID_VIEWPAGE0);
  idmap.put("navigatorbar0",ID_NAVIGATORBAR0);
  idmap.put("button0",ID_BUTTON0);
  idmap.put("label0",ID_LABEL0);
  idmap.put("label1",ID_LABEL1);
  idmap.put("listview0",ID_LISTVIEW0);
  idmap.put("listview0_childWgt0",ID_LISTVIEW0_CHILDWGT0);
  idmap.put("listview0_childWgt0_rounddiv0",ID_LISTVIEW0_CHILDWGT0_ROUNDDIV0);
  idmap.put("listview0_childWgt0_label1",ID_LISTVIEW0_CHILDWGT0_LABEL1);
  idmap.put("listview0_childWgt0_label0",ID_LISTVIEW0_CHILDWGT0_LABEL0);

	}
	
	public void onLoad() {
		ULog.logLC("onLoad", this);
		if(currentPage!=null) {
			currentPage.onLoad();
		}
	
		{ //viewPage0 - load
    UMEventArgs args = new UMEventArgs(Task_taskstateActivity.this);
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
,"height","44"
,"layout-type","linear"
,"font-size","18"
,"background","#FFFFFF"
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
,"onclick","onCancel"
,"font-family","default"
,"valign","center"
,"background-image","btn_back.png"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,button0,"value","#{res.task_back}"));
button0.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Task_taskstateActivity.this);
    actionOnCancel(button0,args);

}
});
navigatorbar0.addView(button0);
label0 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL0
,"halign","center"
,"height","20.0"
,"weight","1"
,"color","#000000"
,"layout-type","linear"
,"font-size","17"
,"width","0"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label0,"content","#{res.task_taskStatus}"));
navigatorbar0.addView(label0);
label1 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL1
,"halign","center"
,"height","14.0"
,"color","#e50011"
,"layout-type","linear"
,"font-size","12"
,"width","60"
,"font-family","default"
,"valign","center"
);
navigatorbar0.addView(label1);

return navigatorbar0;
}
public View getListview0_childWgt0_rounddiv0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt0_rounddiv0 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT0_ROUNDDIV0
,"padding-left","15"
,"height","fill"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"valign","center"
);
listview0_childWgt0_label1 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT0_LABEL1
,"bindfield","enumid"
,"halign","center"
,"height","14.0"
,"color","#000000"
,"layout-type","linear"
,"font-size","12"
,"width","32.0"
,"font-family","default"
,"display","none"
,"valign","center"
);
UMTextBinder listview0_childWgt0_label1_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt0_label1_binder.setBindInfo(new BindInfo("enumid"));
listview0_childWgt0_label1_binder.setControl(listview0_childWgt0_label1);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT0_LABEL1, listview0_childWgt0_label1_binder);
listview0_childWgt0_rounddiv0.addView(listview0_childWgt0_label1);
listview0_childWgt0_label0 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT0_LABEL0
,"bindfield","enumname"
,"halign","left"
,"height","fill"
,"color","#000000"
,"layout-type","linear"
,"font-size","16"
,"width","100"
,"font-family","default"
,"valign","center"
);
UMTextBinder listview0_childWgt0_label0_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt0_label0_binder.setBindInfo(new BindInfo("enumname"));
listview0_childWgt0_label0_binder.setControl(listview0_childWgt0_label0);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT0_LABEL0, listview0_childWgt0_label0_binder);
listview0_childWgt0_rounddiv0.addView(listview0_childWgt0_label0);

return listview0_childWgt0_rounddiv0;
}
public View getListview0_childWgt0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt0 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT0
,"height","44"
,"layout-type","linear"
,"background","#E6E6E6"
,"width","fill"
,"onclick","onClickListRow"
,"valign","center"
);
listview0_childWgt0.setOnClickListener(new OnCursorClickListener(configure) {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Task_taskstateActivity.this);
    int position = this.getPosition(v);
    if(position>=0) {
      context.getCursor("cursorenumlistalias").setCurrentIndex(position);
    }
    actionOnClickListRow(listview0_childWgt0,args);

}
});
View listview0_childWgt0_rounddiv0 = (View) getListview0_childWgt0_rounddiv0View((UMActivity)context,binderGroup,configure);
listview0_childWgt0.addView(listview0_childWgt0_rounddiv0);

return listview0_childWgt0;
}
public View getListview0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0 = (UMListViewBase)ThirdControl.createControl(new UMListViewBase(context),ID_LISTVIEW0
,"listview-divider-height","1"
,"bindfield","enumlist"
,"height","0"
,"weight","1"
,"childindicator","taskstateRowWidget"
,"cursoraction","cursorenumlistalias"
,"layout-type","linear"
,"width","fill"
,"synccontext","enumlist"
,"background-image","listview.png"
);
context.createCursor("cursorenumlistalias", "enumlist");
UMListBinder listview0_binder = new UMListBinder((IUMContextAccessor)context);
listview0_binder.setBindInfo(new BindInfo("enumlist"));
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
,"background","#F5F5F5"
,"width","fill"
,"onresume","load"
);
View navigatorbar0 = (View) getNavigatorbar0View((UMActivity)context,binderGroup,configure);
viewPage0.addView(navigatorbar0);
View listview0 = (View) getListview0View((UMActivity)context,binderGroup,configure);
viewPage0.addView(listview0);

return viewPage0;
}
public UMWindow getCurrentWindow(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
taskstateref = (UMWindow)ThirdControl.createControl(new UMWindow(context),ID_TASKSTATEREF
,"halign","center"
,"height","fill"
,"layout","vbox"
,"width","fill"
,"context","taskstateenum"
,"namespace","nc.bs.oa.oama.ecm"
);
View viewPage0 = (View) getViewPage0View((UMActivity)context,binderGroup,configure);
taskstateref.addView(viewPage0);

return (UMWindow)taskstateref;
}

	
	public void actionOnClickListRow(View control, UMEventArgs args) {
    String actionid = "onClickListRow";
    args.put("result","#{#{cursor.cursorenumlistalias}}");
    args.put("result_arrayPath","enumlist");
  this.dataCollect();
    args.put("resultCode","15");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.close(args);
}
public void actionLoad(View control, UMEventArgs args) {
    String actionid = "load";
    args.put("viewid","nc.bs.oa.oama.oatask.DetailtaskExtendController");
  this.dataCollect();
    args.put("action","getEnumList");
    args.put("autoDataBinding","true");
    args.put("params","{\"enumtype\":\"2\"}");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMService.callAction(args);
}
public void actionOnCancel(View control, UMEventArgs args) {
    String actionid = "onCancel";
    args.put("resultcode","0");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.close(args);
}


}
