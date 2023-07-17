package java.src.com.binarysearch._0704;

public class Solution {
  public int search(int[] nums, int target) {
    int l = 0;
    int r = nums.length - 1;
    int m = l + (r - l) / 2;

    while (l <= r) {
      if (nums[m] == target) {
        return m;
      } else if (nums[m] > target) {
        r = m - 1;
      } else if (nums[m] < target) {
        l = m + 1;
      }
      m = l + (r - l) / 2;
    }
    return -1;
  }

  public static void main(String[] args) {
    int[] nums = { -1, 0, 3, 5, 9, 12 };
    int target = 9;

    Solution solution = new Solution();
    int answer = solution.search(nums, target);
    System.out.println(answer);
  }
}