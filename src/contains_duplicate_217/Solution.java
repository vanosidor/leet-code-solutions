package contains_duplicate_217;
import  java.util.*;

//Input: nums = [1,2,3,1]
//        Output: true

//Input: nums = [1,2,3,4]
//        Output: false

//Input: nums = [1,1,1,3,3,4,3,2,4,2]
//        Output: true


class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int n = nums.length;
        for (int val : nums) {
            if (set.contains(val)) {
                return true;
            } else {
                set.add(val);
            }
        }

        return false;
    }
}
