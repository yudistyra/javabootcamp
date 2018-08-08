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
public class DateTimeExample {
    public static void main(String[] args) {
        DateTimeExample obj = new DateTimeExample();
        
        System.out.println("1993 is a leap year ? " + obj.isLeapYear(1993));
        System.out.println("1996 is a leap year ? " + obj.isLeapYear(1996));
        System.out.println("2012 is a leap year ? " + obj.isLeapYear(2012));
    }
    
    public boolean isLeapYear(int year)
    {
        if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
            return true;
        
        return false;
    }
}
