/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mitrais.cdc.java;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Yudistyra_OP355
 */
public class SortingExample {
    public static void main(String[] args) {
        String[] atp = {"Rafael Nadal", "Novak Djokovic", "Stanislas Wawrinka", "David Ferrer", "Roger Federer", "Andy Murray", "Tomas Berdych", "Juan Martin Del Potro"};
        List<String> players =  Arrays.asList(atp);
        
        System.out.println("Before sort");
        for(String l: atp)
            System.out.println(l);
        System.out.println("");
        
        System.out.println("After Sort");
        System.out.println("Length");
        players.sort((s1,s2)->s1.length()-s2.length());
        players.forEach(System.out::println);
        System.out.println("");
        
        System.out.println("Reverse Length");
        players.sort((s1,s2)->s2.length()-s1.length());
        players.forEach(System.out::println);
        System.out.println("");
        
        System.out.println("First Character Only");
        players.sort((s1,s2)->s1.charAt(0)-s2.charAt(0));
        players.forEach(System.out::println);
        System.out.println("");
        
        System.out.println("Contains 'R/r'");
        players.sort((s1,s2)->StringUtils.eChecker(s1.toLowerCase(), s2.toLowerCase()));
        players.forEach(System.out::println);
        System.out.println("");
        
        StringComparison sc = (s1,s2) -> s1.length()>s2.length();
        
        System.out.println("Length");
        String longer = StringUtils.betterString("Hello", "Hellooo", sc);
        System.out.println(longer);
        System.out.println("");
    }
}
