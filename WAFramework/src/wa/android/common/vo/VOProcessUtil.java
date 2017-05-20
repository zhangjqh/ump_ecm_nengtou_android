package wa.android.common.vo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import wa.android.common.utils.PreferencesUtil;
import wa.android.constants.CommonWAPreferences;

import android.content.Context;

import nc.vo.oa.component.struct.Action;
import nc.vo.oa.component.struct.Actions;
import nc.vo.oa.component.struct.ParamTagVO;
import nc.vo.oa.component.struct.ReqParamsVO;
import nc.vo.oa.component.struct.ResResultVO;
import nc.vo.oa.component.struct.ServiceCodeRes;
import nc.vo.oa.component.struct.ServiceCodesRes;
import nc.vo.oa.component.struct.WAComponentInstanceVO;
import nc.vo.oa.component.struct.WAComponentInstancesVO;

/**
 * @author damilong
 *
 */
public class VOProcessUtil {
	/**
	 * 构建单component，单action的请求VO
	 * @param componentId 组件id
	 * @param actionType 请求的actionType
	 * @param paramsMap 请求的参数键值对
	 * For Example:
	 * Map<String, String> paramsMap = new HashMap<String, String>();
	 * paramsMap.put("key1", "value1");
	 * paramsMap.put("key2", "value2");
	 * @return
	 */
	public static WAComponentInstancesVO createRequestVO(String componentId, String actionType, Map<String, String> paramsMap) {
		WAComponentInstancesVO mWAComponentInstancesVO = new WAComponentInstancesVO();
		ArrayList<WAComponentInstanceVO> waComponentInstanceVOList = new ArrayList<WAComponentInstanceVO>();
		WAComponentInstanceVO waComponentInstanceVO = new WAComponentInstanceVO();
		waComponentInstanceVO.setComponentid(componentId);
		Actions actions = new Actions();
		ArrayList<Action> actionList = new ArrayList<Action>();
		Action action = new Action();
		action.setActiontype(actionType);
		ReqParamsVO paramVO = new ReqParamsVO();
		ArrayList<ParamTagVO> params = new ArrayList<ParamTagVO>();
		
		Set<String> keySet = paramsMap.keySet();
		for(Iterator<String> iterator = keySet.iterator(); iterator.hasNext(); ){
			String key = iterator.next();
			ParamTagVO param = new ParamTagVO(key, paramsMap.get(key));
			params.add(param);
		}
		
		paramVO.setParamlist(params);
		action.setParamstags(paramVO);
		actionList.add(action);
		actions.setActions(actionList);
		waComponentInstanceVO.setActions(actions);
		waComponentInstanceVOList.add(waComponentInstanceVO);
		mWAComponentInstancesVO.setWaci(waComponentInstanceVOList);
		return mWAComponentInstancesVO;
	}
	
	/**
	 * 构建单component，单action的请求VO
	 * @param componentId 请求的组件Id
	 * @param actionType 请求的actionType
	 * @param ps 请求参数
	 * For Example:
	 * ParamTagVO[] ps = new ParamTagVO[3];
	 * ps[0] = new ParamTagVO("key1", "value1");
	 * ps[1] = new ParamTagVO("key2", "value2");
	 * ps[2] = new ParamTagVO("key3", "value3");
	 * 
	 * OR
	 * 
	 * List<ParamTagVO> ps = new ArrayList<ParamTagVO>();
	 * ps.add(new ParamTagVO("key1", "value1"));
	 * ps.add(new ParamTagVO("key2", "value2"));
	 * @return
	 */
	public static WAComponentInstancesVO createRequestVO(String componentId, String actionType, ParamTagVO... ps) {
		WAComponentInstancesVO mWAComponentInstancesVO = new WAComponentInstancesVO();
		ArrayList<WAComponentInstanceVO> waComponentInstanceVOList = new ArrayList<WAComponentInstanceVO>();
		WAComponentInstanceVO waComponentInstanceVO = new WAComponentInstanceVO();
		waComponentInstanceVO.setComponentid(componentId);
		Actions actions = new Actions();
		ArrayList<Action> actionList = new ArrayList<Action>();
		Action action = new Action();
		action.setActiontype(actionType);
		ReqParamsVO paramVO = new ReqParamsVO();
		ArrayList<ParamTagVO> params = new ArrayList<ParamTagVO>();
		
		for(ParamTagVO p : ps) {
			params.add(p);
		}
		
		paramVO.setParamlist(params);
		action.setParamstags(paramVO);
		actionList.add(action);
		actions.setActions(actionList);
		waComponentInstanceVO.setActions(actions);
		waComponentInstanceVOList.add(waComponentInstanceVO);
		mWAComponentInstancesVO.setWaci(waComponentInstanceVOList);
		return mWAComponentInstancesVO;
	}
	
