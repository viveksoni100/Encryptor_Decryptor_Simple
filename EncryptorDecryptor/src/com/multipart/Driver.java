package com.multipart;

public class Driver {
	
	public static void main(String[] args) {
		
		byte[] inputFile = null;
		byte[] decryptedFile = null;
        
        try {
        	
        	System.out.println(CryptoUtils.encrypt(inputFile));
        	System.out.println(CryptoUtils.decrypt(decryptedFile));
        	
        } catch (Exception e) {
			// TODO: handle exception
        	System.out.println(e.getMessage());
            e.printStackTrace();
		}
		
	}

}
