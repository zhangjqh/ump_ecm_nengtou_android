package wa.android.uploadattachment.data;

import java.io.Serializable;

public class AttachmentShowVO implements Serializable {
	
	private String attachmentName = "";
	private String attachmentSize = "";
	private String attachmentType = "";
	private String attachmentID = "";
	private String attachmentDownflag = "";
	private String attachmentPath = "";
	public String getAttachmentID() {
		return attachmentID;
	}
	public void setAttachmentID(String attachmentID) {
		this.attachmentID = attachmentID;
	}
	public String getAttachmentdownflag() {
		return attachmentDownflag;
	}
	public void setAttachmentdownflag(String attachmentdownflag) {
		this.attachmentDownflag = attachmentdownflag;
	}
	public String getAttachmentContent() {
		return attachmentContent;
	}
	public void setAttachmentContent(String attachmentContent) {
		this.attachmentContent = attachmentContent;
	}
	private String attachmentContent = "";
	
	public String getAttachmentName() {
		return attachmentName;
	}
	public void setAttachmentName(String attachmentName) {
		this.attachmentName = attachmentName;
	}
	public String getAttachmentSize() {
		return attachmentSize;
	}
	public void setAttachmentSize(String attachmentSize) {
		this.attachmentSize = attachmentSize;
	}
	public String getAttachmentType() {
		return attachmentType;
	}
	public void setAttachmentType(String attachmentType) {
		this.attachmentType = attachmentType;
	}
	public String getAttachmentPath() {
		return attachmentPath;
	}
	public void setAttachmentPath(String attachmentPath) {
		this.attachmentPath = attachmentPath;
	}

}