	/**
	 * 构建单component，多action的请求VO
	 * @param componentId 请求的组件id
	 * @param actionsMap 请求的多action
	 * For Example:
	 * Map<String, List<ParamTagVO>> actionsMap = new HashMap<String, List<ParamTagVO>>();
		//添加第一个action
		String actionType = "actionType1";
		List<ParamTagVO> params = new ArrayList<ParamTagVO>();
		params.add(new ParamTagVO("key1", "value1"));
		params.add(new ParamTagVO("key2", "value2"));
		actionsMap.put(actionType, params);
		//添加第二个action
		actionType = "actionType2";
		params = new ArrayList<ParamTagVO>();
		params.add(new ParamTagVO("key1", "value1"));
		params.add(new ParamTagVO("key2", "value2"));
		params.add(new ParamTagVO("key3", "value3"));
		actionsMap.put(actionType, params);
	 * @return
	 */
	public static WAComponentInstancesVO createRequestVO(String componentId, Map<String, List<ParamTagVO>> actionsMap) {
		WAComponentInstancesVO mWAComponentInstancesVO = new WAComponentInstancesVO();
		ArrayList<WAComponentInstanceVO> waComponentInstanceVOList = new ArrayList<WAComponentInstanceVO>();
		WAComponentInstanceVO waComponentInstanceVO = new WAComponentInstanceVO();
		waComponentInstanceVO.setComponentid(componentId);
		Actions actions = new Actions();
		ArrayList<Action> actionList = new ArrayList<Action>();
		
		Set<String> keySet = actionsMap.keySet();
		for(Iterator<String> iterator = keySet.iterator(); iterator.hasNext(); ) {
			String actionType = iterator.next();
			Action action = new Action();
			action.setActiontype(actionType);
			
			ReqParamsVO paramVO = new ReqParamsVO();
			List<ParamTagVO> params = actionsMap.get(actionType);
			paramVO.setParamlist(params);
			action.setParamstags(paramVO);
			actionList.add(action);
		}
		
		actions.setActions(actionList);
		waComponentInstanceVO.setActions(actions);
		waComponentInstanceVOList.add(waComponentInstanceVO);
		mWAComponentInstancesVO.setWaci(waComponentInstanceVOList);
		return mWAComponentInstancesVO;
	}
	/**
	 * 对于后台服务器返回的业务VO进行解析，解析后的数据封装在ResponseVO中
	 * @param componentId 组件id
	 * @param actionType 请求的actiontype
	 * @param vo 要处理的VO
	 * @return
	 */
	public static ResponseActionVO parseMessageVO(String componentId, String actionType, WAComponentInstancesVO vo) {
		ResponseActionVO responseVO = new ResponseActionVO();
		responseVO.setComponentId(componentId);
		responseVO.setActiontype(actionType);
		List<WAComponentInstanceVO> waComponentInstanceVOs = vo.getWaci();
		for(WAComponentInstanceVO waComponentInstanceVO : waComponentInstanceVOs) {
			//判断是不是该组件，如果是退出循环
			if(componentId.equals(waComponentInstanceVO.getComponentid())) {
				List<Action> actions = waComponentInstanceVO.getActions().getActions();
				for(Action action : actions) {
					//判断是不是该action，如果是退出循环
					if(actionType.equals(action.getActiontype())) {
						ResResultVO resResultVO = action.getResresulttags();
						if(resResultVO != null) {
							int flag = resResultVO.getFlag();
							String desc = resResultVO.getDesc();
							responseVO.setFlag(flag);
							responseVO.setDesc(desc);
							ServiceCodesRes serviceCodesRes = resResultVO.getServcieCodesRes();
							if(serviceCodesRes != null) {
							List<ServiceCodeRes> serviceCodeResList = serviceCodesRes.getScres();
								responseVO.setServiceCodeList(serviceCodeResList);
							}
							responseVO.setExistAction(true);
						}
						break;
					}
				}
				break;
			}
		}
		return responseVO;
	}
	/**
	 * 构建单component，单action的请求VO
	 * 下为消息看板两个请求构造方法
	 * @author guowla
	 * @return
	 */
	public static WAComponentInstancesVO createMessageRequestVO(Context context, String componentId, Map<String, Map<String, String>> actionsMap) {
		
		WAComponentInstancesVO mWAComponentInstancesVO = new WAComponentInstancesVO();
		ArrayList<WAComponentInstanceVO> waComponentInstanceVOList = new ArrayList<WAComponentInstanceVO>();
		WAComponentInstanceVO waComponentInstanceVO = new WAComponentInstanceVO();
		waComponentInstanceVO.setComponentid(componentId);
		Actions actions = new Actions();
		ArrayList<Action> actionList = new ArrayList<Action>();
		
		Set<String> keySet = actionsMap.keySet();
		
		String groupid = PreferencesUtil.readPreference(context, CommonWAPreferences.GROUP_ID);
		String usrid = PreferencesUtil.readPreference(context, CommonWAPreferences.USER_ID);
		
		for(Iterator<String> iterator = keySet.iterator(); iterator.hasNext(); ) {
			String actionType = iterator.next();
			Action action = new Action();
			action.setActiontype(actionType);
			
			ReqParamsVO reqParamVO = new ReqParamsVO();
			Map<String, String> paramsMap = actionsMap.get(actionType);
			List<ParamTagVO> params = new ArrayList<ParamTagVO>();
			for(String key : paramsMap.keySet()) {
				String value = paramsMap.get(key);
				if(key.equals("groupid")){
					value = groupid;
				}else if (key.equals("usrid")){
					value = usrid;
				}
				ParamTagVO param = new ParamTagVO(key, value);
				params.add(param);
			}
			reqParamVO.setParamlist(params);
			action.setParamstags(reqParamVO);
			actionList.add(action);
		}
		
		actions.setActions(actionList);
		waComponentInstanceVO.setActions(actions);
		waComponentInstanceVOList.add(waComponentInstanceVO);
		mWAComponentInstancesVO.setWaci(waComponentInstanceVOList);
		return mWAComponentInstancesVO;
	}

