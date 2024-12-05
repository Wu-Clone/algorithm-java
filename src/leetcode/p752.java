package leetcode;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class p752 {
    public static void main(String[] args) {
        p752 P752 = new p752();
        System.out.println(P752.openLock(new String[]{"0201", "0101", "0102", "1212", "2002"}, "0202"));
    }
    public int openLock(String[] deadends, String target) {
        Set<String> dead = new HashSet<>();
        for(String str: deadends) dead.add(str);
        Set<String> visited = new HashSet<>();
        String start = "0000";
        visited.add(start);
        LinkedList<String> q = new LinkedList<>();
        if(dead.contains(target)) return -1;
        q.add(start);
        int res = 0;
        while(!q.isEmpty()){
            int cnt = q.size();
            for(int i = 0; i<cnt;i++){
                String curr = q.poll();
                if(curr.equals(target)) return res;
                for(int j = 0; j< 4;j++){
                    String plus = plusOne(curr,j);
                    if(!dead.contains(plus) && !visited.contains(plus)){
                        visited.add(plus);
                        q.add(plus);
                    }
                    String sub = subOne(curr,j);
                    if(!dead.contains(sub)  && !visited.contains(sub)){
                        visited.add(sub);
                        q.add(sub);
                    }
                }
            }
            res++;
        }
        return -1;
    }


    private String plusOne(String str, int index){
        char[] chs = str.toCharArray();
        chs[index] = chs[index]!='9'?(char)(chs[index]+1):'0';
        return new String(chs);
    }

    private String subOne(String str, int index){
        char[] chs = str.toCharArray();
        chs[index] = chs[index]!='0'?(char)(chs[index]-1):'9';
        return new String(chs);
    }
}
