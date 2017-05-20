package wa.android.v63task.data;

public class InfoListItemVO {
	//信息ID
	String infoid;
	//时间戳
	String ts;
	//信息标题
	String infotitle;
	//信息概要内容
	String infosummary;
	//发布日期
	String publishdate;
	//信息来源
//	String infosource;
	//新信息标识
	boolean newfoflag;
	//信息详情样式标识
	String infostyletype;
	
	public InfoListItemVO(){
		infoid = "";
		ts = "";
		infotitle = "";
		infosummary = "";
		publishdate = "";
		//infosource = "";
		newfoflag = false;
		infostyletype = "";
	}
	public InfoListItemVO(String infoid,String ts,String infotitle,String infosummary,
			String publishdate,String newfoflag,String infostyletype){
		this.infoid = infoid;
		this.ts = ts;
		this.infotitle = infotitle;
		this.infosummary = infosummary;
		this.publishdate = publishdate;
	//	this.infosource = infosource;
		this.newfoflag = "Y".equals(newfoflag);
		this.infostyletype = infostyletype;
		
	}
	public String getInfoid() {
		return infoid;
	}
	public void setInfoid(String infoid) {
		this.infoid = infoid;
	}
	public String getTs() {
		return ts;
	}
	public void setTs(String ts) {
		this.ts = ts;
	}
	public String getInfotitle() {
		return infotitle;
	}
	public void setInfotitle(String infotitle) {
		this.infotitle = infotitle;
	}
	public String getInfosummary() {
		return infosummary;
	}
	public void setInfosummary(String infosummary) {
		this.infosummary = infosummary;
	}
	public String getPublishdate() {
		return publishdate;
	}
	public void setPublishdate(String publishdate) {
		this.publishdate = publishdate;
	}

	public boolean getNewfoflag() {
		return newfoflag;
	}
	public void setNewfoflag(boolean newfoflag) {
		this.newfoflag = newfoflag;
	}
	public String getInfostyletype() {
		return infostyletype;
	}
	public void setInfostyletype(String infostyletype) {
		this.infostyletype = infostyletype;
	}
}
