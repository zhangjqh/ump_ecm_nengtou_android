package wa.android.libs.row4itemview;
import wa.android.libs.groupview.WARowStyle;
import android.content.Context;
import android.view.Gravity;
import android.widget.LinearLayout;

/**
 * @author damilong
 *	相对WA后台RowItem动态项目形成的行控件
 *	行内容可能为1-4项目,1-2项时为单行,3-4项时为两行
 *	提供了两个赋值方法, 以此自动生成对应行数
 *	
 */
public class WARow4Item extends LinearLayout {
	
	private Context context;
	private WARow4ItemChild firstRow ,secondRow;
	public WARow4Item(Context context) {
		super(context);
		this.context = context;
		initsecond();
	}
	
	private void initsecond() {
		// TODO Auto-generated method stub
		WARowStyle rowStyle = new WARowStyle(this.context);
		setOrientation(VERTICAL);
		setGravity(Gravity.CENTER_VERTICAL);
		setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
		setPadding(0, rowStyle.getRowPaddingTop(),0, rowStyle.getRowPaddingTop());
		firstRow = new WARow4ItemChild(
				context);
		addView(firstRow);

	}

	public void setValue(String firstrowkey, String firstrowvalue, String secondrowkey,String secondrowvalue) {
		firstRow.setValue(firstrowkey, firstrowvalue);
		secondRow = new WARow4ItemChild(
				context);
		secondRow.setValue(secondrowkey, secondrowvalue);
		addView(secondRow);
	}
	public void setSingleRowValue(String firstrowkey, String firstrowvalue) {
		firstRow.setValue(firstrowkey, firstrowvalue);
	}

	
}
