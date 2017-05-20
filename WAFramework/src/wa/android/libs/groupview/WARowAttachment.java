package wa.android.libs.groupview;

import wa.android.common.R;
import wa.android.common.utils.DensityUtil;
import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils.TruncateAt;
import android.util.TypedValue;
import android.view.Gravity;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

@SuppressLint("ViewConstructor")
public class WARowAttachment extends LinearLayout {
	
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

	private Context context;
	private TextView titleTextView;
	private TextView sizeTextView;
	private ImageView iconImageView;
	
	private AttachmentRowType type;
	
	public WARowAttachment(Context context, AttachmentRowType type) {
		super(context);
		this.context = context;
		this.type = type;
		init();
	}
	
	public WARowAttachment(Context context, String type) {
		super(context);
		this.context = context;
		AttachmentRowType rowType = AttachmentRowType.NULL;
		if(type.toUpperCase().contains("JPG"))
			rowType = AttachmentRowType.JPG;
		else if(type.toUpperCase().contains("DOC"))
			rowType = AttachmentRowType.DOC;
		else if(type.toUpperCase().contains("HTML"))
			rowType = AttachmentRowType.HTML;
		else if(type.toUpperCase().contains("PDF"))
			rowType = AttachmentRowType.PDF;
		else if(type.toUpperCase().contains("PNG"))
			rowType = AttachmentRowType.PNG;
		else if(type.toUpperCase().contains("PPT"))
			rowType = AttachmentRowType.PPT;
		else if(type.toUpperCase().contains("TXT"))
			rowType = AttachmentRowType.TXT;
		else if(type.toUpperCase().contains("XLS"))
			rowType = AttachmentRowType.XLS;
		else if(type.toUpperCase().contains("DEFAULT"))
			rowType = AttachmentRowType.DEFAULT;
		else if(type.toUpperCase().contains("XLSX"))
			rowType = AttachmentRowType.XLSX;
		else if(type.toUpperCase().contains("PPTX"))
			rowType = AttachmentRowType.PPTX;
		else if(type.toUpperCase().contains("DOCX"))
			rowType = AttachmentRowType.DOCX;
		else if(type.toUpperCase().contains("BMP"))
			rowType = AttachmentRowType.BMP;
		this.type = rowType;
		init();
	}
	private void init() {
		setOrientation(HORIZONTAL);
		setGravity(Gravity.CENTER_VERTICAL);
		setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
		WARowStyle rowStyle = new WARowStyle(context);
		setPadding(DensityUtil.dip2px(context, 15),
					rowStyle.getRowPaddingTop(),
					rowStyle.getRowPaddingRight(),
					rowStyle.getRowPaddingBottom());
		//title
		titleTextView = new TextView(context);
		LayoutParams params = new LayoutParams(0, LayoutParams.WRAP_CONTENT);
		params.weight = 1;
		titleTextView.setLayoutParams(params);
		titleTextView.setSingleLine();
		titleTextView.setEllipsize(TruncateAt.END);
		titleTextView.setTextSize(TypedValue.COMPLEX_UNIT_PX, DensityUtil.dip2px(context, 16));
		//size
		params = new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
		params.rightMargin = rowStyle.getCommonPadding();
		params.leftMargin = rowStyle.getCommonPadding();
		sizeTextView = new TextView(context);
		sizeTextView.setLayoutParams(params);
		sizeTextView.setTextSize(TypedValue.COMPLEX_UNIT_PX, DensityUtil.dip2px(context, 16));
		//icon
		iconImageView = new ImageView(context);
		iconImageView.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
		int iconResId = -1;
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
//		case NULL:
//			iconResId = R.drawable.common_null_icon;
//			break;
		default:
			iconResId = R.drawable.common_default_icon;
			break;
		}
		iconImageView.setBackgroundResource(iconResId);
		addView(titleTextView);
		addView(sizeTextView);
		addView(iconImageView);
	}
	
	public void setTitle(String title) {
		titleTextView.setText(title);
	}
	
	public void setSize(String size) {
		sizeTextView.setText(size);
	}
	
	public void setIcon(int iconResId) {
		iconImageView.setBackgroundResource(iconResId);
	}
}
