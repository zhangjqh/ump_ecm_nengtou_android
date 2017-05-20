package nc.bs.oa.oama.ntecm;

import com.yonyou.ma.platform.modul.update.MaUpdateAgent;
import com.yonyou.uap.um.application.ApplicationContext;
import com.yonyou.uap.um.core.UMActivity;

public class ECMobileUpdate
{
	public static void check(UMActivity activity)
	{
		ApplicationContext appctx = ApplicationContext.getCurrent(activity);
		String appkey = appctx.getApplicationID();
		MaUpdateAgent.setAppKey(appkey);
		MaUpdateAgent.setListener(new ECMUpdateListener(activity, appctx.getVersionName()));
		MaUpdateAgent.updateVersion(activity);
	}
}
