package wa.android.common.utils;

import wa.android.constants.CommonWAPreferences;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

public class PreferencesUtil {
	/**
	 * SharedPreferences工具方法,用来读取一个值 如果没有读取到，会返回""
	 * 
	 * @param key
	 * @return
	 */
	public static String readPreference(Context context, String key) {
		SharedPreferences sharedPreferences = context.getSharedPreferences(CommonWAPreferences.NAME_COMMON, Context.MODE_PRIVATE);
		String value = sharedPreferences.getString(key, "");
		return value;
	}
	
	
	/**
	 * SharedPreferences工具方法,用来写入一个值
	 * 
	 * @param key
	 * @param value
	 */
	public static void writePreference(Context context, String key, String value) {
		SharedPreferences sharedPreferences = context.getSharedPreferences(CommonWAPreferences.NAME_COMMON, Context.MODE_PRIVATE);
		Editor editor = sharedPreferences.edit();
		editor.putString(key, value);
		editor.commit();
	}
}
