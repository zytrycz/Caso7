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
public class attemptKey {
    String letter;
    int number;
    float likelyhood;

    public attemptKey(String pLetter, int pNumber, float pPorcentaje) {
        letter=pLetter;
        number=pNumber;
        likelyhood=pPorcentaje;
    }

    public String getLetter() {
        return letter;
    }

    public int getNumber() {
        return number;
    }

    public float getLikelyhood() {
        return likelyhood;
    }
    
    
    
}
