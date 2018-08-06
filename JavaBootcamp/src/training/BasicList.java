/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Yudistyra_OP355
 */
public class BasicList {
    public static void main(String[] args) {
        //List<String> fruits = new ArrayList<>();
        List<String> fruits = new LinkedList<>();
        fruits.add("banana");
        fruits.add("watermelon");
        fruits.add("pineapple");
        fruits.add("apple");
        
        System.out.println("First fruit: " + fruits.get(0));
        System.out.println("All Fruits: " + fruits);
        System.out.println("Number of fruits: " + fruits.size());
        System.out.println("Contains 'pineapple'? " + fruits.contains("pineapple"));
        
        fruits.remove("pineapple");
        System.out.println("All fruits: " + fruits);
        
        for (String element: fruits)
            System.out.println(element);
        
        Iterator<String> iterator = fruits.iterator();
        while(iterator.hasNext())
            System.out.println(iterator.next());
    }
}
