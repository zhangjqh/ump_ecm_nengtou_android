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

import wa.android.libs.clickFillScreen.FillScreenActivity;
import android.os.*;
import android.view.*;
import android.widget.*;
import android.webkit.*;
import android.content.*;
import android.graphics.*;
import android.widget.ImageView.ScaleType;

public abstract class Task_starttask_detailActivity extends UMWindowActivity {

	protected UMWindow starttask_detail = null;
protected XVerticalLayout viewPage0 = null;
protected XHorizontalLayout navigatorbar0 = null;
protected UMButton button0 = null;
protected UMLabel label0 = null;
protected UMButton button5 = null;
protected XVerticalLayout panel0 = null;
protected UMScrollView Scrollview_panel11 = null;
protected XVerticalLayout panel11 = null;
protected XVerticalLayout rounddiv0 = null;
protected XHorizontalLayout rounddiv6 = null;
protected UMLabel label11 = null;
protected UMLabel label15 = null;
protected XHorizontalLayout rounddiv7 = null;
protected UMLabel label12 = null;
protected UMLabel label16 = null;
protected XHorizontalLayout rounddiv8 = null;
protected UMLabel label13 = null;
protected UMLabel label17 = null;
protected XHorizontalLayout rounddiv9 = null;
protected UMLabel label14 = null;
protected UMLabel label18 = null;
protected XVerticalLayout rounddiv1 = null;
protected XHorizontalLayout rounddiv16 = null;
protected UMLabel label7 = null;
protected UMLabel label19 = null;
protected XHorizontalLayout rounddiv17 = null;
protected UMLabel label8 = null;
protected UMLabel label20 = null;
protected XHorizontalLayout rounddiv18 = null;
protected UMLabel label9 = null;
protected UMLabel label21 = null;
protected XHorizontalLayout rounddiv19 = null;
protected UMLabel label10 = null;
protected UMLabel label22 = null;
protected XVerticalLayout rounddiv2 = null;
protected XHorizontalLayout rounddiv12 = null;
protected UMLabel label6 = null;
protected XHorizontalLayout rounddiv13 = null;
protected UMCheckbox checkbox0 = null;
protected UMLabel label222 = null;
protected UMCheckbox checkbox1 = null;
protected UMLabel label223 = null;
protected XHorizontalLayout rounddiv14 = null;
protected UMCheckbox checkbox2 = null;
protected UMLabel label224 = null;
protected UMCheckbox checkbox3 = null;
protected UMLabel label225 = null;
protected XVerticalLayout rounddiv3 = null;
protected XHorizontalLayout rounddiv10 = null;
protected UMLabel labe26 = null;
protected UMLabel label4 = null;
protected UMLabel label23 = null;
protected XHorizontalLayout rounddiv11 = null;
protected UMLabel labe28 = null;
protected UMLabel label5 = null;
protected UMLabel label24 = null;
protected XHorizontalLayout rounddiv5 = null;
protected XHorizontalLayout rounddiv55 = null;
protected UMLabel label3 = null;
protected UMLabel label25 = null;
protected XHorizontalLayout rounddiv4 = null;
protected XHorizontalLayout rounddiv44 = null;
protected UMLabel label1 = null;
protected UMLabel label2 = null;
protected UMButton button2 = null;
protected XHorizontalLayout rounddiv54 = null;
protected XHorizontalLayout rounddiv64 = null;
protected UMLabel label51 = null;
protected UMLabel label333 = null;
protected UMImage image0 = null;
protected XHorizontalLayout toolbar0 = null;
protected UMButton button1 = null;
protected UMButton button3 = null;
protected UMButton button4 = null;

	
	protected final static int ID_STARTTASK_DETAIL = 452946065;
protected final static int ID_VIEWPAGE0 = 1095315667;
protected final static int ID_NAVIGATORBAR0 = 1369484216;
protected final static int ID_BUTTON0 = 1315596062;
protected final static int ID_LABEL0 = 1414598369;
protected final static int ID_BUTTON5 = 538275823;
protected final static int ID_PANEL0 = 1679050610;
protected final static int ID_SCROLLVIEW_PANEL11 = 736712061;
protected final static int ID_PANEL11 = 728046385;
protected final static int ID_ROUNDDIV0 = 158678995;
protected final static int ID_ROUNDDIV6 = 824037060;
protected final static int ID_LABEL11 = 1183604471;
protected final static int ID_LABEL15 = 1767641739;
protected final static int ID_ROUNDDIV7 = 180316358;
protected final static int ID_LABEL12 = 1545821987;
protected final static int ID_LABEL16 = 1540053629;
protected final static int ID_ROUNDDIV8 = 1801638474;
protected final static int ID_LABEL13 = 1564146505;
protected final static int ID_LABEL17 = 1098254781;
protected final static int ID_ROUNDDIV9 = 1368521937;
protected final static int ID_LABEL14 = 818894507;
protected final static int ID_LABEL18 = 335698230;
protected final static int ID_ROUNDDIV1 = 1392696936;
protected final static int ID_ROUNDDIV16 = 87655278;
protected final static int ID_LABEL7 = 808539475;
protected final static int ID_LABEL19 = 929998979;
protected final static int ID_ROUNDDIV17 = 995451104;
protected final static int ID_LABEL8 = 1993860064;
protected final static int ID_LABEL20 = 1325996942;
protected final static int ID_ROUNDDIV18 = 345876897;
protected final static int ID_LABEL9 = 826999065;
protected final static int ID_LABEL21 = 1132327675;
protected final static int ID_ROUNDDIV19 = 473698644;
protected final static int ID_LABEL10 = 385468333;
protected final static int ID_LABEL22 = 239474817;
protected final static int ID_ROUNDDIV2 = 860192801;
protected final static int ID_ROUNDDIV12 = 1579115146;
protected final static int ID_LABEL6 = 1101878189;
protected final static int ID_ROUNDDIV13 = 45574476;
protected final static int ID_CHECKBOX0 = 644223886;
protected final static int ID_LABEL222 = 249916672;
protected final static int ID_CHECKBOX1 = 46217047;
protected final static int ID_LABEL223 = 59903463;
protected final static int ID_ROUNDDIV14 = 369982734;
protected final static int ID_CHECKBOX2 = 1125089324;
protected final static int ID_LABEL224 = 1540159666;
protected final static int ID_CHECKBOX3 = 455959158;
protected final static int ID_LABEL225 = 1732115816;
protected final static int ID_ROUNDDIV3 = 1180395852;
protected final static int ID_ROUNDDIV10 = 1504925177;
protected final static int ID_LABE26 = 1310480222;
protected final static int ID_LABEL4 = 1894143117;
protected final static int ID_LABEL23 = 1879156947;
protected final static int ID_ROUNDDIV11 = 372557147;
protected final static int ID_LABE28 = 1508265904;
protected final static int ID_LABEL5 = 1487593426;
protected final static int ID_LABEL24 = 663726830;
protected final static int ID_ROUNDDIV5 = 1703291117;
protected final static int ID_ROUNDDIV55 = 395575699;
protected final static int ID_LABEL3 = 2024412971;
protected final static int ID_LABEL25 = 1297663266;
protected final static int ID_ROUNDDIV4 = 273092161;
protected final static int ID_ROUNDDIV44 = 1930667639;
protected final static int ID_LABEL1 = 1567557693;
protected final static int ID_LABEL2 = 1391210066;
protected final static int ID_BUTTON2 = 1094371228;
protected final static int ID_ROUNDDIV54 = 1930218299;
protected final static int ID_ROUNDDIV64 = 442049357;
protected final static int ID_LABEL51 = 955228512;
protected final static int ID_LABEL333 = 1303090867;
protected final static int ID_IMAGE0 = 1084773513;
protected final static int ID_TOOLBAR0 = 1015038966;
protected final static int ID_BUTTON1 = 1500638497;
protected final static int ID_BUTTON3 = 51684252;
protected final static int ID_BUTTON4 = 487915003;

	
	
