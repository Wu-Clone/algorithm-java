package otherProblem;

import java.util.*;

public class P69 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
        Scanner in = new Scanner(System.in);
        int cnt = in.nextInt();
        for(int i =0;i<cnt;i++){
            pq.add(in.nextInt());
        }
        while(pq.size()>=3){
            int z = pq.poll();
            int y = pq.poll();
            int x = pq.poll();
            int res = melt(x,y,z);
            if(res>0){pq.add(res);}
        }
        if(pq.isEmpty()){
            System.out.println(0);
        }else{
            System.out.println(pq.poll());
        }
    }
    private static int melt(int x, int y, int z){
        if(x==y && y==z) return 0;
        if(x==y && y!=z) return z-y;
        if(x!=y && y==z) return y-x;
        // 1 3 5
        return Math.abs((z-y)-(y-x));
    }
}
