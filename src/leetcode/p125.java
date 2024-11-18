package leetcode;

public class p125 {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i =0 ;i < s.length();i++){
            char ch = s.charAt(i);
            if((ch>='a' && ch<='z') || (ch>='0' && ch<='9'))
                sb.append(ch);
            else if(ch>='A' && ch<='Z')
                sb.append((char)(ch-'A'+'a'));
        }
        if(sb.toString().equals(sb.reverse().toString()))
            return true;
        else
            return false;
    }
    public static boolean isPalindrome1(String s) {
        int l = 0, r = s.length() - 1;
        while (l < r) {
            while (l < r && !checkChar(s.charAt(l)))
                l++;
            while (l < r && !checkChar(s.charAt(r)))
                r--;
            if ((s.charAt(l) == s.charAt(r)) ||
                    ((s.charAt(l) - 'a' == s.charAt(r) - 'A') && s.charAt(l) <= 'z') ||
                    ((s.charAt(r) - 'a' == s.charAt(l) - 'A') && s.charAt(r) <= 'z')) {
                l++;
                r--;
                continue;
            }
            return false;
        }
        return true;
    }

    public static boolean checkChar(char ch) {
        return (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9');
    }

    public static void main(String[] args) {
        isPalindrome1("0P");
    }
}
