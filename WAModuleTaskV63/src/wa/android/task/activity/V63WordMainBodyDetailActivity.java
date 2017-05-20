package wa.android.task.activity;
//正文
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import wa.android.common.App;
import wa.android.common.UMProgressDialog;
import wa.android.common.utils.PreferencesUtil;
import wa.android.constants.CommonWAPreferences;
import wa.android.libs.groupview.OnAttachmentOpenedActions;
import wa.android.libs.groupview.WAGroupView;
import wa.android.libs.groupview.WAPanelView;
import wa.android.libs.groupview.WARowAttachment;
import wa.android.oaas.OAASCompatActivity;
import android.app.DownloadManager;
import android.app.DownloadManager.Request;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.wamoduletaskv63.R;

public class V63WordMainBodyDetailActivity extends OAASCompatActivity {
	DownloadManager downloadManager;
	long myreference;
	private String filename = "", content = "", userName = "", fileId = "";
	private UMProgressDialog progressDlg;
	private String user_name = "";
	@SuppressWarnings("unchecked")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_task_childdetail);
		initTitleView();
		downloadManager = (DownloadManager) getSystemService(DOWNLOAD_SERVICE);
		filename = (String) getIntent().getStringExtra("filename");
		fileId = (String) getIntent().getStringExtra("fileId");
		content = (String) ((App) getApplication())
				.getGlobalVariables("wordcontent");
		((App) getApplication()).addGlobalVariable("wordcontent", "");
		// content = (String) getIntent().getStringExtra("content");
		progressDlg = new UMProgressDialog(V63WordMainBodyDetailActivity.this);
		progressDlg.setProperty("value", "loading...");
		updateView(filename, content);
		userName = PreferencesUtil.readPreference(this,
				CommonWAPreferences.USER_ID);

//		new Thread(runnable).start();//新起一个线程
	}
	
