package wa.android.libs.dragBtnFieldView;


import android.content.Context;
import android.graphics.Canvas;
import android.inputmethodservice.Keyboard;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.view.View.OnFocusChangeListener;
import android.view.inputmethod.InputMethodManager;




public class DragBtnFieldView extends RelativeLayout  {

	DragBtnFieldViewAdapter<?> adapter = null;
	
	Handler h = new Handler(){
		public void handleMessage(Message msg){
			if (msg.what == 1) {
				int itemCount = DragBtnFieldView.this.getChildCount();
				for (int i = 0; i < itemCount; i++) {
					View view = DragBtnFieldView.this.getChildAt(i);
					Log.d("requestLayout", "Width:" + view.getWidth());
					Log.d("requestLayout", "Height:" + view.getHeight());
					Log.d("requestLayout", "pX:" + pX);
					Log.d("requestLayout", "pY:" + pY);
				
					Log.d("requestLayout", "=====================");
					
					int left = pX;
					//If �Ų�������������
					if (left + view.getWidth() > DragBtnFieldView.this.getWidth()) {
						//����
						pX = 0;
						pY += view.getHeight();
					}
					LayoutParams lm = (LayoutParams) view.getLayoutParams();
					lm.setMargins(pX, pY, 0, 0);
					view.setLayoutParams(lm);
					pX += view.getWidth();	
					if( i == 1 && pX == 0 && pY == 0) {
						this.sendEmptyMessage(1);
						return;
					}
				}
			} else if (msg.what == 2) {
				
			}

		}
	
	};
	
	
	public DragBtnFieldView(Context context, AttributeSet attrs) {
		super(context, attrs);
		
	}

	private int pX = 0;
	private int pY = 0;
	
	private void clear(){
		pX = 0;
		pY = 0;
		this.removeAllViews();
	}
	
	private void requestLayout0(){
		clear();
		
		int itemCount = adapter.getCount();
		for (int i = 0; i < itemCount; i++) {
			View view = adapter.getView(i, null, null);
			view.setFocusable(true);
			FocusChangeListener l = new FocusChangeListener(adapter, adapter.arrayList.get(i));
//			view.setOnFocusChangeListener(l);
			view.setOnKeyListener(l);
//			view.setOnClickListener(l);
			this.addView(view);
		}
		h.sendEmptyMessage(1);
	}
	
	protected void notifyDataSetChanged(){
		requestLayout0();
	}
	
	
	public void setDragBtnFieldViewAdapter(DragBtnFieldViewAdapter<?> adapter){
		this.adapter = adapter;
		adapter.btnFieldView = this;
		notifyDataSetChanged();
	}

	interface DragBtnFieldViewListener{
		public void onBtnDeletedAction(int position);
	}

	class FocusChangeListener implements OnFocusChangeListener, OnKeyListener, OnClickListener {
		Object obj = null;
		DragBtnFieldViewAdapter adapter = null;
		FocusChangeListener(DragBtnFieldViewAdapter adapter, Object obj){
			this.adapter = adapter;
			this.obj = obj;
		}
		@Override
		public void onFocusChange(final View v, boolean hasFocus) {
			if (hasFocus) {
				Handler h2 = new Handler(){
					public void handleMessage(Message msg){
						 InputMethodManager imm = (InputMethodManager) getContext().getSystemService(Context.INPUT_METHOD_SERVICE);
						 imm.hideSoftInputFromWindow(v.getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);
						 imm.showSoftInput(v, InputMethodManager.SHOW_FORCED);
					}
				};
//				h2.sendEmptyMessage(1);

			}
		}
		@Override
		public boolean onKey(View v, int keyCode, KeyEvent event) {
			if (keyCode == KeyEvent.KEYCODE_BACK ||
					keyCode == KeyEvent.KEYCODE_DEL) {
				adapter.arrayList.remove(obj);
				adapter.notifyDataSetChanged();
			} else {
				return false;
			}
			return true;
		}
		@Override
		public void onClick(View v) {
			onFocusChange(v, true);
			
		}
	}
	


}
