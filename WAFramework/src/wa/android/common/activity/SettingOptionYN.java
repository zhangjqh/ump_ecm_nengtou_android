package wa.android.common.activity;

import java.io.Serializable;
import wa.android.common.utils.PreferencesUtil;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.CompoundButton.OnCheckedChangeListener;

public class SettingOptionYN extends SettingOptionView implements Serializable, OnCheckedChangeListener{
	private static final long serialVersionUID = 2L;
	private String settingKey = null;
	private CheckBox checkbox = null;
	private SettingOptionYNListener listener = null;
	private Context context;
	public void setSettingOptionYNListener(SettingOptionYNListener listener){
		this.listener = listener;
	}
	public SettingOptionYN(String settingKey){
		this.settingKey = settingKey;
	}
	@Override
	public View getView(Context context){
		this.context = context;
		LayoutInflater inflater = LayoutInflater.from(context);
		View view = inflater.inflate(wa.android.common.R.layout.layout_setting_option_yn, null, true);
		//初始化选择框
		checkbox = (CheckBox)view.findViewById(wa.android.common.R.id.setting_option_yn_checkbox);
		String value = PreferencesUtil.readPreference(context, settingKey);
		if (value.equals("")) {
			checkbox.setChecked(true);
		} else {
			checkbox.setChecked("true".equals(value));
		}
		checkbox.setOnCheckedChangeListener(this);

		//初始化文本框
		TextView tv = (TextView)view.findViewById(wa.android.common.R.id.setting_option_yn_text);
		tv.setText(getDes());
		
		return view;
	}


	@Override
	public void onCheckedChanged(CompoundButton buttonView,
			boolean isChecked) {
		if (buttonView == checkbox) {
			PreferencesUtil.writePreference(context, settingKey, String.valueOf(isChecked));
			if (listener != null) {
				listener.onSettingOptionChanged(isChecked);
			}
		}
	}
	public interface SettingOptionYNListener{
		public void onSettingOptionChanged(boolean checked);
	}
}
	