//	Handler handler = new Handler(){
//	    @Override
//	    public void handleMessage(Message msg) {
//	        super.handleMessage(msg);
//	        Bundle data = msg.getData();
//	        String val = data.getString("value");
//	        user_name = val;
////	        PreferencesUtil.writePreference(V63WordMainBodyDetailActivity.this,CommonWAPreferences.USER_NAME,user_name);
////	        Log.i("mylog","请求结果为-->" + val);
//	    }
//	};
//	
//	Runnable runnable = new Runnable(){
//	    @Override
//	    public void run() {
//	        //
//	        // TODO: http request.
//	        //
//	        Message msg = new Message();
//	        Bundle data = new Bundle();
//	        data.putString("value",getUserInfo());
//	        msg.setData(data);
//	        handler.sendMessage(msg);
//	    }
//	};
//
//	private String getUserInfo(){
////		cgg 向ma发起请求 获取当前登录的用户名
//		String server_ip = PreferencesUtil.readPreference(V63WordMainBodyDetailActivity.this,CommonWAPreferences.SERVER_IP);
//		String SERVER_PORT = PreferencesUtil.readPreference(V63WordMainBodyDetailActivity.this,CommonWAPreferences.SERVER_PORT);
//		String USER_NAME = PreferencesUtil.readPreference(V63WordMainBodyDetailActivity.this,CommonWAPreferences.USER_NAME);
//		String url = "http://"+server_ip+":"+SERVER_PORT+"/mobsm/img/getMaUn.jsp?id="+USER_NAME;
//		BufferedReader in = null;
//		String result = "";
//		try {
//				
//		            URL realUrl = new URL(url);
//		            // 打开和URL之间的连接
//		            URLConnection connection = realUrl.openConnection();
//		            // 设置通用的请求属性
//		            connection.setRequestProperty("accept", "*/*");
//		            connection.setRequestProperty("connection", "Keep-Alive");
//		            connection.setRequestProperty("user-agent",
//		                    "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
//		            // 建立实际的连接
//		            connection.connect();
//		            // 获取所有响应头字段
//		            Map<String, List<String>> map = connection.getHeaderFields();
//		            // 定义 BufferedReader输入流来读取URL的响应
//		            in = new BufferedReader(new InputStreamReader(
//		                    connection.getInputStream()));
//		            String line;
//		            while ((line = in.readLine()) != null) {
//		                result += line;
//		            }
//		            
////		            PreferencesUtil.writePreference(this, "nt_user_name", result);
//		        } catch (Exception e) {
//		            System.out.println("发送GET请求出现异常！" + e);
//		            e.printStackTrace();
//		        }
//		        // 使用finally块来关闭输入流
//		        finally {
//		            try {
//		                if (in != null) {
//		                    in.close();
//		                }
//		            } catch (Exception e2) {
//		                e2.printStackTrace();
//		            }
//		        }
//		return result;
//	}
	
	private void openDoc(String name,String content,String filetype) {
		ScrollView detailScrollView = (ScrollView) findViewById(R.id.taskchilddetail_detailScrollView);
		WAPanelView detailPanel = new WAPanelView(this);

		WAGroupView group = new WAGroupView(this);
		final byte[] data = android.util.Base64
				.decode(content,
						android.util.Base64.DEFAULT);
			final String filename = name;
			final String filesize = data.length/1024+"KB";
			WARowAttachment row = new WARowAttachment(this, filetype);
			row.setTitle(filename);
			row.setSize(filesize);
			row.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View v) {
					handleAttachment(data,filename,".doc");
				}
			});
			group.addRow(row);

		detailPanel.addGroup(group);
	
		detailScrollView.addView(detailPanel);
	}

	private void updateView(String name, String content) {
		String filetype = "";
		if(name != null && name.contains(".")) {
			filetype = name.substring(name.lastIndexOf("."),name.length());
		}
		
		if(!filetype.toLowerCase().contains("doc")){
			openDoc(name,content,filetype);
			return;
		}
		
		ScrollView detailScrollView = (ScrollView) findViewById(R.id.taskchilddetail_detailScrollView);
		WAPanelView detailPanel = new WAPanelView(this);

		WAGroupView group = new WAGroupView(this);
		final byte[] data = android.util.Base64.decode(content,
				android.util.Base64.DEFAULT);
		final String filename = name;
		final String _fileId = this.fileId;
		final String _userName = this.userName;
		final String test = PreferencesUtil.readPreference(this,
				CommonWAPreferences.USER_NAME)
				+ PreferencesUtil.readPreference(this,
						CommonWAPreferences.SERVER_IP)
				+ PreferencesUtil.readPreference(this,
						CommonWAPreferences.SERVER_PORT);
		
		final String adressIp_x =  PreferencesUtil.readPreference(this,
						CommonWAPreferences.SERVER_IP)
				+ PreferencesUtil.readPreference(this,
						CommonWAPreferences.SERVER_PORT);
		final String userName_x = PreferencesUtil.readPreference(this,CommonWAPreferences.USER_NAME);//用户账号，登陆账号
		final String serverIp_x = PreferencesUtil.readPreference(this,CommonWAPreferences.SERVER_IP);
		final String serverPort_x = PreferencesUtil.readPreference(this,CommonWAPreferences.SERVER_PORT);
//		final String nt_user_name = PreferencesUtil.readPreference(this,CommonWAPreferences.nt_user_name);
		
//		Toast.makeText(V63WordMainBodyDetailActivity.this, 
//				"USER_ID:"+PreferencesUtil.readPreference(this,CommonWAPreferences.USER_ID)
//				+"\nNAME_COMMON:"+PreferencesUtil.readPreference(this,CommonWAPreferences. NAME_COMMON)
//				+"\nUSER_NAME:"+PreferencesUtil.readPreference(this,CommonWAPreferences. USER_NAME)
//				+"\nUSER_PASS:"+PreferencesUtil.readPreference(this,CommonWAPreferences.USER_PASS)
//				+"\nGROUP_NAME:"+PreferencesUtil.readPreference(this,CommonWAPreferences.GROUP_NAME)
//				,Toast.LENGTH_LONG).show();
		
		
		
//		DBDaoImpl dao = new DBDaoImpl(null);
//		String[] params = new String[]{};
//		String string= "";
////		dao.queryList("select name from orgz-orgs ", params);
//		dao.queryList(userName_x, params);
//		for (int i = 0; i < params.length; i++) {
//			string += params[i];
//			
//		}
//		Toast.makeText(V63WordMainBodyDetailActivity.this,"查询结果"+	string	,Toast.LENGTH_LONG).show();
//		
//		
//		InfoDao dd = new InfoDao(this);
//		final String serverPort_x = PreferencesUtil.readPreference(this,CommonWAPreferences.USER_ID);
//		final String serverPort_x = PreferencesUtil.readPreference(this,CommonWAPreferences.USER_NAME);
//		final String serverPort_x = PreferencesUtil.readPreference(this,CommonWAPreferences.USER_PASS);
//		final String serverPort_x = PreferencesUtil.readPreference(this,CommonWAPreferences.GROUP_NAME);
		
		
		
		final String filesize = data.length / 1024 + "KB";
		
		
		WARowAttachment row = new WARowAttachment(this, filetype);
		row.setTitle(filename);
		row.setSize(filesize);
		row.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Bundle bundle = new Bundle();
				Intent intent = new Intent(Intent.ACTION_MAIN);
				String ecmToolPakge = "com.ntko.office.sample";
				String ecmToolActivity = "com.ntko.office.sample.OpenWithProgressActivity";
				// String ecmToolPakge = "com.example.ecmToolApp";
				// String ecmToolActivity =
				// "com.example.ecmToolApp.MainActivity";
//				getUserInfo();
				String fileUrl0 = "http://www.ntko.com:1986/mobileoffice/servlet/DownloadServlet?filename=20160617165211.doc";
				String uploadURL0 = "http://www.ntko.com:1986/mobileoffice/servlet/UploadServlet?filename=20160617165211.doc&filetype=doc";
				
				String fileUrl ="http://"+serverIp_x+":"+serverPort_x+"/mobsm/img/maDownFile.jsp?id="+_fileId;//下载网址
//				String fileUrl =   "http://10.0.0.39:80/portal/downFile.jsp?id="+ _fileId;
				String uploadURL ="http://"+serverIp_x+":"+serverPort_x+"/mobsm/img/maSaveFile.jsp?id="+_fileId;//上传网址
//				String uploadURL = "http://10.0.0.39:80/portal/saveFile.jsp?id="+ _fileId;
				
				File file = new File(getCommonPath()+"/mydown.doc");// 这里更改为你的名称
				if (file.exists()) {
					file.delete();
				}
				// 生成網絡下載請求
				DownloadManager.Request request = new Request(Uri.parse(fileUrl));
				// 設置下載完成后,存儲的路徑
//				Environment.getExternalStoragePublicDirectory("fileDown").mkdir();

				// request.setDestinationInExternalPublicDir("/storage/sdcard0/download",
				// fileName);
				request.setDestinationInExternalPublicDir(
						"/test/", "mydown.doc");
				//显示下载状态和完成后提示
//				request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE
//						| DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
				// 开始下载请求

				myreference = downloadManager.enqueue(request);
				
				IntentFilter filter = new IntentFilter(
						DownloadManager.ACTION_DOWNLOAD_COMPLETE);

				BroadcastReceiver receiver = new BroadcastReceiver() {
					@Override
					public void onReceive(Context context, Intent intent) {
						long reference = intent.getLongExtra(
								DownloadManager.EXTRA_DOWNLOAD_ID, -1);
						if (myreference == reference) {
							

							try {
								startActivity(getWordFileIntent(getCommonPath()+"/mydown.doc"));
							} catch (Exception e) {
								Toast.makeText(V63WordMainBodyDetailActivity.this, "打开失败,请安装Office",
										Toast.LENGTH_SHORT).show();
							}
						}
					}

				};
				registerReceiver(receiver, filter);
				
				
			}
		});
		group.addRow(row);
		detailPanel.addGroup(group);
		detailScrollView.addView(detailPanel);
	}
	//使用本地的应用打开文件
	public static Intent getWordFileIntent(String param) {
		Intent intent = null;
		try {
			intent = new Intent("android.intent.action.VIEW");
			intent.addCategory("android.intent.category.DEFAULT");
			intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
			Uri uri = Uri.fromFile(new File(param));
			intent.setDataAndType(uri, "application/msword");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return intent;
	}
	//获取文件路径
	public static String getCommonPath() {
		// 有sd卡
		if (Environment.MEDIA_MOUNTED.equals(Environment
				.getExternalStorageState())) {
			// 创建一个文件夹对象，赋值为外部存储器的目录
			File sdcardDir = Environment.getExternalStorageDirectory();
			// 得到一个路径，内容是sdcard的文件夹路径和名字
			String path = sdcardDir.getPath() + "/" + "test";
			File path1 = new File(path);
			if (!path1.exists())
				// 若不存在，创建目录，可以在应用启动的时候创建
				path1.mkdirs();

			return path;
		} else {
			// 无SD卡
			return "";
		}

	}

	/**
	 * 初始化导航界面
	 */
	private void initTitleView() {
		// 设置头部信息
		TextView titleTextView = (TextView) findViewById(R.id.titlePanel_titleTextView);
		titleTextView.setText(getString(R.string.body));
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

	private void handleAttachment(byte[] data, String filename, String filetype) {
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

					startActivity(OnAttachmentOpenedActions
							.getAttachmentIntent(file, "doc"));
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

	private void toastMsg(String string) {
		Toast.makeText(this, string, Toast.LENGTH_SHORT).show();
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

	@Override
	public void onDocServiceAttached(String component) {
		// 电子表格服务: kt_worksheet
		// 演示文稿服务: kt_presentation
		// PDF文档服务: pdf_document
		// WPS个人版服务: kt_personal_document
		if ("kt_document".equals(component)) {
			// 文档服务绑定成功后会回调这个方法
			Log.i("OA", "文档服务绑定成功!");
		} else if ("kt_personal_document".equals(component)) {
			// 文档服务绑定成功后会回调这个方法
			Log.i("OA", "个人版文档服务绑定成功!");
		}
	}

	@Override
	protected void onReceiveOAASMessage(String message) {
		Log.d(LOG_TAG, "服务端消息: " + message);
		Toast.makeText(this, "服务端消息: " + message, Toast.LENGTH_SHORT).show();
	}

	@Override
	protected void onDocumentClosed(String localPath, boolean isModified) {
		Toast.makeText(this, "文档已关闭", Toast.LENGTH_SHORT).show();
	}

	@Override
	protected void onDocumentOpened(int docType, String fileType) {
		Toast.makeText(this, "文档已打开", Toast.LENGTH_SHORT).show();
	}

	@Override
	protected void onUploadSucceed(String serialId, String responseString) {
		Toast.makeText(this, "文档上传完毕", Toast.LENGTH_SHORT).show();
	}

	@Override
	protected void onDownloadStart(String address) {
		System.out.println("文档开始下载: " + address);
	}

	@Override
	protected void onDownloadFailed(int errorCode, String errorMessage) {
		System.out.println("文档下载失败");
	}

	@Override
	protected void onDownloadComplete(String path) {
		System.out.println("文档下载完毕");
	}

	@Override
	protected void onDownloadProgress(long totalBytes, long downloadedBytes,
			int progress, String message) {
	}
}
