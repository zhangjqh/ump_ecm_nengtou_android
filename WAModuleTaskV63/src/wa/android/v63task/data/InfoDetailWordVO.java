package wa.android.v63task.data;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;

import android.os.Environment;
import android.util.Base64;

import wa.android.common.network.WAResActionVO;
import wa.android.common.network.WAResStructVO;

public class InfoDetailWordVO extends AbsInfoDetailVO {
	/**信息详情内容*/
	
	public String path = null;
	public String filename = null;
	public String error = null;
	/** 
	  * 解析数据 
	  */
	@SuppressWarnings("unchecked")
	public void loadVO(WAResActionVO resActionVO , boolean isInitCurrentDate) {
		WAResStructVO dataVo = resActionVO.responseList.get(0);
		HashMap<String, HashMap<String, String>> map = 
			(HashMap<String, HashMap<String, String>>)dataVo.returnValue.get(0);
		this.initCommonData(map);
		//!TODO:2003版本不可以用，这段代码先这样，在SD卡的根目录中放一个temp.doc可用
		//!TODO:getDataDirectory得到的文件夹会有问题。
		String basedinfocontent = map.get("infodetail").get("content");
		filename = map.get("infodetail").get("contentname");
		byte[] data = Base64.decode(basedinfocontent, Base64.DEFAULT);
		File d = Environment.getExternalStorageDirectory();
		File f = new File(d, filename);
		if (f.exists()) {
			f.delete();
		}
		try {
			f.createNewFile();
			FileOutputStream fos = new FileOutputStream(f);
			fos.write(data, 0, data.length);
			fos.flush();
			fos.close();
			path = Environment.getExternalStorageDirectory().getPath();
		} catch (IOException e) {
			error = "出错了";//!TODO
		}
	}	
}
