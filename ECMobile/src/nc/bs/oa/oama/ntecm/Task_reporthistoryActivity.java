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

public abstract class Task_reporthistoryActivity extends UMWindowActivity {

	protected UMWindow Task_reporthistory = null;
protected XVerticalLayout viewPage0 = null;
protected XHorizontalLayout navigatorbar0 = null;
protected UMButton button0 = null;
protected UMLabel label0 = null;
protected UMLabel label5 = null;
protected XVerticalLayout panel0 = null;
protected UMListViewBase listviewdefine0 = null;
protected XVerticalLayout panel1 = null;
protected XVerticalLayout panel2 = null;
protected XVerticalLayout panel21 = null;
protected XVerticalLayout panel9 = null;
protected UMLabel label1 = null;
protected XHorizontalLayout panel12 = null;
protected UMLabel label8 = null;
protected UMLabel label12 = null;
protected UMLabel label9 = null;
protected UMLabel label13 = null;
protected XHorizontalLayout panel10 = null;
protected XHorizontalLayout panel16 = null;
protected UMLabel label2 = null;
protected XHorizontalLayout panel17 = null;
protected UMProgressBar progressbar0 = null;
protected XHorizontalLayout panel18 = null;
protected XHorizontalLayout panel19 = null;
protected UMLabel label14 = null;
protected XHorizontalLayout panel20 = null;
protected UMLabel label16 = null;
protected UMLabel filecount = null;
protected UMImage image0 = null;
protected XVerticalLayout panel3 = null;
protected XHorizontalLayout panel4 = null;
protected XHorizontalLayout panel5 = null;
protected XVerticalLayout panel6 = null;
protected XHorizontalLayout panel7 = null;
protected XVerticalLayout panel11 = null;
protected XHorizontalLayout panel13 = null;
protected UMLabel label3 = null;
protected XVerticalLayout panel14 = null;
protected UMLabel label4 = null;
protected XHorizontalLayout panel15 = null;
protected UMLabel label6 = null;
protected UMLabel label10 = null;
protected UMLabel label7 = null;
protected UMLabel label11 = null;
protected XHorizontalLayout panel8 = null;

	
	protected final static int ID_TASK_REPORTHISTORY = 953109165;
protected final static int ID_VIEWPAGE0 = 546796192;
protected final static int ID_NAVIGATORBAR0 = 53816642;
protected final static int ID_BUTTON0 = 889401655;
protected final static int ID_LABEL0 = 195660512;
protected final static int ID_LABEL5 = 1123941473;
protected final static int ID_PANEL0 = 62644311;
protected final static int ID_LISTVIEWDEFINE0 = 202783260;
protected final static int ID_PANEL1 = 1130564715;
protected final static int ID_PANEL2 = 1133124126;
protected final static int ID_PANEL21 = 205182042;
protected final static int ID_PANEL9 = 776595947;
protected final static int ID_LABEL1 = 495693979;
protected final static int ID_PANEL12 = 1071900438;
protected final static int ID_LABEL8 = 419048863;
protected final static int ID_LABEL12 = 24182642;
protected final static int ID_LABEL9 = 538750188;
protected final static int ID_LABEL13 = 376595666;
protected final static int ID_PANEL10 = 1882872091;
protected final static int ID_PANEL16 = 1738543102;
protected final static int ID_LABEL2 = 1689202886;
protected final static int ID_PANEL17 = 60994341;
protected final static int ID_PROGRESSBAR0 = 1970689437;
protected final static int ID_PANEL18 = 1678207060;
protected final static int ID_PANEL19 = 657247961;
protected final static int ID_LABEL14 = 1153531693;
protected final static int ID_PANEL20 = 874188256;
protected final static int ID_LABEL16 = 1193284676;
protected final static int ID_FILECOUNT = 1290861798;
protected final static int ID_IMAGE0 = 434111917;
protected final static int ID_PANEL3 = 661345853;
protected final static int ID_PANEL4 = 1492806432;
protected final static int ID_PANEL5 = 1665904592;
protected final static int ID_PANEL6 = 1565801707;
protected final static int ID_PANEL7 = 643642623;
protected final static int ID_PANEL11 = 1714697846;
protected final static int ID_PANEL13 = 73246097;
protected final static int ID_LABEL3 = 190199346;
protected final static int ID_PANEL14 = 277471190;
protected final static int ID_LABEL4 = 872996823;
protected final static int ID_PANEL15 = 951942385;
protected final static int ID_LABEL6 = 1389560305;
protected final static int ID_LABEL10 = 1244150084;
protected final static int ID_LABEL7 = 726730595;
protected final static int ID_LABEL11 = 683148090;
protected final static int ID_PANEL8 = 150971995;

	
	
