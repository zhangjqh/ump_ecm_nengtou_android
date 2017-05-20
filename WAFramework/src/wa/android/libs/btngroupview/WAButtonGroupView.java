package wa.android.libs.btngroupview;

import java.util.List;

import wa.android.common.App;
import wa.android.common.utils.DensityUtil;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

/**
 * 分组按钮，目前只有两组按钮和三组按钮，但是可扩充到四组及以上
 * @author candy
 */
public class WAButtonGroupView extends LinearLayout {
	private Context context; 
	private List<String> btnsName;
	//按钮数目
	private int buttonCount;
	//按下后的动作出里
	private OnActionListener onActionListener;

	//当前使用的按下和不按下的图片集合
	private int[] currentPressed;
	private int[] currentUnpress;
	
	public WAButtonGroupView(Context context) {
		super(context);
		this.context = context;
	}
	
	public WAButtonGroupView(Context context, AttributeSet attrs) {
		super(context, attrs);
		this.context = context;
	}

	public void setData(List<String> btnsName, int[] pressedDrawables, int[] unpressDrawables ,OnActionListener onActionListener) {
		this.btnsName = btnsName;
		this.onActionListener = onActionListener;
		this.currentPressed = pressedDrawables;
		this.currentUnpress = unpressDrawables;
		initViews();
	}
	//初始化按钮界面
	private void initViews() {
		//居中水平排列
		setGravity(Gravity.CENTER);
		setOrientation(LinearLayout.HORIZONTAL);
		buttonCount = btnsName.size();
		final Button[] buttons = new Button[buttonCount];
		//获得初始选中位置
		int firststatus = 0;
		if(null!=((App)context.getApplicationContext()).getGlobalVariables("firststatusnum")
				&&!(((App)context.getApplicationContext()).getGlobalVariables("firststatusnum").toString().isEmpty())){
			firststatus = Integer.valueOf(((App)context.getApplicationContext()).getGlobalVariables("firststatusnum").toString());
		}
		//初始化每个按钮
		for(int i=0; i<buttonCount; i++) {
			final String btnName = btnsName.get(i);
			buttons[i] = new Button(context);
			buttons[i].setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, DensityUtil.dip2px(context, 44)));
			//添加按钮名字和颜色并居中
			buttons[i].setText(btnName);
			buttons[i].setPadding(0, DensityUtil.dip2px(context, 0.5f), 0, 0);
			buttons[i].setGravity(Gravity.CENTER);
			buttons[i].setTextColor(Color.RED);
			//添加动作事件
			final int index = i;
			if(firststatus == i) {
				buttons[i].setBackgroundResource(currentPressed[i]);
				buttons[i].setTextColor(Color.WHITE);
			} else {
				buttons[i].setBackgroundResource(currentUnpress[i]);
				buttons[i].setTextColor(Color.RED);
			} 
			buttons[i].setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					if(onActionListener != null)
						if(onActionListener.doAction(btnName, index)) {
							for(int j=0; j<buttonCount; j++) {
								buttons[j].setBackgroundResource(currentUnpress[j]);
								buttons[j].setTextColor(Color.RED);
							}
							buttons[index].setBackgroundResource(currentPressed[index]);
							buttons[index].setTextColor(Color.WHITE);
						}
				}
			});
			addView(buttons[i]);
		}
	}
	
	/**
	 * 动作事件
	 * @author candy
	 */
	public interface OnActionListener {
		public boolean doAction(String btnName, int index);
	}
	
}
