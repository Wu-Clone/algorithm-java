package leetcode;

public class p112 {
    //    public boolean hasPathSum(TreeNode root, int targetSum) {
//        if (root == null)
//            return false;
//        if (root.left == null && root.right == null)
//            return root.val == targetSum;
//        if (root.left != null && root.right == null)
//            return sum(root.left, targetSum - root.val);
//        if (root.left == null && root.right != null)
//            return sum(root.right, targetSum - root.val);
//        return sum(root.left, targetSum - root.val) || sum(root.right, targetSum - root.val);
//    }
//
//    private boolean sum(TreeNode node, int targetSum) {
//        if (node.left == null && node.right == null)
//            return node.val == targetSum;
//        if (node.left != null && node.right == null)
//            return sum(node.left, targetSum - node.val);
//        if (node.left == null && node.right != null)
//            return sum(node.right, targetSum - node.val);
//        return sum(node.left, targetSum - node.val) || sum(node.right, targetSum - node.val);
//    }

//    public boolean hasPathSum01(TreeNode root, int targetSum) {
//        if (root == null) return false;
//
//        // 如果是叶子节点，直接判断路径和
//        if (root.left == null && root.right == null) {
//            return root.val == targetSum;
//        }
//
//        // 递归检查左右子树
//        return hasPathSum(root.left, targetSum - root.val)
//                || hasPathSum(root.right, targetSum - root.val);
//    }

}
