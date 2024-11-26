package test;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();
        deque.add("a");
        deque.add("b");
        deque.add("c");
        System.out.println(deque);
        System.out.println("---------");
        System.out.println("head of queue:" + deque.peek());
        System.out.println("Polled: " + deque.poll());
        System.out.println("After poll: " + deque);
        System.out.println("---------");
        System.out.println("Is empty? " + deque.isEmpty());

        deque.push("x");
        System.out.println("插入x:"+deque);
        deque.push("y");
        System.out.println("插入y:"+deque);
        System.out.println(deque);
    }
}

