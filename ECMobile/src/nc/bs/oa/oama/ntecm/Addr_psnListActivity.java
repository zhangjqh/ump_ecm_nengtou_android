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

public abstract class Addr_psnListActivity extends UMWindowActivity {

	protected UMWindow psnList = null;
protected XVerticalLayout viewPage0 = null;
protected XHorizontalLayout navigatorbar0 = null;
protected UMButton button0 = null;
protected UMLabel label0 = null;
protected UMLabel label1 = null;
protected XVerticalLayout panel0 = null;
protected UMListViewBase listview0 = null;
protected XHorizontalLayout listview0_childWgt0 = null;
protected XHorizontalLayout listview0_childWgt0_panel1 = null;
protected UMImage listview0_childWgt0_image0 = null;
protected XVerticalLayout listview0_childWgt0_panel2 = null;
protected XHorizontalLayout listview0_childWgt0_panel3 = null;
protected UMLabel listview0_childWgt0_label0 = null;
protected UMLabel listview0_childWgt0_label2 = null;
protected XHorizontalLayout listview0_childWgt0_panel4 = null;
protected UMLabel listview0_childWgt0_label1 = null;
protected UMLabel listview0_childWgt0_label3 = null;
protected XHorizontalLayout listview0_childWgt0_panel15 = null;
protected UMImage listview0_childWgt0_image3 = null;
protected XHorizontalLayout listview0_childWgt1 = null;
protected XHorizontalLayout listview0_childWgt1_panel11 = null;
protected UMImage listview0_childWgt1_image2 = null;
protected XVerticalLayout listview0_childWgt1_panel12 = null;
protected XHorizontalLayout listview0_childWgt1_panel13 = null;
protected UMLabel listview0_childWgt1_label8 = null;
protected UMLabel listview0_childWgt1_label9 = null;
protected XHorizontalLayout listview0_childWgt1_panel14 = null;
protected UMLabel listview0_childWgt1_label10 = null;
protected UMLabel listview0_childWgt1_label11 = null;
protected XHorizontalLayout listview0_childWgt1_panel17 = null;
protected UMImage listview0_childWgt1_image5 = null;
protected XHorizontalLayout listview0_childWgt2 = null;
protected XHorizontalLayout listview0_childWgt2_panel7 = null;
protected UMImage listview0_childWgt2_image1 = null;
protected XVerticalLayout listview0_childWgt2_panel8 = null;
protected XHorizontalLayout listview0_childWgt2_panel9 = null;
protected UMLabel listview0_childWgt2_label4 = null;
protected UMLabel listview0_childWgt2_label5 = null;
protected XHorizontalLayout listview0_childWgt2_panel10 = null;
protected UMLabel listview0_childWgt2_label6 = null;
protected UMLabel listview0_childWgt2_label7 = null;
protected XHorizontalLayout listview0_childWgt2_panel16 = null;
protected UMImage listview0_childWgt2_image4 = null;

	
	protected final static int ID_PSNLIST = 404756773;
protected final static int ID_VIEWPAGE0 = 1904604069;
protected final static int ID_NAVIGATORBAR0 = 36845669;
protected final static int ID_BUTTON0 = 1065944933;
protected final static int ID_LABEL0 = 1483563238;
protected final static int ID_LABEL1 = 1684509889;
protected final static int ID_PANEL0 = 1665949332;
protected final static int ID_LISTVIEW0 = 1176210194;
protected final static int ID_LISTVIEW0_CHILDWGT0 = 1856760714;
protected final static int ID_LISTVIEW0_CHILDWGT0_PANEL1 = 1999478613;
protected final static int ID_LISTVIEW0_CHILDWGT0_IMAGE0 = 1761720105;
protected final static int ID_LISTVIEW0_CHILDWGT0_PANEL2 = 1508759035;
protected final static int ID_LISTVIEW0_CHILDWGT0_PANEL3 = 1449029843;
protected final static int ID_LISTVIEW0_CHILDWGT0_LABEL0 = 62902165;
protected final static int ID_LISTVIEW0_CHILDWGT0_LABEL2 = 16368667;
protected final static int ID_LISTVIEW0_CHILDWGT0_PANEL4 = 1329542394;
protected final static int ID_LISTVIEW0_CHILDWGT0_LABEL1 = 1127506627;
protected final static int ID_LISTVIEW0_CHILDWGT0_LABEL3 = 572612098;
protected final static int ID_LISTVIEW0_CHILDWGT0_PANEL15 = 415587975;
protected final static int ID_LISTVIEW0_CHILDWGT0_IMAGE3 = 495454874;
protected final static int ID_LISTVIEW0_CHILDWGT1 = 1781865862;
protected final static int ID_LISTVIEW0_CHILDWGT1_PANEL11 = 236625845;
protected final static int ID_LISTVIEW0_CHILDWGT1_IMAGE2 = 944718629;
protected final static int ID_LISTVIEW0_CHILDWGT1_PANEL12 = 1224214630;
protected final static int ID_LISTVIEW0_CHILDWGT1_PANEL13 = 94872808;
protected final static int ID_LISTVIEW0_CHILDWGT1_LABEL8 = 734302046;
protected final static int ID_LISTVIEW0_CHILDWGT1_LABEL9 = 920578200;
protected final static int ID_LISTVIEW0_CHILDWGT1_PANEL14 = 218456696;
protected final static int ID_LISTVIEW0_CHILDWGT1_LABEL10 = 1912941829;
protected final static int ID_LISTVIEW0_CHILDWGT1_LABEL11 = 696048210;
protected final static int ID_LISTVIEW0_CHILDWGT1_PANEL17 = 1752289687;
protected final static int ID_LISTVIEW0_CHILDWGT1_IMAGE5 = 2122843644;
protected final static int ID_LISTVIEW0_CHILDWGT2 = 711586579;
protected final static int ID_LISTVIEW0_CHILDWGT2_PANEL7 = 1938750363;
protected final static int ID_LISTVIEW0_CHILDWGT2_IMAGE1 = 803917417;
protected final static int ID_LISTVIEW0_CHILDWGT2_PANEL8 = 1056079490;
protected final static int ID_LISTVIEW0_CHILDWGT2_PANEL9 = 1992368731;
protected final static int ID_LISTVIEW0_CHILDWGT2_LABEL4 = 843763987;
protected final static int ID_LISTVIEW0_CHILDWGT2_LABEL5 = 1583543105;
protected final static int ID_LISTVIEW0_CHILDWGT2_PANEL10 = 457231141;
protected final static int ID_LISTVIEW0_CHILDWGT2_LABEL6 = 1622330541;
protected final static int ID_LISTVIEW0_CHILDWGT2_LABEL7 = 40173032;
protected final static int ID_LISTVIEW0_CHILDWGT2_PANEL16 = 1670384530;
protected final static int ID_LISTVIEW0_CHILDWGT2_IMAGE4 = 1769137177;

	
	
