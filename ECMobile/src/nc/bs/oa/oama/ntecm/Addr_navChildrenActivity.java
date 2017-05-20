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

public abstract class Addr_navChildrenActivity extends UMWindowActivity {

	protected UMWindow navChildren = null;
protected XVerticalLayout viewPage0 = null;
protected XHorizontalLayout navigatorbar0 = null;
protected UMButton button0 = null;
protected UMLabel label0 = null;
protected UMLabel label1 = null;
protected XVerticalLayout panel0 = null;
protected UMListViewBase listview0 = null;
protected XHorizontalLayout listview0_childWgt0 = null;
protected XHorizontalLayout listview0_childWgt0_panel2 = null;
protected UMImage listview0_childWgt0_image1 = null;
protected XVerticalLayout listview0_childWgt0_panel3 = null;
protected XHorizontalLayout listview0_childWgt0_panel4 = null;
protected UMLabel listview0_childWgt0_label1 = null;
protected UMLabel listview0_childWgt0_label5 = null;
protected XHorizontalLayout listview0_childWgt0_panel5 = null;
protected UMLabel listview0_childWgt0_label2 = null;
protected UMLabel listview0_childWgt0_label6 = null;
protected XHorizontalLayout listview0_childWgt0_panel18 = null;
protected UMImage listview0_childWgt0_image5 = null;
protected XHorizontalLayout listview0_childWgt1 = null;
protected UMImage listview0_childWgt1_image8 = null;
protected UMLabel listview0_childWgt1_label0 = null;
protected UMImage listview0_childWgt1_image0 = null;
protected XHorizontalLayout listview0_childWgt2 = null;
protected UMImage listview0_childWgt2_image9 = null;
protected UMLabel listview0_childWgt2_label3 = null;
protected XHorizontalLayout listview0_childWgt3 = null;
protected UMImage listview0_childWgt3_image10 = null;
protected UMLabel listview0_childWgt3_label4 = null;
protected UMImage listview0_childWgt3_image2 = null;
protected XHorizontalLayout listview0_childWgt4 = null;
protected XHorizontalLayout listview0_childWgt4_panel14 = null;
protected UMImage listview0_childWgt4_image4 = null;
protected XVerticalLayout listview0_childWgt4_panel15 = null;
protected XHorizontalLayout listview0_childWgt4_panel16 = null;
protected UMLabel listview0_childWgt4_label11 = null;
protected UMLabel listview0_childWgt4_label12 = null;
protected XHorizontalLayout listview0_childWgt4_panel17 = null;
protected UMLabel listview0_childWgt4_label13 = null;
protected UMLabel listview0_childWgt4_label14 = null;
protected XHorizontalLayout listview0_childWgt4_panel20 = null;
protected UMImage listview0_childWgt4_image7 = null;
protected XHorizontalLayout listview0_childWgt5 = null;
protected XHorizontalLayout listview0_childWgt5_panel10 = null;
protected UMImage listview0_childWgt5_image3 = null;
protected XVerticalLayout listview0_childWgt5_panel11 = null;
protected XHorizontalLayout listview0_childWgt5_panel12 = null;
protected UMLabel listview0_childWgt5_label7 = null;
protected UMLabel listview0_childWgt5_label8 = null;
protected XHorizontalLayout listview0_childWgt5_panel13 = null;
protected UMLabel listview0_childWgt5_label9 = null;
protected UMLabel listview0_childWgt5_label10 = null;
protected XHorizontalLayout listview0_childWgt5_panel19 = null;
protected UMImage listview0_childWgt5_image6 = null;

	
	protected final static int ID_NAVCHILDREN = 804541880;
protected final static int ID_VIEWPAGE0 = 1059999480;
protected final static int ID_NAVIGATORBAR0 = 36427043;
protected final static int ID_BUTTON0 = 610520042;
protected final static int ID_LABEL0 = 1631286280;
protected final static int ID_LABEL1 = 1938699307;
protected final static int ID_PANEL0 = 582555559;
protected final static int ID_LISTVIEW0 = 870460795;
protected final static int ID_LISTVIEW0_CHILDWGT0 = 1114460884;
protected final static int ID_LISTVIEW0_CHILDWGT0_PANEL2 = 1281840892;
protected final static int ID_LISTVIEW0_CHILDWGT0_IMAGE1 = 509722815;
protected final static int ID_LISTVIEW0_CHILDWGT0_PANEL3 = 1809562560;
protected final static int ID_LISTVIEW0_CHILDWGT0_PANEL4 = 2067449119;
protected final static int ID_LISTVIEW0_CHILDWGT0_LABEL1 = 1417516941;
protected final static int ID_LISTVIEW0_CHILDWGT0_LABEL5 = 1154600592;
protected final static int ID_LISTVIEW0_CHILDWGT0_PANEL5 = 615668582;
protected final static int ID_LISTVIEW0_CHILDWGT0_LABEL2 = 136103642;
protected final static int ID_LISTVIEW0_CHILDWGT0_LABEL6 = 1733676863;
protected final static int ID_LISTVIEW0_CHILDWGT0_PANEL18 = 2132640320;
protected final static int ID_LISTVIEW0_CHILDWGT0_IMAGE5 = 588812385;
protected final static int ID_LISTVIEW0_CHILDWGT1 = 1199751899;
protected final static int ID_LISTVIEW0_CHILDWGT1_IMAGE8 = 394774196;
protected final static int ID_LISTVIEW0_CHILDWGT1_LABEL0 = 1356245841;
protected final static int ID_LISTVIEW0_CHILDWGT1_IMAGE0 = 891088080;
protected final static int ID_LISTVIEW0_CHILDWGT2 = 1472738220;
protected final static int ID_LISTVIEW0_CHILDWGT2_IMAGE9 = 549301990;
protected final static int ID_LISTVIEW0_CHILDWGT2_LABEL3 = 607396358;
protected final static int ID_LISTVIEW0_CHILDWGT3 = 1287745418;
protected final static int ID_LISTVIEW0_CHILDWGT3_IMAGE10 = 641354973;
protected final static int ID_LISTVIEW0_CHILDWGT3_LABEL4 = 2123402175;
protected final static int ID_LISTVIEW0_CHILDWGT3_IMAGE2 = 1545251928;
protected final static int ID_LISTVIEW0_CHILDWGT4 = 1740313795;
protected final static int ID_LISTVIEW0_CHILDWGT4_PANEL14 = 887529599;
protected final static int ID_LISTVIEW0_CHILDWGT4_IMAGE4 = 1720616837;
protected final static int ID_LISTVIEW0_CHILDWGT4_PANEL15 = 1122463520;
protected final static int ID_LISTVIEW0_CHILDWGT4_PANEL16 = 1851472634;
protected final static int ID_LISTVIEW0_CHILDWGT4_LABEL11 = 2110726434;
protected final static int ID_LISTVIEW0_CHILDWGT4_LABEL12 = 1001180179;
protected final static int ID_LISTVIEW0_CHILDWGT4_PANEL17 = 819714575;
protected final static int ID_LISTVIEW0_CHILDWGT4_LABEL13 = 1899257666;
protected final static int ID_LISTVIEW0_CHILDWGT4_LABEL14 = 866027696;
protected final static int ID_LISTVIEW0_CHILDWGT4_PANEL20 = 1545889669;
protected final static int ID_LISTVIEW0_CHILDWGT4_IMAGE7 = 888941984;
protected final static int ID_LISTVIEW0_CHILDWGT5 = 1471882916;
protected final static int ID_LISTVIEW0_CHILDWGT5_PANEL10 = 818381464;
protected final static int ID_LISTVIEW0_CHILDWGT5_IMAGE3 = 1995928732;
protected final static int ID_LISTVIEW0_CHILDWGT5_PANEL11 = 1014618385;
protected final static int ID_LISTVIEW0_CHILDWGT5_PANEL12 = 1250778049;
protected final static int ID_LISTVIEW0_CHILDWGT5_LABEL7 = 281077160;
protected final static int ID_LISTVIEW0_CHILDWGT5_LABEL8 = 1141892881;
protected final static int ID_LISTVIEW0_CHILDWGT5_PANEL13 = 12132361;
protected final static int ID_LISTVIEW0_CHILDWGT5_LABEL9 = 210488054;
protected final static int ID_LISTVIEW0_CHILDWGT5_LABEL10 = 47842622;
protected final static int ID_LISTVIEW0_CHILDWGT5_PANEL19 = 282470051;
protected final static int ID_LISTVIEW0_CHILDWGT5_IMAGE6 = 629730613;

	
	
