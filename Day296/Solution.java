// LEETCODE PROBLEM - 1325. Delete Leaves With a Given Value

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
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        helper(root,target);
        if(checkIfLeafNode(root) && root.val==target)
        return null;
        return root;
    }
    public boolean checkIfLeafNode(TreeNode root){
        if(root==null)
        {
            return false;
        }
        if(root.left==null && root.right==null)
        {
            return true;
        }
        return false;
    }
    public void helper(TreeNode node,int target){
        if(node==null)
        return;
        helper(node.left,target);
        helper(node.right,target);
        if(checkIfLeafNode(node.left) && node.left.val==target)
        {
            node.left=null;
        }
        if(checkIfLeafNode(node.right) && node.right.val==target)
        {
            node.right=null;
        }
    }
}