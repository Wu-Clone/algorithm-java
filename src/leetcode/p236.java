package leetcode;

public class p236 {
//    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//        List<TreeNode> lp = new ArrayList<>();
//        List<TreeNode> lq = new ArrayList<>();
//        findNodeDFS(root,p,lp);
//        findNodeDFS(root,q,lq);
//        TreeNode res = null;
//        for(int i = 0;i <Math.min(lq.size(),lp.size());i++){
//            if(lq.get(lq.size()-1-i) != lp.get(lp.size()-1-i))
//                break;
//            res = lq.get(lq.size()-1-i);
//        }
//        return res;
//    }
//
//    // 能否将节点的路径找到然后
//    private boolean findNodeDFS(TreeNode node,TreeNode target, List<TreeNode> ls){
//        if(node == null) return false;
//        if(findNodeDFS(node.left,target,ls) || findNodeDFS(node.right,target,ls) || node == target) {
//            ls.add(node);
//            return true;
//        }
//        return false;
//    }
}
