// LEETCODE PROBLEM - 100. Same Tree

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
    public boolean same(TreeNode p,TreeNode q)
    {
        if(p==null && q==null)
        return true;
        else if(p==null || q==null)
        return false;
        else if(p.val!=q.val)
        return false;
        boolean left=same(p.left,q.left);
        boolean right=same(p.right,q.right);
        return left && right;
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return same(p,q);
    }
}