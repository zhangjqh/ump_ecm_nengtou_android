package wa.android.task.activity;

import com.example.wamoduletaskv63.R;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;
import wa.android.common.activity.BaseActivity;

public class V63TaskTextContentActivity extends BaseActivity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		init();
	}

	private void init() {
		// TODO Auto-generated method stub
		String text = getString(R.string.fromprephase)+"<br>"+ getIntent().getStringExtra("text");
		setContentView(R.layout.v63_activity_task_textdetail);
		TextView titleTextView = (TextView) findViewById(R.id.titlePanel_titleTextView);
		titleTextView.setText(getString(R.string.note));
		Button cancelBtn = (Button) findViewById(R.id.titlePanel_backBtn);
		cancelBtn.setVisibility(View.VISIBLE);
		cancelBtn.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {

				finish();
			}
		});
		ScrollView scrollview = (ScrollView)findViewById(R.id.taskDetail_content_panel);
		WebView  webView = new WebView(this);
		webView.loadDataWithBaseURL(null, text, "text/html",  "utf-8", null);  
		scrollview.addView(webView);

	}
}
