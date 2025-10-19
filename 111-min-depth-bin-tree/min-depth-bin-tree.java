/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        return calculateMinDepth(root);
    }

    private int calculateMinDepth(TreeNode node){
        if(node == null) return 0;
        if(node.right == null) return 1 + calculateMinDepth(node.left);
        if(node.left == null) return 1 + calculateMinDepth(node.right);

        return 1 + Math.min(calculateMinDepth(node.left), calculateMinDepth(node.right));
    }
}
