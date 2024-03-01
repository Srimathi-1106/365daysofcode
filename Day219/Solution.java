// LEETCODE PROBLEM - 814. Binary Tree Pruning

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
    public TreeNode rec(TreeNode root)
    {
        if(root==null)
        {
            return null;
        }
        root.left=rec(root.left);
        root.right=rec(root.right);
        if(root.val==0 && root.left==null && root.right==null)
        {
            return null;
        }
        return root; 
    }
    public TreeNode pruneTree(TreeNode root) {
        return rec(root);
    }
}