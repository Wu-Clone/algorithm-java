package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class p438 {
    public static void main(String[] args) {
        System.out.println(findAnagrams("cbaebabacd", "abc"));
    }
    public static List<Integer> findAnagrams(String s, String p) {
        char[] pChs = p.toCharArray();
        Arrays.sort(pChs);
        String target = new String(pChs);
        List<Integer> res = new ArrayList<>();
        char[] sChs = s.toCharArray();
        for(int i =0; i<sChs.length-pChs.length;i++){
            char[] compare = new String(sChs,i,pChs.length).toCharArray();
            Arrays.sort(compare);
            if(target.equals(new String(compare))){
                res.add(i);
            }
        }
        return res;
    }
}
