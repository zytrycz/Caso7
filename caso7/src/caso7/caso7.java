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
    
    public void getTops(ArrayList pLetras, ArrayList pNum){
        
    
    }
    
    public static void main(String[] args) 
        {
                //Encrypte text
                String encryptedString = "xZwM7BWIpSjYyGFr9rhpEa+cYVtACW7yQKmyN6OYSCv0ZEg9jWbc6lKzzCxRSSIvOvlimQZBMZOYnOwiA9yy3YU8zk4abFSItoW6Wj0ufQ0=";
                
                Globals global = new Globals();
                
                String[] letras= global.getLETRAS();
                
                String key="29dh120_dk1_3";
                
                String atKey;
                String decryptedString;
                
                ProbDesincripter decripter = new ProbDesincripter();
                ArrayList ltupleLetters = new ArrayList();
                ArrayList ltupleNumbers = new ArrayList();

                decripter.getKey(encryptedString, key, ltupleLetters ,ltupleNumbers ); //generates 2 arrays of tuples with the form (value, probability)
                
                ArrayList topLetters = new ArrayList();
                ArrayList topNumbers = new ArrayList();
                
                

                for(int i=0;i<10;i++){
                    for(int j=0;j<letras.length;j++){
                        atKey=key+letras[j]+key+(Integer.toString(i))+key;
                        System.out.println("Attempted key= "+ atKey);
                        decryptedString= Aes.decrypt(encryptedString,atKey );
                        System.out.println(decryptedString);
                    }
                }
                
        }
}
