package wa.android.task.adapter;

import java.util.ArrayList;

import wa.android.libs.btnFieldView.BtnFieldViewAdapter;
import wa.android.libs.btnFieldView.BtnFieldViewAdapter.EditText2;
import wa.android.v63task.data.UserVO;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

public class V63AddPersonAdapter extends BtnFieldViewAdapter{

	
	public V63AddPersonAdapter(Context context, ArrayList<UserVO> arrayList) {
		super(context, arrayList);
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		UserVO user = (UserVO)arrayList.get(position);
		EditText2 et2 = new EditText2(context, user.getName());
		Log.d("requestLayout", "Num:" + position);
		Log.d("requestLayout", "content:" + user.getName());
		
		return et2;
		
	}
}
