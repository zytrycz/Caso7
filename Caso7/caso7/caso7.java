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
                //Encrypte text
                String encryptedString = "xZwM7BWIpSjYyGFr9rhpEa+cYVtACW7yQKmyN6OYSCv0ZEg9jWbc6lKzzCxRSSIvOvlimQZBMZOYnOwiA9yy3YU8zk4abFSItoW6Wj0ufQ0=";
                ArrayList<tuple> pLetras=new ArrayList<>();
                ArrayList<tuple> pNumeros=new ArrayList<>();
                Globals.setLETRAS();                
                String key="29dh120_dk1_3";
                ProbDesincripter decripter = new ProbDesincripter();

                decripter.getKey(encryptedString, key, pLetras ,pNumeros ); //generates 2 arrays of tuples with the form (value, probability)
                
                decripter.getTops(pLetras, pNumeros, pNumeros.size(), pLetras.size());
                
                pLetras.forEach((tupla) -> {
                    tupla.print();
                });
                pNumeros.forEach((tupla) -> {
                    tupla.print();
                });
                
        }
}