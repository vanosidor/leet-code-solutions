package single_number_136;

class Solution {
    public int singleNumber(int[] nums) {
        int xorResult = 0;
        for (int num : nums) {
            xorResult ^= num;
        }
       return xorResult;
    }
}