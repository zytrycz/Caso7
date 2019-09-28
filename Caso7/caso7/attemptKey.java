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
   private String letter;
   private int number;
   private String message;

   public String getLetter() {
       return letter;
   }

   public int getNumber() {
       return number;
   }

   public String getMessage() {
       return message;
   }

   public attemptKey(String letter, int number, String message) {
       this.letter = letter;
       this.number = number;
       this.message = message;
   }
   
}
