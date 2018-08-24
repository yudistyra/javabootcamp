/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mitrais.cdc.java;

/**
 *
 * @author Yudistyra_OP355
 */
public class Counter implements Runnable {
    private final Appl mainApp;
    private final int loopLimit;

    public Counter(Appl mainApp, int loopLimit) {
        this.mainApp = mainApp;
        this.loopLimit = loopLimit;
    }
    
    public void run() {
        for(int i=0; i<loopLimit; i++) {
            String threadName = Thread.currentThread().getName();
            System.out.printf("%s: %s%n", threadName, i);
            mainApp.pause(Math.random());
        }
    }
}
