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

public abstract class Task_mainviewthreeforoneActivity extends UMWindowActivity {

	protected UMWindow mainviewthreeforone = null;
protected XVerticalLayout viewPage0 = null;
protected XVerticalLayout navPanel = null;
protected XHorizontalLayout widget1 = null;
protected XHorizontalLayout widget1_toplistwidget = null;
protected XHorizontalLayout widget1_leftPanel = null;
protected UMButton widget1_button0 = null;
protected UMToggleButtonGroup widget1_togglebuttongroup0 = null;
protected UMToggleButton widget1_togglebutton0 = null;
protected UMToggleButton widget1_togglebutton1 = null;
protected UMToggleButton widget1_togglebutton2 = null;
protected UMToggleButton widget1_togglebutton3 = null;
protected XVerticalLayout widget1_rightPanel = null;
protected UMButton widget1_addtask = null;
protected XVerticalLayout panel0 = null;
protected UMListViewBase listview0 = null;
protected XHorizontalLayout listview0_childWgt0 = null;
protected XHorizontalLayout listview0_childWgt0_pane231 = null;
protected XVerticalLayout listview0_childWgt0_panel13 = null;
protected XHorizontalLayout listview0_childWgt0_panel15 = null;
protected UMLabel listview0_childWgt0_label8 = null;
protected UMImage listview0_childWgt0_image5 = null;
protected UMLabel listview0_childWgt0_label9 = null;
protected UMLabel listview0_childWgt0_label0 = null;
protected UMLabel listview0_childWgt0_label2 = null;
protected XHorizontalLayout listview0_childWgt0_panel16 = null;
protected UMLabel listview0_childWgt0_label7 = null;
protected UMLabel listview0_childWgt0_label1 = null;
protected XHorizontalLayout listview0_childWgt0_panel0 = null;
protected UMProgressBar listview0_childWgt0_progressbar0 = null;
protected XHorizontalLayout listview0_childWgt0_panel14 = null;
protected UMImage listview0_childWgt0_image4 = null;
protected XHorizontalLayout listview0_childWgt1 = null;
protected XHorizontalLayout listview0_childWgt1_pane231 = null;
protected XVerticalLayout listview0_childWgt1_panel13 = null;
protected XHorizontalLayout listview0_childWgt1_panel15 = null;
protected UMLabel listview0_childWgt1_label8 = null;
protected UMLabel listview0_childWgt1_label9 = null;
protected UMLabel listview0_childWgt1_label0 = null;
protected UMLabel listview0_childWgt1_label2 = null;
protected XHorizontalLayout listview0_childWgt1_panel16 = null;
protected UMLabel listview0_childWgt1_label7 = null;
protected UMLabel listview0_childWgt1_label1 = null;
protected XHorizontalLayout listview0_childWgt1_panel0 = null;
protected UMProgressBar listview0_childWgt1_progressbar0 = null;
protected XHorizontalLayout listview0_childWgt1_panel14 = null;
protected UMImage listview0_childWgt1_image4 = null;
protected XHorizontalLayout listview0_childWgt2 = null;
protected XHorizontalLayout listview0_childWgt2_pane231 = null;
protected XVerticalLayout listview0_childWgt2_panel13 = null;
protected XHorizontalLayout listview0_childWgt2_panel15 = null;
protected UMLabel listview0_childWgt2_label8 = null;
protected UMImage listview0_childWgt2_image5 = null;
protected UMLabel listview0_childWgt2_label9 = null;
protected UMLabel listview0_childWgt2_label0 = null;
protected UMLabel listview0_childWgt2_label2 = null;
protected XHorizontalLayout listview0_childWgt2_panel16 = null;
protected UMLabel listview0_childWgt2_label7 = null;
protected UMLabel listview0_childWgt2_label1 = null;
protected XHorizontalLayout listview0_childWgt2_panel0 = null;
protected UMProgressBar listview0_childWgt2_progressbar0 = null;
protected XHorizontalLayout listview0_childWgt2_panel14 = null;
protected UMImage listview0_childWgt2_image4 = null;
protected XHorizontalLayout listview0_childWgt3 = null;
protected XHorizontalLayout listview0_childWgt3_pane231 = null;
protected XVerticalLayout listview0_childWgt3_panel13 = null;
protected XHorizontalLayout listview0_childWgt3_panel15 = null;
protected UMLabel listview0_childWgt3_label8 = null;
protected UMLabel listview0_childWgt3_label9 = null;
protected UMLabel listview0_childWgt3_label0 = null;
protected UMLabel listview0_childWgt3_label2 = null;
protected XHorizontalLayout listview0_childWgt3_panel16 = null;
protected UMLabel listview0_childWgt3_label7 = null;
protected UMLabel listview0_childWgt3_label1 = null;
protected XHorizontalLayout listview0_childWgt3_panel0 = null;
protected UMProgressBar listview0_childWgt3_progressbar0 = null;
protected XHorizontalLayout listview0_childWgt3_panel14 = null;
protected UMImage listview0_childWgt3_image4 = null;
protected XHorizontalLayout listview0_childWgt4 = null;
protected XHorizontalLayout listview0_childWgt4_pane231 = null;
protected XVerticalLayout listview0_childWgt4_panel13 = null;
protected XHorizontalLayout listview0_childWgt4_panel15 = null;
protected UMLabel listview0_childWgt4_label8 = null;
protected UMLabel listview0_childWgt4_label3 = null;
protected UMLabel listview0_childWgt4_label6 = null;
protected UMImage listview0_childWgt4_image5 = null;
protected UMLabel listview0_childWgt4_label9 = null;
protected UMLabel listview0_childWgt4_label0 = null;
protected UMLabel listview0_childWgt4_label2 = null;
protected XHorizontalLayout listview0_childWgt4_panel16 = null;
protected UMLabel listview0_childWgt4_label7 = null;
protected UMLabel listview0_childWgt4_label1 = null;
protected XHorizontalLayout listview0_childWgt4_panel0 = null;
protected UMProgressBar listview0_childWgt4_progressbar0 = null;
protected XHorizontalLayout listview0_childWgt4_panel14 = null;
protected UMImage listview0_childWgt4_image4 = null;
protected XHorizontalLayout listview0_childWgt5 = null;
protected XHorizontalLayout listview0_childWgt5_pane231 = null;
protected XVerticalLayout listview0_childWgt5_panel13 = null;
protected XHorizontalLayout listview0_childWgt5_panel15 = null;
protected UMLabel listview0_childWgt5_label8 = null;
protected UMLabel listview0_childWgt5_label3 = null;
protected UMLabel listview0_childWgt5_label6 = null;
protected UMLabel listview0_childWgt5_label9 = null;
protected UMLabel listview0_childWgt5_label0 = null;
protected UMLabel listview0_childWgt5_label2 = null;
protected XHorizontalLayout listview0_childWgt5_panel16 = null;
protected UMLabel listview0_childWgt5_label7 = null;
protected UMLabel listview0_childWgt5_label1 = null;
protected XHorizontalLayout listview0_childWgt5_panel0 = null;
protected UMProgressBar listview0_childWgt5_progressbar0 = null;
protected XHorizontalLayout listview0_childWgt5_panel14 = null;
protected UMImage listview0_childWgt5_image4 = null;
protected XHorizontalLayout listview0_childWgt6 = null;
protected XHorizontalLayout listview0_childWgt6_pane231 = null;
protected XVerticalLayout listview0_childWgt6_panel13 = null;
protected XHorizontalLayout listview0_childWgt6_panel15 = null;
protected UMLabel listview0_childWgt6_label8 = null;
protected UMLabel listview0_childWgt6_label3 = null;
protected UMLabel listview0_childWgt6_label6 = null;
protected UMImage listview0_childWgt6_image5 = null;
protected UMLabel listview0_childWgt6_label9 = null;
protected UMLabel listview0_childWgt6_label0 = null;
protected UMLabel listview0_childWgt6_label2 = null;
protected XHorizontalLayout listview0_childWgt6_panel16 = null;
protected UMLabel listview0_childWgt6_label7 = null;
protected UMLabel listview0_childWgt6_label1 = null;
protected XHorizontalLayout listview0_childWgt6_panel0 = null;
protected UMProgressBar listview0_childWgt6_progressbar0 = null;
protected XHorizontalLayout listview0_childWgt6_panel14 = null;
protected UMImage listview0_childWgt6_image4 = null;
protected XHorizontalLayout listview0_childWgt7 = null;
protected XHorizontalLayout listview0_childWgt7_pane231 = null;
protected XVerticalLayout listview0_childWgt7_panel13 = null;
protected XHorizontalLayout listview0_childWgt7_panel15 = null;
protected UMLabel listview0_childWgt7_label8 = null;
protected UMLabel listview0_childWgt7_label3 = null;
protected UMLabel listview0_childWgt7_label6 = null;
protected UMLabel listview0_childWgt7_label9 = null;
protected UMLabel listview0_childWgt7_label0 = null;
protected UMLabel listview0_childWgt7_label2 = null;
protected XHorizontalLayout listview0_childWgt7_panel16 = null;
protected UMLabel listview0_childWgt7_label7 = null;
protected UMLabel listview0_childWgt7_label1 = null;
protected XHorizontalLayout listview0_childWgt7_panel0 = null;
protected UMProgressBar listview0_childWgt7_progressbar0 = null;
protected XHorizontalLayout listview0_childWgt7_panel14 = null;
protected UMImage listview0_childWgt7_image4 = null;
protected XHorizontalLayout navigatorbar1 = null;
protected XVerticalLayout widget0 = null;
protected XHorizontalLayout widget0_toolbar0 = null;
protected XVerticalLayout widget0_panel1 = null;
protected UMImageButton widget0_imagebutton0 = null;
protected XVerticalLayout widget0_panel2 = null;
protected UMImageButton widget0_imagebutton1 = null;

	
	protected final static int ID_MAINVIEWTHREEFORONE = 993262367;
protected final static int ID_VIEWPAGE0 = 708095819;
protected final static int ID_NAVPANEL = 443951499;
protected final static int ID_WIDGET1 = 2122468170;
protected final static int ID_WIDGET1_TOPLISTWIDGET = 513215168;
protected final static int ID_WIDGET1_LEFTPANEL = 279394931;
protected final static int ID_WIDGET1_BUTTON0 = 1327375877;
protected final static int ID_WIDGET1_TOGGLEBUTTONGROUP0 = 1894707258;
protected final static int ID_WIDGET1_TOGGLEBUTTON0 = 1710261225;
protected final static int ID_WIDGET1_TOGGLEBUTTON1 = 2043736641;
protected final static int ID_WIDGET1_TOGGLEBUTTON2 = 1485201383;
protected final static int ID_WIDGET1_TOGGLEBUTTON3 = 839382354;
protected final static int ID_WIDGET1_RIGHTPANEL = 1013806619;
protected final static int ID_WIDGET1_ADDTASK = 2100392212;
protected final static int ID_PANEL0 = 765649109;
protected final static int ID_LISTVIEW0 = 1462532827;
protected final static int ID_LISTVIEW0_CHILDWGT0 = 1865656552;
protected final static int ID_LISTVIEW0_CHILDWGT0_PANE231 = 1521573882;
protected final static int ID_LISTVIEW0_CHILDWGT0_PANEL13 = 2021597596;
protected final static int ID_LISTVIEW0_CHILDWGT0_PANEL15 = 2059085412;
protected final static int ID_LISTVIEW0_CHILDWGT0_LABEL8 = 1758786542;
protected final static int ID_LISTVIEW0_CHILDWGT0_IMAGE5 = 1645031661;
protected final static int ID_LISTVIEW0_CHILDWGT0_LABEL9 = 534608965;
protected final static int ID_LISTVIEW0_CHILDWGT0_LABEL0 = 920972712;
protected final static int ID_LISTVIEW0_CHILDWGT0_LABEL2 = 1310254330;
protected final static int ID_LISTVIEW0_CHILDWGT0_PANEL16 = 744826866;
protected final static int ID_LISTVIEW0_CHILDWGT0_LABEL7 = 1485851359;
protected final static int ID_LISTVIEW0_CHILDWGT0_LABEL1 = 1275247772;
protected final static int ID_LISTVIEW0_CHILDWGT0_PANEL0 = 1923379931;
protected final static int ID_LISTVIEW0_CHILDWGT0_PROGRESSBAR0 = 664714805;
protected final static int ID_LISTVIEW0_CHILDWGT0_PANEL14 = 1703117120;
protected final static int ID_LISTVIEW0_CHILDWGT0_IMAGE4 = 590711957;
protected final static int ID_LISTVIEW0_CHILDWGT1 = 2071829686;
protected final static int ID_LISTVIEW0_CHILDWGT1_PANE231 = 1246939420;
protected final static int ID_LISTVIEW0_CHILDWGT1_PANEL13 = 1284727774;
protected final static int ID_LISTVIEW0_CHILDWGT1_PANEL15 = 2011104909;
protected final static int ID_LISTVIEW0_CHILDWGT1_LABEL8 = 1066397479;
protected final static int ID_LISTVIEW0_CHILDWGT1_LABEL9 = 248568751;
protected final static int ID_LISTVIEW0_CHILDWGT1_LABEL0 = 346146134;
protected final static int ID_LISTVIEW0_CHILDWGT1_LABEL2 = 1057710179;
protected final static int ID_LISTVIEW0_CHILDWGT1_PANEL16 = 1269289153;
protected final static int ID_LISTVIEW0_CHILDWGT1_LABEL7 = 1113536347;
protected final static int ID_LISTVIEW0_CHILDWGT1_LABEL1 = 1860830259;
protected final static int ID_LISTVIEW0_CHILDWGT1_PANEL0 = 434031445;
protected final static int ID_LISTVIEW0_CHILDWGT1_PROGRESSBAR0 = 1204914284;
protected final static int ID_LISTVIEW0_CHILDWGT1_PANEL14 = 732243738;
protected final static int ID_LISTVIEW0_CHILDWGT1_IMAGE4 = 1120710470;
protected final static int ID_LISTVIEW0_CHILDWGT2 = 1242406241;
protected final static int ID_LISTVIEW0_CHILDWGT2_PANE231 = 1586712857;
protected final static int ID_LISTVIEW0_CHILDWGT2_PANEL13 = 1230239101;
protected final static int ID_LISTVIEW0_CHILDWGT2_PANEL15 = 1038740369;
protected final static int ID_LISTVIEW0_CHILDWGT2_LABEL8 = 1372348683;
protected final static int ID_LISTVIEW0_CHILDWGT2_IMAGE5 = 438133346;
protected final static int ID_LISTVIEW0_CHILDWGT2_LABEL9 = 356907319;
protected final static int ID_LISTVIEW0_CHILDWGT2_LABEL0 = 2047000705;
protected final static int ID_LISTVIEW0_CHILDWGT2_LABEL2 = 967996195;
protected final static int ID_LISTVIEW0_CHILDWGT2_PANEL16 = 377546570;
protected final static int ID_LISTVIEW0_CHILDWGT2_LABEL7 = 1893578674;
protected final static int ID_LISTVIEW0_CHILDWGT2_LABEL1 = 165028874;
protected final static int ID_LISTVIEW0_CHILDWGT2_PANEL0 = 742277614;
protected final static int ID_LISTVIEW0_CHILDWGT2_PROGRESSBAR0 = 1686543520;
protected final static int ID_LISTVIEW0_CHILDWGT2_PANEL14 = 797021002;
protected final static int ID_LISTVIEW0_CHILDWGT2_IMAGE4 = 1978140421;
protected final static int ID_LISTVIEW0_CHILDWGT3 = 121418089;
protected final static int ID_LISTVIEW0_CHILDWGT3_PANE231 = 962784692;
protected final static int ID_LISTVIEW0_CHILDWGT3_PANEL13 = 1153044820;
protected final static int ID_LISTVIEW0_CHILDWGT3_PANEL15 = 1649038656;
protected final static int ID_LISTVIEW0_CHILDWGT3_LABEL8 = 964309926;
protected final static int ID_LISTVIEW0_CHILDWGT3_LABEL9 = 2067016261;
protected final static int ID_LISTVIEW0_CHILDWGT3_LABEL0 = 1256534409;
protected final static int ID_LISTVIEW0_CHILDWGT3_LABEL2 = 1045053968;
protected final static int ID_LISTVIEW0_CHILDWGT3_PANEL16 = 701841461;
protected final static int ID_LISTVIEW0_CHILDWGT3_LABEL7 = 168181912;
protected final static int ID_LISTVIEW0_CHILDWGT3_LABEL1 = 462688443;
protected final static int ID_LISTVIEW0_CHILDWGT3_PANEL0 = 704596210;
protected final static int ID_LISTVIEW0_CHILDWGT3_PROGRESSBAR0 = 963683120;
protected final static int ID_LISTVIEW0_CHILDWGT3_PANEL14 = 501240352;
protected final static int ID_LISTVIEW0_CHILDWGT3_IMAGE4 = 1555016127;
protected final static int ID_LISTVIEW0_CHILDWGT4 = 733693926;
protected final static int ID_LISTVIEW0_CHILDWGT4_PANE231 = 250135940;
protected final static int ID_LISTVIEW0_CHILDWGT4_PANEL13 = 833694848;
protected final static int ID_LISTVIEW0_CHILDWGT4_PANEL15 = 84693866;
protected final static int ID_LISTVIEW0_CHILDWGT4_LABEL8 = 1759534010;
protected final static int ID_LISTVIEW0_CHILDWGT4_LABEL3 = 1869699101;
protected final static int ID_LISTVIEW0_CHILDWGT4_LABEL6 = 790694404;
protected final static int ID_LISTVIEW0_CHILDWGT4_IMAGE5 = 1272521451;
protected final static int ID_LISTVIEW0_CHILDWGT4_LABEL9 = 322681294;
protected final static int ID_LISTVIEW0_CHILDWGT4_LABEL0 = 1840398073;
protected final static int ID_LISTVIEW0_CHILDWGT4_LABEL2 = 112715167;
protected final static int ID_LISTVIEW0_CHILDWGT4_PANEL16 = 317096221;
protected final static int ID_LISTVIEW0_CHILDWGT4_LABEL7 = 1844994718;
protected final static int ID_LISTVIEW0_CHILDWGT4_LABEL1 = 1188196959;
protected final static int ID_LISTVIEW0_CHILDWGT4_PANEL0 = 2026680421;
protected final static int ID_LISTVIEW0_CHILDWGT4_PROGRESSBAR0 = 465330336;
protected final static int ID_LISTVIEW0_CHILDWGT4_PANEL14 = 753403874;
protected final static int ID_LISTVIEW0_CHILDWGT4_IMAGE4 = 669759804;
protected final static int ID_LISTVIEW0_CHILDWGT5 = 875597743;
protected final static int ID_LISTVIEW0_CHILDWGT5_PANE231 = 1997093707;
protected final static int ID_LISTVIEW0_CHILDWGT5_PANEL13 = 1919838762;
protected final static int ID_LISTVIEW0_CHILDWGT5_PANEL15 = 663502254;
protected final static int ID_LISTVIEW0_CHILDWGT5_LABEL8 = 1113029534;
protected final static int ID_LISTVIEW0_CHILDWGT5_LABEL3 = 625131553;
protected final static int ID_LISTVIEW0_CHILDWGT5_LABEL6 = 1714217020;
protected final static int ID_LISTVIEW0_CHILDWGT5_LABEL9 = 1392781661;
protected final static int ID_LISTVIEW0_CHILDWGT5_LABEL0 = 1891097760;
protected final static int ID_LISTVIEW0_CHILDWGT5_LABEL2 = 616770680;
protected final static int ID_LISTVIEW0_CHILDWGT5_PANEL16 = 315533996;
protected final static int ID_LISTVIEW0_CHILDWGT5_LABEL7 = 622987041;
protected final static int ID_LISTVIEW0_CHILDWGT5_LABEL1 = 499048111;
protected final static int ID_LISTVIEW0_CHILDWGT5_PANEL0 = 1948530961;
protected final static int ID_LISTVIEW0_CHILDWGT5_PROGRESSBAR0 = 1482725639;
protected final static int ID_LISTVIEW0_CHILDWGT5_PANEL14 = 1201049631;
protected final static int ID_LISTVIEW0_CHILDWGT5_IMAGE4 = 1387937405;
protected final static int ID_LISTVIEW0_CHILDWGT6 = 520765762;
protected final static int ID_LISTVIEW0_CHILDWGT6_PANE231 = 1618671519;
protected final static int ID_LISTVIEW0_CHILDWGT6_PANEL13 = 721630789;
protected final static int ID_LISTVIEW0_CHILDWGT6_PANEL15 = 1725582976;
protected final static int ID_LISTVIEW0_CHILDWGT6_LABEL8 = 1336489776;
protected final static int ID_LISTVIEW0_CHILDWGT6_LABEL3 = 839269367;
protected final static int ID_LISTVIEW0_CHILDWGT6_LABEL6 = 151173897;
protected final static int ID_LISTVIEW0_CHILDWGT6_IMAGE5 = 335857681;
protected final static int ID_LISTVIEW0_CHILDWGT6_LABEL9 = 612266610;
protected final static int ID_LISTVIEW0_CHILDWGT6_LABEL0 = 1978285482;
protected final static int ID_LISTVIEW0_CHILDWGT6_LABEL2 = 26468109;
protected final static int ID_LISTVIEW0_CHILDWGT6_PANEL16 = 1991293482;
protected final static int ID_LISTVIEW0_CHILDWGT6_LABEL7 = 623651183;
protected final static int ID_LISTVIEW0_CHILDWGT6_LABEL1 = 1342019978;
protected final static int ID_LISTVIEW0_CHILDWGT6_PANEL0 = 1029323384;
protected final static int ID_LISTVIEW0_CHILDWGT6_PROGRESSBAR0 = 14288992;
protected final static int ID_LISTVIEW0_CHILDWGT6_PANEL14 = 323798980;
protected final static int ID_LISTVIEW0_CHILDWGT6_IMAGE4 = 1659216651;
protected final static int ID_LISTVIEW0_CHILDWGT7 = 1857018695;
protected final static int ID_LISTVIEW0_CHILDWGT7_PANE231 = 1312391392;
protected final static int ID_LISTVIEW0_CHILDWGT7_PANEL13 = 771703134;
protected final static int ID_LISTVIEW0_CHILDWGT7_PANEL15 = 632915938;
protected final static int ID_LISTVIEW0_CHILDWGT7_LABEL8 = 2130512239;
protected final static int ID_LISTVIEW0_CHILDWGT7_LABEL3 = 143226867;
protected final static int ID_LISTVIEW0_CHILDWGT7_LABEL6 = 1552987738;
protected final static int ID_LISTVIEW0_CHILDWGT7_LABEL9 = 2051115497;
protected final static int ID_LISTVIEW0_CHILDWGT7_LABEL0 = 256958796;
protected final static int ID_LISTVIEW0_CHILDWGT7_LABEL2 = 1953953937;
protected final static int ID_LISTVIEW0_CHILDWGT7_PANEL16 = 176125140;
protected final static int ID_LISTVIEW0_CHILDWGT7_LABEL7 = 215315269;
protected final static int ID_LISTVIEW0_CHILDWGT7_LABEL1 = 960541576;
protected final static int ID_LISTVIEW0_CHILDWGT7_PANEL0 = 1008012143;
protected final static int ID_LISTVIEW0_CHILDWGT7_PROGRESSBAR0 = 435127389;
protected final static int ID_LISTVIEW0_CHILDWGT7_PANEL14 = 244622677;
protected final static int ID_LISTVIEW0_CHILDWGT7_IMAGE4 = 1151340280;
protected final static int ID_NAVIGATORBAR1 = 1933859830;
protected final static int ID_WIDGET0 = 1734597358;
protected final static int ID_WIDGET0_TOOLBAR0 = 1318878877;
protected final static int ID_WIDGET0_PANEL1 = 1567402434;
protected final static int ID_WIDGET0_IMAGEBUTTON0 = 423244004;
protected final static int ID_WIDGET0_PANEL2 = 1792052675;
protected final static int ID_WIDGET0_IMAGEBUTTON1 = 1116510980;

	
	
