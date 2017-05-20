package wa.android.v63task.data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class V63TaskHistoryVO implements Serializable {
	private static final long serialVersionUID = 1L;
	private String psnid;
	private String maker;
	private String makeDate;
	private List<Map<String, String>> items = new ArrayList<Map<String, String>>();

	public V63TaskHistoryVO(V63ApproveDetailVO data) {
		maker = data.getSubmitperson();
		psnid = data.getPsnid();
		makeDate = data.getSubmitdate();
		List<V63ApproveHistoryVO> rows = data.getApprovehistorylist();
		for (V63ApproveHistoryVO row : rows) {
			Map<String, String> item = new HashMap<String, String>();
			item.put("handername", row.getHandler()==null ?"":row.getHandler());
			item.put("handerdate", row.getHandledate()==null ?"":row.getHandledate());
			item.put("action", row.getAction()==null ?"":row.getAction());
			item.put("note", row.getNote()==null ?"":row.getNote());
			item.put("psnid", row.getPsnid()==null ?"":row.getPsnid());
			item.put("mark", row.getMark()==null ?"":row.getMark());
			items.add(item);
		}
	}

	public String getPsnid() {
		return psnid;
	}

	public void setPsnid(String psnid) {
		this.psnid = psnid;
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public String getMakeDate() {
		return makeDate;
	}

	public void setMakeDate(String makeDate) {
		this.makeDate = makeDate;
	}

	public List<Map<String, String>> getItems() {
		return items;
	}

	public void setItems(List<Map<String, String>> items) {
		this.items = items;
	}
}
