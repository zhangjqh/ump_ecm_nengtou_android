package wa.android.task.adapter;

import java.util.ArrayList;
import java.util.List;

import com.example.wamoduletaskv63.R;
import com.example.wamoduletaskv63.R.color;

import wa.android.task.view.BottomGridView;
import wa.android.v63task.data.TaskStatusListVO;
import wa.android.v63task.data.TaskStatusVO;
import android.R.raw;
import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class BottomGridViewAdapter extends BaseAdapter {
	private Context context;
	private List<BottomGridView> viewList;
	private TaskStatusListVO statuslist;
	public BottomGridViewAdapter(Context c, TaskStatusListVO statuslist) {
		// TODO Auto-generated constructor stub

		this.context=c;
		this.statuslist = statuslist;
		viewList=new ArrayList<BottomGridView>();
		BottomGridView view=new BottomGridView(c,statuslist.getTaskstatuslist().size());
		if(statuslist.getTaskstatuslist().size()>0)
		for (TaskStatusVO status :statuslist.getTaskstatuslist()){

		if(status.getId().equals("ishandled")){
			view = new BottomGridView(c,statuslist.getTaskstatuslist().size());
		view.setFocused();
			view.setImage(R.drawable.taskbtn);//任务	
			view.setText("我的任务");
			view.setCode(status.getId());
			viewList.add(view);
		}
	
		}
		for (TaskStatusVO status :statuslist.getTaskstatuslist()){		
		if(status.getId().equals("mypieces")){
			view = new BottomGridView(c,statuslist.getTaskstatuslist().size());
			view.setFocused();
			view.setImage(R.drawable.readerbtn);//阅件
			view.setText("我的阅件");
			view.setCode(status.getId());
			viewList.add(view);
		}
		}
		for (TaskStatusVO status :statuslist.getTaskstatuslist()){		
			if(status.getId().equals("submit")){
			view = new BottomGridView(c,statuslist.getTaskstatuslist().size());
			view.setFocused();
			view.setImage(R.drawable.launchbtn);	//发起
			view.setText("我的发起");
			view.setCode(status.getId());
			viewList.add(view);
			}
		}
		/*view = new BottomGridView(c,statuslist.getTaskstatuslist().size());
		view.setFocused();
		view.setImage(R.drawable.button_bottom_set);//设置
		view.setCode("");
		viewList.add(view);*/

	}



	private void clearbtnimg(){
		for (BottomGridView view:viewList){
			String code = view.getCode();
			view.setColor(Color.BLACK);
			if(code.equals("submit")){
				view.setImage(R.drawable.launchbtn);	//发起	
			}
			if(code.equals("ishandled")){
				view.setImage(R.drawable.taskbtn);//任务	
			}
			if(code.equals("mypieces")){
				view.setImage(R.drawable.readerbtn);//阅件
			}else if(code.equals("")){
				view.setImage(R.drawable.button_bottom_set);//设置
			}
		}
	}
	@Override
	public int getCount()
	{
		// TODO Auto-generated method stub
		return viewList.size();
	}

	@Override
	public Object getItem(int arg0)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int arg0)
	{
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int arg0, View arg1, ViewGroup arg2)
	{
		// TODO Auto-generated method stub
		return viewList.get(arg0);
	}
	
	public String setFocusAt(int location)
	{
		String code = "";
		if(location<5&&location>-1&&(!viewList.get(location).getCode().equals("")))
		{
//			for(int i=0;i<viewList.size()-1;i++)
//			{
//				if(location!=i)
//				{
//					viewList.get(i).clearFocus();
//				}
//				else {
					viewList.get(location).setFocused();
					code= viewList.get(location).getCode();
					 clearbtnimg();
					viewList.get(location).setColor(Color.rgb(229, 0, 17));
					if(code.equals("submit")){
						viewList.get(location).setImage(R.drawable.launchbtn_touch);
					}
					else if(code.equals("ishandled")){
						viewList.get(location).setImage(R.drawable.taskbtn_touch);
					}
					else if(code.equals("mypieces")){
						viewList.get(location).setImage(R.drawable.readerbtn_touch);
					}
//				}
			}
//		}
		return code ;
	}
	
	



}
