/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training;

/**
 *
 * @author Yudistyra_OP355
 */
import java.io.*;
import java.util.*;

public class StringToken {
    public static void main(String[] args) {
        String s = "           YES      leading spaces        are valid,    problemsetters are         evillllll";
        String[] arr = s.split("[ !,?._'@]+");
        System.out.println(arr.length);
        for(String st:  arr)
            System.out.println(st);
    }
    
}
