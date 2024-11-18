package leetcode;

public class p26 {
    public static void main(String[] args) {
        removeDuplicates(new int[]{1,1,1});
    }
    public static int removeDuplicates(int[] nums) {
        int len = nums.length;
        // length
        if (len == 1 || len == 0)
            return len;
        int[] flag = new int[len];
        for (int i = 0; i < len - 1; i++) {
            // 0 表示重复
            if (nums[i] == nums[i + 1])
                flag[i] = 0;
            else
                flag[i] = 1;
        }
        if (nums[len - 2] == nums[len - 1])
            flag[len - 1] = 0;
        else
            flag[len - 1] = 1;

        int j = 0, k = 0;
        while (j < len) {
            if (flag[j] == 0)
                j++;
            else
                nums[k++] = nums[j++];
        }
        return k;

    }
}
