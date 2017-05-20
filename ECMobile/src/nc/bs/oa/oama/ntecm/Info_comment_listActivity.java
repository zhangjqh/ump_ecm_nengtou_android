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

public abstract class Info_comment_listActivity extends UMWindowActivity {

	protected UMWindow comment_list = null;
protected XVerticalLayout viewPage0 = null;
protected XHorizontalLayout navigatorbar0 = null;
protected UMButton button0 = null;
protected UMLabel label0 = null;
protected UMLabel label1 = null;
protected XVerticalLayout panel0 = null;
protected UMListViewBase listviewdefine0 = null;
protected XVerticalLayout panel2 = null;
protected XHorizontalLayout panel1 = null;
protected XVerticalLayout panel4 = null;
protected UMLabel label3 = null;
protected XVerticalLayout panel5 = null;
protected UMLabel label2 = null;
protected XVerticalLayout panel3 = null;
protected UMLabel label4 = null;
protected XHorizontalLayout panel9 = null;
protected XVerticalLayout panel10 = null;
protected UMTextArea textarea0 = null;
protected UMButton button1 = null;

	
	protected final static int ID_COMMENT_LIST = 2109953912;
protected final static int ID_VIEWPAGE0 = 330747585;
protected final static int ID_NAVIGATORBAR0 = 681132116;
protected final static int ID_BUTTON0 = 717609295;
protected final static int ID_LABEL0 = 151976162;
protected final static int ID_LABEL1 = 1423089693;
protected final static int ID_PANEL0 = 1020229628;
protected final static int ID_LISTVIEWDEFINE0 = 116895008;
protected final static int ID_PANEL2 = 1389230886;
protected final static int ID_PANEL1 = 1198177767;
protected final static int ID_PANEL4 = 1007572332;
protected final static int ID_LABEL3 = 1157359062;
protected final static int ID_PANEL5 = 739949505;
protected final static int ID_LABEL2 = 438312640;
protected final static int ID_PANEL3 = 157192760;
protected final static int ID_LABEL4 = 26683289;
protected final static int ID_PANEL9 = 1976927909;
protected final static int ID_PANEL10 = 891273252;
protected final static int ID_TEXTAREA0 = 361713648;
protected final static int ID_BUTTON1 = 147111160;

	
	
	@Override
	public String getControllerName() {
		return "comment_listController";
	}
	
	@Override
	public String getContextName() {
		return "oneinfo";
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
		  idmap.put("comment_list",ID_COMMENT_LIST);
  idmap.put("viewPage0",ID_VIEWPAGE0);
  idmap.put("navigatorbar0",ID_NAVIGATORBAR0);
  idmap.put("button0",ID_BUTTON0);
  idmap.put("label0",ID_LABEL0);
  idmap.put("label1",ID_LABEL1);
  idmap.put("panel0",ID_PANEL0);
  idmap.put("listviewdefine0",ID_LISTVIEWDEFINE0);
  idmap.put("panel2",ID_PANEL2);
  idmap.put("panel1",ID_PANEL1);
  idmap.put("panel4",ID_PANEL4);
  idmap.put("label3",ID_LABEL3);
  idmap.put("panel5",ID_PANEL5);
  idmap.put("label2",ID_LABEL2);
  idmap.put("panel3",ID_PANEL3);
  idmap.put("label4",ID_LABEL4);
  idmap.put("panel9",ID_PANEL9);
  idmap.put("panel10",ID_PANEL10);
  idmap.put("textarea0",ID_TEXTAREA0);
  idmap.put("button1",ID_BUTTON1);

	}
	
	public void onLoad() {
		ULog.logLC("onLoad", this);
		if(currentPage!=null) {
			currentPage.onLoad();
		}
	
		{ //panel0 - commentsLoadFirstPage
    UMEventArgs args = new UMEventArgs(Info_comment_listActivity.this);
    actionCommentsLoadFirstPage(panel0,args);

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
button0 = (UMButton)ThirdControl.createControl(new UMButton(context),ID_BUTTON0
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
,"onclick","toClose"
,"font-family","default"
,"valign","center"
,"background-image","btn_back"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,button0,"value","#{res.info_btn_back}"));
button0.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Info_comment_listActivity.this);
    actionToClose(button0,args);

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
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label0,"content","#{res.info_title_comment}"));
navigatorbar0.addView(label0);
label1 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL1
,"halign","center"
,"height","fill"
,"color","#000000"
,"layout-type","linear"
,"font-size","12"
,"width","64"
,"font-family","default"
,"valign","center"
);
navigatorbar0.addView(label1);

