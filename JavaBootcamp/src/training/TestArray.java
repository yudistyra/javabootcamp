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
class TestArray2 {
    double[] myList2 = {1.9,2.9,3.4,3.5};
    
    public void showMyList2() {
        for(double element : myList2)
            System.out.println(element);
    }
}
public class TestArray {
    public static void main(String[] args) {
        double[] myList = {1.9,2.9,3.4,3.5};
        
        for (int i=0; i < myList.length; i++) {
            System.out.println(myList[i] + " ");
        }
        
        // Summing all elements
        double total = 0;
        for (int i=0; i < myList.length; i++) {
            total += myList[i];
        }
        System.out.println("Total is " + total);
        
        // Finding the largest element
        double max = myList[0];
        for (int i = 1; i < myList.length; i++) {
            if(myList[i] > max)
                max = myList[i];
        }
        System.out.println("Max is " + max);
        System.out.println("===================");
        System.out.println("");
        
        TestArray2 latarray = new TestArray2();
        
        latarray.showMyList2();
    }
}
