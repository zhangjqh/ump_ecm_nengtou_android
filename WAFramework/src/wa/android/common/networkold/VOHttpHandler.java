package wa.android.common.networkold;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import nc.vo.oa.component.struct.Action;
import nc.vo.oa.component.struct.Actions;
import nc.vo.oa.component.struct.ComponentVO;
import nc.vo.oa.component.struct.ParamTagVO;
import nc.vo.oa.component.struct.ReqParamsVO;
import nc.vo.oa.component.struct.WAComponentInstanceVO;
import nc.vo.oa.component.struct.WAComponentInstancesVO;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.conn.HttpHostConnectException;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import ufida.fasterxml.jackson.annotation.JsonInclude.Include;
import ufida.fasterxml.jackson.databind.ObjectMapper;
import ufida.fasterxml.jackson.databind.SerializationFeature;
import wa.android.common.utils.DESEncrypt;
import wa.android.common.utils.GZipCompress;
import wa.utils.SerializeUtil;
import wa.utils.SerializeUtil.DataProcessOrder;

public class VOHttpHandler
{
  public static boolean IS_DEBUG = false;
  private static VOHttpResponse cache;
  public static int CONNECTION_TIMEOUT = 12000;
  public static int SOCKET_TIMEOUT = 20000;

  public static VOHttpResponse requestVOFromServer(String url, WAComponentInstancesVO mWAComponentInstancesVO, List<Header> headerList)
    throws HttpHostConnectException, ConnectTimeoutException, IOException
  {
    Object resultObject = null;

    DefaultHttpClient client = new DefaultHttpClient();
    HttpPost request = new HttpPost(url);
    client.getParams().setParameter("http.connection.timeout", Integer.valueOf(CONNECTION_TIMEOUT));
    client.getParams().setParameter("http.socket.timeout", Integer.valueOf(SOCKET_TIMEOUT));

    for (Header h : headerList) {
      request.setHeader(h);
    }
    boolean isEncrypt = false;
    boolean isCompress = false;
    int encryptiontype = 1;
    SerializeUtil.DataProcessOrder dpOrder = SerializeUtil.DataProcessOrder.ENCRYPT_FIRST;
    for (Header header : headerList) {
      String name = header.getName();
      String value = header.getValue();
      if (name.equalsIgnoreCase("compress"))
        isCompress = value.equalsIgnoreCase("Y");
      else if (name.equalsIgnoreCase("encryption"))
        isEncrypt = value.equalsIgnoreCase("Y");
      else if (name.equalsIgnoreCase("encryptiontype"))
        encryptiontype = Integer.valueOf(value).intValue();
      else if (name.equalsIgnoreCase("comencorder")) {
        dpOrder = value.equalsIgnoreCase("1") ? SerializeUtil.DataProcessOrder.COMPRESS_FIRST : SerializeUtil.DataProcessOrder.ENCRYPT_FIRST;
      }
    }

    ByteArrayEntity baEntity = new ByteArrayEntity(SerializeUtil.encode(mWAComponentInstancesVO, isEncrypt, encryptiontype, isCompress, dpOrder));
    request.setEntity(baEntity);

    Log(0, VOHttpHandler.class, "request header: " + Arrays.toString(request.getAllHeaders()));
    HttpResponse response = null;

    response = client.execute(request);

    int responseCode = response.getStatusLine().getStatusCode();
    if (responseCode != 200) {
      Log(1, VOHttpHandler.class, "http response status code : " + responseCode);
      try {
        Log(1, VOHttpHandler.class, "http return : " + EntityUtils.toString(response.getEntity()));
      } catch (Exception e) {
        Log(1, VOHttpHandler.class, "error response entity");
      }
      return new VOHttpResponse(null, request.getAllHeaders(), response.getAllHeaders(), response.getStatusLine().getStatusCode());
    }
    Log(0, VOHttpHandler.class, "response code: " + responseCode);

    Log(0, VOHttpHandler.class, "response header: " + Arrays.toString(response.getAllHeaders()));

    resultObject = SerializeUtil.decode(response.getEntity().getContent(), isEncrypt, encryptiontype, isCompress, dpOrder);
    cache = new VOHttpResponse((WAComponentInstancesVO)resultObject, request.getAllHeaders(), response.getAllHeaders(), response.getStatusLine()
      .getStatusCode());
    return cache;
  }
  public static VOHttpResponse jsonrequestVOFromServer(String url, WAComponentInstancesVO mWAComponentInstancesVO, List<Header> headerList)
		    throws HttpHostConnectException, ConnectTimeoutException, IOException
		  {
		    Object resultObject = null;

		    DefaultHttpClient client = new DefaultHttpClient();
		    HttpPost request = new HttpPost(url);
		    client.getParams().setParameter("http.connection.timeout", Integer.valueOf(CONNECTION_TIMEOUT));
		    client.getParams().setParameter("http.socket.timeout", Integer.valueOf(SOCKET_TIMEOUT));

		    //translateversion
		    for (Header h : headerList) {
		      request.setHeader(h);
		    }
		    boolean isEncrypt = false;
		    boolean isCompress = false;
		    int encryptiontype = 1;
		    SerializeUtil.DataProcessOrder dpOrder = SerializeUtil.DataProcessOrder.ENCRYPT_FIRST;
		    for (Header header : headerList) {
		      String name = header.getName();
		      String value = header.getValue();
		      if (name.equalsIgnoreCase("compress"))
		        isCompress = value.equalsIgnoreCase("Y");
		      else if (name.equalsIgnoreCase("encryption"))
		        isEncrypt = value.equalsIgnoreCase("Y");
		      else if (name.equalsIgnoreCase("encryptiontype"))
		        encryptiontype = Integer.valueOf(value).intValue();
		      else if (name.equalsIgnoreCase("comencorder")) {
		        dpOrder = value.equalsIgnoreCase("1") ? SerializeUtil.DataProcessOrder.COMPRESS_FIRST : SerializeUtil.DataProcessOrder.ENCRYPT_FIRST;
		      }
		    }
		    ObjectMapper json=new ObjectMapper();

		    setdyvo(mWAComponentInstancesVO.getWaci(), json);
		    json.setSerializationInclusion(Include.NON_NULL);
		    json.configure(SerializationFeature.WRAP_ROOT_VALUE, true);
		    json.configure(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED, false);
		    json.configure(SerializationFeature.WRITE_NULL_MAP_VALUES, false);
			String outputjson=json.writeValueAsString(mWAComponentInstancesVO);
			
			 byte[] postData = outputjson.getBytes("utf-8");
				byte[] requestData = encode(postData, isEncrypt, encryptiontype, isCompress, dpOrder);
		    ByteArrayEntity baEntity = new ByteArrayEntity(requestData);
		    request.setEntity(baEntity);

		    Log(0, VOHttpHandler.class, "request header: " + Arrays.toString(request.getAllHeaders()));
		    HttpResponse response = null;

		    response = client.execute(request);

		    int responseCode = response.getStatusLine().getStatusCode();
		    if (responseCode != 200) {
		      Log(1, VOHttpHandler.class, "http response status code : " + responseCode);
		      try {
		        Log(1, VOHttpHandler.class, "http return : " + EntityUtils.toString(response.getEntity()));
		      } catch (Exception e) {
		        Log(1, VOHttpHandler.class, "error response entity");
		      }
		      return new VOHttpResponse(null, request.getAllHeaders(), response.getAllHeaders(), response.getStatusLine().getStatusCode());
		    }
		    Log(0, VOHttpHandler.class, "response code: " + responseCode);

		    Log(0, VOHttpHandler.class, "response header: " + Arrays.toString(response.getAllHeaders()));
//		    if (response.getAllHeaders().length > 0) {
//				for (Header h : response.getAllHeaders()) {
//					if ("Sessiontimout".equals(h.getName())) {
//						return new VOHttpResponse((WAComponentInstancesVO)resultObject, request.getAllHeaders(), response.getAllHeaders(), response.getStatusLine()
//							      .getStatusCode(),"");
//					}
//				}
//			}
		    byte[] responseData = decode(EntityUtils.toByteArray(response.getEntity()), isEncrypt, encryptiontype, isCompress, dpOrder);
		    String reqstr = new String(responseData, "UTF-8");
//		    ObjectMapper json1 = new ObjectMapper();
//		    json1.addUserDefineClass("messagedetail",MessageDetailVO.class );
//		    json1.addUserDefineClass("attachmentlist", AttachmentListVO.class);
//		    json1.configure(DeserializationFeature.UNWRAP_ROOT_VALUE, true);
//		    json1.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
//		    resultObject  = json1.readValue(reqstr, WAComponentInstancesVO.class);
		    cache = new VOHttpResponse((WAComponentInstancesVO)resultObject, request.getAllHeaders(), response.getAllHeaders(), response.getStatusLine()
		      .getStatusCode(),reqstr);
//		    cache = new VOHttpResponse((WAComponentInstancesVO)resultObject, request.getAllHeaders(), response.getAllHeaders(), response.getStatusLine()
//				      .getStatusCode());
		    return cache;
		  }
  @Deprecated
  public static VOHttpResponse requestSingleActionVOFromServer(String url, String componentid, String actiontype, String[] paramArray, List<Header> headerList)
    throws HttpHostConnectException, ConnectTimeoutException, IOException
  {
    int index = 0;
    WAComponentInstancesVO mWAComponentInstancesVO = new WAComponentInstancesVO();
    ArrayList waci = new ArrayList();
    WAComponentInstanceVO mWACIVO = new WAComponentInstanceVO();
    mWACIVO.setComponentid(componentid);
    Actions mActionO = new Actions();
    ArrayList actions = new ArrayList();
    Action action = new Action();
    action.setActiontype(actiontype);
    ReqParamsVO paramVO = new ReqParamsVO();
    ArrayList params = new ArrayList();
    while (index < paramArray.length - 1) {
      params.add(new ParamTagVO(paramArray[(index++)], paramArray[(index++)]));
    }
    paramVO.setParamlist(params);
    action.setParamstags(paramVO);
    actions.add(action);
    mActionO.setActions(actions);
    mWACIVO.setActions(mActionO);
    waci.add(mWACIVO);
    mWAComponentInstancesVO.setWaci(waci);
    return requestVOFromServer(url, mWAComponentInstancesVO, headerList);
  }

