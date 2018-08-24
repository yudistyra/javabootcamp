/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mitrais.cdc.java;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author Yudistyra_OP355
 */
public class ReadFile2 {
    public static void main(String[] args) {
        String fileName = "lines.txt";
        List<String> list = new ArrayList<String>();
        
        try(Stream<String> stream = Files.lines(Paths.get(fileName))) {
            list = stream.filter(line -> !line.startsWith("line3"))
                    .map(String::toUpperCase)
                    .collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        list.forEach(System.out::println);
    }    
}
