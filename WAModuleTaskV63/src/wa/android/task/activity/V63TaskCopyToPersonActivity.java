package wa.android.task.activity;

import java.util.ArrayList;
import java.util.List;

import com.example.wamoduletaskv63.R;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import wa.android.common.UMProgressDialog;
import wa.android.common.activity.BaseActivity;
import wa.android.libs.btnFieldView.BtnFieldView;
import wa.android.task.adapter.AddPersonAdapter;
import wa.android.task.view.V63TaskBtnFieldView;
import wa.android.task.vo.TaskUserVO;

public class V63TaskCopyToPersonActivity extends BaseActivity implements
		OnClickListener {
	private String actionname, actioncode, taskid, statuscode, statuskey,
			servicecode;
	public static final int RESULT_BACK = 10;
	private UMProgressDialog progressDlg;
	private V63TaskBtnFieldView addPersonName;
	private TextView toWhomTextView;
	private RelativeLayout peopleChooseLayout,btnviewLayout;
	private EditText opinionsEditText;
	private ImageButton addPersonButton;
	private Button submitButton;
	private ArrayList<TaskUserVO> userarrayList;
	private AddPersonAdapter addPersonAdapter;
	private String personid = "";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.v63_activity_copytoperson);
		actionname = (String) getIntent().getExtras().get("actionname");
		actioncode = (String) getIntent().getExtras().get("actioncode");
		taskid = (String) getIntent().getExtras().get("taskid");
		statuscode = (String) getIntent().getExtras().get("statuscode");
		statuskey = (String) getIntent().getExtras().get("statuskey");
		servicecode = (String) getIntent().getExtras().get("servicecode");
		initView();
	}

	/**
	 * 初始化界面
	 */
	@SuppressWarnings("unchecked")
	private void initView() {
		initTitleView();
		progressDlg = new UMProgressDialog(V63TaskCopyToPersonActivity.this);
		progressDlg.setProperty("value", "loading...");
		peopleChooseLayout = (RelativeLayout) findViewById(R.id.taskApproval_peopleChoose_panel);
		toWhomTextView = (TextView) findViewById(R.id.taskApproval_toWhomTextView);

		addPersonButton = (ImageButton) findViewById(R.id.taskApproval_addPersonImageButton);
		btnviewLayout = (RelativeLayout) findViewById(R.id.addPerson_name);
		
		Button backbtn = (Button) findViewById(R.id.titlePanel_backBtn);
		backbtn.setBackgroundResource(0);
		backbtn.setText(getString(R.string.cancel));
		backbtn.setGravity(Gravity.LEFT|Gravity.CENTER_VERTICAL);
		backbtn.setTextSize(TypedValue.COMPLEX_UNIT_SP, 17);
		backbtn.setTextColor(Color.rgb(229, 0, 17));
		backbtn.setVisibility(View.VISIBLE);
		backbtn.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String toastmsg = getString(R.string.cancelaction);
				new AlertDialog.Builder(V63TaskCopyToPersonActivity.this)
						.setMessage(toastmsg)
						.setPositiveButton(getString(R.string.submit),
								new DialogInterface.OnClickListener() {

									@Override
									public void onClick(DialogInterface dialog,
											int which) {
										// TODO Auto-generated method stub
										finish();
									}
								})
						.setNegativeButton(getString(R.string.cancel),
								new DialogInterface.OnClickListener() {

									@Override
									public void onClick(DialogInterface dialog,
											int which) {

									}
								}).show();
			}
		});
		addPersonButton.setOnClickListener(this);
		userarrayList = new ArrayList<TaskUserVO>();
		if(null != getIntent().getSerializableExtra("copyuserlist"))
		userarrayList.addAll((ArrayList<TaskUserVO>)getIntent().getSerializableExtra("copyuserlist"));
		addPersonAdapter = new AddPersonAdapter(this, userarrayList);
		addPersonName = new V63TaskBtnFieldView(this, addPersonAdapter,
					getString(R.string.selectcctarget));
		
		btnviewLayout.addView(addPersonName);
		initApprovalType();
