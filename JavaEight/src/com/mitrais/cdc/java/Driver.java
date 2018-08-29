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
public class Driver {
    public static void main(String[] args) {
        ExecutorService tasks = Executors.newFixedThreadPool(2);
        tasks.execute(new CoinFlipper());
        tasks.execute(new CoinFlipper());
        tasks.execute(new CoinFlipper());
        tasks.execute(new CoinFlipper());
        tasks.execute(new CoinFlipper());
        tasks.shutdown();
    }
}
