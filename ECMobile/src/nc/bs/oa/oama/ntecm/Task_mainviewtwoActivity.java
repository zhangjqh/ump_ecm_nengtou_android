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

public abstract class Task_mainviewtwoActivity extends UMWindowActivity {

	protected UMWindow mainviewtwo = null;
protected XVerticalLayout viewPage0 = null;
protected XHorizontalLayout navigatorbar0 = null;
protected XVerticalLayout widget0 = null;
protected XHorizontalLayout widget0_toplistwidget = null;
protected XHorizontalLayout widget0_leftPanel = null;
protected UMButton widget0_button1 = null;
protected UMToggleButtonGroup widget0_togglebuttongroup0 = null;
protected UMToggleButton widget0_togglebutton0 = null;
protected UMToggleButton widget0_togglebutton1 = null;
protected XVerticalLayout widget0_rightPanel = null;
protected UMButton widget0_button0 = null;
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
protected XVerticalLayout widget1 = null;
protected XHorizontalLayout widget1_toolbar0 = null;
protected XVerticalLayout widget1_panel1 = null;
protected UMImageButton widget1_imagebutton0 = null;
protected XVerticalLayout widget1_panel2 = null;
protected UMImageButton widget1_imagebutton1 = null;

	
	protected final static int ID_MAINVIEWTWO = 1568427355;
protected final static int ID_VIEWPAGE0 = 484282999;
protected final static int ID_NAVIGATORBAR0 = 407763577;
protected final static int ID_WIDGET0 = 844089654;
protected final static int ID_WIDGET0_TOPLISTWIDGET = 1286763690;
protected final static int ID_WIDGET0_LEFTPANEL = 1611793930;
protected final static int ID_WIDGET0_BUTTON1 = 1874944751;
protected final static int ID_WIDGET0_TOGGLEBUTTONGROUP0 = 477691893;
protected final static int ID_WIDGET0_TOGGLEBUTTON0 = 885072818;
protected final static int ID_WIDGET0_TOGGLEBUTTON1 = 1791523157;
protected final static int ID_WIDGET0_RIGHTPANEL = 1646453507;
protected final static int ID_WIDGET0_BUTTON0 = 1933630606;
protected final static int ID_PANEL0 = 1258061707;
protected final static int ID_LISTVIEW0 = 1729610009;
protected final static int ID_LISTVIEW0_CHILDWGT0 = 795333254;
protected final static int ID_LISTVIEW0_CHILDWGT0_PANE231 = 557265851;
protected final static int ID_LISTVIEW0_CHILDWGT0_PANEL13 = 956233923;
protected final static int ID_LISTVIEW0_CHILDWGT0_PANEL15 = 2000808861;
protected final static int ID_LISTVIEW0_CHILDWGT0_LABEL8 = 1391546286;
protected final static int ID_LISTVIEW0_CHILDWGT0_IMAGE5 = 2032601224;
protected final static int ID_LISTVIEW0_CHILDWGT0_LABEL9 = 1324249716;
protected final static int ID_LISTVIEW0_CHILDWGT0_LABEL0 = 1373058115;
protected final static int ID_LISTVIEW0_CHILDWGT0_LABEL2 = 924007262;
protected final static int ID_LISTVIEW0_CHILDWGT0_PANEL16 = 740727023;
protected final static int ID_LISTVIEW0_CHILDWGT0_LABEL7 = 1427595366;
protected final static int ID_LISTVIEW0_CHILDWGT0_LABEL1 = 171020564;
protected final static int ID_LISTVIEW0_CHILDWGT0_PANEL0 = 1228081135;
protected final static int ID_LISTVIEW0_CHILDWGT0_PROGRESSBAR0 = 1049140012;
protected final static int ID_LISTVIEW0_CHILDWGT0_PANEL14 = 454859448;
protected final static int ID_LISTVIEW0_CHILDWGT0_IMAGE4 = 818971125;
protected final static int ID_LISTVIEW0_CHILDWGT1 = 1031579318;
protected final static int ID_LISTVIEW0_CHILDWGT1_PANE231 = 1408078257;
protected final static int ID_LISTVIEW0_CHILDWGT1_PANEL13 = 524792891;
protected final static int ID_LISTVIEW0_CHILDWGT1_PANEL15 = 805965310;
protected final static int ID_LISTVIEW0_CHILDWGT1_LABEL8 = 1686629096;
protected final static int ID_LISTVIEW0_CHILDWGT1_LABEL9 = 1403021388;
protected final static int ID_LISTVIEW0_CHILDWGT1_LABEL0 = 31346079;
protected final static int ID_LISTVIEW0_CHILDWGT1_LABEL2 = 745563848;
protected final static int ID_LISTVIEW0_CHILDWGT1_PANEL16 = 1399813374;
protected final static int ID_LISTVIEW0_CHILDWGT1_LABEL7 = 924114786;
protected final static int ID_LISTVIEW0_CHILDWGT1_LABEL1 = 144509772;
protected final static int ID_LISTVIEW0_CHILDWGT1_PANEL0 = 386738155;
protected final static int ID_LISTVIEW0_CHILDWGT1_PROGRESSBAR0 = 1906866224;
protected final static int ID_LISTVIEW0_CHILDWGT1_PANEL14 = 980917744;
protected final static int ID_LISTVIEW0_CHILDWGT1_IMAGE4 = 774204741;
protected final static int ID_LISTVIEW0_CHILDWGT2 = 1496834349;
protected final static int ID_LISTVIEW0_CHILDWGT2_PANE231 = 1336695461;
protected final static int ID_LISTVIEW0_CHILDWGT2_PANEL13 = 321909097;
protected final static int ID_LISTVIEW0_CHILDWGT2_PANEL15 = 1558230144;
protected final static int ID_LISTVIEW0_CHILDWGT2_LABEL8 = 1408329029;
protected final static int ID_LISTVIEW0_CHILDWGT2_IMAGE5 = 680363387;
protected final static int ID_LISTVIEW0_CHILDWGT2_LABEL9 = 694003594;
protected final static int ID_LISTVIEW0_CHILDWGT2_LABEL0 = 1534561221;
protected final static int ID_LISTVIEW0_CHILDWGT2_LABEL2 = 1634316886;
protected final static int ID_LISTVIEW0_CHILDWGT2_PANEL16 = 1870637248;
protected final static int ID_LISTVIEW0_CHILDWGT2_LABEL7 = 1506383339;
protected final static int ID_LISTVIEW0_CHILDWGT2_LABEL1 = 1690409883;
protected final static int ID_LISTVIEW0_CHILDWGT2_PANEL0 = 1140313605;
protected final static int ID_LISTVIEW0_CHILDWGT2_PROGRESSBAR0 = 445975347;
protected final static int ID_LISTVIEW0_CHILDWGT2_PANEL14 = 909738442;
protected final static int ID_LISTVIEW0_CHILDWGT2_IMAGE4 = 1455202143;
protected final static int ID_LISTVIEW0_CHILDWGT3 = 870480099;
protected final static int ID_LISTVIEW0_CHILDWGT3_PANE231 = 1942215406;
protected final static int ID_LISTVIEW0_CHILDWGT3_PANEL13 = 799430413;
protected final static int ID_LISTVIEW0_CHILDWGT3_PANEL15 = 988731280;
protected final static int ID_LISTVIEW0_CHILDWGT3_LABEL8 = 844612649;
protected final static int ID_LISTVIEW0_CHILDWGT3_LABEL9 = 403110425;
protected final static int ID_LISTVIEW0_CHILDWGT3_LABEL0 = 1673212575;
protected final static int ID_LISTVIEW0_CHILDWGT3_LABEL2 = 1905128783;
protected final static int ID_LISTVIEW0_CHILDWGT3_PANEL16 = 113261196;
protected final static int ID_LISTVIEW0_CHILDWGT3_LABEL7 = 152152581;
protected final static int ID_LISTVIEW0_CHILDWGT3_LABEL1 = 100124757;
protected final static int ID_LISTVIEW0_CHILDWGT3_PANEL0 = 285256227;
protected final static int ID_LISTVIEW0_CHILDWGT3_PROGRESSBAR0 = 1752796653;
protected final static int ID_LISTVIEW0_CHILDWGT3_PANEL14 = 1253491609;
protected final static int ID_LISTVIEW0_CHILDWGT3_IMAGE4 = 251001725;
protected final static int ID_LISTVIEW0_CHILDWGT4 = 1889943155;
protected final static int ID_LISTVIEW0_CHILDWGT4_PANE231 = 991494243;
protected final static int ID_LISTVIEW0_CHILDWGT4_PANEL13 = 821257181;
protected final static int ID_LISTVIEW0_CHILDWGT4_PANEL15 = 272937114;
protected final static int ID_LISTVIEW0_CHILDWGT4_LABEL8 = 204371112;
protected final static int ID_LISTVIEW0_CHILDWGT4_LABEL3 = 1911894138;
protected final static int ID_LISTVIEW0_CHILDWGT4_LABEL6 = 1086084422;
protected final static int ID_LISTVIEW0_CHILDWGT4_IMAGE5 = 2127489331;
protected final static int ID_LISTVIEW0_CHILDWGT4_LABEL9 = 2017210861;
protected final static int ID_LISTVIEW0_CHILDWGT4_LABEL0 = 1573471389;
protected final static int ID_LISTVIEW0_CHILDWGT4_LABEL2 = 993725535;
protected final static int ID_LISTVIEW0_CHILDWGT4_PANEL16 = 232094503;
protected final static int ID_LISTVIEW0_CHILDWGT4_LABEL7 = 656867729;
protected final static int ID_LISTVIEW0_CHILDWGT4_LABEL1 = 584341141;
protected final static int ID_LISTVIEW0_CHILDWGT4_PANEL0 = 933418147;
protected final static int ID_LISTVIEW0_CHILDWGT4_PROGRESSBAR0 = 506292308;
protected final static int ID_LISTVIEW0_CHILDWGT4_PANEL14 = 970440944;
protected final static int ID_LISTVIEW0_CHILDWGT4_IMAGE4 = 2132685255;
protected final static int ID_LISTVIEW0_CHILDWGT5 = 1393652641;
protected final static int ID_LISTVIEW0_CHILDWGT5_PANE231 = 812942769;
protected final static int ID_LISTVIEW0_CHILDWGT5_PANEL13 = 1295786459;
protected final static int ID_LISTVIEW0_CHILDWGT5_PANEL15 = 233847087;
protected final static int ID_LISTVIEW0_CHILDWGT5_LABEL8 = 258483428;
protected final static int ID_LISTVIEW0_CHILDWGT5_LABEL3 = 146822776;
protected final static int ID_LISTVIEW0_CHILDWGT5_LABEL6 = 1369503006;
protected final static int ID_LISTVIEW0_CHILDWGT5_LABEL9 = 1267020064;
protected final static int ID_LISTVIEW0_CHILDWGT5_LABEL0 = 1252313079;
protected final static int ID_LISTVIEW0_CHILDWGT5_LABEL2 = 1930283403;
protected final static int ID_LISTVIEW0_CHILDWGT5_PANEL16 = 13905853;
protected final static int ID_LISTVIEW0_CHILDWGT5_LABEL7 = 534931641;
protected final static int ID_LISTVIEW0_CHILDWGT5_LABEL1 = 2004415477;
protected final static int ID_LISTVIEW0_CHILDWGT5_PANEL0 = 531515694;
protected final static int ID_LISTVIEW0_CHILDWGT5_PROGRESSBAR0 = 704412320;
protected final static int ID_LISTVIEW0_CHILDWGT5_PANEL14 = 1928888102;
protected final static int ID_LISTVIEW0_CHILDWGT5_IMAGE4 = 886493573;
protected final static int ID_LISTVIEW0_CHILDWGT6 = 1818043992;
protected final static int ID_LISTVIEW0_CHILDWGT6_PANE231 = 2078390304;
protected final static int ID_LISTVIEW0_CHILDWGT6_PANEL13 = 162434434;
protected final static int ID_LISTVIEW0_CHILDWGT6_PANEL15 = 1585698927;
protected final static int ID_LISTVIEW0_CHILDWGT6_LABEL8 = 1036870810;
protected final static int ID_LISTVIEW0_CHILDWGT6_LABEL3 = 1936590727;
protected final static int ID_LISTVIEW0_CHILDWGT6_LABEL6 = 1568134930;
protected final static int ID_LISTVIEW0_CHILDWGT6_IMAGE5 = 2092762437;
protected final static int ID_LISTVIEW0_CHILDWGT6_LABEL9 = 479097437;
protected final static int ID_LISTVIEW0_CHILDWGT6_LABEL0 = 2010840916;
protected final static int ID_LISTVIEW0_CHILDWGT6_LABEL2 = 1650852702;
protected final static int ID_LISTVIEW0_CHILDWGT6_PANEL16 = 1874130656;
protected final static int ID_LISTVIEW0_CHILDWGT6_LABEL7 = 1501233716;
protected final static int ID_LISTVIEW0_CHILDWGT6_LABEL1 = 956440464;
protected final static int ID_LISTVIEW0_CHILDWGT6_PANEL0 = 1432698822;
protected final static int ID_LISTVIEW0_CHILDWGT6_PROGRESSBAR0 = 1381863611;
protected final static int ID_LISTVIEW0_CHILDWGT6_PANEL14 = 995806230;
protected final static int ID_LISTVIEW0_CHILDWGT6_IMAGE4 = 1849604923;
protected final static int ID_LISTVIEW0_CHILDWGT7 = 1422015255;
protected final static int ID_LISTVIEW0_CHILDWGT7_PANE231 = 1031779361;
protected final static int ID_LISTVIEW0_CHILDWGT7_PANEL13 = 772222255;
protected final static int ID_LISTVIEW0_CHILDWGT7_PANEL15 = 1224650876;
protected final static int ID_LISTVIEW0_CHILDWGT7_LABEL8 = 1416867316;
protected final static int ID_LISTVIEW0_CHILDWGT7_LABEL3 = 1166750031;
protected final static int ID_LISTVIEW0_CHILDWGT7_LABEL6 = 251184787;
protected final static int ID_LISTVIEW0_CHILDWGT7_LABEL9 = 1602926695;
protected final static int ID_LISTVIEW0_CHILDWGT7_LABEL0 = 884171598;
protected final static int ID_LISTVIEW0_CHILDWGT7_LABEL2 = 361651014;
protected final static int ID_LISTVIEW0_CHILDWGT7_PANEL16 = 1032399906;
protected final static int ID_LISTVIEW0_CHILDWGT7_LABEL7 = 369320141;
protected final static int ID_LISTVIEW0_CHILDWGT7_LABEL1 = 1652173044;
protected final static int ID_LISTVIEW0_CHILDWGT7_PANEL0 = 1130370608;
protected final static int ID_LISTVIEW0_CHILDWGT7_PROGRESSBAR0 = 559064248;
protected final static int ID_LISTVIEW0_CHILDWGT7_PANEL14 = 1751486930;
protected final static int ID_LISTVIEW0_CHILDWGT7_IMAGE4 = 783359095;
protected final static int ID_NAVIGATORBAR1 = 2094976296;
protected final static int ID_WIDGET1 = 1651062360;
protected final static int ID_WIDGET1_TOOLBAR0 = 948656575;
protected final static int ID_WIDGET1_PANEL1 = 1505197119;
protected final static int ID_WIDGET1_IMAGEBUTTON0 = 1918369540;
protected final static int ID_WIDGET1_PANEL2 = 2016519428;
protected final static int ID_WIDGET1_IMAGEBUTTON1 = 1548558870;

	
	
