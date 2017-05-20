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

public abstract class Addr_pgAddPsnActivity extends UMWindowActivity {

	protected UMWindow pgAddPsn = null;
protected XVerticalLayout viewPage0 = null;
protected XHorizontalLayout navigatorbar0 = null;
protected UMLabel label0 = null;
protected UMLabel label1 = null;
protected UMLabel label2 = null;
protected XVerticalLayout panel0 = null;
protected UMSearchControl search0 = null;
protected XVerticalLayout panel1 = null;
protected UMListViewBase listview0 = null;
protected XHorizontalLayout listview0_childWgt0 = null;
protected XHorizontalLayout listview0_childWgt0_panel1 = null;
protected UMCheckbox listview0_childWgt0_checkbox0 = null;
protected XHorizontalLayout listview0_childWgt0_panel2 = null;
protected UMImage listview0_childWgt0_image0 = null;
protected XVerticalLayout listview0_childWgt0_panel3 = null;
protected XHorizontalLayout listview0_childWgt0_panel4 = null;
protected UMLabel listview0_childWgt0_label0 = null;
protected UMLabel listview0_childWgt0_label2 = null;
protected XHorizontalLayout listview0_childWgt0_panel5 = null;
protected UMLabel listview0_childWgt0_label1 = null;
protected UMLabel listview0_childWgt0_label3 = null;
protected XHorizontalLayout listview0_childWgt1 = null;
protected XHorizontalLayout listview0_childWgt1_panel8 = null;
protected UMCheckbox listview0_childWgt1_checkbox1 = null;
protected XHorizontalLayout listview0_childWgt1_panel9 = null;
protected UMImage listview0_childWgt1_image1 = null;
protected XVerticalLayout listview0_childWgt1_panel10 = null;
protected XHorizontalLayout listview0_childWgt1_panel14 = null;
protected UMLabel listview0_childWgt1_label4 = null;
protected UMLabel listview0_childWgt1_label5 = null;
protected XHorizontalLayout listview0_childWgt1_panel15 = null;
protected UMLabel listview0_childWgt1_label6 = null;
protected UMLabel listview0_childWgt1_label7 = null;
protected XHorizontalLayout listview0_childWgt2 = null;
protected XHorizontalLayout listview0_childWgt2_panel11 = null;
protected UMCheckbox listview0_childWgt2_checkbox2 = null;
protected XHorizontalLayout listview0_childWgt2_panel12 = null;
protected UMImage listview0_childWgt2_image2 = null;
protected XVerticalLayout listview0_childWgt2_panel13 = null;
protected XHorizontalLayout listview0_childWgt2_panel16 = null;
protected UMLabel listview0_childWgt2_label8 = null;
protected UMLabel listview0_childWgt2_label9 = null;
protected XHorizontalLayout listview0_childWgt2_panel17 = null;
protected UMLabel listview0_childWgt2_label10 = null;
protected UMLabel listview0_childWgt2_label11 = null;

	
	protected final static int ID_PGADDPSN = 1213634750;
protected final static int ID_VIEWPAGE0 = 716294501;
protected final static int ID_NAVIGATORBAR0 = 2002458675;
protected final static int ID_LABEL0 = 811454115;
protected final static int ID_LABEL1 = 1938024738;
protected final static int ID_LABEL2 = 275419082;
protected final static int ID_PANEL0 = 1177625447;
protected final static int ID_SEARCH0 = 1424823548;
protected final static int ID_PANEL1 = 541723865;
protected final static int ID_LISTVIEW0 = 1514804833;
protected final static int ID_LISTVIEW0_CHILDWGT0 = 507881970;
protected final static int ID_LISTVIEW0_CHILDWGT0_PANEL1 = 1945693097;
protected final static int ID_LISTVIEW0_CHILDWGT0_CHECKBOX0 = 2008475870;
protected final static int ID_LISTVIEW0_CHILDWGT0_PANEL2 = 10382952;
protected final static int ID_LISTVIEW0_CHILDWGT0_IMAGE0 = 1049540887;
protected final static int ID_LISTVIEW0_CHILDWGT0_PANEL3 = 642399661;
protected final static int ID_LISTVIEW0_CHILDWGT0_PANEL4 = 1953100548;
protected final static int ID_LISTVIEW0_CHILDWGT0_LABEL0 = 912106841;
protected final static int ID_LISTVIEW0_CHILDWGT0_LABEL2 = 118266776;
protected final static int ID_LISTVIEW0_CHILDWGT0_PANEL5 = 517436434;
protected final static int ID_LISTVIEW0_CHILDWGT0_LABEL1 = 538707312;
protected final static int ID_LISTVIEW0_CHILDWGT0_LABEL3 = 2110152620;
protected final static int ID_LISTVIEW0_CHILDWGT1 = 1516848008;
protected final static int ID_LISTVIEW0_CHILDWGT1_PANEL8 = 1770262064;
protected final static int ID_LISTVIEW0_CHILDWGT1_CHECKBOX1 = 2110675221;
protected final static int ID_LISTVIEW0_CHILDWGT1_PANEL9 = 1553509834;
protected final static int ID_LISTVIEW0_CHILDWGT1_IMAGE1 = 82291990;
protected final static int ID_LISTVIEW0_CHILDWGT1_PANEL10 = 1119413649;
protected final static int ID_LISTVIEW0_CHILDWGT1_PANEL14 = 1696222825;
protected final static int ID_LISTVIEW0_CHILDWGT1_LABEL4 = 1477646707;
protected final static int ID_LISTVIEW0_CHILDWGT1_LABEL5 = 1124662391;
protected final static int ID_LISTVIEW0_CHILDWGT1_PANEL15 = 1711820745;
protected final static int ID_LISTVIEW0_CHILDWGT1_LABEL6 = 536029023;
protected final static int ID_LISTVIEW0_CHILDWGT1_LABEL7 = 1648136543;
protected final static int ID_LISTVIEW0_CHILDWGT2 = 1151403717;
protected final static int ID_LISTVIEW0_CHILDWGT2_PANEL11 = 1033026237;
protected final static int ID_LISTVIEW0_CHILDWGT2_CHECKBOX2 = 2013869150;
protected final static int ID_LISTVIEW0_CHILDWGT2_PANEL12 = 162614034;
protected final static int ID_LISTVIEW0_CHILDWGT2_IMAGE2 = 1366310427;
protected final static int ID_LISTVIEW0_CHILDWGT2_PANEL13 = 794273515;
protected final static int ID_LISTVIEW0_CHILDWGT2_PANEL16 = 366787467;
protected final static int ID_LISTVIEW0_CHILDWGT2_LABEL8 = 1576282282;
protected final static int ID_LISTVIEW0_CHILDWGT2_LABEL9 = 201050642;
protected final static int ID_LISTVIEW0_CHILDWGT2_PANEL17 = 1063123807;
protected final static int ID_LISTVIEW0_CHILDWGT2_LABEL10 = 680823128;
protected final static int ID_LISTVIEW0_CHILDWGT2_LABEL11 = 1917440491;

	
	
