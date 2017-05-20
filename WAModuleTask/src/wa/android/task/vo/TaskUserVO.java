package wa.android.task.vo;

import java.io.Serializable;

public class TaskUserVO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String psnCode;
	private String psnId;
	private String psnName;
	
	public String getPsnCode() {
		return psnCode;
	}
	public void setPsnCode(String psnCode) {
		this.psnCode = psnCode;
	}
	public String getPsnId() {
		return psnId;
	}
	public void setPsnId(String psnId) {
		this.psnId = psnId;
	}
	public String getPsnName() {
		return psnName;
	}
	public void setPsnName(String psnName) {
		this.psnName = psnName;
	}
	
}
