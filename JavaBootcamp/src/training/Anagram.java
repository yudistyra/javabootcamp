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
import java.util.Scanner;

public class Anagram {
    
    public static void main(String[] args) {
        //Scanner scan = new Scanner(System.in);
        String a = "anagram";
        String b = "margana";
        System.out.println(a + " " + b);
        //boolean ret = isAnagram(a, b);
        //System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
        
        if(a.length() != b.length())
            System.out.println("Not Anagrams");
        
        a = a.toLowerCase();
        b = b.toLowerCase();
        char[] Aarr = a.toCharArray();
        char[] Barr = b.toCharArray();
        int[] res = new int[Character.MAX_VALUE];
        
        for(int i=0;i<Aarr.length;i++)
        {
            res[(int) Aarr[i]]++;
            res[(int) Barr[i]]--;
        }
                
        boolean anagram = true;
        for(int j: res)
        {
            if(j>0)
                anagram = false;
        }
        
        System.out.println(anagram ? "Anagram" : "Not Anagram");
    }
}