	@Override
	public String getControllerName() {
		return "pgAddPsnController";
	}
	
	@Override
	public String getContextName() {
		return "psnList";
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
		  idmap.put("pgAddPsn",ID_PGADDPSN);
  idmap.put("viewPage0",ID_VIEWPAGE0);
  idmap.put("navigatorbar0",ID_NAVIGATORBAR0);
  idmap.put("label0",ID_LABEL0);
  idmap.put("label1",ID_LABEL1);
  idmap.put("label2",ID_LABEL2);
  idmap.put("panel0",ID_PANEL0);
  idmap.put("search0",ID_SEARCH0);
  idmap.put("panel1",ID_PANEL1);
  idmap.put("listview0",ID_LISTVIEW0);
  idmap.put("listview0_childWgt0",ID_LISTVIEW0_CHILDWGT0);
  idmap.put("listview0_childWgt0_panel1",ID_LISTVIEW0_CHILDWGT0_PANEL1);
  idmap.put("listview0_childWgt0_checkbox0",ID_LISTVIEW0_CHILDWGT0_CHECKBOX0);
  idmap.put("listview0_childWgt0_panel2",ID_LISTVIEW0_CHILDWGT0_PANEL2);
  idmap.put("listview0_childWgt0_image0",ID_LISTVIEW0_CHILDWGT0_IMAGE0);
  idmap.put("listview0_childWgt0_panel3",ID_LISTVIEW0_CHILDWGT0_PANEL3);
  idmap.put("listview0_childWgt0_panel4",ID_LISTVIEW0_CHILDWGT0_PANEL4);
  idmap.put("listview0_childWgt0_label0",ID_LISTVIEW0_CHILDWGT0_LABEL0);
  idmap.put("listview0_childWgt0_label2",ID_LISTVIEW0_CHILDWGT0_LABEL2);
  idmap.put("listview0_childWgt0_panel5",ID_LISTVIEW0_CHILDWGT0_PANEL5);
  idmap.put("listview0_childWgt0_label1",ID_LISTVIEW0_CHILDWGT0_LABEL1);
  idmap.put("listview0_childWgt0_label3",ID_LISTVIEW0_CHILDWGT0_LABEL3);
  idmap.put("listview0_childWgt1",ID_LISTVIEW0_CHILDWGT1);
  idmap.put("listview0_childWgt1_panel8",ID_LISTVIEW0_CHILDWGT1_PANEL8);
  idmap.put("listview0_childWgt1_checkbox1",ID_LISTVIEW0_CHILDWGT1_CHECKBOX1);
  idmap.put("listview0_childWgt1_panel9",ID_LISTVIEW0_CHILDWGT1_PANEL9);
  idmap.put("listview0_childWgt1_image1",ID_LISTVIEW0_CHILDWGT1_IMAGE1);
  idmap.put("listview0_childWgt1_panel10",ID_LISTVIEW0_CHILDWGT1_PANEL10);
  idmap.put("listview0_childWgt1_panel14",ID_LISTVIEW0_CHILDWGT1_PANEL14);
  idmap.put("listview0_childWgt1_label4",ID_LISTVIEW0_CHILDWGT1_LABEL4);
  idmap.put("listview0_childWgt1_label5",ID_LISTVIEW0_CHILDWGT1_LABEL5);
  idmap.put("listview0_childWgt1_panel15",ID_LISTVIEW0_CHILDWGT1_PANEL15);
  idmap.put("listview0_childWgt1_label6",ID_LISTVIEW0_CHILDWGT1_LABEL6);
  idmap.put("listview0_childWgt1_label7",ID_LISTVIEW0_CHILDWGT1_LABEL7);
  idmap.put("listview0_childWgt2",ID_LISTVIEW0_CHILDWGT2);
  idmap.put("listview0_childWgt2_panel11",ID_LISTVIEW0_CHILDWGT2_PANEL11);
  idmap.put("listview0_childWgt2_checkbox2",ID_LISTVIEW0_CHILDWGT2_CHECKBOX2);
  idmap.put("listview0_childWgt2_panel12",ID_LISTVIEW0_CHILDWGT2_PANEL12);
  idmap.put("listview0_childWgt2_image2",ID_LISTVIEW0_CHILDWGT2_IMAGE2);
  idmap.put("listview0_childWgt2_panel13",ID_LISTVIEW0_CHILDWGT2_PANEL13);
  idmap.put("listview0_childWgt2_panel16",ID_LISTVIEW0_CHILDWGT2_PANEL16);
  idmap.put("listview0_childWgt2_label8",ID_LISTVIEW0_CHILDWGT2_LABEL8);
  idmap.put("listview0_childWgt2_label9",ID_LISTVIEW0_CHILDWGT2_LABEL9);
  idmap.put("listview0_childWgt2_panel17",ID_LISTVIEW0_CHILDWGT2_PANEL17);
  idmap.put("listview0_childWgt2_label10",ID_LISTVIEW0_CHILDWGT2_LABEL10);
  idmap.put("listview0_childWgt2_label11",ID_LISTVIEW0_CHILDWGT2_LABEL11);

	}
	
