package move_zeroes_283;

public class Solution {

    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0) return;

        int insertPos = 0;
        for (int num : nums) {
            if (num != 0) {
                nums[insertPos] = num;
                insertPos++;
            }
        }

        while (insertPos < nums.length) {
            nums[insertPos] = 0;
            insertPos++;
        }
    }
//    My first solution
//    public void moveZeroes(int[] nums) {
//        if (nums.length == 1) return;
//
//        int next = 1;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == 0) {
//
//                if (next > nums.length - 1) return;
//
//                // find next not null element
//                while (nums[next] == 0 && next < nums.length - 1) {
//                    next++;
//                }
//                nums[i] = nums[next];
//                nums[next] = 0;
//            } else next++;
//        }
//    }
}
