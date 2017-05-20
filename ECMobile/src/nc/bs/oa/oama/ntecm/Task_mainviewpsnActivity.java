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

public abstract class Task_mainviewpsnActivity extends UMWindowActivity {

	protected UMWindow mainviewpsn = null;
protected XVerticalLayout viewPage0 = null;
protected XVerticalLayout panel0 = null;
protected XHorizontalLayout widget0 = null;
protected XHorizontalLayout widget0_toplistwidget = null;
protected XHorizontalLayout widget0_leftPanel = null;
protected UMButton widget0_button0 = null;
protected UMToggleButtonGroup widget0_togglebuttongroup0 = null;
protected UMToggleButton widget0_togglebutton0 = null;
protected UMToggleButton widget0_togglebutton1 = null;
protected UMToggleButton widget0_togglebutton2 = null;
protected UMToggleButton widget0_togglebutton3 = null;
protected XVerticalLayout widget0_rightPanel = null;
protected UMButton widget0_addtask = null;
protected XVerticalLayout panel1 = null;
protected UMListViewBase listview0 = null;
protected XHorizontalLayout listview0_childWgt0 = null;
protected XHorizontalLayout listview0_childWgt0_panel21 = null;
protected XVerticalLayout listview0_childWgt0_panel8 = null;
protected XHorizontalLayout listview0_childWgt0_panel10 = null;
protected UMLabel listview0_childWgt0_label4 = null;
protected UMImage listview0_childWgt0_image0 = null;
protected UMLabel listview0_childWgt0_label0 = null;
protected XHorizontalLayout listview0_childWgt0_panel11 = null;
protected UMLabel listview0_childWgt0_label5 = null;
protected XHorizontalLayout listview0_childWgt0_panel9 = null;
protected UMImage listview0_childWgt0_image2 = null;
protected XHorizontalLayout listview0_childWgt1 = null;
protected XHorizontalLayout listview0_childWgt1_panel21 = null;
protected XVerticalLayout listview0_childWgt1_panel8 = null;
protected XHorizontalLayout listview0_childWgt1_panel10 = null;
protected UMLabel listview0_childWgt1_label4 = null;
protected UMLabel listview0_childWgt1_label0 = null;
protected XHorizontalLayout listview0_childWgt1_panel11 = null;
protected UMLabel listview0_childWgt1_label5 = null;
protected XHorizontalLayout listview0_childWgt1_panel9 = null;
protected UMImage listview0_childWgt1_image2 = null;
protected XHorizontalLayout listview0_childWgt2 = null;
protected XHorizontalLayout listview0_childWgt2_panel21 = null;
protected XVerticalLayout listview0_childWgt2_panel8 = null;
protected XHorizontalLayout listview0_childWgt2_panel10 = null;
protected UMLabel listview0_childWgt2_label4 = null;
protected UMLabel listview0_childWgt2_label1 = null;
protected UMLabel listview0_childWgt2_label6 = null;
protected UMImage listview0_childWgt2_image0 = null;
protected UMLabel listview0_childWgt2_label0 = null;
protected XHorizontalLayout listview0_childWgt2_panel11 = null;
protected UMLabel listview0_childWgt2_label5 = null;
protected XHorizontalLayout listview0_childWgt2_panel9 = null;
protected UMImage listview0_childWgt2_image2 = null;
protected XHorizontalLayout listview0_childWgt3 = null;
protected XHorizontalLayout listview0_childWgt3_panel21 = null;
protected XVerticalLayout listview0_childWgt3_panel8 = null;
protected XHorizontalLayout listview0_childWgt3_panel10 = null;
protected UMLabel listview0_childWgt3_label4 = null;
protected UMLabel listview0_childWgt3_label1 = null;
protected UMLabel listview0_childWgt3_label6 = null;
protected UMLabel listview0_childWgt3_label0 = null;
protected XHorizontalLayout listview0_childWgt3_panel11 = null;
protected UMLabel listview0_childWgt3_label5 = null;
protected XHorizontalLayout listview0_childWgt3_panel9 = null;
protected UMImage listview0_childWgt3_image2 = null;
protected XVerticalLayout panel2 = null;
protected XVerticalLayout widget1 = null;
protected XHorizontalLayout widget1_toolbar0 = null;
protected XVerticalLayout widget1_panel1 = null;
protected UMImageButton widget1_imagebutton0 = null;
protected XVerticalLayout widget1_panel2 = null;
protected UMImageButton widget1_imagebutton1 = null;

	
	protected final static int ID_MAINVIEWPSN = 2111918727;
protected final static int ID_VIEWPAGE0 = 795562083;
protected final static int ID_PANEL0 = 257375959;
protected final static int ID_WIDGET0 = 994580559;
protected final static int ID_WIDGET0_TOPLISTWIDGET = 1709449152;
protected final static int ID_WIDGET0_LEFTPANEL = 699508387;
protected final static int ID_WIDGET0_BUTTON0 = 837186795;
protected final static int ID_WIDGET0_TOGGLEBUTTONGROUP0 = 1034791408;
protected final static int ID_WIDGET0_TOGGLEBUTTON0 = 110076507;
protected final static int ID_WIDGET0_TOGGLEBUTTON1 = 1550359869;
protected final static int ID_WIDGET0_TOGGLEBUTTON2 = 2064619984;
protected final static int ID_WIDGET0_TOGGLEBUTTON3 = 1284762164;
protected final static int ID_WIDGET0_RIGHTPANEL = 285712435;
protected final static int ID_WIDGET0_ADDTASK = 713576282;
protected final static int ID_PANEL1 = 266938716;
protected final static int ID_LISTVIEW0 = 1601297561;
protected final static int ID_LISTVIEW0_CHILDWGT0 = 1202310756;
protected final static int ID_LISTVIEW0_CHILDWGT0_PANEL21 = 651260189;
protected final static int ID_LISTVIEW0_CHILDWGT0_PANEL8 = 1398483528;
protected final static int ID_LISTVIEW0_CHILDWGT0_PANEL10 = 1774580979;
protected final static int ID_LISTVIEW0_CHILDWGT0_LABEL4 = 1351085378;
protected final static int ID_LISTVIEW0_CHILDWGT0_IMAGE0 = 1954806128;
protected final static int ID_LISTVIEW0_CHILDWGT0_LABEL0 = 1814927387;
protected final static int ID_LISTVIEW0_CHILDWGT0_PANEL11 = 583541250;
protected final static int ID_LISTVIEW0_CHILDWGT0_LABEL5 = 2053449304;
protected final static int ID_LISTVIEW0_CHILDWGT0_PANEL9 = 1083685457;
protected final static int ID_LISTVIEW0_CHILDWGT0_IMAGE2 = 187925027;
protected final static int ID_LISTVIEW0_CHILDWGT1 = 280023661;
protected final static int ID_LISTVIEW0_CHILDWGT1_PANEL21 = 1079676798;
protected final static int ID_LISTVIEW0_CHILDWGT1_PANEL8 = 127182313;
protected final static int ID_LISTVIEW0_CHILDWGT1_PANEL10 = 340834670;
protected final static int ID_LISTVIEW0_CHILDWGT1_LABEL4 = 808832660;
protected final static int ID_LISTVIEW0_CHILDWGT1_LABEL0 = 1598589882;
protected final static int ID_LISTVIEW0_CHILDWGT1_PANEL11 = 51547669;
protected final static int ID_LISTVIEW0_CHILDWGT1_LABEL5 = 1257244772;
protected final static int ID_LISTVIEW0_CHILDWGT1_PANEL9 = 1501599864;
protected final static int ID_LISTVIEW0_CHILDWGT1_IMAGE2 = 1539626969;
protected final static int ID_LISTVIEW0_CHILDWGT2 = 2099730361;
protected final static int ID_LISTVIEW0_CHILDWGT2_PANEL21 = 117907316;
protected final static int ID_LISTVIEW0_CHILDWGT2_PANEL8 = 1714451443;
protected final static int ID_LISTVIEW0_CHILDWGT2_PANEL10 = 810824631;
protected final static int ID_LISTVIEW0_CHILDWGT2_LABEL4 = 2010453794;
protected final static int ID_LISTVIEW0_CHILDWGT2_LABEL1 = 1255589569;
protected final static int ID_LISTVIEW0_CHILDWGT2_LABEL6 = 1375383416;
protected final static int ID_LISTVIEW0_CHILDWGT2_IMAGE0 = 1339384917;
protected final static int ID_LISTVIEW0_CHILDWGT2_LABEL0 = 1602040323;
protected final static int ID_LISTVIEW0_CHILDWGT2_PANEL11 = 171679750;
protected final static int ID_LISTVIEW0_CHILDWGT2_LABEL5 = 929873110;
protected final static int ID_LISTVIEW0_CHILDWGT2_PANEL9 = 1584109593;
protected final static int ID_LISTVIEW0_CHILDWGT2_IMAGE2 = 1256030094;
protected final static int ID_LISTVIEW0_CHILDWGT3 = 1265609492;
protected final static int ID_LISTVIEW0_CHILDWGT3_PANEL21 = 112845814;
protected final static int ID_LISTVIEW0_CHILDWGT3_PANEL8 = 1885924698;
protected final static int ID_LISTVIEW0_CHILDWGT3_PANEL10 = 1166708755;
protected final static int ID_LISTVIEW0_CHILDWGT3_LABEL4 = 993107985;
protected final static int ID_LISTVIEW0_CHILDWGT3_LABEL1 = 1130193991;
protected final static int ID_LISTVIEW0_CHILDWGT3_LABEL6 = 2141672421;
protected final static int ID_LISTVIEW0_CHILDWGT3_LABEL0 = 1024350805;
protected final static int ID_LISTVIEW0_CHILDWGT3_PANEL11 = 1588554407;
protected final static int ID_LISTVIEW0_CHILDWGT3_LABEL5 = 1340237045;
protected final static int ID_LISTVIEW0_CHILDWGT3_PANEL9 = 275454816;
protected final static int ID_LISTVIEW0_CHILDWGT3_IMAGE2 = 276009833;
protected final static int ID_PANEL2 = 1642001198;
protected final static int ID_WIDGET1 = 75478842;
protected final static int ID_WIDGET1_TOOLBAR0 = 1089566142;
protected final static int ID_WIDGET1_PANEL1 = 709274503;
protected final static int ID_WIDGET1_IMAGEBUTTON0 = 836776067;
protected final static int ID_WIDGET1_PANEL2 = 1385675919;
protected final static int ID_WIDGET1_IMAGEBUTTON1 = 1121977036;

	
	
