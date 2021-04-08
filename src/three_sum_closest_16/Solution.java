package three_sum_closest_16;

import java.util.Arrays;

public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        if (nums == null) throw new IllegalArgumentException("nums must not be null");

        int length = nums.length;

        if (length < 3) return 0;

        Arrays.sort(nums);

        int res = nums[0] + nums[1] + nums[length - 1];

        for (int i = 0; i < length - 2; i++) {
            int left = i + 1;
            int right = length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum > target) {
                    right--;
                } else if (sum < target) {
                    left++;
                } else return target;

                if (Math.abs(sum - target) < Math.abs(res - target)) {
                    res = sum;
                }
            }
        }
        return res;
    }
}
