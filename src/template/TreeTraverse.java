package template;

public class TreeTraverse {
    public void Traverse(TreeNode treeNode){
        //先序
        Traverse(treeNode.left);
        //中序
        Traverse(treeNode.right);
        //后序
    }
}
