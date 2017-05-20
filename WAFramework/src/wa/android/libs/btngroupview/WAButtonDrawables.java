package wa.android.libs.btngroupview;

import wa.android.common.R;

public class WAButtonDrawables {
	// 两套按钮的按下的图片
	private final static int[] twoBtnDrawablesPressed = {
			R.drawable.label_2_left_touch,
			R.drawable.label_2_right_touch };
	// 两套按钮不按下的图片
	private final static int[] twoBtnDrawablesUnPress = {
			R.drawable.label_2_left,
			R.drawable.label_2_right };
	// 三套按钮按下的图片
	private final static int[] threeBtnDrawablesPressed = {
			R.drawable.label_3_left_touch,
			R.drawable.label_3_middle_touch,
			R.drawable.label_3_right_touch };
	// 三套按钮不按下的图片
	private final static int[] threeBtnDrwablesUnPress = {
			R.drawable.label_3_left,
			R.drawable.label_3_middle,
			R.drawable.label_3_right };
	// 四套按下去的按钮图片
	private final static int[] fourBtnDrawablesPressed = {
			R.drawable.label_4_left_touch,
			R.drawable.label_4_middle_touch,
			R.drawable.label_4_middle_touch,
			R.drawable.label_4_right_touch };
	// 四套不按下去的按钮图片
	private final static int[] fourBtnDrawablesUnPress = new int[] {
			R.drawable.label_4_left,
			R.drawable.label_4_middle,
			R.drawable.label_4_middle,
			R.drawable.label_4_right };

	public static int[] getBtnDrawablesPressed(int count) {
		int[] pressedDrawables = null;
		switch (count) {
		case 2:
			pressedDrawables = twoBtnDrawablesPressed;
			break;
		case 3:
			pressedDrawables = threeBtnDrawablesPressed;
			break;
		case 4:
			pressedDrawables = fourBtnDrawablesPressed;
			break;
		}
		return pressedDrawables;
	}

	public static int[] getBtnDrawablesUnPress(int count) {
		int[] unPressDrawables = null;
		switch (count) {
		case 2:
			unPressDrawables = twoBtnDrawablesUnPress;
			break;
		case 3:
			unPressDrawables = threeBtnDrwablesUnPress;
			break;
		case 4:
			unPressDrawables = fourBtnDrawablesUnPress;
			break;
		}
		return unPressDrawables;
	}

}
