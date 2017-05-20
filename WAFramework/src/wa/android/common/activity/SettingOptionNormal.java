package wa.android.common.activity;

import wa.android.common.R;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;

public class SettingOptionNormal extends SettingOptionView {

	public SettingOptionNormal() {
	}

	@Override
	public View getView(final Context context) {
		View row = LayoutInflater.from(context).inflate(R.layout.layout_view_settingoptions_normal, null);
		//
		TextView text = (TextView) row.findViewById(R.id.options_name);
		ImageView icon = (ImageView) row.findViewById(R.id.options_icon);
		//
		icon.setImageResource(getImageResID());
		text.setText(this.getDes());
		row.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
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
		});
		
		return row;
	}

}
