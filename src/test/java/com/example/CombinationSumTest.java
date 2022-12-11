package com.example;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;

class CombinationSumTest {

  @Test
  void shouldReturnTwoListsForExampleOne() {
    assertThat(CombinationSum.combinationSum(new int[]{2, 3, 6, 7}, 6))
        .containsExactlyInAnyOrder(List.of(2, 2, 3), List.of(7));
  }

  @Test
  void shouldReturnThreeListsForExampleTwo() {
    assertThat(CombinationSum.combinationSum(new int[]{2, 3, 5}, 8))
        .containsExactlyInAnyOrder(List.of(2, 2, 2, 2), List.of(2, 3, 3), List.of(3, 5));
  }
}