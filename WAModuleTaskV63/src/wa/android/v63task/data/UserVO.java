/**
 * 
 */
package wa.android.v63task.data;

import java.io.Serializable;

/**
 * @author damilong
 * @yonyon NCV63�ƶ�����
 * getUsersOfActivity----���ѡ�û�
 */
public class UserVO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//�û�ID
	private String id;
	//�û�����
	private String code;
	//�û����
	private String name;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
