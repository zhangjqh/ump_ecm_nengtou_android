/**
 * 
 */
package wa.android.v63task.data;

import java.util.List;

/**
 * @author damilong
 * @yonyon NCV63�ƶ�����
 * uploadFile----�ϴ������б�
 */
public class UpLoadAttachment {
	//����ID
	private String id;
	//��������
	private String actioncode;
	//���������б�
	private List<UpLoadAttachmentContent> attachmentlist;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getActioncode() {
		return actioncode;
	}
	public void setActioncode(String actioncode) {
		this.actioncode = actioncode;
	}
	public List<UpLoadAttachmentContent> getAttachmentlist() {
		return attachmentlist;
	}
	public void setAttachmentlist(List<UpLoadAttachmentContent> attachmentlist) {
		this.attachmentlist = attachmentlist;
	}
	

}
