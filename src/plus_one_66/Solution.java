package plus_one_66;

// Increment digits[] by one

// Input: digits = [1,2,3]
//        Output: [1,2,4]

// Input: digits = [9]
//        Output: [1,0]

public class Solution {
    public int[] plusOne(int[] digits) {
        // [9] => [1, 0]
        // [1, 9] => [2, 0];
        // [9,9] => [1,0,0];

        // if digit equals 9 need increment previous digit, if exists, or else increase array space

        int n = digits.length;

        if (digits[n - 1] + 1 == 10) {
            int overflow = 1;
            digits[n - 1] = 0;

            for (int i = n - 2; i >= 0; i--) {
                if (digits[i] + overflow == 10) {
                    digits[i] = 0;
                }
                else {
                    digits[i]++;
                    overflow = 0;
                    break;
                }
            }

            if (overflow > 0) {
                int[] newDigits = new int[n + 1];
                newDigits[0] = 1;

                return newDigits;
            } else return digits;
        }

        else {
            digits[n - 1]++;
        }

        return digits;
    }
}
