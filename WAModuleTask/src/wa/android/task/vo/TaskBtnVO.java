package wa.android.task.vo;

import nc.vo.oa.component.taskcenter.TaskButtonVO;

public class TaskBtnVO {
	private String code;
	private String name;

	public TaskBtnVO(TaskButtonVO btnVO) {
		setCode(btnVO.getStatuscode());
		setName(btnVO.getStatusname());
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