	@Override
	public String getControllerName() {
		return "psnListController";
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
		  idmap.put("psnList",ID_PSNLIST);
  idmap.put("viewPage0",ID_VIEWPAGE0);
  idmap.put("navigatorbar0",ID_NAVIGATORBAR0);
  idmap.put("button0",ID_BUTTON0);
  idmap.put("label0",ID_LABEL0);
  idmap.put("label1",ID_LABEL1);
  idmap.put("panel0",ID_PANEL0);
  idmap.put("listview0",ID_LISTVIEW0);
  idmap.put("listview0_childWgt0",ID_LISTVIEW0_CHILDWGT0);
  idmap.put("listview0_childWgt0_panel1",ID_LISTVIEW0_CHILDWGT0_PANEL1);
  idmap.put("listview0_childWgt0_image0",ID_LISTVIEW0_CHILDWGT0_IMAGE0);
  idmap.put("listview0_childWgt0_panel2",ID_LISTVIEW0_CHILDWGT0_PANEL2);
  idmap.put("listview0_childWgt0_panel3",ID_LISTVIEW0_CHILDWGT0_PANEL3);
  idmap.put("listview0_childWgt0_label0",ID_LISTVIEW0_CHILDWGT0_LABEL0);
  idmap.put("listview0_childWgt0_label2",ID_LISTVIEW0_CHILDWGT0_LABEL2);
  idmap.put("listview0_childWgt0_panel4",ID_LISTVIEW0_CHILDWGT0_PANEL4);
  idmap.put("listview0_childWgt0_label1",ID_LISTVIEW0_CHILDWGT0_LABEL1);
  idmap.put("listview0_childWgt0_label3",ID_LISTVIEW0_CHILDWGT0_LABEL3);
  idmap.put("listview0_childWgt0_panel15",ID_LISTVIEW0_CHILDWGT0_PANEL15);
  idmap.put("listview0_childWgt0_image3",ID_LISTVIEW0_CHILDWGT0_IMAGE3);
  idmap.put("listview0_childWgt1",ID_LISTVIEW0_CHILDWGT1);
  idmap.put("listview0_childWgt1_panel11",ID_LISTVIEW0_CHILDWGT1_PANEL11);
  idmap.put("listview0_childWgt1_image2",ID_LISTVIEW0_CHILDWGT1_IMAGE2);
  idmap.put("listview0_childWgt1_panel12",ID_LISTVIEW0_CHILDWGT1_PANEL12);
  idmap.put("listview0_childWgt1_panel13",ID_LISTVIEW0_CHILDWGT1_PANEL13);
  idmap.put("listview0_childWgt1_label8",ID_LISTVIEW0_CHILDWGT1_LABEL8);
  idmap.put("listview0_childWgt1_label9",ID_LISTVIEW0_CHILDWGT1_LABEL9);
  idmap.put("listview0_childWgt1_panel14",ID_LISTVIEW0_CHILDWGT1_PANEL14);
  idmap.put("listview0_childWgt1_label10",ID_LISTVIEW0_CHILDWGT1_LABEL10);
  idmap.put("listview0_childWgt1_label11",ID_LISTVIEW0_CHILDWGT1_LABEL11);
  idmap.put("listview0_childWgt1_panel17",ID_LISTVIEW0_CHILDWGT1_PANEL17);
  idmap.put("listview0_childWgt1_image5",ID_LISTVIEW0_CHILDWGT1_IMAGE5);
  idmap.put("listview0_childWgt2",ID_LISTVIEW0_CHILDWGT2);
  idmap.put("listview0_childWgt2_panel7",ID_LISTVIEW0_CHILDWGT2_PANEL7);
  idmap.put("listview0_childWgt2_image1",ID_LISTVIEW0_CHILDWGT2_IMAGE1);
  idmap.put("listview0_childWgt2_panel8",ID_LISTVIEW0_CHILDWGT2_PANEL8);
  idmap.put("listview0_childWgt2_panel9",ID_LISTVIEW0_CHILDWGT2_PANEL9);
  idmap.put("listview0_childWgt2_label4",ID_LISTVIEW0_CHILDWGT2_LABEL4);
  idmap.put("listview0_childWgt2_label5",ID_LISTVIEW0_CHILDWGT2_LABEL5);
  idmap.put("listview0_childWgt2_panel10",ID_LISTVIEW0_CHILDWGT2_PANEL10);
  idmap.put("listview0_childWgt2_label6",ID_LISTVIEW0_CHILDWGT2_LABEL6);
  idmap.put("listview0_childWgt2_label7",ID_LISTVIEW0_CHILDWGT2_LABEL7);
  idmap.put("listview0_childWgt2_panel16",ID_LISTVIEW0_CHILDWGT2_PANEL16);
  idmap.put("listview0_childWgt2_image4",ID_LISTVIEW0_CHILDWGT2_IMAGE4);

	}
	
