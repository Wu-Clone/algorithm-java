package leetcode;

public class p169 {
    public int majorityElement(int[] nums) {
        int res =nums[0],cnt=1;
        for(int i = 1;i<nums.length;i++){
            if(nums[i] != res){
                if(cnt == 1)
                    res = nums[++i];
                else cnt--;
            }
            else{
                cnt++;
            }
        }
        return res;
    }
}
