// LEETCODE PROBLEM - 623. Add One Row to Tree

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
    public void traversal(TreeNode root,int val,int depth,int d){
        if(root==null)
        return;
        if(d==depth-1)
        {
            TreeNode left=new TreeNode(val);
            TreeNode right=new TreeNode(val);
            left.left=root.left;
            right.right=root.right;
            root.left=left;
            root.right=right;
            return;
        }
        traversal(root.left,val,depth,d+1);
        traversal(root.right,val,depth,d+1);
    }
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth==1)
        {
            TreeNode new_root=new TreeNode(val);
            new_root.left=root;
            root=new_root;
            return root;
        }
        traversal(root,val,depth,1);
        return root;
    }
}