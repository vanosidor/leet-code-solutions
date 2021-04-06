package four_sum_II_454;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
//        long start = System.currentTimeMillis();
        int n = A.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // A + B = - (C + D);
                int sum = A[i] + B[j];
                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int sum = -(C[i] + D[j]);
                count += map.getOrDefault(sum, 0);
            }
        }
//        StdOut.println((System.currentTimeMillis() - start) + " ms");
        return count;
    }
}
