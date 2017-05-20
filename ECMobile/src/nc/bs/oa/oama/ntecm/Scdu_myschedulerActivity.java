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

public abstract class Scdu_myschedulerActivity extends UMWindowActivity {

	protected UMWindow myscheduler = null;
protected XVerticalLayout viewPage0 = null;
protected XHorizontalLayout navigatorbar0 = null;
protected UMButton button2 = null;
protected UMLabel label1 = null;
protected UMLabel label0 = null;
protected UMButton button1 = null;
protected UMButton button0 = null;
protected XVerticalLayout panel0 = null;
protected UMHRCalendarView calendar0 = null;
protected XVerticalLayout panel1 = null;
protected UMListViewBase listview0 = null;
protected XHorizontalLayout listview0_childWgt0 = null;
protected XVerticalLayout listview0_childWgt0_panel3 = null;
protected UMImage listview0_childWgt0_image0 = null;
protected XVerticalLayout listview0_childWgt0_panel4 = null;
protected XHorizontalLayout listview0_childWgt0_panel12 = null;
protected UMLabel listview0_childWgt0_label0 = null;
protected XHorizontalLayout listview0_childWgt0_panel13 = null;
protected UMImage listview0_childWgt0_image4 = null;
protected UMLabel listview0_childWgt0_label1 = null;
protected UMLabel listview0_childWgt0_label6 = null;
protected XHorizontalLayout listview0_childWgt0_panel14 = null;
protected UMLabel listview0_childWgt0_label2 = null;
protected UMLabel listview0_childWgt0_label3 = null;
protected UMLabel listview0_childWgt0_label4 = null;
protected XHorizontalLayout listview0_childWgt1 = null;
protected XVerticalLayout listview0_childWgt1_panel5 = null;
protected UMImage listview0_childWgt1_image1 = null;
protected XVerticalLayout listview0_childWgt1_panel6 = null;
protected XHorizontalLayout listview0_childWgt1_panel15 = null;
protected UMLabel listview0_childWgt1_label5 = null;
protected XHorizontalLayout listview0_childWgt1_panel16 = null;
protected UMImage listview0_childWgt1_image5 = null;
protected UMLabel listview0_childWgt1_label11 = null;
protected UMLabel listview0_childWgt1_label16 = null;
protected XHorizontalLayout listview0_childWgt1_panel17 = null;
protected UMLabel listview0_childWgt1_label7 = null;
protected UMLabel listview0_childWgt1_label8 = null;
protected UMLabel listview0_childWgt1_label9 = null;
protected XHorizontalLayout listview0_childWgt2 = null;
protected XVerticalLayout listview0_childWgt2_panel7 = null;
protected UMImage listview0_childWgt2_image2 = null;
protected XVerticalLayout listview0_childWgt2_panel8 = null;
protected XHorizontalLayout listview0_childWgt2_panel18 = null;
protected UMLabel listview0_childWgt2_label10 = null;
protected XHorizontalLayout listview0_childWgt2_panel19 = null;
protected UMImage listview0_childWgt2_image6 = null;
protected UMLabel listview0_childWgt2_label20 = null;
protected UMLabel listview0_childWgt2_label21 = null;
protected XHorizontalLayout listview0_childWgt2_panel20 = null;
protected UMLabel listview0_childWgt2_label12 = null;
protected UMLabel listview0_childWgt2_label13 = null;
protected UMLabel listview0_childWgt2_label14 = null;
protected XHorizontalLayout listview0_childWgt3 = null;
protected XVerticalLayout listview0_childWgt3_panel10 = null;
protected UMImage listview0_childWgt3_image3 = null;
protected XVerticalLayout listview0_childWgt3_panel11 = null;
protected XHorizontalLayout listview0_childWgt3_panel21 = null;
protected UMLabel listview0_childWgt3_label15 = null;
protected XHorizontalLayout listview0_childWgt3_panel22 = null;
protected UMImage listview0_childWgt3_image7 = null;
protected UMLabel listview0_childWgt3_label22 = null;
protected UMLabel listview0_childWgt3_label23 = null;
protected XHorizontalLayout listview0_childWgt3_panel23 = null;
protected UMLabel listview0_childWgt3_label17 = null;
protected UMLabel listview0_childWgt3_label18 = null;
protected UMLabel listview0_childWgt3_label19 = null;
protected XHorizontalLayout panel2 = null;
protected XVerticalLayout widget0 = null;
protected XHorizontalLayout widget0_toolbar0 = null;
protected UMImageButton widget0_imagebutton0 = null;
protected UMImageButton widget0_imagebutton1 = null;

	
	protected final static int ID_MYSCHEDULER = 1957724519;
protected final static int ID_VIEWPAGE0 = 2087862830;
protected final static int ID_NAVIGATORBAR0 = 1275536868;
protected final static int ID_BUTTON2 = 1419563422;
protected final static int ID_LABEL1 = 1953903269;
protected final static int ID_LABEL0 = 2051427850;
protected final static int ID_BUTTON1 = 1123858201;
protected final static int ID_BUTTON0 = 771689469;
protected final static int ID_PANEL0 = 548011022;
protected final static int ID_CALENDAR0 = 966127460;
protected final static int ID_PANEL1 = 454365444;
protected final static int ID_LISTVIEW0 = 425493783;
protected final static int ID_LISTVIEW0_CHILDWGT0 = 437557219;
protected final static int ID_LISTVIEW0_CHILDWGT0_PANEL3 = 1085269729;
protected final static int ID_LISTVIEW0_CHILDWGT0_IMAGE0 = 962026439;
protected final static int ID_LISTVIEW0_CHILDWGT0_PANEL4 = 1232555599;
protected final static int ID_LISTVIEW0_CHILDWGT0_PANEL12 = 547335479;
protected final static int ID_LISTVIEW0_CHILDWGT0_LABEL0 = 105102517;
protected final static int ID_LISTVIEW0_CHILDWGT0_PANEL13 = 727921814;
protected final static int ID_LISTVIEW0_CHILDWGT0_IMAGE4 = 1023749992;
protected final static int ID_LISTVIEW0_CHILDWGT0_LABEL1 = 1580683928;
protected final static int ID_LISTVIEW0_CHILDWGT0_LABEL6 = 1687483634;
protected final static int ID_LISTVIEW0_CHILDWGT0_PANEL14 = 732122997;
protected final static int ID_LISTVIEW0_CHILDWGT0_LABEL2 = 328540195;
protected final static int ID_LISTVIEW0_CHILDWGT0_LABEL3 = 167776616;
protected final static int ID_LISTVIEW0_CHILDWGT0_LABEL4 = 1170474423;
protected final static int ID_LISTVIEW0_CHILDWGT1 = 748107247;
protected final static int ID_LISTVIEW0_CHILDWGT1_PANEL5 = 516308373;
protected final static int ID_LISTVIEW0_CHILDWGT1_IMAGE1 = 733211742;
protected final static int ID_LISTVIEW0_CHILDWGT1_PANEL6 = 288279910;
protected final static int ID_LISTVIEW0_CHILDWGT1_PANEL15 = 1680860409;
protected final static int ID_LISTVIEW0_CHILDWGT1_LABEL5 = 812191267;
protected final static int ID_LISTVIEW0_CHILDWGT1_PANEL16 = 1412926257;
protected final static int ID_LISTVIEW0_CHILDWGT1_IMAGE5 = 537959313;
protected final static int ID_LISTVIEW0_CHILDWGT1_LABEL11 = 1577480481;
protected final static int ID_LISTVIEW0_CHILDWGT1_LABEL16 = 83643611;
protected final static int ID_LISTVIEW0_CHILDWGT1_PANEL17 = 797911201;
protected final static int ID_LISTVIEW0_CHILDWGT1_LABEL7 = 1372990592;
protected final static int ID_LISTVIEW0_CHILDWGT1_LABEL8 = 1334970999;
protected final static int ID_LISTVIEW0_CHILDWGT1_LABEL9 = 1936913200;
protected final static int ID_LISTVIEW0_CHILDWGT2 = 758836820;
protected final static int ID_LISTVIEW0_CHILDWGT2_PANEL7 = 1915241287;
protected final static int ID_LISTVIEW0_CHILDWGT2_IMAGE2 = 1914307152;
protected final static int ID_LISTVIEW0_CHILDWGT2_PANEL8 = 1730002800;
protected final static int ID_LISTVIEW0_CHILDWGT2_PANEL18 = 145834672;
protected final static int ID_LISTVIEW0_CHILDWGT2_LABEL10 = 1657546180;
protected final static int ID_LISTVIEW0_CHILDWGT2_PANEL19 = 1069702739;
protected final static int ID_LISTVIEW0_CHILDWGT2_IMAGE6 = 1205556461;
protected final static int ID_LISTVIEW0_CHILDWGT2_LABEL20 = 1845090033;
protected final static int ID_LISTVIEW0_CHILDWGT2_LABEL21 = 1901537899;
protected final static int ID_LISTVIEW0_CHILDWGT2_PANEL20 = 605595144;
protected final static int ID_LISTVIEW0_CHILDWGT2_LABEL12 = 2131974075;
protected final static int ID_LISTVIEW0_CHILDWGT2_LABEL13 = 1122583087;
protected final static int ID_LISTVIEW0_CHILDWGT2_LABEL14 = 16255579;
protected final static int ID_LISTVIEW0_CHILDWGT3 = 1997901567;
protected final static int ID_LISTVIEW0_CHILDWGT3_PANEL10 = 277557228;
protected final static int ID_LISTVIEW0_CHILDWGT3_IMAGE3 = 80046939;
protected final static int ID_LISTVIEW0_CHILDWGT3_PANEL11 = 879583165;
protected final static int ID_LISTVIEW0_CHILDWGT3_PANEL21 = 1431971952;
protected final static int ID_LISTVIEW0_CHILDWGT3_LABEL15 = 1252524714;
protected final static int ID_LISTVIEW0_CHILDWGT3_PANEL22 = 719515976;
protected final static int ID_LISTVIEW0_CHILDWGT3_IMAGE7 = 712888510;
protected final static int ID_LISTVIEW0_CHILDWGT3_LABEL22 = 1086355585;
protected final static int ID_LISTVIEW0_CHILDWGT3_LABEL23 = 833948754;
protected final static int ID_LISTVIEW0_CHILDWGT3_PANEL23 = 297624625;
protected final static int ID_LISTVIEW0_CHILDWGT3_LABEL17 = 961678298;
protected final static int ID_LISTVIEW0_CHILDWGT3_LABEL18 = 1731698104;
protected final static int ID_LISTVIEW0_CHILDWGT3_LABEL19 = 551449739;
protected final static int ID_PANEL2 = 558163573;
protected final static int ID_WIDGET0 = 1680157469;
protected final static int ID_WIDGET0_TOOLBAR0 = 1409153451;
protected final static int ID_WIDGET0_IMAGEBUTTON0 = 1816901289;
protected final static int ID_WIDGET0_IMAGEBUTTON1 = 108706008;

	
	
