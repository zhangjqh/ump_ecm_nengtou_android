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

public abstract class Addr_psnDetailActivity extends UMWindowActivity {

	protected UMWindow psnDetail = null;
protected XVerticalLayout viewPage0 = null;
protected XHorizontalLayout navigatorbar0 = null;
protected UMButton button0 = null;
protected UMLabel label0 = null;
protected UMLabel label12 = null;
protected XVerticalLayout panel0 = null;
protected XHorizontalLayout panel1 = null;
protected UMImage image0 = null;
protected XVerticalLayout panel2 = null;
protected XHorizontalLayout panel20 = null;
protected UMLabel label1 = null;
protected UMLabel label13 = null;
protected UMLabel label2 = null;
protected UMLabel label3 = null;
protected XVerticalLayout roundimgdiv0 = null;
protected XHorizontalLayout panel3 = null;
protected UMLabel label4 = null;
protected UMLabel label5 = null;
protected UMImage image1 = null;
protected UMImage image5 = null;
protected XHorizontalLayout panel4 = null;
protected UMLabel label6 = null;
protected UMLabel label8 = null;
protected UMImage image2 = null;
protected XHorizontalLayout panel5 = null;
protected UMLabel label7 = null;
protected UMLabel label9 = null;
protected UMImage image3 = null;
protected XHorizontalLayout roundimgdiv1 = null;
protected UMLabel label10 = null;
protected UMLabel label11 = null;
protected UMImage image4 = null;
protected XHorizontalLayout toolbar0 = null;
protected UMButton button1 = null;
protected UMButton button2 = null;

	
	protected final static int ID_PSNDETAIL = 126780871;
protected final static int ID_VIEWPAGE0 = 1767307391;
protected final static int ID_NAVIGATORBAR0 = 1845784657;
protected final static int ID_BUTTON0 = 718170981;
protected final static int ID_LABEL0 = 146540596;
protected final static int ID_LABEL12 = 1537011086;
protected final static int ID_PANEL0 = 1163047656;
protected final static int ID_PANEL1 = 1981534705;
protected final static int ID_IMAGE0 = 550909984;
protected final static int ID_PANEL2 = 131667593;
protected final static int ID_PANEL20 = 325827494;
protected final static int ID_LABEL1 = 314501004;
protected final static int ID_LABEL13 = 268896987;
protected final static int ID_LABEL2 = 1581718732;
protected final static int ID_LABEL3 = 1157629989;
protected final static int ID_ROUNDIMGDIV0 = 1322192336;
protected final static int ID_PANEL3 = 975517930;
protected final static int ID_LABEL4 = 553023982;
protected final static int ID_LABEL5 = 920654710;
protected final static int ID_IMAGE1 = 1106362992;
protected final static int ID_IMAGE5 = 1004078195;
protected final static int ID_PANEL4 = 1382622683;
protected final static int ID_LABEL6 = 1852095457;
protected final static int ID_LABEL8 = 940926887;
protected final static int ID_IMAGE2 = 63723100;
protected final static int ID_PANEL5 = 1749353885;
protected final static int ID_LABEL7 = 1052865624;
protected final static int ID_LABEL9 = 1356829802;
protected final static int ID_IMAGE3 = 1747037248;
protected final static int ID_ROUNDIMGDIV1 = 136663161;
protected final static int ID_LABEL10 = 90605406;
protected final static int ID_LABEL11 = 559740618;
protected final static int ID_IMAGE4 = 1360431967;
protected final static int ID_TOOLBAR0 = 530623239;
protected final static int ID_BUTTON1 = 1449432038;
protected final static int ID_BUTTON2 = 358982253;

	
	
	@Override
	public String getControllerName() {
		return "psnDetailController";
	}
	
