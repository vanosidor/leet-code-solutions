package pow_X_N_50;

import common.StdOut;

//pow(1.00000, -2147483648) => 1.0
//pow(2.00000, -2147483648) => 0.0
public class Solution {
    public double myPow(double x, int n) {
        if (n == 0) return 1;
        if (n < 0) {
            x = 1 / x;
            n = -(n + 1);
        }
        return (n % 2 == 0) ? myPow(x * x, n / 2) : x * myPow(x * x, n / 2);
    }
}
