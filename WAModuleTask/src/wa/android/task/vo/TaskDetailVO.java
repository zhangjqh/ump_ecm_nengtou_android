package wa.android.task.vo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import nc.vo.oa.component.common.AttachmentListVO;
import nc.vo.oa.component.common.AttachmentVO;
import nc.vo.oa.component.struct.ChildRowVO;
import nc.vo.oa.component.struct.DataVO;
import nc.vo.oa.component.struct.RowVO;
import nc.vo.oa.component.taskcenter.TaskActionListVO;
import nc.vo.oa.component.taskcenter.TaskActionVO;
import nc.vo.oa.component.taskcenter.TaskBillVO;

public class TaskDetailVO {
	private String title;
	private String rowCount;// 行的数量
	private int style;

	private List<String[]> detailItems = new ArrayList<String[]>();
	// 审批详情中的行信息
	private List<String[]> bodyHeaderList = new ArrayList<String[]>();
	private List<List<String[]>> bodyList = new ArrayList<List<String[]>>();
	private List<Map<String, String>> attachmentItems = new ArrayList<Map<String, String>>();
	private List<TaskActionVO> actionList;

	public TaskDetailVO(TaskBillVO bill, AttachmentListVO attachmentListVO,
			TaskActionListVO actionListVO) {
		if (bill != null) {
			title = bill.getTitle();
			rowCount = bill.getRowcnt();
			style = Integer.parseInt(bill.getStyle());

			List<RowVO> rows = bill.getListrow();
			for (RowVO row : rows) {
				String[] item = new String[2];
				item[0] = row.getItem().get(0).getValue().get(0);
				item[1] = row.getItem().get(1).getValue().get(0);
				addDetailItem(item);
			}

			switch (style) {
			case 0:
				break;
			case 2:
				DataVO dataVO = bill.getData();
				rows = dataVO.getRow();
				for (RowVO row : rows) {
					String[] item = new String[4];
					if(null!= row.getItem()){
						
					
					switch (row.getItem().size()) {
					case 0:
						item[0] = "";
						item[1] = "";	
						item[2] = "";
						item[3] = "";	
						break;
					case 1:
						item[0] = row.getItem().get(0).getValue().get(0) == null ? ""
								: row.getItem().get(0).getValue().get(0);
						item[1] = "";	
						item[2] = "";
						item[3] = "";	
						break;
					case 2:
						item[0] = row.getItem().get(0).getValue().get(0) == null ? ""
								: row.getItem().get(0).getValue().get(0);
						item[1] = row.getItem().get(1).getValue().get(0) == null ? ""
								: row.getItem().get(1).getValue().get(0);
						item[2] = "";		
						item[3] = "";	
						break;
					case 3:
						item[0] = row.getItem().get(0).getValue().get(0) == null ? ""
								: row.getItem().get(0).getValue().get(0);
						item[1] = row.getItem().get(1).getValue().get(0) == null ? ""
								: row.getItem().get(1).getValue().get(0);
						item[2] = row.getItem().get(2).getValue().get(0) == null ? ""
								: row.getItem().get(2).getValue().get(0);
						item[3] = "";		
						break;
					case 4:
						item[0] = row.getItem().get(0).getValue().get(0) == null ? ""
								: row.getItem().get(0).getValue().get(0);
						item[1] = row.getItem().get(1).getValue().get(0) == null ? ""
								: row.getItem().get(1).getValue().get(0);
						item[2] = row.getItem().get(2).getValue().get(0) == null ? ""
								: row.getItem().get(2).getValue().get(0);	
						item[3] = row.getItem().get(3).getValue().get(0) == null ? ""
								: row.getItem().get(3).getValue().get(0);		
						break;
					default:
						item[0] = row.getItem().get(0).getValue().get(0) == null ? ""
								: row.getItem().get(0).getValue().get(0);
						item[1] = row.getItem().get(1).getValue().get(0) == null ? ""
								: row.getItem().get(1).getValue().get(0);
						item[2] = row.getItem().get(2).getValue().get(0) == null ? ""
								: row.getItem().get(2).getValue().get(0);	
						item[3] = row.getItem().get(3).getValue().get(0) == null ? ""
								: row.getItem().get(3).getValue().get(0);	
						break;
					}
					}else{
						item[0] = "";
						item[1] = "";	
						item[2] = "";
						item[3] = "";	
					}
					bodyHeaderList.add(item);
					List<String[]> strList = new ArrayList<String[]>();
					List<ChildRowVO> childRows = row.getChild();
					for (ChildRowVO childRow : childRows) {
						String[] strs = new String[2];
						strs[0] = childRow.getItem().get(0).getValue().get(0);
						strs[1] = childRow.getItem().get(1).getValue().get(0);
						strList.add(strs);
					}
					bodyList.add(strList);
				}
				break;
			default:
				break;
			}
		}

		if (attachmentListVO != null
				&& attachmentListVO.getAttachmentlist() != null)
			for (AttachmentVO a : attachmentListVO.getAttachmentlist()) {
				if ((a.getFileid() != null && !a.getFileid().equals(""))
						&& (a.getFilename() != null && !a.getFilename().equals(
								""))
						&& (a.getFilesize() != null && !a.getFilesize().equals(
								""))
//						&& (a.getFiletype() != null && !a.getFiletype().equals(
//								""))
								) {
					Map<String, String> map = new HashMap<String, String>();
					map.put("filename", a.getFilename());
					map.put("filesize", a.getFilesize());
					map.put("filetype", a.getFiletype()==null?"":a.getFiletype());
					map.put("fileid", a.getFileid());
					map.put("downflag", a.getDownflag());
					attachmentItems.add(map);
				}
			}

		if (actionListVO != null && actionListVO.getAction() != null)
			setActionList(actionListVO.getAction());
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<String[]> getDetailItems() {
		return detailItems;
	}

	public void addDetailItem(String[] item) {
		detailItems.add(item);
	}

	public List<Map<String, String>> getAttachmentItems() {
		return attachmentItems;
	}

	public void setAttachmentItems(List<Map<String, String>> attachmentItems) {
		this.attachmentItems = attachmentItems;
	}

	public List<TaskActionVO> getActionList() {
		return actionList;
	}

	public void setActionList(List<TaskActionVO> actionList) {
		this.actionList = actionList;
	}

	public String getRowCount() {
		return rowCount;
	}

	public void setRowCount(String rowCount) {
		this.rowCount = rowCount;
	}

	public List<List<String[]>> getBodyList() {
		return bodyList;
	}

	public void setBodyList(List<List<String[]>> bodyList) {
		this.bodyList = bodyList;
	}

	public void setDetailItems(List<String[]> detailItems) {
		this.detailItems = detailItems;
	}

	public int getStyle() {
		return style;
	}

	public List<String[]> getBodyHeaderList() {
		return bodyHeaderList;
	}
}
