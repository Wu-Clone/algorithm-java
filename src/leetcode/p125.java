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

}
