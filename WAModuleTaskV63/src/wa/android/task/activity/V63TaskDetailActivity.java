package wa.android.task.activity;
//文件详情
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import nc.vo.oa.component.common.AttachmentListVO;
import nc.vo.oa.component.common.AttachmentVO;
import nc.vo.oa.component.struct.ResDataVO;
import nc.vo.oa.component.struct.ServiceCodeRes;
import nc.vo.oa.component.struct.WAComponentInstancesVO;
import nc.vo.oa.component.taskcenter.TaskActionListVO;
import nc.vo.oa.component.taskcenter.TaskActionVO;
import nc.vo.oa.component.taskcenter.TaskBillVO;
import wa.android.common.App;
import wa.android.common.UMProgressDialog;
import wa.android.common.activity.BaseActivity;
import wa.android.common.networkold.VOHttpResponse;
import wa.android.common.utils.DensityUtil;
import wa.android.common.utils.PreferencesUtil;
import wa.android.common.vo.ResponseActionVO;
import wa.android.common.vo.VOProcessUtil;
import wa.android.common.vo.WAActionVO;
import wa.android.constants.CommonServers;
import wa.android.constants.CommonWAPreferences;
import wa.android.libs.clickFillScreen.FillScreenActivity;
import wa.android.libs.groupview.WAGroupView;
import wa.android.libs.groupview.WAPanelView;
import wa.android.libs.groupview.WARow4NameValue;
import wa.android.libs.row4itemview.WARow4Item;
import wa.android.task.constants.ActionTypes;
import wa.android.task.constants.ComponentIds;
import wa.android.task.view.TaskRow4ValueIcon;
import wa.android.task.vo.TaskDetailVO;
import wa.android.v63task.constants.V63ActionTypes;
import wa.android.v63task.data.InfoDetailHtmlVO;
import wa.android.v63task.data.InfoDetailPicVO;
import wa.android.v63task.data.MainBodyVO;
import wa.android.v63task.data.PicInfoVO;
import wa.android.v63task.data.ReminderContentVO;
import wa.android.v63task.util.IntentCacheHelper;
import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.app.NotificationManager;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;

import com.example.wamoduletaskv63.R;
import com.yonyou.protocol.NotifyAndMsg;
import com.yonyou.pushclient.ServiceOnlineReceiver;