	@Override
	public String getControllerName() {
		return "myschedulerController";
	}
	
	@Override
	public String getContextName() {
		return "calendar";
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
		  idmap.put("myscheduler",ID_MYSCHEDULER);
  idmap.put("viewPage0",ID_VIEWPAGE0);
  idmap.put("navigatorbar0",ID_NAVIGATORBAR0);
  idmap.put("button2",ID_BUTTON2);
  idmap.put("label1",ID_LABEL1);
  idmap.put("label0",ID_LABEL0);
  idmap.put("button1",ID_BUTTON1);
  idmap.put("button0",ID_BUTTON0);
  idmap.put("panel0",ID_PANEL0);
  idmap.put("calendar0",ID_CALENDAR0);
  idmap.put("panel1",ID_PANEL1);
  idmap.put("listview0",ID_LISTVIEW0);
  idmap.put("listview0_childWgt0",ID_LISTVIEW0_CHILDWGT0);
  idmap.put("listview0_childWgt0_panel3",ID_LISTVIEW0_CHILDWGT0_PANEL3);
  idmap.put("listview0_childWgt0_image0",ID_LISTVIEW0_CHILDWGT0_IMAGE0);
  idmap.put("listview0_childWgt0_panel4",ID_LISTVIEW0_CHILDWGT0_PANEL4);
  idmap.put("listview0_childWgt0_panel12",ID_LISTVIEW0_CHILDWGT0_PANEL12);
  idmap.put("listview0_childWgt0_label0",ID_LISTVIEW0_CHILDWGT0_LABEL0);
  idmap.put("listview0_childWgt0_panel13",ID_LISTVIEW0_CHILDWGT0_PANEL13);
  idmap.put("listview0_childWgt0_image4",ID_LISTVIEW0_CHILDWGT0_IMAGE4);
  idmap.put("listview0_childWgt0_label1",ID_LISTVIEW0_CHILDWGT0_LABEL1);
  idmap.put("listview0_childWgt0_label6",ID_LISTVIEW0_CHILDWGT0_LABEL6);
  idmap.put("listview0_childWgt0_panel14",ID_LISTVIEW0_CHILDWGT0_PANEL14);
  idmap.put("listview0_childWgt0_label2",ID_LISTVIEW0_CHILDWGT0_LABEL2);
  idmap.put("listview0_childWgt0_label3",ID_LISTVIEW0_CHILDWGT0_LABEL3);
  idmap.put("listview0_childWgt0_label4",ID_LISTVIEW0_CHILDWGT0_LABEL4);
  idmap.put("listview0_childWgt1",ID_LISTVIEW0_CHILDWGT1);
  idmap.put("listview0_childWgt1_panel5",ID_LISTVIEW0_CHILDWGT1_PANEL5);
  idmap.put("listview0_childWgt1_image1",ID_LISTVIEW0_CHILDWGT1_IMAGE1);
  idmap.put("listview0_childWgt1_panel6",ID_LISTVIEW0_CHILDWGT1_PANEL6);
  idmap.put("listview0_childWgt1_panel15",ID_LISTVIEW0_CHILDWGT1_PANEL15);
  idmap.put("listview0_childWgt1_label5",ID_LISTVIEW0_CHILDWGT1_LABEL5);
  idmap.put("listview0_childWgt1_panel16",ID_LISTVIEW0_CHILDWGT1_PANEL16);
  idmap.put("listview0_childWgt1_image5",ID_LISTVIEW0_CHILDWGT1_IMAGE5);
  idmap.put("listview0_childWgt1_label11",ID_LISTVIEW0_CHILDWGT1_LABEL11);
  idmap.put("listview0_childWgt1_label16",ID_LISTVIEW0_CHILDWGT1_LABEL16);
  idmap.put("listview0_childWgt1_panel17",ID_LISTVIEW0_CHILDWGT1_PANEL17);
  idmap.put("listview0_childWgt1_label7",ID_LISTVIEW0_CHILDWGT1_LABEL7);
  idmap.put("listview0_childWgt1_label8",ID_LISTVIEW0_CHILDWGT1_LABEL8);
  idmap.put("listview0_childWgt1_label9",ID_LISTVIEW0_CHILDWGT1_LABEL9);
  idmap.put("listview0_childWgt2",ID_LISTVIEW0_CHILDWGT2);
  idmap.put("listview0_childWgt2_panel7",ID_LISTVIEW0_CHILDWGT2_PANEL7);
  idmap.put("listview0_childWgt2_image2",ID_LISTVIEW0_CHILDWGT2_IMAGE2);
  idmap.put("listview0_childWgt2_panel8",ID_LISTVIEW0_CHILDWGT2_PANEL8);
  idmap.put("listview0_childWgt2_panel18",ID_LISTVIEW0_CHILDWGT2_PANEL18);
  idmap.put("listview0_childWgt2_label10",ID_LISTVIEW0_CHILDWGT2_LABEL10);
  idmap.put("listview0_childWgt2_panel19",ID_LISTVIEW0_CHILDWGT2_PANEL19);
  idmap.put("listview0_childWgt2_image6",ID_LISTVIEW0_CHILDWGT2_IMAGE6);
  idmap.put("listview0_childWgt2_label20",ID_LISTVIEW0_CHILDWGT2_LABEL20);
  idmap.put("listview0_childWgt2_label21",ID_LISTVIEW0_CHILDWGT2_LABEL21);
  idmap.put("listview0_childWgt2_panel20",ID_LISTVIEW0_CHILDWGT2_PANEL20);
  idmap.put("listview0_childWgt2_label12",ID_LISTVIEW0_CHILDWGT2_LABEL12);
  idmap.put("listview0_childWgt2_label13",ID_LISTVIEW0_CHILDWGT2_LABEL13);
  idmap.put("listview0_childWgt2_label14",ID_LISTVIEW0_CHILDWGT2_LABEL14);
  idmap.put("listview0_childWgt3",ID_LISTVIEW0_CHILDWGT3);
  idmap.put("listview0_childWgt3_panel10",ID_LISTVIEW0_CHILDWGT3_PANEL10);
  idmap.put("listview0_childWgt3_image3",ID_LISTVIEW0_CHILDWGT3_IMAGE3);
  idmap.put("listview0_childWgt3_panel11",ID_LISTVIEW0_CHILDWGT3_PANEL11);
  idmap.put("listview0_childWgt3_panel21",ID_LISTVIEW0_CHILDWGT3_PANEL21);
  idmap.put("listview0_childWgt3_label15",ID_LISTVIEW0_CHILDWGT3_LABEL15);
  idmap.put("listview0_childWgt3_panel22",ID_LISTVIEW0_CHILDWGT3_PANEL22);
  idmap.put("listview0_childWgt3_image7",ID_LISTVIEW0_CHILDWGT3_IMAGE7);
  idmap.put("listview0_childWgt3_label22",ID_LISTVIEW0_CHILDWGT3_LABEL22);
  idmap.put("listview0_childWgt3_label23",ID_LISTVIEW0_CHILDWGT3_LABEL23);
  idmap.put("listview0_childWgt3_panel23",ID_LISTVIEW0_CHILDWGT3_PANEL23);
  idmap.put("listview0_childWgt3_label17",ID_LISTVIEW0_CHILDWGT3_LABEL17);
  idmap.put("listview0_childWgt3_label18",ID_LISTVIEW0_CHILDWGT3_LABEL18);
  idmap.put("listview0_childWgt3_label19",ID_LISTVIEW0_CHILDWGT3_LABEL19);
  idmap.put("panel2",ID_PANEL2);
  idmap.put("widget0",ID_WIDGET0);
  idmap.put("widget0_toolbar0",ID_WIDGET0_TOOLBAR0);
  idmap.put("widget0_imagebutton0",ID_WIDGET0_IMAGEBUTTON0);
  idmap.put("widget0_imagebutton1",ID_WIDGET0_IMAGEBUTTON1);

	}
	
