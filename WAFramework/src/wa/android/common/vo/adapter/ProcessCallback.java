package wa.android.common.vo.adapter;

import java.io.IOException;
import java.util.List;

import nc.vo.oa.component.struct.WAComponentInstancesVO;

import org.apache.http.Header;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.conn.HttpHostConnectException;

import wa.android.common.networkold.VOHttpResponse;



public interface ProcessCallback {
	VOHttpResponse process(String url,WAComponentInstancesVO mWAComponentInstancesVO,
			List<Header> headerList)  throws HttpHostConnectException,
	ConnectTimeoutException, IOException; 
}
