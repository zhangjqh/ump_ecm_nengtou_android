package wa.android.task.view;

import com.example.wamoduletaskv63.R;

import android.content.Context;
import android.widget.RelativeLayout;

public class V63TaskDetailBottomBtn extends RelativeLayout{

	public V63TaskDetailBottomBtn(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
		init();
	}

	private void init() {
		// TODO Auto-generated method stub
		RelativeLayout view = (RelativeLayout)findViewById(R.layout.bottombtn_agree);
		addView(view);
	}

}
