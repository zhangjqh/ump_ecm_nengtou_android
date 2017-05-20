package wa.android.v63task.data;

import java.io.Serializable;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;

public class PicInfoVO implements Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = -1801549801110992284L;
	// 信息图片id
	public String infopicid;
	// 信息图片描述
	public String infopicdesc;
//	public Bitmap infoPic;
	public String base64edPicData;
	public String  title = "";
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBase64edPicData() {
		return base64edPicData;
	}

	public void setBase64edPicData(String base64edPicData) {
		this.base64edPicData = base64edPicData;
	}

	public void setInfoPicData(String base64edPicData) {
		this.base64edPicData = base64edPicData;
		byte b[]=Base64.decode(base64edPicData, Base64.DEFAULT);
//		infoPic = BitmapFactory.decodeByteArray(b, 0, b.length);
	}

	public String getInfopicid() {
		return infopicid;
	}

//	public void setInfopicid(String infopicid) {
//		this.infopicid = infopicid;
//	}

	public String getInfopicdesc() {
		return infopicdesc;
	}

	public void setInfopicdesc(String infopicdesc) {
		this.infopicdesc = infopicdesc;
	}
}