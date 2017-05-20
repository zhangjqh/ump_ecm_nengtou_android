package wa.android.task.adapter;

import java.util.List;

import com.example.wamoduletaskv63.R;

import wa.android.common.utils.DensityUtil;
import wa.android.task.vo.TaskGroupVO;
import wa.android.v63task.data.V63TaskGroupVO;
import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils.TruncateAt;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AbsListView;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * @author guowla
 * 重写适配器
 */
public class V63TaskListAdapter extends BaseExpandableListAdapter {
	private Context context;
	private LayoutInflater layoutInflater;
	private List<V63TaskGroupVO> data;
	private int paddingLeft;
	private int groupNameFontsize;
	public V63TaskListAdapter(Context context, List<V63TaskGroupVO> data) {
		this.context = context;
		this.data = data;
		this.layoutInflater = LayoutInflater.from(context);
		paddingLeft = context.getResources().getDimensionPixelSize(R.dimen.commonGroupPadding);
//		groupNameFontsize = context.getResources().getDimensionPixelSize(R.dimen.commonTitleFontSize);
	}
	@Override
	public Object getChild(int groupPosition, int childPosition) {
		return data.get(groupPosition).getItem(childPosition);
	}

	@Override
	public long getChildId(int groupPosition, int childPosition) {
		return childPosition;
	}

	@Override
	public int getChildrenCount(int groupPosition) {
		return data.get(groupPosition).getItemsSize();
	}

	@Override
	public Object getGroup(int groupPosition) {
		return data.get(groupPosition);
	}

	@Override
	public int getGroupCount() {
		return data.size();
	}

	@Override
	public long getGroupId(int groupPosition) {
		return groupPosition;
	}

	@Override
	public View getGroupView(int groupPosition, boolean isExpanded,
			View convertView, ViewGroup parent) {
		//设置分组标题的样式
		TextView groupNameTextView = new TextView(context);
		groupNameTextView.setGravity(Gravity.CENTER_VERTICAL);
		groupNameTextView.setLayoutParams(new AbsListView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, (int)(context.getResources().getDisplayMetrics().scaledDensity*30)));
		//设置背景颜色
		groupNameTextView.setBackgroundResource(R.drawable.col_bj);
		groupNameTextView.setPadding(paddingLeft, 0, 0, 0);
		//groupNameTextView.setTextSize(TypedValue.COMPLEX_UNIT_PX, groupNameFontsize);
		groupNameTextView.setTextSize(14);
		//填充标题
		groupNameTextView.setText(data.get(groupPosition).getGroupName());
		return groupNameTextView;
	}
	
	@Override
	public View getChildView(int groupPosition, int childPosition,
			boolean isLastChild, View convertView, ViewGroup parent) {
		//填充每个分组下的样式
		ChildViewHolder viewHolder = null;
		if(convertView == null) {
			viewHolder = new ChildViewHolder();
			convertView = layoutInflater.inflate(R.layout.taskmain_list_item, null);
			viewHolder.titleTextView1 = (TextView) convertView.findViewById(R.id.taskmainlistitem_titleTextView_1);
			viewHolder.titleTextView2 = (TextView) convertView.findViewById(R.id.taskmainlistitem_titleTextView_2);
			viewHolder.dateTextView = (TextView) convertView.findViewById(R.id.taskmainlistitem_dateTextView);
			viewHolder.typeImageView = (ImageView)convertView.findViewById(R.id.taskmainlistitem_typeImageView);
			viewHolder.panel = convertView.findViewById(R.id.taskmainlistitem_panel);
			convertView.setTag(viewHolder);
			viewHolder.titleTextView1.setText("");
			viewHolder.titleTextView2.setText("");
		} else {
			viewHolder = (ChildViewHolder) convertView.getTag();
			viewHolder.titleTextView1.setText("");
			viewHolder.titleTextView2.setText("");
		}
		//设置背景
		/*if(childPosition % 2 == 0) 
			viewHolder.panel.setBackgroundColor(Color.rgb(240, 240, 240));
		else 
			viewHolder.panel.setBackgroundColor(Color.rgb(225, 225, 225));*/
		viewHolder.panel.setBackgroundResource(R.drawable.list_row_mid3);
		//获取标题和日期
		String title = data.get(groupPosition).getItemValue(childPosition, "title");
		String date = data.get(groupPosition).getItemValue(childPosition, "date");
		int width = ((WindowManager) context.getSystemService(Context.WINDOW_SERVICE)).getDefaultDisplay().getWidth();
		//计算填充title
		int titleWidth1 = width - context.getResources().getDimensionPixelSize(R.dimen.taskTitleDelPadding);
		float w = 0;
		for(int i=0; i<title.length(); i++) {
			w = viewHolder.titleTextView1.getPaint().measureText(title, 0, i);
			if(w > titleWidth1) {
				String title1 = title.substring(0, i-1);
				String title2 = title.substring(i-1, title.length());
				viewHolder.titleTextView1.setText(title1);
				viewHolder.titleTextView1.setEllipsize(TruncateAt.MARQUEE);
				viewHolder.titleTextView2.setText(title2);
				break;
			}
		}
		if(w <= titleWidth1) {
			viewHolder.titleTextView1.setText(title);
		}
		
		
		//by huangyy
		String humactname = data.get(groupPosition).getItemValue(childPosition, "humactname");
		viewHolder.titleTextView2.setText( humactname);
		viewHolder.titleTextView2.setPadding(paddingLeft, 0, 0, 0);
		//by huangyy 
		
		
		//viewHolder.dateTextView.setTextColor(Color.GRAY);
		viewHolder.dateTextView.setText(date);
		//填充类型图片
		//viewHolder.typeImageView.setBackgroundResource(R.drawable.task_type_unhandle_icon);
		//类型图片不占位隐藏
		viewHolder.typeImageView.setVisibility(View.GONE);
		return convertView;
	}

	@Override
	public boolean hasStableIds() {
		return false;
	}

	@Override
	public boolean isChildSelectable(int groupPosition, int childPosition) {
		return true;
	}
	
	static class ChildViewHolder {
		ImageView typeImageView;
		TextView titleTextView1;
		TextView titleTextView2;
		TextView dateTextView;
		View panel;
	}
}