return navigatorbar0;
}
public View getPanel4View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel4 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL4
,"halign","center"
,"height","fill"
,"weight","1"
,"layout-type","linear"
,"width","0"
);
label3 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL3
,"content","label"
,"bindfield","commentperson"
,"halign","left"
,"height","fill"
,"color","#000000"
,"layout-type","linear"
,"font-size","16"
,"width","fill"
,"font-family","default"
,"valign","center"
);
UMTextBinder label3_binder = new UMTextBinder((IUMContextAccessor)context);
label3_binder.setBindInfo(new BindInfo("commentperson"));
label3_binder.setControl(label3);
binderGroup.addBinderToGroup(ID_LABEL3, label3_binder);
panel4.addView(label3);

return panel4;
}
public View getPanel5View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel5 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL5
,"halign","center"
,"height","fill"
,"layout-type","linear"
,"width","76.0"
);
label2 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL2
,"content","label"
,"bindfield","commentdate"
,"halign","right"
,"height","fill"
,"color","#000000"
,"layout-type","linear"
,"font-size","13"
,"width","fill"
,"font-family","default"
,"valign","center"
);
UMTextBinder label2_binder = new UMTextBinder((IUMContextAccessor)context);
label2_binder.setBindInfo(new BindInfo("commentdate"));
label2_binder.setControl(label2);
binderGroup.addBinderToGroup(ID_LABEL2, label2_binder);
panel5.addView(label2);

return panel5;
}
public View getPanel1View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel1 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL1
,"height","40.0"
,"layout-type","linear"
,"width","fill"
,"valign","center"
);
View panel4 = (View) getPanel4View((UMActivity)context,binderGroup,configure);
panel1.addView(panel4);
View panel5 = (View) getPanel5View((UMActivity)context,binderGroup,configure);
panel1.addView(panel5);

return panel1;
}
public View getPanel3View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel3 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL3
,"halign","center"
,"height","0"
,"weight","1"
,"layout-type","linear"
,"width","fill"
);
label4 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL4
,"bindfield","commentcontent"
,"halign","left"
,"width","fill"
,"type","multiline"
,"rows","3"
,"content","label"
,"height","fill"
,"color","#000000"
,"font-size","13"
,"layout-type","linear"
,"font-family","default"
,"valign","top"
);
UMTextBinder label4_binder = new UMTextBinder((IUMContextAccessor)context);
label4_binder.setBindInfo(new BindInfo("commentcontent"));
label4_binder.setControl(label4);
binderGroup.addBinderToGroup(ID_LABEL4, label4_binder);
panel3.addView(label4);

return panel3;
}
public View getPanel2View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel2 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL2
,"padding-left","15"
,"padding-right","15"
,"halign","center"
,"height","88"
,"layout-type","vbox"
,"width","fill"
,"background-image","list.png"
);
View panel1 = (View) getPanel1View((UMActivity)context,binderGroup,configure);
panel2.addView(panel1);
View panel3 = (View) getPanel3View((UMActivity)context,binderGroup,configure);
panel2.addView(panel3);

