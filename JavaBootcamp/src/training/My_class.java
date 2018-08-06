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

class Outer_demo {
    int num;
    
    static class Inner_Demo {
        public void print() {
            System.out.println("This is an inner class");
        }
    }
    
    static void display_Inner() {
        Inner_Demo inner = new Inner_Demo();
        inner.print();
    }
}

public class My_class {
    public static void main(String[] args) {
       Outer_demo.Inner_Demo test = new Outer_demo.Inner_Demo();
       test.print();
    }
}
