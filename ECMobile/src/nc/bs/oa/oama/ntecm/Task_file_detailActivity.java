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

public abstract class Task_file_detailActivity extends UMWindowActivity {

	protected UMWindow file_detail = null;
protected XVerticalLayout viewPage0 = null;
protected XHorizontalLayout navigatorbar0 = null;
protected UMButton button0 = null;
protected UMLabel label0 = null;
protected UMButton button2 = null;
protected UMListViewBase listviewdefine0 = null;
protected XHorizontalLayout panel1 = null;
protected UMLabel label1 = null;
protected UMLabel label2 = null;
protected UMButton button1 = null;

	
	protected final static int ID_FILE_DETAIL = 190206599;
protected final static int ID_VIEWPAGE0 = 307096774;
protected final static int ID_NAVIGATORBAR0 = 447841079;
protected final static int ID_BUTTON0 = 194277854;
protected final static int ID_LABEL0 = 625241132;
protected final static int ID_BUTTON2 = 770992281;
protected final static int ID_LISTVIEWDEFINE0 = 822294736;
protected final static int ID_PANEL1 = 522319727;
protected final static int ID_LABEL1 = 1042654759;
protected final static int ID_LABEL2 = 1638831963;
protected final static int ID_BUTTON1 = 1784138184;

	
	
	@Override
	public String getControllerName() {
		return "file_detailController";
	}
	
	@Override
	public String getContextName() {
		return "filelist";
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
		  idmap.put("file_detail",ID_FILE_DETAIL);
  idmap.put("viewPage0",ID_VIEWPAGE0);
  idmap.put("navigatorbar0",ID_NAVIGATORBAR0);
  idmap.put("button0",ID_BUTTON0);
  idmap.put("label0",ID_LABEL0);
  idmap.put("button2",ID_BUTTON2);
  idmap.put("listviewdefine0",ID_LISTVIEWDEFINE0);
  idmap.put("panel1",ID_PANEL1);
  idmap.put("label1",ID_LABEL1);
  idmap.put("label2",ID_LABEL2);
  idmap.put("button1",ID_BUTTON1);

	}
	
	public void onLoad() {
		ULog.logLC("onLoad", this);
		if(currentPage!=null) {
			currentPage.onLoad();
		}
	
		{ //listviewdefine0 - fileonload
    UMEventArgs args = new UMEventArgs(Task_file_detailActivity.this);
    actionFileonload(listviewdefine0,args);

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
,"height","44.0"
,"color","#000000"
,"pressed-image","nav"
,"width","fill"
,"font-size","18"
,"layout-type","linear"
,"background-image-dis","nav"
,"font-family","default"
,"valign","center"
,"background-image","nav.png"
);
button0 = (UMButton)ThirdControl.createControl(new UMButton(context),ID_BUTTON0
,"halign","center"
,"pressed-image","btn_back_touch"
,"width","64"
,"background-image-dis","button"
,"height","44"
,"color","#e50011"
,"layout-type","linear"
,"font-size","17"
,"onclick","returnback"
,"font-family","default"
,"valign","center"
,"background-image","btn_back"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,button0,"value","#{res.task_back}"));
button0.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Task_file_detailActivity.this);
    actionReturnback(button0,args);

}
});
navigatorbar0.addView(button0);
label0 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL0
,"halign","center"
,"height","30"
,"weight","1"
,"color","#000000"
,"layout-type","linear"
,"font-size","17"
,"width","0"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label0,"content","#{res.task_attachmentList}"));
navigatorbar0.addView(label0);
button2 = (UMButton)ThirdControl.createControl(new UMButton(context),ID_BUTTON2
,"halign","center"
,"visible","false"
,"pressed-image","oatask_add_clicktouch.png"
,"width","44"
,"background-image-dis","button"
,"height","44"
,"color","#e50011"
,"font-size","18"
,"layout-type","linear"
,"font-family","default"
,"valign","center"
,"background-image","oatask_add_click.png"
);
navigatorbar0.addView(button2);

return navigatorbar0;
}
public View getPanel1View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel1 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL1
,"padding-left","15"
,"padding-right","15"
,"height","44"
,"layout-type","vbox"
,"width","fill"
,"onclick","downloadpic"
,"valign","center"
,"background-image","oatask_list_split.png"
);
panel1.setOnClickListener(new OnCursorClickListener(configure) {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Task_file_detailActivity.this);
    int position = this.getPosition(v);
    if(position>=0) {
      context.getCursor("cursorattachmentalias").setCurrentIndex(position);
    }
    actionDownloadpic(panel1,args);

}
});
label1 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL1
,"content","label"
,"bindfield","filename"
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
UMTextBinder label1_binder = new UMTextBinder((IUMContextAccessor)context);
label1_binder.setBindInfo(new BindInfo("filename"));
label1_binder.setControl(label1);
binderGroup.addBinderToGroup(ID_LABEL1, label1_binder);
panel1.addView(label1);
label2 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL2
,"content","label"
,"bindfield","filesize"
,"halign","right"
,"height","fill"
,"color","#8e8e93"
,"layout-type","linear"
,"font-size","16"
,"width","80"
,"font-family","default"
,"valign","center"
);
UMTextBinder label2_binder = new UMTextBinder((IUMContextAccessor)context);
label2_binder.setBindInfo(new BindInfo("filesize"));
label2_binder.setControl(label2);
binderGroup.addBinderToGroup(ID_LABEL2, label2_binder);
panel1.addView(label2);
button1 = (UMButton)ThirdControl.createControl(new UMButton(context),ID_BUTTON1
,"halign","center"
,"height","fill"
,"color","#8e8e93"
,"layout-type","linear"
,"font-size","16"
,"width","30"
,"value","KB"
,"background-image-dis","button"
,"font-family","default"
,"valign","center"
);
panel1.addView(button1);

