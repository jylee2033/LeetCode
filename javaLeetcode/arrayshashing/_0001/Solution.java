package javaLeetcode.arrayshashing._0001;

public class Solution {
  public int[] twoSum(int[] nums, int target) {
    int[] answer = new int[2];
    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[i] + nums[j] == target) {
          answer[0] = i;
          answer[1] = j;
        }
      }
    }
    return answer;
  }

  public static void main(String[] args) {
    int[] nums = { 2, 7, 11, 15 };
    int target = 9;

    Solution solution = new Solution();
    int[] answer = solution.twoSum(nums, target);

    for (int i = 0; i < answer.length; i++) {
      System.out.println(answer[i]);
    }
  }
}