	@Override
	public String getControllerName() {
		return "starttask_detailController";
	}
	
	@Override
	public String getContextName() {
		return "detailtask";
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
		  idmap.put("starttask_detail",ID_STARTTASK_DETAIL);
  idmap.put("viewPage0",ID_VIEWPAGE0);
  idmap.put("navigatorbar0",ID_NAVIGATORBAR0);
  idmap.put("button0",ID_BUTTON0);
  idmap.put("label0",ID_LABEL0);
  idmap.put("button5",ID_BUTTON5);
  idmap.put("panel0",ID_PANEL0);
  idmap.put("Scrollview_panel11",ID_SCROLLVIEW_PANEL11);
  idmap.put("panel11",ID_PANEL11);
  idmap.put("rounddiv0",ID_ROUNDDIV0);
  idmap.put("rounddiv6",ID_ROUNDDIV6);
  idmap.put("label11",ID_LABEL11);
  idmap.put("label15",ID_LABEL15);
  idmap.put("rounddiv7",ID_ROUNDDIV7);
  idmap.put("label12",ID_LABEL12);
  idmap.put("label16",ID_LABEL16);
  idmap.put("rounddiv8",ID_ROUNDDIV8);
  idmap.put("label13",ID_LABEL13);
  idmap.put("label17",ID_LABEL17);
  idmap.put("rounddiv9",ID_ROUNDDIV9);
  idmap.put("label14",ID_LABEL14);
  idmap.put("label18",ID_LABEL18);
  idmap.put("rounddiv1",ID_ROUNDDIV1);
  idmap.put("rounddiv16",ID_ROUNDDIV16);
  idmap.put("label7",ID_LABEL7);
  idmap.put("label19",ID_LABEL19);
  idmap.put("rounddiv17",ID_ROUNDDIV17);
  idmap.put("label8",ID_LABEL8);
  idmap.put("label20",ID_LABEL20);
  idmap.put("rounddiv18",ID_ROUNDDIV18);
  idmap.put("label9",ID_LABEL9);
  idmap.put("label21",ID_LABEL21);
  idmap.put("rounddiv19",ID_ROUNDDIV19);
  idmap.put("label10",ID_LABEL10);
  idmap.put("label22",ID_LABEL22);
  idmap.put("rounddiv2",ID_ROUNDDIV2);
  idmap.put("rounddiv12",ID_ROUNDDIV12);
  idmap.put("label6",ID_LABEL6);
  idmap.put("rounddiv13",ID_ROUNDDIV13);
  idmap.put("checkbox0",ID_CHECKBOX0);
  idmap.put("label222",ID_LABEL222);
  idmap.put("checkbox1",ID_CHECKBOX1);
  idmap.put("label223",ID_LABEL223);
  idmap.put("rounddiv14",ID_ROUNDDIV14);
  idmap.put("checkbox2",ID_CHECKBOX2);
  idmap.put("label224",ID_LABEL224);
  idmap.put("checkbox3",ID_CHECKBOX3);
  idmap.put("label225",ID_LABEL225);
  idmap.put("rounddiv3",ID_ROUNDDIV3);
  idmap.put("rounddiv10",ID_ROUNDDIV10);
  idmap.put("labe26",ID_LABE26);
  idmap.put("label4",ID_LABEL4);
  idmap.put("label23",ID_LABEL23);
  idmap.put("rounddiv11",ID_ROUNDDIV11);
  idmap.put("labe28",ID_LABE28);
  idmap.put("label5",ID_LABEL5);
  idmap.put("label24",ID_LABEL24);
  idmap.put("rounddiv5",ID_ROUNDDIV5);
  idmap.put("rounddiv55",ID_ROUNDDIV55);
  idmap.put("label3",ID_LABEL3);
  idmap.put("label25",ID_LABEL25);
  idmap.put("rounddiv4",ID_ROUNDDIV4);
  idmap.put("rounddiv44",ID_ROUNDDIV44);
  idmap.put("label1",ID_LABEL1);
  idmap.put("label2",ID_LABEL2);
  idmap.put("button2",ID_BUTTON2);
  idmap.put("rounddiv54",ID_ROUNDDIV54);
  idmap.put("rounddiv64",ID_ROUNDDIV64);
  idmap.put("label51",ID_LABEL51);
  idmap.put("label333",ID_LABEL333);
  idmap.put("image0",ID_IMAGE0);
  idmap.put("toolbar0",ID_TOOLBAR0);
  idmap.put("button1",ID_BUTTON1);
  idmap.put("button3",ID_BUTTON3);
  idmap.put("button4",ID_BUTTON4);

	}
	
