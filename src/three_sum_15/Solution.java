package three_sum_15;

import java.util.*;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums == null) throw new IllegalArgumentException("nums must not be null");

        int length = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        if (length < 3) return res;

        Arrays.sort(nums);

        for (int i = 0; i < length - 2; i++) {
            if (i == 0 || nums[i] != nums[i - 1]) {
                int left = i + 1;
                int right = length - 1;
                while (left < right) {
                    int sum = nums[left] + nums[right];
                    if (sum > -nums[i]) {
                        right--;
                    } else if (sum < -nums[i]) left++;
                    else {
                        res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                        while (left < right && nums[left] == nums[left + 1]) {
                            left++;
                        }
                        while (left < right && nums[right - 1] == nums[right]) {
                            right--;
                        }
                        left++;
                        right--;
                    }
                }
            }
        }
        return res;
    }
}
