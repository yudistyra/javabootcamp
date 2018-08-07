/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 *
 * @author Yudistyra_OP355
 */
public class BubleSort {
    public static void main(String[] args) {
         int[] array = {99, 88, 55, 77, 1, 66};
         
         System.out.println("==== UNSORTED DATA ====");
         print_r(array);
         
         System.out.println("==== ASCENDING ORDER ====");
         buble_sort(array);
         print_r(array);
         
         System.out.println("==== DESCENDING ORDER ====");
         buble_sort(array,false);
         print_r(array);
    }
    
    private static void buble_sort(int[] input)
    {
        buble_sort(input, true);
    }
    
    private static void buble_sort(int[] input, boolean ascending)
    {
        int inputlength = input.length;
        int temp;
        boolean is_sorted;
        
        for(int i=0; i<inputlength; i++)
        {
            is_sorted = true;
            
            for(int j=1; j<(inputlength-i); j++)
            {
                if(ascending)
                {
                    if(input[j-1] > input[j])
                    {
                        temp = input[j-1];
                        input[j-1] = input[j];
                        input[j] = temp;
                        is_sorted = false;
                    }
                }
                else {
                    if(input[j-1] < input[j])
                    {
                        temp = input[j-1];
                        input[j-1] = input[j];
                        input[j] = temp;
                        is_sorted = false;
                    }
                }
            }
        }
    }
    
    private static void print_r(int[] data)
    {
        String result = Arrays.stream(data)
                        .mapToObj(String::valueOf)
                        .collect(Collectors.joining(","));
        
        System.out.println(result);
    }
}
