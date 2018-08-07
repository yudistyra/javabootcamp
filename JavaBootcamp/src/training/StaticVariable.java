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
public class StaticVariable {
    public static void main(String[] args) {
        Employee e1 = new Employee("Employee1", "Surabaya", 5);
        Employee e2 = new Employee("Employee2", "Jakarta", 10);

        System.out.println("Employee Count using e1: " + e1.getCount());
        System.out.println("Employee Count using e2: " + e2.getCount());
        System.out.println("Employee Count using static reference: " + Employee.getCount());

    }
    
}
