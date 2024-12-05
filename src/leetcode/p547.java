package leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class p547 {
    private boolean[] visited;
    private int res = 0;
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        visited =new boolean[n];
        for(int i = 0; i<n;i++){
            if(visited[i]) continue;
            bfs(isConnected, i);
        }
        return res;
    }

    private void bfs(int[][] isConnected, int i){
        Queue<Integer> q = new LinkedList<>();
        q.add(i);
        while(!q.isEmpty()){
            int cnt = q.size();
            for(int t =0; t<cnt;t++){
                int curr = q.poll();
                for(int j = 0; j<isConnected[curr].length;j++){
                    if(isConnected[curr][j] == 1 && !visited[j]){
                        // 连接
                        q.add(j);
                        visited[j] = true;
                    }
                }
            }
        }
        res+=1;
    }
}
