package roman_to_integer_13;

public class Solution {
    public int romanToInt(String s) {
        if (s == null) throw new IllegalArgumentException("string must not be null");
        int n = s.length();

        int result = 0;
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            switch (c) {
                case 'I' -> result += 1;
                case 'V' -> {
                    if (i > 0 && s.charAt(i - 1) == 'I') result += 3;
                    else result += 5;
                }
                case 'X' -> {
                    if (i > 0 && s.charAt(i - 1) == 'I') result += 8;
                    else result += 10;
                }
                case 'L' -> {
                    if (i > 0 && s.charAt(i - 1) == 'X') result += 30;
                    else result += 50;
                }
                case 'C' -> {
                    if (i > 0 && s.charAt(i - 1) == 'X') result += 80;
                    else result += 100;
                }
                case 'D' -> {
                    if (i > 0 && s.charAt(i - 1) == 'C') result += 300;
                    else result += 500;
                }
                case 'M' -> {
                    if (i > 0 && s.charAt(i - 1) == 'C') result += 800;
                    else result += 1000;
                }
            }
        }
        return result;
    }
}
