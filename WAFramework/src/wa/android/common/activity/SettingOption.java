package wa.android.common.activity;

import java.io.Serializable;

public class SettingOption implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	String des = "";
	Class<?> triggerClazz = null;
	int imageResID;

	public int getImageResID() {
		return imageResID;
	}

	public void setImageResID(int imageResID) {
		this.imageResID = imageResID;
	}

	public String getDes() {
		return des;
	}

	public void setDes(String des) {
		this.des = des;
	}

	public Class<?> getTriggerClazz() {
		return triggerClazz;
	}

	public void setTriggerClazz(Class<?> triggerClazz) {
		this.triggerClazz = triggerClazz;
	}
	

}
