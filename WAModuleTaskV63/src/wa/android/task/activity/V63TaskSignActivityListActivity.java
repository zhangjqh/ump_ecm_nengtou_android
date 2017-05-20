package wa.android.task.activity;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import nc.vo.oa.component.struct.ResDataVO;
import nc.vo.oa.component.struct.ServiceCodeRes;
import wa.android.common.App;
import wa.android.common.UMProgressDialog;
import wa.android.common.activity.BaseActivity;
import wa.android.common.networkold.VOHttpResponse;
import wa.android.common.vo.ResponseActionVO;
import wa.android.common.vo.VOProcessUtil;
import wa.android.common.vo.WAActionVO;
import wa.android.constants.CommonServers;
import wa.android.libs.groupview.WAGroupView;
import wa.android.libs.groupview.WAPanelView;
import wa.android.task.constants.ComponentIds;
import wa.android.task.view.V63TaskActionRowStyle3;
import wa.android.v63task.constants.V63ActionTypes;
import wa.android.v63task.data.ActivityListVO;
import wa.android.v63task.data.ActivityVO;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;

import com.example.wamoduletaskv63.R;

public class V63TaskSignActivityListActivity extends BaseActivity {
	private String actionname, actioncode, taskid, statuscode, statuskey,
	servicecode,issingle;
	private Map<String,String> statuslist = new HashMap<String, String>();
	private List<ActivityVO> activitylist = new ArrayList<ActivityVO>();
	private ActivityListVO jumpactivity = new ActivityListVO();
	private ScrollView scrollView ;
	private WAPanelView panel ;
	private WAGroupView group;
	private UMProgressDialog progressDlg;
	private 	List<V63TaskActionRowStyle3> btnlist ;
	private V63TaskActionRowStyle3 rowtmp;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		actionname = (String) getIntent().getExtras().get("actionname");
		actioncode = (String) getIntent().getExtras().get("actioncode");
		taskid = (String) getIntent().getExtras().get("taskid");
		statuscode = (String) getIntent().getExtras().get("statuscode");
		statuskey = (String) getIntent().getExtras().get("statuskey");
		servicecode = (String) getIntent().getExtras().get("servicecode");
		issingle = (String) getIntent().getExtras().get("issingle");
		setContentView(R.layout.v63_activity_task_activitylist);
		Button backbtn = (Button) findViewById(R.id.titlePanel_backBtn);
		backbtn.setBackgroundResource(R.drawable.btn_back);
		//backbtn.setText(getString(R.string.cancel));
		//backbtn.setTextColor(Color.rgb(255, 255, 255));
		backbtn.setVisibility(View.VISIBLE);
		backbtn.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String toastmsg = getString(R.string.cancelaction);
				new AlertDialog.Builder(V63TaskSignActivityListActivity.this)
						.setMessage(toastmsg)
						.setPositiveButton(getString(R.string.submit),
								new DialogInterface.OnClickListener() {

									@Override
									public void onClick(DialogInterface dialog,
											int which) {
										// TODO Auto-generated method stub
										finish();
									}
								})
						.setNegativeButton(getString(R.string.cancel),
								new DialogInterface.OnClickListener() {

									@Override
									public void onClick(DialogInterface dialog,
											int which) {

									}
								}).show();
			}
		});
		initData();
	}

	private void initData() {
		progressDlg = new UMProgressDialog(V63TaskSignActivityListActivity.this);
		progressDlg.setProperty("value", "loading...");
		// TODO Auto-generated method stub
		progressDlg.show();
		getActivityList(taskid, statuscode, statuskey, actioncode,new MyOnVoRequestListener());
	
	}
	/**
	 * 活动列表请求返回
	 * 公共处理
	 * @damilong00
	 * @param statusKey
	 * @param statusCode
	 */
	class MyOnVoRequestListener implements OnVORequestedListener {
		@Override
		public void onVORequested(VOHttpResponse vo) {
			ResponseActionVO responseVO = VOProcessUtil.parseMessageVO(
					ComponentIds.A0A007,
					V63ActionTypes.TASK_GETACTIVITYLIST,
					vo.getmWAComponentInstancesVO());
			switch (responseVO.getFlag()) {
			case 0:
				try {
					for (ServiceCodeRes serviceCodeRes : responseVO
							.getServiceCodeList()) {
						ResDataVO resDataVO = serviceCodeRes
								.getResdata();
						if (resDataVO != null
								&& resDataVO.getList() != null
								&& resDataVO.getList().size() > 0) {
							Map object = (Map) resDataVO.getList()
									.get(0);
							List<ActivityVO> activitylisttmp = new ArrayList<ActivityVO>();
							if (null != object) {
								Map noteliststruct = (Map) object
										.get("activitylist");
								List<Map> activitylsitmap = (List<Map>) noteliststruct.get("activity");
								
								if (null != activitylsitmap) {
									Iterator<Map> iter = activitylsitmap.iterator();
									while(iter.hasNext()) {
										Map map = iter.next();
										ActivityVO activity = new ActivityVO();
										activity.setId((String)map.get("id"));
										activity.setCode((String)map.get("code"));
										activity.setIsperson((String)map.get("remark"));
										activity.setIssingleperson((String)map.get("isradio"));
										activity.setName((String)map.get("name"));
										activitylisttmp.add(activity);
									}
									activitylist.addAll(activitylisttmp);
									initView();
								}
							}
						}
					}
				} catch (Exception e) {
					// TODO: handle exception
				}
				break;
			default:
				toastMsg(responseVO.getDesc());
				break;
			}
			progressDlg.dismiss();
		}


		@Override
		public void onVORequestFailed(VOHttpResponse vo) {
			// TODO Auto-generated method stub

		progressDlg.dismiss();
		}}; 
		
		

		private void initView() {
			 scrollView = (ScrollView)findViewById(R.id.task_activitylist_panel);
			 panel = new  WAPanelView(this);
			 group = new WAGroupView(this);
				 btnlist = new ArrayList<V63TaskActionRowStyle3>();
			for (int i = 0 ; i < activitylist.size(); i++){
				 rowtmp = new V63TaskActionRowStyle3(this, true, issingle.equals("Y"),activitylist.get(i).getId());

				rowtmp.setOnClickListener(new OnClickListener() {
					
					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						V63TaskActionRowStyle3 row = (V63TaskActionRowStyle3) v;
						if(row.isIsv63clicked()){
							if(row.isIssingle()){
								row.getRowItemIcon().setBackgroundResource(R.drawable.checkbox_nselect);
						}else{
							row.getRowItemIcon().setBackgroundResource(R.drawable.checkbox_nselect);
						}
							row.setIsv63clicked(false) ;

						}else{
							
							if(row.isIssingle()){
								row.getRowItemIcon().setBackgroundResource(R.drawable.checkbox_yselect);
								for (V63TaskActionRowStyle3 row1:btnlist){
								if(!row1.getItemid().equals(row.getItemid())){
										row1.getRowItemIcon().setBackgroundResource(R.drawable.checkbox_nselect);
									row1.setIsv63clicked(false);
								}
								}
							}else{
								row.getRowItemIcon().setBackgroundResource(R.drawable.checkbox_yselect);
							}
							row.setIsv63clicked(true) ;
							}
					}
				});
			
				rowtmp.setValue(activitylist.get(i).getName(), activitylist.get(i).getCode());
				statuslist.put(activitylist.get(i).getId(), "false");
				btnlist.add(rowtmp);
				group.addRow(rowtmp);
			}
			if(issingle.equals("Y")){
			for (final V63TaskActionRowStyle3 row :btnlist){}}
			panel.addGroup(group);
			scrollView.addView(panel);
			Button tempBtn = (Button)findViewById(R.id.titlePanel_rightBtn);
			tempBtn.setVisibility(View.GONE);
			Button enterBtn = (Button)findViewById(R.id.titlePanel_rightTextBtn);
			enterBtn.setVisibility(View.VISIBLE);
			enterBtn.getBackground().setAlpha(0);
			enterBtn.setText(getString(R.string.submit));
			enterBtn.setTextColor(Color.RED);
			enterBtn.setTextSize(17);
			enterBtn.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					List<ActivityVO> activitylisttmp = new ArrayList<ActivityVO>();
					for (int i = 0 ; i < group.getChildCount(); i++){

						if(group.getChildAt(i) instanceof V63TaskActionRowStyle3){
						try {
							Field isselected = (group.getChildAt(i)).getClass().getDeclaredField("isv63clicked");
							isselected.setAccessible(true);
								Boolean  value = (Boolean)isselected.get(group.getChildAt(i));

							if(value){
								for(ActivityVO activity:activitylist){
									if(((V63TaskActionRowStyle3)(group.getChildAt(i))).getItemid().equals(activity.getId())){
										activitylisttmp.add(activity);
									}
								
								}
//							activitylisttmp.add
							}
						} catch (SecurityException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (NoSuchFieldException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (IllegalArgumentException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (IllegalAccessException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}}
					Intent i = new Intent();
					jumpactivity.setActivitylist(activitylisttmp);
					i.putExtra("activitylist", jumpactivity);
					i.putExtra("type", 1);
					// 通过调用setResult方法返回结果给前一个activity。
					setResult(RESULT_OK, i);
					finish();
					
				}
			});

		}
	/**
	 * 获取审批的默认语句
	 * 
	 * @param statusKey
	 * @param statusCode
	 */
	private void getActivityList(String taskId, String statusCode,
			String statusKey, String actionCode, OnVORequestedListener listener) {

		List<WAActionVO> actions = new ArrayList<WAActionVO>();
		WAActionVO action = new WAActionVO();
		// 获取action
		Map<String, String> params = new HashMap<String, String>();
		action = new WAActionVO();
		params = new HashMap<String, String>();
		params.put("groupid", "");
		params.put("usrid", "");
		params.put("statuskey", statusKey);
		params.put("statuscode", statusCode);
		params.put("taskid", taskId);
		params.put("actioncode", actionCode);
		params.put("startline", "1");
		params.put("count", "25");
		
		action.setActiontype(V63ActionTypes.TASK_GETACTIVITYLIST);
		action.setParams(params);
		action.setServicecode(servicecode);
		actions.add(action);
		// 发送请求
		requestVO(CommonServers.getServerAddress(this)
				+ CommonServers.SERVER_SERVLET_WA,
				VOProcessUtil.createMessageRequestVO(this, ComponentIds.A0A007, actions),
				listener);

	}

	   /**
  * 物理键监听
  */
	public boolean onKeyDown(int keyCode, KeyEvent event) { // 监听物理键
		if (keyCode == KeyEvent.KEYCODE_BACK ) {
			// TODO Auto-generated method stub
			String toastmsg = getString(R.string.cancelaction);
			new AlertDialog.Builder(V63TaskSignActivityListActivity.this)
					.setMessage(toastmsg)
					.setPositiveButton(getString(R.string.submit),
							new DialogInterface.OnClickListener() {

								@Override
								public void onClick(DialogInterface dialog,
										int which) {
									// TODO Auto-generated method stub
									finish();
								}
							})
					.setNegativeButton(getString(R.string.cancel),
							new DialogInterface.OnClickListener() {

								@Override
								public void onClick(DialogInterface dialog,
										int which) {

								}
							}).show();
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
