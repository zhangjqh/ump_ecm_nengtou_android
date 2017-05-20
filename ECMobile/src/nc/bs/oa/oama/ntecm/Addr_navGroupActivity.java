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

public abstract class Addr_navGroupActivity extends UMWindowActivity {

	protected UMWindow navGroup = null;
protected XVerticalLayout viewPage0 = null;
protected XHorizontalLayout navigatorbar0 = null;
protected UMButton button1 = null;
protected UMLabel label0 = null;
protected UMLabel label1 = null;
protected XVerticalLayout panel2 = null;
protected UMSearchControl search0 = null;
protected XVerticalLayout panel0 = null;
protected UMListViewBase listview0 = null;
protected XHorizontalLayout listview0_childWgt0 = null;
protected UMImage listview0_childWgt0_image8 = null;
protected UMLabel listview0_childWgt0_label0 = null;
protected UMImage listview0_childWgt0_image0 = null;
protected XHorizontalLayout listview0_childWgt1 = null;
protected UMImage listview0_childWgt1_image9 = null;
protected UMLabel listview0_childWgt1_label3 = null;
protected XHorizontalLayout listview0_childWgt2 = null;
protected UMImage listview0_childWgt2_image10 = null;
protected UMLabel listview0_childWgt2_label4 = null;
protected UMImage listview0_childWgt2_image2 = null;
protected XVerticalLayout panel1 = null;
protected XHorizontalLayout widget0 = null;
protected XHorizontalLayout widget0_toolbar0 = null;
protected UMImageButton widget0_imagebutton0 = null;
protected UMImageButton widget0_imagebutton3 = null;
protected UMImageButton widget0_imagebutton4 = null;
protected UMImageButton widget0_imagebutton1 = null;

	
	protected final static int ID_NAVGROUP = 1653099272;
protected final static int ID_VIEWPAGE0 = 1888928100;
protected final static int ID_NAVIGATORBAR0 = 306794022;
protected final static int ID_BUTTON1 = 1220908842;
protected final static int ID_LABEL0 = 1589988049;
protected final static int ID_LABEL1 = 1550349139;
protected final static int ID_PANEL2 = 550991023;
protected final static int ID_SEARCH0 = 1255287924;
protected final static int ID_PANEL0 = 592877577;
protected final static int ID_LISTVIEW0 = 936078471;
protected final static int ID_LISTVIEW0_CHILDWGT0 = 968224819;
protected final static int ID_LISTVIEW0_CHILDWGT0_IMAGE8 = 1051424591;
protected final static int ID_LISTVIEW0_CHILDWGT0_LABEL0 = 63105188;
protected final static int ID_LISTVIEW0_CHILDWGT0_IMAGE0 = 676851692;
protected final static int ID_LISTVIEW0_CHILDWGT1 = 212043065;
protected final static int ID_LISTVIEW0_CHILDWGT1_IMAGE9 = 536409128;
protected final static int ID_LISTVIEW0_CHILDWGT1_LABEL3 = 1984205864;
protected final static int ID_LISTVIEW0_CHILDWGT2 = 856139169;
protected final static int ID_LISTVIEW0_CHILDWGT2_IMAGE10 = 579877867;
protected final static int ID_LISTVIEW0_CHILDWGT2_LABEL4 = 1603687718;
protected final static int ID_LISTVIEW0_CHILDWGT2_IMAGE2 = 922822500;
protected final static int ID_PANEL1 = 1596891766;
protected final static int ID_WIDGET0 = 481655752;
protected final static int ID_WIDGET0_TOOLBAR0 = 1816950218;
protected final static int ID_WIDGET0_IMAGEBUTTON0 = 2030997874;
protected final static int ID_WIDGET0_IMAGEBUTTON3 = 1301202601;
protected final static int ID_WIDGET0_IMAGEBUTTON4 = 1929091087;
protected final static int ID_WIDGET0_IMAGEBUTTON1 = 1345444272;

	
	