	public static WAComponentInstancesVO createMessageRequestVO(Context context, String componentId, List<WAActionVO> waactions) {
		
		String groupid = PreferencesUtil.readPreference(context, CommonWAPreferences.GROUP_ID);
		String usrid = PreferencesUtil.readPreference(context, CommonWAPreferences.USER_ID);
		
		WAComponentInstancesVO mWAComponentInstancesVO = new WAComponentInstancesVO();
		ArrayList<WAComponentInstanceVO> waComponentInstanceVOList = new ArrayList<WAComponentInstanceVO>();
		WAComponentInstanceVO waComponentInstanceVO = new WAComponentInstanceVO();
		waComponentInstanceVO.setComponentid(componentId);
		Actions actions = new Actions();
		ArrayList<Action> actionList = new ArrayList<Action>();
		
		for(WAActionVO a : waactions) {
			Action action = new Action();
			action.setActiontype(a.getActiontype());
			
			ReqParamsVO reqParamVO = new ReqParamsVO();
			Map<String, String> paramsMap = a.getParams();
			Map<String, Object> mixParamsMap = a.getMixparams();
			List<ParamTagVO> params = new ArrayList<ParamTagVO>();
			for(String key : paramsMap.keySet()) {
				String value = paramsMap.get(key);
				if(key.equals("groupid")){
					value = groupid;
				}else if (key.equals("usrid")){
					value = usrid;
				}
				ParamTagVO param = new ParamTagVO(key, value);
				params.add(param);
			}
			if(a.isIsmixparams()){
				
				for(String key : mixParamsMap.keySet()){
						ArrayList paramliststr= (ArrayList) mixParamsMap.get(key);
						ParamTagVO param = new ParamTagVO();
						param.setId(key);
						param.setValue(paramliststr);
						params.add(param);
					}
			}
			reqParamVO.setServicecode(a.getServicecode());
			reqParamVO.setParamlist(params);
			action.setParamstags(reqParamVO);
			actionList.add(action);
		}
		
		actions.setActions(actionList);
		waComponentInstanceVO.setActions(actions);
		waComponentInstanceVOList.add(waComponentInstanceVO);
		mWAComponentInstancesVO.setWaci(waComponentInstanceVOList);
		return mWAComponentInstancesVO;
	}
		
