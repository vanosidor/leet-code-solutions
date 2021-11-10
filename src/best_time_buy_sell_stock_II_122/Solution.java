package best_time_buy_sell_stock_II_122;

/*Input: prices = [7,1,5,3,6,4]
        Output: 7
    Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
    Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
    Total profit is 4 + 3 = 7.
*/

//Input: prices = [1,2,3,4,5]
//        Output: 4

//Input: prices = [7,6,4,3,1]
//        Output: 0

// Нужно нарисовать картинку - результат это сумма всех valley -> peak
public class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int currentProfit;

        for (int i = 1; i < prices.length; i++) {
            currentProfit = Math.max(prices[i] - prices[i - 1], 0);
            maxProfit += currentProfit;
        }

        return maxProfit;
    }
}
