/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mitrais.cdc.java;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author Yudistyra_OP355
 */
public class PathExamples {
    public static void main(String[] args) {
        Path p1 = Paths.get("lines.txt");
        System.out.println("Simple Path");
        System.out.printf("toString: %s%n%n", p1);
        Path p2 = p1.toAbsolutePath();
        System.out.println("Absolute Path");
        System.out.printf("toString: %s%n", p2);
        System.out.printf("getFileName: %s%n", p2.getFileName());
        System.out.printf("getName(0): %s%n", p2.getName(0));
        System.out.printf("getNameCount: %d%n", p2.getNameCount());
        System.out.printf("subpath(0,2): %s%n", p2.subpath(0, 2));
        System.out.printf("getParent: %s%n", p2.getParent());
        System.out.printf("getRoot: %s%n", p2.getRoot());
    }
}
