/**
 * 
 */
package wa.android.v63task.data;

import java.io.Serializable;
import java.util.List;

/**
 * @author damilong
 * @yonyon NCV63�ƶ�����
 * getUsersOfActivity----���ѡ�û��б�
 */
public class UsersOfActivityVO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//�û��ṹ�б�
	private List<UserVO> userlist;

	public List<UserVO> getUserlist() {
		return userlist;
	}

	public void setUserlist(List<UserVO> userlist) {
		this.userlist = userlist;
	}

}
