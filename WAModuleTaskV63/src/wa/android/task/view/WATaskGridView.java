package wa.android.task.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.GridView;

public class WATaskGridView extends GridView {    
    
    private boolean haveScrollbar = false;    
    
    public WATaskGridView(Context context) {    
        super(context);    
    }    
    
    public WATaskGridView(Context context, AttributeSet attrs) {    
        super(context, attrs);    
    }    
    
    public WATaskGridView(Context context, AttributeSet attrs, int defStyle) {    
        super(context, attrs, defStyle);    
    }    
    
    //通过重新dispatchTouchEvent方法来禁止滑动
    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
    	//TODO Auto-generated method stub
    		if(ev.getAction() == MotionEvent.ACTION_MOVE){
    			return true;//禁止Gridview进行滑动
    		}
    			return super.dispatchTouchEvent(ev);
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
}  
