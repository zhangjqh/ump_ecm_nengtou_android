package wa.android.v63task.data;

import java.io.Serializable;
import java.util.ArrayList;

import wa.android.task.vo.TaskUserVO;

public class TaskUserVOList implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2057511210388461407L;
	private ArrayList<TaskUserVO> userlist;

	public ArrayList<TaskUserVO> getUserlist() {
		return userlist;
	}

	public void setUserlist(ArrayList<TaskUserVO> userlist) {
		this.userlist = userlist;
	}

}