	public void onLoad() {
		ULog.logLC("onLoad", this);
		if(currentPage!=null) {
			currentPage.onLoad();
		}
	
		{ //panel0 - tipsOnload
    UMEventArgs args = new UMEventArgs(Addr_pgAddPsnActivity.this);
    actionTipsOnload(panel0,args);

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
,"height","44.0"
,"color","#000000"
,"layout-type","linear"
,"font-size","17"
,"font-family","default"
,"valign","center"
,"background-image","nav.png"
);
label0 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL0
,"halign","left"
,"height","fill"
,"color","#e50011"
,"layout-type","linear"
,"font-size","17"
,"width","70"
,"onclick","save"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label0,"content","#{res.addr_oaadl_0007}"));
label0.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Addr_pgAddPsnActivity.this);
    actionSave(label0,args);

}
});
navigatorbar0.addView(label0);
label1 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL1
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
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label1,"content","#{res.addr_oaadl_0009}"));
navigatorbar0.addView(label1);
label2 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL2
,"halign","right"
,"height","fill"
,"color","#e50011"
,"layout-type","linear"
,"font-size","17"
,"width","70"
,"onclick","cancelTest"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label2,"content","#{res.addr_oaadl_0008}"));
label2.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Addr_pgAddPsnActivity.this);
    actionCancelTest(label2,args);

}
});
navigatorbar0.addView(label2);

return navigatorbar0;
}
public View getPanel0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel0 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL0
,"halign","center"
,"height","45"
,"onload","tipsOnload"
,"layout-type","linear"
,"width","fill"
);
search0 = (UMSearchControl)ThirdControl.createControl(new UMSearchControl(context),ID_SEARCH0
,"height","44"
,"search-btn-icon","search_left.png"
,"color","#000000"
,"font","default"
,"localstorage","true"
,"layout-type","linear"
,"font-size","15"
,"width","fill"
,"search-del-icon","search_right.png"
,"onsearch","doSearch"
,"background-image","search_bg"
);
search0.setEvent("onsearch", new OnCursorEventListener(configure) {
  @Override
  public void onEvent(View v, UMEventArgs parent) {
    UMEventArgs args = new UMEventArgs(Addr_pgAddPsnActivity.this);
    args.put(parent);
    actionDoSearch(search0,args);

}
});
panel0.addView(search0);

