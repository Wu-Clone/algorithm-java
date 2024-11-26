package test;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.pop();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.isEmpty());
        System.out.println(stack.peek());
        stack.pop();
        stack.pop();
        System.out.println("===");
        System.out.println(stack.isEmpty());
    }
}
