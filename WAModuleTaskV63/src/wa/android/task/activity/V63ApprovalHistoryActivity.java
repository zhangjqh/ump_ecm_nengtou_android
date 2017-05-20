package wa.android.task.activity;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.example.wamoduletaskv63.R;
import com.example.wamoduletaskv63.R.drawable;

import nc.vo.oa.component.struct.ResDataVO;
import nc.vo.oa.component.struct.ServiceCodeRes;
import wa.android.common.UMProgressDialog;
import wa.android.common.activity.BaseActivity;
import wa.android.common.networkold.VOHttpResponse;
import wa.android.common.utils.DensityUtil;
import wa.android.common.vo.ResponseActionVO;
import wa.android.common.vo.VOProcessUtil;
import wa.android.common.vo.WAActionVO;
import wa.android.constants.CommonServers;
import wa.android.libs.clickFillScreen.FillScreenActivity;
import wa.android.libs.groupview.OnAttachmentOpenedActions;
import wa.android.libs.groupview.WAGroupView;
import wa.android.libs.groupview.WAPanelView;
import wa.android.task.constants.ComponentIds;
import wa.android.v63task.constants.V63ActionTypes;
import wa.android.v63task.data.V63ApproveDetailVO;
import wa.android.v63task.data.V63ApproveHistoryVO;
import wa.android.v63task.data.V63TaskHistoryVO;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

public class V63ApprovalHistoryActivity extends BaseActivity {

