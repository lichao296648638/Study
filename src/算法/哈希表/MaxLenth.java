package 算法.哈希表;

import java.util.HashMap;

public class MaxLenth {
    public static void main(String[] args) {
        MaxLength("abcabcbb");
    }

    public static void MaxLength(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int begin = 0;
        int max = 0;
        for (int end = begin; end < s.length(); end++) {
            char c = s.charAt(end);
            if (!map.containsKey(c)) {
                map.put(c, end);
            } else {
                begin = Math.max(begin, map.get(c) + 1);
                map.put(c, end);
            }
            max = Math.max(max, end - begin + 1);

        }

        System.out.println(max);
    }
}
