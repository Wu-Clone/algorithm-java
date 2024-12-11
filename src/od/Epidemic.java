package od;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Epidemic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String[] cells = input.split(",");  // 根据逗号分隔输入数据
        int n = (int) Math.sqrt(cells.length);  // 计算地图大小 n x n
        int[][] grid = new int[n][n];
        boolean[][] visited = new boolean[n][n];
        Queue<int[]> q = new LinkedList<>();
        for(int i = 0;i<n;i++){
            for(int j = 0; j<n;j++){
                grid[i][j] = Integer.parseInt(cells[i*n+j]);
                if (grid[i][j] == 1) {
                    q.add(new int[]{i,j});
                }
            }
        }
        if(q.isEmpty() || q.size()== cells.length){
            System.out.println(-1);
            return;
        }
        int time = -1;
        int[] dx = new int[]{1,0,-1,0};
        int[] dy = new int[]{0,1,0,-1};
        while(!q.isEmpty()){
            time++;
            int sz = q.size();
            for(int i = 0; i<sz;i++){
                int[] curr = q.poll();
                if(visited[curr[0]][curr[1]]) continue;
                for(int j = 0; j<4;j++){
                    int newx = curr[0]+dx[j];
                    int newy = curr[1]+dy[j];
                    if(newx>=n||newy>=n||newx<0||newy<0) continue;
                    if(visited[newx][newy] || grid[newx][newy] == 1) continue;
                    grid[newx][newy] = 1;
                    q.add(new int[]{newx, newy});
                }
                visited[curr[0]][curr[1]] = true;
            }

        }
        System.out.println(time);
    }
}
