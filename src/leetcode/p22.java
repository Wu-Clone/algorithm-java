package leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class p22 {
    class Solution {
        private int sum = 0;
        private LinkedList<Integer> track = new LinkedList<>();
        private List<String> res = new LinkedList<>();
        private boolean[] visited;

        public List<String> generateParenthesis(int n) {
            // 将 () 视为 1 -1， 保证sum>=0就合法
            int[] nums = new int[n*2];
            Arrays.fill(nums, 0, nums.length / 2, 1);
            // 将数组后一半填充为 -1
            Arrays.fill(nums, nums.length / 2, nums.length, -1);
            visited = new boolean[n*2];
            backtrack(nums,0);
            return res;
        }

        private void backtrack(int[] nums, int start){
            if(sum<0) return;
            if(track.size() == nums.length){
                StringBuilder sb =  new StringBuilder();
                for(int i = 0 ;i<track.size();i++){
                    sb.append(track.get(i)==1?'(':')');
                }
                res.add(sb.toString());
                return;
            }
            for(int i = 0; i<nums.length;i++){
                if(visited[i] == true) continue;
                if(i>0&&nums[i]==nums[i-1]&&!visited[i-1]) continue;
                visited[i]=true;
                track.addLast(nums[i]);
                sum+=nums[i];
                backtrack(nums, i+1);
                sum-=nums[i];
                track.removeLast();
                visited[i] =false;
            }
        }
    }
}
