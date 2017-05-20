package wa.android.common.network;

import java.util.ArrayList;

import org.json.JSONException;
import org.json.JSONObject;


public class WAParValueVO{
	private ArrayList<WAParKV> vofieldList = new ArrayList<WAParKV>();
	
	public void addField(String key, String value) {
		addFiled0(key, value);
	}
	
	public void addField(String key, WAParValueList value) {
		addFiled0(key, value);
	}
	
	public void addField(String key, WAParValueVO value) {
		addFiled0(key, value);
	}
	
	private void addFiled0(String key, Object value) {
		vofieldList.add(new WAParKV(key, value));
	}
	
	protected JSONObject toJSONObject() throws JSONException{
		JSONObject jsonObject = new JSONObject();
		for (WAParKV parkv : vofieldList) {
			Object parv = parkv.value;
			if (parv instanceof String) {
				jsonObject.put(parkv.key, (String)(parv));
			} else if (parv instanceof WAParValueList) {
				jsonObject.put(parkv.key, ((WAParValueList) parv).toJSONArray());
			} else if (parv instanceof WAParValueVO) {
				jsonObject.put(parkv.key, ((WAParValueVO) parv).toJSONObject());
			}
		}
		return jsonObject;		}
}
