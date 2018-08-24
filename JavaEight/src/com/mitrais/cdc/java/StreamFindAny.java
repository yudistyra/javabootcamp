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
public class StreamFindAny {
    public static void main(String[] args) {
        List<Person> list = Arrays.asList(
                new Person("mkyong", 30),
                new Person("jack", 30),
                new Person("lawrence", 40)
        );
        
        Person result1 = list.stream().filter(n->n.getName().equals("jack")).findAny().orElse(null);
        System.out.println(result1);
        
        Person result2 = list.stream().filter(n->n.getName().equals("ahmook")).findAny().orElse(null);
        System.out.println(result2);
    }
}
