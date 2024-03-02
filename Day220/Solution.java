// LEETCODE PROBLEM - 2331. Evaluate Boolean Binary Tree

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
    public boolean evaluateTree(TreeNode root) {
        if(root.val!=2 && root.val!=3)
        return root.val==0?false:true;
        boolean left=evaluateTree(root.left);
        boolean right=evaluateTree(root.right);
        if(root.val==2)
        return left || right;
        else 
        return left && right;
    }
}