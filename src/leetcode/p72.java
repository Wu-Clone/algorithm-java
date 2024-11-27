package leetcode;

public class p72 {
    public int minDistance(String word1, String word2) {
        char[] w1 = word1.toCharArray();
        char[] w2 = word2.toCharArray();
        int len1 = word1.length();
        int len2 = word2.length();
        int[][] dp = new int[len1 + 1][len2 + 1];
        for (int i = 0; i <= len1; i++) dp[i][0] = i;
        for (int j = 0; j <= len2; j++) dp[0][j] = j;
        for (int i = 1; i <= len1; i++) {
            for (int j = 1; j <= len2; j++) {
                // dp[i][j] = Math.min(dp[i-1][j],dp[i][j-1]);
                // if(word1.charAt(i-1) == word2.charAt(j-1)) dp[i][j]--;
                dp[i][j] = Math.min(dp[i - 1][j - 1], Math.min(dp[i][j - 1], dp[i - 1][j])) + 1;
                if (w1[i - 1] == w2[j - 1]) dp[i][j] = dp[i - 1][j - 1];
            }
        }
        return dp[len1][len2];

    }
}