	public void onLoad() {
		ULog.logLC("onLoad", this);
		if(currentPage!=null) {
			currentPage.onLoad();
		}
	
		{ //viewPage0 - monthchange
    UMEventArgs args = new UMEventArgs(Scdu_myschedulerActivity.this);
    actionMonthchange(viewPage0,args);

}
{ //panel2 - tabBarOnload
    UMEventArgs args = new UMEventArgs(Scdu_myschedulerActivity.this);
    actionTabBarOnload(panel2,args);

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
,"color","#000000"
,"layout-type","linear"
,"font-size","17"
,"font-family","default"
,"valign","center"
,"background-image","nav.png"
);
button2 = (UMButton)ThirdControl.createControl(new UMButton(context),ID_BUTTON2
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
button2.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Scdu_myschedulerActivity.this);
    actionToDesk(button2,args);

}
});
navigatorbar0.addView(button2);
label1 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL1
,"halign","center"
,"height","fill"
,"color","#000000"
,"layout-type","linear"
,"font-size","17"
,"width","24"
,"font-family","default"
,"valign","center"
);
navigatorbar0.addView(label1);
label0 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL0
,"bindfield","calendar.month"
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
label0_binder.setBindInfo(new BindInfo("calendar.month"));
label0_binder.setControl(label0);
binderGroup.addBinderToGroup(ID_LABEL0, label0_binder);
navigatorbar0.addView(label0);
button1 = (UMButton)ThirdControl.createControl(new UMButton(context),ID_BUTTON1
,"halign","center"
,"pressed-image","btn_add_touch"
,"width","44"
,"background-image-dis","button"
,"height","44"
,"color","#e50011"
,"font-size","17"
,"layout-type","linear"
,"onclick","toAddScheduler"
,"font-family","default"
,"valign","center"
,"background-image","btn_add"
);
button1.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Scdu_myschedulerActivity.this);
    actionToAddScheduler(button1,args);

}
});
navigatorbar0.addView(button1);
button0 = (UMButton)ThirdControl.createControl(new UMButton(context),ID_BUTTON0
,"halign","right"
,"pressed-image","button_touch"
,"width","44"
,"background-image-dis","button"
,"height","44"
,"color","#e50011"
,"layout-type","linear"
,"font-size","17"
,"onclick","toToday"
,"font-family","default"
,"valign","center"
,"background-image","button"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,button0,"value","#{res.scdu_oascheduler_0028}"));
button0.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Scdu_myschedulerActivity.this);
    actionToToday(button0,args);

}
});
navigatorbar0.addView(button0);

return navigatorbar0;
}
public View getListview0_childWgt0_panel3View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt0_panel3 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_LISTVIEW0_CHILDWGT0_PANEL3
,"margin-right","25"
,"halign","center"
,"height","fill"
,"layout-type","linear"
,"width","25"
);
listview0_childWgt0_image0 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_LISTVIEW0_CHILDWGT0_IMAGE0
,"height","70"
,"layout-type","linear"
,"width","12.5"
,"scaletype","fitcenter"
,"src","oasche_head.png"
);
listview0_childWgt0_panel3.addView(listview0_childWgt0_image0);

return listview0_childWgt0_panel3;
}
public View getListview0_childWgt0_panel12View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt0_panel12 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT0_PANEL12
,"height","20"
,"layout-type","linear"
,"width","fill"
,"margin-top","9"
,"valign","center"
);
listview0_childWgt0_label0 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT0_LABEL0
,"bindfield","theme"
,"halign","left"
,"height","fill"
,"color","#000000"
,"layout-type","linear"
,"font-size","16"
,"width","fill"
,"font-family","default"
,"valign","center"
);
UMTextBinder listview0_childWgt0_label0_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt0_label0_binder.setBindInfo(new BindInfo("theme"));
listview0_childWgt0_label0_binder.setControl(listview0_childWgt0_label0);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT0_LABEL0, listview0_childWgt0_label0_binder);
listview0_childWgt0_panel12.addView(listview0_childWgt0_label0);