	@Override
	public String getControllerName() {
		return "mainviewtwoController";
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
		  idmap.put("mainviewtwo",ID_MAINVIEWTWO);
  idmap.put("viewPage0",ID_VIEWPAGE0);
  idmap.put("navigatorbar0",ID_NAVIGATORBAR0);
  idmap.put("widget0",ID_WIDGET0);
  idmap.put("widget0_toplistwidget",ID_WIDGET0_TOPLISTWIDGET);
  idmap.put("widget0_leftPanel",ID_WIDGET0_LEFTPANEL);
  idmap.put("widget0_button1",ID_WIDGET0_BUTTON1);
  idmap.put("widget0_togglebuttongroup0",ID_WIDGET0_TOGGLEBUTTONGROUP0);
  idmap.put("widget0_togglebutton0",ID_WIDGET0_TOGGLEBUTTON0);
  idmap.put("widget0_togglebutton1",ID_WIDGET0_TOGGLEBUTTON1);
  idmap.put("widget0_rightPanel",ID_WIDGET0_RIGHTPANEL);
  idmap.put("widget0_button0",ID_WIDGET0_BUTTON0);
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
  idmap.put("widget1",ID_WIDGET1);
  idmap.put("widget1_toolbar0",ID_WIDGET1_TOOLBAR0);
  idmap.put("widget1_panel1",ID_WIDGET1_PANEL1);
  idmap.put("widget1_imagebutton0",ID_WIDGET1_IMAGEBUTTON0);
  idmap.put("widget1_panel2",ID_WIDGET1_PANEL2);
  idmap.put("widget1_imagebutton1",ID_WIDGET1_IMAGEBUTTON1);

	}
	
