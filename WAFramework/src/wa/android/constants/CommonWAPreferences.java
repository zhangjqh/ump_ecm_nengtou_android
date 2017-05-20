package wa.android.constants;

public class CommonWAPreferences {
	public static final String NAME_COMMON = "COMMON";
	
	//服务器地址
	public static final String SERVER_ADDRESS = "SERVER_ADDRESS";
	//服务器ip
	public static final String SERVER_IP = "SERVER_IP";
	//服务器port
	public static final String SERVER_PORT = "SERVER_PORT";
	public static final String SESSION_ID_HEADER = "SESSION_ID_HEADER";
	public static final String SESSION_ID_SP = "SESSION_ID_SP";
	
	// for request vo
	//登录的时候有几个serviceCodeRes
	public static final String LOGIN_SERVICECODERES_SIZE = "LOGIN_SERVICECODERES_SIZE";
	//用户ID
	public static final String USER_ID = "USER_ID";
	public static final String USER_NAME = "USER_NAME";
	public static final String USER_PASS = "USER_PASS";
	//上次登录版本
	public static final String LAST_VERSION = "LAST_VERSION";
	public static final String DEVICE_INFO = "DEVICE_INFO";
	//集团ID
	public static final String GROUP_ID = "GROUP_ID";
	public static final String GROUP_NAME = "GROUP_NAME";
	public static final String GROUP_CODE = "GROUP_CODE";
	public static final String PRODUCT_ID = "PRODUCT_ID";
	public static final String SERVICE_CODE = "SERVICE_ID";

	//是否自动登陆
	public static final String IS_AUTOLOGIN = "IS_AUTOLOGIN";
	
	//变量命名方式为 +"module name_"+"key description",全大写，公共KEY无需module name
	//变量值同变量名
	
	//待办分页每页条数
	public static final int WA_UNHANDLED_QUERY_COUNT = 100;
}
