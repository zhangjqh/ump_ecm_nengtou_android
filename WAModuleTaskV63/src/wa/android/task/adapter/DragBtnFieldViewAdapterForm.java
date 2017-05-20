package wa.android.task.adapter;

import java.util.ArrayList;

import wa.android.libs.dragBtnFieldView.DragBtnFieldView;
import wa.android.libs.dragBtnFieldView.DragBtnFieldViewAdapter;
import wa.android.task.view.V63TaskScrollView;
import wa.android.task.vo.TaskUserVO;
import android.content.Context;
import android.graphics.PixelFormat;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalFocusChangeListener;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnTouchModeChangeListener;
import android.view.WindowManager;
import android.view.View.OnTouchListener;
import android.view.WindowManager.LayoutParams;
import android.widget.Button;
import android.widget.EditText;

@SuppressWarnings("rawtypes")
public class DragBtnFieldViewAdapterForm extends DragBtnFieldViewAdapter {
	private int startX;
	private int startY;
	private WindowManager mWindowManager;
	private WindowManager.LayoutParams params;
	private Button moveView;
	private ArrayList<wa.android.task.vo.TaskUserVO> arrayList;
	public int displayWidth;
	public int displayHeight;
	private DragBtnFieldView btnFieldView;
	private Context context;
	private V63TaskScrollView scrollView;
	private boolean istouching =false;

	@SuppressWarnings("unchecked")
	public DragBtnFieldViewAdapterForm(Context context,
			ArrayList<TaskUserVO> arrayList, WindowManager mWindowManager,
			DragBtnFieldView btnFieldView, V63TaskScrollView scrollView) {
		super(context, arrayList);
		this.arrayList = arrayList;
		this.context = context;
		this.mWindowManager = mWindowManager;
		this.btnFieldView = btnFieldView;
		this.scrollView = scrollView;
		DisplayMetrics dm = new DisplayMetrics();
		mWindowManager.getDefaultDisplay().getMetrics(dm);
		displayWidth = dm.widthPixels;
		displayHeight = dm.heightPixels;
		initWindowManagerParam();
	
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		TaskUserVO user = (TaskUserVO) arrayList.get(position);
		EditText2 et2 = new EditText2(context, user.getPsnName());
		Log.d("requestLayout", "Num:" + position);
		Log.d("requestLayout", "content:" + user.getPsnName());
		et2.setOnTouchListener(touchListener);
		return et2;

	}

	private void initWindowManagerParam() {
		params = new LayoutParams();
		params.type = LayoutParams.FIRST_SUB_WINDOW;
//		params.type= LayoutParams.TYPE_APPLICATION_ATTACHED_DIALOG ;
		params.format = PixelFormat.TRANSLUCENT;
		params.flags = LayoutParams.FLAG_NOT_TOUCH_MODAL
				| LayoutParams.FLAG_NOT_FOCUSABLE;
		params.width = LayoutParams.WRAP_CONTENT;
		params.height = LayoutParams.WRAP_CONTENT;
		params.gravity = Gravity.LEFT | Gravity.TOP;
		
	scrollView .getViewTreeObserver().addOnGlobalLayoutListener(new OnGlobalLayoutListener() {
		
		@Override
		public void onGlobalLayout() {
			// TODO Auto-generated method stub

			// TODO Auto-generated method stub

			// TODO Auto-generated method stub
			if(istouching){
				scrollView.setIstouchingchild(false);
				int[] moveviewlocation = new int[2];
				moveView.getLocationOnScreen(moveviewlocation);
				if (!(moveviewlocation[0] == 0 && 0 == moveviewlocation[1])) {
					int flag = 0;
					int[] initlocation = new int[2];
					btnFieldView.getChildAt(0)
							.getLocationOnScreen(initlocation);
					int value = Math.abs(initlocation[0] - moveviewlocation[0])
							+ Math.abs(initlocation[1] - moveviewlocation[1]);
					for (int i = 1; i < btnFieldView.getChildCount(); i++) {
						View childview = btnFieldView.getChildAt(i);
						int[] location = new int[2];
						childview.getLocationOnScreen(location);
						flag = value < (Math.abs(location[0]
								- moveviewlocation[0]) + Math.abs(location[1]
								- moveviewlocation[1])) ? flag : i;
						value = value < (Math.abs(location[0]
								- moveviewlocation[0]) + Math.abs(location[1]
								- moveviewlocation[1])) ? value : (Math
								.abs(location[0] - moveviewlocation[0]) + Math
								.abs(location[1] - moveviewlocation[1]));

					}
					TaskUserVO tmpuser = new TaskUserVO();
					for (int i = 0; i < arrayList.size(); i++) {
						if (moveView.getText().toString()
								.equals(arrayList.get(i).getPsnName())) {
							tmpuser = arrayList.get(i);
							arrayList.remove(i);
							break;
						}
					}
					arrayList.add(flag, tmpuser);
					for (int i = 0; i < btnFieldView.getChildCount(); i++) {
						View childview = btnFieldView.getChildAt(i);
						childview.setOnTouchListener(touchListener);
					}
				}
				mWindowManager.removeView(moveView);
				notifyDataSetChanged();
				istouching = false;
			}
		
		
		}
	});   
	}

