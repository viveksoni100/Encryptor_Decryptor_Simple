package com.multipart;
import java.security.Key;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class CryptoUtils {

	private static final String ALGORITHM = "AES";
	private static final String KEY = "Thats my EASE VI";

	public static byte[] encrypt(byte[] inputFile) throws CryptoException {
		try {
			Key secretKey = new SecretKeySpec(KEY.getBytes(), ALGORITHM);
			Cipher cipher = Cipher.getInstance(ALGORITHM);
			cipher.init(Cipher.ENCRYPT_MODE, secretKey);
			byte[] outputBytes = cipher.doFinal(inputFile);
			return outputBytes;
		} catch (Exception e) {
			// TODO: handle exception
			throw new CryptoException("Error encrypting file", e);
		}
	}

	public static byte[] decrypt(byte[] outputFile) throws CryptoException {
		try {
			Key secretKey = new SecretKeySpec(KEY.getBytes(), ALGORITHM);
			Cipher cipher = Cipher.getInstance(ALGORITHM);
			cipher.init(Cipher.DECRYPT_MODE, secretKey);
			byte[] inputFile = cipher.doFinal(outputFile);
			return inputFile;
		} catch (Exception e) {
			// TODO: handle exception
			throw new CryptoException("Error decrypting file", e);
		}
	}
}
