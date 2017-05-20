package wa.android.common.utils;

import org.json.JSONException;
import org.json.JSONObject;

public class JSONUtil {
	
	/**
	 * 为代码好看，加这么一个工具来处理JSON
	 * 
	 * @param obj
	 * @param name
	 * @return
	 */
	public static JSONObject getJSONObject(JSONObject obj, String name) {
		try {
			JSONObject ret = obj.getJSONObject(name);
			return ret;
		} catch (JSONException e) {
			return null;
		}
	}
	
	public static String getJSONString(JSONObject obj, String name) {
		try {
			String ret = obj.getString(name);
			return ret;
		} catch (JSONException e) {
			return null;
		}
	}
}
