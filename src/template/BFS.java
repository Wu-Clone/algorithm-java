package template;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    // 主方法测试 BFS
    public static void main(String[] args) {
        // 构造示例二叉树
        TreeNodeX root = new TreeNodeX(1);
        root.left = new TreeNodeX(2);
        root.right = new TreeNodeX(3);
        root.left.left = new TreeNodeX(4);
        root.left.right = new TreeNodeX(5);
        root.right.right = new TreeNodeX(6);

        // 调用 BFS 方法
        System.out.println("BFS Traversal:");
        bfs(root);
    }

    private static void bfs(TreeNodeX root) {
        if(root == null) return;
        Queue<TreeNodeX> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNodeX curr = queue.poll();
            System.out.print(curr.val+" ");
            if(curr.left != null)
                queue.add(curr.left);
            if(curr.right != null)
                queue.add(curr.right);
        }
    }
}
// 定义树节点类
class TreeNodeX {
    int val;
    TreeNodeX left;
    TreeNodeX right;

    TreeNodeX(int val) {
        this.val = val;
    }

}