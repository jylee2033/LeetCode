package javaLeetcode.slidingwindow._0003;

import java.util.HashMap;
import java.util.Map;

public class Solution {
  public int lengthOfLongestSubstring(String s) {
    Map<Character, Integer> uniques = new HashMap<>();
    int maxLength = 0;
    int startPosition = 0;

    for (int i = 0; i < s.length(); i++) {
      if (uniques.get(s.charAt(i)) != null) {
        startPosition = uniques.get(s.charAt(i)) + 1;
        i = startPosition;
        uniques.clear();
      }
      uniques.put(s.charAt(i), i);
      if (uniques.size() > maxLength) {
        maxLength = uniques.size();
      }
    }
    return maxLength;
  }

  public static void main(String[] args) {
    String s = "abcabcbb";
    Solution solution = new Solution();
    int length = solution.lengthOfLongestSubstring(s);

    System.out.println(length);
  }
}
