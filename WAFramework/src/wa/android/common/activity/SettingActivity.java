package wa.android.common.activity;

import java.util.ArrayList;
import java.util.List;

import wa.android.common.App;
import wa.android.common.R;
import wa.android.libs.groupview.WAGroupView;
import wa.android.libs.groupview.WAPanelView;
import wa.android.libs.groupview.WARow4ValueIcon;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;

/**
 * 设置界面，任何module共有此设置界面的三个设置项 各别module会有自己单独的设置项，需在module里添加
 * 
 * @author Omi
 * 
 */
public class SettingActivity extends BaseActivity {

	private ScrollView setView;

	private Button backBtn;

	private List<SettingOption> optionList = new ArrayList<SettingOption>();

	public static final String BUNDLE_KEY_OPTIONS = "BUNDLE_OPTIONS";
	public static final String BUNDLE_KEY_ABOUT_RES_ID = "BUNDLE_KEY_ABOUT_RES_ID";

	private int aboutResId = -1;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		initialData();
		initialView();
	}

	private void initialView() {
		setContentView(R.layout.activity_setting);

		backBtn = (Button) findViewById(R.id.setting_title_backBtn);
		backBtn.setText(getString(R.string.back));
		backBtn.setTextColor(Color.rgb(255, 255, 255));
		backBtn.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				finish();
			}
		});

		setView = (ScrollView) findViewById(R.id.setting_panel);

		WAPanelView panel = new WAPanelView(SettingActivity.this);
		// 动态项
		loadSettingItems(panel);
		// 固定项

		for (final SettingOption option : optionList) {
			if (option instanceof SettingOptionView) {
				View view = ((SettingOptionView) option).getView(this);
				LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
						LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT);

				lp.setMargins(getPxByDp(8), getPxByDp(12), getPxByDp(8), 0);
				panel.addView(view, lp);
			} else {
				WAGroupView group = new WAGroupView(this);
				WARow4ValueIcon row = new WARow4ValueIcon(this);
				row.setValue(option.getDes());
				row.setIcon(option.getImageResID());
				row.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						Class<?> clazz = option.getTriggerClazz();
						if (clazz != null) {
							final Intent i = new Intent(getBaseContext(), clazz);
							if (clazz == SetConnectionActivity.class) {
								new AlertDialog.Builder(SettingActivity.this)
										.setTitle(R.string.tip)
										.setMessage(R.string.isModifyConnection)
										.setPositiveButton(
												R.string.submit,
												new DialogInterface.OnClickListener() {
													@Override
													public void onClick(
															DialogInterface dialog,
															int which) {
														startActivity(i);
													}
												})
										.setNegativeButton(R.string.cancel,
												null).show();
							} else {
								startActivity(i);
							}
						}
					}
				});
				group.addRow(row);
				panel.addGroup(group);
			}
		}
		;

		setView.addView(panel);
	}

	private WAPanelView loadSettingItems(WAPanelView panel) {
		// 动态添加项
		if (((App) getApplicationContext()).getConfig().getSetOptions().size() > 0) {

			for (final SettingOption option : ((App) getApplicationContext())
					.getConfig().getSetOptions()) {
				if (option instanceof SettingOptionView) {
					View view = ((SettingOptionView) option).getView(this);
					LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
							LayoutParams.MATCH_PARENT,
							LayoutParams.WRAP_CONTENT);

					lp.setMargins(getPxByDp(8), getPxByDp(12), getPxByDp(8), 0);
					panel.addView(view, lp);
				} else {
					WAGroupView group = new WAGroupView(this);
					WARow4ValueIcon row = new WARow4ValueIcon(this);
					row.setValue(option.getDes());
					row.setOnClickListener(new OnClickListener() {
						@Override
						public void onClick(View v) {
							Class<?> clazz = option.getTriggerClazz();
							if (clazz != null) {
								Intent i = new Intent(getBaseContext(), clazz);
								if (clazz == AboutActivity.class) {
									i.putExtra(
											SettingActivity.BUNDLE_KEY_ABOUT_RES_ID,
											aboutResId);
								}
								startActivity(i);
							}
						}
					});
					group.addRow(row);
					panel.addGroup(group);
				}

			}

		}
		return panel;
	}

	private void initialData() {
		// 关于
		SettingOption aboutOption = new SettingOptionNormal();
		aboutOption.setDes(getString(R.string.about));
		aboutOption.setTriggerClazz(AboutActivity.class);
		aboutOption.setImageResID(R.drawable.about_icon);
		optionList.add(aboutOption);
		// 设置
		SettingOption setConnectionOption = new SettingOptionNormal();
		setConnectionOption.setDes(getString(R.string.setConnection));
		setConnectionOption.setTriggerClazz(SetConnectionActivity.class);
		setConnectionOption.setImageResID(R.drawable.setting_icon);
		optionList.add(setConnectionOption);
		// 登出
		SettingOption logoutOption = new SettingOptionLogout(this);
		logoutOption.setDes(getString(R.string.logoutCurrentLogin));
		logoutOption.setTriggerClazz(LogoutActivity.class);
		logoutOption.setImageResID(R.drawable.logout_icon);
		optionList.add(logoutOption);
	}

	private final int getPxByDp(int dp) {
		return (int) (getResources().getDisplayMetrics().density * dp);
	}

	@Override
	public boolean isSystemActivity() {
		return true;
	}
}
