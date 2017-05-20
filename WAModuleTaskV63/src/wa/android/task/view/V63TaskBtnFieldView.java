package wa.android.task.view;

import android.content.Context;
import android.view.Gravity;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import wa.android.libs.btnFieldView.BtnFieldView;
import wa.android.libs.dragBtnFieldView.DragBtnFieldView;
import wa.android.task.adapter.AddPersonAdapter;
import wa.android.task.adapter.DragBtnFieldViewAdapterForm;

public class V63TaskBtnFieldView extends LinearLayout {

	private BtnFieldView btnFieldView;
	private DragBtnFieldView dragBtnFieldView;
	private EditText edittext;
	private Context context;
	private AddPersonAdapter adapter;
	private DragBtnFieldViewAdapterForm dragadapter;
	private String hint;
	private V63TaskActionRowStyle1 changeassasignrow = null;
	private boolean issingle = true;
	private int style = 0;
	public V63TaskBtnFieldView(Context context, AddPersonAdapter adapter,
			String hint) {
		super(context);
		this.context = context;
		this.adapter = adapter;
		this.hint = hint;
		init();
		// TODO Auto-generated constructor stub
	}

	public V63TaskBtnFieldView(Context context,
			AddPersonAdapter changeassignadapter, String hint2,
			V63TaskActionRowStyle1 changeassasignrow) {
		super(context);
		this.context = context;
		this.adapter = changeassignadapter;
		this.hint = hint2;
		this.changeassasignrow = changeassasignrow;
		init();
		// TODO Auto-generated constructor stub
	}
	public V63TaskBtnFieldView(Context context,
			AddPersonAdapter changeassignadapter, String hint2,
			V63TaskActionRowStyle1 changeassasignrow,boolean issingle) {
		super(context);
		this.context = context;
		this.adapter = changeassignadapter;
		this.hint = hint2;
		this.changeassasignrow = changeassasignrow;
		this.issingle =issingle;
		init();
		// TODO Auto-generated constructor stub
	}
	public V63TaskBtnFieldView(Context context,
			DragBtnFieldViewAdapterForm changeassignadapter, String hint2,
			DragBtnFieldView btnFieldView, int style,V63TaskActionRowStyle1 changeassasignrow,boolean issingle) {
		super(context);
		this.context = context;
		this.dragadapter = changeassignadapter;
		this.hint = hint2;
		this.dragBtnFieldView = btnFieldView;
		this.style =style;
		this.changeassasignrow = changeassasignrow;
		this.issingle =issingle;
		init();
		// TODO Auto-generated constructor stub
	}

	private void init() {
		WA4ItemRowStyle rowStyle = new WA4ItemRowStyle(this.context);
		setOrientation(HORIZONTAL);
		setGravity(Gravity.CENTER_VERTICAL);
		setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT,
				LayoutParams.WRAP_CONTENT));
		setPadding(rowStyle.getNamePaddingLeft(),
				rowStyle.getNamePaddingLeft(), rowStyle.getNamePaddingRight(),
				rowStyle.getNamePaddingLeft());
		// TODO Auto-generated method stub
		edittext = new EditText(context);
		if(style == 0){
		btnFieldView = new BtnFieldView(context, null);
		btnFieldView.setBtnFieldViewAdapter(adapter);
		btnFieldView.setLayoutParams(new LayoutParams(LayoutParams.FILL_PARENT,
				LayoutParams.WRAP_CONTENT));

		btnFieldView.setVisibility(View.GONE);

		btnFieldView.getViewTreeObserver().addOnGlobalLayoutListener(
				new OnGlobalLayoutListener() {

					@Override
					public void onGlobalLayout() {
						if (null == changeassasignrow) {
							// TODO Auto-generated method stub
							if (btnFieldView.getChildCount() == 0) {
								btnFieldView.setVisibility(View.GONE);
								edittext.setVisibility(View.VISIBLE);
							} else {
								btnFieldView.setVisibility(View.VISIBLE);
								edittext.setVisibility(View.GONE);
							}
						} else {
							if (btnFieldView.getChildCount() == 0) {
								btnFieldView.setVisibility(View.GONE);
								edittext.setVisibility(View.VISIBLE);
								changeassasignrow.getAddBtn().setVisibility(
										View.VISIBLE);
							} else {
								if(issingle)
								changeassasignrow.getAddBtn().setVisibility(
										View.GONE);
								btnFieldView.setVisibility(View.VISIBLE);
								edittext.setVisibility(View.GONE);

							}
						}
					}
				});
		addView(btnFieldView);
	}else if(style == 1){
		dragBtnFieldView.setDragBtnFieldViewAdapter(dragadapter);
		dragBtnFieldView.setLayoutParams(new LayoutParams(LayoutParams.FILL_PARENT,
				LayoutParams.WRAP_CONTENT));

		dragBtnFieldView.setVisibility(View.GONE);

		dragBtnFieldView.getViewTreeObserver().addOnGlobalLayoutListener(
				new OnGlobalLayoutListener() {

					@Override
					public void onGlobalLayout() {
						if (null == changeassasignrow) {
							// TODO Auto-generated method stub
							if (dragBtnFieldView.getChildCount() == 0) {
								dragBtnFieldView.setVisibility(View.GONE);
								edittext.setVisibility(View.VISIBLE);
							} else {
								dragBtnFieldView.setVisibility(View.VISIBLE);
								edittext.setVisibility(View.GONE);
							}
						} else {
							if (dragBtnFieldView.getChildCount() == 0) {
								dragBtnFieldView.setVisibility(View.GONE);
								edittext.setVisibility(View.VISIBLE);
								changeassasignrow.getAddBtn().setVisibility(
										View.VISIBLE);
							} else {
								if(issingle)
								changeassasignrow.getAddBtn().setVisibility(
										View.GONE);
								dragBtnFieldView.setVisibility(View.VISIBLE);
								edittext.setVisibility(View.GONE);

							}
						}
					}
				});
		addView(dragBtnFieldView);
	
		
	}
		edittext.setLayoutParams(new LayoutParams(LayoutParams.FILL_PARENT,
				LayoutParams.WRAP_CONTENT));
		edittext.setBackgroundResource(0);
		edittext.setHint(hint);
	
		addView(edittext);

	}
	// public void setIsHint(boolean ishint) {
	// if(!ishint){
	// btnFieldView.setVisibility(View.VISIBLE);
	// edittext.setVisibility(View.GONE);
	// }else{
	// btnFieldView.setVisibility(View.GONE);
	// edittext.setVisibility(View.VISIBLE);
	// }
	// }
}
