package wa.android.libs.groupview;

import wa.android.common.utils.DensityUtil;
import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils.TruncateAt;
import android.util.TypedValue;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.LinearLayout.LayoutParams;

public class WARow4NameValue extends LinearLayout {

	private Context context;
	private TextView nameTextView;
	private TextView valueTextView;

	public WARow4NameValue(Context context) {
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

		nameTextView = new TextView(context);
		nameTextView.setLayoutParams(new LayoutParams(DensityUtil.dip2px(context, 125),
				LayoutParams.MATCH_PARENT));
		//nameTextView.setPadding(DensityUtil.dip2px(context, 15), 0, DensityUtil.dip2px(context, 15), 0);
		nameTextView.setSingleLine();
		nameTextView.setEllipsize(TruncateAt.END);
		nameTextView.setGravity(Gravity.LEFT|Gravity.CENTER_VERTICAL);
		//nameTextView.setGravity(Gravity.CENTER_VERTICAL);
		nameTextView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 16);
		nameTextView.setTextColor(Color.rgb(0, 0, 0));

		valueTextView = new TextView(context);
		LinearLayout.LayoutParams params = new LayoutParams(0, LayoutParams.MATCH_PARENT);
		params.weight = 1;
		valueTextView.setLayoutParams(params);
		//valueTextView.setMaxLines(1);
		//valueTextView.setPadding(0, 0, DensityUtil.dip2px(context, 15), 0);
		valueTextView.setSingleLine();
		valueTextView.setEllipsize(TruncateAt.END);
		valueTextView.setGravity(Gravity.RIGHT|Gravity.CENTER_VERTICAL);
		//valueTextView.setGravity(Gravity.CENTER_VERTICAL);
		valueTextView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 16);
		valueTextView.setTextColor(Color.rgb(142, 142, 147));

		addView(nameTextView);
		addView(valueTextView);
	}

	public void setValue(String name, String value) {
		nameTextView.setText(name);
		valueTextView.setText(value);
	}

	private class ValueText extends TextView {

		public ValueText(Context context) {
			super(context);
		}

		@Override
		protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
			super.onMeasure(widthMeasureSpec, heightMeasureSpec);
			if (getLineCount() == 2) {
				if (getTextSize() != 12) {
					this.setTextSize(12);
					super.onMeasure(widthMeasureSpec, heightMeasureSpec);
					
				}
			}
		}
//		@Override
//		protected void onLayout(boolean changed, int left, int top, int right,
//				int bottom) {
//			super.onLayout(changed, left, top, right, bottom);
//			if (getLineCount() == 2) {
//				if (getTextSize() != 12) {
//					this.setTextSize(12);
//					requestLayout();
//				}
//			}
//		}

	}

}
