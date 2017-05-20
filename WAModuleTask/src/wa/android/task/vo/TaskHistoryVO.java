package wa.android.task.vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import nc.vo.oa.component.taskcenter.ApproveHistoryVO;
import nc.vo.oa.component.taskcenter.ApprovedDetailVO;

public class TaskHistoryVO implements Serializable {
	private static final long serialVersionUID = 1L;
	private String psnid;
	private String maker;
	private String makeDate;
	private List<Map<String, String>> items = new ArrayList<Map<String, String>>();

	public TaskHistoryVO(ApprovedDetailVO data) {
		maker = data.getMakername();
		psnid = data.getPsnid();
		makeDate = data.getSubmitdate();
		List<ApproveHistoryVO> rows = data.getList();
		for (ApproveHistoryVO row : rows) {
			Map<String, String> item = new HashMap<String, String>();
			item.put("handername", row.getHandername());
			item.put("handerdate", row.getHanderdate());
			item.put("action", row.getAction());
			item.put("note", row.getNote());
			item.put("psnid", row.getPsnid());
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
