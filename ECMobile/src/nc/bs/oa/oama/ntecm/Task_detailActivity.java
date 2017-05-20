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

public abstract class Task_detailActivity extends UMWindowActivity {

	protected UMWindow task_detail = null;
protected XVerticalLayout viewPage0 = null;
protected XHorizontalLayout navigatorbar0 = null;
protected UMButton button0 = null;
protected UMLabel label0 = null;
protected UMLabel label26 = null;
protected XVerticalLayout panel0 = null;
protected UMScrollView Scrollview_panel11 = null;
protected XVerticalLayout panel11 = null;
protected XVerticalLayout rounddiv20 = null;
protected UMLabel label6 = null;
protected UMLabel label27 = null;
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
protected XVerticalLayout rounddiv3 = null;
protected XHorizontalLayout rounddiv110 = null;
protected UMLabel labe1l4 = null;
protected UMLabel label123 = null;
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
protected XHorizontalLayout rounddiv24 = null;
protected XHorizontalLayout rounddiv34 = null;
protected UMLabel label111 = null;
protected UMLabel label222 = null;
protected UMButton button222 = null;
protected XHorizontalLayout rounddiv4 = null;
protected XHorizontalLayout rounddiv44 = null;
protected UMLabel label1 = null;
protected UMLabel label333 = null;
protected UMImage image0 = null;
protected XHorizontalLayout toolbar0 = null;
protected UMButton button1 = null;
protected UMLabel label2 = null;
protected UMButton button2 = null;

	
	protected final static int ID_TASK_DETAIL = 1026422024;
protected final static int ID_VIEWPAGE0 = 1480199088;
protected final static int ID_NAVIGATORBAR0 = 1173196178;
protected final static int ID_BUTTON0 = 1712975564;
protected final static int ID_LABEL0 = 1058349588;
protected final static int ID_LABEL26 = 509812900;
protected final static int ID_PANEL0 = 609119721;
protected final static int ID_SCROLLVIEW_PANEL11 = 724020900;
protected final static int ID_PANEL11 = 1302419153;
protected final static int ID_ROUNDDIV20 = 1084545861;
protected final static int ID_LABEL6 = 887418065;
protected final static int ID_LABEL27 = 1619085427;
protected final static int ID_ROUNDDIV0 = 1649169216;
protected final static int ID_ROUNDDIV6 = 1197785807;
protected final static int ID_LABEL11 = 2017228201;
protected final static int ID_LABEL15 = 233085065;
protected final static int ID_ROUNDDIV7 = 1810201147;
protected final static int ID_LABEL12 = 550848498;
protected final static int ID_LABEL16 = 28845539;
protected final static int ID_ROUNDDIV8 = 1182500701;
protected final static int ID_LABEL13 = 2145504500;
protected final static int ID_LABEL17 = 660115999;
protected final static int ID_ROUNDDIV9 = 1777872831;
protected final static int ID_LABEL14 = 1718737621;
protected final static int ID_LABEL18 = 715494881;
protected final static int ID_ROUNDDIV1 = 609344330;
protected final static int ID_ROUNDDIV16 = 353217040;
protected final static int ID_LABEL7 = 2074545090;
protected final static int ID_LABEL19 = 583053472;
protected final static int ID_ROUNDDIV17 = 1952104874;
protected final static int ID_LABEL8 = 1593583320;
protected final static int ID_LABEL20 = 1783718031;
protected final static int ID_ROUNDDIV18 = 599355080;
protected final static int ID_LABEL9 = 978739459;
protected final static int ID_LABEL21 = 1320287071;
protected final static int ID_ROUNDDIV19 = 1106257698;
protected final static int ID_LABEL10 = 1931863924;
protected final static int ID_LABEL22 = 315247636;
protected final static int ID_ROUNDDIV3 = 1516486362;
protected final static int ID_ROUNDDIV110 = 1118450072;
protected final static int ID_LABE1L4 = 294731307;
protected final static int ID_LABEL123 = 1842183231;
protected final static int ID_ROUNDDIV10 = 315003145;
protected final static int ID_LABE26 = 1439667604;
protected final static int ID_LABEL4 = 511178535;
protected final static int ID_LABEL23 = 583915789;
protected final static int ID_ROUNDDIV11 = 1944052151;
protected final static int ID_LABE28 = 1055737271;
protected final static int ID_LABEL5 = 449396796;
protected final static int ID_LABEL24 = 962033304;
protected final static int ID_ROUNDDIV5 = 1404226557;
protected final static int ID_ROUNDDIV55 = 561780062;
protected final static int ID_LABEL3 = 944181244;
protected final static int ID_LABEL25 = 192969550;
protected final static int ID_ROUNDDIV24 = 1491551093;
protected final static int ID_ROUNDDIV34 = 430282063;
protected final static int ID_LABEL111 = 532321295;
protected final static int ID_LABEL222 = 348305566;
protected final static int ID_BUTTON222 = 777347132;
protected final static int ID_ROUNDDIV4 = 700088287;
protected final static int ID_ROUNDDIV44 = 203558766;
protected final static int ID_LABEL1 = 2121771940;
protected final static int ID_LABEL333 = 286507383;
protected final static int ID_IMAGE0 = 538567132;
protected final static int ID_TOOLBAR0 = 1423394417;
protected final static int ID_BUTTON1 = 1625770380;
protected final static int ID_LABEL2 = 1054448852;
protected final static int ID_BUTTON2 = 1749516797;

	
	