	public void onLoad() {
		ULog.logLC("onLoad", this);
		if(currentPage!=null) {
			currentPage.onLoad();
		}
	
		{ //panel0 - startload
    UMEventArgs args = new UMEventArgs(Task_starttask_detailActivity.this);
    actionStartload(panel0,args);

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
,"padding-right","8"
,"padding-left","8"
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
,"halign","center"
,"pressed-image","btn_back_touch"
,"width","64"
,"background-image-dis","button"
,"height","44"
,"color","#ff0000"
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
    UMEventArgs args = new UMEventArgs(Task_starttask_detailActivity.this);
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
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label0,"content","#{res.task_taskdetail}"));
navigatorbar0.addView(label0);
button5 = (UMButton)ThirdControl.createControl(new UMButton(context),ID_BUTTON5
,"halign","right"
,"pressed-image","button_touch"
,"width","42"
,"background-image-dis","button"
,"height","30"
,"color","#e50011"
,"layout-type","linear"
,"font-size","17"
,"onclick","beforeedittask"
,"font-family","default"
,"valign","center"
,"background-image","button"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,button5,"value","#{res.task_edit}"));
button5.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Task_starttask_detailActivity.this);
    actionBeforeedittask(button5,args);

}
});
navigatorbar0.addView(button5);

return navigatorbar0;
}
public View getRounddiv6View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
rounddiv6 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_ROUNDDIV6
,"padding-right","15"
,"height","0"
,"weight","1"
,"layout-type","linear"
,"width","fill"
,"valign","center"
,"background-image","at44_top.png"
);
label11 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL11
,"halign","left"
,"height","20"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","100"
,"margin-left","15"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label11,"content","#{res.task_start}"));
rounddiv6.addView(label11);
label15 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL15
,"bindfield","starttime"
,"halign","right"
,"height","fill"
,"weight","1"
,"color","#8e8e93"
,"layout-type","linear"
,"font-size","16"
,"width","0"
,"font-family","default"
,"valign","center"
);
UMTextBinder label15_binder = new UMTextBinder((IUMContextAccessor)context);
label15_binder.setBindInfo(new BindInfo("starttime"));
label15_binder.setControl(label15);
binderGroup.addBinderToGroup(ID_LABEL15, label15_binder);
rounddiv6.addView(label15);

return rounddiv6;
}
public View getRounddiv7View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
rounddiv7 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_ROUNDDIV7
,"padding-right","15"
,"height","0"
,"weight","1"
,"layout-type","linear"
,"width","fill"
,"valign","center"
,"background-image","at44_mid.png"
);
label12 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL12
,"halign","left"
,"height","20"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","100"
,"margin-left","15"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label12,"content","#{res.task_end}"));
rounddiv7.addView(label12);
label16 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL16
,"bindfield","endtime"
,"halign","right"
,"height","fill"
,"weight","1"
,"color","#8e8e93"
,"layout-type","linear"
,"font-size","16"
,"width","0"
,"font-family","default"
,"valign","center"
);
UMTextBinder label16_binder = new UMTextBinder((IUMContextAccessor)context);
label16_binder.setBindInfo(new BindInfo("endtime"));
label16_binder.setControl(label16);
binderGroup.addBinderToGroup(ID_LABEL16, label16_binder);
rounddiv7.addView(label16);

return rounddiv7;
}
public View getRounddiv8View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
rounddiv8 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_ROUNDDIV8
,"padding-right","15"
,"height","0"
,"weight","1"
,"layout-type","linear"
,"width","fill"
,"valign","center"
,"background-image","at44_mid.png"
);
label13 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL13
,"halign","left"
,"height","20"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","100"
,"margin-left","15"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label13,"content","#{res.task_subject}"));
rounddiv8.addView(label13);
label17 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL17
,"bindfield","taskname"
,"halign","right"
,"height","fill"
,"weight","1"
,"onlongclick","contentdetail"
,"color","#8e8e93"
,"layout-type","linear"
,"font-size","16"
,"width","0"
,"font-family","default"
,"valign","center"
);
UMTextBinder label17_binder = new UMTextBinder((IUMContextAccessor)context);
label17_binder.setBindInfo(new BindInfo("taskname"));
label17_binder.setControl(label17);
binderGroup.addBinderToGroup(ID_LABEL17, label17_binder);
label17.setOnLongClickListener(new View.OnLongClickListener() {
  @Override
  public boolean onLongClick(View v) {
	  Intent intent = new Intent(
				Task_starttask_detailActivity.this,
				FillScreenActivity.class);
		intent.putExtra("checkText", ((UMLabel) v).getText());
		startActivity(intent);

return false;
}
});
rounddiv8.addView(label17);

return rounddiv8;
}
public View getRounddiv9View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
rounddiv9 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_ROUNDDIV9
,"padding-right","15"
,"height","0"
,"weight","1"
,"layout-type","linear"
,"width","fill"
,"valign","center"
,"background-image","at44_down.png"
);
label14 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL14
,"halign","left"
,"height","20"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","100"
,"margin-left","15"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label14,"content","#{res.task_responser}"));
rounddiv9.addView(label14);
label18 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL18
,"bindfield","chargername"
,"halign","right"
,"height","fill"
,"weight","1"
,"color","#8e8e93"
,"layout-type","linear"
,"font-size","16"
,"width","0"
,"font-family","default"
,"valign","center"
);
UMTextBinder label18_binder = new UMTextBinder((IUMContextAccessor)context);
label18_binder.setBindInfo(new BindInfo("chargername"));
label18_binder.setControl(label18);
binderGroup.addBinderToGroup(ID_LABEL18, label18_binder);
rounddiv9.addView(label18);