return panel0;
}
public View getListview0_childWgt0_panel1View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt0_panel1 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT0_PANEL1
,"height","fill"
,"layout-type","linear"
,"width","20"
,"valign","center"
);
listview0_childWgt0_checkbox0 = (UMCheckbox)ThirdControl.createControl(new UMCheckbox(context),ID_LISTVIEW0_CHILDWGT0_CHECKBOX0
,"bindfield","isChecked"
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
listview0_childWgt0_panel1.addView(listview0_childWgt0_checkbox0);

return listview0_childWgt0_panel1;
}
public View getListview0_childWgt0_panel2View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt0_panel2 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT0_PANEL2
,"margin-right","8"
,"height","fill"
,"layout-type","linear"
,"width","25"
,"margin-left","8"
,"valign","center"
);
listview0_childWgt0_image0 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_LISTVIEW0_CHILDWGT0_IMAGE0
,"height","25"
,"layout-type","linear"
,"width","25"
,"scaletype","fitcenter"
,"src","oaadl_detail_nosex.png"
);
listview0_childWgt0_panel2.addView(listview0_childWgt0_image0);

return listview0_childWgt0_panel2;
}
public View getListview0_childWgt0_panel4View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt0_panel4 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT0_PANEL4
,"height","20"
,"layout-type","linear"
,"width","fill"
,"margin-bottom","7"
,"margin-top","13"
,"valign","center"
);
listview0_childWgt0_label0 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT0_LABEL0
,"bindfield","name"
,"halign","left"
,"height","fill"
,"color","#000000"
,"layout-type","linear"
,"font-size","16"
,"width","110"
,"font-family","default"
,"valign","center"
);
UMTextBinder listview0_childWgt0_label0_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt0_label0_binder.setBindInfo(new BindInfo("name"));
listview0_childWgt0_label0_binder.setControl(listview0_childWgt0_label0);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT0_LABEL0, listview0_childWgt0_label0_binder);
listview0_childWgt0_panel4.addView(listview0_childWgt0_label0);
listview0_childWgt0_label2 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT0_LABEL2
,"bindfield","position"
,"halign","right"
,"height","fill"
,"weight","1"
,"color","#000000"
,"layout-type","linear"
,"font-size","16"
,"width","0"
,"font-family","default"
,"valign","center"
);
UMTextBinder listview0_childWgt0_label2_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt0_label2_binder.setBindInfo(new BindInfo("position"));
listview0_childWgt0_label2_binder.setControl(listview0_childWgt0_label2);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT0_LABEL2, listview0_childWgt0_label2_binder);
listview0_childWgt0_panel4.addView(listview0_childWgt0_label2);

return listview0_childWgt0_panel4;
}
public View getListview0_childWgt0_panel5View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt0_panel5 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT0_PANEL5
,"height","17"
,"layout-type","linear"
,"width","fill"
,"margin-bottom","13"
,"valign","center"
);
listview0_childWgt0_label1 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT0_LABEL1
,"bindfield","mobileno"
,"halign","left"
,"height","fill"
,"color","#6f6f6f"
,"layout-type","linear"
,"font-size","13"
,"width","110"
,"font-family","default"
,"valign","center"
);
UMTextBinder listview0_childWgt0_label1_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt0_label1_binder.setBindInfo(new BindInfo("mobileno"));
listview0_childWgt0_label1_binder.setControl(listview0_childWgt0_label1);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT0_LABEL1, listview0_childWgt0_label1_binder);
listview0_childWgt0_panel5.addView(listview0_childWgt0_label1);
listview0_childWgt0_label3 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT0_LABEL3
,"bindfield","dept"
,"halign","right"
,"height","fill"
,"weight","1"
,"color","#6f6f6f"
,"layout-type","linear"
,"font-size","13"
,"width","0"
,"font-family","default"
,"valign","center"
);
UMTextBinder listview0_childWgt0_label3_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt0_label3_binder.setBindInfo(new BindInfo("dept"));
listview0_childWgt0_label3_binder.setControl(listview0_childWgt0_label3);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT0_LABEL3, listview0_childWgt0_label3_binder);
listview0_childWgt0_panel5.addView(listview0_childWgt0_label3);

return listview0_childWgt0_panel5;
}
public View getListview0_childWgt0_panel3View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt0_panel3 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_LISTVIEW0_CHILDWGT0_PANEL3
,"halign","center"
,"height","fill"
,"weight","1"
,"layout-type","linear"
,"width","0"
);
View listview0_childWgt0_panel4 = (View) getListview0_childWgt0_panel4View((UMActivity)context,binderGroup,configure);
listview0_childWgt0_panel3.addView(listview0_childWgt0_panel4);
View listview0_childWgt0_panel5 = (View) getListview0_childWgt0_panel5View((UMActivity)context,binderGroup,configure);
listview0_childWgt0_panel3.addView(listview0_childWgt0_panel5);

