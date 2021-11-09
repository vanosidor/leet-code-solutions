package best_time_buy_sell_stock_121;

import common.In;
import common.StdOut;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        String fileName = args[0];

        In in = new In(new File("src/" + Main.class.getPackage().getName() + "/" + fileName));

        int[] prices = in.readAllInts();

        Solution solution = new Solution();
        StdOut.print(solution.maxProfit(prices));
    }
}
