package javaLeetcode.arrayshashing._0242;

public class Solution {
  public boolean isAnagram(String s, String t) {
    if (s.length() != t.length()) {
      return false;
    }

    int[] store = new int[26];

    for (int i = 0; i < s.length(); i++) {
      store[s.charAt(i) - 'a']++;
      store[t.charAt(i) - 'a']--;
    }

    for (int n : store) {
      if (n != 0)
        return false;
    }

    return true;
  }

  public static void main(String[] args) {
    String s = "anagram";
    String t = "nagaram";

    Solution solution = new Solution();
    boolean isAnagram = solution.isAnagram(s, t);

    System.out.println(isAnagram);
  }
}