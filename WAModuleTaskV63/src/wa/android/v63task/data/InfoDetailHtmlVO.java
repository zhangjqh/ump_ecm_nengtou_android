package wa.android.v63task.data;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import android.os.Environment;

import wa.android.common.network.WAResActionVO;
import wa.android.common.network.WAResStructVO;
import wa.android.libs.htmltools.data.HtmlDataVO;

public class InfoDetailHtmlVO extends AbsInfoDetailVO {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4585115106010734893L;
	public HtmlDataVO htmlDataVO = null;
	
	public String taskid;

	@SuppressWarnings("rawtypes")
	public void loadVO(Map Object){
			HashMap rootMap = (HashMap)Object.get("htmlcontent");
			htmlDataVO = new HtmlDataVO();
			String sdPath = Environment
					.getExternalStorageDirectory()
					.getPath();
			File dirFile = new File(
					sdPath
							+ File.separator
							+ "com"
							+ File.separator
							+ "yonyou");
			if (!dirFile
					.exists())
				dirFile.mkdirs();
			File rootFile = new File(dirFile, "approvehtml");
			if (!rootFile.exists()) {
				rootFile.mkdir();
			}
			htmlDataVO.loadVO(rootMap, rootFile);
			this.setInfotitle((String) rootMap.get("htmlname"));
	}

	public String getTaskid() {
		return taskid;
	}

	public void setTaskid(String taskid) {
		this.taskid = taskid;
	}
}
