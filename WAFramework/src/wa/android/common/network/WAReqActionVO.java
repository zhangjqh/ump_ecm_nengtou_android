package wa.android.common.network;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class WAReqActionVO {
	//请求值
	private String actiontype;
	private List<WAParameter> params;
	private String servicecode;
	
	public WAResActionVO resActionVO = null;
	
	public WAReqActionVO(){
		params = new ArrayList<WAParameter>();
	}
	
	public WAReqActionVO(String actiontype){
		this();
		this.actiontype = actiontype;
	}
	
	
	public static WAReqActionVO createCommonActionVO(String actiontype) {
		WAReqActionVO actionVO = new WAReqActionVO(actiontype);
		actionVO.addPar("usrid", "");
		actionVO.addPar("groupid", "");
		return actionVO;
	}
	
	public String getActiontype() {
		return actiontype;
	}
	public void setActiontype(String actiontype) {
		this.actiontype = actiontype;
	}
	public List<WAParameter> getParams() {
		return params;
	}
	public void setParams(List<WAParameter> params) {
		this.params = params;
	}
	
	public String getServicecode() {
		return servicecode;
	}
	public void setServicecode(String servicecode) {
		this.servicecode = servicecode;
	}

	public void addPar(String key, String value){
		params.add(new WAParameterStr(key, value));
	}
	
	public void addPar(String key, List<String> value) {
		params.add(new WAParameterStrList(key, value));
	}
	
	public void addPar(WAParameterExt parameter) {
		params.add(parameter);
	}
	

	/**
	 * 
	 * 下面是Action的结构主体
	 * 
	 * 查询请求时不存在一个action多个servicecode的情况
	 * {
	 * 		"actiontype":"getxx",
	 * 		"reqparams":{
	 * 				"servicecode":"123123123123",
	 * 				"Params":[{"@id":"password","value":"f"},...]
	 * 		}
	 * }
	 * 
	 * @return 
	 * @throws JSONException
	 */
	public JSONObject toJSONObject() throws JSONException{
		//根
		JSONObject action = new JSONObject();
		//填入action
		action.put("actiontype", this.actiontype);
		//构造reqparams的值
		JSONObject jsonReqparams = new JSONObject();
		//构造Params的值，数组
		if (servicecode != null) {
			jsonReqparams.put("servicecode", servicecode);
		}
		JSONArray jsonParams = new JSONArray();
		//填充Params的值
		for (WAParameter par : params) {
			JSONObject jsonPar = par.toJSONObject();
			jsonParams.put(jsonPar);
		}
		jsonReqparams.put("Params", jsonParams);
		action.put("reqparams", jsonReqparams);
		return action;
	}
}
