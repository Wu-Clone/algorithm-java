package leetcode;

public class p129 {
//    public int sumNumbers(TreeNode root) {
//        // 树的节点数目大于等于1
//        List<Integer> res = new ArrayList<>();
//        dfs(root,res,0);
//        int sum = 0;
//        for(int i=0;i<res.size();i++) sum+=res.get(i);
//        return sum;
//    }
//
//    private void dfs(TreeNode node, List<Integer> res, int num){
//        if(node.left==null && node.right==null){
//            res.add(num*10+node.val);
//            return;
//        }
//        if(node.left!=null) dfs(node.left, res, num*10+node.val);
//        if(node.right!=null) dfs(node.right,res, num*10+node.val);
//    }

//    public int sumNumbers(TreeNode root) {
//        // 树的节点数目大于等于1
//        return dfs(root, 0);
//    }
//
//    private int dfs(TreeNode node, int currSum) {
//        if(node==null)
//            return 0;
//
//        currSum = currSum*10+node.val;
//        if(node.left==null && node.right==null)
//            return currSum;
//        return dfs(node.left, currSum) + dfs(node.right, currSum);
//    }
}
