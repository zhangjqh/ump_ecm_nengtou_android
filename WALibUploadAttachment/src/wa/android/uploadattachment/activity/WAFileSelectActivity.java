package wa.android.uploadattachment.activity;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.example.walibuploadattachment.R;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Environment;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import wa.android.common.activity.BaseActivity;
import wa.android.uploadattachment.adapter.FileListAdapter;
import wa.android.uploadattachment.data.AttachmentShowVO;
import wa.android.uploadattachment.data.FileData;

public class WAFileSelectActivity extends BaseActivity implements OnItemClickListener {
	   private List<FileData> items = new ArrayList<FileData>();
       private String filePath = "/";
       private ListView fileListView;
       private FileListAdapter fileListAdapter;
       private TextView filetileText ;
       private List<String> lastpath ;
       private RelativeLayout backText;
       /** 返回按钮 */
       private Button backButton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

		init();
	}


	private void init() {
		setContentView(R.layout.activity_fileselect);
		fileListView = (ListView)findViewById(R.id.list);
		fileListAdapter = new FileListAdapter(this,items);
		fileListView.setAdapter(fileListAdapter);
		filetileText = (TextView)findViewById(R.id.filetileText);
		backText = (RelativeLayout)findViewById(R.id.backText);
		lastpath = new ArrayList<String>();
		getfilelist(new File(Environment.getExternalStorageDirectory().toString()).listFiles());
		
		fileListView.setOnItemClickListener(this);
		  backText.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {

				if(lastpath.size()>0){
            	getfilelist(new File(lastpath.get(lastpath.size()-1)).listFiles());
				lastpath.remove(lastpath.size()-1);}
				else{
					getfilelist(new File(Environment.getExternalStorageDirectory().toString()).listFiles());
				}
			
			}});
		  
		  backButton = (Button) findViewById(R.id.backBtn);
		  backButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				finish();
				
			}
		});
		
	}

	
	private void getfilelist(File[] files) {
		// TODO Auto-generated method stub
		items.clear();
        // 遍例整个files目录下的所有文件及文件夹
		if(files != null){
	        for (File file : files){
	        	FileData item = new FileData();
	        	item.setFilename(file.getName());
	        	item.setPath(file.getPath());
	           	String f = file.getName();
	        	if(f.contains(".")){
	        	String type = f.substring(f.lastIndexOf('.'));
	        	item.setFiletype(type);
	        	}
	            if (file.isDirectory()){
	              	item.setType(0);                
	            }
	            else{
	            	item.setType(1);               
	            }
	  
	        	  items.add(item);
	        }
		}

        fileListAdapter.notifyDataSetChanged();
      
	}
    // 响应按键消息，在根目录下点Back退出程序，其它目录下点击Back会跑出根目录
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
            switch (keyCode) {
            case KeyEvent.KEYCODE_BACK:
            	finish();
            }
            return super.onKeyDown(keyCode, event);
    }

	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
        filePath=items.get((int) arg3).getPath();
        lastpath.add(getDir(filePath));
        File file = new File(filePath);
        if (file.isDirectory()){
        	getfilelist(file.listFiles());                
        }
        else{
        	Intent i = new Intent();
        	AttachmentShowVO attachment = new AttachmentShowVO();
        	attachment.setAttachmentPath(file.getPath());
        	attachment.setAttachmentName(file.getName());
        	String f = file.getName();
        	if(f.contains(".")){
        	String type = f.substring(f.lastIndexOf('.'));
        	attachment.setAttachmentType(type);}
//        	if(file.length()/1024 == 0 ){
//        		attachment.setAttachmentSize(String.valueOf((file.length()))+"B");
//        	}
//        	else{
        		attachment.setAttachmentSize(String.valueOf((file.length()/1024))+"KB");
//        	}
        	i.putExtra("attachment", attachment);
			setResult(Activity.RESULT_OK, i);
//            Toast.makeText(WAFileSelectActivity.this, "选择的是文件！",
//                            Toast.LENGTH_SHORT).show();
            finish();
        }
		
	}

	private String getDir(String filePath2) {
		 File file = new File(filePath2);
		
		return  file.getParent();
	}
}
