package wa.android.libs.groupview;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class WARow4Text extends LinearLayout {

	private Context context;
	private TextView titleTextView;
	private TextView textTextView;
	
	public WARow4Text(Context context) {
		super(context);
		this.context = context;
		init();
	}
	
	private void init() {
		setOrientation(LinearLayout.VERTICAL);
		WARowStyle rowStyle = new WARowStyle(context);
		setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
		setPadding(rowStyle.getRowPaddingLeft(),
					rowStyle.getRowPaddingTop(),
					rowStyle.getRowPaddingRight(),
					rowStyle.getRowPaddingBottom());
		//标题设置
		titleTextView = new TextView(context);
		titleTextView.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
		titleTextView.setVisibility(View.GONE);
		//文本设置
		textTextView = new TextView(context);
		textTextView.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
		textTextView.setMinLines(10);
		addView(titleTextView);
		addView(textTextView);
	}
	
	public void setTextMaxLines(int lines) {
		textTextView.setMaxLines(lines);
	}

	public void setValue(String title, String text) {
		if(title != null) {
			titleTextView.setVisibility(View.VISIBLE);
			titleTextView.setText(title);
		}
		textTextView.setText(text);
	}
}
