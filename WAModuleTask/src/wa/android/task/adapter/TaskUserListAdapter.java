package wa.android.task.adapter;

import java.util.HashMap;
import java.util.List;

import wa.android.app.task.R;
import wa.android.task.vo.TaskUserVO;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.TextView;

public class TaskUserListAdapter extends BaseAdapter {

	private LayoutInflater inflater;
	private List<TaskUserVO> list;
	//选中状态
	public static HashMap<Integer,Boolean> isSelected;
	//上下文
	private Context context;
	private int listSize=0;

	public TaskUserListAdapter(Context context, List<TaskUserVO> data) {
		this.context = context;
		this.list = data;
		isSelected = new HashMap<Integer,Boolean>();
		inflater = LayoutInflater.from(context);
		//initData();
	}
	private void initData(){
		if(listSize==0||listSize<list.size()){
			int tempNum = listSize;
			listSize = list.size();
			for(int i=tempNum; i<listSize;i++) {
			   getIsSelected().put(i,false);
			}
		}
	}
	@Override
	public int getCount() {
		return list.size();
	}

	@Override
	public Object getItem(int position) {
		return list.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		if(list.size()<1)return convertView;
		initData();
		ViewHolder holder = null;
		if (convertView == null) {
			holder = new ViewHolder();
			convertView = inflater.inflate(R.layout.taskuser_item, null);
			holder.personCheckedView = (CheckBox)convertView
					.findViewById(R.id.item_cb);
			holder.nameTextView = (TextView) convertView
					.findViewById(R.id.taskuser_item_nameTextView);
			holder.nameTextView.setVisibility(View.GONE);
			holder.descTextView = (TextView) convertView
					.findViewById(R.id.taskuser_item_descTextView);
			holder.mainPanel = convertView
					.findViewById(R.id.taskuser_mainPanel);
			convertView.setTag(holder);
		} else {
			holder = (ViewHolder) convertView.getTag();
		}
		holder.nameTextView.setText(list.get(position).getPsnCode());
		holder.nameTextView.setTextSize(15);
		holder.descTextView.setText(list.get(position).getPsnName());
		holder.descTextView.setTextSize(15);
		holder.personCheckedView.setChecked(getIsSelected().get(position));
		//holder.personCheckedView.setBackgroundResource(R.drawable.checkbox_noselect);
		/*if (position % 2 == 0) {
			holder.mainPanel.setBackgroundColor(Color.rgb(240, 240, 240));
		} else {
			holder.mainPanel.setBackgroundColor(Color.rgb(225, 225, 225));
		}*/
		holder.mainPanel.setBackgroundResource(R.drawable.list_row_mid1);
		return convertView;
	}

	public class ViewHolder {
		public CheckBox personCheckedView;
		public TextView nameTextView;
		public TextView descTextView;
		public View mainPanel;
	}

	public static HashMap<Integer, Boolean> getIsSelected() {
		return isSelected;
	}
	public static void setIsSelected(HashMap<Integer, Boolean> isSelected) {
		TaskUserListAdapter.isSelected = isSelected;
	}

}
