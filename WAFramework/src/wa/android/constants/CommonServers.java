package wa.android.constants;

import android.content.Context;
import wa.android.common.App;
import wa.android.common.utils.PreferencesUtil;

public class CommonServers {

	public static String getServerAddress(Context context){
		String serverAddr = (String) ((App)context.getApplicationContext()).getGlobalVariables(CommonGlobalVariables.SERVER_ADDRESS);
		if(serverAddr == null || "".equals(serverAddr)) {
			serverAddr = PreferencesUtil.readPreference(context, CommonWAPreferences.SERVER_ADDRESS);
			((App)context.getApplicationContext()).addGlobalVariable(CommonGlobalVariables.SERVER_ADDRESS, serverAddr);
		}
		return serverAddr;
	}
	
	public static void setServerAddress(Context context, String adr){
		((App)context.getApplicationContext()).addGlobalVariable(CommonGlobalVariables.SERVER_ADDRESS, adr);
	}
	
	public static String SERVER_SERVLET_GETACCOUNTSET = "/servlet/waunneededloginservlet";
	public static String SERVER_SERVLET_LOGIN = "/servlet/oaloginservlet";
	public static String SERVER_SERVLET_PRELOGIN = "/servlet/wapreloginservlet";
	public static String SERVER_SERVLET_LOGOUT = "/servlet/walogoutservlet";
	public static String SERVER_SERVLET_DOWNLOAD = "/servlet/wadownloadservlet";
	public static String SERVER_SERVLET_WA = "/servlet/oaservlet";
	public static String SERVER_SERVLET_LOOP = "/servlet/waloop";
}