	@Override
	public String getControllerName() {
		return "navChildrenController";
	}
	
	@Override
	public String getContextName() {
		return "navList";
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
		  idmap.put("navChildren",ID_NAVCHILDREN);
  idmap.put("viewPage0",ID_VIEWPAGE0);
  idmap.put("navigatorbar0",ID_NAVIGATORBAR0);
  idmap.put("button0",ID_BUTTON0);
  idmap.put("label0",ID_LABEL0);
  idmap.put("label1",ID_LABEL1);
  idmap.put("panel0",ID_PANEL0);
  idmap.put("listview0",ID_LISTVIEW0);
  idmap.put("listview0_childWgt0",ID_LISTVIEW0_CHILDWGT0);
  idmap.put("listview0_childWgt0_panel2",ID_LISTVIEW0_CHILDWGT0_PANEL2);
  idmap.put("listview0_childWgt0_image1",ID_LISTVIEW0_CHILDWGT0_IMAGE1);
  idmap.put("listview0_childWgt0_panel3",ID_LISTVIEW0_CHILDWGT0_PANEL3);
  idmap.put("listview0_childWgt0_panel4",ID_LISTVIEW0_CHILDWGT0_PANEL4);
  idmap.put("listview0_childWgt0_label1",ID_LISTVIEW0_CHILDWGT0_LABEL1);
  idmap.put("listview0_childWgt0_label5",ID_LISTVIEW0_CHILDWGT0_LABEL5);
  idmap.put("listview0_childWgt0_panel5",ID_LISTVIEW0_CHILDWGT0_PANEL5);
  idmap.put("listview0_childWgt0_label2",ID_LISTVIEW0_CHILDWGT0_LABEL2);
  idmap.put("listview0_childWgt0_label6",ID_LISTVIEW0_CHILDWGT0_LABEL6);
  idmap.put("listview0_childWgt0_panel18",ID_LISTVIEW0_CHILDWGT0_PANEL18);
  idmap.put("listview0_childWgt0_image5",ID_LISTVIEW0_CHILDWGT0_IMAGE5);
  idmap.put("listview0_childWgt1",ID_LISTVIEW0_CHILDWGT1);
  idmap.put("listview0_childWgt1_image8",ID_LISTVIEW0_CHILDWGT1_IMAGE8);
  idmap.put("listview0_childWgt1_label0",ID_LISTVIEW0_CHILDWGT1_LABEL0);
  idmap.put("listview0_childWgt1_image0",ID_LISTVIEW0_CHILDWGT1_IMAGE0);
  idmap.put("listview0_childWgt2",ID_LISTVIEW0_CHILDWGT2);
  idmap.put("listview0_childWgt2_image9",ID_LISTVIEW0_CHILDWGT2_IMAGE9);
  idmap.put("listview0_childWgt2_label3",ID_LISTVIEW0_CHILDWGT2_LABEL3);
  idmap.put("listview0_childWgt3",ID_LISTVIEW0_CHILDWGT3);
  idmap.put("listview0_childWgt3_image10",ID_LISTVIEW0_CHILDWGT3_IMAGE10);
  idmap.put("listview0_childWgt3_label4",ID_LISTVIEW0_CHILDWGT3_LABEL4);
  idmap.put("listview0_childWgt3_image2",ID_LISTVIEW0_CHILDWGT3_IMAGE2);
  idmap.put("listview0_childWgt4",ID_LISTVIEW0_CHILDWGT4);
  idmap.put("listview0_childWgt4_panel14",ID_LISTVIEW0_CHILDWGT4_PANEL14);
  idmap.put("listview0_childWgt4_image4",ID_LISTVIEW0_CHILDWGT4_IMAGE4);
  idmap.put("listview0_childWgt4_panel15",ID_LISTVIEW0_CHILDWGT4_PANEL15);
  idmap.put("listview0_childWgt4_panel16",ID_LISTVIEW0_CHILDWGT4_PANEL16);
  idmap.put("listview0_childWgt4_label11",ID_LISTVIEW0_CHILDWGT4_LABEL11);
  idmap.put("listview0_childWgt4_label12",ID_LISTVIEW0_CHILDWGT4_LABEL12);
  idmap.put("listview0_childWgt4_panel17",ID_LISTVIEW0_CHILDWGT4_PANEL17);
  idmap.put("listview0_childWgt4_label13",ID_LISTVIEW0_CHILDWGT4_LABEL13);
  idmap.put("listview0_childWgt4_label14",ID_LISTVIEW0_CHILDWGT4_LABEL14);
  idmap.put("listview0_childWgt4_panel20",ID_LISTVIEW0_CHILDWGT4_PANEL20);
  idmap.put("listview0_childWgt4_image7",ID_LISTVIEW0_CHILDWGT4_IMAGE7);
  idmap.put("listview0_childWgt5",ID_LISTVIEW0_CHILDWGT5);
  idmap.put("listview0_childWgt5_panel10",ID_LISTVIEW0_CHILDWGT5_PANEL10);
  idmap.put("listview0_childWgt5_image3",ID_LISTVIEW0_CHILDWGT5_IMAGE3);
  idmap.put("listview0_childWgt5_panel11",ID_LISTVIEW0_CHILDWGT5_PANEL11);
  idmap.put("listview0_childWgt5_panel12",ID_LISTVIEW0_CHILDWGT5_PANEL12);
  idmap.put("listview0_childWgt5_label7",ID_LISTVIEW0_CHILDWGT5_LABEL7);
  idmap.put("listview0_childWgt5_label8",ID_LISTVIEW0_CHILDWGT5_LABEL8);
  idmap.put("listview0_childWgt5_panel13",ID_LISTVIEW0_CHILDWGT5_PANEL13);
  idmap.put("listview0_childWgt5_label9",ID_LISTVIEW0_CHILDWGT5_LABEL9);
  idmap.put("listview0_childWgt5_label10",ID_LISTVIEW0_CHILDWGT5_LABEL10);
  idmap.put("listview0_childWgt5_panel19",ID_LISTVIEW0_CHILDWGT5_PANEL19);
  idmap.put("listview0_childWgt5_image6",ID_LISTVIEW0_CHILDWGT5_IMAGE6);

	}
	
