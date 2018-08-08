/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicinventory;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Yudistyra_OP355
 */
public class Products {
    private int Id;
    private String name;
    private int price;    
    
    public Products (int Id, String name, int price)
    {
        this.Id = Id;
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
