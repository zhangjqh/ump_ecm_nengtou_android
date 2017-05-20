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

public abstract class Info_columninfosActivity extends UMWindowActivity {

	protected UMWindow columninfos = null;
protected XVerticalLayout viewPage0 = null;
protected XHorizontalLayout navigatorbar0 = null;
protected UMButton button0 = null;
protected UMLabel label0 = null;
protected UMLabel label1 = null;
protected XVerticalLayout panel0 = null;
protected UMListViewBase listview0 = null;
protected XHorizontalLayout listview0_childWgt0 = null;
protected XHorizontalLayout listview0_childWgt0_panel7 = null;
protected UMImage listview0_childWgt0_image0 = null;
protected XVerticalLayout listview0_childWgt0_panel6 = null;
protected XHorizontalLayout listview0_childWgt0_panel1 = null;
protected XVerticalLayout listview0_childWgt0_panel4 = null;
protected UMLabel listview0_childWgt0_label1 = null;
protected XVerticalLayout listview0_childWgt0_panel5 = null;
protected UMLabel listview0_childWgt0_label2 = null;
protected XHorizontalLayout listview0_childWgt0_panel2 = null;
protected UMLabel listview0_childWgt0_label0 = null;
protected XHorizontalLayout listview0_childWgt1 = null;
protected XHorizontalLayout listview0_childWgt1_panel6 = null;
protected UMImage listview0_childWgt1_image0 = null;
protected XVerticalLayout listview0_childWgt1_panel0 = null;
protected XHorizontalLayout listview0_childWgt1_panel2 = null;
protected XVerticalLayout listview0_childWgt1_panel4 = null;
protected UMLabel listview0_childWgt1_label0 = null;
protected XVerticalLayout listview0_childWgt1_panel5 = null;
protected UMLabel listview0_childWgt1_label1 = null;
protected XHorizontalLayout listview0_childWgt1_panel3 = null;
protected XVerticalLayout listview0_childWgt1_panel8 = null;
protected UMLabel listview0_childWgt1_label2 = null;

	
	protected final static int ID_COLUMNINFOS = 593785740;
protected final static int ID_VIEWPAGE0 = 164892178;
protected final static int ID_NAVIGATORBAR0 = 1907095028;
protected final static int ID_BUTTON0 = 346984557;
protected final static int ID_LABEL0 = 497171979;
protected final static int ID_LABEL1 = 1206428652;
protected final static int ID_PANEL0 = 358481991;
protected final static int ID_LISTVIEW0 = 1101903823;
protected final static int ID_LISTVIEW0_CHILDWGT0 = 1766152514;
protected final static int ID_LISTVIEW0_CHILDWGT0_PANEL7 = 1428831944;
protected final static int ID_LISTVIEW0_CHILDWGT0_IMAGE0 = 2119352912;
protected final static int ID_LISTVIEW0_CHILDWGT0_PANEL6 = 1483754201;
protected final static int ID_LISTVIEW0_CHILDWGT0_PANEL1 = 1749257485;
protected final static int ID_LISTVIEW0_CHILDWGT0_PANEL4 = 941338962;
protected final static int ID_LISTVIEW0_CHILDWGT0_LABEL1 = 736093596;
protected final static int ID_LISTVIEW0_CHILDWGT0_PANEL5 = 892286559;
protected final static int ID_LISTVIEW0_CHILDWGT0_LABEL2 = 58792166;
protected final static int ID_LISTVIEW0_CHILDWGT0_PANEL2 = 1802601745;
protected final static int ID_LISTVIEW0_CHILDWGT0_LABEL0 = 1710850802;
protected final static int ID_LISTVIEW0_CHILDWGT1 = 712844646;
protected final static int ID_LISTVIEW0_CHILDWGT1_PANEL6 = 1725820543;
protected final static int ID_LISTVIEW0_CHILDWGT1_IMAGE0 = 253671628;
protected final static int ID_LISTVIEW0_CHILDWGT1_PANEL0 = 1412319817;
protected final static int ID_LISTVIEW0_CHILDWGT1_PANEL2 = 467970663;
protected final static int ID_LISTVIEW0_CHILDWGT1_PANEL4 = 403723029;
protected final static int ID_LISTVIEW0_CHILDWGT1_LABEL0 = 268853574;
protected final static int ID_LISTVIEW0_CHILDWGT1_PANEL5 = 1972644285;
protected final static int ID_LISTVIEW0_CHILDWGT1_LABEL1 = 1709577857;
protected final static int ID_LISTVIEW0_CHILDWGT1_PANEL3 = 1796463968;
protected final static int ID_LISTVIEW0_CHILDWGT1_PANEL8 = 205017664;
protected final static int ID_LISTVIEW0_CHILDWGT1_LABEL2 = 689962124;

	
	