	@Override
	public String getControllerName() {
		return "mainviewpsnController";
	}
	
	@Override
	public String getContextName() {
		return "listview";
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
		  idmap.put("mainviewpsn",ID_MAINVIEWPSN);
  idmap.put("viewPage0",ID_VIEWPAGE0);
  idmap.put("panel0",ID_PANEL0);
  idmap.put("widget0",ID_WIDGET0);
  idmap.put("widget0_toplistwidget",ID_WIDGET0_TOPLISTWIDGET);
  idmap.put("widget0_leftPanel",ID_WIDGET0_LEFTPANEL);
  idmap.put("widget0_button0",ID_WIDGET0_BUTTON0);
  idmap.put("widget0_togglebuttongroup0",ID_WIDGET0_TOGGLEBUTTONGROUP0);
  idmap.put("widget0_togglebutton0",ID_WIDGET0_TOGGLEBUTTON0);
  idmap.put("widget0_togglebutton1",ID_WIDGET0_TOGGLEBUTTON1);
  idmap.put("widget0_togglebutton2",ID_WIDGET0_TOGGLEBUTTON2);
  idmap.put("widget0_togglebutton3",ID_WIDGET0_TOGGLEBUTTON3);
  idmap.put("widget0_rightPanel",ID_WIDGET0_RIGHTPANEL);
  idmap.put("widget0_addtask",ID_WIDGET0_ADDTASK);
  idmap.put("panel1",ID_PANEL1);
  idmap.put("listview0",ID_LISTVIEW0);
  idmap.put("listview0_childWgt0",ID_LISTVIEW0_CHILDWGT0);
  idmap.put("listview0_childWgt0_panel21",ID_LISTVIEW0_CHILDWGT0_PANEL21);
  idmap.put("listview0_childWgt0_panel8",ID_LISTVIEW0_CHILDWGT0_PANEL8);
  idmap.put("listview0_childWgt0_panel10",ID_LISTVIEW0_CHILDWGT0_PANEL10);
  idmap.put("listview0_childWgt0_label4",ID_LISTVIEW0_CHILDWGT0_LABEL4);
  idmap.put("listview0_childWgt0_image0",ID_LISTVIEW0_CHILDWGT0_IMAGE0);
  idmap.put("listview0_childWgt0_label0",ID_LISTVIEW0_CHILDWGT0_LABEL0);
  idmap.put("listview0_childWgt0_panel11",ID_LISTVIEW0_CHILDWGT0_PANEL11);
  idmap.put("listview0_childWgt0_label5",ID_LISTVIEW0_CHILDWGT0_LABEL5);
  idmap.put("listview0_childWgt0_panel9",ID_LISTVIEW0_CHILDWGT0_PANEL9);
  idmap.put("listview0_childWgt0_image2",ID_LISTVIEW0_CHILDWGT0_IMAGE2);
  idmap.put("listview0_childWgt1",ID_LISTVIEW0_CHILDWGT1);
  idmap.put("listview0_childWgt1_panel21",ID_LISTVIEW0_CHILDWGT1_PANEL21);
  idmap.put("listview0_childWgt1_panel8",ID_LISTVIEW0_CHILDWGT1_PANEL8);
  idmap.put("listview0_childWgt1_panel10",ID_LISTVIEW0_CHILDWGT1_PANEL10);
  idmap.put("listview0_childWgt1_label4",ID_LISTVIEW0_CHILDWGT1_LABEL4);
  idmap.put("listview0_childWgt1_label0",ID_LISTVIEW0_CHILDWGT1_LABEL0);
  idmap.put("listview0_childWgt1_panel11",ID_LISTVIEW0_CHILDWGT1_PANEL11);
  idmap.put("listview0_childWgt1_label5",ID_LISTVIEW0_CHILDWGT1_LABEL5);
  idmap.put("listview0_childWgt1_panel9",ID_LISTVIEW0_CHILDWGT1_PANEL9);
  idmap.put("listview0_childWgt1_image2",ID_LISTVIEW0_CHILDWGT1_IMAGE2);
  idmap.put("listview0_childWgt2",ID_LISTVIEW0_CHILDWGT2);
  idmap.put("listview0_childWgt2_panel21",ID_LISTVIEW0_CHILDWGT2_PANEL21);
  idmap.put("listview0_childWgt2_panel8",ID_LISTVIEW0_CHILDWGT2_PANEL8);
  idmap.put("listview0_childWgt2_panel10",ID_LISTVIEW0_CHILDWGT2_PANEL10);
  idmap.put("listview0_childWgt2_label4",ID_LISTVIEW0_CHILDWGT2_LABEL4);
  idmap.put("listview0_childWgt2_label1",ID_LISTVIEW0_CHILDWGT2_LABEL1);
  idmap.put("listview0_childWgt2_label6",ID_LISTVIEW0_CHILDWGT2_LABEL6);
  idmap.put("listview0_childWgt2_image0",ID_LISTVIEW0_CHILDWGT2_IMAGE0);
  idmap.put("listview0_childWgt2_label0",ID_LISTVIEW0_CHILDWGT2_LABEL0);
  idmap.put("listview0_childWgt2_panel11",ID_LISTVIEW0_CHILDWGT2_PANEL11);
  idmap.put("listview0_childWgt2_label5",ID_LISTVIEW0_CHILDWGT2_LABEL5);
  idmap.put("listview0_childWgt2_panel9",ID_LISTVIEW0_CHILDWGT2_PANEL9);
  idmap.put("listview0_childWgt2_image2",ID_LISTVIEW0_CHILDWGT2_IMAGE2);
  idmap.put("listview0_childWgt3",ID_LISTVIEW0_CHILDWGT3);
  idmap.put("listview0_childWgt3_panel21",ID_LISTVIEW0_CHILDWGT3_PANEL21);
  idmap.put("listview0_childWgt3_panel8",ID_LISTVIEW0_CHILDWGT3_PANEL8);
  idmap.put("listview0_childWgt3_panel10",ID_LISTVIEW0_CHILDWGT3_PANEL10);
  idmap.put("listview0_childWgt3_label4",ID_LISTVIEW0_CHILDWGT3_LABEL4);
  idmap.put("listview0_childWgt3_label1",ID_LISTVIEW0_CHILDWGT3_LABEL1);
  idmap.put("listview0_childWgt3_label6",ID_LISTVIEW0_CHILDWGT3_LABEL6);
  idmap.put("listview0_childWgt3_label0",ID_LISTVIEW0_CHILDWGT3_LABEL0);
  idmap.put("listview0_childWgt3_panel11",ID_LISTVIEW0_CHILDWGT3_PANEL11);
  idmap.put("listview0_childWgt3_label5",ID_LISTVIEW0_CHILDWGT3_LABEL5);
  idmap.put("listview0_childWgt3_panel9",ID_LISTVIEW0_CHILDWGT3_PANEL9);
  idmap.put("listview0_childWgt3_image2",ID_LISTVIEW0_CHILDWGT3_IMAGE2);
  idmap.put("panel2",ID_PANEL2);
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
	
		{ //viewPage0 - initwidget
    UMEventArgs args = new UMEventArgs(Task_mainviewpsnActivity.this);
    actionInitwidget(viewPage0,args);

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
widget0_button0 = (UMButton)ThirdControl.createControl(new UMButton(context),ID_WIDGET0_BUTTON0
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
widget0_button0.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Task_mainviewpsnActivity.this);
    actionReturnhome(widget0_button0,args);

}
});
widget0_leftPanel.addView(widget0_button0);

