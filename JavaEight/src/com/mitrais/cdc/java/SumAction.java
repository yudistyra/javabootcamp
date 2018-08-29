/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mitrais.cdc.java;

import java.util.List;
import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;
import java.util.stream.Collectors;

/**
 *
 * @author Yudistyra_OP355
 */
public class SumAction extends RecursiveAction {
    private static final int SEQUENTIAL_THRESHOLD = 5;
    private List<Long> data;

    public SumAction(List<Long> data) {
        this.data = data;
    }
    
    @Override
    protected void compute() {
        if(data.size() <= SEQUENTIAL_THRESHOLD) {
            long sum = computeSumDirectly();
            System.out.format("Sum of %s: %d\n", data.toString(),sum);
        }
        else {
            int mid = data.size() / 2;
            SumAction firstSubtask = new SumAction(data.subList(0, mid));
            SumAction secondSubtask = new SumAction(data.subList(mid, data.size()));
            
            //firstSubtask.fork();
            //secondSubtask.compute();
            //firstSubtask.join();
            
            invokeAll(firstSubtask, secondSubtask);
        }
    }
    
    private long computeSumDirectly() {
        long sum = 0;
        
        for(long l: data) {
            sum += l;
        }
        return sum;
    }
    
    public static void main(String[] args) {
        Random random = new Random();
        
        List<Long> data = random.longs(12, 1, 5).boxed().collect(Collectors.toList());
        
        ForkJoinPool pool = new ForkJoinPool();
        SumAction task = new SumAction(data);
        pool.invoke(task);
    }
}