	@Override
	public String getContextName() {
		return "psndetail";
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
		  idmap.put("psnDetail",ID_PSNDETAIL);
  idmap.put("viewPage0",ID_VIEWPAGE0);
  idmap.put("navigatorbar0",ID_NAVIGATORBAR0);
  idmap.put("button0",ID_BUTTON0);
  idmap.put("label0",ID_LABEL0);
  idmap.put("label12",ID_LABEL12);
  idmap.put("panel0",ID_PANEL0);
  idmap.put("panel1",ID_PANEL1);
  idmap.put("image0",ID_IMAGE0);
  idmap.put("panel2",ID_PANEL2);
  idmap.put("panel20",ID_PANEL20);
  idmap.put("label1",ID_LABEL1);
  idmap.put("label13",ID_LABEL13);
  idmap.put("label2",ID_LABEL2);
  idmap.put("label3",ID_LABEL3);
  idmap.put("roundimgdiv0",ID_ROUNDIMGDIV0);
  idmap.put("panel3",ID_PANEL3);
  idmap.put("label4",ID_LABEL4);
  idmap.put("label5",ID_LABEL5);
  idmap.put("image1",ID_IMAGE1);
  idmap.put("image5",ID_IMAGE5);
  idmap.put("panel4",ID_PANEL4);
  idmap.put("label6",ID_LABEL6);
  idmap.put("label8",ID_LABEL8);
  idmap.put("image2",ID_IMAGE2);
  idmap.put("panel5",ID_PANEL5);
  idmap.put("label7",ID_LABEL7);
  idmap.put("label9",ID_LABEL9);
  idmap.put("image3",ID_IMAGE3);
  idmap.put("roundimgdiv1",ID_ROUNDIMGDIV1);
  idmap.put("label10",ID_LABEL10);
  idmap.put("label11",ID_LABEL11);
  idmap.put("image4",ID_IMAGE4);
  idmap.put("toolbar0",ID_TOOLBAR0);
  idmap.put("button1",ID_BUTTON1);
  idmap.put("button2",ID_BUTTON2);

	}
	
	public void onLoad() {
		ULog.logLC("onLoad", this);
		if(currentPage!=null) {
			currentPage.onLoad();
		}
	
		{ //panel0 - detailOnload
    UMEventArgs args = new UMEventArgs(Addr_psnDetailActivity.this);
    actionDetailOnload(panel0,args);

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
    UMEventArgs args = new UMEventArgs(Addr_psnDetailActivity.this);
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
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label0,"content","#{res.addr_oaadl_0011}"));
navigatorbar0.addView(label0);
label12 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL12
,"halign","center"
,"height","44"
,"color","#000000"
,"layout-type","linear"
,"font-size","12"
,"width","64"
,"font-family","default"
,"valign","center"
);
navigatorbar0.addView(label12);

return navigatorbar0;
}
public View getPanel20View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel20 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL20
,"height","40"
,"layout-type","linear"
,"width","fill"
,"margin-bottom","20"
,"valign","center"
);
label1 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL1
,"bindfield","name"
,"halign","left"
,"height","40"
,"color","#000000"
,"layout-type","linear"
,"font-size","18"
,"width","90"
,"font-family","default"
,"valign","center"
);
UMTextBinder label1_binder = new UMTextBinder((IUMContextAccessor)context);
label1_binder.setBindInfo(new BindInfo("name"));
label1_binder.setControl(label1);
binderGroup.addBinderToGroup(ID_LABEL1, label1_binder);
panel20.addView(label1);
label13 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL13
,"bindfield","job"
,"halign","left"
,"height","20"
,"weight","1"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","0"
,"font-family","default"
,"margin-top","5"
,"valign","center"
);
UMTextBinder label13_binder = new UMTextBinder((IUMContextAccessor)context);
label13_binder.setBindInfo(new BindInfo("job"));
label13_binder.setControl(label13);
binderGroup.addBinderToGroup(ID_LABEL13, label13_binder);
panel20.addView(label13);

return panel20;
}
public View getPanel2View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel2 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL2
,"halign","center"
,"height","fill"
,"weight","1"
,"layout-type","linear"
,"width","0"
,"margin-left","15"
);
View panel20 = (View) getPanel20View((UMActivity)context,binderGroup,configure);
panel2.addView(panel20);
label2 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL2
,"bindfield","dept"
,"halign","left"
,"height","20"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","fill"
,"margin-bottom","10"
,"font-family","default"
,"valign","center"
);
UMTextBinder label2_binder = new UMTextBinder((IUMContextAccessor)context);
label2_binder.setBindInfo(new BindInfo("dept"));
label2_binder.setControl(label2);
binderGroup.addBinderToGroup(ID_LABEL2, label2_binder);
panel2.addView(label2);
label3 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL3
,"bindfield","buzunit"
,"halign","left"
,"height","20"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","fill"
,"font-family","default"
,"valign","center"
);
UMTextBinder label3_binder = new UMTextBinder((IUMContextAccessor)context);
label3_binder.setBindInfo(new BindInfo("buzunit"));
label3_binder.setControl(label3);
binderGroup.addBinderToGroup(ID_LABEL3, label3_binder);
panel2.addView(label3);

