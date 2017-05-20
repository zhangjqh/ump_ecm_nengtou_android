package wa.android.libs.menuview;

import wa.android.common.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.LinearInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

@SuppressLint("HandlerLeak")
public class WAMenuView extends FrameLayout {
	// private final int MOVE_DELAY = 30;
	private final int MENU_WIDTH_480 = 350;
	private final int MENU_WIDTH_720 = 550;
	private final int FONT_SIZE_480 = 26;
	private final int FONT_SIZE_720 = 44;
	private final int PADDING_TOP_480 = 60;
	private final int PADDING_TOP_720 = 100;

	private Context context;
	private View view;
	private boolean isShow;
	private boolean isSetView;
	private LinearLayout menuLayout, topBtnsLayout, bottomBtnsLayout;

	private int menuWidth = MENU_WIDTH_480;
	private int fontSize = FONT_SIZE_480;
	private int duration = 200;
	private int paddingTop = PADDING_TOP_480;
	private MenuOrientation menuOrientation = MenuOrientation.LEFT;

	public WAMenuView(Context context) {
		super(context);
		this.context = context;
		setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT,
				LayoutParams.MATCH_PARENT));
		initView();
	}

	public WAMenuView(Context context, MenuOrientation menuOrientation) {
		super(context);
		this.context = context;
		setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT,
				LayoutParams.MATCH_PARENT));
		this.menuOrientation = menuOrientation;
		initView();
	}

	/**
	 * 初始化界面
	 */
	private void initView() {
		int width = ((WindowManager) context
				.getSystemService(Context.WINDOW_SERVICE)).getDefaultDisplay()
				.getWidth();
		if (width >= 640) {
			menuWidth = MENU_WIDTH_720;
			fontSize = FONT_SIZE_720;
			paddingTop = PADDING_TOP_720;
		}

		menuLayout = new LinearLayout(this.context);
		topBtnsLayout = new LinearLayout(this.context);
		bottomBtnsLayout = new LinearLayout(this.context);

		menuLayout.setOrientation(LinearLayout.VERTICAL);
		menuLayout
				.setGravity(menuOrientation == MenuOrientation.LEFT ? Gravity.LEFT
						: Gravity.RIGHT);

		topBtnsLayout.setOrientation(LinearLayout.VERTICAL);
		bottomBtnsLayout.setOrientation(LinearLayout.VERTICAL);
		bottomBtnsLayout.setGravity(Gravity.BOTTOM);

		LayoutParams params = new LayoutParams(menuWidth,
				LayoutParams.WRAP_CONTENT);
		topBtnsLayout.setLayoutParams(params);
		topBtnsLayout.setPadding(0, paddingTop, 0, 0);
		bottomBtnsLayout.setLayoutParams(params);
		menuLayout.setBackgroundResource(R.drawable.common_menu_bg);

		menuLayout.addView(topBtnsLayout);
		menuLayout.addView(bottomBtnsLayout);
		addView(menuLayout);
	}

	public void setView(int layoutId) {
		view = LayoutInflater.from(context).inflate(layoutId, null);
		LayoutParams params = new LayoutParams(LayoutParams.MATCH_PARENT,
				LayoutParams.MATCH_PARENT);
		params.gravity = Gravity.LEFT;
		addView(view, params);
		isSetView = true;
	}

	/**
	 * 添加头部的按钮
	 * 
	 * @param items
	 * @param listener
	 */
	public void setTopBtns(String[] items, final OnTopBtnsClickListener listener) {
		if (items != null && items.length > 0) {
			int count = items.length;
			Button[] btns = new Button[count];
			topBtnsLayout.addView(getBtnline(Color.BLACK));
			topBtnsLayout.addView(getBtnline(Color.rgb(100, 100, 100)));
			for (int i = 0; i < count; i++) {
				btns[i] = new Button(context);
				btns[i].setLayoutParams(new LayoutParams(
						LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
				btns[i].setText(items[i]);
				btns[i].setBackgroundColor(Color.argb(0, 255, 255, 255));
				btns[i].setTextColor(Color.WHITE);
				btns[i].setTextSize(TypedValue.COMPLEX_UNIT_PX, fontSize);
				final int index = i;
				btns[i].setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						listener.onClick(v, index);
					}
				});
				topBtnsLayout.addView(btns[i]);
				topBtnsLayout.addView(getBtnline(Color.BLACK));
				topBtnsLayout.addView(getBtnline(Color.rgb(100, 100, 100)));
			}
		}
	}

	/**
	 * 添加底部按钮
	 * 
	 * @param items
	 * @param listener
	 */
	public void setBottomBtns(String[] items,
			final OnBottomBtnsClickListener listener) {
		if (items != null && items.length > 0) {
			int count = items.length;
			Button[] btns = new Button[count];
			for (int i = 0; i < count; i++) {
				btns[i] = new Button(context);
				btns[i].setLayoutParams(new LayoutParams(
						LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
				btns[i].setText(items[i]);
				btns[i].setTextColor(Color.WHITE);
				btns[i].setTextSize(TypedValue.COMPLEX_UNIT_PX, fontSize);
				btns[i].setBackgroundColor(Color.argb(0, 255, 255, 255));
				final int index = i;
				btns[i].setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						listener.onClick(v, index);
					}
				});
				bottomBtnsLayout.addView(getBtnline(Color.BLACK));
				bottomBtnsLayout.addView(getBtnline(Color.rgb(100, 100, 100)));
				bottomBtnsLayout.addView(btns[i]);
			}

		}
	}

	/**
	 * 添加底部图片按钮
	 * 
	 * @param items
	 * @param listener
	 */
	public void setBottomBtns(int[] items,
			final OnBottomBtnsClickListener listener) {
		if (items != null && items.length > 0) {
			int count = items.length;
			Button[] btns = new Button[count];
			for (int i = 0; i < count; i++) {
				LinearLayout parent = new LinearLayout(context);
				parent.setLayoutParams(new LayoutParams(
						LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
				parent.setBackgroundColor(Color.argb(0, 255, 255, 255));
				btns[i] = new Button(context);
				btns[i].setLayoutParams(new LayoutParams(
						LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
				btns[i].setBackgroundResource(items[i]);
				final int index = i;
				btns[i].setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						listener.onClick(v, index);
					}
				});
				parent.addView(btns[i]);
				bottomBtnsLayout.addView(getBtnline(Color.BLACK));
				bottomBtnsLayout.addView(getBtnline(Color.rgb(100, 100, 100)));
				bottomBtnsLayout.addView(parent);
			}

		}
	}

	private View getBtnline(int color) {
		TextView view = new TextView(this.context);
		view.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, 2));
		view.setBackgroundColor(color);
		return view;
	}

	/**
	 * 显示菜单
	 */
	public void show() {
		if (!isShow && isSetView) {
			Animation animation = null;
			FrameLayout.LayoutParams params = (LayoutParams) view
					.getLayoutParams();
			switch (menuOrientation) {
			case LEFT:
				animation = new TranslateAnimation(-menuWidth, 0, 0, 0);
				animation.setDuration(duration);
				params.leftMargin += menuWidth;
				params.rightMargin -= menuWidth;
				break;
			default:
				animation = new TranslateAnimation(menuWidth, 0, 0, 0);
				animation.setDuration(duration);
				params.leftMargin -= menuWidth;
				params.rightMargin += menuWidth;
				break;
			}
			view.setLayoutParams(params);
			view.startAnimation(animation);
			isShow = true;
		}
	}

	/**
	 * 收回菜单
	 */
	public void dismiss() {
		if (isShow && isSetView) {
			Animation animation = new TranslateAnimation(menuWidth, 0, 0, 0);
			FrameLayout.LayoutParams params = (LayoutParams) view
					.getLayoutParams();
			switch (menuOrientation) {
			case LEFT:
				animation = new TranslateAnimation(menuWidth, 0, 0, 0);
				animation.setDuration(duration);
				params.leftMargin = 0;
				params.rightMargin = 0;
				break;
			default:
				animation = new TranslateAnimation(-menuWidth, 0, 0, 0);
				animation.setDuration(duration);
				params.leftMargin = 0;
				params.rightMargin = 0;
				break;
			}
			animation.setInterpolator(new LinearInterpolator());
			animation.setDuration(duration);
			view.startAnimation(animation);
			view.setLayoutParams(params);
			isShow = false;
		}
	}

	/**
	 * 有回调函数的收回菜单
	 * 
	 * @param listener
	 */
	public void dismiss(final OnMenuCallBackListener listener) {
		if (isShow && isSetView) {
			Animation animation = new TranslateAnimation(menuWidth, 0, 0, 0);
			animation.setInterpolator(new LinearInterpolator());
			animation.setDuration(duration);
			animation.setAnimationListener(new AnimationListener() {
				@Override
				public void onAnimationStart(Animation animation) {

				}

				@Override
				public void onAnimationRepeat(Animation animation) {

				}

				@Override
				public void onAnimationEnd(Animation animation) {
					if (listener != null)
						listener.callBack();
				}
			});
			FrameLayout.LayoutParams params = (LayoutParams) view
					.getLayoutParams();
			params.leftMargin = 0;
			params.rightMargin = 0;
			view.startAnimation(animation);
			view.setLayoutParams(params);
			isShow = false;
		}
	}

	public boolean isShow() {
		return isShow;
	}

	public void setShow(boolean isShow) {
		this.isShow = isShow;
	}

	public interface OnTopBtnsClickListener {
		public void onClick(View v, int which);
	}

	public interface OnBottomBtnsClickListener {
		public void onClick(View v, int which);
	}

	public interface OnMenuCallBackListener {
		public void callBack();
	}

	public enum MenuOrientation {
		LEFT, RIGHT
	}
}