	public void onLoad() {
		ULog.logLC("onLoad", this);
		if(currentPage!=null) {
			currentPage.onLoad();
		}
	
		{ //listview0 - listViewOnload
    UMEventArgs args = new UMEventArgs(Addr_navChildrenActivity.this);
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
,"halign","center"
,"pressed-image","btn_back_touch"
,"width","64"
,"background-image-dis","button"
,"font-pressed-color","#f2adb2"
,"height","44"
,"color","#e50011"
,"layout-type","linear"
,"font-size","17"
,"onclick","onBack"
,"font-family","default"
,"valign","center"
,"background-image","btn_back"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,button0,"value","#{res.addr_oaadl_0006}"));
button0.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Addr_navChildrenActivity.this);
    actionOnBack(button0,args);

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
navigatorbar0.addView(label0);
label1 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL1
,"halign","center"
,"height","44"
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
public View getListview0_childWgt0_panel2View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt0_panel2 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT0_PANEL2
,"margin-right","8"
,"height","70"
,"layout-type","linear"
,"width","25"
,"valign","center"
);
listview0_childWgt0_image1 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_LISTVIEW0_CHILDWGT0_IMAGE1
,"height","25"
,"layout-type","linear"
,"width","25"
,"scaletype","fitcenter"
,"src","oaadl_detail_nosex.png"
);
listview0_childWgt0_panel2.addView(listview0_childWgt0_image1);

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
listview0_childWgt0_label1 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT0_LABEL1
,"bindfield","navname"
,"halign","left"
,"height","fill"
,"color","#000000"
,"layout-type","linear"
,"font-size","16"
,"width","123"
,"font-family","default"
,"valign","center"
);
UMTextBinder listview0_childWgt0_label1_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt0_label1_binder.setBindInfo(new BindInfo("navname"));
listview0_childWgt0_label1_binder.setControl(listview0_childWgt0_label1);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT0_LABEL1, listview0_childWgt0_label1_binder);
listview0_childWgt0_panel4.addView(listview0_childWgt0_label1);
listview0_childWgt0_label5 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT0_LABEL5
,"bindfield","job"
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
UMTextBinder listview0_childWgt0_label5_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt0_label5_binder.setBindInfo(new BindInfo("job"));
listview0_childWgt0_label5_binder.setControl(listview0_childWgt0_label5);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT0_LABEL5, listview0_childWgt0_label5_binder);
listview0_childWgt0_panel4.addView(listview0_childWgt0_label5);

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
listview0_childWgt0_label2 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT0_LABEL2
,"bindfield","mobileno"
,"halign","left"
,"height","fill"
,"color","#6f6f6f"
,"layout-type","linear"
,"font-size","13"
,"width","123"
,"font-family","default"
,"valign","center"
);
UMTextBinder listview0_childWgt0_label2_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt0_label2_binder.setBindInfo(new BindInfo("mobileno"));
listview0_childWgt0_label2_binder.setControl(listview0_childWgt0_label2);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT0_LABEL2, listview0_childWgt0_label2_binder);
listview0_childWgt0_panel5.addView(listview0_childWgt0_label2);
listview0_childWgt0_label6 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT0_LABEL6
,"bindfield","position"
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
UMTextBinder listview0_childWgt0_label6_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt0_label6_binder.setBindInfo(new BindInfo("position"));
listview0_childWgt0_label6_binder.setControl(listview0_childWgt0_label6);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT0_LABEL6, listview0_childWgt0_label6_binder);
listview0_childWgt0_panel5.addView(listview0_childWgt0_label6);