return panel2;
}
public View getPanel1View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel1 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL1
,"padding-right","15"
,"padding-left","15"
,"padding-top","15"
,"height","140"
,"layout-type","linear"
,"width","fill"
,"valign","center"
,"padding-bottom","15"
);
image0 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_IMAGE0
,"height","110"
,"layout-type","linear"
,"width","90"
,"scaletype","fitcenter"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,image0,"src","#{photo}"));
panel1.addView(image0);
View panel2 = (View) getPanel2View((UMActivity)context,binderGroup,configure);
panel1.addView(panel2);

return panel1;
}
public View getPanel3View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel3 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL3
,"padding-left","15"
,"padding-right","15"
,"height","44"
,"layout-type","linear"
,"width","fill"
,"valign","center"
,"background-image","oaadl_44_top.png"
);
label4 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL4
,"halign","left"
,"height","fill"
,"color","#000000"
,"layout-type","linear"
,"font-size","16"
,"width","85"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label4,"content","#{res.addr_oaadl_0012}"));
panel3.addView(label4);
label5 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL5
,"bindfield","mobileno"
,"halign","right"
,"weight","1"
,"width","0"
,"margin-right","15"
,"height","fill"
,"color","#8e8e93"
,"font-size","16"
,"layout-type","linear"
,"font-family","default"
,"valign","center"
,"readonly","true"
);
UMTextBinder label5_binder = new UMTextBinder((IUMContextAccessor)context);
label5_binder.setBindInfo(new BindInfo("mobileno"));
label5_binder.setControl(label5);
binderGroup.addBinderToGroup(ID_LABEL5, label5_binder);
panel3.addView(label5);
image1 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_IMAGE1
,"padding-left","1"
,"padding-right","1"
,"padding-top","1"
,"height","44"
,"layout-type","linear"
,"width","44"
,"onclick","callMobilePhone"
,"scaletype","fitcenter"
,"src","oaadl_mobile.png"
,"padding-bottom","1"
);
image1.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Addr_psnDetailActivity.this);
    actionCallMobilePhone(image1,args);

}
});
panel3.addView(image1);
image5 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_IMAGE5
,"padding-left","1"
,"padding-right","1"
,"padding-top","1"
,"height","44"
,"layout-type","linear"
,"width","44"
,"onclick","sendMsg"
,"scaletype","fitcenter"
,"src","oaadl_message.png"
,"padding-bottom","1"
);
image5.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Addr_psnDetailActivity.this);
    actionSendMsg(image5,args);

}
});
panel3.addView(image5);

return panel3;
}
public View getPanel4View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel4 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL4
,"padding-left","15"
,"padding-right","15"
,"height","44"
,"layout-type","linear"
,"width","fill"
,"valign","center"
,"background-image","oaadl_44_mid.png"
);
label6 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL6
,"halign","left"
,"height","fill"
,"color","#000000"
,"layout-type","linear"
,"font-size","16"
,"width","85"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label6,"content","#{res.addr_oaadl_0013}"));
panel4.addView(label6);
label8 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL8
,"bindfield","officephone"
,"margin-right","15"
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
UMTextBinder label8_binder = new UMTextBinder((IUMContextAccessor)context);
label8_binder.setBindInfo(new BindInfo("officephone"));
label8_binder.setControl(label8);
binderGroup.addBinderToGroup(ID_LABEL8, label8_binder);
panel4.addView(label8);
image2 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_IMAGE2
,"padding-right","1"
,"padding-left","1"
,"padding-top","1"
,"height","44"
,"layout-type","linear"
,"width","44"
,"onclick","callOfficePhone"
,"scaletype","fitcenter"
,"src","oaadl_telephone.png"
,"padding-bottom","1"
);
image2.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Addr_psnDetailActivity.this);
    actionCallOfficePhone(image2,args);

}
});
panel4.addView(image2);

