package wa.android.task.activity;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import nc.vo.oa.component.common.AttachmentDetailVO;
import nc.vo.oa.component.common.AttachmentListVO;
import nc.vo.oa.component.struct.ResDataVO;
import nc.vo.oa.component.struct.ServiceCodeRes;
import nc.vo.oa.component.taskcenter.TaskActionListVO;
import nc.vo.oa.component.taskcenter.TaskActionVO;
import nc.vo.oa.component.taskcenter.TaskBillVO;
import wa.android.app.task.R;
import wa.android.common.UMProgressDialog;
import wa.android.common.activity.BaseActivity;
import wa.android.common.vo.ResponseActionVO;
import wa.android.common.vo.VOProcessUtil;
import wa.android.common.vo.WAActionVO;
import wa.android.constants.CommonServers;
import wa.android.common.networkold.VOHttpResponse;
import wa.android.libs.groupview.OnAttachmentOpenedActions;
import wa.android.libs.groupview.WAGroupView;
import wa.android.libs.groupview.WAPanelView;
import wa.android.libs.groupview.WARow4NameValue;
import wa.android.libs.groupview.WARowAttachment;
import wa.android.libs.menuview.WAMenuView;
import wa.android.libs.menuview.WAMenuView.MenuOrientation;
import wa.android.libs.menuview.WAMenuView.OnTopBtnsClickListener;
import wa.android.libs.row4itemview.WARow4Item;
import wa.android.task.constants.ActionTypes;
import wa.android.task.constants.ComponentIds;
import wa.android.task.vo.TaskDetailVO;

import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.StatFs;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;

/**
 * 任务详情
 * 
 * @author candy
 */
public class TaskDetailActivity extends BaseActivity {
	private final int MAX_ROW_COUNT = 2;
	private final int BODY_MAX_ROW_COUNT = 50;

