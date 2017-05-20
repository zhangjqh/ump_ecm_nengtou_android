package wa.android.libs.btnFieldView;

import wa.android.common.utils.DensityUtil;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.RelativeLayout;




public class BtnFieldView extends RelativeLayout  {
	Context context ;
	BtnFieldViewAdapter<?> adapter = null;
	
	Handler h = new Handler(){
		public void handleMessage(Message msg){
			if (msg.what == 1) {
				int itemCount = BtnFieldView.this.getChildCount();
				for (int i = 0; i < itemCount; i++) {
					View view = BtnFieldView.this.getChildAt(i);
					Log.d("requestLayout", "Width:" + view.getWidth());
					Log.d("requestLayout", "Height:" + view.getHeight());
					Log.d("requestLayout", "pX:" + pX);
					Log.d("requestLayout", "pY:" + pY);
				
					Log.d("requestLayout", "=====================");
					
					int left = pX;
					//If �Ų�������������
					if (left + view.getWidth() > BtnFieldView.this.getWidth()) {
						//����
						pX = 0;
						pY += view.getHeight();
					}
					LayoutParams lm = (LayoutParams) view.getLayoutParams();
					lm.setMargins(pX, pY, 0, 0);
					view.setLayoutParams(lm);
					//view.setBackgroundColor(Color.TRANSPARENT);

					GradientDrawable drawable = new GradientDrawable();  
					drawable.setStroke(1, Color.GRAY); // 边框粗细及颜色   
					drawable.setColor(Color.WHITE); // 边框内部颜色   
					drawable.setCornerRadius(DensityUtil.dip2px(context, 10));
					
					view.setBackgroundDrawable(drawable);
					
					MyOnClickListener myClick = new MyOnClickListener(BtnFieldView.this, i);
					view.setOnClickListener(myClick);
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
	
	
	public BtnFieldView(Context context, AttributeSet attrs) {
		super(context, attrs);
		this.context = context;
		
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
			/*view.setFocusable(true);
			FocusChangeListener l = new FocusChangeListener(adapter, adapter.arrayList.get(i));
			view.setOnFocusChangeListener(l);
			view.setOnKeyListener(l);
			view.setOnClickListener(l);*/
			view.setFocusable(false);
			this.addView(view);
		}
		h.sendEmptyMessage(1);
	}
	
	protected void notifyDataSetChanged(){
		requestLayout0();
	}
	
	
	public void setBtnFieldViewAdapter(BtnFieldViewAdapter<?> adapter){
		this.adapter = adapter;
		adapter.btnFieldView = this;
		//notifyDataSetChanged();
	}

	interface BtnFieldViewListener{
		public void onBtnDeletedAction(int position);
	}

	class FocusChangeListener implements OnFocusChangeListener, OnKeyListener, OnClickListener {
		Object obj = null;
		BtnFieldViewAdapter adapter = null;
		FocusChangeListener(BtnFieldViewAdapter adapter, Object obj){
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
	class MyOnClickListener implements OnClickListener{
		int position = 0;
		BtnFieldView btnFileView;
		public MyOnClickListener(BtnFieldView btnFileView,int position){
			this.position = position;
			this.btnFileView = btnFileView;
			
		}
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			new AlertDialog.Builder(context).setMessage("是否确定删除")
			.setPositiveButton("确定", new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int which) {
					btnFileView.removeViewAt(position);
					adapter.arrayList.remove(position);
					setBtnFieldViewAdapter(adapter);
					notifyDataSetChanged();
					//h.sendEmptyMessage(1);
					
				}
			}).setNegativeButton("取消", new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int which) {
					// TODO Auto-generated method stub
					
				}
			}).show();
			
		}
		
	}


}
