package wa.android.task.adapter;

import java.util.List;

import com.example.wamoduletaskv63.R;

import wa.android.libs.btnFieldView.BtnFieldView;
import wa.android.task.adapter.TaskUserListAdapter.ViewHolder;
import wa.android.v63task.data.ActivityVO;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

public class V63TaskSignListAdapter extends  BaseAdapter{
	private List<ActivityVO> activitylist ;
	private Context context;
	private OnClickListener deletelistener , deleteflaglistener, addListener;
	private boolean isdeleteflag = false;
	private ViewHandler viewHandler;
	public V63TaskSignListAdapter(Context context, List<ActivityVO> activitylist ,OnClickListener deletelistener) {
		this.activitylist = activitylist;
		this.context = context;
		this.deletelistener = deletelistener;
	}
	public void refresh(List<ActivityVO> activitylist) {
		this.activitylist = activitylist;
		notifyDataSetChanged();
		}
	@Override
	public int getCount() {
		return activitylist.size();
	}

	@Override
	public Object getItem(int position) {
		return activitylist.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}


	static class ViewHandler{
		TextView textview;
		Button deleteflagbtn;
		Button addbtn;
		BtnFieldView btnFieldView;
		Button deletebtn;
	}


	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
//		 viewHandler = null;
//		if(null ==convertView ){
			viewHandler = new ViewHandler();
			convertView =	  LayoutInflater.from(context).inflate(R.layout.v63_activity_task_signactivityitem, null);
			viewHandler.addbtn = (Button)convertView.findViewById(R.id.addpersonbtn);
			viewHandler.deletebtn = (Button)convertView.findViewById(R.id.deletebtn);
			viewHandler.deleteflagbtn = (Button)convertView.findViewById(R.id.deletebtnflag);
			viewHandler.btnFieldView= (BtnFieldView)convertView.findViewById(R.id.addactivitypanel);
			viewHandler.textview = (TextView)convertView.findViewById(R.id.activitynametext);	
			convertView.setTag(viewHandler);
//		}else{
//			viewHandler = (ViewHandler) convertView.getTag();
//		}
		deleteflaglistener = new OnClickListener() {
			@Override
			public void onClick(View v) {
				if(isdeleteflag){
					isdeleteflag = false;
					v.setBackgroundResource(R.drawable.agreebtn);
					viewHandler.deleteflagbtn.setVisibility(View.GONE);
				}else{
					isdeleteflag = true;
					v.setBackgroundResource(R.drawable.disagreebtn);
					viewHandler.deleteflagbtn.setVisibility(View.VISIBLE);
				}
			}
		};
		viewHandler.deleteflagbtn.setOnClickListener(deleteflaglistener);
		viewHandler.deletebtn.setOnClickListener(deletelistener);
		viewHandler.textview.setText(activitylist.get(position).getName()); 
		viewHandler.addbtn.setOnClickListener(addListener);
		return convertView;
	}
	}