	@Override
	public String getControllerName() {
		return "Task_reporthistoryController";
	}
	
	@Override
	public String getContextName() {
		return "reporthistest";
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
		  idmap.put("Task_reporthistory",ID_TASK_REPORTHISTORY);
  idmap.put("viewPage0",ID_VIEWPAGE0);
  idmap.put("navigatorbar0",ID_NAVIGATORBAR0);
  idmap.put("button0",ID_BUTTON0);
  idmap.put("label0",ID_LABEL0);
  idmap.put("label5",ID_LABEL5);
  idmap.put("panel0",ID_PANEL0);
  idmap.put("listviewdefine0",ID_LISTVIEWDEFINE0);
  idmap.put("panel1",ID_PANEL1);
  idmap.put("panel2",ID_PANEL2);
  idmap.put("panel21",ID_PANEL21);
  idmap.put("panel9",ID_PANEL9);
  idmap.put("label1",ID_LABEL1);
  idmap.put("panel12",ID_PANEL12);
  idmap.put("label8",ID_LABEL8);
  idmap.put("label12",ID_LABEL12);
  idmap.put("label9",ID_LABEL9);
  idmap.put("label13",ID_LABEL13);
  idmap.put("panel10",ID_PANEL10);
  idmap.put("panel16",ID_PANEL16);
  idmap.put("label2",ID_LABEL2);
  idmap.put("panel17",ID_PANEL17);
  idmap.put("progressbar0",ID_PROGRESSBAR0);
  idmap.put("panel18",ID_PANEL18);
  idmap.put("panel19",ID_PANEL19);
  idmap.put("label14",ID_LABEL14);
  idmap.put("panel20",ID_PANEL20);
  idmap.put("label16",ID_LABEL16);
  idmap.put("filecount",ID_FILECOUNT);
  idmap.put("image0",ID_IMAGE0);
  idmap.put("panel3",ID_PANEL3);
  idmap.put("panel4",ID_PANEL4);
  idmap.put("panel5",ID_PANEL5);
  idmap.put("panel6",ID_PANEL6);
  idmap.put("panel7",ID_PANEL7);
  idmap.put("panel11",ID_PANEL11);
  idmap.put("panel13",ID_PANEL13);
  idmap.put("label3",ID_LABEL3);
  idmap.put("panel14",ID_PANEL14);
  idmap.put("label4",ID_LABEL4);
  idmap.put("panel15",ID_PANEL15);
  idmap.put("label6",ID_LABEL6);
  idmap.put("label10",ID_LABEL10);
  idmap.put("label7",ID_LABEL7);
  idmap.put("label11",ID_LABEL11);
  idmap.put("panel8",ID_PANEL8);

	}
	
