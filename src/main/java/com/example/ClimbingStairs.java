package com.example;

import java.util.LinkedHashMap;
import java.util.Map;

public class ClimbingStairs {

  private static final Map<Integer, Integer> MEMO = new LinkedHashMap<>();

  /**
   * Go from index 0 (still on ground) to index n
   * <p>
   *                _4__
   *             _3_|  |
   *          _2_|     |
   *      _1_|         |
   * __0__|            |
   *
   * <p>
   * @param n number of steps
   * @return possible ways to get to the last step (index n)
   */
  public static int climbStairs(int n) {
    if (MEMO.containsKey(n)) {
      return MEMO.get(n);
    }

    if (n == 1) {
      return 1;
    }

    if (n == 2) {
      return 2;
    }

    MEMO.put(n, climbStairs(n - 1) + climbStairs(n - 2));

    return MEMO.get(n);
  }
}

