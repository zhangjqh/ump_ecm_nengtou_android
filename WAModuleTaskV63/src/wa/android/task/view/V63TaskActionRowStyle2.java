package wa.android.task.view;

import wa.android.common.utils.DensityUtil;
import wa.android.libs.groupview.WAPanelView;

import com.example.wamoduletaskv63.R;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.text.TextUtils.TruncateAt;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.LinearLayout.LayoutParams;

public class V63TaskActionRowStyle2 extends LinearLayout {
	
	private Context context;
	private Button singleBtn;
	private Button multipleBtn;
	private boolean ismultiple = true,isbefore = false;
	public boolean isIsmultiple() {
		return ismultiple;
	}

	public void setIsmultiple(boolean ismultiple) {
		this.ismultiple = ismultiple;
	}

	public V63TaskActionRowStyle2(Context context,boolean isbefore) {
		super(context);
		this.context = context;
		this.setIsbefore(isbefore);
		init();
	}
	
	private void init() {
		WA4ItemRowStyle rowStyle = new WA4ItemRowStyle(this.context);
		setOrientation(HORIZONTAL);
		setGravity(Gravity.CENTER_VERTICAL);
		LayoutParams params = new LayoutParams(LayoutParams.MATCH_PARENT, DensityUtil.dip2px(context, 44));
		params.setMargins(WAPanelView.GROUP_MARGIN_LEFT, WAPanelView.GROUP_MARGIN_TOP, WAPanelView.GROUP_MARGIN_RIGHT, WAPanelView.GROUP_MARGIN_BOTTOM);
		setLayoutParams(params);
		int width = ((WindowManager) context.getSystemService(Context.WINDOW_SERVICE)).getDefaultDisplay().getWidth();
		setPadding(DensityUtil.dip2px(context, 15),0,rowStyle.getNamePaddingRight(),0);
		setBackgroundColor(Color.WHITE);
		
		//新加流程标题
		TextView titleView = new TextView(context);
		titleView.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT,LayoutParams.WRAP_CONTENT));
		titleView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 16);
		titleView.setText("流程方式");
		titleView.setTextColor(Color.rgb(0, 0, 0));
		titleView.setEllipsize(TruncateAt.END);
		addView(titleView);
		
		LinearLayout linearLayout  = new LinearLayout(context);
		linearLayout.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT,LayoutParams.WRAP_CONTENT,1));
		linearLayout.setOrientation(HORIZONTAL);
		linearLayout.setGravity(Gravity.CENTER|Gravity.RIGHT);
		singleBtn = new Button(context);
		singleBtn.setLayoutParams(new LayoutParams(DensityUtil.dip2px(context, 60), LayoutParams.WRAP_CONTENT));
//		singleBtn.setPadding(0, rowStyle.getRowPaddingTop(),0, 0);
		singleBtn.setBackgroundResource(R.drawable.label_2_left);
		singleBtn.setTextColor(Color.RED);
		singleBtn.setPadding(0, DensityUtil.dip2px(context, 0.5f), 0, 0);
		multipleBtn = new Button(context);
		multipleBtn.setLayoutParams(new LayoutParams(DensityUtil.dip2px(context, 60), LayoutParams.WRAP_CONTENT));
//		multipleBtn.setPadding(0, 0, 0, 0);
//		multipleBtn.setPadding(360,0,rowStyle.getNamePaddingRight(),0);
//		singleBtn.setGravity(Gravity.LEFT);
//		singleBtn.setTextSize(TypedValue.COMPLEX_UNIT_PX, rowStyle.getValueTextSize());
//
//		multipleBtn.setGravity(Gravity.RIGHT);
		multipleBtn.setBackgroundResource(R.drawable.label_2_right_touch);
		multipleBtn.setTextColor(Color.WHITE);
		multipleBtn.setPadding(0, DensityUtil.dip2px(context, 0.5f), 0, 0);
	
		multipleBtn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(!ismultiple){
					ismultiple = true;
					singleBtn.setBackgroundResource(R.drawable.label_2_left);
					singleBtn.setTextColor(Color.RED);
					multipleBtn.setBackgroundResource(R.drawable.label_2_right_touch);
					multipleBtn.setTextColor(Color.WHITE);
				}
			}
		});
		singleBtn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(ismultiple){
					ismultiple = false;
					multipleBtn.setBackgroundResource(R.drawable.label_2_right);
					multipleBtn.setTextColor(Color.RED);
					singleBtn.setBackgroundResource(R.drawable.label_2_left_touch);
					singleBtn.setTextColor(Color.WHITE);
				}
			}
		});
		linearLayout.addView(singleBtn);
		linearLayout.addView(multipleBtn);
		
		addView(linearLayout);
		
	}
	
	public void setValue(String btnname1, String btnname2) {
		singleBtn.setText(btnname1);
		multipleBtn.setText(btnname2);
		
	}

	public boolean isIsbefore() {
		return isbefore;
	}

	public void setIsbefore(boolean isbefore) {
		this.isbefore = isbefore;
	}

	
}