	public void onLoad() {
		ULog.logLC("onLoad", this);
		if(currentPage!=null) {
			currentPage.onLoad();
		}
	
		{ //listview0 - listViewOnload
    UMEventArgs args = new UMEventArgs(Addr_psnListActivity.this);
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
    UMEventArgs args = new UMEventArgs(Addr_psnListActivity.this);
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
public View getListview0_childWgt0_panel1View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt0_panel1 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT0_PANEL1
,"margin-right","8"
,"height","70"
,"layout-type","linear"
,"width","25"
,"valign","center"
);
listview0_childWgt0_image0 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_LISTVIEW0_CHILDWGT0_IMAGE0
,"height","25"
,"layout-type","linear"
,"width","25"
,"scaletype","fitcenter"
,"src","oaadl_detail_nosex.png"
);
listview0_childWgt0_panel1.addView(listview0_childWgt0_image0);

return listview0_childWgt0_panel1;
}
public View getListview0_childWgt0_panel3View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt0_panel3 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT0_PANEL3
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
,"width","123"
,"font-family","default"
,"valign","center"
);
UMTextBinder listview0_childWgt0_label0_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt0_label0_binder.setBindInfo(new BindInfo("name"));
listview0_childWgt0_label0_binder.setControl(listview0_childWgt0_label0);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT0_LABEL0, listview0_childWgt0_label0_binder);
listview0_childWgt0_panel3.addView(listview0_childWgt0_label0);
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
listview0_childWgt0_panel3.addView(listview0_childWgt0_label2);

