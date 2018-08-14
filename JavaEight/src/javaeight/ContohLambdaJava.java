/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaeight;

/**
 *
 * @author Yudistyra_OP355
 */
public class ContohLambdaJava {
    public static void main(String[] args) {
        ContohLambdaJava c = new ContohLambdaJava();

        OperasiPerhitungan penjumlahan = (int a, int b) -> a + b;

        OperasiPerhitungan pengurangan = (a, b) -> a - b;

        OperasiPerhitungan perkalian = (int a, int b) -> {
            return a * b;
        };

        OperasiPerhitungan pembagian = (int a, int b) -> a / b;

        System.out.println("10 + 5 = " + c.operate(10, 5, penjumlahan));
        System.out.println("10 - 5 = " + c.operate(10, 5, pengurangan));
        System.out.println("10 * 5 = " + c.operate(10, 5, perkalian));
        System.out.println("10 / 5 = " + c.operate(10, 5, pembagian));

        //tanpa parenthesis
        GreetingService greetService1 = message
                -> System.out.println("Hello " + message);

        //dengan parenthesis
        GreetingService greetService2 = (message)
                -> System.out.println("Hello " + message);

        greetService1.sayMessage("Kitty");
        greetService2.sayMessage("Pikachu");
    }
    
    private interface OperasiPerhitungan {
        int operation (int a, int b);
    }
    
    private interface GreetingService {
        void sayMessage(String message);
    }
    
    private int operate(int a, int b, OperasiPerhitungan op) {
        return op.operation(a, b);
    }
}
