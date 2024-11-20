package leetcode;

public class p242 {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        int[] cntChar = new int[26];
        for(int i = 0; i<s.length();i++){
            cntChar[s.charAt(i) - 'a'] ++;
            cntChar[t.charAt(i) - 'a'] --;
        }
        for(int i = 0; i<26;i++) {
            if(cntChar[i]!=0)
                return false;
        }
        return true;
    }
}