return listview0_childWgt0_panel5;
}
public View getListview0_childWgt0_panel3View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt0_panel3 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_LISTVIEW0_CHILDWGT0_PANEL3
,"padding-left","3"
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
public View getListview0_childWgt0_panel18View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt0_panel18 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT0_PANEL18
,"margin-right","15"
,"height","fill"
,"layout-type","linear"
,"width","8"
,"margin-left","8"
,"valign","center"
);
listview0_childWgt0_image5 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_LISTVIEW0_CHILDWGT0_IMAGE5
,"height","13"
,"layout-type","linear"
,"width","8"
,"scaletype","fitcenter"
,"src","oaadl_arrow.png"
);
listview0_childWgt0_panel18.addView(listview0_childWgt0_image5);

return listview0_childWgt0_panel18;
}
public View getListview0_childWgt0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt0 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT0
,"padding-left","8"
,"height","70"
,"layout-type","linear"
,"width","fill"
,"onclick","toPsnDetail"
,"valign","center"
,"background-image","oaadl_70_down.png"
);
listview0_childWgt0.setOnClickListener(new OnCursorClickListener(configure) {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Addr_navChildrenActivity.this);
    int position = this.getPosition(v);
    if(position>=0) {
      context.getCursor("cursornavsalias").setCurrentIndex(position);
    }
    actionToPsnDetail(listview0_childWgt0,args);

}
});
View listview0_childWgt0_panel2 = (View) getListview0_childWgt0_panel2View((UMActivity)context,binderGroup,configure);
listview0_childWgt0.addView(listview0_childWgt0_panel2);
View listview0_childWgt0_panel3 = (View) getListview0_childWgt0_panel3View((UMActivity)context,binderGroup,configure);
listview0_childWgt0.addView(listview0_childWgt0_panel3);
View listview0_childWgt0_panel18 = (View) getListview0_childWgt0_panel18View((UMActivity)context,binderGroup,configure);
listview0_childWgt0.addView(listview0_childWgt0_panel18);

return listview0_childWgt0;
}
public View getListview0_childWgt1View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt1 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT1
,"padding-right","15"
,"padding-left","8"
,"height","44"
,"layout-type","linear"
,"width","fill"
,"onclick","toChildNav"
,"valign","center"
,"background-image","oaadl_44_down.png"
);
listview0_childWgt1.setOnClickListener(new OnCursorClickListener(configure) {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Addr_navChildrenActivity.this);
    int position = this.getPosition(v);
    if(position>=0) {
      context.getCursor("cursornavsalias").setCurrentIndex(position);
    }
    actionToChildNav(listview0_childWgt1,args);

}
});
listview0_childWgt1_image8 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_LISTVIEW0_CHILDWGT1_IMAGE8
,"bindfield","navimage"
,"margin-right","8"
,"height","25"
,"layout-type","linear"
,"width","25"
,"scaletype","fitcenter"
,"src",""
);
UMImageBinder listview0_childWgt1_image8_binder = new UMImageBinder((IUMContextAccessor)context);
listview0_childWgt1_image8_binder.setBindInfo(new BindInfo("navimage"));
listview0_childWgt1_image8_binder.setControl(listview0_childWgt1_image8);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT1_IMAGE8, listview0_childWgt1_image8_binder);
listview0_childWgt1.addView(listview0_childWgt1_image8);
listview0_childWgt1_label0 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT1_LABEL0
,"bindfield","nameandnum"
,"halign","left"
,"height","fill"
,"weight","1"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","0"
,"margin-left","3"
,"font-family","default"
,"valign","center"
);
UMTextBinder listview0_childWgt1_label0_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt1_label0_binder.setBindInfo(new BindInfo("nameandnum"));
listview0_childWgt1_label0_binder.setControl(listview0_childWgt1_label0);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT1_LABEL0, listview0_childWgt1_label0_binder);
listview0_childWgt1.addView(listview0_childWgt1_label0);
listview0_childWgt1_image0 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_LISTVIEW0_CHILDWGT1_IMAGE0
,"height","13"
,"layout-type","linear"
,"width","8"
,"scaletype","fitcenter"
,"src","oaadl_arrow.png"
);
listview0_childWgt1.addView(listview0_childWgt1_image0);

