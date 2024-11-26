package leetcode;

import java.util.List;

public class p120 {
    public int minimumTotal(List<List<Integer>> triangle) {
        // 注意triangle的高度特征
        int[] res = new int[triangle.size()];
        for(int i = 0; i<res.length;i++){
            res[i]=Integer.MAX_VALUE;
        }
        for (int i = 0; i < triangle.size(); i++) {
            List<Integer> tmp = triangle.get(i);
            for (int j = tmp.size() - 1; j >= 0; j--) {
                if (j == 0 && i == 0)
                    res[0] = tmp.get(0);
                else if (j == 0)
                    res[0] = tmp.get(0) + res[0];
                else if (j == tmp.size() - 1)
                    res[j] = tmp.get(j) + res[j - 1];
                else
                    res[j] = Math.min(res[j - 1], res[j]) + tmp.get(j);
            }
        }
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < res.length; i++) {
            ans = Math.min(ans, res[i]);
        }
        return ans;
    }
}
