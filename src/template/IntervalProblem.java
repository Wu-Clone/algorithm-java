package template;

import java.util.Arrays;

public class IntervalProblem {
    public int findMinArrowShots(int[][] points) {
        if(points == null || points.length == 0) return 0;
        Arrays.sort(points, (a, b) -> Integer.compare(a[0], b[0]));
        int[] currentInterval = points[0];
        int cnt=1;
        for(int i=1;i<points.length;i++) {
            if(points[i][0] < currentInterval[0]) {
                currentInterval[0] = Math.max(points[i][0], currentInterval[0]);
                currentInterval[1] = Math.min(points[i][1], currentInterval[1]);
            }else {
                cnt++;
                currentInterval = points[i];
            }
        }
        return cnt;
    }
}