	@Override
	public String getControllerName() {
		return "task_detailController";
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
		  idmap.put("task_detail",ID_TASK_DETAIL);
  idmap.put("viewPage0",ID_VIEWPAGE0);
  idmap.put("navigatorbar0",ID_NAVIGATORBAR0);
  idmap.put("button0",ID_BUTTON0);
  idmap.put("label0",ID_LABEL0);
  idmap.put("label26",ID_LABEL26);
  idmap.put("panel0",ID_PANEL0);
  idmap.put("Scrollview_panel11",ID_SCROLLVIEW_PANEL11);
  idmap.put("panel11",ID_PANEL11);
  idmap.put("rounddiv20",ID_ROUNDDIV20);
  idmap.put("label6",ID_LABEL6);
  idmap.put("label27",ID_LABEL27);
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
  idmap.put("rounddiv3",ID_ROUNDDIV3);
  idmap.put("rounddiv110",ID_ROUNDDIV110);
  idmap.put("labe1l4",ID_LABE1L4);
  idmap.put("label123",ID_LABEL123);
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
  idmap.put("rounddiv24",ID_ROUNDDIV24);
  idmap.put("rounddiv34",ID_ROUNDDIV34);
  idmap.put("label111",ID_LABEL111);
  idmap.put("label222",ID_LABEL222);
  idmap.put("button222",ID_BUTTON222);
  idmap.put("rounddiv4",ID_ROUNDDIV4);
  idmap.put("rounddiv44",ID_ROUNDDIV44);
  idmap.put("label1",ID_LABEL1);
  idmap.put("label333",ID_LABEL333);
  idmap.put("image0",ID_IMAGE0);
  idmap.put("toolbar0",ID_TOOLBAR0);
  idmap.put("button1",ID_BUTTON1);
  idmap.put("label2",ID_LABEL2);
  idmap.put("button2",ID_BUTTON2);

	}
	
	public void onLoad() {
		ULog.logLC("onLoad", this);
		if(currentPage!=null) {
			currentPage.onLoad();
		}
	
		{ //panel0 - taskonload
    UMEventArgs args = new UMEventArgs(Task_detailActivity.this);
    actionTaskonload(panel0,args);

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
,"padding-right","15"
,"pressed-image","nav"
,"width","fill"
,"background-image-dis","nav"
,"height","44"
,"color","#ffffff"
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
,"color","#e50011"
,"layout-type","linear"
,"font-size","17"
,"onclick","back"
,"font-family","default"
,"valign","center"
,"background-image","btn_back"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,button0,"value","#{res.task_back}"));
button0.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Task_detailActivity.this);
    actionBack(button0,args);

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
navigatorbar0.addView(label0);
label26 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL26
,"halign","center"
,"height","14"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","42"
,"font-family","default"
,"valign","center"
);
navigatorbar0.addView(label26);

return navigatorbar0;
}
public View getRounddiv20View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
rounddiv20 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_ROUNDDIV20
,"halign","left"
,"height","wrap"
,"heightwrap","60.0"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"display","none"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,rounddiv20,"title","#{res.task_urgemsg}"));
label6 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL6
,"margin-right","15"
,"halign","left"
,"height","20"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","fill"
,"margin-left","15"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label6,"content","#{res.task_remind}"));
rounddiv20.addView(label6);
label27 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL27
,"bindfield","urgecontent"
,"halign","center"
,"width","fill"
,"type","multiline"
,"margin-right","15"
,"height","wrap"
,"color","#8e8e93"
,"heightwrap","40.0"
,"layout-type","linear"
,"font-size","12"
,"margin-left","15"
,"font-family","default"
,"valign","center"
);
UMTextBinder label27_binder = new UMTextBinder((IUMContextAccessor)context);
label27_binder.setBindInfo(new BindInfo("urgecontent"));
label27_binder.setControl(label27);
binderGroup.addBinderToGroup(ID_LABEL27, label27_binder);
rounddiv20.addView(label27);

