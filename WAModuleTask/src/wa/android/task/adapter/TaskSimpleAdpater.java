package wa.android.task.adapter;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import wa.android.app.task.R;

public class TaskSimpleAdpater extends BaseAdapter {
	private Context context;
	private List<String> data;
	public TaskSimpleAdpater(Context context, List<String> data) {
		this.data = data;
		this.context = context;
	}
	
	@Override
	public int getCount() {
		return data.size();
	}

	@Override
	public Object getItem(int position) {
		return data.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ViewHolder holder = null;
		if(convertView == null) {
			holder = new ViewHolder();
			convertView = LayoutInflater.from(context).inflate(R.layout.tasksimple_item, null);
			holder.strTextView = (TextView) convertView.findViewById(R.id.tasksimple_item_strTextView);
			convertView.setTag(holder);
		} else {
			holder = (ViewHolder) convertView.getTag();
		}
		holder.strTextView.setText(data.get(position));
		holder.strTextView.setTextSize(15);
		/*if(position % 2 == 0) {
			holder.strTextView.setBackgroundColor(Color.rgb(240, 240, 240));
		} else {
			holder.strTextView.setBackgroundColor(Color.rgb(225, 225, 225));
		}*/
		holder.strTextView.setBackgroundResource(R.drawable.list_row_mid1);
		return convertView;
	}

	class ViewHolder {
		TextView strTextView;
	}
}
