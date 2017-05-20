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

public abstract class Info_imgActivity extends UMWindowActivity {

	protected UMWindow info_img = null;
protected XVerticalLayout viewPage0 = null;
protected XHorizontalLayout navigatorbar0 = null;
protected UMButton button0 = null;
protected UMLabel label0 = null;
protected UMLabel label1 = null;
protected XVerticalLayout panel0 = null;
protected UMLabel label2 = null;
protected XVerticalLayout panel808 = null;
protected UMLabel label3 = null;
protected XHorizontalLayout panel0999 = null;
protected XVerticalLayout panel1 = null;
protected UMImage image1 = null;
protected XVerticalLayout panel6 = null;
protected UMLabel label5 = null;
protected XVerticalLayout panel7 = null;
protected UMImage image2 = null;
protected XHorizontalLayout panel5 = null;
protected UMViewFlipper flipper0 = null;
protected XVerticalLayout flipper0_childWgt0 = null;
protected XVerticalLayout flipper0_childWgt0_panel1 = null;
protected UMImage flipper0_childWgt0_image0 = null;
protected XVerticalLayout flipper0_childWgt0_panel2 = null;
protected UMLabel flipper0_childWgt0_label0 = null;
protected XHorizontalLayout panel2 = null;
protected UMImage image0 = null;
protected UMLabel label4 = null;
protected XHorizontalLayout panel3 = null;
protected XVerticalLayout panel4 = null;
protected UMTextArea textarea0 = null;
protected UMButton button1 = null;
protected UMButton button2 = null;

	
	protected final static int ID_INFO_IMG = 1934599388;
protected final static int ID_VIEWPAGE0 = 701419396;
protected final static int ID_NAVIGATORBAR0 = 2007147555;
protected final static int ID_BUTTON0 = 1227814898;
protected final static int ID_LABEL0 = 219255752;
protected final static int ID_LABEL1 = 994243269;
protected final static int ID_PANEL0 = 1227363769;
protected final static int ID_LABEL2 = 208679392;
protected final static int ID_PANEL808 = 42455289;
protected final static int ID_LABEL3 = 812343337;
protected final static int ID_PANEL0999 = 655274060;
protected final static int ID_PANEL1 = 1550601686;
protected final static int ID_IMAGE1 = 1457221038;
protected final static int ID_PANEL6 = 257122015;
protected final static int ID_LABEL5 = 2132836810;
protected final static int ID_PANEL7 = 1216073307;
protected final static int ID_IMAGE2 = 694288987;
protected final static int ID_PANEL5 = 886335847;
protected final static int ID_FLIPPER0 = 1372357766;
protected final static int ID_FLIPPER0_CHILDWGT0 = 809490400;
protected final static int ID_FLIPPER0_CHILDWGT0_PANEL1 = 205690188;
protected final static int ID_FLIPPER0_CHILDWGT0_IMAGE0 = 19869495;
protected final static int ID_FLIPPER0_CHILDWGT0_PANEL2 = 350293737;
protected final static int ID_FLIPPER0_CHILDWGT0_LABEL0 = 139167926;
protected final static int ID_PANEL2 = 1810548660;
protected final static int ID_IMAGE0 = 1862482778;
protected final static int ID_LABEL4 = 330073547;
protected final static int ID_PANEL3 = 1106922264;
protected final static int ID_PANEL4 = 1616507460;
protected final static int ID_TEXTAREA0 = 1795235613;
protected final static int ID_BUTTON1 = 1875208351;
protected final static int ID_BUTTON2 = 1379240624;

	
	
