// LEETCODE PROBLEM - 988. Smallest String Starting From Leaf

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
    String small="";
    public void traversal(TreeNode root,StringBuilder str)
    {
        if(root==null)
        return;
        str.insert(0,(char)(root.val+97));
        if(root.left==null && root.right==null)
        {
            if(small=="" || small.compareTo(str.toString())>0)
            {
                small=str.toString();
            }
        }
        else
        {
            traversal(root.left,str);
            traversal(root.right,str);
        }
        str.deleteCharAt(0);
    }
    public String smallestFromLeaf(TreeNode root) {
        traversal(root,new StringBuilder());
        return small;
    }
}