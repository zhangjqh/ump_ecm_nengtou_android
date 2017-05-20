package wa.android.common.activity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;


import wa.android.common.App;
import wa.android.common.AppConfig;
import wa.android.common.Module;
import wa.android.common.R;
import wa.android.common.network.RequestListener;
import wa.android.common.network.WAGroupDataVO;
import wa.android.common.network.WAReqActionVO;
import wa.android.common.network.WAReqComponentVO;
import wa.android.common.network.WARequestVO;
import wa.android.common.network.WAResActionVO;
import wa.android.common.utils.PreferencesUtil;
import wa.android.constants.CommonActionTypes;
import wa.android.constants.CommonComponentIds;
import wa.android.constants.CommonServers;
import wa.android.constants.CommonWAPreferences;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


/**
 * 登录界面处理
 * 
 * @version nc6.3
 */
public class V57LoginActivity extends BaseActivity implements RequestListener {
	// 提示框
	private ProgressDialog progressDlg;
	private Button loginBtn, setConnectionBtn;
	private CheckBox autoLoginCheckBox;
	private EditText usrNameEditText, usrPassEditText;
	private TextView loginErrorTextView, accountsetTextView;
	private boolean hasAccountSet = false;
	private Animation logoAnimation;
	private Animation loginAnimation;
	private ImageView logoImageView;
	private LinearLayout loginLinearLayout, loginRestLinearLayout;
	private Module launchmodule;
	private List<WAGroupDataVO> accountsetList;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.v57activity_login);
//		logoImageView = (ImageView) findViewById(R.id.apploginImageView);
//		logoImageView.setImageResource(((App) getApplicationContext())
//				.getConfig().getWelcomeResId());
		Bundle bundle = this.getIntent().getExtras();
//		if (bundle == null) {

			initialViews();
//		} else
//			loadViews();
	}