	@Override
	public String getControllerName() {
		return "info_imgController";
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
		  idmap.put("info_img",ID_INFO_IMG);
  idmap.put("viewPage0",ID_VIEWPAGE0);
  idmap.put("navigatorbar0",ID_NAVIGATORBAR0);
  idmap.put("button0",ID_BUTTON0);
  idmap.put("label0",ID_LABEL0);
  idmap.put("label1",ID_LABEL1);
  idmap.put("panel0",ID_PANEL0);
  idmap.put("label2",ID_LABEL2);
  idmap.put("panel808",ID_PANEL808);
  idmap.put("label3",ID_LABEL3);
  idmap.put("panel0999",ID_PANEL0999);
  idmap.put("panel1",ID_PANEL1);
  idmap.put("image1",ID_IMAGE1);
  idmap.put("panel6",ID_PANEL6);
  idmap.put("label5",ID_LABEL5);
  idmap.put("panel7",ID_PANEL7);
  idmap.put("image2",ID_IMAGE2);
  idmap.put("panel5",ID_PANEL5);
  idmap.put("flipper0",ID_FLIPPER0);
  idmap.put("flipper0_childWgt0",ID_FLIPPER0_CHILDWGT0);
  idmap.put("flipper0_childWgt0_panel1",ID_FLIPPER0_CHILDWGT0_PANEL1);
  idmap.put("flipper0_childWgt0_image0",ID_FLIPPER0_CHILDWGT0_IMAGE0);
  idmap.put("flipper0_childWgt0_panel2",ID_FLIPPER0_CHILDWGT0_PANEL2);
  idmap.put("flipper0_childWgt0_label0",ID_FLIPPER0_CHILDWGT0_LABEL0);
  idmap.put("panel2",ID_PANEL2);
  idmap.put("image0",ID_IMAGE0);
  idmap.put("label4",ID_LABEL4);
  idmap.put("panel3",ID_PANEL3);
  idmap.put("panel4",ID_PANEL4);
  idmap.put("textarea0",ID_TEXTAREA0);
  idmap.put("button1",ID_BUTTON1);
  idmap.put("button2",ID_BUTTON2);

	}
	
	public void onLoad() {
		ULog.logLC("onLoad", this);
		if(currentPage!=null) {
			currentPage.onLoad();
		}
	
		{ //viewPage0 - infoLoad
    UMEventArgs args = new UMEventArgs(Info_imgActivity.this);
    actionInfoLoad(viewPage0,args);

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
    UMEventArgs args = new UMEventArgs(Info_imgActivity.this);
    actionToClose(button0,args);

}
});
navigatorbar0.addView(button0);
label0 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL0
,"bindfield",""
,"halign","center"
,"weight","1"
,"width","0"
,"height","fill"
,"color","#000000"
,"font-size","17"
,"layout-type","linear"
,"onclick","action:label0_onclick"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label0,"content","#{res.info_title_info}"));
label0.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Info_imgActivity.this);
    actionLabel0_onclick(label0,args);

}
});
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
public View getPanel0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel0 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL0
,"padding-right","10"
,"padding-left","10"
,"halign","center"
,"height","32"
,"layout-type","linear"
,"width","fill"
);
label2 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL2
,"bindfield","infotitle"
,"halign","left"
,"height","fill"
,"color","#000000"
,"layout-type","linear"
,"font-size","16"
,"width","fill"
,"font-family","default"
,"valign","center"
);
UMTextBinder label2_binder = new UMTextBinder((IUMContextAccessor)context);
label2_binder.setBindInfo(new BindInfo("infotitle"));
label2_binder.setControl(label2);
binderGroup.addBinderToGroup(ID_LABEL2, label2_binder);
panel0.addView(label2);

return panel0;
}
public View getPanel808View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel808 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL808
,"padding-right","10"
,"padding-left","10"
,"halign","center"
,"height","20"
,"layout-type","linear"
,"width","fill"
);
label3 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL3
,"bindfield","publishdate"
,"halign","left"
,"height","20"
,"color","#000000"
,"layout-type","linear"
,"font-size","12"
,"width","fill"
,"font-family","default"
,"valign","center"
);
UMTextBinder label3_binder = new UMTextBinder((IUMContextAccessor)context);
label3_binder.setBindInfo(new BindInfo("publishdate"));
label3_binder.setControl(label3);
binderGroup.addBinderToGroup(ID_LABEL3, label3_binder);
panel808.addView(label3);

return panel808;
}
public View getPanel1View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel1 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL1
,"padding-top","3"
,"halign","center"
,"height","fill"
,"layout-type","linear"
,"width","44"
);
image1 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_IMAGE1
,"height","30"
,"layout-type","linear"
,"width","30"
,"onclick","nextImgLoad"
,"scaletype","fitcenter"
,"src","oainf_l.png"
);
image1.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Info_imgActivity.this);
    actionNextImgLoad(image1,args);

}
});
panel1.addView(image1);

return panel1;
}
public View getPanel6View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel6 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL6
,"padding-top","8"
,"halign","center"
,"height","fill"
,"weight","1"
,"layout-type","linear"
,"width","0"
);
label5 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL5
,"bindfield","imgposition"
,"halign","center"
,"height","wrap"
,"color","#000000"
,"heightwrap","20.0"
,"layout-type","linear"
,"font-size","14"
,"width","fill"
,"font-family","default"
,"valign","center"
);
UMTextBinder label5_binder = new UMTextBinder((IUMContextAccessor)context);
label5_binder.setBindInfo(new BindInfo("imgposition"));
label5_binder.setControl(label5);
binderGroup.addBinderToGroup(ID_LABEL5, label5_binder);
panel6.addView(label5);

