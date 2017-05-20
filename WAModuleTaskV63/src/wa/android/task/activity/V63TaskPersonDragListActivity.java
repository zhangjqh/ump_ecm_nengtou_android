package wa.android.task.activity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import wa.android.common.App;
import wa.android.common.activity.BaseActivity;
import wa.android.task.adapter.DragListViewAdapter;
import wa.android.task.view.DragListView;
import wa.android.task.vo.TaskUserVO;
import wa.android.uploadattachment.adapter.AttachmentListAdapter;
import wa.android.v63task.data.TaskUserVOList;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.wamoduletaskv63.R;

public class V63TaskPersonDragListActivity extends BaseActivity {
	private DragListViewAdapter adapter;	
	private DragListView dragListView;
	private String actionname, actioncode, taskid, statuscode, statuskey,
	servicecode, actionflag;
	private ArrayList<TaskUserVO> userList = new ArrayList<TaskUserVO>();
	private List<String> itemlist = new ArrayList<String>();
	private OnClickListener getUserlist;
	private boolean isbeforeUserListFlag = false;
	public static final int RESULT_BACK = 10;
	private TaskUserVOList taskUserVOList,taskUserVOListfromIntent;
	private Button finishBtn;
	private TextView title;
	private String personids = "";
	private HashMap<Integer, Boolean> state;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.v63_activity_task_draglist);
		actionname = (String) getIntent().getExtras().get("actionname");
		actioncode = (String) getIntent().getExtras().get("actioncode");
		taskid = (String) getIntent().getExtras().get("taskid");
		statuscode = (String) getIntent().getExtras().get("statuscode");
		statuskey = (String) getIntent().getExtras().get("statuskey");
		servicecode = (String) getIntent().getExtras().get("servicecode");
		actionflag = (String) getIntent().getExtras().get("actionflag");
		isbeforeUserListFlag = ((String) getIntent().getExtras().get("isbeforesign")).equals("true");
		taskUserVOListfromIntent = (TaskUserVOList) getIntent().getExtras().get("userList");
		if(taskUserVOListfromIntent!=null&&taskUserVOListfromIntent.getUserlist()!=null&&taskUserVOListfromIntent.getUserlist().size()>0){
			userList = taskUserVOListfromIntent.getUserlist();	
		}
		init();
		}
	private void init() {
	
		getUserlist = new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent i = new Intent();
				i.putExtra("actionname", actionname);
				i.putExtra("actioncode", actioncode);
				i.putExtra("taskid", taskid);
				i.putExtra("statuscode", statuscode);
				i.putExtra("statuskey", statuskey);
				i.putExtra("servicecode", servicecode);
				i.putExtra("actionflag", actionflag);
				if (isbeforeUserListFlag) {
					i.putExtra("v63actionflag", "3");
				} else {
					i.putExtra("v63actionflag", "4");
				}
				i.setClass(V63TaskPersonDragListActivity.this,
						V63ApprovalAddPersonActivity.class);
				startActivityForResult(i, RESULT_BACK);
			}
		};
		
        setContentView(R.layout.v63_activity_task_draglist);
//        Button addbtn = (Button) findViewById(R.id.draglistaddbtn);
//        addbtn.setOnClickListener(getUserlist);
        Button backbtn = (Button) findViewById(R.id.titlePanel_backBtn);
