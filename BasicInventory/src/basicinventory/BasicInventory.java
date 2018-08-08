/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicinventory;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Yudistyra_OP355
 */
public class BasicInventory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Products p1 = new Products(1, "Sabun", 1000);
        Products p2 = new Products(1, "Pasta Gigi", 1000);
        
        Map<Products,Integer> addproduct = new HashMap<>();
        addproduct.put(p1, 20);
        addproduct.put(p2, 10);
        
        Inventory i = new Inventory(1);
        i.setList(addproduct);
        
        for(Map.Entry<Products,Integer> l: i.getList().entrySet()) {
            System.out.println("Key: " + l.getKey().getName() + " Value: " + l.getValue());
        }
    }
    
}