	@Override
	public String getControllerName() {
		return "columninfosController";
	}
	
	@Override
	public String getContextName() {
		return "oainflist";
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
		  idmap.put("columninfos",ID_COLUMNINFOS);
  idmap.put("viewPage0",ID_VIEWPAGE0);
  idmap.put("navigatorbar0",ID_NAVIGATORBAR0);
  idmap.put("button0",ID_BUTTON0);
  idmap.put("label0",ID_LABEL0);
  idmap.put("label1",ID_LABEL1);
  idmap.put("panel0",ID_PANEL0);
  idmap.put("listview0",ID_LISTVIEW0);
  idmap.put("listview0_childWgt0",ID_LISTVIEW0_CHILDWGT0);
  idmap.put("listview0_childWgt0_panel7",ID_LISTVIEW0_CHILDWGT0_PANEL7);
  idmap.put("listview0_childWgt0_image0",ID_LISTVIEW0_CHILDWGT0_IMAGE0);
  idmap.put("listview0_childWgt0_panel6",ID_LISTVIEW0_CHILDWGT0_PANEL6);
  idmap.put("listview0_childWgt0_panel1",ID_LISTVIEW0_CHILDWGT0_PANEL1);
  idmap.put("listview0_childWgt0_panel4",ID_LISTVIEW0_CHILDWGT0_PANEL4);
  idmap.put("listview0_childWgt0_label1",ID_LISTVIEW0_CHILDWGT0_LABEL1);
  idmap.put("listview0_childWgt0_panel5",ID_LISTVIEW0_CHILDWGT0_PANEL5);
  idmap.put("listview0_childWgt0_label2",ID_LISTVIEW0_CHILDWGT0_LABEL2);
  idmap.put("listview0_childWgt0_panel2",ID_LISTVIEW0_CHILDWGT0_PANEL2);
  idmap.put("listview0_childWgt0_label0",ID_LISTVIEW0_CHILDWGT0_LABEL0);
  idmap.put("listview0_childWgt1",ID_LISTVIEW0_CHILDWGT1);
  idmap.put("listview0_childWgt1_panel6",ID_LISTVIEW0_CHILDWGT1_PANEL6);
  idmap.put("listview0_childWgt1_image0",ID_LISTVIEW0_CHILDWGT1_IMAGE0);
  idmap.put("listview0_childWgt1_panel0",ID_LISTVIEW0_CHILDWGT1_PANEL0);
  idmap.put("listview0_childWgt1_panel2",ID_LISTVIEW0_CHILDWGT1_PANEL2);
  idmap.put("listview0_childWgt1_panel4",ID_LISTVIEW0_CHILDWGT1_PANEL4);
  idmap.put("listview0_childWgt1_label0",ID_LISTVIEW0_CHILDWGT1_LABEL0);
  idmap.put("listview0_childWgt1_panel5",ID_LISTVIEW0_CHILDWGT1_PANEL5);
  idmap.put("listview0_childWgt1_label1",ID_LISTVIEW0_CHILDWGT1_LABEL1);
  idmap.put("listview0_childWgt1_panel3",ID_LISTVIEW0_CHILDWGT1_PANEL3);
  idmap.put("listview0_childWgt1_panel8",ID_LISTVIEW0_CHILDWGT1_PANEL8);
  idmap.put("listview0_childWgt1_label2",ID_LISTVIEW0_CHILDWGT1_LABEL2);

	}
	
