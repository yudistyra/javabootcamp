/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaeight;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Yudistyra_OP355
 */
public class LambdaExpressionPart1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] atp = {"Rafael Nadal", "Novak Djokovic", "Stanislas Wawrinka", "David Ferrer", "Roger Federer", "Andy Murray", "Tomas Berdych", "Juan Martin Del Potro"};
        List<String> players = Arrays.asList(atp);
        
        // old looping
        for( String player: players) {
            System.out.print(player + "; ");
        }
        System.out.println("");
        
        // using lambda expresion and functional operations
        players.forEach((player) -> System.out.println(player + "; "));
        
        // using double colon operator
        System.out.println("==== colon operator ====");
        players.forEach(System.out::println);
    }
    
}