	public void onLoad() {
		ULog.logLC("onLoad", this);
		if(currentPage!=null) {
			currentPage.onLoad();
		}
	
		{ //viewPage0 - initbtnclick
    UMEventArgs args = new UMEventArgs(Task_mainviewtwoActivity.this);
    actionInitbtnclick(viewPage0,args);

}
{ //panel0 - getfirstpage
    UMEventArgs args = new UMEventArgs(Task_mainviewtwoActivity.this);
    actionGetfirstpage(panel0,args);

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
	
	
	
	public View getWidget0_leftPanelView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
widget0_leftPanel = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_WIDGET0_LEFTPANEL
,"height","fill"
,"layout-type","linear"
,"width","64"
,"valign","center"
);
widget0_button1 = (UMButton)ThirdControl.createControl(new UMButton(context),ID_WIDGET0_BUTTON1
,"halign","center"
,"height","44"
,"color","#e50011"
,"layout-type","linear"
,"font-size","17"
,"width","64"
,"onclick","returnhome"
,"font-family","default"
,"font-pressed-color","#f2adb2"
,"valign","center"
,"background-image","btn_back.png"
);
widget0_button1.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Task_mainviewtwoActivity.this);
    actionReturnhome(widget0_button1,args);

}
});
widget0_leftPanel.addView(widget0_button1);

