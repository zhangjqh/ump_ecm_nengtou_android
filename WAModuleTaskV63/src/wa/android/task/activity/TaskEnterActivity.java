package wa.android.task.activity;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

import nc.vo.oa.component.struct.WAComponentInstancesVO;

import com.example.wamoduletaskv63.R;

import android.content.Intent;
import android.os.Bundle;
import wa.android.common.App;
import wa.android.common.UMProgressDialog;
import wa.android.common.activity.BaseActivity;
import wa.android.common.network.DeviceInfoVO;
import wa.android.common.networkold.VOHttpResponse;
import wa.android.common.utils.PreferencesUtil;
import wa.android.common.vo.VOProcessUtil;
import wa.android.constants.CommonGlobalVariables;
import wa.android.constants.CommonServers;
import wa.android.constants.CommonWAPreferences;
import wa.android.task.constants.ActionTypes;
import wa.android.task.constants.ComponentIds;
import wa.android.v63task.constants.V63ActionTypes;

public class TaskEnterActivity extends BaseActivity {
	
	private UMProgressDialog progressDlg;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		progressDlg = new UMProgressDialog(this);
		progressDlg.setProperty("value", "loading...");
		progressDlg.show();
		String serverAddress = getIntent().getExtras().getString("url");
		String urltmp = serverAddress;
		if(urltmp.startsWith("http://")){
			urltmp = urltmp.substring(7);
		}
		if(urltmp.endsWith("/")){
			urltmp = urltmp.substring(0, urltmp.length()-1);
		}
		String srvip = urltmp.split(":")[0];
		String srvport = urltmp.split(":")[1];
		//String srvip = getIntent().getExtras().getString("host");
		//String srvport = getIntent().getExtras().getString("port");
		String groupid = getIntent().getExtras().getString("groupid");
		String usrid = getIntent().getExtras().getString("usrid");
		String username = getIntent().getExtras().getString("username");
		String password = getIntent().getExtras().getString("password");
		String appid = getIntent().getExtras().getString("appid");
		//String serverAddress = "http://" + srvip + ":" + srvport;
		CommonServers.setServerAddress(TaskEnterActivity.this, serverAddress);
		// 保存到本地
		PreferencesUtil.writePreference(TaskEnterActivity.this, CommonWAPreferences.SERVER_IP,
				srvip);
		PreferencesUtil.writePreference(TaskEnterActivity.this, CommonWAPreferences.SERVER_PORT,
				srvport);
		PreferencesUtil.writePreference(TaskEnterActivity.this, CommonWAPreferences.SERVER_ADDRESS,
				serverAddress);
		PreferencesUtil.writePreference(this, CommonWAPreferences.GROUP_ID, groupid);
		PreferencesUtil.writePreference(this, CommonWAPreferences.USER_ID, usrid);
		PreferencesUtil.writePreference(this, CommonWAPreferences.USER_NAME, username);
		PreferencesUtil.writePreference(this, CommonWAPreferences.USER_PASS, password);
		PreferencesUtil.writePreference(this, "ECM_APPID", appid);
		DeviceInfoVO deviceInfo = new DeviceInfoVO(this);
		String strDeviceInfo = deviceInfo.toJSONObject().toString();
		PreferencesUtil.writePreference(this, CommonWAPreferences.DEVICE_INFO, strDeviceInfo);
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_taskenter);
		final Intent intent = new Intent();
		inittaskrequest(new OnVORequestedListener() {
			@Override
			public void onVORequested(VOHttpResponse vo) {
				((App) getApplicationContext()).addGlobalVariable(
						CommonGlobalVariables.AFTER_LOGIN_VOHTTPRESPONSE, vo);
				intent.setClass(TaskEnterActivity.this, V63TaskGroupActivity.class);
				startActivity(intent);
				progressDlg.dismiss();
				finish();
			}

			@Override
			public void onVORequestFailed(VOHttpResponse vo) {
				toastMsg("Error");
				progressDlg.dismiss();
				finish();
			}
		});
	}

	// 审批模块跳转请求
	private void inittaskrequest(OnVORequestedListener listener) {
		requestVO(CommonServers.getServerAddress(this) + CommonServers.SERVER_SERVLET_WA,
				getTaskRequestVO(), listener);
	}

	// 审批模块请求构造方法
	private WAComponentInstancesVO getTaskRequestVO() {
		Map<String, Map<String, String>> actionsMap = new HashMap<String, Map<String, String>>();
		Map<String, String> params = new HashMap<String, String>();
		params.put("groupid", "");
		params.put("usrid", "");
		actionsMap.put(V63ActionTypes.TASK_GETTASKSTATUSLIST, params);
		params = new HashMap<String, String>();
		params.put("groupid", "");
		params.put("usrid", "");
		params.put("status", "ishandled");
		actionsMap.put(ActionTypes.TASK_GETTASKBUTTONLIST, params);
		params = new HashMap<String, String>();
		params.put("groupid", "");
		params.put("usrid", "");
		params.put("statuscode", "");
		params.put("statuskey", "ishandled");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		params.put("date", sdf.format(System.currentTimeMillis()));
		params.put("condition", "");
		params.put("startline", "1");
		params.put("count", "25");
		actionsMap.put(V63ActionTypes.TASK_GETTASKLIST, params);
		return VOProcessUtil.createMessageRequestVO(this, ComponentIds.A0A007, actionsMap);
	}

}