	@Override
	public String getControllerName() {
		return "navGroupController";
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
		  idmap.put("navGroup",ID_NAVGROUP);
  idmap.put("viewPage0",ID_VIEWPAGE0);
  idmap.put("navigatorbar0",ID_NAVIGATORBAR0);
  idmap.put("button1",ID_BUTTON1);
  idmap.put("label0",ID_LABEL0);
  idmap.put("label1",ID_LABEL1);
  idmap.put("panel2",ID_PANEL2);
  idmap.put("search0",ID_SEARCH0);
  idmap.put("panel0",ID_PANEL0);
  idmap.put("listview0",ID_LISTVIEW0);
  idmap.put("listview0_childWgt0",ID_LISTVIEW0_CHILDWGT0);
  idmap.put("listview0_childWgt0_image8",ID_LISTVIEW0_CHILDWGT0_IMAGE8);
  idmap.put("listview0_childWgt0_label0",ID_LISTVIEW0_CHILDWGT0_LABEL0);
  idmap.put("listview0_childWgt0_image0",ID_LISTVIEW0_CHILDWGT0_IMAGE0);
  idmap.put("listview0_childWgt1",ID_LISTVIEW0_CHILDWGT1);
  idmap.put("listview0_childWgt1_image9",ID_LISTVIEW0_CHILDWGT1_IMAGE9);
  idmap.put("listview0_childWgt1_label3",ID_LISTVIEW0_CHILDWGT1_LABEL3);
  idmap.put("listview0_childWgt2",ID_LISTVIEW0_CHILDWGT2);
  idmap.put("listview0_childWgt2_image10",ID_LISTVIEW0_CHILDWGT2_IMAGE10);
  idmap.put("listview0_childWgt2_label4",ID_LISTVIEW0_CHILDWGT2_LABEL4);
  idmap.put("listview0_childWgt2_image2",ID_LISTVIEW0_CHILDWGT2_IMAGE2);
  idmap.put("panel1",ID_PANEL1);
  idmap.put("widget0",ID_WIDGET0);
  idmap.put("widget0_toolbar0",ID_WIDGET0_TOOLBAR0);
  idmap.put("widget0_imagebutton0",ID_WIDGET0_IMAGEBUTTON0);
  idmap.put("widget0_imagebutton3",ID_WIDGET0_IMAGEBUTTON3);
  idmap.put("widget0_imagebutton4",ID_WIDGET0_IMAGEBUTTON4);
  idmap.put("widget0_imagebutton1",ID_WIDGET0_IMAGEBUTTON1);

	}
	
	public void onLoad() {
		ULog.logLC("onLoad", this);
		if(currentPage!=null) {
			currentPage.onLoad();
		}
	
		{ //listview0 - listViewOnload
    UMEventArgs args = new UMEventArgs(Addr_navGroupActivity.this);
    actionListViewOnload(listview0,args);

}
{ //panel1 - tabBarOnload
    UMEventArgs args = new UMEventArgs(Addr_navGroupActivity.this);
    actionTabBarOnload(panel1,args);

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
button1 = (UMButton)ThirdControl.createControl(new UMButton(context),ID_BUTTON1
,"halign","left"
,"pressed-image","btn_back.png"
,"width","64"
,"background-image-dis","btn_back.png"
,"height","44"
,"color","#e50011"
,"font-size","17"
,"layout-type","linear"
,"onclick","toDesk"
,"font-family","default"
,"valign","center"
,"background-image","btn_back.png"
);
button1.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Addr_navGroupActivity.this);
    actionToDesk(button1,args);

}
});
navigatorbar0.addView(button1);
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
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label0,"content","#{res.addr_oaadl_0004}"));
navigatorbar0.addView(label0);
label1 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL1
,"halign","center"
,"height","44"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","64"
,"font-family","default"
,"valign","center"
);
navigatorbar0.addView(label1);

