package leetcode;

import java.util.HashSet;
import java.util.Set;

public class p202 {
    public boolean isHappy(int n) {
        // 2 no 4 16 37 58 (25+64)89 (64+81) 145 (1+16+25) 42 20 4
        // 3 9 81 65 61 37 no
        Set<Integer> s = new HashSet<>();
        s.add(n);
        while (true) {
            n = cal(n);
            if (n == 1)
                return true;
            if (s.contains(n))
                return false;
            else
                s.add(n);
        }
    }

    public static int cal(int n) {
        int res = 0;
        while (n > 0) {
            int tmp = n % 10;
            n = n/10;
            res += (tmp * tmp);
        }
        return res;
    }
}
