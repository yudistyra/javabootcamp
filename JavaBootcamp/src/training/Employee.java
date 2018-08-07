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

public class Employee {
    private String name;
    private String address;
    private int number;
    static int count = 0;
    
    public Employee() {
        count++;
    }
    
    public Employee(String name, String address, int number) {
        System.out.println("Constructing an Employee");
        this.name = name;
        this.address = address;
        this.number = number;
        count++;
    }
    
    public void mailCheck() {
        System.out.println("Mailing check to " + this.name + " " + this.address);
    }
    
    public String toString() {
        return name + " " + address + " " + number;
    }
    
    public String getName() {
        return name;
    }
    
    public String getAddress() {
        return address;
    }
    
    public void setAddress(String newAddress) {
        this.address = newAddress;
    }
    
    public int getNumber() {
        return number;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Employee.count = count;
    }
    
    
}
