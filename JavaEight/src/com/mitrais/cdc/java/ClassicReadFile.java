/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mitrais.cdc.java;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Yudistyra_OP355
 */
public class ClassicReadFile {
    public static void main(String[] args) {
        String fileName = "lines.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

                String line;
                while ((line = br.readLine()) != null) {
                        System.out.println(line);
                }

        } catch (IOException e) {
                e.printStackTrace();
        }
    }
}
