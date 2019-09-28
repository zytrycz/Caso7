/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caso7;

/**
 *
 * @author brymo
 */
public class tuple {
    private String value;
    private int probability;

    public tuple(String value, int probability) {
        this.value = value;
        this.probability = probability;
    }

    public String getValue() {
        return value;
    }

    public int getProbability() {
        return probability;
    }

    public void setProbability(int probability) {
        this.probability = probability;
    }
    
    public void print(){
        System.out.println("valor "+value+ " es "+ Integer.toString(probability)+"% probable");
    }
    

}