/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caso7;

/**
 *
 * @author jonac
 */
public class Globals {//Son las variables, como 
    private static final int MAXLETTERS=26;
    private static final int MAXNUM=9;
    private static final int MINNUM=0;
    private static final String[] LETRAS={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u",
        "v","x","y","z"};
    private static final String[] NUMEROS={"0","1","2","3","4","5","6","7","8","9"};
    private static int ATTEMPTS=0;

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

    public static String[] getLETRAS() {
        return LETRAS;
    }

    public static String[] getNUMEROS() {
        return NUMEROS;
    }
    
    
    
    public void plusATTEMPT(){//variable global de los chequeos, para comprobar que sea menor del exhaustivo
        ATTEMPTS++;
    }
    
}
