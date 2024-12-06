package otherProblem;

import java.util.*;

public class P68 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Set<Integer> set = new HashSet<>();

        int cnt = in.nextInt();
        List<Integer> nums = new ArrayList<>();
        for(int i = 0; i< cnt;i++){
            int num = in.nextInt();
            if(set.contains(num)) continue;
            set.add(num);
            nums.add(num);
        }
        Collections.sort(nums);
        int N = in.nextInt();
        int res = 0;
        // 1 2 3 4 5
        // 2 2 3 3 4
        if(N>nums.size() || nums.get(N-1) >= nums.get(nums.size()-N)){
            System.out.println(-1);
            return;
        }
        for(int i = 0, j = nums.size()-1; i<N;i++,j--){
            res += nums.get(i)+nums.get(j);
        }
        System.out.println(res);
        in.close();
    }
}
