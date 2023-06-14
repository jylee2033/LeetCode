package Java;

class BestTimeToBuyAndSellStock {
  public int maxProfit(int[] prices) {
    int buy = 0;
    int sell = 0;
    int profit = 0;

    for (int i = 0; i < prices.length; i++) {
      for (int j = i + 1; j < prices.length; j++) {
        if (prices[i] < prices[j]) {
          if (prices[j] - prices[i] > profit) {
            buy = prices[i];
            sell = prices[j];
            profit = sell - buy;
          }
        } else {
          break;
        }
      }
    }
    return profit;
  }

  public static void main(String[] args) {
    int[] prices = { 2, 1, 4 };
    BestTimeToBuyAndSellStock solution = new BestTimeToBuyAndSellStock();
    int time = solution.maxProfit(prices);

    System.out.println(time);
  }
}
