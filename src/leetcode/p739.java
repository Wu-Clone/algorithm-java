package leetcode;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class p739 {
    public static void main(String[] args) {
        for (int i : dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73})) {
            System.out.println(i);
        }
    }

    //    public static int[] dailyTemperatures(int[] temperatures) {
//        Stack<int[]> stack = new Stack<>();
//        int[] res = new int[temperatures.length];
//        for(int i =0;i<temperatures.length;i++){
//            if(stack.isEmpty() || stack.peek()[0] >= temperatures[i]){
//                stack.push(new int[]{temperatures[i],i});
//            }
//            else{
//                while(!stack.isEmpty() && stack.peek()[0] < temperatures[i]){
//                    int[] tmp = stack.pop();
//                    res[tmp[1]] = i - tmp[1];
//                }
//                stack.push(new int[]{temperatures[i],i});
//            }
//        }
//        while(!stack.isEmpty()){
//            res[res.length-stack.size()] = 0;
//            stack.pop();
//        }
//        return res;
//    }
    public static int[] dailyTemperatures(int[] temperatures) {
        Deque<Integer> stack = new LinkedList<>();
        int[] res = new int[temperatures.length];
        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]) {
                int index = stack.pop();
                res[index] = i - index;
            }
            stack.push(i);
        }
        return res;
    }
}
