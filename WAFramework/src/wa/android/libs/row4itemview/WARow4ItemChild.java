package wa.android.libs.row4itemview;

import wa.android.common.utils.DensityUtil;
import wa.android.libs.groupview.WARowStyle;
import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils.TruncateAt;
import android.util.TypedValue;
import android.view.Gravity;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * @author damilong
 *	动态项目RowItem单行元素构造
 */
public class WARow4ItemChild extends LinearLayout {
	
	private Context context;
	private TextView nameTextView;
	private TextView valueTextView;

	public WARow4ItemChild(Context context) {
		super(context);
		this.context = context;
		init();
	}
	
	private void init() {
		WA4ItemRowStyle rowStyle = new WA4ItemRowStyle(this.context);
		setOrientation(HORIZONTAL);
		setGravity(Gravity.CENTER_VERTICAL);
		setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
		setPadding(rowStyle.getNamePaddingLeft(),0,rowStyle.getNamePaddingRight(),0);
		
		nameTextView = new TextView(context);
		nameTextView.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
		nameTextView.setSingleLine();
		nameTextView.setEllipsize(TruncateAt.END);
		nameTextView.setGravity(Gravity.LEFT);
		nameTextView.setTextSize(TypedValue.COMPLEX_UNIT_PX, DensityUtil.dip2px(context, 17));
		
		valueTextView = new TextView(context);
		valueTextView.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
		valueTextView.setSingleLine();
		valueTextView.setEllipsize(TruncateAt.END);
		valueTextView.setGravity(Gravity.RIGHT);
		valueTextView.setTextSize(TypedValue.COMPLEX_UNIT_PX, DensityUtil.dip2px(context, 17));

		addView(nameTextView);
		addView(valueTextView);
	}
	
	public void setValue(String name, String value) {
		nameTextView.setText(name);
		valueTextView.setText(value);
	}

	
}
