package wa.android.task.vo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.StreamCorruptedException;
import java.util.ArrayList;
import java.util.List;

import android.content.Context;

/**
 * 审批搜索的队列数据结构
 * @author candy
 */
public class SearchListData {
	private int maxSize = 5;
	private int size;
	private final String FILETYPE = ".txt";
	private String[] data = new String[maxSize];
	private Context context;
	
	public SearchListData(Context context) {
		this.context = context;
	}
	public void add(String e) {
		if(size >= maxSize) {
			for(int i=size-2; i>=0; i--) {
				data[i+1] = data[i];
			}
		} else {
			for(int i=size-1; i>=0; i--) {
				data[i+1] = data[i];
			}
			size++;
		}
		data[0] = e;
	}
	
	public void parseData(String[] list) {
		size = 0;
		if(list != null)
			for(int i=0; i<list.length; i++) {
				data[i] = list[i];
				size ++;
			}
	}
	
	public List<String> getStringList() {
		List<String> list = new ArrayList<String>();
		for(int i=0; i<size; i++) {
			list.add(data[i]);
		}
		return list;
	}
	
	public String getHeadElement() {
		if(size >= 1)
			return data[0];
		return null;
	}
	
	public String getElement(int i) {
		return data[i];
	}

	public String[] getData() {
		String[] returnData = new String[size];
		for(int i=0; i<size; i++) {
			returnData[i] = data[i];
		}
		return returnData;
	}
	
	public int size() {
		return size;
	}
	public void write(String userName, String account, String filename, Object data) {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = context.openFileOutput(filename + "_" + userName + "_" + account + FILETYPE, Context.MODE_PRIVATE);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(data);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fos != null)
					fos.close();
				if(oos != null) {
					oos.flush();
					oos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}
	
	public String[] read(String userName, String account, String filename) {
		String[] resultList = null;
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis = context.openFileInput(filename + "_" + userName + "_" + account + FILETYPE);
			ois = new ObjectInputStream(fis);
			resultList = (String[]) ois.readObject();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (StreamCorruptedException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fis != null)
					fis.close();
				if(ois != null)
					ois.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return resultList;
	}
}
