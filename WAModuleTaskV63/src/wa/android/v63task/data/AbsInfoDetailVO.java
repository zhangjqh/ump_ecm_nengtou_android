package wa.android.v63task.data;

import java.io.Serializable;
import java.util.Map;

public class AbsInfoDetailVO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String getInfoid() {
		return infoid;
	}

	public void setInfoid(String infoid) {
		this.infoid = infoid;
	}

	public boolean isCommentflag() {
		return commentflag;
	}

	public void setCommentflag(boolean commentflag) {
		this.commentflag = commentflag;
	}

	public String getInfotitle() {
		return infotitle;
	}

	public void setInfotitle(String infotitle) {
		this.infotitle = infotitle;
	}

	public String getPublishdate() {
		return publishdate;
	}

	public void setPublishdate(String publishdate) {
		this.publishdate = publishdate;
	}

	public boolean isHasAttachment() {
		return hasAttachment;
	}

	public void setHasAttachment(boolean hasAttachment) {
		this.hasAttachment = hasAttachment;
	}

	public String getTs() {
		return ts;
	}

	public void setTs(String ts) {
		this.ts = ts;
	}

	///**信息id*/
	public String infoid;
	///**支持评论标识*/
	public boolean commentflag;
	///**信息标题*/
	public String infotitle;
	///**发布日期*/
	public String publishdate;
	//是否有附件标识
	public boolean hasAttachment;
	//时间戳
	public String ts;
	
	public void initCommonData(Map struct){
		infoid = (String)struct.get("infoid");
		infotitle = (String)struct.get("infotitle");
		ts = (String)struct.get("ts");
		publishdate = (String)struct.get("publishdate");
		commentflag = "Y".equals(struct.get("commentflag"));
		hasAttachment = "Y".equals(struct.get("attachflag"));
	}
}