return listview0_childWgt0_panel3;
}
public View getListview0_childWgt0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt0 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT0
,"padding-right","15"
,"padding-left","8"
,"height","70"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"onclick","setChecked"
,"valign","center"
);
listview0_childWgt0.setOnClickListener(new OnCursorClickListener(configure) {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Addr_pgAddPsnActivity.this);
    int position = this.getPosition(v);
    if(position>=0) {
      context.getCursor("cursorpersonsalias").setCurrentIndex(position);
    }
    actionSetChecked(listview0_childWgt0,args);

}
});
View listview0_childWgt0_panel1 = (View) getListview0_childWgt0_panel1View((UMActivity)context,binderGroup,configure);
listview0_childWgt0.addView(listview0_childWgt0_panel1);
View listview0_childWgt0_panel2 = (View) getListview0_childWgt0_panel2View((UMActivity)context,binderGroup,configure);
listview0_childWgt0.addView(listview0_childWgt0_panel2);
View listview0_childWgt0_panel3 = (View) getListview0_childWgt0_panel3View((UMActivity)context,binderGroup,configure);
listview0_childWgt0.addView(listview0_childWgt0_panel3);

return listview0_childWgt0;
}
public View getListview0_childWgt1_panel8View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt1_panel8 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT1_PANEL8
,"height","fill"
,"layout-type","linear"
,"width","20"
,"valign","center"
);
listview0_childWgt1_checkbox1 = (UMCheckbox)ThirdControl.createControl(new UMCheckbox(context),ID_LISTVIEW0_CHILDWGT1_CHECKBOX1
,"bindfield","isChecked"
,"height","20"
,"layout-type","linear"
,"width","20"
,"check-on-image","checkbox_select"
,"check-off-image","checkbox_noselect"
,"disabled","disabled"
);
UMCheckBoxBinder listview0_childWgt1_checkbox1_binder = new UMCheckBoxBinder((IUMContextAccessor)context);
listview0_childWgt1_checkbox1_binder.setBindInfo(new BindInfo("isChecked"));
listview0_childWgt1_checkbox1_binder.setControl(listview0_childWgt1_checkbox1);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT1_CHECKBOX1, listview0_childWgt1_checkbox1_binder);
listview0_childWgt1_panel8.addView(listview0_childWgt1_checkbox1);

return listview0_childWgt1_panel8;
}
public View getListview0_childWgt1_panel9View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt1_panel9 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT1_PANEL9
,"margin-right","8"
,"height","fill"
,"layout-type","linear"
,"width","25"
,"margin-left","8"
,"valign","center"
);
listview0_childWgt1_image1 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_LISTVIEW0_CHILDWGT1_IMAGE1
,"height","25"
,"layout-type","linear"
,"width","25"
,"scaletype","fitcenter"
,"src","oaadl_detail_fm.png"
);
listview0_childWgt1_panel9.addView(listview0_childWgt1_image1);

return listview0_childWgt1_panel9;
}
public View getListview0_childWgt1_panel14View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt1_panel14 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT1_PANEL14
,"height","20"
,"layout-type","linear"
,"width","fill"
,"margin-bottom","7"
,"margin-top","13"
,"valign","center"
);
listview0_childWgt1_label4 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT1_LABEL4
,"bindfield","name"
,"halign","left"
,"height","fill"
,"color","#000000"
,"layout-type","linear"
,"font-size","16"
,"width","110"
,"font-family","default"
,"valign","center"
);
UMTextBinder listview0_childWgt1_label4_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt1_label4_binder.setBindInfo(new BindInfo("name"));
listview0_childWgt1_label4_binder.setControl(listview0_childWgt1_label4);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT1_LABEL4, listview0_childWgt1_label4_binder);
listview0_childWgt1_panel14.addView(listview0_childWgt1_label4);
listview0_childWgt1_label5 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT1_LABEL5
,"bindfield","position"
,"halign","right"
,"height","fill"
,"weight","1"
,"color","#000000"
,"layout-type","linear"
,"font-size","16"
,"width","0"
,"font-family","default"
,"valign","center"
);
UMTextBinder listview0_childWgt1_label5_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt1_label5_binder.setBindInfo(new BindInfo("position"));
listview0_childWgt1_label5_binder.setControl(listview0_childWgt1_label5);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT1_LABEL5, listview0_childWgt1_label5_binder);
listview0_childWgt1_panel14.addView(listview0_childWgt1_label5);

