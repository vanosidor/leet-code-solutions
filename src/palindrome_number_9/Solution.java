package palindrome_number_9;

//Input: x = 121
//        Output: true

//Input: x = -121
//        Output: false

// How to make without String?
class Solution {
    public boolean isPalindrome(int x) {
        String val = String.valueOf(x);
        int n = val.length();

        int i = 0;
        int j = n - 1;

        while (i < j) {
            if (val.charAt(i) != val.charAt(j)) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
}