return widget0_leftPanel;
}
public View getWidget0_togglebuttongroup0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
widget0_togglebuttongroup0 = (UMToggleButtonGroup)ThirdControl.createControl(new UMToggleButtonGroup(context),ID_WIDGET0_TOGGLEBUTTONGROUP0
,"margin-right","25"
,"height","40"
,"weight","1"
,"layout","hbox"
,"width","0"
,"margin-left","25"
,"value","buttongroup"
,"valign","center"
);
widget0_togglebutton0 = (UMToggleButton)ThirdControl.createControl(new UMToggleButton(context),ID_WIDGET0_TOGGLEBUTTON0
,"halign","center"
,"weight","1"
,"background-image-off","label_2_left"
,"width","0"
,"font-pressed-color","#f8f8f8"
,"type","button"
,"background-image-on","label_2_left_touch"
,"height","30.0"
,"color","#e50011"
,"layout-type","hbox"
,"font-size","14"
,"value","6"
,"onclick","confirm"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,widget0_togglebutton0,"textOff","#{res.task_tobeconfirmed}"));
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,widget0_togglebutton0,"textOn","#{res.task_tobeconfirmed}"));
widget0_togglebutton0.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Task_mainviewtwoActivity.this);
    actionConfirm(widget0_togglebutton0,args);

}
});
widget0_togglebuttongroup0.addView(widget0_togglebutton0);
widget0_togglebutton1 = (UMToggleButton)ThirdControl.createControl(new UMToggleButton(context),ID_WIDGET0_TOGGLEBUTTON1
,"halign","center"
,"weight","1"
,"background-image-off","label_2_right"
,"width","0"
,"font-pressed-color","#f8f8f8"
,"type","button"
,"background-image-on","label_2_right_touch"
,"height","30.0"
,"color","#e50011"
,"layout-type","hbox"
,"font-size","14"
,"value","4"
,"onclick","querytasklist"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,widget0_togglebutton1,"textOff","#{res.task_tasklist}"));
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,widget0_togglebutton1,"textOn","#{res.task_tasklist}"));
widget0_togglebutton1.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Task_mainviewtwoActivity.this);
    actionQuerytasklist(widget0_togglebutton1,args);

}
});
widget0_togglebuttongroup0.addView(widget0_togglebutton1);

