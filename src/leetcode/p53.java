package leetcode;

public class p53 {
    public static void main(String[] args) {
        maxSubArray(new int[]{-1,-2});
    }
    public static int maxSubArray(int[] nums) {
        int res = nums[0];
        int current_sum = nums[0];
        for(int i =1;i<nums.length;i++){
            current_sum= Math.max(nums[i], current_sum+nums[i]);
            res = Math.max(res, current_sum);
        }
        return res;
    }
}
