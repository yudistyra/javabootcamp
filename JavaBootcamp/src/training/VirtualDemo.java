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
public class VirtualDemo {
    public static void main(String[] args) {
        Salary s = new Salary("Yanto", "Kalijudan", 3, 3600.00);
        Employee e = new Employee("Santi", "Imogiri", 2);
        
        System.out.println("Call mailcheck using salary reference --");
        s.mailCheck();
        System.out.println("Call mailcheck using employee reference --");
        e.mailCheck();
    }
}
