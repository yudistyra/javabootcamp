/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mitrais.cdc.java;

import static com.sun.org.apache.xerces.internal.util.PropertyState.is;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author Yudistyra_OP355
 */
public class StreamFindAny2 {
    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person("mkyong", 30),
                new Person("jacks", 20),
                new Person("lawrence", 40)
        );

        Person result1 = persons.stream()
                .filter((p) -> "jack".equals(p.getName()) && 20 == p.getAge())
                .findAny()
                .orElse(null);

        System.out.println("result 1 :" + result1);

        //or like this
        Person result2 = persons.stream()
                .filter(p -> {
                    if ("jack".equals(p.getName()) && 20 == p.getAge()) {
                        return true;
                    }
                    return false;
                }).findAny()
                .orElse(null);

        System.out.println("result 2 :" + result2);
    }

}
