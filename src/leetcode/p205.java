package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class p205 {

    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length())
            return false;
        Map<Character, Character> map = new HashMap<>();
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (map.containsKey(ch)) {
                if (map.get(ch) == t.charAt(i))
                    continue;
                return false;
            } else {
                // 这个字符没有出现过
                char tch = t.charAt(i);
                if (set.contains(tch))
                    return false;
                else {
                    set.add(tch);
                    map.put(ch, tch);
                }
            }
        }

        return true;
    }

    public boolean isIsomorphic01(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] mapS = new int[256]; // 记录 s -> t 的映射
        int[] mapT = new int[256]; // 记录 t -> s 的映射

        for (int i = 0; i < s.length(); i++) {
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);

            if (mapS[ch1] == 0 && mapT[ch2] == 0) {
                // 建立新的映射
                mapS[ch1] = ch2;
                mapT[ch2] = ch1;
            } else if (mapS[ch1] != ch2 || mapT[ch2] != ch1) {
                // 如果已有映射不匹配，返回 false
                return false;
            }
        }
        return true;
    }

}
