package wa.android.v63task.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class V63TaskGroupVO {
	private String groupName;
	private List<Map<String, String>> items = new ArrayList<Map<String, String>>();

	public V63TaskGroupVO(V63TaskListVO groupVO, String servicecode) {
		setGroupName(groupVO.getGroupname());
		List<V63TaskVO> taskList = groupVO.getTasklist();
		if (taskList != null) {
			for (V63TaskVO task : taskList) {
				Map<String, String> item = new HashMap<String, String>();
				item.put("taskId", task.getId());
				item.put("title", task.getTitle());
				item.put("date", task.getDate());
				item.put("priority", task.getPriority());
				item.put("isreminder", task.getIsreminder());
				item.put("servicecode", servicecode);
								
				//add by huangyy 增加当前环节
				item.put("humactname", task.getHumactname());
				//end by huangyy
				
				
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