return rounddiv9;
}
public View getRounddiv0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
rounddiv0 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_ROUNDDIV0
,"halign","center"
,"height","176"
,"layout-type","linear"
,"background","#efeff4"
,"width","fill"
,"margin-top","5"
);
View rounddiv6 = (View) getRounddiv6View((UMActivity)context,binderGroup,configure);
rounddiv0.addView(rounddiv6);
View rounddiv7 = (View) getRounddiv7View((UMActivity)context,binderGroup,configure);
rounddiv0.addView(rounddiv7);
View rounddiv8 = (View) getRounddiv8View((UMActivity)context,binderGroup,configure);
rounddiv0.addView(rounddiv8);
View rounddiv9 = (View) getRounddiv9View((UMActivity)context,binderGroup,configure);
rounddiv0.addView(rounddiv9);

return rounddiv0;
}
public View getRounddiv16View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
rounddiv16 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_ROUNDDIV16
,"padding-right","15"
,"height","0"
,"weight","1"
,"layout-type","linear"
,"width","fill"
,"valign","center"
,"background-image","at44_top.png"
);
label7 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL7
,"halign","left"
,"height","20"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","100"
,"margin-left","15"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label7,"content","#{res.task_taskContent}"));
rounddiv16.addView(label7);
label19 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL19
,"bindfield","taskcontent"
,"halign","right"
,"height","fill"
,"weight","1"
,"onlongclick","contentdetail"
,"color","#8e8e93"
,"layout-type","linear"
,"font-size","16"
,"width","0"
,"font-family","default"
,"valign","center"
);
UMTextBinder label19_binder = new UMTextBinder((IUMContextAccessor)context);
label19_binder.setBindInfo(new BindInfo("taskcontent"));
label19_binder.setControl(label19);
binderGroup.addBinderToGroup(ID_LABEL19, label19_binder);
label19.setOnLongClickListener(new View.OnLongClickListener() {
  @Override
  public boolean onLongClick(View v) {
	  Intent intent = new Intent(
				Task_starttask_detailActivity.this,
				FillScreenActivity.class);
		intent.putExtra("checkText", ((UMLabel) v).getText());
		startActivity(intent);

return false;
}
});
rounddiv16.addView(label19);

return rounddiv16;
}
public View getRounddiv17View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
rounddiv17 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_ROUNDDIV17
,"padding-right","15"
,"height","0"
,"weight","1"
,"layout-type","linear"
,"width","fill"
,"valign","center"
,"background-image","at44_mid.png"
);
label8 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL8
,"halign","left"
,"height","20"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","100"
,"margin-left","15"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label8,"content","#{res.task_completionStandard}"));
rounddiv17.addView(label8);
label20 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL20
,"bindfield","completestandard"
,"halign","right"
,"height","fill"
,"weight","1"
,"onlongclick","contentdetail"
,"color","#8e8e93"
,"layout-type","linear"
,"font-size","16"
,"width","0"
,"font-family","default"
,"valign","center"
);
UMTextBinder label20_binder = new UMTextBinder((IUMContextAccessor)context);
label20_binder.setBindInfo(new BindInfo("completestandard"));
label20_binder.setControl(label20);
binderGroup.addBinderToGroup(ID_LABEL20, label20_binder);
label20.setOnLongClickListener(new View.OnLongClickListener() {
  @Override
  public boolean onLongClick(View v) {
	  Intent intent = new Intent(
				Task_starttask_detailActivity.this,
				FillScreenActivity.class);
		intent.putExtra("checkText", ((UMLabel) v).getText());
		startActivity(intent);

return false;
}
});
rounddiv17.addView(label20);

return rounddiv17;
}
public View getRounddiv18View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
rounddiv18 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_ROUNDDIV18
,"padding-right","15"
,"height","0"
,"weight","1"
,"layout-type","linear"
,"width","fill"
,"valign","center"
,"background-image","at44_mid.png"
);
label9 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL9
,"halign","left"
,"height","20"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","100"
,"margin-left","15"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label9,"content","#{res.task_priority}"));
rounddiv18.addView(label9);
label21 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL21
,"bindfield","priority"
,"halign","right"
,"height","fill"
,"weight","1"
,"color","#8e8e93"
,"layout-type","linear"
,"font-size","16"
,"width","0"
,"font-family","default"
,"valign","center"
);
UMTextBinder label21_binder = new UMTextBinder((IUMContextAccessor)context);
label21_binder.setBindInfo(new BindInfo("priority"));
label21_binder.setControl(label21);
binderGroup.addBinderToGroup(ID_LABEL21, label21_binder);
rounddiv18.addView(label21);

return rounddiv18;
}
public View getRounddiv19View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
rounddiv19 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_ROUNDDIV19
,"padding-right","15"
,"height","0"
,"weight","1"
,"layout-type","linear"
,"width","fill"
,"valign","center"
,"background-image","at44_down.png"
);
label10 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL10
,"halign","left"
,"height","20"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","100"
,"margin-left","15"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label10,"content","#{res.task_parentTask}"));
rounddiv19.addView(label10);
label22 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL22
,"bindfield","supertaskname"
,"halign","right"
,"height","fill"
,"weight","1"
,"color","#8e8e93"
,"layout-type","linear"
,"font-size","16"
,"width","0"
,"font-family","default"
,"valign","center"
);
UMTextBinder label22_binder = new UMTextBinder((IUMContextAccessor)context);
label22_binder.setBindInfo(new BindInfo("supertaskname"));
label22_binder.setControl(label22);
binderGroup.addBinderToGroup(ID_LABEL22, label22_binder);
rounddiv19.addView(label22);

