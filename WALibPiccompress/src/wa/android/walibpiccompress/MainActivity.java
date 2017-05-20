package wa.android.walibpiccompress;

import org.apache.commons.codec.binary.Base64;

import wa.android.uploadattachment.activity.WAAttahcmentUploadActivity;
import wa.android.uploadattachment.data.AttachmentShowVO;
import wa.android.uploadattachment.data.UpLoadAttachmentListVO;
import wa.android.walibpiccompress.util.PicCompressUtil;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity {
	private UpLoadAttachmentListVO attachmenttranslatelist = new UpLoadAttachmentListVO();
	public static final int RESULT_BACK = 10;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		init();
	}

	private void init() {
		// TODO Auto-generated method stub
		Button button = (Button) findViewById(R.id.button1);
		button.setOnClickListener( new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent();
				i.setClass(MainActivity.this, WAAttahcmentUploadActivity.class);
				startActivityForResult(i, RESULT_BACK);
			}
		});

	}
	 @SuppressWarnings("null")
	@Override
	 protected void onActivityResult(int requestCode, int resultCode, Intent data) {
         super.onActivityResult(requestCode, resultCode, data);
         Log.i("as","返回回调");
		 switch (resultCode) {
			case RESULT_OK:
				attachmenttranslatelist = (UpLoadAttachmentListVO) data
						.getSerializableExtra("attachmentlist");
		AttachmentShowVO attachment = attachmenttranslatelist.getAttachmentlist().get(0);
		TextView t1 = (TextView) findViewById(R.id.textView1);
		t1.setText(attachment.getAttachmentSize());
		int width = getWindowManager().getDefaultDisplay().getWidth();
		ImageView v = (ImageView) findViewById(R.id.imageView1);
		
		TextView t2 = (TextView) findViewById(R.id.textView2);
		PicCompressUtil.getCompressBitmap(attachment.getAttachmentPath(), attachment.getAttachmentName(), width);
//		t2.setText(PicCompressUtil.getCompressBitmap(attachment.getAttachmentPath(), width).length());
	    v.setBackgroundDrawable(null);
	    	 break;
		 }
	 }
}
