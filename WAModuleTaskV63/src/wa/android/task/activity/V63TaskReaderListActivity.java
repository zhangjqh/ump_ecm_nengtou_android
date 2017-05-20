package wa.android.task.activity;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import nc.vo.oa.component.struct.ParamTagVO;
import nc.vo.oa.component.struct.ResDataVO;
import nc.vo.oa.component.struct.ServiceCodeRes;
import nc.vo.oa.component.taskcenter.TaskButtonInfoVO;
import nc.vo.oa.component.taskcenter.TaskButtonVO;

import com.example.wamoduletaskv63.R;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ExpandableListView.OnChildClickListener;
import wa.android.common.App;
import wa.android.common.UMProgressDialog;
import wa.android.common.activity.BaseActivity;
import wa.android.common.networkold.VOHttpResponse;
import wa.android.common.vo.ResponseActionVO;
import wa.android.common.vo.VOProcessUtil;
import wa.android.constants.CommonServers;
import wa.android.constants.CommonWAPreferences;
import wa.android.libs.btngroupview.WAButtonDrawables;
import wa.android.libs.btngroupview.WAButtonGroupView;
import wa.android.libs.btngroupview.WAButtonGroupView.OnActionListener;
import wa.android.libs.extlistview.WAEXLoadListView;
import wa.android.libs.extlistview.WAEXLoadListView.OnRefreshListener;
import wa.android.task.adapter.V63TaskListAdapter;
import wa.android.task.constants.ActionTypes;
import wa.android.task.constants.ComponentIds;
import wa.android.task.util.ParseListSort;
import wa.android.task.vo.TaskBtnVO;
import wa.android.v63task.constants.V63ActionTypes;
import wa.android.v63task.data.V63TaskGroupVO;
import wa.android.v63task.data.V63TaskListVO;
import wa.android.v63task.data.V63TaskVO;

public class V63TaskReaderListActivity extends BaseActivity implements OnActionListener{
	private static final int REQUEST_CODE = 1;
	private final String ACTION_CHANGE_ACTION = "changeAction";
	private final String ACTION_CHANGE_TASKLIST = "changeTaskListAction";// 更换页签获取任务列表
	private final String ACTION_DOWNREFRESH_TASKLIST = "downRefreshTaskListAction";// 下拉刷新获取任务列表
	private final String ACTION_UPLOAD_TASKLIST = "upLoadTaskListAction";// 上拉加载获取任务列表
	private final String ACTION_GET_BUTTON = "getButtonList";

	private WAEXLoadListView taskExListView;// 列表
	private UMProgressDialog progressDlg;// 提示框
	private WAButtonGroupView taskBtnGroupView;// 按钮页签
	private View noDataView;// 没有数据页面
	private boolean issessiontimeOut = false;
	// //获取列表的参数
	private String currentStatusCode = "";
	private String currentStatusKey = "mypieces";// 默认参数，没有用
	private int currentStartLine = 1;
	private int pageSize = CommonWAPreferences.WA_UNHANDLED_QUERY_COUNT;
	private int count = 0;

	private List<TaskBtnVO> taskBtnList;
	private List<V63TaskGroupVO> taskGroupList;
	private V63TaskListAdapter adapter;
	private boolean ishandled = true; 
	private boolean issingleservicecode = true ;
	private String firststatus = "";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_task_main);
		progressDlg = new UMProgressDialog(this);
		if(null!=((App)getApplication()).getGlobalVariables("isrefreshlist")&&((App)getApplication()).getGlobalVariables("isrefreshlist").equals("true")){

//			currentStatusKey = (String)((App)getApplication()).getGlobalVariables("statuskey");
			currentStatusCode = (String)((App)getApplication()).getGlobalVariables("statuscode");
			((App)getApplication()).addGlobalVariable("isrefreshlist","false");
			((App) getApplication()).addGlobalVariable("statuskey","");
		}
		init();
	}
