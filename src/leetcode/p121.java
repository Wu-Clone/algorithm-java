package leetcode;

public class p121 {
    public int maxProfit(int[] nums) {
        int len = nums.length;
        if(len==0) return 0;
        int min = nums[0], res = 0;
        for(int i =1;i<len;i++){
            if(nums[i]<min) min = nums[i];
            else res = Math.max(res,nums[i]-min);
        }
        return res;
    }
}
