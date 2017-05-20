package nc.bs.oa.oama.push;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Display;
import android.view.Window;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.widget.EditText;
import android.widget.TextView;

/**
 * 显示普通的通知（无Extra）
 * @author lixkb
 * @date 2015-7-20下午3:07:18
 */
public class AlertNotifyActivity extends Activity{
	
	private TextView notifyTitleTv;
	private EditText messageTv;
	
	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		//点击 阴影 部分 不可关闭此activity
		setFinishOnTouchOutside(false);
		setContentView(R.layout.alertnotify_alert_dialog);
		
		//设计对话框的 宽高
		WindowManager wm = getWindowManager();
		Display display  = wm.getDefaultDisplay();
		android.view.WindowManager.LayoutParams p = getWindow().getAttributes();
		p.width = (int) (display.getWidth()*0.95);//设置宽度 为屏幕宽度的0.8
		//p.height = (int) (display.getHeight()*0.3);
		getWindow().setAttributes(p);
		init();
	}

	private void init() {
		Intent mIntent = getIntent();
		String title = mIntent.getStringExtra("nTitle");
		String message = mIntent.getStringExtra("nContent");
		
		notifyTitleTv = (TextView) findViewById(R.id.notify_alertTitle);
		messageTv = (EditText) findViewById(R.id.notify_message);
		notifyTitleTv.setText(title);
		messageTv.setText(message);
		
	}

}
