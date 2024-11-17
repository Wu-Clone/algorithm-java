package leetcode;

public class p137 {
    public int singleNumber(int[] nums) {
        // -2 -1 0 1 2
        int[][] res = new int[32][5];
        for (int i = 0; i < nums.length; i++) {
            int index = 0;
            while (nums[i] != 0) {
                // -2 -1 0 1 2
                //  0  1 2 3 4
                int y = nums[i] % 3 + 2;
                res[index][y] = (res[index][y] + 1) % 3;
                index++;
                nums[i] /= 3;
            }
        }
        int ans = 0, base = 1;
        for (int i = 0; i < 32; i++) {
            for (int j = 0; j < 5; j++) {
                if (res[i][j] != 0)
                    ans += ((j-2) * base);
            }
            base *= 3;
        }
        return ans;
    }
}
