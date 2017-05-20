/**
 * 
 */
package wa.android.v63task.data;

import java.util.List;

/**
 * @author damilong
 * @yonyon NCV63�ƶ�����
 * getTaskList----�����б�ṹ
 */
public class V63TaskListVO {
	//�����б�
	private List<V63TaskVO> tasklist;
	private String groupname;
	public List<V63TaskVO> getTasklist() {
		return tasklist;
	}

	public void setTasklist(List<V63TaskVO> tasklist) {
		this.tasklist = tasklist;
	}

	public String getGroupname() {
		return groupname;
	}

	public void setGroupname(String groupname) {
		this.groupname = groupname;
	}


}
