package two_sum_1;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        if (nums == null) throw new IllegalArgumentException("nums must not be null");
        int[] res = new int[2];
        if (nums.length < 2) return res;

        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if (map.containsKey(target - nums[i])) {
                res[0] = map.get(target - nums[i]);
                res[1] = i;
                return res;
            } else map.put(nums[i], i);
        }
        return res;
    }
}
