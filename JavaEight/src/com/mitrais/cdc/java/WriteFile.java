/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mitrais.cdc.java;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Yudistyra_OP355
 */
public class WriteFile {
    public static void main(String[] args) throws IOException {
        Charset characterSet = Charset.defaultCharset();
        Path path = Paths.get("lines.txt");
        List<String> lines = Arrays.asList("Line One", "Line Two", "Final Line");
        Files.write(path, lines, characterSet);
    }
    
}
