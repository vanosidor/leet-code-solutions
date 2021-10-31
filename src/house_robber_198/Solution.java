package house_robber_198;

//Input: nums = [1,2,3,1]
//        Output: 4

//Input: nums = [2,7,9,3,1]
//        Output: 12

//Input: nums = [2, 1, 1, 2]
//        Output: 4

// В массиве дома которые можно ограбить (ценность после ограбления каждого дома)
// Нельзя грабить соседние дома, сработает сигнализация
// Рекурсивное отношение можно описать так: rob(i) = Math.max(rob(i - 2) + current, rob(i - 1))

class Solution {

    // Iterative solution
    public int rob(int[] nums) {

        if (nums.length == 0) return 0;

        int prev1 = nums[0];
        int prev2 = 0;

        for (int i = 2; i <= nums.length; i++) {
            int temp = Math.max(prev2 + nums[i - 1], prev1);
            prev2 = prev1;
            prev1 = temp;
        }


        return Math.max(prev2, prev1);
    }
/*
 Recursive solution
    public int rob(int[] nums) {
       return rob(nums, nums.length - 1);
    }

    public int rob(int[] nums, int i) {
        if (i < 0) return 0;

        return Math.max(rob(nums, i - 2) + nums[i], rob(nums, i - 1) );
    }*/
}
