package wa.android.libs.poll.data;

import java.util.Map;

public class PollDataVO {
	public String msgid = null;
	public String badge = null;
	public String content = null;
	public String mnc = null;
	
	public PollDataVO(Map<String, String> mapData) {
		
		msgid = mapData.get("msgid");
		badge = mapData.get("badge");
		content = mapData.get("content");
		mnc = mapData.get("mnc");
	}
	
	public PollDataVO(){
		msgid = "msgid";
		badge = "badge";
		content = "content";
		mnc = "mnc";
	}
	
	public String toString(){
		StringBuffer sb = new StringBuffer();
		sb.append("msgid:").append(msgid).append('-')
		.append("badge").append(badge).append('-')
		.append("content").append(content).append('-')
		.append("mnc").append(mnc);
		return sb.toString();
	}
}
