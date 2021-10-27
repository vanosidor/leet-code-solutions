package intersection_two_arrays_II_350;
import java.util.*;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        ArrayList<Integer> resultList = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums1) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        for (int num : nums2) {
            if (map.containsKey(num) && map.get(num) > 0) {
                map.put(num, map.get(num) - 1);
                resultList.add(num);
            }
        }

        int[] result = new int[resultList.size()];

        for (int i = 0 ; i < result.length; i ++ ) {
            result[i] = resultList.get(i);
        }

        return result;
    }
}