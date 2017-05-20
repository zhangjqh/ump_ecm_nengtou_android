package wa.android.common.network;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.util.Log;

import wa.android.common.utils.JSONUtil;

public class WAResActionVO {
	public String actiontype = null;
	public int flag = 0;
	public String desc = null;
	public List<WAResStructVO> responseList = null;
	
	public WAResActionVO(){
		responseList = new ArrayList<WAResStructVO>();
	}
	
	

	
	/**
	 * 本方法从JSON中解析一个Action的返回值
	 *	{
	 *		"actiontype":"login",
	 *		"resresult":{
	 *			"flag":0,
	 *			"desc":"请求成功",
	 *			"servicecodesres":{
	 *					"servicecoderes":[
	 *					{WAResponseVO},{WAResponseVO}]
	 *			}
	 *		}
	 *	}
	 * @param obj
	 */
	protected void parseFromJSON(JSONObject obj){
		try {
			//获取action type
			actiontype = obj.getString("actiontype");
			JSONObject resresult = JSONUtil.getJSONObject(obj, "resresult");
			if (resresult == null) {
				Log.d(getClass().getName(), "解析返回数据时发生异常，未找到节点\"resresult\"");
			} else {
				//获取flag和desc
				flag = resresult.getInt("flag");
				desc = resresult.getString("desc");
				JSONObject servicecodesres = resresult.getJSONObject("servicecodesres");
				JSONArray servicecoderes = servicecodesres.getJSONArray("servicecoderes");
				//获取struct数组
				for (int i = 0; i < servicecoderes.length(); i++) {
					JSONObject jsonobj = servicecoderes.getJSONObject(i);
					WAResStructVO resstruct = new WAResStructVO();
					resstruct.parseFromJSON(jsonobj);
					responseList.add(resstruct);
				}
			}
		} catch (JSONException e) {
			//这个异常不应该出现，除非代码错误
			e.printStackTrace();
		}
		
	}
}
