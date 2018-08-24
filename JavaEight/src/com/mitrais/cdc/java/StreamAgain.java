/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mitrais.cdc.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Yudistyra_OP355
 */
public class StreamAgain {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("spring", "mkyoong", "node");
        
        List<String> result = list.stream().filter(s->!s.equals("mkyoong")).collect(Collectors.toList());
        
        result.forEach(System.out::println);
    }
}