//	@Override
//	protected void onResume() {
//		// TODO Auto-generated method stub
//		super.onResume();
////		if(null!=((App)getApplication()).getGlobalVariables("isrefreshlist")&&((App)getApplication()).getGlobalVariables("isrefreshlist").equals("true")){
////			currentStatusKey = (String)((App)getApplication()).getGlobalVariables("statuskey");
////			currentStatusCode = (String)((App)getApplication()).getGlobalVariables("statuscode");
////		}
//		progressDlg.show();
//		// 初始化数据
//		currentStartLine = 1;
//		currentStatusCode = firststatus;
//		getTaskListandButtonList(currentStatusKey, currentStatusCode,
//				getCurrentDate(), currentStartLine, pageSize,
//				new MyOnVoRequestListener(ACTION_GET_BUTTON));
//	}

//	private void initData() {
//		// TODO Auto-generated method stub
//		progressDlg.show();
//		// 初始化数据
//		currentStartLine = 1;
//		getTaskList(currentStatusKey, currentStatusCode,
//				getCurrentDate(), currentStartLine, pageSize,
//				new MyOnVoRequestListener(ACTION_DOWNREFRESH_TASKLIST));
//	}
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
				V63ActionTypes.TASK_GETTASKLIST, listener, params);
	}
	
	private void getTaskListandButtonList(String statuskey, String statusCode, String date,
			int startline, int count, OnVORequestedListener listener) {
		String groupId = readPreference(CommonWAPreferences.GROUP_ID);
		String userId = readPreference(CommonWAPreferences.USER_ID);
		Map<String, Map<String, String>> actionsMap = new HashMap<String, Map<String, String>>();
		Map<String, String> params = new HashMap<String, String>();
		params.put("groupid", groupId);
		params.put("usrid", userId);
		params.put("statuscode", statusCode);
		params.put("statuskey", statuskey);
		params.put("date", date);
		params.put("startline", String.valueOf(startline));
		params.put("count", String.valueOf(count));
		actionsMap.put(V63ActionTypes.TASK_GETTASKLIST, params);
		params = new HashMap<String, String>();
		params.put("groupid", "");
		params.put("usrid", "");
		params.put("status", currentStatusKey);
		actionsMap.put(ActionTypes.TASK_GETTASKBUTTONLIST, params);
		
		requestVO(CommonServers.getServerAddress(this)
				+ CommonServers.SERVER_SERVLET_WA, VOProcessUtil.createMessageRequestVO(this, ComponentIds.A0A007, actionsMap), listener) ;
	}


	private void init() {
		// TODO Auto-generated method stub
		initTitleView();
		// 头部返回按钮的设置
		Button backButton = (Button) findViewById(R.id.titlePanel_backBtn);
		backButton.setVisibility(View.VISIBLE);
		backButton.setText("");
		backButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				finish();
			}
		});
		progressDlg.show();
		// 初始化数据
		currentStartLine = 1;
		getTaskListandButtonList(currentStatusKey, currentStatusCode,
				getCurrentDate(), currentStartLine, pageSize,
				new MyOnVoRequestListener(ACTION_GET_BUTTON));
	}

	private void initTitleView() {
		// 设置头部信息
//		final RelativeLayout relativelayout = (RelativeLayout) findViewById(R.id.titlepanel);
//		relativelayout.setVisibility(View.GONE);

		final TextView titleTextView = (TextView) findViewById(R.id.titlePanel_titleTextView);
		titleTextView.setText(getIntent().getStringExtra("title"));
//		final Button rightBtn = (Button) findViewById(R.id.titlePanel_rightBtn);
//		rightBtn.setVisibility(View.GONE);
		
		progressDlg.setProperty("value", "loading...");
		// 设置按钮
		
		LinearLayout bottomlinearlayout = (LinearLayout) findViewById(R.id.bottomlinearlayout);
		bottomlinearlayout.setVisibility(View.GONE);
		noDataView = findViewById(R.id.taskMain_nodataPanel);
		taskBtnGroupView = (WAButtonGroupView) findViewById(R.id.taskMain_buttonGroupView);
		
		taskGroupList = new ArrayList<V63TaskGroupVO>();
		taskExListView = (WAEXLoadListView) findViewById(R.id.taskMain_taskListExListView);
		adapter = new V63TaskListAdapter(this, taskGroupList);
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
				V63TaskGroupVO data = taskGroupList.get(groupPosition);
				String taskId = data.getItemValue(childPosition, "taskId");
				String servicecode = data.getItemValue(childPosition,
						"servicecode");
				//区分oa和nc的单据  （nc  priority==null，isreminder==null）
				String priority = data.getItemValue(childPosition, "priority");
				String isreminder = data.getItemValue(childPosition, "isreminder");
				//解决请求参数报错问题
				if(currentStatusCode==null||currentStatusCode.equals("")){
					currentStatusCode = "unhandled";
				}
				Intent intent = new Intent();
				intent.putExtra("taskId", taskId);
				intent.putExtra("servicecode", servicecode);
				intent.putExtra("statuskey", currentStatusKey);
				intent.putExtra("statuscode", currentStatusCode);
				intent.putExtra("priority", priority);
				intent.putExtra("isreminder", isreminder);
				intent.setClass(V63TaskReaderListActivity.this, V63TaskDetailActivity.class);
				//startActivity(intent);
				startActivityForResult(intent, REQUEST_CODE);
				return false;
			}
		});
	}
	
	

	@SuppressWarnings({ "unchecked", "rawtypes" })
	private List<V63TaskGroupVO> parseTaskList(ResponseActionVO responseVO) {
		List<V63TaskGroupVO> groupList = null;

		switch (responseVO.getFlag()) {
		case 0:
			groupList = new ArrayList<V63TaskGroupVO>();
			for (ServiceCodeRes serviceCodeRes : responseVO
					.getServiceCodeList()) {
				ResDataVO resDataVO = serviceCodeRes.getResdata();

				if (resDataVO != null
						&& resDataVO.getList() != null
						&& resDataVO.getList().size() > 0) {
					Map object = (Map) resDataVO.getList()
							.get(0);
					if (null != object) {
						Map taskliststructmap = (Map) object
								.get("taskstructlist");
						if(null!=taskliststructmap){
				List<Map> listmap = (List<Map>)taskliststructmap.get("group");
				if(null != listmap) { 
					Iterator<Map> iter = listmap.iterator();
					List<V63TaskListVO> taskGrouplist = new ArrayList<V63TaskListVO>();
					while(iter.hasNext()) {
						V63TaskListVO taskliststruct = new V63TaskListVO();
						Map map = iter.next();
						if(((String)map.get("name")).equals("今天")){
							taskliststruct.setGroupname(getString(R.string.today));
						}else 	if(((String)map.get("name")).equals("昨天")){
							taskliststruct.setGroupname(getString(R.string.yesterday));
						}else 	if(((String)map.get("name")).equals("本周")){
							taskliststruct.setGroupname(getString(R.string.thisweek));
						}else 	if(((String)map.get("name")).equals("上周")){
							taskliststruct.setGroupname(getString(R.string.lastweek));
						}else 	if(((String)map.get("name")).equals("更早")){
							taskliststruct.setGroupname(getString(R.string.earlier));
						}
						List<Map> childlistmap = (List<Map>)map.get("taskstruct");
						if(null != childlistmap){
							List<V63TaskVO> tasklist = new ArrayList<V63TaskVO>();
							Iterator<Map> childiter = childlistmap.iterator();	
							while(childiter.hasNext()){
								Map childmap = childiter.next();
								V63TaskVO taskvo =new V63TaskVO();
								taskvo.setDate((String)childmap.get("date"));
								taskvo.setId((String)childmap.get("taskid"));
								taskvo.setTitle((String)childmap.get("title"));
								taskvo.setPriority((String)childmap.get("priority"));
								taskvo.setIsreminder((String)childmap.get("isreminder"));
								
								//add by huangyy
								taskvo.setHumactname((String)childmap.get("humactname"));
								//end by huangyy
								
								
								tasklist.add(taskvo);
							}
							taskliststruct.setTasklist(tasklist);
						}
						taskGrouplist.add(taskliststruct);
					}
			
				for (V63TaskListVO ListVO : taskGrouplist) {
					boolean iscontaingroup = false;
					V63TaskGroupVO taskGroup = new V63TaskGroupVO(ListVO,
							serviceCodeRes.getServicecode());

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
					}
					groupList = sortTaskList(groupList);		
				}
			}

			break;
		default:
			toastMsg(responseVO.getDesc());
			break;
		}
		return groupList;
	}

	private List<V63TaskGroupVO> sortTaskList(List<V63TaskGroupVO> groupList) {
		List<V63TaskGroupVO> resGroupList = new ArrayList<V63TaskGroupVO>();
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
				if(null!= taskButtonVOList){
				for (TaskButtonVO btnVO : taskButtonVOList) {
					TaskBtnVO btn = new TaskBtnVO(btnVO);
					taskBtnList.add(btn);
					btnsName.add(btnVO.getStatusname());
				}
				if(null==((App)getApplication()).getGlobalVariables("statuscode")
						||((App)getApplication()).getGlobalVariables("statuscode").toString().isEmpty()){
					currentStatusCode = taskButtonVOList.get(0).getStatuscode();
				}
				firststatus= currentStatusCode;
				int firststatusnum = 0;
				for(int i=0;i<taskButtonVOList.size();i++){
					if(currentStatusCode.equals(taskButtonVOList.get(i).getStatuscode())){
						firststatus = taskButtonVOList.get(i).getStatuscode();
						firststatusnum = i;
						break;
					}
				}
				((App) getApplication()).addGlobalVariable("firststatusnum",
						firststatusnum);
				taskBtnGroupView.setVisibility(View.VISIBLE);
				taskBtnGroupView.setData(btnsName, WAButtonDrawables
						.getBtnDrawablesPressed(btnsName.size()),
						WAButtonDrawables.getBtnDrawablesUnPress(btnsName
								.size()), this);
				break;
			}}}
			else{
				taskBtnGroupView.setVisibility(View.GONE);
			}
			break;
		default:
			toastMsg(responseVO.getDesc());
			break;
		}
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
	private int calTaskListSize(List<V63TaskGroupVO> data) {
		int size = 0;
		for (V63TaskGroupVO m : data) {
			size += m.size();
		}
		return size;
	}

	/**
	 * 合并
	 * 
	 * @param list
	 */
	private void getNewList(List<V63TaskGroupVO> list) {
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
			if (null != vo && null != vo.getmWAComponentInstancesVO()) {
				if(action.equals(ACTION_GET_BUTTON)){
					ResponseActionVO buttonresponseVO = VOProcessUtil.parseMessageVO(
							ComponentIds.A0A007, ActionTypes.TASK_GETTASKBUTTONLIST,
							vo.getmWAComponentInstancesVO());
					updateBtns(buttonresponseVO);
				}
				ResponseActionVO responseVO = VOProcessUtil.parseMessageVO(
						ComponentIds.A0A007, V63ActionTypes.TASK_GETTASKLIST,
						vo.getmWAComponentInstancesVO());
				if (!(responseVO.getServiceCodeList().size() < 2)){
					issingleservicecode = false ;
					taskExListView.setCanLoad(false);
				}
				showListView();
				try{
				List<V63TaskGroupVO> list = parseTaskList(responseVO);
				
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
					} else if ((action.equals(ACTION_DOWNREFRESH_TASKLIST)||action.equals(ACTION_GET_BUTTON))) {//下拉刷新
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
					showNoDataImageView();
					taskExListView.onRefreshComplete();}
					else{
						taskExListView.setCanLoad(false);
						toastMsg(getString(R.string.nomoredata));
						taskExListView.onRefreshComplete();
					}
				}
				progressDlg.dismiss();
				}catch(Exception e){
					
				}
			} else {
				showNoDataImageView();
				taskExListView.onRefreshComplete();
				progressDlg.dismiss();
			}
			// 加载框消失
			progressDlg.dismiss();
		}

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

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		// TODO Auto-generated method stub
		super.onActivityResult(requestCode, resultCode, data);
		switch (resultCode) {
		case 1:
			progressDlg.show();
			// 初始化数据
			currentStartLine = 1;
			getTaskList(currentStatusKey, currentStatusCode,
					getCurrentDate(), currentStartLine, pageSize,
					new MyOnVoRequestListener(ACTION_DOWNREFRESH_TASKLIST));
			break;

		default:
			break;
		}
	}
}