//	private void loadViews() {
//		this.overridePendingTransition(R.anim.enteralpha, R.anim.exitalpha);
//		initialViews();
//	}

	private Handler handler = new Handler(){
		@Override
		public void handleMessage(Message msg) {
		
		if(accountsetList.size()>0){
			ArrayList<String> setList = new ArrayList<String>();
			for (WAGroupDataVO g : accountsetList) {
				setList.add(g.getGroupname());
			}
			String[] setArray = new String[setList.size()];
			setList.toArray(setArray);
			new AlertDialog.Builder(V57LoginActivity.this).setTitle("选取公司")
					.setItems(setArray, new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface dialog, int which) {
							accountsetTextView.setText(accountsetList.get(which).getGroupname());
							PreferencesUtil.writePreference(V57LoginActivity.this, CommonWAPreferences.GROUP_ID, accountsetList.get(which).getGroupid());
							PreferencesUtil.writePreference(V57LoginActivity.this,CommonWAPreferences.GROUP_NAME, accountsetList.get(which).getGroupname());
							PreferencesUtil.writePreference(V57LoginActivity.this,CommonWAPreferences.GROUP_CODE, accountsetList.get(which).getGroupcode());
							accountsetTextView.setBackgroundResource(R.drawable.login_accountset_button_enable_bg);
							hasAccountSet = true;
						}
					}).setNegativeButton(getString(R.string.cancel), null).show();
			}
			else{
				toastMsg("无公司");
			}
	}
	};
	private void initialViews() {

		boolean isAutoLogin = PreferencesUtil.readPreference(this,
				CommonWAPreferences.IS_AUTOLOGIN).equalsIgnoreCase("true");
		// 提示框
		progressDlg = new ProgressDialog(V57LoginActivity.this);
		progressDlg.setTitle(null);
		progressDlg.setMessage(getString(R.string.loginIng));
		progressDlg.setIndeterminate(true);
		progressDlg.setCancelable(false);
		// 错误提示框
		loginErrorTextView = (TextView) findViewById(R.id.login_errorTextView);
		loginErrorTextView.setText(null);
		// 自动登录选择框
		autoLoginCheckBox = (CheckBox) findViewById(R.id.login_autoLogin_checkBox);
		autoLoginCheckBox.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// PreferencesUtil.writePreference(this,
				// CommonWAPreferences.IS_AUTOLOGIN,
				// String.valueOf(autoLoginCheckBox.isChecked()));
				OnAutoLoginBtnClick();
			}

		});
		// 用户名、密码输入框
		usrNameEditText = (EditText) findViewById(R.id.login_usernameEditText);
		usrPassEditText = (EditText) findViewById(R.id.login_passwordEditText);
		// 登录按钮
		loginBtn = (Button) findViewById(R.id.login_loginBtn);
		loginBtn.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// 登录
				if (hasAccountSet)
					onLoginBtnClick();
				else {
					String toastmsg = "请选取公司";
					new AlertDialog.Builder(V57LoginActivity.this)
							.setMessage(toastmsg)
							.setPositiveButton(getString(R.string.submit),
									new DialogInterface.OnClickListener() {

										@Override
										public void onClick(
												DialogInterface dialog,
												int which) {
											// TODO Auto-generated method stub

										}
									}).show();
				}

			}
		});
		// 连接设置按钮
		setConnectionBtn = (Button) findViewById(R.id.login_setconnectionBtn);
		setConnectionBtn.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(V57LoginActivity.this,
						SetConnectionActivity.class);
				Bundle bundle = new Bundle();
				bundle.putString("isFromLogin", "Y");
				intent.putExtras(bundle);
				// intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(intent);
			}
		});
		// 填充用户名、密码
		usrNameEditText.setText(PreferencesUtil.readPreference(this,
				CommonWAPreferences.USER_NAME));
		// if (isAutoLogin) {
		// //仅在自动登录开启时给密码框设密码
		// usrPassEditText.setText(PreferencesUtil.readPreference(this,
		// CommonWAPreferences.USER_PASS));
		// }
		// 自动登录
		autoLoginCheckBox.setChecked(isAutoLogin);
		accountsetTextView = (TextView) findViewById(R.id.login_accountset_selectTextView);
		accountsetTextView.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				onAccountSetSelectBtnClicked();
			}
		});
	}
	protected void onAccountSetSelectBtnClicked() {
		if (isRequesting)
			return;
		WAReqActionVO reqaccountAction =  new WAReqActionVO(CommonActionTypes.GET_ACCOUNT);
		progressDlg.show();
		this.request(CommonServers.getServerAddress(V57LoginActivity.this) + CommonServers.SERVER_SERVLET_GETACCOUNTSET, CommonComponentIds.WA00000, reqaccountAction, this);
		}
	


	/**
	 * 进行是否自动登录的处理
	 */

	private void OnAutoLoginBtnClick() {
		PreferencesUtil.writePreference(this, CommonWAPreferences.IS_AUTOLOGIN,
				String.valueOf(autoLoginCheckBox.isChecked()));

	}

	/**
	 * 进行登录的处理
	 */
	private void onLoginBtnClick() {
		// loginErrorTextView.setText(null);
		String username = usrNameEditText.getText().toString();
		String password = usrPassEditText.getText().toString();
		// 判断用户名、密码
		if ("".equals(username) && "".equals(password)) {
			alert(-1, R.string.usernameAndPasswordIsNotNull, R.string.submit,
					null);
			return;
		}
		// 判断用户名
		if ("".equals(username)) {
			alert(-1, R.string.usernameIsNotNull, R.string.submit, null);
			return;
		}
		// 判断密码
		if ("".equals(password)) {
			alert(-1, R.string.passwordIsNotNull, R.string.submit, null);
			return;
		}
		// 将用户名、密码、是否自动登录w
		PreferencesUtil.writePreference(this, CommonWAPreferences.USER_NAME,
				usrNameEditText.getText().toString());
		PreferencesUtil.writePreference(this, CommonWAPreferences.USER_PASS,
				usrPassEditText.getText().toString());
		// 发送登录请求
		progressDlg.show();
		App.getLoginManager().requestLogin(this);
	}

	@Override
	public void onRequested(WARequestVO vo) {
		WAReqComponentVO compLoginVO = vo
				.getReqComponentVO(CommonComponentIds.WA00001);
		if(compLoginVO!=null){
		WAResActionVO resaction = compLoginVO.actionList.get(0).resActionVO;
		int flag = resaction.flag;
		switch (flag) {
		case 0:
			((App) getApplication()).getConfig().getMainModule()
					.onLoginSuccessfully(vo, this);
			break;
		default:
			toastMsg(resaction.desc);
			break;
		}
		// 隐藏加载框
		progressDlg.dismiss();
		}else{
			WAReqActionVO temp = vo.getReqActionVO(CommonComponentIds.WA00000, 0);
			if (temp != null)
			{
				WAResActionVO actionVO = temp.resActionVO;
				{
					if ((actionVO.actiontype.endsWith(CommonActionTypes.GET_ACCOUNT)) && (actionVO.responseList != null))
					{
						if (actionVO.flag == 0){
							accountsetList = new ArrayList<WAGroupDataVO>();
							try {
								Map object = (Map) actionVO.responseList
										.get(0).returnValue.get(0);
							
								
								if (null != object) {
									Map groupliststruct = (Map) object
											.get("grouplist");
									List<Map> grouplistmap = (List<Map>) groupliststruct.get("groupdata");
									if(grouplistmap != null){
									if (null != grouplistmap) {
										Iterator<Map> iter = grouplistmap.iterator();
										while(iter.hasNext()) {
											Map map = iter.next();
											WAGroupDataVO groupDataVO = new WAGroupDataVO();
											groupDataVO.setGroupid((String)map.get("groupid"));		
											groupDataVO.setGroupcode((String)map.get("groupcode"));	
											groupDataVO.setGroupname((String)map.get("groupname"));	
											
											accountsetList.add(groupDataVO);
										}
									}
									}
								}
							} catch (Exception e) {
							toastMsg("获取公司失败");
							}

							}
						handler.sendEmptyMessage(0);
						
						}
					
					}
				}
			progressDlg.dismiss();
		}
	}

	@Override
	public void onRequestFailed(int errorCode) {
		progressDlg.dismiss();
	}

	public boolean isSystemActivity() {
		return true;
	}
}