return listview0_childWgt1_panel14;
}
public View getListview0_childWgt1_panel15View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt1_panel15 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT1_PANEL15
,"height","17"
,"layout-type","linear"
,"width","fill"
,"margin-bottom","13"
,"valign","center"
);
listview0_childWgt1_label6 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT1_LABEL6
,"bindfield","mobileno"
,"halign","left"
,"height","fill"
,"color","#6f6f6f"
,"layout-type","linear"
,"font-size","13"
,"width","110"
,"font-family","default"
,"valign","center"
);
UMTextBinder listview0_childWgt1_label6_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt1_label6_binder.setBindInfo(new BindInfo("mobileno"));
listview0_childWgt1_label6_binder.setControl(listview0_childWgt1_label6);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT1_LABEL6, listview0_childWgt1_label6_binder);
listview0_childWgt1_panel15.addView(listview0_childWgt1_label6);
listview0_childWgt1_label7 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT1_LABEL7
,"bindfield","dept"
,"halign","right"
,"height","fill"
,"weight","1"
,"color","#6f6f6f"
,"layout-type","linear"
,"font-size","13"
,"width","0"
,"font-family","default"
,"valign","center"
);
UMTextBinder listview0_childWgt1_label7_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt1_label7_binder.setBindInfo(new BindInfo("dept"));
listview0_childWgt1_label7_binder.setControl(listview0_childWgt1_label7);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT1_LABEL7, listview0_childWgt1_label7_binder);
listview0_childWgt1_panel15.addView(listview0_childWgt1_label7);

return listview0_childWgt1_panel15;
}
public View getListview0_childWgt1_panel10View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt1_panel10 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_LISTVIEW0_CHILDWGT1_PANEL10
,"halign","center"
,"height","fill"
,"weight","1"
,"layout-type","linear"
,"width","0"
);
View listview0_childWgt1_panel14 = (View) getListview0_childWgt1_panel14View((UMActivity)context,binderGroup,configure);
listview0_childWgt1_panel10.addView(listview0_childWgt1_panel14);
View listview0_childWgt1_panel15 = (View) getListview0_childWgt1_panel15View((UMActivity)context,binderGroup,configure);
listview0_childWgt1_panel10.addView(listview0_childWgt1_panel15);

return listview0_childWgt1_panel10;
}
public View getListview0_childWgt1View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt1 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT1
,"padding-right","15"
,"padding-left","8"
,"height","70"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"onclick","setChecked"
,"valign","center"
);
listview0_childWgt1.setOnClickListener(new OnCursorClickListener(configure) {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Addr_pgAddPsnActivity.this);
    int position = this.getPosition(v);
    if(position>=0) {
      context.getCursor("cursorpersonsalias").setCurrentIndex(position);
    }
    actionSetChecked(listview0_childWgt1,args);

}
});
View listview0_childWgt1_panel8 = (View) getListview0_childWgt1_panel8View((UMActivity)context,binderGroup,configure);
listview0_childWgt1.addView(listview0_childWgt1_panel8);
View listview0_childWgt1_panel9 = (View) getListview0_childWgt1_panel9View((UMActivity)context,binderGroup,configure);
listview0_childWgt1.addView(listview0_childWgt1_panel9);
View listview0_childWgt1_panel10 = (View) getListview0_childWgt1_panel10View((UMActivity)context,binderGroup,configure);
listview0_childWgt1.addView(listview0_childWgt1_panel10);

return listview0_childWgt1;
}
public View getListview0_childWgt2_panel11View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt2_panel11 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT2_PANEL11
,"height","fill"
,"layout-type","linear"
,"width","20"
,"valign","center"
);
listview0_childWgt2_checkbox2 = (UMCheckbox)ThirdControl.createControl(new UMCheckbox(context),ID_LISTVIEW0_CHILDWGT2_CHECKBOX2
,"bindfield","isChecked"
,"height","20"
,"layout-type","linear"
,"width","20"
,"check-on-image","checkbox_select"
,"check-off-image","checkbox_noselect"
,"disabled","disabled"
);
UMCheckBoxBinder listview0_childWgt2_checkbox2_binder = new UMCheckBoxBinder((IUMContextAccessor)context);
listview0_childWgt2_checkbox2_binder.setBindInfo(new BindInfo("isChecked"));
listview0_childWgt2_checkbox2_binder.setControl(listview0_childWgt2_checkbox2);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT2_CHECKBOX2, listview0_childWgt2_checkbox2_binder);
listview0_childWgt2_panel11.addView(listview0_childWgt2_checkbox2);

return listview0_childWgt2_panel11;
}
public View getListview0_childWgt2_panel12View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt2_panel12 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT2_PANEL12
,"margin-right","8"
,"height","fill"
,"layout-type","linear"
,"width","25"
,"margin-left","8"
,"valign","center"
);
listview0_childWgt2_image2 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_LISTVIEW0_CHILDWGT2_IMAGE2
,"height","25"
,"layout-type","linear"
,"width","25"
,"scaletype","fitcenter"
,"src","oaadl_detail_fa.png"
);
listview0_childWgt2_panel12.addView(listview0_childWgt2_image2);

