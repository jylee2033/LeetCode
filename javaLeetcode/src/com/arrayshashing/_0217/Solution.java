package javaLeetcode.src.com.arrayshashing._0217;

import java.util.HashSet;
import java.util.Set;

public class Solution {
  public boolean containsDuplicate(int[] nums) {
    // solution 1 (time limit exceeded)
    // for (int i = 0; i < nums.length; i++) {
    // for (int j = i + 1; j < nums.length; j++) {
    // if (nums[i] == nums[j]) {
    // return true;
    // }
    // }
    // }
    // return false;

    // solution 2
    Set<Integer> uniques = new HashSet<>();

    for (int i = 0; i < nums.length; i++) {
      if (uniques.contains(nums[i])) {
        return true;
      }
      uniques.add(nums[i]);
    }

    return false;
  }

  public static void main(String[] args) {
    int[] nums = { 1, 2, 3, 1 };

    Solution solution = new Solution();
    boolean containsDuplicates = solution.containsDuplicate(nums);

    System.out.println(containsDuplicates);
  }
}
