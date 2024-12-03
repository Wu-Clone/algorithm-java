package leetcode;

import java.util.LinkedList;
import java.util.List;

public class p17 {
    private List<String> res = new LinkedList<>();
    private StringBuilder sb = new StringBuilder();

    public List<String> letterCombinations(String digits) {
        if (digits.equals(""))
            return res;
        char[] digit = digits.toCharArray();
        backtrack(digit, 0);
        return res;
    }

    private void backtrack(char[] digit, int start) {
        if (sb.length() == digit.length) {
            res.add(sb.toString());
            return;
        }
        char[] charSet = convert(digit[start]);
        for (int i = 0; i < charSet.length; i++) {
            sb.append(charSet[i]);
            backtrack(digit, start + 1);
            sb.deleteCharAt(sb.length() - 1);
        }
    }

    private char[] convert(char ch) {
        switch (ch) {
            case '2':
                return new char[] { 'a', 'b', 'c' };
            case '3':
                return new char[] { 'd', 'e', 'f' };
            case '4':
                return new char[] { 'g', 'h', 'i' };
            case '5':
                return new char[] { 'j', 'k', 'l' };
            case '6':
                return new char[] { 'm', 'n', 'o' };
            case '7':
                return new char[] { 'p', 'q', 'r' };
            case '8':
                return new char[] { 's', 't', 'u' };
            case '9':
                return new char[] { 'w', 'x', 'y', 'z' };
            default:
                return new char[] { 'w', 'x', 'y', 'z' }; // 处理其他情况
        }
    }

    public static void main(String[] args) {
        new p17().letterCombinations("23");
    }
}
