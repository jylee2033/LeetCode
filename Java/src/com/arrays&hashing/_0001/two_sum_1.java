package com.arrays&hasing._0001;

class TwoSum {
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

    TwoSum solution = new TwoSum();
    int[] answer = solution.twoSum(nums, target);

    for (int i = 0; i < answer.length; i++) {
      System.out.println(answer[i]);
    }
  }
}