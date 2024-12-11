package od;

import java.util.List;
import java.util.Scanner;

public class TheSmallestNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] chs = in.next().toCharArray();
        int len = chs.length;
        int k = len - in.nextInt();
        if(k<=0){
            System.out.println(0);
            return;
        }
        StringBuilder sb = new StringBuilder();
        int start = 0;
        while(k>0){
            char min = chs[start];
            int index = start;
            for(int i = start; i<=len-k;i++){
                if(chs[i]<min){
                    min = chs[i];
                    index = i;
                }
            }
            sb.append(min);
            start = index+1;
            k--;
        }
        System.out.println(Integer.parseInt(sb.toString()));
    }
}
