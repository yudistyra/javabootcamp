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
public class VarArgs {
    public static void main(String[] args) {
        printMax(34);
        printMax(new double[] {1,2,3});
    }
    
    public static void printMax(double... numbers) {
        if(numbers.length == 0) {
            System.out.println("No argument passed");
            return;
        }
        
        double result = numbers[0];
        
        for (int i = 0; i < numbers.length; i++) 
            if( numbers[i] > result)
                result = numbers[i];
        System.out.println("The max value is " + result);
    }
}
