package wa.android.common.activity;

import wa.android.common.AppConfig;
import wa.android.constants.CommonWAIntents;
import android.content.Intent;
import android.os.Bundle;

public class WelcomeActivity extends BaseActivity{
	private static final int EVENT_FUNCTION = 1;
	private static final int EVENT_START = 3;
	private static final int EVENT_END = 4;
	
	private int runMode = EVENT_START;
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		runMode = EVENT_START;
	}
	
	public void onResume(){
		super.onResume();
		switch(runMode) {
		case EVENT_FUNCTION:
			break;
		case EVENT_START:
			runMode = EVENT_END;
			Intent start = new Intent(this, WelcomeActivity1.class);
			this.startActivity(start);
			break;
		default:
			this.finish();
			break;
		}
		runMode = EVENT_END;
	}
	
	
	@Override
	public void onNewIntent(Intent intent){
		runMode = EVENT_FUNCTION;
		//已运行时接收消息并处理
		super.onNewIntent(intent);
		String msgID = intent.getAction();
		if ("logout".equals(msgID) || "saveconfig".equals(msgID)) {
			Intent i = CommonWAIntents.getLOGIN_ACTIVITY(this , AppConfig.getAPP_VERSION());
//			Intent i = new Intent(this, LoginActivity.class);
			this.startActivity(i);
		}
	}
	
	public boolean isSystemActivity(){
		return true;
	}
	
	public boolean isEscapeActivity(){
		return true;
	}
}