return widget0_leftPanel;
}
public View getWidget0_togglebuttongroup0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
widget0_togglebuttongroup0 = (UMToggleButtonGroup)ThirdControl.createControl(new UMToggleButtonGroup(context),ID_WIDGET0_TOGGLEBUTTONGROUP0
,"height","30"
,"weight","1"
,"layout","hbox"
,"width","0"
,"value","buttongroup"
,"valign","center"
);
widget0_togglebutton0 = (UMToggleButton)ThirdControl.createControl(new UMToggleButton(context),ID_WIDGET0_TOGGLEBUTTON0
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
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,widget0_togglebutton0,"textOff","#{res.task_personal}"));
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,widget0_togglebutton0,"textOn","#{res.task_personal}"));
widget0_togglebutton0.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Task_mainviewpsnActivity.this);
    actionPersonalbtn(widget0_togglebutton0,args);

}
});
widget0_togglebuttongroup0.addView(widget0_togglebutton0);
widget0_togglebutton1 = (UMToggleButton)ThirdControl.createControl(new UMToggleButton(context),ID_WIDGET0_TOGGLEBUTTON1
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
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,widget0_togglebutton1,"textOff","#{res.task_resonpseable}"));
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,widget0_togglebutton1,"textOn","#{res.task_resonpseable}"));
widget0_togglebutton1.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Task_mainviewpsnActivity.this);
    actionResponsebtn(widget0_togglebutton1,args);

}
});
widget0_togglebuttongroup0.addView(widget0_togglebutton1);
widget0_togglebutton2 = (UMToggleButton)ThirdControl.createControl(new UMToggleButton(context),ID_WIDGET0_TOGGLEBUTTON2
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
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,widget0_togglebutton2,"textOff","#{res.task_assist}"));
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,widget0_togglebutton2,"textOn","#{res.task_assist}"));
widget0_togglebutton2.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Task_mainviewpsnActivity.this);
    actionCrowbtn(widget0_togglebutton2,args);

}
});
widget0_togglebuttongroup0.addView(widget0_togglebutton2);
widget0_togglebutton3 = (UMToggleButton)ThirdControl.createControl(new UMToggleButton(context),ID_WIDGET0_TOGGLEBUTTON3
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
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,widget0_togglebutton3,"textOff","#{res.task_followed}"));
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,widget0_togglebutton3,"textOn","#{res.task_followed}"));
widget0_togglebutton3.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Task_mainviewpsnActivity.this);
    actionViewbtn(widget0_togglebutton3,args);

}
});
widget0_togglebuttongroup0.addView(widget0_togglebutton3);

