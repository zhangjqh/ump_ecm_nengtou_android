package wa.android.common.networkold;

import nc.vo.oa.component.struct.WAComponentInstancesVO;
import org.apache.http.Header;

public class VOHttpResponse
{
  private WAComponentInstancesVO waComponentInstancesVO;
  private Header[] requestHeaders;
  private Header[] responseHeaders;
  private int statusCode;
  private String JsonStr;

  public VOHttpResponse(WAComponentInstancesVO mWAComponentInstancesVO, Header[] requestHeaders, Header[] responseHeaders, int statusCode, String JsonStr)
  {
    this.waComponentInstancesVO = mWAComponentInstancesVO;
    this.requestHeaders = requestHeaders;
    this.responseHeaders = responseHeaders;
    this.statusCode = statusCode;
    this.JsonStr = JsonStr;
  }
  public VOHttpResponse(WAComponentInstancesVO mWAComponentInstancesVO, Header[] requestHeaders, Header[] responseHeaders, int statusCode)
  {
    this.waComponentInstancesVO = mWAComponentInstancesVO;
    this.requestHeaders = requestHeaders;
    this.responseHeaders = responseHeaders;
    this.statusCode = statusCode;
  }

  public WAComponentInstancesVO getmWAComponentInstancesVO()
  {
    return this.waComponentInstancesVO;
  }

  public int getStatusCode()
  {
    return this.statusCode;
  }

  public Header[] getRequestHeaders()
  {
    return this.requestHeaders;
  }

  public Header[] getResponseHeaders()
  {
    return this.responseHeaders;
  }

public String getJsonStr() {
	return JsonStr;
}

public void setJsonStr(String jsonStr) {
	JsonStr = jsonStr;
}
}