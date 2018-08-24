/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mitrais.cdc.java;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Yudistyra_OP355
 */
public class StreamMap3 {
    public static void main(String[] args) {
        List<Staff> staff = Arrays.asList(
                new Staff("mkyong", 30, new BigDecimal(10000)),
                new Staff("jack", 27, new BigDecimal(20000)),
                new Staff("lawrence", 33, new BigDecimal(30000))
        );
        
        List<String> result = new ArrayList<>();
        for(Staff s: staff) {
            result.add(s.getName());
        }
        System.out.println(result);
        
        List<String> collect = staff.stream().map(x->x.getName()).collect(Collectors.toList());
        System.out.println(collect);
    }
}
