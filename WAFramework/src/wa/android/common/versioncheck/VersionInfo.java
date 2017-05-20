package wa.android.common.versioncheck;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class VersionInfo {

	private ResultVO result;
	private InfoVO info;
	
	public VersionInfo() {
		
	}
	
	public VersionInfo(String json) {
		try {
			JSONObject jsonobject = new JSONObject(json);
			JSONArray resultJ = jsonobject.getJSONArray("result");
			if(null != resultJ) {
				ResultVO resultt = new ResultVO();
				resultt.setFlag(resultJ.getString(0));
				resultt.setDesc(resultJ.getString(1));
				this.setResult(resultt);
			}
			
			JSONArray infoJ = jsonobject.getJSONArray("info");
			if(null != infoJ) {
				InfoVO infot = new InfoVO();
				infot.setVersonCode(infoJ.getString(0));
				infot.setTipInfo(infoJ.getString(1));
				infot.setContent(infoJ.getString(2));
				infot.setUrl(infoJ.getString(3));
				this.setInfo(infot);
			}
		} catch (JSONException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public ResultVO getResult() {
		return result;
	}
	public void setResult(ResultVO result) {
		this.result = result;
	}
	public InfoVO getInfo() {
		return info;
	}
	public void setInfo(InfoVO info) {
		this.info = info;
	}
}
