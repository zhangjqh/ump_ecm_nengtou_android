/**
 * 
 */
package wa.android.v63task.data;

import java.util.List;

/**
 * @author damilong
 * @yonyon NCV63�ƶ�����
 * doAction----�����ύ����
 */
public class DoActionVO {
	//����ID
	private String taskid;
	//״̬key
	private String statuskey;
	//״̬code
	private String statuscode;
	//��������(��ѯ����)
	private String actioncode;
	//�������(���ö�������)
	private String note;
	//��ͨ��ǩ��Ա�б�/ָ����Ա�б�/(����)ת����Ա�б�
	private List<String> userids;
	//ǰ��ǩ����(�޴�������1.����2.����)
	private String beforesigntype;
	//ǰ��ǩ��Ա�б�(��NC��̨��Ҫ��ǰ��ǩ��id����)
	private List<String> beforesignlist;
	//���ǩ����(�޴�������1.����2.����)
	private String aftersigntype;
	//���ǩ��Ա�б�(��OA��̨��Ҫ�ĺ��ǩ��id����)
	private List<String> aftersignlist;
	//������Ա�б�
	private List<String> copyusers;
	//���ػ��ʶ����(���ػID���ϣ����ض������õ�)
	private List<String> rejectmarks;
	//ָ�ɻ��ʶ����(ָ�ɻID���ϣ�ָ�ɶ������õ�)
	private List<SignActivity> signactivitylist;
	//��ע
	private String postil;
	public String getTaskid() {
		return taskid;
	}
	public void setTaskid(String taskid) {
		this.taskid = taskid;
	}
	public String getStatuskey() {
		return statuskey;
	}
	public void setStatuskey(String statuskey) {
		this.statuskey = statuskey;
	}
	public String getStatuscode() {
		return statuscode;
	}
	public void setStatuscode(String statuscode) {
		this.statuscode = statuscode;
	}
	public String getActioncode() {
		return actioncode;
	}
	public void setActioncode(String actioncode) {
		this.actioncode = actioncode;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public List<String> getUserids() {
		return userids;
	}
	public void setUserids(List<String> userids) {
		this.userids = userids;
	}
	public String getBeforesigntype() {
		return beforesigntype;
	}
	public void setBeforesigntype(String beforesigntype) {
		this.beforesigntype = beforesigntype;
	}
	public List<String> getBeforesignlist() {
		return beforesignlist;
	}
	public void setBeforesignlist(List<String> beforesignlist) {
		this.beforesignlist = beforesignlist;
	}
	public String getAftersigntype() {
		return aftersigntype;
	}
	public void setAftersigntype(String aftersigntype) {
		this.aftersigntype = aftersigntype;
	}
	public List<String> getAftersignlist() {
		return aftersignlist;
	}
	public void setAftersignlist(List<String> aftersignlist) {
		this.aftersignlist = aftersignlist;
	}
	public List<String> getCopyusers() {
		return copyusers;
	}
	public void setCopyusers(List<String> copyusers) {
		this.copyusers = copyusers;
	}
	public List<String> getRejectmarks() {
		return rejectmarks;
	}
	public void setRejectmarks(List<String> rejectmarks) {
		this.rejectmarks = rejectmarks;
	}
	public List<SignActivity> getSignactivitylist() {
		return signactivitylist;
	}
	public void setSignactivitylist(List<SignActivity> signactivitylist) {
		this.signactivitylist = signactivitylist;
	}
	public String getPostil() {
		return postil;
	}
	public void setPostil(String postil) {
		this.postil = postil;
	}
	

}