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

public abstract class Info_groupinfosActivity extends UMWindowActivity {

	protected UMWindow groupinfos = null;
protected XVerticalLayout viewPage0 = null;
protected XHorizontalLayout navigatorbar0 = null;
protected UMImage image1 = null;
protected UMLabel label5 = null;
protected XVerticalLayout panel22 = null;
protected XVerticalLayout panel0 = null;
protected UMListViewBase listviewdefine0 = null;
protected XHorizontalLayout listviewdefine0_groupWgt = null;
protected XHorizontalLayout listviewdefine0_groupWgt_panel1 = null;
protected UMLabel listviewdefine0_groupWgt_label0 = null;
protected XHorizontalLayout listviewdefine0_groupWgt_panel2 = null;
protected UMLabel listviewdefine0_groupWgt_label1 = null;
protected XHorizontalLayout listviewdefine0_childWgt0 = null;
protected XHorizontalLayout listviewdefine0_childWgt0_panel16 = null;
protected UMImage listviewdefine0_childWgt0_image0 = null;
protected XVerticalLayout listviewdefine0_childWgt0_panel3 = null;
protected XHorizontalLayout listviewdefine0_childWgt0_panel5 = null;
protected XHorizontalLayout listviewdefine0_childWgt0_panel8 = null;
protected UMLabel listviewdefine0_childWgt0_label2 = null;
protected XHorizontalLayout listviewdefine0_childWgt0_panel10 = null;
protected UMLabel listviewdefine0_childWgt0_label3 = null;
protected XVerticalLayout listviewdefine0_childWgt0_panel13 = null;
protected UMLabel listviewdefine0_childWgt0_label6 = null;
protected XHorizontalLayout listviewdefine0_childWgt1 = null;
protected XHorizontalLayout listviewdefine0_childWgt1_panel17 = null;
protected UMImage listviewdefine0_childWgt1_image1 = null;
protected XVerticalLayout listviewdefine0_childWgt1_panel4 = null;
protected XHorizontalLayout listviewdefine0_childWgt1_panel6 = null;
protected XHorizontalLayout listviewdefine0_childWgt1_panel11 = null;
protected UMLabel listviewdefine0_childWgt1_label4 = null;
protected XHorizontalLayout listviewdefine0_childWgt1_panel12 = null;
protected UMLabel listviewdefine0_childWgt1_label5 = null;
protected XVerticalLayout listviewdefine0_childWgt1_panel14 = null;
protected UMLabel listviewdefine0_childWgt1_label7 = null;
protected XVerticalLayout panel1 = null;
protected XVerticalLayout widget0 = null;
protected XHorizontalLayout widget0_toolbar0 = null;
protected UMImageButton widget0_imagebutton0 = null;
protected UMImageButton widget0_imagebutton2 = null;
protected UMImageButton widget0_imagebutton1 = null;

	
	protected final static int ID_GROUPINFOS = 361925324;
protected final static int ID_VIEWPAGE0 = 233203726;
protected final static int ID_NAVIGATORBAR0 = 802966129;
protected final static int ID_IMAGE1 = 811047344;
protected final static int ID_LABEL5 = 550986381;
protected final static int ID_PANEL22 = 1302011455;
protected final static int ID_PANEL0 = 1866026167;
protected final static int ID_LISTVIEWDEFINE0 = 301747578;
protected final static int ID_LISTVIEWDEFINE0_GROUPWGT = 2127635700;
protected final static int ID_LISTVIEWDEFINE0_GROUPWGT_PANEL1 = 1395777583;
protected final static int ID_LISTVIEWDEFINE0_GROUPWGT_LABEL0 = 1827739728;
protected final static int ID_LISTVIEWDEFINE0_GROUPWGT_PANEL2 = 1062001985;
protected final static int ID_LISTVIEWDEFINE0_GROUPWGT_LABEL1 = 833490735;
protected final static int ID_LISTVIEWDEFINE0_CHILDWGT0 = 1578059122;
protected final static int ID_LISTVIEWDEFINE0_CHILDWGT0_PANEL16 = 1488178502;
protected final static int ID_LISTVIEWDEFINE0_CHILDWGT0_IMAGE0 = 444211014;
protected final static int ID_LISTVIEWDEFINE0_CHILDWGT0_PANEL3 = 1409501589;
protected final static int ID_LISTVIEWDEFINE0_CHILDWGT0_PANEL5 = 1560749411;
protected final static int ID_LISTVIEWDEFINE0_CHILDWGT0_PANEL8 = 671955723;
protected final static int ID_LISTVIEWDEFINE0_CHILDWGT0_LABEL2 = 1471722053;
protected final static int ID_LISTVIEWDEFINE0_CHILDWGT0_PANEL10 = 1716017466;
protected final static int ID_LISTVIEWDEFINE0_CHILDWGT0_LABEL3 = 1886139497;
protected final static int ID_LISTVIEWDEFINE0_CHILDWGT0_PANEL13 = 706594654;
protected final static int ID_LISTVIEWDEFINE0_CHILDWGT0_LABEL6 = 719032028;
protected final static int ID_LISTVIEWDEFINE0_CHILDWGT1 = 1209688153;
protected final static int ID_LISTVIEWDEFINE0_CHILDWGT1_PANEL17 = 160207184;
protected final static int ID_LISTVIEWDEFINE0_CHILDWGT1_IMAGE1 = 1781363124;
protected final static int ID_LISTVIEWDEFINE0_CHILDWGT1_PANEL4 = 428389809;
protected final static int ID_LISTVIEWDEFINE0_CHILDWGT1_PANEL6 = 417860198;
protected final static int ID_LISTVIEWDEFINE0_CHILDWGT1_PANEL11 = 248235254;
protected final static int ID_LISTVIEWDEFINE0_CHILDWGT1_LABEL4 = 2001142826;
protected final static int ID_LISTVIEWDEFINE0_CHILDWGT1_PANEL12 = 1465229723;
protected final static int ID_LISTVIEWDEFINE0_CHILDWGT1_LABEL5 = 55741641;
protected final static int ID_LISTVIEWDEFINE0_CHILDWGT1_PANEL14 = 909939750;
protected final static int ID_LISTVIEWDEFINE0_CHILDWGT1_LABEL7 = 1762962880;
protected final static int ID_PANEL1 = 422722367;
protected final static int ID_WIDGET0 = 1875570635;
protected final static int ID_WIDGET0_TOOLBAR0 = 545690688;
protected final static int ID_WIDGET0_IMAGEBUTTON0 = 1530839498;
protected final static int ID_WIDGET0_IMAGEBUTTON2 = 1607677969;
protected final static int ID_WIDGET0_IMAGEBUTTON1 = 1040879441;

	
	
