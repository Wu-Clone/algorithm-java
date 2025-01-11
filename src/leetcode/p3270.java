package leetcode;

public class p3270 {
    class Solution {
        public int generateKey(int num1, int num2, int num3) {
            int res = 0;
            for (int i = 1; num1 > 0 && num2 > 0 && num3 > 0; i *= 10) {
                res +=Math.min(num1%10,Math.min(num2%10, num3%10))*i;
                num1/=10;num2/=10;num3/=10;
            }
            return res;
        }
    }
}