	public void onLoad() {
		ULog.logLC("onLoad", this);
		if(currentPage!=null) {
			currentPage.onLoad();
		}
	
		{ //viewPage0 - loadreporthistory
    UMEventArgs args = new UMEventArgs(Task_reporthistoryActivity.this);
    actionLoadreporthistory(viewPage0,args);

}
{ //listviewdefine0 - action:listviewdefine0_onload
    UMEventArgs args = new UMEventArgs(Task_reporthistoryActivity.this);
    actionListviewdefine0_onload(listviewdefine0,args);

}
{ //panel2 - action:panel2_onload
    UMEventArgs args = new UMEventArgs(Task_reporthistoryActivity.this);
    actionPanel2_onload(panel2,args);

}
{ //progressbar0 - action:progressbar0_onload
    UMEventArgs args = new UMEventArgs(Task_reporthistoryActivity.this);
    actionProgressbar0_onload(progressbar0,args);

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
,"height","44"
,"color","#000000"
,"layout-type","linear"
,"font-size","17"
,"font-family","default"
,"valign","center"
,"background-image","nav.png"
);
button0 = (UMButton)ThirdControl.createControl(new UMButton(context),ID_BUTTON0
,"padding-left","20"
,"halign","left"
,"pressed-image","btn_back_touch.png"
,"width","64"
,"font-pressed-color","#f2adb2"
,"height","44"
,"color","#e50011"
,"layout-type","linear"
,"font-size","17"
,"onclick","closehistory"
,"font-family","default"
,"valign","center"
,"background-image","btn_back.png"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,button0,"value","#{res.task_back}"));
button0.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Task_reporthistoryActivity.this);
    actionClosehistory(button0,args);

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
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label0,"content","#{res.task_reportHistory}"));
navigatorbar0.addView(label0);
label5 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL5
,"halign","center"
,"height","20"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","64"
,"font-family","default"
,"valign","center"
);
navigatorbar0.addView(label5);

return navigatorbar0;
}
public View getPanel9View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel9 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL9
,"halign","left"
,"height","20"
,"layout-type","linear"
,"width","fill"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,panel9,"roundstyle","#{reportstate}"));
label1 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL1
,"content","label"
,"bindfield","reportstate"
,"halign","left"
,"height","fill"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","fill"
,"font-family","default"
,"valign","center"
);
UMTextBinder label1_binder = new UMTextBinder((IUMContextAccessor)context);
label1_binder.setBindInfo(new BindInfo("reportstate"));
label1_binder.setControl(label1);
binderGroup.addBinderToGroup(ID_LABEL1, label1_binder);
panel9.addView(label1);

return panel9;
}
public View getPanel12View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel12 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL12
,"height","19"
,"layout-type","linear"
,"width","fill"
,"valign","center"
);
label8 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL8
,"content","label"
,"bindfield","time"
,"halign","center"
,"height","fill"
,"widthwrap","34.0"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","wrap"
,"font-family","default"
,"valign","center"
);
UMTextBinder label8_binder = new UMTextBinder((IUMContextAccessor)context);
label8_binder.setBindInfo(new BindInfo("time"));
label8_binder.setControl(label8);
binderGroup.addBinderToGroup(ID_LABEL8, label8_binder);
panel12.addView(label8);
label12 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL12
,"content","<"
,"halign","center"
,"height","wrap"
,"widthwrap","8.0"
,"color","#000000"
,"heightwrap","20.0"
,"layout-type","linear"
,"font-size","14"
,"width","wrap"
,"font-family","default"
,"valign","center"
);
panel12.addView(label12);
label9 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL9
,"bindfield","relatedname"
,"halign","center"
,"widthwrap","34.0"
,"width","wrap"
,"content","label"
,"height","fill"
,"color","#000000"
,"font-size","14"
,"layout-type","linear"
,"margin-left","10"
,"font-family","default"
,"valign","center"
);
UMTextBinder label9_binder = new UMTextBinder((IUMContextAccessor)context);
label9_binder.setBindInfo(new BindInfo("relatedname"));
label9_binder.setControl(label9);
binderGroup.addBinderToGroup(ID_LABEL9, label9_binder);
panel12.addView(label9);
label13 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL13
,"content",">"
,"halign","center"
,"height","wrap"
,"widthwrap","8.0"
,"color","#000000"
,"heightwrap","20.0"
,"layout-type","linear"
,"font-size","14"
,"width","wrap"
,"font-family","default"
,"valign","center"
);
panel12.addView(label13);

