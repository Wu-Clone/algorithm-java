package leetcode;

import java.util.Stack;

public class p20 {
    public boolean isValid(String s) {
        char[] chs = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < chs.length; i++) {
            if (chs[i] == '(' || chs[i] == '[' || chs[i] == '{')
                stack.push(chs[i]);
            else if (!stack.isEmpty()) {
                if (chs[i] == ')' && stack.peek() == '(')
                    stack.pop();
                else if (chs[i] == ']' && stack.peek() == '[')
                    stack.pop();
                else if (chs[i] == '}' && stack.peek() == '{')
                    stack.pop();
                else
                    return false;
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