return panel1;
}
public View getListviewdefine0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listviewdefine0 = (UMListViewBase)ThirdControl.createControl(new UMListViewBase(context),ID_LISTVIEWDEFINE0
,"bindfield","attachment"
,"halign","center"
,"height","fill"
,"onload","fileonload"
,"cursoraction","cursorattachmentalias"
,"layout","vbox"
,"background","#efeff4"
,"width","fill"
,"synccontext","attachment"
,"margin-top","15"
,"listview-divider-color","#c8c7cc"
);
context.createCursor("cursorattachmentalias", "attachment");
UMListBinder listviewdefine0_binder = new UMListBinder((IUMContextAccessor)context);
listviewdefine0_binder.setBindInfo(new BindInfo("attachment"));
listviewdefine0_binder.setControl(listviewdefine0);
binderGroup.addBinderToGroup(ID_LISTVIEWDEFINE0, listviewdefine0_binder);
listviewdefine0.addListItemView(new UMListViewBase.ListItemView() {
	public View getItemView(Context context, View parent, IBinderGroup binderGroup,int position) {
  UMDslConfigure configure = new UMDslConfigure();
  configure.put("position",position);
View panel1 = (View) getPanel1View((UMActivity)context,binderGroup,configure);
return panel1;
}});

return listviewdefine0;
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
View listviewdefine0 = (View) getListviewdefine0View((UMActivity)context,binderGroup,configure);
viewPage0.addView(listviewdefine0);

return viewPage0;
}
public UMWindow getCurrentWindow(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
file_detail = (UMWindow)ThirdControl.createControl(new UMWindow(context),ID_FILE_DETAIL
,"halign","center"
,"height","fill"
,"layout","vbox"
,"width","fill"
,"context","filelist"
,"controller","file_detailController"
,"namespace","nc.bs.oa.oama.ecm"
);
View viewPage0 = (View) getViewPage0View((UMActivity)context,binderGroup,configure);
file_detail.addView(viewPage0);

return (UMWindow)file_detail;
}

	
	public void actionUploadpic(View control, UMEventArgs args) {
    String actionid = "uploadpic";
  this.dataCollect();
    args.put("callback","fileitem");
    args.put("contextmapping","uploadFile");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMService.uploadImage(args);
}
public void actionReturnback(View control, UMEventArgs args) {
    String actionid = "returnback";
    args.put("resultcode","15");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.close(args);
}
public void actionDelitem(View control, UMEventArgs args) {
    String actionid = "delitem";
  this.dataCollect();
    args.put("rowindex_arrayPath","attachment");
    args.put("rowindex","#{cursor.cursorattachmentalias}.index");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "delitem",UMActivity.getViewId(control),args);
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
public void actionUMonUnload(View control, UMEventArgs args) {
    String actionid = "UMonUnload";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "UMonUnload",UMActivity.getViewId(control),args);
}
public void actionDownloadpic(View control, UMEventArgs args) {
    args.put("downloadpath","#{#{cursor.cursorattachmentalias}.fileid}");
  this.dataCollect();
    args.put("startposition","0");
    args.put("fileid","#{#{cursor.cursorattachmentalias}.fileid}");
    args.put("downflag","1");
    args.put("row_arrayPath","attachment");
    args.put("row","#{#{cursor.cursorattachmentalias}}");
    String actionid = "downloadpic";
    args.put("modulename","oapo");
    args.put("filesize","#{#{cursor.cursorattachmentalias}.filesize}");
    args.put("filename","#{#{cursor.cursorattachmentalias}.filename}");
    args.put("filetype","#{#{cursor.cursorattachmentalias}.filetype}");
    args.put("endposition","0");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMService.downloadFile(args);
}
public void actionFileonload(View control, UMEventArgs args) {
    String actionid = "fileonload";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "fileonload",UMActivity.getViewId(control),args);
}
public void actionUMonComplete(View control, UMEventArgs args) {
    String actionid = "UMonComplete";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "UMonComplete",UMActivity.getViewId(control),args);
}
public void actionFileitem(View control, UMEventArgs args) {
    String actionid = "fileitem";
  this.dataCollect();
    args.put("uploadfile","#{uploadFile}");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "fileitem",UMActivity.getViewId(control),args);
}
public void actionUMonDataBinding(View control, UMEventArgs args) {
    String actionid = "UMonDataBinding";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "UMonDataBinding",UMActivity.getViewId(control),args);
}


}
