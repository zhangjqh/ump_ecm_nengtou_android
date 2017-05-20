package wa.android.common.activity;

import wa.android.common.R;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class SettingOptionLogout extends SettingOptionView {

	public SettingOptionLogout(Context context) {
	}

	@Override
	public View getView(final Context context) {
		Button button = new Button(context);
		button.setTextSize(context.getResources().getDisplayMetrics().density*18);
		button.setBackgroundResource(R.drawable.framwork_logout_s);
		button.setText("退出登录");
		button.setTextColor(0xffffffff);
		button.setTextSize(20);
		
		button.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				AlertDialog.Builder builder = new AlertDialog.Builder(context);
				builder.setTitle("退出登录")
				.setMessage("是否退出登录？")
				.setPositiveButton("确定", new DialogInterface.OnClickListener(){

					@Override
					public void onClick(DialogInterface dialog, int which) {
						Class<?> clazz = getTriggerClazz();
						if(clazz != null){
							final Intent i = new Intent(context, clazz);
							if(clazz == SetConnectionActivity.class) {
								new AlertDialog.Builder(context)
								.setTitle(R.string.tip)
								.setMessage(R.string.isModifyConnection)
								.setPositiveButton(R.string.submit, new DialogInterface.OnClickListener() {
									@Override
									public void onClick(DialogInterface dialog, int which) {
										context.startActivity(i);
									}
								})
								.setNegativeButton(R.string.cancel, null).show();
							} else {
								context.startActivity(i);
							}
						}
						
					}
					
				}).setNegativeButton("取消",null).show();
				
			}
		});
		return button;
	}

}