return listview0_childWgt2_panel12;
}
public View getListview0_childWgt2_panel16View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt2_panel16 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT2_PANEL16
,"height","20"
,"layout-type","linear"
,"width","fill"
,"margin-bottom","7"
,"margin-top","13"
,"valign","center"
);
listview0_childWgt2_label8 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT2_LABEL8
,"bindfield","name"
,"halign","left"
,"height","fill"
,"color","#000000"
,"layout-type","linear"
,"font-size","16"
,"width","110"
,"font-family","default"
,"valign","center"
);
UMTextBinder listview0_childWgt2_label8_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt2_label8_binder.setBindInfo(new BindInfo("name"));
listview0_childWgt2_label8_binder.setControl(listview0_childWgt2_label8);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT2_LABEL8, listview0_childWgt2_label8_binder);
listview0_childWgt2_panel16.addView(listview0_childWgt2_label8);
listview0_childWgt2_label9 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT2_LABEL9
,"bindfield","position"
,"halign","right"
,"height","fill"
,"weight","1"
,"color","#000000"
,"layout-type","linear"
,"font-size","16"
,"width","0"
,"font-family","default"
,"valign","center"
);
UMTextBinder listview0_childWgt2_label9_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt2_label9_binder.setBindInfo(new BindInfo("position"));
listview0_childWgt2_label9_binder.setControl(listview0_childWgt2_label9);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT2_LABEL9, listview0_childWgt2_label9_binder);
listview0_childWgt2_panel16.addView(listview0_childWgt2_label9);

return listview0_childWgt2_panel16;
}
public View getListview0_childWgt2_panel17View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt2_panel17 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT2_PANEL17
,"height","17"
,"layout-type","linear"
,"width","fill"
,"margin-bottom","13"
,"valign","center"
);
listview0_childWgt2_label10 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT2_LABEL10
,"bindfield","mobileno"
,"halign","left"
,"height","fill"
,"color","#6f6f6f"
,"layout-type","linear"
,"font-size","13"
,"width","110"
,"font-family","default"
,"valign","center"
);
UMTextBinder listview0_childWgt2_label10_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt2_label10_binder.setBindInfo(new BindInfo("mobileno"));
listview0_childWgt2_label10_binder.setControl(listview0_childWgt2_label10);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT2_LABEL10, listview0_childWgt2_label10_binder);
listview0_childWgt2_panel17.addView(listview0_childWgt2_label10);
listview0_childWgt2_label11 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT2_LABEL11
,"bindfield","dept"
,"halign","right"
,"height","fill"
,"weight","1"
,"color","#6f6f6f"
,"layout-type","linear"
,"font-size","13"
,"width","0"
,"font-family","default"
,"valign","center"
);
UMTextBinder listview0_childWgt2_label11_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt2_label11_binder.setBindInfo(new BindInfo("dept"));
listview0_childWgt2_label11_binder.setControl(listview0_childWgt2_label11);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT2_LABEL11, listview0_childWgt2_label11_binder);
listview0_childWgt2_panel17.addView(listview0_childWgt2_label11);

return listview0_childWgt2_panel17;
}
public View getListview0_childWgt2_panel13View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt2_panel13 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_LISTVIEW0_CHILDWGT2_PANEL13
,"halign","center"
,"height","fill"
,"weight","1"
,"layout-type","linear"
,"width","0"
);
View listview0_childWgt2_panel16 = (View) getListview0_childWgt2_panel16View((UMActivity)context,binderGroup,configure);
listview0_childWgt2_panel13.addView(listview0_childWgt2_panel16);
View listview0_childWgt2_panel17 = (View) getListview0_childWgt2_panel17View((UMActivity)context,binderGroup,configure);
listview0_childWgt2_panel13.addView(listview0_childWgt2_panel17);

return listview0_childWgt2_panel13;
}
public View getListview0_childWgt2View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt2 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT2
,"padding-right","15"
,"padding-left","8"
,"height","70"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"onclick","setChecked"
,"valign","center"
);
listview0_childWgt2.setOnClickListener(new OnCursorClickListener(configure) {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Addr_pgAddPsnActivity.this);
    int position = this.getPosition(v);
    if(position>=0) {
      context.getCursor("cursorpersonsalias").setCurrentIndex(position);
    }
    actionSetChecked(listview0_childWgt2,args);

}
});
View listview0_childWgt2_panel11 = (View) getListview0_childWgt2_panel11View((UMActivity)context,binderGroup,configure);
listview0_childWgt2.addView(listview0_childWgt2_panel11);
View listview0_childWgt2_panel12 = (View) getListview0_childWgt2_panel12View((UMActivity)context,binderGroup,configure);
listview0_childWgt2.addView(listview0_childWgt2_panel12);
View listview0_childWgt2_panel13 = (View) getListview0_childWgt2_panel13View((UMActivity)context,binderGroup,configure);
listview0_childWgt2.addView(listview0_childWgt2_panel13);

