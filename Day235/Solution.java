// LEETCODE PROBLEM - 1305. All Elements in Two Binary Search Trees

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
    public void inorderTraversal(List<Integer> arr,int i,TreeNode root)
    {
        if(root==null)
        return;
        inorderTraversal(arr,i,root.left);
        arr.add(root.val);
        inorderTraversal(arr,i,root.right);
    }
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> root1_array=new ArrayList<>();
        List<Integer> root2_array=new ArrayList<>();
        inorderTraversal(root1_array,0,root1);
        inorderTraversal(root2_array,0,root2);
        int l1=root1_array.size(),l2=root2_array.size();
        List<Integer> merged_array=new ArrayList<>();
        int i=0,j=0;
        while(i<l1 && j<l2)
        {
            if(root1_array.get(i)<root2_array.get(j))
            {
                merged_array.add(root1_array.get(i++));
            }
            else
            {
                merged_array.add(root2_array.get(j++));
            }
        }
        if(i>=l1)
        {
            while(j<l2)
            {
                merged_array.add(root2_array.get(j++));
            }
        }
        if(j>=l2)
        {
            while(i<l1)
            {
                merged_array.add(root1_array.get(i++));
            }
        }
        return merged_array;
    }
}