/**
 * 
 */
package wa.android.v63task.data;

/**
 * @author damilong
 * @yonyon NCV63�ƶ�����
 * getApprovedDetail----������ʷ�ṹ
 */
public class V63ApproveHistoryVO {

	//������ʷID
	private String id;
	//��Ա��ʶ
	private String psnid;
	//���������
	private String handler;
	//�������
	private String action;
	//�������
	private String note;
	//��������
	private String handledate;
	//����ͼ��byte[]
	private String mark;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPsnid() {
		return psnid;
	}
	public void setPsnid(String psnid) {
		this.psnid = psnid;
	}
	public String getHandler() {
		return handler;
	}
	public void setHandler(String handler) {
		this.handler = handler;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public String getHandledate() {
		return handledate;
	}
	public void setHandledate(String handledate) {
		this.handledate = handledate;
	}
	public String getMark() {
		return mark;
	}
	public void setMark(String mark) {
		this.mark = mark;
	}
}
