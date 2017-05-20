package wa.android.task.activity;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import nc.vo.oa.component.struct.ResDataVO;
import nc.vo.oa.component.struct.ServiceCodeRes;

import org.apache.commons.codec.binary.Base64;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import wa.android.common.App;
import wa.android.common.UMProgressDialog;
import wa.android.common.activity.BaseActivity;
import wa.android.common.networkold.VOHttpResponse;
import wa.android.common.utils.DensityUtil;
import wa.android.common.vo.ResponseActionVO;
import wa.android.common.vo.VOProcessUtil;
import wa.android.common.vo.WAActionVO;
import wa.android.constants.CommonServers;
import wa.android.libs.btnFieldView.BtnFieldView;
import wa.android.libs.dragBtnFieldView.DragBtnFieldView;
import wa.android.libs.groupview.WAGroupView;
import wa.android.libs.groupview.WAPanelView;
import wa.android.task.adapter.AddPersonAdapter;
import wa.android.task.adapter.DragBtnFieldViewAdapterForm;
import wa.android.task.constants.ComponentIds;
import wa.android.task.view.TaskRow4ValueIcon;
import wa.android.task.view.V63TaskActionRowStyle1;
import wa.android.task.view.V63TaskActionRowStyle2;
import wa.android.task.view.V63TaskActionRowStyle5;
import wa.android.task.view.V63TaskBtnFieldView;
import wa.android.task.view.V63TaskScrollView;
import wa.android.task.vo.TaskUserVO;
import wa.android.uploadattachment.activity.WAAttahcmentUploadActivity;
import wa.android.uploadattachment.data.AttachmentShowVO;
import wa.android.uploadattachment.data.UpLoadAttachmentListVO;
import wa.android.v63task.constants.V63ActionTypes;
import wa.android.v63task.data.ActivityListVO;
import wa.android.v63task.data.ActivityVO;
import wa.android.v63task.data.DefaultActionVO;
import wa.android.v63task.data.TaskUserVOList;
import wa.android.v63task.data.UserVO;
import wa.android.v63task.data.UsersOfActivityVO;
import wa.android.v63task.util.ReadUtil;
import wa.android.walibpiccompress.util.PicCompressUtil;
import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Message;
import android.text.InputFilter;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.WindowManager;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.wamoduletaskv63.R;

@SuppressLint("HandlerLeak")
public class V63TaskActionDetail extends BaseActivity {

	private String actionname, actioncode, taskid, statuscode, statuskey,
			servicecode, actionflag;
	private OnClickListener getNoteList, getActivityList, getUserlist,
			getAttachmentUploadList;
	private AutoCompleteTextView advicetext;
	//cgg 添加
	private String advicetextDefaultValue = "";
	private WAGroupView signgroup, advicegroup, beforesigngroup,
			aftersigngroup, attachmentgroup, copygroup, textgroup, beforegroup,
			aftergroup;
	public static final int RESULT_BACK = 10;
	private List<ActivityVO> signactivitylist = new ArrayList<ActivityVO>();

	public List<ActivityVO> getSignactivitylist() {
		return signactivitylist;
	}

	public void setSignactivitylist(List<ActivityVO> signactivitylist) {
		this.signactivitylist = signactivitylist;
	}

	private WAPanelView signpanelview, panelview;
	private List<V63TaskActionRowStyle5> V63TaskActionRowStyle5list = new ArrayList<V63TaskActionRowStyle5>();
	private Map<String, List<UserVO>> userlistMap = new HashMap<String, List<UserVO>>();
	private AddPersonAdapter changeassignadapter, rejectadapter,
			addassignadapter;
	private DragBtnFieldViewAdapterForm beforesignadapter, aftersignadapter;
	private ArrayList<TaskUserVO> beforesignuserList = new ArrayList<TaskUserVO>(),
			aftersignuserList = new ArrayList<TaskUserVO>(),
			changeassignList = new ArrayList<TaskUserVO>(),
			rejectList = new ArrayList<TaskUserVO>(),
			addassignList = new ArrayList<TaskUserVO>();
	private TextView submitbtn;
	private String actioncontent = "";
	private DefaultActionVO defaultaction;
	private String markpath = "";
	private String aftersignpersonid = "", beforesignpersonid = "", note = "",
			copytopersonid = "", changeassignid = "", rejectid = "",
			addassignid = "";
	private TextView adviceTextView;
	private UpLoadAttachmentListVO attachmentListVO = new UpLoadAttachmentListVO();
	private List<UserVO> noactivityuserlist = new ArrayList<UserVO>();

