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
    int l=0,ans=-1;
    public void rec(TreeNode root,int k)
    {
        if(root==null)
        return;
        rec(root.left,k);
        if(l==k)
        return;
        l++;
        if(l==k)
        {
            ans=root.val;
            return;
        }
        rec(root.right,k);
    }
    public int kthSmallest(TreeNode root, int k) 
    {
        rec(root,k);
        return ans;
    }
}