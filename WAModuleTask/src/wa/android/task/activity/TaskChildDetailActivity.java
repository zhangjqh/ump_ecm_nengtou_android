package wa.android.task.activity;

import java.util.List;

import wa.android.app.task.R;
import wa.android.common.activity.BaseActivity;
import wa.android.libs.clickFillScreen.FillScreenActivity;
import wa.android.libs.groupview.WAGroupView;
import wa.android.libs.groupview.WAPanelView;
import wa.android.libs.groupview.WARow4NameValue;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;

public class TaskChildDetailActivity extends BaseActivity {
	@SuppressWarnings("unchecked")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_task_childdetail);
		initTitleView();
		List<String[]> childList = (List<String[]>) getIntent()
				.getSerializableExtra("childRow");
		updateView(childList);
	}

	private void updateView(List<String[]> childList) {
		ScrollView detailScrollView = (ScrollView) findViewById(R.id.taskchilddetail_detailScrollView);
		WAPanelView detailPanel = new WAPanelView(this);
		WAGroupView groupView = new WAGroupView(this);
		for (String[] child : childList) {
			if (!child[0].equals("title")) {
				WARow4NameValue row = new WARow4NameValue(this);
				//临时解决问题方法
				if(child[0]!=null && child[0].equals("起算日期")){
					if(child[1]!=null &&!( child[1].trim().equals(""))){
						child[1]=child[1].substring(0, 10);
					}
				}
				if(child[0]!=null && child[0].equals("计划到期日")){
					if(child[1]!=null &&!( child[1].trim().equals(""))){
						child[1]=child[1].substring(0, 10);
					}
				}
				//以上部分后添加
				row.setValue(child[0], child[1]);
				//长按事件
				row.setTag(child[1]);
				row.setOnLongClickListener(new OnLongClickListener() {
					
					@Override
					public boolean onLongClick(View v) {
						WARow4NameValue r = (WARow4NameValue)v;
						Intent i = new Intent();
						i.setClass(TaskChildDetailActivity.this, FillScreenActivity.class);
						i.putExtra("checkText", r.getTag().toString());
						startActivity(i);
						return false;
					}
				});
				
				groupView.addRow(row);
			}
		}
		detailPanel.addGroup(groupView);
		detailScrollView.addView(detailPanel);
	}

	/**
	 * 初始化导航界面
	 */
	private void initTitleView() {
		// 设置头部信息
		TextView titleTextView = (TextView) findViewById(R.id.titlePanel_titleTextView);
		titleTextView.setText(R.string.taskline);
		// 头部返回按钮的设置
		Button backButton = (Button) findViewById(R.id.titlePanel_backBtn);
		backButton.setVisibility(View.VISIBLE);
		backButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				finish();
			}
		});
	}

}
