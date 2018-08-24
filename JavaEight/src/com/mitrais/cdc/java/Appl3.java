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
public class Appl3 {
    public Appl3() {
        ExecutorService taskList = Executors.newFixedThreadPool(100);
        taskList.execute(new Counter(6));
        taskList.execute(new Counter(5));
        taskList.execute(new Counter(4));
        taskList.shutdown();
    }
    
    private void pause(double seconds) {
        try {
            Thread.sleep(Math.round(1000.0 * seconds));
        } catch ( InterruptedException ie) {}
    }

    private class Counter implements Runnable {
        private final int loopLimit;

        public Counter(int loopLimit) {
            this.loopLimit = loopLimit;
        }

        public void run() {
            for (int i = 0; i < loopLimit; i++) {
                String threadName = Thread.currentThread().getName();
                System.out.printf("%s: %s%n", threadName, i);
                pause(Math.random());
            }
        }
    }
}
