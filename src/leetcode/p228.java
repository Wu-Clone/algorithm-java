package leetcode;

import java.util.ArrayList;
import java.util.List;

public class p228 {
    public List<String> summaryRanges(int[] nums) {
        List<String> ls = new ArrayList<>();
        for(int i = 0; i < nums.length;i++){
            int start = nums[i];
            int end = nums[i];
            while(i<nums.length - 1 && nums[i+1] - end == 1){
                i++;
                end++;
            }
            StringBuilder sb = new StringBuilder();
            if(end!=start)
                sb.append(start).append('-').append('>').append(end);
                // ls.add(start+"->"+end);
            else
                sb.append(start);
            // ls.add(String.valueOf(start));
            ls.add(sb.toString());
        }
        return ls;
    }
}
