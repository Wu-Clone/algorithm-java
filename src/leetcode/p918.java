package leetcode;

public class p918 {
    public static void main(String[] args) {
        maxSubarraySumCircular(new int[]{5,-3,5});
    }
    public static int maxSubarraySumCircular(int[] nums) {
        int total = nums[0];
        int maxSum = nums[0], minSum= -nums[0];
        int temSumMax = nums[0], temSumMin = -nums[0];
        for(int i = 1;i<nums.length;i++){
            temSumMax = Math.max(nums[i], temSumMax + nums[i]);
            maxSum = Math.max(temSumMax, maxSum);
            total+=nums[i];
            temSumMin = Math.max(-nums[i], temSumMin - nums[i]);
            minSum = Math.max(temSumMin,minSum);
        }
        if(total + minSum == 0) return maxSum;
        return Math.max(maxSum, total + minSum);
    }
}
