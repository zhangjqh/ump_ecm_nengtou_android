package wa.android.task.activity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import wa.android.app.task.R;
import wa.android.common.UMProgressDialog;
import wa.android.common.networkold.VOHttpResponse;
import nc.vo.oa.component.struct.WAComponentInstancesVO;
import nc.vo.oa.component.taskcenter.TaskActionVO;
import wa.android.common.activity.BaseActivity;
import wa.android.common.vo.ResponseActionVO;
import wa.android.common.vo.VOProcessUtil;
import wa.android.common.vo.WAActionVO;
import wa.android.constants.CommonServers;
import wa.android.libs.btnFieldView.BtnFieldView;
import wa.android.task.adapter.AddPersonAdapter;
import wa.android.task.constants.ComponentIds;
import wa.android.task.vo.TaskUserVO;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class ApprovalActivity extends BaseActivity implements OnClickListener {
	// 0 表示同意时需选指派人，
	// 1 表示同意时不需要指派人，
	// 2 表示不同意时需要指派人，
	// 3 表示不同意时不需要指派人 ，
	// 4 表示驳回 ，
	// 5 表示改派
	// 6 加签
	// 99，代表待处理，但是没有动作按钮需要pc端处理
	/** 同意需要指派人 **/
	private static final int ACTION_TYPE_AGREE_PEOPLE = 0x00;
	/** 同意时不需要指派人 **/
	private static final int ACTION_TYPE_AGREE_NOPOEPLE = 0x01;
	/** 不同意时需要指派人 **/
	private static final int ACTION_TYPE_DISAGREE_PEOPLE = 0x02;
	/** 不同意时不需要指派人 **/
	private static final int ACTION_TYPE_DISAGREE_NOPEOPLE = 0x03;
	/** 驳回给 **/
	public static final int ACTION_TYPE_REJECT = 0x04;
	/** 改派 **/
	public static final int ACTION_TYPE_REASSIGN = 0x05;
	/** 加签 **/
	public static final int ACTION_TYPE_DOADDAPPROVE = 0x06;
	private boolean issessiontimeOut = false;
	public static final int RESULT_BACK = 10;
	private TextView toWhomTextView;
	private  BtnFieldView addPersonName;
	private RelativeLayout peopleChooseLayout;
	private EditText opinionsEditText;
	private ImageButton addPersonButton;
	private Button submitButton;

	private String taskid;
	private String personid = "";
	private String personname;
	private String actionCode;
	private int actionFlag;
	private String actionName;
	private String serviceCode;
	private ArrayList<TaskUserVO> userarrayList;
	private AddPersonAdapter addPersonAdapter;
	protected UMProgressDialog progressDlg;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//progressDlg = new UMProgressDialog(this);
		setContentView(R.layout.activity_task_approval_main);
		// 取数据
		Intent intent = getIntent();
		TaskActionVO taskActionVO = (TaskActionVO) intent
				.getSerializableExtra("taskActionVO");
		actionCode = taskActionVO.getCode();
		actionFlag = Integer.parseInt(taskActionVO.getActflag());
		actionName = taskActionVO.getName();
		taskid = intent.getStringExtra("taskid");
		serviceCode = intent.getStringExtra("servicecode");
		initView();

	}

	/**
	 * 初始化界面
	 */
	private void initView() {
		initTitleView();
		// 进度条
		progressDlg = new UMProgressDialog(ApprovalActivity.this);
		progressDlg.setProperty("value", "loading...");

		// 初始化界面
		peopleChooseLayout = (RelativeLayout) findViewById(R.id.taskApproval_peopleChoose_panel);
		toWhomTextView = (TextView) findViewById(R.id.taskApproval_toWhomTextView);
		opinionsEditText = (EditText) findViewById(R.id.taskApproval_opinionsEditText);
		opinionsEditText
				.setBackgroundResource(R.drawable.approve_action_option_bg);
		opinionsEditText.setText(actionName);
		opinionsEditText.requestFocus();

		addPersonButton = (ImageButton) findViewById(R.id.taskApproval_addPersonImageButton);
		submitButton = (Button) findViewById(R.id.taskApproval_submitButton);
		submitButton.setText(actionName);
		addPersonName = (BtnFieldView) findViewById(R.id.addPerson_name);

		addPersonButton.setOnClickListener(this);
		submitButton.setOnClickListener(this);
		userarrayList = new ArrayList<TaskUserVO>();
		addPersonAdapter = new AddPersonAdapter(this, userarrayList);
		addPersonName.setBtnFieldViewAdapter(addPersonAdapter);
//		userarrayList = new ArrayList<TaskUserVO>();
//		addPersonAdapter = new AddPersonAdapter(this, userarrayList);
		initApprovalType();
//		addPersonName.set
		addPersonName.getViewTreeObserver().addOnGlobalLayoutListener(new OnGlobalLayoutListener() {
            
            @Override
            public void onGlobalLayout() {
                    // TODO Auto-generated method stub
                    if (addPersonName.getChildCount() == 0){
                    	addPersonButton.setVisibility(View.VISIBLE)	;
                    }
            }
    });
	}

	/**
	 * 根据审批类型进行界面调整
	 */
	private void initApprovalType() {
		switch (Integer.valueOf(actionFlag)) {
		case ACTION_TYPE_AGREE_NOPOEPLE:// 同意不需要人
		case ACTION_TYPE_DISAGREE_NOPEOPLE:// 不同意不需要人
			peopleChooseLayout.setVisibility(View.GONE);
			break;
		case ACTION_TYPE_REJECT:// 驳回
		case ACTION_TYPE_REASSIGN:// 改派
		case ACTION_TYPE_DOADDAPPROVE:// 加签
			peopleChooseLayout.setVisibility(View.VISIBLE);
			toWhomTextView.setText(actionName
					+ getResources().getString(R.string.to) + ":");
			opinionsEditText.setText(actionName);
			android.widget.LinearLayout.LayoutParams params = (android.widget.LinearLayout.LayoutParams) submitButton
					.getLayoutParams();
			params.topMargin = 32;
			submitButton.setLayoutParams(params);
			break;
		}
	}

	/**
	 * 初始化导航界面
	 */
	private void initTitleView() {
		// 设置头部信息
		TextView titleTextView = (TextView) findViewById(R.id.titlePanel_titleTextView);
		titleTextView.setText(actionName);
		// 头部取消按钮的设置
		Button removeBtn = (Button) findViewById(R.id.titlePanel_rightBtn);
		removeBtn.setVisibility(View.VISIBLE);
		removeBtn.setBackgroundResource(R.drawable.common_button_title_cancel);
		removeBtn.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				finish();
			}
		});
	}

	/**
	 * 处理各种审批动作
	 */
	@Override
	public void onClick(View v) {
		int id = v.getId();
//		if(id == R.id.addPerson_name){
//			
//		}
//		else 
			if (id == R.id.taskApproval_addPersonImageButton) {// 添加相关人员界面入口按钮
			Intent intent = new Intent();
//			intent.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP| Intent.FLAG_ACTIVITY_CLEAR_TOP);
			intent.setClass(ApprovalActivity.this,
					ApprovalAddPersonActivity.class);
			intent.putExtra("actionflag", actionFlag);
			intent.putExtra("servicecode", serviceCode);
			intent.putExtra("actionname", actionName);
			intent.putExtra("taskid", taskid);
			startActivityForResult(intent, RESULT_BACK);
		} else if (id == R.id.taskApproval_submitButton) {// 处理审批动作
			Map<String, String> params = null;
			Map<String,List<String>>paramslist = null;
			WAComponentInstancesVO waComponentInstancesVO = null;
			boolean isRequest = true;
			switch (actionFlag) {
			case ACTION_TYPE_DISAGREE_NOPEOPLE:// 不同意不需要人
			case ACTION_TYPE_AGREE_NOPOEPLE: {// 同意不需要人
				progressDlg.show();
				// 配置参数进行数据加载
				String noteStr = opinionsEditText.getText().toString();
				WAActionVO waaction = new WAActionVO();
				params = new HashMap<String, String>();
					params.put("groupid", "");	
				params.put("usrid", "");
				params.put("taskid", taskid);
				params.put("note", noteStr);
				waaction.setActiontype(actionCode);
				waaction.setParams(params);
				waaction.setServicecode(serviceCode);
				waComponentInstancesVO = VOProcessUtil.createMessageRequestVO(this, 
						ComponentIds.A0A007, waaction);
				break;
			}

			case ACTION_TYPE_REJECT: { // 驳回
				// 配置参数进行数据加载
//				addPersonName.getChildCount() == 0
				personid = getpersonids();
				if (personid == null 
						|| personid.equals("")
						) {
					isRequest = false;
					new AlertDialog.Builder(ApprovalActivity.this)
							.setMessage(getString(R.string.addsomeone))
							.setPositiveButton(getString(R.string.submit), null).show();

				} else {
					HashMap<String, Object> mixparams = new HashMap<String, Object>();
					progressDlg.show();
					String noteStr = opinionsEditText.getText().toString();
					WAActionVO waaction = new WAActionVO();
					params = new HashMap<String, String>();
						params.put("groupid", "");	
					params.put("usrid", "");
					params.put("taskid", taskid);
					params.put("note", noteStr);
					String[] personstrlist =personid.split(",");
					List<String> personList = new ArrayList<String>();
					for (int i = 0 ; i < personstrlist.length ; i++)
						personList.add(personstrlist[i]);
						mixparams.put("userids", personList);
//					params.put("nodeid", personid);
					waaction.setActiontype(actionCode);
					waaction.setParams(params);
					waaction.setIsmixparams(true);
					waaction.setMixparams(mixparams);
					waaction.setServicecode(serviceCode);
					waComponentInstancesVO = VOProcessUtil.createMessageRequestVO(this, 
							ComponentIds.A0A007, waaction);
				}
				break;
			}
			case ACTION_TYPE_AGREE_PEOPLE:

			/** 不同意时需要指派人 **/
			case ACTION_TYPE_DISAGREE_PEOPLE:
			case ACTION_TYPE_REASSIGN: {
				personid = getpersonids();
				// 配置参数进行数据加载
				if (personid == null ||personid.equals("")) {
					isRequest = false;
					new AlertDialog.Builder(ApprovalActivity.this)
							.setMessage(getString(R.string.addsomeone))
							.setPositiveButton(getString(R.string.submit), null).show();

				} else {
					HashMap<String, Object> mixparams = new HashMap<String, Object>();
					progressDlg.show();
					String noteStr = opinionsEditText.getText().toString();
					WAActionVO waaction = new WAActionVO();
					params = new HashMap<String, String>();
						params.put("groupid", "");	
					
					params.put("usrid", "");
					params.put("taskid", taskid);
					params.put("note", noteStr);
					String[] personstrlist =personid.split(",");
					List<String> personList = new ArrayList<String>();
					for (int i = 0 ; i < personstrlist.length ; i++)
						personList.add(personstrlist[i]);
						mixparams.put("userids", personList);
//					params.put("userids", personid);
					waaction.setActiontype(actionCode);
					waaction.setParams(params);
					waaction.setServicecode(serviceCode);
					waaction.setIsmixparams(true);
					waaction.setMixparams(mixparams);
					waComponentInstancesVO = VOProcessUtil.createMessageRequestVO(this, 
							ComponentIds.A0A007, waaction);
				}
				break;
			}
			case ACTION_TYPE_DOADDAPPROVE: {
				personid = getpersonids();
				// 配置参数进行数据加载
				if ( personid == null ||personid.equals("")) {
					isRequest = false;
					new AlertDialog.Builder(ApprovalActivity.this)
							.setMessage(getString(R.string.addsomeone))
							.setPositiveButton(getString(R.string.submit), null).show();

				} else {
					progressDlg.show();
					String noteStr = opinionsEditText.getText().toString();
					WAActionVO waaction = new WAActionVO();
					HashMap<String, Object> mixparams = new HashMap<String, Object>();
					params = new HashMap<String, String>();

						params.put("groupid", "");	
					params.put("usrid", "");
					params.put("taskid", taskid);
					params.put("note", noteStr);
					String[] personstrlist =personid.split(",");
					List<String> personList = new ArrayList<String>();
					for (int i = 0 ; i < personstrlist.length ; i++)
						personList.add(personstrlist[i]);
						mixparams.put("userids", personList);
					waaction.setActiontype(actionCode);
					waaction.setParams(params);
					waaction.setIsmixparams(true);
					waaction.setMixparams(mixparams);
					waaction.setServicecode(serviceCode);
					waComponentInstancesVO = VOProcessUtil.createMessageRequestVO(this, 
							ComponentIds.A0A007, waaction);
				}
				break;
			}
			}
			if (isRequest) {
				requestVO(CommonServers.getServerAddress(this)
						+ CommonServers.SERVER_SERVLET_WA,
						waComponentInstancesVO, new OnVORequestedListener() {
							@Override
							public void onVORequested(VOHttpResponse vo) {
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
										ComponentIds.A0A007, actionCode,
										vo.getmWAComponentInstancesVO());
								final int flag = responseVO.getFlag();
								switch (flag) {
								case 0:
									new AlertDialog.Builder(
											ApprovalActivity.this)
											.setMessage(responseVO.getDesc())
											.setPositiveButton(
													R.string.submit,
													new DialogInterface.OnClickListener() {
														@Override
														public void onClick(
																DialogInterface dialog,
																int which) {
															switch (flag) {
															case 0:
																Intent intent = new Intent(
																		ApprovalActivity.this,
																		TaskMainActivity.class);
																intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
																startActivity(intent);
																finish();
																break;
															default:
																finish();
																break;
															}
														}
													}).show();
									break;

								default:
									toastMsg(responseVO.getDesc());
									break;
								}
								progressDlg.dismiss();
							}}

							@Override
							public void onVORequestFailed(VOHttpResponse vo) {
								toastMsg("请求失败");
								progressDlg.dismiss();
							}
						});
			}
		}
	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		switch (resultCode) {
		case RESULT_OK:
			TaskUserVO userVO = (TaskUserVO) data
					.getSerializableExtra("userVO");
			
//			addPersonName.s
//			personname = userVO.getPsnName();
			int type = data.getIntExtra("type", 0);
			switch (type) {
			case 0:
				personid = getpersonids();
				if (personid.contains(userVO.getPsnId())){
					new AlertDialog.Builder(ApprovalActivity.this)
					.setMessage(getString(R.string.existingselection))
					.setPositiveButton(getString(R.string.submit), null).show();}
				else{
					if(actionCode.equals("doReassign")){
							userarrayList.add(userVO);
							addPersonAdapter.notifyDataSetChanged();
							addPersonButton.setVisibility(View.INVISIBLE);
						}
					 else{
					userarrayList.add(userVO);
					addPersonAdapter.notifyDataSetChanged();
					}}
				break;

			default:
				if (actionFlag==4){	
					userarrayList.add(userVO);
					addPersonAdapter.notifyDataSetChanged();
					addPersonButton.setVisibility(View.INVISIBLE);
				}
				else
				{

					personid = getpersonids();
					if (personid.contains(userVO.getPsnId())){
						new AlertDialog.Builder(ApprovalActivity.this)
						.setMessage(getString(R.string.existingselection))
						.setPositiveButton(getString(R.string.submit), null).show();}
					else{
						userarrayList.add(userVO);
						addPersonAdapter.notifyDataSetChanged();
						}	
				break;
			}
			break;
		}}
	}
	private String getpersonids(){
		StringBuffer psnids = new StringBuffer("");
		String personids = "";
//		addPersonAdapter.notifyDataSetChanged();
		List<TaskUserVO> TaskUserVOlist =(List<TaskUserVO>)addPersonAdapter.getAllItem();

		if(TaskUserVOlist != null)
		if(TaskUserVOlist !=null && TaskUserVOlist.size()> 0 )
		{
			for (int i = 0 ; i < TaskUserVOlist.size() ; i++)
			{
				psnids.append(TaskUserVOlist.get(i).getPsnId());
				if(!(i == TaskUserVOlist.size()-1)){
				psnids.append(",");}
			}
			personids = psnids.toString();
		}
		return personids;
	}
}
