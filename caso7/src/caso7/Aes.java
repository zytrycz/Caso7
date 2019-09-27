/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caso7;

/**
 *
 * @author BryanDV
 */
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class Aes {

	private static SecretKeySpec secretKey;
	private static byte[] key;
        
        
	public static SecretKeySpec setKey(String myKey) 
	{
		MessageDigest sha = null;
		try {
			key = myKey.getBytes("UTF-8");
			sha = MessageDigest.getInstance("SHA-1");
			key = sha.digest(key);
			key = Arrays.copyOf(key, 16); 
			secretKey = new SecretKeySpec(key, "AES");
		} 
		catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} 
		catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
                
                return secretKey;
	}

	public static String encrypt(String strToEncrypt, String secret) 
	{
		try 
		{
			setKey(secret);
			Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
			cipher.init(Cipher.ENCRYPT_MODE, secretKey);
			return Base64.getEncoder().encodeToString(cipher.doFinal(strToEncrypt.getBytes("UTF-8")));
		} 
		catch (Exception e) 
		{
			System.out.println("Error while encrypting: " + e.toString());
		}
		return null;
	}

	public static String decrypt(String strToDecrypt, String secret) 
	{
		try 
		{
			setKey(secret); //The "Key" is translated to the real key
			Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5PADDING");
			cipher.init(Cipher.DECRYPT_MODE, secretKey);
			return new String(cipher.doFinal(Base64.getDecoder().decode(strToDecrypt)));
		} 
		catch (Exception e) 
		{
			System.out.println("Error while decrypting: " + e.toString());
		}
		return null;
	}
        
        public static void main(String[] args) 
        {
                /*We wil use "29dh120adk103" as the key
                * first param is the text to encrypt, second one the key
                * returns the text encrypted*/
                String encryptedString = Aes.encrypt("Hello sir than II", "29dh120adk103") ;
                
                //using the encrypted text and the respective key, return the real text
                String decryptedString = Aes.decrypt(encryptedString, "29dh120adk103") ;
                
                //test
                System.out.println(encryptedString);
                System.out.println(decryptedString);
        }
}
