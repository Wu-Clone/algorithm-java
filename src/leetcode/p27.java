package leetcode;

public class p27 {
    public int removeElement(int[] nums, int val) {
        if(nums.length == 0) return 0;
        int l = 0, r = nums.length-1;
        while(l<r){
            // 👉移 l, 停下时 指向val l 始终指向
            while(l<r && nums[l] != val)
                l++;
            // 👈移 r
            while(l<r && nums[r] ==val)
                r--;
            if(l<r){
                // 交换
                nums[l] = nums[l] + nums[r];
                nums[r] = nums[l] - nums[r];
                nums[l] = nums[l] - nums[r];
            }
        }
        if(nums[l] != val) return l+1;
        return l;
    }

    public int removeElement01(int[] nums, int val) {
        if(nums.length ==0) return 0;
        int i =0 ,j=0;
        while(j<nums.length){
            if(nums[j] == val) j++;
            else{
                nums[i] = nums[j];
                i++;j++;
            }
        }
        return i;
    }
}