return panel6;
}
public View getPanel7View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel7 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL7
,"padding-top","3"
,"halign","center"
,"height","fill"
,"layout-type","linear"
,"width","40.0"
);
image2 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_IMAGE2
,"height","30"
,"layout-type","linear"
,"width","30"
,"onclick","preImgLoad"
,"scaletype","fitcenter"
,"src","oainf_r.png"
);
image2.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Info_imgActivity.this);
    actionPreImgLoad(image2,args);

}
});
panel7.addView(image2);

return panel7;
}
public View getPanel0999View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel0999 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL0999
,"padding-right","10"
,"padding-left","10"
,"height","38"
,"layout-type","linear"
,"width","fill"
,"valign","center"
);
View panel1 = (View) getPanel1View((UMActivity)context,binderGroup,configure);
panel0999.addView(panel1);
View panel6 = (View) getPanel6View((UMActivity)context,binderGroup,configure);
panel0999.addView(panel6);
View panel7 = (View) getPanel7View((UMActivity)context,binderGroup,configure);
panel0999.addView(panel7);

return panel0999;
}
public View getFlipper0_childWgt0_panel1View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
flipper0_childWgt0_panel1 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_FLIPPER0_CHILDWGT0_PANEL1
,"halign","center"
,"weight","1"
,"height","0"
,"layout-type","linear"
,"width","fill"
);
flipper0_childWgt0_image0 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_FLIPPER0_CHILDWGT0_IMAGE0
,"bindfield","imgfilecontent"
,"height","fill"
,"layout-type","linear"
,"width","fill"
,"scaletype","fitcenter"
,"src",""
);
UMImageBinder flipper0_childWgt0_image0_binder = new UMImageBinder((IUMContextAccessor)context);
flipper0_childWgt0_image0_binder.setBindInfo(new BindInfo("imgfilecontent"));
flipper0_childWgt0_image0_binder.setControl(flipper0_childWgt0_image0);
binderGroup.addBinderToGroup(ID_FLIPPER0_CHILDWGT0_IMAGE0, flipper0_childWgt0_image0_binder);
flipper0_childWgt0_panel1.addView(flipper0_childWgt0_image0);

return flipper0_childWgt0_panel1;
}
public View getFlipper0_childWgt0_panel2View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
flipper0_childWgt0_panel2 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_FLIPPER0_CHILDWGT0_PANEL2
,"padding-top","5"
,"halign","center"
,"height","58"
,"layout-type","linear"
,"width","fill"
,"padding-bottom","5"
);
flipper0_childWgt0_label0 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_FLIPPER0_CHILDWGT0_LABEL0
,"bindfield","imgfiledesc"
,"height","fill"
,"color","#000000"
,"layout-type","linear"
,"font-size","13"
,"width","fill"
,"font-family","default"
,"type","multiline"
,"rows","3"
);
UMTextBinder flipper0_childWgt0_label0_binder = new UMTextBinder((IUMContextAccessor)context);
flipper0_childWgt0_label0_binder.setBindInfo(new BindInfo("imgfiledesc"));
flipper0_childWgt0_label0_binder.setControl(flipper0_childWgt0_label0);
binderGroup.addBinderToGroup(ID_FLIPPER0_CHILDWGT0_LABEL0, flipper0_childWgt0_label0_binder);
flipper0_childWgt0_panel2.addView(flipper0_childWgt0_label0);

return flipper0_childWgt0_panel2;
}
public View getFlipper0_childWgt0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
flipper0_childWgt0 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_FLIPPER0_CHILDWGT0
,"halign","center"
,"height","fill"
,"layout-type","linear"
,"width","fill"
);
View flipper0_childWgt0_panel1 = (View) getFlipper0_childWgt0_panel1View((UMActivity)context,binderGroup,configure);
flipper0_childWgt0.addView(flipper0_childWgt0_panel1);
View flipper0_childWgt0_panel2 = (View) getFlipper0_childWgt0_panel2View((UMActivity)context,binderGroup,configure);
flipper0_childWgt0.addView(flipper0_childWgt0_panel2);