return listview0_childWgt0_panel12;
}
public View getListview0_childWgt0_panel13View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt0_panel13 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT0_PANEL13
,"height","18"
,"layout-type","linear"
,"width","fill"
,"valign","center"
);
listview0_childWgt0_image4 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_LISTVIEW0_CHILDWGT0_IMAGE4
,"bindfield","priorityimg"
,"height","15"
,"layout-type","linear"
,"width","15"
,"scaletype","fitcenter"
,"src",""
);
UMImageBinder listview0_childWgt0_image4_binder = new UMImageBinder((IUMContextAccessor)context);
listview0_childWgt0_image4_binder.setBindInfo(new BindInfo("priorityimg"));
listview0_childWgt0_image4_binder.setControl(listview0_childWgt0_image4);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT0_IMAGE4, listview0_childWgt0_image4_binder);
listview0_childWgt0_panel13.addView(listview0_childWgt0_image4);
listview0_childWgt0_label1 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT0_LABEL1
,"bindfield","typename"
,"halign","center"
,"height","fill"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","100"
,"font-family","default"
,"valign","center"
);
UMTextBinder listview0_childWgt0_label1_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt0_label1_binder.setBindInfo(new BindInfo("typename"));
listview0_childWgt0_label1_binder.setControl(listview0_childWgt0_label1);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT0_LABEL1, listview0_childWgt0_label1_binder);
listview0_childWgt0_panel13.addView(listview0_childWgt0_label1);
listview0_childWgt0_label6 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT0_LABEL6
,"bindfield","sharedby"
,"halign","left"
,"height","fill"
,"weight","1"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","0"
,"font-family","default"
,"valign","center"
);
UMTextBinder listview0_childWgt0_label6_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt0_label6_binder.setBindInfo(new BindInfo("sharedby"));
listview0_childWgt0_label6_binder.setControl(listview0_childWgt0_label6);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT0_LABEL6, listview0_childWgt0_label6_binder);
listview0_childWgt0_panel13.addView(listview0_childWgt0_label6);

return listview0_childWgt0_panel13;
}
public View getListview0_childWgt0_panel14View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt0_panel14 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT0_PANEL14
,"height","15"
,"layout-type","linear"
,"width","fill"
,"valign","center"
);
listview0_childWgt0_label2 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT0_LABEL2
,"bindfield","showbegintime"
,"halign","left"
,"height","fill"
,"widthwrap","80.0"
,"color","#000000"
,"layout-type","linear"
,"font-size","13"
,"width","wrap"
,"font-family","default"
,"valign","center"
);
UMTextBinder listview0_childWgt0_label2_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt0_label2_binder.setBindInfo(new BindInfo("showbegintime"));
listview0_childWgt0_label2_binder.setControl(listview0_childWgt0_label2);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT0_LABEL2, listview0_childWgt0_label2_binder);
listview0_childWgt0_panel14.addView(listview0_childWgt0_label2);
listview0_childWgt0_label3 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT0_LABEL3
,"margin-right","3"
,"halign","center"
,"height","fill"
,"color","#000000"
,"layout-type","linear"
,"font-size","13"
,"width","20"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,listview0_childWgt0_label3,"content","#{res.scdu_oascheduler_0063}"));
listview0_childWgt0_panel14.addView(listview0_childWgt0_label3);
listview0_childWgt0_label4 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT0_LABEL4
,"bindfield","showendtime"
,"halign","right"
,"height","fill"
,"widthwrap","80.0"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","wrap"
,"font-family","default"
,"valign","center"
);
UMTextBinder listview0_childWgt0_label4_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt0_label4_binder.setBindInfo(new BindInfo("showendtime"));
listview0_childWgt0_label4_binder.setControl(listview0_childWgt0_label4);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT0_LABEL4, listview0_childWgt0_label4_binder);
listview0_childWgt0_panel14.addView(listview0_childWgt0_label4);

return listview0_childWgt0_panel14;
}
public View getListview0_childWgt0_panel4View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt0_panel4 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_LISTVIEW0_CHILDWGT0_PANEL4
,"halign","center"
,"height","fill"
,"weight","1"
,"layout-type","linear"
,"width","0"
,"onclick","toSchedulerDetail"
);
listview0_childWgt0_panel4.setOnClickListener(new OnCursorClickListener(configure) {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Scdu_myschedulerActivity.this);
    int position = this.getPosition(v);
    if(position>=0) {
      context.getCursor("cursorcalendar_eventlistalias").setCurrentIndex(position);
    }
    actionToSchedulerDetail(listview0_childWgt0_panel4,args);

}
});
View listview0_childWgt0_panel12 = (View) getListview0_childWgt0_panel12View((UMActivity)context,binderGroup,configure);
listview0_childWgt0_panel4.addView(listview0_childWgt0_panel12);
View listview0_childWgt0_panel13 = (View) getListview0_childWgt0_panel13View((UMActivity)context,binderGroup,configure);
listview0_childWgt0_panel4.addView(listview0_childWgt0_panel13);
View listview0_childWgt0_panel14 = (View) getListview0_childWgt0_panel14View((UMActivity)context,binderGroup,configure);
listview0_childWgt0_panel4.addView(listview0_childWgt0_panel14);

return listview0_childWgt0_panel4;
}
public View getListview0_childWgt0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt0 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT0
,"padding-left","20"
,"padding-right","20"
,"height","70"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"valign","center"
);
View listview0_childWgt0_panel3 = (View) getListview0_childWgt0_panel3View((UMActivity)context,binderGroup,configure);
listview0_childWgt0.addView(listview0_childWgt0_panel3);
View listview0_childWgt0_panel4 = (View) getListview0_childWgt0_panel4View((UMActivity)context,binderGroup,configure);
listview0_childWgt0.addView(listview0_childWgt0_panel4);

return listview0_childWgt0;
}
public View getListview0_childWgt1_panel5View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt1_panel5 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_LISTVIEW0_CHILDWGT1_PANEL5
,"margin-right","25"
,"halign","center"
,"height","fill"
,"layout-type","linear"
,"width","25"
);
listview0_childWgt1_image1 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_LISTVIEW0_CHILDWGT1_IMAGE1
,"height","fill"
,"layout-type","linear"
,"width","12.5"
,"scaletype","fitcenter"
,"src","oasche_body.png"
);
listview0_childWgt1_panel5.addView(listview0_childWgt1_image1);

return listview0_childWgt1_panel5;
}
public View getListview0_childWgt1_panel15View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt1_panel15 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT1_PANEL15
,"height","20"
,"layout-type","linear"
,"width","fill"
,"margin-top","9"
,"valign","center"
);
listview0_childWgt1_label5 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT1_LABEL5
,"bindfield","theme"
,"halign","left"
,"height","fill"
,"color","#000000"
,"layout-type","linear"
,"font-size","16"
,"width","fill"
,"font-family","default"
,"valign","center"
);
UMTextBinder listview0_childWgt1_label5_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt1_label5_binder.setBindInfo(new BindInfo("theme"));
listview0_childWgt1_label5_binder.setControl(listview0_childWgt1_label5);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT1_LABEL5, listview0_childWgt1_label5_binder);
listview0_childWgt1_panel15.addView(listview0_childWgt1_label5);

