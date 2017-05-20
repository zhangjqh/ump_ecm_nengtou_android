package wa.android.libs.groupview;

import wa.android.common.R;
import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.Gravity;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class WARow4ValueIcon extends LinearLayout {

	private Context context;
	private ImageView iconImageView;
	private TextView valueTextView;
	
	public WARow4ValueIcon(Context context) {
		super(context);
		this.context = context;
		init();
	}
	
	private void init() {
		setOrientation(HORIZONTAL);
		setGravity(Gravity.CENTER_VERTICAL);
		setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
		WARowStyle rowStyle = new WARowStyle(context);
		setPadding(rowStyle.getRowPaddingLeft(),
					rowStyle.getRowPaddingTop(),
					rowStyle.getRowPaddingRight(),
					rowStyle.getRowPaddingBottom());
		
		iconImageView = new ImageView(context);
		iconImageView.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
		iconImageView.setBackgroundResource(R.drawable.wadetail_row_array);
		
		valueTextView = new TextView(context);
		LinearLayout.LayoutParams params = new LayoutParams(0, LayoutParams.WRAP_CONTENT);
		params.weight = 1;
		valueTextView.setLayoutParams(params);
		valueTextView.setTextColor(Color.BLACK);
		valueTextView.setTextSize(TypedValue.COMPLEX_UNIT_PX, rowStyle.getValueTextSize());
		
		addView(valueTextView);
		addView(iconImageView);
	}
	
	public void setValue(String value) {
		valueTextView.setText(value);
	}
	
	public void setIcon(int resId) {
		iconImageView.setBackgroundResource(resId);
	}

}
