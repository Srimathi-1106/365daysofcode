// LEETCODE PROBLEM - 104. Maximum Depth of Binary Tree

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
    public int depth(TreeNode root,int current)
    {
        if(root==null)
        {
            return current;
        }
        int left=depth(root.left,current+1);
        int right=depth(root.right,current+1);
        return Math.max(left,right);
    }
    public int maxDepth(TreeNode root) {
        return depth(root,0);
    }
}