return flipper0_childWgt0;
}
public View getFlipper0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
flipper0 = (UMViewFlipper)ThirdControl.createControl(new UMViewFlipper(context),ID_FLIPPER0
,"height","fill"
,"weight","1"
,"onnextflipper","preImgLoad"
,"layout-type","linear"
,"width","0"
,"onpreviousflipper","nextImgLoad"
,"flippertype","dynamic"
);
flipper0.setEvent("onnextflipper", new OnCursorEventListener(configure) {
  @Override
  public void onEvent(View v, UMEventArgs parent) {
    UMEventArgs args = new UMEventArgs(Info_imgActivity.this);
    args.put(parent);
    actionPreImgLoad(flipper0,args);

}
});
flipper0.setEvent("onpreviousflipper", new OnCursorEventListener(configure) {
  @Override
  public void onEvent(View v, UMEventArgs parent) {
    UMEventArgs args = new UMEventArgs(Info_imgActivity.this);
    args.put(parent);
    actionNextImgLoad(flipper0,args);

}
});
View flipper0_childWgt0 = (View) getFlipper0_childWgt0View((UMActivity)context,binderGroup,configure);
flipper0.addView(flipper0_childWgt0);

return flipper0;
}
public View getPanel5View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel5 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL5
,"height","0"
,"weight","1"
,"layout-type","linear"
,"width","fill"
,"valign","center"
);
View flipper0 = (View) getFlipper0View((UMActivity)context,binderGroup,configure);
panel5.addView(flipper0);

return panel5;
}
public View getPanel2View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel2 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL2
,"padding-right","10"
,"padding-left","10"
,"height","33"
,"layout-type","linear"
,"width","fill"
,"onclick","toAttach"
,"valign","center"
);
panel2.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Info_imgActivity.this);
    actionToAttach(panel2,args);

}
});
image0 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_IMAGE0
,"height","22"
,"layout-type","linear"
,"width","10"
,"scaletype","fitcenter"
,"src","oainf_attach.png"
);
panel2.addView(image0);
label4 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL4
,"halign","left"
,"height","fill"
,"weight","1"
,"color","#000000"
,"layout-type","linear"
,"font-size","13"
,"width","0"
,"margin-left","2"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label4,"content","#{res.info_txt_attach}"));
panel2.addView(label4);

return panel2;
}
public View getPanel4View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel4 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL4
,"padding-top","10"
,"halign","center"
,"height","fill"
,"weight","1"
,"layout-type","linear"
,"width","0"
,"padding-bottom","10"
);
textarea0 = (UMTextArea)ThirdControl.createControl(new UMTextArea(context),ID_TEXTAREA0
,"padding-left","4"
,"padding-top","5"
,"halign","LEFT"
,"placeholder",""
,"width","fill"
,"padding-bottom","5"
,"onchange","action:textarea0_onchange"
,"height","26.0"
,"color","#167ef8"
,"layout-type","linear"
,"font-size","17"
,"background","#ffffff"
,"font-family","default"
);
textarea0.setEvent("onchange", new OnCursorEventListener(configure) {
  @Override
  public void onEvent(View v, UMEventArgs parent) {
    UMEventArgs args = new UMEventArgs(Info_imgActivity.this);
    args.put(parent);
    actionTextarea0_onchange(textarea0,args);

}
});
panel4.addView(textarea0);

return panel4;
}
public View getPanel3View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel3 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL3
,"padding-right","10"
,"padding-left","10"
,"height","wrap"
,"heightwrap","44.0"
,"layout-type","linear"
,"background","#e8e8e8"
,"width","fill"
,"valign","center"
);
View panel4 = (View) getPanel4View((UMActivity)context,binderGroup,configure);
panel3.addView(panel4);
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
    UMEventArgs args = new UMEventArgs(Info_imgActivity.this);
    actionDoSubmitComment(button1,args);

}
});
panel3.addView(button1);
button2 = (UMButton)ThirdControl.createControl(new UMButton(context),ID_BUTTON2
,"halign","center"
,"pressed-image","button_touch"
,"width","42.0"
,"background-image-dis","button"
,"height","fill"
,"color","#ff0000"
,"layout-type","linear"
,"font-size","14"
,"onclick","toComment"
,"font-family","default"
,"valign","center"
,"background-image","button"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,button2,"value","#{res.info_btn_all}"));
button2.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Info_imgActivity.this);
    actionToComment(button2,args);

}
});
panel3.addView(button2);

