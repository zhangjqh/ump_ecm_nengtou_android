package wa.android.uploadattachment.view;

import java.util.List;

import wa.android.uploadattachment.adapter.AttachmentListAdapter;
import wa.android.uploadattachment.data.AttachmentShowVO;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;

/**
 * @author damilong
 * 用于附件上传，
 * 使用方式：将此View加入布局，也可加入WAPanel/WAgroup中
 * 			@Yonyou移动产品
 */
public class WAAttachmentPanelView  extends LinearLayout {

	private ListView attachmentListView;
	private AttachmentListAdapter attachmentListAdapter;
	private Context context;
	private Button btn;
	private List<AttachmentShowVO> attachmentlist;
	public WAAttachmentPanelView(Context context, List<AttachmentShowVO> attachmentlist){
		super(context);
		// TODO Auto-generated constructor stub
		this.attachmentlist = attachmentlist;
		this.context = context;
		initbtn();
		initlist();
	}

	private void initbtn() {
		// TODO Auto-generated method stub
		btn = new Button(context);
		btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
		});
		addView(btn);
	}

	private void initlist() {
		// TODO Auto-generated method stub
		attachmentListView = new ListView(context);
//		attachmentListAdapter = new AttachmentListAdapter(context, attachmentlist);
		attachmentListView.setAdapter(attachmentListAdapter);
		addView(attachmentListView);
		
	}


}
