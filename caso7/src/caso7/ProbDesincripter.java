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
public class ProbDesincripter {
    private final String[] letras={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u",
        "v","x","y","z"};
    private final int[] numeros={0,1,2,3,4,5,6,7,8,9};
    public static final int MAXLETTERS=26;
    public static final int MAXNUM=9;
    public static final int MINNUM=0;
    public static final int TRIESMAX=3;
    
    public ProbDesincripter(){        
    }
    
    public void getKey(String pText, String pKey , ArrayList pLetras, ArrayList pNumeros){
        ArrayList numAttempts=new ArrayList();
        ArrayList letAttempts=new ArrayList();
        int numberAttempt=MAXLETTERS-TRIESMAX;
        
        for(int num:numeros){//intentos por cada letra, tratamos de minimizar de 260 a 130max
            while(numberAttempt>0){
                
            }
            numberAttempt=MAXLETTERS-TRIESMAX;
        }
        
        int tryCounter=0;
        while(tryCounter<MAXLETTERS){
            
        }
        
    }
    
    public void purify(ArrayList pAttempts){
        //quedarse con los 3 mas probables
    }
}
