package leetcode;

public class p111 {
    //    class Solution {
//        private int res = 0;
//        public int minDepth(TreeNode root) {
//            bfs(root);
//            return res;
//        }
//
//        private void bfs(TreeNode node){
//            if(node == null) return;
//            LinkedList<TreeNode> q = new LinkedList<>();
//            q.add(node);
//            while(!q.isEmpty()){
//                int cnt = q.size();
//                res++;
//                while(cnt>0){
//                    TreeNode n = q.poll();
//                    if(n.left==null && n.right == null) return;
//                    if(n.left!=null) q.add(n.left);
//                    if(n.right!=null) q.add(n.right);
//                    cnt--;
//                }
//            }
//        }
//    }
//    public int minDepth(TreeNode root) {
//        int res = 0;
//        if (root == null) return res;
//        LinkedList<TreeNode> q = new LinkedList<>();
//        q.add(root);
//        int cnt = 0;
//        while (!q.isEmpty()) {
//            res++;
//            cnt = q.size();
//            while (cnt > 0) {
//                cnt--;
//                TreeNode node = q.poll();
//                if (node.left == null && node.right == null) return res;
//                if (node.left != null) q.add(node.left);
//                if (node.right != null) q.add(node.right);
//            }
//        }
//        return res;
//    }
}
