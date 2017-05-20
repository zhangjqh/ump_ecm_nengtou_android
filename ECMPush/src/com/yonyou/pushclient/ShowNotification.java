
/**   
 * @Title: showNotification.java 
 * @Package: com.yonyou.pushclient 
 * @Description: TODO
 * @author Administrator  
 * @date 2014-10-24 上午10:14:52 
 * @version 1.3.1 
 */


package com.yonyou.pushclient;

import java.net.URL;
import java.sql.Connection;
import com.yonyou.protocol.NotificationActivity;
import com.yonyou.protocol.NotifyAndMsg;
import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.Html;
import android.text.Html.ImageGetter;
import android.text.Spanned;
import android.text.TextUtils.TruncateAt;
import android.text.method.ScrollingMovementMethod;
import android.text.util.Linkify;
import android.widget.LinearLayout;
import android.widget.TextView;

/** 
 *
 * @package com.yonyou.pushclient
 * @author huangbq
 * @date 2014-10-24 上午10:14:52 
 */

public class ShowNotification extends NotificationActivity {
	
	/** Notification 显示TextView*/
	public TextView showNotf;
	/** 界面TextView显示的内容 */
	public Spanned textHtml;
	/** Handler*/
	@SuppressLint("HandlerLeak")
	public Handler textHandler = new Handler() {

		@Override
		public void handleMessage(Message msg) {
			
			if (0x123 == msg.what) {
				// 收到消息，更新显示内容
				showNotf.setText(textHtml);
			}
		}
		
	};

	@SuppressLint("SimpleDateFormat") @Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		// 创建一个线性布局管理器
		LinearLayout linearLayout = new LinearLayout(this);
		super.setContentView(linearLayout);
		// 获取应用名
		String appName = (String) this.getTitle();
	
//		String appName = this.getString(R.string.app_name);
		linearLayout.setOrientation(LinearLayout.VERTICAL);
		// 创建一个TextView对象
		showNotf = new TextView(this);

		linearLayout.addView(showNotf);

		// 自动转换可单击超链接
//		showNotf.setAutoLinkMask(Linkify.ALL);
		showNotf.setAutoLinkMask(Linkify.PHONE_NUMBERS);
		// 内容过长时滚动显示
		showNotf.setEllipsize(TruncateAt.MARQUEE);
		// 获取当前通知
		NotifyAndMsg notify = null;
		if(null != PushServiceManager.getServiceOnlineReceiver()) {
			notify = PushServiceManager
					.getServiceOnlineReceiver().getNotifyById(String.valueOf(getNotifyId()));
			if (null != notify) {
//				SimpleDateFormat sDateFormat = new SimpleDateFormat("yyyy年MM月dd日  HH:mm:ss");
				showNotf.clearAnimation();
				String html ="<p>" + appName + "</p>" +
						"<p>通知ID: " + notify.getMsgDetailId() + "</p>"
						+"<p>通知标题： " + notify.getSubject() + "</p>" 
						+"<p>通知内容： " + notify.getContent() + "</p>"
//						+"<p>通知时间： " + sDateFormat.format(new Date()) + "</p>"
						;
				// 滚动
				showNotf.setMovementMethod(ScrollingMovementMethod.getInstance());
				setTextHtml(html);
			}
		}
		
	}

	 
	/** 
	 * 
	 * @param url
	 * @return
	 * @author huangbq
	 * @data 2014-12-31 下午4:52:03 
	 */
	  	
	protected Connection getURLConnection(URL url) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
	}
	
	 
	/** 
	 * 将HTML串处理为Spanned对象
	 * @param html
	 * @author huangbq
	 * @data 2015-1-6 上午10:09:54 
	 */
	  	
	public void setTextHtml(final String html) {
		Thread textHtmlThread = new Thread(new Runnable() {			
			@Override
			public void run() {
				
				textHtml = Html.fromHtml(html,new ImageGetter() {							
					@Override
					public Drawable getDrawable(String source) {
						Drawable drawable = null;   
				            try {  
				                drawable = Drawable.createFromStream(new URL(source).openStream(), "image.jpg");  //获取网路图片  
				            } catch (Exception e) {    
				                System.out.println("获取图片失败：" + e.toString());    
				            }  
				            if (null != drawable) {
				            	drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable  
				                          .getIntrinsicHeight());
				            } else {
				            	System.out.println("获取图片失败.");
				            }
						return drawable ;
					}
				}, null);	
				// 发送更新通知
				textHandler.sendEmptyMessage(0x123);				
			}
		});
		textHtmlThread.start();
	}
	 	
}
