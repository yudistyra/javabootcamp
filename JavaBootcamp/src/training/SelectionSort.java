/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training;

import java.util.Arrays;

/**
 *
 * @author Yudistyra_OP355
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {10, 8, 99, 7, 1, 5, 88, 9};
        
        sort_array(arr);
        
        System.out.println(Arrays.toString(arr));
    }
    
    public static void sort_array(int[] input)
    {
        int inputlength = input.length;
        
        for(int i = 0; i < inputlength; i++)
        {
            int min = i;
            
            for(int j = i+1; j < inputlength; j++)
            {
                if(input[j] < input[min])
                    min = j;
            }
            
            int temp = input[i];
            input[i] = input[min];
            input[min] = temp;
        }
    }
}
