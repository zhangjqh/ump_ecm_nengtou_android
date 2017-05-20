package wa.android.libs.poll.receiver;

import wa.android.libs.poll.WAPollService;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/**
 * 
 * 这个类需要注册到AndroidManifest中，监听开机的事件。
 * 
 * @author xubob
 *
 */
public class RStart extends BroadcastReceiver {
	

	@Override
	public void onReceive(Context context, Intent intent) {
		Intent i = new Intent(context, WAPollService.class);
		context.startService(i);
	}

}
