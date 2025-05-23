/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    List<Integer> post = new ArrayList<>();

    public List<Integer> postorderTraversal(TreeNode root) {
        if (root == null)
            return post;
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        post.add(root.val);
        return post;
    }
}

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    List<Integer> in = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null)
            return in;
        inorderTraversal(root.left);
        in.add(root.val);
        inorderTraversal(root.right);
        return in;
    }
}

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    List<Integer> pre = new ArrayList<>();

    public List<Integer> preorderTraversal(TreeNode root) {
        if (root == null)
            return pre;
        pre.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        return pre;
    }
}