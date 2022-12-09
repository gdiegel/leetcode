package com.example;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class ClimbingStairsTest {

  /**
   * Input: n = 2
   * Output: 2
   * Explanation: There are two ways to climb to the top.
   * 1. 1 step + 1 step
   * 2. 2 steps
   */
  @Test
  void shouldReturnTwoForExample1() {
    Assertions.assertThat(ClimbingStairs.climbStairs(2)).isEqualTo(2);
  }
}