return listview0_childWgt1_panel15;
}
public View getListview0_childWgt1_panel16View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt1_panel16 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT1_PANEL16
,"height","18"
,"layout-type","linear"
,"width","fill"
,"valign","center"
);
listview0_childWgt1_image5 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_LISTVIEW0_CHILDWGT1_IMAGE5
,"bindfield","priorityimg"
,"height","15"
,"layout-type","linear"
,"width","15"
,"scaletype","fitcenter"
,"src",""
);
UMImageBinder listview0_childWgt1_image5_binder = new UMImageBinder((IUMContextAccessor)context);
listview0_childWgt1_image5_binder.setBindInfo(new BindInfo("priorityimg"));
listview0_childWgt1_image5_binder.setControl(listview0_childWgt1_image5);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT1_IMAGE5, listview0_childWgt1_image5_binder);
listview0_childWgt1_panel16.addView(listview0_childWgt1_image5);
listview0_childWgt1_label11 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT1_LABEL11
,"bindfield","typename"
,"halign","center"
,"height","fill"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","100"
,"font-family","default"
,"valign","center"
);
UMTextBinder listview0_childWgt1_label11_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt1_label11_binder.setBindInfo(new BindInfo("typename"));
listview0_childWgt1_label11_binder.setControl(listview0_childWgt1_label11);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT1_LABEL11, listview0_childWgt1_label11_binder);
listview0_childWgt1_panel16.addView(listview0_childWgt1_label11);
listview0_childWgt1_label16 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT1_LABEL16
,"bindfield","sharedby"
,"halign","left"
,"height","fill"
,"weight","1"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","0"
,"font-family","default"
,"valign","center"
);
UMTextBinder listview0_childWgt1_label16_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt1_label16_binder.setBindInfo(new BindInfo("sharedby"));
listview0_childWgt1_label16_binder.setControl(listview0_childWgt1_label16);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT1_LABEL16, listview0_childWgt1_label16_binder);
listview0_childWgt1_panel16.addView(listview0_childWgt1_label16);

return listview0_childWgt1_panel16;
}
public View getListview0_childWgt1_panel17View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt1_panel17 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT1_PANEL17
,"height","15"
,"layout-type","linear"
,"width","fill"
,"valign","center"
);
listview0_childWgt1_label7 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT1_LABEL7
,"bindfield","showbegintime"
,"halign","left"
,"height","fill"
,"widthwrap","80.0"
,"color","#000000"
,"layout-type","linear"
,"font-size","13"
,"width","wrap"
,"font-family","default"
,"valign","center"
);
UMTextBinder listview0_childWgt1_label7_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt1_label7_binder.setBindInfo(new BindInfo("showbegintime"));
listview0_childWgt1_label7_binder.setControl(listview0_childWgt1_label7);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT1_LABEL7, listview0_childWgt1_label7_binder);
listview0_childWgt1_panel17.addView(listview0_childWgt1_label7);
listview0_childWgt1_label8 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT1_LABEL8
,"margin-right","3"
,"halign","center"
,"height","fill"
,"color","#000000"
,"layout-type","linear"
,"font-size","13"
,"width","20"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,listview0_childWgt1_label8,"content","#{res.scdu_oascheduler_0063}"));
listview0_childWgt1_panel17.addView(listview0_childWgt1_label8);
listview0_childWgt1_label9 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT1_LABEL9
,"bindfield","showendtime"
,"halign","right"
,"height","fill"
,"widthwrap","80.0"
,"color","#000000"
,"layout-type","linear"
,"font-size","13"
,"width","wrap"
,"font-family","default"
,"valign","center"
);
UMTextBinder listview0_childWgt1_label9_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt1_label9_binder.setBindInfo(new BindInfo("showendtime"));
listview0_childWgt1_label9_binder.setControl(listview0_childWgt1_label9);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT1_LABEL9, listview0_childWgt1_label9_binder);
listview0_childWgt1_panel17.addView(listview0_childWgt1_label9);

return listview0_childWgt1_panel17;
}
public View getListview0_childWgt1_panel6View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt1_panel6 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_LISTVIEW0_CHILDWGT1_PANEL6
,"halign","center"
,"height","fill"
,"weight","1"
,"layout-type","linear"
,"width","0"
,"onclick","toSchedulerDetail"
);
listview0_childWgt1_panel6.setOnClickListener(new OnCursorClickListener(configure) {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Scdu_myschedulerActivity.this);
    int position = this.getPosition(v);
    if(position>=0) {
      context.getCursor("cursorcalendar_eventlistalias").setCurrentIndex(position);
    }
    actionToSchedulerDetail(listview0_childWgt1_panel6,args);

}
});
View listview0_childWgt1_panel15 = (View) getListview0_childWgt1_panel15View((UMActivity)context,binderGroup,configure);
listview0_childWgt1_panel6.addView(listview0_childWgt1_panel15);
View listview0_childWgt1_panel16 = (View) getListview0_childWgt1_panel16View((UMActivity)context,binderGroup,configure);
listview0_childWgt1_panel6.addView(listview0_childWgt1_panel16);
View listview0_childWgt1_panel17 = (View) getListview0_childWgt1_panel17View((UMActivity)context,binderGroup,configure);
listview0_childWgt1_panel6.addView(listview0_childWgt1_panel17);

return listview0_childWgt1_panel6;
}
public View getListview0_childWgt1View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt1 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT1
,"padding-right","20"
,"padding-left","20"
,"height","70"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"valign","center"
);
View listview0_childWgt1_panel5 = (View) getListview0_childWgt1_panel5View((UMActivity)context,binderGroup,configure);
listview0_childWgt1.addView(listview0_childWgt1_panel5);
View listview0_childWgt1_panel6 = (View) getListview0_childWgt1_panel6View((UMActivity)context,binderGroup,configure);
listview0_childWgt1.addView(listview0_childWgt1_panel6);

return listview0_childWgt1;
}
public View getListview0_childWgt2_panel7View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt2_panel7 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_LISTVIEW0_CHILDWGT2_PANEL7
,"margin-right","25"
,"halign","center"
,"height","fill"
,"layout-type","linear"
,"width","25"
);
listview0_childWgt2_image2 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_LISTVIEW0_CHILDWGT2_IMAGE2
,"height","70"
,"layout-type","linear"
,"width","12.5"
,"scaletype","fitcenter"
,"src","oasche_foot.png"
);
listview0_childWgt2_panel7.addView(listview0_childWgt2_image2);

return listview0_childWgt2_panel7;
}
public View getListview0_childWgt2_panel18View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt2_panel18 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT2_PANEL18
,"height","20"
,"layout-type","linear"
,"width","fill"
,"margin-top","9"
,"valign","center"
);
listview0_childWgt2_label10 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT2_LABEL10
,"bindfield","theme"
,"halign","left"
,"height","fill"
,"color","#000000"
,"layout-type","linear"
,"font-size","16"
,"width","fill"
,"font-family","default"
,"valign","center"
);
UMTextBinder listview0_childWgt2_label10_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt2_label10_binder.setBindInfo(new BindInfo("theme"));
listview0_childWgt2_label10_binder.setControl(listview0_childWgt2_label10);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT2_LABEL10, listview0_childWgt2_label10_binder);
listview0_childWgt2_panel18.addView(listview0_childWgt2_label10);

