package wa.android.libs.clickFillScreen;

import wa.android.common.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.WindowManager;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class FillScreenActivity extends Activity implements OnClickListener{
	private TextView checkTextView1;
	private GestureDetector singleTapGestureListener;
	private OnTouchListener onTouchListener;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		initView();
		inData();
	}

	private void inData() {
		// TODO Auto-generated method stub
		Intent i = getIntent();
		checkTextView1.setText(i.getStringExtra("checkText"));
		
	}

	private void initView() {
		// TODO Auto-generated method stub
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_fillscreen);
		RelativeLayout layout = (RelativeLayout)findViewById(R.id.checkTextLayout);
		checkTextView1 = (TextView)findViewById(R.id.checkTextView1);
//		checkTextView1.setOnClickListener(this);
		checkTextView1.setMovementMethod(new ScrollingMovementMethod());
		singleTapGestureListener = new GestureDetector(this,
		new OnDoubleClick());
		onTouchListener = new OnTouchListener();
		checkTextView1.setOnTouchListener(onTouchListener);
		layout.setOnClickListener(this);
	}
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		finish();
	}
	class OnTouchListener implements android.view.View.OnTouchListener {
		@Override
		public boolean onTouch(View v, MotionEvent event) {
			return singleTapGestureListener.onTouchEvent(event);
		}
	}
	class OnDoubleClick extends GestureDetector.SimpleOnGestureListener {
		@Override
		public boolean onSingleTapUp(MotionEvent e) {
			// TODO Auto-generated method stub
			finish();
			return super.onSingleTapUp(e);
		}
	}

}

