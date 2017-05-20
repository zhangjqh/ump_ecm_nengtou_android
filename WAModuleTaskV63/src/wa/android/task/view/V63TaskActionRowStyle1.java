package wa.android.task.view;

import com.example.wamoduletaskv63.R;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils.TruncateAt;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import wa.android.common.utils.DensityUtil;
import wa.android.task.activity.V63TaskActionDetail;
import wa.android.task.activity.V63TaskHandWriteActivity;

public class V63TaskActionRowStyle1 extends LinearLayout {
	
	private Context context;
	private TextView nameTextView;
	private Button addBtn;
	private ImageView rowItemIcon;
	private boolean ishasIcon;
	private int iconresID;
	private WA4ItemRowStyle rowStyle;
	private String taskid;
	public static final int RESULT_BACK = 10;
	private OnClickListener OnClickListener ;
	public V63TaskActionRowStyle1(Context context,boolean ishasIcon,String taskid) {
		super(context);
		this.context = context;
		this.ishasIcon = ishasIcon;
		this.taskid = taskid;
		init();
	}
	
	private void init() {
		View convertView = LayoutInflater.from(context).inflate(
				R.layout.v63_activity_task_actionrow_style1, null);
		convertView.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT,DensityUtil.dip2px(context, 44)));
		nameTextView = (TextView)convertView.findViewById(R.id.actionrow_style1_nametext);
		addBtn = (Button) convertView.findViewById(R.id.actionrow_style1_addbtn);
		rowItemIcon = (ImageView) convertView.findViewById(R.id.actionrow_style1_rowitemIcon);
		nameTextView.setSingleLine();
		nameTextView.setEllipsize(TruncateAt.END);		

		
		if(!ishasIcon){
			rowItemIcon.setVisibility(View.INVISIBLE);
		}
		rowItemIcon.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent();
				i.putExtra("taskid", taskid);
				i.setClass(context, V63TaskHandWriteActivity.class);
				((V63TaskActionDetail) context).startActivityForResult(i,
						RESULT_BACK);
			}
		});

		addBtn.getViewTreeObserver().addOnGlobalLayoutListener(new OnGlobalLayoutListener() {
			
			@Override
			public void onGlobalLayout() {
				// TODO Auto-generated method stub
				if(((V63TaskActionDetail)context).getSignactivitylist().size() ==0&&OnClickListener!=null){
					addBtn.setVisibility(View.VISIBLE);
				}
				
			}
		});

	
		addView(convertView);
	}
	
	public Button getAddBtn() {
		return addBtn;
	}

	public void setAddBtn(Button addBtn) {
		this.addBtn = addBtn;
	}

	public void setValue(String name, OnClickListener clicklistner,int flag) {
		this.OnClickListener =clicklistner;
		nameTextView.setText(name);
		if(null ==clicklistner){
			addBtn.setVisibility(View.INVISIBLE);
		}else{
			addBtn.setOnClickListener(clicklistner);	
		}
		
	}
}
