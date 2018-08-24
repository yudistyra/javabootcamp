/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mitrais.cdc.java;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
/**
 *
 * @author Yudistyra_OP355
 */
public class StreamGroupBy4 {
    public static void main(String[] args) {
         //3 apple, 2 banana, others 1
        List<Item> items = Arrays.asList(
                new Item("apple", 10, new BigDecimal("9.99")),
                new Item("banana", 20, new BigDecimal("19.99")),
                new Item("orang", 10, new BigDecimal("29.99")),
                new Item("watermelon", 10, new BigDecimal("29.99")),
                new Item("papaya", 20, new BigDecimal("9.99")),
                new Item("apple", 10, new BigDecimal("9.99")),
                new Item("banana", 10, new BigDecimal("19.99")),
                new Item("apple", 20, new BigDecimal("9.99"))
                );
        
        Map<BigDecimal,List<Item>> count = items.stream().collect(Collectors.groupingBy(Item::getPrice));
        //ount.forEach(System.out::println);
        count.forEach((k,v)-> {
            System.out.print("Item " + k + " ");
            v.forEach(System.out::println);
        });
        
        Map<BigDecimal,Set<String>> countset = items.stream().collect(Collectors.groupingBy(Item::getPrice, Collectors.mapping(Item::getName, Collectors.toSet())));
        
        System.out.println(countset);
    }
}
