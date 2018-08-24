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
public class Appl2 implements Runnable {
    private final int loopLimit;
    
    public Appl2(int loopLimit) {
        this.loopLimit = loopLimit;
        ExecutorService taskList = Executors.newFixedThreadPool(100);
        taskList.execute(this);
        taskList.execute(this);
        taskList.execute(this);
        taskList.shutdown();
    }
    
    private void pause(double seconds) {
        try {
            Thread.sleep(Math.round(1000.0 * seconds));
        } catch ( InterruptedException ie) {}
    }
    
    public void run() {
        for(int i=0; i<loopLimit; i++) {
            String threadName = Thread.currentThread().getName();
            System.out.printf("%s: %s%n", threadName, i);
            pause(Math.random());
        }
    }
}
