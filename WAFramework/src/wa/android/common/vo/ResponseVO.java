package wa.android.common.vo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 解析后台来的业务VO
 * @author candy
 */
public class ResponseVO {
	
	private boolean isExistAction;
	private int flag;
	private String desc;
	
	private Map<ServiceCodeResVO, Object> VOMap = new HashMap<ServiceCodeResVO, Object>();
	private List<ServiceCodeResVO> serviceCodeList = new ArrayList<ServiceCodeResVO>();
	
	public void setServiceCodeVO(ServiceCodeResVO serviceCodeVO) {
		serviceCodeList.add(serviceCodeVO);
	}
	
	public ServiceCodeResVO getServiceCodeVO(int i) {
		return serviceCodeList.get(i);
	}
	
	public int serviceCodeSize() {
		return serviceCodeList.size();
	}
	
	public Object getVo(ServiceCodeResVO serviceCode) {
		return VOMap.get(serviceCode);
	}
	
	public void setVo(ServiceCodeResVO serviceCodeVO, Object vo) {
		VOMap.put(serviceCodeVO, vo);
	}
	
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
	
	
}
