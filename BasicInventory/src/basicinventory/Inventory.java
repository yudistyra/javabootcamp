/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicinventory;

import java.util.Map;

/**
 *
 * @author Yudistyra_OP355
 */
public class Inventory {
    private int Id;
    private Map<Products,Integer> list;

    public Inventory(int id) {
        this.Id = id;
    }
    
    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public Map<Products, Integer> getList() {
        return list;
    }

    public void setList(Map<Products, Integer> list) {
        this.list = list;
    }
    
    
}
