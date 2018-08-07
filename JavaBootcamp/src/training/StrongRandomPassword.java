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
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;

public class StrongRandomPassword {
    private SecureRandom srand;
    private ArrayList validch;

    public StrongRandomPassword() {
        srand = new SecureRandom();
        validch = new ArrayList<>();
        
        // Filling the array list with characters based on ascii table
        for (int i = 65; i < 91; i++) {
            validch.add((char) i);// A-Z
            validch.add((char) (i + 32));// a-z
        }
        for (int i = 48; i < 58; i++) {
            validch.add((char) i);
        }
        for (int i = 35; i < 39; i++) {
            validch.add((char) i);
        }
        validch.add((char) 64);
        Collections.shuffle(validch);
    }
    
    public char randChar() {
        return (char) this.validch.get(srand.nextInt(this.validch.size()));
    }
    public static void main(String[] args) {
        StrongRandomPassword pg = new StrongRandomPassword();
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<10; i++)         // Generate ten password
        {
            for(int j =0; j<10; j++)    // 10 characters
            {
                sb.append(pg.randChar());
            }
            System.out.println(sb.toString());
            sb.setLength(0);
        }
        
    }
    
}
