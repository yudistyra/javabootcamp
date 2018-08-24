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
@FunctionalInterface
public interface Op {
    static final double ONE_BILLION = 1000000000;
    void runOp();
    
    static void timeOp(Op operation) {
        long startTime = System.nanoTime();
        operation.runOp();
        long endTime = System.nanoTime();
        double elapsedSeconds = (endTime - startTime) / ONE_BILLION;
        System.out.printf("  Elapsed time: %.3f seconds.%n", elapsedSeconds);
    }
    
    default Op combinedOp (Op secondOp) {
        return (() -> { runOp(); secondOp.runOp(); });
    }
}
