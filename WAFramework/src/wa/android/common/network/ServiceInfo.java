package wa.android.common.network;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ServiceInfo{
	public String usrid = null;
	public String groupid = null;
	public String servicecode = null;
	public String productid = null;
	
	public static JSONArray toJSONArray(List<ServiceInfo> serviceInfo){
		try {
			JSONArray serviceloginInfo = new JSONArray();
			for (ServiceInfo info : serviceInfo) {
				JSONObject serviceinfo = new JSONObject();

				serviceinfo.put("servicecode", info.servicecode);
				serviceinfo.put("groupid", info.groupid);
				serviceinfo.put("usrid", info.usrid);
				serviceinfo.put("productid", info.productid);
				serviceloginInfo.put(serviceinfo);
			}
			return serviceloginInfo;
		} catch (JSONException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static List<ServiceInfo> fromJSONArray(String jsonString) {
		try {
			JSONArray jsonArray = new JSONArray(jsonString);
			List<ServiceInfo> serviceInfos = new ArrayList<ServiceInfo>();
			for (int i = 0; i < jsonArray.length(); i++) {
				JSONObject obj = jsonArray.getJSONObject(i);
				ServiceInfo si = new ServiceInfo();
				try {
					si.groupid = obj.getString("groupid");
				} catch (Exception e) {
					// TODO: handle exception
					si.groupid =  "";
				}
				try {
					si.usrid = obj.getString("usrid");
				} catch (Exception e) {
					// TODO: handle exception
					si.usrid = "";
				}
				try {
					si.productid = obj.getString("productid");
				} catch (Exception e) {
					// TODO: handle exception
					si.productid = "";
				}
				try {
					si.servicecode = obj.getString("servicecode");
				} catch (Exception e) {
					// TODO: handle exception
					si.servicecode = "";
				}
				serviceInfos.add(si);
			}
			return serviceInfos;
		} catch (JSONException e) {
			e.printStackTrace();
			return null;
		}
		
	}
} 