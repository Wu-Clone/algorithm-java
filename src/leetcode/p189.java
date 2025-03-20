package leetcode;

public class p189 {
    public void rotate(int[] nums, int k) {
        int[] tmp =new int[nums.length];
        for(int i = 0;i<nums.length;i++)
            tmp[(i+k)%nums.length] = nums[i];
        System.arraycopy(tmp,0,nums,0,nums.length);
    }
    public void rotate01(int[] nums, int k) {
        // 1 2 3 4 5 6 7
        // 7 6 5 4 3 2 1
        // 5 6 7 1 2 3 4
        int len = nums.length;
        k%=len;
        reverse(nums,0, len-1);
        reverse(nums,0,k-1);
        reverse(nums,k,len-1);
    }
    public static void reverse(int[] arr, int l, int r){
        while(l<r){
            int tmp = arr[l];
            arr[l] = arr[r];
            arr[r] =tmp;
            l++;
            r--;
        }
    }
}
