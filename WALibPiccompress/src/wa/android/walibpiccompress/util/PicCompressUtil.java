package wa.android.walibpiccompress.util;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.Environment;
import android.util.Base64;

public class PicCompressUtil {

	public static String getCompressBitmap(String filePath, String filename,
			int width) {
		String Bitmapcontent = "";
		BitmapFactory.Options options = new BitmapFactory.Options();
		options.inJustDecodeBounds = true;
		BitmapFactory.decodeFile(filePath, options);
		int type = 0;
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		File file = new File(filePath);
		
		if (filename.toLowerCase().contains(".png")) {
			type = 1;
			if(file.length()>204800){
			options.inSampleSize = PicCompressUtil.calculateInSampleSize(
					options, width, type);
			}
			else{
				options.inSampleSize =1;
			}

			options.inJustDecodeBounds = false;
			BitmapFactory.decodeFile(filePath, options).compress(
					Bitmap.CompressFormat.PNG, 100, baos);
		} else {
			type = 2;
			if(file.length()>204800){
			options.inSampleSize = PicCompressUtil.calculateInSampleSize(
					options, width, type);
			}
			else{
				options.inSampleSize =1;
			}
			options.inJustDecodeBounds = false;
			BitmapFactory.decodeFile(filePath, options).compress(
					Bitmap.CompressFormat.JPEG, 100, baos);
		}

		if (baos.size() > 204800) {
			Bitmapcontent = bitmapRateHandler(
					BitmapFactory.decodeFile(filePath, options), type);
		}else{
			if (type == 1) {
				BitmapFactory.decodeFile(filePath, options).compress(Bitmap.CompressFormat.PNG, 100, baos);
			} else {
				BitmapFactory.decodeFile(filePath, options).compress(Bitmap.CompressFormat.JPEG, 100, baos);
			}
			byte[] b = baos.toByteArray();
		
			Bitmapcontent =	Base64.encodeToString(b, Base64.DEFAULT);
//			 try {
//			 creatpic(b);
//			 } catch (IOException e) {
//			 // TODO Auto-generated catch block
//			 e.printStackTrace();
//			 }
		}
		return Bitmapcontent;
	}

	@SuppressWarnings("resource")
	public static String bitmapRateHandler(Bitmap bitmap, int type) {
		int rate = 90;
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		if (type == 1) {
			bitmap.compress(Bitmap.CompressFormat.PNG, rate, baos);
		} else {
			bitmap.compress(Bitmap.CompressFormat.JPEG, rate, baos);
			if (baos.size() > 204800)
				while (baos.size() > 204800) {
					if (rate <= 20)
						break;
					rate = rate - 40;
					baos = rateCompress(bitmap, rate);
				}
		}
		byte[] b = baos.toByteArray();
		// try {
		// creatpic(b);
		// } catch (IOException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		return Base64.encodeToString(b, Base64.DEFAULT);
	}

	private static void creatpic(byte[] b) throws IOException {
		Bitmap bitmap = BitmapFactory.decodeByteArray(b, 0, b.length);// bitmap
		// TODO Auto-generated method stub
		File dirFile = new File(Environment.getExternalStorageDirectory()
				+ File.separator + "com" + File.separator + "yonyou");
		if (!dirFile.exists()) {
			dirFile.mkdir();
		}
		File myCaptureFile = new File(Environment.getExternalStorageDirectory()
				+ File.separator + "com" + File.separator + "yonyou"
				+ File.separator + "测试图片123.jpg");
		BufferedOutputStream bos = new BufferedOutputStream(
				new FileOutputStream(myCaptureFile));
		bitmap.compress(Bitmap.CompressFormat.PNG, 100, bos);
		bos.flush();
		bos.close();
	}

	public static int calculateInSampleSize(BitmapFactory.Options options,
			int reqWidth, int type) {
		final int height = options.outHeight;
		final int width = options.outWidth;
		final int reqHeight = reqWidth / 2 * height / width;
		int inSampleSize = 1;
		if (type == 1) {
			if (height > reqHeight || width > reqWidth) {
				final int heightRatio = Math.round((float) height
						/ (float) (reqHeight / 2));
				final int widthRatio = Math.round((float) width
						/ (float) (reqWidth / 2));
				inSampleSize = heightRatio < widthRatio ? heightRatio
						: widthRatio;
			}
		} else {
			if (height > reqHeight || width > reqWidth) {
				final int heightRatio = Math.round((float) height
						/ (float) (reqHeight / 1));
				final int widthRatio = Math.round((float) width
						/ (float) (reqWidth / 1));
				inSampleSize = heightRatio < widthRatio ? heightRatio
						: widthRatio;
			}
		}
		return inSampleSize;
	}

	public static ByteArrayOutputStream rateCompress(Bitmap bitmap, int rate) {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		bitmap.compress(Bitmap.CompressFormat.JPEG, rate, baos);
		return baos;
	}
}
