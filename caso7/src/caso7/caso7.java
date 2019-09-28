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
    
    public void getTops(ArrayList<tuple> pLetras, ArrayList<tuple>  pNumbers, int pSizeNumbers, int pSizeLeters){
        
        for (int index = 0; index < pSizeNumbers-1; index++){        
            if ( pNumbers.get(index).getProbability() < pNumbers.get(index+1).getProbability() ){
                tuple auxiliar = pNumbers.get(index);
                pNumbers.set(index, pNumbers.get(index+1) );
                pNumbers.set(index+1, auxiliar);
            }
            
        }
        
        
        for (int index = 0; index < pSizeLeters-1; index++){
             if ( pLetras.get(index).getProbability() < pLetras.get(index+1).getProbability() ){
                tuple auxiliar = pLetras.get(index);
                pLetras.set(index, pLetras.get(index+1) );
                pLetras.set(index+1, auxiliar);
            }
        }
        
    
    }
    
    public  void main(String[] args) 
        {
                //Encrypte text
                String encryptedString = "xZwM7BWIpSjYyGFr9rhpEa+cYVtACW7yQKmyN6OYSCv0ZEg9jWbc6lKzzCxRSSIvOvlimQZBMZOYnOwiA9yy3YU8zk4abFSItoW6Wj0ufQ0=";
                
                Globals global = new Globals();
                
                String[] letras= global.getLETRAS();
                
                String key="29dh120_dk1_3";
                
                String atKey;
                String decryptedString;
                
                ProbDesincripter decripter = new ProbDesincripter();
                ArrayList tupleLetters = new ArrayList();
                ArrayList tupleNumbers = new ArrayList();

                decripter.getKey(encryptedString, key, tupleLetters ,tupleNumbers ); //generates 2 arrays of tuples with the form (value, probability)
                
                ArrayList topLetters = new ArrayList();
                ArrayList topNumbers = new ArrayList();
                this.getTops(tupleLetters, tupleNumbers, tupleNumbers.size(), tupleLetters.size());
                

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
