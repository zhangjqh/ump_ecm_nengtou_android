package wa.android.libs.poll;

import android.content.Context;
import android.content.Intent;
import wa.android.common.activity.SettingOptionYN;


/**
 * 这个类实现了在设置界面中的推送选项的功能
 * 
 * 
 * @author xubob
 *
 */
public class PollServiceSettingOption extends SettingOptionYN implements SettingOptionYN.SettingOptionYNListener {

	
	private Context context = null;
	public PollServiceSettingOption(Context context, String settingKey) {
		super(settingKey);
		this.context = context;
		this.setDes(context.getResources().getText(R.string.enable_poll_service).toString());
		this.setSettingOptionYNListener(this);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -4278188154206570434L;

	
	/**
	 * 当状态变化时，开始或者停止推送服务。
	 */
	@Override
	public void onSettingOptionChanged(boolean checked) {
		Intent i = new Intent(context, WAPollService.class);
		if (checked){
			context.startService(i);
		} else {
			context.stopService(i);
		}
	}
	

}
