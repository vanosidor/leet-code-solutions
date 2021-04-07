package four_sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        if (nums == null || nums.length < 4) return new ArrayList<>();
        Set<List<Integer>> res = new HashSet<>();

        Arrays.sort(nums);
        Map<Integer, List<int[]>> map = new HashMap<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int sum = nums[i] + nums[j];

                if (map.containsKey(target - sum)) {
                    List<int[]> indexesList = map.get(target - sum);
                    for (int[] indexes : indexesList) {
                        if (indexes[1] < i) {
                            List<Integer> candidate = Arrays.asList(nums[indexes[0]], nums[indexes[1]], nums[i], nums[j]);
                            res.add(candidate);
                        }
                    }
                }
                List<int[]> value = map.getOrDefault(sum, new ArrayList<>());
                value.add(new int[]{i, j});
                map.put(sum, value);
            }
        }
        return new ArrayList<>(res);
    }
}