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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ShuffleArraylist {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "B", "C", "D", "1", "2", "3");
        
        // before shuffle
        System.out.println(list);
        
        // shuffle
        Collections.shuffle(list);
        System.out.println(list);
        
        Collections.shuffle(list);
        System.out.println(list);
    }
}