return panel12;
}
public View getPanel21View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel21 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL21
,"padding-left","15"
,"padding-right","15"
,"halign","center"
,"height","44"
,"layout-type","linear"
,"width","fill"
,"background-image","list_row_mid1.png"
);
View panel9 = (View) getPanel9View((UMActivity)context,binderGroup,configure);
panel21.addView(panel9);
View panel12 = (View) getPanel12View((UMActivity)context,binderGroup,configure);
panel21.addView(panel12);

return panel21;
}
public View getPanel16View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel16 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL16
,"height","fill"
,"layout-type","linear"
,"width","80"
,"valign","center"
);
label2 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL2
,"bindfield",""
,"halign","left"
,"height","wrap"
,"color","#000000"
,"heightwrap","20.0"
,"layout-type","linear"
,"font-size","14"
,"width","80"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label2,"content","#{res.task_taskPross}"));
panel16.addView(label2);

return panel16;
}
public View getPanel17View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel17 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL17
,"height","fill"
,"weight","1"
,"layout-type","linear"
,"width","0"
,"valign","center"
);
progressbar0 = (UMProgressBar)ThirdControl.createControl(new UMProgressBar(context),ID_PROGRESSBAR0
,"bindfield","taskschedule"
,"progress","0"
,"height","10"
,"max","100"
,"onload","action:progressbar0_onload"
,"layout-type","linear"
,"progresscolor","#0852a5"
,"width","fill"
,"background","#c8c7cc"
);
UMProgressBarBinder progressbar0_binder = new UMProgressBarBinder((IUMContextAccessor)context);
progressbar0_binder.setBindInfo(new BindInfo("taskschedule"));
progressbar0_binder.setControl(progressbar0);
binderGroup.addBinderToGroup(ID_PROGRESSBAR0, progressbar0_binder);
panel17.addView(progressbar0);

return panel17;
}
public View getPanel10View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel10 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL10
,"padding-left","15"
,"padding-right","15"
,"height","44"
,"layout-type","linear"
,"width","fill"
,"valign","center"
,"background-image","list_row_mid1.png"
);
View panel16 = (View) getPanel16View((UMActivity)context,binderGroup,configure);
panel10.addView(panel16);
View panel17 = (View) getPanel17View((UMActivity)context,binderGroup,configure);
panel10.addView(panel17);

return panel10;
}
public View getPanel19View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel19 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL19
,"height","fill"
,"layout-type","linear"
,"width","80"
,"valign","center"
);
label14 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL14
,"halign","center"
,"height","wrap"
,"widthwrap","123.0"
,"color","#000000"
,"heightwrap","20.0"
,"layout-type","linear"
,"font-size","14"
,"width","wrap"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label14,"content","#{res.task_result}"));
panel19.addView(label14);

return panel19;
}
public View getPanel20View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel20 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL20
,"height","fill"
,"weight","1"
,"layout-type","linear"
,"width","0"
,"valign","center"
);
label16 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL16
,"halign","center"
,"height","20"
,"weight","1"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","0"
,"font-family","default"
,"valign","center"
);
panel20.addView(label16);
filecount = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_FILECOUNT
,"bindfield","filecount"
,"halign","center"
,"widthwrap","34.0"
,"width","wrap"
,"content","label"
,"height","wrap"
,"color","#000000"
,"heightwrap","20.0"
,"font-size","14"
,"layout-type","linear"
,"font-family","default"
,"valign","center"
);
UMTextBinder filecount_binder = new UMTextBinder((IUMContextAccessor)context);
filecount_binder.setBindInfo(new BindInfo("filecount"));
filecount_binder.setControl(filecount);
binderGroup.addBinderToGroup(ID_FILECOUNT, filecount_binder);
panel20.addView(filecount);

