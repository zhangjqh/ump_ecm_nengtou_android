package wa.android.common.network;

import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class WAParameterStrList extends WAParameter {
	public WAParameterStrList(String key, List<String> value) {
		this.key = key;
		this.value = value;
	}
	private List<String> value = null;
	@Override
	protected JSONObject toJSONObject() {
		JSONObject jsonPar = new JSONObject();
		try {
			jsonPar.put("@id", key);
			if (value == null) {
				jsonPar.put("value", null);
			} else {
				JSONArray array = new JSONArray();
//				for (String str : value) {
//					array.put(str);
//				}
				for (int i = 0 ; i < value.size() ; i ++) {
					array.put(value.get(i));
				}
				jsonPar.put("value", array);
			}
		} catch (JSONException e) {
			//这里不应该会出现异常
		}
		return jsonPar;
	}
}