	private String serviceCode;
	TextView wadetail_title_separator;
	private boolean issessiontimeOut = false;
	private UMProgressDialog progressDlg;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_task_approval_history);
		progressDlg = new UMProgressDialog(this);
		progressDlg.setProperty("value", "loading...");
		initView();
		initData();
	}

	/**
	 * 初始化数据
	 */
	private void initData() {
		String taskId = getIntent().getStringExtra("taskid");
		String statusCode = getIntent().getStringExtra("statuscode");
		String statusKey = getIntent().getStringExtra("statuskey");
		serviceCode = getIntent().getStringExtra("servicecode");
		 wadetail_title_separator =(TextView) findViewById(R.id.taskapprovehistroy_title_separator);
		progressDlg.show();
		getApprovedDetail(serviceCode, taskId, statusKey, statusCode,
				new OnVORequestedListener() {
					@Override
					public void onVORequested(wa.android.common.networkold.VOHttpResponse vo) {

						ResponseActionVO responseVO = VOProcessUtil.parseMessageVO(
								ComponentIds.A0A007,
								V63ActionTypes.TASK_GETAPPROVEDDETAIL,
								vo.getmWAComponentInstancesVO());
						switch (responseVO.getFlag()) {
						case 0:
							for (ServiceCodeRes serviceCodeRes : responseVO
									.getServiceCodeList()) {
								ResDataVO resDataVO = serviceCodeRes
										.getResdata();
								if (resDataVO != null
										&& resDataVO.getList() != null
										&& resDataVO.getList().size() > 0) {
									Map object = (Map) resDataVO.getList()
											.get(0);
									V63ApproveDetailVO approveDetailVO = new V63ApproveDetailVO();
								
									if (null != object) {
										Map noteliststruct = (Map) object
												.get("approvedetail");
										approveDetailVO.setBillname((String) noteliststruct.get("billname"));
										approveDetailVO.setBilltypename((String) noteliststruct.get("billtypename"));
										approveDetailVO.setPsnid((String) noteliststruct.get("psnid"));
										approveDetailVO.setSubmitdate((String) noteliststruct.get("submitdate"));
										approveDetailVO.setSubmitperson((String) noteliststruct.get("makername"));
				
										List<Map> historylistmap = (List<Map>) noteliststruct.get("approvehistoryline");
										if(historylistmap != null){
										List<V63ApproveHistoryVO> historylisttmp = new ArrayList<V63ApproveHistoryVO>();
										if (null != historylistmap) {
											Iterator<Map> iter = historylistmap.iterator();
											while(iter.hasNext()) {
												Map map = iter.next();
												V63ApproveHistoryVO approveHistoryVO = new V63ApproveHistoryVO();
												approveHistoryVO.setId((String)map.get("approvedid"));			
												approveHistoryVO.setPsnid((String)map.get("psnid"));		
												approveHistoryVO.setHandler((String)map.get("handername"));		
												approveHistoryVO.setAction((String)map.get("action"));		
												approveHistoryVO.setNote((String)map.get("note"));		
												approveHistoryVO.setHandledate((String)map.get("handedate"));
												approveHistoryVO.setMark((String)map.get("mark"));
												historylisttmp.add(approveHistoryVO);
											}
											approveDetailVO.setApprovehistorylist(historylisttmp);
											initView();
										}
										}
										try {
											updateView(new V63TaskHistoryVO(approveDetailVO));
										} catch (Exception e) {
											// TODO: handle exception
										}
									
								}
								}
							}
							break;

						default:
							toastMsg(responseVO.getDesc())	;
							break;
						}

						progressDlg.dismiss();
					}

					@Override
					public void onVORequestFailed(VOHttpResponse vo) {
						// TODO Auto-generated method stub
						progressDlg.dismiss();
					}
				});
	}

	/**
	 * 向界面填充数据
	 */
	private void updateView(final V63TaskHistoryVO data) {
		// 填充内容
		ScrollView detailScrollView = (ScrollView) findViewById(R.id.taskapprovehistory_detailScrollView);
		WAPanelView detailPanel = new WAPanelView(this);
		// 填充提交人
		WAGroupView group = new WAGroupView(this);
		// 加载自己定义的样式
		View submitView = getLayoutInflater().inflate(
				R.layout.taskapprovehistory_detail_item_style_1, null);
		submitView.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, DensityUtil.dip2px(this, 44)));
		TextView nameTextView = (TextView) submitView
				.findViewById(R.id.taskasd_itemstyle1_nameTextView);
		TextView dateTextView = (TextView) submitView
				.findViewById(R.id.taskasd_itemstyle1_dateTextView);
		nameTextView.setText(data.getMaker());
		dateTextView.setText(data.getMakeDate());
		// 赋值后添加到row中
		submitView.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				startDetailPersonActivity(data.getPsnid(),
						ApproveDetailPersonActivity.PERSON_SUBMIT);
			}
		});
		group.addRow(submitView);
		group.setTitle(getResources().getString(R.string.submitter) + ":");
		detailPanel.addGroup(group);
		// 填充处理人
		group = new WAGroupView(this);
		List<Map<String, String>> items = data.getItems();
		if(items.size() > 0){
			//wadetail_title_separator.setBackgroundResource(drawable.wadetail_title_separator);
		for (Map<String, String> item : items) {
			// 获取置顶的处理人view
			View dealerView = getLayoutInflater().inflate(
					R.layout.v63taskapprovehistory_detail_item_style_2, null);
			dealerView.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, DensityUtil.dip2px(this, 89)));
			TextView nameTextView2 = (TextView) dealerView
					.findViewById(R.id.taskasd_itemstyle2_nameTextView);
			TextView actionTextView = (TextView) dealerView
					.findViewById(R.id.taskasd_itemstyle2_actionTextView);
			TextView dateTextView2 = (TextView) dealerView
					.findViewById(R.id.taskasd_itemstyle2_dateTextView);
			TextView noteTextView = (TextView) dealerView
					.findViewById(R.id.taskasd_itemstyle2_noteTextView);
			
			nameTextView2.setText(item.get("handername"));
			actionTextView.setText(item.get("action"));
			dateTextView2.setText(item.get("handerdate"));
			noteTextView.setText(item.get("note"));
			final String psnId = item.get("psnid");
			// 添加单击事件
			nameTextView2.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					startDetailPersonActivity(psnId,
							ApproveDetailPersonActivity.PERSON_DEALER);
				}
			});
			final String note = item.get("note");
			//添加意见单击事件
			noteTextView.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					Intent i = new Intent();
					i.setClass(V63ApprovalHistoryActivity.this, FillScreenActivity.class);
					i.putExtra("checkText", note);
					startActivity(i);
					
				}
			});
			if (!item.get("mark").equals("")){
				final String filecontent = item.get("mark");
				ImageView notepic = (ImageView)dealerView
						.findViewById(R.id.task_history_picImageView);
				notepic.setVisibility(View.VISIBLE);
				notepic.setOnClickListener(new OnClickListener() {
					
					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						handleattachment(filecontent);
					}


				});
			}
			group.addRow(dealerView);
			// break;
		}
		group.setTitle(getResources().getString(R.string.handler) + ":");
		detailPanel.addGroup(group);
		}
		detailScrollView.addView(detailPanel);

	}
	private void handleattachment(String attachment) {
		String taskId = getIntent().getStringExtra("taskid");
		byte[] data = android.util.Base64
				.decode(attachment,
						android.util.Base64.DEFAULT);
		// TODO Auto-generated method stub
		boolean hasSD = Environment
				.getExternalStorageState()
				.equals(android.os.Environment.MEDIA_MOUNTED);
		
		if (hasSD) {
			if (getSDFreeSize() > 1) {
				String sdPath = Environment
						.getExternalStorageDirectory()
						.getPath();
				File dirFile = new File(
						sdPath
								+ File.separator
								+ "com"
								+ File.separator
								+ "yonyou");
				if (!dirFile
						.exists())
					dirFile.mkdirs();
				File file = new File(dirFile,"temp");

				try {
					FileOutputStream fos = new FileOutputStream(
							file);
					fos.write(
							data,
							0,
							data.length);
					fos.flush();
					fos.close();

				startActivity(OnAttachmentOpenedActions
						.getAttachmentIntent(
								file,
								"png"));
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
				 catch (Exception e) {
						toastMsg(getString(R.string.noapptoopen));
					}
			} else {
				toastMsg(getString(R.string.nosdcardspace));
			}
		} else {
			toastMsg(getString(R.string.nosdcard));
		}
	}
	private long getSDFreeSize() {
	File path = Environment.getExternalStorageDirectory();
	StatFs sf = new StatFs(path.getPath());
	// 获取单个数据块的大小(Byte)
	long blockSize = sf.getBlockSize();
	// 空闲的数据块的数量
	long freeBlocks = sf.getAvailableBlocks();
	// 返回SD卡空闲大小
	// return freeBlocks * blockSize; //单位Byte
	// return (freeBlocks * blockSize)/1024; //单位KB
	return (freeBlocks * blockSize) / 1024 / 1024; // 单位MB
}
	private void startDetailPersonActivity(String psnId, int id) {
		Intent intent = new Intent(this, ApproveDetailPersonActivity.class);
		intent.putExtra("psnid", psnId);
		intent.putExtra("persontype", id);
		intent.putExtra("servicecode", serviceCode);
		startActivity(intent);
	}

	/**
	 * 初始化导航界面
	 */
	private void initView() {
		// 设置头部信息
		TextView titleTextView = (TextView) findViewById(R.id.titlePanel_titleTextView);
		titleTextView.setText(R.string.taskhistory);
		// 头部返回按钮的设置
		Button backButton = (Button) findViewById(R.id.titlePanel_backBtn);
		backButton.setVisibility(View.VISIBLE);
		backButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				finish();
			}
		});
		// 填充标题
		TextView title = (TextView) findViewById(R.id.taskapprovehistroy_titleTextView);
		title.setText(getIntent().getStringExtra("title"));
	}

	/**
	 * 获取审批历史
	 * 
	 * @param taskid
	 * @param listener
	 */
	private void getApprovedDetail(String serviceCode, String taskId,
			String statusKey, String statusCode, OnVORequestedListener listener) {
		WAActionVO actionVO = new WAActionVO();
		Map<String, String> params = new HashMap<String, String>();

		params.put("groupid", "");
		params.put("usrid", "");
		params.put("taskid", taskId);
		params.put("statuskey", statusKey);
		params.put("statuscode", statusCode);
		params.put("startline", String.valueOf(1));
		params.put("count", String.valueOf(25));

		actionVO.setServicecode(serviceCode);
		actionVO.setActiontype(V63ActionTypes.TASK_GETAPPROVEDDETAIL);
		actionVO.setParams(params);
		// 发送请求
		requestVO(CommonServers.getServerAddress(this)
				+ CommonServers.SERVER_SERVLET_WA,
				VOProcessUtil.createMessageRequestVO(this, ComponentIds.A0A007, actionVO),
				listener);
	}
}
