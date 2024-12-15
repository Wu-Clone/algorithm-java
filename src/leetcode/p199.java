package leetcode;

public class p199 {
//    private List<List<Integer>> base = new ArrayList<>();
//    public List<Integer> rightSideView(TreeNode root) {
//        if(root == null) return new ArrayList<>();
//        level(root,0);
//        List<Integer> ans = new ArrayList<>();
//        for(int i = 0; i<base.size();i++){
//            ans.add(base.get(i).get(base.get(i).size()-1));
//        }
//        return ans;
//    }
//    private void level(TreeNode node, int l){
//        if(node == null) return;
//        if(base.size() < l+1){
//            List<Integer> ls = new ArrayList<>();
//            base.add(ls);
//        }
//        base.get(l).add(node.val);
//        level(node.left, l+1);
//        level(node.right, l+1);
//    }
}
