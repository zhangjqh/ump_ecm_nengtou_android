package wa.android.task.view;

import com.example.wamoduletaskv63.R;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils.TruncateAt;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import wa.android.libs.groupview.WARowStyle;

public class V63TaskActionRowStyle4 extends LinearLayout {
	
	private Context context;
	private TextView nameTextView;
	private TextView valueTextView;
	private Button rowItemIcon;
	private boolean ishasIcon,issingle,isselected = false;
	private String itemid;


	public boolean isIsselected() {
		return isselected;
	}

	public void setIsselected(boolean isselected) {
		this.isselected = isselected;
	}

	private int iconresID;
	
	public V63TaskActionRowStyle4(Context context,boolean ishasIcon,boolean issingle,String id) {
		super(context);
		this.context = context;
		this.ishasIcon = ishasIcon;
		this.issingle =issingle;
		this.setItemid(id);
		init();
	}
	
	private void init() {
		WA4ItemRowStyle rowStyle = new WA4ItemRowStyle(this.context);
		setOrientation(HORIZONTAL);
		setGravity(Gravity.CENTER_VERTICAL);
		setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
		setPadding(rowStyle.getNamePaddingLeft(),rowStyle.getNamePaddingLeft(),rowStyle.getNamePaddingRight(),rowStyle.getNamePaddingLeft());
		
		nameTextView = new TextView(context);
		nameTextView.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
		nameTextView.setPadding(0, rowStyle.getRowPaddingTop(),0, 0);
		nameTextView.setSingleLine();
		nameTextView.setEllipsize(TruncateAt.END);
		
		valueTextView = new TextView(context);
		valueTextView.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
		nameTextView.setGravity(Gravity.LEFT);
		nameTextView.setTextSize(TypedValue.COMPLEX_UNIT_PX, rowStyle.getValueTextSize());
		
		nameTextView.setSingleLine();

		valueTextView.setGravity(Gravity.RIGHT);
		valueTextView.setPadding(rowStyle.getNamePaddingLeft(),0,0,0);
		rowItemIcon = new Button(context);
		rowItemIcon.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
		if(ishasIcon){
			if(issingle){
			rowItemIcon.setBackgroundResource(R.drawable.squareunselect);
			}else{
				rowItemIcon.setBackgroundResource(R.drawable.unselectbtn);
			}
		}
		else{
			rowItemIcon.setBackgroundResource(R.drawable.pen);
			rowItemIcon.setVisibility(View.INVISIBLE);
		}
		rowItemIcon.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(isselected){
					if(issingle){
						rowItemIcon.setBackgroundResource(R.drawable.squareunselect);
					}else{
						rowItemIcon.setBackgroundResource(R.drawable.unselectbtn);
					}
					isselected = false;
				}else{
					if(issingle){
						rowItemIcon.setBackgroundResource(R.drawable.squareselect);
					}else{
						rowItemIcon.setBackgroundResource(R.drawable.selectbtn);
					}
					isselected = true;
					}
				
			}
		});
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
}