return listview0_childWgt1;
}
public View getListview0_childWgt2View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt2 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT2
,"padding-left","8"
,"padding-right","15"
,"height","44"
,"layout-type","linear"
,"width","fill"
,"valign","center"
,"background-image","oaadl_44_down.png"
);
listview0_childWgt2_image9 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_LISTVIEW0_CHILDWGT2_IMAGE9
,"bindfield","navimage"
,"margin-right","8"
,"height","25"
,"layout-type","linear"
,"width","25"
,"scaletype","fitcenter"
,"src",""
);
UMImageBinder listview0_childWgt2_image9_binder = new UMImageBinder((IUMContextAccessor)context);
listview0_childWgt2_image9_binder.setBindInfo(new BindInfo("navimage"));
listview0_childWgt2_image9_binder.setControl(listview0_childWgt2_image9);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT2_IMAGE9, listview0_childWgt2_image9_binder);
listview0_childWgt2.addView(listview0_childWgt2_image9);
listview0_childWgt2_label3 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT2_LABEL3
,"bindfield","nameandnum"
,"halign","left"
,"height","fill"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","fill"
,"margin-left","3"
,"font-family","default"
,"scaletype","fitcenter"
,"valign","center"
);
UMTextBinder listview0_childWgt2_label3_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt2_label3_binder.setBindInfo(new BindInfo("nameandnum"));
listview0_childWgt2_label3_binder.setControl(listview0_childWgt2_label3);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT2_LABEL3, listview0_childWgt2_label3_binder);
listview0_childWgt2.addView(listview0_childWgt2_label3);

return listview0_childWgt2;
}
public View getListview0_childWgt3View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt3 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT3
,"padding-right","15"
,"padding-left","8"
,"height","44"
,"layout-type","linear"
,"width","fill"
,"onclick","toPsnList"
,"valign","center"
,"background-image","oaadl_44_down.png"
);
listview0_childWgt3.setOnClickListener(new OnCursorClickListener(configure) {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Addr_navChildrenActivity.this);
    int position = this.getPosition(v);
    if(position>=0) {
      context.getCursor("cursornavsalias").setCurrentIndex(position);
    }
    actionToPsnList(listview0_childWgt3,args);

}
});
listview0_childWgt3_image10 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_LISTVIEW0_CHILDWGT3_IMAGE10
,"bindfield","navimage"
,"margin-right","8"
,"height","25"
,"layout-type","linear"
,"width","25"
,"scaletype","fitcenter"
,"src",""
);
UMImageBinder listview0_childWgt3_image10_binder = new UMImageBinder((IUMContextAccessor)context);
listview0_childWgt3_image10_binder.setBindInfo(new BindInfo("navimage"));
listview0_childWgt3_image10_binder.setControl(listview0_childWgt3_image10);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT3_IMAGE10, listview0_childWgt3_image10_binder);
listview0_childWgt3.addView(listview0_childWgt3_image10);
listview0_childWgt3_label4 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT3_LABEL4
,"bindfield","nameandnum"
,"halign","left"
,"height","fill"
,"weight","1"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","0"
,"margin-left","3"
,"font-family","default"
,"valign","center"
);
UMTextBinder listview0_childWgt3_label4_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt3_label4_binder.setBindInfo(new BindInfo("nameandnum"));
listview0_childWgt3_label4_binder.setControl(listview0_childWgt3_label4);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT3_LABEL4, listview0_childWgt3_label4_binder);
listview0_childWgt3.addView(listview0_childWgt3_label4);
listview0_childWgt3_image2 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_LISTVIEW0_CHILDWGT3_IMAGE2
,"height","13"
,"layout-type","linear"
,"width","8"
,"scaletype","fitcenter"
,"src","oaadl_arrow.png"
);
listview0_childWgt3.addView(listview0_childWgt3_image2);

return listview0_childWgt3;
}
public View getListview0_childWgt4_panel14View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt4_panel14 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT4_PANEL14
,"margin-right","8"
,"height","70"
,"layout-type","linear"
,"width","25"
,"valign","center"
);
listview0_childWgt4_image4 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_LISTVIEW0_CHILDWGT4_IMAGE4
,"height","25"
,"layout-type","linear"
,"width","25"
,"scaletype","fitcenter"
,"src","oaadl_detail_fm.png"
);
listview0_childWgt4_panel14.addView(listview0_childWgt4_image4);

