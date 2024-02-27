// LEETCODE PROBLEM - 543. Diameter of Binary Tree

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
    int max;
    public int diameterOfBinaryTree(TreeNode root) {
        max=0;
        calculate(root);
        return max;
    }
    public int calculate(TreeNode root)
    {
        if(root==null)
        return 0;
        int left=calculate(root.left);
        int right=calculate(root.right);
        max=Math.max(max,left+right);
        return Math.max(left,right)+1;
    } 
}