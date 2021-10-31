package remove_element_27;


/*Input: nums = [3,2,2,3], val = 3
        Output: 2, nums = [2,2,_,_]*/

/*      Input: nums = [0,1,2,2,3,0,4,2], val = 2
    Output: 5, nums = [0,1,4,0,3,_,_,_]*/

//TODO fix
class Solution {
    public int removeElement(int[] nums, int val) {
        int j = nums.length - 1;
        int i = 0;

        while (i < j) {
            while (nums[j] == val) {
                j--;
            }

            if (nums[i] == val) {
                nums[i] = nums[j];
                j--;
            }
            i++;
        }
        return i;
    }
}