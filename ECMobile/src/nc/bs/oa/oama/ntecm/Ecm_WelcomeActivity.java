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

public abstract class Ecm_WelcomeActivity extends UMWindowActivity {

	protected UMWindow Ecm_Welcome = null;
protected XVerticalLayout viewPage0 = null;
protected UMViewFlipper flipper0 = null;
protected XVerticalLayout flipper0_childWgt0 = null;
protected XVerticalLayout flipper0_childWgt1 = null;
protected XVerticalLayout flipper0_childWgt2 = null;
protected XVerticalLayout flipper0_childWgt2_panel1 = null;
protected UMButton flipper0_childWgt2_button0 = null;

	
	protected final static int ID_ECM_WELCOME = 169158078;
protected final static int ID_VIEWPAGE0 = 898759543;
protected final static int ID_FLIPPER0 = 413478237;
protected final static int ID_FLIPPER0_CHILDWGT0 = 807417344;
protected final static int ID_FLIPPER0_CHILDWGT1 = 1400124658;
protected final static int ID_FLIPPER0_CHILDWGT2 = 791839248;
protected final static int ID_FLIPPER0_CHILDWGT2_PANEL1 = 1898110780;
protected final static int ID_FLIPPER0_CHILDWGT2_BUTTON0 = 992960346;

	
	
	@Override
	public String getControllerName() {
		return "Ecm_WelcomeController";
	}
	
	@Override
	public String getContextName() {
		return "";
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
		  idmap.put("Ecm_Welcome",ID_ECM_WELCOME);
  idmap.put("viewPage0",ID_VIEWPAGE0);
  idmap.put("flipper0",ID_FLIPPER0);
  idmap.put("flipper0_childWgt0",ID_FLIPPER0_CHILDWGT0);
  idmap.put("flipper0_childWgt1",ID_FLIPPER0_CHILDWGT1);
  idmap.put("flipper0_childWgt2",ID_FLIPPER0_CHILDWGT2);
  idmap.put("flipper0_childWgt2_panel1",ID_FLIPPER0_CHILDWGT2_PANEL1);
  idmap.put("flipper0_childWgt2_button0",ID_FLIPPER0_CHILDWGT2_BUTTON0);

	}
	
	public void onLoad() {
		ULog.logLC("onLoad", this);
		if(currentPage!=null) {
			currentPage.onLoad();
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
	
	
	
	public View getFlipper0_childWgt2View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
flipper0_childWgt2 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_FLIPPER0_CHILDWGT2
,"halign","center"
,"height","fill"
,"layout-type","linear"
,"width","fill"
,"background-image","ecm_wel_pic3.png"
);
flipper0_childWgt2_panel1 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_FLIPPER0_CHILDWGT2_PANEL1
,"halign","center"
,"height","0"
,"weight","1"
,"layout-type","linear"
,"width","fill"
);
flipper0_childWgt2.addView(flipper0_childWgt2_panel1);
flipper0_childWgt2_button0 = (UMButton)ThirdControl.createControl(new UMButton(context),ID_FLIPPER0_CHILDWGT2_BUTTON0
,"halign","center"
,"pressed-image","ecm_user_testdown.png"
,"width","154"
,"margin-bottom","60"
,"font-pressed-color","#ffffff"
,"height","36"
,"color","#ffffff"
,"layout-type","linear"
,"font-size","17"
,"value","马上体验"
,"onclick","toMainView"
,"font-family","default"
,"valign","center"
,"background-image","ecm_user_test.png"
);
flipper0_childWgt2_button0.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    UMEventArgs args = new UMEventArgs(Ecm_WelcomeActivity.this);
    actionToMainView(flipper0_childWgt2_button0,args);

}
});
flipper0_childWgt2.addView(flipper0_childWgt2_button0);

return flipper0_childWgt2;
}
public View getFlipper0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
flipper0 = (UMViewFlipper)ThirdControl.createControl(new UMViewFlipper(context),ID_FLIPPER0
,"height","fill"
,"layout-type","linear"
,"width","fill"
);
flipper0_childWgt0 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_FLIPPER0_CHILDWGT0
,"halign","center"
,"height","fill"
,"layout-type","linear"
,"width","fill"
,"background-image","ecm_wel_pic1.png"
);
flipper0.addView(flipper0_childWgt0);
flipper0_childWgt1 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_FLIPPER0_CHILDWGT1
,"halign","center"
,"height","fill"
,"layout-type","linear"
,"width","fill"
,"background-image","ecm_wel_pic2.png"
);
flipper0.addView(flipper0_childWgt1);
View flipper0_childWgt2 = (View) getFlipper0_childWgt2View((UMActivity)context,binderGroup,configure);
flipper0.addView(flipper0_childWgt2);

return flipper0;
}
public View getViewPage0View(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
viewPage0 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_VIEWPAGE0
,"halign","center"
,"height","fill"
,"layout-type","vbox"
,"background","#F5F5F5"
,"width","fill"
);
View flipper0 = (View) getFlipper0View((UMActivity)context,binderGroup,configure);
viewPage0.addView(flipper0);

return viewPage0;
}
public UMWindow getCurrentWindow(final UMActivity context,IBinderGroup binderGroup, UMDslConfigure configure) {
Ecm_Welcome = (UMWindow)ThirdControl.createControl(new UMWindow(context),ID_ECM_WELCOME
,"halign","center"
,"height","fill"
,"layout","vbox"
,"width","fill"
,"controller","Ecm_WelcomeController"
,"namespace","nc.bs.oa.oama.ecm"
);
View viewPage0 = (View) getViewPage0View((UMActivity)context,binderGroup,configure);
Ecm_Welcome.addView(viewPage0);

return (UMWindow)Ecm_Welcome;
}

	
	public void actionToMainView(View control, UMEventArgs args) {
    String actionid = "toMainView";
    args.put("viewid","nc.bs.oa.oama.ecm.Ecm_Main");
    args.put("iskeep","false");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.open(args);
}


}
