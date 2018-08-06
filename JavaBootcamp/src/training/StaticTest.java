/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training;

import java.text.SimpleDateFormat;
import java.util.Locale;

/**
 *
 * @author Yudistyra_OP355
 */
public class StaticTest {
    private static int B = 1;
    private static int H = 3;
    private static boolean flag = false;

    public StaticTest() {
        if(B > 0 && H > 0)
            flag = true;
        else
            System.out.println("java.lang.Exception: Breadth and height must be positive");
    }
    
    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }

        //String c = Locale.US;
    }//end of main

}
