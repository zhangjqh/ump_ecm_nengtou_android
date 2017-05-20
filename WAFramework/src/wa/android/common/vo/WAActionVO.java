package wa.android.common.vo;

import java.util.List;
import java.util.Map;

public class WAActionVO {
	private String actiontype;
	private Map<String, String> params;
	private Map<String, Object> mixparams;
	private String servicecode;
	private boolean ismixparams = false;
	public String getActiontype() {
		return actiontype;
	}
	public void setActiontype(String actiontype) {
		this.actiontype = actiontype;
	}
	public Map<String, String> getParams() {
		return params;
	}
	public void setParams(Map<String, String> params) {
		this.params = params;
	}
	public String getServicecode() {
		return servicecode;
	}
	public void setServicecode(String servicecode) {
		this.servicecode = servicecode;
	}
	public Map<String, Object> getMixparams() {
		return mixparams;
	}
	public void setMixparams(Map<String, Object> mixparams) {
		this.mixparams = mixparams;
	}
	public boolean isIsmixparams() {
		return ismixparams;
	}
	public void setIsmixparams(boolean ismixparams) {
		this.ismixparams = ismixparams;
	}
	
	

	
}
