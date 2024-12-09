package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class p15 {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;
        for(int i = 0; i< n-1;i++){
            if(nums[i] > 0) break;
            if(i>0 && nums[i]==nums[i-1]) continue;
            int l = i+1, r = n-1;
            int target = -nums[i];
            while(l<r){
                int sum = nums[l] + nums[r];
                if(sum<target){
                    l++;
                }else if(sum> target){
                    r--;
                }else{
                    res.add(Arrays.asList(nums[r],nums[l],nums[i]));
                    while(l<r && nums[l]==nums[l+1]) l++;
                    while(l<r && nums[r] == nums[r-1])r--;
                    l++;
                    r--;
                }
            }
        }
        return res;
    }
}
