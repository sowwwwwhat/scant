
package tree;


public class LowestCommonAncestor {
	public TreeNode lca(TreeNode root,TreeNode p,TreeNode q) {
		if(root == null || p==root || q ==root) {
			return root;
		}
		
		//查看左子树是否有目标节点，没有为null
		TreeNode left  =lca(root.left,p,q);
		//查看右子树是否有目标节点，没有为null
		TreeNode right  =lca(root.right,p,q);
		//都不为空，说明做右子树都有目标结点，则公共祖先就是本身
        if(left!= null && right!= null) {
            return root;
        }
     // 其他情况，则要继续向上标记，显示此节点下边有目标节点
        return left != null?left:right;
	}
}
