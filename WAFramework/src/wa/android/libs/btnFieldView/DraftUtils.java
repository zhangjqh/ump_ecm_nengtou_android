package wa.android.libs.btnFieldView;

import java.util.ArrayList;
import java.util.HashMap;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

/**
 * 
 * 数据库操作
 * @author damilong
 *
 */
public class DraftUtils {

	private static final String TAG = "DraftUtils";
	private Context context;
	private Handler controlHandler;
	
	private static DatabaseHelper mOpenHelper;
	private SQLiteDatabase database;
	private static final String DATABASE_NAME = "DRAFTDB.db";
	private static final int DATABASE_VERSION = 1;
	
	public DraftUtils(Context context) {
		this.context = context;
	}
	
	private static class DatabaseHelper extends SQLiteOpenHelper {

		public DatabaseHelper(Context context) {
			super(context, DATABASE_NAME, null, DATABASE_VERSION);
		}

		@Override
		public void onCreate(SQLiteDatabase db) {
			
			StringBuilder funcsql = new StringBuilder();
			funcsql.append("CREATE TABLE IF NOT EXISTS PARAMETERS (");
			funcsql.append("_ID INTEGER PRIMARY KEY,");
			funcsql.append("NAME TEXT NOT NULL,");
			funcsql.append("LEFT INTEGER,");
			funcsql.append("TOP INTEGER,");
			funcsql.append("RIGHT INTEGER,");
			funcsql.append("BOTTOM INTEGER");
			funcsql.append(" );");
			
			Log.e("create sql: ", funcsql.toString());
			
			db.execSQL(funcsql.toString());
		}

		@Override
		public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
			
		}
		
	}
	
	/**
	 * 打开数据库
	 */
	public void openDB() {
		if(mOpenHelper == null) {
			mOpenHelper = new DatabaseHelper(context);
			Log.w(TAG,">>>>>>>>>>>>>> 数据库已经开启");
		}
	}
	
	/**
	 * 关闭数据库
	 */
	public void closeDB() {
		if(database != null) {
			database.close();
		}
		if(mOpenHelper != null) {
			mOpenHelper.close();
		}
		Log.w(TAG,">>>>>>>>>>>>>> 数据库已经关闭");
	}
	
	public void queryFuncs() {
		ArrayList<HashMap<String, Object>> funcs = new ArrayList<HashMap<String, Object>>();
		try {
			openDB();
			database = mOpenHelper.getWritableDatabase();
			String sql = "select * from PARAMETERS";
			Cursor result = database.rawQuery(sql, null);
			if(result != null) {
				while(result.moveToNext()) {
					HashMap<String, Object> func = new HashMap<String, Object>();
					int id = result.getInt(result.getColumnIndexOrThrow("_ID"));
					String name = result.getString(result.getColumnIndexOrThrow("NAME"));
					int left = result.getInt(result.getColumnIndexOrThrow("LEFT"));
					int top = result.getInt(result.getColumnIndexOrThrow("TOP"));
					int right = result.getInt(result.getColumnIndexOrThrow("RIGHT"));
					int bottom = result.getInt(result.getColumnIndexOrThrow("BOTTOM"));
					
					func.put("id", id);
					func.put("name", name);
					func.put("left", left);
					func.put("top", top);
					func.put("right", right);
					func.put("bottom", bottom);
					
					funcs.add(func);
					
					Log.i(TAG, ">>>>>>>>>>>>>> id: " + id + " name: " + name + " left: " + left + " top: " + top + " right: " + right + " bottom: " + bottom);
				}
			}
			result.close();
			database.close();
			sendHandlerMessage(1, funcs);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void saveFunc(String name, int left, int top, int right, int bottom) {
		try {
			openDB();
			database = mOpenHelper.getWritableDatabase();
			ContentValues values = new ContentValues();
			values.put("NAME", name);
			values.put("LEFT", left);
			values.put("TOP", top);
			values.put("RIGHT", right);
			values.put("BOTTOM", bottom);
			Log.i(TAG, "saveFuncNames>>>>>>>>>>>>>> name: " + name + " left: " + left + " top: " + top + " right: " + right + " bottom: " + bottom);
			database.insertOrThrow("PARAMETERS", null, values);
			database.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void updatePositon(int id, int left, int top, int right, int bottom) {
		try {
			openDB();
			database = mOpenHelper.getWritableDatabase();
			ContentValues values = new ContentValues();
			values.put("LEFT", left);
			values.put("TOP", top);
			values.put("RIGHT", right);
			values.put("BOTTOM", bottom);
			database.update("PARAMETERS", values, "_ID = " + id, null);
			Log.i(TAG, "savePositon>>>>>>>>>>>>>> id: " + id + " left: " + left + " top: " + top + " right: " + right + " bottom: " + bottom);
			database.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void deleteFunc(int id) {
		try {
			openDB();
			database = mOpenHelper.getWritableDatabase();
			database.delete("PARAMETERS", "_ID = " + id, null);
			Log.i(TAG, "deleteFunc>>>>>>>>>>>>>> id: " + id);
			database.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	public void setControlHandler(Handler handler) {
		controlHandler = handler;
	}
	
	/**
     * 消息通讯
     * @param event
     */
	private void sendHandlerMessage(int event, Object obj) {
		if (controlHandler != null) {
			controlHandler.sendMessage(Message.obtain(controlHandler, event, obj));
		}
	}
}
