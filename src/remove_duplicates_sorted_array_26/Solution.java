package remove_duplicates_sorted_array_26;

/*Input: nums = [1,1,2]
        Output: 2, nums = [1,2,_]*/

/*Input: nums = [0,0,1,1,1,2,2,3,3,4]
        Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]*/

class Solution {
    public int removeDuplicates(int[] nums) {
        int start = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[start] = nums[i];
                start++;
            }
        }
        return start;
    }
}