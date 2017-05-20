/**
 * 
 */
package wa.android.v63task.data;

import java.util.List;

/**
 * @author damilong
 * @yonyon NCV63�ƶ�����
 * getApprovedDetail----������ʷ�б�ṹ
 */
public class V63ApproveDetailVO {
	//��ԱID
	private String psnid;
	//�����������
	private String billtypename;
	//�������
	private String billname;
	//�ύ�����
	private String submitperson;
	//�ύ����
	private String submitdate;
	private List<V63ApproveHistoryVO> approvehistorylist;
	public String getPsnid() {
		return psnid;
	}
	public void setPsnid(String psnid) {
		this.psnid = psnid;
	}
	public String getBilltypename() {
		return billtypename;
	}
	public void setBilltypename(String billtypename) {
		this.billtypename = billtypename;
	}
	public String getBillname() {
		return billname;
	}
	public void setBillname(String billname) {
		this.billname = billname;
	}
	public String getSubmitperson() {
		return submitperson;
	}
	public void setSubmitperson(String submitperson) {
		this.submitperson = submitperson;
	}
	public String getSubmitdate() {
		return submitdate;
	}
	public void setSubmitdate(String submitdate) {
		this.submitdate = submitdate;
	}
	public List<V63ApproveHistoryVO> getApprovehistorylist() {
		return approvehistorylist;
	}
	public void setApprovehistorylist(List<V63ApproveHistoryVO> approvehistorylist) {
		this.approvehistorylist = approvehistorylist;
	}
	
	
}
