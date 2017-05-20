package wa.android.task.activity;

import wa.android.app.task.R;
import wa.android.common.activity.BaseActivity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

public class TaskAttachmentDetailActivity extends BaseActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_task_attachmentdetail);
		String attachment = getIntent().getStringExtra("attachment");
		String filename = getIntent().getStringExtra("filename");
		initTitleView(filename);
		updateView(attachment);
	}
	
	/**
	 * 初始化导航界面
	 */
	private void initTitleView(String titleName) {
		//设置头部信息
		TextView titleTextView = (TextView)findViewById(R.id.titlePanel_titleTextView);
		titleTextView.setText(titleName);
		//头部返回按钮的设置
		Button backButton = (Button)findViewById(R.id.titlePanel_backBtn);
		backButton.setVisibility(View.VISIBLE);
		backButton.setBackgroundResource(R.drawable.common_button_title_back);
		backButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				finish();
			}
		});
	}

	/**
	 * 填充附件view
	 * @param attachment
	 */
	private void updateView(String attachment) {
		byte[] data = android.util.Base64.decode(attachment, android.util.Base64.DEFAULT);
		Bitmap bm = BitmapFactory.decodeByteArray(data, 0, data.length);
		ImageView imageView = new ImageView(this);
		imageView.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
		imageView.setImageBitmap(bm);
		ScrollView attachmentScrollView = (ScrollView) findViewById(R.id.taskAttachmentDetail_attachmentScrollView);
		attachmentScrollView.addView(imageView);
	}
}
