package wa.android.common.network;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import wa.android.common.utils.JSONUtil;

public class WAResStructVO {
	//返回值
	public List<Object> returnValue = null;
	public String serviceCode = null;
	public String productid = null;
	
	/**
	 * {
	 * 		"productid":"39cb03e4-4ebf-46bd-95c3-4b45ecb88234",
	 * 		"resdata":{
	 * 			"struct":[
	 * 			]
	 * 		},
	 * 		"servicecode":"8eb15ce1-9e2e-4b3c-be55-e15dfbc08879",
	 * 		"srcname":"XT"
	 * }
	 * @param obj
	 */
	public void parseFromJSON(JSONObject obj){
		try {
//			serviceCode = obj.getString("servicecode");
//			productid = obj.getString("productid");
			serviceCode = JSONUtil.getJSONString(obj, "servicecode");
			productid = JSONUtil.getJSONString(obj, "productid");
			JSONObject resdata = JSONUtil.getJSONObject(obj, "resdata");
			if (resdata == null) {
				//这个为空的情况一般就是因为多Service时调用异常，但是在多Service的时候未在flag中体现
				returnValue = null;
			} else {
				JSONArray struct = resdata.getJSONArray("struct");
				returnValue = parseFromStruct(struct);
			}
		} catch (JSONException e) {
			e.printStackTrace();
		}
		
	}
	
	//以下三个方法，用来把包含JSONArray，JSONObject的复杂结构，转换为Lis与Map
	private void parseStruct2List(JSONArray struct, List<Object> list){
		try{
			for (int i = 0; i < struct.length(); i++) {
				Object obj = struct.get(i);
				if (obj instanceof String) {
					list.add(obj);
				} else if (obj instanceof JSONArray) {
					List<Object> newList = new ArrayList<Object>();
					list.add(newList);
					parseStruct2List((JSONArray)obj, newList);
				} else if (obj instanceof JSONObject) {
					Map<String, Object> newMap = new HashMap<String, Object>();
					list.add(newMap);
					parseStruct2Map((JSONObject)obj, newMap);
				}
			}
		}catch(Exception e){
		}
	}	
	private void parseStruct2Map(JSONObject struct, Map<String, Object> map){
		try{
			Iterator<String> i = struct.keys();
			while(i.hasNext()) {
				String key = i.next();
				Object obj = struct.get(key);
				if (obj instanceof String) {
					map.put(key, obj);
				} else if (obj instanceof JSONArray) {
					List<Object> newList = new ArrayList<Object>();
					map.put(key, newList);
					parseStruct2List((JSONArray)obj, newList);
				} else if (obj instanceof JSONObject) {
					Map<String, Object> newMap = new HashMap<String, Object>();
					map.put(key, newMap);
					parseStruct2Map((JSONObject)obj, newMap);
				}
			}
		}catch(Exception e){
		}
	}	
	
	
	private List<Object> parseFromStruct(JSONArray struct){
		List<Object> ret = new ArrayList<Object>();
		parseStruct2List(struct, ret);
		return ret;
	}
	
	public boolean  isEmpty(){
		if (returnValue == null) return true;
		if (returnValue.isEmpty()) return true;
		if (returnValue.size() == 1) {
			Object o = returnValue.get(0);
			if (o instanceof Map) {
				if (((Map)o).isEmpty()) {
					return true;
				} else {
					return false;
				}
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
}