	@Override
	public String getControllerName() {
		return "mainviewthreeforoneController";
	}
	
	@Override
	public String getContextName() {
		return "detaillist";
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
		  idmap.put("mainviewthreeforone",ID_MAINVIEWTHREEFORONE);
  idmap.put("viewPage0",ID_VIEWPAGE0);
  idmap.put("navPanel",ID_NAVPANEL);
  idmap.put("widget1",ID_WIDGET1);
  idmap.put("widget1_toplistwidget",ID_WIDGET1_TOPLISTWIDGET);
  idmap.put("widget1_leftPanel",ID_WIDGET1_LEFTPANEL);
  idmap.put("widget1_button0",ID_WIDGET1_BUTTON0);
  idmap.put("widget1_togglebuttongroup0",ID_WIDGET1_TOGGLEBUTTONGROUP0);
  idmap.put("widget1_togglebutton0",ID_WIDGET1_TOGGLEBUTTON0);
  idmap.put("widget1_togglebutton1",ID_WIDGET1_TOGGLEBUTTON1);
  idmap.put("widget1_togglebutton2",ID_WIDGET1_TOGGLEBUTTON2);
  idmap.put("widget1_togglebutton3",ID_WIDGET1_TOGGLEBUTTON3);
  idmap.put("widget1_rightPanel",ID_WIDGET1_RIGHTPANEL);
  idmap.put("widget1_addtask",ID_WIDGET1_ADDTASK);
  idmap.put("panel0",ID_PANEL0);
  idmap.put("listview0",ID_LISTVIEW0);
  idmap.put("listview0_childWgt0",ID_LISTVIEW0_CHILDWGT0);
  idmap.put("listview0_childWgt0_pane231",ID_LISTVIEW0_CHILDWGT0_PANE231);
  idmap.put("listview0_childWgt0_panel13",ID_LISTVIEW0_CHILDWGT0_PANEL13);
  idmap.put("listview0_childWgt0_panel15",ID_LISTVIEW0_CHILDWGT0_PANEL15);
  idmap.put("listview0_childWgt0_label8",ID_LISTVIEW0_CHILDWGT0_LABEL8);
  idmap.put("listview0_childWgt0_image5",ID_LISTVIEW0_CHILDWGT0_IMAGE5);
  idmap.put("listview0_childWgt0_label9",ID_LISTVIEW0_CHILDWGT0_LABEL9);
  idmap.put("listview0_childWgt0_label0",ID_LISTVIEW0_CHILDWGT0_LABEL0);
  idmap.put("listview0_childWgt0_label2",ID_LISTVIEW0_CHILDWGT0_LABEL2);
  idmap.put("listview0_childWgt0_panel16",ID_LISTVIEW0_CHILDWGT0_PANEL16);
  idmap.put("listview0_childWgt0_label7",ID_LISTVIEW0_CHILDWGT0_LABEL7);
  idmap.put("listview0_childWgt0_label1",ID_LISTVIEW0_CHILDWGT0_LABEL1);
  idmap.put("listview0_childWgt0_panel0",ID_LISTVIEW0_CHILDWGT0_PANEL0);
  idmap.put("listview0_childWgt0_progressbar0",ID_LISTVIEW0_CHILDWGT0_PROGRESSBAR0);
  idmap.put("listview0_childWgt0_panel14",ID_LISTVIEW0_CHILDWGT0_PANEL14);
  idmap.put("listview0_childWgt0_image4",ID_LISTVIEW0_CHILDWGT0_IMAGE4);
  idmap.put("listview0_childWgt1",ID_LISTVIEW0_CHILDWGT1);
  idmap.put("listview0_childWgt1_pane231",ID_LISTVIEW0_CHILDWGT1_PANE231);
  idmap.put("listview0_childWgt1_panel13",ID_LISTVIEW0_CHILDWGT1_PANEL13);
  idmap.put("listview0_childWgt1_panel15",ID_LISTVIEW0_CHILDWGT1_PANEL15);
  idmap.put("listview0_childWgt1_label8",ID_LISTVIEW0_CHILDWGT1_LABEL8);
  idmap.put("listview0_childWgt1_label9",ID_LISTVIEW0_CHILDWGT1_LABEL9);
  idmap.put("listview0_childWgt1_label0",ID_LISTVIEW0_CHILDWGT1_LABEL0);
  idmap.put("listview0_childWgt1_label2",ID_LISTVIEW0_CHILDWGT1_LABEL2);
  idmap.put("listview0_childWgt1_panel16",ID_LISTVIEW0_CHILDWGT1_PANEL16);
  idmap.put("listview0_childWgt1_label7",ID_LISTVIEW0_CHILDWGT1_LABEL7);
  idmap.put("listview0_childWgt1_label1",ID_LISTVIEW0_CHILDWGT1_LABEL1);
  idmap.put("listview0_childWgt1_panel0",ID_LISTVIEW0_CHILDWGT1_PANEL0);
  idmap.put("listview0_childWgt1_progressbar0",ID_LISTVIEW0_CHILDWGT1_PROGRESSBAR0);
  idmap.put("listview0_childWgt1_panel14",ID_LISTVIEW0_CHILDWGT1_PANEL14);
  idmap.put("listview0_childWgt1_image4",ID_LISTVIEW0_CHILDWGT1_IMAGE4);
  idmap.put("listview0_childWgt2",ID_LISTVIEW0_CHILDWGT2);
  idmap.put("listview0_childWgt2_pane231",ID_LISTVIEW0_CHILDWGT2_PANE231);
  idmap.put("listview0_childWgt2_panel13",ID_LISTVIEW0_CHILDWGT2_PANEL13);
  idmap.put("listview0_childWgt2_panel15",ID_LISTVIEW0_CHILDWGT2_PANEL15);
  idmap.put("listview0_childWgt2_label8",ID_LISTVIEW0_CHILDWGT2_LABEL8);
  idmap.put("listview0_childWgt2_image5",ID_LISTVIEW0_CHILDWGT2_IMAGE5);
  idmap.put("listview0_childWgt2_label9",ID_LISTVIEW0_CHILDWGT2_LABEL9);
  idmap.put("listview0_childWgt2_label0",ID_LISTVIEW0_CHILDWGT2_LABEL0);
  idmap.put("listview0_childWgt2_label2",ID_LISTVIEW0_CHILDWGT2_LABEL2);
  idmap.put("listview0_childWgt2_panel16",ID_LISTVIEW0_CHILDWGT2_PANEL16);
  idmap.put("listview0_childWgt2_label7",ID_LISTVIEW0_CHILDWGT2_LABEL7);
  idmap.put("listview0_childWgt2_label1",ID_LISTVIEW0_CHILDWGT2_LABEL1);
  idmap.put("listview0_childWgt2_panel0",ID_LISTVIEW0_CHILDWGT2_PANEL0);
  idmap.put("listview0_childWgt2_progressbar0",ID_LISTVIEW0_CHILDWGT2_PROGRESSBAR0);
  idmap.put("listview0_childWgt2_panel14",ID_LISTVIEW0_CHILDWGT2_PANEL14);
  idmap.put("listview0_childWgt2_image4",ID_LISTVIEW0_CHILDWGT2_IMAGE4);
  idmap.put("listview0_childWgt3",ID_LISTVIEW0_CHILDWGT3);
  idmap.put("listview0_childWgt3_pane231",ID_LISTVIEW0_CHILDWGT3_PANE231);
  idmap.put("listview0_childWgt3_panel13",ID_LISTVIEW0_CHILDWGT3_PANEL13);
  idmap.put("listview0_childWgt3_panel15",ID_LISTVIEW0_CHILDWGT3_PANEL15);
  idmap.put("listview0_childWgt3_label8",ID_LISTVIEW0_CHILDWGT3_LABEL8);
  idmap.put("listview0_childWgt3_label9",ID_LISTVIEW0_CHILDWGT3_LABEL9);
  idmap.put("listview0_childWgt3_label0",ID_LISTVIEW0_CHILDWGT3_LABEL0);
  idmap.put("listview0_childWgt3_label2",ID_LISTVIEW0_CHILDWGT3_LABEL2);
  idmap.put("listview0_childWgt3_panel16",ID_LISTVIEW0_CHILDWGT3_PANEL16);
  idmap.put("listview0_childWgt3_label7",ID_LISTVIEW0_CHILDWGT3_LABEL7);
  idmap.put("listview0_childWgt3_label1",ID_LISTVIEW0_CHILDWGT3_LABEL1);
  idmap.put("listview0_childWgt3_panel0",ID_LISTVIEW0_CHILDWGT3_PANEL0);
  idmap.put("listview0_childWgt3_progressbar0",ID_LISTVIEW0_CHILDWGT3_PROGRESSBAR0);
  idmap.put("listview0_childWgt3_panel14",ID_LISTVIEW0_CHILDWGT3_PANEL14);
  idmap.put("listview0_childWgt3_image4",ID_LISTVIEW0_CHILDWGT3_IMAGE4);
  idmap.put("listview0_childWgt4",ID_LISTVIEW0_CHILDWGT4);
  idmap.put("listview0_childWgt4_pane231",ID_LISTVIEW0_CHILDWGT4_PANE231);
  idmap.put("listview0_childWgt4_panel13",ID_LISTVIEW0_CHILDWGT4_PANEL13);
  idmap.put("listview0_childWgt4_panel15",ID_LISTVIEW0_CHILDWGT4_PANEL15);
  idmap.put("listview0_childWgt4_label8",ID_LISTVIEW0_CHILDWGT4_LABEL8);
  idmap.put("listview0_childWgt4_label3",ID_LISTVIEW0_CHILDWGT4_LABEL3);
  idmap.put("listview0_childWgt4_label6",ID_LISTVIEW0_CHILDWGT4_LABEL6);
  idmap.put("listview0_childWgt4_image5",ID_LISTVIEW0_CHILDWGT4_IMAGE5);
  idmap.put("listview0_childWgt4_label9",ID_LISTVIEW0_CHILDWGT4_LABEL9);
  idmap.put("listview0_childWgt4_label0",ID_LISTVIEW0_CHILDWGT4_LABEL0);
  idmap.put("listview0_childWgt4_label2",ID_LISTVIEW0_CHILDWGT4_LABEL2);
  idmap.put("listview0_childWgt4_panel16",ID_LISTVIEW0_CHILDWGT4_PANEL16);
  idmap.put("listview0_childWgt4_label7",ID_LISTVIEW0_CHILDWGT4_LABEL7);
  idmap.put("listview0_childWgt4_label1",ID_LISTVIEW0_CHILDWGT4_LABEL1);
  idmap.put("listview0_childWgt4_panel0",ID_LISTVIEW0_CHILDWGT4_PANEL0);
  idmap.put("listview0_childWgt4_progressbar0",ID_LISTVIEW0_CHILDWGT4_PROGRESSBAR0);
  idmap.put("listview0_childWgt4_panel14",ID_LISTVIEW0_CHILDWGT4_PANEL14);
  idmap.put("listview0_childWgt4_image4",ID_LISTVIEW0_CHILDWGT4_IMAGE4);
  idmap.put("listview0_childWgt5",ID_LISTVIEW0_CHILDWGT5);
  idmap.put("listview0_childWgt5_pane231",ID_LISTVIEW0_CHILDWGT5_PANE231);
  idmap.put("listview0_childWgt5_panel13",ID_LISTVIEW0_CHILDWGT5_PANEL13);
  idmap.put("listview0_childWgt5_panel15",ID_LISTVIEW0_CHILDWGT5_PANEL15);
  idmap.put("listview0_childWgt5_label8",ID_LISTVIEW0_CHILDWGT5_LABEL8);
  idmap.put("listview0_childWgt5_label3",ID_LISTVIEW0_CHILDWGT5_LABEL3);
  idmap.put("listview0_childWgt5_label6",ID_LISTVIEW0_CHILDWGT5_LABEL6);
  idmap.put("listview0_childWgt5_label9",ID_LISTVIEW0_CHILDWGT5_LABEL9);
  idmap.put("listview0_childWgt5_label0",ID_LISTVIEW0_CHILDWGT5_LABEL0);
  idmap.put("listview0_childWgt5_label2",ID_LISTVIEW0_CHILDWGT5_LABEL2);
  idmap.put("listview0_childWgt5_panel16",ID_LISTVIEW0_CHILDWGT5_PANEL16);
  idmap.put("listview0_childWgt5_label7",ID_LISTVIEW0_CHILDWGT5_LABEL7);
  idmap.put("listview0_childWgt5_label1",ID_LISTVIEW0_CHILDWGT5_LABEL1);
  idmap.put("listview0_childWgt5_panel0",ID_LISTVIEW0_CHILDWGT5_PANEL0);
  idmap.put("listview0_childWgt5_progressbar0",ID_LISTVIEW0_CHILDWGT5_PROGRESSBAR0);
  idmap.put("listview0_childWgt5_panel14",ID_LISTVIEW0_CHILDWGT5_PANEL14);
  idmap.put("listview0_childWgt5_image4",ID_LISTVIEW0_CHILDWGT5_IMAGE4);
  idmap.put("listview0_childWgt6",ID_LISTVIEW0_CHILDWGT6);
  idmap.put("listview0_childWgt6_pane231",ID_LISTVIEW0_CHILDWGT6_PANE231);
  idmap.put("listview0_childWgt6_panel13",ID_LISTVIEW0_CHILDWGT6_PANEL13);
  idmap.put("listview0_childWgt6_panel15",ID_LISTVIEW0_CHILDWGT6_PANEL15);
  idmap.put("listview0_childWgt6_label8",ID_LISTVIEW0_CHILDWGT6_LABEL8);
  idmap.put("listview0_childWgt6_label3",ID_LISTVIEW0_CHILDWGT6_LABEL3);
  idmap.put("listview0_childWgt6_label6",ID_LISTVIEW0_CHILDWGT6_LABEL6);
  idmap.put("listview0_childWgt6_image5",ID_LISTVIEW0_CHILDWGT6_IMAGE5);
  idmap.put("listview0_childWgt6_label9",ID_LISTVIEW0_CHILDWGT6_LABEL9);
  idmap.put("listview0_childWgt6_label0",ID_LISTVIEW0_CHILDWGT6_LABEL0);
  idmap.put("listview0_childWgt6_label2",ID_LISTVIEW0_CHILDWGT6_LABEL2);
  idmap.put("listview0_childWgt6_panel16",ID_LISTVIEW0_CHILDWGT6_PANEL16);
  idmap.put("listview0_childWgt6_label7",ID_LISTVIEW0_CHILDWGT6_LABEL7);
  idmap.put("listview0_childWgt6_label1",ID_LISTVIEW0_CHILDWGT6_LABEL1);
  idmap.put("listview0_childWgt6_panel0",ID_LISTVIEW0_CHILDWGT6_PANEL0);
  idmap.put("listview0_childWgt6_progressbar0",ID_LISTVIEW0_CHILDWGT6_PROGRESSBAR0);
  idmap.put("listview0_childWgt6_panel14",ID_LISTVIEW0_CHILDWGT6_PANEL14);
  idmap.put("listview0_childWgt6_image4",ID_LISTVIEW0_CHILDWGT6_IMAGE4);
  idmap.put("listview0_childWgt7",ID_LISTVIEW0_CHILDWGT7);
  idmap.put("listview0_childWgt7_pane231",ID_LISTVIEW0_CHILDWGT7_PANE231);
  idmap.put("listview0_childWgt7_panel13",ID_LISTVIEW0_CHILDWGT7_PANEL13);
  idmap.put("listview0_childWgt7_panel15",ID_LISTVIEW0_CHILDWGT7_PANEL15);
  idmap.put("listview0_childWgt7_label8",ID_LISTVIEW0_CHILDWGT7_LABEL8);
  idmap.put("listview0_childWgt7_label3",ID_LISTVIEW0_CHILDWGT7_LABEL3);
  idmap.put("listview0_childWgt7_label6",ID_LISTVIEW0_CHILDWGT7_LABEL6);
  idmap.put("listview0_childWgt7_label9",ID_LISTVIEW0_CHILDWGT7_LABEL9);
  idmap.put("listview0_childWgt7_label0",ID_LISTVIEW0_CHILDWGT7_LABEL0);
  idmap.put("listview0_childWgt7_label2",ID_LISTVIEW0_CHILDWGT7_LABEL2);
  idmap.put("listview0_childWgt7_panel16",ID_LISTVIEW0_CHILDWGT7_PANEL16);
  idmap.put("listview0_childWgt7_label7",ID_LISTVIEW0_CHILDWGT7_LABEL7);
  idmap.put("listview0_childWgt7_label1",ID_LISTVIEW0_CHILDWGT7_LABEL1);
  idmap.put("listview0_childWgt7_panel0",ID_LISTVIEW0_CHILDWGT7_PANEL0);
  idmap.put("listview0_childWgt7_progressbar0",ID_LISTVIEW0_CHILDWGT7_PROGRESSBAR0);
  idmap.put("listview0_childWgt7_panel14",ID_LISTVIEW0_CHILDWGT7_PANEL14);
  idmap.put("listview0_childWgt7_image4",ID_LISTVIEW0_CHILDWGT7_IMAGE4);
  idmap.put("navigatorbar1",ID_NAVIGATORBAR1);
  idmap.put("widget0",ID_WIDGET0);
  idmap.put("widget0_toolbar0",ID_WIDGET0_TOOLBAR0);
  idmap.put("widget0_panel1",ID_WIDGET0_PANEL1);
  idmap.put("widget0_imagebutton0",ID_WIDGET0_IMAGEBUTTON0);
  idmap.put("widget0_panel2",ID_WIDGET0_PANEL2);
  idmap.put("widget0_imagebutton1",ID_WIDGET0_IMAGEBUTTON1);

	}
	
