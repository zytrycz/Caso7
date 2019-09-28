/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caso7;

import java.util.ArrayList;

/**
 *
 * @author jonac
 */
public class caso7 {
    public static void main(String[] args) 
        {
                /*We wil use "29dh120adk103" as the key
                * first param is the text to encrypt, second one the key
                * returns the text encrypted*/
                String encryptedString = "xZwM7BWIpSjYyGFr9rhpEa+cYVtACW7yQKmyN6OYSCv0ZEg9jWbc6lKzzCxRSSIvOvlimQZBMZOYnOwiA9yy3YU8zk4abFSItoW6Wj0ufQ0=";
                String encryptedKey="29dh120_dk1_3";
                ArrayList pLetras=new ArrayList<tuple>();
                ArrayList pNumeros=new ArrayList<tuple>();
                Globals.setLETRAS();
                
                ProbDesincripter desencripter=new ProbDesincripter();
                desencripter.getKey(encryptedString, encryptedKey, pLetras, pNumeros);
               // System.out.println(Globals.getATTEMPTS());
                //using the encrypted text and the respective key, return the real text
                /*
                String[] letras={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u",
        "v","x","y","z"};
                String skey="29dh120",mkey="dk1",fkey="3";
                System.out.println(encryptedString);
                
                String atkey;
                String decryptedString;
                for(int i=0;i<10;i++){
                    for(int j=0;j<letras.length;j++){
                        atkey=skey+letras[j]+mkey+(Integer.toString(i))+fkey;
                        System.out.println("Attempted key= "+ atkey);
                        decryptedString= Aes.decrypt(encryptedString,atkey );
                        System.out.println(decryptedString);
                    }
                }*/
                
                
                //test
                //System.out.println(encryptedString);
                //System.out.println(decryptedString);
        }
}