	public void onLoad() {
		ULog.logLC("onLoad", this);
		if(currentPage!=null) {
			currentPage.onLoad();
		}
	
		{ //panel0 - columnInfoFirstPage
    UMEventArgs args = new UMEventArgs(Info_columninfosActivity.this);
    actionColumnInfoFirstPage(panel0,args);

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
,"font-size","18"
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
,"onclick","toGroupInfos"
,"font-family","default"
,"valign","center"
,"background-image","btn_back"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,button0,"value","#{res.info_btn_back}"));
button0.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Info_columninfosActivity.this);
    actionToGroupInfos(button0,args);

}
});
navigatorbar0.addView(button0);
label0 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL0
,"bindfield","columnname"
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
UMTextBinder label0_binder = new UMTextBinder((IUMContextAccessor)context);
label0_binder.setBindInfo(new BindInfo("columnname"));
label0_binder.setControl(label0);
binderGroup.addBinderToGroup(ID_LABEL0, label0_binder);
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
public View getListview0_childWgt0_panel7View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt0_panel7 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT0_PANEL7
,"height","fill"
,"layout-type","linear"
,"width","35"
,"valign","center"
);
listview0_childWgt0_image0 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_LISTVIEW0_CHILDWGT0_IMAGE0
,"height","35"
,"layout-type","linear"
,"width","35"
,"scaletype","fitcenter"
,"src","inforead.png"
);
listview0_childWgt0_panel7.addView(listview0_childWgt0_image0);

return listview0_childWgt0_panel7;
}
public View getListview0_childWgt0_panel4View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt0_panel4 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_LISTVIEW0_CHILDWGT0_PANEL4
,"halign","center"
,"height","fill"
,"weight","1"
,"layout-type","linear"
,"width","0"
);
listview0_childWgt0_label1 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT0_LABEL1
,"bindfield","infotitle"
,"halign","left"
,"height","20"
,"color","#000000"
,"layout-type","linear"
,"font-size","16"
,"width","fill"
,"font-family","default"
,"valign","center"
);
UMTextBinder listview0_childWgt0_label1_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt0_label1_binder.setBindInfo(new BindInfo("infotitle"));
listview0_childWgt0_label1_binder.setControl(listview0_childWgt0_label1);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT0_LABEL1, listview0_childWgt0_label1_binder);
listview0_childWgt0_panel4.addView(listview0_childWgt0_label1);

return listview0_childWgt0_panel4;
}
public View getListview0_childWgt0_panel5View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt0_panel5 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_LISTVIEW0_CHILDWGT0_PANEL5
,"halign","center"
,"height","fill"
,"layout-type","linear"
,"width","76.0"
);
listview0_childWgt0_label2 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT0_LABEL2
,"bindfield","publishdate"
,"halign","right"
,"height","20"
,"color","#0852a5"
,"layout-type","linear"
,"font-size","13"
,"width","fill"
,"font-family","default"
,"valign","center"
);
UMTextBinder listview0_childWgt0_label2_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt0_label2_binder.setBindInfo(new BindInfo("publishdate"));
listview0_childWgt0_label2_binder.setControl(listview0_childWgt0_label2);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT0_LABEL2, listview0_childWgt0_label2_binder);
listview0_childWgt0_panel5.addView(listview0_childWgt0_label2);

return listview0_childWgt0_panel5;
}
public View getListview0_childWgt0_panel1View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt0_panel1 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT0_PANEL1
,"padding-top","6"
,"height","34.0"
,"layout-type","linear"
,"width","fill"
,"valign","center"
);
View listview0_childWgt0_panel4 = (View) getListview0_childWgt0_panel4View((UMActivity)context,binderGroup,configure);
listview0_childWgt0_panel1.addView(listview0_childWgt0_panel4);
View listview0_childWgt0_panel5 = (View) getListview0_childWgt0_panel5View((UMActivity)context,binderGroup,configure);
listview0_childWgt0_panel1.addView(listview0_childWgt0_panel5);

