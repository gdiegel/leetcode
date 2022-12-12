package com.example;

import java.util.HashSet;
import java.util.Set;

public class LongestPalindromicSubString {

  public static String longestPalindrome(String s) {
    if (isPalindrome(s)) {
      return s;
    }

    final Set<String> seen = new HashSet<>();

    final int stringLength = s.length();

    for (int subStringLength = stringLength; subStringLength > 0; subStringLength--) {
      for (int i = 0; i < stringLength; i++) {

        if (i + subStringLength > stringLength) {
          continue;
        }

        if (s.charAt(i) != s.charAt(i + subStringLength - 1)) {
          continue;
        }

        final String subString = s.substring(i, i + subStringLength);
        if (seen.contains(subString)) {
          continue;
        }

        seen.add(subString);

        if (isPalindrome(subString)) {
          return subString;
        }
      }
    }

    return "";
  }

  static boolean isPalindrome(final String a) {
    final char[] chars = a.toCharArray();

    for (int i = 0; i < chars.length; i++) {
      if (chars[i] != chars[chars.length - i - 1]) {
        return false;
      }
    }

    return true;
  }
}
