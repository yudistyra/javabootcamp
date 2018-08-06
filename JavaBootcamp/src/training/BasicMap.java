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

import java.util.*;

public class BasicMap {
    public static void main(String[] args) {
        Map<Integer,String> mapHttpErrors = new HashMap<>();
        mapHttpErrors.put(400, "Bad Request");
        mapHttpErrors.put(304, "Not Modified");
        mapHttpErrors.put(200, "OK");
        mapHttpErrors.put(301, "Moved Permanently");
        mapHttpErrors.put(500, "Internal Server Error");
        
        System.out.println(mapHttpErrors);
        String status301 = mapHttpErrors.get(301);
        System.out.println("301: " + status301);
        mapHttpErrors.replace(304, "No Changes");
        System.out.println("Map after: " + mapHttpErrors);
    }
}
