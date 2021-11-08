package generate_parentheses_22;

import java.util.*;

public class Solution {

    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backTrack(result, new StringBuilder(), 0, 0, n);
        return result;
    }

    private void backTrack(List<String> result, StringBuilder sb, int open, int close, int max) {
        if (sb.length() == max * 2) {
            result.add(sb.toString());
            return;
        }

        if (open < max) {
            sb.append("(");
            backTrack(result, sb, open+1, close, max);
            sb.deleteCharAt(sb.length() - 1);
        }
        if (close < open) {
            sb.append(")");
            backTrack(result, sb, open, close+1, max);
            sb.deleteCharAt(sb.length() - 1);
        }
    }

//    My first wrong solution
    /*public List<String> generateParenthesis(int n) {

        ArrayList<Set<String>> result = new ArrayList<>();

        result.add(0, new HashSet<>(List.of("()")));

        for (int i = 1; i < n; i++) {
            Set<String> set = new HashSet<>();

            for (String s : result.get(i - 1)) {
                set.add("(" + s + ")");
                set.add("()"+s);
                set.add(s + "()");
            }
            result.add(i, set);
        }

        return new ArrayList<>(result.get(n - 1));
    }*/
}
