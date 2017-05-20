/*    */ package wa.android.common.utils;
/*    */ 
/*    */ import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

import android.util.Log;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class GZipCompress
/*    */ {
/* 17 */   private static int BUFFER_SIZE = 4096;
/*    */ 
/*    */   public static byte[] gZip(byte[] data)
/*    */   {
/* 28 */     ByteArrayOutputStream out = new ByteArrayOutputStream();
/*    */     try
/*    */     {
/* 31 */       GZIPOutputStream gzip = new GZIPOutputStream(out);
/* 32 */       gzip.write(data);
/* 33 */       gzip.close();
/*    */     } catch (IOException e) {
/* 35 */       e.printStackTrace();
/* 36 */       return null;
/*    */     }
/*    */     //GZIPOutputStream gzip;
/* 38 */     byte[] result = out.toByteArray();
/* 39 */     Log.d(GZipCompress.class.getName(),  "Zip successfully from " + data.length + " to " + result.length);
/* 40 */     return result;
/*    */   }
/*    */ 
/*    */   public static byte[] unGZip(byte[] data)
/*    */   {
/*    */     try
/*    */     {
/* 53 */       ByteArrayInputStream baInputStream = new ByteArrayInputStream(data);
/* 54 */       GZIPInputStream gzipInputStream = new GZIPInputStream(baInputStream);
/* 55 */       byte[] buf = new byte[BUFFER_SIZE];
/* 56 */       int num = -1;
/* 57 */       ByteArrayOutputStream baos = new ByteArrayOutputStream();
/* 58 */       while ((num = gzipInputStream.read(buf, 0, buf.length)) != -1) {
/* 59 */         baos.write(buf, 0, num);
/*    */       }
/* 61 */       baos.flush();
/* 62 */       baos.close();
/* 63 */       gzipInputStream.close();
/* 64 */       baInputStream.close();
/* 65 */       byte[] result = baos.toByteArray();
/* 66 */       Log.d(GZipCompress.class.getName(),  "unZip successfully from " + data.length + " to " + result.length);
/* 67 */       return result;
/*    */     } catch (IOException e) {
/* 69 */       e.printStackTrace();
/* 70 */     }return null;
/*    */   }
/*    */ }

/* Location:           C:\Users\Administrator\Desktop\wa-network.jar
 * Qualified Name:     wa.utils.GZipCompress
 * JD-Core Version:    0.6.0
 */