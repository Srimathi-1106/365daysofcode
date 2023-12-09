// LEETCODE PROBLEM - 94. Binary Tree Inorder Traversal

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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result=new ArrayList<>();
        traversal(root,result);
        return result;
    }
    public static void traversal(TreeNode root,List<Integer> result)
    {
        if(root!=null)
        {
            traversal(root.left,result);
            result.add(root.val);
            traversal(root.right,result);
        }
    }
}