return listview0_childWgt0_panel3;
}
public View getListview0_childWgt0_panel4View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt0_panel4 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT0_PANEL4
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
,"width","123"
,"font-family","default"
,"valign","center"
);
UMTextBinder listview0_childWgt0_label1_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt0_label1_binder.setBindInfo(new BindInfo("mobileno"));
listview0_childWgt0_label1_binder.setControl(listview0_childWgt0_label1);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT0_LABEL1, listview0_childWgt0_label1_binder);
listview0_childWgt0_panel4.addView(listview0_childWgt0_label1);
listview0_childWgt0_label3 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT0_LABEL3
,"bindfield","job"
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
listview0_childWgt0_label3_binder.setBindInfo(new BindInfo("job"));
listview0_childWgt0_label3_binder.setControl(listview0_childWgt0_label3);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT0_LABEL3, listview0_childWgt0_label3_binder);
listview0_childWgt0_panel4.addView(listview0_childWgt0_label3);

return listview0_childWgt0_panel4;
}
public View getListview0_childWgt0_panel2View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt0_panel2 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_LISTVIEW0_CHILDWGT0_PANEL2
,"padding-left","3"
,"halign","center"
,"height","fill"
,"weight","1"
,"layout-type","linear"
,"width","0"
);
View listview0_childWgt0_panel3 = (View) getListview0_childWgt0_panel3View((UMActivity)context,binderGroup,configure);
listview0_childWgt0_panel2.addView(listview0_childWgt0_panel3);
View listview0_childWgt0_panel4 = (View) getListview0_childWgt0_panel4View((UMActivity)context,binderGroup,configure);
listview0_childWgt0_panel2.addView(listview0_childWgt0_panel4);

return listview0_childWgt0_panel2;
}
public View getListview0_childWgt0_panel15View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt0_panel15 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT0_PANEL15
,"margin-right","15"
,"height","fill"
,"layout-type","linear"
,"width","8"
,"margin-left","8"
,"valign","center"
);
listview0_childWgt0_image3 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_LISTVIEW0_CHILDWGT0_IMAGE3
,"height","13"
,"layout-type","linear"
,"width","8"
,"scaletype","fitcenter"
,"src","oaadl_arrow.png"
);
listview0_childWgt0_panel15.addView(listview0_childWgt0_image3);

