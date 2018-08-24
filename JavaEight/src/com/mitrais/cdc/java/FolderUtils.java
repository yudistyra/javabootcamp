/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mitrais.cdc.java;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 *
 * @author Yudistyra_OP355
 */
public class FolderUtils {
    public static void printAllPaths(Stream<Path> paths) {
      paths.forEach(System.out::println);
    }

    public static void printAllPathsInFolder(String folder) {
      try(Stream<Path> paths = Files.list(Paths.get(folder))) {
        printAllPaths(paths);
      } catch(IOException ioe) {
        System.err.println("IOException: " + ioe);
      }
    }

    public static void printPaths(Stream<Path> paths, Predicate<Path> test) {
      paths.filter(test)
           .forEach(System.out::println);
    }

    public static void printPathsInFolder(String folder, Predicate<Path> test) {
      try(Stream<Path> paths = Files.list(Paths.get(folder))) {
        printPaths(paths, test);
      } catch(IOException ioe) {
        System.err.println("IOException: " + ioe);
      }
    }

    public static void listExamples() {
        System.out.println("All files in project root");
        FolderUtils.printAllPathsInFolder(".");
        System.out.println("Text files in project root");
        FolderUtils.printPathsInFolder(".",
        p -> p.toString().endsWith(".txt"));
    }
   
    public static void printAllPathsInTree(String rootFolder) {
        try (Stream<Path> paths = Files.walk(Paths.get(rootFolder))) {
            printAllPaths(paths);
        } catch (IOException ioe) {
            System.err.println("IOException: " + ioe);
        }
    }

    public static void printPathsInTree(String rootFolder, Predicate<Path> test) {
        try (Stream<Path> paths = Files.walk(Paths.get(rootFolder))) {
            printPaths(paths, test);
        } catch (IOException ioe) {
            System.err.println("IOException: " + ioe);
        }
    }
    
    public static void main(String[] args) {
//        System.out.println("All files in project root");
//        FolderUtils.printAllPathsInFolder(".");
//        System.out.println("Text files in project root");
//        FolderUtils.printPathsInFolder(".",
//        p -> p.toString().endsWith(".txt"));
        System.out.println("All files under project root");
        FolderUtils.printAllPathsInTree(".");
        System.out.println("Java files under project root");
        FolderUtils.printPathsInTree(".", p -> p.toString().endsWith(".java"));
    }
}
