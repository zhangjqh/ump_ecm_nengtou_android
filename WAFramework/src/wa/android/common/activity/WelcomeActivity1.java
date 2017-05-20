package wa.android.common.activity;


import org.apache.http.Header;

import wa.android.common.App;
import wa.android.common.AppConfig;
import wa.android.common.R;
import wa.android.common.network.DeviceInfoVO;
import wa.android.common.network.Network;
import wa.android.common.network.RequestListener;
import wa.android.common.network.WAReqComponentVO;
import wa.android.common.network.WARequestVO;
import wa.android.common.network.WAResActionVO;
import wa.android.constants.CommonComponentIds;
import wa.android.constants.CommonServers;
import wa.android.constants.CommonWAIntents;
import wa.android.constants.CommonWAPreferences;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import wa.android.common.utils.PreferencesUtil;
import wa.android.common.versioncheck.VersionCheck;

/**
 * 欢迎界面 在这个界面中将：检测网络连接情况，读取保存的ip，检测是否自动登录，预登录。
 */
@SuppressLint("HandlerLeak")
public class WelcomeActivity1 extends BaseActivity implements RequestListener {
	private Animation logoAnimation;
	private ImageView waitingImageView;
	private ImageView 	logoImageView;

	private static final int FLAG_USER_STATE_ONLINE = 9020;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		super.onCreate(savedInstanceState);
//		((App)getApplication()).isRunning = true;
		setContentView(R.layout.activity_welcome);
		
		VersionCheck versionCheck = new VersionCheck(WelcomeActivity1.this);
		versionCheck.checkVersion();
		
		
		initialViews();
		checkSavedServerAddress();
		//启动应用时构造DeviceInfo，并写入Preferences备用
		DeviceInfoVO deviceInfo = new DeviceInfoVO(this);
		String strDeviceInfo = deviceInfo.toJSONObject().toString();
		PreferencesUtil.writePreference(this, CommonWAPreferences.DEVICE_INFO, strDeviceInfo);
	}
	
	
	private Handler handler = new Handler(){
		public void handleMessage(android.os.Message msg) {
			AlertDialog dialog = null;
			dialog = new AlertDialog.Builder(WelcomeActivity1.this).create();
//			if (title != -1) {
//				dialog.setTitle(title);
//			}
//			if (content != null) {
				dialog.setMessage("该用户已在线，是否强制登录？");
//			}
			dialog.setButton("确定", new OnClickListener(){
				@Override
				public void onClick(DialogInterface dialog, int which) {
					dialog.dismiss();
//					progressDlg.show();
					App.getLoginManager().requestForceLogin(WelcomeActivity1.this);
				}
			});
			dialog.setButton2("取消", new OnClickListener(){
				@Override
				public void onClick(DialogInterface dialog, int which) {
					dialog.dismiss();
					onRequestFailed(0);
				}
			});
			dialog.show();
		}
	};
	/**
	 * 检查是否保存了server地址 以及 网络状态
	 */
	private void checkSavedServerAddress() {
		String serverAddress = CommonServers.getServerAddress(WelcomeActivity1.this);
		if (null == serverAddress || "".equals(serverAddress.trim())) {
			startActivityForResult(CommonWAIntents.getSETCONNECTION_ACTIVITY(getBaseContext()), ACT_REQUESTCODE_SETCONNECTION);
		} else {
			preLogin();
		}
	}
	private void initialViews() {
		logoImageView = (ImageView) findViewById(R.id.apploginImageView);
		waitingImageView = (ImageView) findViewById(R.id.waitingImageView);
		logoImageView.setImageResource(((App)getApplicationContext()).getConfig().getWelcomeResId());
		logoAnimation = AnimationUtils.loadAnimation(getBaseContext(), R.anim.slide_in_left);
		waitingImageView.setAnimation(logoAnimation);
	}


	private void preLogin() {	
		Log.i(getClass().getName(), "预登录：开始预登录");
		Network newtork = App.getNetworkInstance();
		newtork.requestPreLogin(
				CommonServers.getServerAddress(WelcomeActivity1.this)
						+ CommonServers.SERVER_SERVLET_PRELOGIN,
				new RequestListener() {
					@Override
					public void onRequested(WARequestVO vo) {
						if("".endsWith(App.config.getExceptiondesc())){
							for (Header h : vo.getHeaderlist()) {
							if(h.getName().trim().equalsIgnoreCase("appversion")){
								if(h.getValue().equals("2.0")||h.getValue().equals("2")){
									AppConfig.setAPP_VERSION("2.0");
								}else if(h.getValue().equals("1.0")){
									AppConfig.setAPP_VERSION("1.0");
								}else if(h.getValue().equals("0.7")){
									AppConfig.setAPP_VERSION("0.7");
								}
							}
							}
							PreferencesUtil.writePreference(WelcomeActivity1.this,
									CommonWAPreferences.LAST_VERSION,
									AppConfig.getAPP_VERSION());
						}else{
							toastMsg(App.config.getExceptiondesc());
						}
					
					startActivity();
				}

					@Override
					public void onRequestFailed(int errorCode) {
						startActivity(CommonWAIntents
								.getLOGIN_ACTIVITY(WelcomeActivity1.this));
						finish();
					}
				});
	}
	
	private void startActivity() {
		boolean isAutoLogin = PreferencesUtil.readPreference(this, CommonWAPreferences.IS_AUTOLOGIN).equalsIgnoreCase("true");
		if(!isAutoLogin) {//如果不是自动登录跳转到登陆界面
//			Intent i = 
//			CommonWAIntents
//			.getLOGIN_ACTIVITY(WelcomeActivity1.this , AppConfig.getAPP_VERSION());
			Intent i = CommonWAIntents
					.getLOGIN_ACTIVITY(WelcomeActivity1.this , AppConfig.getAPP_VERSION());
			startActivity(i);
			finish();
		} else {//如果是自动登录进行登录操作

			App.getLoginManager().requestLogin(this);
		}
	}
	

	//这里用来处理自动登录
	@Override
	public void onRequested(WARequestVO vo) {
		WAReqComponentVO compLoginVO = vo.getReqComponentVO(CommonComponentIds.WA00001);
		WAResActionVO resaction = compLoginVO.actionList.get(0).resActionVO;
		int flag = resaction.flag;

		switch (flag) {
		case 0:
			((App)getApplication()).getConfig().getMainModule().onLoginSuccessfully(vo, this);
			finish();
			break;
		case FLAG_USER_STATE_ONLINE:
			handler.sendEmptyMessage(0);
			break;
		default:
			onRequestFailed(0);
			break;
		}
		
	}
	@Override
	public void onRequestFailed(int errorCode) {
		Intent i = 
				CommonWAIntents
				.getLOGIN_ACTIVITY(WelcomeActivity1.this , AppConfig.getAPP_VERSION());
				startActivity(i);
		finish();
	}
	
	public boolean isSystemActivity(){
		return true;
	}
}
