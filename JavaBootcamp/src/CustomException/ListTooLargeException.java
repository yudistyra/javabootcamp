/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CustomException;

/**
 *
 * @author Yudistyra_OP355
 */
public class ListTooLargeException extends RuntimeException {
    
    public ListTooLargeException(String message) {
        super(message);
    }
}
