package wa.android.common.activity;

import android.content.Context;
import android.view.View;

public abstract class SettingOptionView extends SettingOption {
	
	public SettingOptionView() {
	}
	public abstract View getView(Context context);
}
