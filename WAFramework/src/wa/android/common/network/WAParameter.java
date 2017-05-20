package wa.android.common.network;

import org.json.JSONObject;

public abstract class WAParameter {
	public String key = null;
	
	protected abstract JSONObject toJSONObject();
}
