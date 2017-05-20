package wa.android.task.activity;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import nc.vo.oa.component.struct.ParamTagVO;
import nc.vo.oa.component.struct.ResDataVO;
import nc.vo.oa.component.struct.ServiceCodeRes;
import nc.vo.oa.component.taskcenter.TaskButtonInfoVO;
import nc.vo.oa.component.taskcenter.TaskButtonVO;
import nc.vo.oa.component.taskcenter.TaskListVO;
import wa.android.app.task.R;
import wa.android.common.App;
import wa.android.common.UMProgressDialog;
import wa.android.common.activity.BaseActivity;
import wa.android.common.vo.ResponseActionVO;
import wa.android.common.vo.VOProcessUtil;
import wa.android.constants.CommonGlobalVariables;
import wa.android.constants.CommonServers;
import wa.android.constants.CommonWAIntents;
import wa.android.constants.CommonWAPreferences;
import wa.android.common.networkold.VOHttpResponse;
import wa.android.libs.btngroupview.WAButtonDrawables;
import wa.android.libs.btngroupview.WAButtonGroupView;
import wa.android.libs.btngroupview.WAButtonGroupView.OnActionListener;
import wa.android.libs.extlistview.WAEXLoadListView;
import wa.android.libs.extlistview.WAEXLoadListView.OnRefreshListener;
import wa.android.task.adapter.TaskListAdapter;
import wa.android.task.constants.ActionTypes;
import wa.android.task.constants.ComponentIds;
import wa.android.task.util.ParseListSort;
import wa.android.task.vo.TaskBtnVO;
import wa.android.task.vo.TaskGroupVO;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.TextView;

/**
 * 审批任务列表
 * 
 * @author candy
 */
public class TaskMainActivity extends BaseActivity implements OnActionListener {
	private final String ACTION_CHANGE_ACTION = "changeAction";
	private final String ACTION_CHANGE_TASKLIST = "changeTaskListAction";// 更换页签获取任务列表
	private final String ACTION_DOWNREFRESH_TASKLIST = "downRefreshTaskListAction";// 下拉刷新获取任务列表
	private final String ACTION_UPLOAD_TASKLIST = "upLoadTaskListAction";// 上拉加载获取任务列表

	private WAEXLoadListView taskExListView;// 列表
	private UMProgressDialog progressDlg;// 提示框
	private WAButtonGroupView taskBtnGroupView;// 按钮页签
	private View noDataView;// 没有数据页面
	private boolean issessiontimeOut = false;
	// //获取列表的参数
	private String currentStatusCode = "";
	private String currentStatusKey = "ishandled";// 默认参数，没有用
	private int currentStartLine = 1;
	private int pageSize = 25;
	private int count = 0;

	private List<TaskBtnVO> taskBtnList;
	private List<TaskGroupVO> taskGroupList;
	private TaskListAdapter adapter;
	private boolean ishandled = true; 
	private boolean issingleservicecode = true ;