//		backbtn.setBackgroundResource(R.drawable.title_button_blank_bg);
//		backbtn.setText(getString(R.string.back));
		//backbtn.setTextColor(Color.rgb(255, 255, 255));
		backbtn.setVisibility(View.VISIBLE);
		backbtn.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				

				Intent i = new Intent();
				 ArrayList<TaskUserVO> userListtmp  = new ArrayList<TaskUserVO>();
				 for (String str:adapter.getList()){
					 for(TaskUserVO usr:userList){
						 if(str.equals(usr.getPsnName())){
							 userListtmp.add(usr);
							 break;
						 }
					 }
				 }
				 
				taskUserVOList = new TaskUserVOList();
				taskUserVOList.setUserlist(userListtmp);
				StringBuffer personidsb  = new StringBuffer("");
				if(taskUserVOList.getUserlist().size()>0){
					 for (int j = 0 ; j <taskUserVOList.getUserlist().size();j++){
						 personidsb.append(taskUserVOList.getUserlist().get(j).getPsnId()) ;
							if (!(j == taskUserVOList.getUserlist().size() - 1)) {
								personidsb.append(",");
							}
					 }
					 
				}
		
				i.putExtra("userList", taskUserVOList);
				i.putExtra("personids",personidsb.toString());
				if(isbeforeUserListFlag){
				i.putExtra("type", 3);
				}
				else{
					i.putExtra("type", 4);
				}
				setResult(Activity.RESULT_OK, i);
				finish();
			
			}
		});
		 finishBtn = (Button)findViewById(R.id.titlePanel_rightBtn);
