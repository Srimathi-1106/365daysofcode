// LEETCODE PROBLEM - 1038. Binary Search Tree to Greater Sum Tree

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
    private int sum=0;
    private void rec(TreeNode root)
    {
        if(root==null)
        {
            return;
        }
        if(root.right!=null)
        rec(root.right);
        sum+=root.val;
        root.val=sum;
        if(root.left!=null)
        rec(root.left);
    }
    public TreeNode bstToGst(TreeNode root) {
        rec(root);
        return root;
    }
}