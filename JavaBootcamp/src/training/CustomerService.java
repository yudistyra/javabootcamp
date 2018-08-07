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
import CustomException.NameNotFoundException;
import CustomException.ListTooLargeException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomerService {
    public Customer findByName(String name) throws NameNotFoundException {
        if("".equals(name))
            throw new NameNotFoundException("Name is empty!");
        
        return new Customer(name);
    }
    
    public void analyze(List<String> data) {

        if (data.size() > 50) {
            //runtime exception
            throw new ListTooLargeException("List can't exceed 50 items!");
        }

        System.out.println(data);
    }
    
    public static void main(String[] args) {
        CustomerService obj = new CustomerService();
        
//        try {
//            Customer cus = obj.findByName("te");
//        } catch(NameNotFoundException e) {
//            e.printStackTrace();
//        }
         
        List<String> data = new ArrayList<>(Collections.nCopies(100, "mitrais"));
        
        obj.analyze(data);
    }
}
