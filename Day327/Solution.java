// LEETCODE PROBLEM - 111. Minimum Depth of Binary Tree

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
    public int depth(TreeNode root)
    {
        if(root==null)
        return 0;
        if(root.left==null)
        return 1+depth(root.right);
        if(root.right==null)
        return 1+depth(root.left);
        int left=1+depth(root.left);
        int right=1+depth(root.right);
        return Math.min(left,right);
    }
    public int minDepth(TreeNode root) {
        return depth(root);
    }
}