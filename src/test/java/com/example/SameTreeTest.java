package com.example;

import com.example.SameTree.TreeNode;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SameTreeTest {

  @Test
  void shouldReturnTrueForExampleOne() {
    Assertions.assertThat(SameTree.isSameTree(new TreeNode(1, new TreeNode(2), new TreeNode(3)),
            new TreeNode(1, new TreeNode(2), new TreeNode(3))))
        .isTrue();
  }

  @Test
  void shouldReturnFalseForExampleTwo() {
    Assertions.assertThat(SameTree.isSameTree(new TreeNode(1, new TreeNode(2), null),
            new TreeNode(1, null, new TreeNode(2))))
        .isFalse();
  }
}