return rounddiv19;
}
public View getRounddiv1View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
rounddiv1 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_ROUNDDIV1
,"halign","center"
,"height","176"
,"layout-type","linear"
,"background","#efeff4"
,"width","fill"
,"margin-top","20"
);
View rounddiv16 = (View) getRounddiv16View((UMActivity)context,binderGroup,configure);
rounddiv1.addView(rounddiv16);
View rounddiv17 = (View) getRounddiv17View((UMActivity)context,binderGroup,configure);
rounddiv1.addView(rounddiv17);
View rounddiv18 = (View) getRounddiv18View((UMActivity)context,binderGroup,configure);
rounddiv1.addView(rounddiv18);
View rounddiv19 = (View) getRounddiv19View((UMActivity)context,binderGroup,configure);
rounddiv1.addView(rounddiv19);

return rounddiv1;
}
public View getRounddiv12View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
rounddiv12 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_ROUNDDIV12
,"padding-right","15"
,"height","0"
,"weight","1"
,"layout-type","linear"
,"width","fill"
,"valign","center"
,"background-image","at44_top.png"
);
label6 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL6
,"halign","left"
,"height","20"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","100"
,"margin-left","15"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label6,"content","#{res.task_remingdingMethod}"));
rounddiv12.addView(label6);

return rounddiv12;
}
public View getRounddiv13View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
rounddiv13 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_ROUNDDIV13
,"height","0"
,"weight","1"
,"layout-type","linear"
,"width","fill"
,"valign","center"
,"background-image","at44_mid.png"
);
checkbox0 = (UMCheckbox)ThirdControl.createControl(new UMCheckbox(context),ID_CHECKBOX0
,"bindfield","msg"
,"height","20"
,"placeholder",""
,"layout-type","linear"
,"width","20"
,"check-on-image","checkbox_select"
,"margin-left","115"
,"readonly","true"
,"check-off-image","checkbox_noselect"
);
UMCheckBoxBinder checkbox0_binder = new UMCheckBoxBinder((IUMContextAccessor)context);
checkbox0_binder.setBindInfo(new BindInfo("msg"));
checkbox0_binder.setControl(checkbox0);
binderGroup.addBinderToGroup(ID_CHECKBOX0, checkbox0_binder);
rounddiv13.addView(checkbox0);
label222 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL222
,"halign","left"
,"height","30"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","90"
,"margin-left","5"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label222,"content","#{res.task_notice}"));
rounddiv13.addView(label222);
checkbox1 = (UMCheckbox)ThirdControl.createControl(new UMCheckbox(context),ID_CHECKBOX1
,"padding-left","2"
,"bindfield","email"
,"height","20"
,"layout-type","linear"
,"width","20"
,"check-on-image","checkbox_select"
,"readonly","true"
,"check-off-image","checkbox_noselect"
);
UMCheckBoxBinder checkbox1_binder = new UMCheckBoxBinder((IUMContextAccessor)context);
checkbox1_binder.setBindInfo(new BindInfo("email"));
checkbox1_binder.setControl(checkbox1);
binderGroup.addBinderToGroup(ID_CHECKBOX1, checkbox1_binder);
rounddiv13.addView(checkbox1);
label223 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL223
,"halign","left"
,"height","30"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","90"
,"margin-left","5"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label223,"content","#{res.task_email}"));
rounddiv13.addView(label223);

return rounddiv13;
}
public View getRounddiv14View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
rounddiv14 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_ROUNDDIV14
,"height","0"
,"weight","1"
,"layout-type","linear"
,"width","fill"
,"valign","center"
,"background-image","at44_down.png"
);
checkbox2 = (UMCheckbox)ThirdControl.createControl(new UMCheckbox(context),ID_CHECKBOX2
,"bindfield","sms"
,"height","20"
,"layout-type","linear"
,"width","20"
,"check-on-image","checkbox_select"
,"margin-left","115"
,"readonly","true"
,"check-off-image","checkbox_noselect"
);
UMCheckBoxBinder checkbox2_binder = new UMCheckBoxBinder((IUMContextAccessor)context);
checkbox2_binder.setBindInfo(new BindInfo("sms"));
checkbox2_binder.setControl(checkbox2);
binderGroup.addBinderToGroup(ID_CHECKBOX2, checkbox2_binder);
rounddiv14.addView(checkbox2);
label224 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL224
,"halign","left"
,"height","30"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","90"
,"margin-left","5"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label224,"content","#{res.task_sms}"));
rounddiv14.addView(label224);
checkbox3 = (UMCheckbox)ThirdControl.createControl(new UMCheckbox(context),ID_CHECKBOX3
,"padding-left","2"
,"bindfield","im"
,"height","20"
,"layout-type","linear"
,"width","20"
,"check-on-image","checkbox_select"
,"readonly","true"
,"check-off-image","checkbox_noselect"
);
UMCheckBoxBinder checkbox3_binder = new UMCheckBoxBinder((IUMContextAccessor)context);
checkbox3_binder.setBindInfo(new BindInfo("im"));
checkbox3_binder.setControl(checkbox3);
binderGroup.addBinderToGroup(ID_CHECKBOX3, checkbox3_binder);
rounddiv14.addView(checkbox3);
label225 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL225
,"halign","left"
,"height","30"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","90"
,"margin-left","5"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label225,"content","#{res.task_im}"));
rounddiv14.addView(label225);

return rounddiv14;
}
public View getRounddiv2View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
rounddiv2 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_ROUNDDIV2
,"halign","center"
,"height","132"
,"layout-type","linear"
,"background","#efeff4"
,"width","fill"
,"margin-top","20"
);
View rounddiv12 = (View) getRounddiv12View((UMActivity)context,binderGroup,configure);
rounddiv2.addView(rounddiv12);
View rounddiv13 = (View) getRounddiv13View((UMActivity)context,binderGroup,configure);
rounddiv2.addView(rounddiv13);
View rounddiv14 = (View) getRounddiv14View((UMActivity)context,binderGroup,configure);
rounddiv2.addView(rounddiv14);

