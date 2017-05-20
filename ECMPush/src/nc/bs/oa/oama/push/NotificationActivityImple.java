package nc.bs.oa.oama.push;

import java.util.List;

import nc.bs.oa.oama.vo.PushExtraVO;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.ActivityManager.RunningTaskInfo;
import android.content.ComponentName;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.gson.Gson;
import com.yonyou.protocol.NotificationActivity;
import com.yonyou.protocol.NotifyAndMsg;
import com.yonyou.pushclient.PushServiceManager;
import com.yonyou.pushclient.ServiceOnlineReceiver;

public class NotificationActivityImple extends NotificationActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		// 创建一个线性布局管理器
		LinearLayout linearLayout = new LinearLayout(this);
		super.setContentView(linearLayout);
		linearLayout.setOrientation(LinearLayout.VERTICAL);
		// 创建一个TextView对象
		final TextView showNotf = new TextView(this);
		showNotf.setEnabled(false);
		linearLayout.addView(showNotf);
		// 获取当前通知
		NotifyAndMsg notify = null;
		if (null != PushServiceManager.getServiceOnlineReceiver()) {
			try {
				notify = PushServiceManager.getServiceOnlineReceiver()
						.getNotifyById(getNotifyId());
				ServiceOnlineReceiver.removeListByString(getNotifyId());
				ServiceOnlineReceiver.removeNotifyById(getNotifyId());
				if (null != notify) {
					Log.i("MAIN","---------------------------start---------------------");
					String extraJson = notify.getExtratext();
					Intent pushIntent = new Intent();

					SharedPreferences shareNotiContent = this
							.getSharedPreferences("NOTIFICATION",
									NotificationActivity.MODE_PRIVATE);
					Editor editor = shareNotiContent.edit();

					// 判断程序是否在运行
					ActivityManager am = (ActivityManager) this.getSystemService(ACTIVITY_SERVICE);
					List<RunningAppProcessInfo> processes = am.getRunningAppProcesses();
					Boolean isBackground = false;
					// 在后台运行 true
					for (RunningAppProcessInfo process : processes) {
						if (process.processName.equals(this.getPackageName())) {
							isBackground = true;
						}
					}
					if (isBackground) {// 在后台运行
						List<RunningTaskInfo> tasks = am.getRunningTasks(20);
						for (int i = 0; i < tasks.size(); i++) {
							if (tasks.get(i) != null && "nc.bs.oa.oama.ecm".equals(tasks.get(i).topActivity.getPackageName())) {
								String topActivity = tasks.get(i).topActivity.getClassName();
								Log.i("MAIN","---------------------------topActivity---------------------"+ topActivity);
								String baseActivity = tasks.get(i).baseActivity.getShortClassName();
								Log.i("MAIN","---------------------------baseActivity---------------------"+ baseActivity);
								int numActivity = tasks.get(i).numActivities;
								Log.i("MAIN","---------------------------numActivity---------------------"+ numActivity);
								// 是否在login 和 connect 界面
								String islogin = shareNotiContent.getString("isloginActivity", "false");
								if (!topActivity.equals(baseActivity) || numActivity > 2) {
									//先将应用调到前台
									pushIntent.setAction(Intent.ACTION_MAIN);
									pushIntent.addCategory(Intent.CATEGORY_LAUNCHER);
									pushIntent.setComponent(new ComponentName(this, Class.forName(topActivity)));
									pushIntent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT
													| Intent.FLAG_ACTIVITY_NEW_TASK
													| Intent.FLAG_ACTIVITY_RESET_TASK_IF_NEEDED);
									startActivity(pushIntent);
									//根据extra 处理nc审批和oa审批
									if(extraJson != null && !"".equals(extraJson.trim()) 
											&& islogin != null && islogin.equals("false")){
										
										PushExtraVO peVo = new PushExtraVO();
										peVo = new Gson().fromJson(extraJson,PushExtraVO.class);
										String statuscode = null;
										String statuskey = null;
										String taskType = peVo.getType();
										if (taskType != null&& taskType.equals("approve")) {
											statuscode = "unhandled";
											statuskey = "ishandled";
										} else if (taskType != null&& taskType.equals("read")) {
											statuscode = "unhandled";
											statuskey = "mypieces";
										}
										
										// 来自审批的通知
										if (peVo.getNode() != null&& peVo.getNode().equals("A0A007")) {
											editor.putString("frompush", "true");
											editor.commit();
											
											String servicecode = null;
											String priority = null;
											String isreminder = null;
											String from = peVo.getParams().get("from");
											if (from != null && from.equals("oa")) {
												servicecode = "1415158109344";
												priority = "0";
												isreminder = "N";
											} else {
												servicecode = "1418020749101";
											}
											Intent intent = new Intent();
											intent.putExtra("taskId", peVo.getParams().get("taskId"));
											intent.putExtra("servicecode",servicecode);
											intent.putExtra("statuscode",statuscode);
											intent.putExtra("priority",priority);
											intent.putExtra("statuskey",statuskey);
											intent.putExtra("isreminder",isreminder);
											intent.setClassName("nc.bs.oa.oama.ecm","wa.android.task.activity.V63TaskDetailActivity");
											startActivity(intent);
										}
									}
									(NotificationActivityImple.this).finish();
								} else {// 没有在运行 重新登录到主页
									if (extraJson != null && !"".equals(extraJson.trim())){
										editor.putString("nExtra", extraJson);
										editor.putString("nTitle",notify.getSubject());
										editor.putString("nContent",notify.getContent());
										editor.commit();
									}
									Log.i("MAIN","---------------------------main tasks---------------------");
									(NotificationActivityImple.this).finish();
									pushIntent.setClassName("nc.bs.oa.oama.ecm","com.yonyou.uap.um.activity.WelcomeActivity");
									startActivity(pushIntent);
								}
							}
						}
					} else {// 没有在运行 重新登录到主页
						Log.i("MAIN","---------------------------main---------------------");
						pushIntent.setClassName("nc.bs.oa.oama.ecm","nc.bs.oa.oama.ecm.Ecm_FlashExtendActivity");
						startActivity(pushIntent);
						this.finish();
					}
				}

			} catch (Exception e) {
				e.getStackTrace();
				Log.i("OPENERROR", e.toString());
				finish();

			}
		}
	}

}
