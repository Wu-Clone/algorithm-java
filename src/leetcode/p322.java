package leetcode;

public class p322 {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        // Arrays.sort(coins);
        dp[0] = 0;
        for(int i = 1; i<= amount;i++){
            dp[i]=-1;
            for(int j = 0; j<coins.length;j++){
                // 合法 且 下一级情形存在
                if(i - coins[j] >= 0 && dp[i-coins[j]] !=-1){
                    if(dp[i]==-1) dp[i] = dp[i-coins[j]]+1;
                    else dp[i] = Math.min(dp[i-coins[j]]+1, dp[i]);
                }
            }
        }
        return dp[amount];
    }
}
