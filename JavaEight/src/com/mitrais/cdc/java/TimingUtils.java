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
public class TimingUtils {
    private static final double ONE_BILLION = 1_000_000_000;

    public static void timeOp(Operate operation) {
        long startTime = System.nanoTime();
        String resultMessage = operation.runOp();
        long endTime = System.nanoTime();
        System.out.println(resultMessage);
        double elapsedSeconds = (endTime - startTime) / ONE_BILLION;
        System.out.printf("  Elapsed time: %.3f seconds.%n", elapsedSeconds);
    }
}
