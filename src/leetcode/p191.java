package leetcode;

public class p191 {
    public int hammingWeight(int n) {
        int res = 0;
        while (n != 0) {
            res += n % 2;
            n >>= 1;
        }
        return res;
    }
}