return listview0_childWgt0_panel15;
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
    UMEventArgs args = new UMEventArgs(Addr_psnListActivity.this);
    int position = this.getPosition(v);
    if(position>=0) {
      context.getCursor("cursorpersonsalias").setCurrentIndex(position);
    }
    actionToPsnDetail(listview0_childWgt0,args);

}
});
View listview0_childWgt0_panel1 = (View) getListview0_childWgt0_panel1View((UMActivity)context,binderGroup,configure);
listview0_childWgt0.addView(listview0_childWgt0_panel1);
View listview0_childWgt0_panel2 = (View) getListview0_childWgt0_panel2View((UMActivity)context,binderGroup,configure);
listview0_childWgt0.addView(listview0_childWgt0_panel2);
View listview0_childWgt0_panel15 = (View) getListview0_childWgt0_panel15View((UMActivity)context,binderGroup,configure);
listview0_childWgt0.addView(listview0_childWgt0_panel15);

return listview0_childWgt0;
}
public View getListview0_childWgt1_panel11View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt1_panel11 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT1_PANEL11
,"margin-right","8"
,"height","70"
,"layout-type","linear"
,"width","25"
,"valign","center"
);
listview0_childWgt1_image2 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_LISTVIEW0_CHILDWGT1_IMAGE2
,"height","25"
,"layout-type","linear"
,"width","25"
,"scaletype","fitcenter"
,"src","oaadl_detail_fm.png"
);
listview0_childWgt1_panel11.addView(listview0_childWgt1_image2);

return listview0_childWgt1_panel11;
}
public View getListview0_childWgt1_panel13View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt1_panel13 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT1_PANEL13
,"height","20"
,"layout-type","linear"
,"width","fill"
,"margin-bottom","7"
,"margin-top","13"
,"valign","center"
);
listview0_childWgt1_label8 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT1_LABEL8
,"bindfield","name"
,"halign","left"
,"height","fill"
,"color","#000000"
,"layout-type","linear"
,"font-size","16"
,"width","123"
,"font-family","default"
,"valign","center"
);
UMTextBinder listview0_childWgt1_label8_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt1_label8_binder.setBindInfo(new BindInfo("name"));
listview0_childWgt1_label8_binder.setControl(listview0_childWgt1_label8);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT1_LABEL8, listview0_childWgt1_label8_binder);
listview0_childWgt1_panel13.addView(listview0_childWgt1_label8);
listview0_childWgt1_label9 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT1_LABEL9
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
UMTextBinder listview0_childWgt1_label9_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt1_label9_binder.setBindInfo(new BindInfo("position"));
listview0_childWgt1_label9_binder.setControl(listview0_childWgt1_label9);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT1_LABEL9, listview0_childWgt1_label9_binder);
listview0_childWgt1_panel13.addView(listview0_childWgt1_label9);

return listview0_childWgt1_panel13;
}
public View getListview0_childWgt1_panel14View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt1_panel14 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT1_PANEL14
,"height","17"
,"layout-type","linear"
,"width","fill"
,"margin-bottom","13"
,"valign","center"
);
listview0_childWgt1_label10 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT1_LABEL10
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
UMTextBinder listview0_childWgt1_label10_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt1_label10_binder.setBindInfo(new BindInfo("mobileno"));
listview0_childWgt1_label10_binder.setControl(listview0_childWgt1_label10);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT1_LABEL10, listview0_childWgt1_label10_binder);
listview0_childWgt1_panel14.addView(listview0_childWgt1_label10);
listview0_childWgt1_label11 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT1_LABEL11
,"bindfield","job"
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
UMTextBinder listview0_childWgt1_label11_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt1_label11_binder.setBindInfo(new BindInfo("job"));
listview0_childWgt1_label11_binder.setControl(listview0_childWgt1_label11);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT1_LABEL11, listview0_childWgt1_label11_binder);
listview0_childWgt1_panel14.addView(listview0_childWgt1_label11);

