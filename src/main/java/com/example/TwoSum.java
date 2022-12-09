package com.example;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

  public static int[] twoSum(int[] nums, int target) {
    int[] result = new int[]{0, 0};
    final Map<Integer, Integer> numbersToIndex = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      final int num = nums[i];
      final int complement = target - num;
      if (numbersToIndex.containsKey(complement)) {
        final Integer b = numbersToIndex.get(complement);
        result = new int[]{Math.min(i, b), Math.max(i, b)};
        break;
      } else {
        numbersToIndex.put(num, i);
      }
    }
    return result;
  }
}
