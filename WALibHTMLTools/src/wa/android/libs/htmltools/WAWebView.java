package wa.android.libs.htmltools;


import wa.android.libs.htmltools.data.HtmlDataVO;
import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebSettings;
import android.webkit.WebView;

/**
 * @author damilong
 *
 */
@SuppressLint("SetJavaScriptEnabled")
public class WAWebView extends WebView {

	public WAWebView(Context context) {
		super(context);
	}
	
	
	public WAWebView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	public void init(HtmlDataVO data) {
		if(data != null){
		WebSettings settings=this.getSettings();
		settings.setJavaScriptEnabled(true);  //javaScript����
		settings.setUseWideViewPort(true); 
		settings.setLoadWithOverviewMode(true);
		settings.setSupportZoom(true);
		settings.setBuiltInZoomControls(true);
		settings.setDefaultTextEncodingName("gb2312");
		settings.setTextSize(WebSettings.TextSize.LARGEST);
		this.clearCache(false);
		if (data.getHtmlFilePath() != null) {
			loadUrl("file:///" + data.getHtmlFilePath().substring(1));
		}}
	}
}
