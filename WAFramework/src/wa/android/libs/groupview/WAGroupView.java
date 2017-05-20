package wa.android.libs.groupview;

import wa.android.common.R;
import wa.android.common.utils.DensityUtil;
import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.LinearLayout.LayoutParams;

/**
 * WADetailView中的组
 * 
 * @author Omi
 * 
 */
public class WAGroupView extends LinearLayout {

	private Context context;
	private TextView titleView;
	private View previousView;
	private int size;

	private static final int TEXT_SIZE_TITLE_W480 = 14;
	private static final int TEXT_SIZE_TITLE_W720 = 18;

	private static int TEXT_SIZE_TITLE = TEXT_SIZE_TITLE_W480;
	
	
	public WAGroupView(Context context) {
		super(context);
		this.context = context;
		initial();
	}

	public WAGroupView(Context context, AttributeSet attrs) {
		super(context, attrs);
		this.context = context;
		initial();
	}

	private void initial() {
		//setBackgroundResource(R.drawable.wadetail_group_background);
		setOrientation(VERTICAL);
		LayoutParams params = new LayoutParams(LayoutParams.FILL_PARENT, LayoutParams.WRAP_CONTENT);
		params.setMargins(WAPanelView.GROUP_MARGIN_LEFT, WAPanelView.GROUP_MARGIN_TOP, WAPanelView.GROUP_MARGIN_RIGHT, WAPanelView.GROUP_MARGIN_BOTTOM);
		setLayoutParams(params);
		//setPadding(2, 2, 2, 2);
		titleView = new TextView(context);
		titleView.setVisibility(GONE);
		titleView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 14);
		titleView.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, DensityUtil.dip2px(context, 26)));
		titleView.setPadding(DensityUtil.dip2px(context, 15), 0, DensityUtil.dip2px(context, 15), 0);
	}
	
	public String getTitle() {
		if (titleView != null) {
			return titleView.getText().toString();
		} else {
			return null;
		}
	}

	public void setTitle(String title) {
		titleView.setText(title);
		if (title != null && !"".equalsIgnoreCase(title)) {
			titleView.setVisibility(VISIBLE);
		} else {
			titleView.setVisibility(GONE);
		}
	}

	public TextView getTitleView() {
		return titleView;
	}

	/**
	 * 由上到下，顺序添加行
	 * 
	 * @param row
	 */
	public void addRow(View row) {
		row.setClickable(true);
		if(size == 0) {
			//row.setBackgroundResource(R.drawable.common_row_single_bg);
			row.setBackgroundResource(R.drawable.oaadl_44_one);
		} else {
			//row.setBackgroundResource(R.drawable.common_row_bottom_bg);
			row.setBackgroundResource(R.drawable.oaadl_44_down);
		}
		if(size == 1) {
			//previousView.setBackgroundResource(R.drawable.common_row_top_bg);
			//addRowSeparator();
			previousView.setBackgroundResource(R.drawable.oaadl_44_top);
		}
		if(size > 1) {
			//previousView.setBackgroundResource(R.drawable.common_row_mid_bg);
			//addRowSeparator();
			previousView.setBackgroundResource(R.drawable.oaadl_44_mid);
		}
		addView(row);
		previousView = row;
		size++;
	}

	/**
	 * 增加列之间的分割线
	 */
	private void addRowSeparator() {
		View child = new View(context);
		LinearLayout.LayoutParams params =new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.MATCH_PARENT);
		child.setLayoutParams(params);
		child.setBackgroundResource(R.drawable.wadetail_row_separator);
		addView(child);
	}
}
