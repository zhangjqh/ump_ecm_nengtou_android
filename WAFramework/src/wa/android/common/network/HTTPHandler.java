package wa.android.common.network;

import java.io.IOException;
import java.net.SocketTimeoutException;

import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.conn.HttpHostConnectException;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import android.util.Log;

class HTTPHandler extends Thread {
	public static int CONNECTION_TIMEOUT = 12000;
	public static int SOCKET_TIMEOUT = 20000;
	
	private String url;
	private byte[] data;
	private Header[] headerList;
	private HttpListener listener;
	
	private WARequestVO cacheRequestVO = null;

	protected HTTPHandler(String url, byte[] data, Header[] headerList,
			HttpListener network, WARequestVO request) {
		this.url = url;
		this.data = data;
		this.headerList = headerList;
		this.listener = network;
		
		this.cacheRequestVO = request;
	}

	@Override
	public void run() {
		Log.d(getClass().getSimpleName(), "网络HTTP处理:开始");
		try {
			DefaultHttpClient client = new DefaultHttpClient();
			HttpPost request = new HttpPost(url);
			client.getParams().setParameter("http.connection.timeout",
					Integer.valueOf(CONNECTION_TIMEOUT));
			client.getParams().setParameter("http.socket.timeout",
					Integer.valueOf(SOCKET_TIMEOUT));
			//设置http头
			request.setHeaders(headerList);

			ByteArrayEntity baEntity = new ByteArrayEntity(data);
			Log.i("上行流量", "byte数："+ data.length);
			request.setEntity(baEntity);
			HttpResponse response = client.execute(request);
			int responseCode = response.getStatusLine().getStatusCode();
			Log.d(getClass().getSimpleName(), "网络HTTP处理：结束-"+ responseCode);
			if (responseCode != 200) {
				listener.OnHttpFailed(cacheRequestVO, RequestListener.REQUEST_FAILED);
			} else {
				byte[] responseData = EntityUtils.toByteArray(response.getEntity());
				cacheRequestVO.headerlist = response.getAllHeaders();
				listener.OnHttpOK(cacheRequestVO, response.getAllHeaders(), responseData);
				Log.i("下行流量", "byte数："+ responseData.length);
			}
		} catch (ConnectTimeoutException e) {
			e.printStackTrace();
			Log.d(getClass().getSimpleName(), "网络HTTP处理：结束-超时");
			listener.OnHttpFailed(cacheRequestVO, RequestListener.REQUEST_FAILED_TIMEOUT);
		}catch (SocketTimeoutException e) {
			e.printStackTrace();
			Log.d(getClass().getSimpleName(), "网络HTTP处理：结束-超时");
			listener.OnHttpFailed(cacheRequestVO, RequestListener.REQUEST_FAILED_TIMEOUT);
		}
		catch(HttpHostConnectException e){
			e.printStackTrace();
			Log.d(getClass().getSimpleName(), "网络HTTP处理：结束-连接失败");
			listener.OnHttpFailed(cacheRequestVO, RequestListener.REQUEST_FAILED_TIMEOUT);
		} catch (IOException e) {
			e.printStackTrace();
			Log.d(getClass().getSimpleName(), "网络HTTP处理：结束-连接失败");
			listener.OnHttpFailed(cacheRequestVO, RequestListener.REQUEST_FAILED_CONNECTION);
		} catch (IllegalArgumentException e) {
			
			// 服务器地址或参数不合法
			e.printStackTrace();
			Log.d(getClass().getSimpleName(), "网络HTTP处理：结束-服务器地址不合法");
			listener.OnHttpFailed(cacheRequestVO, RequestListener.REQUEST_FAILED_WRONGURL);
		}catch(OutOfMemoryError e){
			listener.OnHttpFailed(cacheRequestVO, RequestListener.REQUEST_FAILED_OUT_OF_MEMORY);
		}
	}


	interface HttpListener{
		public void OnHttpOK(WARequestVO request, Header[] headerlist, byte[] data);
		public void OnHttpFailed(WARequestVO request, int reason);
	}
}
