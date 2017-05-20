package wa.android.libs.row4itemview;

import android.content.Context;
import android.graphics.Color;
import android.view.WindowManager;

public class WA4ItemRowStyle {
	private int colorGray = Color.rgb(100, 100, 100);
	private static final int COMMON_PADDING_480 = 6;
	private static final int ROW_PADDING_LEFT_480 = 12;
	private static final int ROW_PADDING_TOP_480 = 6;
	private static final int ROW_PADDING_RIGHT_480 = 12;
	private static final int ROW_PADDING_BOTTOM_480 = 6;

	private static final int COMMON_PADDING_720 = 9;
	private static final int ROW_PADDING_LEFT_720 = 18;
	private static final int ROW_PADDING_TOP_720 = 9;
	private static final int ROW_PADDING_RIGHT_720 = 18;
	private static final int ROW_PADDING_BOTTOM_720 = 9;
	
	private static final int TEXT_SIZE_NAME_480 = 20;//
	private static final int TEXT_SIZE_VALUE_480 = 24;//
	private static final int TEXT_SIZE_COLON_480 = 20;//
	private static final int TEXT_SIZE_TEXT_480 = 20;

	private static final int TEXT_SIZE_NAME_720 = 30;//
	private static final int TEXT_SIZE_VALUE_720 = 36;//
	private static final int TEXT_SIZE_COLON_720 = 30;//
	private static final int TEXT_SIZE_TEXT_720 = 30;
	
	private static final int ncv_NAME_WIDTH_480 = 200;
	private static final int ncv_NAME_PADDING_LEFT_480 = 19;
	private static final int ncv_NAME_PADDING_RIGHT_480 = 20;

	private static final int ncv_NAME_WIDTH_720 = 300;
	private static final int ncv_NAME_PADDING_LEFT_720 = 29;
	private static final int ncv_NAME_PADDING_RIGHT_720 = 30;

	private int nameWidth = ncv_NAME_WIDTH_480;
	private int namePaddingLeft = ncv_NAME_PADDING_LEFT_480;
	private int namePaddingRight = ncv_NAME_PADDING_RIGHT_480;
	
	private int nameTextSize = TEXT_SIZE_NAME_480;
	private int valueTextSize = TEXT_SIZE_VALUE_480;
	private int colonTextSize = TEXT_SIZE_COLON_480;
	private int textTextSize = TEXT_SIZE_TEXT_480;
	
	private int commonPadding = COMMON_PADDING_480;
	private int rowPaddingLeft = ROW_PADDING_LEFT_480;
	private int rowPaddingTop = ROW_PADDING_TOP_480;
	private int rowPaddingRight = ROW_PADDING_RIGHT_480;
	private int rowPaddingBottom = ROW_PADDING_BOTTOM_480;
	
	public WA4ItemRowStyle(Context context) {
		int width = ((WindowManager) context.getSystemService(Context.WINDOW_SERVICE)).getDefaultDisplay().getWidth();
		if (width >= 640) {
			nameWidth = ncv_NAME_WIDTH_720;
			namePaddingLeft = ncv_NAME_PADDING_LEFT_720;
			namePaddingRight = ncv_NAME_PADDING_RIGHT_720;
			
			commonPadding = COMMON_PADDING_720;
			rowPaddingLeft = ROW_PADDING_LEFT_720;
			rowPaddingTop = ROW_PADDING_TOP_720;
			rowPaddingRight = ROW_PADDING_RIGHT_720;
			rowPaddingBottom = ROW_PADDING_BOTTOM_720;
			
			nameTextSize = TEXT_SIZE_NAME_720;
			valueTextSize = TEXT_SIZE_VALUE_720;
			colonTextSize = TEXT_SIZE_COLON_720;
			textTextSize = TEXT_SIZE_TEXT_720;
		}
	}

	public int getCommonPadding() {
		return commonPadding;
	}

	public int getNameWidth() {
		return nameWidth;
	}

	public int getNamePaddingLeft() {
		return namePaddingLeft;
	}

	public int getNamePaddingRight() {
		return namePaddingRight;
	}

	public int getNameTextSize() {
		return nameTextSize;
	}

	public int getValueTextSize() {
		return valueTextSize;
	}

	public int getColonTextSize() {
		return colonTextSize;
	}

	public int getTextTextSize() {
		return textTextSize;
	}

	public int getRowPaddingLeft() {
		return rowPaddingLeft;
	}

	public int getRowPaddingTop() {
		return rowPaddingTop;
	}

	public int getRowPaddingRight() {
		return rowPaddingRight;
	}

	public int getRowPaddingBottom() {
		return rowPaddingBottom;
	}

	public int getColorgray() {
		return colorGray;
	}
	
}
