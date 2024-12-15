package leetcode;

public class p11 {
    // 移动较短的指针的原因是：
    //如果当前两根柱子中较短的一根被移动，它有可能被更高的柱子代替，从而有机会形成更大的面积。
    //如果移动较高的柱子，新的面积只会更小或相等，因为面积受短板限制（木桶效应）。
    public int maxArea(int[] height) {
        int res = 0;
        int l = 0, r = height.length - 1;
        while (l < r) {
            int mid = Math.min(height[l], height[r]);
            res = Math.max(mid * (r - l), res);
            while (l < r && mid >= height[l])
                l++;
            while (l < r && mid >= height[r])
                r--;
        }
        return res;
    }
}
