package leetcode;


public class p102 {
//    public List<List<Integer>> levelOrder(TreeNode root) {
//        if (root == null) {
//            return new ArrayList<List<Integer>>();
//        }
//
//        List<List<Integer>> res = new ArrayList<>();
//        Queue<TreeNode> q = new LinkedList<>();
//        q.add(root);
//
//        while (!q.isEmpty()) {
//            int levelSize = q.size();  // 当前层的节点数
//            List<Integer> levelNodes = new ArrayList<>();
//
//            for (int i = 0; i < levelSize; i++) {
//                TreeNode node = q.poll();  // 出队
//                levelNodes.add(node.val);  // 访问当前节点
//
//                if (node.left != null) {
//                    q.add(node.left);  // 左子节点入队
//                }
//                if (node.right != null) {
//                    q.add(node.right);  // 右子节点入队
//                }
//            }
//
//            res.add(levelNodes);  // 当前层结果加入结果列表
//        }
//
//        return res;
//    }

//    private List<List<Integer>> resList = new ArrayList<List<Integer>>();
//    public List<List<Integer>> levelOrder(TreeNode root) {
//        if(root == null) return resList;
//        level(root,0);
//        return resList;
//    }
//
//    private void level(TreeNode node, int l){
//        if(node == null) return;
//        if(resList.size() < l+1){
//            List<Integer> ls = new ArrayList<>();
//            resList.add(ls);
//        }
//        resList.get(l).add(node.val);
//        level(node.left,l+1);
//        level(node.right,l+1);
//    }
}
