package leetcode;

public class p392 {
    public boolean isSubsequence(String s, String t) {
        int sp = 0, tp =0, ls = s.length(),lt=t.length();
        if(ls==0) return true;
        if(lt==0) return false;
        while(tp<lt){
            if(t.charAt(tp) == s.charAt(sp)){
                tp++; sp++;
            }else{
                tp++;
            }
            if(sp==ls) return true;

        }
        return false;
    }
}