	@Override
	public String getControllerName() {
		return "groupinfosController";
	}
	
	@Override
	public String getContextName() {
		return "oainfototal";
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
		  idmap.put("groupinfos",ID_GROUPINFOS);
  idmap.put("viewPage0",ID_VIEWPAGE0);
  idmap.put("navigatorbar0",ID_NAVIGATORBAR0);
  idmap.put("image1",ID_IMAGE1);
  idmap.put("label5",ID_LABEL5);
  idmap.put("panel22",ID_PANEL22);
  idmap.put("panel0",ID_PANEL0);
  idmap.put("listviewdefine0",ID_LISTVIEWDEFINE0);
  idmap.put("listviewdefine0_groupWgt",ID_LISTVIEWDEFINE0_GROUPWGT);
  idmap.put("listviewdefine0_groupWgt_panel1",ID_LISTVIEWDEFINE0_GROUPWGT_PANEL1);
  idmap.put("listviewdefine0_groupWgt_label0",ID_LISTVIEWDEFINE0_GROUPWGT_LABEL0);
  idmap.put("listviewdefine0_groupWgt_panel2",ID_LISTVIEWDEFINE0_GROUPWGT_PANEL2);
  idmap.put("listviewdefine0_groupWgt_label1",ID_LISTVIEWDEFINE0_GROUPWGT_LABEL1);
  idmap.put("listviewdefine0_childWgt0",ID_LISTVIEWDEFINE0_CHILDWGT0);
  idmap.put("listviewdefine0_childWgt0_panel16",ID_LISTVIEWDEFINE0_CHILDWGT0_PANEL16);
  idmap.put("listviewdefine0_childWgt0_image0",ID_LISTVIEWDEFINE0_CHILDWGT0_IMAGE0);
  idmap.put("listviewdefine0_childWgt0_panel3",ID_LISTVIEWDEFINE0_CHILDWGT0_PANEL3);
  idmap.put("listviewdefine0_childWgt0_panel5",ID_LISTVIEWDEFINE0_CHILDWGT0_PANEL5);
  idmap.put("listviewdefine0_childWgt0_panel8",ID_LISTVIEWDEFINE0_CHILDWGT0_PANEL8);
  idmap.put("listviewdefine0_childWgt0_label2",ID_LISTVIEWDEFINE0_CHILDWGT0_LABEL2);
  idmap.put("listviewdefine0_childWgt0_panel10",ID_LISTVIEWDEFINE0_CHILDWGT0_PANEL10);
  idmap.put("listviewdefine0_childWgt0_label3",ID_LISTVIEWDEFINE0_CHILDWGT0_LABEL3);
  idmap.put("listviewdefine0_childWgt0_panel13",ID_LISTVIEWDEFINE0_CHILDWGT0_PANEL13);
  idmap.put("listviewdefine0_childWgt0_label6",ID_LISTVIEWDEFINE0_CHILDWGT0_LABEL6);
  idmap.put("listviewdefine0_childWgt1",ID_LISTVIEWDEFINE0_CHILDWGT1);
  idmap.put("listviewdefine0_childWgt1_panel17",ID_LISTVIEWDEFINE0_CHILDWGT1_PANEL17);
  idmap.put("listviewdefine0_childWgt1_image1",ID_LISTVIEWDEFINE0_CHILDWGT1_IMAGE1);
  idmap.put("listviewdefine0_childWgt1_panel4",ID_LISTVIEWDEFINE0_CHILDWGT1_PANEL4);
  idmap.put("listviewdefine0_childWgt1_panel6",ID_LISTVIEWDEFINE0_CHILDWGT1_PANEL6);
  idmap.put("listviewdefine0_childWgt1_panel11",ID_LISTVIEWDEFINE0_CHILDWGT1_PANEL11);
  idmap.put("listviewdefine0_childWgt1_label4",ID_LISTVIEWDEFINE0_CHILDWGT1_LABEL4);
  idmap.put("listviewdefine0_childWgt1_panel12",ID_LISTVIEWDEFINE0_CHILDWGT1_PANEL12);
  idmap.put("listviewdefine0_childWgt1_label5",ID_LISTVIEWDEFINE0_CHILDWGT1_LABEL5);
  idmap.put("listviewdefine0_childWgt1_panel14",ID_LISTVIEWDEFINE0_CHILDWGT1_PANEL14);
  idmap.put("listviewdefine0_childWgt1_label7",ID_LISTVIEWDEFINE0_CHILDWGT1_LABEL7);
  idmap.put("panel1",ID_PANEL1);
  idmap.put("widget0",ID_WIDGET0);
  idmap.put("widget0_toolbar0",ID_WIDGET0_TOOLBAR0);
  idmap.put("widget0_imagebutton0",ID_WIDGET0_IMAGEBUTTON0);
  idmap.put("widget0_imagebutton2",ID_WIDGET0_IMAGEBUTTON2);
  idmap.put("widget0_imagebutton1",ID_WIDGET0_IMAGEBUTTON1);

	}
	