return panel20;
}
public View getPanel18View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel18 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL18
,"padding-right","15"
,"padding-left","15"
,"height","44"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"onclick","attachmentlist"
,"valign","center"
);
panel18.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Task_reporthistoryActivity.this);
    actionAttachmentlist(panel18,args);

}
});
View panel19 = (View) getPanel19View((UMActivity)context,binderGroup,configure);
panel18.addView(panel19);
View panel20 = (View) getPanel20View((UMActivity)context,binderGroup,configure);
panel18.addView(panel20);
image0 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_IMAGE0
,"height","13"
,"layout-type","linear"
,"width","8"
,"scaletype","fitcenter"
,"src","ecm_set_jt.png"
);
panel18.addView(image0);

return panel18;
}
public View getPanel2View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel2 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL2
,"halign","center"
,"height","0"
,"weight","1"
,"onload","action:panel2_onload"
,"layout-type","linear"
,"background","#f7f7f7"
,"width","fill"
);
View panel21 = (View) getPanel21View((UMActivity)context,binderGroup,configure);
panel2.addView(panel21);
View panel10 = (View) getPanel10View((UMActivity)context,binderGroup,configure);
panel2.addView(panel10);
View panel18 = (View) getPanel18View((UMActivity)context,binderGroup,configure);
panel2.addView(panel18);

return panel2;
}
public View getPanel1View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel1 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL1
,"padding-top","10"
,"halign","center"
,"height","143"
,"layout-type","vbox"
,"background","#f7f7f7"
,"width","fill"
);
View panel2 = (View) getPanel2View((UMActivity)context,binderGroup,configure);
panel1.addView(panel2);
panel3 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL3
,"halign","center"
,"height","1"
,"layout-type","linear"
,"background","#c7c7c7"
,"width","fill"
);
panel1.addView(panel3);

return panel1;
}
public View getPanel13View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel13 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL13
,"height","20"
,"layout-type","linear"
,"width","fill"
,"valign","center"
);
label3 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL3
,"bindfield","taskcomment"
,"halign","left"
,"height","wrap"
,"color","#000000"
,"heightwrap","20.0"
,"layout-type","linear"
,"font-size","14"
,"width","80"
,"font-family","default"
,"valign","center"
);
UMTextBinder label3_binder = new UMTextBinder((IUMContextAccessor)context);
label3_binder.setBindInfo(new BindInfo("taskcomment"));
label3_binder.setControl(label3);
binderGroup.addBinderToGroup(ID_LABEL3, label3_binder);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label3,"content","#{res.task_completion}"));
panel13.addView(label3);

return panel13;
}
public View getPanel14View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel14 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL14
,"halign","left"
,"height","20"
,"layout-type","linear"
,"width","fill"
);
label4 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL4
,"bindfield","content"
,"halign","left"
,"widthwrap","34.0"
,"width","wrap"
,"content","label"
,"height","wrap"
,"color","#0080ff"
,"heightwrap","20.0"
,"font-size","14"
,"layout-type","linear"
,"font-family","default"
,"valign","center"
);
UMTextBinder label4_binder = new UMTextBinder((IUMContextAccessor)context);
label4_binder.setBindInfo(new BindInfo("content"));
label4_binder.setControl(label4);
binderGroup.addBinderToGroup(ID_LABEL4, label4_binder);
panel14.addView(label4);

