package wa.android.libs.dragBtnFieldView;

import java.util.ArrayList;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;

public abstract class DragBtnFieldViewAdapter<T> extends BaseAdapter {
	
	protected ArrayList<T> arrayList = null;
	protected DragBtnFieldView btnFieldView = null;
	protected Context context = null;
	public DragBtnFieldViewAdapter(Context context, ArrayList<T> arrayList){
		this.context = context;
		this.arrayList = arrayList;
	}
	@Override
	public int getCount() {
		return arrayList == null? 0 : arrayList.size();
	}

	@Override
	public Object getItem(int position) {
		if (arrayList == null) return null;
		if (position >= arrayList.size()) return null;
		return arrayList.get(position);
	}
	public Object getAllItem() {
		if (arrayList == null) return null;
		
		return arrayList;
	}
	@Override
	public long getItemId(int position) {
		return 0;
	}

	@Override
	public int getItemViewType(int position) {
		return 0;
	}

	@Override
	public abstract View getView(int position, View convertView, ViewGroup parent);

	@Override
	public int getViewTypeCount() {
		return 0;
	}

	@Override
	public boolean hasStableIds() {
		return false;
	}

	@Override
	public boolean isEmpty() {
		return arrayList == null ? false : arrayList.isEmpty(); 
	}
	
	@Override
	public void notifyDataSetChanged(){
		if (btnFieldView != null) {
			btnFieldView.notifyDataSetChanged();
		}
	}
	
	public class EditText2 extends EditText implements TextWatcher{
		Paint p = new Paint();
		String temp = null;
		public EditText2(Context context, String content) {
			super(context);
			p.setColor(Color.BLACK);
			this.setText(content);
			this.setCursorVisible(false);
			this.addTextChangedListener(this);
		}
		@Override
        public void beforeTextChanged(CharSequence s, int arg1, int arg2,
                int arg3) {
			this.temp = s.toString();
        }
       
        @Override
        public void onTextChanged(CharSequence s, int arg1, int arg2,
                int arg3) {
//        	this.setText(s);
        }
       
        @Override
        public void afterTextChanged(Editable s) {
        	this.removeTextChangedListener(this);
        	this.setText(this.temp);
        	this.addTextChangedListener(this);
        }
		
	}
}
