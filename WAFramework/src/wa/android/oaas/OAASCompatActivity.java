package wa.android.oaas;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.widget.Toast;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * Created by 夏森海
 * 16/8/4
 */

public abstract class OAASCompatActivity extends Activity {
    public final static String LOG_TAG = "Android文档服务客户端";

    protected abstract void onReceiveOAASMessage(String message);

    BroadcastReceiver tickReceiver;
    private Message pendingMessage;

    /**
     * Handler of incoming messages from service.
     */
    private static class IncomingHandler extends Handler {

        private final WeakReference<OAASCompatActivity> mOAAS;

        IncomingHandler(OAASCompatActivity mOAAS) {
            this.mOAAS = new WeakReference<OAASCompatActivity>(mOAAS);
        }

        @Override
        public void handleMessage(Message msg) {
            OAASCompatActivity _OAAS_ = mOAAS.get();
            if (_OAAS_ != null) {
                Bundle data = msg.getData();
                switch (msg.what) {
                    case OAASDefine.MESSAGE_REPLY:
                        if (data != null) {
                            String message = data.getString("message");
                            if (message != null) {
                                _OAAS_.onReceiveOAASMessage(message);
                            }
                        }
                        break;
                    case OAASDefine.EVT_DOWNLOAD_PROGRESS:
                        //long totalBytes, long downloadedBytes, int progress, String message
                        _OAAS_.onDownloadProgress(data.getLong("totalBytes"),
                                data.getLong("downloadedBytes"),
                                data.getInt("progress"),
                                data.getString("message"));
                        break;
                    case OAASDefine.EVT_OPEN_DOCUMENT_START:
                        _OAAS_.onDownloadStart(data.getString("address"));
                        break;
                    case OAASDefine.EVT_OPEN_DOCUMENT_FAILED:
                        _OAAS_.onDocumentOpenFailed(data.getString("message"));
                        break;
                    case OAASDefine.EVT_DOCUMENT_OPENED:
                        //int docType, String fileType
                        _OAAS_.onDocumentOpened(data.getInt("docType"), data.getString("fileType"));
                        break;
                    case OAASDefine.EVT_DOCUMENT_CLOSED:
                        //String localPath, boolean isModified
                        _OAAS_.onDocumentClosed(data.getString("localPath"), data.getBoolean("isModified"));
                        break;
                    case OAASDefine.EVT_DOC_SVC_ATTACHED:
                        _OAAS_.onDocServiceAttached(data.getString("component"));
                        break;
                    case OAASDefine.EVT_DOC_SVC_DETACHED:
                        _OAAS_.onDocServiceDetached(data.getString("component"));
                        break;
                    case OAASDefine.EVT_UPLOAD_START:
                        //String serialId, String path, String title, String uploadUrl
                        _OAAS_.onStartUpload(data.getString("serialId"),
                                data.getString("path"),
                                data.getString("title"),
                                data.getString("uploadUrl"));
                        break;
                    case OAASDefine.EVT_UPLOAD_FAILED:
                        //String serialId, String failure
                        _OAAS_.onUploadFailed(data.getString("serialId"), data.getString("failure"));
                        break;
                    case OAASDefine.EVT_UPLOAD_SUCCEED:
                        //String serialId, String responseString
                        _OAAS_.onUploadSucceed(data.getString("serialId"), data.getString("responseString"));
                        break;
                    case OAASDefine.EVT_DOWNLOAD_START:
                        _OAAS_.onDownloadStart(data.getString("address"));
                        break;
                    case OAASDefine.EVT_DOWNLOAD_FAILED:
                        //int errorCode, String errorMessage
                        _OAAS_.onDownloadFailed(data.getInt("errorCode"), data.getString("errorMessage"));
                        break;
                    case OAASDefine.EVT_DOWNLOAD_SUCCEED:
                        _OAAS_.onDownloadComplete(data.getString("path"));
                        break;
                    default:
                        super.handleMessage(msg);
                }
            }
        }
    }