return panel2;
}
public View getListviewdefine0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listviewdefine0 = (UMListViewBase)ThirdControl.createControl(new UMListViewBase(context),ID_LISTVIEWDEFINE0
,"onuprefersh","commentsLoadNextPage"
,"bindfield","commentlist"
,"halign","center"
,"height","fill"
,"ondownrefersh","commentsLoadNextPage"
,"cursoraction","cursorcommentlistalias"
,"layout","vbox"
,"background","#ffffff"
,"width","fill"
,"onitemclick","gotoDetail"
,"synccontext","commentlist"
);
context.createCursor("cursorcommentlistalias", "commentlist");
UMListBinder listviewdefine0_binder = new UMListBinder((IUMContextAccessor)context);
listviewdefine0_binder.setBindInfo(new BindInfo("commentlist"));
listviewdefine0_binder.setControl(listviewdefine0);
binderGroup.addBinderToGroup(ID_LISTVIEWDEFINE0, listviewdefine0_binder);
listviewdefine0.setEvent("onuprefersh", new OnCursorEventListener(configure) {
  @Override
  public void onEvent(View v, UMEventArgs parent) {
    UMEventArgs args = new UMEventArgs(Info_comment_listActivity.this);
    args.put(parent);
    actionCommentsLoadNextPage(listviewdefine0,args);

}
});
listviewdefine0.setEvent("ondownrefersh", new OnCursorEventListener(configure) {
  @Override
  public void onEvent(View v, UMEventArgs parent) {
    UMEventArgs args = new UMEventArgs(Info_comment_listActivity.this);
    args.put(parent);
    actionCommentsLoadNextPage(listviewdefine0,args);

}
});
listviewdefine0.setEvent("onitemclick", new OnCursorEventListener(configure) {
  @Override
  public void onEvent(View v, UMEventArgs parent) {
    UMEventArgs args = new UMEventArgs(Info_comment_listActivity.this);
    args.put(parent);
    int position = this.getPosition(v);
    if(position>=0) {
      context.getCursor("cursorcommentlistalias").setCurrentIndex(position);
    }
    actionGotoDetail(listviewdefine0,args);

}
});
listviewdefine0.addListItemView(new UMListViewBase.ListItemView() {
	public View getItemView(Context context, View parent, IBinderGroup binderGroup,int position) {
  UMDslConfigure configure = new UMDslConfigure();
  configure.put("position",position);
View panel2 = (View) getPanel2View((UMActivity)context,binderGroup,configure);
return panel2;
}});

return listviewdefine0;
}
public View getPanel0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel0 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL0
,"halign","center"
,"height","0"
,"weight","1"
,"onload","commentsLoadFirstPage"
,"layout-type","linear"
,"width","fill"
);
View listviewdefine0 = (View) getListviewdefine0View((UMActivity)context,binderGroup,configure);
panel0.addView(listviewdefine0);

return panel0;
}
public View getPanel10View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel10 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL10
,"padding-top","10"
,"halign","center"
,"height","fill"
,"weight","1"
,"layout-type","linear"
,"width","0"
);
textarea0 = (UMTextArea)ThirdControl.createControl(new UMTextArea(context),ID_TEXTAREA0
,"padding-left","4"
,"padding-top","5"
,"halign","LEFT"
,"placeholder",""
,"width","fill"
,"padding-bottom","5"
,"height","26.0"
,"color","#167ef8"
,"background","#ffffff"
,"font-size","17"
,"layout-type","linear"
,"font-family","default"
);
panel10.addView(textarea0);

return panel10;
}
public View getPanel9View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel9 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL9
,"padding-right","15"
,"padding-left","15"
,"height","44.0"
,"layout-type","linear"
,"background","#e8e8e8"
,"width","fill"
,"valign","center"
);
View panel10 = (View) getPanel10View((UMActivity)context,binderGroup,configure);
panel9.addView(panel10);
button1 = (UMButton)ThirdControl.createControl(new UMButton(context),ID_BUTTON1
,"halign","center"
,"pressed-image","button_touch"
,"width","42.0"
,"background-image-dis","button"
,"height","fill"
,"color","#ff0000"
,"layout-type","linear"
,"font-size","14"
,"onclick","doSubmitComment"
,"font-family","default"
,"valign","center"
,"background-image","button"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,button1,"value","#{res.info_btn_comment}"));
button1.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Info_comment_listActivity.this);
    actionDoSubmitComment(button1,args);

}
});
panel9.addView(button1);

return panel9;
}
public View getViewPage0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
viewPage0 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_VIEWPAGE0
,"halign","center"
,"height","fill"
,"layout-type","vbox"
,"width","fill"
,"background","#efeff4"
);
View navigatorbar0 = (View) getNavigatorbar0View((UMActivity)context,binderGroup,configure);
viewPage0.addView(navigatorbar0);
View panel0 = (View) getPanel0View((UMActivity)context,binderGroup,configure);
viewPage0.addView(panel0);
View panel9 = (View) getPanel9View((UMActivity)context,binderGroup,configure);
viewPage0.addView(panel9);

