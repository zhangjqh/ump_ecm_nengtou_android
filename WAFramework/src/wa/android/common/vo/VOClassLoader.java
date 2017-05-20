package wa.android.common.vo;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicHeader;
import org.apache.http.params.CoreConnectionPNames;

public class VOClassLoader {

	public String downloadVO(String url, String data, List<Header> headerList) {
		try {
            HttpClient client = new DefaultHttpClient();
            HttpPost httpRequest = new HttpPost(url);
            //设置超时时间
    		client.getParams().setParameter(CoreConnectionPNames.SO_TIMEOUT, 30000);
    		client.getParams().setParameter(CoreConnectionPNames.CONNECTION_TIMEOUT, 10000);
    		//添加头信息
    		for(Header header : headerList) {
    			httpRequest.setHeader(header);
    		}
    		StringEntity stringEntity = new StringEntity(data, "utf-8");
    		httpRequest.setEntity(stringEntity);
            HttpResponse response = client.execute(httpRequest);
            int statusCode = response.getStatusLine().getStatusCode();  
            if(statusCode == HttpStatus.SC_OK) {
                InputStream is = response.getEntity().getContent();
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                byte[] buffer = new byte[1024];
                int len = -1;
                while((len = is.read(buffer)) != -1) {
                	baos.write(buffer, 0, len);
                }
                baos.flush();
                baos.close();
                String resultStr = new String(baos.toByteArray());
                System.out.println(resultStr);
                return resultStr;
            }
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
	}
	
	public List<Header> createHeadList(boolean isEncryption,
			boolean isWithBase64, boolean isCompress, boolean isEncryptionFirst) {
		List<Header> headerList = new ArrayList<Header>();
		//添加压缩
		BasicHeader h1 = new BasicHeader("compress", isCompress ? "Y" : "N");
		headerList.add(h1);
		BasicHeader h2 = new BasicHeader("contaiver", "N");
		headerList.add(h2);
		//是否加密
		BasicHeader h3 = new BasicHeader("encryption", isEncryption ? "Y" : "N");
		headerList.add(h3);
		//加密类型是否是64
		BasicHeader h4 = new BasicHeader("encryptiontype", isWithBase64 ? "1" : "2");
		headerList.add(h4);
		//传输类型是json还是jobject
		BasicHeader h5 = new BasicHeader("translatetype", "json");
		headerList.add(h5);
		BasicHeader h6 = new BasicHeader("translateversion", "1.1");
		headerList.add(h6);
		if (isEncryption && isCompress) {
			BasicHeader h7 = new BasicHeader("comencorder", isEncryptionFirst ? "2" : "1");
			headerList.add(h7);
		}
		if (isCompress) {
			BasicHeader h8 = new BasicHeader("compresstype", "1");
			headerList.add(h8);
		}
		for(Header h : headerList){
			System.out.println(" - - : " + h.getName() + "," + h.getValue());
		}
		return headerList;
	}

	/**
	 * 将输入流写入文件
	 * @param file
	 * @param is
	 * @return
	 */
	public boolean writeToFile(File file, InputStream is) {
		boolean result = false;
		if(is == null)
			return false;
		BufferedOutputStream bos = null;
		try {
			bos = new BufferedOutputStream(new FileOutputStream(file));
			byte[] buffer = new byte[1024];
			int len = -1;
			while((len = is.read(buffer)) > 0) {
				bos.write(buffer, 0, len);
			}
			bos.flush();
			result = true;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(bos != null)
					bos.close();
				if(is != null) 
					is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
	
	/**
	 * 将二进制数据写入文件
	 * @param file
	 * @param data
	 * @return
	 */
	public boolean writeToFile(File file, byte[] data) {
		boolean result = false;
		BufferedOutputStream bos = null;
		try {
			bos = new BufferedOutputStream(new FileOutputStream(file));
			bos.write(data);
			bos.flush();
			result = true;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(bos != null)
					bos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
}
