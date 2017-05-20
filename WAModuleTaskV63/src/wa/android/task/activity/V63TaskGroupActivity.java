package wa.android.task.activity;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import nc.vo.oa.component.struct.ResDataVO;
import nc.vo.oa.component.struct.ServiceCodeRes;

import com.example.wamoduletaskv63.R;

import wa.android.common.App;
import wa.android.common.activity.SettingActivity;
import wa.android.common.networkold.VOHttpResponse;
import wa.android.common.utils.PreferencesUtil;
import wa.android.common.vo.ResponseActionVO;
import wa.android.common.vo.VOProcessUtil;
import wa.android.constants.CommonGlobalVariables;
import wa.android.constants.CommonWAPreferences;
import wa.android.task.adapter.BottomGridViewAdapter;
import wa.android.task.constants.ComponentIds;
import wa.android.task.view.WATaskGridView;
import wa.android.v63task.constants.V63ActionTypes;
import wa.android.v63task.data.TaskStatusListVO;
import wa.android.v63task.data.TaskStatusVO;
import android.app.ActivityGroup;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.Toast;

public class V63TaskGroupActivity extends ActivityGroup {
	String user_name="";
	
	private WATaskGridView bottomView;
	private LinearLayout container;
	private BottomGridViewAdapter adapter;
	private int location = 0;
	private StringBuffer btnstr = new StringBuffer("");
	private TaskStatusListVO statuslist = new TaskStatusListVO();
	private boolean issubactivity = true;
	private Handler handler = new Handler() {
		public void handleMessage(android.os.Message msg) {
			bottomView.setNumColumns(statuslist.getTaskstatuslist().size());
			bottomView.setBackgroundResource(R.drawable.common_bg_bottom);
			adapter = new BottomGridViewAdapter(V63TaskGroupActivity.this,
					statuslist);
			bottomView.setGravity(Gravity.CENTER);
			// bottomView.setVerticalSpacing(0);
			bottomView.setAdapter(adapter);
			// bottomView.setSelector(1);

			bottomView.setOnItemClickListener(new OnItemClickListener() {

				@SuppressWarnings("null")
				@Override
				public void onItemClick(AdapterView<?> arg0, View arg1,
						int arg2, long arg3) {

					// if (arg2 != location) {

					Intent intent = null;

					switch (arg2) {
					case 0:
						intent = new Intent(V63TaskGroupActivity.this,
								V63TaskListActivity.class);
						for (TaskStatusVO status : statuslist
								.getTaskstatuslist()) {
							if ("ishandled".equals(status.getId())) {
								intent.putExtra("title", status.getName());
								break;
							}
						}
						intent.setFlags(Intent.FLAG_ACTIVITY_BROUGHT_TO_FRONT);
						intent.putExtra("isresume", "true");
						adapter.setFocusAt(0);
						adapter.notifyDataSetChanged();
						location = 0;
						issubactivity = true;
						break;

					case 1:

						location = 1;
						String code1 = adapter.setFocusAt(1);
						adapter.notifyDataSetChanged();
						if (code1.equals("ishandled")) {
							intent = new Intent(V63TaskGroupActivity.this,
									V63TaskListActivity.class);
							for (TaskStatusVO status : statuslist
									.getTaskstatuslist()) {
								if (code1.equals(status.getId())) {
									intent.putExtra("title", status.getName());
									break;
								}
							}
							intent.setFlags(Intent.FLAG_ACTIVITY_BROUGHT_TO_FRONT);
							issubactivity = true;
						} else if (code1.equals("mypieces")) {
							intent = new Intent(V63TaskGroupActivity.this,
									V63TaskReaderListActivity.class);
							for (TaskStatusVO status : statuslist
									.getTaskstatuslist()) {
								if (code1.equals(status.getId())) {
									intent.putExtra("title", status.getName());
									break;
								}
							}
							intent.setFlags(Intent.FLAG_ACTIVITY_BROUGHT_TO_FRONT);
							issubactivity = true;
						} else if (code1.equals("submit")) {
							intent = new Intent(V63TaskGroupActivity.this,
									V63TaskLauchListActivity.class);
							for (TaskStatusVO status : statuslist
									.getTaskstatuslist()) {
								if (code1.equals(status.getId())) {
									intent.putExtra("title", status.getName());
									break;
								}
							}
							intent.setFlags(Intent.FLAG_ACTIVITY_BROUGHT_TO_FRONT);
							issubactivity = true;
						} else {
							intent = new Intent(V63TaskGroupActivity.this,
									SettingActivity.class);
							intent.setFlags(Intent.FLAG_ACTIVITY_BROUGHT_TO_FRONT);
							startActivity(intent);

							issubactivity = false;
						}
						break;
					case 2:

						location = 2;
						String code2 = adapter.setFocusAt(2);
						if (code2.equals("ishandled")) {
							intent = new Intent(V63TaskGroupActivity.this,
									V63TaskListActivity.class);
							for (TaskStatusVO status : statuslist
									.getTaskstatuslist()) {
								if (code2.equals(status.getId())) {
									intent.putExtra("title", status.getName());
								}
							}
							intent.setFlags(Intent.FLAG_ACTIVITY_BROUGHT_TO_FRONT);
							issubactivity = true;
						} else if (code2.equals("mypieces")) {
							intent = new Intent(V63TaskGroupActivity.this,
									V63TaskReaderListActivity.class);
							for (TaskStatusVO status : statuslist
									.getTaskstatuslist()) {
								if (code2.equals(status.getId())) {
									intent.putExtra("title", status.getName());
									break;
								}
							}
							intent.setFlags(Intent.FLAG_ACTIVITY_BROUGHT_TO_FRONT);
							issubactivity = true;
						} else if (code2.equals("submit")) {
							intent = new Intent(V63TaskGroupActivity.this,
									V63TaskLauchListActivity.class);
							for (TaskStatusVO status : statuslist
									.getTaskstatuslist()) {
								if (code2.equals(status.getId())) {
									intent.putExtra("title", status.getName());
									break;
								}
							}
							intent.setFlags(Intent.FLAG_ACTIVITY_BROUGHT_TO_FRONT);
							issubactivity = true;
						} else {
							intent = new Intent(V63TaskGroupActivity.this,
									SettingActivity.class);
							intent.setFlags(Intent.FLAG_ACTIVITY_BROUGHT_TO_FRONT);
							startActivity(intent);
							issubactivity = false;
						}
						adapter.notifyDataSetChanged();
						break;

					default:
						intent = new Intent(V63TaskGroupActivity.this,
								SettingActivity.class);
						intent.setFlags(Intent.FLAG_ACTIVITY_BROUGHT_TO_FRONT);
						startActivity(intent);
						issubactivity = false;
						return;

					}
					if (issubactivity) {
						container.removeAllViews();
						Window subActivity = getLocalActivityManager()
								.startActivity("subActivity", intent);
						container.addView(subActivity.getDecorView(),
								LayoutParams.FILL_PARENT,
								LayoutParams.FILL_PARENT);
					}
				}
			}
			// }
			);
			bottomView.setVisibility(View.VISIBLE);
			bottomView.setVerticalScrollBarEnabled(false);
			if (msg.what == 0) {
				adapter.setFocusAt(0);
			} else if (msg.what == 1) {
				adapter.setFocusAt(1);
			} else if (msg.what == 2) {
				adapter.setFocusAt(2);
			} else {
				adapter.setFocusAt(0);
			}
		};
	};
	// 测试代码


