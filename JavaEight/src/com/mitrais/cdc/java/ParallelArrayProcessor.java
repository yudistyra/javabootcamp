package com.mitrais.cdc.java;

import java.util.concurrent.*;

public class ParallelArrayProcessor<T,R> 
       extends RecursiveTask<R> {
  public static final ForkJoinPool FORK_JOIN_POOL = 
    new ForkJoinPool();
  
  private T[] values;
  private int parallelSizeCutoff;
  private SequentialArrayProcessor<T,R> smallSizeProcessor;
  private Combiner<R> valueCombiner;
  private int lowerIndex, upperIndex;
  
  public ParallelArrayProcessor
        (T[] values, 
         int parallelSizeCutoff,
         SequentialArrayProcessor<T,R> smallSizeProcessor,
         Combiner<R> valueCombiner,
         int lowerIndex, int upperIndex) {
    this.values = values;
    this.parallelSizeCutoff = parallelSizeCutoff;
    this.smallSizeProcessor = smallSizeProcessor;
    this.valueCombiner = valueCombiner;
    this.lowerIndex = lowerIndex;
    this.upperIndex = upperIndex;
  }

  @Override
  protected R compute() {
    int range = upperIndex - lowerIndex;
    if (range <= parallelSizeCutoff) {
      return(smallSizeProcessor.computeValue(values, 
                                             lowerIndex, 
                                             upperIndex));
    } else {
      int middleIndex = lowerIndex + range/2;
      ParallelArrayProcessor<T,R> leftProcessor = 
        new ParallelArrayProcessor<>
                (values, parallelSizeCutoff, smallSizeProcessor,
                 valueCombiner, lowerIndex, middleIndex);
      ParallelArrayProcessor<T,R> rightProcessor = 
        new ParallelArrayProcessor<>
                (values, parallelSizeCutoff, smallSizeProcessor,
                 valueCombiner, middleIndex+1, upperIndex);
      leftProcessor.fork();
      R rightValue = rightProcessor.compute();
      R leftValue = leftProcessor.join();
      return(valueCombiner.combine(leftValue, rightValue));
    }
  }

}
