package wa.android.libs.groupview;

import wa.android.common.R;
import wa.android.common.utils.DensityUtil;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils.TruncateAt;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

@SuppressLint("ViewConstructor")
public class WARow4NameValueIcon extends LinearLayout {

	public static enum NameValueIconRowType {
		/**
		 * 移动电话
		 */
		NAME_C_VALUE_ICON_MOBILE,
		
		/**
		 * 图定电话
		 */
		NAME_C_VALUE_ICON_TEL,
		
		/**
		 * 电子邮件
		 */
		NAME_C_VALUE_ICON_MAIL, 
		
	}
	private Context context;
	private ImageView iconImageView;
	private TextView valueTextView;
	private TextView nameTextView;
	private NameValueIconRowType type;
	private String value;
	
	public WARow4NameValueIcon(Context context, NameValueIconRowType type) {
		super(context);
		this.context = context;
		this.type = type;
		init();
	}
	
	private void init() {
		setOrientation(HORIZONTAL);
		setGravity(Gravity.CENTER_VERTICAL);
		setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, DensityUtil.dip2px(context, 44)));
		WARowStyle rowStyle = new WARowStyle(context);
		setPadding(DensityUtil.dip2px(context, 15), 0, DensityUtil.dip2px(context, 15), 0);
		
		nameTextView = new TextView(context);
		nameTextView.setLayoutParams(new LayoutParams(DensityUtil.dip2px(context, 85), LayoutParams.MATCH_PARENT));
		//nameTextView.setPadding(rowStyle.getNamePaddingLeft(), 0, rowStyle.getNamePaddingRight(), 0);
		nameTextView.setSingleLine();
		nameTextView.setEllipsize(TruncateAt.END);
		nameTextView.setGravity(Gravity.LEFT|Gravity.CENTER_VERTICAL);
		nameTextView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 16);
		nameTextView.setTextColor(Color.rgb(0, 0, 0));
		
		valueTextView = new TextView(context);
		LinearLayout.LayoutParams params = new LayoutParams(0, LayoutParams.WRAP_CONTENT);
		params.weight = 1;
		params.rightMargin = DensityUtil.dip2px(context, 5);
		valueTextView.setLayoutParams(params);
		valueTextView.setSingleLine();
		valueTextView.setEllipsize(TruncateAt.END);
		valueTextView.setGravity(Gravity.RIGHT|Gravity.CENTER_VERTICAL);
		valueTextView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 16);
		valueTextView.setTextColor(Color.rgb(142, 142, 147));
		
		iconImageView = new ImageView(context);
		iconImageView.setLayoutParams(new LayoutParams(DensityUtil.dip2px(context, 44), DensityUtil.dip2px(context, 44)));
		
		addView(nameTextView);
		addView(valueTextView);
		addView(iconImageView);
	}
	
	public void setValue(String name, String value) {
		this.value = value;
		nameTextView.setText(name + ":");
		valueTextView.setText(value);
	}
	
	public void setIcon(int resId) {
		iconImageView.setBackgroundResource(resId);
	}
	
	@Override
	protected void onAttachedToWindow() {
		super.onAttachedToWindow();
		confirm();
	}
	
	private void confirm() {
		if(type != null)
			switch(type){
			case NAME_C_VALUE_ICON_MOBILE:
				iconImageView.setImageResource(R.drawable.wadetail_row_mobile);
				if(value != null && value.trim().length() > 0)
					setOnClickListener(new OnClickListener() {
						@Override
						public void onClick(View v) {
							OnIconClickedActions.onMobileIconClicked(context, value);
						}
					});
				break;
			case NAME_C_VALUE_ICON_TEL:
				iconImageView.setImageResource(R.drawable.wadetail_row_tel);
				if(value != null && value.trim().length() > 0)
					setOnClickListener(new OnClickListener() {
						@Override
						public void onClick(View v) {
							OnIconClickedActions.onTelIconClicked(context, value);
						}
					});
				break;
			case NAME_C_VALUE_ICON_MAIL:
				iconImageView.setImageResource(R.drawable.wadetail_row_email);
				if(value != null && value.trim().length() > 0)
					setOnClickListener(new OnClickListener() {
						@Override
						public void onClick(View v) {
							OnIconClickedActions.onMailIconClicked(context, value);
						}
					});
				break;
			default:
				break;
			}
		else 
			iconImageView.setBackgroundResource(R.drawable.wadetail_row_array);
	}
}