	public void onLoad() {
		ULog.logLC("onLoad", this);
		if(currentPage!=null) {
			currentPage.onLoad();
		}
	
		{ //panel0 - dataonload
    UMEventArgs args = new UMEventArgs(Task_mainviewthreeforoneActivity.this);
    actionDataonload(panel0,args);

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
	
	
	
	public View getWidget1_leftPanelView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
widget1_leftPanel = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_WIDGET1_LEFTPANEL
,"height","fill"
,"layout-type","linear"
,"width","64"
,"valign","center"
);
widget1_button0 = (UMButton)ThirdControl.createControl(new UMButton(context),ID_WIDGET1_BUTTON0
,"halign","center"
,"height","44"
,"color","#e50011"
,"layout-type","linear"
,"width","64.0"
,"font-size","17"
,"onclick","returnhome"
,"font-family","default"
,"font-pressed-color","#f2adb2"
,"valign","center"
,"background-image","btn_back.png"
);
widget1_button0.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Task_mainviewthreeforoneActivity.this);
    actionReturnhome(widget1_button0,args);

}
});
widget1_leftPanel.addView(widget1_button0);

return widget1_leftPanel;
}
public View getWidget1_togglebuttongroup0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
widget1_togglebuttongroup0 = (UMToggleButtonGroup)ThirdControl.createControl(new UMToggleButtonGroup(context),ID_WIDGET1_TOGGLEBUTTONGROUP0
,"height","30"
,"weight","1"
,"layout","hbox"
,"width","0"
,"value","buttongroup"
,"valign","center"
);
widget1_togglebutton0 = (UMToggleButton)ThirdControl.createControl(new UMToggleButton(context),ID_WIDGET1_TOGGLEBUTTON0
,"halign","center"
,"background-image-off","oatask_left.png"
,"width","62"
,"font-pressed-color","#f8f8f8"
,"type","button"
,"background-image-on","oatask_left_touch.png"
,"height","30.0"
,"color","#e50011"
,"layout-type","hbox"
,"font-size","14"
,"value","0"
,"onclick","personalbtn"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,widget1_togglebutton0,"textOff","#{res.task_personal}"));
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,widget1_togglebutton0,"textOn","#{res.task_personal}"));
widget1_togglebutton0.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Task_mainviewthreeforoneActivity.this);
    actionPersonalbtn(widget1_togglebutton0,args);

}
});
widget1_togglebuttongroup0.addView(widget1_togglebutton0);
widget1_togglebutton1 = (UMToggleButton)ThirdControl.createControl(new UMToggleButton(context),ID_WIDGET1_TOGGLEBUTTON1
,"halign","center"
,"background-image-off","oatask_mid.png"
,"width","62"
,"font-pressed-color","#f8f8f8"
,"type","button"
,"background-image-on","oatask_mid_touch.png"
,"height","30.0"
,"color","#e50011"
,"layout-type","hbox"
,"font-size","14"
,"value","3"
,"onclick","responsebtn"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,widget1_togglebutton1,"textOff","#{res.task_resonpseable}"));
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,widget1_togglebutton1,"textOn","#{res.task_resonpseable}"));
widget1_togglebutton1.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Task_mainviewthreeforoneActivity.this);
    actionResponsebtn(widget1_togglebutton1,args);

}
});
widget1_togglebuttongroup0.addView(widget1_togglebutton1);
widget1_togglebutton2 = (UMToggleButton)ThirdControl.createControl(new UMToggleButton(context),ID_WIDGET1_TOGGLEBUTTON2
,"halign","center"
,"background-image-off","oatask_mid.png"
,"width","62"
,"font-pressed-color","#f8f8f8"
,"type","button"
,"background-image-on","oatask_mid_touch.png"
,"height","30.0"
,"color","#e50011"
,"layout-type","hbox"
,"font-size","14"
,"value","2"
,"onclick","crowbtn"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,widget1_togglebutton2,"textOff","#{res.task_assist}"));
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,widget1_togglebutton2,"textOn","#{res.task_assist}"));
widget1_togglebutton2.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Task_mainviewthreeforoneActivity.this);
    actionCrowbtn(widget1_togglebutton2,args);

}
});
widget1_togglebuttongroup0.addView(widget1_togglebutton2);
widget1_togglebutton3 = (UMToggleButton)ThirdControl.createControl(new UMToggleButton(context),ID_WIDGET1_TOGGLEBUTTON3
,"halign","center"
,"background-image-off","oatask_right.png"
,"width","62"
,"font-pressed-color","#f8f8f8"
,"type","button"
,"background-image-on","oatask_right_touch.png"
,"height","30.0"
,"color","#e50011"
,"layout-type","hbox"
,"font-size","14"
,"value","1"
,"onclick","viewbtn"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,widget1_togglebutton3,"textOff","#{res.task_followed}"));
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,widget1_togglebutton3,"textOn","#{res.task_followed}"));
widget1_togglebutton3.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Task_mainviewthreeforoneActivity.this);
    actionViewbtn(widget1_togglebutton3,args);

}
});
widget1_togglebuttongroup0.addView(widget1_togglebutton3);

return widget1_togglebuttongroup0;
}
public View getWidget1_rightPanelView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
widget1_rightPanel = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_WIDGET1_RIGHTPANEL
,"halign","right"
,"height","fill"
,"layout-type","linear"
,"width","64"
);
widget1_addtask = (UMButton)ThirdControl.createControl(new UMButton(context),ID_WIDGET1_ADDTASK
,"halign","center"
,"height","44"
,"color","#ffffff"
,"pressed-image","oatask_add_clicktouch.png"
,"layout-type","linear"
,"font-size","17"
,"width","44"
,"onclick","addtask"
,"font-family","default"
,"valign","center"
,"background-image","oatask_add_click.png"
);
widget1_addtask.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Task_mainviewthreeforoneActivity.this);
    actionAddtask(widget1_addtask,args);

}
});
widget1_rightPanel.addView(widget1_addtask);

return widget1_rightPanel;
}
public View getWidget1_toplistwidgetView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
widget1_toplistwidget = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_WIDGET1_TOPLISTWIDGET
,"padding-left","8"
,"height","fill"
,"color","#ffffff"
,"pressed-image","nav"
,"width","fill"
,"font-size","18"
,"layout-type","linear"
,"background-image-dis","nav"
,"font-family","default"
,"valign","center"
,"background-image","nav.png"
);
View widget1_leftPanel = (View) getWidget1_leftPanelView((UMActivity)context,binderGroup,configure);
widget1_toplistwidget.addView(widget1_leftPanel);
View widget1_togglebuttongroup0 = (View) getWidget1_togglebuttongroup0View((UMActivity)context,binderGroup,configure);
widget1_toplistwidget.addView(widget1_togglebuttongroup0);
View widget1_rightPanel = (View) getWidget1_rightPanelView((UMActivity)context,binderGroup,configure);
widget1_toplistwidget.addView(widget1_rightPanel);

return widget1_toplistwidget;
}
public View getWidget1View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
widget1 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_WIDGET1
,"height","fill"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"valign","center"
);
View widget1_toplistwidget = (View) getWidget1_toplistwidgetView((UMActivity)context,binderGroup,configure);
widget1.addView(widget1_toplistwidget);

return widget1;
}
public View getNavPanelView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
navPanel = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_NAVPANEL
,"halign","center"
,"height","45"
,"layout-type","linear"
,"background","#E6E6E6"
,"width","fill"
);
View widget1 = (View) getWidget1View((UMActivity)context,binderGroup,configure);
navPanel.addView(widget1);