return listview0_childWgt0_panel1;
}
public View getListview0_childWgt0_panel2View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt0_panel2 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT0_PANEL2
,"height","34"
,"layout-type","linear"
,"width","fill"
,"valign","center"
);
listview0_childWgt0_label0 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT0_LABEL0
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
UMTextBinder listview0_childWgt0_label0_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt0_label0_binder.setBindInfo(new BindInfo("infosummary"));
listview0_childWgt0_label0_binder.setControl(listview0_childWgt0_label0);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT0_LABEL0, listview0_childWgt0_label0_binder);
listview0_childWgt0_panel2.addView(listview0_childWgt0_label0);

return listview0_childWgt0_panel2;
}
public View getListview0_childWgt0_panel6View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt0_panel6 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_LISTVIEW0_CHILDWGT0_PANEL6
,"halign","center"
,"height","fill"
,"weight","1"
,"layout-type","linear"
,"width","0"
,"margin-left","5"
);
View listview0_childWgt0_panel1 = (View) getListview0_childWgt0_panel1View((UMActivity)context,binderGroup,configure);
listview0_childWgt0_panel6.addView(listview0_childWgt0_panel1);
View listview0_childWgt0_panel2 = (View) getListview0_childWgt0_panel2View((UMActivity)context,binderGroup,configure);
listview0_childWgt0_panel6.addView(listview0_childWgt0_panel2);

return listview0_childWgt0_panel6;
}
public View getListview0_childWgt0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt0 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT0
,"padding-left","15"
,"padding-right","15"
,"height","70"
,"layout-type","linear"
,"width","fill"
,"onclick","toInformation"
,"valign","center"
,"background-image","list_row_mid3.png"
);
listview0_childWgt0.setOnClickListener(new OnCursorClickListener(configure) {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Info_columninfosActivity.this);
    int position = this.getPosition(v);
    if(position>=0) {
      context.getCursor("cursoroainfsalias").setCurrentIndex(position);
    }
    actionToInformation(listview0_childWgt0,args);

}
});
View listview0_childWgt0_panel7 = (View) getListview0_childWgt0_panel7View((UMActivity)context,binderGroup,configure);
listview0_childWgt0.addView(listview0_childWgt0_panel7);
View listview0_childWgt0_panel6 = (View) getListview0_childWgt0_panel6View((UMActivity)context,binderGroup,configure);
listview0_childWgt0.addView(listview0_childWgt0_panel6);

return listview0_childWgt0;
}
public View getListview0_childWgt1_panel6View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt1_panel6 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT1_PANEL6
,"height","fill"
,"layout-type","linear"
,"width","35"
,"valign","center"
);
listview0_childWgt1_image0 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_LISTVIEW0_CHILDWGT1_IMAGE0
,"height","35"
,"layout-type","linear"
,"width","35"
,"scaletype","fitcenter"
,"src","infounread.png"
);
listview0_childWgt1_panel6.addView(listview0_childWgt1_image0);

return listview0_childWgt1_panel6;
}
public View getListview0_childWgt1_panel4View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt1_panel4 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_LISTVIEW0_CHILDWGT1_PANEL4
,"halign","center"
,"height","fill"
,"weight","1"
,"layout-type","linear"
,"width","0"
);
listview0_childWgt1_label0 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT1_LABEL0
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
UMTextBinder listview0_childWgt1_label0_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt1_label0_binder.setBindInfo(new BindInfo("infotitle"));
listview0_childWgt1_label0_binder.setControl(listview0_childWgt1_label0);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT1_LABEL0, listview0_childWgt1_label0_binder);
listview0_childWgt1_panel4.addView(listview0_childWgt1_label0);

