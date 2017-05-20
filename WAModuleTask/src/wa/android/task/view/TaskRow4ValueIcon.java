package wa.android.task.view;

import wa.android.app.task.R;
import wa.android.common.utils.DensityUtil;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils.TruncateAt;
import android.util.TypedValue;
import android.view.Gravity;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class TaskRow4ValueIcon extends LinearLayout {

	private Context context;
	private ImageView iconImageView;
	private TextView valueTextView , nameTextView;
	
	public TaskRow4ValueIcon(Context context) {
		super(context);
		this.context = context;
		init();
	}
	
	private void init() {
		setOrientation(HORIZONTAL);
		setGravity(Gravity.CENTER_VERTICAL);
		setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT,
				DensityUtil.dip2px(context, 44)));
		setPadding(DensityUtil.dip2px(context, 15), 0, DensityUtil.dip2px(context, 15), 0);
		
		iconImageView = new ImageView(context);
		iconImageView.setLayoutParams(new LayoutParams(DensityUtil.dip2px(context, 8), DensityUtil.dip2px(context, 13)));
		iconImageView.setBackgroundResource(R.drawable.wadetail_row_array);
		
		nameTextView = new TextView(context);
		nameTextView.setLayoutParams(new LayoutParams(DensityUtil.dip2px(context, 85),
				LayoutParams.MATCH_PARENT));
		//nameTextView.setPadding(rowStyle.getNamePaddingLeft(), 0, rowStyle.getNamePaddingRight(), 0);
		nameTextView.setSingleLine();
		nameTextView.setEllipsize(TruncateAt.END);
		nameTextView.setGravity(Gravity.LEFT|Gravity.CENTER_VERTICAL);
		nameTextView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 16);
		nameTextView.setTextColor(Color.rgb(0, 0, 0));
		
		valueTextView = new TextView(context);
		LinearLayout.LayoutParams params = new LayoutParams(0, LayoutParams.MATCH_PARENT);
		params.weight = 1;
		valueTextView.setLayoutParams(params);
		valueTextView.setSingleLine();
		valueTextView.setEllipsize(TruncateAt.END);
		valueTextView.setGravity(Gravity.RIGHT|Gravity.CENTER_VERTICAL);
		valueTextView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 16);
		valueTextView.setTextColor(Color.rgb(142, 142, 147));
		addView(nameTextView);
		addView(valueTextView);
		addView(iconImageView);
	}
	
	public void setValue(String name , String value) {
		nameTextView.setText(name);
		valueTextView.setText(value);
	}
	
	public void setIcon(int resId) {
		iconImageView.setBackgroundResource(resId);
	}

}
