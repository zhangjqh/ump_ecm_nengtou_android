/**
 * 
 */
package wa.android.v63task.data;

import java.util.List;

/**
 * @author damilong
 * @yonyon NCV63�ƶ�����
 * getHTMLContent----Html��������
 */
public class HtmlContentVO {
	//html�ļ���(���ļ����׺)
	private String name;
	//Html�ļ�����Base64ת��
	private String file;
	//Html��Դ�ļ������·��
	private String resourcedir;
	//Html��Դ����
	private List<ResourceVO> resourcelist;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFile() {
		return file;
	}
	public void setFile(String file) {
		this.file = file;
	}
	public String getResourcedir() {
		return resourcedir;
	}
	public void setResourcedir(String resourcedir) {
		this.resourcedir = resourcedir;
	}
	public List<ResourceVO> getResourcelist() {
		return resourcelist;
	}
	public void setResourcelist(List<ResourceVO> resourcelist) {
		this.resourcelist = resourcelist;
	}

}