return rounddiv20;
}
public View getRounddiv6View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
rounddiv6 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_ROUNDDIV6
,"padding-right","15"
,"height","44"
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
,"height","44"
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
,"height","44"
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
				Task_detailActivity.this,
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
,"height","44"
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
				Task_detailActivity.this,
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
				Task_detailActivity.this,
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
,"height","17"
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
public View getRounddiv110View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
rounddiv110 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_ROUNDDIV110
,"padding-right","15"
,"height","0"
,"weight","1"
,"layout-type","linear"
,"width","fill"
,"valign","center"
,"background-image","at44_top.png"
);
labe1l4 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABE1L4
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
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,labe1l4,"content","#{res.task_launcher}"));
rounddiv110.addView(labe1l4);
label123 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL123
,"bindfield","launchername"
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
UMTextBinder label123_binder = new UMTextBinder((IUMContextAccessor)context);
label123_binder.setBindInfo(new BindInfo("launchername"));
label123_binder.setControl(label123);
binderGroup.addBinderToGroup(ID_LABEL123, label123_binder);
rounddiv110.addView(label123);

return rounddiv110;
}
public View getRounddiv10View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
rounddiv10 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_ROUNDDIV10
,"padding-right","15"
,"height","0"
,"weight","1"
,"layout-type","linear"
,"width","fill"
,"valign","center"
,"background-image","at44_mid.png"
);
labe26 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABE26
,"bindfield","assistantstructlistcache"
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
,"height","132"
,"layout-type","linear"
,"background","#efeff4"
,"width","fill"
,"margin-top","20"
);
View rounddiv110 = (View) getRounddiv110View((UMActivity)context,binderGroup,configure);
rounddiv3.addView(rounddiv110);
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
				Task_detailActivity.this,
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
public View getRounddiv34View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
rounddiv34 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_ROUNDDIV34
,"padding-right","15"
,"height","42"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"valign","center"
);
label111 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL111
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
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label111,"content","#{res.task_attachment}"));
rounddiv34.addView(label111);
label222 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL222
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
UMTextBinder label222_binder = new UMTextBinder((IUMContextAccessor)context);
label222_binder.setBindInfo(new BindInfo("count"));
label222_binder.setControl(label222);
binderGroup.addBinderToGroup(ID_LABEL222, label222_binder);
rounddiv34.addView(label222);
button222 = (UMButton)ThirdControl.createControl(new UMButton(context),ID_BUTTON222
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
rounddiv34.addView(button222);

return rounddiv34;
}
public View getRounddiv24View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
rounddiv24 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_ROUNDDIV24
,"height","44"
,"layout-type","linear"
,"background","#c8c7cc"
,"width","fill"
,"onclick","getattchment"
,"margin-top","20"
,"valign","center"
);
rounddiv24.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Task_detailActivity.this);
    actionGetattchment(rounddiv24,args);

}
});
View rounddiv34 = (View) getRounddiv34View((UMActivity)context,binderGroup,configure);
rounddiv24.addView(rounddiv34);

return rounddiv24;
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
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label1,"content","#{res.task_reportHistory}"));
rounddiv44.addView(label1);
label333 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL333
,"halign","center"
,"weight","1"
,"layout-type","linear"
,"width","0"
,"valign","center"
);
rounddiv44.addView(label333);
image0 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_IMAGE0
,"height","13"
,"layout-type","linear"
,"width","8"
,"scaletype","fitcenter"
,"src","ecm_arrow_right.png"
);
rounddiv44.addView(image0);

return rounddiv44;
}
public View getRounddiv4View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
rounddiv4 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_ROUNDDIV4
,"height","44"
,"layout-type","linear"
,"background","#c8c7cc"
,"width","fill"
,"onclick","getreporthistory"
,"margin-top","20"
,"valign","center"
);
rounddiv4.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Task_detailActivity.this);
    actionGetreporthistory(rounddiv4,args);

}
});
View rounddiv44 = (View) getRounddiv44View((UMActivity)context,binderGroup,configure);
rounddiv4.addView(rounddiv44);

return rounddiv4;
}
public View getPanel11View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel11 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL11
,"halign","center"
,"height","wrap"
,"layout-type","linear"
,"background","#efeff4"
,"width","fill"
);
View rounddiv20 = (View) getRounddiv20View((UMActivity)context,binderGroup,configure);
panel11.addView(rounddiv20);
View rounddiv0 = (View) getRounddiv0View((UMActivity)context,binderGroup,configure);
panel11.addView(rounddiv0);
View rounddiv1 = (View) getRounddiv1View((UMActivity)context,binderGroup,configure);
panel11.addView(rounddiv1);
View rounddiv3 = (View) getRounddiv3View((UMActivity)context,binderGroup,configure);
panel11.addView(rounddiv3);
View rounddiv5 = (View) getRounddiv5View((UMActivity)context,binderGroup,configure);
panel11.addView(rounddiv5);
View rounddiv24 = (View) getRounddiv24View((UMActivity)context,binderGroup,configure);
panel11.addView(rounddiv24);
View rounddiv4 = (View) getRounddiv4View((UMActivity)context,binderGroup,configure);
panel11.addView(rounddiv4);