return listview0_childWgt2_panel18;
}
public View getListview0_childWgt2_panel19View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt2_panel19 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT2_PANEL19
,"height","18"
,"layout-type","linear"
,"width","fill"
,"valign","center"
);
listview0_childWgt2_image6 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_LISTVIEW0_CHILDWGT2_IMAGE6
,"bindfield","priorityimg"
,"height","15"
,"layout-type","linear"
,"width","15"
,"scaletype","fitcenter"
,"src",""
);
UMImageBinder listview0_childWgt2_image6_binder = new UMImageBinder((IUMContextAccessor)context);
listview0_childWgt2_image6_binder.setBindInfo(new BindInfo("priorityimg"));
listview0_childWgt2_image6_binder.setControl(listview0_childWgt2_image6);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT2_IMAGE6, listview0_childWgt2_image6_binder);
listview0_childWgt2_panel19.addView(listview0_childWgt2_image6);
listview0_childWgt2_label20 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT2_LABEL20
,"bindfield","typename"
,"halign","center"
,"height","fill"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","100"
,"font-family","default"
,"valign","center"
);
UMTextBinder listview0_childWgt2_label20_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt2_label20_binder.setBindInfo(new BindInfo("typename"));
listview0_childWgt2_label20_binder.setControl(listview0_childWgt2_label20);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT2_LABEL20, listview0_childWgt2_label20_binder);
listview0_childWgt2_panel19.addView(listview0_childWgt2_label20);
listview0_childWgt2_label21 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT2_LABEL21
,"bindfield","sharedby"
,"halign","left"
,"height","fill"
,"weight","1"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","0"
,"font-family","default"
,"valign","center"
);
UMTextBinder listview0_childWgt2_label21_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt2_label21_binder.setBindInfo(new BindInfo("sharedby"));
listview0_childWgt2_label21_binder.setControl(listview0_childWgt2_label21);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT2_LABEL21, listview0_childWgt2_label21_binder);
listview0_childWgt2_panel19.addView(listview0_childWgt2_label21);

return listview0_childWgt2_panel19;
}
public View getListview0_childWgt2_panel20View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt2_panel20 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT2_PANEL20
,"height","15"
,"layout-type","linear"
,"width","fill"
,"valign","center"
);
listview0_childWgt2_label12 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT2_LABEL12
,"bindfield","showbegintime"
,"halign","left"
,"height","fill"
,"widthwrap","80.0"
,"color","#000000"
,"layout-type","linear"
,"font-size","13"
,"width","wrap"
,"font-family","default"
,"valign","center"
);
UMTextBinder listview0_childWgt2_label12_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt2_label12_binder.setBindInfo(new BindInfo("showbegintime"));
listview0_childWgt2_label12_binder.setControl(listview0_childWgt2_label12);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT2_LABEL12, listview0_childWgt2_label12_binder);
listview0_childWgt2_panel20.addView(listview0_childWgt2_label12);
listview0_childWgt2_label13 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT2_LABEL13
,"margin-right","3"
,"halign","center"
,"height","fill"
,"color","#000000"
,"layout-type","linear"
,"font-size","13"
,"width","20"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,listview0_childWgt2_label13,"content","#{res.scdu_oascheduler_0063}"));
listview0_childWgt2_panel20.addView(listview0_childWgt2_label13);
listview0_childWgt2_label14 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT2_LABEL14
,"bindfield","showendtime"
,"halign","right"
,"height","fill"
,"widthwrap","80.0"
,"color","#000000"
,"layout-type","linear"
,"font-size","13"
,"width","wrap"
,"font-family","default"
,"valign","center"
);
UMTextBinder listview0_childWgt2_label14_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt2_label14_binder.setBindInfo(new BindInfo("showendtime"));
listview0_childWgt2_label14_binder.setControl(listview0_childWgt2_label14);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT2_LABEL14, listview0_childWgt2_label14_binder);
listview0_childWgt2_panel20.addView(listview0_childWgt2_label14);

return listview0_childWgt2_panel20;
}
public View getListview0_childWgt2_panel8View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt2_panel8 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_LISTVIEW0_CHILDWGT2_PANEL8
,"halign","center"
,"height","fill"
,"weight","1"
,"layout-type","linear"
,"width","0"
,"onclick","toSchedulerDetail"
);
listview0_childWgt2_panel8.setOnClickListener(new OnCursorClickListener(configure) {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Scdu_myschedulerActivity.this);
    int position = this.getPosition(v);
    if(position>=0) {
      context.getCursor("cursorcalendar_eventlistalias").setCurrentIndex(position);
    }
    actionToSchedulerDetail(listview0_childWgt2_panel8,args);

}
});
View listview0_childWgt2_panel18 = (View) getListview0_childWgt2_panel18View((UMActivity)context,binderGroup,configure);
listview0_childWgt2_panel8.addView(listview0_childWgt2_panel18);
View listview0_childWgt2_panel19 = (View) getListview0_childWgt2_panel19View((UMActivity)context,binderGroup,configure);
listview0_childWgt2_panel8.addView(listview0_childWgt2_panel19);
View listview0_childWgt2_panel20 = (View) getListview0_childWgt2_panel20View((UMActivity)context,binderGroup,configure);
listview0_childWgt2_panel8.addView(listview0_childWgt2_panel20);

return listview0_childWgt2_panel8;
}
public View getListview0_childWgt2View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt2 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT2
,"padding-right","20"
,"padding-left","20"
,"height","70"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"valign","center"
);
View listview0_childWgt2_panel7 = (View) getListview0_childWgt2_panel7View((UMActivity)context,binderGroup,configure);
listview0_childWgt2.addView(listview0_childWgt2_panel7);
View listview0_childWgt2_panel8 = (View) getListview0_childWgt2_panel8View((UMActivity)context,binderGroup,configure);
listview0_childWgt2.addView(listview0_childWgt2_panel8);

return listview0_childWgt2;
}
public View getListview0_childWgt3_panel10View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt3_panel10 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_LISTVIEW0_CHILDWGT3_PANEL10
,"margin-right","25"
,"halign","center"
,"height","fill"
,"layout-type","linear"
,"width","25"
);
listview0_childWgt3_image3 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_LISTVIEW0_CHILDWGT3_IMAGE3
,"height","70"
,"layout-type","linear"
,"width","12.5"
,"scaletype","fitcenter"
,"src","oasche_one.png"
);
listview0_childWgt3_panel10.addView(listview0_childWgt3_image3);

return listview0_childWgt3_panel10;
}
public View getListview0_childWgt3_panel21View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt3_panel21 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT3_PANEL21
,"height","20"
,"layout-type","linear"
,"width","fill"
,"margin-top","9"
,"valign","center"
);
listview0_childWgt3_label15 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT3_LABEL15
,"bindfield","theme"
,"halign","left"
,"height","fill"
,"color","#000000"
,"layout-type","linear"
,"font-size","16"
,"width","fill"
,"font-family","default"
,"valign","center"
);
UMTextBinder listview0_childWgt3_label15_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt3_label15_binder.setBindInfo(new BindInfo("theme"));
listview0_childWgt3_label15_binder.setControl(listview0_childWgt3_label15);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT3_LABEL15, listview0_childWgt3_label15_binder);
listview0_childWgt3_panel21.addView(listview0_childWgt3_label15);

