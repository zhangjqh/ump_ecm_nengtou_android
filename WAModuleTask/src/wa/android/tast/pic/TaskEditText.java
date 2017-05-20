package wa.android.tast.pic;
import android.content.Context;  
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;  
import android.text.Spannable;  
import android.text.SpannableString;  
import android.text.style.ImageSpan;  
import android.util.AttributeSet;  
import android.widget.EditText;
import wa.android.app.task.R;

public class TaskEditText extends EditText {

private String str ;
	  

	    public TaskEditText(Context context) {  
	        super(context);  
	    }  
	    public TaskEditText(Context context, AttributeSet attrs) {  
	        super(context, attrs);  
	    }  
	    public void insertDrawable(int id ,SpannableString ss) { 
	    	str = ss.toString();
	        //得到drawable对象，即所要插入的图片  
	        Drawable d = getResources().getDrawable(id);  
	        d.setBounds(0, 0, d.getIntrinsicWidth(), d.getIntrinsicHeight());  
	        //用这个drawable对象代替字符串easy  
	        ImageSpan span = new ImageSpan(d, ImageSpan.ALIGN_BASELINE);  
	        //包括0但是不包括"easy".length()即：4。[0,4)。值得注意的是当我们复制这个图片的时候，实际是复制了"easy"这个字符串。  
	        ss.setSpan(span, 0, ss.length(), Spannable.SPAN_INCLUSIVE_EXCLUSIVE);  
	        append(ss);  
	    }  
	    @Override
	    public void onDraw(Canvas canvas  ) {   
	        // 首先定义一个paint   
	        Paint paint = new Paint();   

	           
	        // 绘空心矩形   
	        // 设置颜色   
	       paint.setColor(Color.RED);   
	        // 设置样式-空心矩形   
	        paint.setStyle(Style.STROKE);   
	       // 绘制一个矩形   
	        canvas.drawRect(new Rect(10, 10, 50, 20), paint);   
	  
	        // 绘文字   
	        canvas.drawText(str, 30, 30, paint);   
	           
	        // 绘图   
	        // 从资源文件中生成位图   
	        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.search_bar_edit_normal);   
	        // 绘图   
	        canvas.drawBitmap(bitmap, 10, 10, paint);   
	    }  

	  

}