return panel11;
}
public View getScrollview_panel11View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
Scrollview_panel11 = (UMScrollView)ThirdControl.createControl(new UMScrollView(context),ID_SCROLLVIEW_PANEL11
,"height","fill"
,"layout-type","linear"
,"width","fill"
,"hscrollenabled","disabled"
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
,"onload","taskonload"
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
,"padding-left","8"
,"padding-right","8"
,"height","49"
,"pressed-image","toolbar"
,"layout-type","linear"
,"width","fill"
,"background-image-dis","toolbar"
,"valign","center"
,"background-image","toolbar.png"
);
button1 = (UMButton)ThirdControl.createControl(new UMButton(context),ID_BUTTON1
,"halign","center"
,"pressed-image","button_touch"
,"width","70"
,"background-image-dis","button"
,"height","30"
,"color","#e50011"
,"layout-type","linear"
,"font-size","17"
,"onclick","addschedulecheck"
,"font-family","default"
,"valign","center"
,"background-image","button"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,button1,"value","#{res.task_addScheduler}"));
button1.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Task_detailActivity.this);
    actionAddschedulecheck(button1,args);

}
});
toolbar0.addView(button1);
label2 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL2
,"halign","center"
,"height","14"
,"weight","1"
,"color","#e50011"
,"layout-type","linear"
,"font-size","12"
,"width","0"
,"font-family","default"
,"valign","center"
);
toolbar0.addView(label2);
button2 = (UMButton)ThirdControl.createControl(new UMButton(context),ID_BUTTON2
,"halign","center"
,"pressed-image","button_touch"
,"width","42"
,"background-image-dis","button"
,"height","30"
,"color","#e50011"
,"layout-type","linear"
,"font-size","17"
,"onclick","openreportwin"
,"font-family","default"
,"valign","center"
,"background-image","button"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,button2,"value","#{res.task_report}"));
button2.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Task_detailActivity.this);
    actionOpenreportwin(button2,args);

}
});
toolbar0.addView(button2);

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
task_detail = (UMWindow)ThirdControl.createControl(new UMWindow(context),ID_TASK_DETAIL
,"halign","center"
,"height","fill"
,"layout","vbox"
,"width","fill"
,"context","detailtask"
,"controller","task_detailController"
,"namespace","nc.bs.oa.oama.ecm"
);
View viewPage0 = (View) getViewPage0View((UMActivity)context,binderGroup,configure);
task_detail.addView(viewPage0);

return (UMWindow)task_detail;
}

	
	public void actionAddschedule(View control, UMEventArgs args) {
    String actionid = "addschedule";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "addschedule",UMActivity.getViewId(control),args);
}
public void actionUMonUnload(View control, UMEventArgs args) {
    String actionid = "UMonUnload";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "UMonUnload",UMActivity.getViewId(control),args);
}
public void actionBack(View control, UMEventArgs args) {
    String actionid = "back";
    args.put("resultcode","15");
    args.put("iskeep","nc.bs.oa.oama.ecm.Task_mainviewthreeforone");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.close(args);
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
public void actionTaskonload(View control, UMEventArgs args) {
    String actionid = "taskonload";
  this.dataCollect();
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "taskonload",UMActivity.getViewId(control),args);
}
public void actionPoptip(View control, UMEventArgs args) {
    String actionid = "poptip";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "poptip",UMActivity.getViewId(control),args);
}
public void actionReturntip(View control, UMEventArgs args) {
    String actionid = "returntip";
    args.put("message","#{res.task_dosuccess}");
    args.put("title","提示");
    args.put("okbuttontitle","#{res.task_ok}");
    args.put("style","ok");
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
public void actionAddschedulecheck(View control, UMEventArgs args) {
    String actionid = "addschedulecheck";
    args.put("viewid","nc.bs.oa.oama.oatask.ListviewController");
    args.put("callback","checkscheduletip");
    args.put("action","addScheduleCheck");
    args.put("autoDataBinding","true");
    args.put("params","{\"taskid\":\"#{taskid}\"}");
    args.put("contextmapping","result");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMService.callAction(args);
}
public void actionCheckscheduletip(View control, UMEventArgs args) {
    String actionid = "checkscheduletip";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "checkscheduletip",UMActivity.getViewId(control),args);
}
public void actionOpenreportwin(View control, UMEventArgs args) {
    String actionid = "openreportwin";
    args.put("viewid","nc.bs.oa.oama.ecm.Task_reportwin");
    args.put("taskid","#{taskid}");
  this.dataCollect();
    args.put("iskeep","true");
    args.put("taskname","#{taskname}");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.open(args);
}


}