	public void onLoad() {
		ULog.logLC("onLoad", this);
		if(currentPage!=null) {
			currentPage.onLoad();
		}
	
		{ //viewPage0 - exchangeToolbar
    UMEventArgs args = new UMEventArgs(Info_groupinfosActivity.this);
    actionExchangeToolbar(viewPage0,args);

}
{ //widget0 - exchangeToolbar
    UMEventArgs args = new UMEventArgs(Info_groupinfosActivity.this);
    actionExchangeToolbar(widget0,args);

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
image1 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_IMAGE1
,"height","44"
,"pressed-image","btn_back_touch.png"
,"layout-type","linear"
,"width","64"
,"onclick","toClose"
,"scaletype","fitcenter"
,"src","btn_back.png"
);
image1.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Info_groupinfosActivity.this);
    actionToClose(image1,args);

}
});
navigatorbar0.addView(image1);
label5 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL5
,"halign","center"
,"height","fill"
,"weight","1"
,"color","#000000"
,"layout-type","linear"
,"font-size","17"
,"width","0"
,"onclick","toClose"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label5,"content","#{res.info_title_more}"));
label5.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Info_groupinfosActivity.this);
    actionToClose(label5,args);

}
});
navigatorbar0.addView(label5);
panel22 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL22
,"halign","center"
,"height","44"
,"layout-type","linear"
,"width","64"
);
navigatorbar0.addView(panel22);

return navigatorbar0;
}
public View getListviewdefine0_groupWgt_panel1View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listviewdefine0_groupWgt_panel1 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEWDEFINE0_GROUPWGT_PANEL1
,"height","fill"
,"weight","1"
,"layout-type","linear"
,"width","0"
,"valign","center"
);
listviewdefine0_groupWgt_label0 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEWDEFINE0_GROUPWGT_LABEL0
,"content","label"
,"bindfield","initinfogrouptitle"
,"halign","left"
,"height","fill"
,"color","#727272"
,"layout-type","linear"
,"font-size","14"
,"width","fill"
,"font-family","default"
);
UMTextBinder listviewdefine0_groupWgt_label0_binder = new UMTextBinder((IUMContextAccessor)context);
listviewdefine0_groupWgt_label0_binder.setBindInfo(new BindInfo("initinfogrouptitle"));
listviewdefine0_groupWgt_label0_binder.setControl(listviewdefine0_groupWgt_label0);
binderGroup.addBinderToGroup(ID_LISTVIEWDEFINE0_GROUPWGT_LABEL0, listviewdefine0_groupWgt_label0_binder);
listviewdefine0_groupWgt_panel1.addView(listviewdefine0_groupWgt_label0);

return listviewdefine0_groupWgt_panel1;
}
public View getListviewdefine0_groupWgt_panel2View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listviewdefine0_groupWgt_panel2 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEWDEFINE0_GROUPWGT_PANEL2
,"height","fill"
,"layout-type","linear"
,"width","50.0"
,"valign","center"
);
listviewdefine0_groupWgt_label1 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEWDEFINE0_GROUPWGT_LABEL1
,"content","更多..."
,"halign","left"
,"height","fill"
,"color","#727272"
,"layout-type","linear"
,"font-size","12"
,"width","fill"
,"onclick","toColumnInfos"
,"font-family","default"
);
listviewdefine0_groupWgt_label1.setOnClickListener(new OnCursorClickListener(configure) {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Info_groupinfosActivity.this);
    int position = this.getPosition(v);
    if(position>=0) {
      context.getCursor("cursorinitinfogrouplist_infosummarylistalias").setCurrentIndex(position);
    }
    actionToColumnInfos(listviewdefine0_groupWgt_label1,args);

}
});
listviewdefine0_groupWgt_panel2.addView(listviewdefine0_groupWgt_label1);

