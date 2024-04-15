// LEETCODE PROBLEM - 129. Sum Root to Leaf Numbers

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
    int sum=0;
    public void traversal(TreeNode root,int number){
        if(root==null)
        return;
        if(root.left==null && root.right==null)
        {
            number=number*10+root.val;
            sum+=number;
            return;
        }
        number=number*10+root.val;
        traversal(root.left,number);
        traversal(root.right,number);
    }
    public int sumNumbers(TreeNode root) {
        traversal(root,0);
        return sum;
    }
}