return listview0_childWgt1_panel4;
}
public View getListview0_childWgt1_panel5View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt1_panel5 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_LISTVIEW0_CHILDWGT1_PANEL5
,"halign","center"
,"height","fill"
,"layout-type","linear"
,"width","76"
);
listview0_childWgt1_label1 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT1_LABEL1
,"content","label"
,"bindfield","publishdate"
,"halign","right"
,"height","20"
,"color","#0852a5"
,"layout-type","linear"
,"font-size","13"
,"width","fill"
,"font-family","default"
);
UMTextBinder listview0_childWgt1_label1_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt1_label1_binder.setBindInfo(new BindInfo("publishdate"));
listview0_childWgt1_label1_binder.setControl(listview0_childWgt1_label1);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT1_LABEL1, listview0_childWgt1_label1_binder);
listview0_childWgt1_panel5.addView(listview0_childWgt1_label1);

return listview0_childWgt1_panel5;
}
public View getListview0_childWgt1_panel2View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt1_panel2 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT1_PANEL2
,"padding-top","6"
,"height","34"
,"layout-type","linear"
,"width","fill"
,"valign","center"
);
View listview0_childWgt1_panel4 = (View) getListview0_childWgt1_panel4View((UMActivity)context,binderGroup,configure);
listview0_childWgt1_panel2.addView(listview0_childWgt1_panel4);
View listview0_childWgt1_panel5 = (View) getListview0_childWgt1_panel5View((UMActivity)context,binderGroup,configure);
listview0_childWgt1_panel2.addView(listview0_childWgt1_panel5);

return listview0_childWgt1_panel2;
}
public View getListview0_childWgt1_panel8View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt1_panel8 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_LISTVIEW0_CHILDWGT1_PANEL8
,"halign","left"
,"height","fill"
,"weight","1"
,"layout-type","linear"
,"width","0"
);
listview0_childWgt1_label2 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT1_LABEL2
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
UMTextBinder listview0_childWgt1_label2_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt1_label2_binder.setBindInfo(new BindInfo("infosummary"));
listview0_childWgt1_label2_binder.setControl(listview0_childWgt1_label2);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT1_LABEL2, listview0_childWgt1_label2_binder);
listview0_childWgt1_panel8.addView(listview0_childWgt1_label2);

return listview0_childWgt1_panel8;
}
public View getListview0_childWgt1_panel3View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt1_panel3 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT1_PANEL3
,"height","34"
,"layout-type","linear"
,"width","fill"
,"valign","center"
);
View listview0_childWgt1_panel8 = (View) getListview0_childWgt1_panel8View((UMActivity)context,binderGroup,configure);
listview0_childWgt1_panel3.addView(listview0_childWgt1_panel8);

return listview0_childWgt1_panel3;
}
public View getListview0_childWgt1_panel0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt1_panel0 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_LISTVIEW0_CHILDWGT1_PANEL0
,"halign","center"
,"height","fill"
,"layout-type","linear"
,"width","fill"
,"margin-left","5"
);
View listview0_childWgt1_panel2 = (View) getListview0_childWgt1_panel2View((UMActivity)context,binderGroup,configure);
listview0_childWgt1_panel0.addView(listview0_childWgt1_panel2);
View listview0_childWgt1_panel3 = (View) getListview0_childWgt1_panel3View((UMActivity)context,binderGroup,configure);
listview0_childWgt1_panel0.addView(listview0_childWgt1_panel3);

return listview0_childWgt1_panel0;
}
public View getListview0_childWgt1View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt1 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT1
,"padding-left","15"
,"padding-right","15"
,"height","70"
,"layout-type","linear"
,"width","fill"
,"onclick","toInformation"
,"valign","center"
,"background-image","list_row_mid3.png"
);
listview0_childWgt1.setOnClickListener(new OnCursorClickListener(configure) {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Info_columninfosActivity.this);
    int position = this.getPosition(v);
    if(position>=0) {
      context.getCursor("cursoroainfsalias").setCurrentIndex(position);
    }
    actionToInformation(listview0_childWgt1,args);

}
});
View listview0_childWgt1_panel6 = (View) getListview0_childWgt1_panel6View((UMActivity)context,binderGroup,configure);
listview0_childWgt1.addView(listview0_childWgt1_panel6);
View listview0_childWgt1_panel0 = (View) getListview0_childWgt1_panel0View((UMActivity)context,binderGroup,configure);
listview0_childWgt1.addView(listview0_childWgt1_panel0);

