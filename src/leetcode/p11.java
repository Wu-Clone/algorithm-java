package leetcode;

public class p11 {
    // 移动较短的指针的原因是：
    //如果当前两根柱子中较短的一根被移动，它有可能被更高的柱子代替，从而有机会形成更大的面积。
    //如果移动较高的柱子，新的面积只会更小或相等，因为面积受短板限制（木桶效应）。
    public int maxArea(int[] height) {
        int l = 0, r= height.length-1;
        // 容器体积
        int vul = 0;
        while (l < r) {
            int mid = Math.min(height[r], height[l]);
            vul = Math.max(vul, (r - l) * mid);
            while (mid >= height[l] && l<r) {
                l++;
            }
            while (mid >= height[r] && l<r) {
                r--;
            }
        }
        return vul;
    }
}
