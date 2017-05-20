/**
 * 
 */
package wa.android.v63task.data;

import java.io.Serializable;
import java.util.List;

/**
 * @author damilong
 * @yonyon NCV63�ƶ�����
 * getActivityList----��б�
 */
public class ActivityListVO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//��б�
	private List<ActivityVO> activitylist;

	public List<ActivityVO> getActivitylist() {
		return activitylist;
	}

	public void setActivitylist(List<ActivityVO> activitylist) {
		this.activitylist = activitylist;
	}

}
