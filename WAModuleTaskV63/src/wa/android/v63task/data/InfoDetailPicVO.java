package wa.android.v63task.data;

import java.io.Serializable;
import java.util.List;


public class InfoDetailPicVO extends AbsInfoDetailVO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public List<PicInfoVO> picList = null;
	public String title;
	public String taskid;
	public String getTaskid() {
		return taskid;
	}

	public void setTaskid(String taskid) {
		this.taskid = taskid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getFirestpicdesc() {
		return firestpicdesc;
	}

	public void setFirestpicdesc(String firestpicdesc) {
		this.firestpicdesc = firestpicdesc;
	}

	public String getFirstpic() {
		return firstpic;
	}

	public void setFirstpic(String firstpic) {
		this.firstpic = firstpic;
	}

	public String firestpicdesc ;
	public String firstpic;
	public List<PicInfoVO> getPicList() {
		return picList;
	}

	public void setPicList(List<PicInfoVO> picList) {
		this.picList = picList;
	}



}