return listview0_childWgt3_panel21;
}
public View getListview0_childWgt3_panel22View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt3_panel22 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT3_PANEL22
,"height","18"
,"layout-type","linear"
,"width","fill"
,"valign","center"
);
listview0_childWgt3_image7 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_LISTVIEW0_CHILDWGT3_IMAGE7
,"bindfield","priorityimg"
,"height","15"
,"layout-type","linear"
,"width","15"
,"scaletype","fitcenter"
,"src",""
);
UMImageBinder listview0_childWgt3_image7_binder = new UMImageBinder((IUMContextAccessor)context);
listview0_childWgt3_image7_binder.setBindInfo(new BindInfo("priorityimg"));
listview0_childWgt3_image7_binder.setControl(listview0_childWgt3_image7);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT3_IMAGE7, listview0_childWgt3_image7_binder);
listview0_childWgt3_panel22.addView(listview0_childWgt3_image7);
listview0_childWgt3_label22 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT3_LABEL22
,"bindfield","typename"
,"halign","center"
,"height","fill"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","100"
,"font-family","default"
,"valign","center"
);
UMTextBinder listview0_childWgt3_label22_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt3_label22_binder.setBindInfo(new BindInfo("typename"));
listview0_childWgt3_label22_binder.setControl(listview0_childWgt3_label22);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT3_LABEL22, listview0_childWgt3_label22_binder);
listview0_childWgt3_panel22.addView(listview0_childWgt3_label22);
listview0_childWgt3_label23 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT3_LABEL23
,"bindfield","sharedby"
,"halign","left"
,"height","fill"
,"weight","1"
,"color","#000000"
,"layout-type","linear"
,"font-size","14"
,"width","0"
,"font-family","default"
,"valign","center"
);
UMTextBinder listview0_childWgt3_label23_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt3_label23_binder.setBindInfo(new BindInfo("sharedby"));
listview0_childWgt3_label23_binder.setControl(listview0_childWgt3_label23);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT3_LABEL23, listview0_childWgt3_label23_binder);
listview0_childWgt3_panel22.addView(listview0_childWgt3_label23);

return listview0_childWgt3_panel22;
}
public View getListview0_childWgt3_panel23View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt3_panel23 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT3_PANEL23
,"height","15"
,"layout-type","linear"
,"width","fill"
,"valign","center"
);
listview0_childWgt3_label17 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT3_LABEL17
,"bindfield","showbegintime"
,"halign","left"
,"height","fill"
,"widthwrap","80.0"
,"color","#000000"
,"layout-type","linear"
,"font-size","13"
,"width","wrap"
,"font-family","default"
,"valign","center"
);
UMTextBinder listview0_childWgt3_label17_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt3_label17_binder.setBindInfo(new BindInfo("showbegintime"));
listview0_childWgt3_label17_binder.setControl(listview0_childWgt3_label17);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT3_LABEL17, listview0_childWgt3_label17_binder);
listview0_childWgt3_panel23.addView(listview0_childWgt3_label17);
listview0_childWgt3_label18 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT3_LABEL18
,"margin-right","3"
,"halign","center"
,"height","fill"
,"color","#000000"
,"layout-type","linear"
,"font-size","13"
,"width","20"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,listview0_childWgt3_label18,"content","#{res.scdu_oascheduler_0063}"));
listview0_childWgt3_panel23.addView(listview0_childWgt3_label18);
listview0_childWgt3_label19 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT3_LABEL19
,"bindfield","showendtime"
,"halign","right"
,"height","fill"
,"widthwrap","80.0"
,"color","#000000"
,"layout-type","linear"
,"font-size","13"
,"width","wrap"
,"font-family","default"
,"valign","center"
);
UMTextBinder listview0_childWgt3_label19_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt3_label19_binder.setBindInfo(new BindInfo("showendtime"));
listview0_childWgt3_label19_binder.setControl(listview0_childWgt3_label19);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT3_LABEL19, listview0_childWgt3_label19_binder);
listview0_childWgt3_panel23.addView(listview0_childWgt3_label19);

return listview0_childWgt3_panel23;
}
public View getListview0_childWgt3_panel11View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt3_panel11 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_LISTVIEW0_CHILDWGT3_PANEL11
,"halign","center"
,"height","fill"
,"weight","1"
,"layout-type","linear"
,"width","0"
,"onclick","toSchedulerDetail"
);
listview0_childWgt3_panel11.setOnClickListener(new OnCursorClickListener(configure) {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Scdu_myschedulerActivity.this);
    int position = this.getPosition(v);
    if(position>=0) {
      context.getCursor("cursorcalendar_eventlistalias").setCurrentIndex(position);
    }
    actionToSchedulerDetail(listview0_childWgt3_panel11,args);

}
});
View listview0_childWgt3_panel21 = (View) getListview0_childWgt3_panel21View((UMActivity)context,binderGroup,configure);
listview0_childWgt3_panel11.addView(listview0_childWgt3_panel21);
View listview0_childWgt3_panel22 = (View) getListview0_childWgt3_panel22View((UMActivity)context,binderGroup,configure);
listview0_childWgt3_panel11.addView(listview0_childWgt3_panel22);
View listview0_childWgt3_panel23 = (View) getListview0_childWgt3_panel23View((UMActivity)context,binderGroup,configure);
listview0_childWgt3_panel11.addView(listview0_childWgt3_panel23);

return listview0_childWgt3_panel11;
}
public View getListview0_childWgt3View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt3 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT3
,"padding-right","20"
,"padding-left","20"
,"height","70"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"valign","center"
);
View listview0_childWgt3_panel10 = (View) getListview0_childWgt3_panel10View((UMActivity)context,binderGroup,configure);
listview0_childWgt3.addView(listview0_childWgt3_panel10);
View listview0_childWgt3_panel11 = (View) getListview0_childWgt3_panel11View((UMActivity)context,binderGroup,configure);
listview0_childWgt3.addView(listview0_childWgt3_panel11);

return listview0_childWgt3;
}
public View getListview0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0 = (UMListViewBase)ThirdControl.createControl(new UMListViewBase(context),ID_LISTVIEW0
,"bindfield","calendar.eventlist"
,"weight","1"
,"height","0"
,"childindicator","timeLineHeadWidget"
,"cursoraction","cursorcalendar_eventlistalias"
,"layout-type","linear"
,"width","fill"
,"background","#ffffff"
,"synccontext","calendar.eventlist"
,"margin-top","20"
);
context.createCursor("cursorcalendar_eventlistalias", "calendar.eventlist");
UMListBinder listview0_binder = new UMListBinder((IUMContextAccessor)context);
listview0_binder.setBindInfo(new BindInfo("calendar.eventlist"));
listview0_binder.setControl(listview0);
binderGroup.addBinderToGroup(ID_LISTVIEW0, listview0_binder);
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

return listview0;
}
public View getPanel1View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel1 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL1
,"halign","center"
,"height","fill"
,"layout-type","vbox"
,"background","#ffffff"
,"width","fill"
);
View listview0 = (View) getListview0View((UMActivity)context,binderGroup,configure);
panel1.addView(listview0);

return panel1;
}
public View getCalendar0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
calendar0 = (UMHRCalendarView)ThirdControl.createControl(new UMHRCalendarView(context),ID_CALENDAR0
,"cal-selecteddate-background-image","yellowcircle"
,"bindfield","calendar"
,"halign","center"
,"ondaychanged","daychange"
,"onmonthchanged","monthchange"
,"cal-selecteddate-background","#FF8000"
,"layout","vbox"
,"cal-eventday-icon","lightspot"
,"cal-expiredeventday-icon","graylightpot"
,"eventdaymodel","icon"
,"background-image","calendar.png"
);
UMHRCalenderBinder calendar0_binder = new UMHRCalenderBinder((IUMContextAccessor)context);
calendar0_binder.setBindInfo(new BindInfo("calendar"));
calendar0_binder.setControl(calendar0);
binderGroup.addBinderToGroup(ID_CALENDAR0, calendar0_binder);
calendar0.setEvent("ondaychanged", new OnCursorEventListener(configure) {
  @Override
  public void onEvent(View v, UMEventArgs parent) {
    UMEventArgs args = new UMEventArgs(Scdu_myschedulerActivity.this);
    args.put(parent);
    actionDaychange(calendar0,args);

}
});
calendar0.setEvent("onmonthchanged", new OnCursorEventListener(configure) {
  @Override
  public void onEvent(View v, UMEventArgs parent) {
    UMEventArgs args = new UMEventArgs(Scdu_myschedulerActivity.this);
    args.put(parent);
    actionMonthchange(calendar0,args);

}
});
View panel1 = (View) getPanel1View((UMActivity)context,binderGroup,configure);
calendar0.addView(panel1);

