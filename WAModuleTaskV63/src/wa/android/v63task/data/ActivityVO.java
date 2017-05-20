/**
 * 
 */
package wa.android.v63task.data;

import java.io.Serializable;

/**
 * @author damilong
 * @yonyon NCV63�ƶ�����
 * getActivityList----�
 */
public class ActivityVO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//�ID
	private String id;
	//�����
	private String code;
	//����
	private String name;
	//�Ƿ�ѡ�˱�ʶ
	private String isperson;
	//ѡ���Ƿ�ѡ��ʶ
	private String issingleperson;
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
	public String getIssingleperson() {
		return issingleperson;
	}
	public void setIssingleperson(String issingleperson) {
		this.issingleperson = issingleperson;
	}
	public String getIsperson() {
		return isperson;
	}
	public void setIsperson(String isperson) {
		this.isperson = isperson;
	}

}
