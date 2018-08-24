/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mitrais.cdc.java;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author Yudistyra_OP355
 */
public class WriteFile2 {
    public static void main(String[] args) {
        Charset characterSet = Charset.defaultCharset();
        int numlines = 10;
        Path path = Paths.get("lines.txt");
        try( BufferedWriter writer = Files.newBufferedWriter(path, characterSet)) {
            for(int i=0; i<numlines; i++) {
                writer.write("Number is " + 100 * Math.random());
                writer.newLine();
            }
        } catch ( IOException e) {
            System.err.printf("IOException: %s%n", e);
        }
    }
}
