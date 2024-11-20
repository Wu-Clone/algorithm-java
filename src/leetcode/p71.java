package leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

public class p71 {
    public String simplifyPath(String path) {
        Deque<String> stack = new ArrayDeque<>();
        String[] items = path.split("/");

        for (String item : items) {
            if (item.isEmpty() || item.equals(".")) continue;
            if (item.equals("..")) {
                if (!stack.isEmpty())
                    stack.pollLast();
            } else
                stack.offerLast(item);

        }
        if (stack.isEmpty()) return "/";
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) sb.append("/").append(stack.pollFirst());
        return sb.toString();
    }
}