return listview0_childWgt2;
}
public View getListview0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0 = (UMListViewBase)ThirdControl.createControl(new UMListViewBase(context),ID_LISTVIEW0
,"bindfield","persons"
,"listview-divider-height","1"
,"childindicator","choosePsnRowWidget"
,"cursoraction","cursorpersonsalias"
,"synccontext","persons"
,"width","fill"
,"allowdatacollect","true"
,"height","fill"
,"ondownrefersh","getNextSearch"
,"background","#efeff4"
,"layout-type","linear"
,"listview-divider-color","#c8c7cc"
);
context.createCursor("cursorpersonsalias", "persons");
UMListBinder listview0_binder = new UMListBinder((IUMContextAccessor)context);
listview0_binder.setBindInfo(new BindInfo("persons"));
listview0_binder.setControl(listview0);
binderGroup.addBinderToGroup(ID_LISTVIEW0, listview0_binder);
listview0.setEvent("ondownrefersh", new OnCursorEventListener(configure) {
  @Override
  public void onEvent(View v, UMEventArgs parent) {
    UMEventArgs args = new UMEventArgs(Addr_pgAddPsnActivity.this);
    args.put(parent);
    actionGetNextSearch(listview0,args);

}
});
listview0.addListItemView(new UMListViewBase.ListItemView() {
	public View getItemView(Context context, View parent, IBinderGroup binderGroup,int position) {
  UMDslConfigure configure = new UMDslConfigure();
  configure.put("position",position);
View listview0_childWgt0 = (View) getListview0_childWgt0View((UMActivity)context,binderGroup,configure);
return listview0_childWgt0;
}});
listview0.addListItemView(new UMListViewBase.ListItemView() {
	public View getItemView(Context context, View parent, IBinderGroup binderGroup,int position) {
  UMDslConfigure configure = new UMDslConfigure();
  configure.put("position",position);
View listview0_childWgt1 = (View) getListview0_childWgt1View((UMActivity)context,binderGroup,configure);
return listview0_childWgt1;
}});
listview0.addListItemView(new UMListViewBase.ListItemView() {
	public View getItemView(Context context, View parent, IBinderGroup binderGroup,int position) {
  UMDslConfigure configure = new UMDslConfigure();
  configure.put("position",position);
View listview0_childWgt2 = (View) getListview0_childWgt2View((UMActivity)context,binderGroup,configure);
return listview0_childWgt2;
}});

return listview0;
}
public View getPanel1View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel1 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL1
,"halign","center"
,"weight","1"
,"height","0"
,"layout-type","linear"
,"width","fill"
);
View listview0 = (View) getListview0View((UMActivity)context,binderGroup,configure);
panel1.addView(listview0);

return panel1;
}
public View getViewPage0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
viewPage0 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_VIEWPAGE0
,"halign","center"
,"height","fill"
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
pgAddPsn = (UMWindow)ThirdControl.createControl(new UMWindow(context),ID_PGADDPSN
,"halign","center"
,"height","fill"
,"layout","vbox"
,"width","fill"
,"context","psnList"
,"controller","pgAddPsnController"
,"namespace","nc.bs.oa.oama.ecm"
);
View viewPage0 = (View) getViewPage0View((UMActivity)context,binderGroup,configure);
pgAddPsn.addView(viewPage0);

return (UMWindow)pgAddPsn;
}

	
	public void actionTipsOnload(View control, UMEventArgs args) {
    String actionid = "tipsOnload";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "tipsOnload",UMActivity.getViewId(control),args);
}
public void actionDoSearch(View control, UMEventArgs args) {
    String actionid = "doSearch";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "doSearch",UMActivity.getViewId(control),args);
}
public void actionSave(View control, UMEventArgs args) {
    String actionid = "save";
    args.put("psngroupid","#{plug.psngroupid}");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "save",UMActivity.getViewId(control),args);
}
public void actionUMonUnload(View control, UMEventArgs args) {
    String actionid = "UMonUnload";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "UMonUnload",UMActivity.getViewId(control),args);
}
public void actionCancel(View control, UMEventArgs args) {
    String actionid = "cancel";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "cancel",UMActivity.getViewId(control),args);
}
public void actionUMonComplete(View control, UMEventArgs args) {
    String actionid = "UMonComplete";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "UMonComplete",UMActivity.getViewId(control),args);
}
public void actionSetChecked(View control, UMEventArgs args) {
    String actionid = "setChecked";
    args.put("cindex_arrayPath","persons");
    args.put("cindex","#{cursor.cursorpersonsalias.index}");
    args.put("containerName","");
    args.put("row","#{persons[#{cursor.cursorpersonsalias.index}]}");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "setChecked",UMActivity.getViewId(control),args);
}
public void actionCancelTest(View control, UMEventArgs args) {
    String actionid = "cancelTest";
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
public void actionGetNextSearch(View control, UMEventArgs args) {
    String actionid = "getNextSearch";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "getNextSearch",UMActivity.getViewId(control),args);
}
public void actionSearchCallback(View control, UMEventArgs args) {
    String actionid = "searchCallback";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "searchCallback",UMActivity.getViewId(control),args);
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
public void actionSetTips(View control, UMEventArgs args) {
    String actionid = "setTips";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "setTips",UMActivity.getViewId(control),args);
}


}
