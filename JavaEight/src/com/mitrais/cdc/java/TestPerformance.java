/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mitrais.cdc.java;

import java.util.List;
import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.Collectors;

/**
 *
 * @author Yudistyra_OP355
 */
public class TestPerformance {
    public static void main(String[] args) {
        Random random = new Random();
        
        List<Long> data = random.longs(12, 1, 5).boxed().collect(Collectors.toList());
        
        /*ForkJoinPool pool = new ForkJoinPool();
        SumAction task = new SumAction(data);
        pool.invoke(task);*/
        
        //testForkJoin(data);
        //testSequentially(data);
        //testSequentiallyStream(data);
        testParallelStream(data);
    }
    
    private static void testForkJoin(List<Long> data) {
        final long start = System.currentTimeMillis();

        ForkJoinPool pool = new ForkJoinPool();
        SumTask task = new SumTask(data);
        pool.invoke(task);

        System.out.println("Executed with fork/join in (ms): " + (System.currentTimeMillis() - start));
    }

    private static void testSequentially(List<Long> data) {
        final long start = System.currentTimeMillis();

        long sum = 0;
        for (Long l : data) {
            sum += l;
        }

        System.out.println("Sum: " + sum);
        System.out.println("Executed sequentially in (ms): " + (System.currentTimeMillis() - start));
    }
    
    private static void testSequentiallyStream(List<Long> data) {
        final long start = System.currentTimeMillis();

        data.stream().reduce(0L, Long::sum);
        
        System.out.println("Executed with a sequential stream in (ms): " + (System.currentTimeMillis() - start));
    }
    
    private static void testParallelStream(List<Long> data) {
        final long start = System.currentTimeMillis();

        data.parallelStream().reduce(0L, Long::sum);

        System.out.println("Executed with a sequential stream in (ms): " + (System.currentTimeMillis() - start));
    }
}
