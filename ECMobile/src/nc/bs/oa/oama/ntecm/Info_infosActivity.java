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

public abstract class Info_infosActivity extends UMWindowActivity {

	protected UMWindow infos = null;
protected XVerticalLayout viewPage0 = null;
protected XHorizontalLayout navigatorbar0 = null;
protected UMImage image0 = null;
protected UMLabel label0 = null;
protected XVerticalLayout panel2 = null;
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
protected XVerticalLayout panel1 = null;
protected XVerticalLayout widget0 = null;
protected XHorizontalLayout widget0_toolbar0 = null;
protected UMImageButton widget0_imagebutton0 = null;
protected UMImageButton widget0_imagebutton2 = null;
protected UMImageButton widget0_imagebutton1 = null;

	
	protected final static int ID_INFOS = 1702615574;
protected final static int ID_VIEWPAGE0 = 1406841471;
protected final static int ID_NAVIGATORBAR0 = 1752049978;
protected final static int ID_IMAGE0 = 1507616070;
protected final static int ID_LABEL0 = 2109049935;
protected final static int ID_PANEL2 = 1787428564;
protected final static int ID_PANEL0 = 211082080;
protected final static int ID_LISTVIEW0 = 2142430564;
protected final static int ID_LISTVIEW0_CHILDWGT0 = 1402800636;
protected final static int ID_LISTVIEW0_CHILDWGT0_PANEL7 = 677402177;
protected final static int ID_LISTVIEW0_CHILDWGT0_IMAGE0 = 2076549113;
protected final static int ID_LISTVIEW0_CHILDWGT0_PANEL6 = 289643341;
protected final static int ID_LISTVIEW0_CHILDWGT0_PANEL1 = 677447629;
protected final static int ID_LISTVIEW0_CHILDWGT0_PANEL4 = 1476573920;
protected final static int ID_LISTVIEW0_CHILDWGT0_LABEL1 = 1252697804;
protected final static int ID_LISTVIEW0_CHILDWGT0_PANEL5 = 373320298;
protected final static int ID_LISTVIEW0_CHILDWGT0_LABEL2 = 466060348;
protected final static int ID_LISTVIEW0_CHILDWGT0_PANEL2 = 1926662007;
protected final static int ID_LISTVIEW0_CHILDWGT0_LABEL0 = 824453014;
protected final static int ID_LISTVIEW0_CHILDWGT1 = 2021532162;
protected final static int ID_LISTVIEW0_CHILDWGT1_PANEL6 = 382487899;
protected final static int ID_LISTVIEW0_CHILDWGT1_IMAGE0 = 1800824175;
protected final static int ID_LISTVIEW0_CHILDWGT1_PANEL0 = 176798497;
protected final static int ID_LISTVIEW0_CHILDWGT1_PANEL2 = 252317717;
protected final static int ID_LISTVIEW0_CHILDWGT1_PANEL4 = 620077023;
protected final static int ID_LISTVIEW0_CHILDWGT1_LABEL0 = 2120771358;
protected final static int ID_LISTVIEW0_CHILDWGT1_PANEL5 = 350987562;
protected final static int ID_LISTVIEW0_CHILDWGT1_LABEL1 = 38186624;
protected final static int ID_LISTVIEW0_CHILDWGT1_PANEL3 = 124159903;
protected final static int ID_LISTVIEW0_CHILDWGT1_PANEL8 = 1693410849;
protected final static int ID_LISTVIEW0_CHILDWGT1_LABEL2 = 1930930976;
protected final static int ID_PANEL1 = 567049099;
protected final static int ID_WIDGET0 = 196456954;
protected final static int ID_WIDGET0_TOOLBAR0 = 2021210749;
protected final static int ID_WIDGET0_IMAGEBUTTON0 = 1605516018;
protected final static int ID_WIDGET0_IMAGEBUTTON2 = 183522418;
protected final static int ID_WIDGET0_IMAGEBUTTON1 = 370952763;

	
	
