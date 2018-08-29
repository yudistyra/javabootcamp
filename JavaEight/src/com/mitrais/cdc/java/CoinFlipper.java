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
public class CoinFlipper implements Runnable {
  @Override
  public void run() {
    int numHeads = 0;
    for(int i=0; i<1000; i++) {
      double coin = Math.random();
      if (coin < 0.5) {
        numHeads = numHeads + 1;
      } else {
        numHeads = 0;
      }
      if (numHeads >= 3) {
        System.out.printf("%s got %d heads in a row.%n",
                          Thread.currentThread().getName(), 
                          numHeads);
      }
    }
  }
}
