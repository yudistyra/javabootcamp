/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mitrais.cdc.java;

import java.util.concurrent.ForkJoinPool;

/**
 *
 * @author Yudistyra_OP355
 */
public class MathUtils {
    private static final ForkJoinPool FORK_JOIN_POOL = new ForkJoinPool();
    
    private MathUtils() {}
    
    public static Double arraySum(Double[] nums, int lowerIndex, int upperIndex) {
        double sum = 0;
        for (int i = lowerIndex; i <= upperIndex; i++) {
            sum += nums[i];
        }
        return (sum);
    }

    public static double arraySum(Double[] nums) {
        return (arraySum(nums, 0, nums.length - 1));
    }
   
    public static Double[] randomNums1(int length) {
        Double[] nums = new Double[length];
        for (int i = 0; i < length; i++) {
            nums[i] = Math.random();
        }
        return (nums);
    }
    
    //public static Double arraySumParallel(double[] nums) {
    //    return (FORK_JOIN_POOL.invoke(new ParallelArraySummer(nums, 0, nums.length - 1)));
    //}

    public static Double arraySumParallel(Double[] nums) {
        int parallelSizeCutoff = 1000;
        SequentialArrayProcessor<Double, Double> smallSizeProcessor
                = new ArrayAdder();
        Combiner<Double> valueCombiner = new Adder();
        ForkJoinPool pool = ParallelArrayProcessor.FORK_JOIN_POOL;
        ParallelArrayProcessor<Double, Double> processor
                = new ParallelArrayProcessor<>(nums, parallelSizeCutoff,
                        smallSizeProcessor, valueCombiner,
                        0, nums.length - 1);
        return (pool.invoke(processor));
    }
}
