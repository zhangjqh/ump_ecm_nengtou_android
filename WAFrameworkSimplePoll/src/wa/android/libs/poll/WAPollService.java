package wa.android.libs.poll;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Timer;

import org.apache.http.RequestLine;

import wa.android.common.activity.WelcomeActivity;
import wa.android.common.network.LoginManager;
import wa.android.common.network.RequestListener;
import wa.android.common.network.WAReqActionVO;
import wa.android.common.network.WARequestVO;
import wa.android.common.network.WAResActionVO;
import wa.android.common.network.WAResStructVO;
import wa.android.common.utils.PreferencesUtil;
import wa.android.constants.CommonWAPreferences;
import wa.android.libs.poll.data.PollDataVO;
import wa.android.libs.poll.data.PollRequestVO;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.support.v4.app.NotificationCompat;
import android.util.Log;
import wa.android.common.network.ServiceInfo;
import wa.android.common.App;

/**
 * 这个类用于做推送服务
 * 
 * @author xubob
 *
 */
public class WAPollService extends Service
implements RequestListener
{
	protected static final String PUSH_ACTION_TYPE = "readpushmsg";
	protected static final String PUSH_COMPONENT_ID = "WA00005";
	protected static final String PUSH_SERVER_SERVLET = "/servlet/wareadpushservlet";
	
//	private static final long POLL_TIMER_NORMAL = 5 * 60000;
	private static final long POLL_TIMER_NORMAL =  60000;
	private static final long POLL_TIMER_DEBUG = 15000;

    private IBinder binder=new WAPollService.LocalBinder();
    private PollRequestVO registerVO;
	private Timer timer = null;
	private PollTimerTask ptt = null;
	private long pollTime = 0;
	@Override
	public IBinder onBind(Intent arg0) {
		return binder;
	}
	

	@Override
	public void onStart(Intent intent, int startId) {
		Log.d("SimplePoll", "轮询onStart" );

		Log.d("SimplePoll", "轮询服务启动");
		Log.d("SimplePoll", "轮询配置读取");
		registerVO = new PollRequestVO();
		boolean debug = ((App)this.getApplication()).debugNotification();
		if (debug) {
			pollTime = POLL_TIMER_DEBUG;
		} else {
			pollTime = POLL_TIMER_NORMAL;
		}
		String sessionData = PreferencesUtil.readPreference(this, LoginManager.LOGIN_SESSION_4POLL);
		List<ServiceInfo> serviceInfos = ServiceInfo.fromJSONArray(sessionData);
		registerVO.usrid = new ArrayList<String>();
		registerVO.serviceCode = new ArrayList<String>();
		for (ServiceInfo info: serviceInfos) {
			registerVO.usrid.add(info.usrid);
			registerVO.serviceCode.add(info.servicecode);
		}
		registerVO.serverIP = PreferencesUtil.readPreference(this,  CommonWAPreferences.SERVER_IP);
		registerVO.serverPort = PreferencesUtil.readPreference(this,  CommonWAPreferences.SERVER_PORT);
		registerVO.appid = ((App)this.getApplication()).getConfig().getAppId();
		registerVO.usrcode = PreferencesUtil.readPreference(this,  CommonWAPreferences.USER_NAME);
		//开始轮询时先尝试停止轮询工作
		Log.d("SimplePoll", "尝试轮询工作停止");
		if (ptt != null) {
			ptt.cancel();
		}
		ptt = null;

		if (timer != null) {
			timer.cancel();
		}
		timer = null;
		Log.d("SimplePoll", "轮询工作重新启动");
		timer = new Timer();
		ptt = new PollTimerTask(this, registerVO, this);
		Log.d("SimplePoll", "轮询服务定时器开始工作");
		timer.schedule(ptt, 0, pollTime);
	}
	
	
    //定义内容类继承Binder
    public class LocalBinder extends Binder{
        //返回本地服务
    	WAPollService getService(){
            return WAPollService.this;
        }
    }
    
	@Override
	public void onRequested(WARequestVO vo) {
		WAReqActionVO action = vo.getReqActionVO(PUSH_COMPONENT_ID, 0);
		WAResActionVO res = action.resActionVO;
		switch(res.flag) {
		case 0:
			//正常情况，处理收到的推送数据
			WAResStructVO struct = res.responseList.get(0);
			Map<String, List<Map<String, String>>> structData = (Map<String, List<Map<String, String>>>)struct.returnValue.get(0);
			List<Map<String, String>> pollDataList = structData.get("pushreturn");
			if (pollDataList == null) {
				Log.d("SimplePoll", "轮询正常：无数据");
				break;
			} else {
				for (int i = pollDataList.size() - 1; i >=0; i--) {
					Map<String, String> pushData = pollDataList.get(i);
					PollDataVO dataVO = new PollDataVO(pushData);
					//处理，放到界面上
					dealPollDataVO(dataVO);
				}
			}
			break;
		case 2:
			Log.d("SimplePoll", "轮询异常：" + res.desc);
			Log.d("SimplePoll", "轮询即将停止");
			pollStop();
			break;
		default:
			Log.d("SimplePoll", "本次轮询失败，但轮询继续(onRequested)___异常描述："+res.desc);
			break;
		}
	}
	
	private void pollStop(){
		if (ptt != null) {
			ptt.cancel();
			ptt = null;
		}
		if (timer != null) {
			timer.cancel();
			timer = null;
		}
		Log.d("SimplePoll", "轮询服务定时器结束");
	}
	
	@Override
	public void onDestroy(){
		super.onDestroy();
		Log.d("SimplePoll", "轮询服务停止");
		pollStop();
	}


	@Override
	public void onRequestFailed(int code) {
		Log.d("SimplePoll", "轮询异常：Error Code-" + code);
		Log.d("SimplePoll", "本次轮询失败，但轮询继续(onRequestFailed)");
	}
	
	/**
	 * 用于做Notification的ID区分，以使得每次的消息的ID都不一样
	 */
	private int notifyid = 0;

	/**
	 * 处理消息，构造主界面上的标志。
	 * @param dataVO
	 */
	private void dealPollDataVO(PollDataVO dataVO){
		Log.d("SimplePoll", "轮询成功：获取到数据" + dataVO.toString());
		NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
		NotificationCompat.Builder builder = new NotificationCompat.Builder(this);
		builder.setSmallIcon(getApplicationInfo().icon);
		builder.setContentText(dataVO.content);
		builder.setContentTitle(getString(getApplicationInfo().labelRes));
		builder.setWhen(System.currentTimeMillis());
		builder.setDefaults(Notification.DEFAULT_SOUND|Notification.DEFAULT_VIBRATE);
		builder.setAutoCancel(true);
		builder.setTicker(dataVO.content);
		NotificationCompat.BigTextStyle bigText = new NotificationCompat.BigTextStyle();
		bigText.bigText(dataVO.content);
		builder.setStyle(bigText);
		Intent i = new Intent(this, NotificationActivity.class);
		Log.d("SimplePoll", dataVO.toString());
		i.setAction("notify");
		i.putExtra("mnc", dataVO.mnc);
		i.putExtra("msgid", dataVO.msgid);
		
		PendingIntent contentIntent = PendingIntent.getActivity(this, notifyid, i, PendingIntent.FLAG_UPDATE_CURRENT);
		builder.setContentIntent(contentIntent);
		notificationManager.notify(notifyid++, builder.build());
	}
}
