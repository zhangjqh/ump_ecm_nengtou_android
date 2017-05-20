package wa.android.common.network;



public interface RequestListener {
	public void onRequested(WARequestVO vo);

	public void onRequestFailed(int code);
	
	public static final int REQUEST_FAILED = 0;
	public static final int REQUEST_FAILED_WRONGURL = 1;
	public static final int REQUEST_FAILED_TIMEOUT = 2;
	public static final int REQUEST_FAILED_CONNECTION = 3;
	public static final int REQUEST_FAILED_DATA = 4;
	public static final int REQUEST_FAILED_SESSIONTIMEOUT = 5;
	public static final int REQUEST_FAILED_OUT_OF_MEMORY = 6;
}