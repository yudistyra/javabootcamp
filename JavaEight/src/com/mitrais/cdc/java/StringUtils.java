/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mitrais.cdc.java;

/**
 *
 * @author Yudistyra_OP355
 */
public class StringUtils {
    public static int eChecker(String s1, String s2) {
        int compareFlag = 0;
        if (s1.contains("r") && !s2.contains("r")) {
            compareFlag = -1;
        } else if (s2.contains("r") && !s1.contains("r")) {
            compareFlag = 1;
        }
        return (compareFlag);
    }

    public static String betterString(String test1, String test2,
            StringComparison tester) {
        
        if(tester.isBetter(test1, test2))
            return test1;
        else
            return test2;
    }
    
    private StringUtils() {
    }
}
