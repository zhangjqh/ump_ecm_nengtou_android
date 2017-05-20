package wa.android.common;

import wa.android.common.utils.DensityUtil;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.BitmapFactory;
import android.graphics.drawable.GradientDrawable;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class UMProgressDialog {
	private String label;
	private String message;
	int valign;
	int halign;
	private static UMProgressDialog progressDialog = null;
	private Dialog mDialog = null;
	private Context mContext = null;

	private TextView titleView = null;
	private TextView tipTextView = null;

	private LinearLayout lineLayout = null;
	private LinearLayout titleLayout = null;

	public UMProgressDialog(Context context) {
		this.mContext = context;
		dismiss();
		mDialog = new Dialog(context, mContext.getResources().getIdentifier(
				"loading_dialog", "style", mContext.getPackageName()));
		mDialog.setCancelable(false);

		creatDialog(context, "", false);
	}

	/*
	 * public void setContext(Context context) { this.mContext = context;
	 * dismiss();
	 * 
	 * mDialog = new Dialog(context, mContext.getResources()
	 * .getIdentifier("dialog", "style", mContext.getPackageName()));
	 * 
	 * creatDialog(context, "", false); }
	 */
	private void creatDialog(Context context, String msg, boolean isCancel) {
		try {
			WindowManager wm = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
			int width = wm.getDefaultDisplay().getWidth();
			int height = wm.getDefaultDisplay().getHeight();
			

			LinearLayout.LayoutParams wrap_content = new LinearLayout.LayoutParams(
					LinearLayout.LayoutParams.WRAP_CONTENT,
					LinearLayout.LayoutParams.WRAP_CONTENT);
			LinearLayout.LayoutParams wrap_content0;
			//针对 小米2s 一类分辨率的机器
			if(width <=720){
				wrap_content0 = new LinearLayout.LayoutParams(
						DensityUtil.px2dip(context, 250), DensityUtil.px2dip(
								context, 250));
			}else{
				wrap_content0 = new LinearLayout.LayoutParams(
						DensityUtil.px2dip(context, 500), DensityUtil.px2dip(
								context, 500));
			}

			LinearLayout main = new LinearLayout(context);

			int[] bgColors = { -8947849, -8947849 };
			GradientDrawable drawable = new GradientDrawable(
					GradientDrawable.Orientation.TOP_BOTTOM, bgColors);

			drawable.setCornerRadius(10.0F);
			main.setBackgroundDrawable(drawable);
			main.setOrientation(LinearLayout.VERTICAL);

			titleLayout = new LinearLayout(context);
			titleLayout.setGravity(3);
			titleView = new TextView(context);
			titleView.setTextSize(18.0F);
			titleView.setSingleLine(true);
			titleView.setPadding(10, 10, 0, 10);
			titleLayout.addView(titleView);
			main.addView(titleLayout, new ViewGroup.LayoutParams(
					ViewGroup.LayoutParams.MATCH_PARENT,
					ViewGroup.LayoutParams.WRAP_CONTENT));

			lineLayout = new LinearLayout(context);
			lineLayout.setBackgroundColor(-854626330);

			main.addView(lineLayout, new ViewGroup.LayoutParams(
					ViewGroup.LayoutParams.MATCH_PARENT, 1));

			wrap_content.setMargins(10, 10, 35, 10);
			wrap_content0.setMargins(15, 15, 20, 15);

			ImageView spaceshipImage = new ImageView(context);

			spaceshipImage.setImageBitmap(BitmapFactory.decodeResource(
					context.getResources(), R.drawable.publicloading));

			tipTextView = new TextView(context);
			tipTextView.setSingleLine(true);
			tipTextView.setText("loading...");
			Animation hyperspaceJumpAnimation = AnimationUtils.loadAnimation(
					context,
					context.getResources().getIdentifier("loading_animation",
							"anim", context.getPackageName()));

			spaceshipImage.startAnimation(hyperspaceJumpAnimation);
			if ((msg != null) && (!"".equals(msg)))
				tipTextView.setText(msg);
			final Dialog loadingDialog = mDialog;
			loadingDialog.setCancelable(isCancel);

			LinearLayout messageLayout = new LinearLayout(context);
			messageLayout.setGravity(16);
			messageLayout.setOrientation(LinearLayout.HORIZONTAL);
			messageLayout.addView(spaceshipImage, wrap_content0);
			messageLayout.addView(tipTextView, wrap_content);
			main.addView(messageLayout, new ViewGroup.LayoutParams(
					ViewGroup.LayoutParams.MATCH_PARENT,
					ViewGroup.LayoutParams.WRAP_CONTENT));
			LinearLayout.LayoutParams fill_parent = new LinearLayout.LayoutParams(
					ViewGroup.LayoutParams.MATCH_PARENT,
					ViewGroup.LayoutParams.MATCH_PARENT);

			loadingDialog.setContentView(main, fill_parent);
			loadingDialog.setOnKeyListener(new DialogInterface.OnKeyListener() {
				public boolean onKey(DialogInterface dialog, int keyCode,
						KeyEvent event) {
					if (loadingDialog.isShowing())
						loadingDialog.dismiss();
					return false;
				}
			});
			titleLayout.setVisibility(8);
			lineLayout.setVisibility(8);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static synchronized UMProgressDialog getInstance(Context ctx) {
		if (progressDialog == null) {
			progressDialog = new UMProgressDialog(ctx);
		}
		return progressDialog;
	}

	public void setProperty(String name, String value) {
		if (name.equals("value")) {
			tipTextView.setText(value);
			return;
		}

		if (name.equals("title")) {
			titleLayout.setVisibility(0);
			lineLayout.setVisibility(0);
			titleView.setText(value);
			return;
		}
	}

	public void show() {
		if ((mDialog != null) && (mDialog.isShowing())) {
			dismiss();
		}
		if (mDialog != null)
			mDialog.show();
	}

	public void dismiss() {
		if (mDialog != null)
			mDialog.dismiss();
	}

	public void setProgressDialogTitle(String title) {
		label = title;
		mDialog.setTitle(label);
	}

	public String getProgressDialogTitle() {
		return label;
	}

	public String getProgressDialogMsg() {
		return message;
	}
}