return widget0_togglebuttongroup0;
}
public View getWidget0_rightPanelView(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
widget0_rightPanel = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_WIDGET0_RIGHTPANEL
,"halign","right"
,"height","fill"
,"layout-type","linear"
,"width","64"
);
widget0_addtask = (UMButton)ThirdControl.createControl(new UMButton(context),ID_WIDGET0_ADDTASK
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
widget0_addtask.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Task_mainviewpsnActivity.this);
    actionAddtask(widget0_addtask,args);

}
});
widget0_rightPanel.addView(widget0_addtask);

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
widget0 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_WIDGET0
,"height","fill"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"valign","center"
);
View widget0_toplistwidget = (View) getWidget0_toplistwidgetView((UMActivity)context,binderGroup,configure);
widget0.addView(widget0_toplistwidget);

return widget0;
}
public View getPanel0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel0 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL0
,"halign","center"
,"height","45"
,"layout-type","linear"
,"background","#E6E6E6"
,"width","fill"
);
View widget0 = (View) getWidget0View((UMActivity)context,binderGroup,configure);
panel0.addView(widget0);

return panel0;
}
public View getListview0_childWgt0_panel10View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt0_panel10 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT0_PANEL10
,"height","18"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"margin-bottom","5"
,"valign","center"
);
listview0_childWgt0_label4 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT0_LABEL4
,"content","label"
,"bindfield","startdate"
,"halign","left"
,"height","fill"
,"color","#0852a5"
,"layout-type","linear"
,"font-size","13"
,"width","50"
,"font-family","default"
,"valign","center"
);
UMTextBinder listview0_childWgt0_label4_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt0_label4_binder.setBindInfo(new BindInfo("startdate"));
listview0_childWgt0_label4_binder.setControl(listview0_childWgt0_label4);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT0_LABEL4, listview0_childWgt0_label4_binder);
listview0_childWgt0_panel10.addView(listview0_childWgt0_label4);
listview0_childWgt0_image0 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_LISTVIEW0_CHILDWGT0_IMAGE0
,"height","15"
,"layout-type","linear"
,"width","15"
,"scaletype","fitcenter"
,"src","oatask_important.png"
);
listview0_childWgt0_panel10.addView(listview0_childWgt0_image0);
listview0_childWgt0_label0 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT0_LABEL0
,"bindfield","taskstate"
,"halign","left"
,"weight","1"
,"width","0"
,"content","label"
,"height","fill"
,"color","#0852a5"
,"font-size","13"
,"layout-type","linear"
,"margin-left","5"
,"font-family","default"
,"valign","center"
);
UMTextBinder listview0_childWgt0_label0_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt0_label0_binder.setBindInfo(new BindInfo("taskstate"));
listview0_childWgt0_label0_binder.setControl(listview0_childWgt0_label0);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT0_LABEL0, listview0_childWgt0_label0_binder);
listview0_childWgt0_panel10.addView(listview0_childWgt0_label0);

return listview0_childWgt0_panel10;
}
public View getListview0_childWgt0_panel11View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt0_panel11 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT0_PANEL11
,"height","22"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"valign","center"
);
listview0_childWgt0_label5 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT0_LABEL5
,"content","label"
,"bindfield","taskname"
,"halign","left"
,"height","fill"
,"color","#000000"
,"layout-type","linear"
,"font-size","16"
,"width","fill"
,"font-family","default"
,"valign","center"
);
UMTextBinder listview0_childWgt0_label5_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt0_label5_binder.setBindInfo(new BindInfo("taskname"));
listview0_childWgt0_label5_binder.setControl(listview0_childWgt0_label5);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT0_LABEL5, listview0_childWgt0_label5_binder);
listview0_childWgt0_panel11.addView(listview0_childWgt0_label5);

return listview0_childWgt0_panel11;
}
public View getListview0_childWgt0_panel8View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt0_panel8 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_LISTVIEW0_CHILDWGT0_PANEL8
,"padding-top","12"
,"halign","center"
,"height","fill"
,"weight","1"
,"layout-type","linear"
,"width","0"
,"padding-bottom","12"
,"background-image","list_row_down3.png"
);
View listview0_childWgt0_panel10 = (View) getListview0_childWgt0_panel10View((UMActivity)context,binderGroup,configure);
listview0_childWgt0_panel8.addView(listview0_childWgt0_panel10);
View listview0_childWgt0_panel11 = (View) getListview0_childWgt0_panel11View((UMActivity)context,binderGroup,configure);
listview0_childWgt0_panel8.addView(listview0_childWgt0_panel11);

return listview0_childWgt0_panel8;
}
public View getListview0_childWgt0_panel9View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt0_panel9 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT0_PANEL9
,"padding-right","15"
,"height","fill"
,"layout-type","linear"
,"width","23"
,"valign","center"
,"background-image","list_row_down3.png"
);
listview0_childWgt0_image2 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_LISTVIEW0_CHILDWGT0_IMAGE2
,"height","13"
,"layout-type","linear"
,"width","fill"
,"scaletype","fitcenter"
,"src","ecm_arrow_right.png"
);
listview0_childWgt0_panel9.addView(listview0_childWgt0_image2);

