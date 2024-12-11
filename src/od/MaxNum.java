package od;

import java.util.Arrays;
import java.util.Scanner;

public class MaxNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] nums = in.nextLine().split(" ");
        Arrays.sort(nums, (a, b) -> (b + a).compareTo(a + b));
        StringBuilder result = new StringBuilder();
        for(int i = 0;i<nums.length;i++){
            result.append(nums[i]);
        }
        // 处理输入为全零的特殊情况
        if (result.charAt(0) == '0') {
            System.out.println("0");
        } else {
            System.out.println(result.toString());
        }
    }
}
