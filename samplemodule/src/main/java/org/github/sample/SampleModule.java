package org.github.sample;

import java.util.stream.IntStream;

public class SampleModule {

  public static void main(String[] args) {
    IntStream.range(1,20)
        .forEach(System.out::println);
  }
}