	//
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		progressDlg = new UMProgressDialog(this);
		setContentView(R.layout.activity_task_main);
		// 初始化标题
		initTitleView();
		initView();

	}

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		progressDlg.show();
		// 初始化数据
		currentStartLine = 1;
		getTaskList(currentStatusKey, currentStatusCode,
				getCurrentDate(), currentStartLine, pageSize,
				new MyOnVoRequestListener(ACTION_DOWNREFRESH_TASKLIST));
		
	}
	/**
	 * 初始化导航界面
	 */
	private void initTitleView() {
		// 设置头部信息
		final TextView titleTextView = (TextView) findViewById(R.id.titlePanel_titleTextView);
		titleTextView.setText(R.string.todo);
		final Button rightBtn = (Button) findViewById(R.id.titlePanel_rightBtn);
		rightBtn.setText(R.string.submission);
		rightBtn.setBackgroundResource(R.drawable.title_button_blank_bg);
		rightBtn.setVisibility(View.VISIBLE);
		rightBtn.setTextColor(Color.WHITE);
		rightBtn.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				currentStartLine = 1;
				progressDlg.show();
				if (ishandled) {
					titleTextView.setText(R.string.submission);
					rightBtn.setText(R.string.todo);
					currentStatusKey = "submit";

					
				} else {
					titleTextView.setText(R.string.todo);
					rightBtn.setText(R.string.submission);
					currentStatusKey = "ishandled";
				}
				getTaskBtnAndList(currentStatusKey, new MyOnVoRequestListener(
						ACTION_CHANGE_ACTION));
				ishandled = !ishandled;
			}
		});
	}

	private void initView() {

		progressDlg.setProperty("value", "loading...");
		// 设置按钮
		Button setBtn = (Button) findViewById(R.id.msgmain_setBtn);
		setBtn.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				startActivity(CommonWAIntents
						.getSETTING_ACTIVITY(TaskMainActivity.this));
			}
		});
		noDataView = findViewById(R.id.taskMain_nodataPanel);
		taskBtnGroupView = (WAButtonGroupView) findViewById(R.id.taskMain_buttonGroupView);
		// 拿到登陆后返回的vo
		
		VOHttpResponse vo = (VOHttpResponse) ((App) getApplicationContext())
				.getGlobalVariables(CommonGlobalVariables.AFTER_LOGIN_VOHTTPRESPONSE);
		if (vo!= null){
		// 填充按钮
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
		ResponseActionVO responseVO = VOProcessUtil.parseTaskVO(
				ComponentIds.A0A007, ActionTypes.TASK_GETTASKBUTTONLIST,
				vo.getmWAComponentInstancesVO());

		updateBtns(responseVO);

		taskGroupList = new ArrayList<TaskGroupVO>();
		taskExListView = (WAEXLoadListView) findViewById(R.id.taskMain_taskListExListView);
		adapter = new TaskListAdapter(this, taskGroupList);
		taskExListView.setAdapter(adapter);
		// 初始化上拉下拉
		taskExListView.setOnRefreshListener(new OnRefreshListener() {
			@Override
			public void onUpRefresh() {// 下拉刷新
				progressDlg.show();
				// 初始化数据
				currentStartLine = 1;
				getTaskList(currentStatusKey, currentStatusCode,
						getCurrentDate(), currentStartLine, pageSize,
						new MyOnVoRequestListener(ACTION_DOWNREFRESH_TASKLIST));

			}

			@Override
			public void onDownRefresh() {// 上拉加载
				progressDlg.show();
				// 初始化数据
				currentStartLine = currentStartLine + pageSize;
				getTaskList(currentStatusKey, currentStatusCode,
						getCurrentDate(), currentStartLine, pageSize,
						new MyOnVoRequestListener(ACTION_UPLOAD_TASKLIST));
			}

		});

		taskExListView.setOnChildClickListener(new OnChildClickListener() {

			@Override
			public boolean onChildClick(ExpandableListView parent, View v,
					int groupPosition, int childPosition, long id) {
				// 跳转到详情界面
				TaskGroupVO data = taskGroupList.get(groupPosition);
				String taskId = data.getItemValue(childPosition, "taskId");
				String servicecode = data.getItemValue(childPosition,
						"servicecode");
				Intent intent = new Intent();
				intent.putExtra("taskId", taskId);
				intent.putExtra("servicecode", servicecode);
				intent.putExtra("statuskey", currentStatusKey);
				intent.putExtra("statuscode", currentStatusCode);
				intent.setClass(TaskMainActivity.this, TaskDetailActivity.class);
				startActivity(intent);
				return false;
			}
		});
		// 填充信息列表
		responseVO = VOProcessUtil.parseMessageVO(ComponentIds.A0A007,
				ActionTypes.TASK_GETTASKLIST, vo.getmWAComponentInstancesVO());

		List<TaskGroupVO> list = parseTaskList(responseVO);
		if (list == null || list.size() <= 0) {
			showNoDataImageView();
		} else {
			showListView();
			// 设置是否还有新的加载数据
			if(responseVO.getServiceCodeList().size() >=2)
			{
				taskExListView.setCanLoad(false);
			}else{
				if (calTaskListSize(list) < pageSize)
					taskExListView.setCanLoad(false);
				else
				taskExListView.setCanLoad(true);
			}
			taskGroupList.clear();
			taskGroupList.addAll(list);
			adapter.notifyDataSetChanged();
			expandListView();
		}
		}}
		else{
			toastMsg(getString(R.string.error_unknown));
			finish();
		}
	}

	@Override
	public boolean doAction(String btnName, int index) {

		currentStartLine = 1;
		currentStatusCode = taskBtnList.get(index).getCode();
		progressDlg.show();
		getTaskList(currentStatusKey, currentStatusCode, getCurrentDate(),
				currentStartLine, pageSize, new MyOnVoRequestListener(
						ACTION_CHANGE_TASKLIST));
		return true;
	}

	private List<TaskGroupVO> parseTaskList(ResponseActionVO responseVO) {
		List<TaskGroupVO> groupList = null;

		switch (responseVO.getFlag()) {
		case 0:
			groupList = new ArrayList<TaskGroupVO>();
			for (ServiceCodeRes serviceCodeRes : responseVO
					.getServiceCodeList()) {
				ResDataVO resDataVO = serviceCodeRes.getResdata();
				if (resDataVO != null) {
					TaskListVO taskListVO = (TaskListVO) resDataVO.getList()
							.get(0);
					List<nc.vo.oa.component.taskcenter.TaskGroupVO> taskGroupList = taskListVO
							.getGroup();
					for (nc.vo.oa.component.taskcenter.TaskGroupVO groupVO : taskGroupList) {
						boolean iscontaingroup = false;
						TaskGroupVO taskGroup = new TaskGroupVO(groupVO,
								serviceCodeRes.getServicecode());
//						//任务去重
//						for (int i = 0 ; i < taskGroup.getItems().size() ;i ++){
//							for (int j = i+1 ; j < taskGroup.getItems().size() ;j ++){
//								if(taskGroup.getItem(i).get("title").equals(taskGroup.getItem(j).get("title"))){
//									taskGroup.getItems().remove(j);
//								}
//								
//							}
//						
//						}
						for (int i = 0 ; i<groupList.size() ; i ++ ){
						if(	groupList.get(i).getGroupName().equals(taskGroup.getGroupName())){
							iscontaingroup = true;
							taskGroup.addItems(groupList.get(i).getItems());
							groupList.set(i, taskGroup)	;
						}
						}
						if(!iscontaingroup){
							groupList.add(taskGroup);	
						}
					
					}
				}
			}
			groupList = sortTaskList(groupList);
			break;
		default:
			break;
		}
		return groupList;
	}

	private List<TaskGroupVO> sortTaskList(List<TaskGroupVO> groupList) {
		List<TaskGroupVO> resGroupList = new ArrayList<TaskGroupVO>();
		// TODO Auto-generated method stub

		
		List<String> groupTimeList = new ArrayList<String>();

		for ( int i = 0 ; i < groupList.size() ; i ++){
			List<Map<String, String>> innergroupTimeList = new ArrayList<Map<String, String>>();	
		
			for(int j = 0 ; j < groupList.get(i).getItemsSize() ; j++){
				innergroupTimeList.add(groupList.get(i).getItems().get(j));
			}
			groupList.get(i).getItems().clear();
			for(Map<String, String> data :ParseListSort.ParseSubList(innergroupTimeList)){
				groupList.get(i).getItems().add(data);
			}
			groupTimeList.add(groupList.get(i).getItem(0).get("date"));
		}
		for (String groupdata: ParseListSort.ParseList(groupTimeList)){
			for (int i = 0 ; i <groupList.size() ; i++){
				if(groupList.get(i).getItem(0).get("date").equals(groupdata)){
					resGroupList.add(groupList.get(i));
				}
			}
			
		}
		return resGroupList;
	}

	private void updateBtns(ResponseActionVO responseVO) {
		switch (responseVO.getFlag()) {
		case 0:
			taskBtnList = new ArrayList<TaskBtnVO>();
			List<String> btnsName = new ArrayList<String>();
			if(responseVO
					.getServiceCodeList()!=null){
			for (ServiceCodeRes serviceCodeRes : responseVO
					.getServiceCodeList()) {
				ResDataVO resDataVO = serviceCodeRes.getResdata();
				TaskButtonInfoVO taskButtonInfoVO = (TaskButtonInfoVO) resDataVO
						.getList().get(0);
				List<TaskButtonVO> taskButtonVOList = taskButtonInfoVO
						.getButtonlist();
				for (TaskButtonVO btnVO : taskButtonVOList) {
					TaskBtnVO btn = new TaskBtnVO(btnVO);
					taskBtnList.add(btn);
					btnsName.add(btnVO.getStatusname());
				}
				currentStatusCode = taskButtonVOList.get(0).getStatuscode();
				taskBtnGroupView.setVisibility(View.VISIBLE);
				taskBtnGroupView.setData(btnsName, WAButtonDrawables
						.getBtnDrawablesPressed(btnsName.size()),
						WAButtonDrawables.getBtnDrawablesUnPress(btnsName
								.size()), this);
				break;
			}}
			else{
				taskBtnGroupView.setVisibility(View.GONE);
			}
			break;
		default:
			break;
		}
	}

	private void getTaskBtnAndList(String statuskey,
			OnVORequestedListener listener) {
		Map<String, Map<String, String>> actionsMap = new HashMap<String, Map<String, String>>();
		Map<String, String> params = new HashMap<String, String>();
			params.put("groupid", "");	
		params.put("usrid", "");
		params.put("status", statuskey);
		actionsMap.put(ActionTypes.TASK_GETTASKBUTTONLIST, params);
		params = new HashMap<String, String>();
			params.put("groupid", "");	
		params.put("usrid", "");
		params.put("statuscode", "");
		params.put("statuskey", statuskey);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		params.put("date", sdf.format(System.currentTimeMillis()));
		params.put("startline", "1");
		params.put("count", "25");
		actionsMap.put(ActionTypes.TASK_GETTASKLIST, params);

		requestVO(
				CommonServers.getServerAddress(this)
						+ CommonServers.SERVER_SERVLET_WA,
				VOProcessUtil.createMessageRequestVO(this, ComponentIds.A0A007, actionsMap),
				listener);
	}

	private void getTaskList(String statuskey, String statusCode, String date,
			int startline, int count, OnVORequestedListener listener) {
		ParamTagVO[] params = new ParamTagVO[7];
		String groupId = readPreference(CommonWAPreferences.GROUP_ID);
		String userId = readPreference(CommonWAPreferences.USER_ID);
		params[0] = new ParamTagVO("groupid", groupId);
		params[1] = new ParamTagVO("usrid", userId);
		params[2] = new ParamTagVO("statuscode", statusCode);
		params[3] = new ParamTagVO("statuskey", statuskey);
		params[4] = new ParamTagVO("date", date);
		params[5] = new ParamTagVO("startline", String.valueOf(startline));
		params[6] = new ParamTagVO("count", String.valueOf(count));
		requestVOex(CommonServers.getServerAddress(this)
				+ CommonServers.SERVER_SERVLET_WA, ComponentIds.A0A007,
				ActionTypes.TASK_GETTASKLIST, listener, params);
	}

	/**
	 * 获取当前时间
	 */
	private String getCurrentDate() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		return sdf.format(System.currentTimeMillis()).toString();
	}

	/**
	 * 显示无数据
	 */
	private void showNoDataImageView() {
		noDataView.setVisibility(View.VISIBLE);
		taskExListView.setVisibility(View.GONE);
	}

	/**
	 * 展开所有的数据项
	 */
	private void expandListView() {
		for (int i = 0; i < taskGroupList.size(); i++) {
			taskExListView.expandGroup(i);
		}
	}

	/**
	 * 显示列表
	 */
	private void showListView() {
		noDataView.setVisibility(View.GONE);
		taskExListView.setVisibility(View.VISIBLE);
	}

	/**
	 * 计算获取的数据数量
	 * 
	 * @param data
	 * @return
	 */
	private int calTaskListSize(List<TaskGroupVO> data) {
		int size = 0;
		for (TaskGroupVO m : data) {
			size += m.size();
		}
		return size;
	}

	/**
	 * 合并
	 * 
	 * @param list
	 */
	private void getNewList(List<TaskGroupVO> list) {
		int oSize = taskGroupList.size();
		int nSize = list.size();
		if (taskGroupList.get(oSize - 1).getGroupName()
				.equals(list.get(0).getGroupName())) {
			List<Map<String, String>> items = list.get(0).getItems();
			taskGroupList.get(oSize - 1).getItems().addAll(items);
			if (nSize > 1) {
				for (int i = 1; i < nSize; i++) {
					taskGroupList.add(list.get(i));
				}
			}
		} else {
			taskGroupList.addAll(list);
		}
	}

	/**
	 * 集体处理请求响应的类
	 * 
	 * @author candy
	 * 
	 */
	class MyOnVoRequestListener implements OnVORequestedListener {
		private String action;

		public MyOnVoRequestListener(String action) {
			this.action = action;
		}

		// 加载成功
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
				
				ResponseActionVO responseVO = VOProcessUtil.parseMessageVO(
						ComponentIds.A0A007, ActionTypes.TASK_GETTASKLIST,
						vo.getmWAComponentInstancesVO());
				if (!(responseVO.getServiceCodeList().size() < 2)){
					issingleservicecode = false ;
					taskExListView.setCanLoad(false);
				}
				showListView();
				List<TaskGroupVO> list = parseTaskList(responseVO);
				if (action.equals(ACTION_CHANGE_ACTION)) {
					// 填充按钮
					responseVO = VOProcessUtil.parseMessageVO(ComponentIds.A0A007,
							ActionTypes.TASK_GETTASKBUTTONLIST,
							vo.getmWAComponentInstancesVO());
					updateBtns(responseVO);
				}
				if (list != null && list.size() > 0) {
					// 设置是否还有新的加载数据
					if (!issingleservicecode)
						taskExListView.setCanLoad(false);
					else{
						if (calTaskListSize(list) < pageSize){
							toastMsg(getString(R.string.nomoredata));
							taskExListView.setCanLoad(false);	
						}
						else
						taskExListView.setCanLoad(true);}
					if (action.equals(ACTION_CHANGE_TASKLIST)) {// 标签切换请求的消息列表
						// 先清空然后再加入数据进行刷新
						taskGroupList.clear();
						taskGroupList.addAll(list);
						adapter.notifyDataSetChanged();
						taskExListView.setSelection(0);
					} else if (action.equals(ACTION_DOWNREFRESH_TASKLIST)) {//下拉刷新
						taskGroupList.clear();
						taskGroupList.addAll(list);
						adapter.notifyDataSetChanged();
						taskExListView.onRefreshComplete();
					} else if (action.equals(ACTION_UPLOAD_TASKLIST)) {// 上拉加载的获取消息列表
						getNewList(list);
						adapter.notifyDataSetChanged();
						taskExListView.onRefreshComplete();

						
					} else if (action.equals(ACTION_CHANGE_ACTION)) {
						taskGroupList.clear();
						taskGroupList.addAll(list);
						adapter.notifyDataSetChanged();
						taskExListView.setSelection(0);
					}
					expandListView();
				} else {
					if (currentStartLine == 1){
					showNoDataImageView();}
					else{
						taskExListView.setCanLoad(false);
						toastMsg(getString(R.string.nomoredata));
						taskExListView.onRefreshComplete();
					}
				}
				progressDlg.dismiss();
			} else {
				showNoDataImageView();
				taskExListView.onRefreshComplete();
				progressDlg.dismiss();
			}
			// 加载框消失
			progressDlg.dismiss();
		}}

		@Override
		public void onVORequestFailed(VOHttpResponse vo) {
			showNoDataImageView();
			progressDlg.dismiss();
			if (action.equals(ACTION_UPLOAD_TASKLIST)
					|| action.equals(ACTION_DOWNREFRESH_TASKLIST)) {
				taskExListView.onRefreshComplete();
			}
			if (action.equals(ACTION_UPLOAD_TASKLIST)) {
				taskExListView.setCanLoad(false);
			}
		}

	}
}
