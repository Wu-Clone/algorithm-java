package leetcode;

public class p69 {
    public int mySqrt(int x) {
        if(x>=46340*46340)
            return 46340;
        for (int i = 0; i <= x; i++) {
            if ((i + 1) * (i + 1) > x)
                return i;
        }
        return 0;
    }
}
