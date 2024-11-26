package leetcode;

public class p230 {
//    public int kthSmallest(TreeNode root, int k) {
//        List<Integer> ls = new ArrayList<>();
//        inOrder(root,ls);
//        return ls.get(k-1);
//    }
//
//    private void inOrder(TreeNode node, List<Integer> ls){
//        if(node == null) return;
//        inOrder(node.left,ls);
//        ls.add(node.val);
//        inOrder(node.right,ls);
//    }

//    private int kth;
//    public int kthSmallest(TreeNode root, int k) {
//        kth = k;
//        return bfs(root);
//    }
//    private int bfs(TreeNode node){
//        if(node==null) return -1;
//        int l = bfs(node.left);
//        if(l!=-1) return l;
//        kth--;
//        if(kth==0) return node.val;
//        return bfs(node.right);
//    }
}