return navPanel;
}
public View getListview0_childWgt0_panel15View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt0_panel15 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT0_PANEL15
,"height","17"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"margin-bottom","3"
,"valign","center"
);
listview0_childWgt0_label8 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT0_LABEL8
,"content","label"
,"bindfield","startdate"
,"halign","left"
,"height","fill"
,"color","#0852A5"
,"layout-type","linear"
,"font-size","13"
,"width","60"
,"font-family","default"
,"valign","center"
);
UMTextBinder listview0_childWgt0_label8_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt0_label8_binder.setBindInfo(new BindInfo("startdate"));
listview0_childWgt0_label8_binder.setControl(listview0_childWgt0_label8);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT0_LABEL8, listview0_childWgt0_label8_binder);
listview0_childWgt0_panel15.addView(listview0_childWgt0_label8);
listview0_childWgt0_image5 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_LISTVIEW0_CHILDWGT0_IMAGE5
,"height","fill"
,"layout-type","linear"
,"width","15"
,"scaletype","fitcenter"
,"src","oatask_important.png"
);
listview0_childWgt0_panel15.addView(listview0_childWgt0_image5);
listview0_childWgt0_label9 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT0_LABEL9
,"bindfield","taskstate"
,"halign","left"
,"width","60"
,"content","label"
,"margin-right","4"
,"height","fill"
,"color","#0852A5"
,"font-size","13"
,"layout-type","linear"
,"margin-left","8"
,"font-family","default"
,"valign","center"
);
UMTextBinder listview0_childWgt0_label9_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt0_label9_binder.setBindInfo(new BindInfo("taskstate"));
listview0_childWgt0_label9_binder.setControl(listview0_childWgt0_label9);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT0_LABEL9, listview0_childWgt0_label9_binder);
listview0_childWgt0_panel15.addView(listview0_childWgt0_label9);
listview0_childWgt0_label0 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT0_LABEL0
,"bindfield","mewtask"
,"halign","center"
,"height","fill"
,"color","#0852A5"
,"layout-type","linear"
,"font-size","13"
,"width","20"
,"font-family","default"
,"valign","center"
);
UMTextBinder listview0_childWgt0_label0_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt0_label0_binder.setBindInfo(new BindInfo("mewtask"));
listview0_childWgt0_label0_binder.setControl(listview0_childWgt0_label0);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT0_LABEL0, listview0_childWgt0_label0_binder);
listview0_childWgt0_panel15.addView(listview0_childWgt0_label0);
listview0_childWgt0_label2 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT0_LABEL2
,"bindfield","urge"
,"halign","right"
,"height","fill"
,"weight","1"
,"color","#0852A5"
,"layout-type","linear"
,"font-size","13"
,"width","0"
,"font-family","default"
,"valign","center"
);
UMTextBinder listview0_childWgt0_label2_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt0_label2_binder.setBindInfo(new BindInfo("urge"));
listview0_childWgt0_label2_binder.setControl(listview0_childWgt0_label2);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT0_LABEL2, listview0_childWgt0_label2_binder);
listview0_childWgt0_panel15.addView(listview0_childWgt0_label2);

return listview0_childWgt0_panel15;
}
public View getListview0_childWgt0_panel16View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt0_panel16 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT0_PANEL16
,"height","22"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"margin-bottom","5"
,"valign","center"
);
listview0_childWgt0_label7 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT0_LABEL7
,"content","label"
,"bindfield","taskname"
,"margin-right","4"
,"halign","left"
,"height","fill"
,"color","#000000"
,"layout-type","linear"
,"font-size","16"
,"width","200"
,"font-family","default"
,"valign","center"
);
UMTextBinder listview0_childWgt0_label7_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt0_label7_binder.setBindInfo(new BindInfo("taskname"));
listview0_childWgt0_label7_binder.setControl(listview0_childWgt0_label7);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT0_LABEL7, listview0_childWgt0_label7_binder);
listview0_childWgt0_panel16.addView(listview0_childWgt0_label7);
listview0_childWgt0_label1 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT0_LABEL1
,"content","label"
,"bindfield","charger"
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
UMTextBinder listview0_childWgt0_label1_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt0_label1_binder.setBindInfo(new BindInfo("charger"));
listview0_childWgt0_label1_binder.setControl(listview0_childWgt0_label1);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT0_LABEL1, listview0_childWgt0_label1_binder);
listview0_childWgt0_panel16.addView(listview0_childWgt0_label1);

return listview0_childWgt0_panel16;
}
public View getListview0_childWgt0_panel0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt0_panel0 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT0_PANEL0
,"height","10"
,"layout-type","linear"
,"background","#EFEFF4"
,"width","fill"
,"valign","center"
);
listview0_childWgt0_progressbar0 = (UMProgressBar)ThirdControl.createControl(new UMProgressBar(context),ID_LISTVIEW0_CHILDWGT0_PROGRESSBAR0
,"bindfield","taskshedue"
,"progress","0"
,"height","10"
,"max","100"
,"layout-type","linear"
,"progresscolor","#0852a5"
,"width","fill"
,"background","#c8c7cc"
);
UMProgressBarBinder listview0_childWgt0_progressbar0_binder = new UMProgressBarBinder((IUMContextAccessor)context);
listview0_childWgt0_progressbar0_binder.setBindInfo(new BindInfo("taskshedue"));
listview0_childWgt0_progressbar0_binder.setControl(listview0_childWgt0_progressbar0);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT0_PROGRESSBAR0, listview0_childWgt0_progressbar0_binder);
listview0_childWgt0_panel0.addView(listview0_childWgt0_progressbar0);

return listview0_childWgt0_panel0;
}
public View getListview0_childWgt0_panel13View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt0_panel13 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_LISTVIEW0_CHILDWGT0_PANEL13
,"padding-right","8"
,"padding-top","6"
,"halign","center"
,"height","fill"
,"weight","1"
,"layout-type","linear"
,"background","#ffffff"
,"width","0"
,"padding-bottom","6"
);
View listview0_childWgt0_panel15 = (View) getListview0_childWgt0_panel15View((UMActivity)context,binderGroup,configure);
listview0_childWgt0_panel13.addView(listview0_childWgt0_panel15);
View listview0_childWgt0_panel16 = (View) getListview0_childWgt0_panel16View((UMActivity)context,binderGroup,configure);
listview0_childWgt0_panel13.addView(listview0_childWgt0_panel16);
View listview0_childWgt0_panel0 = (View) getListview0_childWgt0_panel0View((UMActivity)context,binderGroup,configure);
listview0_childWgt0_panel13.addView(listview0_childWgt0_panel0);

return listview0_childWgt0_panel13;
}
public View getListview0_childWgt0_panel14View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt0_panel14 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT0_PANEL14
,"height","fill"
,"layout-type","linear"
,"background","#ffffff"
,"width","8"
,"valign","center"
);
listview0_childWgt0_image4 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_LISTVIEW0_CHILDWGT0_IMAGE4
,"height","13"
,"layout-type","linear"
,"width","8"
,"scaletype","fitcenter"
,"src","ecm_arrow_right.png"
);
listview0_childWgt0_panel14.addView(listview0_childWgt0_image4);

return listview0_childWgt0_panel14;
}
public View getListview0_childWgt0_pane231View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt0_pane231 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT0_PANE231
,"padding-right","15"
,"height","fill"
,"weight","1"
,"layout-type","linear"
,"background","#ffffff"
,"width","0"
,"valign","center"
,"padding-bottom","1"
,"background-image","list_row_down3.png"
);
View listview0_childWgt0_panel13 = (View) getListview0_childWgt0_panel13View((UMActivity)context,binderGroup,configure);
listview0_childWgt0_pane231.addView(listview0_childWgt0_panel13);
View listview0_childWgt0_panel14 = (View) getListview0_childWgt0_panel14View((UMActivity)context,binderGroup,configure);
listview0_childWgt0_pane231.addView(listview0_childWgt0_panel14);

return listview0_childWgt0_pane231;
}
public View getListview0_childWgt0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt0 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT0
,"padding-left","15"
,"height","70"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"onclick","showItemClick"
,"valign","center"
);
listview0_childWgt0.setOnClickListener(new OnCursorClickListener(configure) {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Task_mainviewthreeforoneActivity.this);
    int position = this.getPosition(v);
    if(position>=0) {
      context.getCursor("cursortasklistalias").setCurrentIndex(position);
    }
    actionShowItemClick(listview0_childWgt0,args);

}
});
View listview0_childWgt0_pane231 = (View) getListview0_childWgt0_pane231View((UMActivity)context,binderGroup,configure);
listview0_childWgt0.addView(listview0_childWgt0_pane231);

return listview0_childWgt0;
}
public View getListview0_childWgt1_panel15View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt1_panel15 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT1_PANEL15
,"height","17"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"margin-bottom","3"
,"valign","center"
);
listview0_childWgt1_label8 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT1_LABEL8
,"content","label"
,"bindfield","startdate"
,"halign","left"
,"height","fill"
,"color","#0852A5"
,"layout-type","linear"
,"font-size","13"
,"width","60"
,"font-family","default"
,"valign","center"
);
UMTextBinder listview0_childWgt1_label8_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt1_label8_binder.setBindInfo(new BindInfo("startdate"));
listview0_childWgt1_label8_binder.setControl(listview0_childWgt1_label8);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT1_LABEL8, listview0_childWgt1_label8_binder);
listview0_childWgt1_panel15.addView(listview0_childWgt1_label8);
listview0_childWgt1_label9 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT1_LABEL9
,"content","label"
,"bindfield","taskstate"
,"halign","left"
,"height","fill"
,"color","#0852A5"
,"layout-type","linear"
,"font-size","13"
,"width","60"
,"font-family","default"
,"valign","center"
);
UMTextBinder listview0_childWgt1_label9_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt1_label9_binder.setBindInfo(new BindInfo("taskstate"));
listview0_childWgt1_label9_binder.setControl(listview0_childWgt1_label9);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT1_LABEL9, listview0_childWgt1_label9_binder);
listview0_childWgt1_panel15.addView(listview0_childWgt1_label9);
listview0_childWgt1_label0 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT1_LABEL0
,"bindfield","mewtask"
,"halign","center"
,"height","fill"
,"color","#0852A5"
,"layout-type","linear"
,"font-size","13"
,"width","20"
,"font-family","default"
,"valign","center"
);
UMTextBinder listview0_childWgt1_label0_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt1_label0_binder.setBindInfo(new BindInfo("mewtask"));
listview0_childWgt1_label0_binder.setControl(listview0_childWgt1_label0);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT1_LABEL0, listview0_childWgt1_label0_binder);
listview0_childWgt1_panel15.addView(listview0_childWgt1_label0);
listview0_childWgt1_label2 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT1_LABEL2
,"bindfield","urge"
,"halign","right"
,"height","fill"
,"weight","1"
,"color","#0852A5"
,"layout-type","linear"
,"font-size","13"
,"width","0"
,"font-family","default"
,"valign","center"
);
UMTextBinder listview0_childWgt1_label2_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt1_label2_binder.setBindInfo(new BindInfo("urge"));
listview0_childWgt1_label2_binder.setControl(listview0_childWgt1_label2);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT1_LABEL2, listview0_childWgt1_label2_binder);
listview0_childWgt1_panel15.addView(listview0_childWgt1_label2);

return listview0_childWgt1_panel15;
}
public View getListview0_childWgt1_panel16View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt1_panel16 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT1_PANEL16
,"height","22"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"margin-bottom","5"
,"valign","center"
);
listview0_childWgt1_label7 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT1_LABEL7
,"content","label"
,"bindfield","taskname"
,"margin-right","4"
,"halign","left"
,"height","fill"
,"color","#000000"
,"layout-type","linear"
,"font-size","16"
,"width","200"
,"font-family","default"
,"valign","center"
);
UMTextBinder listview0_childWgt1_label7_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt1_label7_binder.setBindInfo(new BindInfo("taskname"));
listview0_childWgt1_label7_binder.setControl(listview0_childWgt1_label7);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT1_LABEL7, listview0_childWgt1_label7_binder);
listview0_childWgt1_panel16.addView(listview0_childWgt1_label7);
listview0_childWgt1_label1 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT1_LABEL1
,"content","label"
,"bindfield","charger"
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
UMTextBinder listview0_childWgt1_label1_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt1_label1_binder.setBindInfo(new BindInfo("charger"));
listview0_childWgt1_label1_binder.setControl(listview0_childWgt1_label1);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT1_LABEL1, listview0_childWgt1_label1_binder);
listview0_childWgt1_panel16.addView(listview0_childWgt1_label1);

return listview0_childWgt1_panel16;
}
public View getListview0_childWgt1_panel0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt1_panel0 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT1_PANEL0
,"height","10"
,"layout-type","linear"
,"background","#EFEFF4"
,"width","fill"
,"valign","center"
);
listview0_childWgt1_progressbar0 = (UMProgressBar)ThirdControl.createControl(new UMProgressBar(context),ID_LISTVIEW0_CHILDWGT1_PROGRESSBAR0
,"bindfield","taskshedue"
,"progress","0"
,"height","10"
,"max","100"
,"layout-type","linear"
,"progresscolor","#0852a5"
,"width","fill"
,"background","#c8c7cc"
);
UMProgressBarBinder listview0_childWgt1_progressbar0_binder = new UMProgressBarBinder((IUMContextAccessor)context);
listview0_childWgt1_progressbar0_binder.setBindInfo(new BindInfo("taskshedue"));
listview0_childWgt1_progressbar0_binder.setControl(listview0_childWgt1_progressbar0);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT1_PROGRESSBAR0, listview0_childWgt1_progressbar0_binder);
listview0_childWgt1_panel0.addView(listview0_childWgt1_progressbar0);

return listview0_childWgt1_panel0;
}
public View getListview0_childWgt1_panel13View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt1_panel13 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_LISTVIEW0_CHILDWGT1_PANEL13
,"padding-right","8"
,"padding-top","6"
,"halign","center"
,"height","fill"
,"weight","1"
,"layout-type","linear"
,"background","#ffffff"
,"width","0"
,"padding-bottom","6"
);
View listview0_childWgt1_panel15 = (View) getListview0_childWgt1_panel15View((UMActivity)context,binderGroup,configure);
listview0_childWgt1_panel13.addView(listview0_childWgt1_panel15);
View listview0_childWgt1_panel16 = (View) getListview0_childWgt1_panel16View((UMActivity)context,binderGroup,configure);
listview0_childWgt1_panel13.addView(listview0_childWgt1_panel16);
View listview0_childWgt1_panel0 = (View) getListview0_childWgt1_panel0View((UMActivity)context,binderGroup,configure);
listview0_childWgt1_panel13.addView(listview0_childWgt1_panel0);

return listview0_childWgt1_panel13;
}
public View getListview0_childWgt1_panel14View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt1_panel14 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT1_PANEL14
,"height","fill"
,"layout-type","linear"
,"background","#ffffff"
,"width","8"
,"valign","center"
);
listview0_childWgt1_image4 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_LISTVIEW0_CHILDWGT1_IMAGE4
,"height","13"
,"layout-type","linear"
,"width","8"
,"scaletype","fitcenter"
,"src","ecm_arrow_right.png"
);
listview0_childWgt1_panel14.addView(listview0_childWgt1_image4);

return listview0_childWgt1_panel14;
}
public View getListview0_childWgt1_pane231View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt1_pane231 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT1_PANE231
,"padding-right","15"
,"height","fill"
,"weight","1"
,"layout-type","linear"
,"width","0"
,"valign","center"
,"padding-bottom","1"
,"background-image","list_row_down3.png"
);
View listview0_childWgt1_panel13 = (View) getListview0_childWgt1_panel13View((UMActivity)context,binderGroup,configure);
listview0_childWgt1_pane231.addView(listview0_childWgt1_panel13);
View listview0_childWgt1_panel14 = (View) getListview0_childWgt1_panel14View((UMActivity)context,binderGroup,configure);
listview0_childWgt1_pane231.addView(listview0_childWgt1_panel14);

return listview0_childWgt1_pane231;
}
public View getListview0_childWgt1View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt1 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT1
,"padding-left","15"
,"height","70"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"onclick","showItemClick"
,"valign","center"
);
listview0_childWgt1.setOnClickListener(new OnCursorClickListener(configure) {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Task_mainviewthreeforoneActivity.this);
    int position = this.getPosition(v);
    if(position>=0) {
      context.getCursor("cursortasklistalias").setCurrentIndex(position);
    }
    actionShowItemClick(listview0_childWgt1,args);

}
});
View listview0_childWgt1_pane231 = (View) getListview0_childWgt1_pane231View((UMActivity)context,binderGroup,configure);
listview0_childWgt1.addView(listview0_childWgt1_pane231);