return panel4;
}
public View getPanel5View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel5 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL5
,"padding-left","15"
,"padding-right","15"
,"height","44.0"
,"layout-type","linear"
,"width","fill"
,"valign","center"
,"background-image","oaadl_44_down.png"
);
label7 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL7
,"halign","left"
,"height","fill"
,"color","#000000"
,"layout-type","linear"
,"font-size","16"
,"width","85"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label7,"content","#{res.addr_oaadl_0014}"));
panel5.addView(label7);
label9 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL9
,"bindfield","email"
,"margin-right","15"
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
UMTextBinder label9_binder = new UMTextBinder((IUMContextAccessor)context);
label9_binder.setBindInfo(new BindInfo("email"));
label9_binder.setControl(label9);
binderGroup.addBinderToGroup(ID_LABEL9, label9_binder);
panel5.addView(label9);
image3 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_IMAGE3
,"padding-right","1"
,"padding-left","1"
,"padding-top","1"
,"height","44"
,"layout-type","linear"
,"width","44"
,"onclick","sendEmail"
,"scaletype","fitcenter"
,"src","oaadl_mail.png"
,"padding-bottom","1"
);
image3.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Addr_psnDetailActivity.this);
    actionSendEmail(image3,args);

}
});
panel5.addView(image3);

return panel5;
}
public View getRoundimgdiv0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
roundimgdiv0 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_ROUNDIMGDIV0
,"halign","center"
,"height","132"
,"layout-type","linear"
,"width","fill"
,"margin-bottom","20"
);
View panel3 = (View) getPanel3View((UMActivity)context,binderGroup,configure);
roundimgdiv0.addView(panel3);
View panel4 = (View) getPanel4View((UMActivity)context,binderGroup,configure);
roundimgdiv0.addView(panel4);
View panel5 = (View) getPanel5View((UMActivity)context,binderGroup,configure);
roundimgdiv0.addView(panel5);

return roundimgdiv0;
}
public View getRoundimgdiv1View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
roundimgdiv1 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_ROUNDIMGDIV1
,"padding-left","15"
,"padding-right","15"
,"height","44"
,"layout-type","linear"
,"width","fill"
,"valign","center"
,"background-image","oaadl_44_one.png"
);
label10 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL10
,"halign","left"
,"height","fill"
,"color","#000000"
,"layout-type","linear"
,"font-size","16"
,"width","85"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,label10,"content","#{res.addr_oaadl_0002}"));
roundimgdiv1.addView(label10);
label11 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL11
,"bindfield","pgroupnames"
,"halign","right"
,"weight","1"
,"width","0"
,"margin-right","15"
,"height","fill"
,"color","#000000"
,"font-size","16"
,"layout-type","linear"
,"onclick","changePGroup"
,"font-family","default"
,"valign","center"
);
UMTextBinder label11_binder = new UMTextBinder((IUMContextAccessor)context);
label11_binder.setBindInfo(new BindInfo("pgroupnames"));
label11_binder.setControl(label11);
binderGroup.addBinderToGroup(ID_LABEL11, label11_binder);
label11.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Addr_psnDetailActivity.this);
    actionChangePGroup(label11,args);

}
});
roundimgdiv1.addView(label11);
image4 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_IMAGE4
,"height","13"
,"layout-type","linear"
,"width","8"
,"onclick","changePGroup"
,"scaletype","fitcenter"
,"src","oaadl_arrow.png"
);
image4.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Addr_psnDetailActivity.this);
    actionChangePGroup(image4,args);

}
});
roundimgdiv1.addView(image4);

