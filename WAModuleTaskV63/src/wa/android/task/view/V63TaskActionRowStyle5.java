package wa.android.task.view;

import java.util.ArrayList;
import java.util.List;

import wa.android.libs.btnFieldView.BtnFieldView;
import wa.android.libs.btnFieldView.BtnFieldViewAdapter;
import wa.android.task.activity.V63TaskActionDetail;
import wa.android.task.activity.V63TaskSignPersonListActivity;
import wa.android.task.adapter.V63AddPersonAdapter;
import wa.android.v63task.data.ActivityVO;
import wa.android.v63task.data.UserVO;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.wamoduletaskv63.R;

public class V63TaskActionRowStyle5 extends LinearLayout {
	public static final int RESULT_BACK = 10;
	private TextView textview;
	private Button deleteflagbtn;
	private Button addbtn;
	private BtnFieldView btnFieldView;
	private Button deletebtn;
	private Context context;
	private OnClickListener deletelistener, deleteflaglistener, addListener;
	private int iconresID;
	private ActivityVO activity;
	private BtnFieldViewAdapter<?> addpersonadapter;
	private ArrayList<UserVO> baseuserlist;
	private EditText editText;
	public ActivityVO getActivity() {
		return activity;
	}

	public void setActivity(ActivityVO activity) {
		this.activity = activity;
	}

	private boolean isdeleteflag = false;
	private String actionname, actioncode, taskid, statuscode, statuskey,
			servicecode;

	public V63TaskActionRowStyle5(Context context, ActivityVO activity,
			String actionname, String actioncode, String taskid,
			String statuscode, String statuskey, String servicecode,OnClickListener deletelistener) {
		super(context);
		this.context = context;
		this.activity = activity;
		this. deletelistener = deletelistener;
		this.actioncode =actioncode;
		this.actionname = actionname;
		this.taskid = taskid;
		this.statuskey = statuskey;
		this.servicecode = servicecode;
		this.statuscode = statuscode;
		init();
	}

	private void init() {
		View convertView = LayoutInflater.from(context).inflate(
				R.layout.v63_activity_task_signactivityitem, null);
		
		addbtn = (Button) convertView.findViewById(R.id.addpersonbtn);
		deletebtn = (Button) convertView.findViewById(R.id.deletebtn);
		deleteflagbtn = (Button) convertView.findViewById(R.id.deletebtnflag);
		btnFieldView = (BtnFieldView) convertView
				.findViewById(R.id.addactivitypanel);
		textview = (TextView) convertView.findViewById(R.id.activitynametext);
		editText = (EditText)convertView.findViewById(R.id.addactivityedit);
		editText.setBackgroundResource(0);

		deleteflaglistener = new OnClickListener() {
			@Override
			public void onClick(View v) {
				if (isdeleteflag) {
					isdeleteflag = false;
					deletebtn.setVisibility(View.GONE);
					addbtn.clearAnimation();
					//addbtn.setVisibility(View.VISIBLE);
					addbtn.setBackgroundResource(R.drawable.jumpbtn);
					v.setBackgroundResource(R.drawable.oasche_delete44);
				} else {
					isdeleteflag = true;
					deletebtn.setVisibility(View.VISIBLE);
					addbtn.clearAnimation();
					//addbtn.setVisibility(View.GONE);
					addbtn.setBackgroundColor(Color.TRANSPARENT);
					v.setBackgroundResource(R.drawable.oasche_delete);
				}
			}
		};
		addListener = new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent();
				i.putExtra("activity", activity);
				i.putExtra("actionname", actionname);
				i.putExtra("actioncode", actioncode);
				i.putExtra("taskid", taskid);
				i.putExtra("statuscode", statuscode);
				i.putExtra("statuskey", statuskey);
				i.putExtra("servicecode", servicecode);
				i.setClass(context, V63TaskSignPersonListActivity.class);
				((V63TaskActionDetail) context).startActivityForResult(i,
						RESULT_BACK);

			}
		};
		btnFieldView.getViewTreeObserver().addOnGlobalLayoutListener(
				new OnGlobalLayoutListener() {

					@Override
					public void onGlobalLayout() {
							// TODO Auto-generated method stub
							if (btnFieldView.getChildCount() == 0) {
								addbtn.setVisibility(View.VISIBLE)	;
								btnFieldView.setVisibility(View.GONE);
								editText.setVisibility(View.VISIBLE);
							} else {
								if(activity.getIssingleperson().equals("Y")){
									addbtn.setVisibility(View.INVISIBLE);
								}
								btnFieldView.setVisibility(View.VISIBLE);
								editText.setVisibility(View.GONE);
								
							}
							if(activity.getIsperson().equals("N")){
								addbtn.setVisibility(View.GONE);
								editText.setVisibility(View.GONE);
							}
						}
				});
		deleteflagbtn.setOnClickListener(deleteflaglistener);
		deletebtn.setOnClickListener(deletelistener);
		textview.setText(activity.getName());
		addbtn.setOnClickListener(addListener);
		if(activity.getIsperson().equals("N")){
			addbtn.setVisibility(View.GONE);
			editText.setVisibility(View.GONE);
		}
		addView(convertView);
		

	}
	
	@SuppressWarnings("unused")
	public void setAdapterData(List<UserVO> userlist) {
		this.baseuserlist = (ArrayList<UserVO>) userlist;
		addpersonadapter = new V63AddPersonAdapter(context, baseuserlist);
		btnFieldView.setBtnFieldViewAdapter(addpersonadapter);
		addpersonadapter.notifyDataSetChanged();
	}

	@SuppressWarnings("unused")
	public List<String> getAdapterData() {
		return getpersonids();
	}
	public List<String> getpersonids(){
		StringBuffer psnids = new StringBuffer("");
		List<String> personids = new ArrayList<String>();
//		addPersonAdapter.notifyDataSetChanged();
		List<UserVO> TaskUserVOlist =(List<UserVO>)addpersonadapter.getAllItem();

		if(TaskUserVOlist != null)
		if(TaskUserVOlist !=null && TaskUserVOlist.size()> 0 )
		{
			for (int i = 0 ; i < TaskUserVOlist.size() ; i++)
			{
				psnids.append(TaskUserVOlist.get(i).getId());
				if(!(i == TaskUserVOlist.size()-1)){
				psnids.append(",");}
			}
			personids.add(psnids.toString());
		}
		return personids;
	}
}
