package wa.android.uploadattachment.activity;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.example.walibuploadattachment.R;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Message;
import android.provider.MediaStore;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.Button;
import android.widget.ListView;
//import wa.android.common.ExitApplication;
import wa.android.common.activity.BaseActivity;
import wa.android.libs.groupview.OnAttachmentOpenedActions;

import wa.android.uploadattachment.adapter.AttachmentListAdapter;
import wa.android.uploadattachment.data.AttachmentShowVO;
import wa.android.uploadattachment.data.UpLoadAttachmentListVO;
import wa.android.uploadattachment.view.WAAttachmentPanelView;

public class WAAttahcmentUploadActivity extends BaseActivity{
	 private static int RESULT_LOAD_IMAGE = 1;
	private WAAttachmentPanelView attachmentPanelView;
	private AttachmentListAdapter attachmentListAdapter;
	private UpLoadAttachmentListVO attachmenttranslatelist = new UpLoadAttachmentListVO();
	private List<AttachmentShowVO> attachmentlist = new ArrayList<AttachmentShowVO>();
	private ListView attachmentListView;
	private Button btn,finishBtn;
	public static final int RESULT_BACK = 10;
	private HashMap<Integer, Boolean> state;
    private Handler mHandler;
    private   	boolean hasSD = Environment
			.getExternalStorageState()
			.equals(android.os.Environment.MEDIA_MOUNTED); 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		getAttachmentList();
		init();
		
	}
	private void getAttachmentList() {
		// TODO Auto-generated method stub
		attachmentlist = new ArrayList<AttachmentShowVO>();
		 UpLoadAttachmentListVO attachmenttranslatelist =(UpLoadAttachmentListVO) getIntent().getSerializableExtra("attachmentlist");
		 if(null!=attachmenttranslatelist&&null!=attachmenttranslatelist.getAttachmentlist()&&attachmenttranslatelist.getAttachmentlist().size()>0){
				List<AttachmentShowVO> attachmentlisttmp = new ArrayList<AttachmentShowVO>();
				for(AttachmentShowVO attachmentItem:attachmenttranslatelist.getAttachmentlist() ){
					attachmentlisttmp.add(attachmentItem);
				}
				attachmentlist.addAll(attachmentlisttmp);
		 }  	 
	}
	private void init() {
		Handler buttonhandler = new Handler() {
	    	public void handleMessage(Message msg) {
	    		List<AttachmentShowVO> attachmentlisttmp = attachmentlist;
	    		attachmentlisttmp.remove(Integer.parseInt((String) msg.getData().get("position")));
	    		attachmentlist = attachmentlisttmp;
	    		attachmentListAdapter.notifyDataSetChanged();
				if(state.get(Integer.parseInt((String) msg.getData().get("position")))!= null)
				{
					state.remove(Integer.parseInt((String) msg.getData().get("position")));
					AttachmentListAdapter.setState(state);
					attachmentListAdapter.notifyDataSetChanged();
					finishBtn.setText(getString(R.string.submit));
				}
	    	}
	    };
	    
		// TODO Auto-generated method stub
		setContentView(R.layout.activity_uploadattachment);
		attachmentListView = (ListView)findViewById(R.id.listView);
		attachmentListAdapter = new AttachmentListAdapter(this, attachmentlist,buttonhandler);
		attachmentListView.setAdapter(attachmentListAdapter);
		btn = (Button)findViewById(R.id.uoload_editBtn);
		finishBtn = (Button)findViewById(R.id.finishBtn);
		finishBtn.setText(getString(R.string.submit));
		finishBtn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(finishBtn.getText().equals(getString(R.string.submit))){
					Intent i = new Intent();
					attachmenttranslatelist.setAttachmentlist(attachmentlist);
					i.putExtra("attachmentlist", attachmenttranslatelist);
					i.putExtra("type", 6);
					setResult(Activity.RESULT_OK, i);
					finish();
				}
				else{
					state.clear(); 
					AttachmentListAdapter.setState(state);
					attachmentListAdapter.notifyDataSetChanged();
					finishBtn.setText(getString(R.string.submit));
					
				}
				
			}
		});
		state = AttachmentListAdapter.getState(); 
		 
		
		btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if(hasSD){
				Intent intent = new Intent();
				intent.setClass(WAAttahcmentUploadActivity.this, WAFileSelectActivity.class);
				startActivityForResult(intent, RESULT_BACK);
			}else{
				toastMsg(getString(R.string.nosdcard));}
			}
		});
		attachmentListView.setOnItemLongClickListener(new OnItemLongClickListener() {

			@Override
			public boolean onItemLongClick(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
				state.clear(); 
				AttachmentListAdapter.setState(state);
				attachmentListAdapter.notifyDataSetChanged();
				if(state.get(arg2)!= null)
				{
					state.remove(arg2);
					AttachmentListAdapter.setState(state);
					attachmentListAdapter.notifyDataSetChanged();
					finishBtn.setText(getString(R.string.submit));
				}
				else{
					state.put(arg2, true);
					AttachmentListAdapter.setState(state);
					attachmentListAdapter.notifyDataSetChanged();
					finishBtn.setText(getString(R.string.cancel));
				}
				return false;
			}
		});
		attachmentListView.setOnItemClickListener( new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				// TODO Auto-generated method stub
	    		
				handleAttachment(attachmentlist.get(arg2));
				
			}
		});
	}
	
	 @Override
	 protected void onActivityResult(int requestCode, int resultCode, Intent data) {
         super.onActivityResult(requestCode, resultCode, data);
         Log.i("as","返回回调");
		 switch (resultCode) {
			case RESULT_OK:
	    	 AttachmentShowVO attachment =  (AttachmentShowVO) data.getSerializableExtra("attachment");
	    	 if(!over2M(attachment)&&attachmentlist.size()<10&&Integer.parseInt(attachment.getAttachmentSize().replace("KB", ""))<=2024){
	    	 attachmentlist.add(attachment);
	    	 attachmentListAdapter.notifyDataSetChanged();
	    	 }else if(Integer.parseInt(attachment.getAttachmentSize().replace("KB", ""))>2048){
	    		 toastMsg(getString(R.string.filesize)+"2M");
	    	 }else if(attachmentlist.size()==10){
	    		 toastMsg(getString(R.string.attachmentexceeds)+"10"+getString(R.string.pieces));
	    	 }else if(over2M(attachment)){
	    		 toastMsg(getString(R.string.filesize)+"2M");
	    	 }
	    	 
	    	 break;
		 }
	 }
	 private void handleAttachment(AttachmentShowVO attachmentShowVO) {
			String path =attachmentShowVO.getAttachmentPath();
			String filetype = attachmentShowVO.getAttachmentType().replace(".", "");
			String filename = attachmentShowVO.getAttachmentName();
					File file = new File(path);
					try {
					startActivity(OnAttachmentOpenedActions
							.getAttachmentIntent(
									file,
									filetype));
					} catch (Exception e) {
							toastMsg(getString(R.string.noapptoopen));
						}
	}
	private boolean over2M(AttachmentShowVO attachment2) {
		// TODO Auto-generated method stub
		int size = 0;
		for(AttachmentShowVO attachment:attachmentlist ){
			size+=Integer.parseInt(attachment.getAttachmentSize().replace("KB", ""));
		}
		size +=Integer.parseInt(attachment2.getAttachmentSize().replace("KB", ""));
		if(size > 2048){
			return true;
		}
		return false;
	}
    /**
     * 物理键监听
     */
	public boolean onKeyDown(int keyCode, KeyEvent event) { // 监听物理键
		if (keyCode == KeyEvent.KEYCODE_BACK ) {
			// TODO Auto-generated method stub
			if(finishBtn.getText().equals(getString(R.string.submit))){
				Intent i = new Intent();
				attachmenttranslatelist.setAttachmentlist(attachmentlist);
				i.putExtra("attachmentlist", attachmenttranslatelist);
				i.putExtra("type", 6);
				setResult(Activity.RESULT_OK, i);
				finish();
			}
			else{
				state.clear(); 
				AttachmentListAdapter.setState(state);
				attachmentListAdapter.notifyDataSetChanged();
				finishBtn.setText(getString(R.string.submit));
				
			}
			
		}

		return super.onKeyDown(keyCode, event);
		} 
}
