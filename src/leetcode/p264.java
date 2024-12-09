package leetcode;

public class p264 {
    public static void main(String[] args) {
        System.out.println(nthUglyNumber(10));
    }
    public static int nthUglyNumber(int n) {
        // 2 3 5
        // 4 6 10
        // 6 9 15
        // 10 15 25
        int[] dp = new int[n];
        dp[0] = 1;
        int i2 = 0, i3 = 0, i5 = 0;
        for(int i = 1;i<n;i++){
            int curr1 = dp[i2]*2;
            int curr2 = dp[i3]*3;
            int curr3 = dp[i5]*5;
            dp[i] = Math.min(curr1, Math.min(curr2,curr3));
            if(dp[i] == curr1) i2++;
            if(dp[i] == curr2) i3++;
            if(dp[i] == curr3) i5++;
        }
        return dp[n-1];
    }
}
