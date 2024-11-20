package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class p56 {
    public int[][] merge(int[][] intervals) {
        List<int[]> res = new ArrayList<>();
        Arrays.sort(intervals,(a, b)->(a[0]-b[0]));
        for(int i = 0; i<intervals.length;i++){
            int[] start = intervals[i];
            while(i<intervals.length-1 &&
                    (start[1] >= intervals[i+1][0])){
                start[1] = Math.max(start[1], intervals[i+1][1]);
                i++;
            }
            res.add(start);
        }
        return res.toArray(new int[0][]);
    }
}
