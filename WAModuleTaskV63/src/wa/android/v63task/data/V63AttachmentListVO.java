/**
 * 
 */
package wa.android.v63task.data;

import java.util.List;

/**
 * @author damilong
 * @yonyon NCV63�ƶ�����
 * getMessageAttachmentList----�����б�ṹ
 */
public class V63AttachmentListVO {
	//�����б�
	private List<V63AttachmentVO> attachmentlist;

	private String count;
	public List<V63AttachmentVO> getAttachmentlist() {
		return attachmentlist;
	}

	public void setAttachmentlist(List<V63AttachmentVO> attachmentlist) {
		this.attachmentlist = attachmentlist;
	}

	public String getCount() {
		return count;
	}

	public void setCount(String count) {
		this.count = count;
	}

}
