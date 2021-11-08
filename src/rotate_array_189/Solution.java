package rotate_array_189;

// Input: nums = [1,2,3,4,5,6,7], k = 3
//        Output: [5,6,7,1,2,3,4]

// Input: nums = [-1,-100,3,99], k = 2
//        Output: [3,99,-1,-100]

// Нужно сдвинуть массив влево на k (In place!!!). 2 * O(n).  Reverse array and reverse every part of it.
// Corner case: k больше чем длина массива, поэтому берем k по модулю
// Можно улучшить - вынести отдельную функцию reverse

public class Solution {

    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        int i = 0;
        int j = n - 1;

        while (i < j) {
            int temp = nums[i];

            nums[i] = nums[j];
            nums[j] = temp;

            i++;
            j--;
        }

        i = 0;
        j = k - 1;

        while (i < j) {

            int temp = nums[i];

            nums[i] = nums[j];

            nums[j] = temp;

            i++;
            j--;
        }

        i = k;
        j = n - 1;

        while (i < j) {

            int temp = nums[i];

            nums[i] = nums[j];

            nums[j] = temp;

            i++;
            j--;
        }

    }
}