return listviewdefine0_groupWgt_panel2;
}
public View getListviewdefine0_groupWgtView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listviewdefine0_groupWgt = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEWDEFINE0_GROUPWGT
,"padding-left","15"
,"padding-right","15"
,"height","30"
,"layout-type","vbox"
,"width","fill"
,"valign","center"
,"background-image","col_bj.png"
);
View listviewdefine0_groupWgt_panel1 = (View) getListviewdefine0_groupWgt_panel1View((UMActivity)context,binderGroup,configure);
listviewdefine0_groupWgt.addView(listviewdefine0_groupWgt_panel1);
View listviewdefine0_groupWgt_panel2 = (View) getListviewdefine0_groupWgt_panel2View((UMActivity)context,binderGroup,configure);
listviewdefine0_groupWgt.addView(listviewdefine0_groupWgt_panel2);

return listviewdefine0_groupWgt;
}
public View getListviewdefine0_childWgt0_panel16View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listviewdefine0_childWgt0_panel16 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEWDEFINE0_CHILDWGT0_PANEL16
,"height","fill"
,"layout-type","linear"
,"width","35"
,"valign","center"
);
listviewdefine0_childWgt0_image0 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_LISTVIEWDEFINE0_CHILDWGT0_IMAGE0
,"height","35"
,"layout-type","linear"
,"width","35"
,"scaletype","fitcenter"
,"src","inforead.png"
);
listviewdefine0_childWgt0_panel16.addView(listviewdefine0_childWgt0_image0);

return listviewdefine0_childWgt0_panel16;
}
public View getListviewdefine0_childWgt0_panel8View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listviewdefine0_childWgt0_panel8 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEWDEFINE0_CHILDWGT0_PANEL8
,"height","fill"
,"weight","1"
,"layout-type","linear"
,"width","0"
,"valign","center"
);
listviewdefine0_childWgt0_label2 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEWDEFINE0_CHILDWGT0_LABEL2
,"content","label"
,"bindfield","infotitle"
,"halign","left"
,"height","20"
,"color","#000000"
,"layout-type","linear"
,"font-size","16"
,"width","fill"
,"font-family","default"
);
UMTextBinder listviewdefine0_childWgt0_label2_binder = new UMTextBinder((IUMContextAccessor)context);
listviewdefine0_childWgt0_label2_binder.setBindInfo(new BindInfo("infotitle"));
listviewdefine0_childWgt0_label2_binder.setControl(listviewdefine0_childWgt0_label2);
binderGroup.addBinderToGroup(ID_LISTVIEWDEFINE0_CHILDWGT0_LABEL2, listviewdefine0_childWgt0_label2_binder);
listviewdefine0_childWgt0_panel8.addView(listviewdefine0_childWgt0_label2);

return listviewdefine0_childWgt0_panel8;
}
public View getListviewdefine0_childWgt0_panel10View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listviewdefine0_childWgt0_panel10 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEWDEFINE0_CHILDWGT0_PANEL10
,"height","fill"
,"layout-type","linear"
,"width","76"
,"valign","center"
);
listviewdefine0_childWgt0_label3 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEWDEFINE0_CHILDWGT0_LABEL3
,"bindfield","publishdate"
,"halign","center"
,"height","20"
,"color","#0852a5"
,"layout-type","linear"
,"font-size","13"
,"width","fill"
,"font-family","default"
);
UMTextBinder listviewdefine0_childWgt0_label3_binder = new UMTextBinder((IUMContextAccessor)context);
listviewdefine0_childWgt0_label3_binder.setBindInfo(new BindInfo("publishdate"));
listviewdefine0_childWgt0_label3_binder.setControl(listviewdefine0_childWgt0_label3);
binderGroup.addBinderToGroup(ID_LISTVIEWDEFINE0_CHILDWGT0_LABEL3, listviewdefine0_childWgt0_label3_binder);
listviewdefine0_childWgt0_panel10.addView(listviewdefine0_childWgt0_label3);

return listviewdefine0_childWgt0_panel10;
}
public View getListviewdefine0_childWgt0_panel5View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listviewdefine0_childWgt0_panel5 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEWDEFINE0_CHILDWGT0_PANEL5
,"padding-top","6"
,"height","34"
,"layout-type","linear"
,"width","fill"
,"valign","center"
);
View listviewdefine0_childWgt0_panel8 = (View) getListviewdefine0_childWgt0_panel8View((UMActivity)context,binderGroup,configure);
listviewdefine0_childWgt0_panel5.addView(listviewdefine0_childWgt0_panel8);
View listviewdefine0_childWgt0_panel10 = (View) getListviewdefine0_childWgt0_panel10View((UMActivity)context,binderGroup,configure);
listviewdefine0_childWgt0_panel5.addView(listviewdefine0_childWgt0_panel10);

