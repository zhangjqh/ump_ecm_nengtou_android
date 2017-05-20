package wa.android.uploadattachment.adapter;

import java.util.HashMap;
import java.util.List;
import java.util.Vector;

import com.example.walibuploadattachment.R;

import wa.android.common.utils.DensityUtil;
import wa.android.libs.groupview.WARowAttachment.AttachmentRowType;
import wa.android.uploadattachment.data.AttachmentShowVO;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.IntentSender.SendIntentException;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils.TruncateAt;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
@SuppressLint("DefaultLocale")
@SuppressWarnings("unused")
public class AttachmentListAdapter extends BaseAdapter {
	private Context context;
	private 	ViewHandler viewHandler;
	private List<AttachmentShowVO> attachmentlist;
    private Handler mHandler;
	private static HashMap<Integer, Boolean> state = new HashMap<Integer, Boolean>();	
	public AttachmentListAdapter(Context context,List<AttachmentShowVO> attachmentlist,Handler mHandler){
		this.attachmentlist = attachmentlist;
		this.context = context;
		this.mHandler = mHandler;
	}
	
	public static enum AttachmentRowType {
		JPG,
		BMP,
		DOC,
		HTML,
		PDF,
		PNG,
		PPT,
		TXT,
		XLS,
		NULL,
		DEFAULT, XLSX, PPTX, DOCX
	}
	private AttachmentRowType type;
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return attachmentlist.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return attachmentlist.get(position);
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@SuppressWarnings("null")
	@Override
	public View getView( final int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		 viewHandler = null;
		if(convertView == null) {
			viewHandler = new ViewHandler();
			LayoutInflater mInflater = LayoutInflater.from(context);
			convertView = mInflater.inflate(R.layout.listitem, null);
			convertView.setBackgroundColor(Color.rgb(255,255,255));
					viewHandler.name = (TextView) convertView.findViewById(R.id.NameTextView);
					viewHandler.size = (TextView) convertView. findViewById(R.id.SizeTextView);
					viewHandler.type = (ImageView) convertView.findViewById(R.id.ImageView);
					viewHandler.btn = (Button)convertView.findViewById(R.id.deleteBtn);
					convertView.setTag(viewHandler);
		}else{
			viewHandler = (ViewHandler) convertView.getTag();
		}
		viewHandler.name.setEllipsize(TruncateAt.MIDDLE);
		viewHandler.name.setText(attachmentlist.get(position).getAttachmentName());
		viewHandler.size.setText(attachmentlist.get(position).getAttachmentSize());
		viewHandler.type.setBackgroundResource(handleFileBackGround(attachmentlist.get(position).getAttachmentType()));
		if(getState().get(position) == null ? false : true) {
			viewHandler.btn.setVisibility(View.VISIBLE);
		}
		else{
			//删除  原来View.gone
			viewHandler.btn.setVisibility(View.VISIBLE);
		}
		viewHandler.btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			     Message msg = new Message();
					viewHandler.btn.setVisibility(View.GONE);
		         Bundle b = new Bundle();// ���ID

		         b.putString("position", position+"");
		         msg.setData(b);
				mHandler.sendMessage(msg);

				
			}
		});
		return convertView;
	}
	private class ViewHandler {
		boolean isfirstlongclick = true;
		TextView name;	
		TextView size;
		ImageView type;
		Button btn;
	} 
	public static HashMap<Integer, Boolean> getState() {
		return state;
	}
	


	public static void setState(HashMap<Integer, Boolean> state) {
		AttachmentListAdapter.state = state;
	}
	public static void addState(Integer position, Boolean state) {
		if(state){
			AttachmentListAdapter.state.put(position,state);}
		else{
			AttachmentListAdapter.state.remove(position);
		}
	}
	@SuppressLint("DefaultLocale")
	private int handleFileBackGround(String type){
		type = type.toUpperCase().replace(".", "");
		AttachmentRowType rowType = AttachmentRowType.NULL;
		if("JPG".equalsIgnoreCase(type))
			rowType = AttachmentRowType.JPG;
		else if("DOC".equalsIgnoreCase(type))
			rowType = AttachmentRowType.DOC;
		else if("HTML".equalsIgnoreCase(type))
			rowType = AttachmentRowType.HTML;
		else if("PDF".equalsIgnoreCase(type))
			rowType = AttachmentRowType.PDF;
		else if("PNG".equalsIgnoreCase(type))
			rowType = AttachmentRowType.PNG;
		else if("PPT".equalsIgnoreCase(type))
			rowType = AttachmentRowType.PPT;
		else if("TXT".equalsIgnoreCase(type))
			rowType = AttachmentRowType.TXT;
		else if("XLS".equalsIgnoreCase(type))
			rowType = AttachmentRowType.XLS;
		else if("DEFAULT".equalsIgnoreCase(type))
			rowType = AttachmentRowType.DEFAULT;
		else if("XLSX".equalsIgnoreCase(type))
			rowType = AttachmentRowType.XLSX;
		else if("PPTX".equalsIgnoreCase(type))
			rowType = AttachmentRowType.PPTX;
		else if("DOCX".equalsIgnoreCase(type))
			rowType = AttachmentRowType.DOCX;
		else if("BMP".equalsIgnoreCase(type))
			rowType = AttachmentRowType.BMP;
		this.type = rowType;
		return getResID();
	}
	private  int getResID(){

	
		int iconResId;
	switch (type) {
	case JPG:
		iconResId = R.drawable.common_jpg_icon;
		break;
	case BMP:
		iconResId = R.drawable.common_bmp_icon;
		break;
	case DOC:
		iconResId = R.drawable.common_doc_icon;
		break;
	case HTML:
		iconResId = R.drawable.common_html_icon;
		break;
	case PDF:
		iconResId = R.drawable.common_pdf_icon;
		break;
	case PNG:
		iconResId = R.drawable.common_png_icon;
		break;
	case PPT:
		iconResId = R.drawable.common_ppt_icon;
		break;
	case TXT:
		iconResId = R.drawable.common_txt_icon;
		break;
	case XLS:
		iconResId = R.drawable.common_xls_icon;
		break;
	case XLSX:
		iconResId = R.drawable.common_xlsx_icon;
		break;
	case DOCX:
		iconResId = R.drawable.common_docx_icon;
		break;
	case PPTX:
		iconResId = R.drawable.common_pptx_icon;
		break;
//	case NULL:
//		iconResId = R.drawable.common_null_icon;
//		break;
	default:
		iconResId = R.drawable.common_default_icon;
		break;
	

	}
	return iconResId;
}
}