package wa.android.common.activity;
import org.apache.http.Header;

import wa.android.common.App;
import wa.android.common.AppConfig;
import wa.android.common.R;
import wa.android.common.network.Network;
import wa.android.common.network.RequestListener;
import wa.android.common.network.WARequestVO;
import wa.android.common.utils.PreferencesUtil;
import wa.android.constants.CommonServers;
import wa.android.constants.CommonWAIntents;
import wa.android.constants.CommonWAPreferences;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

/**
 * 设置网络连接的界面
 * 启动时如果检测到未保存连接地址，将会启动这个界面让用户进行设置
 * 用户主动点击设置选项中的连接地址设置也会启动这个界面进行设置
 * @version nc6.3
 */
public class SetConnectionActivity extends BaseActivity implements OnClickListener {

	private EditText srvipEditText;
	private EditText srvportEditText;
	private Button saveBtn;
	private ImageView logoImageView;
	private ProgressDialog progressDlg;// 提示框
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setconnection);
		Bundle bundle = this.getIntent().getExtras();
		if (bundle == null)
			initialViews();
		else
			loadViews();
    }
    
    private void loadViews() {
		 this.overridePendingTransition(R.anim.enteralpha,R.anim.exitalpha);
    	initialViews();
	}

	/**
     * 初始化界面，填写server地址，但是未对server的请求地址进行校验
     */
    private void initialViews(){
		progressDlg = new ProgressDialog(this);
		progressDlg.setMessage(getResources().getString(R.string.loading));
		progressDlg.setCancelable(false);
		logoImageView = (ImageView) findViewById(R.id.apploginImageView);
		
		logoImageView.setImageResource(((App)getApplicationContext()).getConfig().getWelcomeResId());
    	//ip和端口号编辑框
    	srvipEditText = (EditText) findViewById(R.id.setconnection_ipEditText);
    	srvportEditText = (EditText) findViewById(R.id.setconnection_portEditText);
    	srvportEditText.setInputType(InputType.TYPE_CLASS_NUMBER);
    	//保存按钮
    	saveBtn = (Button)findViewById(R.id.setconnection_saveButton);
    	saveBtn.setOnClickListener(this);
    	
    	//如果地址已经存在则将地址填充到界面上
    	String srvip = PreferencesUtil.readPreference(this, CommonWAPreferences.SERVER_IP);
    	String srvport = PreferencesUtil.readPreference(this, CommonWAPreferences.SERVER_PORT);
		srvipEditText.setText(srvip);
		srvportEditText.setText(srvport);
    }

	@Override
	public void onClick(View v) {
		//TODO: 如果没输入则返回RESULT_CANCLED
		String srvip = srvipEditText.getText().toString();
		String srvport = srvportEditText.getText().toString();
		if ("".equals(srvip) || "".equals(srvport)) {
			alert(-1, R.string.error_input_empty, R.string.submit, null);
		} else {
			String serverAddress = "http://" + srvip + ":" + srvport;
			CommonServers.setServerAddress(SetConnectionActivity.this, serverAddress);
			//保存到本地
			PreferencesUtil.writePreference(SetConnectionActivity.this, CommonWAPreferences.SERVER_IP, srvip);
			PreferencesUtil.writePreference(SetConnectionActivity.this, CommonWAPreferences.SERVER_PORT, srvport);
			PreferencesUtil.writePreference(SetConnectionActivity.this, CommonWAPreferences.SERVER_ADDRESS, serverAddress);
			
			preLogin();
			
//			//回到登录界面
//			Intent i = new Intent(SetConnectionActivity.this, WelcomeActivity.class);
//			i.setAction("saveconfig");
//			i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
//			startActivity(i);
		}
	}
	private void preLogin() {
		Log.i(getClass().getName(), "start preLogin");
		// TODO: 如果没输入则返回RESULT_CANCLED
		progressDlg.show();
		
		
		Log.i(getClass().getName(), "预登录：开始预登录");
		Network newtork = App.getNetworkInstance();
		newtork.requestPreLogin(
				CommonServers.getServerAddress(SetConnectionActivity.this)
						+ CommonServers.SERVER_SERVLET_PRELOGIN,
				new RequestListener() {
					@Override
					public void onRequested(WARequestVO vo) {
						if ("".equals(App.config.getExceptiondesc())) {
						AppConfig.setAPP_VERSION("1.0");
						for (Header h : vo.getHeaderlist()) {
							if (h.getName().trim()
									.equalsIgnoreCase("appversion")) {
								if (h.getValue().equals("2.0")||h.getValue().equals("2")) {
									AppConfig.setAPP_VERSION("2.0");
								} else if (h.getValue().equals("1.0")) {
									AppConfig.setAPP_VERSION("1.0");
								} else if (h.getValue().equals("0.7")) {
									AppConfig.setAPP_VERSION("0.7");
								}else if (h.getValue().equals("")) {
									AppConfig.setAPP_VERSION("1.0");
								}
							}
						}
						PreferencesUtil.writePreference(SetConnectionActivity.this,CommonWAPreferences.LAST_VERSION,
								AppConfig.getAPP_VERSION());
						Intent loginActivity = CommonWAIntents
								.getLOGIN_ACTIVITY(
										SetConnectionActivity.this,
										AppConfig.getAPP_VERSION());
						loginActivity
								.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
						startActivity(loginActivity);
						finish();
					} else {
						toastMsg(App.config.getExceptiondesc());

						AppConfig
								.setAPP_VERSION(PreferencesUtil.readPreference(SetConnectionActivity.this,CommonWAPreferences.LAST_VERSION));
						startActivity(CommonWAIntents.getLOGIN_ACTIVITY(
								SetConnectionActivity.this,
								AppConfig.getAPP_VERSION()));

					}
						progressDlg.dismiss();
						}
						@Override
						public void onRequestFailed(int errorCode) {
							startActivity(CommonWAIntents
									.getLOGIN_ACTIVITY(SetConnectionActivity.this));
							finish();
						}
					});

					}
	public boolean isSystemActivity(){
		return true;
	}
}