return listviewdefine0_childWgt0_panel5;
}
public View getListviewdefine0_childWgt0_panel13View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listviewdefine0_childWgt0_panel13 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_LISTVIEWDEFINE0_CHILDWGT0_PANEL13
,"halign","left"
,"height","34"
,"layout-type","linear"
,"width","fill"
);
listviewdefine0_childWgt0_label6 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEWDEFINE0_CHILDWGT0_LABEL6
,"content","label"
,"bindfield","infosummary"
,"halign","left"
,"height","30"
,"color","#727272"
,"layout-type","linear"
,"font-size","14"
,"width","fill"
,"font-family","default"
);
UMTextBinder listviewdefine0_childWgt0_label6_binder = new UMTextBinder((IUMContextAccessor)context);
listviewdefine0_childWgt0_label6_binder.setBindInfo(new BindInfo("infosummary"));
listviewdefine0_childWgt0_label6_binder.setControl(listviewdefine0_childWgt0_label6);
binderGroup.addBinderToGroup(ID_LISTVIEWDEFINE0_CHILDWGT0_LABEL6, listviewdefine0_childWgt0_label6_binder);
listviewdefine0_childWgt0_panel13.addView(listviewdefine0_childWgt0_label6);

return listviewdefine0_childWgt0_panel13;
}
public View getListviewdefine0_childWgt0_panel3View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listviewdefine0_childWgt0_panel3 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_LISTVIEWDEFINE0_CHILDWGT0_PANEL3
,"halign","center"
,"height","70"
,"layout-type","linear"
,"width","fill"
,"margin-left","5"
,"onclick","toInformation"
);
listviewdefine0_childWgt0_panel3.setOnClickListener(new OnCursorClickListener(configure) {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Info_groupinfosActivity.this);
    int position = this.getPosition(v);
    if(position>=0) {
      context.getCursor("cursorinitinfogrouplist_infosummarylistalias").setCurrentIndex(position);
    }
    actionToInformation(listviewdefine0_childWgt0_panel3,args);

}
});
View listviewdefine0_childWgt0_panel5 = (View) getListviewdefine0_childWgt0_panel5View((UMActivity)context,binderGroup,configure);
listviewdefine0_childWgt0_panel3.addView(listviewdefine0_childWgt0_panel5);
View listviewdefine0_childWgt0_panel13 = (View) getListviewdefine0_childWgt0_panel13View((UMActivity)context,binderGroup,configure);
listviewdefine0_childWgt0_panel3.addView(listviewdefine0_childWgt0_panel13);

return listviewdefine0_childWgt0_panel3;
}
public View getListviewdefine0_childWgt0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listviewdefine0_childWgt0 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEWDEFINE0_CHILDWGT0
,"padding-left","15"
,"padding-right","15"
,"height","70"
,"layout-type","vbox"
,"width","fill"
,"valign","center"
,"background-image","list_row_mid3.png"
);
View listviewdefine0_childWgt0_panel16 = (View) getListviewdefine0_childWgt0_panel16View((UMActivity)context,binderGroup,configure);
listviewdefine0_childWgt0.addView(listviewdefine0_childWgt0_panel16);
View listviewdefine0_childWgt0_panel3 = (View) getListviewdefine0_childWgt0_panel3View((UMActivity)context,binderGroup,configure);
listviewdefine0_childWgt0.addView(listviewdefine0_childWgt0_panel3);

return listviewdefine0_childWgt0;
}
public View getListviewdefine0_childWgt1_panel17View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listviewdefine0_childWgt1_panel17 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEWDEFINE0_CHILDWGT1_PANEL17
,"height","fill"
,"layout-type","linear"
,"width","35"
,"valign","center"
);
listviewdefine0_childWgt1_image1 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_LISTVIEWDEFINE0_CHILDWGT1_IMAGE1
,"height","35"
,"layout-type","linear"
,"width","35"
,"scaletype","fitcenter"
,"src","infounread.png"
);
listviewdefine0_childWgt1_panel17.addView(listviewdefine0_childWgt1_image1);

return listviewdefine0_childWgt1_panel17;
}
public View getListviewdefine0_childWgt1_panel11View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listviewdefine0_childWgt1_panel11 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEWDEFINE0_CHILDWGT1_PANEL11
,"height","fill"
,"weight","1"
,"layout-type","linear"
,"width","0"
,"valign","center"
);
listviewdefine0_childWgt1_label4 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEWDEFINE0_CHILDWGT1_LABEL4
,"content","label"
,"bindfield","infotitle"
,"halign","left"
,"height","20"
,"color","#000000"
,"layout-type","linear"
,"font-size","16"
,"width","fill"
,"font-family","default"
);
UMTextBinder listviewdefine0_childWgt1_label4_binder = new UMTextBinder((IUMContextAccessor)context);
listviewdefine0_childWgt1_label4_binder.setBindInfo(new BindInfo("infotitle"));
listviewdefine0_childWgt1_label4_binder.setControl(listviewdefine0_childWgt1_label4);
binderGroup.addBinderToGroup(ID_LISTVIEWDEFINE0_CHILDWGT1_LABEL4, listviewdefine0_childWgt1_label4_binder);
listviewdefine0_childWgt1_panel11.addView(listviewdefine0_childWgt1_label4);

