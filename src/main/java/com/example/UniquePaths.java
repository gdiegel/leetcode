package com.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class UniquePaths {

  public static final Map<Tuple, Integer> MEMO = new HashMap<>();

  public static int uniquePaths(int m, int n) {
    final Tuple key = new Tuple(m, n);
    if (MEMO.containsKey(key)) {
      return MEMO.get(key);
    }

    if (m == 0 || n == 0) {
      return 0;
    }

    if (m == 1 && n == 1) {
      return 1;
    }

    MEMO.put(key, uniquePaths(m - 1, n) + uniquePaths(m, n - 1));

    return MEMO.get(key);
  }

  static class Tuple {

    private final int m;
    private final int n;

    Tuple(int m, int n) {
      this.m = m;
      this.n = n;
    }

    public int getM() {
      return m;
    }

    public int getN() {
      return n;
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) {
        return true;
      }
      if (o == null || getClass() != o.getClass()) {
        return false;
      }
      Tuple tuple = (Tuple) o;
      return m == tuple.m && n == tuple.n;
    }

    @Override
    public int hashCode() {
      return Objects.hash(m, n);
    }
  }
}

