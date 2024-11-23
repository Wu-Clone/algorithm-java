package leetcode;


import java.util.ArrayList;
import java.util.List;

public class p155MinStack {
    private List<Integer> nums;
    private List<Integer> minList;
    private int top;

    public p155MinStack() {
        nums = new ArrayList<>();
        minList = new ArrayList<>();
        top = -1;
    }

    public void push(int val) {
        top++;
        nums.add(val);
        if (top != 0)
            minList.add(Math.min(minList.get(minList.size() - 1), val));
        else
            minList.add(val);
    }

    // 因为非空栈，所以不考虑边界
    public void pop() {
        nums.remove(top);
        minList.remove(top);
        top--;
    }

    public int top() {
        return nums.get(top);
    }

    public int getMin() {
        return minList.get(top);
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */