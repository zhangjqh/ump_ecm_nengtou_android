package wa.android.task.activity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.http.Header;

import com.example.wamoduletaskv63.R;

import nc.vo.oa.component.common.SearchConditionVO;
import nc.vo.oa.component.struct.ResDataVO;
import nc.vo.oa.component.struct.ServiceCodeRes;
import nc.vo.oa.component.struct.WAComponentInstancesVO;
import nc.vo.oa.component.taskcenter.RejectNodeListVO;
import nc.vo.oa.component.taskcenter.RejectVO;
import nc.vo.oa.component.taskcenter.UserListVO;
import nc.vo.oa.component.taskcenter.UserVO;
import wa.android.common.UMProgressDialog;
import wa.android.common.activity.BaseActivity;
import wa.android.common.vo.ResponseActionVO;
import wa.android.common.vo.VOProcessUtil;
import wa.android.common.vo.WAActionVO;
import wa.android.constants.CommonServers;
import wa.android.constants.CommonWAPreferences;
import wa.android.common.networkold.VOHttpResponse;
import wa.android.libs.listview.WALoadListView;
import wa.android.libs.listview.WALoadListView.OnRefreshListener;
import wa.android.task.adapter.TaskSimpleAdpater;
import wa.android.task.adapter.TaskUserListAdapter;
import wa.android.task.adapter.TaskUserListAdapter.ViewHolder;
import wa.android.task.constants.ActionTypes;
import wa.android.task.constants.ComponentIds;
import wa.android.task.vo.SearchListData;
import wa.android.task.vo.TaskUserVO;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;

public class V63ApprovalAddPersonActivity extends BaseActivity {
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
	
	private UMProgressDialog progressDlg;
	private final String ACTION_REASSIGN_FIRST = "reassignFirstAction";
	private final String ACTION_UPREFRESH = "upRefreshAction";
	private final String ACTION_DOWNLOAD = "downLoadAction";
	private final String ACTION_REASSIGN_SEARCH = "reassignSearchAction";
	private final String ACTION_ASSIGN_PSN_LIST = "getAssignList";
	private final String ACTION_REJECT_PEOPLE_SEARCH = "rejectPeopleSearchAction";

	private final String PRE_APPROVALADDPERSONACTIVITY = "aaps_ufida";

	private WALoadListView personListView;
	private ListView searchListView;
	private String taskId;
	private int actionFlag,v63actionFlag;
	private String actionName;
	private String servicecode;
	private String currentCondition = "";
	private int startLine = 1;
	private int count = 25;
	private SearchListData taskSearchListData;
	private boolean issessiontimeOut = false;

	private List<String> searchList;
	private EditText searchEditText;
	private List<TaskUserVO> userVOList;
	private TaskUserListAdapter userAdapter;
	private TaskSimpleAdpater searchAdapter;
	private RelativeLayout searchPanel;
	private LinearLayout noDataPanel, dataPanel;
	private List<TaskUserVO> selectUserVOList;

