package leetcode;

public class p190 {
    public int reverseBits(int n) {
        int res = 0;
        int base = Integer.MIN_VALUE;
        for (int i = 0; i < 32; i++) {
            int tmp = n % 2;
            res += tmp * base;
            // 逻辑右移
            base = base >>> 1;
            n = n >>> 1;
        }
        return res;
    }
}
