package wa.android.task.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ScrollView;

public class V63TaskScrollView  extends ScrollView {

	private boolean istouchingchild = false ;
	public V63TaskScrollView(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}


    public V63TaskScrollView(Context context, AttributeSet attrs,
                    int defStyle) {
            super(context, attrs, defStyle);
            // TODO Auto-generated constructor stub
    }

    public V63TaskScrollView(Context context, AttributeSet attrs) {
            super(context, attrs);
            // TODO Auto-generated constructor stub
    }

	   @Override
       public boolean arrowScroll(int direction) {
               // TODO Auto-generated method stub
               return super.arrowScroll(direction);
       }

       @Override
       public boolean onTouchEvent(MotionEvent ev) {
               // TODO Auto-generated method stub
    	   if(istouchingchild)
    		   return false;
    	   else
               return super.onTouchEvent(ev);
       }
	public boolean isIstouchingchild() {
		return istouchingchild;
	}
	public void setIstouchingchild(boolean istouchingchild) {
		this.istouchingchild = istouchingchild;
	}
}
