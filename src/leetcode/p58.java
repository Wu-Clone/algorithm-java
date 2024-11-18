package leetcode;

public class p58 {
    public int lengthOfLastWord(String s) {
        String[] tmp = s.trim().split(" ");
        return tmp[tmp.length-1].length();
    }
}
