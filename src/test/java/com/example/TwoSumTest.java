package com.example;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class TwoSumTest {

  @Test
  void shouldReturnZeroOneForExampleOne() {
    Assertions.assertThat(TwoSum.twoSum(new int[]{2, 7, 11, 15}, 9)).isEqualTo(new int[]{0, 1});
  }
}