return listview0_childWgt4_panel14;
}
public View getListview0_childWgt4_panel16View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt4_panel16 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT4_PANEL16
,"height","20"
,"layout-type","linear"
,"width","fill"
,"margin-bottom","7"
,"margin-top","13"
,"valign","center"
);
listview0_childWgt4_label11 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT4_LABEL11
,"bindfield","navname"
,"halign","left"
,"height","fill"
,"color","#000000"
,"layout-type","linear"
,"font-size","16"
,"width","123"
,"font-family","default"
,"valign","center"
);
UMTextBinder listview0_childWgt4_label11_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt4_label11_binder.setBindInfo(new BindInfo("navname"));
listview0_childWgt4_label11_binder.setControl(listview0_childWgt4_label11);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT4_LABEL11, listview0_childWgt4_label11_binder);
listview0_childWgt4_panel16.addView(listview0_childWgt4_label11);
listview0_childWgt4_label12 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT4_LABEL12
,"bindfield","job"
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
UMTextBinder listview0_childWgt4_label12_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt4_label12_binder.setBindInfo(new BindInfo("job"));
listview0_childWgt4_label12_binder.setControl(listview0_childWgt4_label12);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT4_LABEL12, listview0_childWgt4_label12_binder);
listview0_childWgt4_panel16.addView(listview0_childWgt4_label12);

return listview0_childWgt4_panel16;
}
public View getListview0_childWgt4_panel17View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt4_panel17 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT4_PANEL17
,"height","17"
,"layout-type","linear"
,"width","fill"
,"margin-bottom","13"
,"valign","center"
);
listview0_childWgt4_label13 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT4_LABEL13
,"bindfield","mobileno"
,"halign","left"
,"height","fill"
,"color","#6f6f6f"
,"layout-type","linear"
,"font-size","13"
,"width","123"
,"font-family","default"
,"valign","center"
);
UMTextBinder listview0_childWgt4_label13_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt4_label13_binder.setBindInfo(new BindInfo("mobileno"));
listview0_childWgt4_label13_binder.setControl(listview0_childWgt4_label13);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT4_LABEL13, listview0_childWgt4_label13_binder);
listview0_childWgt4_panel17.addView(listview0_childWgt4_label13);
listview0_childWgt4_label14 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT4_LABEL14
,"bindfield","position"
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
UMTextBinder listview0_childWgt4_label14_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt4_label14_binder.setBindInfo(new BindInfo("position"));
listview0_childWgt4_label14_binder.setControl(listview0_childWgt4_label14);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT4_LABEL14, listview0_childWgt4_label14_binder);
listview0_childWgt4_panel17.addView(listview0_childWgt4_label14);

return listview0_childWgt4_panel17;
}
public View getListview0_childWgt4_panel15View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt4_panel15 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_LISTVIEW0_CHILDWGT4_PANEL15
,"padding-left","3"
,"halign","center"
,"height","fill"
,"weight","1"
,"layout-type","linear"
,"width","0"
);
View listview0_childWgt4_panel16 = (View) getListview0_childWgt4_panel16View((UMActivity)context,binderGroup,configure);
listview0_childWgt4_panel15.addView(listview0_childWgt4_panel16);
View listview0_childWgt4_panel17 = (View) getListview0_childWgt4_panel17View((UMActivity)context,binderGroup,configure);
listview0_childWgt4_panel15.addView(listview0_childWgt4_panel17);

return listview0_childWgt4_panel15;
}
public View getListview0_childWgt4_panel20View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt4_panel20 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT4_PANEL20
,"margin-right","15"
,"height","fill"
,"layout-type","linear"
,"width","8"
,"margin-left","8"
,"valign","center"
);
listview0_childWgt4_image7 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_LISTVIEW0_CHILDWGT4_IMAGE7
,"height","13"
,"layout-type","linear"
,"width","8"
,"scaletype","fitcenter"
,"src","oaadl_arrow.png"
);
listview0_childWgt4_panel20.addView(listview0_childWgt4_image7);

return listview0_childWgt4_panel20;
}
public View getListview0_childWgt4View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt4 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT4
,"padding-left","8"
,"height","70"
,"layout-type","linear"
,"width","fill"
,"onclick","toPsnDetail"
,"valign","center"
,"background-image","oaadl_70_down.png"
);
listview0_childWgt4.setOnClickListener(new OnCursorClickListener(configure) {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Addr_navChildrenActivity.this);
    int position = this.getPosition(v);
    if(position>=0) {
      context.getCursor("cursornavsalias").setCurrentIndex(position);
    }
    actionToPsnDetail(listview0_childWgt4,args);

}
});
View listview0_childWgt4_panel14 = (View) getListview0_childWgt4_panel14View((UMActivity)context,binderGroup,configure);
listview0_childWgt4.addView(listview0_childWgt4_panel14);
View listview0_childWgt4_panel15 = (View) getListview0_childWgt4_panel15View((UMActivity)context,binderGroup,configure);
listview0_childWgt4.addView(listview0_childWgt4_panel15);
View listview0_childWgt4_panel20 = (View) getListview0_childWgt4_panel20View((UMActivity)context,binderGroup,configure);
listview0_childWgt4.addView(listview0_childWgt4_panel20);