return listview0_childWgt0_panel9;
}
public View getListview0_childWgt0_panel21View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt0_panel21 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT0_PANEL21
,"padding-left","15"
,"height","fill"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"valign","center"
);
View listview0_childWgt0_panel8 = (View) getListview0_childWgt0_panel8View((UMActivity)context,binderGroup,configure);
listview0_childWgt0_panel21.addView(listview0_childWgt0_panel8);
View listview0_childWgt0_panel9 = (View) getListview0_childWgt0_panel9View((UMActivity)context,binderGroup,configure);
listview0_childWgt0_panel21.addView(listview0_childWgt0_panel9);

return listview0_childWgt0_panel21;
}
public View getListview0_childWgt0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt0 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT0
,"height","70"
,"layout-type","linear"
,"width","fill"
,"onclick","showItemDetail"
,"valign","center"
,"background-image","list_row_mid3.png"
);
listview0_childWgt0.setOnClickListener(new OnCursorClickListener(configure) {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Task_mainviewpsnActivity.this);
    int position = this.getPosition(v);
    if(position>=0) {
      context.getCursor("cursortasklistalias").setCurrentIndex(position);
    }
    actionShowItemDetail(listview0_childWgt0,args);

}
});
View listview0_childWgt0_panel21 = (View) getListview0_childWgt0_panel21View((UMActivity)context,binderGroup,configure);
listview0_childWgt0.addView(listview0_childWgt0_panel21);

return listview0_childWgt0;
}
public View getListview0_childWgt1_panel10View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt1_panel10 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT1_PANEL10
,"height","18"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"margin-bottom","5"
,"valign","center"
);
listview0_childWgt1_label4 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT1_LABEL4
,"content","label"
,"bindfield","startdate"
,"halign","left"
,"height","fill"
,"color","#0852a5"
,"layout-type","linear"
,"font-size","13"
,"width","50"
,"font-family","default"
,"valign","center"
);
UMTextBinder listview0_childWgt1_label4_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt1_label4_binder.setBindInfo(new BindInfo("startdate"));
listview0_childWgt1_label4_binder.setControl(listview0_childWgt1_label4);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT1_LABEL4, listview0_childWgt1_label4_binder);
listview0_childWgt1_panel10.addView(listview0_childWgt1_label4);
listview0_childWgt1_label0 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT1_LABEL0
,"bindfield","taskstate"
,"halign","left"
,"weight","1"
,"width","0"
,"content","label"
,"height","fill"
,"color","#0852a5"
,"font-size","13"
,"layout-type","linear"
,"margin-left","5"
,"font-family","default"
,"valign","center"
);
UMTextBinder listview0_childWgt1_label0_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt1_label0_binder.setBindInfo(new BindInfo("taskstate"));
listview0_childWgt1_label0_binder.setControl(listview0_childWgt1_label0);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT1_LABEL0, listview0_childWgt1_label0_binder);
listview0_childWgt1_panel10.addView(listview0_childWgt1_label0);

return listview0_childWgt1_panel10;
}
public View getListview0_childWgt1_panel11View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt1_panel11 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT1_PANEL11
,"height","22"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"valign","center"
);
listview0_childWgt1_label5 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT1_LABEL5
,"content","label"
,"bindfield","taskname"
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
listview0_childWgt1_label5_binder.setBindInfo(new BindInfo("taskname"));
listview0_childWgt1_label5_binder.setControl(listview0_childWgt1_label5);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT1_LABEL5, listview0_childWgt1_label5_binder);
listview0_childWgt1_panel11.addView(listview0_childWgt1_label5);

return listview0_childWgt1_panel11;
}
public View getListview0_childWgt1_panel8View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt1_panel8 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_LISTVIEW0_CHILDWGT1_PANEL8
,"padding-top","12"
,"halign","center"
,"height","fill"
,"weight","1"
,"layout-type","linear"
,"width","0"
,"padding-bottom","12"
,"background-image","list_row_down3.png"
);
View listview0_childWgt1_panel10 = (View) getListview0_childWgt1_panel10View((UMActivity)context,binderGroup,configure);
listview0_childWgt1_panel8.addView(listview0_childWgt1_panel10);
View listview0_childWgt1_panel11 = (View) getListview0_childWgt1_panel11View((UMActivity)context,binderGroup,configure);
listview0_childWgt1_panel8.addView(listview0_childWgt1_panel11);

return listview0_childWgt1_panel8;
}
public View getListview0_childWgt1_panel9View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt1_panel9 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT1_PANEL9
,"padding-right","15"
,"height","fill"
,"layout-type","linear"
,"width","23"
,"valign","center"
,"background-image","list_row_down3.png"
);
listview0_childWgt1_image2 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_LISTVIEW0_CHILDWGT1_IMAGE2
,"height","13"
,"layout-type","linear"
,"width","fill"
,"scaletype","fitcenter"
,"src","ecm_arrow_right.png"
);
listview0_childWgt1_panel9.addView(listview0_childWgt1_image2);

return listview0_childWgt1_panel9;
}
public View getListview0_childWgt1_panel21View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt1_panel21 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT1_PANEL21
,"padding-left","15"
,"height","fill"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"valign","center"
);
View listview0_childWgt1_panel8 = (View) getListview0_childWgt1_panel8View((UMActivity)context,binderGroup,configure);
listview0_childWgt1_panel21.addView(listview0_childWgt1_panel8);
View listview0_childWgt1_panel9 = (View) getListview0_childWgt1_panel9View((UMActivity)context,binderGroup,configure);
listview0_childWgt1_panel21.addView(listview0_childWgt1_panel9);

return listview0_childWgt1_panel21;
}
public View getListview0_childWgt1View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt1 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT1
,"height","70"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"onclick","showItemDetail"
,"valign","center"
);
listview0_childWgt1.setOnClickListener(new OnCursorClickListener(configure) {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Task_mainviewpsnActivity.this);
    int position = this.getPosition(v);
    if(position>=0) {
      context.getCursor("cursortasklistalias").setCurrentIndex(position);
    }
    actionShowItemDetail(listview0_childWgt1,args);

}
});
View listview0_childWgt1_panel21 = (View) getListview0_childWgt1_panel21View((UMActivity)context,binderGroup,configure);
listview0_childWgt1.addView(listview0_childWgt1_panel21);