return widget0_togglebuttongroup0;
}
public View getWidget0_rightPanelView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
widget0_rightPanel = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_WIDGET0_RIGHTPANEL
,"halign","right"
,"height","fill"
,"layout-type","linear"
,"width","64"
);
widget0_button0 = (UMButton)ThirdControl.createControl(new UMButton(context),ID_WIDGET0_BUTTON0
,"halign","center"
,"pressed-image","oatask_add_clicktouch.png"
,"width","44"
,"background-image-dis","button"
,"height","44"
,"color","#ffffff"
,"layout-type","linear"
,"font-size","18"
,"onclick","addtask"
,"font-family","default"
,"valign","center"
,"background-image","oatask_add_click.png"
);
widget0_button0.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Task_mainviewtwoActivity.this);
    actionAddtask(widget0_button0,args);

}
});
widget0_rightPanel.addView(widget0_button0);

return widget0_rightPanel;
}
public View getWidget0_toplistwidgetView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
widget0_toplistwidget = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_WIDGET0_TOPLISTWIDGET
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
View widget0_leftPanel = (View) getWidget0_leftPanelView((UMActivity)context,binderGroup,configure);
widget0_toplistwidget.addView(widget0_leftPanel);
View widget0_togglebuttongroup0 = (View) getWidget0_togglebuttongroup0View((UMActivity)context,binderGroup,configure);
widget0_toplistwidget.addView(widget0_togglebuttongroup0);
View widget0_rightPanel = (View) getWidget0_rightPanelView((UMActivity)context,binderGroup,configure);
widget0_toplistwidget.addView(widget0_rightPanel);

