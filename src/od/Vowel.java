package od;

import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int target = in.nextInt();
        char[] chs = in.next().toCharArray();
        int l = 0, r = 0;
        int cnt = 0;
        int res = 0;
        while(r<chs.length){
            char c = chs[r];
            boolean isVowel = check(c);
            r++;
            if(!isVowel) cnt++;
            while(l<r && cnt> target){
                char d = chs[l];
                if(!isVowel) cnt--;
                l++;
            }
        }
        if(cnt<=target && check(chs[l]) && check(chs[r-1])){
            res = Math.max(res, r -l);
        }
        System.out.println(res);
    }
    private static boolean check(char ch){
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
                ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U';
    }
}