return listview0_childWgt1;
}
public View getListview0_childWgt2_panel15View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt2_panel15 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT2_PANEL15
,"height","17"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"margin-bottom","3"
,"valign","center"
);
listview0_childWgt2_label8 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT2_LABEL8
,"content","label"
,"bindfield","startdate"
,"halign","left"
,"height","fill"
,"color","#c8c7cc"
,"layout-type","linear"
,"font-size","13"
,"width","60"
,"font-family","default"
,"valign","center"
);
UMTextBinder listview0_childWgt2_label8_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt2_label8_binder.setBindInfo(new BindInfo("startdate"));
listview0_childWgt2_label8_binder.setControl(listview0_childWgt2_label8);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT2_LABEL8, listview0_childWgt2_label8_binder);
listview0_childWgt2_panel15.addView(listview0_childWgt2_label8);
listview0_childWgt2_image5 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_LISTVIEW0_CHILDWGT2_IMAGE5
,"height","fill"
,"layout-type","linear"
,"width","15"
,"scaletype","fitcenter"
,"src","oatask_important_gray.png"
);
listview0_childWgt2_panel15.addView(listview0_childWgt2_image5);
listview0_childWgt2_label9 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT2_LABEL9
,"bindfield","taskstate"
,"halign","left"
,"width","60"
,"content","label"
,"margin-right","4"
,"height","fill"
,"color","#c8c7cc"
,"font-size","13"
,"layout-type","linear"
,"margin-left","8"
,"font-family","default"
,"valign","center"
);
UMTextBinder listview0_childWgt2_label9_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt2_label9_binder.setBindInfo(new BindInfo("taskstate"));
listview0_childWgt2_label9_binder.setControl(listview0_childWgt2_label9);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT2_LABEL9, listview0_childWgt2_label9_binder);
listview0_childWgt2_panel15.addView(listview0_childWgt2_label9);
listview0_childWgt2_label0 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT2_LABEL0
,"bindfield","mewtask"
,"halign","center"
,"height","fill"
,"color","#c8c7cc"
,"layout-type","linear"
,"font-size","13"
,"width","20"
,"font-family","default"
,"valign","center"
);
UMTextBinder listview0_childWgt2_label0_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt2_label0_binder.setBindInfo(new BindInfo("mewtask"));
listview0_childWgt2_label0_binder.setControl(listview0_childWgt2_label0);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT2_LABEL0, listview0_childWgt2_label0_binder);
listview0_childWgt2_panel15.addView(listview0_childWgt2_label0);
listview0_childWgt2_label2 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT2_LABEL2
,"bindfield","urge"
,"halign","right"
,"height","fill"
,"weight","1"
,"color","#c8c7cc"
,"layout-type","linear"
,"font-size","13"
,"width","0"
,"font-family","default"
,"valign","center"
);
UMTextBinder listview0_childWgt2_label2_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt2_label2_binder.setBindInfo(new BindInfo("urge"));
listview0_childWgt2_label2_binder.setControl(listview0_childWgt2_label2);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT2_LABEL2, listview0_childWgt2_label2_binder);
listview0_childWgt2_panel15.addView(listview0_childWgt2_label2);

return listview0_childWgt2_panel15;
}
public View getListview0_childWgt2_panel16View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt2_panel16 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT2_PANEL16
,"height","22"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"margin-bottom","5"
,"valign","center"
);
listview0_childWgt2_label7 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT2_LABEL7
,"content","label"
,"bindfield","taskname"
,"margin-right","4"
,"halign","left"
,"height","fill"
,"color","#c8c7cc"
,"layout-type","linear"
,"font-size","16"
,"width","200"
,"font-family","default"
,"valign","center"
);
UMTextBinder listview0_childWgt2_label7_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt2_label7_binder.setBindInfo(new BindInfo("taskname"));
listview0_childWgt2_label7_binder.setControl(listview0_childWgt2_label7);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT2_LABEL7, listview0_childWgt2_label7_binder);
listview0_childWgt2_panel16.addView(listview0_childWgt2_label7);
listview0_childWgt2_label1 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT2_LABEL1
,"content","label"
,"bindfield","charger"
,"halign","right"
,"height","fill"
,"weight","1"
,"color","#c8c7cc"
,"layout-type","linear"
,"font-size","16"
,"width","0"
,"font-family","default"
,"valign","center"
);
UMTextBinder listview0_childWgt2_label1_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt2_label1_binder.setBindInfo(new BindInfo("charger"));
listview0_childWgt2_label1_binder.setControl(listview0_childWgt2_label1);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT2_LABEL1, listview0_childWgt2_label1_binder);
listview0_childWgt2_panel16.addView(listview0_childWgt2_label1);

return listview0_childWgt2_panel16;
}
public View getListview0_childWgt2_panel0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt2_panel0 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT2_PANEL0
,"height","10"
,"layout-type","linear"
,"background","#EFEFF4"
,"width","fill"
,"valign","center"
);
listview0_childWgt2_progressbar0 = (UMProgressBar)ThirdControl.createControl(new UMProgressBar(context),ID_LISTVIEW0_CHILDWGT2_PROGRESSBAR0
,"bindfield","taskshedue"
,"progress","0"
,"height","10"
,"max","100"
,"layout-type","linear"
,"progresscolor","#0852a5"
,"width","fill"
,"background","#c8c7cc"
);
UMProgressBarBinder listview0_childWgt2_progressbar0_binder = new UMProgressBarBinder((IUMContextAccessor)context);
listview0_childWgt2_progressbar0_binder.setBindInfo(new BindInfo("taskshedue"));
listview0_childWgt2_progressbar0_binder.setControl(listview0_childWgt2_progressbar0);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT2_PROGRESSBAR0, listview0_childWgt2_progressbar0_binder);
listview0_childWgt2_panel0.addView(listview0_childWgt2_progressbar0);

return listview0_childWgt2_panel0;
}
public View getListview0_childWgt2_panel13View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt2_panel13 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_LISTVIEW0_CHILDWGT2_PANEL13
,"padding-right","8"
,"padding-top","6"
,"halign","center"
,"height","fill"
,"weight","1"
,"layout-type","linear"
,"background","#ffffff"
,"width","0"
,"padding-bottom","6"
);
View listview0_childWgt2_panel15 = (View) getListview0_childWgt2_panel15View((UMActivity)context,binderGroup,configure);
listview0_childWgt2_panel13.addView(listview0_childWgt2_panel15);
View listview0_childWgt2_panel16 = (View) getListview0_childWgt2_panel16View((UMActivity)context,binderGroup,configure);
listview0_childWgt2_panel13.addView(listview0_childWgt2_panel16);
View listview0_childWgt2_panel0 = (View) getListview0_childWgt2_panel0View((UMActivity)context,binderGroup,configure);
listview0_childWgt2_panel13.addView(listview0_childWgt2_panel0);

return listview0_childWgt2_panel13;
}
public View getListview0_childWgt2_panel14View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt2_panel14 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT2_PANEL14
,"height","fill"
,"layout-type","linear"
,"background","#ffffff"
,"width","8"
,"valign","center"
);
listview0_childWgt2_image4 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_LISTVIEW0_CHILDWGT2_IMAGE4
,"height","13"
,"layout-type","linear"
,"width","8"
,"scaletype","fitcenter"
,"src","ecm_arrow_right.png"
);
listview0_childWgt2_panel14.addView(listview0_childWgt2_image4);

return listview0_childWgt2_panel14;
}
public View getListview0_childWgt2_pane231View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt2_pane231 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT2_PANE231
,"padding-right","15"
,"height","fill"
,"weight","1"
,"layout-type","linear"
,"background","#ffffff"
,"width","0"
,"valign","center"
,"padding-bottom","1"
,"background-image","list_row_down3.png"
);
View listview0_childWgt2_panel13 = (View) getListview0_childWgt2_panel13View((UMActivity)context,binderGroup,configure);
listview0_childWgt2_pane231.addView(listview0_childWgt2_panel13);
View listview0_childWgt2_panel14 = (View) getListview0_childWgt2_panel14View((UMActivity)context,binderGroup,configure);
listview0_childWgt2_pane231.addView(listview0_childWgt2_panel14);

return listview0_childWgt2_pane231;
}
public View getListview0_childWgt2View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt2 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT2
,"padding-left","15"
,"height","70"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"onclick","showItemClick"
,"valign","center"
);
listview0_childWgt2.setOnClickListener(new OnCursorClickListener(configure) {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Task_mainviewthreeforoneActivity.this);
    int position = this.getPosition(v);
    if(position>=0) {
      context.getCursor("cursortasklistalias").setCurrentIndex(position);
    }
    actionShowItemClick(listview0_childWgt2,args);

}
});
View listview0_childWgt2_pane231 = (View) getListview0_childWgt2_pane231View((UMActivity)context,binderGroup,configure);
listview0_childWgt2.addView(listview0_childWgt2_pane231);

return listview0_childWgt2;
}
public View getListview0_childWgt3_panel15View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt3_panel15 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT3_PANEL15
,"height","17"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"margin-bottom","3"
,"valign","center"
);
listview0_childWgt3_label8 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT3_LABEL8
,"content","label"
,"bindfield","startdate"
,"halign","left"
,"height","fill"
,"color","#c8c7cc"
,"layout-type","linear"
,"font-size","13"
,"width","60"
,"font-family","default"
,"valign","center"
);
UMTextBinder listview0_childWgt3_label8_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt3_label8_binder.setBindInfo(new BindInfo("startdate"));
listview0_childWgt3_label8_binder.setControl(listview0_childWgt3_label8);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT3_LABEL8, listview0_childWgt3_label8_binder);
listview0_childWgt3_panel15.addView(listview0_childWgt3_label8);
listview0_childWgt3_label9 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT3_LABEL9
,"content","label"
,"bindfield","taskstate"
,"halign","left"
,"height","fill"
,"color","#c8c7cc"
,"layout-type","linear"
,"font-size","13"
,"width","60"
,"font-family","default"
,"valign","center"
);
UMTextBinder listview0_childWgt3_label9_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt3_label9_binder.setBindInfo(new BindInfo("taskstate"));
listview0_childWgt3_label9_binder.setControl(listview0_childWgt3_label9);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT3_LABEL9, listview0_childWgt3_label9_binder);
listview0_childWgt3_panel15.addView(listview0_childWgt3_label9);
listview0_childWgt3_label0 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT3_LABEL0
,"bindfield","mewtask"
,"halign","center"
,"height","fill"
,"color","#c8c7cc"
,"layout-type","linear"
,"font-size","13"
,"width","20"
,"font-family","default"
,"valign","center"
);
UMTextBinder listview0_childWgt3_label0_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt3_label0_binder.setBindInfo(new BindInfo("mewtask"));
listview0_childWgt3_label0_binder.setControl(listview0_childWgt3_label0);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT3_LABEL0, listview0_childWgt3_label0_binder);
listview0_childWgt3_panel15.addView(listview0_childWgt3_label0);
listview0_childWgt3_label2 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT3_LABEL2
,"bindfield","urge"
,"halign","right"
,"height","fill"
,"weight","1"
,"color","#c8c7cc"
,"layout-type","linear"
,"font-size","13"
,"width","0"
,"font-family","default"
,"valign","center"
);
UMTextBinder listview0_childWgt3_label2_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt3_label2_binder.setBindInfo(new BindInfo("urge"));
listview0_childWgt3_label2_binder.setControl(listview0_childWgt3_label2);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT3_LABEL2, listview0_childWgt3_label2_binder);
listview0_childWgt3_panel15.addView(listview0_childWgt3_label2);

return listview0_childWgt3_panel15;
}
public View getListview0_childWgt3_panel16View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt3_panel16 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT3_PANEL16
,"height","22"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"margin-bottom","5"
,"valign","center"
);
listview0_childWgt3_label7 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT3_LABEL7
,"content","label"
,"bindfield","taskname"
,"margin-right","4"
,"halign","left"
,"height","fill"
,"color","#c8c7cc"
,"layout-type","linear"
,"font-size","16"
,"width","200"
,"font-family","default"
,"valign","center"
);
UMTextBinder listview0_childWgt3_label7_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt3_label7_binder.setBindInfo(new BindInfo("taskname"));
listview0_childWgt3_label7_binder.setControl(listview0_childWgt3_label7);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT3_LABEL7, listview0_childWgt3_label7_binder);
listview0_childWgt3_panel16.addView(listview0_childWgt3_label7);
listview0_childWgt3_label1 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT3_LABEL1
,"content","label"
,"bindfield","charger"
,"halign","right"
,"height","fill"
,"weight","1"
,"color","#c8c7cc"
,"layout-type","linear"
,"font-size","16"
,"width","0"
,"font-family","default"
,"valign","center"
);
UMTextBinder listview0_childWgt3_label1_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt3_label1_binder.setBindInfo(new BindInfo("charger"));
listview0_childWgt3_label1_binder.setControl(listview0_childWgt3_label1);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT3_LABEL1, listview0_childWgt3_label1_binder);
listview0_childWgt3_panel16.addView(listview0_childWgt3_label1);

return listview0_childWgt3_panel16;
}
public View getListview0_childWgt3_panel0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt3_panel0 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT3_PANEL0
,"height","10"
,"layout-type","linear"
,"background","#EFEFF4"
,"width","fill"
,"valign","center"
);
listview0_childWgt3_progressbar0 = (UMProgressBar)ThirdControl.createControl(new UMProgressBar(context),ID_LISTVIEW0_CHILDWGT3_PROGRESSBAR0
,"bindfield","taskshedue"
,"progress","0"
,"height","10.0"
,"max","100"
,"layout-type","linear"
,"background","#c8c7cc"
,"width","fill"
,"progresscolor","#0852a5"
);
UMProgressBarBinder listview0_childWgt3_progressbar0_binder = new UMProgressBarBinder((IUMContextAccessor)context);
listview0_childWgt3_progressbar0_binder.setBindInfo(new BindInfo("taskshedue"));
listview0_childWgt3_progressbar0_binder.setControl(listview0_childWgt3_progressbar0);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT3_PROGRESSBAR0, listview0_childWgt3_progressbar0_binder);
listview0_childWgt3_panel0.addView(listview0_childWgt3_progressbar0);

return listview0_childWgt3_panel0;
}
public View getListview0_childWgt3_panel13View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt3_panel13 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_LISTVIEW0_CHILDWGT3_PANEL13
,"padding-right","8"
,"padding-top","6"
,"halign","center"
,"height","fill"
,"weight","1"
,"layout-type","linear"
,"background","#ffffff"
,"width","0"
,"padding-bottom","6"
);
View listview0_childWgt3_panel15 = (View) getListview0_childWgt3_panel15View((UMActivity)context,binderGroup,configure);
listview0_childWgt3_panel13.addView(listview0_childWgt3_panel15);
View listview0_childWgt3_panel16 = (View) getListview0_childWgt3_panel16View((UMActivity)context,binderGroup,configure);
listview0_childWgt3_panel13.addView(listview0_childWgt3_panel16);
View listview0_childWgt3_panel0 = (View) getListview0_childWgt3_panel0View((UMActivity)context,binderGroup,configure);
listview0_childWgt3_panel13.addView(listview0_childWgt3_panel0);

return listview0_childWgt3_panel13;
}
public View getListview0_childWgt3_panel14View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt3_panel14 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT3_PANEL14
,"height","fill"
,"layout-type","linear"
,"background","#ffffff"
,"width","8"
,"valign","center"
);
listview0_childWgt3_image4 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_LISTVIEW0_CHILDWGT3_IMAGE4
,"height","13"
,"layout-type","linear"
,"width","8"
,"scaletype","fitcenter"
,"src","ecm_arrow_right.png"
);
listview0_childWgt3_panel14.addView(listview0_childWgt3_image4);

return listview0_childWgt3_panel14;
}
public View getListview0_childWgt3_pane231View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt3_pane231 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT3_PANE231
,"padding-right","15"
,"height","fill"
,"weight","1"
,"layout-type","linear"
,"background","#ffffff"
,"width","0"
,"valign","center"
,"padding-bottom","1"
,"background-image","list_row_down3.png"
);
View listview0_childWgt3_panel13 = (View) getListview0_childWgt3_panel13View((UMActivity)context,binderGroup,configure);
listview0_childWgt3_pane231.addView(listview0_childWgt3_panel13);
View listview0_childWgt3_panel14 = (View) getListview0_childWgt3_panel14View((UMActivity)context,binderGroup,configure);
listview0_childWgt3_pane231.addView(listview0_childWgt3_panel14);

