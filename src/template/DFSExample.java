package template;

import java.util.Stack;

// 定义二叉树节点
class TreeNodeD {
    int val;
    TreeNodeD left, right;

    // 构造函数
    TreeNodeD(int val) {
        this.val = val;
        this.left = this.right = null;
    }
}

public class DFSExample {
    public static void dfs(TreeNodeD root) {
        if (root == null) return;
        System.out.print(root.val+ " ");
        dfs(root.left);
        dfs(root.right);
    }

    public static void main(String[] args) {
        // 创建二叉树
        TreeNodeD root = new TreeNodeD(1);
        root.left = new TreeNodeD(2);
        root.right = new TreeNodeD(3);
        root.left.left = new TreeNodeD(4);
        root.left.right = new TreeNodeD(5);
        root.right.left = new TreeNodeD(6);
        root.right.right = new TreeNodeD(7);

        System.out.println("DFS遍历结果：");
        // 从根节点开始进行DFS遍历
        dfs(root);
        dfs0(root);
    }

    private static void dfs0(TreeNodeD root) {
        new Stack<TreeNodeD>();
    }
}
