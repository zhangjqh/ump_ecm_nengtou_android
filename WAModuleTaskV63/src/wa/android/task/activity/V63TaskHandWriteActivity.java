package wa.android.task.activity;

import java.io.File;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;

import com.example.wamoduletaskv63.R;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Environment;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowManager;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import wa.android.common.App;
import wa.android.common.activity.BaseActivity;
import wa.android.task.view.WAHandWriteView;

@SuppressLint("SimpleDateFormat")
public class V63TaskHandWriteActivity extends BaseActivity implements
		OnClickListener {
	private Button finishBtn;
	private TextView saveBtn, backBtn;
	private String taskid = "";
	private String sdPath = Environment.getExternalStorageDirectory().getPath();
	private File dirFile = new File(sdPath + File.separator + "com"
			+ File.separator + "yonyou");
	private String 		path ;
	private WAHandWriteView view;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.v63_activity_task_handwrite);
		TextView titletext = (TextView) findViewById(R.id.titlePanel_titleTextView);
		titletext.setText(getString(R.string.manualcomment));
		taskid = getIntent().getStringExtra("taskid");
		String ly_time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new java.util.Date());
		path = (dirFile + File.separator +taskid + ".png").replace(" ", "");
		view = (WAHandWriteView) this.findViewById(R.id.handwriteView);
		File file = new File(path);
		if (file.exists()) {
			Bitmap bitmap = convertToBitmap(path);
			view.setInitbitmap(bitmap);
		}

		BitmapFactory.Options opts = new BitmapFactory.Options();
		opts.inJustDecodeBounds = true;
		opts.inPreferredConfig = Bitmap.Config.ARGB_8888;

		BitmapFactory.decodeFile(path, opts);
		init();
	}

	private void init() {
		// TODO Auto-generated method stub
		finishBtn = (Button) findViewById(R.id.titlePanel_backBtn);
		finishBtn.setVisibility(View.VISIBLE);
		backBtn = (TextView) findViewById(R.id.backbtn);
		saveBtn = (TextView) findViewById(R.id.savebtn);
		saveBtn.setText(getString(R.string.save));
		backBtn.setText(getString(R.string.undo));
		saveBtn.setOnClickListener(this);
		backBtn.setOnClickListener(this);
		finishBtn.setOnClickListener(this);
	}

	public void save() {

		if (!dirFile.exists())
			dirFile.mkdirs();


		view.save(path);
		Intent i = new Intent();
		i.putExtra("markpath", path);
		i.putExtra("type", 5);
		// 通过调用setResult方法返回结果给前一个activity。
		setResult(RESULT_OK, i);
		finish();

	}

	public void clear() {
		WAHandWriteView view = (WAHandWriteView) this
				.findViewById(R.id.handwriteView);
		view.clear();

	}

	public void undo() {
		WAHandWriteView view = (WAHandWriteView) this
				.findViewById(R.id.handwriteView);
		view.undo();
	}

	public void redo() {
		WAHandWriteView view = (WAHandWriteView) this
				.findViewById(R.id.handwriteView);
		view.redo();
	}

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub

		if (arg0 == finishBtn) {
			finish();
		} else if (arg0 == saveBtn) {
			save();
		} else if (arg0 == backBtn) {
			undo();
		}
	}

	public Bitmap convertToBitmap(String path) {
		BitmapFactory.Options opts = new BitmapFactory.Options();
		// 设置为ture只获取图片大小
		opts.inJustDecodeBounds = true;
		opts.inPreferredConfig = Bitmap.Config.ARGB_8888;
		BitmapFactory.decodeFile(path, opts);
		opts.inJustDecodeBounds = false;
		WeakReference<Bitmap> weak = new WeakReference<Bitmap>(
				BitmapFactory.decodeFile(path, opts));
		int width = ((WindowManager) this
				.getSystemService(Context.WINDOW_SERVICE)).getDefaultDisplay()
				.getWidth();
		if (width > 640) {
			return Bitmap.createScaledBitmap(weak.get(), 720, 1000, true);
		} else {
			return Bitmap.createScaledBitmap(weak.get(), 480, 600, true);
		}

	}


	   /**
  * 物理键监听
  */
	public boolean onKeyDown(int keyCode, KeyEvent event) { // 监听物理键
		if (keyCode == KeyEvent.KEYCODE_BACK ) {
			save();
		}
		if (keyCode == KeyEvent.KEYCODE_MENU) {

			Intent i = new Intent();
			i.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP
					| Intent.FLAG_ACTIVITY_CLEAR_TOP);
			i.setClass(this, App.moduleList.get(0).getMainClazz());
			startActivity(i);
//			Toast.makeText(this, "Menu", Toast.LENGTH_SHORT).show();
		return false;
	}
		return super.onKeyDown(keyCode, event);
		} 
}
