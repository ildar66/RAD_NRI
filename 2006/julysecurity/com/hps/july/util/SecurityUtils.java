package com.hps.july.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @author dkrivenko
 * 22.03.06
 */
public class SecurityUtils {

	/**
	 * Подпись строки алгоритмом md5 
	 * @param text
	 * @return
	 * @throws NoSuchAlgorithmException 
	 */
	public static String encryptToMD5(String text) throws NoSuchAlgorithmException{
		MessageDigest algorithm = MessageDigest.getInstance("MD5");
		algorithm.reset();
	    
		algorithm.update(text.getBytes());
	    byte messageDigest[] = algorithm.digest();
	    
        StringBuffer hexString = new StringBuffer();
	    for (int i=0;i<messageDigest.length;i++) {
	    	String hex = Integer.toHexString(0xFF & messageDigest[i]);
	    	if (hex.length() == 1) hexString.append('0');
	    	hexString.append(hex);
	    }
	 
	    return hexString.toString();
	}
	
}