return rounddiv2;
}
public View getRounddiv10View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
rounddiv10 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_ROUNDDIV10
,"padding-right","15"
,"height","0"
,"weight","1"
,"layout-type","linear"
,"width","fill"
,"valign","center"
,"background-image","at44_top.png"
);
labe26 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABE26
,"bindfield","assistantstructlistcache"
,"halign","left"
,"height","14"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","200"
,"font-family","default"
,"display","none"
,"valign","center"
);
UMTextBinder labe26_binder = new UMTextBinder((IUMContextAccessor)context);
labe26_binder.setBindInfo(new BindInfo("assistantstructlistcache"));
labe26_binder.setControl(labe26);
binderGroup.addBinderToGroup(ID_LABE26, labe26_binder);
rounddiv10.addView(labe26);
label4 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL4
,"halign","left"
,"height","20"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","100"
,"margin-left","15"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label4,"content","#{res.task_assistant}"));
rounddiv10.addView(label4);
label23 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL23
,"bindfield","assistpersonlist"
,"halign","right"
,"height","fill"
,"weight","1"
,"color","#8e8e93"
,"layout-type","linear"
,"font-size","16"
,"width","0"
,"font-family","default"
,"valign","center"
);
UMTextBinder label23_binder = new UMTextBinder((IUMContextAccessor)context);
label23_binder.setBindInfo(new BindInfo("assistpersonlist"));
label23_binder.setControl(label23);
binderGroup.addBinderToGroup(ID_LABEL23, label23_binder);
rounddiv10.addView(label23);

return rounddiv10;
}
public View getRounddiv11View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
rounddiv11 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_ROUNDDIV11
,"padding-right","15"
,"height","0"
,"weight","1"
,"layout-type","linear"
,"width","fill"
,"valign","center"
,"background-image","at44_down.png"
);
labe28 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABE28
,"bindfield","exammanstructlistcache"
,"halign","left"
,"height","14"
,"color","#000000"
,"layout-type","linear"
,"font-size","12"
,"width","200"
,"font-family","default"
,"display","none"
,"valign","center"
);
UMTextBinder labe28_binder = new UMTextBinder((IUMContextAccessor)context);
labe28_binder.setBindInfo(new BindInfo("exammanstructlistcache"));
labe28_binder.setControl(labe28);
binderGroup.addBinderToGroup(ID_LABE28, labe28_binder);
rounddiv11.addView(labe28);
label5 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL5
,"halign","left"
,"height","20"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","100"
,"margin-left","15"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label5,"content","#{res.task_viewer}"));
rounddiv11.addView(label5);
label24 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL24
,"bindfield","exammanpsnlist"
,"halign","right"
,"height","fill"
,"weight","1"
,"color","#8e8e93"
,"layout-type","linear"
,"font-size","16"
,"width","0"
,"font-family","default"
,"valign","center"
);
UMTextBinder label24_binder = new UMTextBinder((IUMContextAccessor)context);
label24_binder.setBindInfo(new BindInfo("exammanpsnlist"));
label24_binder.setControl(label24);
binderGroup.addBinderToGroup(ID_LABEL24, label24_binder);
rounddiv11.addView(label24);

return rounddiv11;
}
public View getRounddiv3View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
rounddiv3 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_ROUNDDIV3
,"halign","center"
,"height","88"
,"layout-type","linear"
,"background","#efeff4"
,"width","fill"
,"margin-top","20"
);
View rounddiv10 = (View) getRounddiv10View((UMActivity)context,binderGroup,configure);
rounddiv3.addView(rounddiv10);
View rounddiv11 = (View) getRounddiv11View((UMActivity)context,binderGroup,configure);
rounddiv3.addView(rounddiv11);

return rounddiv3;
}
public View getRounddiv55View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
rounddiv55 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_ROUNDDIV55
,"padding-right","15"
,"height","42"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"valign","center"
);
label3 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL3
,"halign","left"
,"height","20"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","100"
,"margin-left","15"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label3,"content","#{res.task_comments}"));
rounddiv55.addView(label3);
label25 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL25
,"bindfield","remark"
,"halign","right"
,"height","fill"
,"weight","1"
,"onlongclick","contentdetail"
,"color","#8e8e93"
,"layout-type","linear"
,"font-size","16"
,"width","0"
,"font-family","default"
,"valign","center"
);
UMTextBinder label25_binder = new UMTextBinder((IUMContextAccessor)context);
label25_binder.setBindInfo(new BindInfo("remark"));
label25_binder.setControl(label25);
binderGroup.addBinderToGroup(ID_LABEL25, label25_binder);
label25.setOnLongClickListener(new View.OnLongClickListener() {
  @Override
  public boolean onLongClick(View v) {
	  Intent intent = new Intent(
				Task_starttask_detailActivity.this,
				FillScreenActivity.class);
		intent.putExtra("checkText", ((UMLabel) v).getText());
		startActivity(intent);

return false;
}
});
rounddiv55.addView(label25);

return rounddiv55;
}
public View getRounddiv5View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
rounddiv5 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_ROUNDDIV5
,"height","44"
,"layout-type","linear"
,"background","#c8c7cc"
,"width","fill"
,"margin-top","20"
,"valign","center"
);
View rounddiv55 = (View) getRounddiv55View((UMActivity)context,binderGroup,configure);
rounddiv5.addView(rounddiv55);

return rounddiv5;
}
public View getRounddiv44View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
rounddiv44 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_ROUNDDIV44
,"padding-right","15"
,"height","42"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"valign","center"
);
label1 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL1
,"halign","left"
,"height","20"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","100"
,"margin-left","15"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label1,"content","#{res.task_attachment}"));
rounddiv44.addView(label1);
label2 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL2
,"padding-right","5"
,"bindfield","count"
,"halign","right"
,"height","fill"
,"weight","1"
,"color","#8e8e93"
,"layout-type","linear"
,"font-size","16"
,"width","0"
,"font-family","default"
,"valign","center"
);
UMTextBinder label2_binder = new UMTextBinder((IUMContextAccessor)context);
label2_binder.setBindInfo(new BindInfo("count"));
label2_binder.setControl(label2);
binderGroup.addBinderToGroup(ID_LABEL2, label2_binder);
rounddiv44.addView(label2);
button2 = (UMButton)ThirdControl.createControl(new UMButton(context),ID_BUTTON2
,"halign","center"
,"height","13"
,"color","#ff0000"
,"pressed-image","ecm_arrow_right.png"
,"layout-type","linear"
,"font-size","18"
,"width","8"
,"background-image-dis","button"
,"font-family","default"
,"valign","center"
,"background-image","ecm_arrow_right.png"
);
rounddiv44.addView(button2);

