package wa.android.libs.htmltools.data;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import android.util.Base64;

public class HtmlDataVO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2069260435934286624L;
	private byte[] htmlFileData = null;
	private String htmlFileName = null;
	private String htmlResDir = null;
	private ArrayList<HtmlResVO> htmlResList = null;
	private File rootPath = null;

	private String htmlFilePath = null;

	// {htmlcontent={resoucedir=00013310000000056490/image/, resource=[],
	// htmlname=00013310000000056490,
	// htmlfile=IDxodG1sIHhtbG5zPSdodHRwOi8vd3d3LnczLm9yZy8xOTk5L3hodG1sJz4gPGhlYWQ+PG1ldGEgaHR0cC1lcXVpdj0nQ29udGVudC1UeXBlJyBjb250ZW50PSd0ZXh0L2h0bWw7IGNoYXJzZXQ9VVRGLTgnIC8+PC9oZWFkPjxib2R5PiA8cD48L3A+PC9ib2R5PjwvaHRtbD4=}}
	public void loadVO(HashMap dataMap, File root) {
		if (dataMap == null)
			return;

		rootPath = root;
		String fileData = (String) dataMap.get("htmlfile");
		if (fileData == null) {
			fileData = (String) dataMap.get("infohtmlfile");
			htmlFileData = Base64.decode(fileData, Base64.DEFAULT);
			htmlFileName = (String) dataMap.get("infohtmlname");
		} else {
			htmlFileData = Base64.decode(fileData, Base64.DEFAULT);
			htmlFileName = ((String) dataMap.get("htmlname")).replace(".html",
					"").replace(".htm", "")
					+ ".html";
		}
		if (htmlFileName == null) {
			htmlFileName = "html.html";
		}
		htmlResDir = (String) dataMap.get("resoucedir");
		ArrayList<HashMap<String, String>> resList = (ArrayList<HashMap<String, String>>) dataMap
				.get("resource");
		if (resList != null && !resList.isEmpty()) {
			htmlResList = new ArrayList<HtmlResVO>();
			for (HashMap<String, String> map : resList) {
				String resData = map.get("resourcefile");
				String resFileName = map.get("resourcename");
				if (resData != null) {
					byte[] data = Base64.decode(resData, Base64.DEFAULT);
					HtmlResVO resVO = new HtmlResVO(data, resFileName);
					htmlResList.add(resVO);
				}
			}
		}
		initTempFile();
	}

	private void initTempFile() {

		clearDir(rootPath);

		if (htmlResList != null && htmlResDir != null) {
			// ������Դ�ļ���
			File srcDir = new File(rootPath, htmlResDir);
			srcDir.mkdirs();
			// ������Դ�ļ�
			for (HtmlResVO resVO : htmlResList) {
				File resFile = new File(srcDir, resVO.resFileName);
				try {
					resFile.createNewFile();
					FileOutputStream fos = new FileOutputStream(resFile);
					fos.write(resVO.resFileData);
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		// ����html�ļ�
		File htmlFile = new File(rootPath, this.htmlFileName);
		try {
			htmlFile.createNewFile();
			// д��html�ļ�
			FileOutputStream fos = new FileOutputStream(htmlFile);
			fos.write(this.htmlFileData);
			htmlFilePath = htmlFile.getAbsolutePath();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// ������ʱ�ļ��У����������ɾ��ָ���ļ����µ������ļ������ļ���
	private void clearDir(File root) {
		File[] fs = root.listFiles();
		if (fs != null) {
			for (File f : fs) {
				clearDir0(f);
			}
		}
	}

	private void clearDir0(File filedir) {
		if (filedir.isDirectory()) {
			File[] fs = filedir.listFiles();
			for (File f : fs) {
				clearDir0(f);
			}
			filedir.delete();
		} else {
			filedir.delete();
		}
	}

	// ��ȡ���յ���ʱ�ļ��ľ��·��
	public String getHtmlFilePath() {
		return htmlFilePath;
	}

	class HtmlResVO {

		HtmlResVO(byte[] data, String name) {
			resFileData = data;
			resFileName = name;
		}

		byte[] resFileData = null;
		String resFileName = null;
	}

}
