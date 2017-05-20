package wa.android.task.view;

import com.example.wamoduletaskv63.R;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils.TruncateAt;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import wa.android.common.utils.DensityUtil;
import wa.android.libs.groupview.WARowStyle;

public class V63TaskActionRowStyle3 extends LinearLayout {
	
	private Context context;
	private TextView nameTextView;
	private TextView valueTextView;
	private Button rowItemIcon;
	public Button getRowItemIcon() {
		return rowItemIcon;
	}

	public void setRowItemIcon(Button rowItemIcon) {
		this.rowItemIcon = rowItemIcon;
	}

	private boolean ishasIcon,issingle,isv63clicked = false;
	private String itemid;

	private int iconresID;
	
	public V63TaskActionRowStyle3(Context context,boolean ishasIcon,boolean issingle,String id) {
		super(context);
		this.context = context;
		this.ishasIcon = ishasIcon;
		this.issingle =issingle;
		this.setItemid(id);
		init();
	}
	
	public boolean isIssingle() {
		return issingle;
	}

	public void setIssingle(boolean issingle) {
		this.issingle = issingle;
	}

	private void init() {
		WA4ItemRowStyle rowStyle = new WA4ItemRowStyle(this.context);
		setOrientation(HORIZONTAL);
		setGravity(Gravity.CENTER_VERTICAL);
		setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
		//先内边距右写成固定值
		setPadding(DensityUtil.dip2px(context, 15),rowStyle.getNamePaddingLeft(),rowStyle.getNamePaddingRight(),rowStyle.getNamePaddingLeft());
		
		nameTextView = new TextView(context);
		nameTextView.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
		nameTextView.setPadding(0, rowStyle.getRowPaddingTop(),0, 0);
		nameTextView.setSingleLine();
		nameTextView.setEllipsize(TruncateAt.END);
		
		valueTextView = new TextView(context);
		valueTextView.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
		nameTextView.setGravity(Gravity.LEFT);
		nameTextView.setPadding(DensityUtil.dip2px(context, 15), 0, 0, 0);
		nameTextView.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 15);
		
		nameTextView.setSingleLine();

		valueTextView.setGravity(Gravity.RIGHT);
		valueTextView.setPadding(rowStyle.getNamePaddingLeft(),0,0,0);
		valueTextView.setVisibility(View.GONE);
		rowItemIcon = new Button(context);
		int width = ((WindowManager) context.getSystemService(Context.WINDOW_SERVICE)).getDefaultDisplay().getWidth();
		if(width>720&&width!=800){
			rowItemIcon.setLayoutParams(new LayoutParams(60, 60));
		}else if(width==800){
			rowItemIcon.setLayoutParams(new LayoutParams(DensityUtil.dip2px(context, 30), DensityUtil.dip2px(context, 30)));
		}else {
			rowItemIcon.setLayoutParams(new LayoutParams(DensityUtil.dip2px(context, 22), DensityUtil.dip2px(context, 22)));
		}
			if(issingle){
			rowItemIcon.setBackgroundResource(R.drawable.checkbox_nselect);
			}else{
				rowItemIcon.setBackgroundResource(R.drawable.checkbox_nselect);
			}
//		rowItemIcon.setOnClickListener(new OnClickListener() {
//			
//			@Override
//			public void onClick(View v) {
//				// TODO Auto-generated method stub
//				if(isclicked){
//					if(issingle){
//						rowItemIcon.setBackgroundResource(R.drawable.squareunselect);
//					}else{
//						rowItemIcon.setBackgroundResource(R.drawable.unselectbtn);
//					}
//					isclicked = false;
//				}else{
//					if(issingle){
//						rowItemIcon.setBackgroundResource(R.drawable.squareselect);
//					}else{
//						rowItemIcon.setBackgroundResource(R.drawable.selectbtn);
//					}
//					isclicked = true;
//					}
//				
//			}
//		});
		addView(rowItemIcon);
		addView(nameTextView);

		addView(valueTextView);
	}
	
	public void setValue(String name, String value) {
		nameTextView.setText(name);
		valueTextView.setText(value);
//		if (clicklistner == null){
//			valueTextView.setVisibility(View.GONE);
//		}
	}

	public String getItemid() {
		return itemid;
	}

	public void setItemid(String itemid) {
		this.itemid = itemid;
	}

	public boolean isIsv63clicked() {
		return isv63clicked;
	}

	public void setIsv63clicked(boolean isv63clicked) {
		this.isv63clicked = isv63clicked;
	}
}
