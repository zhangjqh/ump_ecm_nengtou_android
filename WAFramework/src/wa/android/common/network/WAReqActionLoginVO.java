package wa.android.common.network;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import wa.android.constants.CommonActionTypes;

public class WAReqActionLoginVO extends WAReqActionVO {

	public String[] serviceCode = null;
	
	public WAReqActionLoginVO(String username, String password) {
		setActiontype(CommonActionTypes.LOGIN);
		addPar("password", password);
		addPar("usrcode", username);
		addPar("usrid", "");
		addPar("groupid", "");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		addPar("date", sdf.format(new Date(System.currentTimeMillis())));
	}
	
//	public void setExtData(JSONObject deviceinfo, JSONObject session) {
//		this.deviceinfo = deviceinfo;
//		this.session = session;
//	}
	/**
	 * 
	 * 登录请求时存在一个action多个servicecode的情况
	 * @return 
	 * @throws JSONException
	 */
	public JSONObject toJSONObject() throws JSONException{
		//根
		JSONObject action = new JSONObject();
		//填入action
		action.put("actiontype", this.getActiontype());
		//构造reqparams的值
		JSONObject jsonReqparams = new JSONObject();
		//构造Params的值，数组
		JSONArray jsonParams = new JSONArray();
		//填充Params的值
		for (WAParameter par : this.getParams()) {
			JSONObject jsonPar = par.toJSONObject();
			jsonParams.put(jsonPar);
		}
		jsonReqparams.put("Params", jsonParams);
		action.put("reqparams", jsonReqparams);
		return action;
	}
	
}
