package nc.bs.oa.oama.ecm.feedback;

import com.yonyou.ma.platform.modul.feedback.MaFeedbackAgent;

import android.os.Bundle;
import android.app.Activity;
import android.app.ProgressDialog;
import android.view.Menu;

public class FeedBackMainActivity extends Activity {
	
	static final String AppKey = "A0A000.nc.yonyou.com";
	
	private ProgressDialog progressDlg;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		progressDlg = new ProgressDialog(this);
		progressDlg.setMessage("");
		progressDlg.setCancelable(false);
		progressDlg.show();
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_feed_back_main);
		MaFeedbackAgent.setAppKey(AppKey);
		// 设置备注信息
		MaFeedbackAgent.setMemo("ECM问题反馈");
		MaFeedbackAgent.openFeedbackListActivity(FeedBackMainActivity.this,true);
		progressDlg.dismiss();
		finish();
	}
	
	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		MaFeedbackAgent.onShakeResume(FeedBackMainActivity.this);
		super.onResume();
	}
	
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		MaFeedbackAgent.onShakePause(FeedBackMainActivity.this);
		super.onPause();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.feed_back_main, menu);
		return true;
	}

}
