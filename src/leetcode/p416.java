package leetcode;

public class p416 {
    public static void main(String[] args) {
        boolean b = canPartition(new int[]{1, 5, 11, 5});
        System.out.println(b);
    }
    public static boolean canPartition(int[] nums) {
        int sum = 0;
        for(int num:nums) sum+=num;
        if(sum%2!=0) return false;
        int target = sum/2;
        int n = nums.length;
        boolean[] dp = new boolean[target+1];
        dp[0] = true;
        for(int i = 0; i<n;i++){
            for(int j = target; j>=nums[i];j--){
                dp[j] = dp[j] || dp[j-nums[i]];
            }
        }
        return dp[target];
    }
}