return panel3;
}
public View getViewPage0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
viewPage0 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_VIEWPAGE0
,"halign","center"
,"height","fill"
,"onload","infoLoad"
,"layout-type","vbox"
,"background","#efeff4"
,"width","fill"
);
View navigatorbar0 = (View) getNavigatorbar0View((UMActivity)context,binderGroup,configure);
viewPage0.addView(navigatorbar0);
View panel0 = (View) getPanel0View((UMActivity)context,binderGroup,configure);
viewPage0.addView(panel0);
View panel808 = (View) getPanel808View((UMActivity)context,binderGroup,configure);
viewPage0.addView(panel808);
View panel0999 = (View) getPanel0999View((UMActivity)context,binderGroup,configure);
viewPage0.addView(panel0999);
View panel5 = (View) getPanel5View((UMActivity)context,binderGroup,configure);
viewPage0.addView(panel5);
View panel2 = (View) getPanel2View((UMActivity)context,binderGroup,configure);
viewPage0.addView(panel2);
View panel3 = (View) getPanel3View((UMActivity)context,binderGroup,configure);
viewPage0.addView(panel3);

return viewPage0;
}
public UMWindow getCurrentWindow(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
info_img = (UMWindow)ThirdControl.createControl(new UMWindow(context),ID_INFO_IMG
,"halign","center"
,"height","460.0"
,"layout","vbox"
,"width","320.0"
,"context","oneinfo"
,"controller","info_imgController"
,"namespace","nc.bs.oa.oama.ecm"
);
View viewPage0 = (View) getViewPage0View((UMActivity)context,binderGroup,configure);
info_img.addView(viewPage0);

return (UMWindow)info_img;
}

	
	public void actionAfterInfoLoad(View control, UMEventArgs args) {
    String actionid = "afterInfoLoad";
  this.dataCollect();
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "afterInfoLoad",UMActivity.getViewId(control),args);
}
public void actionDoSubmitComment(View control, UMEventArgs args) {
    String actionid = "doSubmitComment";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "doSubmitComment",UMActivity.getViewId(control),args);
}
public void actionPreImgLoad(View control, UMEventArgs args) {
    String actionid = "preImgLoad";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "preImgLoad",UMActivity.getViewId(control),args);
}
public void actionNextImgLoad(View control, UMEventArgs args) {
    String actionid = "nextImgLoad";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "nextImgLoad",UMActivity.getViewId(control),args);
}
public void actionLabel0_onclick(View control, UMEventArgs args) {
    String actionid = "label0_onclick";
    args.put("language","javascript");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "this.label0_onclick()",UMActivity.getViewId(control),args);
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
public void actionInfoLoad(View control, UMEventArgs args) {
    args.put("infoid","#{plug.infoid}");
    args.put("error","afterLoadError");
    args.put("viewid","nc.bs.oa.oainf.ma.infopublish.OneinfoExtendController");
    args.put("ts","#{plug.ts}");
  this.dataCollect();
    args.put("screenh","#{plug.screenh}");
    String actionid = "infoLoad";
    args.put("screenw","#{plug.screenw}");
    args.put("callback","afterInfoLoad");
    args.put("action","onePicLoad");
    args.put("autoDataBinding","true");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMService.callAction(args);
}
public void actionToComment(View control, UMEventArgs args) {
    String actionid = "toComment";
    args.put("infoid","#{infoid}");
    args.put("viewid","nc.bs.oa.oama.ecm.Info_comment_list");
  this.dataCollect();
    args.put("iskeep","true");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.open(args);
}
public void actionToAttach(View control, UMEventArgs args) {
    String actionid = "toAttach";
    args.put("infoid","#{infoid}");
    args.put("viewid","nc.bs.oa.oama.ecm.Info_attach_list");
  this.dataCollect();
    args.put("iskeep","true");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.open(args);
}
public void actionUMonDataBinding(View control, UMEventArgs args) {
    String actionid = "UMonDataBinding";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "UMonDataBinding",UMActivity.getViewId(control),args);
}
public void actionAfterLoadError(View control, UMEventArgs args) {
    String actionid = "afterLoadError";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "afterLoadError",UMActivity.getViewId(control),args);
}
public void actionToClose(View control, UMEventArgs args) {
    String actionid = "toClose";
    args.put("resultcode","15");
    args.put("iskeep","false");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.close(args);
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
public void actionTextarea0_onchange(View control, UMEventArgs args) {
    String actionid = "textarea0_onchange";
    args.put("language","javascript");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "this.textarea0_onchange()",UMActivity.getViewId(control),args);
}


}
