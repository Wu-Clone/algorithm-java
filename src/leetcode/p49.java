package leetcode;

import java.util.*;

public class p49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(int i = 0; i<strs.length;i++){
            String processed = convert01(strs[i]);
            if(map.containsKey(processed)){
                map.get(processed).add(strs[i]);
            }else{
                List ls = new ArrayList<>();
                ls.add(strs[i]);
                map.put(processed, ls);
            }
        }
        List<List<String>> res = new ArrayList<>();
        for(List l:map.values()){
            res.add(l);
        }
        return res;
    }

    public static String convert01(String s){
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
    public static String convert(String s){
        StringBuilder sb = new StringBuilder();
        char[] arr = s.toCharArray();
        char insert = 'a';
        Map<Character, Character> map = new HashMap<>();
        for(int i = 0; i<arr.length;i++){
            char ch = arr[i];
            if(map.containsKey(ch))
                sb.append(map.get(ch));
            else{
                map.put(ch, insert);
                sb.append((char)insert);
                insert++;
            }
        }
        return sb.toString();
    }

    public List<List<String>> groupAnagrams01(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for(int i = 0; i< strs.length;i++){
            char[] chs = strs[i].toCharArray();
            Arrays.sort(chs);
            String sorted = new String(chs);
            if(map.containsKey(sorted)){
                map.get(sorted).add(strs[i]);
            }else{
                List<String> ls = new ArrayList<>();
                ls.add(strs[i]);
                map.put(sorted,ls);
            }
        }
        return new ArrayList<List<String>>(map.values());
    }
}
