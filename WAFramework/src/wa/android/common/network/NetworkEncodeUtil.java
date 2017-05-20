package wa.android.common.network;

import wa.android.common.utils.DESEncrypt;
import wa.android.common.utils.GZipCompress;

public class NetworkEncodeUtil {
	
	public static enum DataProcessOrder {
		ENCRYPT_FIRST, COMPRESS_FIRST;
	}
	/**
	 *
	 * 数据编码
	 * 
	 * @param data
	 * @param isEncrypt
	 * @param encryptiontype
	 * @param isCompress
	 * @param order
	 * @return
	 */
	public static final byte[] encode(byte[] data, boolean isEncrypt,
			int encryptiontype, boolean isCompress, DataProcessOrder order) {
		byte[] result = data;
		try {
			if (order == DataProcessOrder.ENCRYPT_FIRST) {
				if (isEncrypt) {
					switch (encryptiontype) {
					case 1:
						result = DESEncrypt.getInstance().encode(result, true);
						break;
					case 2:
						result = DESEncrypt.getInstance().encode(result, false);
					}
				}
				if (isCompress)
					result = GZipCompress.gZip(result);
			} else {
				if (isCompress) {
					result = GZipCompress.gZip(result);
				}
				if (isEncrypt) {
					switch (encryptiontype) {
					case 1:
						result = DESEncrypt.getInstance().encode(result, true);
						break;
					case 2:
						result = DESEncrypt.getInstance().encode(result, false);
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return result;
	}

	/**
	 * 数据解码
	 * 
	 * @param src
	 * @param isEncrypt
	 * @param encryptiontype
	 * @param isCompress
	 * @param order
	 * @return
	 */
	public static final byte[] decode(byte[] src, boolean isEncrypt,
			int encryptiontype, boolean isCompress, DataProcessOrder order) {
		byte[] result = src;
		try {
			if (order == DataProcessOrder.ENCRYPT_FIRST) {
				if (isCompress) {
					result = GZipCompress.unGZip(result);
				}
				if (isEncrypt) {
					switch (encryptiontype) {
					case 1:
						result = DESEncrypt.getInstance().decode(result, true);
						break;
					case 2:
						result = DESEncrypt.getInstance().decode(result, false);
					default:
						break;
					}
				}
			} else {
				if (isEncrypt) {
					switch (encryptiontype) {
					case 1:
						result = DESEncrypt.getInstance().decode(result, true);
						break;
					case 2:
						result = DESEncrypt.getInstance().decode(result, false);
					}
				}

				if (isCompress) {
					result = GZipCompress.unGZip(result);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return result;
	}
}
