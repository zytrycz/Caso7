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
public class Globals {//Son las variables, como 
    private static final int MAXLETTERS=26;
    private static final int MAXNUM=9;
    private static final int MINNUM=0;
    private static final ArrayList<String> LETRAS=new ArrayList<>();
    private static final String[] NUMEROS={"0","1","2","3","4","5","6","7","8","9"};
    private static int ATTEMPTS=0;
    private static final int MAXPERCENT=100;
    private static final int PERCENTLETERGROW=10;//10 numeros, 10% por numero
    private static final int PERCENTNUMBERGROW=4;//26 letras, 4% por letra
    private static final int POSLETRA=7;
    private static final int POSNUM=11;
    
    public Globals() {
    }

    public static int getMAXLETTERS() {
        return MAXLETTERS;
    }

    public static int getMAXNUM() {
        return MAXNUM;
    }

    public static int getMINNUM() {
        return MINNUM;
    }

    public static int getATTEMPTS() {
        return ATTEMPTS;
    }

    public static ArrayList<String> getLETRAS() {
        return LETRAS;
    }

    public static String[] getNUMEROS() {
        return NUMEROS;
    }

    public static int getMAXPERCENT() {
        return MAXPERCENT;
    }

    public static int getPERCENTLETERGROW() {
        return PERCENTLETERGROW;
    }

    public static int getPERCENTNUMBERGROW() {
        return PERCENTNUMBERGROW;
    }

    public static void setLETRAS() {
        String letras[]={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u",
        "v","w","x","y","z"};
        for(String letra:letras){
            LETRAS.add(letra);
        }
    }

    public static int getPOSLETRA() {
        return POSLETRA;
    }

    public static int getPOSNUM() {
        return POSNUM;
    }
    
    
    
    public static void plusATTEMPT(){//variable global de los chequeos, para comprobar que sea menor del exhaustivo
        ATTEMPTS++;
    }
    
}