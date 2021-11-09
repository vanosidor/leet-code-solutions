package maximum_subarray_53;

//Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
//        Output: 6

//Input: nums = [1]
//        Output: 1

//Input: nums = [5,4,-1,7,8]
//        Output: 23

public class Solution {
    public int maxSubArray(int[] nums) {
        // Kadane's alghorithm
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int num : nums) {
            currentSum += num;

            if (currentSum > maxSum) {
                maxSum = currentSum;
            }

            if (currentSum < 0) {
                currentSum = 0;
            }
        }

        return maxSum;
    }
}
