package com.ab.utilities;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.regex.Pattern;

public class DataValidation {
	
	
   //password Encryption
	public static String encryptPassword(String customerPassword) {
		
            String encryptedpassword = null;
		try {	
			MessageDigest m = MessageDigest.getInstance("MD5");
			m.update(customerPassword.getBytes()); 
		
			byte[] bytes = m.digest(); 
			
			StringBuilder s = new StringBuilder();  
			
	        for(int i=0; i< bytes.length ;i++){  
	            s.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));  
	        }  
	        encryptedpassword = s.toString();         
	       
	        return encryptedpassword;
	        
            }catch(NoSuchAlgorithmException e) {System.out.println(e);}
		
		     return null;	
	}
	
	//Email validation
    public static String validateEmail(String customerEmail) {
        if (customerEmail == null || customerEmail.isEmpty()) {
            return null;
        }
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." +"[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(emailRegex);
        if (pattern.matcher(customerEmail).matches()) {
            return customerEmail;
        } 
            return null;
    }
	
	
	
	

}
