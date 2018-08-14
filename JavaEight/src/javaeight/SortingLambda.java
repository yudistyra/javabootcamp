/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaeight;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Yudistyra_OP355
 */
public class SortingLambda {
    public static void main(String[] args) {
        List<Developer> listDevs = getDevelopers();
        
        System.out.println("Before sort");
        for(Developer dev: listDevs)
            System.out.println(dev);
        
        System.out.println("After Sort");
        System.out.println("");
        
        // sort by age
        System.out.println("By Age");
        listDevs.sort((Developer o1, Developer o2) -> o1.getAge()-o2.getAge());
        listDevs.forEach(dev -> System.out.println(dev));
        System.out.println("");
        
        // sort by name
        System.out.println("By Name");
        listDevs.sort((d1,d2)-> d1.getName().compareTo(d2.getName()));
        listDevs.forEach(dev -> System.out.println(dev));
        System.out.println("");
        
        // sort by salary
        System.out.println("By Salary");
        listDevs.sort((d1,d2)-> d1.getSalary().compareTo(d2.getSalary()));
        listDevs.forEach(dev -> System.out.println(dev));
        System.out.println("");
    }
    
    public static List<Developer> getDevelopers() {
        List<Developer> result = new ArrayList<Developer>();

        result.add(new Developer("mkyong", new BigDecimal("70000"), 33));
        result.add(new Developer("alvin", new BigDecimal("80000"), 20));
        result.add(new Developer("jason", new BigDecimal("100000"), 10));
        result.add(new Developer("iris", new BigDecimal("170000"), 55));

        return result;
    }
}
