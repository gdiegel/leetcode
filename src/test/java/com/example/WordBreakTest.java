package com.example;

import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class WordBreakTest {

  @Test
  void shouldReturnTrueForExample1() {
    Assertions.assertThat(WordBreak.wordBreak("leetcode", List.of("leet", "code"))).isTrue();
  }

  @Test
  void shouldReturnTrueForExample2() {
    Assertions.assertThat(WordBreak.wordBreak("applepenapple", List.of("apple", "pen"))).isTrue();
  }

  @Test
  void shouldReturnFalseForExample3() {
    Assertions.assertThat(
        WordBreak.wordBreak("catsandog", List.of("cats", "dog", "sand", "and", "cat"))).isFalse();
  }

  @Test
  void shouldReturnFalseForExample4() {
    Assertions.assertThat(
        WordBreak.wordBreak("aaaaaaa", List.of("aaaa", "aaa"))).isTrue();
  }

  @Test
  void shouldReturntrueForExample5() {
    Assertions.assertThat(
        WordBreak.wordBreak("abcd", List.of("a", "abc", "b", "cd"))).isTrue();
  }
}