package wa.android.common.network;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class WAReqComponentVO {
	private String componentID = null;
	public List<WAReqActionVO> actionList = null; 
	
	public WAReqComponentVO(String componentId){
		this.componentID = componentId;
		actionList = new ArrayList<WAReqActionVO>();
	}
	/**
	 * {"actions":{"action":...},"componentid":"WA00001"}
	 * 或者
	 * {"actions":{"action":[]},"componentid":"WA00001"}
	 * 
	 * @return
	 * @throws JSONException
	 */
	protected JSONObject toJSONData() throws JSONException{
		JSONObject jsonComponent = new JSONObject();
		JSONObject jsonActions = new JSONObject();
		if (actionList.size() == 1) {
			WAReqActionVO action = actionList.get(0);
			jsonActions.put("action", action.toJSONObject());
		} else {
			JSONArray jsonActionList = new JSONArray();
			for(WAReqActionVO action : actionList) {
				jsonActionList.put(action.toJSONObject());
			}
			jsonActions.put("action", jsonActionList);
		}
		jsonComponent.put("actions", jsonActions);
		jsonComponent.put("componentid", componentID);
		return jsonComponent;
	}
	
	
	protected void parseFromJSON(JSONObject actions){
		try {
			JSONArray action = actions.getJSONArray("action");
			for (int i = 0; i < action.length(); i++) {
				JSONObject actionItem = action.getJSONObject(i);
				WAResActionVO resActionVO = new WAResActionVO();
				resActionVO.parseFromJSON(actionItem);
				//!TODO这里假设action是按上行次序返回的
				WAReqActionVO reqActionVO = actionList.get(i);
				reqActionVO.resActionVO = resActionVO;
			}
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * 提供一个方法用于快速添加一个Action
	 * @param actionType
	 * @param serviceCode
	 * @param params
	 */
	protected void addWAActionVO(String actionType, String serviceCode, List<WAParameter> params) {
		WAReqActionVO waactionVO = new WAReqActionVO(actionType);
		waactionVO.setServicecode(serviceCode);
		waactionVO.setParams(params);
		actionList.add(waactionVO);
	}
}
