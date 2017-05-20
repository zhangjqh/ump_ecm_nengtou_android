/**
 * 
 */
package wa.android.v63task.data;

import java.util.List;

/**
 * @author damilong
 * @yonyon NCV63�ƶ�����
 * getPicContent----��ͼƬ��������
 */
public class PicContentVO {

	//����
	private String title;
	//��ͼƬ���� byte[]
	private String firstpic;
	//��ͼƬ����
	private String firstpicdec;
	//����ͼƬ����
	private List<RestPic> restpiclist;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getFirstpic() {
		return firstpic;
	}
	public void setFirstpic(String firstpic) {
		this.firstpic = firstpic;
	}
	public String getFirstpicdec() {
		return firstpicdec;
	}
	public void setFirstpicdec(String firstpicdec) {
		this.firstpicdec = firstpicdec;
	}
	public List<RestPic> getRestpiclist() {
		return restpiclist;
	}
	public void setRestpiclist(List<RestPic> restpiclist) {
		this.restpiclist = restpiclist;
	}
}
