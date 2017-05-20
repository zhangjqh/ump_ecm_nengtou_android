package wa.android.constants;

import wa.android.common.activity.AboutActivity;
import wa.android.common.activity.LoginActivity;
import wa.android.common.activity.LoginWithForceLoginActivity;
import wa.android.common.activity.SetConnectionActivity;
import wa.android.common.activity.SettingActivity;
import wa.android.common.activity.V57LoginActivity;
import wa.android.common.activity.WelcomeActivity1;
import android.content.Context;
import android.content.Intent;

public class CommonWAIntents {

	public static Intent getWELCOME_ACTIVITY(Context fromContext) {
		return new Intent(fromContext, WelcomeActivity1.class);
	}

	public static Intent getSETTING_ACTIVITY(Context fromContext) {
		return new Intent(fromContext, SettingActivity.class);
	}

	public static Intent getLOGIN_ACTIVITY(Context fromContext) {
		return new Intent(fromContext, LoginWithForceLoginActivity.class);
	}
	public static Intent getLOGIN_ACTIVITY(Context fromContext, String version) {
		if(version.equals("")||version.equals("1.0")||version.equals("2.0")){
		return new Intent(fromContext, LoginWithForceLoginActivity.class);}
		else{
			return new Intent(fromContext, V57LoginActivity.class);}
		}
	public static Intent getSETCONNECTION_ACTIVITY(Context fromContext) {
		return new Intent(fromContext, SetConnectionActivity.class);
	}

	public static Intent getABOUT_ACTIVITY(Context fromContext) {
		return new Intent(fromContext, AboutActivity.class);
	}
}
