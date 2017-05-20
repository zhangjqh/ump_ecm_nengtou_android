package wa.android.common.utils;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import android.content.Context;

public class FileUtil {
	public static boolean writeToFile(byte[] data, File file) {
		boolean result = false;
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(file);
			fos.write(data, 0, data.length);
			result = true;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fos != null)
					fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
	
	public static File writeToAppDataFile(Context context, String filename, byte[] data) {
		File file = new File(context.getFilesDir(), filename);
		System.out.println(file.getAbsolutePath());
		return writeToFile(data, file) ? file : null;
	}
	
	public static byte[] readFromFile(Context context, String filename) throws IOException {
		File file = new File(filename);
		FileInputStream fis = new FileInputStream(file);
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		byte[] buffer = new byte[10240];
		while (true) {
			int len = fis.read(buffer);
			if (len == -1) {
				break;
			} else {
				baos.write(buffer, 0, len);
			}
		}
		return baos.toByteArray();
	}
}