return listview0_childWgt1;
}
public View getListview0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0 = (UMListViewBase)ThirdControl.createControl(new UMListViewBase(context),ID_LISTVIEW0
,"onuprefersh","columnInfoFirstPage"
,"bindfield","oainfs"
,"height","fill"
,"childindicator","infolisttemplate"
,"ondownrefersh","columnInfoNextPage"
,"cursoraction","cursoroainfsalias"
,"layout-type","linear"
,"width","fill"
,"background","#ffffff"
,"synccontext","oainfs"
);
context.createCursor("cursoroainfsalias", "oainfs");
UMListBinder listview0_binder = new UMListBinder((IUMContextAccessor)context);
listview0_binder.setBindInfo(new BindInfo("oainfs"));
listview0_binder.setControl(listview0);
binderGroup.addBinderToGroup(ID_LISTVIEW0, listview0_binder);
listview0.setEvent("onuprefersh", new OnCursorEventListener(configure) {
  @Override
  public void onEvent(View v, UMEventArgs parent) {
    UMEventArgs args = new UMEventArgs(Info_columninfosActivity.this);
    args.put(parent);
    actionColumnInfoFirstPage(listview0,args);

}
});
listview0.setEvent("ondownrefersh", new OnCursorEventListener(configure) {
  @Override
  public void onEvent(View v, UMEventArgs parent) {
    UMEventArgs args = new UMEventArgs(Info_columninfosActivity.this);
    args.put(parent);
    actionColumnInfoNextPage(listview0,args);

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

return listview0;
}
public View getPanel0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel0 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL0
,"halign","center"
,"height","0"
,"weight","1"
,"onload","columnInfoFirstPage"
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
columninfos = (UMWindow)ThirdControl.createControl(new UMWindow(context),ID_COLUMNINFOS
,"halign","center"
,"height","460.0"
,"background","#efeff4"
,"layout","vbox"
,"width","320.0"
,"context","oainflist"
,"controller","columninfosController"
,"namespace","nc.bs.oa.oama.ecm"
);
View viewPage0 = (View) getViewPage0View((UMActivity)context,binderGroup,configure);
columninfos.addView(viewPage0);

return (UMWindow)columninfos;
}

	
	public void actionColumnInfoNextPage(View control, UMEventArgs args) {
    String actionid = "columnInfoNextPage";
    args.put("viewid","nc.bs.oa.oainf.ma.infopublish.OainflistExtendController");
  this.dataCollect();
    args.put("action","columnInfoNextPage");
    args.put("containerName","");
    args.put("row","#{plug.row}");
  ActionProcessor.exec(this, actionid, args);
UMList.getNextPage(args);
}
public void actionUMonInit(View control, UMEventArgs args) {
    String actionid = "UMonInit";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "UMonInit",UMActivity.getViewId(control),args);
}
public void actionToInformation(View control, UMEventArgs args) {
    String actionid = "toInformation";
  this.dataCollect();
    args.put("inforrow_arrayPath","oainfs");
    args.put("inforrow","#{#{cursor.cursoroainfsalias}}");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "toInformation",UMActivity.getViewId(control),args);
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
public void actionToGroupInfos(View control, UMEventArgs args) {
    String actionid = "toGroupInfos";
    args.put("resultcode","0");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.close(args);
}
public void actionColumnInfoFirstPage(View control, UMEventArgs args) {
    String actionid = "columnInfoFirstPage";
    args.put("count","25");
    args.put("viewid","nc.bs.oa.oainf.ma.infopublish.OainflistExtendController");
    args.put("startline","1");
  this.dataCollect();
    args.put("action","columnInfoFirstPage");
    args.put("containerName","");
    args.put("row","#{plug.row}");
  ActionProcessor.exec(this, actionid, args);
UMList.getFirstPage(args);
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


}
