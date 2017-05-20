package wa.android.libs.emailview;

import java.util.ArrayList;
import java.util.List;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.Toast;
import wa.android.common.R;



/**
 * @author damilong
 * Emailfilter
 * 用于邮件应用的过滤
 */
public class WAPubliceEmailIntentActivity extends Activity{
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Bundle bundle = getIntent().getExtras();
		String[] emailreciever = bundle.getStringArray("emailreciever");
		String emailcontent = bundle.getString("emailcontent");
		String emailsubject = bundle.getString("emailsubject");
		getEmailIntent(emailreciever,emailcontent,emailsubject);
	}
	/**
	 * @return 
	 * @params
	 * emailreciever 收件人 (String[])
	 * emailcontent 邮件内容
	 * emailsubject 邮件主题
	 * @return
	 * Intent chooserIntent
	 */
//	private static Intent emailIntent;
		public   void getEmailIntent(String [] emailreciever,String emailcontent , String emailsubject){
			boolean emailFlag = false;
			// TODO Auto-generated method stub
			Intent emailIntent = new Intent(android.content.Intent.ACTION_SEND);
			emailIntent.setType("text/plain");
			List<ResolveInfo> resInfo = getPackageManager().queryIntentActivities(emailIntent, 0);
			Intent chooserIntent = new Intent();   
              if(!resInfo.isEmpty()){
                  List<Intent>targetedShareIntents =  new ArrayList<Intent>();
                  for(ResolveInfo info :resInfo){
                      Intent targeted = new Intent(Intent.ACTION_SEND);
                      targeted.setType("text/plain");
                      ActivityInfo activityInfo = info.activityInfo;

                      if(activityInfo.packageName.contains("gm")||
                              activityInfo.name.contains("mail")){
                    	  emailFlag = true;
                    	  //设置邮件信息：收件人、邮件内容、邮件标题
                    	  targeted .putExtra(Intent.EXTRA_EMAIL,emailreciever);
                    	  if(emailcontent != null){
                    		  targeted.putExtra(Intent.EXTRA_TEXT,emailcontent); }
                    	  if(emailsubject != null){
                    	  targeted. putExtra(android.content.Intent.EXTRA_SUBJECT, emailsubject);}
                      }
                      else{
                    	  continue;
                      }
                	  targeted.setPackage(activityInfo.packageName);
                	  targetedShareIntents.add(targeted);
                  }
                  if(emailFlag){
                  chooserIntent = Intent.createChooser(targetedShareIntents.remove(0),getString(R.string.choose_mail));
                  chooserIntent.putExtra(Intent.EXTRA_INITIAL_INTENTS, 
                          targetedShareIntents.toArray(new Parcelable[]{}));
                  try{
                      startActivity(chooserIntent);
                      finish();
                  }catch(android.content.ActivityNotFoundException ex){
                       Toast.makeText(this, "没找到邮件的应用", Toast.LENGTH_SHORT).show();                         
                  }  
                  }
                  else{
                	  Toast.makeText(this, "没找到邮件的应用", Toast.LENGTH_SHORT).show();     
                	  finish();
                  }

              }
		}

}

