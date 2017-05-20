package wa.android.libs.poll;

import wa.android.common.App;
import wa.android.common.activity.BaseActivity;
import wa.android.common.activity.WelcomeActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

/**
 * 
 * 这个Activity是Push处理时的过渡
 * 在应用程序未启动时，这个类启动之后会启动WelcomeActivity并将自己关闭
 * 在应用程序已启动时，这个类启动之后会根据目前的登录状态做一些处理后将自己关闭
 * 
 * 这个类基本不会在界面中停留。onCreate方法中会直接调用finish
 * 
 * @author xubob
 *
 */
public class NotificationActivity extends BaseActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Intent i = this.getIntent();
		
		System.out.println(i.getStringExtra("mnc"));
		
		App application = (App)this.getApplication();
		application.intentServiceStart = i;
		if (application.isRunning()) {
			Log.d("NotificationActivity", "Running");
			if (application.isLogin()) {
				Log.d("NotificationActivity", "Loged in");
				this.finish();
				application.processNotification(application.getTopActivity());
			} else {
				Log.d("NotificationActivity", "Not Loged in");
				this.finish();
			}
		} else {
			Log.d("NotificationActivity", "Not Running");
			Intent welcome = new Intent(this, WelcomeActivity.class);
			this.startActivity(welcome);
			this.finish();
		}
	}
	
	public boolean isSystemActivity(){
		return true;
	}
	
	public boolean isEscapeActivity(){
		return true;
	}
}
