package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class p373 {
    public static void main(String[] args) {
        kSmallestPairs(new int[]{1,7,11},new int[]{2,4,6},3);
    }
    public static List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        PriorityQueue<int[]> pq = new PriorityQueue<>(
                (a, b) -> a[1] + a[0] - b[1] - b[0]
        );

        // 预先放入数据
        for (int i = 0; i < nums1.length && i < k; i++) {
            pq.add(new int[] { nums1[i], nums2[0], 0 });
        }
        while (k > 0) {
            int[] arr = pq.poll();
            ans.add(Arrays.asList(arr[0], arr[1]));
            k--;
            // num2 的索引
            if (arr[2] + 1 < nums2.length)
                pq.add(new int[] { arr[0], nums2[arr[2] + 1], arr[2] + 1 });
        }
        return ans;
    }
}