return listview0_childWgt3_pane231;
}
public View getListview0_childWgt3View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt3 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT3
,"padding-left","15"
,"height","70"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"onclick","showItemClick"
,"valign","center"
);
listview0_childWgt3.setOnClickListener(new OnCursorClickListener(configure) {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Task_mainviewthreeforoneActivity.this);
    int position = this.getPosition(v);
    if(position>=0) {
      context.getCursor("cursortasklistalias").setCurrentIndex(position);
    }
    actionShowItemClick(listview0_childWgt3,args);

}
});
View listview0_childWgt3_pane231 = (View) getListview0_childWgt3_pane231View((UMActivity)context,binderGroup,configure);
listview0_childWgt3.addView(listview0_childWgt3_pane231);

return listview0_childWgt3;
}
public View getListview0_childWgt4_panel15View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt4_panel15 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT4_PANEL15
,"height","17"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"margin-bottom","3"
,"valign","center"
);
listview0_childWgt4_label8 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT4_LABEL8
,"content","label"
,"bindfield","startdate"
,"halign","left"
,"height","fill"
,"color","#0852A5"
,"layout-type","linear"
,"font-size","13"
,"width","50"
,"font-family","default"
,"valign","center"
);
UMTextBinder listview0_childWgt4_label8_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt4_label8_binder.setBindInfo(new BindInfo("startdate"));
listview0_childWgt4_label8_binder.setControl(listview0_childWgt4_label8);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT4_LABEL8, listview0_childWgt4_label8_binder);
listview0_childWgt4_panel15.addView(listview0_childWgt4_label8);
listview0_childWgt4_label3 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT4_LABEL3
,"halign","center"
,"height","fill"
,"color","#0852A5"
,"layout-type","linear"
,"font-size","13"
,"width","20"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,listview0_childWgt4_label3,"content","#{res.task_to}"));
listview0_childWgt4_panel15.addView(listview0_childWgt4_label3);
listview0_childWgt4_label6 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT4_LABEL6
,"content","label"
,"bindfield","enddate"
,"halign","center"
,"height","fill"
,"color","#0852A5"
,"layout-type","linear"
,"font-size","13"
,"width","60"
,"font-family","default"
,"valign","center"
);
UMTextBinder listview0_childWgt4_label6_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt4_label6_binder.setBindInfo(new BindInfo("enddate"));
listview0_childWgt4_label6_binder.setControl(listview0_childWgt4_label6);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT4_LABEL6, listview0_childWgt4_label6_binder);
listview0_childWgt4_panel15.addView(listview0_childWgt4_label6);
listview0_childWgt4_image5 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_LISTVIEW0_CHILDWGT4_IMAGE5
,"height","fill"
,"layout-type","linear"
,"width","15"
,"scaletype","fitcenter"
,"src","oatask_important.png"
);
listview0_childWgt4_panel15.addView(listview0_childWgt4_image5);
listview0_childWgt4_label9 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT4_LABEL9
,"bindfield","taskstate"
,"halign","left"
,"width","60"
,"content","label"
,"margin-right","4"
,"height","fill"
,"color","#0852A5"
,"font-size","13"
,"layout-type","linear"
,"margin-left","8"
,"font-family","default"
,"valign","center"
);
UMTextBinder listview0_childWgt4_label9_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt4_label9_binder.setBindInfo(new BindInfo("taskstate"));
listview0_childWgt4_label9_binder.setControl(listview0_childWgt4_label9);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT4_LABEL9, listview0_childWgt4_label9_binder);
listview0_childWgt4_panel15.addView(listview0_childWgt4_label9);
listview0_childWgt4_label0 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT4_LABEL0
,"bindfield","mewtask"
,"halign","center"
,"height","fill"
,"color","#0852A5"
,"layout-type","linear"
,"font-size","13"
,"width","20"
,"font-family","default"
,"valign","center"
);
UMTextBinder listview0_childWgt4_label0_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt4_label0_binder.setBindInfo(new BindInfo("mewtask"));
listview0_childWgt4_label0_binder.setControl(listview0_childWgt4_label0);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT4_LABEL0, listview0_childWgt4_label0_binder);
listview0_childWgt4_panel15.addView(listview0_childWgt4_label0);
listview0_childWgt4_label2 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT4_LABEL2
,"bindfield","urge"
,"halign","right"
,"height","fill"
,"weight","1"
,"color","#0852A5"
,"layout-type","linear"
,"font-size","13"
,"width","0"
,"font-family","default"
,"valign","center"
);
UMTextBinder listview0_childWgt4_label2_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt4_label2_binder.setBindInfo(new BindInfo("urge"));
listview0_childWgt4_label2_binder.setControl(listview0_childWgt4_label2);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT4_LABEL2, listview0_childWgt4_label2_binder);
listview0_childWgt4_panel15.addView(listview0_childWgt4_label2);

return listview0_childWgt4_panel15;
}
public View getListview0_childWgt4_panel16View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt4_panel16 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT4_PANEL16
,"height","22"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"margin-bottom","5"
,"valign","center"
);
listview0_childWgt4_label7 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT4_LABEL7
,"content","label"
,"bindfield","taskname"
,"margin-right","4"
,"halign","left"
,"height","fill"
,"color","#000000"
,"layout-type","linear"
,"font-size","16"
,"width","200"
,"font-family","default"
,"valign","center"
);
UMTextBinder listview0_childWgt4_label7_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt4_label7_binder.setBindInfo(new BindInfo("taskname"));
listview0_childWgt4_label7_binder.setControl(listview0_childWgt4_label7);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT4_LABEL7, listview0_childWgt4_label7_binder);
listview0_childWgt4_panel16.addView(listview0_childWgt4_label7);
listview0_childWgt4_label1 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT4_LABEL1
,"content","label"
,"bindfield","charger"
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
UMTextBinder listview0_childWgt4_label1_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt4_label1_binder.setBindInfo(new BindInfo("charger"));
listview0_childWgt4_label1_binder.setControl(listview0_childWgt4_label1);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT4_LABEL1, listview0_childWgt4_label1_binder);
listview0_childWgt4_panel16.addView(listview0_childWgt4_label1);

return listview0_childWgt4_panel16;
}
public View getListview0_childWgt4_panel0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt4_panel0 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT4_PANEL0
,"height","10"
,"layout-type","linear"
,"background","#EFEFF4"
,"width","fill"
,"valign","center"
);
listview0_childWgt4_progressbar0 = (UMProgressBar)ThirdControl.createControl(new UMProgressBar(context),ID_LISTVIEW0_CHILDWGT4_PROGRESSBAR0
,"bindfield","taskshedue"
,"progress","0"
,"height","10"
,"max","100"
,"layout-type","linear"
,"progresscolor","#0852a5"
,"width","fill"
,"background","#c8c7cc"
);
UMProgressBarBinder listview0_childWgt4_progressbar0_binder = new UMProgressBarBinder((IUMContextAccessor)context);
listview0_childWgt4_progressbar0_binder.setBindInfo(new BindInfo("taskshedue"));
listview0_childWgt4_progressbar0_binder.setControl(listview0_childWgt4_progressbar0);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT4_PROGRESSBAR0, listview0_childWgt4_progressbar0_binder);
listview0_childWgt4_panel0.addView(listview0_childWgt4_progressbar0);

return listview0_childWgt4_panel0;
}
public View getListview0_childWgt4_panel13View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt4_panel13 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_LISTVIEW0_CHILDWGT4_PANEL13
,"padding-right","8"
,"padding-top","6"
,"halign","center"
,"height","fill"
,"weight","1"
,"layout-type","linear"
,"background","#ffffff"
,"width","0"
,"padding-bottom","6"
);
View listview0_childWgt4_panel15 = (View) getListview0_childWgt4_panel15View((UMActivity)context,binderGroup,configure);
listview0_childWgt4_panel13.addView(listview0_childWgt4_panel15);
View listview0_childWgt4_panel16 = (View) getListview0_childWgt4_panel16View((UMActivity)context,binderGroup,configure);
listview0_childWgt4_panel13.addView(listview0_childWgt4_panel16);
View listview0_childWgt4_panel0 = (View) getListview0_childWgt4_panel0View((UMActivity)context,binderGroup,configure);
listview0_childWgt4_panel13.addView(listview0_childWgt4_panel0);

return listview0_childWgt4_panel13;
}
public View getListview0_childWgt4_panel14View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt4_panel14 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT4_PANEL14
,"height","fill"
,"layout-type","linear"
,"background","#ffffff"
,"width","8"
,"valign","center"
);
listview0_childWgt4_image4 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_LISTVIEW0_CHILDWGT4_IMAGE4
,"height","13"
,"layout-type","linear"
,"width","8"
,"scaletype","fitcenter"
,"src","ecm_arrow_right.png"
);
listview0_childWgt4_panel14.addView(listview0_childWgt4_image4);

return listview0_childWgt4_panel14;
}
public View getListview0_childWgt4_pane231View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt4_pane231 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT4_PANE231
,"padding-right","15"
,"height","fill"
,"weight","1"
,"layout-type","linear"
,"background","#ffffff"
,"width","0"
,"valign","center"
,"padding-bottom","1"
,"background-image","list_row_down3.png"
);
View listview0_childWgt4_panel13 = (View) getListview0_childWgt4_panel13View((UMActivity)context,binderGroup,configure);
listview0_childWgt4_pane231.addView(listview0_childWgt4_panel13);
View listview0_childWgt4_panel14 = (View) getListview0_childWgt4_panel14View((UMActivity)context,binderGroup,configure);
listview0_childWgt4_pane231.addView(listview0_childWgt4_panel14);

return listview0_childWgt4_pane231;
}
public View getListview0_childWgt4View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt4 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT4
,"padding-left","15"
,"height","70"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"onclick","showItemClick"
,"valign","center"
);
listview0_childWgt4.setOnClickListener(new OnCursorClickListener(configure) {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Task_mainviewthreeforoneActivity.this);
    int position = this.getPosition(v);
    if(position>=0) {
      context.getCursor("cursortasklistalias").setCurrentIndex(position);
    }
    actionShowItemClick(listview0_childWgt4,args);

}
});
View listview0_childWgt4_pane231 = (View) getListview0_childWgt4_pane231View((UMActivity)context,binderGroup,configure);
listview0_childWgt4.addView(listview0_childWgt4_pane231);

return listview0_childWgt4;
}
public View getListview0_childWgt5_panel15View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt5_panel15 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT5_PANEL15
,"height","17"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"margin-bottom","3"
,"valign","center"
);
listview0_childWgt5_label8 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT5_LABEL8
,"content","label"
,"bindfield","startdate"
,"halign","left"
,"height","fill"
,"color","#0852A5"
,"layout-type","linear"
,"font-size","13"
,"width","50"
,"font-family","default"
,"valign","center"
);
UMTextBinder listview0_childWgt5_label8_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt5_label8_binder.setBindInfo(new BindInfo("startdate"));
listview0_childWgt5_label8_binder.setControl(listview0_childWgt5_label8);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT5_LABEL8, listview0_childWgt5_label8_binder);
listview0_childWgt5_panel15.addView(listview0_childWgt5_label8);
listview0_childWgt5_label3 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT5_LABEL3
,"halign","center"
,"height","fill"
,"color","#0852A5"
,"layout-type","linear"
,"font-size","13"
,"width","20"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,listview0_childWgt5_label3,"content","#{res.task_to}"));
listview0_childWgt5_panel15.addView(listview0_childWgt5_label3);
listview0_childWgt5_label6 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT5_LABEL6
,"content","label"
,"bindfield","enddate"
,"halign","center"
,"height","fill"
,"color","#0852A5"
,"layout-type","linear"
,"font-size","13"
,"width","60"
,"font-family","default"
,"valign","center"
);
UMTextBinder listview0_childWgt5_label6_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt5_label6_binder.setBindInfo(new BindInfo("enddate"));
listview0_childWgt5_label6_binder.setControl(listview0_childWgt5_label6);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT5_LABEL6, listview0_childWgt5_label6_binder);
listview0_childWgt5_panel15.addView(listview0_childWgt5_label6);
listview0_childWgt5_label9 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT5_LABEL9
,"content","label"
,"bindfield","taskstate"
,"halign","left"
,"height","fill"
,"color","#0852A5"
,"layout-type","linear"
,"font-size","13"
,"width","60"
,"font-family","default"
,"valign","center"
);
UMTextBinder listview0_childWgt5_label9_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt5_label9_binder.setBindInfo(new BindInfo("taskstate"));
listview0_childWgt5_label9_binder.setControl(listview0_childWgt5_label9);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT5_LABEL9, listview0_childWgt5_label9_binder);
listview0_childWgt5_panel15.addView(listview0_childWgt5_label9);
listview0_childWgt5_label0 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT5_LABEL0
,"bindfield","mewtask"
,"halign","center"
,"height","fill"
,"color","#0852A5"
,"layout-type","linear"
,"font-size","13"
,"width","20"
,"font-family","default"
,"valign","center"
);
UMTextBinder listview0_childWgt5_label0_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt5_label0_binder.setBindInfo(new BindInfo("mewtask"));
listview0_childWgt5_label0_binder.setControl(listview0_childWgt5_label0);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT5_LABEL0, listview0_childWgt5_label0_binder);
listview0_childWgt5_panel15.addView(listview0_childWgt5_label0);
listview0_childWgt5_label2 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT5_LABEL2
,"bindfield","urge"
,"halign","right"
,"height","fill"
,"weight","1"
,"color","#0852A5"
,"layout-type","linear"
,"font-size","13"
,"width","0"
,"font-family","default"
,"valign","center"
);
UMTextBinder listview0_childWgt5_label2_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt5_label2_binder.setBindInfo(new BindInfo("urge"));
listview0_childWgt5_label2_binder.setControl(listview0_childWgt5_label2);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT5_LABEL2, listview0_childWgt5_label2_binder);
listview0_childWgt5_panel15.addView(listview0_childWgt5_label2);

return listview0_childWgt5_panel15;
}
public View getListview0_childWgt5_panel16View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt5_panel16 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT5_PANEL16
,"height","22"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"margin-bottom","5"
,"valign","center"
);
listview0_childWgt5_label7 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT5_LABEL7
,"content","label"
,"bindfield","taskname"
,"margin-right","4"
,"halign","left"
,"height","fill"
,"color","#000000"
,"layout-type","linear"
,"font-size","16"
,"width","200"
,"font-family","default"
,"valign","center"
);
UMTextBinder listview0_childWgt5_label7_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt5_label7_binder.setBindInfo(new BindInfo("taskname"));
listview0_childWgt5_label7_binder.setControl(listview0_childWgt5_label7);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT5_LABEL7, listview0_childWgt5_label7_binder);
listview0_childWgt5_panel16.addView(listview0_childWgt5_label7);
listview0_childWgt5_label1 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT5_LABEL1
,"content","label"
,"bindfield","charger"
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
UMTextBinder listview0_childWgt5_label1_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt5_label1_binder.setBindInfo(new BindInfo("charger"));
listview0_childWgt5_label1_binder.setControl(listview0_childWgt5_label1);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT5_LABEL1, listview0_childWgt5_label1_binder);
listview0_childWgt5_panel16.addView(listview0_childWgt5_label1);

return listview0_childWgt5_panel16;
}
public View getListview0_childWgt5_panel0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt5_panel0 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT5_PANEL0
,"height","10"
,"layout-type","linear"
,"background","#EFEFF4"
,"width","fill"
,"valign","center"
);
listview0_childWgt5_progressbar0 = (UMProgressBar)ThirdControl.createControl(new UMProgressBar(context),ID_LISTVIEW0_CHILDWGT5_PROGRESSBAR0
,"bindfield","taskshedue"
,"progress","0"
,"height","10"
,"max","100"
,"layout-type","linear"
,"progresscolor","#0852a5"
,"width","fill"
,"background","#c8c7cc"
);
UMProgressBarBinder listview0_childWgt5_progressbar0_binder = new UMProgressBarBinder((IUMContextAccessor)context);
listview0_childWgt5_progressbar0_binder.setBindInfo(new BindInfo("taskshedue"));
listview0_childWgt5_progressbar0_binder.setControl(listview0_childWgt5_progressbar0);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT5_PROGRESSBAR0, listview0_childWgt5_progressbar0_binder);
listview0_childWgt5_panel0.addView(listview0_childWgt5_progressbar0);

