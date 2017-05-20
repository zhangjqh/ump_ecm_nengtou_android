/*     */ package wa.android.common.utils;
/*     */ 
/*     */ import java.security.Key;
import java.security.spec.AlgorithmParameterSpec;

import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

import org.apache.commons.codec.binary.Base64;

import android.util.Log;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class DESEncrypt
/*     */ {
/*  21 */   private static DESEncrypt inst = null;
/*     */   //private static final String DES_KEY = "12345678;";
/*  23 */   private static final byte[] DES_IV = { 18, 52, 86, 120, -112, -85, -51, -17 };
/*  24 */   private AlgorithmParameterSpec iv = null;
/*  25 */   private Key key = null;
/*  26 */   private Cipher cipher = null;
/*     */ 
/*     */   private DESEncrypt()
/*     */   {
/*     */     try
/*     */     {
/*  34 */       DESKeySpec keySpec = new DESKeySpec("12345678;".getBytes("UTF-8"));
/*     */ 
/*  36 */       this.iv = new IvParameterSpec(DES_IV);
/*  37 */       SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
/*  38 */       this.key = keyFactory.generateSecret(keySpec);
/*     */ 
/*  40 */       this.cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
/*     */     } catch (Exception e) {
/*  42 */       inst = null;
/*  43 */       this.iv = null;
/*  44 */       this.key = null;
/*  45 */       this.cipher = null;
/*  46 */       e.printStackTrace();
/*     */     }
/*     */   }
/*     */ 
/*     */   public byte[] encode(byte[] data, boolean isWithBase64)
/*     */   {
/*  59 */     byte[] result = null;
/*     */     try {
/*  61 */       this.cipher.init(1, this.key, this.iv);
/*  62 */       result = this.cipher.doFinal(data);
/*  63 */       if (isWithBase64) {
/*  64 */         return Base64.encodeBase64(result);
/*     */       }
/*  66 */       Log.d(getClass().getName(), "encrypt successfully from " + data.length + " to " + result.length + ", with Base64? " + isWithBase64);
/*     */     }
/*     */     catch (Exception e) {
/*  69 */       e.printStackTrace();
/*     */     }
/*  71 */     return result;
/*     */   }
/*     */ 
/*     */   public byte[] decode(byte[] data, boolean isWithBase64)
/*     */   {
/*  83 */     byte[] result = null;
/*     */     try {
/*  85 */       this.cipher.init(2, this.key, this.iv);
/*  86 */       if (isWithBase64) {
/*  87 */         return this.cipher.doFinal(Base64.decodeBase64(data));
/*     */       }
/*  89 */       result = this.cipher.doFinal(data);
/*  90 */       Log.d(getClass().getName(), "decrypt successfully from " + data.length + " to " + result.length + ", with Base64? " + isWithBase64);
/*     */     } catch (Exception e) {
/*  92 */       e.printStackTrace();
/*     */     }
/*  94 */     return result;
/*     */   }
/*     */ 
/*     */   public static DESEncrypt getInstance()
/*     */   {
/*     */     try
/*     */     {
/* 105 */       if (inst == null)
/* 106 */         inst = new DESEncrypt();
/*     */     }
/*     */     catch (Exception e) {
/* 109 */       e.printStackTrace();
/* 110 */       Log.d(DESEncrypt.class.getName(), "getInstance error!");
/*     */     }
/* 112 */     return inst;
/*     */   }
/*     */ }

/* Location:           C:\Users\Administrator\Desktop\wa-network.jar
 * Qualified Name:     wa.utils.DESEncrypt
 * JD-Core Version:    0.6.0
 */