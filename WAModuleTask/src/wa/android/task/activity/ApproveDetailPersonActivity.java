package wa.android.task.activity;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import nc.vo.oa.component.struct.ResDataVO;
import nc.vo.oa.component.struct.ServiceCodeRes;
import nc.vo.oa.component.taskcenter.ContactInfoVO;
import nc.vo.oa.component.taskcenter.PersonDetailVO;
import wa.android.app.task.R;
import wa.android.common.UMProgressDialog;
import wa.android.common.activity.BaseActivity;
import wa.android.common.vo.ResponseActionVO;
import wa.android.common.vo.VOProcessUtil;
import wa.android.common.vo.WAActionVO;
import wa.android.constants.CommonServers;
import wa.android.constants.CommonWAPreferences;
import wa.android.common.networkold.VOHttpResponse;
import wa.android.libs.groupview.WAGroupView;
import wa.android.libs.groupview.WAPanelView;
import wa.android.libs.groupview.WARow4NameValueIcon;
import wa.android.libs.groupview.WARow4NameValueIcon.NameValueIconRowType;
import wa.android.task.constants.ActionTypes;
import wa.android.task.constants.ComponentIds;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

public class ApproveDetailPersonActivity extends BaseActivity {
	private final int MSGTYPE_MOBILEPHONE = 0x00;
	private final int MSGTYPE_HOMEPHONE = 0x02;
	private final int MSGTYPE_COMPHONE = 0x01;
	private final int MSGTYPE_EMAIL = 0x03;

	public final static int PERSON_DEALER = 0x01;
	public final static int PERSON_SUBMIT = 0x02;
	private boolean ishasthisperson = false;

	private UMProgressDialog progressDlg;
	private boolean issessiontimeOut = false;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_task_detail_person);
		int personType = getIntent().getIntExtra("persontype", PERSON_SUBMIT);
		initTitleView(personType == PERSON_SUBMIT ? R.string.submitter
				: R.string.handler);
		initData(personType);
	}

	/**
	 * 初始化导航界面
	 */
	private void initTitleView(int strId) {
		// 设置头部信息
		TextView titleTextView = (TextView) findViewById(R.id.titlePanel_titleTextView);
		titleTextView.setText(strId);
		// 头部返回按钮的设置
		Button backButton = (Button) findViewById(R.id.titlePanel_backBtn);
		backButton.setVisibility(View.VISIBLE);
		backButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				finish();
			}
		});

		progressDlg = new UMProgressDialog(this);
		progressDlg.setProperty("value", "loading...");
	}

	private void initData(final int psnType) {
		progressDlg.show();
		String psnId = getIntent().getStringExtra("psnid");
		String serviceCode = getIntent().getStringExtra("servicecode");

		getPsnDetail(psnId, serviceCode, new OnVORequestedListener() {

			@Override
			public void onVORequested(VOHttpResponse vo) {
				//判断session过期的基础方法
				/*if (vo.getResponseHeaders().length > 0) {
					for (Header h : vo.getResponseHeaders()) {
						if ("Sessiontimout".equals(h
								.getName())) {
							issessiontimeOut = true;
						}
					}
				}*/
				if(issessiontimeOut){
					isSessionTimeOut(vo);
				}
				else{
				ResponseActionVO responseVO = VOProcessUtil.parseMessageVO(
						ComponentIds.A0A007, ActionTypes.TASK_GETPSNDETAIL,
						vo.getmWAComponentInstancesVO());
				switch (responseVO.getFlag()) {
				case 0:
					for (ServiceCodeRes serviceCodeRes : responseVO
							.getServiceCodeList()) {
						ResDataVO resDataVO = serviceCodeRes.getResdata();
						if (resDataVO != null&&resDataVO.getList()!=null&&resDataVO.getList().size()>0&&!ishasthisperson) {
							PersonDetailVO data = (PersonDetailVO) resDataVO
									.getList().get(0);
							updateView(data, psnType);
							ishasthisperson= true;
						}
					}
					break;

				default:
					toastMsg(responseVO.getDesc());
					break;
				}
				progressDlg.dismiss();
			}}

			@Override
			public void onVORequestFailed(VOHttpResponse vo) {
				progressDlg.dismiss();
			}
		});
	}

	/**
	 * 更新view
	 * 
	 * @param personDetailVO
	 */
	private void updateView(PersonDetailVO data, int personType) {
		// 初始化组件
		ImageView portraitImageView = (ImageView) findViewById(R.id.taskdetailperson_portraitImageView);
		TextView nameTextView = (TextView) findViewById(R.id.taskdetailperson_nameTextView);
		TextView titleTextView = (TextView) findViewById(R.id.taskdetailperson_titleTextView);
		TextView deptTextView = (TextView) findViewById(R.id.taskdetailperson_deptTextView);
		TextView companyTextView = (TextView) findViewById(R.id.taskdetailperson_companyTextView);
		ScrollView phoneScrollView = (ScrollView) findViewById(R.id.taskdetailperson_phoneScrollView);
		// 给组件赋值
		portraitImageView
				.setBackgroundResource(personType == PERSON_SUBMIT ? R.drawable.task_submitperson_icon
						: R.drawable.task_dealerperson_icon);
		titleTextView.setText(data.getTitle());
		nameTextView.setText(data.getPname());
		deptTextView.setText(data.getDepartment());
		companyTextView.setText(data.getCompany());
		// 给手机、电话、email赋值
		List<ContactInfoVO> contactList = data.getContactinfo();
		if (contactList.size() > 0) {
			WAPanelView detailView = new WAPanelView(this);
			WAGroupView group = new WAGroupView(this);
			for (ContactInfoVO c : contactList) {
				int msgType = Integer.valueOf(c.getMsgtype());
				WARow4NameValueIcon row = null;
				switch (msgType) {
				case MSGTYPE_MOBILEPHONE:
					row = new WARow4NameValueIcon(this,
							NameValueIconRowType.NAME_C_VALUE_ICON_MOBILE);
					break;
				case MSGTYPE_HOMEPHONE:
				case MSGTYPE_COMPHONE:
					row = new WARow4NameValueIcon(this,
							NameValueIconRowType.NAME_C_VALUE_ICON_TEL);
					break;
				case MSGTYPE_EMAIL:
					row = new WARow4NameValueIcon(this,
							NameValueIconRowType.NAME_C_VALUE_ICON_MAIL);
				}
				row.setValue(c.getPropname(), c.getPropvalue());
				group.addRow(row);
			}
			detailView.addGroup(group);
			phoneScrollView.addView(detailView);
		}
	}

	private void getPsnDetail(String psnId, String serviceCode,
			OnVORequestedListener listener) {
		WAActionVO actionVO = new WAActionVO();
		Map<String, String> params = new HashMap<String, String>();
			params.put("groupid", this.readPreference(CommonWAPreferences.GROUP_ID) !=null?this.readPreference(CommonWAPreferences.GROUP_ID):"" );	
		params.put("usrid", "");
		params.put("psnid", psnId);

		actionVO.setServicecode(serviceCode);
		actionVO.setActiontype(ActionTypes.TASK_GETPSNDETAIL);
		actionVO.setParams(params);
		// 发送请求
		requestVO(CommonServers.getServerAddress(this)
				+ CommonServers.SERVER_SERVLET_WA,
				VOProcessUtil.createMessageRequestVO(this, ComponentIds.A0A007, actionVO),
				listener);
	}
}
