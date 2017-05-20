/**
 * 
 */
package wa.android.v63task.data;

/**
 * @author damilong
 */
public class V63TaskVO {
	private String id;
	private String title;
	private String date;
	private String priority;
	private String isreminder ;
	
	//add by huangyy 增加当前活动
	private String humactname;
	//end by huangyy
	
	public String getHumactname() {
		return humactname;
	}
	public void setHumactname(String humactname) {
		this.humactname = humactname;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public String getIsreminder() {
		return isreminder;
	}
	public void setIsreminder(String isreminder) {
		this.isreminder = isreminder;
	}
	

}