return navigatorbar0;
}
public View getPanel2View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel2 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL2
,"halign","center"
,"height","45"
,"layout-type","linear"
,"width","fill"
);
search0 = (UMSearchControl)ThirdControl.createControl(new UMSearchControl(context),ID_SEARCH0
,"localstorage","true"
,"font","default"
,"width","fill"
,"height","44"
,"search-btn-icon","search_left.png"
,"color","#000000"
,"font-size","15"
,"layout-type","linear"
,"search-del-icon","search_right.png"
,"onsearch","doSearch"
,"background-image","search_bg"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,search0,"placeholder","#{res.addr_oaadl_0027}"));
search0.setEvent("onsearch", new OnCursorEventListener(configure) {
  @Override
  public void onEvent(View v, UMEventArgs parent) {
    UMEventArgs args = new UMEventArgs(Addr_navGroupActivity.this);
    args.put(parent);
    actionDoSearch(search0,args);

}
});
panel2.addView(search0);

return panel2;
}
public View getListview0_childWgt0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt0 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT0
,"padding-right","15"
,"padding-left","8"
,"height","44"
,"layout-type","linear"
,"width","fill"
,"onclick","toChildNav"
,"valign","center"
,"background-image","oaadl_44_down.png"
);
listview0_childWgt0.setOnClickListener(new OnCursorClickListener(configure) {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Addr_navGroupActivity.this);
    int position = this.getPosition(v);
    if(position>=0) {
      context.getCursor("cursornavsalias").setCurrentIndex(position);
    }
    actionToChildNav(listview0_childWgt0,args);

}
});
listview0_childWgt0_image8 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_LISTVIEW0_CHILDWGT0_IMAGE8
,"bindfield","navimage"
,"margin-right","8"
,"height","25"
,"layout-type","linear"
,"width","25"
,"scaletype","fitcenter"
,"src",""
);
UMImageBinder listview0_childWgt0_image8_binder = new UMImageBinder((IUMContextAccessor)context);
listview0_childWgt0_image8_binder.setBindInfo(new BindInfo("navimage"));
listview0_childWgt0_image8_binder.setControl(listview0_childWgt0_image8);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT0_IMAGE8, listview0_childWgt0_image8_binder);
listview0_childWgt0.addView(listview0_childWgt0_image8);
listview0_childWgt0_label0 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT0_LABEL0
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
UMTextBinder listview0_childWgt0_label0_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt0_label0_binder.setBindInfo(new BindInfo("nameandnum"));
listview0_childWgt0_label0_binder.setControl(listview0_childWgt0_label0);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT0_LABEL0, listview0_childWgt0_label0_binder);
listview0_childWgt0.addView(listview0_childWgt0_label0);
listview0_childWgt0_image0 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_LISTVIEW0_CHILDWGT0_IMAGE0
,"height","13"
,"layout-type","linear"
,"width","8"
,"scaletype","fitcenter"
,"src","oaadl_arrow.png"
);
listview0_childWgt0.addView(listview0_childWgt0_image0);

return listview0_childWgt0;
}
public View getListview0_childWgt1View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt1 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT1
,"padding-left","8"
,"padding-right","15"
,"height","44"
,"layout-type","linear"
,"width","fill"
,"valign","center"
,"background-image","oaadl_44_down.png"
);
listview0_childWgt1_image9 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_LISTVIEW0_CHILDWGT1_IMAGE9
,"bindfield","navimage"
,"margin-right","8"
,"height","25"
,"layout-type","linear"
,"width","25"
,"scaletype","fitcenter"
,"src",""
);
UMImageBinder listview0_childWgt1_image9_binder = new UMImageBinder((IUMContextAccessor)context);
listview0_childWgt1_image9_binder.setBindInfo(new BindInfo("navimage"));
listview0_childWgt1_image9_binder.setControl(listview0_childWgt1_image9);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT1_IMAGE9, listview0_childWgt1_image9_binder);
listview0_childWgt1.addView(listview0_childWgt1_image9);
listview0_childWgt1_label3 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT1_LABEL3
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
UMTextBinder listview0_childWgt1_label3_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt1_label3_binder.setBindInfo(new BindInfo("nameandnum"));
listview0_childWgt1_label3_binder.setControl(listview0_childWgt1_label3);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT1_LABEL3, listview0_childWgt1_label3_binder);
listview0_childWgt1.addView(listview0_childWgt1_label3);