return roundimgdiv1;
}
public View getPanel0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel0 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL0
,"halign","center"
,"height","0"
,"weight","1"
,"onload","detailOnload"
,"layout-type","linear"
,"background","#efeff4"
,"width","fill"
);
View panel1 = (View) getPanel1View((UMActivity)context,binderGroup,configure);
panel0.addView(panel1);
View roundimgdiv0 = (View) getRoundimgdiv0View((UMActivity)context,binderGroup,configure);
panel0.addView(roundimgdiv0);
View roundimgdiv1 = (View) getRoundimgdiv1View((UMActivity)context,binderGroup,configure);
panel0.addView(roundimgdiv1);

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
,"halign","left"
,"weight","1"
,"width","0"
,"font-pressed-color","#f2adb2"
,"height","fill"
,"color","#e50011"
,"font-size","17"
,"layout-type","linear"
,"onclick","saveContacts"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,button1,"value","#{res.addr_oaadl_0015}"));
button1.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Addr_psnDetailActivity.this);
    actionSaveContacts(button1,args);

}
});
toolbar0.addView(button1);
button2 = (UMButton)ThirdControl.createControl(new UMButton(context),ID_BUTTON2
,"halign","right"
,"weight","1"
,"width","0"
,"font-pressed-color","#f2adb2"
,"height","fill"
,"color","#e50011"
,"font-size","17"
,"layout-type","linear"
,"onclick","forwardCard"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,button2,"value","#{res.addr_oaadl_0016}"));
button2.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Addr_psnDetailActivity.this);
    actionForwardCard(button2,args);

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
psnDetail = (UMWindow)ThirdControl.createControl(new UMWindow(context),ID_PSNDETAIL
,"halign","center"
,"height","fill"
,"layout","vbox"
,"width","fill"
,"context","psndetail"
,"controller","psnDetailController"
,"namespace","nc.bs.oa.oama.ecm"
);
View viewPage0 = (View) getViewPage0View((UMActivity)context,binderGroup,configure);
psnDetail.addView(viewPage0);

return (UMWindow)psnDetail;
}

	
	public void actionCacheDetail(View control, UMEventArgs args) {
    String actionid = "cacheDetail";
    args.put("oldrow","#{plug.row}");
    args.put("userid","#{app.userid}");
    args.put("oldtype","#{plug.type}");
    args.put("groupid","#{app.groupid}");
    args.put("containerName","");
    args.put("row","#{CONTEXT}");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "cacheDetail",UMActivity.getViewId(control),args);
}
public void actionSendMsg(View control, UMEventArgs args) {
    String actionid = "sendMsg";
    args.put("message","你好：");
  this.dataCollect();
    args.put("receive","#{mobileno}");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMDevice.sendMessage(args);
}
public void actionChangePGroup(View control, UMEventArgs args) {
    String actionid = "changePGroup";
    args.put("viewid","nc.bs.oa.oama.ecm.Addr_psnUpdateGroup");
    args.put("callback","detailOnload");
    args.put("psnid","#{psnid}");
    args.put("iskeep","true");
    args.put("crows","#{pgroups}");
    args.put("psnjobid","#{psnjobid}");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.open(args);
}
public void actionCallOfficePhone(View control, UMEventArgs args) {
    String actionid = "callOfficePhone";
    args.put("tel","#{officephone}");
  this.dataCollect();
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMDevice.callPhone(args);
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
public void actionNoCache(View control, UMEventArgs args) {
    String actionid = "noCache";
  this.dataCollect();
    args.put("userid","#{app.userid}");
    args.put("containerName","");
    args.put("row","#{CONTEXT}");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "noCache",UMActivity.getViewId(control),args);
}
public void actionForwardCard(View control, UMEventArgs args) {
    String actionid = "forwardCard";
  this.dataCollect();
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "forwardCard",UMActivity.getViewId(control),args);
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
public void actionSendEmail(View control, UMEventArgs args) {
    String actionid = "sendEmail";
    args.put("content","#{name}");
    args.put("title","你好：#{name}");
  this.dataCollect();
    args.put("receive","#{email}");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMDevice.sendMail(args);
}
public void actionDetailOnload(View control, UMEventArgs args) {
    String actionid = "detailOnload";
  this.dataCollect();
    args.put("psnid","#{plug.psnid}");
    args.put("type","#{plug.type}");
    args.put("containerName","");
    args.put("row","#{plug.row}");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "detailOnload",UMActivity.getViewId(control),args);
}
public void actionCallMobilePhone(View control, UMEventArgs args) {
    String actionid = "callMobilePhone";
    args.put("tel","#{mobileno}");
  this.dataCollect();
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMDevice.callPhone(args);
}
public void actionSaveContacts(View control, UMEventArgs args) {
    String actionid = "saveContacts";
  this.dataCollect();
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "saveContacts",UMActivity.getViewId(control),args);
}
public void actionOnBack(View control, UMEventArgs args) {
    String actionid = "onBack";
  this.dataCollect();
    args.put("resultcode","15");
    args.put("iskeep","false");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.close(args);
}


}
