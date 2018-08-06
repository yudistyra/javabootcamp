/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training;

/**
 *
 * @author Yudistyra_OP355
 */
public class Basic3 {
    public static void main(String[] args) {
        int [] numbers = { 10, 20, 30, 40, 50 };
        
        for( int x : numbers) {
            System.out.print(x);
            System.out.print(",");
        }
        
        System.out.println("");
        
        String [] names = {"James", "Larry", "Tom", "Lacy"};
        
        for (String nama : names) {
            System.out.print(nama);
            System.out.print(",");
        }
        
        // Nested For Loop Exit with Label
        outer:
        for (int i = 0; i < 10; i++) {
          for (int j = 0; j < 10; j++) {
              System.out.println("i: " + i + " j: " + j);
            if (i == 5 && j ==5) {
              break;
              // breaks out of outer loop instead of only the inner one
            }
          }
        }

    }
}
