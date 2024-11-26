package leetcode;

public class p3206 {
    public int numberOfAlternatingGroups(int[] a) {
        int res = 0;
        int len = a.length;
        for (int i = 0; i < len; i++) {
            if (a[i] == a[(i + 2) % len] && a[i] != a[(i + 1) % len])
                res++;
        }
        return res;
    }
}