return listview0_childWgt1_panel14;
}
public View getListview0_childWgt1_panel12View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt1_panel12 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_LISTVIEW0_CHILDWGT1_PANEL12
,"padding-left","3"
,"halign","center"
,"height","fill"
,"weight","1"
,"layout-type","linear"
,"width","0"
);
View listview0_childWgt1_panel13 = (View) getListview0_childWgt1_panel13View((UMActivity)context,binderGroup,configure);
listview0_childWgt1_panel12.addView(listview0_childWgt1_panel13);
View listview0_childWgt1_panel14 = (View) getListview0_childWgt1_panel14View((UMActivity)context,binderGroup,configure);
listview0_childWgt1_panel12.addView(listview0_childWgt1_panel14);

return listview0_childWgt1_panel12;
}
public View getListview0_childWgt1_panel17View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt1_panel17 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT1_PANEL17
,"margin-right","15"
,"height","fill"
,"layout-type","linear"
,"width","8"
,"margin-left","8"
,"valign","center"
);
listview0_childWgt1_image5 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_LISTVIEW0_CHILDWGT1_IMAGE5
,"height","13"
,"layout-type","linear"
,"width","8"
,"scaletype","fitcenter"
,"src","oaadl_arrow.png"
);
listview0_childWgt1_panel17.addView(listview0_childWgt1_image5);

return listview0_childWgt1_panel17;
}
public View getListview0_childWgt1View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt1 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT1
,"padding-left","8"
,"height","70"
,"layout-type","linear"
,"width","fill"
,"onclick","toPsnDetail"
,"valign","center"
,"background-image","oaadl_70_down.png"
);
listview0_childWgt1.setOnClickListener(new OnCursorClickListener(configure) {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Addr_psnListActivity.this);
    int position = this.getPosition(v);
    if(position>=0) {
      context.getCursor("cursorpersonsalias").setCurrentIndex(position);
    }
    actionToPsnDetail(listview0_childWgt1,args);

}
});
View listview0_childWgt1_panel11 = (View) getListview0_childWgt1_panel11View((UMActivity)context,binderGroup,configure);
listview0_childWgt1.addView(listview0_childWgt1_panel11);
View listview0_childWgt1_panel12 = (View) getListview0_childWgt1_panel12View((UMActivity)context,binderGroup,configure);
listview0_childWgt1.addView(listview0_childWgt1_panel12);
View listview0_childWgt1_panel17 = (View) getListview0_childWgt1_panel17View((UMActivity)context,binderGroup,configure);
listview0_childWgt1.addView(listview0_childWgt1_panel17);

return listview0_childWgt1;
}
public View getListview0_childWgt2_panel7View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt2_panel7 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT2_PANEL7
,"margin-right","8"
,"height","70"
,"layout-type","linear"
,"width","25"
,"valign","center"
);
listview0_childWgt2_image1 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_LISTVIEW0_CHILDWGT2_IMAGE1
,"height","25"
,"layout-type","linear"
,"width","25"
,"scaletype","fitcenter"
,"src","oaadl_detail_fa.png"
);
listview0_childWgt2_panel7.addView(listview0_childWgt2_image1);

return listview0_childWgt2_panel7;
}
public View getListview0_childWgt2_panel9View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt2_panel9 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT2_PANEL9
,"height","20"
,"layout-type","linear"
,"width","fill"
,"margin-bottom","7"
,"margin-top","13"
,"valign","center"
);
listview0_childWgt2_label4 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT2_LABEL4
,"bindfield","name"
,"halign","left"
,"height","fill"
,"color","#000000"
,"layout-type","linear"
,"font-size","16"
,"width","123"
,"font-family","default"
,"valign","center"
);
UMTextBinder listview0_childWgt2_label4_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt2_label4_binder.setBindInfo(new BindInfo("name"));
listview0_childWgt2_label4_binder.setControl(listview0_childWgt2_label4);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT2_LABEL4, listview0_childWgt2_label4_binder);
listview0_childWgt2_panel9.addView(listview0_childWgt2_label4);
listview0_childWgt2_label5 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT2_LABEL5
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
UMTextBinder listview0_childWgt2_label5_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt2_label5_binder.setBindInfo(new BindInfo("position"));
listview0_childWgt2_label5_binder.setControl(listview0_childWgt2_label5);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT2_LABEL5, listview0_childWgt2_label5_binder);
listview0_childWgt2_panel9.addView(listview0_childWgt2_label5);