	@Override
	public String getControllerName() {
		return "infosController";
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
		  idmap.put("infos",ID_INFOS);
  idmap.put("viewPage0",ID_VIEWPAGE0);
  idmap.put("navigatorbar0",ID_NAVIGATORBAR0);
  idmap.put("image0",ID_IMAGE0);
  idmap.put("label0",ID_LABEL0);
  idmap.put("panel2",ID_PANEL2);
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
    UMEventArgs args = new UMEventArgs(Info_infosActivity.this);
    actionExchangeToolbar(viewPage0,args);

}
{ //widget0 - exchangeToolbar
    UMEventArgs args = new UMEventArgs(Info_infosActivity.this);
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
,"font-size","18"
,"font-family","default"
,"valign","center"
,"background-image","nav.png"
);
image0 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_IMAGE0
,"height","44"
,"layout-type","linear"
,"width","64"
,"onclick","toClose"
,"scaletype","fitcenter"
,"src","btn_back.png"
);
image0.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Info_infosActivity.this);
    actionToClose(image0,args);

}
});
navigatorbar0.addView(image0);
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
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label0,"content","#{res.info_title_new}"));
navigatorbar0.addView(label0);
panel2 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL2
,"halign","center"
,"height","44"
,"layout-type","linear"
,"width","64"
);
navigatorbar0.addView(panel2);

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
    UMEventArgs args = new UMEventArgs(Info_infosActivity.this);
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
    UMEventArgs args = new UMEventArgs(Info_infosActivity.this);
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
,"onuprefersh","nextImgLoad"
,"bindfield","oainfs"
,"height","fill"
,"childindicator","infolisttemplate"
,"ondownrefersh","infoNextPage"
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
    UMEventArgs args = new UMEventArgs(Info_infosActivity.this);
    args.put(parent);
    actionNextImgLoad(listview0,args);

}
});
listview0.setEvent("ondownrefersh", new OnCursorEventListener(configure) {
  @Override
  public void onEvent(View v, UMEventArgs parent) {
    UMEventArgs args = new UMEventArgs(Info_infosActivity.this);
    args.put(parent);
    actionInfoNextPage(listview0,args);

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
,"layout-type","linear"
,"width","fill"
);
View listview0 = (View) getListview0View((UMActivity)context,binderGroup,configure);
panel0.addView(listview0);

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
    UMEventArgs args = new UMEventArgs(Info_infosActivity.this);
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
    UMEventArgs args = new UMEventArgs(Info_infosActivity.this);
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
    UMEventArgs args = new UMEventArgs(Info_infosActivity.this);
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
infos = (UMWindow)ThirdControl.createControl(new UMWindow(context),ID_INFOS
,"halign","center"
,"height","fill"
,"layout","vbox"
,"background","#efeff4"
,"width","320.0"
,"context","oainflist"
,"controller","infosController"
,"namespace","nc.bs.oa.oama.ecm"
);
View viewPage0 = (View) getViewPage0View((UMActivity)context,binderGroup,configure);
infos.addView(viewPage0);

return (UMWindow)infos;
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
public void actionInfoNextPage(View control, UMEventArgs args) {
    String actionid = "infoNextPage";
    args.put("viewid","nc.bs.oa.oainf.ma.infopublish.OainflistExtendController");
    args.put("action","InfoLoadNextPage");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMList.getNextPage(args);
}
public void actionLoginAction(View control, UMEventArgs args) {
    String actionid = "loginAction";
    args.put("failedexit","true");
    args.put("type","ua");
    args.put("contextmapping","none");
    args.put("success","nextImgLoad");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMService.login(args);
}
public void actionToClose(View control, UMEventArgs args) {
    String actionid = "toClose";
    args.put("resultcode","0");
    args.put("iskeep","false");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.close(args);
}
public void actionNextImgLoad(View control, UMEventArgs args) {
    String actionid = "nextImgLoad";
    args.put("count","25");
    args.put("viewid","nc.bs.oa.oainf.ma.infopublish.OainflistExtendController");
    args.put("startline","1");
  this.dataCollect();
    args.put("action","InfoLoadFirstPage");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMList.getFirstPage(args);
}
public void actionExchangeToolbar(View control, UMEventArgs args) {
    String actionid = "exchangeToolbar";
  this.dataCollect();
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "exchangeToolbar",UMActivity.getViewId(control),args);
}
public void actionToInformation(View control, UMEventArgs args) {
    String actionid = "toInformation";
  this.dataCollect();
    args.put("containerName","");
    args.put("row","#{#{cursor.cursoroainfsalias}}");
    args.put("row_arrayPath","oainfs");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "toInformation",UMActivity.getViewId(control),args);
}
public void actionOnCloseBtnClick(View control, UMEventArgs args) {
    String actionid = "onCloseBtnClick";
    args.put("resultcode","0");
    args.put("iskeep","false");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.close(args);
}
public void actionToGroupInfos(View control, UMEventArgs args) {
    String actionid = "toGroupInfos";
    args.put("viewid","nc.bs.oa.oama.ecm.Info_groupinfos");
    args.put("iskeep","false");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.open(args);
}


}
