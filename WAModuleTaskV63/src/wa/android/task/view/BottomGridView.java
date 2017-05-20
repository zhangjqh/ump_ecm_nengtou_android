package wa.android.task.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.view.Gravity;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.wamoduletaskv63.R;
public class BottomGridView extends RelativeLayout
{
    private boolean haveScrollbar = false;    
	private Context context;
	private ImageView btn;
	private ImageView image;
	private TextView textView;
	private String code;
	private int count;
	public BottomGridView(Context context,int count)
	{
		super(context);
		this.count =count;
		this.context=context;
		LinearLayout linearLayout = new LinearLayout(context);
		linearLayout.setOrientation(LinearLayout.VERTICAL);
		linearLayout.setGravity(Gravity.CENTER);
		int width = ((WindowManager) context.getSystemService(Context.WINDOW_SERVICE)).getDefaultDisplay().getWidth();
		if(width>=1000){
			linearLayout.setLayoutParams(new LayoutParams(1080/count, 150));
		}
		else if(width >= 640){
			linearLayout.setLayoutParams(new LayoutParams(720/count, 100));
		}else{
			linearLayout.setLayoutParams(new LayoutParams(480/count, 67));	
		}
//		LayoutInflater.from(context).inflate(R.layout.item_bottomgrid, this, true);
		btn=new ImageView(context);
		btn.setScaleType(ScaleType.CENTER_INSIDE);
//				(ImageView)findViewById(R.id.button);
		LayoutParams	btnlayout = new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
		//btnlayout.addRule(LinearLayout.CENTER_HORIZONTAL);
		btnlayout.topMargin=10;
		btn.setId(1);
		linearLayout.addView(btn,btnlayout);
		textView = new TextView(context);
		textView.setTextColor(Color.BLACK);
		LayoutParams	textViewlayout = new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
		//textViewlayout.addRule(RelativeLayout.BELOW, 1);
		//textViewlayout.addRule(RelativeLayout.CENTER_HORIZONTAL);
		//textViewlayout.topMargin=5;
		textView.setTextSize(10);
		linearLayout.addView(textView,textViewlayout);
		addView(linearLayout);
		
		//btn = (ImageView)findViewById(R.id.item_bottomgrid_image);
		//textView = (TextView) findViewById(R.id.item_bottomgrid_text);
	}
	
	public void setFocused()
	{
//		setBackgroundResource(R.drawable.bottom_btn_touch);
//		setBackgroundResource(R.drawable.customerlist_bottombutton);
	}
	public void clearFocus()
	{
		setBackgroundResource(0);
	}

	public String getText() {
		return textView.getText().toString();
	}

	public void setText(String text) {
		this.textView.setText(text);
	}

	public void setColor(int color) {
		textView.setTextColor(color);
	}

	//	public void setText(String s)
//	{
//		btn.setText(s);
//	}
	public void setImage(int resid)
	{
		btn.setImageResource(resid);
	}
	 /**  
     * 设置是否有ScrollBar，当要在ScollView中显示时，应当设置为false。 默认为 true  
     *   
     * @param haveScrollbars  
     */    
    public void setHaveScrollbar(boolean haveScrollbar) {    
        this.haveScrollbar = haveScrollbar;    
    }    
    
    @Override    
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {    
        if (haveScrollbar == false) {    
            int expandSpec = MeasureSpec.makeMeasureSpec(Integer.MAX_VALUE >> 2, MeasureSpec.AT_MOST);    
            super.onMeasure(widthMeasureSpec, expandSpec);    
        } else {    
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);    
        }    
    }

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}    
}
