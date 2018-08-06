/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training;

import java.io.*;

/**
 *
 * @author Yudistyra_OP355
 */
public class ReadConsole {
    public static void main(String[] args) throws IOException {
        InputStreamReader cin = null;
        
        try {
            cin = new InputStreamReader(System.in);
            System.out.println("Enter characters, 'q' to quit");
            char c;
            
            do {
                c = (char) cin.read();
                System.out.print(c);
            } while ( c != 'q');
        } finally {
            if(cin != null)
                cin.close();
        }
    }
}