    /**
     * Target we publish for clients to send messages to IncomingHandler.
     */
    private final Messenger mMessenger = new Messenger(new IncomingHandler(this));

    @Override
    protected void onStart() {
        super.onStart();
        bindOfficeService();
        //Create a broadcast receiver to handle change in time
        tickReceiver = new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {
                if (intent.getAction().compareTo(Intent.ACTION_TIME_TICK) == 0) {
                    rebindOfficeService();
                }
            }
        };

        //Register the broadcast receiver to receive TIME_TICK
        registerReceiver(tickReceiver, new IntentFilter(Intent.ACTION_TIME_TICK));
    }

    @Override
    protected void onStop() {
        super.onStop();
        // Unbind from the service
        if (mConnection != null) {
            unbindService(mConnection);
            mBound = false;
        }

        if (tickReceiver != null) {
            unregisterReceiver(tickReceiver);
        }
    }

    private void bindOfficeService() {
        // Bind to the service
        Intent _oaas_ = new Intent("oaas.intent.action.OAAS_REMOTE");
        _oaas_.setClassName("com.ntko.office.officemb", "com.ntko.office.officemb.OAASService");
        bindService(_oaas_, mConnection, Context.BIND_AUTO_CREATE);
    }

    protected void rebindOfficeService() {
        if (mService == null) {
            bindOfficeService();
        }
    }

    /**
     * Messenger for communicating with the service.
     */
    private Messenger mService = null;

    /**
     * Flag indicating whether we have called bind on the service.
     */
    private boolean mBound;

    /**
     * Class for interacting with the main interface of the service.
     */
    private ServiceConnection mConnection = new ServiceConnection() {
        public void onServiceConnected(ComponentName className, IBinder service) {
            // This is called when the connection with the service has been
            // established, giving us the object we can use to
            // interact with the service.  We are communicating with the
            // service using a Messenger, so here we get a client-side
            // representation of that from the raw IBinder object.
            mService = new Messenger(service);
            mBound = true;
            
//            Toast.makeText(OAASCompatActivity.this, "Service Connected", Toast.LENGTH_LONG).show();

            if (pendingMessage != null) {
                final Message tmp = Message.obtain(pendingMessage);
                try {
                    tmp.replyTo = mMessenger;
                    mService.send(tmp);
                } catch (RemoteException e) {
                    e.printStackTrace();
                } finally {
                    pendingMessage = null;
                }
            }
        }

        public void onServiceDisconnected(ComponentName className) {
            // This is called when the connection with the service has been
            // unexpectedly disconnected -- that is, its process crashed.
            mService = null;
            mBound = false;
        }
    };

    private void sendMessageToSSAAS(Message msg) {

        if (mService == null) {
//            Toast.makeText(OAASCompatActivity.this, "Servic Not Connected", Toast.LENGTH_LONG).show();
            pendingMessage = msg;
            rebindOfficeService();
            return;
        }

        try {
            msg.replyTo = mMessenger;
            mService.send(msg);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    //*****************************************
    //******* 以下是方法实现
    //*****************************************
    private Bundle setupBundle(Map<String, String> fields, Revision revision, WPSMenuViewDisableList list) {

        final Bundle bundle = new Bundle();

        if (fields != null && !fields.isEmpty()) {
            List<String> fieldNames = new ArrayList<String>();
            fieldNames.addAll(fields.keySet());
            bundle.putStringArrayList("fieldNames", (ArrayList<String>) fieldNames);
            for (String key : fields.keySet()) {
                bundle.putString(key, fields.get(key));
            }
        }

        if (revision != null) {
            bundle.putString("username", revision.getUsername());
            bundle.putBoolean("reviewEnabled", revision.isEnabled());
            bundle.putBoolean("showReviewPanel", revision.isShowReviewPanel());
        }

        if (list == null) {
            list = new WPSMenuViewDisableList();
        }

        list.mapEntries(new WPSMenuViewDisableList.Itr() {
            @Override
            public void callback(WPSMenuViewDisableList entry, String name, boolean value) {
                bundle.putBoolean(name, value);
            }
        });


        return bundle;
    }

    ///////////////////////////////////////////////////
    ///////////// 创建新的空白文档
    ///////////////////////////////////////////////////

    /**
     * 创建新的word文档
     *
     * @param docName   文档名称
     * @param uploadUrl 上传路径
     * @param fields    表单参数
     */
    protected void createNewWord(String docName,
                                 String uploadUrl,
                                 Map<String, String> fields,
                                 Revision revision,
                                 WPSMenuViewDisableList list) {

        Bundle bundle = setupBundle(fields, revision, list);
        bundle.putString("docName", docName);
        bundle.putString("uploadUrl", uploadUrl);

        Message message = Message.obtain(null, OAASDefine.CREATE_WORD, 0, 0);
        message.setData(bundle);

        sendMessageToSSAAS(message);
    }

    /**
     * 创建新的电子表格
     *
     * @param docName   文档名称
     * @param uploadUrl 上传路径
     * @param fields    表单参数
     */
    protected void createNewExcel(String docName,
                                  String uploadUrl,
                                  Map<String, String> fields) {

        Bundle bundle = setupBundle(fields, null, null);
        bundle.putString("docName", docName);
        bundle.putString("uploadUrl", uploadUrl);

        Message message = Message.obtain(null, OAASDefine.CREATE_EXCEL, 0, 0);
        message.setData(bundle);

        sendMessageToSSAAS(message);
    }

    /**
     * 创建新的演示文档
     *
     * @param docName   文档名称
     * @param uploadUrl 上传路径
     * @param fields    表单参数
     */
    protected void createNewPresentation(String docName,
                                         String uploadUrl,
                                         Map<String, String> fields) {

        Bundle bundle = setupBundle(fields, null, null);
        bundle.putString("docName", docName);
        bundle.putString("uploadUrl", uploadUrl);

        Message message = Message.obtain(null, OAASDefine.CREATE_POWERPOINT, 0, 0);
        message.setData(bundle);

        sendMessageToSSAAS(message);
    }


    ///////////////////////////////////////////////////
    ///////////// 打开服务器存储的文件
    ///////////////////////////////////////////////////

    /**
     * 打开服务器上的word文档
     *
     * @param docName     文档名称
     * @param downloadUrl 文档下载路径
     * @param uploadUrl   上传路径
     * @param fields      表单参数
     * @param docInView   视图模式
     */
    protected void openWordFromServer(String docName,
                                      String downloadUrl,
                                      String uploadUrl,
                                      Map<String, String> fields,
                                      Revision revision,
                                      OAASDefine.DocInView docInView,
                                      WPSMenuViewDisableList list) {

        Toast.makeText(OAASCompatActivity.this, "打开服务器上的文档", Toast.LENGTH_LONG).show();
        
        Bundle bundle = setupBundle(fields, revision, list);
        bundle.putString("docName", docName);
        bundle.putString("downloadUrl", downloadUrl);
        bundle.putString("uploadUrl", uploadUrl);
        bundle.putString("docInView",
                (docInView == null ? OAASDefine.DocInView.NORMAL.name() : docInView.name()));

        Message message = Message.obtain(null, OAASDefine.OPEN_WORD_FROM_SERVER, 0, 0);
        message.setData(bundle);

        sendMessageToSSAAS(message);
    }

    /**
     * 打开服务器上的Excel文档
     *
     * @param docName     文档名称
     * @param downloadUrl 文档下载路径
     * @param uploadUrl   上传路径
     * @param fields      表单参数
     */
    protected void openExcelFromServer(String docName,
                                       String downloadUrl,
                                       String uploadUrl,
                                       Map<String, String> fields) {

        Bundle bundle = setupBundle(fields, null, null);
        bundle.putString("docName", docName);
        bundle.putString("downloadUrl", downloadUrl);
        bundle.putString("uploadUrl", uploadUrl);

        Message message = Message.obtain(null, OAASDefine.OPEN_EXCEL_FROM_SERVER, 0, 0);
        message.setData(bundle);

        sendMessageToSSAAS(message);
    }

    /**
     * 打开服务器上的PPT文档
     *
     * @param docName     文档名称
     * @param downloadUrl 文档下载路径
     * @param uploadUrl   上传路径
     * @param fields      表单参数
     */
    protected void openPresentationFromServer(String docName,
                                              String downloadUrl,
                                              String uploadUrl,
                                              Map<String, String> fields) {

        Bundle bundle = setupBundle(fields, null, null);
        bundle.putString("docName", docName);
        bundle.putString("downloadUrl", downloadUrl);
        bundle.putString("uploadUrl", uploadUrl);

        Message message = Message.obtain(null, OAASDefine.OPEN_POWERPOINT_FROM_SERVER, 0, 0);
        message.setData(bundle);

        sendMessageToSSAAS(message);
    }

    /**
     * 打开服务器上的pdf文档
     *
     * @param docName     文档名称
     * @param downloadUrl 文档下载路径
     * @param uploadUrl   上传路径
     * @param settings    视图参数
     * @param fields      表单参数
     */
    protected void openPDFFromServer(String docName,
                                     String downloadUrl,
                                     String uploadUrl,
                                     PDFViewSettings settings,
                                     Map<String, String> fields) {

        Bundle bundle = setupBundle(fields, null, null);
        bundle.putString("docName", docName);
        bundle.putString("downloadUrl", downloadUrl);
        bundle.putString("uploadUrl", uploadUrl);

        if (settings == null) {
            settings = PDFViewSettings.DEFAULT;
        }

        bundle.putInt("settingsColor", settings.getAnnotationColor());
        bundle.putFloat("settingsThickness", settings.getAnnotationThickness());
        bundle.putString("settingsInView", settings.getPdfInView().name());
        bundle.putBoolean("settingsReadOnly", settings.isReadOnly());

        Message message = Message.obtain(null, OAASDefine.OPEN_PDF_FROM_SERVER, 0, 0);
        message.setData(bundle);

        sendMessageToSSAAS(message);
    }

    /**
     * 打开服务器上的图像文档
     *
     * @param docName     文档名称
     * @param downloadUrl 文档下载路径
     */
    protected void openImageFromServer(String docName,
                                       String downloadUrl) {

        Bundle bundle = new Bundle();
        bundle.putString("docName", docName);
        bundle.putString("downloadUrl", downloadUrl);

        Message message = Message.obtain(null, OAASDefine.OPEN_IMAGE_FROM_SERVER, 0, 0);
        message.setData(bundle);

        sendMessageToSSAAS(message);
    }


    ///////////////////////////////////////////////////
    ///////////// 打开本地磁盘文件
    ///////////////////////////////////////////////////

    /**
     * 打开本地磁盘的word文档
     *
     * @param docName   文档名称
     * @param docPath   文档路径
     * @param uploadUrl 上传路径
     * @param fields    表单参数
     * @param docInView 视图模式
     */
    protected void openWordFromLocal(String docName,
                                     String docPath,
                                     String uploadUrl,
                                     Map<String, String> fields,
                                     Revision revision,
                                     OAASDefine.DocInView docInView,
                                     WPSMenuViewDisableList list) {

        Bundle bundle = setupBundle(fields, revision, list);
        bundle.putString("docName", docName);
        bundle.putString("docPath", docPath);
        bundle.putString("uploadUrl", uploadUrl);
        bundle.putString("docInView",
                (docInView == null ? OAASDefine.DocInView.NORMAL.name() : docInView.name()));

        Message message = Message.obtain(null, OAASDefine.OPEN_WORD_FROM_LOCAL, 0, 0);
        message.setData(bundle);

        sendMessageToSSAAS(message);
    }

    /**
     * 打开本地磁盘的Excel文档
     *
     * @param docName   文档名称
     * @param docPath   文档路径
     * @param uploadUrl 上传路径
     * @param fields    表单参数
     */
    protected void openExcelFromLocal(String docName,
                                      String docPath,
                                      String uploadUrl,
                                      Map<String, String> fields) {
        Bundle bundle = setupBundle(fields, null, null);
        bundle.putString("docName", docName);
        bundle.putString("docPath", docPath);
        bundle.putString("uploadUrl", uploadUrl);

        Message message = Message.obtain(null, OAASDefine.OPEN_EXCEL_FROM_LOCAL, 0, 0);
        message.setData(bundle);

        sendMessageToSSAAS(message);
    }

    /**
     * 打开本地磁盘的PPT文档
     *
     * @param docName   文档名称
     * @param docPath   文档路径
     * @param uploadUrl 上传路径
     * @param fields    表单参数
     */
    protected void openPresentationFromLocal(String docName,
                                             String docPath,
                                             String uploadUrl,
                                             Map<String, String> fields) {
        Bundle bundle = setupBundle(fields, null, null);
        bundle.putString("docName", docName);
        bundle.putString("docPath", docPath);
        bundle.putString("uploadUrl", uploadUrl);

        Message message = Message.obtain(null, OAASDefine.OPEN_POWERPOINT_FROM_LOCAL, 0, 0);
        message.setData(bundle);

        sendMessageToSSAAS(message);
    }

    /**
     * 打开本地磁盘的pdf文档
     *
     * @param docName   文档名称
     * @param docPath   文档下载路径
     * @param uploadUrl 上传路径
     * @param settings  视图参数
     * @param fields    表单参数
     */
    protected void openPDFFromLocal(String docName,
                                    String docPath,
                                    String uploadUrl,
                                    PDFViewSettings settings,
                                    Map<String, String> fields) {
        Bundle bundle = setupBundle(fields, null, null);
        bundle.putString("docName", docName);
        bundle.putString("docPath", docPath);
        bundle.putString("uploadUrl", uploadUrl);

        if (settings == null) {
            settings = PDFViewSettings.DEFAULT;
        }

        bundle.putInt("settingsColor", settings.getAnnotationColor());
        bundle.putFloat("settingsThickness", settings.getAnnotationThickness());
        bundle.putString("settingsInView", settings.getPdfInView().name());
        bundle.putBoolean("settingsReadOnly", settings.isReadOnly());

        Message message = Message.obtain(null, OAASDefine.OPEN_PDF_FROM_LOCAL, 0, 0);
        message.setData(bundle);

        sendMessageToSSAAS(message);
    }

    /**
     * 打开本地磁盘的图像文档
     *
     * @param docName   文档名称
     * @param docPath   文档下载路径
     * @param uploadUrl 上传路径
     */
    protected void openImageFromLocal(String docName,
                                      String docPath,
                                      String uploadUrl) {
        Bundle bundle = new Bundle();
        bundle.putString("docName", docName);
        bundle.putString("docPath", docPath);
        bundle.putString("uploadUrl", uploadUrl);

        Message message = Message.obtain(null, OAASDefine.OPEN_IMAGE_FROM_LOCAL, 0, 0);
        message.setData(bundle);

        sendMessageToSSAAS(message);
    }

    ///////////////////////////////////////////////////
    ///////////// 文档事件
    ///////////////////////////////////////////////////

    protected void onDownloadProgress(long totalBytes, long downloadedBytes, int progress, String message) {
    }


    protected void onStartOpenDocument(String filePath, boolean isEncrypted) {
    }


    protected void onDocumentOpened(int docType, String fileType) {
    }


    protected void onDocumentOpenFailed(String message) {
    }


    protected void onDocumentClosed(String localPath, boolean isModified) {
    }


    protected void onDocServiceAttached(String component) {
    }


    protected void onDocServiceDetached(String component) {
    }


    protected void onStartUpload(String serialId, String path, String title, String uploadUrl) {
    }


    protected void onUploadFailed(String serialId, String failure) {
    }


    protected void onUploadSucceed(String serialId, String responseString) {
    }


    protected void onDownloadStart(String address) {
    }


    protected void onDownloadFailed(int errorCode, String errorMessage) {
    }


    protected void onDownloadComplete(String path) {
    }
}
