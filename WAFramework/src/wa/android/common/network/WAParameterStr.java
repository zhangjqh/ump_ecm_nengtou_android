package wa.android.common.network;

import org.json.JSONException;
import org.json.JSONObject;

public class WAParameterStr extends WAParameter{
	
	public WAParameterStr(String key, String value) {
		this.key = key;
		this.value = value;
	}
	public String value = null;
	
	@Override
	protected JSONObject toJSONObject() {
		JSONObject jsonPar = new JSONObject();
		try {
			jsonPar.put("@id", key);
			jsonPar.put("value", value);
		} catch (JSONException e) {
			//这里不应该会出现异常
		}
		return jsonPar;
	}
}
