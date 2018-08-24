/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mitrais.cdc.java;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author Yudistyra_OP355
 */
public class Appl {

    public Appl() {
        ExecutorService taskList = Executors.newFixedThreadPool(100);
        taskList.execute(new Counter(this, 6));
        taskList.execute(new Counter(this, 5));
        taskList.execute(new Counter(this, 6));
        taskList.shutdown();
    }
    
    public void pause(double seconds) {
        try {
            Thread.sleep(Math.round(1000.0 * seconds));
        } catch ( InterruptedException ie) {}
    }
}