return rounddiv44;
}
public View getRounddiv4View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
rounddiv4 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_ROUNDDIV4
,"height","44"
,"layout-type","linear"
,"background","#c8c7cc"
,"width","fill"
,"onclick","getattchment"
,"margin-top","20"
,"valign","center"
);
rounddiv4.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Task_starttask_detailActivity.this);
    actionGetattchment(rounddiv4,args);

}
});
View rounddiv44 = (View) getRounddiv44View((UMActivity)context,binderGroup,configure);
rounddiv4.addView(rounddiv44);

return rounddiv4;
}
public View getRounddiv64View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
rounddiv64 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_ROUNDDIV64
,"padding-right","15"
,"height","42"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"valign","center"
);
label51 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL51
,"halign","left"
,"height","20"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","100"
,"margin-left","15"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label51,"content","#{res.task_reportHistory}"));
rounddiv64.addView(label51);
label333 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL333
,"halign","center"
,"weight","1"
,"layout-type","linear"
,"width","0"
,"valign","center"
);
rounddiv64.addView(label333);
image0 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_IMAGE0
,"height","13"
,"layout-type","linear"
,"width","8"
,"scaletype","fitcenter"
,"src","ecm_arrow_right.png"
);
rounddiv64.addView(image0);

return rounddiv64;
}
public View getRounddiv54View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
rounddiv54 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_ROUNDDIV54
,"height","44"
,"layout-type","linear"
,"background","#c8c7cc"
,"width","fill"
,"onclick","getreporthistory"
,"margin-top","20"
,"valign","center"
);
rounddiv54.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Task_starttask_detailActivity.this);
    actionGetreporthistory(rounddiv54,args);

}
});
View rounddiv64 = (View) getRounddiv64View((UMActivity)context,binderGroup,configure);
rounddiv54.addView(rounddiv64);

return rounddiv54;
}
public View getPanel11View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel11 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL11
,"halign","center"
,"height","wrap"
,"layout-type","linear"
,"background","#efeff4"
,"width","fill"
);
View rounddiv0 = (View) getRounddiv0View((UMActivity)context,binderGroup,configure);
panel11.addView(rounddiv0);
View rounddiv1 = (View) getRounddiv1View((UMActivity)context,binderGroup,configure);
panel11.addView(rounddiv1);
View rounddiv2 = (View) getRounddiv2View((UMActivity)context,binderGroup,configure);
panel11.addView(rounddiv2);
View rounddiv3 = (View) getRounddiv3View((UMActivity)context,binderGroup,configure);
panel11.addView(rounddiv3);
View rounddiv5 = (View) getRounddiv5View((UMActivity)context,binderGroup,configure);
panel11.addView(rounddiv5);
View rounddiv4 = (View) getRounddiv4View((UMActivity)context,binderGroup,configure);
panel11.addView(rounddiv4);
View rounddiv54 = (View) getRounddiv54View((UMActivity)context,binderGroup,configure);
panel11.addView(rounddiv54);

return panel11;
}
public View getScrollview_panel11View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
Scrollview_panel11 = (UMScrollView)ThirdControl.createControl(new UMScrollView(context),ID_SCROLLVIEW_PANEL11
,"height","fill"
,"layout-type","linear"
,"width","fill"
);
View panel11 = (View) getPanel11View((UMActivity)context,binderGroup,configure);
Scrollview_panel11.addView(panel11);

return Scrollview_panel11;
}
public View getPanel0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel0 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL0
,"halign","center"
,"height","0"
,"weight","1"
,"onload","startload"
,"layout-type","linear"
,"background","#efeff4"
,"width","fill"
,"margin-top","15"
);
View Scrollview_panel11 = (View) getScrollview_panel11View((UMActivity)context,binderGroup,configure);
panel0.addView(Scrollview_panel11);

return panel0;
}
public View getToolbar0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
toolbar0 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_TOOLBAR0
,"padding-right","8"
,"padding-left","8"
,"height","49"
,"pressed-image","toolbar"
,"layout-type","linear"
,"width","fill"
,"background-image-dis","toolbar"
,"valign","center"
,"background-image","toolbar.png"
);
button1 = (UMButton)ThirdControl.createControl(new UMButton(context),ID_BUTTON1
,"halign","left"
,"weight","1"
,"pressed-image","button_touch"
,"width","0"
,"background-image-dis","button"
,"height","30"
,"color","#e50011"
,"layout-type","linear"
,"font-size","18"
,"onclick","canceljs"
,"font-family","default"
,"valign","center"
,"background-image","button"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,button1,"value","#{res.task_cancel}"));
button1.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Task_starttask_detailActivity.this);
    actionCanceljs(button1,args);

}
});
toolbar0.addView(button1);
button3 = (UMButton)ThirdControl.createControl(new UMButton(context),ID_BUTTON3
,"halign","center"
,"weight","1"
,"pressed-image","button_touch"
,"width","0"
,"background-image-dis","button"
,"height","30"
,"color","#e50011"
,"layout-type","linear"
,"font-size","18"
,"margin-left","5"
,"onclick","deldialog"
,"font-family","default"
,"valign","center"
,"background-image","button"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,button3,"value","#{res.task_delete}"));
button3.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Task_starttask_detailActivity.this);
    actionDeldialog(button3,args);

}
});
toolbar0.addView(button3);
button4 = (UMButton)ThirdControl.createControl(new UMButton(context),ID_BUTTON4
,"halign","right"
,"weight","1"
,"pressed-image","button_touch"
,"width","0"
,"background-image-dis","button"
,"height","30"
,"color","#e50011"
,"layout-type","linear"
,"font-size","18"
,"onclick","openUrgewin"
,"font-family","default"
,"valign","center"
,"background-image","button"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,button4,"value","#{res.task_remind}"));
button4.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Task_starttask_detailActivity.this);
    actionOpenUrgewin(button4,args);

}
});
toolbar0.addView(button4);

