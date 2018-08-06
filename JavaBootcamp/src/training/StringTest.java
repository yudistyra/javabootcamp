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
public class StringTest {
    public static void main(String[] args) {
        String res;
        
        res = padChars1(5, "x");
        System.out.println(res);
    }
    
    public static String padChars1(int n, String orig) {
        String result = "";
        for( int i=0; i<n; i++)
            result = result + orig;
        
        return result;
    }
    
    public static String padChars2(int n, String orig) {
        StringBuilder result = new StringBuilder("");
        for (int i=0; i<n; i++) {
            result.append(orig);
        }
        
        return result.toString();
    }
}
