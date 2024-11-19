package leetcode;

import java.util.Arrays;

public class p238 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(productExceptSelf(new int[]{-1,1,0,-3,3})));
    }
    public static int[] productExceptSelf00(int[] nums) {
        int[] arr1 = new int[nums.length];
        arr1[0] = nums[0];
        for (int i = 1; i <= nums.length - 1; i++) {
            arr1[i] = arr1[i-1] * nums[i];
        }
        int[] arr2 = new int[nums.length];
        arr2[nums.length - 1] = nums[nums.length - 1];
        for (int i = nums.length - 2; i >= 0; i--) {
            arr2[i] = arr2[i+1] * nums[i];
        }
        int[] res = new int[nums.length];
        for (int i = 1; i < nums.length - 1; i++) {
            res[i] = arr1[i - 1] * arr2[i + 1];
        }
        // 1 2 3 4
        // 1 2 6 24
        // 24 24 12 4
        res[0] = arr2[1];
        res[nums.length - 1] = arr1[nums.length - 2];
        return res;
    }
    public static int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] res = new int[len];
        int[] arr1 = new int[len];
        int[] arr2 = new int[len];
        arr1[0] = 1;
        arr2[len-1] =nums[len-1];
        for(int i =1 ;i<len;i++){
            arr1[i] = arr1[i-1] * nums[i];
            arr2[len-i-1] = arr2[len-i] * nums[len-i-1];
        }
        res[0] = arr2[1];
        res[len-1] = arr1[len-2];
        for(int i = 1; i<len-1;i++)
            res[i] = arr1[i-1] *arr2[i+1];
        return res;
    }
    public int[] productExceptSelf02(int[] nums) {
        int[] res = new int[nums.length];
        for(int i =0;i<nums.length;i++)
            res[i] =1;
        int left = 1, right =1;
        for(int i =0,j=nums.length-1;i<nums.length;i++,j--){
            res[i]*=left;
            res[j]*=right;
            left*=nums[i];
            right*=nums[j];
        }
        return res;
    }
}
