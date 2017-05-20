package wa.android.common;

import wa.android.common.activity.BaseActivity;
import android.content.Intent;

public interface NotificationProcessor{
	public void processNotificationIntent(Intent intent,  BaseActivity context);
}
