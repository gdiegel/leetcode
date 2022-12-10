package com.example;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class UniquePathsTest {

  @Test
  void shouldReturn28ForExampleOne() {
    Assertions.assertThat(UniquePaths.uniquePaths(3, 7)).isEqualTo(28);
  }

  @Test
  void shouldReturnThreeForExampleTwo() {
    Assertions.assertThat(UniquePaths.uniquePaths(3, 2)).isEqualTo(3);
  }

  @Test
  void shouldReturn193536720ForExampleThree() {
    Assertions.assertThat(UniquePaths.uniquePaths(23, 12)).isEqualTo(193536720);
  }
}