package leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class p200 {
    public int numIslands(char[][] grid) {
        int res = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    BFS(grid, i, j);
                    res++;
                }
            }
        }
        return res;
    }

    public void BFS(char[][] grid, int i, int j) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] { i, j });
        while (!q.isEmpty()) {
            int[] p = q.poll();
            grid[p[0]][p[1]] = '2';
            i = p[0];
            j = p[1];
            if (i + 1 < grid.length && grid[i + 1][j] == '1'){
                q.add(new int[] { i + 1, j });
                grid[i + 1][j] = '2';
            }
            if (j + 1 < grid[0].length && grid[i][j + 1] == '1'){
                grid[i][j + 1] = '2';
                q.add(new int[] { i, j + 1 });
            }
            if (i - 1 >= 0 && grid[i - 1][j] == '1'){
                grid[i - 1][j] ='2';
                q.add(new int[] { i - 1, j });
            }
            if (j - 1 >= 0 && grid[i][j - 1] == '1'){
                q.add(new int[] { i, j - 1 });
                grid[i][j - 1] = '2';
            }
        }
    }
}