return listview0_childWgt1;
}
public View getListview0_childWgt2View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt2 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT2
,"padding-right","15"
,"padding-left","8"
,"height","44"
,"layout-type","linear"
,"width","fill"
,"onclick","toPsnList"
,"valign","center"
,"background-image","oaadl_44_down.png"
);
listview0_childWgt2.setOnClickListener(new OnCursorClickListener(configure) {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Addr_navGroupActivity.this);
    int position = this.getPosition(v);
    if(position>=0) {
      context.getCursor("cursornavsalias").setCurrentIndex(position);
    }
    actionToPsnList(listview0_childWgt2,args);

}
});
listview0_childWgt2_image10 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_LISTVIEW0_CHILDWGT2_IMAGE10
,"bindfield","navimage"
,"margin-right","8"
,"height","25"
,"layout-type","linear"
,"width","25"
,"scaletype","fitcenter"
,"src",""
);
UMImageBinder listview0_childWgt2_image10_binder = new UMImageBinder((IUMContextAccessor)context);
listview0_childWgt2_image10_binder.setBindInfo(new BindInfo("navimage"));
listview0_childWgt2_image10_binder.setControl(listview0_childWgt2_image10);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT2_IMAGE10, listview0_childWgt2_image10_binder);
listview0_childWgt2.addView(listview0_childWgt2_image10);
listview0_childWgt2_label4 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT2_LABEL4
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
UMTextBinder listview0_childWgt2_label4_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt2_label4_binder.setBindInfo(new BindInfo("nameandnum"));
listview0_childWgt2_label4_binder.setControl(listview0_childWgt2_label4);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT2_LABEL4, listview0_childWgt2_label4_binder);
listview0_childWgt2.addView(listview0_childWgt2_label4);
listview0_childWgt2_image2 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_LISTVIEW0_CHILDWGT2_IMAGE2
,"height","13"
,"layout-type","linear"
,"width","8"
,"scaletype","fitcenter"
,"src","oaadl_arrow.png"
);
listview0_childWgt2.addView(listview0_childWgt2_image2);