	private boolean isRightAction = true;
	private String taskid;
	private String statuscode;
	private String statuskey;
	private String servicecode;
	private boolean issessiontimeOut = false;
	private ScrollView detailsScrollView;
	private Button approvalHistoryBtn;
	private TextView taskTitle;
	private WAMenuView menuView;
	private boolean isRightDetail = true;
	private UMProgressDialog progressDlg;
	private String hint = "";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_task_detail);
		initView();
		initData();

	}

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
		progressDlg = new UMProgressDialog(TaskDetailActivity.this);
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
		progressDlg.show();
		// 发送获取审批详情请求
		getTaskActionAndTaskBill(taskid, statuscode, statuskey,
				new OnVORequestedListener() {
					@Override
					public void onVORequested(VOHttpResponse vo) {
						// 判断session过期的基础方法
						/*if (vo.getResponseHeaders().length > 0) {
							for (Header h : vo.getResponseHeaders()) {
								if ("Sessiontimout".equals(h.getName())) {
									issessiontimeOut = true;
								}
							}
						}*/
						if (issessiontimeOut) {
							handler.sendEmptyMessage(0);
						} else {
							// TODO Auto-generated method stub
							TaskBillVO taskBillVO = null;
							ResponseActionVO responseVO = VOProcessUtil
									.parseMessageVO(ComponentIds.A0A007,
											ActionTypes.TASK_GETTASKBILL,
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
											taskBillVO = (TaskBillVO) resDataVO
													.getList().get(0);
										}
									}
								} catch (Exception e) {
									// TODO: handle exception
								}
								break;
							case 1:
								isRightDetail = false;
								break;
							default:
								toastMsg(responseVO.getDesc());
								break;
							}

							AttachmentListVO attachmentList = null;
							responseVO = VOProcessUtil.parseMessageVO(
									ComponentIds.A0A007,
									ActionTypes.TASK_GETATTACHMENTLIST,
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
											attachmentList = (AttachmentListVO) resDataVO
													.getList().get(0);
										}
									}
								} catch (Exception e) {
									// TODO: handle exception
								}
								break;
							case 1:
								isRightDetail = false;
								break;
							default:
								toastMsg(responseVO.getDesc());
								break;
							}

							TaskActionListVO taskActionListVO = null;
							responseVO = VOProcessUtil.parseMessageVO(
									ComponentIds.A0A007,
									ActionTypes.TASK_GETTASKACTION,
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
								break;
							default:
								toastMsg(responseVO.getDesc());
								break;
							}
							if (!isRightDetail) {
								progressDlg.dismiss();
								toastMsg(VOProcessUtil.parseVO(
										ComponentIds.A0A007,
										ActionTypes.TASK_GETTASKBILL,
										vo.getmWAComponentInstancesVO())
										.getDesc());
								finish();
							} else if (isRightDetail && !isRightAction) {
								if ((VOProcessUtil.parseVO(
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
									toastMsg(VOProcessUtil.parseVO(
											ComponentIds.A0A007,
											ActionTypes.TASK_GETTASKACTION,
											vo.getmWAComponentInstancesVO())
											.getDesc());
								TaskDetailVO detailVO = new TaskDetailVO(
										taskBillVO, attachmentList,
										taskActionListVO);
								if(null!=taskActionListVO)
								hint = null!=taskActionListVO.getHint()?taskActionListVO.getHint():"";
								updateView(detailVO);
								progressDlg.dismiss();
							} else {
								TaskDetailVO detailVO = new TaskDetailVO(
										taskBillVO, attachmentList,
										taskActionListVO);
								if(null!=taskActionListVO)
								hint = null!=taskActionListVO.getHint()?taskActionListVO.getHint():"";
								updateView(detailVO);
								progressDlg.dismiss();
							}
						}
					}

					@Override
					public void onVORequestFailed(VOHttpResponse vo) {
						// TODO Auto-generated method stub
						progressDlg.dismiss();
					}

				});
	}

	/**
	 * 更新界面
	 * 
	 * @param data
	 */
	private void updateView(final TaskDetailVO data) {

		final List<TaskActionVO> actionList = data.getActionList();
		if (actionList != null && actionList.size() > 0) {
			menuView = new WAMenuView(this, MenuOrientation.RIGHT);
			String[] actionBtnItems = null;
			actionBtnItems = new String[actionList.size()];
			int i = 0;
			for (TaskActionVO item : actionList) {
				actionBtnItems[i] = item.getName();
				i++;
			}
			menuView.setTopBtns(actionBtnItems, new OnTopBtnsClickListener() {
				@Override
				public void onClick(View v, int which) {
					if (menuView.isShow()) {
						if (!actionList.get(which).getActflag().equals("99"))
							startApproveActivity(actionList.get(which));
					}

				}
			});
			menuView.setView(R.layout.activity_task_detail);
			setContentView(menuView);
			// 添加menu按钮
			final Button menuBtn = (Button) findViewById(R.id.titlePanel_rightBtn);
			menuBtn.setVisibility(View.VISIBLE);
			menuBtn.setBackgroundResource(R.drawable.task_menu);
			menuBtn.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					if (menuView.isShow()) {
						menuView.dismiss();
						menuBtn.setBackgroundResource(R.drawable.task_menu);

					} else {
						menuView.show();
						menuBtn.setBackgroundResource(R.drawable.task_menu_right_back);
					}
				}
			});
		}
		// 设置头部信息
		TextView titleTextView = (TextView) findViewById(R.id.titlePanel_titleTextView);
		titleTextView.setText(R.string.taskdetail);
		// 头部返回按钮的设置
		Button backButton = (Button) findViewById(R.id.titlePanel_backBtn);
		backButton.setVisibility(View.VISIBLE);
		backButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				finish();
			}
		});
		approvalHistoryBtn = (Button) findViewById(R.id.taskDetail_taskHistoryBtn);
		approvalHistoryBtn.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent();
				intent.putExtra("title", data.getTitle());
				intent.putExtra("statuscode", statuscode);
				intent.putExtra("statuskey", statuskey);
				intent.putExtra("servicecode", servicecode);
				intent.putExtra("taskid", taskid);
				intent.setClass(TaskDetailActivity.this,
						ApprovalHistoryActivity.class);
				startActivity(intent);
			}
		});

		// 填充审批详细信息
		taskTitle = (TextView) findViewById(R.id.taskDetail_taskTitleTextView);
		detailsScrollView = (ScrollView) findViewById(R.id.taskDetail_content_panel);
		taskTitle.setText(data.getTitle());

		WAPanelView detailPanel = new WAPanelView(this);
		WAGroupView group = new WAGroupView(this);
		if (!hint.equals("")) {
			
			group.setTitle(getString(R.string.tips) + ":"+hint);
			detailPanel.addGroup(group);
			group = new WAGroupView(this);
		}
	
		// 填充头部信息
		for (String[] strs : data.getDetailItems()) {
			WARow4NameValue row = new WARow4NameValue(this);
			row.setValue(strs[0], strs[1]);
			group.addRow(row);
		}
		detailPanel.addGroup(group);
		// 填充行明细
		switch (data.getStyle()) {
		case 2:
			List<List<String[]>> bodyData = data.getBodyList();
			if (bodyData.size() <= MAX_ROW_COUNT) {
				group = new WAGroupView(this);
				group.setTitle(getResources().getString(R.string.totalnum)
						+ ":" + data.getRowCount());
				for (List<String[]> groupData : bodyData) {
					for (String[] rowData : groupData) {
						WARow4NameValue row = new WARow4NameValue(this);
						row.setValue(rowData[0], rowData[1]);
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
						if (bodyHeaderData.get(i)[0].equals(""))
						{
							row.setValue((i + 1) + " " + bodyHeaderData.get(i)[1],
									"",
									bodyHeaderData.get(i)[2],
									bodyHeaderData.get(i)[3]);
						}else if(bodyHeaderData.get(i)[1].equals("")){
							row.setValue((i + 1) + " " + bodyHeaderData.get(i)[0],
									"",
									bodyHeaderData.get(i)[2],
									bodyHeaderData.get(i)[3]);	
						}else if(bodyHeaderData.get(i)[2].equals("")){
							row.setValue((i + 1) + " " + bodyHeaderData.get(i)[0],
									"",
									bodyHeaderData.get(i)[1],
									bodyHeaderData.get(i)[3]);
						}else if(bodyHeaderData.get(i)[3].equals("")){
							row.setValue((i + 1) + " " + bodyHeaderData.get(i)[0],
									"",
									bodyHeaderData.get(i)[1],
									bodyHeaderData.get(i)[2]);
						}else{
						row.setValue((i + 1) + " " + bodyHeaderData.get(i)[0],
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
							Intent intent = new Intent(TaskDetailActivity.this,
									TaskChildDetailActivity.class);
							intent.putExtra("childRow", (Serializable) childRow);
							startActivity(intent);
						}
					});
					group.addRow(row);

				}
				if (bodyHeaderData.size() > BODY_MAX_ROW_COUNT) {
					TextView tiprow = new TextView(this);
					tiprow.setText(getString(R.string.tasklineover50));

					group.addRow(tiprow);
				}

				// tipsTextView.setVisibility(View.VISIBLE);
				group.setTitle(getResources().getString(R.string.totalnum)
						+ ":" + data.getRowCount());
				detailPanel.addGroup(group);
			}
			break;

		default:
			break;
		}
		// 附件填充数据
		List<Map<String, String>> items = data.getAttachmentItems();
		if (items.size() > 0) {
			group = new WAGroupView(this);
			for (Map<String, String> item : items) {
				final String filetype = item.get("filetype");
				final String filename = item.get("filename");
				final String fileId = item.get("fileid");
				final String filesize = item.get("filesize").replace("kb", "")
						.replace(" ", "").replace("KB", "");
				WARowAttachment row = new WARowAttachment(this, filetype);
				row.setTitle(filename);
				row.setSize(item.get("filesize"));
				row.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View v) {

						if ((Integer.parseInt(filesize) > 500)) {
							toastMsg(getString(R.string.attachmentexceeds)+"500K，"+getString(R.string.lookinpc));
						} else {
							// TODO Auto-generated method stub
							progressDlg.show();
							getAttachment(fileId, "1", String.valueOf(0),
									new OnVORequestedListener() {

										@Override
										public void onVORequested(
												VOHttpResponse vo) {
											// TODO Auto-generated method stub
											ResponseActionVO responseVO = VOProcessUtil
													.parseMessageVO(
															ComponentIds.A0A007,
															ActionTypes.TASK_GETATTACHMENT,
															vo.getmWAComponentInstancesVO());
											switch (responseVO.getFlag()) {
											case 0:
												for (ServiceCodeRes serviceCodeRes : responseVO
														.getServiceCodeList()) {
													ResDataVO resDataVO = serviceCodeRes
															.getResdata();
													if (resDataVO != null
															&& resDataVO
																	.getList() != null
															&& resDataVO
																	.getList()
																	.size() > 0
															&& !((AttachmentDetailVO) resDataVO
																	.getList()
																	.get(0))
																	.getAttachmentcontent()
																	.equals("")) {
														AttachmentDetailVO attachmentDetailVO = (AttachmentDetailVO) resDataVO
																.getList().get(
																		0);
														String attachment = attachmentDetailVO
																.getAttachmentcontent();
														byte[] data = android.util.Base64
																.decode(attachment,
																		android.util.Base64.DEFAULT);
														// String str = String
														// .valueOf(data);
														// System.out.println(str);
														// if(filetype.equals("jpg")||filetype.equals("png")||filetype.equals("bmp"))
														// {
														// Intent intent = new
														// Intent(
														// TaskDetailActivity.this,
														// TaskAttachmentDetailActivity.class);
														// intent.putExtra(
														// "attachment",
														// attachmentDetailVO
														// .getAttachmentcontent());
														// intent.putExtra("filename",
														// filename);
														// startActivity(intent);
														// }
														// else{
														boolean hasSD = Environment
																.getExternalStorageState()
																.equals(android.os.Environment.MEDIA_MOUNTED);

														if (hasSD) {
															if (getSDFreeSize() > 1) {
																String sdPath = Environment
																		.getExternalStorageDirectory()
																		.getPath();
																File dirFile = new File(
																		sdPath
																				+ File.separator
																				+ "com"
																				+ File.separator
																				+ "yonyou");
																if (!dirFile
																		.exists())
																	dirFile.mkdirs();
																File file = new File(
																		dirFile,
																		filename
																// "temp."
																// + filetype
																// .toLowerCase()
																);

																try {
																	FileOutputStream fos = new FileOutputStream(
																			file);
																	fos.write(
																			data,
																			0,
																			data.length);
																	fos.flush();
																	fos.close();

																	startActivity(OnAttachmentOpenedActions
																			.getAttachmentIntent(
																					file,
																					filetype));
																} catch (FileNotFoundException e) {
																	e.printStackTrace();
																} catch (IOException e) {
																	e.printStackTrace();
																} catch (Exception e) {
																	toastMsg(getString(R.string.noapptoopen));
																}
															} else {
																toastMsg(getString(R.string.nosdcardspace));
															}
														} else {
															toastMsg(getString(R.string.nosdcard));
														}
														// }
													}
												}
												break;

											default:
												break;
											}
											progressDlg.dismiss();
										}

										@Override
										public void onVORequestFailed(
												VOHttpResponse vo) {
											// TODO Auto-generated method stub
											progressDlg.dismiss();
										}
									});
						}
					}
				});
				group.addRow(row);
			}
			detailPanel.addGroup(group);
		}

		detailsScrollView.addView(detailPanel);

	}

	private long getSDFreeSize() {
		File path = Environment.getExternalStorageDirectory();
		StatFs sf = new StatFs(path.getPath());
		// 获取单个数据块的大小(Byte)
		long blockSize = sf.getBlockSize();
		// 空闲的数据块的数量
		long freeBlocks = sf.getAvailableBlocks();
		// 返回SD卡空闲大小
		// return freeBlocks * blockSize; //单位Byte
		// return (freeBlocks * blockSize)/1024; //单位KB
		return (freeBlocks * blockSize) / 1024 / 1024; // 单位MB
	}

	/**
	 * 进入审批动作界面
	 * 
	 * @param taskActionVO
	 */
	private void startApproveActivity(TaskActionVO taskActionVO) {
		Intent intent = new Intent();
		intent.setClass(TaskDetailActivity.this, ApprovalActivity.class);
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
//		if (App.config.getAppversion().equals("0.7")) {
//			params.put(
//					"groupid",
//					this.readPreference(CommonWAPreferences.GROUP_ID) != null ? this
//							.readPreference(CommonWAPreferences.GROUP_ID) : "");
//		} else {
			params.put("groupid", "");
//		}
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
//		if (App.config.getAppversion().equals("0.7")) {
//			params.put(
//					"groupid",
//					this.readPreference(CommonWAPreferences.GROUP_ID) != null ? this
//							.readPreference(CommonWAPreferences.GROUP_ID) : "");
//		} else {
			params.put("groupid", "");
//		}
		params.put("usrid", "");
		params.put("statuskey", statusKey);
		params.put("statuscode", statusCode);
		params.put("taskid", taskId);
		action.setActiontype(ActionTypes.TASK_GETATTACHMENTLIST);
		action.setParams(params);
		action.setServicecode(servicecode);
		actions.add(action);
		// 发送请求
		requestVO(CommonServers.getServerAddress(this)
				+ CommonServers.SERVER_SERVLET_WA,
				VOProcessUtil.createMessageRequestVO(this, ComponentIds.A0A007, actions),
				listener);
	}

	/**
	 * 获取附件
	 * 
	 * @param fileId
	 * @param downflag
	 * @param listener
	 */
	private void getAttachment(String fileId, String downflag,
			String startPosition, OnVORequestedListener listener) {
		WAActionVO actionVO = new WAActionVO();
		actionVO.setServicecode(servicecode);
		Map<String, String> params = new HashMap<String, String>();

		params.put("groupid", "");

		params.put("usrid", "");
		params.put("fileid", fileId);
		params.put("downflag", downflag);
		params.put("startposition", startPosition);
		actionVO.setParams(params);
		actionVO.setActiontype(ActionTypes.TASK_GETATTACHMENT);

		requestVO(CommonServers.getServerAddress(this)
				+ CommonServers.SERVER_SERVLET_WA,
				VOProcessUtil.createMessageRequestVO(this, ComponentIds.A0A007, actionVO),
				listener);
	}

}