return panel14;
}
public View getPanel15View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel15 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL15
,"height","19"
,"layout-type","linear"
,"width","fill"
,"valign","center"
);
label6 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL6
,"bindfield","reporttime"
,"halign","center"
,"widthwrap","34.0"
,"width","wrap"
,"content","label"
,"height","wrap"
,"color","#000000"
,"heightwrap","20.0"
,"font-size","14"
,"layout-type","linear"
,"font-family","default"
,"valign","center"
);
UMTextBinder label6_binder = new UMTextBinder((IUMContextAccessor)context);
label6_binder.setBindInfo(new BindInfo("reporttime"));
label6_binder.setControl(label6);
binderGroup.addBinderToGroup(ID_LABEL6, label6_binder);
panel15.addView(label6);
label10 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL10
,"content","<"
,"halign","center"
,"height","wrap"
,"widthwrap","8.0"
,"color","#000000"
,"heightwrap","20.0"
,"layout-type","linear"
,"font-size","14"
,"width","wrap"
,"font-family","default"
,"valign","center"
);
panel15.addView(label10);
label7 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL7
,"bindfield","relatedname"
,"halign","center"
,"widthwrap","34.0"
,"width","wrap"
,"content","label"
,"height","wrap"
,"color","#000000"
,"heightwrap","20.0"
,"font-size","14"
,"layout-type","linear"
,"font-family","default"
,"valign","center"
);
UMTextBinder label7_binder = new UMTextBinder((IUMContextAccessor)context);
label7_binder.setBindInfo(new BindInfo("relatedname"));
label7_binder.setControl(label7);
binderGroup.addBinderToGroup(ID_LABEL7, label7_binder);
panel15.addView(label7);
label11 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL11
,"content",">"
,"halign","center"
,"height","wrap"
,"widthwrap","8.0"
,"color","#000000"
,"heightwrap","20.0"
,"layout-type","linear"
,"font-size","14"
,"width","wrap"
,"font-family","default"
,"valign","center"
);
panel15.addView(label11);

return panel15;
}
public View getPanel11View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel11 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL11
,"halign","left"
,"height","60.0"
,"layout-type","linear"
,"width","fill"
);
View panel13 = (View) getPanel13View((UMActivity)context,binderGroup,configure);
panel11.addView(panel13);
View panel14 = (View) getPanel14View((UMActivity)context,binderGroup,configure);
panel11.addView(panel14);
View panel15 = (View) getPanel15View((UMActivity)context,binderGroup,configure);
panel11.addView(panel15);

return panel11;
}
public View getPanel7View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel7 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL7
,"padding-right","15"
,"height","0"
,"weight","1"
,"layout-type","linear"
,"background","#FFFFFF"
,"width","fill"
,"valign","top"
);
View panel11 = (View) getPanel11View((UMActivity)context,binderGroup,configure);
panel7.addView(panel11);

return panel7;
}
public View getPanel6View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel6 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL6
,"halign","center"
,"weight","1"
,"height","fill"
,"layout-type","linear"
,"width","0"
);
View panel7 = (View) getPanel7View((UMActivity)context,binderGroup,configure);
panel6.addView(panel7);
panel8 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL8
,"height","1"
,"layout-type","linear"
,"background","#c7c7c7"
,"width","fill"
,"valign","center"
);
panel6.addView(panel8);

return panel6;
}
public View getPanel4View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel4 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL4
,"height","60.0"
,"layout-type","vbox"
,"background","#FFFFFF"
,"width","fill"
,"valign","center"
);
panel5 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL5
,"height","fill"
,"layout-type","linear"
,"background","#FFFFFF"
,"width","15"
,"valign","center"
);
panel4.addView(panel5);
View panel6 = (View) getPanel6View((UMActivity)context,binderGroup,configure);
panel4.addView(panel6);

