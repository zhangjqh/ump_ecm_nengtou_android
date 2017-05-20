package wa.android.task.activity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import nc.vo.oa.component.struct.ResDataVO;
import nc.vo.oa.component.struct.ServiceCodeRes;

import com.example.wamoduletaskv63.R;

import android.content.Intent;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;
import wa.android.common.activity.BaseActivity;
import wa.android.common.networkold.VOHttpResponse;
import wa.android.common.vo.ResponseActionVO;
import wa.android.common.vo.VOProcessUtil;
import wa.android.common.vo.WAActionVO;
import wa.android.constants.CommonServers;
import wa.android.libs.groupview.WAGroupView;
import wa.android.libs.groupview.WAPanelView;
import wa.android.libs.groupview.WARowStyle;
import wa.android.task.constants.ComponentIds;
import wa.android.v63task.constants.V63ActionTypes;
import wa.android.v63task.data.NoteListVO;
import wa.android.v63task.data.NoteVO;

public class V63TaskNoteListActivity extends BaseActivity{
	private String actionname, actioncode, taskid, statuscode, statuskey,
	servicecode;
	private 	NoteListVO notelist = null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		actionname = (String) getIntent().getExtras().get("actionname");
		actioncode = (String) getIntent().getExtras().get("actioncode");
		taskid = (String) getIntent().getExtras().get("taskid");
		statuscode = (String) getIntent().getExtras().get("statuscode");
		statuskey = (String) getIntent().getExtras().get("statuskey");
		servicecode = (String) getIntent().getExtras().get("servicecode");
		setContentView(R.layout.v63_activity_task_notelist);
		TextView titletext = (TextView) findViewById(R.id.titlePanel_titleTextView);
		titletext.setText(getString(R.string.commonword));
		Button backbtn = (Button) findViewById(R.id.titlePanel_backBtn);
		backbtn.setVisibility(View.VISIBLE);
		backbtn.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				finish();
			}
		});
		initData();

		
	}
	private void initView() {
		// TODO Auto-generated method stub
		ScrollView scrollview = (ScrollView) findViewById(R.id.notelist_content_panel);
		WARowStyle rowStyle = new WARowStyle(this);
		if(notelist!= null){
			WAPanelView panel =new WAPanelView(this);
			WAGroupView group = new WAGroupView(this);
			TextView text = null;
			for (NoteVO note:notelist.getNotelist()){
				text = new TextView(this);
				text.setText(note.getOpinion());
				final String opinion = note.getOpinion();
				text.setTextSize(TypedValue.COMPLEX_UNIT_PX, rowStyle.getValueTextSize());
				text.setPadding(rowStyle.getNamePaddingLeft(), rowStyle.getNamePaddingLeft(), rowStyle.getNamePaddingRight(), rowStyle.getNamePaddingLeft());
				text.setOnClickListener(new OnClickListener() {
					
					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						Intent intent = new Intent();
						intent.putExtra("note", opinion);
							intent.putExtra("type", 0);
						// 通过调用setResult方法返回结果给前一个activity。
						setResult(RESULT_OK, intent);
						// 关闭当前activity
						finish();
					}
				});
				group.addRow(text);
			}
			panel.addGroup(group);
			scrollview.addView(panel);
		}
	}
	private void initData() {
		// TODO Auto-generated method stub
		getNoteList(taskid, statuscode, statuskey, actioncode, new OnVORequestedListener(){

			@Override
			public void onVORequested(VOHttpResponse vo) {
				ResponseActionVO responseVO = VOProcessUtil.parseMessageVO(
						ComponentIds.A0A007,
						V63ActionTypes.TASK_GETNOTELIST,
						vo.getmWAComponentInstancesVO());
				switch (responseVO.getFlag()) {
				case 0:
					try {
						for (ServiceCodeRes serviceCodeRes : responseVO
								.getServiceCodeList()) {
							ResDataVO resDataVO = serviceCodeRes
									.getResdata();
							if (resDataVO != null
									&& resDataVO.getList() != null
									&& resDataVO.getList().size() > 0) {
								Map object = (Map) resDataVO.getList()
										.get(0);
								 notelist = new NoteListVO();
							
								if (null != object) {
									Map noteliststruct = (Map) object
											.get("notelist");
									List<Map> notelistmap = (List<Map>) noteliststruct.get("note");
									if(notelistmap != null){
									List<NoteVO> notelisttmp = new ArrayList<NoteVO>();
									if (null != notelistmap) {
										Iterator<Map> iter = notelistmap.iterator();
										while(iter.hasNext()) {
											Map map = iter.next();
											NoteVO noteVO = new NoteVO();
											noteVO.setOpinion((String)map.get("opinion"));										
											notelisttmp.add(noteVO);
										}
										notelist.setNotelist(notelisttmp);
										initView();
									}
									}
								}
							}
						}
					} catch (Exception e) {
						// TODO: handle exception
					}
					break;
				default:
					toastMsg(responseVO.getDesc());
					break;

				}

			}

			@Override
			public void onVORequestFailed(VOHttpResponse vo) {
				// TODO Auto-generated method stub
				
			}}  );
	}
	/**
	 * 获取审批的默认语句
	 * 
	 * @param statusKey
	 * @param statusCode
	 */
	private void getNoteList(String taskId, String statusCode,
			String statusKey, String actionCode, OnVORequestedListener listener) {

		List<WAActionVO> actions = new ArrayList<WAActionVO>();
		WAActionVO action = new WAActionVO();
		// 获取action
		Map<String, String> params = new HashMap<String, String>();
		action = new WAActionVO();
		params = new HashMap<String, String>();
		params.put("groupid", "");
		params.put("usrid", "");
		params.put("statuskey", statusKey);
		params.put("statuscode", statusCode);
		params.put("taskid", taskId);
		params.put("actioncode", actionCode);
		action.setActiontype(V63ActionTypes.TASK_GETNOTELIST);
		action.setParams(params);
		action.setServicecode(servicecode);
		actions.add(action);
		// 发送请求
		requestVO(CommonServers.getServerAddress(this)
				+ CommonServers.SERVER_SERVLET_WA,
				VOProcessUtil.createMessageRequestVO(this, ComponentIds.A0A007, actions),
				listener);

	}
}
