/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Yudistyra_OP355
 */
public class SortArrayList {
    public static void main(String[] args) {
        List<String> unsortList = new ArrayList<String>();
		
        unsortList.add("CCC");
        unsortList.add("111");
        unsortList.add("AAA");
        unsortList.add("BBB");
        unsortList.add("ccc");
        unsortList.add("bbb");
        unsortList.add("aaa");
        unsortList.add("333");
        unsortList.add("222");
        
        System.out.println("Before Sort");
        for(String s: unsortList)
            System.out.println(s);
        
        Collections.sort(unsortList);
        
        System.out.println("");
        System.out.println("After Sort");
        for(String s: unsortList)
            System.out.println(s);
        
        Collections.sort(unsortList, Collections.reverseOrder());
        
        System.out.println("");
        System.out.println("Reverse Sort");
        for(String s: unsortList)
            System.out.println(s);
        
    }
}
