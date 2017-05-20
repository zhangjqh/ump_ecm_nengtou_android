package wa.android.common.activity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Handler;
import wa.android.common.App;
import wa.android.common.network.WAReqComponentVO;
import wa.android.common.network.WARequestVO;
import wa.android.common.network.WAResActionVO;
import wa.android.constants.CommonComponentIds;

public class LoginWithForceLoginActivity extends LoginActivity{
	
	private static final int FLAG_USER_STATE_ONLINE = 9020;
	
	private Handler handler = new Handler(){
		public void handleMessage(android.os.Message msg) {
			AlertDialog dialog = null;
			dialog = new AlertDialog.Builder(LoginWithForceLoginActivity.this).create();
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
					progressDlg.show();
					App.getLoginManager().requestForceLogin(LoginWithForceLoginActivity.this);
				}
			});
			dialog.setButton2("取消", new OnClickListener(){
				@Override
				public void onClick(DialogInterface dialog, int which) {
					dialog.dismiss();
				}
			});
			dialog.show();
		}
	};
	@Override
	public void onRequested(WARequestVO vo) {
		WAReqComponentVO compLoginVO = vo.getReqComponentVO(CommonComponentIds.WA00001);
		WAResActionVO resaction = compLoginVO.actionList.get(0).resActionVO;
		int flag = resaction.flag;
		switch (flag) {
		case 0:
			((App)getApplication()).getConfig().getMainModule().onLoginSuccessfully(vo, this);
			break;
		case FLAG_USER_STATE_ONLINE:
			handler.sendEmptyMessage(0);
			break;
		default:
			toastMsg(resaction.desc);
			break;
		}
		//隐藏加载框
		hideProgressDlg();
	}
	
	
	
}
