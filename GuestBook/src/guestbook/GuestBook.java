/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guestbook;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Yudistyra_OP355
 */
public class GuestBook {
    private static final String FILENAME = "guestbook.txt";
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = null;
	FileWriter fw = null;
        
        // a jframe here isn't strictly necessary, but it makes the example a little more real
        JFrame frame = new JFrame("InputDialog Example #1");

        // prompt the user to enter their name
        String name = JOptionPane.showInputDialog(frame, "Name :");
        String address = JOptionPane.showInputDialog(frame, "Address : ");
        String message = JOptionPane.showInputDialog(frame, "Message : ");

        Person p = new Person(name, address, message);
        
        try {
            File file = new File(FILENAME);

            // if file doesnt exists, then create it
            if (!file.exists()) {
                    file.createNewFile();
            }

            // true = append file
            fw = new FileWriter(file.getAbsoluteFile(), true);
            bw = new BufferedWriter(fw);

            bw.write(p.toString());

            System.out.println("Done");

        } catch (NotSerializableException ex) {
            ex.printStackTrace();
        } finally {

            try {

                if (bw != null) {
                    bw.close();
                }

                if (fw != null) {
                    fw.close();
                }

            } catch (IOException ex) {

                ex.printStackTrace();

            }
        }

        try {

            File f = new File(FILENAME);

            BufferedReader b = new BufferedReader(new FileReader(f));

            String readLine = "";

            System.out.println("Reading file using Buffered Reader");

            while ((readLine = b.readLine()) != null) {
                System.out.println(readLine);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        
        System.exit(0);
    }
    
    public void readFileObj(String filename) {

       

    }
    
}