	public OnTouchListener touchListener = new OnTouchListener() {
		@Override
		public boolean onTouch(View view, MotionEvent event) {
//			int x = (int) event.getRawX();
//			int y = (int) event.getRawY();
//			int[] btnFieldlocation = new int[2];
//			btnFieldView.getLocationOnScreen(btnFieldlocation);
//			int maxwidth =btnFieldlocation[0]+btnFieldView.getWidth();
//			int maxheight = btnFieldlocation[1]+btnFieldView.getHeight();
//			int action = event.getAction();
//			if( event.getRawX()<btnFieldlocation[0]+10){
//				x = btnFieldlocation[0]+10;
//			}else if( event.getRawX()>maxwidth - 10){
//				x = maxwidth - 10;
//			}
//			if( event.getRawX()<btnFieldlocation[1]+5){
//				y = btnFieldlocation[1]+5;
//			}else if( event.getRawX()>maxheight - 5){
//				y = maxwidth - 5;
//			}
//			Log.w("onTouch", "---------> x: " + x + " y: " + y);
//			switch (action) {
//			case MotionEvent.ACTION_DOWN:
//				istouching = true;
//				scrollView.setIstouchingchild(true);
//				startX = (int) event.getX();
//				startY = y - view.getTop();
//				Log.i("ACTION_DOWN", "---------> startX: " + startX
//						+ " startY: " + startY);
//				view.setVisibility(View.INVISIBLE);
//				initMoveView(view, x - view.getWidth(), x - view.getWidth());
//				mWindowManager.updateViewLayout(moveView, params);
//				break;
//
//			case MotionEvent.ACTION_MOVE:
//				params.x = x - view.getWidth()/2;
//				params.y = y - view.getHeight()/2;
//				
//				Log.i("ACTION_MOVE", "---------> startX: " +params.x
//						+ " startY: " + params.x);
////				if(params.x>btnFieldlocation[0]&& params.x< maxwidth&&params.y <maxheight&&params.y>btnFieldlocation[1])
////				{
//					mWindowManager.updateViewLayout(moveView, params);
////				}
//				break;
//			case MotionEvent.ACTION_UP:
//				istouching = false;
//				scrollView.setIstouchingchild(false);
//				int[] moveviewlocation = new int[2];
//				moveView.getLocationOnScreen(moveviewlocation);
//				if (!(moveviewlocation[0] == 0 && 0 == moveviewlocation[1])) {
//					int flag = 0;
//					int[] initlocation = new int[2];
//					btnFieldView.getChildAt(0)
//							.getLocationOnScreen(initlocation);
//					int value = Math.abs(initlocation[0] - moveviewlocation[0])
//							+ Math.abs(initlocation[1] - moveviewlocation[1]);
//					for (int i = 1; i < btnFieldView.getChildCount(); i++) {
//						View childview = btnFieldView.getChildAt(i);
//						int[] location = new int[2];
//						childview.getLocationOnScreen(location);
//						flag = value < (Math.abs(location[0]
//								- moveviewlocation[0]) + Math.abs(location[1]
//								- moveviewlocation[1])) ? flag : i;
//						value = value < (Math.abs(location[0]
//								- moveviewlocation[0]) + Math.abs(location[1]
//								- moveviewlocation[1])) ? value : (Math
//								.abs(location[0] - moveviewlocation[0]) + Math
//								.abs(location[1] - moveviewlocation[1]));
//
//					}
//					TaskUserVO tmpuser = new TaskUserVO();
//					for (int i = 0; i < arrayList.size(); i++) {
//						if (moveView.getText().toString()
//								.equals(arrayList.get(i).getPsnName())) {
//							tmpuser = arrayList.get(i);
//							arrayList.remove(i);
//							break;
//						}
//					}
//					arrayList.add(flag, tmpuser);
//					for (int i = 0; i < btnFieldView.getChildCount(); i++) {
//						View childview = btnFieldView.getChildAt(i);
//						childview.setOnTouchListener(touchListener);
//					}
//				}
//				mWindowManager.removeView(moveView);
//				notifyDataSetChanged();
//				break;
//			}
			// btnFieldView.getChildAt(btnFieldView.getChildCount() - 1)
			 view.requestFocus();
			return false;
		}

	};

	private void initMoveView(View view, int x, int y) {
//		int[] btnFieldlocation = new int[2];
//		btnFieldView.getLocationOnScreen(btnFieldlocation);
//		int maxwidth =btnFieldlocation[0]+btnFieldView.getWidth();
//		int maxheight = btnFieldlocation[1]+btnFieldView.getHeight();
//		Log.i("ACTION_MOVE", "---------> startX: " +params.x
//				+ " startY: " + params.x);
//		if(params.x>btnFieldlocation[0]&& params.x< maxwidth&&params.y <maxheight&&params.y>btnFieldlocation[1])
//		{	
			EditText text = (EditText) view;
		moveView = new Button(context);
		moveView.setId(text.getId());
		moveView.setText(text.getText());
		// params = (LayoutParams) view.getLayoutParams();
		params.token = text.getWindowToken();
		params.x = x;
		params.y = y;

		mWindowManager.addView(moveView, params);
//		}

	}
}
