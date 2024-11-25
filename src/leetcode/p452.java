package leetcode;

import java.util.Arrays;

public class p452 {
    public static void main(String[] args) {
        findMinArrowShots(new int[][]{
                {1,2},
                {2,3},
                {3,4},
                {4,5}
        });
    }
    public static int findMinArrowShots(int[][] points) {
        Arrays.sort(points,
                (a,b)->Integer.compare(a[0], b[0])
        );
        // 表示交集
        int[] common = points[0];
        int cnt = 1;
        for(int i =1 ; i< points.length;i++){
            // 1 6
            // 2 8
            if(common[1] >= points[i][0]){
                // 压缩公共区域
                common[0] = Math.max(points[i][0], common[0]);
                common[1] = Math.min(points[i][1], common[1]);
            }else{
                cnt++;
                common = points[i];
            }
        }
        return cnt;
    }
}