return widget0_toplistwidget;
}
public View getWidget0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
widget0 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_WIDGET0
,"halign","center"
,"height","fill"
,"layout-type","linear"
,"background","#FFFFE0"
,"width","fill"
);
View widget0_toplistwidget = (View) getWidget0_toplistwidgetView((UMActivity)context,binderGroup,configure);
widget0.addView(widget0_toplistwidget);

return widget0;
}
public View getNavigatorbar0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
navigatorbar0 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_NAVIGATORBAR0
,"height","45"
,"color","#ffffff"
,"pressed-image","nav"
,"layout-type","linear"
,"font-size","17"
,"width","fill"
,"background-image-dis","nav"
,"font-family","default"
,"valign","center"
,"background-image","nav.png"
);
View widget0 = (View) getWidget0View((UMActivity)context,binderGroup,configure);
navigatorbar0.addView(widget0);

return navigatorbar0;
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
    UMEventArgs args = new UMEventArgs(Task_mainviewtwoActivity.this);
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
    UMEventArgs args = new UMEventArgs(Task_mainviewtwoActivity.this);
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
    UMEventArgs args = new UMEventArgs(Task_mainviewtwoActivity.this);
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
    UMEventArgs args = new UMEventArgs(Task_mainviewtwoActivity.this);
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
    UMEventArgs args = new UMEventArgs(Task_mainviewtwoActivity.this);
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
    UMEventArgs args = new UMEventArgs(Task_mainviewtwoActivity.this);
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
    UMEventArgs args = new UMEventArgs(Task_mainviewtwoActivity.this);
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
    UMEventArgs args = new UMEventArgs(Task_mainviewtwoActivity.this);
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
    UMEventArgs args = new UMEventArgs(Task_mainviewtwoActivity.this);
    args.put(parent);
    actionGetfirstpage(listview0,args);

}
});
listview0.setEvent("ondownrefersh", new OnCursorEventListener(configure) {
  @Override
  public void onEvent(View v, UMEventArgs parent) {
    UMEventArgs args = new UMEventArgs(Task_mainviewtwoActivity.this);
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
,"onload","getfirstpage"
,"layout-type","linear"
,"background","#efeff4"
,"width","fill"
);
View listview0 = (View) getListview0View((UMActivity)context,binderGroup,configure);
panel0.addView(listview0);

return panel0;
}
public View getWidget1_panel1View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
widget1_panel1 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_WIDGET1_PANEL1
,"halign","center"
,"height","fill"
,"weight","1"
,"layout-type","linear"
,"width","0"
);
widget1_imagebutton0 = (UMImageButton)ThirdControl.createControl(new UMImageButton(context),ID_WIDGET1_IMAGEBUTTON0
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
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,widget1_imagebutton0,"value","#{res.task_mytasks}"));
widget1_imagebutton0.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Task_mainviewtwoActivity.this);
    actionMytask(widget1_imagebutton0,args);

}
});
widget1_panel1.addView(widget1_imagebutton0);