return panel4;
}
public View getListviewdefine0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listviewdefine0 = (UMListViewBase)ThirdControl.createControl(new UMListViewBase(context),ID_LISTVIEWDEFINE0
,"bindfield","reporthisList.reporthistory,completion"
,"halign","center"
,"height","fill"
,"cursoraction","cursorreporthisList_reporthistoryalias"
,"onload","action:listviewdefine0_onload"
,"layout","vbox"
,"width","fill"
,"synccontext","listviewdefine0reporthisList_reporthistory"
);
context.createCursor("cursorreporthisList_reporthistoryalias", "listviewdefine0reporthisList_reporthistory");
UMListBinder listviewdefine0_binder = new UMListBinder((IUMContextAccessor)context);
listviewdefine0_binder.setBindInfo(new BindInfo("reporthisList.reporthistory,completion"));
listviewdefine0_binder.setControl(listviewdefine0);
binderGroup.addBinderToGroup(ID_LISTVIEWDEFINE0, listviewdefine0_binder);
listviewdefine0.addListItemView(new UMListViewBase.ListItemView() {
	public View getItemView(Context context, View parent, IBinderGroup binderGroup,int position) {
  UMDslConfigure configure = new UMDslConfigure();
  configure.put("position",position);
View panel1 = (View) getPanel1View((UMActivity)context,binderGroup,configure);
return panel1;
}});
listviewdefine0.addListItemView(new UMListViewBase.ListItemView() {
	public View getItemView(Context context, View parent, IBinderGroup binderGroup,int position) {
  UMDslConfigure configure = new UMDslConfigure();
  configure.put("position",position);
View panel4 = (View) getPanel4View((UMActivity)context,binderGroup,configure);
return panel4;
}});

return listviewdefine0;
}
public View getPanel0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel0 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL0
,"halign","center"
,"height","fill"
,"layout-type","linear"
,"width","fill"
);
View listviewdefine0 = (View) getListviewdefine0View((UMActivity)context,binderGroup,configure);
panel0.addView(listviewdefine0);

return panel0;
}
public View getViewPage0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
viewPage0 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_VIEWPAGE0
,"halign","center"
,"height","fill"
,"onload","loadreporthistory"
,"layout-type","vbox"
,"background","#F5F5F5"
,"width","fill"
);
View navigatorbar0 = (View) getNavigatorbar0View((UMActivity)context,binderGroup,configure);
viewPage0.addView(navigatorbar0);
View panel0 = (View) getPanel0View((UMActivity)context,binderGroup,configure);
viewPage0.addView(panel0);

return viewPage0;
}
public UMWindow getCurrentWindow(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
Task_reporthistory = (UMWindow)ThirdControl.createControl(new UMWindow(context),ID_TASK_REPORTHISTORY
,"halign","center"
,"height","fill"
,"layout","vbox"
,"width","fill"
,"context","reporthistest"
,"controller","Task_reporthistoryController"
,"namespace","nc.bs.oa.oama.ecm"
);
View viewPage0 = (View) getViewPage0View((UMActivity)context,binderGroup,configure);
Task_reporthistory.addView(viewPage0);

return (UMWindow)Task_reporthistory;
}

	
	public void actionAttachmentlist(View control, UMEventArgs args) {
    String actionid = "attachmentlist";
    args.put("viewid","nc.bs.oa.oama.ecm.Task_file_detail");
  this.dataCollect();
    args.put("iskeep","true");
    args.put("containerName","");
    args.put("row","#{ctl.listviewdefine0.row}");
  ActionProcessor.exec(this, actionid, args);
UMView.open(args);
}
public void actionClosehistory(View control, UMEventArgs args) {
    String actionid = "closehistory";
    args.put("resultcode","0");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.close(args);
}
public void actionProgressbar0_onload(View control, UMEventArgs args) {
    String actionid = "progressbar0_onload";
    args.put("language","javascript");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "this.progressbar0_onload()",UMActivity.getViewId(control),args);
}
public void actionLoadreporthistory(View control, UMEventArgs args) {
    String actionid = "loadreporthistory";
  this.dataCollect();
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "loadreporthistory",UMActivity.getViewId(control),args);
}
public void actionListviewdefine0_onload(View control, UMEventArgs args) {
    String actionid = "listviewdefine0_onload";
    args.put("language","javascript");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "this.listviewdefine0_onload()",UMActivity.getViewId(control),args);
}
public void actionPanel2_onload(View control, UMEventArgs args) {
    String actionid = "panel2_onload";
    args.put("language","javascript");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "this.panel2_onload()",UMActivity.getViewId(control),args);
}


}