		Runnable runnable = new Runnable() {
			@Override
			public void run() {

				SharedPreferences.Editor sharedata = getSharedPreferences("data", 0)
						.edit();
				user_name=getUserInfo();
				sharedata.putString("name",user_name);
				
				sharedata.commit();
			}
		};


		private String getUserInfo() {
			// cgg 向ma发起请求 获取当前登录的用户名
			String server_ip = PreferencesUtil.readPreference(
					this,
					CommonWAPreferences.SERVER_IP);
			String SERVER_PORT = PreferencesUtil.readPreference(
					this,
					CommonWAPreferences.SERVER_PORT);
			String USER_NAME = PreferencesUtil.readPreference(
					this,
					CommonWAPreferences.USER_NAME);
			String url = "http://" + server_ip + ":" + SERVER_PORT
					+ "/mobsm/img/getMaUn.jsp?id=" + USER_NAME;
			BufferedReader in = null;
			String result = "";
			try {

				URL realUrl = new URL(url);
				// 打开和URL之间的连接
				URLConnection connection = realUrl.openConnection();
				// 设置通用的请求属性
				connection.setRequestProperty("accept", "*/*");
				connection.setRequestProperty("connection", "Keep-Alive");
				connection.setRequestProperty("user-agent",
						"Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
				// 建立实际的连接
				connection.connect();
				// 获取所有响应头字段
				Map<String, List<String>> map = connection.getHeaderFields();
				// 定义 BufferedReader输入流来读取URL的响应
				in = new BufferedReader(new InputStreamReader(
						connection.getInputStream()));
				String line;
				while ((line = in.readLine()) != null) {
					result += line;
				}

				// PreferencesUtil.writePreference(this, "nt_user_name", result);
			} catch (Exception e) {
				System.out.println("发送GET请求出现异常！" + e);
				e.printStackTrace();
			}
			// 使用finally块来关闭输入流
			finally {
				try {
					if (in != null) {
						in.close();
					}
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
			return result;
		}

		// 测试代码
	
	

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		
//		SharedPreferences sharedata = getSharedPreferences("data", 0);  
//		  if(sharedata.getString("name", null)==null)  {
//			  new Thread(runnable).start();// 新起一个线程
//		  }
		  new Thread(runnable).start();// 新起一个线程
		
		
//		runNew();
		requestWindowFeature(Window.FEATURE_NO_TITLE);

		setContentView(R.layout.activitygroup_container);
		bottomView = (WATaskGridView) findViewById(R.id.activitygroup_grid);
		container = (LinearLayout) findViewById(R.id.activitygroup_container);
		// if(!(null!=((App)getApplication()).getGlobalVariables("isrefreshlist")&&((App)getApplication()).getGlobalVariables("isrefreshlist").equals("true"))){
		initbottomview();
		Intent intent = null;
		if (null != ((App) getApplication()).getGlobalVariables("statuskey")
				&& ((App) getApplication()).getGlobalVariables("statuskey")
						.equals("ishandled")) {
			intent = new Intent(this, V63TaskListActivity.class);
			for (TaskStatusVO status : statuslist.getTaskstatuslist()) {
				if ("ishandled".equals(status.getId())) {
					intent.putExtra("title", status.getName());
					break;
				}
			}
		} else if (null != ((App) getApplication())
				.getGlobalVariables("statuskey")
				&& ((App) getApplication()).getGlobalVariables("statuskey")
						.equals("submit")) {
			intent = new Intent(this, V63TaskLauchListActivity.class);
			for (TaskStatusVO status : statuslist.getTaskstatuslist()) {
				if ("submit".equals(status.getId())) {
					intent.putExtra("title", status.getName());
					break;
				}
			}
		} else if (null != ((App) getApplication())
				.getGlobalVariables("statuskey")
				&& ((App) getApplication()).getGlobalVariables("statuskey")
						.equals("mypieces")) {
			intent = new Intent(this, V63TaskReaderListActivity.class);
			for (TaskStatusVO status : statuslist.getTaskstatuslist()) {
				if ("mypieces".equals(status.getId())) {
					intent.putExtra("title", status.getName());
					break;
				}
			}
		} else {
			

			// 测试代码

			
		
			
//			Toast.makeText(this, "这位是哪里", Toast.LENGTH_LONG).show();
			// 测试代码

			intent = new Intent(this, V63TaskListActivity.class);
			try {
				for (TaskStatusVO status : statuslist.getTaskstatuslist()) {
					if ("ishandled".equals(status.getId())) {
						intent.putExtra("title", status.getName());
						break;
					}
				}
			} catch (Exception e) {
				// TODO: handle exception
				intent.putExtra("title", "");
			}

		}

		intent.setFlags(Intent.FLAG_ACTIVITY_BROUGHT_TO_FRONT);
		Window subActivity = getLocalActivityManager().startActivity(
				"subActivity", intent);
		container.addView(subActivity.getDecorView(), LayoutParams.FILL_PARENT,
				LayoutParams.FILL_PARENT);
		// }

		
	}

	

	private void initbottomview() {
		// TODO Auto-generated method stub
		VOHttpResponse vo = (VOHttpResponse) ((App) getApplicationContext())
				.getGlobalVariables(CommonGlobalVariables.AFTER_LOGIN_VOHTTPRESPONSE);
		if (vo != null) {
			ResponseActionVO responseVO = VOProcessUtil.parseMessageVO(
					ComponentIds.A0A007, V63ActionTypes.TASK_GETTASKSTATUSLIST,
					vo.getmWAComponentInstancesVO());
			updateBtns(responseVO);
		}

	}

	private void updateBtns(ResponseActionVO responseVO) {
		// TODO Auto-generated method stub
		handleResponsewithlogin(responseVO);
	}

	private void handleResponsewithlogin(ResponseActionVO responseVO) {
		// TODO Auto-generated method stub
		switch (responseVO.getFlag()) {
		case 0:
			List<String> btnsName = new ArrayList<String>();
			if (responseVO.getServiceCodeList() != null) {
				List<TaskStatusVO> taskstatuslist = new ArrayList<TaskStatusVO>();
				for (ServiceCodeRes serviceCodeRes : responseVO
						.getServiceCodeList()) {
					if (null != serviceCodeRes.getResdata()) {
						ResDataVO resDataVO = serviceCodeRes.getResdata();
						Map map = (Map) resDataVO.getList().get(0);
						if (map.get("statuslist") != null) {
							List<Map<String, String>> statuslistmap = (List<Map<String, String>>) ((Map) map
									.get("statuslist")).get("status");

							for (Map<String, String> statusmap : statuslistmap) {

								if (!btnstr.toString().contains(
										statusmap.get("id"))) {
									btnstr.append(statusmap.get("id"));
									TaskStatusVO status = new TaskStatusVO();

									status.setId(statusmap.get("id"));
									status.setName(statusmap.get("name"));
									taskstatuslist.add(status);
								}
							}

						}
					}
				}
				statuslist.setTaskstatuslist(taskstatuslist);
				if (((App) getApplication()).getGlobalVariables("statuskey") == null) {
					handler.sendEmptyMessage(0);
				} else {
					String statusKey = ((App) getApplication())
							.getGlobalVariables("statuskey").toString();
					if (statusKey.equals("ishandled")) {
						handler.sendEmptyMessage(0);
					} else if (statusKey.equals("mypieces")) {
						handler.sendEmptyMessage(1);
					} else if (statusKey.equals("submit")) {
						handler.sendEmptyMessage(2);
					} else {
						handler.sendEmptyMessage(0);
					}
				}
			} else {
				Log.i("解析按钮", "出错");
			}
			break;
		default:
			Toast.makeText(this, responseVO.getDesc(), Toast.LENGTH_SHORT)
					.show();
			break;
		}

	}

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		// TODO Auto-generated method stub
		if (keyCode == KeyEvent.KEYCODE_MENU) {

			Intent i = new Intent();
			i.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP
					| Intent.FLAG_ACTIVITY_CLEAR_TOP);
			i.setClass(this, App.moduleList.get(0).getMainClazz());
			startActivity(i);
			// Toast.makeText(this, "Menu", Toast.LENGTH_SHORT).show();
			return false;
		}
		return super.onKeyDown(keyCode, event);

	}

}