  public static VOHttpResponse getCache(boolean stillKeep)
  {
    VOHttpResponse tmp = cache;
    if (!stillKeep) {
      cache = null;
    }
    return tmp;
  }

  public void clearCache()
  {
    cache = null;
  }

  public static void Log(int level, Class clazz, String msg)
  {
    if (IS_DEBUG)
      if (level == 1)
        System.err.println(clazz.getName() + "\t" + msg);
      else
        System.out.println(clazz.getName() + "\t" + msg);
  }
  
  
  
	/**
	 * 数据解码
	 * 
	 * @param src
	 * @param isEncrypt
	 * @param encryptiontype
	 * @param isCompress
	 * @param order
	 * @return
	 */
	public static final byte[] decode(byte[] src, boolean isEncrypt,
			int encryptiontype, boolean isCompress, DataProcessOrder order) {
		byte[] result = src;
		try {
			if (order == DataProcessOrder.ENCRYPT_FIRST) {
				if (isCompress) {
					result = GZipCompress.unGZip(result);
				}
				if (isEncrypt) {
					switch (encryptiontype) {
					case 1:
						result = DESEncrypt.getInstance().decode(result, true);
						break;
					case 2:
						result = DESEncrypt.getInstance().decode(result, false);
					default:
						break;
					}
				}
			} else {
				if (isEncrypt) {
					switch (encryptiontype) {
					case 1:
						result = DESEncrypt.getInstance().decode(result, true);
						break;
					case 2:
						result = DESEncrypt.getInstance().decode(result, false);
					}
				}

				if (isCompress) {
					result = GZipCompress.unGZip(result);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return result;
	}
	public static final byte[] encode(byte[] data, boolean isEncrypt,
			int encryptiontype, boolean isCompress, DataProcessOrder order) {
		byte[] result = data;
		try {
			if (order == DataProcessOrder.ENCRYPT_FIRST) {
				if (isEncrypt) {
					switch (encryptiontype) {
					case 1:
						result = DESEncrypt.getInstance().encode(result, true);
						break;
					case 2:
						result = DESEncrypt.getInstance().encode(result, false);
					}
				}
				if (isCompress)
					result = GZipCompress.gZip(result);
			} else {
				if (isCompress) {
					result = GZipCompress.gZip(result);
				}
				if (isEncrypt) {
					switch (encryptiontype) {
					case 1:
						result = DESEncrypt.getInstance().encode(result, true);
						break;
					case 2:
						result = DESEncrypt.getInstance().encode(result, false);
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return result;
	}
	protected static void setdyvo(List<WAComponentInstanceVO> wacil, ObjectMapper json){
		 List<ComponentVO> cvs=null;
			for(WAComponentInstanceVO ci:wacil){
				cvs=ci.getComponentvos();
				if(cvs!=null){
					for(ComponentVO cv:cvs){
						json.addUserDefineClass(cv.getName(), cv.getVoclass());
					}
					ci.setComponentvos(null);
				}
			}
		}
}