return listviewdefine0_childWgt1_panel11;
}
public View getListviewdefine0_childWgt1_panel12View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listviewdefine0_childWgt1_panel12 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEWDEFINE0_CHILDWGT1_PANEL12
,"height","fill"
,"layout-type","linear"
,"width","76"
,"valign","center"
);
listviewdefine0_childWgt1_label5 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEWDEFINE0_CHILDWGT1_LABEL5
,"bindfield","publishdate"
,"halign","center"
,"height","20"
,"color","#0852a5"
,"layout-type","linear"
,"font-size","13"
,"width","fill"
,"font-family","default"
);
UMTextBinder listviewdefine0_childWgt1_label5_binder = new UMTextBinder((IUMContextAccessor)context);
listviewdefine0_childWgt1_label5_binder.setBindInfo(new BindInfo("publishdate"));
listviewdefine0_childWgt1_label5_binder.setControl(listviewdefine0_childWgt1_label5);
binderGroup.addBinderToGroup(ID_LISTVIEWDEFINE0_CHILDWGT1_LABEL5, listviewdefine0_childWgt1_label5_binder);
listviewdefine0_childWgt1_panel12.addView(listviewdefine0_childWgt1_label5);

return listviewdefine0_childWgt1_panel12;
}
public View getListviewdefine0_childWgt1_panel6View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listviewdefine0_childWgt1_panel6 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEWDEFINE0_CHILDWGT1_PANEL6
,"padding-top","6"
,"height","34"
,"layout-type","linear"
,"width","fill"
,"valign","center"
);
View listviewdefine0_childWgt1_panel11 = (View) getListviewdefine0_childWgt1_panel11View((UMActivity)context,binderGroup,configure);
listviewdefine0_childWgt1_panel6.addView(listviewdefine0_childWgt1_panel11);
View listviewdefine0_childWgt1_panel12 = (View) getListviewdefine0_childWgt1_panel12View((UMActivity)context,binderGroup,configure);
listviewdefine0_childWgt1_panel6.addView(listviewdefine0_childWgt1_panel12);

return listviewdefine0_childWgt1_panel6;
}
public View getListviewdefine0_childWgt1_panel14View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listviewdefine0_childWgt1_panel14 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_LISTVIEWDEFINE0_CHILDWGT1_PANEL14
,"halign","left"
,"height","34"
,"layout-type","linear"
,"width","fill"
);
listviewdefine0_childWgt1_label7 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEWDEFINE0_CHILDWGT1_LABEL7
,"content","label"
,"bindfield","infosummary"
,"halign","left"
,"height","30"
,"color","#727272"
,"layout-type","linear"
,"font-size","14"
,"width","fill"
,"font-family","default"
);
UMTextBinder listviewdefine0_childWgt1_label7_binder = new UMTextBinder((IUMContextAccessor)context);
listviewdefine0_childWgt1_label7_binder.setBindInfo(new BindInfo("infosummary"));
listviewdefine0_childWgt1_label7_binder.setControl(listviewdefine0_childWgt1_label7);
binderGroup.addBinderToGroup(ID_LISTVIEWDEFINE0_CHILDWGT1_LABEL7, listviewdefine0_childWgt1_label7_binder);
listviewdefine0_childWgt1_panel14.addView(listviewdefine0_childWgt1_label7);

return listviewdefine0_childWgt1_panel14;
}
public View getListviewdefine0_childWgt1_panel4View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listviewdefine0_childWgt1_panel4 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_LISTVIEWDEFINE0_CHILDWGT1_PANEL4
,"halign","center"
,"height","70"
,"layout-type","linear"
,"width","fill"
,"margin-left","5"
,"onclick","toInformation"
);
listviewdefine0_childWgt1_panel4.setOnClickListener(new OnCursorClickListener(configure) {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Info_groupinfosActivity.this);
    int position = this.getPosition(v);
    if(position>=0) {
      context.getCursor("cursorinitinfogrouplist_infosummarylistalias").setCurrentIndex(position);
    }
    actionToInformation(listviewdefine0_childWgt1_panel4,args);

}
});
View listviewdefine0_childWgt1_panel6 = (View) getListviewdefine0_childWgt1_panel6View((UMActivity)context,binderGroup,configure);
listviewdefine0_childWgt1_panel4.addView(listviewdefine0_childWgt1_panel6);
View listviewdefine0_childWgt1_panel14 = (View) getListviewdefine0_childWgt1_panel14View((UMActivity)context,binderGroup,configure);
listviewdefine0_childWgt1_panel4.addView(listviewdefine0_childWgt1_panel14);

return listviewdefine0_childWgt1_panel4;
}
public View getListviewdefine0_childWgt1View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listviewdefine0_childWgt1 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEWDEFINE0_CHILDWGT1
,"padding-right","15"
,"padding-left","15"
,"height","70"
,"layout-type","vbox"
,"width","fill"
,"valign","center"
,"background-image","list_row_mid3.png"
);
View listviewdefine0_childWgt1_panel17 = (View) getListviewdefine0_childWgt1_panel17View((UMActivity)context,binderGroup,configure);
listviewdefine0_childWgt1.addView(listviewdefine0_childWgt1_panel17);
View listviewdefine0_childWgt1_panel4 = (View) getListviewdefine0_childWgt1_panel4View((UMActivity)context,binderGroup,configure);
listviewdefine0_childWgt1.addView(listviewdefine0_childWgt1_panel4);