return calendar0;
}
public View getPanel0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel0 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL0
,"halign","center"
,"height","0"
,"weight","1"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
);
View calendar0 = (View) getCalendar0View((UMActivity)context,binderGroup,configure);
panel0.addView(calendar0);

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
,"icon-background-image","oasche_myscheduler.png"
,"icon-pressed-image","oasche_myscheduler_touch.png"
,"onclick","toMyScheduler"
,"font-family","default"
,"valign","center"
,"checked","false"
,"icon-text-spacing","5"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,widget0_imagebutton0,"value","#{res.scdu_oascheduler_0030}"));
widget0_imagebutton0.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Scdu_myschedulerActivity.this);
    actionToMyScheduler(widget0_imagebutton0,args);

}
});
widget0_toolbar0.addView(widget0_imagebutton0);
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
,"icon-background-image","oasche_sharescheduler.png"
,"icon-pressed-image","oasche_sharescheduler_touch.png"
,"onclick","toShareScheduler"
,"font-family","default"
,"valign","center"
,"checked","false"
,"icon-text-spacing","5"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,widget0_imagebutton1,"value","#{res.scdu_oascheduler_0039}"));
widget0_imagebutton1.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Scdu_myschedulerActivity.this);
    actionToShareScheduler(widget0_imagebutton1,args);

}
});
widget0_toolbar0.addView(widget0_imagebutton1);

return widget0_toolbar0;
}
public View getWidget0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
widget0 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_WIDGET0
,"halign","center"
,"height","49"
,"layout-type","linear"
,"width","fill"
);
View widget0_toolbar0 = (View) getWidget0_toolbar0View((UMActivity)context,binderGroup,configure);
widget0.addView(widget0_toolbar0);

return widget0;
}
public View getPanel2View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel2 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL2
,"height","49"
,"onload","tabBarOnload"
,"layout-type","linear"
,"width","fill"
,"valign","center"
);
View widget0 = (View) getWidget0View((UMActivity)context,binderGroup,configure);
panel2.addView(widget0);

return panel2;
}
public View getViewPage0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
viewPage0 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_VIEWPAGE0
,"halign","center"
,"height","fill"
,"onload","monthchange"
,"layout-type","vbox"
,"width","fill"
);
View navigatorbar0 = (View) getNavigatorbar0View((UMActivity)context,binderGroup,configure);
viewPage0.addView(navigatorbar0);
View panel0 = (View) getPanel0View((UMActivity)context,binderGroup,configure);
viewPage0.addView(panel0);
View panel2 = (View) getPanel2View((UMActivity)context,binderGroup,configure);
viewPage0.addView(panel2);

return viewPage0;
}
public UMWindow getCurrentWindow(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
myscheduler = (UMWindow)ThirdControl.createControl(new UMWindow(context),ID_MYSCHEDULER
,"halign","center"
,"height","fill"
,"layout","vbox"
,"width","fill"
,"context","calendar"
,"controller","myschedulerController"
,"namespace","nc.bs.oa.oama.ecm"
);
View viewPage0 = (View) getViewPage0View((UMActivity)context,binderGroup,configure);
myscheduler.addView(viewPage0);

return (UMWindow)myscheduler;
}

	
	public void actionTabBarOnload(View control, UMEventArgs args) {
    String actionid = "tabBarOnload";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "tabBarOnload",UMActivity.getViewId(control),args);
}
public void actionToMyScheduler(View control, UMEventArgs args) {
    String actionid = "toMyScheduler";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "toMyScheduler",UMActivity.getViewId(control),args);
}
public void actionToAddScheduler(View control, UMEventArgs args) {
    String actionid = "toAddScheduler";
    args.put("daytime","#{calendar.day}");
    args.put("schtype","add");
    args.put("viewid","nc.bs.oa.oama.ecm.Scdu_addscheduler");
  this.dataCollect();
    args.put("callback","monthchange");
    args.put("iskeep","true");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.open(args);
}
public void actionToDesk(View control, UMEventArgs args) {
    String actionid = "toDesk";
    args.put("resultcode","0");
    args.put("iskeep","false");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.close(args);
}
public void actionDaychange(View control, UMEventArgs args) {
    String actionid = "daychange";
    args.put("viewid","nc.bs.oa.oama.scheduler.CalendarExtendController");
  this.dataCollect();
    args.put("action","getEventList");
    args.put("callback","setSelector");
    args.put("autodatabinding","false");
    args.put("type","1");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMCalendar.getDayChange(args);
}
public void actionLoginFailed(View control, UMEventArgs args) {
    String actionid = "loginFailed";
    args.put("resultcode","0");
    args.put("iskeep","false");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.close(args);
}
public void actionMonthchange(View control, UMEventArgs args) {
    String actionid = "monthchange";
    args.put("viewid","nc.bs.oa.oama.scheduler.CalendarExtendController");
    args.put("action","getMonthScheduleinfo");
    args.put("type","1");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMCalendar.getMonthChange(args);
}
public void actionToShareScheduler(View control, UMEventArgs args) {
    String actionid = "toShareScheduler";
    args.put("viewid","nc.bs.oa.oama.ecm.Scdu_sharescheduler");
    args.put("iskeep","false");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.open(args);
}
public void actionToTimeset(View control, UMEventArgs args) {
    String actionid = "toTimeset";
    args.put("viewid","nc.bs.oa.oama.ecm.Scdu_timeset");
    args.put("iskeep","false");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.open(args);
}
public void actionSetSelector(View control, UMEventArgs args) {
    String actionid = "setSelector";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "setSelector",UMActivity.getViewId(control),args);
}
public void actionToToday(View control, UMEventArgs args) {
    String actionid = "toToday";
    args.put("controlid","calendar0");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMCalendar.getToToday(args);
}
public void actionToSchedulerDetailOnce(View control, UMEventArgs args) {
    String actionid = "toSchedulerDetailOnce";
    args.put("daytime","#{calendar.day}");
  this.dataCollect();
    args.put("containerName","");
    args.put("row","#{#{cursor.cursorcalendar_eventlistalias}}");
    args.put("row_arrayPath","eventlist");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "toSchedulerDetailOnce",UMActivity.getViewId(control),args);
}
public void actionLogin(View control, UMEventArgs args) {
    String actionid = "login";
    args.put("failedexit","true");
    args.put("type","ua");
    args.put("success","monthchange");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMService.login(args);
}
public void actionToSchedulerDetail(View control, UMEventArgs args) {
    String actionid = "toSchedulerDetail";
    args.put("daytime","#{calendar.day}");
  this.dataCollect();
    args.put("containerName","");
    args.put("row","#{#{cursor.cursorcalendar_eventlistalias}}");
    args.put("row_arrayPath","eventlist");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "toSchedulerDetail",UMActivity.getViewId(control),args);
}
public void actionToSchedulerDetailAll(View control, UMEventArgs args) {
    String actionid = "toSchedulerDetailAll";
    args.put("daytime","#{calendar.day}");
  this.dataCollect();
    args.put("containerName","");
    args.put("row","#{#{cursor.cursorcalendar_eventlistalias}}");
    args.put("row_arrayPath","eventlist");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "toSchedulerDetailAll",UMActivity.getViewId(control),args);
}


}
