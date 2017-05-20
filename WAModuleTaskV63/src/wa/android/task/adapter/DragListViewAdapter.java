package wa.android.task.adapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


import com.example.wamoduletaskv63.R;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class DragListViewAdapter extends ArrayAdapter<String>{
    private static List<String> list = null;
	private 	ViewHandler viewHandler;
//    public static List<String> groupKey= new ArrayList<String>();
    private List<String> navList = new ArrayList<String>();
    private List<String> moreList = new ArrayList<String>();
	private static HashMap<Integer, Boolean> state = new HashMap<Integer, Boolean>();	
    public DragListViewAdapter(Context context, List<String> objects) {
    	
        super(context, 0, objects);
        this.list = objects;
    }
    
    public List<String> getList(){
        return list;
    }
    
    @Override
    public boolean isEnabled(int position) {
//        if(groupKey.contains(getItem(position))){
//            //如果是分组标签，返回false，不能选中，不能点击
//            return false;
//        }
        return super.isEnabled(position);
    }
    
    @Override
    public void remove(String object) {
    	// TODO Auto-generated method stub
//    	super.remove(object);
    	list.remove(object);
    	notifyDataSetChanged();
    }

    @Override
    public void insert(String object, int index) {
    	// TODO Auto-generated method stub
//    	super.insert(object, index);
    	list.add(index, object);
    	notifyDataSetChanged();
    }
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
		 viewHandler = null;
        if(null == convertView){
			viewHandler = new ViewHandler();
//        if(groupKey.contains(getItem(position))){
//            //如果是分组标签，就加载分组标签的布局文件，两个布局文件显示效果不同
//            view = LayoutInflater.from(getContext()).inflate(R.layout.drag_list_item_tag, null);
//        }else{
            //如果是正常数据项标签，就加在正常数据项的布局文件
			convertView = LayoutInflater.from(getContext()).inflate(R.layout.drag_list_item, null);
//        }
        
			viewHandler.name = (TextView)convertView.findViewById(R.id.drag_list_item_text);
        viewHandler.dragbtn= (ImageView)convertView.findViewById(R.id.drag_list_item_image);
        convertView.setTag(viewHandler);
        }else{
			viewHandler = (ViewHandler) convertView.getTag();
        }
		viewHandler.name .setText(getItem(position));
        return convertView;
    }
	private class ViewHandler {
		boolean isfirstlongclick = true;
		TextView name;	
		Button btn;
		ImageView dragbtn;
	} 
	public static HashMap<Integer, Boolean> getState() {
		return state;
	}
	public static void setState(HashMap<Integer, Boolean> state) {
		DragListViewAdapter.state = state;
	}
	public static void addState(Integer position, Boolean state) {
		if(state){
			DragListViewAdapter.state.put(position,state);}
		else{
			DragListViewAdapter.state.remove(position);
		}
	}
	

}