return widget1_panel1;
}
public View getWidget1_panel2View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
widget1_panel2 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_WIDGET1_PANEL2
,"halign","center"
,"height","fill"
,"weight","1"
,"layout-type","linear"
,"width","0"
);
widget1_imagebutton1 = (UMImageButton)ThirdControl.createControl(new UMImageButton(context),ID_WIDGET1_IMAGEBUTTON1
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
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,widget1_imagebutton1,"value","#{res.task_myinitiations}"));
widget1_imagebutton1.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Task_mainviewtwoActivity.this);
    actionMypublish(widget1_imagebutton1,args);

}
});
widget1_panel2.addView(widget1_imagebutton1);

return widget1_panel2;
}
public View getWidget1_toolbar0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
widget1_toolbar0 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_WIDGET1_TOOLBAR0
,"height","fill"
,"pressed-image","toolbar"
,"layout-type","linear"
,"width","fill"
,"background-image-dis","toolbar"
,"valign","center"
,"background-image","toolbar.png"
);
View widget1_panel1 = (View) getWidget1_panel1View((UMActivity)context,binderGroup,configure);
widget1_toolbar0.addView(widget1_panel1);
View widget1_panel2 = (View) getWidget1_panel2View((UMActivity)context,binderGroup,configure);
widget1_toolbar0.addView(widget1_panel2);

return widget1_toolbar0;
}
public View getWidget1View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
widget1 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_WIDGET1
,"halign","center"
,"height","49"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
);
View widget1_toolbar0 = (View) getWidget1_toolbar0View((UMActivity)context,binderGroup,configure);
widget1.addView(widget1_toolbar0);

return widget1;
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
View widget1 = (View) getWidget1View((UMActivity)context,binderGroup,configure);
navigatorbar1.addView(widget1);