return listview0_childWgt2_panel9;
}
public View getListview0_childWgt2_panel10View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt2_panel10 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT2_PANEL10
,"height","17"
,"layout-type","linear"
,"width","fill"
,"margin-bottom","13"
,"valign","center"
);
listview0_childWgt2_label6 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT2_LABEL6
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
UMTextBinder listview0_childWgt2_label6_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt2_label6_binder.setBindInfo(new BindInfo("mobileno"));
listview0_childWgt2_label6_binder.setControl(listview0_childWgt2_label6);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT2_LABEL6, listview0_childWgt2_label6_binder);
listview0_childWgt2_panel10.addView(listview0_childWgt2_label6);
listview0_childWgt2_label7 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT2_LABEL7
,"bindfield","job"
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
UMTextBinder listview0_childWgt2_label7_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt2_label7_binder.setBindInfo(new BindInfo("job"));
listview0_childWgt2_label7_binder.setControl(listview0_childWgt2_label7);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT2_LABEL7, listview0_childWgt2_label7_binder);
listview0_childWgt2_panel10.addView(listview0_childWgt2_label7);

return listview0_childWgt2_panel10;
}
public View getListview0_childWgt2_panel8View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt2_panel8 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_LISTVIEW0_CHILDWGT2_PANEL8
,"padding-left","3"
,"halign","center"
,"height","fill"
,"weight","1"
,"layout-type","linear"
,"width","0"
);
View listview0_childWgt2_panel9 = (View) getListview0_childWgt2_panel9View((UMActivity)context,binderGroup,configure);
listview0_childWgt2_panel8.addView(listview0_childWgt2_panel9);
View listview0_childWgt2_panel10 = (View) getListview0_childWgt2_panel10View((UMActivity)context,binderGroup,configure);
listview0_childWgt2_panel8.addView(listview0_childWgt2_panel10);

return listview0_childWgt2_panel8;
}
public View getListview0_childWgt2_panel16View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt2_panel16 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT2_PANEL16
,"margin-right","15"
,"height","fill"
,"layout-type","linear"
,"width","8"
,"margin-left","8"
,"valign","center"
);
listview0_childWgt2_image4 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_LISTVIEW0_CHILDWGT2_IMAGE4
,"height","13"
,"layout-type","linear"
,"width","8"
,"scaletype","fitcenter"
,"src","oaadl_arrow.png"
);
listview0_childWgt2_panel16.addView(listview0_childWgt2_image4);

return listview0_childWgt2_panel16;
}
public View getListview0_childWgt2View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt2 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT2
,"padding-left","8"
,"height","70"
,"layout-type","linear"
,"width","fill"
,"onclick","toPsnDetail"
,"valign","center"
,"background-image","oaadl_70_down.png"
);
listview0_childWgt2.setOnClickListener(new OnCursorClickListener(configure) {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Addr_psnListActivity.this);
    int position = this.getPosition(v);
    if(position>=0) {
      context.getCursor("cursorpersonsalias").setCurrentIndex(position);
    }
    actionToPsnDetail(listview0_childWgt2,args);

}
});
View listview0_childWgt2_panel7 = (View) getListview0_childWgt2_panel7View((UMActivity)context,binderGroup,configure);
listview0_childWgt2.addView(listview0_childWgt2_panel7);
View listview0_childWgt2_panel8 = (View) getListview0_childWgt2_panel8View((UMActivity)context,binderGroup,configure);
listview0_childWgt2.addView(listview0_childWgt2_panel8);
View listview0_childWgt2_panel16 = (View) getListview0_childWgt2_panel16View((UMActivity)context,binderGroup,configure);
listview0_childWgt2.addView(listview0_childWgt2_panel16);