return viewPage0;
}
public UMWindow getCurrentWindow(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
comment_list = (UMWindow)ThirdControl.createControl(new UMWindow(context),ID_COMMENT_LIST
,"halign","center"
,"height","460.0"
,"layout","vbox"
,"width","320.0"
,"context","oneinfo"
,"controller","comment_listController"
,"namespace","nc.bs.oa.oama.ecm"
);
View viewPage0 = (View) getViewPage0View((UMActivity)context,binderGroup,configure);
comment_list.addView(viewPage0);

return (UMWindow)comment_list;
}

	
	public void actionDoSubmitComment(View control, UMEventArgs args) {
    String actionid = "doSubmitComment";
  this.dataCollect();
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "doSubmitComment",UMActivity.getViewId(control),args);
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
public void actionShowSuccessDialog(View control, UMEventArgs args) {
    String actionid = "showSuccessDialog";
    args.put("message","#{res.info_dialog_text}");
    args.put("title","#{res.info_dialog_title}");
    args.put("style","null");
    args.put("animation","top-bottom");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.openDialog(args);
}
public void actionUMonDataBinding(View control, UMEventArgs args) {
    String actionid = "UMonDataBinding";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "UMonDataBinding",UMActivity.getViewId(control),args);
}
public void actionCommentsLoadNextPage(View control, UMEventArgs args) {
    String actionid = "commentsLoadNextPage";
    args.put("infoid","#{infoid}");
    args.put("viewid","nc.bs.oa.oainf.ma.infopublish.OneinfoExtendController");
    args.put("action","oneInfoCommentLoad");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMList.getNextPage(args);
}
public void actionRefreshList(View control, UMEventArgs args) {
    String actionid = "refreshList";
  this.dataCollect();
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "refreshList",UMActivity.getViewId(control),args);
}
public void actionGotoDetail(View control, UMEventArgs args) {
    String actionid = "gotoDetail";
    args.put("viewid","nc.bs.oa.oama.ecm.Info_commentdetail");
    args.put("iskeep","true");
    args.put("commentrow_arrayPath","commentlist");
    args.put("containerName","");
    args.put("commentrow","#{#{cursor.cursorcommentlistalias}}");
  ActionProcessor.exec(this, actionid, args);
UMView.open(args);
}
public void actionToClose(View control, UMEventArgs args) {
    String actionid = "toClose";
    args.put("resultcode","15");
    args.put("iskeep","false");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.close(args);
}
public void actionErrorCallback(View control, UMEventArgs args) {
    String actionid = "errorCallback";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "errorCallback",UMActivity.getViewId(control),args);
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
public void actionAlertMsg(View control, UMEventArgs args) {
    String actionid = "alertMsg";
  this.dataCollect();
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "alertMsg",UMActivity.getViewId(control),args);
}
public void actionToCommentDetail(View control, UMEventArgs args) {
    args.put("commentid","#{#{cursor.cursorcommentlistalias}.commentid}");
    args.put("infoid","#{infoid}");
    args.put("viewid","nc.bs.oa.oainf.ma.infopublish.OneinfoExtendController");
    args.put("commentid_arrayPath","commentlist");
  this.dataCollect();
    String actionid = "toCommentDetail";
    args.put("callback","gotoDetail");
    args.put("action","commentDetail");
    args.put("autoDataBinding","false");
    args.put("contextmapping","currentwork");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMService.callAction(args);
}
public void actionCommentsLoadFirstPage(View control, UMEventArgs args) {
    String actionid = "commentsLoadFirstPage";
    args.put("infoid","#{plug.infoid}");
    args.put("count","25");
    args.put("viewid","nc.bs.oa.oainf.ma.infopublish.OneinfoExtendController");
    args.put("startline","1");
  this.dataCollect();
    args.put("action","oneInfoCommentLoad");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMList.getFirstPage(args);
}


}