//		finishBtn.setText("完成");
		finishBtn.setTextColor(Color.rgb(255, 255, 255));
		finishBtn.setBackgroundResource(R.drawable.jumpbtn);
		finishBtn.setVisibility(View.VISIBLE);
		
		//标题设置
		title = (TextView)findViewById(R.id.titlePanel_titleTextView);
		title.setText(R.string.operator);

        dragListView = (DragListView) findViewById(R.id.taskdrag_content_panel);
        initData();
        itemlist.clear();
        for(TaskUserVO user:userList){
        	itemlist.add(user.getPsnName());
        	
        }
        adapter = new DragListViewAdapter(this, itemlist);
        dragListView.setAdapter(adapter);
      
		finishBtn.setOnClickListener(getUserlist);
		state = AttachmentListAdapter.getState(); 
		
		  dragListView.setOnItemLongClickListener(new OnItemLongClickListener() {

				@Override
				public boolean onItemLongClick(AdapterView<?> arg0, View arg1,
						final int arg2, long arg3) {	
					new AlertDialog.Builder(V63TaskPersonDragListActivity.this)
					.setMessage(getString(R.string.deleteperson))
					.setPositiveButton(getString(R.string.submit),
							new DialogInterface.OnClickListener() {

								@Override
								public void onClick(DialogInterface dialog,
										int which) {
									// TODO Auto-generated method stub
						    		 List<String> itemlisttmp = new ArrayList<String>();
						    		 itemlisttmp = adapter.getList();
						    		 itemlisttmp.remove(arg2);
						    		 itemlist = itemlisttmp;
						    		 adapter.notifyDataSetChanged();
									 ArrayList<TaskUserVO> userListtmp  = new ArrayList<TaskUserVO>();
									 for (String str:adapter.getList()){
										 for(TaskUserVO usr:userList){
											 if(str.equals(usr.getPsnName())){
												 userListtmp.add(usr);
												 break;
											 }
										 }
									 }
									 userList = userListtmp;
								}
							})
					.setNegativeButton(getString(R.string.cancel),
							new DialogInterface.OnClickListener() {

								@Override
								public void onClick(DialogInterface dialog,
										int which) {

								}
							}).show();
					state.clear(); 
					DragListViewAdapter.setState(state);
					adapter.notifyDataSetChanged();
					if(state.get(arg2)!= null)
					{
						state.remove(arg2);
						DragListViewAdapter.setState(state);
						adapter.notifyDataSetChanged();
//						finishBtn.setText("完成");
					}
					else{
						state.put(arg2, true);
						DragListViewAdapter.setState(state);
						adapter.notifyDataSetChanged();
//						finishBtn.setText("取消");
					}
					return false;
				}
			});
	}
	

	private void initData() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		switch (resultCode) {
		case RESULT_OK:
			List<TaskUserVO> selectUserVo = (List<TaskUserVO>)data.getSerializableExtra("selectUserVOList");
			int addNum = 0;
			int type = data.getIntExtra("type", 0);
			switch (type) {
			
			case 3:
				/*TaskUserVO beforesignuserVO = (TaskUserVO) data
						.getSerializableExtra("userVO");*/
				for(TaskUserVO userVO:selectUserVo){
					personids = getpersonids();
					if (personids.contains(userVO.getPsnName())) {
						new AlertDialog.Builder(V63TaskPersonDragListActivity.this)
								.setMessage(getString(R.string.existingselection)).setPositiveButton(getString(R.string.submit), null)
								.show();
					} else {
						userList.add(userVO);
						itemlist.clear();
				        for(TaskUserVO user:userList){
				        	itemlist.add(user.getPsnName());
				        }
				        addNum++;
						//adapter.notifyDataSetChanged();
					}
				}
				if(addNum!=0){
					adapter.notifyDataSetChanged();
				}
				break;
			case 4:
				for(TaskUserVO userVO:selectUserVo){
					personids = getpersonids();
					if (personids.contains(userVO.getPsnName())) {
						new AlertDialog.Builder(V63TaskPersonDragListActivity.this)
								.setMessage(getString(R.string.existingselection)).setPositiveButton(getString(R.string.submit), null)
								.show();
					} else {
						userList.add(userVO);
						itemlist.clear();
				        for(TaskUserVO user:userList){
				        	itemlist.add(user.getPsnName());
				        }
				        addNum++;
						//adapter.notifyDataSetChanged();
					}
				}
				if(addNum!=0){
					adapter.notifyDataSetChanged();
				}
				break;
		
			default:
				break;
			}
			break;
		}
	}
	@SuppressWarnings("unchecked")
	private String getpersonids() {
		StringBuffer psnids = new StringBuffer("");
		String personids = "";
		// addPersonAdapter.notifyDataSetChanged();
		if (personids != null) {
				if (itemlist != null && itemlist.size() > 0) {
					for (int i = 0; i < itemlist.size(); i++) {
						psnids.append(itemlist.get(i));
						if (!(i == itemlist.size() - 1)) {
							psnids.append(",");
						}
					}
					personids = psnids.toString();
				}
		}
		return personids;
	}

	   /**
* 物理键监听
*/
	public boolean onKeyDown(int keyCode, KeyEvent event) { // 监听物理键
		if (keyCode == KeyEvent.KEYCODE_BACK ) {
			

			Intent i = new Intent();
			 ArrayList<TaskUserVO> userListtmp  = new ArrayList<TaskUserVO>();
			 for (String str:adapter.getList()){
				 for(TaskUserVO usr:userList){
					 if(str.equals(usr.getPsnName())){
						 userListtmp.add(usr);
						 break;
					 }
				 }
			 }
			 
			taskUserVOList = new TaskUserVOList();
			taskUserVOList.setUserlist(userListtmp);
			StringBuffer personidsb  = new StringBuffer("");
			if(taskUserVOList.getUserlist().size()>0){
				 for (int j = 0 ; j <taskUserVOList.getUserlist().size();j++){
					 personidsb.append(taskUserVOList.getUserlist().get(j).getPsnId()) ;
						if (!(j == taskUserVOList.getUserlist().size() - 1)) {
							personidsb.append(",");
						}
				 }
				 
			}
	
			i.putExtra("userList", taskUserVOList);
			i.putExtra("personids",personidsb.toString());
			if(isbeforeUserListFlag){
			i.putExtra("type", 3);
			}
			else{
				i.putExtra("type", 4);
			}
			setResult(Activity.RESULT_OK, i);
			finish();
		
		}
		if (keyCode == KeyEvent.KEYCODE_MENU) {

			Intent i = new Intent();
			i.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP
					| Intent.FLAG_ACTIVITY_CLEAR_TOP);
			i.setClass(this, App.moduleList.get(0).getMainClazz());
			startActivity(i);
//			Toast.makeText(this, "Menu", Toast.LENGTH_SHORT).show();
		return false;
	}
		return super.onKeyDown(keyCode, event);
		} 
}