return listview0_childWgt5_panel0;
}
public View getListview0_childWgt5_panel13View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt5_panel13 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_LISTVIEW0_CHILDWGT5_PANEL13
,"padding-right","8"
,"padding-top","6"
,"halign","center"
,"height","fill"
,"weight","1"
,"layout-type","linear"
,"background","#ffffff"
,"width","0"
,"padding-bottom","6"
);
View listview0_childWgt5_panel15 = (View) getListview0_childWgt5_panel15View((UMActivity)context,binderGroup,configure);
listview0_childWgt5_panel13.addView(listview0_childWgt5_panel15);
View listview0_childWgt5_panel16 = (View) getListview0_childWgt5_panel16View((UMActivity)context,binderGroup,configure);
listview0_childWgt5_panel13.addView(listview0_childWgt5_panel16);
View listview0_childWgt5_panel0 = (View) getListview0_childWgt5_panel0View((UMActivity)context,binderGroup,configure);
listview0_childWgt5_panel13.addView(listview0_childWgt5_panel0);

return listview0_childWgt5_panel13;
}
public View getListview0_childWgt5_panel14View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt5_panel14 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT5_PANEL14
,"height","fill"
,"layout-type","linear"
,"background","#ffffff"
,"width","8"
,"valign","center"
);
listview0_childWgt5_image4 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_LISTVIEW0_CHILDWGT5_IMAGE4
,"height","13"
,"layout-type","linear"
,"width","8"
,"scaletype","fitcenter"
,"src","ecm_arrow_right.png"
);
listview0_childWgt5_panel14.addView(listview0_childWgt5_image4);

return listview0_childWgt5_panel14;
}
public View getListview0_childWgt5_pane231View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt5_pane231 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT5_PANE231
,"padding-right","15"
,"height","fill"
,"weight","1"
,"layout-type","linear"
,"background","#ffffff"
,"width","0"
,"valign","center"
,"padding-bottom","1"
,"background-image","list_row_down3.png"
);
View listview0_childWgt5_panel13 = (View) getListview0_childWgt5_panel13View((UMActivity)context,binderGroup,configure);
listview0_childWgt5_pane231.addView(listview0_childWgt5_panel13);
View listview0_childWgt5_panel14 = (View) getListview0_childWgt5_panel14View((UMActivity)context,binderGroup,configure);
listview0_childWgt5_pane231.addView(listview0_childWgt5_panel14);

return listview0_childWgt5_pane231;
}
public View getListview0_childWgt5View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt5 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT5
,"padding-left","15"
,"height","70"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"onclick","showItemClick"
,"valign","center"
);
listview0_childWgt5.setOnClickListener(new OnCursorClickListener(configure) {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Task_mainviewthreeforoneActivity.this);
    int position = this.getPosition(v);
    if(position>=0) {
      context.getCursor("cursortasklistalias").setCurrentIndex(position);
    }
    actionShowItemClick(listview0_childWgt5,args);

}
});
View listview0_childWgt5_pane231 = (View) getListview0_childWgt5_pane231View((UMActivity)context,binderGroup,configure);
listview0_childWgt5.addView(listview0_childWgt5_pane231);

return listview0_childWgt5;
}
public View getListview0_childWgt6_panel15View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt6_panel15 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT6_PANEL15
,"height","17"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"margin-bottom","3"
,"valign","center"
);
listview0_childWgt6_label8 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT6_LABEL8
,"content","label"
,"bindfield","startdate"
,"halign","left"
,"height","fill"
,"color","#c8c7cc"
,"layout-type","linear"
,"font-size","13"
,"width","50"
,"font-family","default"
,"valign","center"
);
UMTextBinder listview0_childWgt6_label8_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt6_label8_binder.setBindInfo(new BindInfo("startdate"));
listview0_childWgt6_label8_binder.setControl(listview0_childWgt6_label8);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT6_LABEL8, listview0_childWgt6_label8_binder);
listview0_childWgt6_panel15.addView(listview0_childWgt6_label8);
listview0_childWgt6_label3 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT6_LABEL3
,"halign","center"
,"height","fill"
,"color","#c8c7cc"
,"layout-type","linear"
,"font-size","13"
,"width","20"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,listview0_childWgt6_label3,"content","#{res.task_to}"));
listview0_childWgt6_panel15.addView(listview0_childWgt6_label3);
listview0_childWgt6_label6 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT6_LABEL6
,"content","label"
,"bindfield","enddate"
,"halign","center"
,"height","fill"
,"color","#c8c7cc"
,"layout-type","linear"
,"font-size","13"
,"width","60"
,"font-family","default"
,"valign","center"
);
UMTextBinder listview0_childWgt6_label6_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt6_label6_binder.setBindInfo(new BindInfo("enddate"));
listview0_childWgt6_label6_binder.setControl(listview0_childWgt6_label6);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT6_LABEL6, listview0_childWgt6_label6_binder);
listview0_childWgt6_panel15.addView(listview0_childWgt6_label6);
listview0_childWgt6_image5 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_LISTVIEW0_CHILDWGT6_IMAGE5
,"height","fill"
,"layout-type","linear"
,"width","15"
,"scaletype","fitcenter"
,"src","oatask_important_gray.png"
);
listview0_childWgt6_panel15.addView(listview0_childWgt6_image5);
listview0_childWgt6_label9 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT6_LABEL9
,"bindfield","taskstate"
,"halign","left"
,"width","60"
,"content","label"
,"margin-right","4"
,"height","fill"
,"color","#c8c7cc"
,"font-size","13"
,"layout-type","linear"
,"margin-left","8"
,"font-family","default"
,"valign","center"
);
UMTextBinder listview0_childWgt6_label9_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt6_label9_binder.setBindInfo(new BindInfo("taskstate"));
listview0_childWgt6_label9_binder.setControl(listview0_childWgt6_label9);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT6_LABEL9, listview0_childWgt6_label9_binder);
listview0_childWgt6_panel15.addView(listview0_childWgt6_label9);
listview0_childWgt6_label0 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT6_LABEL0
,"bindfield","mewtask"
,"halign","center"
,"height","fill"
,"color","#c8c7cc"
,"layout-type","linear"
,"font-size","13"
,"width","20"
,"font-family","default"
,"valign","center"
);
UMTextBinder listview0_childWgt6_label0_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt6_label0_binder.setBindInfo(new BindInfo("mewtask"));
listview0_childWgt6_label0_binder.setControl(listview0_childWgt6_label0);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT6_LABEL0, listview0_childWgt6_label0_binder);
listview0_childWgt6_panel15.addView(listview0_childWgt6_label0);
listview0_childWgt6_label2 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT6_LABEL2
,"bindfield","urge"
,"halign","right"
,"height","fill"
,"weight","1"
,"color","#c8c7cc"
,"layout-type","linear"
,"font-size","13"
,"width","0"
,"font-family","default"
,"valign","center"
);
UMTextBinder listview0_childWgt6_label2_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt6_label2_binder.setBindInfo(new BindInfo("urge"));
listview0_childWgt6_label2_binder.setControl(listview0_childWgt6_label2);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT6_LABEL2, listview0_childWgt6_label2_binder);
listview0_childWgt6_panel15.addView(listview0_childWgt6_label2);

return listview0_childWgt6_panel15;
}
public View getListview0_childWgt6_panel16View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt6_panel16 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT6_PANEL16
,"height","22"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"margin-bottom","5"
,"valign","center"
);
listview0_childWgt6_label7 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT6_LABEL7
,"content","label"
,"bindfield","taskname"
,"margin-right","4"
,"halign","left"
,"height","fill"
,"color","#c8c7cc"
,"layout-type","linear"
,"font-size","16"
,"width","200"
,"font-family","default"
,"valign","center"
);
UMTextBinder listview0_childWgt6_label7_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt6_label7_binder.setBindInfo(new BindInfo("taskname"));
listview0_childWgt6_label7_binder.setControl(listview0_childWgt6_label7);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT6_LABEL7, listview0_childWgt6_label7_binder);
listview0_childWgt6_panel16.addView(listview0_childWgt6_label7);
listview0_childWgt6_label1 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT6_LABEL1
,"content","label"
,"bindfield","charger"
,"halign","right"
,"height","fill"
,"weight","1"
,"color","#c8c7cc"
,"layout-type","linear"
,"font-size","16"
,"width","0"
,"font-family","default"
,"valign","center"
);
UMTextBinder listview0_childWgt6_label1_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt6_label1_binder.setBindInfo(new BindInfo("charger"));
listview0_childWgt6_label1_binder.setControl(listview0_childWgt6_label1);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT6_LABEL1, listview0_childWgt6_label1_binder);
listview0_childWgt6_panel16.addView(listview0_childWgt6_label1);

return listview0_childWgt6_panel16;
}
public View getListview0_childWgt6_panel0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt6_panel0 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT6_PANEL0
,"height","10"
,"layout-type","linear"
,"background","#EFEFF4"
,"width","fill"
,"valign","center"
);
listview0_childWgt6_progressbar0 = (UMProgressBar)ThirdControl.createControl(new UMProgressBar(context),ID_LISTVIEW0_CHILDWGT6_PROGRESSBAR0
,"bindfield","taskshedue"
,"progress","0"
,"height","10"
,"max","100"
,"layout-type","linear"
,"progresscolor","#0852a5"
,"width","fill"
,"background","#c8c7cc"
);
UMProgressBarBinder listview0_childWgt6_progressbar0_binder = new UMProgressBarBinder((IUMContextAccessor)context);
listview0_childWgt6_progressbar0_binder.setBindInfo(new BindInfo("taskshedue"));
listview0_childWgt6_progressbar0_binder.setControl(listview0_childWgt6_progressbar0);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT6_PROGRESSBAR0, listview0_childWgt6_progressbar0_binder);
listview0_childWgt6_panel0.addView(listview0_childWgt6_progressbar0);

return listview0_childWgt6_panel0;
}
public View getListview0_childWgt6_panel13View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt6_panel13 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_LISTVIEW0_CHILDWGT6_PANEL13
,"padding-right","8"
,"padding-top","6"
,"halign","center"
,"height","fill"
,"weight","1"
,"layout-type","linear"
,"background","#ffffff"
,"width","0"
,"padding-bottom","6"
);
View listview0_childWgt6_panel15 = (View) getListview0_childWgt6_panel15View((UMActivity)context,binderGroup,configure);
listview0_childWgt6_panel13.addView(listview0_childWgt6_panel15);
View listview0_childWgt6_panel16 = (View) getListview0_childWgt6_panel16View((UMActivity)context,binderGroup,configure);
listview0_childWgt6_panel13.addView(listview0_childWgt6_panel16);
View listview0_childWgt6_panel0 = (View) getListview0_childWgt6_panel0View((UMActivity)context,binderGroup,configure);
listview0_childWgt6_panel13.addView(listview0_childWgt6_panel0);

return listview0_childWgt6_panel13;
}
public View getListview0_childWgt6_panel14View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt6_panel14 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT6_PANEL14
,"height","fill"
,"layout-type","linear"
,"background","#ffffff"
,"width","8"
,"valign","center"
);
listview0_childWgt6_image4 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_LISTVIEW0_CHILDWGT6_IMAGE4
,"height","13"
,"layout-type","linear"
,"width","8"
,"scaletype","fitcenter"
,"src","ecm_arrow_right.png"
);
listview0_childWgt6_panel14.addView(listview0_childWgt6_image4);

return listview0_childWgt6_panel14;
}
public View getListview0_childWgt6_pane231View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt6_pane231 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT6_PANE231
,"padding-right","15"
,"height","fill"
,"weight","1"
,"layout-type","linear"
,"background","#ffffff"
,"width","0"
,"valign","center"
,"padding-bottom","1"
,"background-image","list_row_down3.png"
);
View listview0_childWgt6_panel13 = (View) getListview0_childWgt6_panel13View((UMActivity)context,binderGroup,configure);
listview0_childWgt6_pane231.addView(listview0_childWgt6_panel13);
View listview0_childWgt6_panel14 = (View) getListview0_childWgt6_panel14View((UMActivity)context,binderGroup,configure);
listview0_childWgt6_pane231.addView(listview0_childWgt6_panel14);

return listview0_childWgt6_pane231;
}
public View getListview0_childWgt6View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt6 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT6
,"padding-left","15"
,"height","70"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"onclick","showItemClick"
,"valign","center"
);
listview0_childWgt6.setOnClickListener(new OnCursorClickListener(configure) {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Task_mainviewthreeforoneActivity.this);
    int position = this.getPosition(v);
    if(position>=0) {
      context.getCursor("cursortasklistalias").setCurrentIndex(position);
    }
    actionShowItemClick(listview0_childWgt6,args);

}
});
View listview0_childWgt6_pane231 = (View) getListview0_childWgt6_pane231View((UMActivity)context,binderGroup,configure);
listview0_childWgt6.addView(listview0_childWgt6_pane231);

return listview0_childWgt6;
}
public View getListview0_childWgt7_panel15View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt7_panel15 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT7_PANEL15
,"height","17"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"margin-bottom","3"
,"valign","center"
);
listview0_childWgt7_label8 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT7_LABEL8
,"content","label"
,"bindfield","startdate"
,"halign","left"
,"height","fill"
,"color","#c8c7cc"
,"layout-type","linear"
,"font-size","13"
,"width","50"
,"font-family","default"
,"valign","center"
);
UMTextBinder listview0_childWgt7_label8_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt7_label8_binder.setBindInfo(new BindInfo("startdate"));
listview0_childWgt7_label8_binder.setControl(listview0_childWgt7_label8);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT7_LABEL8, listview0_childWgt7_label8_binder);
listview0_childWgt7_panel15.addView(listview0_childWgt7_label8);
listview0_childWgt7_label3 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT7_LABEL3
,"halign","center"
,"height","fill"
,"color","#c8c7cc"
,"layout-type","linear"
,"font-size","13"
,"width","20"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,listview0_childWgt7_label3,"content","#{res.task_to}"));
listview0_childWgt7_panel15.addView(listview0_childWgt7_label3);
listview0_childWgt7_label6 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT7_LABEL6
,"content","label"
,"bindfield","enddate"
,"halign","center"
,"height","fill"
,"color","#c8c7cc"
,"layout-type","linear"
,"font-size","13"
,"width","60"
,"font-family","default"
,"valign","center"
);
UMTextBinder listview0_childWgt7_label6_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt7_label6_binder.setBindInfo(new BindInfo("enddate"));
listview0_childWgt7_label6_binder.setControl(listview0_childWgt7_label6);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT7_LABEL6, listview0_childWgt7_label6_binder);
listview0_childWgt7_panel15.addView(listview0_childWgt7_label6);
listview0_childWgt7_label9 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT7_LABEL9
,"content","label"
,"bindfield","taskstate"
,"halign","left"
,"height","fill"
,"color","#c8c7cc"
,"layout-type","linear"
,"font-size","13"
,"width","60"
,"font-family","default"
,"valign","center"
);
UMTextBinder listview0_childWgt7_label9_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt7_label9_binder.setBindInfo(new BindInfo("taskstate"));
listview0_childWgt7_label9_binder.setControl(listview0_childWgt7_label9);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT7_LABEL9, listview0_childWgt7_label9_binder);
listview0_childWgt7_panel15.addView(listview0_childWgt7_label9);
listview0_childWgt7_label0 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT7_LABEL0
,"bindfield","mewtask"
,"halign","center"
,"height","fill"
,"color","#c8c7cc"
,"layout-type","linear"
,"font-size","13"
,"width","20"
,"font-family","default"
,"valign","center"
);
UMTextBinder listview0_childWgt7_label0_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt7_label0_binder.setBindInfo(new BindInfo("mewtask"));
listview0_childWgt7_label0_binder.setControl(listview0_childWgt7_label0);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT7_LABEL0, listview0_childWgt7_label0_binder);
listview0_childWgt7_panel15.addView(listview0_childWgt7_label0);
listview0_childWgt7_label2 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT7_LABEL2
,"bindfield","urge"
,"halign","right"
,"height","fill"
,"weight","1"
,"color","#c8c7cc"
,"layout-type","linear"
,"font-size","13"
,"width","0"
,"font-family","default"
,"valign","center"
);
UMTextBinder listview0_childWgt7_label2_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt7_label2_binder.setBindInfo(new BindInfo("urge"));
listview0_childWgt7_label2_binder.setControl(listview0_childWgt7_label2);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT7_LABEL2, listview0_childWgt7_label2_binder);
listview0_childWgt7_panel15.addView(listview0_childWgt7_label2);

