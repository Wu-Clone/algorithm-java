package leetcode;

import java.util.HashSet;
import java.util.Set;

public class p128 {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int consecutive=0;
        int ans=0;
        for(int i:nums) set.add(i);

        for(Integer i: set){
            if(set.contains(i-1)){
                consecutive=0;
                continue;
            }
            else{
                while(set.contains(i++)){
                    consecutive++;
                }
                ans= Math.max(ans,consecutive);
                consecutive =0;
            }
        }
        return ans;
    }
}
