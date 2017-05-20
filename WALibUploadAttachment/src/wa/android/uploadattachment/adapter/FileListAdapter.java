package wa.android.uploadattachment.adapter;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import wa.android.uploadattachment.adapter.AttachmentListAdapter.AttachmentRowType;
import wa.android.uploadattachment.data.FileData;

import com.example.walibuploadattachment.R;


import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils.TruncateAt;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnLongClickListener;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class FileListAdapter extends BaseAdapter{
	private Context context;
	private ViewHandler viewHandler;
	private List<FileData> items = new ArrayList<FileData>();
	
	public FileListAdapter (Context context, List<FileData> items){
		this.context = context;
		this.items = items;
	}
	public void addItem(FileData it) {
		items.add(it);}
	public FileData getItem(int it) {
		return (FileData)items.get(it);
	}
	public int getCount() {
		return items.size();
	}
	public long getItemId(int arg0) {
		return arg0;
	}
	public int getItemType(int arg0) {
		return getItem(arg0).type;
	}
	public void clearItems(){
		items.clear();
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
	public View getView(int arg0, View convertView, ViewGroup arg2) {
		// TODO Auto-generated method stub
		 viewHandler = null;
		if(convertView == null) {
			viewHandler = new ViewHandler();
			LayoutInflater mInflater = LayoutInflater.from(context);
			convertView = mInflater.inflate(R.layout.filelist_item, null);
			convertView.setBackgroundColor(Color.rgb(255,255,255));
					viewHandler.name = (TextView) convertView.findViewById(R.id.fileaaNameTextView);
//					viewHandler.size = (TextView) convertView. findViewById(R.id.SizeTextView);
					viewHandler.type = (ImageView) convertView.findViewById(R.id.imageView);
					convertView.setTag(viewHandler);
		}else{
			viewHandler = (ViewHandler) convertView.getTag();
		}
		viewHandler.name.setEllipsize(TruncateAt.MIDDLE);
		viewHandler.name.setText(items.get(arg0).getFilename());	
	
		if(items.get(arg0).getType() == 1){
			viewHandler.type.setBackgroundResource(handleFileBackGround(items.get(arg0).getFiletype()))	;
		}
		else{
			viewHandler.type.setBackgroundResource(R.drawable.file_folder)	;
		}
		return convertView;
	}
	
	private class ViewHandler {
		TextView name;	
//		TextView size;
		ImageView type;
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