return listview0_childWgt7_panel15;
}
public View getListview0_childWgt7_panel16View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt7_panel16 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT7_PANEL16
,"height","22"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"margin-bottom","5"
,"valign","center"
);
listview0_childWgt7_label7 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT7_LABEL7
,"content","label"
,"bindfield","taskname"
,"margin-right","4"
,"halign","left"
,"height","fill"
,"color","#c8c7cc"
,"layout-type","linear"
,"font-size","16"
,"width","200"
,"font-family","default"
,"valign","center"
);
UMTextBinder listview0_childWgt7_label7_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt7_label7_binder.setBindInfo(new BindInfo("taskname"));
listview0_childWgt7_label7_binder.setControl(listview0_childWgt7_label7);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT7_LABEL7, listview0_childWgt7_label7_binder);
listview0_childWgt7_panel16.addView(listview0_childWgt7_label7);
listview0_childWgt7_label1 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT7_LABEL1
,"content","label"
,"bindfield","charger"
,"halign","right"
,"height","fill"
,"weight","1"
,"color","#c8c7cc"
,"layout-type","linear"
,"font-size","16"
,"width","0"
,"font-family","default"
,"valign","center"
);
UMTextBinder listview0_childWgt7_label1_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt7_label1_binder.setBindInfo(new BindInfo("charger"));
listview0_childWgt7_label1_binder.setControl(listview0_childWgt7_label1);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT7_LABEL1, listview0_childWgt7_label1_binder);
listview0_childWgt7_panel16.addView(listview0_childWgt7_label1);

return listview0_childWgt7_panel16;
}
public View getListview0_childWgt7_panel0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt7_panel0 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT7_PANEL0
,"height","10"
,"layout-type","linear"
,"background","#EFEFF4"
,"width","fill"
,"valign","center"
);
listview0_childWgt7_progressbar0 = (UMProgressBar)ThirdControl.createControl(new UMProgressBar(context),ID_LISTVIEW0_CHILDWGT7_PROGRESSBAR0
,"bindfield","taskshedue"
,"progress","0"
,"height","10"
,"max","100"
,"layout-type","linear"
,"progresscolor","#0852a5"
,"width","fill"
,"background","#c8c7cc"
);
UMProgressBarBinder listview0_childWgt7_progressbar0_binder = new UMProgressBarBinder((IUMContextAccessor)context);
listview0_childWgt7_progressbar0_binder.setBindInfo(new BindInfo("taskshedue"));
listview0_childWgt7_progressbar0_binder.setControl(listview0_childWgt7_progressbar0);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT7_PROGRESSBAR0, listview0_childWgt7_progressbar0_binder);
listview0_childWgt7_panel0.addView(listview0_childWgt7_progressbar0);

return listview0_childWgt7_panel0;
}
public View getListview0_childWgt7_panel13View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt7_panel13 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_LISTVIEW0_CHILDWGT7_PANEL13
,"padding-right","8"
,"padding-top","6"
,"halign","center"
,"height","fill"
,"weight","1"
,"layout-type","linear"
,"background","#ffffff"
,"width","0"
,"padding-bottom","6"
);
View listview0_childWgt7_panel15 = (View) getListview0_childWgt7_panel15View((UMActivity)context,binderGroup,configure);
listview0_childWgt7_panel13.addView(listview0_childWgt7_panel15);
View listview0_childWgt7_panel16 = (View) getListview0_childWgt7_panel16View((UMActivity)context,binderGroup,configure);
listview0_childWgt7_panel13.addView(listview0_childWgt7_panel16);
View listview0_childWgt7_panel0 = (View) getListview0_childWgt7_panel0View((UMActivity)context,binderGroup,configure);
listview0_childWgt7_panel13.addView(listview0_childWgt7_panel0);

return listview0_childWgt7_panel13;
}
public View getListview0_childWgt7_panel14View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt7_panel14 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT7_PANEL14
,"height","fill"
,"layout-type","linear"
,"background","#ffffff"
,"width","8"
,"valign","center"
);
listview0_childWgt7_image4 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_LISTVIEW0_CHILDWGT7_IMAGE4
,"height","13"
,"layout-type","linear"
,"width","8"
,"scaletype","fitcenter"
,"src","ecm_arrow_right.png"
);
listview0_childWgt7_panel14.addView(listview0_childWgt7_image4);

return listview0_childWgt7_panel14;
}
public View getListview0_childWgt7_pane231View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt7_pane231 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT7_PANE231
,"padding-right","15"
,"height","fill"
,"weight","1"
,"layout-type","linear"
,"background","#ffffff"
,"width","0"
,"valign","center"
,"padding-bottom","1"
,"background-image","list_row_down3.png"
);
View listview0_childWgt7_panel13 = (View) getListview0_childWgt7_panel13View((UMActivity)context,binderGroup,configure);
listview0_childWgt7_pane231.addView(listview0_childWgt7_panel13);
View listview0_childWgt7_panel14 = (View) getListview0_childWgt7_panel14View((UMActivity)context,binderGroup,configure);
listview0_childWgt7_pane231.addView(listview0_childWgt7_panel14);

return listview0_childWgt7_pane231;
}
public View getListview0_childWgt7View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt7 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT7
,"padding-left","15"
,"height","70"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"onclick","showItemClick"
,"valign","center"
);
listview0_childWgt7.setOnClickListener(new OnCursorClickListener(configure) {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Task_mainviewthreeforoneActivity.this);
    int position = this.getPosition(v);
    if(position>=0) {
      context.getCursor("cursortasklistalias").setCurrentIndex(position);
    }
    actionShowItemClick(listview0_childWgt7,args);

}
});
View listview0_childWgt7_pane231 = (View) getListview0_childWgt7_pane231View((UMActivity)context,binderGroup,configure);
listview0_childWgt7.addView(listview0_childWgt7_pane231);

return listview0_childWgt7;
}
public View getListview0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0 = (UMListViewBase)ThirdControl.createControl(new UMListViewBase(context),ID_LISTVIEW0
,"onuprefersh","getfirstpage"
,"bindfield","tasklist"
,"height","0"
,"weight","1"
,"childindicator","priorityyeswidget"
,"ondownrefersh","getnextpage"
,"cursoraction","cursortasklistalias"
,"layout-type","linear"
,"background","#efeff4"
,"width","fill"
,"synccontext","tasklist"
);
context.createCursor("cursortasklistalias", "tasklist");
UMListBinder listview0_binder = new UMListBinder((IUMContextAccessor)context);
listview0_binder.setBindInfo(new BindInfo("tasklist"));
listview0_binder.setControl(listview0);
binderGroup.addBinderToGroup(ID_LISTVIEW0, listview0_binder);
listview0.setEvent("onuprefersh", new OnCursorEventListener(configure) {
  @Override
  public void onEvent(View v, UMEventArgs parent) {
    UMEventArgs args = new UMEventArgs(Task_mainviewthreeforoneActivity.this);
    args.put(parent);
    actionGetfirstpage(listview0,args);

}
});
listview0.setEvent("ondownrefersh", new OnCursorEventListener(configure) {
  @Override
  public void onEvent(View v, UMEventArgs parent) {
    UMEventArgs args = new UMEventArgs(Task_mainviewthreeforoneActivity.this);
    args.put(parent);
    actionGetnextpage(listview0,args);

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
listview0.addListItemView(new UMListViewBase.ListItemView() {
	public View getItemView(Context context, View parent, IBinderGroup binderGroup,int position) {
  UMDslConfigure configure = new UMDslConfigure();
  configure.put("position",position);
View listview0_childWgt6 = (View) getListview0_childWgt6View((UMActivity)context,binderGroup,configure);
return listview0_childWgt6;
}});
listview0.addListItemView(new UMListViewBase.ListItemView() {
	public View getItemView(Context context, View parent, IBinderGroup binderGroup,int position) {
  UMDslConfigure configure = new UMDslConfigure();
  configure.put("position",position);
View listview0_childWgt7 = (View) getListview0_childWgt7View((UMActivity)context,binderGroup,configure);
return listview0_childWgt7;
}});

return listview0;
}
public View getPanel0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel0 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL0
,"halign","center"
,"height","0"
,"weight","1"
,"onload","dataonload"
,"layout-type","linear"
,"background","#efeff4"
,"width","fill"
);
View listview0 = (View) getListview0View((UMActivity)context,binderGroup,configure);
panel0.addView(listview0);

return panel0;
}
public View getWidget0_panel1View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
widget0_panel1 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_WIDGET0_PANEL1
,"halign","center"
,"height","fill"
,"weight","1"
,"layout-type","linear"
,"width","0"
);
widget0_imagebutton0 = (UMImageButton)ThirdControl.createControl(new UMImageButton(context),ID_WIDGET0_IMAGEBUTTON0
,"halign","center"
,"width","64"
,"icon-width","25"
,"istogglebutton","true"
,"font-pressed-color","#e50011"
,"icon-height","25"
,"height","49.0"
,"color","#808080"
,"layout-type","linear"
,"font-size","10"
,"icon-background-image","mytask_normal.png"
,"icon-pressed-image","mytask_click.png"
,"onclick","mytask"
,"font-family","default"
,"valign","center"
,"checked","false"
,"icon-text-spacing","5"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,widget0_imagebutton0,"value","#{res.task_mytasks}"));
widget0_imagebutton0.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Task_mainviewthreeforoneActivity.this);
    actionMytask(widget0_imagebutton0,args);

}
});
widget0_panel1.addView(widget0_imagebutton0);

return widget0_panel1;
}
public View getWidget0_panel2View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
widget0_panel2 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_WIDGET0_PANEL2
,"halign","center"
,"height","fill"
,"weight","1"
,"layout-type","linear"
,"width","0"
);
widget0_imagebutton1 = (UMImageButton)ThirdControl.createControl(new UMImageButton(context),ID_WIDGET0_IMAGEBUTTON1
,"halign","center"
,"width","64"
,"icon-width","25"
,"istogglebutton","true"
,"font-pressed-color","#e50011"
,"icon-height","25"
,"height","49"
,"color","#808080"
,"layout-type","linear"
,"font-size","10"
,"icon-background-image","mypublish_normal.png"
,"icon-pressed-image","mypublish_click.png"
,"onclick","mypublish"
,"font-family","default"
,"valign","center"
,"checked","false"
,"icon-text-spacing","5"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,widget0_imagebutton1,"value","#{res.task_myinitiations}"));
widget0_imagebutton1.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Task_mainviewthreeforoneActivity.this);
    actionMypublish(widget0_imagebutton1,args);

}
});
widget0_panel2.addView(widget0_imagebutton1);

return widget0_panel2;
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
View widget0_panel1 = (View) getWidget0_panel1View((UMActivity)context,binderGroup,configure);
widget0_toolbar0.addView(widget0_panel1);
View widget0_panel2 = (View) getWidget0_panel2View((UMActivity)context,binderGroup,configure);
widget0_toolbar0.addView(widget0_panel2);

return widget0_toolbar0;
}
public View getWidget0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
widget0 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_WIDGET0
,"halign","center"
,"height","49"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
);
View widget0_toolbar0 = (View) getWidget0_toolbar0View((UMActivity)context,binderGroup,configure);
widget0.addView(widget0_toolbar0);

return widget0;
}
public View getNavigatorbar1View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
navigatorbar1 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_NAVIGATORBAR1
,"height","49"
,"color","#ffffff"
,"pressed-image","nav"
,"layout-type","linear"
,"font-size","17"
,"width","fill"
,"background-image-dis","nav"
,"font-family","default"
,"valign","top"
,"background-image","nav.png"
);
View widget0 = (View) getWidget0View((UMActivity)context,binderGroup,configure);
navigatorbar1.addView(widget0);

return navigatorbar1;
}
public View getViewPage0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
viewPage0 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_VIEWPAGE0
,"halign","center"
,"height","fill"
,"layout-type","vbox"
,"background","#efeff4"
,"width","fill"
);
View navPanel = (View) getNavPanelView((UMActivity)context,binderGroup,configure);
viewPage0.addView(navPanel);
View panel0 = (View) getPanel0View((UMActivity)context,binderGroup,configure);
viewPage0.addView(panel0);
View navigatorbar1 = (View) getNavigatorbar1View((UMActivity)context,binderGroup,configure);
viewPage0.addView(navigatorbar1);

return viewPage0;
}
public UMWindow getCurrentWindow(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
mainviewthreeforone = (UMWindow)ThirdControl.createControl(new UMWindow(context),ID_MAINVIEWTHREEFORONE
,"halign","center"
,"height","fill"
,"layout","vbox"
,"width","fill"
,"context","detaillist"
,"controller","mainviewthreeforoneController"
,"namespace","nc.bs.oa.oama.ecm"
);
View viewPage0 = (View) getViewPage0View((UMActivity)context,binderGroup,configure);
mainviewthreeforone.addView(viewPage0);

return (UMWindow)mainviewthreeforone;
}

	
	public void actionGetnextpage(View control, UMEventArgs args) {
    String actionid = "getnextpage";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "getnextpage",UMActivity.getViewId(control),args);
}
public void actionRefreshctx(View control, UMEventArgs args) {
    String actionid = "refreshctx";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "refreshctx",UMActivity.getViewId(control),args);
}
public void actionShowItemClick(View control, UMEventArgs args) {
    String actionid = "showItemClick";
    args.put("taskdetail","#{#{cursor.cursortasklistalias}}");
    args.put("checkindex","#{cursor.cursortasklistalias.index}");
  this.dataCollect();
    args.put("checkindex_arrayPath","tasklist");
    args.put("containerName","");
    args.put("taskdetail_arrayPath","tasklist");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "showItemClick",UMActivity.getViewId(control),args);
}
public void actionUMonUnload(View control, UMEventArgs args) {
    String actionid = "UMonUnload";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "UMonUnload",UMActivity.getViewId(control),args);
}
public void actionPersonalbtn(View control, UMEventArgs args) {
    String actionid = "personalbtn";
    args.put("viewid","nc.bs.oa.oama.ecm.Task_mainviewpsn");
    args.put("iskeep","false");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.open(args);
}
public void actionUMonComplete(View control, UMEventArgs args) {
    String actionid = "UMonComplete";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "UMonComplete",UMActivity.getViewId(control),args);
}
public void actionViewbtn(View control, UMEventArgs args) {
    String actionid = "viewbtn";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "viewbtn",UMActivity.getViewId(control),args);
}
public void actionMypublish(View control, UMEventArgs args) {
    String actionid = "mypublish";
    args.put("viewid","nc.bs.oa.oama.ecm.Task_mainviewtwo");
    args.put("iskeep","false");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.open(args);
}
public void actionGetfirstpage(View control, UMEventArgs args) {
    String actionid = "getfirstpage";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "getfirstpage",UMActivity.getViewId(control),args);
}
public void actionUMonDataBinding(View control, UMEventArgs args) {
    String actionid = "UMonDataBinding";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "UMonDataBinding",UMActivity.getViewId(control),args);
}
public void actionAddtask(View control, UMEventArgs args) {
    String actionid = "addtask";
    args.put("viewid","nc.bs.oa.oama.ecm.Task_welcomeviewController");
    args.put("animation-direction","left");
    args.put("animation-time","1");
    args.put("iskeep","true");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.open(args);
}
public void actionMytask(View control, UMEventArgs args) {
    String actionid = "mytask";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "mytask",UMActivity.getViewId(control),args);
}
public void actionSetSelector(View control, UMEventArgs args) {
    String actionid = "setSelector";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "setSelector",UMActivity.getViewId(control),args);
}
public void actionDataonload(View control, UMEventArgs args) {
    String actionid = "dataonload";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "dataonload",UMActivity.getViewId(control),args);
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
public void actionResponsebtn(View control, UMEventArgs args) {
    String actionid = "responsebtn";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "responsebtn",UMActivity.getViewId(control),args);
}
public void actionCrowbtn(View control, UMEventArgs args) {
    String actionid = "crowbtn";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "crowbtn",UMActivity.getViewId(control),args);
}
public void actionReturnhome(View control, UMEventArgs args) {
    String actionid = "returnhome";
    args.put("resultcode","0");
    args.put("iskeep","false");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.close(args);
}


}
