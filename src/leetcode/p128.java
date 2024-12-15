package leetcode;

import java.util.HashSet;
import java.util.Set;

public class p128 {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i:nums) set.add(i);
        int res = 0;
        for(int num:set){
            if(set.contains(num-1)) continue;
            int consecutive = 1;
            int next = num+1;
            while(set.contains(next)){
                consecutive++;
                next++;
            }
            res = Math.max(res, next);
        }
        return res;
    }
}
