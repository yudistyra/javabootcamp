package com.mitrais.cdc.java;

public interface Combiner<R> {
  R combine(R val1, R val2);
}