return listview0_childWgt1;
}
public View getListview0_childWgt2_panel10View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt2_panel10 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT2_PANEL10
,"height","18"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"margin-bottom","5"
,"valign","center"
);
listview0_childWgt2_label4 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT2_LABEL4
,"content","label"
,"bindfield","startdate"
,"halign","left"
,"height","fill"
,"color","#0852a5"
,"layout-type","linear"
,"font-size","13"
,"width","50"
,"font-family","default"
,"valign","center"
);
UMTextBinder listview0_childWgt2_label4_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt2_label4_binder.setBindInfo(new BindInfo("startdate"));
listview0_childWgt2_label4_binder.setControl(listview0_childWgt2_label4);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT2_LABEL4, listview0_childWgt2_label4_binder);
listview0_childWgt2_panel10.addView(listview0_childWgt2_label4);
listview0_childWgt2_label1 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT2_LABEL1
,"halign","center"
,"height","fill"
,"color","#0852a5"
,"layout-type","linear"
,"font-size","13"
,"width","20"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,listview0_childWgt2_label1,"content","#{res.task_to}"));
listview0_childWgt2_panel10.addView(listview0_childWgt2_label1);
listview0_childWgt2_label6 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT2_LABEL6
,"content","label"
,"bindfield","enddate"
,"halign","center"
,"height","fill"
,"color","#0852a5"
,"layout-type","linear"
,"font-size","13"
,"width","50"
,"font-family","default"
,"valign","center"
);
UMTextBinder listview0_childWgt2_label6_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt2_label6_binder.setBindInfo(new BindInfo("enddate"));
listview0_childWgt2_label6_binder.setControl(listview0_childWgt2_label6);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT2_LABEL6, listview0_childWgt2_label6_binder);
listview0_childWgt2_panel10.addView(listview0_childWgt2_label6);
listview0_childWgt2_image0 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_LISTVIEW0_CHILDWGT2_IMAGE0
,"height","15"
,"layout-type","linear"
,"width","15"
,"scaletype","fitcenter"
,"src","oatask_important.png"
);
listview0_childWgt2_panel10.addView(listview0_childWgt2_image0);
listview0_childWgt2_label0 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT2_LABEL0
,"bindfield","taskstate"
,"halign","left"
,"weight","1"
,"width","0"
,"content","label"
,"height","fill"
,"color","#0852a5"
,"font-size","13"
,"layout-type","linear"
,"margin-left","5"
,"font-family","default"
,"valign","center"
);
UMTextBinder listview0_childWgt2_label0_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt2_label0_binder.setBindInfo(new BindInfo("taskstate"));
listview0_childWgt2_label0_binder.setControl(listview0_childWgt2_label0);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT2_LABEL0, listview0_childWgt2_label0_binder);
listview0_childWgt2_panel10.addView(listview0_childWgt2_label0);

return listview0_childWgt2_panel10;
}
public View getListview0_childWgt2_panel11View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt2_panel11 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT2_PANEL11
,"height","22"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"valign","center"
);
listview0_childWgt2_label5 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT2_LABEL5
,"content","label"
,"bindfield","taskname"
,"halign","left"
,"height","fill"
,"color","#000000"
,"layout-type","linear"
,"font-size","16"
,"width","fill"
,"font-family","default"
,"valign","center"
);
UMTextBinder listview0_childWgt2_label5_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt2_label5_binder.setBindInfo(new BindInfo("taskname"));
listview0_childWgt2_label5_binder.setControl(listview0_childWgt2_label5);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT2_LABEL5, listview0_childWgt2_label5_binder);
listview0_childWgt2_panel11.addView(listview0_childWgt2_label5);

return listview0_childWgt2_panel11;
}
public View getListview0_childWgt2_panel8View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt2_panel8 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_LISTVIEW0_CHILDWGT2_PANEL8
,"padding-top","12"
,"halign","center"
,"height","fill"
,"weight","1"
,"layout-type","linear"
,"width","0"
,"padding-bottom","12"
,"background-image","list_row_down3.png"
);
View listview0_childWgt2_panel10 = (View) getListview0_childWgt2_panel10View((UMActivity)context,binderGroup,configure);
listview0_childWgt2_panel8.addView(listview0_childWgt2_panel10);
View listview0_childWgt2_panel11 = (View) getListview0_childWgt2_panel11View((UMActivity)context,binderGroup,configure);
listview0_childWgt2_panel8.addView(listview0_childWgt2_panel11);

return listview0_childWgt2_panel8;
}
public View getListview0_childWgt2_panel9View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt2_panel9 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT2_PANEL9
,"padding-right","15"
,"height","fill"
,"layout-type","linear"
,"width","23"
,"valign","center"
,"background-image","list_row_down3.png"
);
listview0_childWgt2_image2 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_LISTVIEW0_CHILDWGT2_IMAGE2
,"height","13"
,"layout-type","linear"
,"width","fill"
,"scaletype","fitcenter"
,"src","ecm_arrow_right.png"
);
listview0_childWgt2_panel9.addView(listview0_childWgt2_image2);

return listview0_childWgt2_panel9;
}
public View getListview0_childWgt2_panel21View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt2_panel21 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT2_PANEL21
,"padding-left","15"
,"height","fill"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"valign","center"
);
View listview0_childWgt2_panel8 = (View) getListview0_childWgt2_panel8View((UMActivity)context,binderGroup,configure);
listview0_childWgt2_panel21.addView(listview0_childWgt2_panel8);
View listview0_childWgt2_panel9 = (View) getListview0_childWgt2_panel9View((UMActivity)context,binderGroup,configure);
listview0_childWgt2_panel21.addView(listview0_childWgt2_panel9);

return listview0_childWgt2_panel21;
}
public View getListview0_childWgt2View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt2 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT2
,"height","70"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"onclick","showItemDetail"
,"valign","center"
);
listview0_childWgt2.setOnClickListener(new OnCursorClickListener(configure) {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Task_mainviewpsnActivity.this);
    int position = this.getPosition(v);
    if(position>=0) {
      context.getCursor("cursortasklistalias").setCurrentIndex(position);
    }
    actionShowItemDetail(listview0_childWgt2,args);

}
});
View listview0_childWgt2_panel21 = (View) getListview0_childWgt2_panel21View((UMActivity)context,binderGroup,configure);
listview0_childWgt2.addView(listview0_childWgt2_panel21);