return listviewdefine0_childWgt1;
}
public View getListviewdefine0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listviewdefine0 = (UMListViewBase)ThirdControl.createControl(new UMListViewBase(context),ID_LISTVIEWDEFINE0
,"onuprefersh","groupInfoDataLoad"
,"bindfield","initinfogrouplist,infosummarylist"
,"halign","center"
,"height","fill"
,"childindicator","inforeadgroupinfos"
,"cursoraction","cursorinitinfogrouplist_infosummarylistalias"
,"layout","vbox"
,"width","fill"
,"synccontext","listviewdefine0initinfogrouplist_infosummarylist"
,"groupindicator","infogrouptitle"
);
context.createCursor("cursorinitinfogrouplist_infosummarylistalias", "listviewdefine0initinfogrouplist_infosummarylist");
UMListBinder listviewdefine0_binder = new UMListBinder((IUMContextAccessor)context);
listviewdefine0_binder.setBindInfo(new BindInfo("initinfogrouplist,infosummarylist"));
listviewdefine0_binder.setControl(listviewdefine0);
binderGroup.addBinderToGroup(ID_LISTVIEWDEFINE0, listviewdefine0_binder);
listviewdefine0.setEvent("onuprefersh", new OnCursorEventListener(configure) {
  @Override
  public void onEvent(View v, UMEventArgs parent) {
    UMEventArgs args = new UMEventArgs(Info_groupinfosActivity.this);
    args.put(parent);
    actionGroupInfoDataLoad(listviewdefine0,args);

}
});
listviewdefine0.addListItemView(new UMListViewBase.ListItemView() {
	public View getItemView(Context context, View parent, IBinderGroup binderGroup,int position) {
  UMDslConfigure configure = new UMDslConfigure();
  configure.put("position",position);
View listviewdefine0_groupWgt = (View) getListviewdefine0_groupWgtView((UMActivity)context,binderGroup,configure);
return listviewdefine0_groupWgt;
}});
listviewdefine0.addListItemView(new UMListViewBase.ListItemView() {
	public View getItemView(Context context, View parent, IBinderGroup binderGroup,int position) {
  UMDslConfigure configure = new UMDslConfigure();
  configure.put("position",position);
View listviewdefine0_childWgt0 = (View) getListviewdefine0_childWgt0View((UMActivity)context,binderGroup,configure);
return listviewdefine0_childWgt0;
}});
listviewdefine0.addListItemView(new UMListViewBase.ListItemView() {
	public View getItemView(Context context, View parent, IBinderGroup binderGroup,int position) {
  UMDslConfigure configure = new UMDslConfigure();
  configure.put("position",position);
View listviewdefine0_childWgt1 = (View) getListviewdefine0_childWgt1View((UMActivity)context,binderGroup,configure);
return listviewdefine0_childWgt1;
}});

return listviewdefine0;
}
public View getPanel0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel0 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL0
,"halign","center"
,"height","0"
,"weight","1"
,"layout-type","linear"
,"width","fill"
);
View listviewdefine0 = (View) getListviewdefine0View((UMActivity)context,binderGroup,configure);
panel0.addView(listviewdefine0);

return panel0;
}
public View getWidget0_toolbar0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
widget0_toolbar0 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_WIDGET0_TOOLBAR0
,"padding-left","8"
,"padding-right","8"
,"height","fill"
,"pressed-image","toolbar.png"
,"layout-type","linear"
,"width","fill"
,"background-image-dis","toolbar.png"
,"valign","center"
,"background-image","toolbar.png"
);
widget0_imagebutton0 = (UMImageButton)ThirdControl.createControl(new UMImageButton(context),ID_WIDGET0_IMAGEBUTTON0
,"halign","center"
,"weight","1"
,"pressed-image","button_touch"
,"width","0"
,"icon-width","25"
,"istogglebutton","true"
,"background-image-dis","button"
,"font-pressed-color","#e50011"
,"icon-height","25"
,"height","fill"
,"font-pressedcolor","#e50011"
,"color","#8a8888"
,"layout-type","linear"
,"font-size","10"
,"icon-background-image","oainf_new.png"
,"icon-pressed-image","oainf_new2.png"
,"onclick","toInfos"
,"font-family","default"
,"valign","center"
,"checked","false"
,"icon-text-spacing","5"
,"background-image","button"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,widget0_imagebutton0,"value","#{res.info_title_new}"));
widget0_imagebutton0.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Info_groupinfosActivity.this);
    actionToInfos(widget0_imagebutton0,args);

}
});
widget0_toolbar0.addView(widget0_imagebutton0);
widget0_imagebutton2 = (UMImageButton)ThirdControl.createControl(new UMImageButton(context),ID_WIDGET0_IMAGEBUTTON2
,"halign","center"
,"weight","1"
,"pressed-image","button_touch"
,"width","0"
,"icon-width","25"
,"istogglebutton","true"
,"background-image-dis","button"
,"font-pressed-color","#e50011"
,"icon-height","25"
,"height","fill"
,"font-pressedcolor","#e50011"
,"color","#8a8888"
,"layout-type","linear"
,"font-size","10"
,"icon-background-image","oainf_more.png"
,"icon-pressed-image","oainf_more2.png"
,"onclick","toGroupInfos"
,"font-family","default"
,"valign","center"
,"checked","false"
,"icon-text-spacing","5"
,"background-image","button"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,widget0_imagebutton2,"value","#{res.info_title_more}"));
widget0_imagebutton2.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Info_groupinfosActivity.this);
    actionToGroupInfos(widget0_imagebutton2,args);

}
});
widget0_toolbar0.addView(widget0_imagebutton2);
widget0_imagebutton1 = (UMImageButton)ThirdControl.createControl(new UMImageButton(context),ID_WIDGET0_IMAGEBUTTON1
,"halign","center"
,"weight","1"
,"pressed-image","button_touch"
,"width","0"
,"icon-width","25"
,"istogglebutton","true"
,"background-image-dis","button"
,"font-pressed-color","#e50011"
,"icon-height","25"
,"height","fill"
,"font-pressedcolor","#e50011"
,"color","#8a8888"
,"layout-type","linear"
,"font-size","10"
,"icon-background-image","oainf_search.png"
,"icon-pressed-image","oainf_search2.png"
,"onclick","toSearchInfos"
,"font-family","default"
,"valign","center"
,"checked","false"
,"icon-text-spacing","5"
,"background-image","button"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,widget0_imagebutton1,"value","#{res.info_title_search}"));
widget0_imagebutton1.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Info_groupinfosActivity.this);
    actionToSearchInfos(widget0_imagebutton1,args);

}
});
widget0_toolbar0.addView(widget0_imagebutton1);