@SuppressLint("HandlerLeak")
@SuppressWarnings("rawtypes")
public class V63TaskDetailActivity extends BaseActivity {
	protected static final int RESULTCODE = 1;
	protected MainBodyVO mainBodyVO = null;
	private final int MAX_ROW_COUNT = 2;
	private final int BODY_MAX_ROW_COUNT = 50;
	private boolean isRightAction = true;
	private String taskid;
	private String statuscode;
	private String statuskey;
	private String servicecode;
	private String priority;
	private String isreminder;
	private String firstactioncode = "", firstaction = "",
			firstactionflag = "";
	private String secondactioncode = "", secondaction = "",
			secondactionflag = "";
	private String thirdactioncode = "", thirdaction = "",
			thirdactionflag = "";
	private Map<String, String> actionBtnItems = new HashMap<String, String>();
	private Map<String, String> actionBtnItemsflag = new HashMap<String, String>();
	// private List<TaskAttachmentData> taskAttachmentList;
	private String attachmentcount;
	private ScrollView detailsScrollView;
	private UMProgressDialog progressDlg;
	private boolean isRightDetail = true;
	private List<String> moreactionlist = new ArrayList<String>();
	private int mainbodytype;
	private String hint = "";
	protected MainBodyListener mainBodyListener = new MainBodyListener();
	private NotificationManager nm;
	private SharedPreferences sp;
	private String user_name = "";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		initView();
		initData();

	}

	@SuppressLint("HandlerLeak")
	private final Handler handler = new Handler() {
		public void handleMessage(android.os.Message msg) {
			// switch (msg.what) {
			VOHttpResponse vo = null;
			isSessionTimeOut(vo);
			// }
		};
	};

	/**
	 * 初始化界面中的View
	 */
	private void initView() {
		// 初始化进度条加载
		((App) getApplication()).addGlobalVariable("isrefreshlist", "false");
		progressDlg = new UMProgressDialog(V63TaskDetailActivity.this);
		progressDlg.setProperty("value", "loading...");

	}

	/**
	 * 开始加载页面数据
	 */
	private void initData() {
		// 获取从上个activity传递的taskId，和上一层传递过来的VO
		Intent intent = getIntent();
		taskid = intent.getStringExtra("taskId");
		statuscode = intent.getStringExtra("statuscode");
		statuskey = intent.getStringExtra("statuskey");
		servicecode = intent.getStringExtra("servicecode");
		// 区分OA和NC单据
		priority = intent.getStringExtra("priority");
		isreminder = intent.getStringExtra("isreminder");
		// 判断是否接受push信息
		sp = this.getSharedPreferences("NOTIFICATION",
				V63TaskDetailActivity.MODE_PRIVATE);
		String receiverPush = sp.getString("pushisopen", "false");
		if (receiverPush != null && receiverPush.equals("true")) {
			NotifyAndMsg notifyAndMsg = ServiceOnlineReceiver
					.getNotifyById(taskid);
			if (notifyAndMsg != null) {
				nm = (NotificationManager) this
						.getSystemService(NOTIFICATION_SERVICE);
				int msgId = notifyAndMsg.getMsgDetailId();
				ServiceOnlineReceiver.removeListByString(taskid);
				ServiceOnlineReceiver.removeNotifyById(taskid);
				nm.cancel(msgId);

			}
		}
		progressDlg.show();
		// 发送获取审批详情请求
		getTaskActionAndTaskBill(taskid, statuscode, statuskey,
				new OnVORequestedListener() {
					@Override
					public void onVORequested(VOHttpResponse vo) {

						TaskBillVO taskBillVO = handletaskBill(vo);

						if (!isRightDetail) {
							progressDlg.dismiss();
							toastMsg(VOProcessUtil.parseMessageVO(
									ComponentIds.A0A007,
									ActionTypes.TASK_GETTASKBILL,
									vo.getmWAComponentInstancesVO()).getDesc());
							finish();
						} else {
							TaskActionListVO taskActionListVO = handletaskaction(vo);
							AttachmentListVO attachmentList = handleattachmentlist(vo);
							ReminderContentVO reminderContentVO = handleremind(vo);
							MainBodyVO mainBodyVO = handlemainbody(vo);
							if (null != taskActionListVO)
								hint = null != taskActionListVO.getHint() ? taskActionListVO
										.getHint() : "";
							if (!isRightAction) {
								if ((VOProcessUtil.parseMessageVO(
										ComponentIds.A0A007,
										ActionTypes.TASK_GETTASKACTION,
										vo.getmWAComponentInstancesVO())
										.getDesc() != null)
										&& (!VOProcessUtil
												.parseVO(
														ComponentIds.A0A007,
														ActionTypes.TASK_GETTASKACTION,
														vo.getmWAComponentInstancesVO())
												.getDesc().equals("")))
									toastMsg(VOProcessUtil.parseMessageVO(
											ComponentIds.A0A007,
											ActionTypes.TASK_GETTASKACTION,
											vo.getmWAComponentInstancesVO())
											.getDesc());
								TaskDetailVO detailVO = new TaskDetailVO(
										taskBillVO, attachmentList,
										taskActionListVO);
								updateView(detailVO, reminderContentVO,
										mainBodyVO);
								progressDlg.dismiss();
							} else {
								TaskDetailVO detailVO = new TaskDetailVO(
										taskBillVO, attachmentList,
										taskActionListVO);
								updateView(detailVO, reminderContentVO,
										mainBodyVO);
								progressDlg.dismiss();
							}
						}
					}

					@Override
					public void onVORequestFailed(VOHttpResponse vo) {
						progressDlg.dismiss();
					}

				});
	}

	/**
	 * 更新界面
	 * 
	 * @param data
	 */
	private void updateView(final TaskDetailVO data,
			final ReminderContentVO reminderContentVO,
			final MainBodyVO mainBodyVO) {
		final List<TaskActionVO> actionList = data.getActionList();
		if ((actionList != null && actionList.size() > 0
				&& null != actionList.get(0).getActflag() && !actionList.get(0)
				.getActflag().equals("99"))
				|| (actionList != null && actionList.size() > 0 && null == actionList
						.get(0).getActflag())) {
			setContentView(R.layout.v63_activity_task_detail);
			firstactionflag = actionList.get(0).getActflag();
			firstaction = actionList.get(0).getName();
			firstactioncode = actionList.get(0).getCode();
			if (actionList.size() < 2) {
				TextView actionbtn1 = (TextView) findViewById(R.id.bottom_btn1);
				TextView actionbtn2 = (TextView) findViewById(R.id.bottom_btn2);
				actionbtn1.setVisibility(View.INVISIBLE);
				actionbtn2.setVisibility(View.INVISIBLE);

				TextView actionbtn3 = (TextView) findViewById(R.id.bottom_btn3);
				actionbtn3.setText(firstaction);
				actionbtn3.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View v) {
						startActionDetailActivity(1, null, null, null);
					}

				});
			} else if (1 < actionList.size() && actionList.size() < 3
					&& !actionList.get(1).getActflag().equals("99")) {
				secondaction = actionList.get(1).getName();
				secondactioncode = actionList.get(1).getCode();
				secondactionflag = actionList.get(1).getActflag();
				TextView actionbtn1 = (TextView) findViewById(R.id.bottom_btn1);
				TextView actionbtn2 = (TextView) findViewById(R.id.bottom_btn2);

				TextView actionbtn3 = (TextView) findViewById(R.id.bottom_btn3);
				actionbtn3.setVisibility(View.INVISIBLE);
				TextView actionbtn4 = (TextView) findViewById(R.id.bottom_btn4);
				actionbtn4.setVisibility(View.INVISIBLE);
				actionbtn1.setText(firstaction);
				actionbtn2.setText(secondaction);
				actionbtn1.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View v) {
						startActionDetailActivity(1, null, null, null);
					}

				});
				actionbtn2.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View v) {
						startActionDetailActivity(2, null, null, null);
					}

				});
			} else if (2 < actionList.size() && actionList.size() < 4) {
				secondaction = actionList.get(1).getName();
				secondactioncode = actionList.get(1).getCode();
				secondactionflag = actionList.get(1).getActflag();
				// 第三个
				thirdaction = actionList.get(2).getName();
				thirdactioncode = actionList.get(2).getCode();
				thirdactionflag = actionList.get(2).getActflag();

				TextView actionbtn1 = (TextView) findViewById(R.id.bottom_btn1);
				TextView actionbtn2 = (TextView) findViewById(R.id.bottom_btn2);
				TextView actionbtn3 = (TextView) findViewById(R.id.bottom_btn3);

				actionbtn1.setGravity(Gravity.CENTER_VERTICAL | Gravity.LEFT);
				actionbtn1.setPadding(DensityUtil.dip2px(this, 30), 0, 0, 0);
				actionbtn2.setGravity(Gravity.CENTER_VERTICAL | Gravity.RIGHT);
				actionbtn2.setPadding(0, 0, DensityUtil.dip2px(this, 30), 0);
				// 站位
				/*
				 * TextView actionbtn4 = (TextView)
				 * findViewById(R.id.bottom_btn4);
				 * actionbtn4.setVisibility(View.VISIBLE);
				 */
				// actionbtn3.setGravity(Gravity.CENTER_VERTICAL|Gravity.LEFT);
				actionbtn1.setText(firstaction);
				// actionbtn2.setText(getString(R.string.more));
				actionbtn2.setText(thirdaction);
				actionbtn3.setText(secondaction);
				actionbtn1.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View v) {
						startActionDetailActivity(1, null, null, null);
					}

				});
				actionbtn3.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View v) {
						startActionDetailActivity(2, null, null, null);
					}

				});
				actionbtn2.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View v) {
						startActionDetailActivity(3, null, null, null);

					}
				});
			} else if (actionList.size() > 3) {
				secondaction = actionList.get(1).getName();
				secondactioncode = actionList.get(1).getCode();
				secondactionflag = actionList.get(1).getActflag();
				// 第三个
				thirdaction = actionList.get(2).getName();
				thirdactioncode = actionList.get(2).getCode();
				thirdactionflag = actionList.get(2).getActflag();
				for (int j = 3; j < actionList.size(); j++) {
					TaskActionVO item = actionList.get(j);
					if (!item.getActflag().equals("99")) {
						actionBtnItems.put(item.getName(), item.getCode());
						actionBtnItemsflag.put(item.getName(),
								item.getActflag());
						moreactionlist.add(item.getName());
					}
				}
				TextView actionbtn1 = (TextView) findViewById(R.id.bottom_btn1);
				TextView actionbtn2 = (TextView) findViewById(R.id.bottom_btn2);
				TextView actionbtn3 = (TextView) findViewById(R.id.bottom_btn3);
				TextView actionbtn4 = (TextView) findViewById(R.id.bottom_btn4);
				actionbtn4.setVisibility(View.VISIBLE);
				actionbtn1.setText(firstaction);
				actionbtn2.setText(getString(R.string.more));
				actionbtn4.setText(thirdaction);
				actionbtn3.setText(secondaction);
				actionbtn1.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View v) {
						startActionDetailActivity(1, null, null, null);
					}

				});
				actionbtn3.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View v) {
						startActionDetailActivity(2, null, null, null);
					}

				});
				actionbtn4.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View v) {
						startActionDetailActivity(3, null, null, null);

					}
				});
				actionbtn2.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View v) {
						// startActionDetailActivity(3);
						String[] actionstr = new String[moreactionlist.size()];
						for (int i = 0; i < moreactionlist.size(); i++) {
							actionstr[i] = moreactionlist.get(i);
						}
						// actionstr[moreactionlist.size()+1] =
						// getString(R.string.cancel);
						final AlertDialog.Builder dialog = new AlertDialog.Builder(
								V63TaskDetailActivity.this);
						dialog.setTitle(getString(R.string.more));
						dialog.setItems(actionstr,
								new DialogInterface.OnClickListener() {
									@Override
									public void onClick(DialogInterface arg0,
											int arg1) {
										if (moreactionlist.get(arg1) == null) {
											// dialog.dismiss();
										} else {
											startActionDetailActivity(
													4,
													moreactionlist.get(arg1),
													actionBtnItems
															.get(moreactionlist
																	.get(arg1)),
													actionBtnItemsflag
															.get(moreactionlist
																	.get(arg1)));
										}
									}
								}).setNegativeButton(R.string.cancel, null)
								.show();
					}

				});
			}
		} else {
			// LinearLayout detailbottom =
			// (LinearLayout)findViewById(R.id.task_detailbottom);
			// detailbottom.setVisibility(View.GONE);
			setContentView(R.layout.v63_activity_task_detail_nobottom);

		}
		detailsScrollView = (ScrollView) findViewById(R.id.taskDetail_content_panel);
		// 设置头部信息
		TextView titleTextView = (TextView) findViewById(R.id.titlePanel_titleTextView);
		titleTextView.setText(data.getTitle());
		// 头部返回按钮的设置
		Button backButton = (Button) findViewById(R.id.titlePanel_backBtn);
		backButton.setVisibility(View.VISIBLE);
		backButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				if (null != statuskey && "mypieces".equals(statuskey)
						&& null != statuscode && "unhandled".equals(statuscode)) {
					Intent intent = new Intent();
					setResult(RESULTCODE, intent);
				}
				finish();
			}
		});

		WAPanelView detailPanel = new WAPanelView(this);
		WAGroupView group = new WAGroupView(this);
		if (!hint.equals("")) {

			group.setTitle(getString(R.string.tips) + ":" + hint);
			detailPanel.addGroup(group);
			group = new WAGroupView(this);
		}

		// 填充头部信息
		for (String[] strs : data.getDetailItems()) {
			WARow4NameValue row = new WARow4NameValue(this);
			// 临时办法 处理周期会议的显示
			if (strs[0] != null && strs[0].equals("周期会议")) {
				if (strs[1] != null && strs[1].equals("Y")) {
					strs[1] = "是";
				} else if (strs[1] != null && strs[1].equals("N")) {
					strs[1] = "否";
				}
			}
			row.setValue(strs[0], strs[1]);
			// 添加长按事件
			row.setTag(strs[1]);
			row.setOnLongClickListener(new OnLongClickListener() {
				@Override
				public boolean onLongClick(View v) {
					WARow4NameValue r = (WARow4NameValue) v;
					// TODO
					Intent i = new Intent();
					i.setClass(V63TaskDetailActivity.this,
							FillScreenActivity.class);
					i.putExtra("checkText", r.getTag().toString());
					startActivity(i);
					return false;
				}
			});
			group.addRow(row);
		}

		if (null != reminderContentVO.getContent()
				&& !reminderContentVO.getContent().equals("")) {
			group.setTitle(getString(R.string.remind).replace("：", "") + " : "
					+ reminderContentVO.getContent());
		}
		detailPanel.addGroup(group);
		// 填充正文
		if (null != mainBodyVO && null != mainBodyVO.getId()
				&& !"".equals(mainBodyVO.getId())) {
			group = new WAGroupView(this);
			TaskRow4ValueIcon mainbodyrow = new TaskRow4ValueIcon(this);
			mainbodyrow.setValue(getString(R.string.body), "");
			mainbodyrow.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					getMainBodyDetail(mainBodyVO);
				}
			});
			group.addRow(mainbodyrow);
			detailPanel.addGroup(group);
		}
		// 填充审批历史
		group = new WAGroupView(this);
		TaskRow4ValueIcon historyrow = new TaskRow4ValueIcon(this);
		historyrow.setValue(getString(R.string.taskhistory), "");
		historyrow.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent();
				intent.putExtra("title", data.getTitle());
				intent.putExtra("statuscode", statuscode);
				intent.putExtra("statuskey", statuskey);
				intent.putExtra("servicecode", servicecode);
				intent.putExtra("taskid", taskid);
				intent.setClass(V63TaskDetailActivity.this,
						V63ApprovalHistoryActivity.class);
				startActivity(intent);
			}
		});
		group.addRow(historyrow);
		detailPanel.addGroup(group);
		// 填充附件行
		if (attachmentcount != null
				&& Integer.parseInt(attachmentcount.trim()) > 0) {
			final List<Map<String, String>> items = data.getAttachmentItems();
			group = new WAGroupView(this);
			TaskRow4ValueIcon attacumentlist = new TaskRow4ValueIcon(this);
			attacumentlist.setValue(getString(R.string.attachment) + "("
					+ attachmentcount + ")", "");
			attacumentlist.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent = new Intent(V63TaskDetailActivity.this,
							V63TaskAttachmentListActivity.class);
					intent.putExtra("childRow", (Serializable) items);
					intent.putExtra("count", attachmentcount);
					intent.putExtra("servicecode", servicecode);
					startActivity(intent);
				}
			});
			group.addRow(attacumentlist);
			detailPanel.addGroup(group);
		}
		// 填充行明细
		switch (data.getStyle()) {
		case 2:
			List<List<String[]>> bodyData = data.getBodyList();
			if (bodyData.size() <= MAX_ROW_COUNT) {
				group = new WAGroupView(this);
				// 和ios匹配不要总行数
				/*
				 * group.setTitle(getResources().getString(R.string.totalnum) +
				 * ":" + data.getRowCount());
				 */
				for (List<String[]> groupData : bodyData) {
					for (String[] rowData : groupData) {
						WARow4NameValue row = new WARow4NameValue(this);
						if (rowData[0] != null && rowData[0].equals("起算日期")) {
							if (rowData[1] != null
									&& !(rowData[1].trim().equals(""))) {
								rowData[1] = rowData[1].substring(0, 10);
							}
						}
						if (rowData[0] != null && rowData[0].equals("计划到期日")) {
							if (rowData[1] != null
									&& !(rowData[1].trim().equals(""))) {
								rowData[1] = rowData[1].substring(0, 10);
							}
						}
						row.setValue(rowData[0], rowData[1]);
						// 长按事件
						row.setTag(rowData[1]);
						row.setOnLongClickListener(new OnLongClickListener() {

							@Override
							public boolean onLongClick(View v) {
								WARow4NameValue r = (WARow4NameValue) v;
								Intent rowIntent = new Intent();
								rowIntent.setClass(V63TaskDetailActivity.this,
										FillScreenActivity.class);
								rowIntent.putExtra("checkText", r.getTag()
										.toString());
								startActivity(rowIntent);
								return false;
							}
						});
						group.addRow(row);
					}
					detailPanel.addGroup(group);
					group = new WAGroupView(this);
				}
			} else {
				group = new WAGroupView(this);
				List<String[]> bodyHeaderData = data.getBodyHeaderList();
				for (int i = 0; i < bodyHeaderData.size(); i++) {
					WARow4Item row = new WARow4Item(this);
					if ((!bodyHeaderData.get(i)[2].equals(""))
							|| (!bodyHeaderData.get(i)[3].equals(""))) {
						if (bodyHeaderData.get(i)[0].equals("")) {
							row.setValue((i + 1) + " "
									+ bodyHeaderData.get(i)[1], "",
									bodyHeaderData.get(i)[2],
									bodyHeaderData.get(i)[3]);
						} else if (bodyHeaderData.get(i)[1].equals("")) {
							row.setValue((i + 1) + " "
									+ bodyHeaderData.get(i)[0], "",
									bodyHeaderData.get(i)[2],
									bodyHeaderData.get(i)[3]);
						} else if (bodyHeaderData.get(i)[2].equals("")) {
							row.setValue((i + 1) + " "
									+ bodyHeaderData.get(i)[0], "",
									bodyHeaderData.get(i)[1],
									bodyHeaderData.get(i)[3]);
						} else if (bodyHeaderData.get(i)[3].equals("")) {
							row.setValue((i + 1) + " "
									+ bodyHeaderData.get(i)[0], "",
									bodyHeaderData.get(i)[1],
									bodyHeaderData.get(i)[2]);
						} else {
							row.setValue((i + 1) + " "
									+ bodyHeaderData.get(i)[0],
									bodyHeaderData.get(i)[1],
									bodyHeaderData.get(i)[2],
									bodyHeaderData.get(i)[3]);
						}
					} else {
						row.setSingleRowValue(
								(i + 1) + " " + bodyHeaderData.get(i)[0],
								bodyHeaderData.get(i)[1]);
					}

					final List<String[]> childRow = bodyData.get(i);
					row.setOnClickListener(new OnClickListener() {
						@Override
						public void onClick(View v) {
							Intent intent = new Intent(
									V63TaskDetailActivity.this,
									TaskChildDetailActivity.class);
							intent.putExtra("childRow", (Serializable) childRow);
							startActivity(intent);
						}
					});
					group.addRow(row);

				}
				if (Integer.parseInt(data.getRowCount().replace("(", "")
						.replace(")", "")) > BODY_MAX_ROW_COUNT) {
					TextView tiprow = new TextView(this);
					tiprow.setText(getString(R.string.tasklineover50));

					group.addRow(tiprow);
				}

				// tipsTextView.setVisibility(View.VISIBLE);
				group.setTitle(getResources().getString(R.string.totalnum)
						+ ":" + bodyData.size());
				detailPanel.addGroup(group);
			}
			break;

		default:
			break;
		}

		detailsScrollView.addView(detailPanel);

	}

	// 构造获取正文详情请求
	public void getMainBodyDetail(MainBodyVO mainBodyVO) {
		this.mainBodyVO = mainBodyVO;
		String infoid = mainBodyVO.getId();
		String type = mainBodyVO.getType();

		String sizetype = "";
		progressDlg.show();
		if (type.equals("1")) {
			// 详细信息为Word形式
			requestVO(
					CommonServers.getServerAddress(V63TaskDetailActivity.this)
							+ CommonServers.SERVER_SERVLET_WA,
					createMainBodyDetailAction(1, infoid, null),
					mainBodyListener);

		} else if (type.equals("2")) {
			// 详细信息为图片形式
			requestVO(
					CommonServers.getServerAddress(V63TaskDetailActivity.this)
							+ CommonServers.SERVER_SERVLET_WA,
					createMainBodyDetailAction(2, infoid, sizetype),
					mainBodyListener);
		} else if (type.equals("3")) {
			requestVO(
					CommonServers.getServerAddress(V63TaskDetailActivity.this)
							+ CommonServers.SERVER_SERVLET_WA,
					createMainBodyDetailAction(3, infoid, null),
					mainBodyListener);
		}
	}

	private WAComponentInstancesVO createMainBodyDetailAction(int type,
			String infoid, String sizetype) {
		List<WAActionVO> actions = new ArrayList<WAActionVO>();
		WAActionVO action = new WAActionVO();
		Map<String, String> params = new HashMap<String, String>();
		params.put("taskid", taskid);
		params.put("statuscode", statuscode);
		params.put("statuskey", statuskey);
		params.put("downflag", "0");
		params.put("groupid", "");
		params.put("usrid", "");
		params.put("id", infoid);

		action.setServicecode(servicecode);
		switch (type) {
		case 1:
			action.setParams(params);
			action.setActiontype(V63ActionTypes.TASK_GETHTMLCONTENT);
			break;
		case 2:
			WindowManager wm = (WindowManager) this
					.getSystemService(Context.WINDOW_SERVICE);
			if (wm.getDefaultDisplay().getWidth() > 640) {
				params.put("sizetype", "2");

			} else {
				params.put("sizetype", "1");
			}
			action.setParams(params);
			action.setActiontype(V63ActionTypes.TASK_GETPICCONTENT);
			break;
		case 3:
			action.setParams(params);
			action.setActiontype(V63ActionTypes.TASK_GETMAINBODYCONTENT);
			break;
		default:
			break;
		}
		actions.add(action);
		// TODO Auto-generated method stub
		return VOProcessUtil.createMessageRequestVO(this, ComponentIds.A0A007,
				actions);
	}

	private int getResourceByActionFlag(String firstactionname) {
		// 0 表示同意时需选指派，1 表示同意时不需要指派，
		// 2 表示不同意时需要指派，3表示不同意时不需要指派 ，
		// 4 表示驳回 ，5 表示改派
		// 6， 加签
		// 7,收回
		// 8，后加签
		// 99,doNothing
		if (firstactionname.equals("doAgree")) {
			return R.drawable.tool_ic_approval_agree;
		} else if (firstactionname.equals("doDisAgree")) {
			return R.drawable.tool_ic_approval_disagree;
		} else if (firstactionname.equals("doReject")) {
			return R.drawable.tool_ic_approval_reject;
		} else if (firstactionname.equals("doReassign")) {
			return R.drawable.tool_ic_approval_overhand;
		} else if (firstactionname.equals("doAddapprove")) {
			return R.drawable.tool_ic_approval_approve;
		} else if (firstactionname.equals("doBack")) {
			return R.drawable.tool_ic_approval_back;
		} else if (firstactionname.equals("doTerminal")) {
			return R.drawable.tool_ic_approval_stop;
		} else if (firstactionname.equals("doAfterRead")) {
			return R.drawable.tool_ic_approval_readafter;
		} else if (firstactionname.equals("doReaded")) {
			return R.drawable.tool_ic_approval_read;
		} else {
			return R.drawable.tool_ic_approval_default;
		}

	}

	/**
	 * 进入审批动作界面
	 * 
	 * @param taskActionVO
	 */
	@SuppressWarnings("unused")
	private void startApproveActivity(TaskActionVO taskActionVO) {
		Intent intent = new Intent();
		intent.setClass(V63TaskDetailActivity.this, ApprovalActivity.class);
		intent.putExtra("taskid", taskid);
		intent.putExtra("taskActionVO", taskActionVO);
		intent.putExtra("servicecode", servicecode);
		startActivity(intent);
	}

	/**
	 * 获取审批的审批动作列表、审批详情、附件列表
	 * 
	 * @param statusKey
	 * @param statusCode
	 */
	private void getTaskActionAndTaskBill(String taskId, String statusCode,
			String statusKey, OnVORequestedListener listener) {
		List<WAActionVO> actions = new ArrayList<WAActionVO>();
		WAActionVO action = new WAActionVO();
		// 获取action
		Map<String, String> params = new HashMap<String, String>();
		params.put("groupid", "");
		params.put("statuskey", statusKey);
		params.put("statuscode", statusCode);
		params.put("taskid", taskId);
		action.setActiontype(ActionTypes.TASK_GETTASKACTION);
		action.setParams(params);
		action.setServicecode(servicecode);
		actions.add(action);
		// 添加获取审批详情列表的action
		action = new WAActionVO();
		params = new HashMap<String, String>();
		params.put("groupid", "");
		params.put("usrid", "");
		params.put("statuskey", statusKey);
		params.put("statuscode", statusCode);
		params.put("taskid", taskId);
		action.setActiontype(ActionTypes.TASK_GETTASKBILL);
		action.setParams(params);
		action.setServicecode(servicecode);
		actions.add(action);
		// 获取任务附件的列表
		action = new WAActionVO();
		params = new HashMap<String, String>();
		params.put("groupid", "");
		params.put("usrid", "");
		params.put("statuskey", statusKey);
		params.put("statuscode", statusCode);
		params.put("taskid", taskId);
		action.setActiontype(V63ActionTypes.TASK_GETMESSAGEATTACHMENTLIST);
		action.setParams(params);
		action.setServicecode(servicecode);
		actions.add(action);
		// Mainbody
		action = new WAActionVO();
		params = new HashMap<String, String>();
		params.put("groupid", "");
		params.put("usrid", "");
		params.put("statuskey", statusKey);
		params.put("statuscode", statusCode);
		params.put("taskid", taskId);
		action.setActiontype(V63ActionTypes.TASK_GETMAINBODY);
		action.setParams(params);
		action.setServicecode(servicecode);
		if (priority != null && priority.equals("0") && isreminder != null
				&& isreminder.equals("N")) {
			actions.add(action);
		}
		// Content
		action = new WAActionVO();
		params = new HashMap<String, String>();
		params.put("groupid", "");
		params.put("usrid", "");
		params.put("statuskey", statusKey);
		params.put("statuscode", statusCode);
		params.put("taskid", taskId);
		action.setActiontype(V63ActionTypes.TASK_GETREMINDERCONTENT);
		action.setParams(params);
		action.setServicecode(servicecode);
		if (priority != null && priority.equals("0") && isreminder != null
				&& isreminder.equals("N")) {
			actions.add(action);
		}
		// 发送请求
		requestVO(CommonServers.getServerAddress(this)
				+ CommonServers.SERVER_SERVLET_WA,
				VOProcessUtil.createMessageRequestVO(this, ComponentIds.A0A007,
						actions), listener);

	}

	private TaskBillVO handletaskBill(VOHttpResponse vo) {
		// TODO Auto-generated method stub
		TaskBillVO taskBillVO = null;

		ResponseActionVO responseVO = VOProcessUtil.parseMessageVO(
				ComponentIds.A0A007, ActionTypes.TASK_GETTASKBILL,
				vo.getmWAComponentInstancesVO());

		switch (responseVO.getFlag()) {
		case 0:
			try {
				if (responseVO.getServiceCodeList() != null
						&& responseVO.getServiceCodeList().size() > 0)
					for (ServiceCodeRes serviceCodeRes : responseVO
							.getServiceCodeList()) {
						ResDataVO resDataVO = serviceCodeRes.getResdata();
						if (resDataVO != null && resDataVO.getList() != null
								&& resDataVO.getList().size() > 0) {
							taskBillVO = (TaskBillVO) resDataVO.getList()
									.get(0);
						}
					}
			} catch (Exception e) {
				// TODO: handle exception
			}
			break;
		case 1:
			isRightDetail = false;
			toastMsg(responseVO.getDesc());
			break;
		default:
			toastMsg(responseVO.getDesc());
			break;
		}
		return taskBillVO;
	}

	private TaskActionListVO handletaskaction(VOHttpResponse vo) {
		TaskActionListVO taskActionListVO = null;
		ResponseActionVO responseVO = VOProcessUtil.parseMessageVO(
				ComponentIds.A0A007, ActionTypes.TASK_GETTASKACTION,
				vo.getmWAComponentInstancesVO());

		switch (responseVO.getFlag()) {
		case 0:
			try {
				for (ServiceCodeRes serviceCodeRes : responseVO
						.getServiceCodeList()) {
					ResDataVO resDataVO = serviceCodeRes.getResdata();
					if (resDataVO != null && resDataVO.getList() != null
							&& resDataVO.getList().size() > 0) {
						taskActionListVO = (TaskActionListVO) resDataVO
								.getList().get(0);
					}
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
			break;
		case 1:

			isRightAction = false;
			toastMsg(responseVO.getDesc());
			break;
		default:
			toastMsg(responseVO.getDesc());
			break;
		}
		return taskActionListVO;
	}

	private MainBodyVO handlemainbody(VOHttpResponse vo) {
		MainBodyVO mainBodyVO = new MainBodyVO();
		ResponseActionVO responseVO = VOProcessUtil.parseMessageVO(
				ComponentIds.A0A007, V63ActionTypes.TASK_GETMAINBODY,
				vo.getmWAComponentInstancesVO());

		switch (responseVO.getFlag()) {
		case 0:
			try {
				for (ServiceCodeRes serviceCodeRes : responseVO
						.getServiceCodeList()) {
					ResDataVO resDataVO = serviceCodeRes.getResdata();
					if (resDataVO != null && resDataVO.getList() != null
							&& resDataVO.getList().size() > 0) {
						Map object = (Map) resDataVO.getList().get(0);

						if (null != object) {
							Map mainbody = (Map) object.get("mainbody");
							if (null != mainbody) {
								mainBodyVO.setDownflag((String) mainbody
										.get("downflag"));
								mainBodyVO.setSize((String) mainbody
										.get("filesize"));
								mainBodyVO.setId((String) mainbody
										.get("mainbodyid"));
								mainBodyVO.setType((String) mainbody
										.get("contenttype"));
								mainBodyVO.setName((String) mainbody
										.get("fillename"));
								mainbodytype = Integer.parseInt(mainBodyVO
										.getType());
							}
						}

					}
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
			break;
		case 1:
			isRightDetail = false;
			toastMsg(responseVO.getDesc());
			break;
		default:
			toastMsg(responseVO.getDesc());
			break;
		}
		return mainBodyVO;
	}

	private ReminderContentVO handleremind(VOHttpResponse vo) {
		ReminderContentVO reminderContentVO = new ReminderContentVO();
		ResponseActionVO responseVO = VOProcessUtil.parseMessageVO(
				ComponentIds.A0A007, V63ActionTypes.TASK_GETREMINDERCONTENT,
				vo.getmWAComponentInstancesVO());
		switch (responseVO.getFlag()) {
		case 0:
			try {
				for (ServiceCodeRes serviceCodeRes : responseVO
						.getServiceCodeList()) {
					ResDataVO resDataVO = serviceCodeRes.getResdata();
					if (resDataVO != null && resDataVO.getList() != null
							&& resDataVO.getList().size() > 0) {

						Map object = (Map) resDataVO.getList().get(0);

						if (null != object) {
							Map reminder = (Map) object.get("reminde");
							if (null != reminder) {
								reminderContentVO.setContent((String) reminder
										.get("content"));

							}
						}

					}
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
			break;
		case 1:
			isRightDetail = false;
			toastMsg(responseVO.getDesc());
			break;
		default:
			toastMsg(responseVO.getDesc());
			break;
		}
		return reminderContentVO;
	}

	private AttachmentListVO handleattachmentlist(VOHttpResponse vo) {
		// TODO Auto-generated method stub
		AttachmentListVO attachmentList61 = new AttachmentListVO();
		;
		ResponseActionVO responseVO = VOProcessUtil.parseMessageVO(
				ComponentIds.A0A007,
				V63ActionTypes.TASK_GETMESSAGEATTACHMENTLIST,
				vo.getmWAComponentInstancesVO());

		switch (responseVO.getFlag()) {
		case 0:
			try {
				for (ServiceCodeRes serviceCodeRes : responseVO
						.getServiceCodeList()) {
					ResDataVO resDataVO = serviceCodeRes.getResdata();
					if (resDataVO != null && resDataVO.getList() != null
							&& resDataVO.getList().size() > 0) {
						Map object = (Map) resDataVO.getList().get(0);

						if (null != object) {
							Map liststruct = (Map) object.get("attachmentlist");
							if (null != liststruct) {
								attachmentcount = (String) liststruct
										.get("count");
								@SuppressWarnings("unchecked")
								List<Map> listmap = (List<Map>) liststruct
										.get("attachment");
								if (null != listmap) {
									List<AttachmentVO> attachmentlist = new ArrayList<AttachmentVO>();
									Iterator<Map> iter = listmap.iterator();
									while (iter.hasNext()) {
										Map map = iter.next();
										AttachmentVO attachment61 = new AttachmentVO();
										attachment61.setFileid((String) map
												.get("fileid"));
										attachment61.setFiletype((String) map
												.get("filetype"));
										attachment61.setFilesize((String) map
												.get("filesize"));
										attachment61.setFilename((String) map
												.get("filename"));
										attachment61.setDownflag((String) map
												.get("downflag"));
										attachmentlist.add(attachment61);
									}
									attachmentList61
											.setAttachmentlist(attachmentlist);
								}
							}
						}

					}
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
			break;
		case 1:
			isRightDetail = false;
			toastMsg(responseVO.getDesc());
			break;
		default:
			toastMsg(responseVO.getDesc());
			break;
		}
		return attachmentList61;
	}

	private void startActionDetailActivity(int j, String action,
			String actioncode, String actionflag) {
		// TODO Auto-generated method stub
		Intent i = new Intent();
		switch (j) {
		case 1:

			i.putExtra("actionname", firstaction);
			i.putExtra("actioncode", firstactioncode);
			i.putExtra("actionflag", firstactionflag);
			i.putExtra("taskid", taskid);
			i.putExtra("statuscode", statuscode);
			i.putExtra("statuskey", statuskey);
			i.putExtra("servicecode", servicecode);
			i.setClass(this, V63TaskActionDetail.class);
			startActivityForResult(i, 1);
			break;
		case 2:

			i.putExtra("actionname", secondaction);
			i.putExtra("actioncode", secondactioncode);
			i.putExtra("actionflag", secondactionflag);
			i.putExtra("taskid", taskid);
			i.putExtra("statuscode", statuscode);
			i.putExtra("statuskey", statuskey);
			i.putExtra("servicecode", servicecode);
			i.setClass(this, V63TaskActionDetail.class);
			startActivityForResult(i, 1);
			break;
		case 3:

			i.putExtra("actionname", thirdaction);
			i.putExtra("actioncode", thirdactioncode);
			i.putExtra("actionflag", thirdactionflag);
			i.putExtra("taskid", taskid);
			i.putExtra("statuscode", statuscode);
			i.putExtra("statuskey", statuskey);
			i.putExtra("servicecode", servicecode);
			i.setClass(this, V63TaskActionDetail.class);
			startActivityForResult(i, 1);
			break;
		case 4:
			i.putExtra("actionname", action);
			i.putExtra("actioncode", actioncode);
			i.putExtra("actionflag", actionflag);
			i.putExtra("taskid", taskid);
			i.putExtra("statuscode", statuscode);
			i.putExtra("statuskey", statuskey);
			i.putExtra("servicecode", servicecode);
			i.setClass(this, V63TaskActionDetail.class);
			startActivityForResult(i, 1);
			break;
		default:
			break;
		}

	}

	class MainBodyListener implements OnVORequestedListener {

		@Override
		public void onVORequested(VOHttpResponse vo) {
			// TODO Auto-generated method stub
			switch (mainbodytype) {
			// html
			case 1:
				ResponseActionVO htmlresponseVO = VOProcessUtil.parseMessageVO(
						ComponentIds.A0A007,
						V63ActionTypes.TASK_GETHTMLCONTENT,
						vo.getmWAComponentInstancesVO());
				switch (htmlresponseVO.getFlag()) {
				case 0:
					try {
						InfoDetailHtmlVO htmInfoDetailVO = new InfoDetailHtmlVO();
						for (ServiceCodeRes serviceCodeRes : htmlresponseVO
								.getServiceCodeList()) {
							ResDataVO resDataVO = serviceCodeRes.getResdata();
							if (resDataVO != null
									&& resDataVO.getList() != null
									&& resDataVO.getList().size() > 0) {
								Map object = (Map) resDataVO.getList().get(0);
								if (null != object) {
									htmInfoDetailVO.loadVO(object);
								}
							}
						}
						// 解决打intent传输数据有大小的要求问题
						htmInfoDetailVO.setTaskid(taskid);
						IntentCacheHelper.getInstance(InfoDetailHtmlVO.class)
								.setObject(htmInfoDetailVO);
						Intent intent = new Intent();
						// intent.putExtra("infoid", mainBodyVO.getId());
						// intent.putExtra("htmlmainbody", htmInfoDetailVO);
						intent.setClass(V63TaskDetailActivity.this,
								V63TextMainBodyDetailActivity.class);
						startActivity(intent);

					} catch (Exception e) {
						// TODO: handle exception
						Log.i("异常信息", e.getMessage() + "+" + e.toString());
					}
					progressDlg.dismiss();
					break;
				default:
					progressDlg.dismiss();
					toastMsg(htmlresponseVO.getDesc());
					break;
				}
				break;
			// PICTURE
			case 2:
				ResponseActionVO picresponseVO = VOProcessUtil.parseMessageVO(
						ComponentIds.A0A007, V63ActionTypes.TASK_GETPICCONTENT,
						vo.getmWAComponentInstancesVO());
				switch (picresponseVO.getFlag()) {
				case 0:
					try {
						for (ServiceCodeRes serviceCodeRes : picresponseVO
								.getServiceCodeList()) {
							ResDataVO resDataVO = serviceCodeRes.getResdata();
							if (resDataVO != null
									&& resDataVO.getList() != null
									&& resDataVO.getList().size() > 0) {
								Map object = (Map) resDataVO.getList().get(0);
								if (null != object
										&& object.get("piccontent") != null) {

									Map picmainbodystruct = (Map) object
											.get("piccontent");
									InfoDetailPicVO infoDetailPicVO = new InfoDetailPicVO();
									List<PicInfoVO> picList = new ArrayList<PicInfoVO>();
									if (picmainbodystruct != null) {
										// infoDetailPicVO.setFirestpicdesc((String)
										// picmainbodystruct.get("firstpicdesc"));
										// infoDetailPicVO.setFirstpic((String)
										// picmainbodystruct.get("firstpic"));
										PicInfoVO firstPicInfoVO = new PicInfoVO();
										firstPicInfoVO
												.setInfoPicData((String) picmainbodystruct
														.get("firstpic"));
										firstPicInfoVO
												.setInfopicdesc((String) picmainbodystruct
														.get("firstpicdesc"));
										firstPicInfoVO
												.setTitle((String) picmainbodystruct
														.get("title"));
										picList.add(firstPicInfoVO);
										List<HashMap<String, String>> resPicListtmp = (List<HashMap<String, String>>) picmainbodystruct
												.get("restpic");
										if (resPicListtmp != null
												&& resPicListtmp.size() > 0) {
											for (HashMap<String, String> value : resPicListtmp) {
												PicInfoVO restPicInfoVO = new PicInfoVO();
												restPicInfoVO.infopicid = value
														.get("id");
												restPicInfoVO.infopicdesc = value
														.get("desc");
												picList.add(restPicInfoVO);
											}

										}
									}
									// 解决打intent传输数据有大小的要求问题
									infoDetailPicVO.setPicList(picList);
									infoDetailPicVO.setTaskid(taskid);
									IntentCacheHelper.getInstance(
											InfoDetailPicVO.class).setObject(
											infoDetailPicVO);
									Intent intent = new Intent();
									/*
									 * intent.putExtra("picmainbody",
									 * infoDetailPicVO);
									 */
									intent.setClass(V63TaskDetailActivity.this,
											V63PicMainBodyDetailActivity.class);
									startActivity(intent);
								}
							}
						}
					} catch (Exception e) {
						Log.d("exception", e.toString());
						// TODO: handle exception
					}
					progressDlg.dismiss();
					break;
				default:
					progressDlg.dismiss();
					toastMsg(picresponseVO.getDesc());
					break;
				}
				// 其他
			case 3:
				ResponseActionVO responseVO = VOProcessUtil.parseMessageVO(
						ComponentIds.A0A007,
						V63ActionTypes.TASK_GETMAINBODYCONTENT,
						vo.getmWAComponentInstancesVO());
				switch (responseVO.getFlag()) {
				case 0:
					try {
						if (responseVO.getServiceCodeList() != null)
							for (ServiceCodeRes serviceCodeRes : responseVO
									.getServiceCodeList()) {
								ResDataVO resDataVO = serviceCodeRes
										.getResdata();
								if (resDataVO != null
										&& resDataVO.getList() != null
										&& resDataVO.getList().size() > 0) {
									Map object = (Map) resDataVO.getList().get(
											0);

									// intent.putExtra("infotitle",
									// mainBodyVO.getInfotitle());
									// intent.putExtra("publishdate",
									// mainBodyVO.getPublishdate());
									// intent.putExtra("infostyle",
									// mainBodyVO.getInfostyletype());

									if (null != object) {
										Map maincontentstruct = (Map) object
												.get("maincontent");
										String content = " ";
										if (null != maincontentstruct
												&& !"".equals(maincontentstruct)) {

											content = (String) maincontentstruct
													.get("content");
										}
										if (null == content
												|| "".equals(content)) {
											toastMsg(getString(R.string.wronddata));
										} else {
											String filename = mainBodyVO
													.getName();
											String fileId = mainBodyVO.getId();
											Intent intent = new Intent();
											((App) getApplication())
													.addGlobalVariable(
															"wordcontent",
															content);
											// intent.putExtra("content",
											// content);
											intent.putExtra("filename",
													filename);
											intent.putExtra("fileId", fileId);

											intent.setClass(
													V63TaskDetailActivity.this,
													V63WordMainBodyDetailActivity.class);

											startActivity(intent);
										}
									}
								}
							}
					} catch (Exception e) {
						// TODO: handle exception
					}
					progressDlg.dismiss();
					break;
				default:
					progressDlg.dismiss();
					toastMsg(responseVO.getDesc());
					break;
				}
			default:
				break;
			}

		}

		@Override
		public void onVORequestFailed(VOHttpResponse vo) {
			progressDlg.dismiss();

		}

	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		// TODO Auto-generated method stub
		super.onActivityResult(requestCode, resultCode, data);
		if (requestCode == 1 && resultCode == 1) {
			finish();
		}
	}

}
