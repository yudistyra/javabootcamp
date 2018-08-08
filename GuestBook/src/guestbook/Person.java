/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guestbook;

import java.io.Serializable;

/**
 *
 * @author Yudistyra_OP355
 */
public class Person implements Serializable {
    private String name;
    private String address;
    private String message;

    public Person(String name, String address, String message) {
        this.name = name;
        this.address = address;
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return name + ", " + address + " : " + message;
    }
    
    
}
