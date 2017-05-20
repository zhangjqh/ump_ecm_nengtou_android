package wa.android.common.network;

import org.json.JSONException;
import org.json.JSONObject;

import android.util.Log;

public class WAParameterExt extends WAParameter{
	
	private Object value = null;
	
	public static WAParameterExt newWAParameterGroup(String key, Object value){
		if (value instanceof String ||
				value instanceof WAParValueList ||
				value instanceof WAParValueVO) {
			WAParameterExt ret = new WAParameterExt();
			ret.key = key;
			ret.value = value;
			return ret;
		} else {
			Log.d("WAParameterExt", "代码错误：不合逻辑的对象类型-" + value.getClass().getName());
			return null;
		}
	}
	
	@Override
	protected JSONObject toJSONObject() {
		try {
			JSONObject jsonPar = new JSONObject();
			jsonPar.put("@id", key);
			if (value instanceof String) {
				jsonPar.put("value", (String)value);
			} else if (value instanceof WAParValueList) {
				jsonPar.put("value", ((WAParValueList) value).toJSONArray());
			} else if (value instanceof WAParValueVO) {
				jsonPar.put("value", ((WAParValueVO) value).toJSONObject());
			}
			return jsonPar;
		} catch (JSONException e) {
			//这里不应该会出现异常
			e.printStackTrace();
			Log.d("WAParameterGroup", "代码错误，JSON拼装时发生异常");
			return null;
		}
	}
}