	private String doactiondesc = "", uploaddesc = "";
	private boolean isrightdoaction = true, isrightupload = true,
			isNCbefore = false, isbeforeUserListFlag = false,
			isuploadfile = false, issendrequst = true, issendrequst1 = true,
			issendrequst2 = true, issendrequst3 = true, issendrequst4 = true,
			isassign = false;
	private V63TaskActionRowStyle1 rejectrow, changeassasignrow, addasignrow;
	private V63TaskBtnFieldView aftersigntext, beforesigntext, rejectText,
			changeassignText;
	private TaskRow4ValueIcon attachmentrow, copyrow, beforerow, afterrow;
	private String beforehinttext = "", afterhinttext = "";
	private ArrayList<TaskUserVO> copyuserlist;
	private String issinglefromactivity;
	private V63TaskActionRowStyle1 signrow;
	private boolean isneednote = false;
	private UMProgressDialog progressDlg;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		progressDlg = new UMProgressDialog(V63TaskActionDetail.this);
		progressDlg.setProperty("value", "loading...");
		actionname = (String) getIntent().getExtras().get("actionname");
		actioncode = (String) getIntent().getExtras().get("actioncode");
		taskid = (String) getIntent().getExtras().get("taskid");
		statuscode = (String) getIntent().getExtras().get("statuscode");
		statuskey = (String) getIntent().getExtras().get("statuskey");
		servicecode = (String) getIntent().getExtras().get("servicecode");
		actionflag = (String) getIntent().getExtras().get("actionflag");
		setContentView(R.layout.v63_activity_task_actiondetail);
		TextView titletext = (TextView) findViewById(R.id.titlePanel_titleTextView);
		titletext.setText(actionname);
		Button backbtn = (Button) findViewById(R.id.titlePanel_backBtn);
		backbtn.setVisibility(View.VISIBLE);
		// cgg 测试
		actionname = "cgg测试";
		backbtn.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String toastmsg = getString(R.string.cancelaction);
				new AlertDialog.Builder(V63TaskActionDetail.this)
						.setMessage(toastmsg)
						.setPositiveButton(getString(R.string.submit),
								new DialogInterface.OnClickListener() {

									@Override
									public void onClick(DialogInterface dialog,
											int which) {
										// TODO Auto-generated method stub
										if (!markpath.equals("")) {
											byte[] filecontent;
											String content = "";
											try {
												filecontent = Base64.encodeBase64(ReadUtil
														.writeToXml(markpath));

												content = new String(
														filecontent);
												if (content != null
														&& !content.equals(""))
													deleteFile(markpath);
												markpath = "";
											} catch (Exception e) {
												// TODO Auto-generated catch
												// block
												e.printStackTrace();
											}
										}
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
		initStyle();
		submitbtn = (TextView) findViewById(R.id.submitbtn);
		submitbtn.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				dosubmit();
			}
		});
	}

	@SuppressLint("HandlerLeak")
	private Handler handler = new Handler() {
		@Override
		public void handleMessage(Message msg) {
			// TODO Auto-generated method stub
			super.handleMessage(msg);
			if (isrightdoaction) {
				String toasttext = doactiondesc.equals("") ? getString(R.string.actionsuccess)
						: doactiondesc;
				if (!isrightupload) {
					toasttext = toasttext + "  ";
					// + uploaddesc;
				}
				new AlertDialog.Builder(V63TaskActionDetail.this)
						.setMessage(toasttext)
						.setPositiveButton(getString(R.string.submit),
								new DialogInterface.OnClickListener() {

									@Override
									public void onClick(DialogInterface dialog,
											int which) {
										// TODO Auto-generated method stub
										((App) getApplication())
												.addGlobalVariable(
														"isrefreshlist", "true");
										((App) getApplication())
												.addGlobalVariable("statuskey",
														statuskey);
										((App) getApplication())
												.addGlobalVariable(
														"statuscode",
														statuscode);
										// 处理来自push通知的提交返回
										SharedPreferences sp = V63TaskActionDetail.this
												.getSharedPreferences(
														"NOTIFICATION",
														V63TaskActionDetail.this.MODE_PRIVATE);
										String isFromPush = sp.getString(
												"frompush", "");
										if (!"true".equals(isFromPush)) {

											Intent i = new Intent();
											i.setFlags(Intent.FLAG_ACTIVITY_BROUGHT_TO_FRONT
													| Intent.FLAG_ACTIVITY_CLEAR_TOP);
											i.setClass(
													V63TaskActionDetail.this,
													V63TaskGroupActivity.class);
											startActivity(i);
										} else {
											setResult(1);
											Editor editor = sp.edit();
											editor.putString("frompush", "");
											editor.commit();
										}
										finish();

									}
								}).show();
			} else {
				String toasttext = doactiondesc;
				if (!isrightupload) {
					toasttext = toasttext + "  ";
					// + uploaddesc;
				}
				new AlertDialog.Builder(V63TaskActionDetail.this)
						.setMessage(toasttext)
						.setPositiveButton(getString(R.string.submit),
								new DialogInterface.OnClickListener() {

									@Override
									public void onClick(DialogInterface dialog,
											int which) {
										// TODO Auto-generated method stub
									}
								}).show();
			}
			progressDlg.dismiss();
		}
	};
	private V63TaskBtnFieldView addassignText;

	private void dosubmit() {
		// TODO Auto-generated method stub
		progressDlg.show();
		doAction(taskid, statuscode, statuskey, actioncode,
				new OnVORequestedListener() {
					@Override
					public void onVORequested(VOHttpResponse vo) {
						ResponseActionVO responseVO = VOProcessUtil
								.parseMessageVO(ComponentIds.A0A007,
										V63ActionTypes.TASK_DOACTION,
										vo.getmWAComponentInstancesVO());
						doactiondesc = responseVO.getDesc();
						switch (responseVO.getFlag()) {
						case 0:
							isrightdoaction = true;
							break;
						default:
							isrightdoaction = false;
						}
						ResponseActionVO attachresponseVO = VOProcessUtil
								.parseMessageVO(ComponentIds.A0A007,
										V63ActionTypes.TASK_UPLOADFILE,
										vo.getmWAComponentInstancesVO());
						uploaddesc = attachresponseVO.getDesc();
						switch (attachresponseVO.getFlag()) {
						case 0:
							isrightupload = true;
							break;
						default:
							isrightupload = false;
							break;
						}
						handler.sendEmptyMessage(0);
					}

					@Override
					public void onVORequestFailed(VOHttpResponse vo) {
						// TODO Auto-generated method stub
						progressDlg.dismiss();
					}
				});
	}

	/**
	 * 鎻愪氦瀹℃壒鐨勫鎵瑰姩浣滈粯璁よ缃�
	 * 
	 * @param statusKey
	 * @param statusCode
	 */
	private void doAction(String taskId, String statusCode, String statusKey,
			String actionCode, OnVORequestedListener listener) {
		try {
			List<WAActionVO> actions = new ArrayList<WAActionVO>();
			// 先处理附件提交，否则会有问题的
			if (isuploadfile && null != attachmentListVO.getAttachmentlist()
					&& attachmentListVO.getAttachmentlist().size() > 0)
				actions.add(upLoadParamhandler(taskId, statusCode, statusKey,
						actionCode, listener));
			actions.add(doActionParamhandler(taskId, statusCode, statusKey,
					actionCode, listener));
			// 鍙戦�璇锋眰
			if (isneednote) {
				progressDlg.dismiss();
				String toastmsg = getString(R.string.commentsnotnull);
				new AlertDialog.Builder(V63TaskActionDetail.this)
						.setMessage(toastmsg)
						.setPositiveButton(getString(R.string.submit),
								new DialogInterface.OnClickListener() {

									@Override
									public void onClick(DialogInterface dialog,
											int which) {
										// TODO Auto-generated method stub

									}
								}).show();

			} else if (!isneednote
					&& !(issendrequst && issendrequst1 && issendrequst2
							&& issendrequst3 && issendrequst4)) {
				progressDlg.dismiss();
				String toastmsg = getString(R.string.choice) + actioncontent;
				new AlertDialog.Builder(V63TaskActionDetail.this)
						.setMessage(toastmsg)
						.setPositiveButton(getString(R.string.submit),
								new DialogInterface.OnClickListener() {

									@Override
									public void onClick(DialogInterface dialog,
											int which) {
										// TODO Auto-generated method stub

									}
								}).show();
			} else {
				requestVO(CommonServers.getServerAddress(this)
						+ CommonServers.SERVER_SERVLET_WA,
						VOProcessUtil.createMessageRequestVO(this,
								ComponentIds.A0A007, actions), listener);
			}
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			progressDlg.dismiss();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			progressDlg.dismiss();
		}
	}

	@SuppressWarnings({ "unchecked", "unused", "rawtypes" })
	private WAActionVO upLoadParamhandler(String taskId, String statusCode,
			String statusKey, String actionCode, OnVORequestedListener listener)
			throws JSONException {
		WAActionVO action = new WAActionVO();

		// 鑾峰彇action
		HashMap<String, Object> mixparams = new HashMap<String, Object>();
		Map<String, String> params = new HashMap<String, String>();
		List reqaction = new ArrayList<Object>();

		params.put("taskid", taskId);
		params.put("actioncode", actionCode);
		params.put("groupid", "");
		params.put("usrid", "");
		if (null != attachmentListVO.getAttachmentlist()
				&& attachmentListVO.getAttachmentlist().size() > 0) {
			int width = getWindowManager().getDefaultDisplay().getWidth();
			for (AttachmentShowVO attachmentShowVO : attachmentListVO
					.getAttachmentlist()) {
				String sdPath = Environment.getExternalStorageDirectory()
						.getPath();
				JSONObject attachmentObject = new JSONObject();
				attachmentObject.put("name",
						attachmentShowVO.getAttachmentName());
				byte[] filecontent;
				try {
					String content = "";
					if (attachmentShowVO.getAttachmentPath().toLowerCase()
							.contains(".png")
							|| attachmentShowVO.getAttachmentPath()
									.toLowerCase().contains(".jpg")) {
						content = PicCompressUtil.getCompressBitmap(
								attachmentShowVO.getAttachmentPath(),
								attachmentShowVO.getAttachmentName(), width);
					} else {
						filecontent = Base64.encodeBase64(ReadUtil
								.writeToXml(attachmentShowVO
										.getAttachmentPath()));
						content = new String(filecontent);
					}

					attachmentObject.put("content", content);
					reqaction.add(attachmentObject);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} else {
			JSONObject attachmentObject = new JSONObject();
			// attachmentObject.put("name","");
			// attachmentObject.put("content", "");
			reqaction.add(attachmentObject);
		}
		mixparams.put("filelist", reqaction);
		action.setParams(params);
		action.setActiontype(V63ActionTypes.TASK_UPLOADFILE);
		action.setIsmixparams(true);
		action.setMixparams(mixparams);
		action.setServicecode(servicecode);
		return action;

	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	private WAActionVO doActionParamhandler(String taskId, String statusCode,
			String statusKey, String actionCode, OnVORequestedListener listener)
			throws JSONException {
		// TODO Auto-generated method stub
		// 浠诲姟鏍囪瘑(taskid)
		// 鐘舵�key(statuskey)
		// 鐘舵�鏍囪瘑(statuscode)
		// 鍔ㄤ綔缂栫爜(actioncode)
		// 瀹℃壒鎰忚(note)
		// 鏅�鍔犵瀵硅薄鍒楄〃/鎸囨淳瀵硅薄鍒楄〃/(鏀规淳)杞彂瀵硅薄鍒楄〃(userids)
		// 鍓嶅姞绛剧被鍨�bsignaltype)
		// 鍓嶅姞绛惧璞″垪琛�bsignalusers)
		// 鍚庡姞绛剧被鍨�asignaltype)
		// 鍚庡姞绛惧璞″垪琛�asignalusers)
		// 鎶勯�瀵硅薄鍒楄〃(ccusers)
		// 椹冲洖娲诲姩鏍囪瘑闆嗗悎(rejectmarks)
		// 鎸囨淳娲诲姩鏍囪瘑闆嗗悎(activityids)
		// 鎵规敞(postil)

		WAActionVO action = new WAActionVO();
		JSONObject jsonparam = new JSONObject();
		// 鑾峰彇action
		HashMap<String, Object> mixparams = new HashMap<String, Object>();
		Map<String, String> params = new HashMap<String, String>();
		List reqaction = new ArrayList<Object>();
		// 鍒涘缓Json璇锋眰瀵硅薄锛�
		// 鍩烘湰string 绫诲瀷
		params = new HashMap<String, String>();
		jsonparam.put("statuskey", statusKey);
		jsonparam.put("statuscode", statusCode);
		jsonparam.put("taskid", taskId);
		jsonparam.put("actioncode", actionCode);
		note = advicetext.getText().toString() + adviceTextView.getText();
		if (defaultaction.getIshasnote().equals("2")
				|| defaultaction.getIshasnote().equals("4")) {
			if (null == advicetext.getText().toString()
					|| advicetext.getText().toString().equals("")) {
				isneednote = true;
			} else {
				isneednote = false;
			}
		}

		if (null != note && !note.equals("")) {
			jsonparam.put("note", note);
		}
		String content = "";
		if (!markpath.equals("")) {
			byte[] filecontent;
			try {
				filecontent = Base64
						.encodeBase64(ReadUtil.writeToXml(markpath));

				content = new String(filecontent);
				// 鍒犻櫎鏈湴鍥剧墖
				deleteFile(markpath);
				markpath = "";
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (null != content && !content.equals("")) {
			jsonparam.put("postil", content);
		}
		String beforesigntype = "";
		String aftersigntype = "";
		for (int i = 0; i < panelview.getChildCount(); i++) {
			if (panelview.getChildAt(i) instanceof V63TaskActionRowStyle2) {
				V63TaskActionRowStyle2 row = (V63TaskActionRowStyle2) panelview
						.getChildAt(i);
				if (row.isIsbefore()) {
					if (row.isIsmultiple()) {
						beforesigntype = "1";
					} else {
						beforesigntype = "2";
					}

				} else {
					if (row.isIsmultiple()) {
						aftersigntype = "1";
					} else {
						aftersigntype = "2";
					}
				}
			}
		}
		if (!beforesigntype.equals("")) {
			jsonparam.put("bsignaltype", beforesigntype);
		}
		if (!aftersigntype.equals("")) {
			jsonparam.put("asignaltype", aftersigntype);
		}

		// String[]绫诲瀷
		// 鍚庡姞绛�
		// aftersignpersonid = aftersigngetpersonids() == null ? ""
		// : aftersigngetpersonids();
		if (!aftersignpersonid.equals("")) {
			String[] afterstr = aftersignpersonid.split(",");
			JSONArray afterstrlist = new JSONArray();
			for (int i = 0; i < afterstr.length; i++) {
				afterstrlist.put(afterstr[i]);
			}

			jsonparam.put("asignalusers", afterstrlist);
		}
		// 鍓嶅姞绛�
		if (null != actionflag && Integer.parseInt(actionflag) == 6
				&& defaultaction.getIsbeforeaddassign().equals("N")) {
			beforesignpersonid = beforesigngetpersonids();
		}
		if (null != actionflag && actionflag.equals("6")
				&& beforesignpersonid.equals("")) {
			issendrequst1 = false;
			actioncontent = getString(R.string.beforeapprover);
		} else {
			issendrequst1 = true;
		}
		// beforesignpersonid = beforesigngetpersonids() == null ? ""
		// : beforesigngetpersonids();
		if (!beforesignpersonid.equals("")) {
			if (defaultaction.getIsbeforeaddassign().equals("Y")) {
				String[] beforestr = beforesignpersonid.split(",");
				JSONArray beforestrlist = new JSONArray();
				for (int i = 0; i < beforestr.length; i++) {
					beforestrlist.put(beforestr[i]);
				}
				jsonparam.put("bsignalusers", beforestrlist);
			} else {

				String[] beforestr = beforesignpersonid.split(",");
				JSONArray beforestrlist = new JSONArray();
				for (int i = 0; i < beforestr.length; i++) {
					beforestrlist.put(beforestr[i]);
				}
				jsonparam.put("usrids", beforestrlist);

			}

		}
		// 鎶勯�
		if (!copytopersonid.equals("")) {
			String[] copystr = copytopersonid.split(",");
			JSONArray copystrstrlist = new JSONArray();
			for (int i = 0; i < copystr.length; i++) {
				copystrstrlist.put(copystr[i]);
			}
			jsonparam.put("ccusers", copystrstrlist);
		}

		if (noactivityuserlist.size() > 0) {
			JSONArray userlist = new JSONArray();
			for (int i = 0; i < noactivityuserlist.size(); i++) {

				userlist.put(noactivityuserlist.get(i).getId());
			}
			jsonparam.put("userids", userlist);
		}
		if (null != actionflag && actionflag.equals("5")
				&& changeassignList.size() < 1) {
			issendrequst2 = false;
			actioncontent = actionname + getString(R.string.recipient);
		} else {
			issendrequst2 = true;
		}
		// cgg 修改
		// actioncontent = getString(R.string.recipient);}else{issendrequst2
		// =true;}
		if (changeassignList.size() > 0) {

			JSONArray userlist = new JSONArray();
			for (int i = 0; i < changeassignList.size(); i++) {

				userlist.put(changeassignList.get(i).getPsnId());
			}
			jsonparam.put("userids", userlist);
		}
		if (null != actionflag && actionflag.equals("4")
				&& rejectList.size() < 1) {
			issendrequst3 = false;
			actioncontent = getString(R.string.rejectperson);
		} else {
			issendrequst3 = true;
		}
		if (rejectList.size() > 0) {

			JSONArray userlist = new JSONArray();
			for (int i = 0; i < rejectList.size(); i++) {

				userlist.put(rejectList.get(i).getPsnId());
			}
			jsonparam.put("rejectmarks", userlist);
		}
		if (defaultaction.getIsassign().equals("Y")
				&& (null != defaultaction.getAssigntype()
						&& defaultaction.getAssigntype().equals("1") && addassignList
						.size() < 1)) {
			// TODO Auto-generated method stub
			issendrequst = false;
			actioncontent = getString(R.string.forwordperson);
		} else {
			issendrequst = true;
		}
		if (addassignList.size() > 0) {

			JSONArray userlist = new JSONArray();
			for (int i = 0; i < addassignList.size(); i++) {

				userlist.put(addassignList.get(i).getPsnId());
			}
			jsonparam.put("userids", userlist);
		}

		boolean ishaspersonofac = true;
		boolean ishasactivity = true;
		// 瀵硅薄LIST
		if (defaultaction.getIsassign().equals("Y")
				&& null != defaultaction.getAssigntype()
				&& defaultaction.getAssigntype().equals("2")
				&& signactivitylist.size() < 1) {
			issendrequst4 = false;
			actioncontent = getString(R.string.forwordactivity);
			ishasactivity = false;
		} else if (signactivitylist.size() > 0) {
			for (int i = 0; i < signactivitylist.size(); i++) {
				if (signactivitylist.get(i).getIsperson().equals("Y")) {
					if (null == userlistMap
							.get(signactivitylist.get(i).getId())
							|| userlistMap.get(signactivitylist.get(i).getId())
									.size() < 1) {

						ishaspersonofac = false;
						break;
					}
				}

			}
		}
		// else{
		// issendrequst4 =true;
		// }
		if (ishasactivity) {
			if (!ishaspersonofac) {
				issendrequst4 = false;
				actioncontent = getString(R.string.forwordpersonofactivity);
			} else {
				issendrequst4 = true;
			}
		}
		if (null != signactivitylist && signactivitylist.size() > 0) {
			JSONArray submitactivitylistarry = new JSONArray();
			for (int i = 0; i < signactivitylist.size(); i++) {

				JSONObject submitActivityObject = new JSONObject();

				submitActivityObject.put("activityid", signactivitylist.get(i)
						.getId());
				JSONArray userlistarry = new JSONArray();
				if (null != userlistMap.get(signactivitylist.get(i).getId())
						&& userlistMap.get(signactivitylist.get(i).getId())
								.size() > 0) {
					for (UserVO user : userlistMap.get(signactivitylist.get(i)
							.getId())) {
						userlistarry.put(user.getId());
					}
				}
				submitActivityObject.put("usrids", userlistarry);
				submitactivitylistarry.put(submitActivityObject);

			}
			jsonparam.put("activityids", submitactivitylistarry);
		}
		reqaction.add(jsonparam);
		mixparams.put("actiondes", reqaction);
		action.setMixparams(mixparams);

		action.setActiontype(V63ActionTypes.TASK_DOACTION);
		action.setIsmixparams(true);
		action.setServicecode(servicecode);
		params = new HashMap<String, String>();
		params.put("groupid", "");
		params.put("usrid", "");
		action.setParams(params);
		return action;
	}

	private void initStyle() {
		// TODO Auto-generated method stub
		progressDlg.show();
		getActionDefault(taskid, statuscode, statuskey, actioncode,
				new OnVORequestedListener() {
					@SuppressWarnings("rawtypes")
					@Override
					public void onVORequested(VOHttpResponse vo) {
						ResponseActionVO responseVO = VOProcessUtil
								.parseMessageVO(
										ComponentIds.A0A007,
										V63ActionTypes.TASK_GETDEFAULTVALUEOFACTION,
										vo.getmWAComponentInstancesVO());
						switch (responseVO.getFlag()) {
						case 0:
							try {
								defaultaction = new DefaultActionVO();
								for (ServiceCodeRes serviceCodeRes : responseVO
										.getServiceCodeList()) {
									ResDataVO resDataVO = serviceCodeRes
											.getResdata();
									if (resDataVO != null
											&& resDataVO.getList() != null
											&& resDataVO.getList().size() > 0) {
										Map object = (Map) resDataVO.getList()
												.get(0);

										if (null != object) {
											Map defaultactionmap = (Map) object
													.get("defaction");
											if (null != defaultactionmap) {
												// 鏄惁鎸囨淳(isassign)
												// 鎸囨淳鏄惁鍗曢�(isassignsigle)
												// 鎸囨淳绫诲瀷(assigntype)
												// 鏄惁鑳戒笂浼犻檮浠�isupload)
												// 鏄惁鑳藉墠鍔犵(isbassign)
												// 鏄惁鑳藉悗鍔犵(isaassign)
												// 鏄惁鑳芥妱閫�issend)
												// 渚跨鎺у埗(ishasmemo)
												// 渚跨鍐呭(memo)
												// 鎵规敞鎺у埗(ishasnote)
												defaultaction
														.setOpinion(defaultactionmap
																.get("opinion") == null ? ""
																: (String) defaultactionmap
																		.get("opinion"));
												defaultaction
														.setAssigntype((String) defaultactionmap
																.get("assigntype"));
												defaultaction
														.setIsassign((String) defaultactionmap
																.get("isassign"));
												defaultaction
														.setIssingleassign((String) defaultactionmap
																.get("isassignsigle"));
												defaultaction
														.setIsafteraddassign((String) defaultactionmap
																.get("isaassign"));
												defaultaction
														.setIsbeforeaddassign((String) defaultactionmap
																.get("isbassign"));
												defaultaction
														.setIsupload((String) defaultactionmap
																.get("isupload"));
												defaultaction
														.setIscansend((String) defaultactionmap
																.get("issend"));
												defaultaction
														.setText((String) defaultactionmap
																.get("memo"));
												defaultaction
														.setIshastext((String) defaultactionmap
																.get("ishasmemo"));
												defaultaction
														.setIshasnote((String) defaultactionmap
																.get("ishasnote"));
											}
										}

									}
								}
								init(defaultaction);
								progressDlg.dismiss();
							} catch (Exception e) {
								// TODO: handle exception
								// toastMsg("鏁版嵁瑙ｆ瀽鍑洪敊");
								progressDlg.dismiss();
							}
							break;
						default:
							toastMsg(responseVO.getDesc());
							progressDlg.dismiss();
							break;
						}

					}

					@Override
					public void onVORequestFailed(VOHttpResponse vo) {
						progressDlg.dismiss();
					}
				});
	}

	/**
	 * 鑾峰彇瀹℃壒鐨勫鎵瑰姩浣滈粯璁よ缃�
	 * 
	 * @param statusKey
	 * @param statusCode
	 */
	private void getActionDefault(String taskId, String statusCode,
			String statusKey, String actionCode, OnVORequestedListener listener) {

		List<WAActionVO> actions = new ArrayList<WAActionVO>();
		WAActionVO action = new WAActionVO();
		// 鑾峰彇action
		Map<String, String> params = new HashMap<String, String>();
		action = new WAActionVO();
		params = new HashMap<String, String>();
		params.put("groupid", "");
		params.put("usrid", "");
		params.put("statuskey", statusKey);
		params.put("statuscode", statusCode);
		params.put("taskid", taskId);
		params.put("actioncode", actionCode);
		action.setActiontype(V63ActionTypes.TASK_GETDEFAULTVALUEOFACTION);
		action.setParams(params);
		action.setServicecode(servicecode);
		actions.add(action);
		// 鍙戦�璇锋眰
		requestVO(CommonServers.getServerAddress(this)
				+ CommonServers.SERVER_SERVLET_WA,
				VOProcessUtil.createMessageRequestVO(this, ComponentIds.A0A007,
						actions), listener);

	}

	private void init(DefaultActionVO defaultaction) {
		this.defaultaction = defaultaction;
		isNCbefore = defaultaction.getIsbeforeaddassign().equals("N");
		initlistener(defaultaction);
		V63TaskScrollView scrollview = (V63TaskScrollView) findViewById(R.id.taskaction_content_panel);
		panelview = new WAPanelView(this);
		// 鎵规敞鎺у埗涓嶅彲濉細"0"
		// OA:[鍙～涓嶅繀椤�"1"]
		// [鍙～蹇呴』:"2"]
		// NC:[鍙～涓嶅繀椤�"3"]
		// [鍙～蹇呴』:"4"]
		// 瀹℃壒鎰忚
		isuploadfile = defaultaction.getIsupload().equals("Y");
		advicegroup = new WAGroupView(this);
		V63TaskActionRowStyle1 advicerow = null;
		View convertView = LayoutInflater.from(this).inflate(
				R.layout.v63_activity_advicepanel, null);
		advicetext = (AutoCompleteTextView) convertView
				.findViewById(R.id.advice_editText);
		// advicetext.setText(defaultaction.getOpinion());
		advicetextDefaultValue = defaultaction.getOpinion();
		// cgg 修改 取消默认审批意见
		advicetext.setText(advicetextDefaultValue);
		advicetext.setBackgroundResource(0);

		advicetext.setFilters(new InputFilter[] { new InputFilter.LengthFilter(
				100) });
		advicetext
				.setOnFocusChangeListener(new android.view.View.OnFocusChangeListener() {
					@Override
					public void onFocusChange(View v, boolean hasFocus) {
						if (hasFocus) {
							// 此处为得到焦点时的处理内容
							if(advicetext.getText().toString().trim().equals(advicetextDefaultValue)){
								advicetext.setText("");
							}
						} else {
							// 此处为失去焦点时的处理内容
							if(advicetext.getText().toString().trim().equals("")){
								advicetext.setText(advicetextDefaultValue);
							}
						}
					}
				});
		LinearLayout advicelayout = new LinearLayout(this);
		advicelayout.addView(convertView);
		adviceTextView = (TextView) convertView
				.findViewById(R.id.advice_textView);
		switch (Integer.parseInt(defaultaction.getIshasnote())) {
		case 0:
			break;
		case 1:
			advicerow = new V63TaskActionRowStyle1(this, true, taskid);
			advicerow.setValue(getString(R.string.approvalcomments),
					getNoteList, 4);
//			//cgg
//			advicerow.setVisibility(View.GONE);
			panelview.addView(advicerow);
			advicegroup.addRow(advicelayout);
			panelview.addGroup(advicegroup);
			break;
		case 2:
			advicerow = new V63TaskActionRowStyle1(this, true, taskid);
			advicerow.setValue(getString(R.string.approvalcomments),
					getNoteList, 4);
			//cgg
//			advicerow.setVisibility(View.GONE);
			panelview.addView(advicerow);
			advicegroup.addRow(advicelayout);
			panelview.addGroup(advicegroup);
			break;
		case 3:
			advicerow = new V63TaskActionRowStyle1(this, false, taskid);
			advicerow.setValue(getString(R.string.approvalcomments), null, 4);
			panelview.addView(advicerow);
			advicegroup.addRow(advicelayout);
			panelview.addGroup(advicegroup);
			break;
		case 4:
			advicerow = new V63TaskActionRowStyle1(this, false, taskid);
			advicerow.setValue(getString(R.string.approvalcomments), null, 4);
			//cgg
			advicerow.setVisibility(View.GONE);
			panelview.addView(advicerow);
			advicegroup.addRow(advicelayout);
			panelview.addGroup(advicegroup);
			break;
		default:
			break;

		}
		if (defaultaction.getIsassign().equals("Y")) {
			isassign = defaultaction.getIsassign().equals("Y");

			signpanelview = new WAPanelView(this);
			// 鎸囨淳
			signrow = new V63TaskActionRowStyle1(this, false, taskid);
			signrow.setValue(getString(R.string.assignto), getActivityList, 3);
			panelview.addView(signrow);
			signgroup = new WAGroupView(this);
			if (null != defaultaction.getAssigntype()
					&& defaultaction.getAssigntype().equals("1")) {
				addassignadapter = new AddPersonAdapter(this, addassignList);
				String hint = getString(R.string.selectreassigntarget);
				addassignText = new V63TaskBtnFieldView(this, addassignadapter,
						hint, signrow, defaultaction.getIssingleassign()
								.endsWith("Y"));
				signgroup.addRow(addassignText);
			} else {
				BtnFieldView signtext = new BtnFieldView(this, null);
				signtext.setLayoutParams(new LayoutParams(
						LayoutParams.FILL_PARENT, 101));
				// signtext.setHint("璇烽�鎷╂寚娲�);
				signgroup.addRow(signtext);
			}
			panelview.addGroup(signgroup);
			panelview.addView(signpanelview);
		}
		if (defaultaction.getIsupload().equals("Y")) {
			// 闄勪欢
			attachmentgroup = new WAGroupView(this);
			attachmentrow = new TaskRow4ValueIcon(this);
			attachmentrow.setValue(getString(R.string.attachment) + "(" + 0
					+ ")", "");
			attachmentrow.setOnClickListener(getAttachmentUploadList);
			attachmentgroup.addRow(attachmentrow);
			panelview.addGroup(attachmentgroup);
		}
		if (defaultaction.getIscansend().equals("Y")) {
			// 鎶勯�
			copygroup = new WAGroupView(this);
			copyrow = new TaskRow4ValueIcon(this);
			copyrow.setValue(getString(R.string.Cc) + "(" + 0 + ")", "");
			copyrow.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent i = new Intent();
					i.setClass(V63TaskActionDetail.this,
							V63TaskCopyToPersonActivity.class);
					i.putExtra("actionname", actionname);
					i.putExtra("actioncode", actioncode);
					i.putExtra("taskid", taskid);
					i.putExtra("statuscode", statuscode);
					i.putExtra("statuskey", statuskey);
					i.putExtra("servicecode", servicecode);
					i.putExtra("copyuserlist", copyuserlist);
					i.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
					startActivityForResult(i, RESULT_BACK);
				}
			});
			copygroup.addRow(copyrow);
			panelview.addGroup(copygroup);
		}
		if (null != actionflag
				&& defaultaction.getIsbeforeaddassign().equals("Y")
				&& (Integer.parseInt(actionflag) == 6)) {

			beforesigngroup = new WAGroupView(this);
			V63TaskActionRowStyle2 beforesignbtnrow = new V63TaskActionRowStyle2(
					this, true);
			isbeforeUserListFlag = true;
			beforesignbtnrow.setValue(getString(R.string.serial),
					getString(R.string.parallel));
			beforerow = new TaskRow4ValueIcon(this);
			beforerow.setValue(getString(R.string.beforesign) + "(" + 0 + ")",
					"");
			beforerow.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent i = new Intent();
					i.setClass(V63TaskActionDetail.this,
							V63TaskPersonDragListActivity.class);
					i.putExtra("actionname", actionname);
					i.putExtra("actioncode", actioncode);
					i.putExtra("taskid", taskid);
					i.putExtra("statuscode", statuscode);
					i.putExtra("statuskey", statuskey);
					i.putExtra("actionflag", actionflag);
					i.putExtra("servicecode", servicecode);
					i.putExtra("isbeforesign", "true");
					TaskUserVOList userlistvo = new TaskUserVOList();
					userlistvo.setUserlist(beforesignuserList);
					i.putExtra("userList", userlistvo);
					i.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
					startActivityForResult(i, RESULT_BACK);
				}
			});
			LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
					LayoutParams.FILL_PARENT, LayoutParams.WRAP_CONTENT);
			params.setMargins(WAPanelView.GROUP_MARGIN_LEFT,
					WAPanelView.GROUP_MARGIN_TOP,
					WAPanelView.GROUP_MARGIN_RIGHT, 0);
			beforesigngroup.setLayoutParams(params);
			beforesigngroup.addRow(beforerow);
			panelview.addGroup(beforesigngroup);
			LinearLayout.LayoutParams paramsign = new LinearLayout.LayoutParams(
					LayoutParams.MATCH_PARENT, DensityUtil.dip2px(this, 44));
			paramsign.setMargins(WAPanelView.GROUP_MARGIN_LEFT, 0,
					WAPanelView.GROUP_MARGIN_RIGHT,
					WAPanelView.GROUP_MARGIN_BOTTOM);
			beforesignbtnrow.setLayoutParams(paramsign);
			panelview.addView(beforesignbtnrow);

		} else {
			if (null != actionflag && Integer.parseInt(actionflag) == 6
					&& defaultaction.getIsbeforeaddassign().equals("N")) {

				beforesigngroup = new WAGroupView(this);
				V63TaskActionRowStyle1 beforesignrow = new V63TaskActionRowStyle1(
						this, false, taskid);
				beforesignrow.setValue(actionname, getUserlist, 3);
				beforehinttext = getString(R.string.selectbeforeassigers);
				panelview.addView(beforesignrow);
				beforesigngroup = new WAGroupView(this);

				WindowManager mWindowManager = (WindowManager) getApplicationContext()
						.getSystemService(WINDOW_SERVICE);
				DragBtnFieldView btnFieldView = new DragBtnFieldView(this, null);
				beforesignadapter = new DragBtnFieldViewAdapterForm(this,
						beforesignuserList, mWindowManager, btnFieldView,
						scrollview);
				beforesigntext = new V63TaskBtnFieldView(this,
						beforesignadapter, beforehinttext, btnFieldView, 1,
						beforesignrow, false);

				beforesigngroup.addRow(beforesigntext);
				panelview.addGroup(beforesigngroup);
			}
		}
		if (defaultaction.getIsafteraddassign().equals("Y")) {

			aftersigngroup = new WAGroupView(this);
			V63TaskActionRowStyle2 aftersignbtnrow = new V63TaskActionRowStyle2(
					this, false);
			isbeforeUserListFlag = false;
			aftersignbtnrow.setValue(getString(R.string.serial),
					getString(R.string.parallel));
			afterrow = new TaskRow4ValueIcon(this);
			afterrow.setValue(getString(R.string.aftersign) + "(" + 0 + ")", "");
			afterrow.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent i = new Intent();
					i.setClass(V63TaskActionDetail.this,
							V63TaskPersonDragListActivity.class);
					i.putExtra("actionname", actionname);
					i.putExtra("actioncode", actioncode);
					i.putExtra("taskid", taskid);
					i.putExtra("actionflag", actionflag);
					i.putExtra("statuscode", statuscode);
					i.putExtra("statuskey", statuskey);
					i.putExtra("servicecode", servicecode);
					i.putExtra("isbeforesign", "false");
					TaskUserVOList userlistvo = new TaskUserVOList();
					userlistvo.setUserlist(aftersignuserList);
					i.putExtra("userList", userlistvo);
					i.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
					startActivityForResult(i, RESULT_BACK);
				}
			});
			// 重新设置 为了加签与串并行一起
			LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
					LayoutParams.FILL_PARENT, LayoutParams.WRAP_CONTENT);
			params.setMargins(WAPanelView.GROUP_MARGIN_LEFT,
					WAPanelView.GROUP_MARGIN_TOP,
					WAPanelView.GROUP_MARGIN_RIGHT, 0);
			aftersigngroup.setLayoutParams(params);
			aftersigngroup.addRow(afterrow);
			panelview.addGroup(aftersigngroup);
			LinearLayout.LayoutParams paramsign = new LinearLayout.LayoutParams(
					LayoutParams.MATCH_PARENT, DensityUtil.dip2px(this, 44));
			paramsign.setMargins(WAPanelView.GROUP_MARGIN_LEFT, 0,
					WAPanelView.GROUP_MARGIN_RIGHT,
					WAPanelView.GROUP_MARGIN_BOTTOM);
			aftersignbtnrow.setLayoutParams(paramsign);
			panelview.addView(aftersignbtnrow);

		}
		if (defaultaction.getIshastext().equals("1")) {
			// 渚跨
			textgroup = new WAGroupView(this);
			TaskRow4ValueIcon textrow = new TaskRow4ValueIcon(this);
			textrow.setValue(getString(R.string.note), "");
			final String text = defaultaction.getText() == null ? ""
					: defaultaction.getText();
			textgroup.addRow(textrow);
			textrow.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent i = new Intent();
					i.setClass(V63TaskActionDetail.this,
							V63TaskTextContentActivity.class);
					i.putExtra("text", text);
					startActivity(i);
				}
			});
			panelview.addGroup(textgroup);
		}
		handleActionflagStyle();

		scrollview.addView(panelview);
		// scrollview.addView(signlist);
	}

	private void handleActionflagStyle() {
		// TODO Auto-generated method stub
		// 4 琛ㄧず椹冲洖 锛�
		// 5 琛ㄧず鏀规淳
		// 6 鍔犵
		if (null != actionflag) {
			if (actionflag.equals("4")) {
				rejectrow = new V63TaskActionRowStyle1(this, false, taskid);
				OnClickListener getRejectUserlist = new OnClickListener() {

					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub

						Intent i = new Intent();
						i.putExtra("actionname", actionname);
						i.putExtra("actioncode", actioncode);
						i.putExtra("taskid", taskid);
						i.putExtra("statuscode", statuscode);
						i.putExtra("statuskey", statuskey);
						i.putExtra("servicecode", servicecode);
						i.putExtra("actionflag", actionflag);

						i.putExtra("v63actionflag", "8");
						i.setClass(V63TaskActionDetail.this,
								V63ApprovalAddPersonActivity.class);
						startActivityForResult(i, RESULT_BACK);

					}
				};
				rejectrow.setValue(getString(R.string.rejectto),
						getRejectUserlist, 2);
				panelview.addView(rejectrow);
				rejectadapter = new AddPersonAdapter(this, rejectList);
				WAGroupView rejectgroup = new WAGroupView(this);
				String hint = getString(R.string.choice)
						+ getString(R.string.rejectperson);
				rejectText = new V63TaskBtnFieldView(this, rejectadapter, hint,
						rejectrow);
				rejectgroup.addRow(rejectText);
				panelview.addGroup(rejectgroup);
			} else if (actionflag.equals("5")) {
				changeassasignrow = new V63TaskActionRowStyle1(this, false,
						taskid);
				OnClickListener getRejectUserlist = new OnClickListener() {

					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub

						Intent i = new Intent();
						i.putExtra("actionname", actionname);
						i.putExtra("actioncode", actioncode);
						i.putExtra("taskid", taskid);
						i.putExtra("statuscode", statuscode);
						i.putExtra("statuskey", statuskey);
						i.putExtra("servicecode", servicecode);
						i.putExtra("actionflag", actionflag);

						i.putExtra("v63actionflag", "9");
						i.setClass(V63TaskActionDetail.this,
								V63ApprovalAddPersonActivity.class);
						startActivityForResult(i, RESULT_BACK);

					}
				};
				changeassasignrow.setValue(actionname + getString(R.string.to),
						getRejectUserlist, 2);
				panelview.addView(changeassasignrow);
				changeassignadapter = new AddPersonAdapter(this,
						changeassignList);
				WAGroupView changeassasigngroup = new WAGroupView(this);
				String hint = getString(R.string.selectreassigner) + actionname
						+ getString(R.string.recipient);
				changeassignText = new V63TaskBtnFieldView(this,
						changeassignadapter, hint, changeassasignrow);
				changeassasigngroup.addRow(changeassignText);
				panelview.addGroup(changeassasigngroup);

			}
		}
	}

	private void initlistener(DefaultActionVO defaultaction) {
		// 榛樿璇彞鑾峰彇鐩戝惉
		getNoteList = new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent();
				i.putExtra("actionname", actionname);
				i.putExtra("actioncode", actioncode);
				i.putExtra("taskid", taskid);
				i.putExtra("statuscode", statuscode);
				i.putExtra("statuskey", statuskey);
				i.putExtra("servicecode", servicecode);
				i.setClass(V63TaskActionDetail.this,
						V63TaskNoteListActivity.class);
				startActivityForResult(i, RESULT_BACK);
			}
		};
		if (null != defaultaction.getAssigntype()) {
			// 1涓轰汉锛�2涓烘椿鍔�
			issinglefromactivity = defaultaction.getIssingleassign();
			if (defaultaction.getAssigntype().equals("1")) {
				getActivityList = new OnClickListener() {
					// 鎸囨淳鍔ㄤ綔鐩戝惉
					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub

						Intent i = new Intent();
						i.putExtra("actionname", actionname);
						i.putExtra("actioncode", actioncode);
						i.putExtra("taskid", taskid);
						i.putExtra("statuscode", statuscode);
						i.putExtra("statuskey", statuskey);
						i.putExtra("servicecode", servicecode);
						i.putExtra("actionflag", actionflag);
						i.putExtra("v63actionflag", "10");
						i.setClass(V63TaskActionDetail.this,
								V63ApprovalAddPersonActivity.class);
						startActivityForResult(i, RESULT_BACK);

					}
				};
			} else {
				getActivityList = new OnClickListener() {
					@Override
					public void onClick(View v) {
						Intent i = new Intent();
						i.putExtra("actionname", actionname);
						i.putExtra("actioncode", actioncode);
						i.putExtra("taskid", taskid);
						i.putExtra("statuscode", statuscode);
						i.putExtra("statuskey", statuskey);
						i.putExtra("servicecode", servicecode);
						i.putExtra("issingle", issinglefromactivity);
						i.setClass(V63TaskActionDetail.this,
								V63TaskSignActivityListActivity.class);
						startActivityForResult(i, RESULT_BACK);
					}
				};
			}
		}
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
				if (Integer.parseInt(actionflag) == 6 && isNCbefore) {
					i.putExtra("v63actionflag", "11");
				} else if (isbeforeUserListFlag) {
					i.putExtra("v63actionflag", "3");
				} else {
					i.putExtra("v63actionflag", "4");
				}
				i.setClass(V63TaskActionDetail.this,
						V63ApprovalAddPersonActivity.class);
				startActivityForResult(i, RESULT_BACK);
			}
		};
		getAttachmentUploadList = new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent();
				i.putExtra("actionname", actionname);
				i.putExtra("actioncode", actioncode);
				i.putExtra("taskid", taskid);
				i.putExtra("statuscode", statuscode);
				i.putExtra("statuskey", statuskey);
				i.putExtra("servicecode", servicecode);
				i.putExtra("actionflag", actionflag);
				i.putExtra("attachmentlist", attachmentListVO);

				i.setClass(V63TaskActionDetail.this,
						WAAttahcmentUploadActivity.class);
				startActivityForResult(i, RESULT_BACK);
			}
		};
	}

	@SuppressWarnings("unchecked")
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		List<TaskUserVO> selectUserVo;
		int addNum = 0;
		switch (resultCode) {
		case RESULT_OK:
			int type = data.getIntExtra("type", 0);
			switch (type) {
			case 0:
				// advicetext.setText(""); 在原来的意见之后加 常用语
				advicetext.append((String) data.getStringExtra("note"));
				break;
			case 1:
				// signgroup.removeAllViews();
				ActivityListVO activitylist = (ActivityListVO) data
						.getSerializableExtra("activitylist");
				List<ActivityVO> activitylisttmp = activitylist
						.getActivitylist();
				for (ActivityVO activitytmp : activitylisttmp) {
					if (!isContainActivity(signactivitylist, activitytmp)) {
						final String activityid = activitytmp.getId();
						OnClickListener deletelistener = new OnClickListener() {

							@Override
							public void onClick(View v) {
								// TODO Auto-generated method stub
								for (int i = 0; i < signpanelview
										.getChildCount(); i++) {

									if (signpanelview.getChildAt(i) instanceof V63TaskActionRowStyle5) {
										V63TaskActionRowStyle5 row = (V63TaskActionRowStyle5) signpanelview
												.getChildAt(i);
										if (activityid.equals(row.getActivity()
												.getId())) {
											signpanelview.removeViewAt(i);
											signactivitylist = removeacitivty(
													activityid,
													signactivitylist);
											if (null != userlistMap
													.get(activityid)) {
												userlistMap.get(activityid)
														.clear();
											}
										}

									}
								}
							}

						};
						V63TaskActionRowStyle5 row = new V63TaskActionRowStyle5(
								this, activitytmp, actionname, actioncode,
								taskid, statuscode, statuskey, servicecode,
								deletelistener);
						V63TaskActionRowStyle5list.add(row);
						signpanelview.addView(row);
						signactivitylist.add(activitytmp);
					} else {
						new AlertDialog.Builder(V63TaskActionDetail.this)
								.setMessage(
										getString(R.string.existingselection))
								.setPositiveButton(getString(R.string.submit),
										null).show();
					}
				}
				if (signactivitylist.size() > 0) {
					signgroup.setVisibility(View.GONE);
				} else {
					signgroup.setVisibility(View.VISIBLE);
				}
				if (issinglefromactivity.equals("Y")
						&& V63TaskActionRowStyle5list.size() > 0) {
					signrow.setValue(getString(R.string.assignto), null, 3);
				} else {
					signrow.setValue(getString(R.string.assignto),
							getActivityList, 3);
				}
				break;
			case 2:
				// signgroup.removeAllViews();
				UsersOfActivityVO usersOfActivityVO = (UsersOfActivityVO) data
						.getSerializableExtra("usersOfActivityVO");
				ActivityVO activityVO = (ActivityVO) data
						.getSerializableExtra("activity");
				if (null != activityVO) {
					List<UserVO> userlist = usersOfActivityVO.getUserlist();
					List<UserVO> userlisttmp = userlistMap.get(activityVO
							.getId());
					for (UserVO user : userlist) {
						if (null == userlisttmp) {
							userlisttmp = new ArrayList<UserVO>();
							userlisttmp.add(user);
						} else {
							if (!isContainPerson(userlisttmp, user)) {
								userlisttmp.add(user);
							} else {
								new AlertDialog.Builder(
										V63TaskActionDetail.this)
										.setMessage(
												getString(R.string.existingselection))
										.setPositiveButton(
												getString(R.string.submit),
												null).show();
							}
						}
					}
					userlistMap.put(activityVO.getId(), userlisttmp);
					for (V63TaskActionRowStyle5 row : V63TaskActionRowStyle5list) {
						if (row.getActivity().getId()
								.equals(activityVO.getId())) {
							row.setAdapterData(userlistMap.get(activityVO
									.getId()));
						}
					}
				} else {
					UsersOfActivityVO usersOfActivityVO1 = (UsersOfActivityVO) data
							.getSerializableExtra("usersOfActivityVO");
					if (null != usersOfActivityVO1.getUserlist()) {
						noactivityuserlist = usersOfActivityVO1.getUserlist();
					}
				}
				break;
			case 3:
				TaskUserVOList beforetaskUserVOList = (TaskUserVOList) data
						.getSerializableExtra("userList");
				beforesignpersonid = data.getStringExtra("personids");
				beforesignuserList = beforetaskUserVOList.getUserlist();
				beforerow.setValue(getString(R.string.beforesign) + "("
						+ beforesignuserList.size() + ")", "");
				// TaskUserVO beforesignuserVO = (TaskUserVO) data
				// .getSerializableExtra("userVO");
				// beforesignpersonid = beforesigngetpersonids();
				// if (beforesignpersonid.contains(beforesignuserVO.getPsnId()))
				// {
				// new AlertDialog.Builder(V63TaskActionDetail.this)
				// .setMessage(getString(R.string.existingselection)).setPositiveButton(getString(R.string.submit),
				// null)
				// .show();
				// } else {
				// beforesignuserList.add(beforesignuserVO);
				// beforesignadapter.notifyDataSetChanged();
				// }
				break;
			case 4:
				TaskUserVOList aftertaskUserVOList = (TaskUserVOList) data
						.getSerializableExtra("userList");
				aftersignpersonid = data.getStringExtra("personids");
				aftersignuserList = aftertaskUserVOList.getUserlist();
				afterrow.setValue(getString(R.string.aftersign) + "("
						+ aftersignuserList.size() + ")", "");
				// TaskUserVO aftersignuserVO = (TaskUserVO) data
				// .getSerializableExtra("userVO");
				// aftersignpersonid = aftersigngetpersonids();
				// if (aftersignpersonid.contains(aftersignuserVO.getPsnId())) {
				// new AlertDialog.Builder(V63TaskActionDetail.this)
				// .setMessage(getString(R.string.existingselection)).setPositiveButton(getString(R.string.submit),
				// null)
				// .show();
				// } else {
				// aftersignuserList.add(aftersignuserVO);
				// aftersignadapter.notifyDataSetChanged();
				// }
				break;
			case 5:
				markpath = (String) data.getStringExtra("markpath");

				break;
			case 6:
				attachmentListVO = (UpLoadAttachmentListVO) data
						.getSerializableExtra("attachmentlist");
				if (attachmentListVO.getAttachmentlist().size() > 0)
					attachmentrow.setValue(
							getString(R.string.attachment)
									+ "("
									+ attachmentListVO.getAttachmentlist()
											.size() + ")", "");
				else {
					attachmentrow.setValue(getString(R.string.attachment)
							+ "(0)", "");
				}
				break;
			case 7:
				copytopersonid = data.getStringExtra("personid") == null ? ""
						: data.getStringExtra("personid");
				copyuserlist = (ArrayList<TaskUserVO>) data
						.getSerializableExtra("userlist");
				if (!copytopersonid.equals("")) {
					copyrow.setValue(getString(R.string.Cc) + "("
							+ copytopersonid.split(",").length + ")", "");
				} else {
					copyrow.setValue(getString(R.string.Cc) + "(" + 0 + ")", "");
				}
				break;
			case 8:
				// 4 琛ㄧず椹冲洖 锛�
				// 5 琛ㄧず鏀规淳
				// 6 鍔犵
				TaskUserVO rejectuserVO = (TaskUserVO) data
						.getSerializableExtra("userVO");
				rejectid = rejectgetpersonids();
				if (rejectid.contains(rejectuserVO.getPsnId())) {
					new AlertDialog.Builder(V63TaskActionDetail.this)
							.setMessage(getString(R.string.existingselection))
							.setPositiveButton(getString(R.string.submit), null)
							.show();
				} else {
					rejectList.add(rejectuserVO);
					rejectadapter.notifyDataSetChanged();
					// rejectrow.getAddBtn().setVisibility(View.GONE);
				}
				break;
			case 9:

				TaskUserVO changeassignuserVO = (TaskUserVO) data
						.getSerializableExtra("userVO");

				changeassignid = changeassigngetpersonids();
				if (changeassignid.contains(changeassignuserVO.getPsnId())) {
					new AlertDialog.Builder(V63TaskActionDetail.this)
							.setMessage(getString(R.string.existingselection))
							.setPositiveButton(getString(R.string.submit), null)
							.show();
				} else {
					changeassignList.add(changeassignuserVO);
					changeassignadapter.notifyDataSetChanged();
					// changeassasignrow.getAddBtn().setVisibility(View.VISIBLE);
				}

				break;
			case 10:
				selectUserVo = (List<TaskUserVO>) data
						.getSerializableExtra("selectUserVOList");
				addNum = 0;
				for (TaskUserVO userVO : selectUserVo) {
					addassignid = addassigngetpersonids();
					if (addassignid.contains(userVO.getPsnId())) {
						new AlertDialog.Builder(V63TaskActionDetail.this)
								.setMessage(
										getString(R.string.existingselection))
								.setPositiveButton(getString(R.string.submit),
										null).show();
					} else {
						addassignList.add(userVO);
						addNum++;
						// addassignadapter.notifyDataSetChanged();
					}
				}
				if (addNum != 0) {
					addassignadapter.notifyDataSetChanged();
				}
				break;
			case 11:
				selectUserVo = (List<TaskUserVO>) data
						.getSerializableExtra("selectUserVOList");
				addNum = 0;
				for (TaskUserVO userVO : selectUserVo) {

					if (beforesignpersonid.contains(userVO.getPsnId())) {
						new AlertDialog.Builder(V63TaskActionDetail.this)
								.setMessage(
										getString(R.string.existingselection))
								.setPositiveButton(getString(R.string.submit),
										null).show();
					} else {
						beforesignuserList.add(userVO);
						addNum++;
						// beforesignadapter.notifyDataSetChanged();
					}
					beforesignpersonid = beforesigngetpersonids();
				}
				if (addNum != 0) {
					beforesignadapter.notifyDataSetChanged();
				}
				break;
			default:
				break;
			}
			break;
		}
	}

	private boolean isContainPerson(List<UserVO> userlisttmp, UserVO user) {
		boolean iscontain = false;
		if (userlisttmp.size() > 0) {
			for (UserVO usertmp : userlisttmp) {
				if (usertmp.getId().equals(user.getId())) {
					iscontain = true;
				}
			}
		} else {
			iscontain = false;
		}
		return iscontain;

	}

	private boolean isContainActivity(List<ActivityVO> signactivitylist,
			ActivityVO activity) {
		boolean iscontain = false;
		if (signactivitylist.size() > 0) {
			for (ActivityVO activitytmp : signactivitylist) {
				if (activitytmp.getId().equals(activity.getId())) {
					iscontain = true;
				}
			}
		} else {
			iscontain = false;
		}
		return iscontain;

	}

	private List<ActivityVO> removeacitivty(String activityid,
			List<ActivityVO> signactivitylist) {
		// TODO Auto-generated method stub
		List<ActivityVO> signactivitylisttmp = new ArrayList<ActivityVO>();
		for (ActivityVO activity : signactivitylist) {
			if (!activity.getId().equals(activityid)) {
				signactivitylisttmp.add(activity);
			}
		}
		return signactivitylisttmp;

	}

	@SuppressWarnings("unchecked")
	private String beforesigngetpersonids() {
		StringBuffer psnids = new StringBuffer("");
		String personids = "";
		if (null != beforesignadapter) {
			List<TaskUserVO> TaskUserVOlist = (List<TaskUserVO>) beforesignadapter
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
		}
		return personids;
	}

	@SuppressWarnings("unchecked")
	private String changeassigngetpersonids() {
		StringBuffer psnids = new StringBuffer("");
		String personids = "";
		// addPersonAdapter.notifyDataSetChanged();
		List<TaskUserVO> TaskUserVOlist = (List<TaskUserVO>) changeassignadapter
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

	@SuppressWarnings("unchecked")
	private String rejectgetpersonids() {
		StringBuffer psnids = new StringBuffer("");
		String personids = "";
		// addPersonAdapter.notifyDataSetChanged();
		List<TaskUserVO> TaskUserVOlist = (List<TaskUserVO>) rejectadapter
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

	@SuppressWarnings("unchecked")
	private String addassigngetpersonids() {
		StringBuffer psnids = new StringBuffer("");
		String personids = "";
		// addPersonAdapter.notifyDataSetChanged();
		List<TaskUserVO> TaskUserVOlist = (List<TaskUserVO>) addassignadapter
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

	@SuppressWarnings("unchecked")
	private String aftersigngetpersonids() {
		StringBuffer psnids = new StringBuffer("");
		String personids = "";
		// addPersonAdapter.notifyDataSetChanged();
		if (aftersignadapter != null) {
			List<TaskUserVO> TaskUserVOlist = (List<TaskUserVO>) aftersignadapter
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
		}
		return personids;
	}

	/**
	 * 鍒犻櫎鍗曚釜鏂囦欢
	 * 
	 * @param sPath
	 *            琚垹闄ゆ枃浠剁殑鏂囦欢鍚�
	 * @return 鍗曚釜鏂囦欢鍒犻櫎鎴愬姛杩斿洖true锛屽惁鍒欒繑鍥瀎alse
	 */
	public boolean deleteFile(String sPath) {
		boolean flag = false;
		File file = new File(sPath);
		// 璺緞涓烘枃浠朵笖涓嶄负绌哄垯杩涜鍒犻櫎
		if (file.isFile() && file.exists()) {
			file.delete();
			flag = true;
		}
		return flag;
	}

	/**
	 * 鐗╃悊閿洃鍚�
	 */
	public boolean onKeyDown(int keyCode, KeyEvent event) { // 鐩戝惉鐗╃悊閿�
		if (keyCode == KeyEvent.KEYCODE_BACK) {
			// TODO Auto-generated method stub
			String toastmsg = getString(R.string.cancelaction);
			new AlertDialog.Builder(V63TaskActionDetail.this)
					.setMessage(toastmsg)
					.setPositiveButton(getString(R.string.submit),
							new DialogInterface.OnClickListener() {

								@Override
								public void onClick(DialogInterface dialog,
										int which) {
									// TODO Auto-generated method stub
									if (!markpath.equals("")) {
										byte[] filecontent;
										String content = "";
										try {
											filecontent = Base64.encodeBase64(ReadUtil
													.writeToXml(markpath));

											content = new String(filecontent);
											if (content != null
													&& !content.equals(""))
												deleteFile(markpath);
											markpath = "";
										} catch (Exception e) {
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
									}
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
		if (keyCode == KeyEvent.KEYCODE_MENU) {

			Intent i = new Intent();
			i.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP
					| Intent.FLAG_ACTIVITY_CLEAR_TOP);
			i.setClass(this, App.moduleList.get(0).getMainClazz());
			startActivity(i);
			// Toast.makeText(this, "Menu", Toast.LENGTH_SHORT).show();
			return false;
		}
		return super.onKeyDown(keyCode, event);
	}
}
