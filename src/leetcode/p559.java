package leetcode;

import java.util.List;

public class p559 {
    public int maxDepth(Node root) {
        if(root==null) return 0;
        int depth = 0;
        for(Node node:root.children){
            depth = Math.max(depth, maxDepth(node));
        }
        return depth+1;
    }
}
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
