package leetcode;

public class p42 {
    public static void main(String[] args) {
        int res = trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1});
        System.out.println(res);
    }
    public static int trap(int[] height) {
        int l = 0, r = height.length - 1;
        int lMax = height[0], rMax = height[height.length - 1];
        int res = 0;
        while (l <= r) {
            int mid = Math.min(lMax, rMax);
            if (lMax > rMax) {
                res += (mid - height[r]) > 0 ? (mid - height[r]) : 0;
                rMax = Math.max(height[r], rMax);
                r--;
            } else {
                res += (mid - height[l]) > 0 ? (mid - height[l]) : 0;
                lMax = Math.max(height[l], lMax);
                l++;
            }
        }
        return res;
    }

    public int trap0(int[] height) {
        int[] leftMax = new int[height.length];
        int lMax = 0;
        for (int i = 0; i < height.length; i++) {
            if (i != 0 && height[i - 1] > lMax)
                lMax = height[i - 1];
            leftMax[i] = lMax;
        }

        int[] rightMax = new int[height.length];
        int rMax = 0;
        for (int i = height.length - 1; i >= 0; i--) {
            if (i != height.length - 1 && height[i + 1] > rMax)
                rMax = height[i + 1];
            rightMax[i] = rMax;
        }

        int[] sideMin = new int[height.length];
        for (int i = 0; i < height.length; i++)
            sideMin[i] = Math.min(rightMax[i], leftMax[i]);

        int res = 0;
        for (int i = 0; i < height.length; i++) {
            int delta = sideMin[i] - height[i];
            res += (delta > 0) ? delta : 0;
        }
        return res;
    }
}
