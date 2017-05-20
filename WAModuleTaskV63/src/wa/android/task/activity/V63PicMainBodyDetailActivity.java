package wa.android.task.activity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import nc.vo.oa.component.struct.ResDataVO;
import nc.vo.oa.component.struct.ServiceCodeRes;
import wa.android.common.UMProgressDialog;
import wa.android.common.activity.BaseActivity;
import wa.android.common.networkold.VOHttpResponse;
import wa.android.common.vo.ResponseActionVO;
import wa.android.common.vo.VOProcessUtil;
import wa.android.common.vo.WAActionVO;
import wa.android.constants.CommonServers;
import wa.android.task.constants.ComponentIds;
import wa.android.v63task.constants.V63ActionTypes;
import wa.android.v63task.data.InfoDetailPicVO;
import wa.android.v63task.data.PicInfoVO;
import wa.android.v63task.util.IntentCacheHelper;
import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.util.Base64;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;

import com.example.wamoduletaskv63.R;

public class V63PicMainBodyDetailActivity extends BaseActivity implements
		OnPageChangeListener, OnClickListener {
//	private String toptitle = "图片内容";
	/** 标题 */
	private TextView toptitleTextView;
	
	private TextView pictitle;
	/** 图片内容TextView */
	private TextView descTextView;
	/** 图片信息内容 */
	private TextView infotitleTextView;
	/** 图片信息发布时间 */
	private TextView publishdateTextView;
	private ViewPager viewPager;
	private PicRequestListener picRequestListener = null;
	protected InfoDetailPicVO infodetailVO = null;
	private UMProgressDialog progressDlg;
	private PicInfoVO cachedRequestPicVO = null;
	private ImageView cachedImageView = null;
	private MyViewPagerAdapter adapter = null;
	private ImageView[] imageViewList = null;
	private Handler picEventHandler = new Handler() {
		@Override
		public void handleMessage(Message msg) {

			cachedImageView.setImageBitmap(BitmapFactory.decodeByteArray(
					Base64.decode(cachedRequestPicVO.base64edPicData,
							Base64.DEFAULT), 0,
					(Base64.decode(cachedRequestPicVO.base64edPicData,
							Base64.DEFAULT)).length));
			adapter.notifyDataSetChanged();
		}
	};

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_task_pic_info_detail);
		/*infodetailVO = (InfoDetailPicVO) getIntent().getSerializableExtra(
				"picmainbody");*/
		infodetailVO = (InfoDetailPicVO)IntentCacheHelper.getInstance(InfoDetailPicVO.class).getObject();
		IntentCacheHelper.getInstance(InfoDetailPicVO.class).recycle();
		picRequestListener = new PicRequestListener();
		initView();
		initData();
	}

	public void initView() {
		progressDlg = new UMProgressDialog(V63PicMainBodyDetailActivity.this);
		progressDlg.setProperty("value", "loading...");

		pictitle =(TextView) findViewById(R.id.picinfodetail_title); 
		viewPager = (ViewPager) findViewById(R.id.infodetail_content);
		// viewPager.setOnClickListener(this);
		viewPager.setOnPageChangeListener(this);
		descTextView = (TextView) findViewById(R.id.picinfodetail_content);

		View view = findViewById(R.id.infodetail_content);
		LayoutParams lp = (LayoutParams) view.getLayoutParams();
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

	public void initData() {
//		infotitleTextView.setText(infodetailVO.infotitle);
//		publishdateTextView.setText(infodetailVO.publishdate);

		InfoDetailPicVO infoDetailPicVO = (InfoDetailPicVO) infodetailVO;
		adapter = new MyViewPagerAdapter(infoDetailPicVO);
		imageViewList = new ImageView[infoDetailPicVO.picList.size()];
		for (int i = 0; i < imageViewList.length; i++) {
			imageViewList[i] = new ImageView(this);
			imageViewList[i].setOnClickListener(this);
		}
		// Bitmap infoPic =
		imageViewList[0].setImageBitmap(BitmapFactory.decodeByteArray(Base64
				.decode(infoDetailPicVO.picList.get(0).base64edPicData,
						Base64.DEFAULT), 0,
				(Base64.decode(infoDetailPicVO.picList.get(0).base64edPicData,
						Base64.DEFAULT)).length));
		descTextView.setText(infoDetailPicVO.picList.get(0).infopicdesc);
		pictitle.setText(infoDetailPicVO.picList.get(0).title);
		viewPager.setAdapter(adapter);

	}

	@Override
	public void onClick(View arg0) {
		int state = descTextView.getVisibility();
		if (state == View.VISIBLE) {
			descTextView.setVisibility(View.GONE);
		} else if (state == View.GONE) {
			descTextView.setVisibility(View.VISIBLE);
		}
	}

	class MyViewPagerAdapter extends PagerAdapter {

		private InfoDetailPicVO detailPicVO = null;

		MyViewPagerAdapter(InfoDetailPicVO dataList) {
			detailPicVO = dataList;
		}

		@Override
		public int getCount() {
			if (detailPicVO == null) {
				return 0;
			} else {
				return detailPicVO.picList.size();
			}
		}

		@Override
		public boolean isViewFromObject(View arg0, Object arg1) {
			return arg0 == arg1;
		}

		@Override
		public Object instantiateItem(ViewGroup container, int position) {
			container.addView(imageViewList[position]);
			return imageViewList[position];
		}

		@Override
		public void destroyItem(ViewGroup container, int position, Object object) {
			container.removeView((View) object);
		}
	}

	@Override
	public void onPageScrollStateChanged(int state) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onPageScrolled(int position, float positionOffset,
			int positionOffsetPixels) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onPageSelected(int position) {
		InfoDetailPicVO infoDetailPicVO = (InfoDetailPicVO) infodetailVO;
		PicInfoVO picVO = infoDetailPicVO.picList.get(position);
		descTextView.setText(picVO.getInfopicdesc());
		// byte b[]=
//		if(picVO.base64edPicData!=null)
//		Bitmap infoPic = BitmapFactory.decodeByteArray(
//				Base64.decode(picVO.base64edPicData, Base64.DEFAULT), 0,
//				(Base64.decode(picVO.base64edPicData, Base64.DEFAULT)).length);
		// if (picVO.infoPic == null) {
		if (picVO.base64edPicData== null) {
			progressDlg.show();
			cachedImageView = imageViewList[position];
			cachedRequestPicVO = picVO;
			List<WAActionVO> actions = new ArrayList<WAActionVO>();
			WAActionVO action = new WAActionVO();
			Map<String, String> params = new HashMap<String, String>();
			params.put("taskid", infoDetailPicVO.getTaskid());
			params.put("infopicid", picVO.infopicid);
			params.put("groupid", "");
			params.put("usrid", "");
			WindowManager wm = (WindowManager) this .getSystemService(Context.WINDOW_SERVICE);
			if(wm.getDefaultDisplay().getWidth()>640){
				params.put("sizetype", "2");
		
			}else{
				params.put("sizetype", "1");
			}
			action.setActiontype(V63ActionTypes.TASK_GETOHERPICCONTENT);
			action.setParams(params);
			actions.add(action);
			requestVO(CommonServers.getServerAddress(this)
					+ CommonServers.SERVER_SERVLET_WA,
					VOProcessUtil
							.createMessageRequestVO(this, ComponentIds.A0A007, actions),
					picRequestListener);
		}
	}

	class PicRequestListener implements OnVORequestedListener {
		@SuppressWarnings({ "unchecked", "rawtypes" })
		@Override
		public void onVORequested(VOHttpResponse vo) {
			// TODO Auto-generated method stub

			ResponseActionVO responseVO = VOProcessUtil.parseMessageVO(
					ComponentIds.A0A007,
					V63ActionTypes.TASK_GETOHERPICCONTENT,
					vo.getmWAComponentInstancesVO());
			switch (responseVO.getFlag()) {
			case 0:
				try {
					for (ServiceCodeRes serviceCodeRes : responseVO
							.getServiceCodeList()) {
						ResDataVO resDataVO = serviceCodeRes.getResdata();
						if (resDataVO != null && resDataVO.getList() != null
								&& resDataVO.getList().size() > 0) {
							Map object = (Map) resDataVO.getList().get(0);
							if (null != object) {
								HashMap<String, String> picData = (HashMap<String, String>) object
										.get("otherpiccontent");
								String base64edPic = picData.get("pic");
								cachedRequestPicVO.setInfoPicData(base64edPic);
								picEventHandler.sendEmptyMessage(0);	

							}
						}
					}
					progressDlg.dismiss();	
				} catch (Exception e) {
					// TODO: handle exception
					progressDlg.dismiss();
				}
				break;
			default:
				toastMsg(responseVO.getDesc());
				progressDlg.dismiss();
				break;
			}
		}

		@Override
		public void onVORequestFailed(VOHttpResponse vo) {
			progressDlg.dismiss();
		}
	}

}
