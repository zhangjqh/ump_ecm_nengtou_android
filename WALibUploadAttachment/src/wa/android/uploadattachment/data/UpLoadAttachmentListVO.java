package wa.android.uploadattachment.data;

import java.io.Serializable;
import java.util.List;

public class UpLoadAttachmentListVO implements Serializable{
	List<AttachmentShowVO> attachmentlist;

	public List<AttachmentShowVO> getAttachmentlist() {
		return attachmentlist;
	}

	public void setAttachmentlist(List<AttachmentShowVO> attachmentlist) {
		this.attachmentlist = attachmentlist;
	}
}
