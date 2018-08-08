/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guestbook;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
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
        File file = new File(FILENAME);
        
        // a jframe here isn't strictly necessary, but it makes the example a little more real
        JFrame frame = new JFrame("InputDialog Example #1");

        // prompt the user to enter their name
        String name = JOptionPane.showInputDialog(frame, "Name :");
        String address = JOptionPane.showInputDialog(frame, "Address : ");
        String message = JOptionPane.showInputDialog(frame, "Message : ");

        Person p = new Person(name, address, message);
        
        try (ObjectOutputStream oos
                = new ObjectOutputStream(new FileOutputStream(file.getAbsoluteFile()))) {

            oos.writeObject(p);
            System.out.println("Done");

        } catch (NotSerializableException ex) {
            ex.printStackTrace();
        }

        GuestBook gb = new GuestBook();
        Person person = gb.readFileObj(file.getAbsolutePath());

	System.out.println(person);
        //System.out.println("Nama " + name + " Alamat " + address);
        System.exit(0);
    }
    
    public Person readFileObj(String filename) {

        Person person = null;

        try (ObjectInputStream ois
                = new ObjectInputStream(new FileInputStream(filename))) {

            person = (Person) ois.readObject();

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return person;

    }
    
}
