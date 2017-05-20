package wa.android.common.activity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import wa.android.common.App;
import wa.android.common.R;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

/**
 * 关于Activity
 *
 */
public class AboutActivity extends BaseActivity {

	//TODO: 处理更加灵活的背景图来使用一个activity显示多种about
	
	private ImageView logoImageView;
	private int count;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
//		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		count=0;
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_about);
		logoImageView = (ImageView) findViewById(R.id.apploginImageView);
		int aboutResId = ((App)getApplicationContext()).getConfig().getAboutResId();
		logoImageView.setBackgroundResource(aboutResId);
		Button back = (Button)findViewById(R.id.backBtn);
		back.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				AboutActivity.this.finish();
			}
		});
//		ImageView iv = new ImageView(this);

//		if(aboutResId != -1){
//			iv.setScaleType(ScaleType.FIT_XY);
//			iv.setImageResource(aboutResId);
//		}
//		setContentView(iv);
	}
	
	public boolean isSystemActivity(){
		return true;
	}
	@Override
	public boolean onTouchEvent(MotionEvent event) {
		if(event.getAction()==MotionEvent.ACTION_DOWN){
			int h =getResources().getDisplayMetrics().heightPixels;
			int w =getResources().getDisplayMetrics().widthPixels;
			float hf = event.getX()/w;
			float wf = (h-event.getY())/h;
			if(hf<0.5&&wf<0.5){
				count++;
			}
			if(count>=10){
				try {
					InputStream open = getAssets().open("PublishDate.txt");
					BufferedReader reader = new BufferedReader(new InputStreamReader(open));
					String readLine = reader.readLine();
					AlertDialog.Builder builder = new AlertDialog.Builder(this);
					builder.setMessage(readLine);
					builder.setCancelable(false);
					builder.setPositiveButton("确定", null);
					builder.show();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				count=0;
			}
		}
		return super.onTouchEvent(event);
	}
}