	private boolean searchflag = true;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_task_approval_addperson);
		Intent intent = getIntent();
		taskId = intent.getStringExtra("taskid");
		v63actionFlag= intent.getStringExtra("v63actionflag") ==null ?0:Integer.parseInt(intent.getStringExtra("v63actionflag"));
		actionFlag = Integer.parseInt(intent.getStringExtra("actionflag"));
		actionName = intent.getStringExtra("actionname");
		servicecode = intent.getStringExtra("servicecode");

		// 加载已有的搜索条件
		taskSearchListData = new SearchListData(this);
		searchList = new ArrayList<String>();
		taskSearchListData.parseData(taskSearchListData.read(
				readPreference(CommonWAPreferences.USER_NAME), "",
				PRE_APPROVALADDPERSONACTIVITY));
		searchList.addAll(taskSearchListData.getStringList());
		searchList.add(getResources().getString(R.string.all));
		initTitleView();
		updateView();
	}

	@Override
	public void finish() {
		super.finish();
		taskSearchListData
				.write(readPreference(CommonWAPreferences.USER_NAME), "",
						PRE_APPROVALADDPERSONACTIVITY,
						taskSearchListData.getData());
	}

	/**
	 * 初始化导航界面
	 */
	private void initTitleView() {
		// 设置头部信息
		TextView titleTextView = (TextView) findViewById(R.id.titlePanel_titleTextView);
		if(actionFlag ==  ACTION_TYPE_REJECT) {
		titleTextView.setText(actionName
				+ getResources().getString(R.string.to));
		} else {
			titleTextView.setText(getResources().getString(R.string.operator));
		}
		// 头部返回按钮的设置
		Button cancelBtn = (Button) findViewById(R.id.titlePanel_backBtn);
		cancelBtn.setVisibility(View.VISIBLE);
		cancelBtn.setBackgroundResource(R.drawable.btn_back);
		cancelBtn.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				finish();
			}
		});
		//头部确认按钮
				Button okbutton = (Button)findViewById(R.id.titlePanel_rightTextBtn);
				if(v63actionFlag==8||v63actionFlag==9){
					okbutton.setVisibility(View.GONE);
				}else{
					okbutton.setVisibility(View.VISIBLE);
				}
				okbutton.setText(R.string.submit);
				okbutton.setTextSize(17);
				//okbutton.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT,LayoutParams.WRAP_CONTENT));
				okbutton.setTextColor(Color.RED);
				okbutton.setBackgroundColor(Color.TRANSPARENT);
				okbutton.setOnClickListener(new OnClickListener() {
					
					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						Intent intent = new Intent();
						selectUserVOList = new ArrayList<TaskUserVO>();
						if(userAdapter.isSelected!=null&&userAdapter.isSelected.size()>0){
							for(int i=0;i<userAdapter.isSelected.size();i++){
								if(userAdapter.isSelected.get(i)==true){
									selectUserVOList.add(userVOList.get(i));
								}
							}
						
							intent.putExtra("selectUserVOList", (Serializable)selectUserVOList);
							if(v63actionFlag == 3){
								intent.putExtra("type", 3);
							} else if(v63actionFlag == 4) {
								intent.putExtra("type", 4);
							}else if(v63actionFlag == 8) {
								intent.putExtra("type", 8);
							}else if(v63actionFlag == 9) {
								intent.putExtra("type", 9);
							}else if(v63actionFlag == 10) {
								intent.putExtra("type", 10);
							}	else if(v63actionFlag == 11) {
								intent.putExtra("type", 11);
							}
							// 通过调用setResult方法返回结果给前一个activity。
							setResult(RESULT_OK, intent);
						}
						// 关闭当前activity
						finish();
						
					}
				});
		
	}

	private void updateView() {
		progressDlg = new UMProgressDialog(V63ApprovalAddPersonActivity.this);
		progressDlg.setProperty("value", "loading...");

		userVOList = new ArrayList<TaskUserVO>();
		userAdapter = new TaskUserListAdapter(this, userVOList);
		searchAdapter = new TaskSimpleAdpater(this, searchList);
		// 人员列表
		personListView = (WALoadListView) findViewById(R.id.taskaddperson_userListView);
		personListView.setAdapter(userAdapter);
		personListView.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				
				ViewHolder holder = (ViewHolder) view.getTag();
				holder.personCheckedView.toggle();
				
				if(v63actionFlag==8||v63actionFlag==9){
					Intent intent = new Intent();
					TaskUserVO userVO = userVOList.get((int) id);
					if(null==userVO.getPsnName()||userVO.getPsnName().equals("")){
						toastMsg("请选择有用户姓名的人员");
					}else{
					intent.putExtra("userVO", userVO);
					if(v63actionFlag == 3){
						intent.putExtra("type", 3);
					} else if(v63actionFlag == 4) {
						intent.putExtra("type", 4);
					}else if(v63actionFlag == 8) {
						intent.putExtra("type", 8);
					}else if(v63actionFlag == 9) {
						intent.putExtra("type", 9);
					}else if(v63actionFlag == 10) {
						intent.putExtra("type", 10);
					}	else if(v63actionFlag == 11) {
						intent.putExtra("type", 11);
					}
					// 通过调用setResult方法返回结果给前一个activity。
					setResult(RESULT_OK, intent);
					// 关闭当前activity
					finish();
					}
				}else{
					//设置选中(多选)
					TaskUserListAdapter.getIsSelected().put(position-1, holder.personCheckedView.isChecked());
				}
				
			}
		});

		noDataPanel = (LinearLayout) findViewById(R.id.taskaddperson_nodataPanel);
		dataPanel = (LinearLayout) findViewById(R.id.taskaddperson_dataPanel);
		searchPanel = (RelativeLayout) findViewById(R.id.taskaddperson_searchPanel);
		searchListView = (ListView) findViewById(R.id.taskaddperson_searchListView);
		searchListView.setAdapter(searchAdapter);
		if ( ACTION_TYPE_REASSIGN == actionFlag
				||  ACTION_TYPE_DOADDAPPROVE == actionFlag||v63actionFlag == 3||v63actionFlag == 4) {// 如果是转签
			personListView.setOnRefreshListener(new OnRefreshListener() {// 上拉刷新
						@Override
						public void onUpRefresh() {// 上拉刷新
							startLine = 1;
							progressDlg.show();
							getUserList(taskId, startLine, count,
									currentCondition,
									new MyOnVORequestListener(ACTION_UPREFRESH));
//							personListView.onRefreshComplete();
//							searchAdapter.notifyDataSetChanged();
//							userAdapter.notifyDataSetChanged();
						}

						@Override
						public void onDownRefresh() {// 下拉加载
							startLine = startLine + count;
							getUserList(taskId, startLine, count,
									currentCondition,
									new MyOnVORequestListener(ACTION_DOWNLOAD));
//							personListView.onRefreshComplete();
//							searchAdapter.notifyDataSetChanged();
//							userAdapter.notifyDataSetChanged();
						}
					});
			final Button cancelBtn = (Button) findViewById(R.id.taskaddperson_cancelBtn);
			// 是否显示检索框
			searchEditText = (EditText) findViewById(R.id.taskaddperson_searchEditText);
			searchEditText.requestFocus();
			searchListView.setOnItemClickListener(new OnItemClickListener() {
				@Override
				public void onItemClick(AdapterView<?> parent, View view,
						int position, long id) {
					currentCondition = searchList.get(position);
					// 如果是全部
					if (position == searchList.size() - 1) {
						currentCondition = "";
					}
					searchEditText.setText(currentCondition);
					showDataPanel();
					cancelBtn.setVisibility(View.GONE);
					// 隐藏键盘
					InputMethodManager inputMethodManager = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
					inputMethodManager.hideSoftInputFromWindow(
							searchEditText.getWindowToken(), 0);
					// 加载搜索数据
					startLine = 1;
					progressDlg.show();
					userVOList.clear();
					getUserList(taskId, startLine, count, currentCondition,
							new MyOnVORequestListener(ACTION_REASSIGN_SEARCH));
					personListView.onRefreshComplete();
					searchAdapter.notifyDataSetChanged();
					userAdapter.notifyDataSetChanged();
				}
			});
			// 添加触摸事件
			searchEditText.setOnTouchListener(new OnTouchListener() {
				@Override
				public boolean onTouch(View v, MotionEvent event) {
					if (cancelBtn.getVisibility() == View.GONE) {
						showSearchPanel();
						cancelBtn.setVisibility(View.VISIBLE);
					}
					return false;
				}
			});
			// 添加编辑事件
			searchEditText
					.setOnEditorActionListener(new OnEditorActionListener() {
						@Override
						public boolean onEditorAction(TextView v, int actionId,
								KeyEvent event) {
							if (searchflag
									&& (actionId == EditorInfo.IME_NULL || actionId == EditorInfo.IME_ACTION_SEARCH)) {
								String condition = searchEditText.getText()
										.toString();
								if (!"".equals(condition)) {
									searchflag = false;
									showDataPanel();
									cancelBtn.setVisibility(View.GONE);

									currentCondition = condition;
									condition = condition.replaceAll("\\s*", "");  
									if((!condition.equals(""))){
									String e = taskSearchListData.getHeadElement();
									if (!condition.equals(e)) {
										taskSearchListData.add(condition);
										searchList.clear();
										searchList.addAll(taskSearchListData
												.getStringList());
										searchList.add(getResources()
												.getString(R.string.all));
										searchAdapter.notifyDataSetChanged();
									}}
									// 隐藏键盘
									InputMethodManager inputMethodManager = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
									inputMethodManager.hideSoftInputFromWindow(
											searchEditText.getWindowToken(), 0);
									// 加载搜索数据
									startLine = 1;
									progressDlg.show();
									userVOList.clear();
									getUserList(taskId, startLine, count,
											currentCondition,
											new MyOnVORequestListener(
													ACTION_REASSIGN_SEARCH));
									personListView.onRefreshComplete();
									searchAdapter.notifyDataSetChanged();
									userAdapter.notifyDataSetChanged();
								}
							}
							return false;
						}
					});

			cancelBtn.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					if (cancelBtn.getVisibility() == View.VISIBLE) {
						showDataPanel();
						cancelBtn.setVisibility(View.GONE);
						// 隐藏键盘
						InputMethodManager inputMethodManager = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
						inputMethodManager.hideSoftInputFromWindow(
								searchEditText.getWindowToken(), 0);
					}
				}
			});
			// 转签人员第一次加载
			progressDlg.show();
			getFirstReassignConditionAndUserList(new MyOnVORequestListener(
					ACTION_REASSIGN_FIRST));

		} else if ( ACTION_TYPE_REJECT == actionFlag) {// 退回给人员
			searchPanel.setVisibility(View.GONE);
			personListView.setOnRefreshListener(new OnRefreshListener() {// 上拉刷新
						@Override
						public void onUpRefresh() {// 上拉刷新
							startLine = 1;
							progressDlg.show();
							getRejectNoleList(taskId, startLine, count,
									currentCondition,
									new MyOnVORequestListener(ACTION_REJECT_PEOPLE_SEARCH));
						}

						@Override
						public void onDownRefresh() {// 下拉加载
							startLine = startLine + count;
							getRejectNoleList(taskId, startLine, count,
									currentCondition,
									new MyOnVORequestListener(ACTION_REJECT_PEOPLE_SEARCH));
						}
					});
			// 搜索
			progressDlg.show();
			getRejectNoleList(taskId, startLine, count, currentCondition,
					new MyOnVORequestListener(ACTION_REJECT_PEOPLE_SEARCH));
		}	else if (actionFlag == 0||actionFlag == 2) {// 选择指派人员
			searchPanel.setVisibility(View.GONE);
			personListView.setOnRefreshListener(new OnRefreshListener() {// 上拉刷新
						@Override
						public void onUpRefresh() {// 上拉刷新
							startLine = 1;
							progressDlg.show();
							getAssignList(taskId, startLine, count,
									currentCondition,
									new MyOnVORequestListener(ACTION_ASSIGN_PSN_LIST));
						}

						@Override
						public void onDownRefresh() {// 下拉加载
							startLine = startLine + count;
							getAssignList(taskId, startLine, count,
									currentCondition,
									new MyOnVORequestListener(ACTION_ASSIGN_PSN_LIST));
						}
					});
			// 搜索
			progressDlg.show();
			getAssignList(taskId, startLine, count, currentCondition,
					new MyOnVORequestListener(ACTION_ASSIGN_PSN_LIST));
		}
	}

	private void getAssignList(String taskId, int pageStart, int pageSize,
			String condition, OnVORequestedListener listener) {
		WAActionVO action = new WAActionVO();
		action.setActiontype(ActionTypes.TASK_GETASSIGNPSNLIST);
		action.setServicecode(servicecode);
		Map<String, String> params = new HashMap<String, String>();
			params.put("groupid", "");	
		params.put("usrid", "");
		params.put("taskid", taskId);
		params.put("startline", String.valueOf(pageStart));
		params.put("count", String.valueOf(count));
		params.put("condition", currentCondition);
		action.setParams(params);

		requestVO(CommonServers.getServerAddress(this)
				+ CommonServers.SERVER_SERVLET_WA,
				VOProcessUtil.createMessageRequestVO(this, ComponentIds.A0A007, action),
				listener);
	}

	/**
	 * 处理不同请求的返回结果
	 * 
	 * @author 
	 * 
	 */
	class MyOnVORequestListener implements OnVORequestedListener {
		private String action;

		public MyOnVORequestListener(String action) {
			this.action = action;
		}

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
			if (null != vo && null != vo.getmWAComponentInstancesVO()) {
				showUserListView();
				if (action.equals(ACTION_REJECT_PEOPLE_SEARCH)) {// 驳回的搜索列表
					List<TaskUserVO> list = parseRejectUserListVO(vo
							.getmWAComponentInstancesVO());
					if (list != null && list.size() > 0) {
						if (list.size() < count) {
							personListView.setCanLoad(false);
						} else {
							personListView.setCanLoad(true);
						}
						userVOList.clear();
						userVOList.addAll(list);
						userAdapter.notifyDataSetChanged();
					} else {
						showNoDataPanel();
					}
					personListView.onRefreshComplete();
				} else if (action.equals(ACTION_REASSIGN_FIRST)) {// 转签人员第一次加载
					searchEditText.setHint(parseCondition(vo
							.getmWAComponentInstancesVO()));
					List<TaskUserVO> list = parseUserListVO(vo
							.getmWAComponentInstancesVO());
					if (list != null && list.size() > 0) {
						if (list.size() < count) {
							personListView.setCanLoad(false);
						} else {
							personListView.setCanLoad(true);
						}
						userVOList.addAll(list);
						userAdapter.notifyDataSetChanged();
					} else {
						showNoDataPanel();
					}
					personListView.onRefreshComplete();
				}else if (action.equals(ACTION_ASSIGN_PSN_LIST)) {// 指派的搜索列表
					List<TaskUserVO> list = parseAssignListVO(vo
							.getmWAComponentInstancesVO());
					if (list != null && list.size() > 0) {
						if (list.size() < count) {
							personListView.setCanLoad(false);
						} else {
							personListView.setCanLoad(true);
						}
						if(startLine==1)
						userVOList.clear();
						userVOList.addAll(list);
						userAdapter.notifyDataSetChanged();
					} else {
						showNoDataPanel();
					}
					personListView.onRefreshComplete();
				} else if (action.equals(ACTION_REASSIGN_SEARCH)) {// 搜索
					List<TaskUserVO> list = parseUserListVO(vo
							.getmWAComponentInstancesVO());
					if (list != null && list.size() > 0) {
						if (list.size() < count) {
							personListView.setCanLoad(false);
						} else {
							personListView.setCanLoad(true);
						}
						userVOList.clear();
						userVOList.addAll(list);
						userAdapter.notifyDataSetChanged();
					
					} else {
						if(userVOList.size()==0){
							showNoDataPanel();
						}
					}
					searchflag = true;
					personListView.onRefreshComplete();
				} else if (action.equals(ACTION_UPREFRESH)) {// 刷新
					List<TaskUserVO> list = parseUserListVO(vo
							.getmWAComponentInstancesVO());
					if (list != null && list.size() > 0) {
						if (list.size() < count) {
							personListView.setCanLoad(false);
						} else {
							personListView.setCanLoad(true);
						}
						userVOList.clear();
						userVOList.addAll(list);
						userAdapter.notifyDataSetChanged();
					} else {
						showNoDataPanel();
					}
					personListView.onRefreshComplete();
				} else if (action.equals(ACTION_DOWNLOAD)) {// 加载
					List<TaskUserVO> list = parseUserListVO(vo
							.getmWAComponentInstancesVO());
					if (list != null && list.size() > 0) {
						if (list.size() < count) {
							personListView.setCanLoad(false);
						} else {
							personListView.setCanLoad(true);
						}
						userVOList.addAll(list);
						userAdapter.notifyDataSetChanged();
//						startLine += count;
					} else {
					
						personListView.setCanLoad(false);
						if(userVOList.size()==0){
							showNoDataPanel();
						}
					}
					personListView.onRefreshComplete();
				}
			}
			progressDlg.dismiss();
		}}



		@Override
		public void onVORequestFailed(VOHttpResponse vo) {
			progressDlg.dismiss();
			if (action.equals(ACTION_DOWNLOAD)
					|| action.equals(ACTION_UPREFRESH)) {
				personListView.onRefreshComplete();
			}
			if (action.equals(ACTION_REASSIGN_SEARCH)) {
				searchflag = true;
			}
			if (action.equals(ACTION_DOWNLOAD)) {
				personListView.setCanLoad(false);
			}
		}
	}
	/**
	 * 解析指派的人员列表VO
	 * 
	 * @param waComponentInstancesVO
	 * @return
	 */
	private List<TaskUserVO> parseAssignListVO(
			WAComponentInstancesVO waComponentInstancesVO) {
		ResponseActionVO responseVO = VOProcessUtil.parseMessageVO(
				ComponentIds.A0A007, ActionTypes.TASK_GETASSIGNPSNLIST,
				waComponentInstancesVO);
		List<TaskUserVO> list = new ArrayList<TaskUserVO>();
		switch (responseVO.getFlag()) {
		case 0:
			for (ServiceCodeRes serviceCodeRes : responseVO
					.getServiceCodeList()) {
				ResDataVO resDataVO = serviceCodeRes.getResdata();
				if (resDataVO != null
						&& resDataVO.getList() != null
						&& resDataVO.getList().size() > 0) {
				RejectNodeListVO rejectNodeListVO = (RejectNodeListVO) resDataVO
						.getList().get(0);
				List<RejectVO> rejectUserList = rejectNodeListVO.getReject();
				for (RejectVO r : rejectUserList) {
					TaskUserVO user = new TaskUserVO();
					user.setPsnId(r.getId());
					user.setPsnName(r.getNodename());
					user.setPsnCode(r.getNodeid());
					list.add(user);
				}
			}
			}
			break;
		default:
			toastMsg(responseVO.getDesc());
			break;
		}
		return list;
	}
	private void showNoDataPanel() {
		dataPanel.setVisibility(View.VISIBLE);
		noDataPanel.setVisibility(View.VISIBLE);
		personListView.setVisibility(View.GONE);
		searchListView.setVisibility(View.GONE);
	}

	private void showDataPanel() {
		dataPanel.setVisibility(View.VISIBLE);
		searchListView.setVisibility(View.GONE);
	}

	private void showSearchPanel() {
		dataPanel.setVisibility(View.GONE);
		searchListView.setVisibility(View.VISIBLE);
	}

	private void showUserListView() {
		dataPanel.setVisibility(View.VISIBLE);
		personListView.setVisibility(View.VISIBLE);
		noDataPanel.setVisibility(View.GONE);
		searchListView.setVisibility(View.GONE);
	}

	/**
	 * 获取用户列表
	 * 
	 * @param taskId
	 * @param pageStart
	 * @param pageSize
	 * @param condition
	 * @param listener
	 */
	private void getUserList(String taskId, int pageStart, int pageSize,
			String condition, OnVORequestedListener listener) {
		
		if(condition.contains("!")||
			condition.contains("@")||
			condition.contains("#")||
			condition.contains("$")||
			condition.contains("<")||
			condition.contains(">")||
			condition.contains("&")||
			condition.contains("*")||
			condition.contains("%")){
			toastMsg(getString(R.string.forbiddencharacter));
			personListView.onRefreshComplete();
			progressDlg.dismiss();
			}else{
		WAActionVO action = new WAActionVO();
		action.setActiontype(ActionTypes.TASK_GETUSERLIST);
		action.setServicecode(servicecode);
		Map<String, String> params = new HashMap<String, String>();
		params.put("groupid", "");
		params.put("usrid", "");
		params.put("taskid", taskId);
		params.put("startline", String.valueOf(pageStart));
		params.put("count", String.valueOf(count));
		params.put("condition", currentCondition);
		action.setParams(params);

		requestVO(CommonServers.getServerAddress(this)
				+ CommonServers.SERVER_SERVLET_WA,
				VOProcessUtil.createMessageRequestVO(this, ComponentIds.A0A007, action),
				listener);}
	}

	/**
	 * 获取查询条件
	 * 
	 * @param listener
	 */
	private void getFirstReassignConditionAndUserList(
			OnVORequestedListener listener) {
		List<WAActionVO> actionList = new ArrayList<WAActionVO>();
		WAActionVO action = new WAActionVO();
		action.setActiontype(ActionTypes.TASK_GETREASSIGNCONDITION);
		action.setServicecode(servicecode);
		Map<String, String> params = new HashMap<String, String>();
		params.put("groupid", "");
		params.put("usrid", "");
		action.setParams(params);
		actionList.add(action);
		// 添加获取审批详情列表的action
		action = new WAActionVO();
		action.setActiontype(ActionTypes.TASK_GETUSERLIST);
		action.setServicecode(servicecode);
		params.put("groupid", "");
		params.put("usrid", "");
		params.put("taskid", taskId);
		params.put("startline", String.valueOf(startLine));
		params.put("count", String.valueOf(count));
		params.put("condition", currentCondition);
		action.setParams(params);
		actionList.add(action);
		// 发送请求
		requestVO(
				CommonServers.getServerAddress(this)
						+ CommonServers.SERVER_SERVLET_WA,
				VOProcessUtil.createMessageRequestVO(this, ComponentIds.A0A007, actionList),
				listener);
	}

	/**
	 * 获取退给用户列表
	 * 
	 * @param taskId
	 * @param pageStart
	 * @param pageSize
	 * @param condition
	 * @param listener
	 */
	private void getRejectNoleList(String taskId, int pageStart, int pageSize,
			String condition, OnVORequestedListener listener) {
		if(condition.contains("!")||
				condition.contains("@")||
				condition.contains("#")||
				condition.contains("$")||
				condition.contains("<")||
				condition.contains(">")||
				condition.contains("&")||
				condition.contains("*")||
				condition.contains("%")){
			toastMsg(getString(R.string.forbiddencharacter));
				personListView.onRefreshComplete();
				progressDlg.dismiss();
			}else{
		WAActionVO action = new WAActionVO();
		action.setServicecode(servicecode);
		action.setActiontype(ActionTypes.TASK_GETREJECTNOLELIST);
		Map<String, String> params = new HashMap<String, String>();
		params.put("groupid", "");
		params.put("usrid", "");
		params.put("taskid", taskId);
		params.put("startline", String.valueOf(pageStart));
		params.put("count", String.valueOf(pageSize));
		params.put("condition", condition);
		action.setParams(params);
		requestVO(CommonServers.getServerAddress(this)
				+ CommonServers.SERVER_SERVLET_WA,
				VOProcessUtil.createMessageRequestVO(this, ComponentIds.A0A007, action),
				listener);}
	}

	private String parseCondition(WAComponentInstancesVO vo) {
		try {
			ResponseActionVO responseVO = VOProcessUtil
					.parseMessageVO(ComponentIds.A0A007,
							ActionTypes.TASK_GETREASSIGNCONDITION, vo);
			if(responseVO.getServiceCodeList()!= null){
			switch (responseVO.getFlag()) {
			case 0:
				SearchConditionVO searchvo =(SearchConditionVO)responseVO.getServiceCodeList().get(0).getResdata().getList().get(0);
				return searchvo.getConditiondesc();
			default:
				toastMsg(responseVO.getDesc());
				break;
			}}	
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

	/**
	 * 解析搜索的人员列表VO
	 * 
	 * @param waComponentInstancesVO
	 * @return
	 */
	private List<TaskUserVO> parseRejectUserListVO(
			WAComponentInstancesVO waComponentInstancesVO) {
		ResponseActionVO responseVO = VOProcessUtil.parseMessageVO(
				ComponentIds.A0A007, ActionTypes.TASK_GETREJECTNOLELIST,
				waComponentInstancesVO);
		List<TaskUserVO> list = new ArrayList<TaskUserVO>();
		switch (responseVO.getFlag()) {
		case 0:
			for (ServiceCodeRes serviceCodeRes : responseVO
					.getServiceCodeList()) {
				ResDataVO resDataVO = serviceCodeRes.getResdata();
				if (resDataVO != null
						&& resDataVO.getList() != null
						&& resDataVO.getList().size() > 0) {
				RejectNodeListVO rejectNodeListVO = (RejectNodeListVO) resDataVO
						.getList().get(0);
				List<RejectVO> rejectUserList = rejectNodeListVO.getReject();
				for (RejectVO r : rejectUserList) {
					TaskUserVO user = new TaskUserVO();
					user.setPsnId(r.getId());
					user.setPsnName(r.getNodename());
					user.setPsnCode(r.getNodeid());
					list.add(user);
				}
			}
			}
			break;
		default:
			toastMsg(responseVO.getDesc());
			break;
		}
		return list;
	}

	/**
	 * 解析搜索的人员列表VO
	 * 
	 * @param waComponentInstancesVO
	 * @return
	 */
	private List<TaskUserVO> parseUserListVO(
			WAComponentInstancesVO waComponentInstancesVO) {
		ResponseActionVO responseVO = VOProcessUtil.parseMessageVO(
				ComponentIds.A0A007, ActionTypes.TASK_GETUSERLIST,
				waComponentInstancesVO);
		List<TaskUserVO> list = new ArrayList<TaskUserVO>();
		switch (responseVO.getFlag()) {
		case 0:
			for (ServiceCodeRes serviceCodeRes : responseVO
					.getServiceCodeList()) {
				ResDataVO resDataVO = serviceCodeRes.getResdata();
				if (resDataVO != null
						&& resDataVO.getList() != null
						&& resDataVO.getList().size() > 0) {
				if(resDataVO.getList() != null &&resDataVO.getList().size()>0){
				UserListVO userListVO = (UserListVO) resDataVO.getList().get(0);
				List<UserVO> userList = userListVO.getUser();
				for (UserVO u : userList) {
					TaskUserVO user = new TaskUserVO();
					user.setPsnId(u.getPsnid());
					user.setPsnName(u.getPsnname());
					user.setPsnCode(u.getPsncode());
					list.add(user);
				}
			}}
			}
			break;
		default:
			toastMsg(responseVO.getDesc());
			break;
		}
		return list;
	}
}
