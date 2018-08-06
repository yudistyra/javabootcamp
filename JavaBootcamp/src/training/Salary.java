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
public class Salary extends Employee {
    private double salary;

    public Salary(String name, String address, int number, double salary) {
        super(name, address, number);
        setSalary(salary);
    }

    public void mailCheck() {
        System.out.println("Within mailcheck of Salary class ");
        System.out.println("Mailing check to " + getName() + " with salary " + this.salary);
    }
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary >= 0.0)
            this.salary = salary;
    }
    
    public double computePay() {
        System.out.println("Computing salary pay for " + getName());
        return salary/52;
    }
}
