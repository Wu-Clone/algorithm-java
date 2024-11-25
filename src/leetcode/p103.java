package leetcode;

public class p103 {
//    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
//        List<List<Integer>> ans = new ArrayList<>();
//        if (root == null)
//            return ans;
//        Queue<TreeNode> q = new LinkedList<>();
//        q.add(root);
//        int level = 0;
//        while (!q.isEmpty()) {
//            int cnt = q.size();
//            List<Integer> ls = new ArrayList<>();
//            for (int i = 0; i < cnt; i++) {
//                TreeNode node = q.poll();
//                if (node.left != null)
//                    q.add(node.left);
//                if (node.right != null)
//                    q.add(node.right);
//                ls.add(node.val);
//            }
//            ans.add(ls);
//        }
//        for(int i = 0;i < ans.size();i++)
//            if(i%2==1)
//                Collections.reverse(ans.get(i));
//        return ans;
//    }
}
