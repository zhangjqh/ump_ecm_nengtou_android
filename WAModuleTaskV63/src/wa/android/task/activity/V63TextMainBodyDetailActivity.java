package wa.android.task.activity;

import com.example.wamoduletaskv63.R;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import wa.android.common.UMProgressDialog;
import wa.android.common.activity.BaseActivity;
import wa.android.common.network.RequestListener;
import wa.android.common.network.WARequestVO;
import wa.android.libs.htmltools.WAWebView;
import wa.android.v63task.data.AbsInfoDetailVO;
import wa.android.v63task.data.InfoDetailHtmlVO;
import wa.android.v63task.data.InfoDetailPicVO;
import wa.android.v63task.util.IntentCacheHelper;

public class V63TextMainBodyDetailActivity extends BaseActivity  {
	protected AbsInfoDetailVO infodetailVO = null;	
	protected UMProgressDialog progressDlg;
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_text_info_detail);
		//infodetailVO = (AbsInfoDetailVO) getIntent().getSerializableExtra("htmlmainbody");
		infodetailVO = (InfoDetailHtmlVO)IntentCacheHelper.getInstance(InfoDetailHtmlVO.class).getObject();
		IntentCacheHelper.getInstance(InfoDetailPicVO.class).recycle();
		DisplayMetrics dm = new DisplayMetrics();
		getWindowManager().getDefaultDisplay().getMetrics(dm);
		width = dm.widthPixels;
		height = dm.heightPixels;
		initView();
	}

	private int width = 0;
	private int height = 0;

	// 初始化界面控件
	public void initView() {

		RelativeLayout contentView = (RelativeLayout) findViewById(R.id.infodetail_content);

		InfoDetailHtmlVO htmlInfoDetailVO = (InfoDetailHtmlVO)infodetailVO;
		WAWebView webview = new WAWebView(this);
		webview.init(htmlInfoDetailVO.htmlDataVO);
		LayoutParams lp2 = new LayoutParams(LayoutParams.FILL_PARENT,
				LayoutParams.FILL_PARENT);
		webview.setLayoutParams(lp2);
		contentView.addView(webview);

		TextView infotitleTextView = (TextView) findViewById(R.id.infodetail_infotitle);
		infotitleTextView.setText("");
		infotitleTextView.setVisibility(View.GONE);
				//infodetailVO.infotitle);
		
		TextView publishdateTextView = (TextView) findViewById(R.id.infodetail_publishdate);
		publishdateTextView.setText(infodetailVO.publishdate);
		publishdateTextView.setVisibility(View.GONE);
		View view = findViewById(R.id.infodetail_content);
		LayoutParams lp = (LayoutParams)view.getLayoutParams();
		lp.bottomMargin = 100;
		view.setLayoutParams(lp);
		TextView titleTextView = (TextView) findViewById(R.id.titlePanel_titleTextView);
		titleTextView.setText(getString(R.string.body));
	Button backBtn = (Button) findViewById(R.id.titlePanel_backBtn);
	backBtn.setVisibility(View.VISIBLE);
	backBtn.setOnClickListener(new OnClickListener() {
		@Override
		public void onClick(View v) {
			finish();
		}
	});

	}

}
