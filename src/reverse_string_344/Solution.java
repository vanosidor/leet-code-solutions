package reverse_string_344;

// Input: s = ["h","e","l","l","o"]
// Output: ["o","l","l","e","h"]

// Input: s = ["H","a","n","n","a","h"]
// Output: ["h","a","n","n","a","H"]

class Solution {
    public void reverseString(char[] s) {
        int mid = s.length / 2;
        int i = 0;

        while (i < mid) {
            char temp = s[s.length - 1 - i];
            s[s.length - 1 - i] = s[i];
            s[i] = temp;
            i++;
        }
    }
}
