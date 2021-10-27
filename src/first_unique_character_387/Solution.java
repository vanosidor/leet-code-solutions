package first_unique_character_387;

import java.util.*;

//    Input: s = "leetcode"
//    Output: 0

//    Input: s = "loveleetcode"
//    Output: 2

class Solution {
    public int firstUniqueChar(String s) {

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) return i;
        }

        return -1;
    }
}
