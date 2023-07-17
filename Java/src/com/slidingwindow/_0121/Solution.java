package java.src.com.slidingwindow._0121;

public class Solution {
  public int maxProfit(int[] prices) {
    // solution 1
    // int buy = 0;
    // int sell = 0;
    // int profit = 0;

    // for (int i = 0; i < prices.length; i++) {
    // for (int j = i + 1; j < prices.length; j++) {
    // if (prices[i] < prices[j]) {
    // if (prices[j] - prices[i] > profit) {
    // buy = prices[i];
    // sell = prices[j];
    // profit = sell - buy;
    // }
    // } else {
    // break;
    // }
    // }
    // }
    // return profit;

    // solution 2
    int min = Integer.MAX_VALUE;
    int max = 0;

    for (int i = 0; i < prices.length; i++) {
      if (prices[i] < min) {
        min = prices[i];
      } else if (prices[i] - min > max) {
        max = prices[i] - min;
      }
    }

    return max;
  }

  public static void main(String[] args) {
    int[] prices = { 2, 1, 4 };
    Solution solution = new Solution();
    int time = solution.maxProfit(prices);

    System.out.println(time);
  }
}