return toolbar0;
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
View panel0 = (View) getPanel0View((UMActivity)context,binderGroup,configure);
viewPage0.addView(panel0);
View toolbar0 = (View) getToolbar0View((UMActivity)context,binderGroup,configure);
viewPage0.addView(toolbar0);

return viewPage0;
}
public UMWindow getCurrentWindow(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
starttask_detail = (UMWindow)ThirdControl.createControl(new UMWindow(context),ID_STARTTASK_DETAIL
,"halign","center"
,"height","fill"
,"layout","vbox"
,"width","fill"
,"context","detailtask"
,"controller","starttask_detailController"
,"namespace","nc.bs.oa.oama.ecm"
);
View viewPage0 = (View) getViewPage0View((UMActivity)context,binderGroup,configure);
starttask_detail.addView(viewPage0);

return (UMWindow)starttask_detail;
}

	
	public void actionCanceldialog(View control, UMEventArgs args) {
    String actionid = "canceldialog";
    args.put("message","#{res.task_canceltask}");
    args.put("title","#{res.task_cancel}");
    args.put("okaction","cancelTask");
    args.put("okbuttontitle","#{res.task_ok}");
    args.put("style","ok-cancel");
  this.dataCollect();
    args.put("contextmapping","detaildata");
    args.put("containerName","");
    args.put("cancelbuttontitle","#{res.task_cancel}");
  ActionProcessor.exec(this, actionid, args);
UMView.openDialog(args);
}
public void actionAltertip(View control, UMEventArgs args) {
    String actionid = "altertip";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "altertip",UMActivity.getViewId(control),args);
}
public void actionCanceljs(View control, UMEventArgs args) {
    String actionid = "canceljs";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "canceljs",UMActivity.getViewId(control),args);
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
public void actionCancelTask(View control, UMEventArgs args) {
    String actionid = "cancelTask";
    args.put("viewid","nc.bs.oa.oama.oatask.DetailtaskExtendController");
    args.put("taskid","#{taskid}");
  this.dataCollect();
    args.put("action","cancelTask");
    args.put("callback","returntip");
    args.put("autoDataBinding","true");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMService.callAction(args);
}
public void actionDelTask(View control, UMEventArgs args) {
    String actionid = "delTask";
    args.put("viewid","nc.bs.oa.oama.oatask.DetailtaskExtendController");
    args.put("taskid","#{taskid}");
  this.dataCollect();
    args.put("action","delTaskForUAP");
    args.put("callback","returntip");
    args.put("autoDataBinding","true");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMService.callAction(args);
}
public void actionGetattchment(View control, UMEventArgs args) {
    String actionid = "getattchment";
    args.put("viewid","nc.bs.oa.oama.ecm.Task_file_detail");
    args.put("taskid","#{taskid}");
  this.dataCollect();
    args.put("iskeep","true");
    args.put("type","1");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.open(args);
}
public void actionReturnback(View control, UMEventArgs args) {
    String actionid = "returnback";
    args.put("viewid","nc.bs.oa.oama.ecm.Task_mainviewtwo");
    args.put("iskeep","false");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.open(args);
}
public void actionStartload(View control, UMEventArgs args) {
    String actionid = "startload";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "startload",UMActivity.getViewId(control),args);
}
public void actionEdittask(View control, UMEventArgs args) {
    String actionid = "edittask";
    args.put("taskdetail","#{CONTEXT}");
    args.put("viewid","nc.bs.oa.oama.ecm.Task_edit");
  this.dataCollect();
    args.put("iskeep","false");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.open(args);
}
public void actionReturntip(View control, UMEventArgs args) {
    String actionid = "returntip";
    args.put("message","#{res.task_dosuccess}");
    args.put("abc","#{detaildata}");
    args.put("title","提示");
    args.put("okaction","returnback");
    args.put("okbuttontitle","#{res.task_ok}");
    args.put("style","ok");
  this.dataCollect();
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.openDialog(args);
}
public void actionUMonInit(View control, UMEventArgs args) {
    String actionid = "UMonInit";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "UMonInit",UMActivity.getViewId(control),args);
}
public void actionOpenUrgewin(View control, UMEventArgs args) {
    String actionid = "openUrgewin";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "openUrgewin",UMActivity.getViewId(control),args);
}
public void actionUMonLoad(View control, UMEventArgs args) {
    String actionid = "UMonLoad";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "UMonLoad",UMActivity.getViewId(control),args);
}
public void actionContentdetail(View control, UMEventArgs args) {
    String actionid = "contentdetail";
    args.put("viewid","detail");
    args.put("iskeep","true");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.open(args);
}
public void actionBeforeedittask(View control, UMEventArgs args) {
    String actionid = "beforeedittask";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "beforeedittask",UMActivity.getViewId(control),args);
}
public void actionGetreporthistory(View control, UMEventArgs args) {
    String actionid = "getreporthistory";
    args.put("viewid","nc.bs.oa.oama.ecm.Task_reporthistory");
    args.put("taskid","#{taskid}");
  this.dataCollect();
    args.put("iskeep","true");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.open(args);
}
public void actionDeldialog(View control, UMEventArgs args) {
    String actionid = "deldialog";
    args.put("message","#{res.task_deletetask}");
    args.put("title","#{res.task_delete}");
    args.put("okaction","delTask");
    args.put("okbuttontitle","#{res.task_ok}");
    args.put("style","ok-cancel");
  this.dataCollect();
    args.put("contextmapping","detaildata");
    args.put("containerName","");
    args.put("cancelbuttontitle","#{res.task_cancel}");
  ActionProcessor.exec(this, actionid, args);
UMView.openDialog(args);
}


}
