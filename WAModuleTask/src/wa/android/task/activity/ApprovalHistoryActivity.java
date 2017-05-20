package wa.android.task.activity;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import nc.vo.oa.component.struct.ResDataVO;
import nc.vo.oa.component.struct.ServiceCodeRes;
import nc.vo.oa.component.taskcenter.ApprovedDetailVO;
import wa.android.app.task.R;
import wa.android.app.task.R.drawable;
import wa.android.common.UMProgressDialog;
import wa.android.common.activity.BaseActivity;
import wa.android.common.networkold.VOHttpResponse;
import wa.android.common.vo.ResponseActionVO;
import wa.android.common.vo.VOProcessUtil;
import wa.android.common.vo.WAActionVO;
import wa.android.constants.CommonServers;
import wa.android.constants.CommonWAPreferences;
import wa.android.libs.groupview.WAGroupView;
import wa.android.libs.groupview.WAPanelView;
import wa.android.task.constants.ActionTypes;
import wa.android.task.constants.ComponentIds;
import wa.android.task.vo.TaskHistoryVO;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;

public class ApprovalHistoryActivity extends BaseActivity {
	private UMProgressDialog progressDlg;
	private String serviceCode;
	TextView wadetail_title_separator;
	private boolean issessiontimeOut = false;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_task_approval_history);
		progressDlg = new UMProgressDialog(this);
		progressDlg.setProperty("vlaue", "loading...");
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
						// TODO Auto-generated method stub
						//判断session过期的基础方法
						/*if (vo.getResponseHeaders().length > 0) {
							for (Header h : vo.getResponseHeaders()) {
								if ("Sessiontimout".equals(h
										.getName())) {
									issessiontimeOut = true;
								}
							}
						}*/
						if(issessiontimeOut){
							isSessionTimeOut(vo);
						}
						else{
						ResponseActionVO responseVO = VOProcessUtil.parseMessageVO(
								ComponentIds.A0A007,
								ActionTypes.TASK_GETAPPROVEDDETAIL,
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
									ApprovedDetailVO data = (ApprovedDetailVO) resDataVO
											.getList().get(0);
									updateView(new TaskHistoryVO(data));
								}
							}
							break;

						default:
							break;
						}

						progressDlg.dismiss();
					}}

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
	private void updateView(final TaskHistoryVO data) {
		// 填充内容
		ScrollView detailScrollView = (ScrollView) findViewById(R.id.taskapprovehistory_detailScrollView);
		WAPanelView detailPanel = new WAPanelView(this);
		// 填充提交人
		WAGroupView group = new WAGroupView(this);
		// 加载自己定义的样式
		View submitView = getLayoutInflater().inflate(
				R.layout.taskapprovehistory_detail_item_style_1, null);
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
			wadetail_title_separator.setBackgroundResource(drawable.wadetail_title_separator);
		for (Map<String, String> item : items) {
			// 获取置顶的处理人view
			View dealerView = getLayoutInflater().inflate(
					R.layout.taskapprovehistory_detail_item_style_2, null);
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
			dealerView.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					startDetailPersonActivity(psnId,
							ApproveDetailPersonActivity.PERSON_DEALER);
				}
			});

			group.addRow(dealerView);
			// break;
		}
		group.setTitle(getResources().getString(R.string.handler) + ":");
		detailPanel.addGroup(group);
		}
		detailScrollView.addView(detailPanel);

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

//		if(App.config.getAppversion().equals("0.7")){
			params.put("groupid", this.readPreference(CommonWAPreferences.GROUP_ID) !=null?this.readPreference(CommonWAPreferences.GROUP_ID):"" );	
//		}
//		else{
			params.put("groupid", "");	
//		}
		params.put("usrid", "");
		params.put("taskid", taskId);
		params.put("statuskey", statusKey);
		params.put("statuscode", statusCode);
		params.put("startline", String.valueOf(1));
		params.put("count", String.valueOf(25));

		actionVO.setServicecode(serviceCode);
		actionVO.setActiontype(ActionTypes.TASK_GETAPPROVEDDETAIL);
		actionVO.setParams(params);
		// 发送请求
		requestVO(CommonServers.getServerAddress(this)
				+ CommonServers.SERVER_SERVLET_WA,
				VOProcessUtil.createMessageRequestVO(this, ComponentIds.A0A007, actionVO),
				listener);
	}
}
