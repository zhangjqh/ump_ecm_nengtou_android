package wa.android.task.activity;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import nc.vo.oa.component.common.AttachmentDetailVO;
import nc.vo.oa.component.struct.ResDataVO;
import nc.vo.oa.component.struct.ServiceCodeRes;
import wa.android.common.UMProgressDialog;
import wa.android.common.activity.BaseActivity;
import wa.android.common.networkold.VOHttpResponse;
import wa.android.common.utils.PreferencesUtil;
import wa.android.common.vo.ResponseActionVO;
import wa.android.common.vo.VOProcessUtil;
import wa.android.common.vo.WAActionVO;
import wa.android.constants.CommonServers;
import wa.android.libs.groupview.OnAttachmentOpenedActions;
import wa.android.libs.groupview.WAGroupView;
import wa.android.libs.groupview.WAPanelView;
import wa.android.libs.groupview.WARowAttachment;
import wa.android.task.constants.ActionTypes;
import wa.android.task.constants.ComponentIds;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.DialerFilter;
import android.widget.ScrollView;
import android.widget.TextView;

import com.example.wamoduletaskv63.R;

public class V63TaskAttachmentListActivity extends BaseActivity {

	private String attachmentcount = "";
	private String servicecode = "";
	private UMProgressDialog progressDlg;

