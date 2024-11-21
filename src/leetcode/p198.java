package leetcode;

public class p198 {
    public int rob(int[] nums) {
        if (nums.length == 0) return 0; // 处理空数组
        if (nums.length == 1) return nums[0]; // 单独处理长度为1的情况

        int prev2 = nums[0]; // 相当于 dp[i-2]
        int prev1 = Math.max(nums[0], nums[1]); // 相当于 dp[i-1]

        for (int i = 2; i < nums.length; i++) {
            int current = Math.max(prev2 + nums[i], prev1); // 递推公式
            prev2 = prev1;
            prev1 = current;
        }
        return prev1; // 最优解
    }


    public int rob01(int[] nums) {
        if(nums.length==1) return nums[0];
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0],nums[1]);
        for(int i = 2; i<nums.length;i++){
            dp[i] = Math.max(dp[i-2]+nums[i], dp[i-1]);
        }
        return dp[nums.length-1];
    }
}
