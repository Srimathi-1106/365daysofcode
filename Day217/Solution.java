// LEETCODE PROBLEM - 513. Find Bottom Left Tree Value

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
    int highestLevel,value;
    public int findBottomLeftValue(TreeNode root) {
        highestLevel=-1;value=0;
        finding(root,0);
        return value;
    }
    public void finding(TreeNode root,int currentLevel)
    {
        if(root==null)
        return;
        if(highestLevel<currentLevel)
        {
            value=root.val;
            highestLevel=currentLevel;
        }
        finding(root.left,currentLevel+1);
        finding(root.right,currentLevel+1);
    }
}