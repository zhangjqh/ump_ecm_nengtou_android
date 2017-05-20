package wa.android.common.activity;

import wa.android.common.network.RequestListener;
import wa.android.common.network.WAReqActionVO;
import wa.android.common.network.WARequestVO;
import wa.android.constants.CommonActionTypes;
import wa.android.constants.CommonComponentIds;
import wa.android.constants.CommonServers;
import android.content.Intent;
import android.os.Bundle;

public class LogoutActivity extends BaseActivity implements RequestListener{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		WARequestVO request = new WARequestVO(this);
		WAReqActionVO actionLogin = new WAReqActionVO(CommonActionTypes.LOGOUT);
		actionLogin.addPar("groupid", "");
		actionLogin.addPar("usrid", "");
		request.addWAActionVO(CommonComponentIds.WA00001, actionLogin);
		request(CommonServers.getServerAddress(LogoutActivity.this) + CommonServers.SERVER_SERVLET_LOGOUT, 
				request);
		Intent i = new Intent(LogoutActivity.this, WelcomeActivity.class);
		i.setAction("logout");
		i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
		startActivity(i);
		finish();
	}

	@Override
	public void onRequested(WARequestVO vo) {
		//无需做任何处理		
	}

	@Override
	public void onRequestFailed(int code) {
		//无需做任何处理
		
	}
}
