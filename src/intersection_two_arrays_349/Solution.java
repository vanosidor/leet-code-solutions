package intersection_two_arrays_349;

import java.util.HashSet;
import java.util.Set;

// try make with binary search
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> intersect = new HashSet<>();

        for (int i : nums1) {
            set.add(i);
        }

        for (int j : nums2) {
            if (set.contains(j)) intersect.add(j);
        }

        int[] res = new int[intersect.size()];

        int i = 0;
        for (Integer value : intersect) {
            res[i] = value;
            i++;
        }
        return res;
    }
}