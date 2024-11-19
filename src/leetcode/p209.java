package leetcode;

public class p209 {
    public int minSubArrayLen(int target, int[] nums) {
        int l =0,r =0,sum=nums[0];
        if(sum>=target) return 1;
        int ans = nums.length +1;
        while(r<nums.length){
            if(sum < target){
                r++;
                if(r==nums.length) break;
                sum+=nums[r];
            }
            else{
                ans = Math.min(ans, r-l+1);
                sum-=nums[l];
                l++;
            }
        }
        if(ans>nums.length) return 0;
        return ans;
    }
}
