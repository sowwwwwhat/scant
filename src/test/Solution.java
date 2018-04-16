package test;

class TreeNode{
	
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x){
		val =x;
	}
}
public class Solution {
	public TreeNode lowestCommonAncestor(TreeNode root,TreeNode p,TreeNode q) {
		if(root ==null||p==root ||q ==root) {
			return root;
		}
		TreeNode l = lowestCommonAncestor(root.left, p, q);
		TreeNode r = lowestCommonAncestor(root.right, p, q);
		if(l!=null&& r !=null) {
			return root;
		}
		return l!=null?l:r;
	}
}