	public static WAComponentInstancesVO createMessageRequestVO(Context context, String componentId, WAActionVO waaction) {
		List<WAActionVO> actions = new ArrayList<WAActionVO>();
		actions.add(waaction);
		return createMessageRequestVO(context, componentId, actions);
	}
	/**
	 * 对于后台服务器返回的业务VO进行解析，解析后的数据封装在ResponseVO中
	 * @param componentId 组件id
	 * @param actionType 请求的actiontype
	 * @param vo 要处理的VO
	 * @return
	 */
	public static ResponseVO parseVO(String componentId, String actionType, WAComponentInstancesVO vo) {
		ResponseVO responseVO = new ResponseVO();
		List<WAComponentInstanceVO> waComponentInstanceVOs = vo.getWaci();
		for(WAComponentInstanceVO waComponentInstanceVO : waComponentInstanceVOs) {
			//判断是不是该组件，如果是退出循环
			if(componentId.equals(waComponentInstanceVO.getComponentid())) {
				List<Action> actions = waComponentInstanceVO.getActions().getActions();
				for(Action action : actions) {
					//判断是不是该action，如果是退出循环
					if(actionType.equals(action.getActiontype())) {
						ResResultVO resResultVO = action.getResresulttags();
						if(resResultVO != null) {
							int flag = resResultVO.getFlag();
							if (flag == 0){
							String desc = resResultVO.getDesc();
							responseVO.setFlag(flag);
							responseVO.setDesc(desc);
							List<ServiceCodeRes> serviceCodeResList = resResultVO.getServcieCodesRes().getScres();
							for(ServiceCodeRes serviceCodeRes : serviceCodeResList) {
								//将结果集按照serviceCodeVO为键存到map中
								String serviceCode = serviceCodeRes.getServicecode();
								String productId = serviceCodeRes.getProductid();
								
								ServiceCodeResVO serviceCodeResVO = new ServiceCodeResVO();
								serviceCodeResVO.setProductId(productId);
								serviceCodeResVO.setServiceCode(serviceCode);
								 
								responseVO.setServiceCodeVO(serviceCodeResVO);
								responseVO.setVo(serviceCodeResVO, serviceCodeRes.getResdata());
							}
							responseVO.setExistAction(true);
						}
							else {
								String desc = resResultVO.getDesc();
								responseVO.setFlag(flag);
								responseVO.setDesc(desc);
								responseVO.setExistAction(false);
							}
						}
						break;
					}
				}
				break;
			}
		}
		return responseVO;
	}
	
	/**
	 * 对于后台服务器返回的业务VO进行解析，解析后的数据封装在ResponseVO中
	 * @param componentId 组件id
	 * @param actionType 请求的actiontype
	 * @param vo 要处理的VO
	 * @return
	 */
	public static ResponseActionVO parseTaskVO(String componentId, String actionType, WAComponentInstancesVO vo) {
		ResponseActionVO responseVO = new ResponseActionVO();
		responseVO.setComponentId(componentId);
		responseVO.setActiontype(actionType);
		List<WAComponentInstanceVO> waComponentInstanceVOs = vo.getWaci();
		for(WAComponentInstanceVO waComponentInstanceVO : waComponentInstanceVOs) {
			//判断是不是该组件，如果是退出循环
			if(componentId.equals(waComponentInstanceVO.getComponentid())) {
				List<Action> actions = waComponentInstanceVO.getActions().getActions();
				for(Action action : actions) {
					//判断是不是该action，如果是退出循环
					if(actionType.equals(action.getActiontype())) {
						ResResultVO resResultVO = action.getResresulttags();
						if(resResultVO != null) {
							int flag = resResultVO.getFlag();
							String desc = resResultVO.getDesc();
							responseVO.setFlag(flag);
							responseVO.setDesc(desc);
							ServiceCodesRes serviceCodesRes = resResultVO.getServcieCodesRes();
							if(serviceCodesRes != null) {
							List<ServiceCodeRes> serviceCodeResList = serviceCodesRes.getScres();
								responseVO.setServiceCodeList(serviceCodeResList);
							}
							responseVO.setExistAction(true);
						}
						break;
					}
				}
				break;
			}
		}
		return responseVO;
	}
}