	@SuppressWarnings("unchecked")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_task_childdetail);
		initTitleView();
		List<Map<String, String>> items = (List<Map<String, String>>) getIntent()
				.getSerializableExtra("childRow");
		attachmentcount = (String) getIntent().getSerializableExtra("count");
		servicecode = (String) getIntent().getSerializableExtra("servicecode");
		progressDlg = new UMProgressDialog(V63TaskAttachmentListActivity.this);
		progressDlg.setProperty("value", "loading...");
		updateView(items);
	}

	private void updateView(List<Map<String, String>> items) {
		ScrollView detailScrollView = (ScrollView) findViewById(R.id.taskchilddetail_detailScrollView);
		WAPanelView detailPanel = new WAPanelView(this);

		WAGroupView group = new WAGroupView(this);
		// group.setTitle(getResources().getString(R.string.totalRowCount)
		// + ":" + attachmentcount);
		for (Map<String, String> item : items) {
			String filetypetmp = "";
			if ((item.get("filename") != null && !item.get("filename")
					.contains(".")) || (item.get("filename") == null)) {
				filetypetmp = "";
			} else {
				filetypetmp = item.get("filename").substring(
						item.get("filename").lastIndexOf(".") + 1,
						item.get("filename").length());
			}
			final String filetype = filetypetmp;
			final String filename = item.get("filename");
			final String fileId = item.get("fileid");
			final String filesize = item.get("filesize").replace("kb", "")
					.replace(" ", "").replace("KB", "").replace("b", "")
					.replace("B", "");
			WARowAttachment row = new WARowAttachment(this, filetype);
			row.setTitle(filename);
			String tempFileSize = item.get("filesize");
			if(Float.parseFloat(filesize)>1024){
				tempFileSize = new BigDecimal(Float.parseFloat(filesize)/1024).setScale(0, BigDecimal.ROUND_HALF_UP) + " MB";
			}
			row.setSize(tempFileSize);
			row.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View v) {
					try {
						String attsize = PreferencesUtil.readPreference(v.getContext(), "attsize_wangwbc");
						if(attsize.equals("")){
							attsize ="2048";
						}
						if ((Float.parseFloat(filesize) > Float.parseFloat(attsize))) {
							AlertDialog.Builder builder = new AlertDialog.Builder(
									V63TaskAttachmentListActivity.this);
							builder.setMessage(getString(R.string.atttopc))
							//builder.setMessage("该文件较大，请到PC端查看")
									.setPositiveButton(
											getString(R.string.submit),
											new DialogInterface.OnClickListener() {

												@Override
												public void onClick(
														DialogInterface arg0,
														int arg1) {
													showAttachment(
															filetype,
															filename,
															fileId);

												}
											}).setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() {
												
												@Override
												public void onClick(DialogInterface dialog, int which) {
													// TODO Auto-generated method stub
													
												}
											}).show();
						} else {
							showAttachment(filetype, filename, fileId);
						}
					} catch (Exception e) {

					}
				}
			});
			group.addRow(row);
		}
		if (Integer.parseInt(attachmentcount.trim()) > 50) {
			TextView tiprow = new TextView(this);
			tiprow.setText(getString(R.string.tasklineover50));

			group.addRow(tiprow);
		}
		detailPanel.addGroup(group);

		detailScrollView.addView(detailPanel);
	}

	/**
	 * 初始化导航界面
	 */
	private void initTitleView() {
		// 设置头部信息
		TextView titleTextView = (TextView) findViewById(R.id.titlePanel_titleTextView);
		titleTextView.setText(getString(R.string.attachment));
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

	private void handleAttachment(ResDataVO resDataVO, String filename,
			String filetype) {
		if (resDataVO != null
				&& resDataVO.getList() != null
				&& resDataVO.getList().size() > 0
				&& !((AttachmentDetailVO) resDataVO.getList().get(0))
						.getAttachmentcontent().equals("")) {
			AttachmentDetailVO attachmentDetailVO = (AttachmentDetailVO) resDataVO
					.getList().get(0);
			String attachment = attachmentDetailVO.getAttachmentcontent();
			byte[] data = android.util.Base64.decode(attachment,
					android.util.Base64.DEFAULT);
			boolean hasSD = Environment.getExternalStorageState().equals(
					android.os.Environment.MEDIA_MOUNTED);

			if (hasSD) {
				if (getSDFreeSize() > 1) {
					String sdPath = Environment.getExternalStorageDirectory()
							.getPath();
					File dirFile = new File(sdPath + File.separator + "com"
							+ File.separator + "yonyou");
					if (!dirFile.exists())
						dirFile.mkdirs();
					File file = new File(dirFile, filename);

					try {
						FileOutputStream fos = new FileOutputStream(file);
						fos.write(data, 0, data.length);
						fos.flush();
						fos.close();
						Intent intent = OnAttachmentOpenedActions
								.getAttachmentIntent(file, filetype);
						//判断是否 安装了打开应用的程序
						PackageManager pManager = this.getPackageManager();
						List list = pManager.queryIntentActivities(intent, PackageManager.GET_ACTIVITIES);
						if(list.size()>0){
							
							startActivity(OnAttachmentOpenedActions
									.getAttachmentIntent(file, filetype));
						}else{
							AlertDialog alertDialog = new AlertDialog.Builder(V63TaskAttachmentListActivity.this)
									.setMessage("没有找到打开该附件的应用").setPositiveButton("确定", new DialogInterface.OnClickListener() {
										
										@Override
										public void onClick(DialogInterface dialog, int which) {
											// TODO Auto-generated method stub
											
										}
									}).show();
							
						}

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
		}

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
				VOProcessUtil.createMessageRequestVO(this, ComponentIds.A0A007,
						actionVO), listener);
	}

	private void showAttachment(final String filetype, final String filename,
			final String fileId) {
		progressDlg.show();
		getAttachment(fileId, "1", String.valueOf(0),
				new OnVORequestedListener() {

					@Override
					public void onVORequested(VOHttpResponse vo) {
						// TODO Auto-generated method stub
						ResponseActionVO responseVO = VOProcessUtil
								.parseMessageVO(ComponentIds.A0A007,
										ActionTypes.TASK_GETATTACHMENT,
										vo.getmWAComponentInstancesVO());
						switch (responseVO.getFlag()) {
						case 0:
							for (ServiceCodeRes serviceCodeRes : responseVO
									.getServiceCodeList()) {
								ResDataVO resDataVO = serviceCodeRes
										.getResdata();
								handleAttachment(resDataVO, filename, filetype);
							}
							break;

						default:
							toastMsg(responseVO.getDesc());
							break;
						}
						progressDlg.dismiss();
					}

					@Override
					public void onVORequestFailed(VOHttpResponse vo) {
						AlertDialog dialog= new AlertDialog.Builder(V63TaskAttachmentListActivity.this)
						.setMessage("下载附件超时").setPositiveButton(R.string.submit, new DialogInterface.OnClickListener() {
							
							@Override
							public void onClick(DialogInterface dialog, int which) {
								dialog.dismiss();								
							}
						}).show();
						progressDlg.dismiss();
					}
				});
	}

}
