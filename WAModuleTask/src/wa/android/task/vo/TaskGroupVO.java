package wa.android.task.vo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import nc.vo.oa.component.taskcenter.TaskVO;

public class TaskGroupVO {
	private String groupName;
	private List<Map<String, String>> items = new ArrayList<Map<String, String>>();

	public TaskGroupVO(nc.vo.oa.component.taskcenter.TaskGroupVO groupVO, String servicecode) {
		setGroupName(groupVO.getGroupname());
		List<TaskVO> taskList = groupVO.getTask();
		if (taskList != null) {
			for (TaskVO task : taskList) {
				Map<String, String> item = new HashMap<String, String>();
				item.put("taskId", task.getTaskid());
				item.put("title", task.getTitle());
				item.put("date", task.getDate());
				item.put("servicecode", servicecode);
				items.add(item);
			}
		}
	}

	public List<Map<String, String>> getItems() {
		return items;
	}

	public void setItems(List<Map<String, String>> items) {
		this.items = items;
	}
	public void addItems(List<Map<String, String>> items) {
		List<Map<String, String>> itemstmp = this.items;
		itemstmp.addAll(items);
		this.items = itemstmp;
	}

	public int getItemsSize() {
		return items.size();
	}

	public Map<String, String> getItem(int position) {
		return items.get(position);
	}

	public String getItemValue(int position, String key) {
		return items.get(position).get(key);
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public int size() {
		return items.size();
	}
}