return navigatorbar1;
}
public View getViewPage0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
viewPage0 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_VIEWPAGE0
,"halign","center"
,"height","fill"
,"onload","initbtnclick"
,"layout-type","vbox"
,"background","#efeff4"
,"width","fill"
);
View navigatorbar0 = (View) getNavigatorbar0View((UMActivity)context,binderGroup,configure);
viewPage0.addView(navigatorbar0);
View panel0 = (View) getPanel0View((UMActivity)context,binderGroup,configure);
viewPage0.addView(panel0);
View navigatorbar1 = (View) getNavigatorbar1View((UMActivity)context,binderGroup,configure);
viewPage0.addView(navigatorbar1);

return viewPage0;
}
public UMWindow getCurrentWindow(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
mainviewtwo = (UMWindow)ThirdControl.createControl(new UMWindow(context),ID_MAINVIEWTWO
,"halign","center"
,"height","fill"
,"layout","vbox"
,"width","fill"
,"context","detaillist"
,"controller","mainviewtwoController"
,"namespace","nc.bs.oa.oama.ecm"
);
View viewPage0 = (View) getViewPage0View((UMActivity)context,binderGroup,configure);
mainviewtwo.addView(viewPage0);

return (UMWindow)mainviewtwo;
}

	
	public void actionQuerytasklist(View control, UMEventArgs args) {
    String actionid = "querytasklist";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "querytasklist",UMActivity.getViewId(control),args);
}
public void actionGetnextpage(View control, UMEventArgs args) {
    String actionid = "getnextpage";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "getnextpage",UMActivity.getViewId(control),args);
}
public void actionTasklistonload(View control, UMEventArgs args) {
    String actionid = "tasklistonload";
    args.put("viewid","nc.bs.oa.oama.oatask.ListviewController");
  this.dataCollect();
    args.put("action","getTaskList");
    args.put("autoDataBinding","true");
    args.put("params","{tasktype:'4'}");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMService.callAction(args);
}
public void actionShowItemClick(View control, UMEventArgs args) {
    String actionid = "showItemClick";
    args.put("taskid_arrayPath","tasklist");
    args.put("taskid","#{#{cursor.cursortasklistalias}}");
  this.dataCollect();
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "showItemClick",UMActivity.getViewId(control),args);
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
public void actionMypublish(View control, UMEventArgs args) {
    String actionid = "mypublish";
  this.dataCollect();
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "mypublish",UMActivity.getViewId(control),args);
}
public void actionGetfirstpage(View control, UMEventArgs args) {
    String actionid = "getfirstpage";
    args.put("count","25");
    args.put("viewid","nc.bs.oa.oama.oatask.ListviewController");
    args.put("startline","1");
    args.put("action","getTaskList");
    args.put("callback","setSelector");
    args.put("listid","listview0");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMList.getFirstPage(args);
}
public void actionUMonDataBinding(View control, UMEventArgs args) {
    String actionid = "UMonDataBinding";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "UMonDataBinding",UMActivity.getViewId(control),args);
}
public void actionAddtask(View control, UMEventArgs args) {
    String actionid = "addtask";
    args.put("viewid","nc.bs.oa.oama.ecm.Task_edit");
  this.dataCollect();
    args.put("iskeep","false");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.open(args);
}
public void actionMytask(View control, UMEventArgs args) {
    String actionid = "mytask";
    args.put("viewid","nc.bs.oa.oama.ecm.Task_mainviewpsn");
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
public void actionInitbtnclick(View control, UMEventArgs args) {
    String actionid = "initbtnclick";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "initbtnclick",UMActivity.getViewId(control),args);
}
public void actionReturnhome(View control, UMEventArgs args) {
    String actionid = "returnhome";
    args.put("resultcode","0");
    args.put("iskeep","false");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.close(args);
}
public void actionConfirm(View control, UMEventArgs args) {
    String actionid = "confirm";
    args.put("viewid","nc.bs.oa.oama.ecm.Task_mainviewconfirm");
    args.put("iskeep","false");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.open(args);
}


}
