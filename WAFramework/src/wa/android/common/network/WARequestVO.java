package wa.android.common.network;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;


import org.apache.http.Header;
import org.json.*;

public class WARequestVO {
	private Map<String, WAReqComponentVO> componentMap = null; 
	
	protected RequestListener listener = null;
	
	protected String url = null;
	
	protected Header[] headerlist = null;

	public Header[] getHeaderlist() {
		return headerlist;
	}

	public void setHeaderlist(Header[] headerlist) {
		this.headerlist = headerlist;
	}

	public WARequestVO(RequestListener listener) {
		componentMap = new HashMap<String, WAReqComponentVO>();
		this.listener = listener;
	}
	
	public WARequestVO(String componentId, String actionType, String serviceCode, List<WAParameter> params) {
		componentMap = new HashMap<String, WAReqComponentVO>();
		WAReqComponentVO wacVO = new WAReqComponentVO(componentId);
		wacVO.addWAActionVO(actionType, serviceCode, params);
		componentMap.put(componentId, wacVO);
	}
	
	public WAReqComponentVO getReqComponentVO(String componentId) {
		return componentMap.get(componentId);
	}
	
	/**
	 * 一个简单方法用于直接获取指定Component的指定序列的Action
	 * 
	 * @param componentId
	 * @param index
	 * @return
	 */
	public WAReqActionVO getReqActionVO(String componentId, int index) {
		WAReqComponentVO compVO = componentMap.get(componentId);
		if (compVO == null) return null;
		else {
			WAReqActionVO actionVO = compVO.actionList.get(index);
			return actionVO;
		}
	}
	
	

//	public List<WAResStructVO> getResStructVOs(String componentId, int actionIndex) {
//		WAReqActionVO actionVO = getReqActionVO(componentId, actionIndex);
//		List<WAResStructVO> ret = actionVO.resActionVO.responseList;
//		return ret;
//	}
//	
//	public WAResStructVO getResStructVO(String componentId, int actionIndex) {
//		List<WAResStructVO> structList = getResStructVOs(componentId, actionIndex);
//		if (structList == null || structList.isEmpty()) {
//			return null;
//		} else {
//			return structList.get(0);
//		}
//	}
	
	public void addWAActionVO(String componentId, WAReqActionVO actionVO) {
		WAReqComponentVO wacompVO = componentMap.get(componentId);
		if (wacompVO == null) {
			wacompVO = new WAReqComponentVO(componentId);
			componentMap.put(componentId, wacompVO);
		}
		wacompVO.actionList.add(actionVO);
	}
	
	public void addWAActionVO(String componentId, String actionType, String serviceCode, List<WAParameter> params) {
		WAReqComponentVO wacompVO = componentMap.get(componentId);
		if (wacompVO == null) {
			wacompVO = new WAReqComponentVO(componentId);
			componentMap.put(componentId, wacompVO);
		}
		wacompVO.addWAActionVO(actionType, serviceCode, params);
	}
	
	public void setRequestListener(RequestListener listener){
		this.listener = listener;
	}
	
	/**
	 * 下面是请求数据的主结构
	 * {"wacomponents":{
	 * "deviceinfo":{...},
	 * "wacomponent":[
	 * 		{"actions":{"action":...,...},"componentid":"WA00001"},
	 * 		{"actions":{"action":...,...},"componentid":"A0A007"}
	 * ],
	 * "session":{"servicelogininfo":[],"enterpriseid":""}}}
	 * 本方法构造的JSON结构中只包含wacomponent
	 * 不包含deviceinfo和session，也没有占位
	 * 
	 * @return
	 * @throws JSONException
	 */
	protected JSONObject toJSONData() throws JSONException{
		//构造根
		JSONObject root = new JSONObject();
		//构造wacomponents节点
		JSONObject wacomponents = new JSONObject();
		//构造wacomponent节点
		JSONArray wacomponentList = new JSONArray();
		//填充wacomponent节点
		Set<String> keySet = componentMap.keySet();
		for(Iterator<String> iterator = keySet.iterator(); iterator.hasNext(); ){
			String compid = iterator.next();
			WAReqComponentVO compVO = componentMap.get(compid);
			//构造wacomponent中元素
			wacomponentList.put(compVO.toJSONData());
		}
		
		wacomponents.put("wacomponent", wacomponentList);
		root.put("wacomponents", wacomponents);
		return root;
	}
	
	protected void parseFromJSON(JSONArray array){
		for (int i = 0; i < array.length(); i++) {
			try {
				JSONObject obj = array.getJSONObject(i);
				String componentId = obj.getString("componentid");
				WAReqComponentVO reqVO = componentMap.get(componentId);
				if (reqVO != null) {
					JSONObject actions = obj.getJSONObject("actions");
					reqVO.parseFromJSON(actions);
				}
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}


