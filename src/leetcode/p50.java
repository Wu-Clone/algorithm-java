package leetcode;

public class p50 {
    public double myPow(double x, int n) {
        if (n == Integer.MIN_VALUE)
            return myPow(x, Integer.MIN_VALUE + 1) / x;
        if (n < 0)
            return myPow(1.0 / x, -n);
        if (n == 0)
            return 1;
        if (n == 1)
            return x;
        if (n == 2)
            return x * x;
        double tmp = myPow(x, n / 2);
        if (n % 2 == 0)
            return tmp * tmp;
        else
            return tmp * tmp * x;
    }
}
