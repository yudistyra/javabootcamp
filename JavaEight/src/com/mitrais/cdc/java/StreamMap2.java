/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mitrais.cdc.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 *
 * @author Yudistyra_OP355
 */
public class StreamMap2 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a","b","c","d");
        
         //Before Java8
        List<String> alphaUpper = new ArrayList<>();
        for (String s : list) {
            alphaUpper.add(s.toUpperCase());
        }

        System.out.println(list); //[a, b, c, d]
        System.out.println(alphaUpper); //[A, B, C, D]
        
        List<String> collect = list.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(collect);

        List<Integer> num = Arrays.asList(1,2,3,4);
        List<Integer> collect2 = num.stream().map(n->n*2).collect(Collectors.toList());
        System.out.println(collect2);
    }
}
