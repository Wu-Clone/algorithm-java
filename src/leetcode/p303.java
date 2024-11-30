package leetcode;

public class p303 {
    class NumArray {

        private int[] suffix;
        public NumArray(int[] nums) {
            int n=nums.length;
            int sum=0;
            suffix=new int[n];
            for(int i=0;i<n;i++){
                sum+=nums[i];
                suffix[i]=sum;

            }
        }

        public int sumRange(int left, int right) {

            if(left==0){
                return suffix[right];
            }else{
                return suffix[right]-suffix[left-1];
            }
        }
    }

}
