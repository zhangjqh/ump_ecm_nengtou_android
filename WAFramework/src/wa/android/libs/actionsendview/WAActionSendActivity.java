package wa.android.libs.actionsendview;

import wa.android.common.R;
import wa.android.libs.emailview.WAPubliceEmailIntentActivity;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class WAActionSendActivity extends Activity{
	
	private TextView textView1,textView2,textView3,textView4;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		init();
	}

	private void init() {
		setContentView(R.layout.activity_actionsend);
		textView1 = (TextView) findViewById(R.id.textView1);
		textView2 = (TextView) findViewById(R.id.textView2);
		textView3 = (TextView) findViewById(R.id.textView3);
		textView4 = (TextView) findViewById(R.id.textView4);
		textView2.setVisibility(View.GONE);
		textView3.setText(getString(R.string.cancel));
		textView3.setClickable(true);
		textView3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				WAActionSendActivity.this.finish();
			}
		});
		String type = getIntent().getStringExtra("type");
		
		if(type.equals("MAIL")){
			textView1.setClickable(true);
			textView1.setText(getString(R.string.email));
			textView1.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					 String Email =  getIntent().getStringExtra("mail");
					if (!Email.trim().equals("")){
					String[] emailList = { new String(
							Email) };
					Intent emailintent = new Intent();
					emailintent.setClass(WAActionSendActivity.this, WAPubliceEmailIntentActivity.class);
					Bundle emailbundle = new Bundle();
					emailbundle.putStringArray("emailreciever",emailList);
					emailintent.putExtras(emailbundle);
					startActivity(emailintent);}
				}
			});
		}else if(type.equals("TELPHONE")){
			textView1.setClickable(true);
			textView1.setText(getString(R.string.telephone));
			textView1.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					 String phoneNumber =getIntent().getStringExtra("phone");
					if (phoneNumber != null&& !"".equals(phoneNumber.trim())) {
					
						Intent intent = new Intent(
								Intent.ACTION_CALL,
								Uri.parse("tel:"
										+ phoneNumber));
						startActivity(intent);
				}
				}
			});
		}else if(type.equals("CELLPHONE")){
			textView1.setClickable(true);
			textView1.setText(getString(R.string.cellphone));
			textView1.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					 String phoneNumber =getIntent().getStringExtra("phone");
					if (phoneNumber != null&& !"".equals(phoneNumber.trim())) {
					
						Intent intent = new Intent(
								Intent.ACTION_CALL,
								Uri.parse("tel:"
										+ phoneNumber));
						startActivity(intent);
				}
				}
			});
			textView2.setVisibility(View.VISIBLE);
			textView2.setText(getString(R.string.message));
			textView2.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					 String phoneNumber =getIntent().getStringExtra("phone");
						if (phoneNumber != null&& !"".equals(phoneNumber.trim())) {
							Uri smsToUri = Uri
									.parse("smsto:"
											+ String.valueOf(phoneNumber));// 联系人地址

							Intent mIntent = new Intent(
									android.content.Intent.ACTION_SENDTO,
									smsToUri);

							mIntent.putExtra(
									"sms_body",
									"");// 短信的内容

							startActivity(mIntent);
				}}
			});
			
			

		}else if(type.equals("WEBADDRESS")){
			textView1.setClickable(true);
			textView1.setText("打开网址");
			textView1.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					 String webAddress =getIntent().getStringExtra("html");
			        Intent it = new Intent(Intent.ACTION_VIEW, Uri.parse(webAddress));
			        it.setClassName("com.android.browser", "com.android.browser.BrowserActivity");
			        it.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
			        getBaseContext().startActivity(it);
				}
			});

		}
		else if(type.equals("CELLPHONE_PHONE")){
			textView1.setClickable(true);
			textView1.setText(getString(R.string.cellphone));
			textView1.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					 String phoneNumber =getIntent().getStringExtra("cellphone");
						if (phoneNumber != null&& !"".equals(phoneNumber.trim())) {
						
							Intent intent = new Intent(
									Intent.ACTION_CALL,
									Uri.parse("tel:"
											+ phoneNumber));
							startActivity(intent);
				}
				}
			});
			textView2.setVisibility(View.VISIBLE);
			textView2.setText(getString(R.string.message));
			textView2.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					 String phoneNumber =getIntent().getStringExtra("cellphone");
						if (phoneNumber != null&& !"".equals(phoneNumber.trim())) {
							Uri smsToUri = Uri
									.parse("smsto:"
											+ String.valueOf(phoneNumber));// 联系人地址

							Intent mIntent = new Intent(
									android.content.Intent.ACTION_SENDTO,
									smsToUri);

							mIntent.putExtra(
									"sms_body",
									"");// 短信的内容

							startActivity(mIntent);
				}}
			});
			
			textView4.setVisibility(View.VISIBLE);
			textView4.setText(getString(R.string.telephone));
			textView4.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					 String phoneNumber =getIntent().getStringExtra("phone");
					if (phoneNumber != null&& !"".equals(phoneNumber.trim())) {
					
						Intent intent = new Intent(
								Intent.ACTION_CALL,
								Uri.parse("tel:"
										+ phoneNumber));
						startActivity(intent);
				
				
				}}
			});
		}
	}

}
