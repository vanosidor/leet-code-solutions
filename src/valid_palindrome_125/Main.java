package valid_palindrome_125;

import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String s = r.readLine();
        r.close();
        Solution solution = new Solution();
        System.out.print(solution.isPalindrome(s));
    }

}