return widget0_toolbar0;
}
public View getWidget0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
widget0 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_WIDGET0
,"halign","center"
,"height","fill"
,"onload","exchangeToolbar"
,"layout-type","linear"
,"width","fill"
);
View widget0_toolbar0 = (View) getWidget0_toolbar0View((UMActivity)context,binderGroup,configure);
widget0.addView(widget0_toolbar0);

return widget0;
}
public View getPanel1View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel1 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL1
,"halign","center"
,"height","49"
,"layout-type","linear"
,"background","#f7f7f7"
,"width","fill"
);
View widget0 = (View) getWidget0View((UMActivity)context,binderGroup,configure);
panel1.addView(widget0);

return panel1;
}
public View getViewPage0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
viewPage0 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_VIEWPAGE0
,"halign","center"
,"height","fill"
,"onload","exchangeToolbar"
,"layout-type","vbox"
,"background","#efeff4"
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
groupinfos = (UMWindow)ThirdControl.createControl(new UMWindow(context),ID_GROUPINFOS
,"halign","center"
,"height","fill"
,"visible","true"
,"background","#efeff4"
,"layout","vbox"
,"width","320.0"
,"context","oainfototal"
,"controller","groupinfosController"
,"namespace","nc.bs.oa.oama.ecm"
);
View viewPage0 = (View) getViewPage0View((UMActivity)context,binderGroup,configure);
groupinfos.addView(viewPage0);

return (UMWindow)groupinfos;
}

	
	public void actionLoadError(View control, UMEventArgs args) {
    String actionid = "loadError";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "loadError",UMActivity.getViewId(control),args);
}
public void actionGroupInfoDataLoad(View control, UMEventArgs args) {
    String actionid = "groupInfoDataLoad";
    args.put("error","loadError");
    args.put("viewid","nc.bs.oa.oainf.ma.infopublish.OainfototalExtendController");
    args.put("action","groupInfoDataLoad");
    args.put("autoDataBinding","true");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMService.callAction(args);
}
public void actionToSearchInfos(View control, UMEventArgs args) {
    String actionid = "toSearchInfos";
    args.put("viewid","nc.bs.oa.oama.ecm.Info_searchinfos");
    args.put("iskeep","false");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.open(args);
}
public void actionToInfos(View control, UMEventArgs args) {
    String actionid = "toInfos";
    args.put("viewid","nc.bs.oa.oama.ecm.Info_infos");
    args.put("iskeep","false");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.open(args);
}
public void actionToClose(View control, UMEventArgs args) {
    String actionid = "toClose";
    args.put("resultcode","0");
    args.put("iskeep","false");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.close(args);
}
public void actionExchangeToolbar(View control, UMEventArgs args) {
    String actionid = "exchangeToolbar";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "exchangeToolbar",UMActivity.getViewId(control),args);
}
public void actionToInformation(View control, UMEventArgs args) {
    String actionid = "toInformation";
  this.dataCollect();
    args.put("containerName","");
    args.put("row","#{#{cursor.cursorinitinfogrouplist_infosummarylistalias}}");
    args.put("row_arrayPath","initinfogrouplist.infosummarylist");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "toInformation",UMActivity.getViewId(control),args);
}
public void actionToGroupInfos(View control, UMEventArgs args) {
    String actionid = "toGroupInfos";
    args.put("viewid","nc.bs.oa.oama.ecm.Info_groupinfos");
    args.put("iskeep","false");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.open(args);
}
public void actionToColumnInfos(View control, UMEventArgs args) {
    String actionid = "toColumnInfos";
    args.put("viewid","nc.bs.oa.oama.ecm.Info_columninfos");
  this.dataCollect();
    args.put("iskeep","true");
    args.put("containerName","");
    args.put("row","#{#{cursor.cursorinitinfogrouplist_infosummarylistalias}}");
    args.put("row_arrayPath","initinfogrouplist");
  ActionProcessor.exec(this, actionid, args);
UMView.open(args);
}


}
