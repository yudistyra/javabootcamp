/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training;

import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author Yudistyra_OP355
 */
public class SortArray {
    public static void main(String[] args) {
        String[] unsortStringArray = new String[] {"c", "b", "a", "3", "2", "1"};
        int[] unsortIntArray = new int[] {7,5,4,6,1,2,3}; 
        
        System.out.println("Before sort");
        System.out.println("==== UNSORTING STRING ARRAY");
        for(String temp: unsortStringArray)
            System.out.println(temp);
        
        System.out.println("");
        System.out.println("==== UNSORTING INTEGER ARRAY");
        for(int i: unsortIntArray)
            System.out.println(i);
        
        // Sort
        Arrays.sort(unsortIntArray);
        Arrays.sort(unsortStringArray);
        
        System.out.println("");
        System.out.println("After Sort");
        System.out.println("==== UNSORTING STRING ARRAY");
        for(String temp: unsortStringArray)
            System.out.println(temp);
        
        System.out.println("");
        System.out.println("==== UNSORTING INTEGER ARRAY");
        for(int i: unsortIntArray)
            System.out.println(i);
        
        // sort reverse order
        Arrays.sort(unsortStringArray, Collections.reverseOrder());
        
        System.out.println("After sorted - reserved order");
        System.out.println("--- unsortStringArray ---");
        for(String temp: unsortStringArray){
                System.out.println(temp);
        }
    }
}