return listview0_childWgt2;
}
public View getListview0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0 = (UMListViewBase)ThirdControl.createControl(new UMListViewBase(context),ID_LISTVIEW0
,"bindfield","navs"
,"height","fill"
,"childindicator","navListRowWidget"
,"ondownrefersh","getNextPage"
,"onload","listViewOnload"
,"cursoraction","cursornavsalias"
,"layout-type","linear"
,"background","#efeff4"
,"width","fill"
,"synccontext","navs"
);
context.createCursor("cursornavsalias", "navs");
UMListBinder listview0_binder = new UMListBinder((IUMContextAccessor)context);
listview0_binder.setBindInfo(new BindInfo("navs"));
listview0_binder.setControl(listview0);
binderGroup.addBinderToGroup(ID_LISTVIEW0, listview0_binder);
listview0.setEvent("ondownrefersh", new OnCursorEventListener(configure) {
  @Override
  public void onEvent(View v, UMEventArgs parent) {
    UMEventArgs args = new UMEventArgs(Addr_navGroupActivity.this);
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
,"height","fill"
,"pressed-image","toolbar"
,"layout-type","linear"
,"width","fill"
,"background-image-dis","toolbar"
,"valign","center"
,"background-image","toolbar.png"
);
widget0_imagebutton0 = (UMImageButton)ThirdControl.createControl(new UMImageButton(context),ID_WIDGET0_IMAGEBUTTON0
,"halign","center"
,"weight","1"
,"width","0"
,"icon-width","25"
,"istogglebutton","true"
,"font-pressed-color","#e50011"
,"icon-height","25"
,"height","fill"
,"color","#8a8888"
,"layout-type","linear"
,"font-size","10"
,"icon-background-image","oaadl_searchicon.png"
,"icon-pressed-image","oaadl_searchicon_touch.png"
,"onclick","toSearch"
,"font-family","default"
,"valign","center"
,"checked","false"
,"icon-text-spacing","5"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,widget0_imagebutton0,"value","#{res.addr_oaadl_0005}"));
widget0_imagebutton0.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Addr_navGroupActivity.this);
    actionToSearch(widget0_imagebutton0,args);

}
});
widget0_toolbar0.addView(widget0_imagebutton0);
widget0_imagebutton3 = (UMImageButton)ThirdControl.createControl(new UMImageButton(context),ID_WIDGET0_IMAGEBUTTON3
,"halign","center"
,"weight","1"
,"width","0"
,"icon-width","25"
,"istogglebutton","true"
,"font-pressed-color","#e50011"
,"icon-height","25"
,"height","fill"
,"color","#8a8888"
,"layout-type","linear"
,"font-size","10"
,"icon-background-image","oaadl_navicon.png"
,"icon-pressed-image","oaadl_navicon_touch.png"
,"onclick","toNavGroup"
,"font-family","default"
,"valign","center"
,"checked","false"
,"icon-text-spacing","5"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,widget0_imagebutton3,"value","#{res.addr_oaadl_0004}"));
widget0_imagebutton3.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Addr_navGroupActivity.this);
    actionToNavGroup(widget0_imagebutton3,args);

}
});
widget0_toolbar0.addView(widget0_imagebutton3);
widget0_imagebutton4 = (UMImageButton)ThirdControl.createControl(new UMImageButton(context),ID_WIDGET0_IMAGEBUTTON4
,"halign","center"
,"weight","1"
,"width","0"
,"icon-width","25"
,"istogglebutton","true"
,"font-pressed-color","#e50011"
,"icon-height","25"
,"height","fill"
,"color","#8a8888"
,"layout-type","linear"
,"font-size","10"
,"icon-background-image","oaadl_groupicon.png"
,"icon-pressed-image","oaadl_groupicon_touch.png"
,"onclick","toEntGroup"
,"font-family","default"
,"valign","center"
,"checked","false"
,"icon-text-spacing","5"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,widget0_imagebutton4,"value","#{res.addr_oaadl_0003}"));
widget0_imagebutton4.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Addr_navGroupActivity.this);
    actionToEntGroup(widget0_imagebutton4,args);

}
});
widget0_toolbar0.addView(widget0_imagebutton4);
widget0_imagebutton1 = (UMImageButton)ThirdControl.createControl(new UMImageButton(context),ID_WIDGET0_IMAGEBUTTON1
,"halign","center"
,"weight","1"
,"width","0"
,"icon-width","25"
,"istogglebutton","true"
,"font-pressed-color","#e50011"
,"icon-height","25"
,"height","fill"
,"color","#8a8888"
,"layout-type","linear"
,"font-size","10"
,"icon-background-image","oaadl_pgroupicon.png"
,"icon-pressed-image","oaadl_pgroupicon_touch.png"
,"onclick","toPsnGroup"
,"font-family","default"
,"valign","center"
,"checked","false"
,"icon-text-spacing","5"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,widget0_imagebutton1,"value","#{res.addr_oaadl_0002}"));
widget0_imagebutton1.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Addr_navGroupActivity.this);
    actionToPsnGroup(widget0_imagebutton1,args);

}
});
widget0_toolbar0.addView(widget0_imagebutton1);

return widget0_toolbar0;
}
public View getWidget0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
widget0 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_WIDGET0
,"height","49"
,"layout-type","linear"
,"width","fill"
,"valign","center"
);
View widget0_toolbar0 = (View) getWidget0_toolbar0View((UMActivity)context,binderGroup,configure);
widget0.addView(widget0_toolbar0);

