package wa.android.common.vo;

import java.util.List;

import nc.vo.oa.component.struct.ServiceCodeRes;

/**
 * 解析后台来的业务VO
 * @author candy
 */
public class ResponseActionVO {
	
	private boolean isExistAction;
	private int flag;
	private String desc;
	private List<ServiceCodeRes> serviceCodeList;
	private String componentId;
	private String actiontype;
	
	public int getFlag() {
		return flag;
	}
	public void setFlag(int flag) {
		this.flag = flag;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public boolean isExistAction() {
		return isExistAction;
	}
	public void setExistAction(boolean isExistAction) {
		this.isExistAction = isExistAction;
	}
	public List<ServiceCodeRes> getServiceCodeList() {
		return serviceCodeList;
	}
	public void setServiceCodeList(List<ServiceCodeRes> serviceCodeList) {
		this.serviceCodeList = serviceCodeList;
	}
	public String getComponentId() {
		return componentId;
	}
	public void setComponentId(String componentId) {
		this.componentId = componentId;
	}
	public String getActiontype() {
		return actiontype;
	}
	public void setActiontype(String actiontype) {
		this.actiontype = actiontype;
	}
}