return listview0_childWgt4;
}
public View getListview0_childWgt5_panel10View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt5_panel10 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT5_PANEL10
,"margin-right","8"
,"height","70"
,"layout-type","linear"
,"background","#ffffff"
,"width","25"
,"valign","center"
);
listview0_childWgt5_image3 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_LISTVIEW0_CHILDWGT5_IMAGE3
,"height","25"
,"layout-type","linear"
,"width","25"
,"scaletype","fitcenter"
,"src","oaadl_detail_fa.png"
);
listview0_childWgt5_panel10.addView(listview0_childWgt5_image3);

return listview0_childWgt5_panel10;
}
public View getListview0_childWgt5_panel12View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt5_panel12 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT5_PANEL12
,"height","20"
,"layout-type","linear"
,"width","fill"
,"margin-bottom","7"
,"margin-top","13"
,"valign","center"
);
listview0_childWgt5_label7 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT5_LABEL7
,"bindfield","navname"
,"halign","left"
,"height","fill"
,"color","#000000"
,"layout-type","linear"
,"font-size","16"
,"width","123"
,"font-family","default"
,"valign","center"
);
UMTextBinder listview0_childWgt5_label7_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt5_label7_binder.setBindInfo(new BindInfo("navname"));
listview0_childWgt5_label7_binder.setControl(listview0_childWgt5_label7);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT5_LABEL7, listview0_childWgt5_label7_binder);
listview0_childWgt5_panel12.addView(listview0_childWgt5_label7);
listview0_childWgt5_label8 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT5_LABEL8
,"bindfield","job"
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
UMTextBinder listview0_childWgt5_label8_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt5_label8_binder.setBindInfo(new BindInfo("job"));
listview0_childWgt5_label8_binder.setControl(listview0_childWgt5_label8);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT5_LABEL8, listview0_childWgt5_label8_binder);
listview0_childWgt5_panel12.addView(listview0_childWgt5_label8);

return listview0_childWgt5_panel12;
}
public View getListview0_childWgt5_panel13View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt5_panel13 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT5_PANEL13
,"height","17"
,"layout-type","linear"
,"width","fill"
,"margin-bottom","13"
,"valign","center"
);
listview0_childWgt5_label9 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT5_LABEL9
,"bindfield","mobileno"
,"halign","left"
,"height","fill"
,"color","#6f6f6f"
,"layout-type","linear"
,"font-size","13"
,"width","123"
,"font-family","default"
,"valign","center"
);
UMTextBinder listview0_childWgt5_label9_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt5_label9_binder.setBindInfo(new BindInfo("mobileno"));
listview0_childWgt5_label9_binder.setControl(listview0_childWgt5_label9);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT5_LABEL9, listview0_childWgt5_label9_binder);
listview0_childWgt5_panel13.addView(listview0_childWgt5_label9);
listview0_childWgt5_label10 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT5_LABEL10
,"bindfield","position"
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
UMTextBinder listview0_childWgt5_label10_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt5_label10_binder.setBindInfo(new BindInfo("position"));
listview0_childWgt5_label10_binder.setControl(listview0_childWgt5_label10);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT5_LABEL10, listview0_childWgt5_label10_binder);
listview0_childWgt5_panel13.addView(listview0_childWgt5_label10);

return listview0_childWgt5_panel13;
}
public View getListview0_childWgt5_panel11View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt5_panel11 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_LISTVIEW0_CHILDWGT5_PANEL11
,"padding-left","3"
,"halign","center"
,"height","fill"
,"weight","1"
,"layout-type","linear"
,"width","0"
);
View listview0_childWgt5_panel12 = (View) getListview0_childWgt5_panel12View((UMActivity)context,binderGroup,configure);
listview0_childWgt5_panel11.addView(listview0_childWgt5_panel12);
View listview0_childWgt5_panel13 = (View) getListview0_childWgt5_panel13View((UMActivity)context,binderGroup,configure);
listview0_childWgt5_panel11.addView(listview0_childWgt5_panel13);

return listview0_childWgt5_panel11;
}
public View getListview0_childWgt5_panel19View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt5_panel19 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT5_PANEL19
,"margin-right","15"
,"height","fill"
,"layout-type","linear"
,"width","8"
,"margin-left","8"
,"valign","center"
);
listview0_childWgt5_image6 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_LISTVIEW0_CHILDWGT5_IMAGE6
,"height","13"
,"layout-type","linear"
,"width","8"
,"scaletype","fitcenter"
,"src","oaadl_arrow.png"
);
listview0_childWgt5_panel19.addView(listview0_childWgt5_image6);

return listview0_childWgt5_panel19;
}
public View getListview0_childWgt5View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt5 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT5
,"padding-left","8"
,"height","70"
,"layout-type","linear"
,"width","fill"
,"onclick","toPsnDetail"
,"valign","center"
,"background-image","oaadl_70_down.png"
);
listview0_childWgt5.setOnClickListener(new OnCursorClickListener(configure) {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Addr_navChildrenActivity.this);
    int position = this.getPosition(v);
    if(position>=0) {
      context.getCursor("cursornavsalias").setCurrentIndex(position);
    }
    actionToPsnDetail(listview0_childWgt5,args);

}
});
View listview0_childWgt5_panel10 = (View) getListview0_childWgt5_panel10View((UMActivity)context,binderGroup,configure);
listview0_childWgt5.addView(listview0_childWgt5_panel10);
View listview0_childWgt5_panel11 = (View) getListview0_childWgt5_panel11View((UMActivity)context,binderGroup,configure);
listview0_childWgt5.addView(listview0_childWgt5_panel11);
View listview0_childWgt5_panel19 = (View) getListview0_childWgt5_panel19View((UMActivity)context,binderGroup,configure);
listview0_childWgt5.addView(listview0_childWgt5_panel19);

