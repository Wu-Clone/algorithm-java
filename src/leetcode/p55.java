package leetcode;

public class p55 {
    public boolean canJump(int[] nums) {

        int target = nums.length -1;
        int before = nums.length -1;
        while(before >=0){
            if(nums[before] >= target - before){
                target = before;
            }
            before--;
        }
        return target ==0;
    }
}
