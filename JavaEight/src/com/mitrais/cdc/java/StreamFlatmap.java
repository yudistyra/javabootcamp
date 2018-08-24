/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mitrais.cdc.java;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 *
 * @author Yudistyra_OP355
 */
public class StreamFlatmap {
    public static void main(String[] args) {
        String[][] data = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}};

        //Stream<String[]>
        Stream<String[]> temp = Arrays.stream(data);

        //filter a stream of string[], and return a string[]?
        //Stream<String> streamString = temp.filter(x -> "a".equals(x.toString()));
        Stream<String> streamString = temp.flatMap(x-> Arrays.stream(x));

        Stream<String> stream = streamString.filter(x -> "a".equals(x.toString()));
        
        stream.forEach(System.out::println);
    }
}
