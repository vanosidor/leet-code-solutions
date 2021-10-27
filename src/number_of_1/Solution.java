package number_of_1;

public class Solution {
    int numOfOnes(int[] n) {
        int temp = 0;
        int max = 0;
        for (int num : n) {
            if (num == 1) {
                temp++;
            } else {
                if (temp > max) max = temp;
                temp = 0;
            }
        }

        return Math.max(temp, max);
    }
}
