package javaLeetcode.src.com.twopointers._0125;

public class Solution {
  public boolean isPalindrome(String s) {
    int i = 0;
    int j = s.length() - 1;

    while (i < j) {
      Character start = s.charAt(i);
      Character end = s.charAt(j);

      if (!Character.isLetterOrDigit(start)) {
        i++;
        continue;
      }

      if (!Character.isLetterOrDigit(end)) {
        j--;
        continue;
      }

      if (Character.toLowerCase(start) != Character.toLowerCase(end)) {
        return false;
      }

      i++;
      j--;
    }
    return true;
  }

  public static void main(String[] args) {
    String s = "race a car";

    Solution solution = new Solution();
    boolean isPalindrome = solution.isPalindrome(s);

    System.out.println(isPalindrome);
  }
}