return listview0_childWgt2;
}
public View getListview0_childWgt3_panel10View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt3_panel10 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT3_PANEL10
,"height","18"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"margin-bottom","5"
,"valign","center"
);
listview0_childWgt3_label4 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT3_LABEL4
,"content","label"
,"bindfield","startdate"
,"halign","left"
,"height","fill"
,"color","#0852a5"
,"layout-type","linear"
,"font-size","13"
,"width","50"
,"font-family","default"
,"valign","center"
);
UMTextBinder listview0_childWgt3_label4_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt3_label4_binder.setBindInfo(new BindInfo("startdate"));
listview0_childWgt3_label4_binder.setControl(listview0_childWgt3_label4);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT3_LABEL4, listview0_childWgt3_label4_binder);
listview0_childWgt3_panel10.addView(listview0_childWgt3_label4);
listview0_childWgt3_label1 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT3_LABEL1
,"halign","center"
,"height","fill"
,"color","#0852a5"
,"layout-type","linear"
,"font-size","13"
,"width","20"
,"font-family","default"
,"valign","center"
);
binderGroup.addBinderToGroup(Common.genericId(), new PropertyBinder((IUMContextAccessor)context,listview0_childWgt3_label1,"content","#{res.task_to}"));
listview0_childWgt3_panel10.addView(listview0_childWgt3_label1);
listview0_childWgt3_label6 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT3_LABEL6
,"content","label"
,"bindfield","enddate"
,"halign","center"
,"height","fill"
,"color","#0852a5"
,"layout-type","linear"
,"font-size","13"
,"width","50"
,"font-family","default"
,"valign","center"
);
UMTextBinder listview0_childWgt3_label6_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt3_label6_binder.setBindInfo(new BindInfo("enddate"));
listview0_childWgt3_label6_binder.setControl(listview0_childWgt3_label6);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT3_LABEL6, listview0_childWgt3_label6_binder);
listview0_childWgt3_panel10.addView(listview0_childWgt3_label6);
listview0_childWgt3_label0 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT3_LABEL0
,"bindfield","taskstate"
,"halign","left"
,"weight","1"
,"width","0"
,"content","label"
,"height","fill"
,"color","#0852a5"
,"font-size","13"
,"layout-type","linear"
,"margin-left","5"
,"font-family","default"
,"valign","center"
);
UMTextBinder listview0_childWgt3_label0_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt3_label0_binder.setBindInfo(new BindInfo("taskstate"));
listview0_childWgt3_label0_binder.setControl(listview0_childWgt3_label0);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT3_LABEL0, listview0_childWgt3_label0_binder);
listview0_childWgt3_panel10.addView(listview0_childWgt3_label0);

return listview0_childWgt3_panel10;
}
public View getListview0_childWgt3_panel11View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt3_panel11 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT3_PANEL11
,"height","22"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"valign","center"
);
listview0_childWgt3_label5 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LISTVIEW0_CHILDWGT3_LABEL5
,"content","label"
,"bindfield","taskname"
,"halign","left"
,"height","fill"
,"color","#000000"
,"layout-type","linear"
,"font-size","16"
,"width","fill"
,"font-family","default"
,"valign","center"
);
UMTextBinder listview0_childWgt3_label5_binder = new UMTextBinder((IUMContextAccessor)context);
listview0_childWgt3_label5_binder.setBindInfo(new BindInfo("taskname"));
listview0_childWgt3_label5_binder.setControl(listview0_childWgt3_label5);
binderGroup.addBinderToGroup(ID_LISTVIEW0_CHILDWGT3_LABEL5, listview0_childWgt3_label5_binder);
listview0_childWgt3_panel11.addView(listview0_childWgt3_label5);

return listview0_childWgt3_panel11;
}
public View getListview0_childWgt3_panel8View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt3_panel8 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_LISTVIEW0_CHILDWGT3_PANEL8
,"padding-top","12"
,"halign","center"
,"height","fill"
,"weight","1"
,"layout-type","linear"
,"width","0"
,"padding-bottom","12"
,"background-image","list_row_down3.png"
);
View listview0_childWgt3_panel10 = (View) getListview0_childWgt3_panel10View((UMActivity)context,binderGroup,configure);
listview0_childWgt3_panel8.addView(listview0_childWgt3_panel10);
View listview0_childWgt3_panel11 = (View) getListview0_childWgt3_panel11View((UMActivity)context,binderGroup,configure);
listview0_childWgt3_panel8.addView(listview0_childWgt3_panel11);

return listview0_childWgt3_panel8;
}
public View getListview0_childWgt3_panel9View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt3_panel9 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT3_PANEL9
,"padding-right","15"
,"height","fill"
,"layout-type","linear"
,"width","23"
,"valign","center"
,"background-image","list_row_down3.png"
);
listview0_childWgt3_image2 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_LISTVIEW0_CHILDWGT3_IMAGE2
,"height","13"
,"layout-type","linear"
,"width","fill"
,"scaletype","fitcenter"
,"src","ecm_arrow_right.png"
);
listview0_childWgt3_panel9.addView(listview0_childWgt3_image2);

return listview0_childWgt3_panel9;
}
public View getListview0_childWgt3_panel21View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt3_panel21 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT3_PANEL21
,"padding-left","15"
,"height","fill"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"valign","center"
);
View listview0_childWgt3_panel8 = (View) getListview0_childWgt3_panel8View((UMActivity)context,binderGroup,configure);
listview0_childWgt3_panel21.addView(listview0_childWgt3_panel8);
View listview0_childWgt3_panel9 = (View) getListview0_childWgt3_panel9View((UMActivity)context,binderGroup,configure);
listview0_childWgt3_panel21.addView(listview0_childWgt3_panel9);

return listview0_childWgt3_panel21;
}
public View getListview0_childWgt3View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0_childWgt3 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_LISTVIEW0_CHILDWGT3
,"height","70"
,"layout-type","linear"
,"background","#ffffff"
,"width","fill"
,"onclick","showItemDetail"
,"valign","center"
);
listview0_childWgt3.setOnClickListener(new OnCursorClickListener(configure) {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Task_mainviewpsnActivity.this);
    int position = this.getPosition(v);
    if(position>=0) {
      context.getCursor("cursortasklistalias").setCurrentIndex(position);
    }
    actionShowItemDetail(listview0_childWgt3,args);

}
});
View listview0_childWgt3_panel21 = (View) getListview0_childWgt3_panel21View((UMActivity)context,binderGroup,configure);
listview0_childWgt3.addView(listview0_childWgt3_panel21);

