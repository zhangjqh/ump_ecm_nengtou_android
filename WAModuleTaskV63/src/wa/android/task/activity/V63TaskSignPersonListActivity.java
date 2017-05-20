package wa.android.task.activity;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import nc.vo.oa.component.struct.ResDataVO;
import nc.vo.oa.component.struct.ServiceCodeRes;

import com.example.wamoduletaskv63.R;

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
import wa.android.v63task.data.ActivityVO;
import wa.android.v63task.data.UserVO;
import wa.android.v63task.data.UsersOfActivityVO;

public class V63TaskSignPersonListActivity  extends BaseActivity {
	private String  actioncode, taskid, statuscode, statuskey,
	servicecode;
	private Map<String,String> statuslist = new HashMap<String, String>();
	private UsersOfActivityVO usersOfActivityVO = new UsersOfActivityVO();
	private List<UserVO> userlist = new ArrayList<UserVO>();
	private ScrollView scrollView;
	private WAPanelView panel;
	private UMProgressDialog progressDlg;
	private WAGroupView group;
	private 	List<V63TaskActionRowStyle3> btnlist ;
	private V63TaskActionRowStyle3 rowtmp;
	private ActivityVO activity;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		actioncode = (String) getIntent().getExtras().get("actioncode");
		taskid = (String) getIntent().getExtras().get("taskid");
		statuscode = (String) getIntent().getExtras().get("statuscode");
		statuskey = (String) getIntent().getExtras().get("statuskey");
		servicecode = (String) getIntent().getExtras().get("servicecode");
		activity = (ActivityVO) getIntent().getSerializableExtra("activity");
		setContentView(R.layout.v63_activity_task_activitylist);
		TextView titleView = (TextView)findViewById(R.id.titlePanel_titleTextView);
		titleView.setText(R.string.assignto);
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
				new AlertDialog.Builder(V63TaskSignPersonListActivity.this)
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

	private void 	initData() {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		progressDlg = new UMProgressDialog(V63TaskSignPersonListActivity.this);
		progressDlg.setProperty("value", "loading...");
		progressDlg.show();
		getPersonListByActivity(taskid, statuscode, statuskey, actioncode,new MyOnVoRequestListener());
	}
	private void initView() {
		 scrollView = (ScrollView)findViewById(R.id.task_activitylist_panel);
		 panel = new  WAPanelView(this);
		 group = new WAGroupView(this);
			 btnlist = new ArrayList<V63TaskActionRowStyle3>();
		for (int i = 0 ; i < userlist.size(); i++){
			 rowtmp = new V63TaskActionRowStyle3(this, true, activity.getIssingleperson().equals("Y"),userlist.get(i).getId());

			rowtmp.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
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
				}}
			});
		
			rowtmp.setValue(userlist.get(i).getName(), userlist.get(i).getCode());
			statuslist.put(userlist.get(i).getId(), "false");
			btnlist.add(rowtmp);
			group.addRow(rowtmp);
		}
		group.setTitle(activity.getName());
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
				List<UserVO> userlisttmp = new ArrayList<UserVO>();
				for (int i = 0 ; i < group.getChildCount(); i++){

					if(group.getChildAt(i) instanceof V63TaskActionRowStyle3){
					try {
						Field isselected = (group.getChildAt(i)).getClass().getDeclaredField("isv63clicked");
						isselected.setAccessible(true);
							Boolean  value = (Boolean)isselected.get(group.getChildAt(i));

						if(value){
							for(UserVO user:userlist){
								if(((V63TaskActionRowStyle3)(group.getChildAt(i))).getItemid().equals(user.getId())){
									userlisttmp.add(user);
								}
							
							}
//						activitylisttmp.add
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
				usersOfActivityVO.setUserlist(userlisttmp);
				i.putExtra("usersOfActivityVO", usersOfActivityVO);
				i.putExtra("type", 2);
				i.putExtra("activity", activity);
				// 通过调用setResult方法返回结果给前一个activity。
				setResult(RESULT_OK, i);
				finish();
				
			}
		});

	}
	private void getPersonListByActivity(String taskid2, String statuscode2,
			String statuskey2, String actioncode2,
			MyOnVoRequestListener myOnVoRequestListener) {

		List<WAActionVO> actions = new ArrayList<WAActionVO>();
		WAActionVO action = new WAActionVO();
		// 获取action
		Map<String, String> params = new HashMap<String, String>();
		action = new WAActionVO();
		params = new HashMap<String, String>();
		params.put("groupid", "");
		params.put("usrid", "");
		params.put("statuskey", statuskey);
		params.put("statuscode", statuscode);
		params.put("taskid", taskid);
		params.put("actioncode", actioncode);
		params.put("startline", "1");
		params.put("count", "25");
		params.put("condition", "");
		params.put("activityid", activity == null?"":activity.getId());
		action.setActiontype(V63ActionTypes.TASK_GETUSERSOFACTIVITY);
		action.setParams(params);
		action.setServicecode(servicecode);
		actions.add(action);
		// 发送请求
		requestVO(CommonServers.getServerAddress(this)
				+ CommonServers.SERVER_SERVLET_WA,
				VOProcessUtil.createMessageRequestVO(this, ComponentIds.A0A007, actions),
				myOnVoRequestListener);

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
		
		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void onVORequested(VOHttpResponse vo) {
			ResponseActionVO responseVO = VOProcessUtil.parseMessageVO(
					ComponentIds.A0A007,
					V63ActionTypes.TASK_GETUSERSOFACTIVITY,
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
							List<UserVO> activitylisttmp = new ArrayList<UserVO>();
							if (null != object) {
								Map noteliststruct = (Map) object
										.get("users");
							
					
								List<Map> userlsitmap = (List<Map>) noteliststruct.get("psnstruct");
								
								if (null != userlsitmap) {
									Iterator<Map> iter = userlsitmap.iterator();
									while(iter.hasNext()) {
										Map map = iter.next();
										UserVO user = new UserVO();
										user.setId((String)map.get("id"));
										user.setCode((String)map.get("code"));
										user.setName((String)map.get("name"));
									
										activitylisttmp.add(user);
									}
									userlist.addAll(activitylisttmp);
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
		}
}
	

	   /**
  * 物理键监听
  */
	public boolean onKeyDown(int keyCode, KeyEvent event) { // 监听物理键
		if (keyCode == KeyEvent.KEYCODE_BACK ) {
			// TODO Auto-generated method stub
			String toastmsg = getString(R.string.cancelaction);
			new AlertDialog.Builder(V63TaskSignPersonListActivity.this)
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
