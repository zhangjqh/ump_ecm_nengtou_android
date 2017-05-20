package wa.android.task.adapter;

import java.util.ArrayList;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import wa.android.libs.btnFieldView.BtnFieldViewAdapter;
import wa.android.task.vo.TaskUserVO;

public class AddPersonAdapter extends BtnFieldViewAdapter{

	
	public AddPersonAdapter(Context context, ArrayList<TaskUserVO> arrayList) {
		super(context, arrayList);
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		TaskUserVO user = (TaskUserVO)arrayList.get(position);
		EditText2 et2 = new EditText2(context, user.getPsnName());
		Log.d("requestLayout", "Num:" + position);
		Log.d("requestLayout", "content:" + user.getPsnName());
		
		return et2;
		
	}
}