//		addPersonName.getViewTreeObserver().addOnGlobalLayoutListener(
//				new OnGlobalLayoutListener() {
//
//					@Override
//					public void onGlobalLayout() {
//						// TODO Auto-generated method stub
//						if (addPersonName.getChildCount() == 0) {
//							addPersonButton.setVisibility(View.VISIBLE);
//						}
//					}
//				});
	}

	/**
	 * 根据审批类型进行界面调整
	 */
	private void initApprovalType() {

		peopleChooseLayout.setVisibility(View.VISIBLE);
		toWhomTextView.setText(getString(R.string.Cc) + getResources().getString(R.string.to)
				+ ":");
	}

	/**
	 * 初始化导航界面
	 */
	private void initTitleView() {
		TextView titleTextView = (TextView) findViewById(R.id.titlePanel_titleTextView);
		titleTextView.setText(getString(R.string.Cc));
		Button btn = (Button) findViewById(R.id.titlePanel_rightBtn);
		btn.setVisibility(View.GONE);
		Button certainBtn = (Button) findViewById(R.id.titlePanel_rightTextBtn);
		certainBtn.setBackgroundResource(0);
		certainBtn.setText(getString(R.string.submit));
		certainBtn.setGravity(Gravity.RIGHT|Gravity.CENTER_VERTICAL);
		certainBtn.setTextSize(TypedValue.COMPLEX_UNIT_SP, 17);
		certainBtn.setTextColor(Color.rgb(229, 0, 17));
		certainBtn.setVisibility(View.VISIBLE);
		certainBtn.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				personid = getpersonids();
				Intent intent = new Intent();
				intent.setClass(V63TaskCopyToPersonActivity.this,
						V63TaskActionDetail.class);
				intent.putExtra("personid", personid);
				intent.putExtra("userlist", userarrayList);
				intent.putExtra("type", 7);
				intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
				setResult(RESULT_OK, intent);
				finish();
			}
		});
		Button cancelBtn = (Button) findViewById(R.id.titlePanel_backBtn);
		cancelBtn.setVisibility(View.VISIBLE);
		cancelBtn.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {

				finish();
			}
		});
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Intent intent = new Intent();
		intent.setClass(V63TaskCopyToPersonActivity.this,
				ApprovalAddPersonActivity.class);
		intent.putExtra("actionflag", 6);
		intent.putExtra("servicecode", servicecode);
		intent.putExtra("actionname", getString(R.string.Cc));
		intent.putExtra("taskid", taskid);
		startActivityForResult(intent, RESULT_BACK);
	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		switch (resultCode) {
		case RESULT_OK:
			
			List<TaskUserVO> selectUserVo = (List<TaskUserVO>)data.getSerializableExtra("selectUserVOList");
			int type = data.getIntExtra("type", 0);
			int addNum = 0;
			switch (type) {
			case 0:
				
				for(TaskUserVO userVO:selectUserVo){
					personid = getpersonids();
					if (personid.contains(userVO.getPsnId())) {
						new AlertDialog.Builder(V63TaskCopyToPersonActivity.this)
								.setMessage(getString(R.string.existingselection)).setPositiveButton(getString(R.string.submit), null)
								.show();
					} else {

						userarrayList.add(userVO);
						addNum++;
					}
				}
				if(addNum!=0){
					addPersonAdapter.notifyDataSetChanged();
				}
				break;

			default:
				for(TaskUserVO userVO:selectUserVo){
					personid = getpersonids();
					if (personid.contains(userVO.getPsnId())) {
						new AlertDialog.Builder(V63TaskCopyToPersonActivity.this)
								.setMessage(getString(R.string.existingselection)).setPositiveButton(getString(R.string.submit), null)
								.show();
					} else {
						userarrayList.add(userVO);
						addNum++;
					}
				}
				if(addNum!=0){
					addPersonAdapter.notifyDataSetChanged();
				}
				break;
				

			}
		}
	}

	private String getpersonids() {
		StringBuffer psnids = new StringBuffer("");
		String personids = "";
		List<TaskUserVO> TaskUserVOlist = (List<TaskUserVO>) addPersonAdapter
				.getAllItem();

		if (TaskUserVOlist != null)
			if (TaskUserVOlist != null && TaskUserVOlist.size() > 0) {
				for (int i = 0; i < TaskUserVOlist.size(); i++) {
					psnids.append(TaskUserVOlist.get(i).getPsnId());
					if (!(i == TaskUserVOlist.size() - 1)) {
						psnids.append(",");
					}
				}
				personids = psnids.toString();
			}
		return personids;
	}
}
