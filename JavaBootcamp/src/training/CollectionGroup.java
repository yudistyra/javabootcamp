/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author Yudistyra_OP355
 */
public class CollectionGroup {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
	list.add("a");
	list.add("b");
	list.add("c");
	list.add("d");
	list.add("b");
	list.add("c");
	list.add("a");
	list.add("a");
	list.add("a");
        
        System.out.println("Example 1 - Count 'a' frequency");
        System.out.println("a: " + Collections.frequency(list, "a"));
        
        System.out.println("\nExample 2 - count all list frequency");
        Set<String> uniqueList = new HashSet<String>(list);
        for(String s: uniqueList)
            System.out.println(s + ": " + Collections.frequency(list, s));
        
        System.out.println("\nExample 3 - count all with map");
        Map<String,Integer> map = new HashMap<String, Integer>();
        for(String s: uniqueList) {
            Integer n = map.get(s);
            map.put(s, (n == null) ? 1 : n +1);
        }
        printMap(map);
        
        System.out.println("\nSorted Map");
        Map<String,Integer> treemap = new TreeMap<String,Integer>(map);
        printMap(treemap);
    }
    
    public static void printMap(Map<String, Integer> map) {
        for(Map.Entry<String,Integer> entry: map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }
    }
}
