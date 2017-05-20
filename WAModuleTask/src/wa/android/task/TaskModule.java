package wa.android.task;

import android.content.Context;

import wa.android.common.Module;
import wa.android.common.network.WARequestVO;

public class TaskModule extends Module {

    public TaskModule(String moduleName, Class mainClazz) {
		super(moduleName, mainClazz);
	}
    
	@Override
	public void onLoginSuccessfully(WARequestVO actionVO, Context context) {
		super.onLoginSuccessfully(actionVO, context);
    }
}
