import java.io.File;

public class Driver {
	
	public static void main(String[] args) {
		
		String key = "Thats my EASE VI";
        File inputFile = new File("/home/viveksoni100/Documents/abc.png");
        File encryptedFile = new File("/home/viveksoni100/Documents/document_enc");
        File decryptedFile = new File("/home/viveksoni100/Documents/document_dec");
        
        try {
        	
        	CryptoUtils.encrypt(key, inputFile, encryptedFile);
        	CryptoUtils.decrypt(key, encryptedFile, decryptedFile);
        	
        } catch (Exception e) {
			// TODO: handle exception
        	System.out.println(e.getMessage());
            e.printStackTrace();
		}
		
	}

}
