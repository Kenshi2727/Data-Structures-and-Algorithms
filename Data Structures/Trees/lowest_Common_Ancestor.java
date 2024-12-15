/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        //base cases
        if(root==null)
          return null;
        if(root==p || root==q)
          return root;
        
        //recursion
        TreeNode left=lowestCommonAncestor(root.left, p, q);
        TreeNode right=lowestCommonAncestor(root.right, p, q);
        
        //found LCS
        if(left!=null && right!=null)
          return root;
        //value only from left
        if(left!=null)
          return left;
        //value only from right
        else
          return right;
        
    }
}