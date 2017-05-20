package wa.android.libs.poll;

import wa.android.common.App;
import wa.android.common.activity.BaseActivity;
import android.os.Handler;
import android.os.Message;

/**
 * 这个类是通用的用于处理推送消息的类
 * 在应用程序的首个Activity中构造这个对象
 * 
 * @author xubob
 *
 */

public class PollHandler extends Handler{
	private BaseActivity context = null;
	public static final int MSG_POLL_OK = 1;
	public PollHandler(BaseActivity context) {
		this.context = context;
	}
	
	@Override
	public void handleMessage(Message msg) {
		super.handleMessage(msg);
		switch(msg.what) {
		case MSG_POLL_OK:
			App application = (App)context.getApplication();
			application.processNotification(context);
			break;
		}

	}
}
