package nc.bs.oa.oama.ntecm;

import java.util.List;

import wa.android.common.App;
import wa.android.common.CrashHandler;
import wa.android.common.Module;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.util.Log;

import com.yonyou.protocol.LogUtil;
import com.yonyou.pushclient.PushServiceManager;
import com.yonyou.uap.um.application.ApplicationContext;

public class ECMMobileApplication extends App {
	
	/** 日志标识*/
	private final static String TAG = LogUtil.makeLogTAG(ECMMobileApplication.class);
	
	private String PUSHISOPEN = "false";
	
	@Override
	public void onCreate(){
		super.onCreate();
		//CrashHandler crashHandler = CrashHandler.getInstance();
	    //crashHandler.init(getApplicationContext());
		SharedPreferences sp = getSharedPreferences("umservice_configure", 0);
		String rs = sp.getString("ishttps", "false");
		SharedPreferences spPush = this.getSharedPreferences("NOTIFICATION", Ecm_FlashActivity.MODE_PRIVATE);
		Editor editor = spPush.edit();
		editor.putString("pushisopen", PUSHISOPEN);
		editor.commit();
		ApplicationContext.setHttps("true".equalsIgnoreCase(rs));
		
		//push
		//PushServiceManager.setDebugMode(true);
		Log.i("ECM_APPLICATION", "***********start app***********");
		PushServiceManager.setAddress("push.yyuap.com", 5000);
		PushServiceManager.init(this);
		
		//未捕获异常 捕捉
		//CrashHandler crashHandler = CrashHandler.getInstance();
		//crashHandler.init(getApplicationContext());
	}
	
	@Override
	public void onTerminate(){
		super.onTerminate();
	}

	@Override
	protected void initConfig() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void loadModules(List<Module> moduleList) {
		// TODO Auto-generated method stub
		
	}

}
