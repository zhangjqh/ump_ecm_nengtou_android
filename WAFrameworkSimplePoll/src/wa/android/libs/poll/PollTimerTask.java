package wa.android.libs.poll;

import java.util.TimerTask;
import wa.android.common.network.Network;
import wa.android.common.network.RequestListener;
import wa.android.common.network.WAReqActionVO;
import wa.android.common.network.WARequestVO;
import wa.android.constants.CommonServers;
import wa.android.libs.poll.data.DeviceInfoVO;
import wa.android.libs.poll.data.PollRequestVO;

import android.content.Context;
import android.util.Log;

/**
 * 这个类用于推送服务的定时器任务
 * 
 * 
 * 
 * @author xubob
 *
 */
public class PollTimerTask extends TimerTask
{
	

	private String url = null;
	private Network pollNetworkInstance = null;
	private PollRequestVO pollRegisterVO = null;
	private WARequestVO request = null;
	private DeviceInfoVO di = null;
	
	
	protected PollTimerTask(Context context, PollRequestVO pollrVO, RequestListener rl) {
		pollNetworkInstance = new Network(context);
		pollRegisterVO = pollrVO;
		di = new DeviceInfoVO(context);
		
		url = CommonServers.getServerAddress(context) + WAPollService.PUSH_SERVER_SERVLET;
		
		WAReqActionVO requestAction = new WAReqActionVO(WAPollService.PUSH_ACTION_TYPE);
		requestAction.addPar("usrid", pollRegisterVO.usrid);
		requestAction.addPar("servicecode", pollRegisterVO.serviceCode);
		requestAction.addPar("usrcode", pollRegisterVO.usrcode);
		requestAction.addPar("appid", pollRegisterVO.appid);
		requestAction.addPar("deviceid", di.toString());
		
		request = new WARequestVO(rl);
		request.addWAActionVO(WAPollService.PUSH_COMPONENT_ID, requestAction);
		
	}

	@Override
	public void run() {
		Log.d("SimplePoll", "开始本次轮询");
		Log.d("SimplePoll", "url=" + url);
		Log.d("SimplePoll", "usrid=" + pollRegisterVO.usrid); 
		Log.d("SimplePoll", "usrcode=" + pollRegisterVO.usrcode);
		pollNetworkInstance.requestSilence(url, request);
	}



}
