package leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class p542 {

//    public int[][] updateMatrix(int[][] mat) {
//        for(int i = 0; i< mat.length;i++){
//            for(int j = 0; j<mat[0].length;j++){
//                if(mat[i][j] == 0) continue;
//                else mat[i][j] = bfs(mat,i,j);
//            }
//        }
//        return mat;
//    }
//
//    private int[] dx = new int[]{1,0,-1,0};
//    private int[] dy = new int[]{0,1,0,-1};
//    private int bfs(int[][] mat, int i, int j){
//        Queue<Integer> q = new LinkedList<>();
//        q.add(i); q.add(j);
//        int res =0;
//        while(!q.isEmpty()){
//            int cnt = q.size()/2;
//            for(int t = 0;t<cnt;t++){
//                int x = q.poll(); int y = q.poll();
//                if(mat[x][y] == 0) return res;
//                for(int direction = 0; direction< 4;direction++){
//                    int newx = x + dx[direction];
//                    int newy = y + dy[direction];
//                    if(newx<0||newx>=mat.length||newy<0||newy>=mat[0].length) continue;
//                    q.add(newx);
//                    q.add(newy);
//                }
//            }
//            res++;
//        }
//        return -1;
//    }
private int[] dx = new int[] { 1, 0, -1, 0 };
    private int[] dy = new int[] { 0, 1, 0, -1 };

    public int[][] updateMatrix(int[][] mat) {
        boolean[][] visited = new boolean[mat.length][mat[0].length];
        Queue<int[]> q = new LinkedList<>();

        for(int i = 0; i< mat.length;i++){
            for(int j = 0; j<mat[0].length;j++){
                if(mat[i][j]==1) continue;
                q.add(new int[]{i,j});
                visited[i][j] = true;
            }
        }

        int level = 0;
        while(!q.isEmpty()){
            int cnt = q.size();
            for(int i = 0; i<cnt;i++){
                int[] curr = q.poll();
                mat[curr[0]][curr[1]] = level;
                for(int j = 0; j<4;j++){
                    int newx = curr[0] + dx[j];
                    int newy = curr[1] + dy[j];
                    if(newx<0||newx>=mat.length||newy>=mat[0].length||newy<0) continue;
                    if(visited[newx][newy]) continue;
                    visited[newx][newy] = true;
                    q.add(new int[]{newx,newy});
                }
            }
            level++;
        }
        return mat;
    }
}
