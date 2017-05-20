package wa.android.common.versioncheck;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;

import android.annotation.SuppressLint;

public class HttpUtil {
	
	private static final String URL = "http://app.yonyou.com:10001/uf_vmgr_itf/vmgr/checkversion"; 
//	private static final String URL = "http://10.10.5.179:10001/uf_vmgr_itf/vmgr/checkversion"; 	
//	private static final String URL = "http://10.5.3.54:8080/uf_vmgr_itf/vmgr/checkversion"; 

	@SuppressLint("NewApi")
	public static VersionInfo getVersion(String appid) {

		VersionInfo verson = null;
		DefaultHttpClient client = new DefaultHttpClient();// 客户端
		HttpParams params = new BasicHttpParams();
		HttpProtocolParams.setVersion(params, HttpVersion.HTTP_1_1);
		HttpProtocolParams.setContentCharset(params, "UTF-8");// 字符集

		HttpPost request = new HttpPost(URL);// 请求行
		String par = "{\"appkey\":\"" + appid + "\"}";
		ByteArrayEntity baEntity = null;
		try {
			baEntity = new ByteArrayEntity(par.getBytes("UTF-8"));
		} catch (UnsupportedEncodingException e1) {
			e1.printStackTrace();
		}// 创建请求体
		request.setEntity(baEntity);

		HttpResponse response;
		try {
			
			HttpURLConnection con = null;
			GZIPOutputStream gzipOutstream = null;
			GZIPInputStream gzipStream = null;
			ByteArrayOutputStream baos = null;
			URL url = new URL(URL);
			con = (HttpURLConnection) url.openConnection();
			con.setConnectTimeout(30000);
			con.setReadTimeout(30000);
			con.setDoInput(true);
			con.setDoOutput(true);
			con.setAllowUserInteraction(false);
			con.setUseCaches(false);
			con.setRequestMethod("POST");
			con.setRequestProperty("content-type", "text/plain");
			gzipOutstream = new GZIPOutputStream(con.getOutputStream());
			gzipOutstream.write(par.getBytes("UTF-8"));
			gzipOutstream.flush();
			gzipOutstream.finish();
			gzipOutstream.close();
			gzipStream = new GZIPInputStream(con.getInputStream());
			baos = new ByteArrayOutputStream();
			byte[] buffer = new byte[4096];
			int len = -1;
			while ((len = gzipStream.read(buffer)) != -1 ) {
				baos.write(buffer, 0, len);
			}			
			con.disconnect();
			gzipStream.close();
			baos.close();
			byte[] data = android.util.Base64.decode(baos.toString(),android.util.Base64.DEFAULT);
			verson  = new VersionInfo(new String(data,"UTF-8"));
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}
		return verson;
	}
}
