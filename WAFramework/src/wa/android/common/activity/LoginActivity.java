package wa.android.common.activity;

import wa.android.common.App;
import wa.android.common.R;
import wa.android.common.network.RequestListener;
import wa.android.common.network.WAReqComponentVO;
import wa.android.common.network.WARequestVO;
import wa.android.common.network.WAResActionVO;
import wa.android.common.utils.PreferencesUtil;
import wa.android.constants.CommonComponentIds;
import wa.android.constants.CommonWAPreferences;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;

/**
 * 登录界面处理
 * @version nc6.3
 */
public class LoginActivity extends BaseActivity implements RequestListener {
	//提示框
	protected ProgressDialog progressDlg;
	private Button loginBtn, setConnectionBtn;
	private CheckBox autoLoginCheckBox;
	private EditText usrNameEditText, usrPassEditText;

	private Animation logoAnimation;
	private Animation loginAnimation;
	private ImageView logoImageView;
	private LinearLayout loginLinearLayout,loginRestLinearLayout;

	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		logoImageView = (ImageView) findViewById(R.id.apploginImageView);
		logoImageView.setImageResource(((App)getApplicationContext()).getConfig().getWelcomeResId());
		Bundle bundle = this.getIntent().getExtras();
		if (bundle == null){
			AnimationHandler();
			initialViews();}
		else
			loadViews();
	}

	private void loadViews() {
		 this.overridePendingTransition(R.anim.enteralpha,R.anim.exitalpha);
			initialViews();
	}

	/**
	 * 初始化界面元素
	 */
	private void AnimationHandler(){
		//AppLogo动画效果
				
		logoAnimation = AnimationUtils.loadAnimation(getBaseContext(), R.anim.applogo_slide_in_buttom);
		logoImageView.setAnimation(logoAnimation);
		//登陆框动画效果
		loginAnimation = AnimationUtils.loadAnimation(getBaseContext(), R.anim.slide_in_buttom);
		loginLinearLayout = (LinearLayout)findViewById(R.id.loginpanel);
		loginLinearLayout.setAnimation(loginAnimation);
		//登陆按钮、其他部分动画效果
		loginBtn = (Button)findViewById(R.id.login_loginBtn);
		loginRestLinearLayout = (LinearLayout)findViewById(R.id.login_rest);
		loginRestLinearLayout.setAnimation(loginAnimation);
		loginBtn.setAnimation(loginAnimation);
	}
	
	private void initialViews() {

		boolean isAutoLogin = PreferencesUtil.readPreference(this, CommonWAPreferences.IS_AUTOLOGIN).equalsIgnoreCase("true");
		//提示框
		progressDlg = new ProgressDialog(LoginActivity.this);
		progressDlg.setTitle(null);
		progressDlg.setMessage(getString(R.string.loginIng));
		progressDlg.setIndeterminate(true);
		progressDlg.setCancelable(false);
		//自动登录选择框
		autoLoginCheckBox = (CheckBox) findViewById(R.id.login_autoLogin_checkBox);
		autoLoginCheckBox.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
//				PreferencesUtil.writePreference(this, CommonWAPreferences.IS_AUTOLOGIN, String.valueOf(autoLoginCheckBox.isChecked()));
				OnAutoLoginBtnClick();
			}


		});
		//用户名、密码输入框
		usrNameEditText = (EditText) findViewById(R.id.login_usernameEditText);
		usrPassEditText = (EditText) findViewById(R.id.login_passwordEditText);
		//登录按钮
		loginBtn = (Button) findViewById(R.id.login_loginBtn);
		loginBtn.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				//登录
				onLoginBtnClick();
			}
		});
		//连接设置按钮
		setConnectionBtn = (Button) findViewById(R.id.login_setconnectionBtn);
		setConnectionBtn.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(LoginActivity.this, SetConnectionActivity.class);
				Bundle bundle = new Bundle();
				bundle.putString("isFromLogin", "Y");
				intent.putExtras(bundle);
//				intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(intent);
			}
		});
		//填充用户名、密码
		usrNameEditText.setText(PreferencesUtil.readPreference(this, CommonWAPreferences.USER_NAME));
//		if (isAutoLogin) {
//			//仅在自动登录开启时给密码框设密码
//			usrPassEditText.setText(PreferencesUtil.readPreference(this, CommonWAPreferences.USER_PASS));
//		}
		//自动登录
		autoLoginCheckBox.setChecked(isAutoLogin);
	}
	/**
	 * 进行是否自动登录的处理
	 */
	
	private void OnAutoLoginBtnClick() {
		PreferencesUtil.writePreference(this, CommonWAPreferences.IS_AUTOLOGIN, String.valueOf(autoLoginCheckBox.isChecked()));
		
	}
	/**
	 * 进行登录的处理
	 */
	private void onLoginBtnClick() {
//		loginErrorTextView.setText(null);
		String username = usrNameEditText.getText().toString();
		String password = usrPassEditText.getText().toString();
		//判断用户名、密码
		if("".equals(username) && "".equals(password)) {
			alert(-1, R.string.usernameAndPasswordIsNotNull, R.string.submit, null);
			return;     
		}
		//判断用户名
		if("".equals(username)) {
			alert(-1, R.string.usernameIsNotNull, R.string.submit, null);
			return;
		}
		//判断密码
		if("".equals(password)) {
			alert(-1, R.string.passwordIsNotNull, R.string.submit, null);
			return;
		}
		//将用户名、密码、是否自动登录w
		PreferencesUtil.writePreference(this, CommonWAPreferences.USER_NAME, usrNameEditText.getText().toString());
		PreferencesUtil.writePreference(this, CommonWAPreferences.USER_PASS, usrPassEditText.getText().toString());
		//发送登录请求
		progressDlg.show();
		App.getLoginManager().requestLogin(this);
	}

	@Override
	public void onRequested(WARequestVO vo) {
		WAReqComponentVO compLoginVO = vo.getReqComponentVO(CommonComponentIds.WA00001);
		WAResActionVO resaction = compLoginVO.actionList.get(0).resActionVO;
		int flag = resaction.flag;
		switch (flag) {
		case 0:
			((App)getApplication()).getConfig().getMainModule().onLoginSuccessfully(vo, this);
			break;
		default:
			toastMsg(resaction.desc);
			break;
		}
		//隐藏加载框
		progressDlg.dismiss();
	}
	@Override
	public void onRequestFailed(int errorCode) {
		progressDlg.dismiss();
	}
	
	public boolean isSystemActivity(){
		return true;
	}
	protected void hideProgressDlg(){
		progressDlg.dismiss();
	}
}
