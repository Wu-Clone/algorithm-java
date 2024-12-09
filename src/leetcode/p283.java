package leetcode;

public class p283 {
    public int removeElement(int[] nums, int val) {
        int slow = 0, fast = 0;
        int res = 0;
        while(fast<nums.length){
            if(nums[fast]!=val){
                nums[slow] = nums[fast];
                slow++;
                res++;
            }
            fast++;
        }
        return res;
    }
}
