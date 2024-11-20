package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class p290 {
    public boolean wordPattern(String pattern, String s) {
        String[] strList = s.split(" ");
        if(pattern.length()!=strList.length) return false;
        Map<Character,String> map = new HashMap<>();
        Set<String> set = new HashSet<>();
        for(int i = 0; i<pattern.length();i++){
            char ch = pattern.charAt(i);
            if(map.containsKey(ch)) {
                if(map.get(ch).equals(strList[i]))
                    continue;
                return false;
            }else{
                if(set.contains(strList[i])) return false;
                set.add(strList[i]);
                map.put(ch,strList[i]);
            }
        }
        return true;
    }
}