return listview0_childWgt2;
}
public View getListview0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0 = (UMListViewBase)ThirdControl.createControl(new UMListViewBase(context),ID_LISTVIEW0
,"onuprefersh","listViewOnload"
,"bindfield","persons"
,"height","fill"
,"childindicator","personListRowWidget"
,"ondownrefersh","getNextPage"
,"onload","listViewOnload"
,"cursoraction","cursorpersonsalias"
,"layout-type","linear"
,"background","#efeff4"
,"width","fill"
,"synccontext","persons"
);
context.createCursor("cursorpersonsalias", "persons");
UMListBinder listview0_binder = new UMListBinder((IUMContextAccessor)context);
listview0_binder.setBindInfo(new BindInfo("persons"));
listview0_binder.setControl(listview0);
binderGroup.addBinderToGroup(ID_LISTVIEW0, listview0_binder);
listview0.setEvent("onuprefersh", new OnCursorEventListener(configure) {
  @Override
  public void onEvent(View v, UMEventArgs parent) {
    UMEventArgs args = new UMEventArgs(Addr_psnListActivity.this);
    args.put(parent);
    actionListViewOnload(listview0,args);

}
});
listview0.setEvent("ondownrefersh", new OnCursorEventListener(configure) {
  @Override
  public void onEvent(View v, UMEventArgs parent) {
    UMEventArgs args = new UMEventArgs(Addr_psnListActivity.this);
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
psnList = (UMWindow)ThirdControl.createControl(new UMWindow(context),ID_PSNLIST
,"halign","center"
,"height","fill"
,"layout","vbox"
,"width","fill"
,"context","psnList"
,"controller","psnListController"
,"namespace","nc.bs.oa.oama.ecm"
);
View viewPage0 = (View) getViewPage0View((UMActivity)context,binderGroup,configure);
psnList.addView(viewPage0);

return (UMWindow)psnList;
}

	
	public void actionGetPhotoCallback(View control, UMEventArgs args) {
    String actionid = "getPhotoCallback";
    args.put("userid","#{app.userid}");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "getPhotoCallback",UMActivity.getViewId(control),args);
}
public void actionToPsnDetail(View control, UMEventArgs args) {
    String actionid = "toPsnDetail";
    args.put("viewid","nc.bs.oa.oama.ecm.Addr_psnDetail");
  this.dataCollect();
    args.put("iskeep","true");
    args.put("type","normal");
    args.put("containerName","");
    args.put("row","#{#{cursor.cursorpersonsalias}}");
    args.put("row_arrayPath","persons");
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
public void actionOnloadCallback(View control, UMEventArgs args) {
    String actionid = "onloadCallback";
    args.put("userid","#{app.userid}");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "onloadCallback",UMActivity.getViewId(control),args);
}
public void actionGetNextPage(View control, UMEventArgs args) {
    String actionid = "getNextPage";
    args.put("type","#{plug.type}");
    args.put("containerName","");
    args.put("row","#{plug.row}");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "getNextPage",UMActivity.getViewId(control),args);
}
public void actionListViewOnload(View control, UMEventArgs args) {
    String actionid = "listViewOnload";
    args.put("type","#{plug.type}");
    args.put("containerName","");
    args.put("row","#{plug.row}");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "listViewOnload",UMActivity.getViewId(control),args);
}
public void actionUMonComplete(View control, UMEventArgs args) {
    String actionid = "UMonComplete";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "UMonComplete",UMActivity.getViewId(control),args);
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
