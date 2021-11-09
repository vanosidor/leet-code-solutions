package best_time_buy_sell_stock_121;


// Input: prices = [7,1,5,3,6,4]
// Output: 5

// Input: prices = [7,6,4,3,1]
// Output: 0

// Input: prices = [2, 4 , 1]
// Output: 2

// Нужно трекать мин цену и макс профит.

class Solution {

    // Easy to understand solution
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }
        return maxProfit;
    }

    // Kadanes Algorithm (hard to understand)
  /*  public int maxProfit(int[] prices) {
        int maxCur = 0, maxSoFar = 0;
        for(int i = 1; i < prices.length; i++) {
            maxCur = Math.max(0, maxCur + (prices[i] - prices[i - 1]));
            maxSoFar = Math.max(maxCur, maxSoFar);
        }
        return maxSoFar;
    }*/


    // Brute force solution
   /* public int maxProfit(int[] prices) {

        int n = prices.length;

        int res = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j ++ ) {
                if (prices[i] < prices[j]) {
                    res = Math.max(res, prices[j] - prices[i]);
                }
            }
        }

        return res;
    }*/
}
