package com.example;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class LongestPalindromicSubStringTest {

  @Test
  void shouldReturnLongestPalindromicSubStringExample1() {
    Assertions.assertThat(LongestPalindromicSubString.longestPalindrome("babad")).isEqualTo("bab");
  }

  @Test
  void shouldReturnLongestPalindromicSubStringExample2() {
    Assertions.assertThat(LongestPalindromicSubString.longestPalindrome("cbbd")).isEqualTo("bb");
  }

  @Test
  void shouldReturnLongestPalindromicSubStringExample3() {
    Assertions.assertThat(LongestPalindromicSubString.longestPalindrome("bb")).isEqualTo("bb");
  }

  @Test
  void shouldReturnLongestPalindromicSubStringExample4() {
    Assertions.assertThat(LongestPalindromicSubString.longestPalindrome("abb")).isEqualTo("bb");
  }

  @Test
  void shouldReturnLongestPalindromicSubStringExample5() {
    Assertions.assertThat(LongestPalindromicSubString.longestPalindrome(
            "ibvjkmpyzsifuxcabqqpahjdeuzaybqsrsmbfplxycsafogotliyvhxjtkrbzqxlyfwujzhkdafhebvsdhkkdbhlhmaoxmbkqiwiusngkbdhlvxdyvnjrzvxmukvdfobzlmvnbnilnsyrgoygfdzjlymhprcpxsnxpcafctikxxybcusgjwmfklkffehbvlhvxfiddznwumxosomfbgxoruoqrhezgsgidgcfzbtdftjxeahriirqgxbhicoxavquhbkaomrroghdnfkknyigsluqebaqrtcwgmlnvmxoagisdmsokeznjsnwpxygjjptvyjjkbmkxvlivinmpnpxgmmorkasebngirckqcawgevljplkkgextudqaodwqmfljljhrujoerycoojwwgtklypicgkyaboqjfivbeqdlonxeidgxsyzugkntoevwfuxovazcyayvwbcqswzhytlmtmrtwpikgacnpkbwgfmpavzyjoxughwhvlsxsgttbcyrlkaarngeoaldsdtjncivhcfsaohmdhgbwkuemcembmlwbwquxfaiukoqvzmgoeppieztdacvwngbkcxknbytvztodbfnjhbtwpjlzuajnlzfmmujhcggpdcwdquutdiubgcvnxvgspmfumeqrofewynizvynavjzkbpkuxxvkjujectdyfwygnfsukvzflcuxxzvxzravzznpxttduajhbsyiywpqunnarabcroljwcbdydagachbobkcvudkoddldaucwruobfylfhyvjuynjrosxczgjwudpxaqwnboxgxybnngxxhibesiaxkicinikzzmonftqkcudlzfzutplbycejmkpxcygsafzkgudy"))
        .isEqualTo("fklkf");
  }
}