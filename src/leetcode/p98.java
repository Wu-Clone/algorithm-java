package leetcode;

public class p98 {
//    public boolean isValidBST(TreeNode root) {
//        List<Integer> helper = new ArrayList<>();
//        inOrder(root, helper);
//        for (int i = 1; i < helper.size(); i++) {
//            if (helper.get(i) <= helper.get(i - 1))
//                return false;
//        }
//        return true;
//    }
//
//    private void inOrder(TreeNode node, List<Integer> ls) {
//        if (node == null)
//            return;
//        inOrder(node.left, ls);
//        ls.add(node.val);
//        inOrder(node.right, ls);
//    }

//    public boolean isValidBST(TreeNode root) {
//        return checker(root, Long.MIN_VALUE, Long.MAX_VALUE);
//    }
//
//    private boolean checker(TreeNode node, long min, long max) {
//        if (node == null)
//            return true;
//        if (node.val <= min || node.val >= max)
//            return false;
//        return checker(node.left, min, node.val) && checker(node.right, node.val, max);
//    }
}
