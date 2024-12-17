package leetcode;

import java.util.HashMap;
import java.util.Map;

public class p560 {
    public int subarraySum(int[] nums, int k) {
        int res = 0;
        int currSum = 0;
        Map<Integer, Integer> prefixSumCount = new HashMap<>();
        prefixSumCount.put(0,1);
        for(int num:nums){
            currSum+=num;
            if(prefixSumCount.containsKey(currSum-k)){
                res+=prefixSumCount.get(currSum-k);
            }
            prefixSumCount.put(currSum,prefixSumCount.getOrDefault(currSum, 0) +1);
        }
        return res;
    }
}
