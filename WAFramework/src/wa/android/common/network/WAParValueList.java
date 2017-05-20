package wa.android.common.network;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONException;


public class WAParValueList{
	private ArrayList valueList = new ArrayList();
	public void addString(String value) {
		addItem0(value);
	}
	
	public void addItem(WAParValueList value) {
		addItem0(value);
	}
	
	public void addItem(WAParValueVO value) {
		addItem0(value);
	}
	
	private void addItem0(Object value) {
		valueList.add(value);
	}
	
	protected JSONArray toJSONArray() throws JSONException{
		JSONArray jsonArray = new JSONArray();
		for (int i = 0; i < valueList.size(); i++) {
			Object parv = valueList.get(i);
			if (parv instanceof String) {
				jsonArray.put((String)parv);
			} else if (parv instanceof WAParValueList) {
				jsonArray.put(((WAParValueList) parv).toJSONArray());
			} else if (parv instanceof WAParValueVO) {
				jsonArray.put(((WAParValueVO) parv).toJSONObject());
			}
		}
		return jsonArray;
	}
	
}