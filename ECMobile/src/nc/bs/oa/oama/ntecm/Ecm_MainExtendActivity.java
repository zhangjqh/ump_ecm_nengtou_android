package nc.bs.oa.oama.ntecm;

import com.yonyou.uap.um.base.*;
import com.yonyou.uap.um.common.*;
import com.yonyou.uap.um.third.*;
import com.yonyou.uap.um.control.*;
import com.yonyou.uap.um.core.*;
import com.yonyou.uap.um.binder.*;
import com.yonyou.uap.um.runtime.*;
import com.yonyou.uap.um.lexer.*;
import com.yonyou.uap.um.widget.*;
import com.yonyou.uap.um.widget.UmpSlidingLayout.SlidingViewType;
import java.util.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import android.webkit.*;
import android.content.*;
import android.graphics.*;
import android.widget.ImageView.ScaleType;

public class Ecm_MainExtendActivity extends Ecm_MainActivity {
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		ECMobileUpdate.check(this);
	}
	
	@Override
	public void onInit(Bundle savedInstanceState) {
		super.onInit(savedInstanceState);
	}
	
	@Override
	protected void onStart() {
		super.onStart();
	}

	@Override
	protected void onRestart() {
		super.onRestart();
	}

	@Override
	protected void onResume() {
		super.onResume();
	}

	@Override
	protected void onPause() {
		super.onPause();
	}

	@Override
	protected void onStop() {
		super.onStop();
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
	}


	@Override
	public void onLoad() {
		super.onLoad();////
	}
	
	@Override
	public void onDatabinding() {
		super.onDatabinding();
	}
	
	public void actionGetAppList(View control, UMEventArgs args) {
  super.actionGetAppList(control,args);
}
public void actionInitMainView(View control, UMEventArgs args) {
  super.actionInitMainView(control,args);
}
public void actionToSet(View control, UMEventArgs args) {
  super.actionToSet(control,args);
}
public void actionToHome(View control, UMEventArgs args) {
  super.actionToHome(control,args);
}
public void actionToDiscovery(View control, UMEventArgs args) {
  super.actionToDiscovery(control,args);
}
public void actionAppsCallback(View control, UMEventArgs args) {
  super.actionAppsCallback(control,args);
}


}