return listview0_childWgt3;
}
public View getListview0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
listview0 = (UMListViewBase)ThirdControl.createControl(new UMListViewBase(context),ID_LISTVIEW0
,"onuprefersh","getfirstpage"
,"bindfield","tasklist"
,"height","0"
,"weight","1"
,"childindicator","psnyeswidget"
,"ondownrefersh","getnextpage"
,"cursoraction","cursortasklistalias"
,"layout-type","linear"
,"width","fill"
,"background","#efeff4"
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
    UMEventArgs args = new UMEventArgs(Task_mainviewpsnActivity.this);
    args.put(parent);
    actionGetfirstpage(listview0,args);

}
});
listview0.setEvent("ondownrefersh", new OnCursorEventListener(configure) {
  @Override
  public void onEvent(View v, UMEventArgs parent) {
    UMEventArgs args = new UMEventArgs(Task_mainviewpsnActivity.this);
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

return listview0;
}
public View getPanel1View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel1 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL1
,"halign","center"
,"height","0"
,"weight","1"
,"layout-type","linear"
,"background","#efeff4"
,"width","fill"
);
View listview0 = (View) getListview0View((UMActivity)context,binderGroup,configure);
panel1.addView(listview0);

return panel1;
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
    UMEventArgs args = new UMEventArgs(Task_mainviewpsnActivity.this);
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
    UMEventArgs args = new UMEventArgs(Task_mainviewpsnActivity.this);
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
public View getPanel2View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
panel2 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL2
,"halign","center"
,"height","49"
,"layout-type","linear"
,"background","#E6E6E6"
,"width","fill"
);
View widget1 = (View) getWidget1View((UMActivity)context,binderGroup,configure);
panel2.addView(widget1);

return panel2;
}
public View getViewPage0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
viewPage0 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_VIEWPAGE0
,"halign","center"
,"height","fill"
,"onload","initwidget"
,"layout-type","vbox"
,"background","#efeff4"
,"width","fill"
);
View panel0 = (View) getPanel0View((UMActivity)context,binderGroup,configure);
viewPage0.addView(panel0);
View panel1 = (View) getPanel1View((UMActivity)context,binderGroup,configure);
viewPage0.addView(panel1);
View panel2 = (View) getPanel2View((UMActivity)context,binderGroup,configure);
viewPage0.addView(panel2);

return viewPage0;
}
public UMWindow getCurrentWindow(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
mainviewpsn = (UMWindow)ThirdControl.createControl(new UMWindow(context),ID_MAINVIEWPSN
,"halign","center"
,"height","fill"
,"layout","vbox"
,"width","fill"
,"context","listview"
,"controller","mainviewpsnController"
,"namespace","nc.bs.oa.oama.ecm"
);
View viewPage0 = (View) getViewPage0View((UMActivity)context,binderGroup,configure);
mainviewpsn.addView(viewPage0);

return (UMWindow)mainviewpsn;
}

	
	public void actionGetnextpage(View control, UMEventArgs args) {
    String actionid = "getnextpage";
  this.dataCollect();
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "getnextpage",UMActivity.getViewId(control),args);
}
public void actionLoginAction(View control, UMEventArgs args) {
    String actionid = "loginAction";
    args.put("failedexit","true");
    args.put("type","ua");
    args.put("contextmapping","none");
    args.put("success","initwidget");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMService.login(args);
}
public void actionUMonUnload(View control, UMEventArgs args) {
    String actionid = "UMonUnload";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "UMonUnload",UMActivity.getViewId(control),args);
}
public void actionCloseAction(View control, UMEventArgs args) {
    String actionid = "closeAction";
    args.put("resultcode","0");
    args.put("iskeep","false");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.close(args);
}
public void actionPersonalbtn(View control, UMEventArgs args) {
    String actionid = "personalbtn";
    args.put("count","25");
    args.put("viewid","nc.bs.oa.oama.oatask.ListviewController");
    args.put("startline","1");
    args.put("action","getPersonalTaskList");
    args.put("callback","setSelector");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMList.getFirstPage(args);
}
public void actionUMonComplete(View control, UMEventArgs args) {
    String actionid = "UMonComplete";
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "UMonComplete",UMActivity.getViewId(control),args);
}
public void actionViewbtn(View control, UMEventArgs args) {
    String actionid = "viewbtn";
    args.put("tasktype","1");
    args.put("viewid","nc.bs.oa.oama.ecm.Task_mainviewthreeforone");
    args.put("iskeep","false");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.open(args);
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
    args.put("viewid","nc.bs.oa.oama.oatask.ListviewController");
    args.put("count","25");
    args.put("startline","1");
    args.put("action","getPersonalTaskList");
    args.put("callback","setSelector");
    args.put("listid","listview0");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMList.getFirstPage(args);
}
public void actionListviewonload(View control, UMEventArgs args) {
    String actionid = "listviewonload";
    args.put("viewid","nc.bs.oa.oama.oatask.ListviewController");
  this.dataCollect();
    args.put("action","getPersonalTaskList");
    args.put("autoDataBinding","true");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMService.callAction(args);
}
public void actionAddtask(View control, UMEventArgs args) {
    String actionid = "addtask";
    args.put("viewid","nc.bs.oa.oama.ecm.Task_personaltask_edit");
    args.put("animation-direction","left");
    args.put("animation-time","1");
  this.dataCollect();
    args.put("iskeep","false");
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
public void actionInitwidget(View control, UMEventArgs args) {
    String actionid = "initwidget";
  this.dataCollect();
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "initwidget",UMActivity.getViewId(control),args);
}
public void actionMytask(View control, UMEventArgs args) {
    String actionid = "mytask";
  this.dataCollect();
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
    args.put("tasktype","3");
    args.put("viewid","nc.bs.oa.oama.ecm.Task_mainviewthreeforone");
  this.dataCollect();
    args.put("iskeep","false");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.open(args);
}
public void actionShowItemDetail(View control, UMEventArgs args) {
    String actionid = "showItemDetail";
    args.put("abc","#{#{cursor.cursortasklistalias}}");
    args.put("viewid","nc.bs.oa.oama.ecm.Task_personaltask_detail");
  this.dataCollect();
    args.put("iskeep","false");
    args.put("abc_arrayPath","tasklist");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.open(args);
}
public void actionCrowbtn(View control, UMEventArgs args) {
    String actionid = "crowbtn";
    args.put("tasktype","2");
    args.put("viewid","nc.bs.oa.oama.ecm.Task_mainviewthreeforone");
    args.put("iskeep","false");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.open(args);
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