return listview0_childWgt5;
}
public View getListview0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0 = (UMListViewBase)ThirdControl.createControl(new UMListViewBase(context),ID_LISTVIEW0
,"bindfield","navs"
,"height","fill"
,"childindicator","navPsnRowWidget"
,"ondownrefersh","getNextPage"
,"cursoraction","cursornavsalias"
,"onload","listViewOnload"
,"layout-type","linear"
,"background","#efeff4"
,"width","fill"
);
context.createCursor("cursornavsalias", "navs");
UMListBinder listview0_binder = new UMListBinder((IUMContextAccessor)context);
listview0_binder.setBindInfo(new BindInfo("navs"));
listview0_binder.setControl(listview0);
binderGroup.addBinderToGroup(ID_LISTVIEW0, listview0_binder);
listview0.setEvent("ondownrefersh", new OnCursorEventListener(configure) {
  @Override
  public void onEvent(View v, UMEventArgs parent) {
    UMEventArgs args = new UMEventArgs(Addr_navChildrenActivity.this);
    args.put(parent);
    actionGetNextPage(listview0,args);

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
listview0.addListItemView(new UMListViewBase.ListItemView() {
	public View getItemView(Context context, View parent, IBinderGroup binderGroup,int position) {
  UMDslConfigure configure = new UMDslConfigure();
  configure.put("position",position);
View listview0_childWgt3 = (View) getListview0_childWgt3View((UMActivity)context,binderGroup,configure);
return listview0_childWgt3;
}});
listview0.addListItemView(new UMListViewBase.ListItemView() {
	public View getItemView(Context context, View parent, IBinderGroup binderGroup,int position) {
  UMDslConfigure configure = new UMDslConfigure();
  configure.put("position",position);
View listview0_childWgt4 = (View) getListview0_childWgt4View((UMActivity)context,binderGroup,configure);
return listview0_childWgt4;
}});
listview0.addListItemView(new UMListViewBase.ListItemView() {
	public View getItemView(Context context, View parent, IBinderGroup binderGroup,int position) {
  UMDslConfigure configure = new UMDslConfigure();
  configure.put("position",position);
View listview0_childWgt5 = (View) getListview0_childWgt5View((UMActivity)context,binderGroup,configure);
return listview0_childWgt5;
}});

return listview0;
}
public View getPanel0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel0 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL0
,"halign","center"
,"weight","1"
,"height","0"
,"layout-type","linear"
,"width","fill"
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
);
View navigatorbar0 = (View) getNavigatorbar0View((UMActivity)context,binderGroup,configure);
viewPage0.addView(navigatorbar0);
View panel0 = (View) getPanel0View((UMActivity)context,binderGroup,configure);
viewPage0.addView(panel0);

return viewPage0;
}
public UMWindow getCurrentWindow(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
navChildren = (UMWindow)ThirdControl.createControl(new UMWindow(context),ID_NAVCHILDREN
,"halign","center"
,"height","fill"
,"layout","vbox"
,"width","fill"
,"context","navList"
,"controller","navChildrenController"
,"namespace","nc.bs.oa.oama.ecm"
);
View viewPage0 = (View) getViewPage0View((UMActivity)context,binderGroup,configure);
navChildren.addView(viewPage0);

return (UMWindow)navChildren;
}

	
	public void actionToChildNav(View control, UMEventArgs args) {
    String actionid = "toChildNav";
    args.put("viewid","nc.bs.oa.oama.ecm.Addr_navChildren");
  this.dataCollect();
    args.put("iskeep","true");
    args.put("containerName","");
    args.put("row","#{#{cursor.cursornavsalias}}");
    args.put("row_arrayPath","navs");
  ActionProcessor.exec(this, actionid, args);
UMView.open(args);
}
public void actionSetSelector(View control, UMEventArgs args) {
    String actionid = "setSelector";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "setSelector",UMActivity.getViewId(control),args);
}
public void actionToPsnDetail(View control, UMEventArgs args) {
    String actionid = "toPsnDetail";
    args.put("viewid","nc.bs.oa.oama.ecm.Addr_psnDetail");
  this.dataCollect();
    args.put("iskeep","true");
    args.put("type","nav");
    args.put("containerName","");
    args.put("row","#{#{cursor.cursornavsalias}}");
    args.put("row_arrayPath","navs");
  ActionProcessor.exec(this, actionid, args);
UMView.open(args);
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
public void actionGetNextPage(View control, UMEventArgs args) {
    String actionid = "getNextPage";
    args.put("containerName","");
    args.put("row","#{plug.row}");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "getNextPage",UMActivity.getViewId(control),args);
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
public void actionToPsnList(View control, UMEventArgs args) {
    String actionid = "toPsnList";
    args.put("viewid","nc.bs.oa.oama.ecm.Addr_psnList");
  this.dataCollect();
    args.put("iskeep","true");
    args.put("type","nav");
    args.put("containerName","");
    args.put("row_arrayPath","navs");
    args.put("row","#{#{cursor.cursornavsalias}}");
  ActionProcessor.exec(this, actionid, args);
UMView.open(args);
}
public void actionOnBack(View control, UMEventArgs args) {
    String actionid = "onBack";
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
