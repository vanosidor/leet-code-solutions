package remove_element_27;


/*Input: nums = [3,2,2,3], val = 3
        Output: 2, nums = [2,2,_,_]*/

/*      Input: nums = [0,1,2,2,3,0,4,2], val = 2
    Output: 5, nums = [0,1,4,0,3,_,_,_]*/

// 1) Two pointers: 2 указателя, указатель start - куда перемещаем не равные val  (много лишних перемещений)

import java.util.Set;

class Solution {
    public int removeElement(int[] nums, int val) {

        int start = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[start] = nums[i];
                start++;
            }
        }

        return start;
    }
}