package leetcode;

public class p9 {
    public boolean isPalindrome0(int x) {
        String raw = Integer.toString(x);
        String res = new StringBuilder(raw).reverse().toString();
        if(res.equals(raw)) return true;
        else return false;
    }

    public boolean isPalindrome1(int x) {
        String s = Integer.toString(x);
        int i = 0, j = s.length() - 1;
        while(i<=j){
            if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            }
            else return false;
        }
        return true;
    }
}
