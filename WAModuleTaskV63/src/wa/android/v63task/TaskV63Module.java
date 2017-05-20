package wa.android.v63task;

import android.content.Context;

import wa.android.common.Module;
import wa.android.common.network.WARequestVO;

public class TaskV63Module extends Module {

    public TaskV63Module(String moduleName, Class mainClazz) {
		super(moduleName, mainClazz);
	}
    
    @Override
    public void onLoginSuccessfully(WARequestVO actionVO, Context context) {
    	// TODO Auto-generated method stub
    	super.onLoginSuccessfully(actionVO, context);
    }
}