return widget0;
}
public View getPanel1View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel1 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL1
,"halign","center"
,"height","49"
,"onload","tabBarOnload"
,"layout-type","linear"
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
,"layout-type","vbox"
,"width","fill"
);
View navigatorbar0 = (View) getNavigatorbar0View((UMActivity)context,binderGroup,configure);
viewPage0.addView(navigatorbar0);
View panel2 = (View) getPanel2View((UMActivity)context,binderGroup,configure);
viewPage0.addView(panel2);
View panel0 = (View) getPanel0View((UMActivity)context,binderGroup,configure);
viewPage0.addView(panel0);
View panel1 = (View) getPanel1View((UMActivity)context,binderGroup,configure);
viewPage0.addView(panel1);

return viewPage0;
}
public UMWindow getCurrentWindow(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
navGroup = (UMWindow)ThirdControl.createControl(new UMWindow(context),ID_NAVGROUP
,"halign","center"
,"height","fill"
,"layout","vbox"
,"width","fill"
,"context","navList"
,"controller","navGroupController"
,"namespace","nc.bs.oa.oama.ecm"
);
View viewPage0 = (View) getViewPage0View((UMActivity)context,binderGroup,configure);
navGroup.addView(viewPage0);

return (UMWindow)navGroup;
}

	
	public void actionTabBarOnload(View control, UMEventArgs args) {
    String actionid = "tabBarOnload";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "tabBarOnload",UMActivity.getViewId(control),args);
}
public void actionDoSearch(View control, UMEventArgs args) {
    String actionid = "doSearch";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "doSearch",UMActivity.getViewId(control),args);
}
public void actionToDesk(View control, UMEventArgs args) {
    String actionid = "toDesk";
    args.put("resultcode","0");
    args.put("iskeep","false");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.close(args);
}
public void actionToNearlyCheck(View control, UMEventArgs args) {
    String actionid = "toNearlyCheck";
    args.put("viewid","nc.bs.oa.oama.ecm.Addr_nearlyCheck");
    args.put("iskeep","false");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.open(args);
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
public void actionToPsnList(View control, UMEventArgs args) {
    String actionid = "toPsnList";
    args.put("viewid","nc.bs.oa.oama.ecm.Addr_psnList");
  this.dataCollect();
    args.put("iskeep","true");
    args.put("type","nav");
    args.put("containerName","");
    args.put("row","#{#{cursor.cursornavsalias}}");
    args.put("row_arrayPath","navs");
  ActionProcessor.exec(this, actionid, args);
UMView.open(args);
}
public void actionUMonDataBinding(View control, UMEventArgs args) {
    String actionid = "UMonDataBinding";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "UMonDataBinding",UMActivity.getViewId(control),args);
}
public void actionToSearch(View control, UMEventArgs args) {
    String actionid = "toSearch";
    args.put("viewid","nc.bs.oa.oama.ecm.Addr_search");
    args.put("iskeep","false");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.open(args);
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
public void actionToNavGroup(View control, UMEventArgs args) {
    String actionid = "toNavGroup";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "toNavGroup",UMActivity.getViewId(control),args);
}
public void actionToEntGroup(View control, UMEventArgs args) {
    String actionid = "toEntGroup";
    args.put("viewid","nc.bs.oa.oama.ecm.Addr_entGroup");
    args.put("iskeep","false");
    args.put("containerName","");
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
public void actionToPsnGroup(View control, UMEventArgs args) {
    String actionid = "toPsnGroup";
    args.put("viewid","nc.bs.oa.oama.ecm.Addr_psnGroup");
    args.put("iskeep","false");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.open(args);
}
public void actionGetNextPage(View control, UMEventArgs args) {
    String actionid = "getNextPage";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "getNextPage",UMActivity.getViewId(control),args);
}
public void actionListViewOnload(View control, UMEventArgs args) {
    String actionid = "listViewOnload";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "listViewOnload",UMActivity.getViewId(control),args);
}


}
