package wa.android.libs.actionsendview;

import wa.android.common.R;
import wa.android.libs.detailview.WADetailView;
import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;

public class WAAtionSendRow extends LinearLayout{
	

	public WAAtionSendRow (Context context ,ActionType type){
		super(context);
		this.context = context;
		this.type = type;
		init();
	}
	private void init() {
		// TODO Auto-generated method stub
		setOrientation(VERTICAL);
		setPadding(0, WADetailView.GROUP_PADDING_TOP, 0, WADetailView.GROUP_PADDING_BOTTOM);
		TextView textView= new TextView(context);
	
//		textView.setLayoutParams(getLayoutParams());
		switch (type) {
		case MAIL:
			textView = new TextView(context);
			textView.setText("发邮件");
			textView.setBackgroundResource(R.drawable.actionsend_red);
			break;
		case PHONE:
			textView = new TextView(context);	
			textView.setText("打电话");
			textView.setBackgroundResource(R.drawable.actionsend_red);
			break;
		case MESSAGE:
			textView = new TextView(context);	
			textView.setText("发短信");
			break;
		case WEBADDRESS:
			textView = new TextView(context);
			textView.setText("打开网址");
			textView.setBackgroundResource(R.drawable.actionsend_red);
			break;
		default:
			break;
		}
		addView(textView);
		
	}
	private ActionType type;
	private Context context;
	public static enum ActionType {
		MAIL, 
		PHONE, 
		MESSAGE, 
		WEBADDRESS,}
	
	

}
